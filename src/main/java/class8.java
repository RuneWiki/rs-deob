import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public int field131 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field138 = 0;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Z")
    public static boolean field139 = false;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lpa;")
    public static class91 field136 = new class91(50);

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lec;")
    public static class28 field143 = class28.method210(-46, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Lec;")
    public static class28 field140 = class28.method210(-46, "Create a free account");

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lec;")
    public static class28 field144 = class28.method210(-46, "::fpson");

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lec;")
    public static class28 field142 = class28.method210(-46, " with @whi@");

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lec;")
    public static class28 field149 = class28.method210(-46, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lwc;")
    public static class128 field141;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Loc;")
    public class87 field137;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[[[B")
    public static byte[][][] field127;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method41(int arg0) {
        class49.field1150 = new byte[4][104][104];
        field127 = new byte[4][104][104];
        class76.field1720 = new byte[4][105][105];
        field135++;
        class117.field2496 = new byte[4][104][104];
        class78.field1818 = new int[104];
        class55.field1272 = new byte[4][104][104];
        class32.field681 = 99;
        class109.field2280 = new int[104];
        class117.field2472 = new int[4][105][105];
        class86.field1909 = new int[105][105];
        class2.field26 = new int[104];
        class127.field2747 = new int[104];
        if (arg0 < 107) {
            field144 = null;
        }
        class15.field294 = new int[104];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lsa;")
    public static final class106 method42(int arg0, int arg1) {
        field132++;
        class106 var2 = (class106) class80.field1842.method660(-2, (long) arg0);
        if (arg1 < 100) {
            method44(38, null);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field1294.method932(123, arg0, 9);
        class106 var4 = new class106();
        var4.field2258 = arg0;
        if (var3 != null) {
            var4.method737((byte) 70, new class119(var3));
        }
        var4.method738(-1);
        class80.field1842.method666(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static void method43(int arg0) {
        if (arg0 < 33) {
            field142 = null;
        }
        field140 = null;
        field141 = null;
        field143 = null;
        field136 = null;
        field144 = null;
        field149 = null;
        field142 = null;
        field127 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILke;)V")
    public static final void method44(int arg0, class65 arg1) {
        if (class83.field1888 == arg1.field1474 || arg1.field1505 == -1 || arg1.field1482 != 0 || arg1.field1467 + 1 > class23.method166(0, arg1.field1505).field223[arg1.field1498]) {
            int var2 = arg1.field1474 - arg1.field1450;
            int var3 = class83.field1888 - arg1.field1450;
            int var4 = arg1.field1500 * 64 + arg1.field1488 * 128;
            int var5 = arg1.field1500 * 64 + arg1.field1459 * 128;
            int var6 = arg1.field1457 * 128 + arg1.field1500 * 64;
            arg1.field1446 = ((var2 - var3) * var4 + var3 * var6) / var2;
            int var7 = arg1.field1500 * 64 + arg1.field1464 * 128;
            arg1.field1501 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0 != 23164) {
            method43(-19);
        }
        field130++;
        if (arg1.field1475 == 0) {
            arg1.field1471 = 1024;
        }
        if (arg1.field1475 == 1) {
            arg1.field1471 = 1536;
        }
        if (arg1.field1475 == 2) {
            arg1.field1471 = 0;
        }
        arg1.field1438 = 0;
        if (arg1.field1475 == 3) {
            arg1.field1471 = 512;
        }
        arg1.field1492 = arg1.field1471;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIBII)V")
    public static final void method45(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field129++;
        int var6 = class11.field179.method783(arg4, arg0, arg2);
        if (var6 != 0) {
            int var7 = class11.field179.method795(arg4, arg0, arg2, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg5;
            if (var6 > 0) {
                var10 = arg1;
            }
            int[] var11 = class13.field215.field563;
            int var12 = (103 - arg2) * 4 * 512 + arg0 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class45 var14 = class72.method566(var13, arg3 ^ 0x10);
            if (var14.field1015 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class128 var15 = class94.field2076[var14.field1015];
                if (var15 != null) {
                    int var16 = (var14.field1002 * 4 - var15.field2756) / 2;
                    int var17 = (var14.field979 * 4 - var15.field2759) / 2;
                    var15.method977(arg0 * 4 + var16 + 48, (-var14.field979 + 104 + -arg2) * 4 + 48 + var17);
                }
            }
        }
        int var18 = class11.field179.method796(arg4, arg0, arg2);
        if (var18 != 0) {
            int var19 = class11.field179.method795(arg4, arg0, arg2, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var18 >> 14 & 0x7FFF;
            class45 var22 = class72.method566(var21, 91);
            int var23 = var19 & 0x1F;
            if (var22.field1015 != -1) {
                class128 var27 = class94.field2076[var22.field1015];
                if (var27 != null) {
                    int var28 = (var22.field1002 * 4 - var27.field2756) / 2;
                    int var29 = (var22.field979 * 4 - var27.field2759) / 2;
                    var27.method977(arg0 * 4 + var28 + 48, (-var22.field979 + 104 + -arg2) * 4 + 48 + var29);
                }
            } else if (var23 == 9) {
                int[] var24 = class13.field215.field563;
                int var25 = 15658734;
                if (var18 > 0) {
                    var25 = 15597568;
                }
                int var26 = (52736 - arg2 * 512) * 4 + arg0 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var24[var26 + 1536] = var25;
                    var24[var26 + 1024 + 1] = var25;
                    var24[var26 + 512 + 2] = var25;
                    var24[var26 + 3] = var25;
                } else {
                    var24[var26] = var25;
                    var24[var26 + 513] = var25;
                    var24[var26 + 2 + 1024] = var25;
                    var24[var26 + 1536 + 3] = var25;
                }
            }
        }
        if (arg3 != 78) {
            field147 = -123;
        }
        int var30 = class11.field179.method774(arg4, arg0, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class45 var32 = class72.method566(var31, -113);
        if (var32.field1015 == -1) {
            return;
        }
        class128 var33 = class94.field2076[var32.field1015];
        if (var33 != null) {
            int var34 = (var32.field1002 * 4 - var33.field2756) / 2;
            int var35 = (var32.field979 * 4 - var33.field2759) / 2;
            var33.method977(arg0 * 4 + var34 + 48, (-arg2 - var32.field979 + 104) * 4 + 48 + var35);
            return;
        }
    }
}
