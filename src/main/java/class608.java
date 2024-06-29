import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class608 extends class600 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Luw;")
    public static class418 field8340 = new class418("", 11);

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "Lmu;")
    public static class303 field8349 = new class303(30, -1);

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "[[[Z")
    public static boolean[][][] field8345;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)V", line = 5)
    public static final void method3452(boolean arg0, int arg1, int arg2) {
        if (class86.field1547 != 1) {
            if (class86.field1547 == 2) {
                if (!class241.field3529) {
                    class169.method1280((byte) -127, arg1, arg2);
                } else {
                    class169.method1280((byte) -122, arg1 + class146.method1163((byte) -128), class313.method2035(!arg0) + arg2);
                }
            }
        } else {
            class11.method67((byte) 101, class290.field4063, arg2, arg1);
        }
        ++field8338;
        class86.field1547 = 0;
        class290.field4063 = null;
        if (!arg0) {
            method3458(true);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lbp;III)V", line = 31)
    public static final void method3453(class387 arg0, int arg1, int arg2, int arg3) {
        class168.field2643[arg2][arg3] = arg0;
        ++field8346;
        if (arg1 != 10000) {
            field8347 = 32;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 42)
    public static void method3454(int arg0) {
        if (arg0 == 30) {
            field8340 = null;
            field8345 = null;
            field8349 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIFIFFFFLqg;I)[B", line = 56)
    public static final byte[] method3455(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6, float arg7, float arg8, class463 arg9, int arg10) {
        ++field8337;
        if (arg1 != -1922) {
            field8340 = null;
        }
        byte[] var11 = new byte[arg0 * arg4 * arg10];
        class74.method697(arg0, arg7, var11, arg5, 0, arg8, arg9, arg6, arg2, (byte) 119, arg10, arg3, arg4);
        return var11;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZI)Z", line = 76)
    public static final boolean method3456(int arg0, boolean arg1, int arg2) {
        ++field8348;
        class99 var3 = class76.field1366.method1680(0, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg1) {
            return false;
        } else {
            if (arg0 >= 5 && ~arg0 >= -9) {
                arg0 = 4;
            }
            return var3.method923(arg0, -31076);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lin;Lin;Lou;)V", line = 96)
    public class608(class91 arg0, class91 arg1, class605 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIII)V", line = 104)
    public static final void method3457(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method3453((class387) null, -119, 63, 12);
        }
        if (class58.field1150 <= arg4 && class479.field6682 >= arg4) {
            int var5 = class486.method2865(class536.field7419, arg3, class140.field2314, 71);
            int var6 = class486.method2865(class536.field7419, arg1, class140.field2314, -87);
            class739.method4062(var6, arg2, arg4, var5, (byte) 39);
        }
        ++field8341;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I", line = 125)
    public static final int method3458(boolean arg0) {
        ++field8342;
        if (arg0) {
            field8340 = null;
        }
        return class667.field9109;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZBI)V", line = 137)
    public final void method2027(int arg0, boolean arg1, byte arg2, int arg3) {
        class272.field3822.method288(arg0 + -2, arg3, super.field8228.field2325 + 4, super.field8228.field2317 + 2, ((class605) super.field8228).field8300, 0);
        ++field8344;
        class272.field3822.method288(arg0 - 1, arg3 + 1, super.field8228.field2325 - -2, super.field8228.field2317, 0, 0);
        if (arg2 > -6) {
            field8349 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIZ)V", line = 149)
    public final void method2030(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8339;
        int var5 = -110 / ((-20 - arg0) / 57);
        int var6 = this.method3415(116) * super.field8228.field2325 / 10000;
        class272.field3822.method217(arg2, arg1 + 2, var6, super.field8228.field2317 - 2, ((class605) super.field8228).field8306, 0);
        class272.field3822.method217(arg2 + var6, arg1 + 2, super.field8228.field2325 - var6, super.field8228.field2317 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lat;ZII)V", line = 166)
    public static final void method3459(class378 arg0, boolean arg1, int arg2, int arg3) {
        class75.field1351 = arg2;
        class679.field9211 = arg3;
        class569.field7820 = arg0;
        ++field8343;
        if (arg1) {
            field8347 = 112;
        }
    }
}
