import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lob;")
    public static class141 field3 = class175.method1195(40, "(U");

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lob;")
    private static class141 field6 = class175.method1195(40, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lob;")
    private static class141 field5 = class175.method1195(40, "Starting 3d library");

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lob;")
    public static class141 field8 = class175.method1195(40, "blaugr-Un:");

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[Lja;")
    public static class90[] field9 = new class90[23];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lob;")
    public static class141 field14 = field5;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lob;")
    public static class141 field13 = field6;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lob;")
    private static class141 field10 = class175.method1195(40, "button near the top of that page)3");

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lob;")
    public static class141 field16 = field10;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[[[[Z")
    public static boolean[][][][] field4;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field12++;
        if (arg5 >= -90) {
            field14 = null;
        }
        long var6 = class224.method1442(arg3, arg2, arg4);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = arg0;
            int var10 = (int) var6 >> 14 & 0x1F;
            if (var6 > 0L) {
                var9 = arg1;
            }
            int var11 = arg2 * 4 + (103 - arg4) * 2048 + 24624;
            int[] var12 = class108.field2079.field1983;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class54 var14 = class175.method1198(-14098, var13);
            if (var14.field1020 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var12[var11] = var9;
                        var12[var11 + 512] = var9;
                        var12[var11 + 1024] = var9;
                        var12[var11 + 1536] = var9;
                    } else if (var8 == 1) {
                        var12[var11] = var9;
                        var12[var11 + 1] = var9;
                        var12[var11 + 2] = var9;
                        var12[var11 + 3] = var9;
                    } else if (var8 == 2) {
                        var12[var11 + 3] = var9;
                        var12[var11 + 515] = var9;
                        var12[var11 + 3 + 1024] = var9;
                        var12[var11 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var9;
                        var12[var11 + 1536 + 1] = var9;
                        var12[var11 + 1536 + 2] = var9;
                        var12[var11 + 1536 + 3] = var9;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var12[var11] = var9;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var9;
                    } else if (var8 == 2) {
                        var12[var11 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var9;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var12[var11] = var9;
                        var12[var11 + 512] = var9;
                        var12[var11 + 1024] = var9;
                        var12[var11 + 1536] = var9;
                    } else if (var8 == 0) {
                        var12[var11] = var9;
                        var12[var11 + 1] = var9;
                        var12[var11 + 2] = var9;
                        var12[var11 + 3] = var9;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var9;
                        var12[var11 + 3 + 512] = var9;
                        var12[var11 + 1024 + 3] = var9;
                        var12[var11 + 1539] = var9;
                    } else if (var8 == 2) {
                        var12[var11 + 1536] = var9;
                        var12[var11 + 1537] = var9;
                        var12[var11 + 1538] = var9;
                        var12[var11 + 1539] = var9;
                    }
                }
            } else {
                class52 var15 = class60.field1164[var14.field1020];
                if (var15 != null) {
                    int var16 = (var14.field1079 * 4 - var15.field1003) / 2;
                    int var17 = (var14.field1073 * 4 - var15.field1000) / 2;
                    var15.method349(arg2 * 4 + var16 + 48, (104 - arg4 + -var14.field1073) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class40.method263(arg3, arg2, arg4);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class54 var23 = class175.method1198(-14098, var22);
            if (var23.field1020 != -1) {
                class52 var24 = class60.field1164[var23.field1020];
                if (var24 != null) {
                    int var25 = (var23.field1079 * 4 - var24.field1003) / 2;
                    int var26 = (var23.field1073 * 4 - var24.field1000) / 2;
                    var24.method349(arg2 * 4 + var25 + 48, 48 - -((-var23.field1073 + -arg4 + 104) * 4) - -var26);
                }
            } else if (var21 == 9) {
                int[] var27 = class108.field2079.field1983;
                int var28 = arg2 * 4 + (52736 - arg4 * 512) * 4 + 24624;
                int var29 = 15658734;
                if (var18 > 0L) {
                    var29 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var27[var28 + 1536] = var29;
                    var27[var28 + 1025] = var29;
                    var27[var28 + 512 + 2] = var29;
                    var27[var28 + 3] = var29;
                } else {
                    var27[var28] = var29;
                    var27[var28 + 512 + 1] = var29;
                    var27[var28 + 1024 + 2] = var29;
                    var27[var28 + 1536 + 3] = var29;
                }
            }
        }
        long var30 = class177.method1206(arg3, arg2, arg4);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class54 var33 = class175.method1198(-14098, var32);
        if (var33.field1020 == -1) {
            return;
        }
        class52 var34 = class60.field1164[var33.field1020];
        if (var34 != null) {
            int var35 = (var33.field1079 * 4 - var34.field1003) / 2;
            int var36 = (var33.field1073 * 4 - var34.field1000) / 2;
            var34.method349(arg2 * 4 + var35 + 48, (-arg4 + 104 + -var33.field1073) * 4 + 48 + var36);
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)J")
    public static final synchronized long method2(byte arg0) {
        if (arg0 >= -46) {
            field14 = null;
        }
        field15++;
        long var1 = System.currentTimeMillis();
        if (var1 < class177.field3502) {
            class68.field1347 += class177.field3502 - var1;
        }
        class177.field3502 = var1;
        return var1 + class68.field1347;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public static final void method3(int arg0, int arg1, int arg2) {
        field17++;
        int[] var3 = new int[4];
        var3[0] = arg0;
        int[] var4 = new int[4];
        if (arg1 != -24129) {
            field14 = null;
        }
        int var5 = 1;
        var4[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class47.field903[var6] != arg0) {
                var3[var5] = class47.field903[var6];
                var4[var5] = class24.field450[var6];
                var5++;
            }
        }
        class47.field903 = var3;
        class24.field450 = var4;
        class22.method133(class42.field827, class24.field450, 0, class47.field903, 25097, class42.field827.length - 1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILra;II)V")
    public static final void method4(int arg0, int arg1, class170 arg2, int arg3, int arg4) {
        class118.method766(-5);
        class148.method1020(arg4, arg3, arg2.field3299 + arg4, arg3 - -arg2.field3284);
        if (arg0 != 4) {
            method2((byte) -114);
        }
        field2++;
        if (class184.field3590 == 2 || class184.field3590 == 5) {
            class148.method1038(arg4, arg3, 0, arg2.field3347, arg2.field3362);
        } else {
            int var5 = class114.field2176.field3889 / 32 + 48;
            int var6 = class96.field1901 + class214.field4084 & 0x7FF;
            int var7 = 464 - class114.field2176.field3854 / 32;
            class108.field2079.method670(arg4, arg3, arg2.field3299, arg2.field3284, var5, var7, var6, class116.field2225 + 256, arg2.field3347, arg2.field3362);
            for (int var8 = 0; var8 < class88.field1761; var8++) {
                int var41 = class92.field1845[var8] * 4 + 2 - class114.field2176.field3889 / 32;
                int var42 = class220.field4169[var8] * 4 + 2 - class114.field2176.field3854 / 32;
                class4.method21(class97.field1914[var8], -95, arg4, var42, arg2, arg3, var41);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class158 var38 = class76.field1559[class66.field1287][var9][var37];
                    if (var38 != null) {
                        int var39 = var37 * 4 + 2 - class114.field2176.field3854 / 32;
                        int var40 = var9 * 4 + 2 - class114.field2176.field3889 / 32;
                        class4.method21(class4.field40[0], -113, arg4, var39, arg2, arg3, var40);
                    }
                }
            }
            for (int var10 = 0; var10 < class195.field3738; var10++) {
                class131 var33 = class10.field172[class203.field3888[var10]];
                if (var33 != null && var33.method251((byte) 99)) {
                    class10 var34 = var33.field2507;
                    if (var34 != null && var34.field197 != null) {
                        var34 = var34.method61((byte) 122);
                    }
                    if (var34 != null && var34.field193 && var34.field176) {
                        int var35 = var33.field3889 / 32 - class114.field2176.field3889 / 32;
                        int var36 = var33.field3854 / 32 - class114.field2176.field3854 / 32;
                        class4.method21(class4.field40[1], -86, arg4, var36, arg2, arg3, var35);
                    }
                }
            }
            for (int var11 = 0; var11 < class184.field3587; var11++) {
                class38 var25 = class116.field2231[class188.field3647[var11]];
                if (var25 != null && var25.method251((byte) 122)) {
                    int var26 = var25.field3854 / 32 - class114.field2176.field3854 / 32;
                    boolean var27 = false;
                    int var28 = var25.field3889 / 32 - class114.field2176.field3889 / 32;
                    long var29 = var25.field773.method926(19790);
                    for (int var31 = 0; var31 < class88.field1750; var31++) {
                        if (class131.field2499[var31] == var29 && class103.field1993[var31] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class114.field2176.field775 != 0 && var25.field775 != 0 && class114.field2176.field775 == var25.field775) {
                        var32 = true;
                    }
                    if (var27) {
                        class4.method21(class4.field40[3], arg0 ^ 0xFFFFFFA3, arg4, var26, arg2, arg3, var28);
                    } else if (var32) {
                        class4.method21(class4.field40[4], -103, arg4, var26, arg2, arg3, var28);
                    } else {
                        class4.method21(class4.field40[2], -83, arg4, var26, arg2, arg3, var28);
                    }
                }
            }
            class108[] var12 = class200.field3777;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class108 var16 = var12[var13];
                if (var16 != null && var16.field2077 != 0 && class20.field344 % 20 < 10) {
                    if (var16.field2077 == 1 && var16.field2074 >= 0 && var16.field2074 < class10.field172.length) {
                        class131 var17 = class10.field172[var16.field2074];
                        if (var17 != null) {
                            int var18 = var17.field3889 / 32 - class114.field2176.field3889 / 32;
                            int var19 = var17.field3854 / 32 - class114.field2176.field3854 / 32;
                            class39.method259(false, arg4, var16.field2082, var18, arg3, var19, arg2);
                        }
                    }
                    if (var16.field2077 == 2) {
                        int var20 = (var16.field2078 - class83.field1649) * 4 + 2 - class114.field2176.field3889 / 32;
                        int var21 = (var16.field2076 - class83.field1644) * 4 + 2 - class114.field2176.field3854 / 32;
                        class39.method259(false, arg4, var16.field2082, var20, arg3, var21, arg2);
                    }
                    if (var16.field2077 == 10 && var16.field2074 >= 0 && class116.field2231.length > var16.field2074) {
                        class38 var22 = class116.field2231[var16.field2074];
                        if (var22 != null) {
                            int var23 = var22.field3854 / 32 - class114.field2176.field3854 / 32;
                            int var24 = var22.field3889 / 32 - class114.field2176.field3889 / 32;
                            class39.method259(false, arg4, var16.field2082, var24, arg3, var23, arg2);
                        }
                    }
                }
            }
            if (class224.field4233 != 0) {
                int var14 = class224.field4233 * 4 + 2 - class114.field2176.field3889 / 32;
                int var15 = class221.field4194 * 4 + 2 - class114.field2176.field3854 / 32;
                class4.method21(class174.field3453, -113, arg4, var15, arg2, arg3, var14);
            }
            class148.method1030(arg2.field3299 / 2 + arg4 - 1, arg2.field3284 / 2 + arg3 + -1, 3, 3, 16777215);
        }
        class223.field4211[arg1] = true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Laa;IIIII)V")
    public static final void method5(class2 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class108.field2090 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class163.field3158) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class220.field4172 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class153 var14 = class131.field2506[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class110.field2119[var11][var12 + 1][var13] + class110.field2119[var11][var12][var13] + class110.field2119[var11][var12][var13 + 1] + class110.field2119[var11][var12 + 1][var13 + 1]) / 4 - (class110.field2119[arg1][arg2 + 1][arg3] + class110.field2119[arg1][arg2][arg3] + class110.field2119[arg1][arg2][arg3 + 1] + class110.field2119[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class172 var16 = var14.field2929;
                                    if (var16 != null) {
                                        if (var16.field3418.method15()) {
                                            arg0.method13(var16.field3418, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3409 != null && var16.field3409.method15()) {
                                            arg0.method13(var16.field3409, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2933; var17++) {
                                        class9 var18 = var14.field2935[var17];
                                        if (var18 != null && var18.field147.method15()) {
                                            int var19 = var18.field144 + 1 - var18.field156;
                                            int var20 = var18.field157 + 1 - var18.field143;
                                            arg0.method13(var18.field147, (var18.field156 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field143 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lah;)V")
    public static final void method6(class9 arg0) {
        for (int var1 = arg0.field156; var1 <= arg0.field144; var1++) {
            for (int var2 = arg0.field143; var2 <= arg0.field157; var2++) {
                class153 var3 = class131.field2506[arg0.field150][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2933; var4++) {
                        if (var3.field2935[var4] == arg0) {
                            var3.field2933--;
                            for (int var5 = var4; var5 < var3.field2933; var5++) {
                                var3.field2935[var5] = var3.field2935[var5 + 1];
                                var3.field2930[var5] = var3.field2930[var5 + 1];
                            }
                            var3.field2935[var3.field2933] = null;
                            break;
                        }
                    }
                    var3.field2940 = 0;
                    for (int var6 = 0; var6 < var3.field2933; var6++) {
                        var3.field2940 |= var3.field2930[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7++;
        class180.method1217(arg0 + arg4, (byte) 52, arg0 - arg4, arg1, class41.field805[arg3]);
        int var5 = 0;
        int var6 = -arg4;
        int var7 = arg4;
        int var8 = -70 % ((arg2 + 13) / 50);
        int var9 = -1;
        while (var5 < var7) {
            var9 += 2;
            var6 += var9;
            var5++;
            if (var6 >= 0) {
                var7--;
                var6 -= var7 << 1;
                int[] var10 = class41.field805[arg3 - var7];
                int var11 = arg0 + var5;
                int[] var12 = class41.field805[arg3 + var7];
                int var13 = arg0 - var5;
                class180.method1217(var11, (byte) 52, var13, arg1, var12);
                class180.method1217(var11, (byte) 52, var13, arg1, var10);
            }
            int var14 = arg0 + var7;
            int var15 = arg0 - var7;
            int[] var16 = class41.field805[arg3 + var5];
            int[] var17 = class41.field805[arg3 - var5];
            class180.method1217(var14, (byte) 52, var15, arg1, var16);
            class180.method1217(var14, (byte) 52, var15, arg1, var17);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field14 = null;
        field16 = null;
        if (arg0 > -93) {
            method8((byte) 9);
        }
        field5 = null;
        field9 = null;
        field8 = null;
        field6 = null;
        field10 = null;
        field13 = null;
        field4 = null;
        field3 = null;
    }
}
