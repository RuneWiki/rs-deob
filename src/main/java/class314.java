import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class314 extends class162 {

    @OriginalMember(owner = "client!li", name = "I", descriptor = "Z")
    public boolean field5059 = false;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public int field5051 = -1;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Z")
    public boolean field5068 = false;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Ljava/lang/String;")
    public static String field5055 = "Select";

    @OriginalMember(owner = "client!li", name = "N", descriptor = "[I")
    public static int[] field5064 = new int[5];

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Ljava/lang/String;")
    public static String field5058 = "Ok";

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Lkk;")
    public static class254 field5063 = null;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field5066 = 0;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "J")
    public static volatile long field5070 = 0L;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public int field5062;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field5069;

    // $FF: synthetic field
    @OriginalMember(owner = "client!li", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field5071;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
    public static final void method2124(int arg0, boolean arg1) {
        field5067++;
        if (arg1 != class103.field1552 && arg0 == 22148) {
            class103.field1552 = arg1;
            class161.method1072((byte) 51);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static final void method2125(byte arg0) {
        if (arg0 != 42) {
            field5066 = 24;
        }
        field5054++;
        try {
            Method var1 = (field5071 == null ? (field5071 = method2129("java.lang.Runtime")) : field5071).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class93.field1412 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    public static void method2126(int arg0) {
        field5064 = null;
        if (arg0 != 11) {
            field5066 = -124;
        }
        field5058 = null;
        field5055 = null;
        field5063 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public static final void method2127(int arg0, int arg1) {
        field5053++;
        class36 var2 = class161.method1067(11, arg1, (byte) 81);
        if (arg0 != 0) {
            field5064 = null;
        }
        var2.method220(120);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
    public static final int method2128(int arg0, int arg1) {
        int var2 = -22 / ((arg1 - 50) / 37);
        field5057++;
        return arg0 >>> 7;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2129(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
