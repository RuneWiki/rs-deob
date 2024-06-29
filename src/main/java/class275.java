import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class275 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lve;")
    public static class255 field4726 = class87.method607(25, "leuchten3:");

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "S")
    public static short field4723 = 1;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lve;")
    public static class255 field4727 = class87.method607(84, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lve;")
    private static class255 field4725 = class87.method607(52, "Attack");

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lve;")
    public static class255 field4729 = field4725;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lve;")
    public static class255 field4731 = class87.method607(52, "Loading world list data");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lrg;")
    public static class88 field4728;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[Lud;")
    public static class269[] field4733;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1927(int arg0) {
        if (arg0 >= -106) {
            field4726 = (class255) null;
        }
        field4722++;
        class259.field4397 = class262.method1829(4, 35, 8, 8, true, 4096, 2048, 0.4F);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)Lve;", line = 25)
    public static final class255 method1928(byte arg0, int arg1) {
        if (arg0 != -18) {
            field4725 = (class255) null;
        }
        field4730++;
        return class3.method14(new class255[] { class215.method1532(arg1 >> 24 & 0xFF, true), class122.field2029, class215.method1532((arg1 & 0xFF942C) >> 16, true), class122.field2029, class215.method1532((arg1 & 0xFF95) >> 8, true), class122.field2029, class215.method1532(arg1 & 0xFF, true) }, (byte) -53);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ[[FII[[I[[III[[FLdi;[[FIFIIII)I", line = 56)
    public static final int method1929(int arg0, boolean arg1, float[][] arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7, int arg8, float[][] arg9, class142 arg10, float[][] arg11, int arg12, float arg13, int arg14, int arg15, int arg16, int arg17) {
        field4732++;
        if (arg0 == arg4) {
            int var18 = arg17;
            arg17 = arg15;
            arg15 = 128 - var18;
        } else if (arg4 == 2) {
            arg17 = 128 - arg17;
            arg15 = 128 - arg15;
        } else if (arg4 == 3) {
            int var19 = arg17;
            arg17 = 128 - arg15;
            arg15 = var19;
        }
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg17 == 0 && arg15 == 0) {
            var20 = arg2[arg16][arg7];
            var21 = arg3;
            var22 = arg11[arg16][arg7];
            var23 = arg9[arg16][arg7];
        } else if (arg17 == 128 && arg15 == 0) {
            var20 = arg2[arg16 + 1][arg7];
            var22 = arg11[arg16 + 1][arg7];
            var23 = arg9[arg16 + 1][arg7];
            var21 = arg14;
        } else if (arg17 == 128 && arg15 == 128) {
            var23 = arg9[arg16 + 1][arg7 + 1];
            var22 = arg11[arg16 + 1][arg7 + 1];
            var21 = arg12;
            var20 = arg2[arg16 + 1][arg7 + 1];
        } else if (arg17 == 0 && arg15 == 128) {
            var20 = arg2[arg16][arg7 + 1];
            var21 = arg8;
            var22 = arg11[arg16][arg7 + 1];
            var23 = arg9[arg16][arg7 + 1];
        } else {
            float var24 = arg11[arg16][arg7];
            float var25 = arg9[arg16][arg7];
            float var26 = (float) arg15 / 128.0F;
            float var27 = arg2[arg16][arg7];
            float var28 = (float) arg17 / 128.0F;
            float var29 = (arg9[arg16 + 1][arg7] - var25) * var28 + var25;
            float var30 = (arg2[arg16 + 1][arg7] - var27) * var28 + var27;
            float var31 = (arg11[arg16 + 1][arg7] - var24) * var28 + var24;
            float var32 = arg9[arg16][arg7 + 1];
            float var33 = (arg9[arg16 + 1][arg7 + 1] - var32) * var28 + var32;
            float var34 = arg11[arg16][arg7 + 1];
            var23 = (var33 - var29) * var26 + var29;
            float var35 = arg2[arg16][arg7 + 1];
            float var36 = (arg11[arg16 + 1][arg7 + 1] - var34) * var28 + var34;
            float var37 = (arg2[arg16 + 1][arg7 + 1] - var35) * var28 + var35;
            var22 = (var36 - var31) * var26 + var31;
            var20 = (var37 - var30) * var26 + var30;
            int var38 = class55.method344(arg17, arg14, (byte) 61, arg3);
            int var39 = class55.method344(arg17, arg12, (byte) 111, arg8);
            var21 = class55.method344(arg15, var39, (byte) -120, var38);
        }
        int var40 = (arg7 << 7) + arg15;
        int var41 = (arg16 << 7) + arg17;
        int var42 = class5.method30(arg15, arg16, (byte) 37, arg17, arg7, arg6);
        return arg10.method1057(var41, var42, var40, var23, var22, var20, arg1 ? var21 & 0xFFFFFF00 : var21, arg5 == null ? 0.0F : (float) (var42 - class5.method30(arg15, arg16, (byte) -127, arg17, arg7, arg5)) / arg13);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 171)
    public static final void method1930(int arg0) {
        field4720++;
        class10.field148.method554(0);
        class95.field1638.method554(0);
        class25.field383.method554(0);
        if (arg0 <= 40) {
            method1929(-18, false, (float[][]) ((float[][]) null), 57, 4, (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), 107, 127, (float[][]) ((float[][]) null), (class142) null, (float[][]) ((float[][]) null), -9, -1.3002064F, -90, 59, 30, 90);
        }
        class217.field3682.method554(0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 197)
    public static void method1931(byte arg0) {
        field4725 = null;
        field4727 = null;
        field4728 = null;
        field4729 = null;
        if (arg0 < 97) {
            field4723 = -102;
        }
        field4731 = null;
        field4726 = null;
        field4733 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILtl;)V", line = 215)
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, class197 arg4) {
        if (class281.field4827) {
            class126.method938(arg3, arg0, arg4.field3294 + arg3, arg4.field3253 + arg0);
        }
        field4721++;
        if (arg1 <= 47) {
            return;
        }
        if (class282.field4861 >= 3) {
            if (class281.field4827) {
                class269 var5 = arg4.method1409((byte) -117, false);
                if (var5 != null) {
                    var5.method291(arg3, arg0);
                }
            } else {
                class175.method1248(arg3, arg0, 0, arg4.field3297, arg4.field3263);
            }
        } else if (class281.field4827) {
            ((class98) class59.field899).method769(arg3, arg0, arg4.field3294, arg4.field3253, class59.field899.field4619 / 2, class59.field899.field4628 / 2, class76.field1253, 256, (class98) arg4.method1409((byte) -117, false));
        } else {
            ((class83) class59.field899).method397(arg3, arg0, arg4.field3294, arg4.field3253, class59.field899.field4619 / 2, class59.field899.field4628 / 2, class76.field1253, 256, arg4.field3297, arg4.field3263);
        }
        class236.field3931[arg2] = true;
    }
}
