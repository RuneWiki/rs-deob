import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class522 {

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    private int field7592;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    private int field7598;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    private int field7593;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    private int field7586;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    private int field7585;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    private int field7599;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    private int field7587;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    private int field7589;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    private int field7595;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    private int field7590;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lcc;")
    public static class575 field7588 = class256.method1706(false);

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Z")
    public static boolean field7591 = true;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field7597;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ro", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field7600;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3180(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V", line = 12)
    public static final void method3175(byte arg0, int arg1) {
        field7596++;
        int var2 = -125 / ((arg0 - 17) / 49);
        class503 var3 = class512.method3112(9, arg1, 0);
        var3.method3074(-126);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIII)Z", line = 26)
    public final boolean method3176(int arg0, int arg1, int arg2, int arg3) {
        field7594++;
        if (this.field7589 > arg3 || this.field7599 < arg3) {
            return false;
        } else if (this.field7587 > arg1 || arg1 > this.field7585) {
            return false;
        } else if (this.field7590 <= arg0 && this.field7595 >= arg0) {
            int var5 = arg3 - this.field7586;
            if (arg2 >= -63) {
                return false;
            } else {
                int var6 = arg0 - this.field7598;
                return (var5 * var5 + var6 * var6) < this.field7592;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 51)
    public static void method3177(int arg0) {
        field7588 = null;
        if (arg0 != 9) {
            method3179(null, 9, null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIBII)V", line = 69)
    public final void method3178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        this.field7586 = arg9;
        this.field7598 = arg10;
        field7597++;
        this.field7592 = arg3 * arg3;
        this.field7593 = arg6;
        this.field7587 = this.field7593 + arg7;
        this.field7589 = this.field7586 + arg1;
        this.field7590 = this.field7598 + arg4;
        if (arg8 < 108) {
            method3177(103);
        }
        this.field7599 = this.field7586 + arg0;
        this.field7595 = this.field7598 + arg5;
        this.field7585 = this.field7593 + arg2;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z", line = 92)
    public static final boolean method3179(String arg0, int arg1, Class arg2) {
        field7584++;
        Class var3 = (Class) class138.field1891.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class622.field8851.get(arg0);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class138.field1891.put(arg0, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class138.field1891.put(arg0, field7600 == null ? (field7600 = method3180("jca")) : field7600);
                return true;
            } catch (Throwable var10) {
            }
        }
        return arg1 == 9 ? false : false;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 161)
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7592 = arg3 * arg3;
        this.field7598 = arg2;
        this.field7593 = arg1;
        this.field7586 = arg0;
        this.field7585 = this.field7593 + arg7;
        this.field7599 = this.field7586 + arg5;
        this.field7587 = this.field7593 + arg6;
        this.field7589 = this.field7586 + arg4;
        this.field7595 = this.field7598 + arg9;
        this.field7590 = this.field7598 + arg8;
    }
}
