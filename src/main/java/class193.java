import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class193 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "J")
    public long field3101 = 0L;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lqd;")
    public static class40 field3103 = class147.method1106("www)2wtqa", (byte) -104);

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lqd;")
    public static class40 field3110 = class147.method1106("Gegenstand f-Ur Mitglieder", (byte) -63);

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "[I")
    public static int[] field3114 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lbg;")
    public class196 field3106;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lkg;")
    public static class70 field3119;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 9)
    public static void method1379(int arg0) {
        field3103 = null;
        field3110 = null;
        if (arg0 != 1) {
            method1379(3);
        }
        field3114 = null;
        field3119 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lih;IIIIIIIZ)V", line = 25)
    public static final void method1380(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class208.field3331;
        int var11;
        int var12 = var11 = (arg7 << 7) - class180.field2939;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class78.field1316[arg1][arg6][arg7] - class48.field940;
        int var18 = class78.field1316[arg1][arg6 + 1][arg7] - class48.field940;
        int var19 = class78.field1316[arg1][arg6 + 1][arg7 + 1] - class48.field940;
        int var20 = class78.field1316[arg1][arg6][arg7 + 1] - class48.field940;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class203.field3210;
        int var46 = (var24 << 9) / var25 + class203.field3222;
        int var47 = (var27 << 9) / var31 + class203.field3210;
        int var48 = (var30 << 9) / var31 + class203.field3222;
        int var49 = (var33 << 9) / var37 + class203.field3210;
        int var50 = (var36 << 9) / var37 + class203.field3222;
        int var51 = (var39 << 9) / var43 + class203.field3210;
        int var52 = (var42 << 9) / var43 + class203.field3222;
        class203.field3215 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class55.field1070 && class106.method794(class76.field1308 + class203.field3210, class203.field3222 + class106.field1863, var50, var52, var48, var49, var51, var47)) {
                class42.field801 = arg6;
                class294.field4936 = arg7;
            }
            if (!class21.field350 && !arg8) {
                class203.field3214 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class203.field3220 || var51 > class203.field3220 || var47 > class203.field3220) {
                    class203.field3214 = true;
                }
                if (arg0.field630 == -1) {
                    if (arg0.field639 != 12345678) {
                        class203.method1418(var50, var52, var48, var49, var51, var47, arg0.field639, arg0.field638, arg0.field635);
                    }
                } else if (!class104.field1847) {
                    int var53 = class203.field3217.method566(-66, arg0.field630);
                    class203.method1418(var50, var52, var48, var49, var51, var47, class258.method1816(var53, arg0.field639), class258.method1816(var53, arg0.field638), class258.method1816(var53, arg0.field635));
                } else if (arg0.field633) {
                    class203.method1416(var50, var52, var48, var49, var51, var47, arg0.field639, arg0.field638, arg0.field635, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field630);
                } else {
                    class203.method1416(var50, var52, var48, var49, var51, var47, arg0.field639, arg0.field638, arg0.field635, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field630);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class55.field1070 && class106.method794(class76.field1308 + class203.field3210, class203.field3222 + class106.field1863, var46, var48, var52, var45, var47, var51)) {
            class42.field801 = arg6;
            class294.field4936 = arg7;
        }
        if (class21.field350 || arg8) {
            return;
        }
        class203.field3214 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class203.field3220 || var47 > class203.field3220 || var51 > class203.field3220) {
            class203.field3214 = true;
        }
        if (arg0.field630 == -1) {
            if (arg0.field640 != 12345678) {
                class203.method1418(var46, var48, var52, var45, var47, var51, arg0.field640, arg0.field635, arg0.field638);
            }
        } else if (class104.field1847) {
            class203.method1416(var46, var48, var52, var45, var47, var51, arg0.field640, arg0.field635, arg0.field638, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field630);
        } else {
            int var54 = class203.field3217.method566(-96, arg0.field630);
            class203.method1418(var46, var48, var52, var45, var47, var51, class258.method1816(var54, arg0.field640), class258.method1816(var54, arg0.field635), class258.method1816(var54, arg0.field638));
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 200)
    public static final void method1381(boolean arg0) {
        if (arg0) {
            class93.field1690 = class27.field591;
            class78.field1316 = class160.field2687;
            class293.field4933 = class158.field2645;
        } else {
            class93.field1690 = class290.field4857;
            class78.field1316 = class244.field4020;
            class293.field4933 = class147.field2439;
        }
        class294.field4942 = class93.field1690.length;
    }
}
