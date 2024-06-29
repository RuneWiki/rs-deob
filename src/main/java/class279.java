import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class279 extends class73 {

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    private int field4219;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field4228;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    private int field4222;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
    public static int[] field4223 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field4220 = -1;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Log;")
    public static class69 field4229 = new class69();

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field4230;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field4231;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method1797(byte arg0) {
        if (arg0 < 119) {
            field4229 = null;
        }
        field4223 = null;
        field4229 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static final void method1798(byte arg0) {
        try {
            Method var1 = (field4231 != null ? field4231 : (field4231 = method1800("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class469.field6604 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 < 97) {
                field4220 = -110;
            }
        } catch (Exception var5) {
        }
        ++field4221;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method1799(int arg0) {
        class461.method2718((byte) -78);
        ++field4224;
        class336.field5036 = null;
        class58.field809 = null;
        if (arg0 >= -84) {
            method1798((byte) 115);
        }
        class82.field1159 = null;
        class401.field5864 = null;
        class473.field6633 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
    public final void method632(int arg0, int arg1, int arg2) {
        ++field4225;
        if (arg0 != 5263) {
            field4223 = null;
        }
        int var4 = this.field4228 * arg1 >> 12;
        int var5 = this.field4222 * arg1 >> 12;
        int var6 = this.field4218 * arg2 >> 12;
        int var7 = this.field4219 * arg2 >> 12;
        class212.method1426(super.field985, super.field988, (byte) -106, var6, super.field980, var4, var5, var7);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIII)V")
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4219 = arg3;
        this.field4228 = arg0;
        this.field4218 = arg1;
        this.field4222 = arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg0 != -16) {
            this.field4222 = 51;
        }
        ++field4227;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
    public final void method630(byte arg0, int arg1, int arg2) {
        ++field4226;
        int var4 = this.field4228 * arg2 >> 12;
        int var5 = this.field4222 * arg2 >> 12;
        int var6 = this.field4218 * arg1 >> 12;
        if (arg0 <= 39) {
            this.method630((byte) -119, 15, -41);
        }
        int var7 = this.field4219 * arg1 >> 12;
        class392.method2366(var4, var5, super.field985, var6, 0, var7);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1800(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
