import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class3 extends class759 {

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Ltm;")
    public static class334 field9 = new class334(53, -2);

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[[Ljava/lang/String;")
    public static String[][] field20 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "F")
    public static float field15;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
    public static int[] field18;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "[Lit;")
    public static class34[] field16;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIZ)V", line = 4)
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field10;
        int var6 = -arg1 + arg0;
        int var7 = -arg4 + arg3;
        if (var6 == 0) {
            if (~var7 != -1) {
                class274.method1802((byte) -21, arg1, arg3, arg4, arg2);
            }
        } else if (~var7 == -1) {
            class620.method3527(arg2, arg1, arg4, arg0, (byte) 36);
        } else if (!arg5) {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg1 * var8 >> 12) + arg4;
            int var10;
            int var11;
            if (arg0 < class184.field3102) {
                var10 = (class184.field3102 * var8 >> 12) + var9;
                var11 = class184.field3102;
            } else if (~class657.field9347 > ~arg0) {
                var10 = (class657.field9347 * var8 >> 12) + var9;
                var11 = class657.field9347;
            } else {
                var11 = arg0;
                var10 = arg3;
            }
            int var12;
            int var13;
            if (arg1 >= class184.field3102) {
                if (arg1 <= class657.field9347) {
                    var12 = arg1;
                    var13 = arg4;
                } else {
                    var13 = (class657.field9347 * var8 >> 12) + var9;
                    var12 = class657.field9347;
                }
            } else {
                var12 = class184.field3102;
                var13 = (class184.field3102 * var8 >> 12) + var9;
            }
            if (var10 < class76.field1126) {
                var11 = (-var9 + class76.field1126 << 12) / var8;
                var10 = class76.field1126;
            } else if (~var10 < ~class461.field6699) {
                var10 = class461.field6699;
                var11 = (-var9 + class461.field6699 << 12) / var8;
            }
            if (~class76.field1126 >= ~var13) {
                if (~var13 < ~class461.field6699) {
                    var12 = (class461.field6699 - var9 << 12) / var8;
                    var13 = class461.field6699;
                }
            } else {
                var12 = (-var9 + class76.field1126 << 12) / var8;
                var13 = class76.field1126;
            }
            class399.method2466(arg2, var11, var10, -1, var12, var13);
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(B)V", line = 109)
    public static void method7(byte arg0) {
        if (arg0 < 79) {
            field20 = null;
        }
        field20 = null;
        field9 = null;
        field18 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIB)V", line = 124)
    public final void method8(int arg0, int arg1, int arg2, byte arg3) {
        super.field10594 = arg0;
        super.field10584 = arg1;
        if (arg3 != -28) {
            this.method8(-13, 27, 35, (byte) -6);
        }
        super.field10593 = arg2;
        ++field12;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZF)V", line = 139)
    public final void method9(boolean arg0, float arg1) {
        super.field10589 = arg1;
        ++field14;
        if (arg0) {
            this.method8(-25, 126, 117, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I", line = 150)
    public static final int method10(int arg0) {
        if (arg0 != 4) {
            method7((byte) 2);
        }
        ++field13;
        byte var2;
        if (class84.field1246 >= 96) {
            int var1 = class673.method3757(100);
            if (~var1 >= -101) {
                class661.method3721(1);
                var2 = 4;
            } else if (~var1 < -501) {
                if (~var1 >= -1001) {
                    var2 = 2;
                    class407.method2519(false);
                } else {
                    class223.method1579(0, true);
                    var2 = 1;
                }
            } else {
                class303.method1991(127);
                var2 = 3;
            }
        } else {
            class223.method1579(arg0 + -4, true);
            var2 = 1;
        }
        if (~class654.field9289.field5415.method2004(3) != -1) {
            class654.field9289.method2292(-96, 0, class654.field9289.field5446);
            class526.method3125(1221653740, 0, false);
        }
        class580.method3351((byte) -106);
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIIIIF)V", line = 222)
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
