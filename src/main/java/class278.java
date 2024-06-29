import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class278 extends class256 {

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lui;")
    public static class268 field4772 = new class268(32);

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Ljf;")
    public static class229 field4774 = class212.method1457((byte) 72, "Utiliser");

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Z")
    public static boolean field4775 = false;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[Ljj;")
    public static class150[] field4773;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)V", line = 12)
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4771++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg3 - arg0;
        int var12 = arg3 * arg3;
        int var13 = arg1 - arg0;
        int var14 = arg1 * arg1;
        int var15 = var13 * var13;
        int var16 = var14 << 1;
        int var17 = var11 * var11;
        int var18 = var12 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = arg1 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var12 + var16;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var17 + var19;
        int var26 = var12 << 2;
        int var27 = var15 - ((var22 - 1) * var20);
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = arg2 * var19;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var26;
        int[] var37 = class173.field3021[arg7];
        int var38 = (var13 - 1) * var30;
        int var39 = var29;
        class34.method306(arg4 - arg3, var37, (byte) 117, arg4 - var11, arg5);
        class34.method306(arg4 - var11, var37, (byte) 115, arg4 + var11, arg6);
        class34.method306(arg4 + var11, var37, (byte) 123, arg3 + arg4, arg5);
        while (var9 > 0) {
            boolean var40 = var13 >= var9;
            var9--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var27 += var39;
                        var39 += var29;
                        var10++;
                        var33 += var29;
                    }
                }
                if (var27 < 0) {
                    var27 += var39;
                    var10++;
                    var25 += var33;
                    var33 += var29;
                    var39 += var29;
                }
                var27 += -var34;
                var34 -= var30;
                var25 += -var38;
                var38 -= var30;
            }
            int var41 = arg7 - var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var24 += var35;
                    var35 += var28;
                }
            }
            int var42 = arg7 + var9;
            if (var24 < 0) {
                var24 += var35;
                var35 += var28;
                var23 += var31;
                var31 += var28;
                var8++;
            }
            int var43 = arg4 + var8;
            var24 += -var32;
            var32 -= var26;
            var23 += -var36;
            var36 -= var26;
            int var44 = arg4 - var8;
            if (var40) {
                int var45 = arg4 + var10;
                int var46 = arg4 - var10;
                class34.method306(var44, class173.field3021[var41], (byte) 124, var46, arg5);
                class34.method306(var46, class173.field3021[var41], (byte) 127, var45, arg6);
                class34.method306(var45, class173.field3021[var41], (byte) 122, var43, arg5);
                class34.method306(var44, class173.field3021[var42], (byte) 126, var46, arg5);
                class34.method306(var46, class173.field3021[var42], (byte) 127, var45, arg6);
                class34.method306(var45, class173.field3021[var42], (byte) 112, var43, arg5);
            } else {
                class34.method306(var44, class173.field3021[var41], (byte) 111, var43, arg5);
                class34.method306(var44, class173.field3021[var42], (byte) 119, var43, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 180)
    public static void method1955(byte arg0) {
        field4773 = null;
        field4774 = null;
        field4772 = null;
        int var1 = -37 % ((41 - arg0) / 60);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLkh;)Ljf;", line = 195)
    public static final class229 method1956(byte arg0, class14 arg1) {
        int var2 = 114 / ((arg0 - 37) / 62);
        field4770++;
        return class152.method1030(32767, arg1, -28276);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BI)V", line = 204)
    public static final void method1957(byte[] arg0, int arg1) {
        field4769++;
        class14 var2 = new class14(arg0);
        var2.field195 = arg0.length - 2;
        class315.field5348 = var2.method116(-1);
        class256.field4473 = new int[class315.field5348];
        class21.field357 = new byte[class315.field5348][];
        class315.field5336 = new byte[class315.field5348][];
        class232.field4025 = new int[class315.field5348];
        class6.field71 = new int[class315.field5348];
        class272.field4659 = new int[class315.field5348];
        class122.field2148 = new boolean[class315.field5348];
        var2.field195 = arg0.length - (class315.field5348 * 8) - 7;
        class97.field1722 = var2.method116(-1);
        class307.field5192 = var2.method116(-1);
        int var3 = (var2.method93(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class315.field5348; var4++) {
            class272.field4659[var4] = var2.method116(-1);
        }
        for (int var5 = 0; var5 < class315.field5348; var5++) {
            class256.field4473[var5] = var2.method116(-1);
        }
        for (int var6 = 0; var6 < class315.field5348; var6++) {
            class232.field4025[var6] = var2.method116(-1);
        }
        for (int var7 = 0; var7 < class315.field5348; var7++) {
            class6.field71[var7] = var2.method116(-1);
        }
        var2.field195 = arg0.length - (class315.field5348 * 8) - ((var3 + -1) * 3) - 7;
        class64.field1115 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class64.field1115[var8] = var2.method114(0);
            if (class64.field1115[var8] == 0) {
                class64.field1115[var8] = 1;
            }
        }
        var2.field195 = 0;
        for (int var9 = 0; var9 < class315.field5348; var9++) {
            int var10 = class232.field4025[var9];
            int var11 = class6.field71[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class21.field357[var9] = var14;
            boolean var15 = false;
            class315.field5336[var9] = var13;
            int var16 = var2.method93(false);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method98(true);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method98(true);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label101;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var13[var10 * var23 + var22] = var2.method98(true);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var14[var10 * var21 + var20] = var2.method98(true);
                    }
                    var20++;
                }
            }
            class122.field2148[var9] = var15;
        }
        if (arg1 <= 35) {
            method1954(-17, -105, -32, -52, -60, -41, 9, -6);
        }
    }
}
