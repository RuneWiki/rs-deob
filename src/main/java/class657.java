import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public abstract class class657 {

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "[S")
    private static short[] field9026 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "[S")
    private static short[] field9030 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "[[I")
    public static int[][] field9029 = new int[6][];

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "[S")
    private static short[] field9032 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "[[S")
    public static short[][] field9031 = new short[][] { field9032, field9026, field9030 };

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "Lus;")
    public static class328 field9027 = new class328(41, 3);

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "Lus;")
    public static class328 field9033 = new class328(46, 8);

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method3567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9034++;
        class325.method1917(arg3, -115);
        int var7 = 0;
        int var8 = arg3 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = arg0;
        if (arg5 >= class112.field1386 && arg5 <= class328.field4190) {
            int[] var15 = class15.field220[arg5];
            int var16 = class711.method3927(arg6 - arg3, -124, class592.field8242, class108.field1334);
            int var17 = class711.method3927(arg3 + arg6, -124, class592.field8242, class108.field1334);
            int var18 = class711.method3927(arg6 - var8, -118, class592.field8242, class108.field1334);
            int var19 = class711.method3927(arg6 + var8, arg0 ^ 0x76, class592.field8242, class108.field1334);
            class284.method1709(var15, var18, -8251, var16, arg2);
            class284.method1709(var15, var19, arg0 - 8250, var18, arg4);
            class284.method1709(var15, var17, -8251, var19, arg2);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class44.field661[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class112.field1386 && var20 <= class328.field4190) {
                    if (var9 < var8) {
                        int var22 = class44.field661[var9];
                        int var23 = class711.method3927(arg6 + var7, -111, class592.field8242, class108.field1334);
                        int var24 = class711.method3927(arg6 - var7, -116, class592.field8242, class108.field1334);
                        int var25 = class711.method3927(arg6 + var22, -121, class592.field8242, class108.field1334);
                        int var26 = class711.method3927(arg6 - var22, -109, class592.field8242, class108.field1334);
                        if (class328.field4190 >= var21) {
                            int[] var27 = class15.field220[var21];
                            class284.method1709(var27, var26, -8251, var24, arg2);
                            class284.method1709(var27, var25, -8251, var26, arg4);
                            class284.method1709(var27, var23, -8251, var25, arg2);
                        }
                        if (class112.field1386 <= var20) {
                            int[] var28 = class15.field220[var20];
                            class284.method1709(var28, var26, -8251, var24, arg2);
                            class284.method1709(var28, var25, arg0 - 8250, var26, arg4);
                            class284.method1709(var28, var23, -8251, var25, arg2);
                        }
                    } else {
                        int var29 = class711.method3927(arg6 + var7, arg0 + -110, class592.field8242, class108.field1334);
                        int var30 = class711.method3927(arg6 - var7, -114, class592.field8242, class108.field1334);
                        if (var21 <= class328.field4190) {
                            class284.method1709(class15.field220[var21], var29, -8251, var30, arg2);
                        }
                        if (class112.field1386 <= var20) {
                            class284.method1709(class15.field220[var20], var29, -8251, var30, arg2);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class112.field1386 && class328.field4190 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class108.field1334 && var34 <= class592.field8242) {
                    int var35 = class711.method3927(var33, -117, class592.field8242, class108.field1334);
                    int var36 = class711.method3927(var34, -123, class592.field8242, class108.field1334);
                    if (var7 < var8) {
                        int var37 = var11 >= var7 ? var11 : class44.field661[var7];
                        int var38 = class711.method3927(arg6 + var37, -120, class592.field8242, class108.field1334);
                        int var39 = class711.method3927(arg6 - var37, -126, class592.field8242, class108.field1334);
                        if (class328.field4190 >= var32) {
                            int[] var40 = class15.field220[var32];
                            class284.method1709(var40, var39, -8251, var36, arg2);
                            class284.method1709(var40, var38, arg0 - 8250, var39, arg4);
                            class284.method1709(var40, var35, -8251, var38, arg2);
                        }
                        if (var31 >= class112.field1386) {
                            int[] var41 = class15.field220[var31];
                            class284.method1709(var41, var39, arg0 ^ 0x203A, var36, arg2);
                            class284.method1709(var41, var38, -8251, var39, arg4);
                            class284.method1709(var41, var35, arg0 - 8250, var38, arg2);
                        }
                    } else {
                        if (var32 <= class328.field4190) {
                            class284.method1709(class15.field220[var32], var35, -8251, var36, arg2);
                        }
                        if (var31 >= class112.field1386) {
                            class284.method1709(class15.field220[var31], var35, -8251, var36, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V", line = 197)
    public static final void method3568(int arg0) {
        field9028++;
        boolean var1 = class24.field414.method1094(255) == 1;
        int var2 = class24.field414.method1117((byte) -73);
        class506.field7142 = class24.field414.method1094(255);
        int var3 = class24.field414.method1122(18726);
        int var4 = class24.field414.method1107(false);
        class158.method984(104);
        class51.method427(var2, -10924);
        class24.field414.method4212((byte) -125);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class613.field8591 >> 3; var20++) {
                for (int var21 = 0; var21 < (class1.field3 >> 3); var21++) {
                    int var22 = class24.field414.method4206(1, 107);
                    if (var22 == 1) {
                        class269.field3399[var5][var20][var21] = class24.field414.method4206(26, 127);
                    } else {
                        class269.field3399[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class24.field414.method4214(false);
        int var6 = (class677.field9199 - class24.field414.field2354) / 16;
        class556.field7799 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class556.field7799[var7][var19] = class24.field414.method1095((byte) 115);
            }
        }
        class556.field7797 = new int[var6];
        class177.field2291 = new byte[var6][];
        class688.field9766 = new byte[var6][];
        class258.field3281 = new int[var6];
        class643.field8879 = null;
        class239.field3084 = new int[var6];
        class324.field4136 = new byte[var6][];
        if (arg0 >= -103) {
            field9030 = null;
        }
        class46.field685 = new int[var6];
        class248.field3162 = new int[var6];
        class677.field9198 = null;
        class459.field6460 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class613.field8591 >> 3); var10++) {
                for (int var11 = 0; var11 < (class1.field3 >> 3); var11++) {
                    int var12 = class269.field3399[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFCBD4) >> 14;
                        int var14 = (var12 & 0x3FFA) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class248.field3162[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class248.field3162[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class46.field685[var8] = class541.field7613.method3820("m" + var17 + "_" + var18, -1);
                            class556.field7797[var8] = class541.field7613.method3820("l" + var17 + "_" + var18, -1);
                            class239.field3084[var8] = class541.field7613.method3820("um" + var17 + "_" + var18, -1);
                            class258.field3281[var8] = class541.field7613.method3820("ul" + var17 + "_" + var18, -1);
                            var8++;
                        }
                    }
                }
            }
        }
        class367.method2253(var3, -114, 11, var1, var4);
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V", line = 365)
    public static void method3569(int arg0) {
        if (arg0 != 0) {
            field9032 = null;
        }
        field9033 = null;
        field9027 = null;
        field9030 = null;
        field9031 = null;
        field9029 = null;
        field9032 = null;
        field9026 = null;
    }
}
