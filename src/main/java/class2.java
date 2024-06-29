import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 extends class270 {

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "[J")
    public static long[] field21 = new long[256];

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "Lmh;")
    public static class62 field23;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "J")
    public static volatile long field27;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "Lmh;")
    public static class62 field29;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "Z")
    public static boolean field26;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method5(int arg0, byte arg1) {
        field18++;
        for (class173 var2 = (class173) class183.field2929.method317(-93); var2 != null; var2 = (class173) class183.field2929.method314(-51)) {
            if ((var2.field3499 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1444((byte) 89);
            }
        }
        if (arg1 <= 33) {
            method12(24, 37, -113, -70, 104, 45, -10);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 29)
    public class2() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 36)
    public final int[] method6(int arg0, int arg1) {
        field19++;
        if (arg0 != 18693) {
            method5(61, (byte) 59);
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, arg1);
            int[] var5 = this.method1850(1, arg0 ^ 0x4905, arg1);
            int[] var6 = this.method1850(2, 0, arg1);
            for (int var7 = 0; var7 < class109.field1770; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILhi;IILhi;)Ltj;", line = 92)
    public static final class11 method7(int arg0, class26 arg1, int arg2, int arg3, class26 arg4) {
        field16++;
        int var5 = -4 % ((-arg0 - 7) / 39);
        return class127.method951(arg1, arg2, -38, arg3) ? class289.method1974(arg4.method157(arg3, arg2, (byte) 19), (byte) -94) : null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lmi;II)V", line = 106)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field15++;
        if (arg1 == 0) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        int var4 = 24 / ((-arg2 - 8) / 53);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 120)
    public static void method9(int arg0) {
        field29 = null;
        field23 = null;
        if (arg0 == 26478) {
            field21 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIILjm;JZ)V", line = 135)
    public static final void method10(int arg0, int arg1, int arg2, int arg3, class123 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class32 var8 = new class32();
        var8.field443 = arg4;
        var8.field430 = arg1 * 128 + 64;
        var8.field434 = arg2 * 128 + 64;
        var8.field433 = arg3;
        var8.field442 = arg5;
        var8.field435 = arg6;
        if (class256.field4320[arg0][arg1][arg2] == null) {
            class256.field4320[arg0][arg1][arg2] = new class166(arg0, arg1, arg2);
        }
        class256.field4320[arg0][arg1][arg2].field2711 = var8;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)[[I", line = 156)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            this.method6(-13, 113);
        }
        field22++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[] var4 = this.method1850(2, 0, arg1);
            int[][] var5 = this.method1855(false, arg1, 0);
            int[][] var6 = this.method1855(false, arg1, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var5[2];
            int[] var12 = var3[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class109.field1770; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var9[var16];
                    var7[var16] = var10[var16];
                    var12[var16] = var11[var16];
                } else if (var17 == 0) {
                    var8[var16] = var13[var16];
                    var7[var16] = var14[var16];
                    var12[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var8[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var7[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var12[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V", line = 233)
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field17++;
        if (class263.field4429 == 0) {
            int var7 = class244.field4160;
            class42.field637++;
            int var8 = class221.field3804;
            int var9 = class8.field90;
            int var10 = (arg3 - arg5) * (var8 - var7) / arg0 + var7;
            int var11 = class24.field263;
            int var12 = (arg4 - arg1) * (var9 - var11) / arg2 + var11;
            if (class106.field1728 && (class141.field2271 & 0x40) == 64) {
                class191 var13 = class52.method331((byte) -101, class153.field2410, class206.field3490);
                if (var13 == null) {
                    class203.method1419(116);
                } else {
                    class39.method268(true, var10, var12, class121.field2015, (short) 1, 0L, class133.field2164);
                }
            } else {
                class39.method268(true, var10, var12, class108.field1741, (short) 5, 0L, class275.field4694);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class288.field4910; var16++) {
            long var17 = class243.field4129[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FA9) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class109.method842(class7.field85, var19, var20, var17)) {
                    class216 var23 = class252.method1755(var22, (byte) -28);
                    if (var23.field3709 != null) {
                        var23 = var23.method1526(-118);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class263.field4429 == 1) {
                        class165.field2683++;
                        class39.method268(true, var19, var20, class73.field1113, (short) 33, var17, class254.method1772(new class62[] { class216.field3671, class123.field2042, var23.field3670 }, 0));
                    } else if (!class106.field1728) {
                        class251.field4261++;
                        class62[] var24 = var23.field3666;
                        if (class29.field383) {
                            var24 = class113.method886(var24, (byte) -95);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class265.field4482++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 24;
                                    }
                                    if (var25 == 1) {
                                        var26 = 50;
                                    }
                                    if (var25 == 2) {
                                        var26 = 59;
                                    }
                                    if (var25 == 3) {
                                        var26 = 30;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1003;
                                    }
                                    class39.method268(true, var19, var20, var24[var25], var26, var17, class254.method1772(new class62[] { class183.field2934, var23.field3670 }, 0));
                                }
                            }
                        }
                        class39.method268(true, var19, var20, class17.field164, (short) 1007, (long) var23.field3689, class254.method1772(new class62[] { class183.field2934, var23.field3670 }, 0));
                    } else if ((class141.field2271 & 0x4) == 4) {
                        class39.method268(true, var19, var20, class121.field2015, (short) 58, var17, class254.method1772(new class62[] { class281.field4805, class123.field2042, var23.field3670 }, 0));
                        class174.field2808++;
                    }
                }
                if (var21 == 1) {
                    class204 var27 = class301.field5186[var22];
                    if (var27.field3435.field4714 == 1 && (var27.field3821 & 0x7F) == 64 && (var27.field3814 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class133.field2163; var28++) {
                            class204 var29 = class301.field5186[class288.field4914[var28]];
                            if (var29 != null && var27 != var29 && var29.field3435.field4714 == 1 && var27.field3821 == var29.field3821 && var27.field3814 == var29.field3814) {
                                class194.method1363(var19, 78, class288.field4914[var28], var29.field3435, var20);
                            }
                        }
                        for (int var30 = 0; var30 < class118.field1975; var30++) {
                            class153 var31 = class5.field50[class98.field1617[var30]];
                            if (var31 != null && var27.field3821 == var31.field3821 && var27.field3814 == var31.field3814) {
                                class143.method1054(class98.field1617[var30], var31, var19, 0, var20);
                            }
                        }
                    }
                    class194.method1363(var19, 101, var22, var27.field3435, var20);
                }
                if (var21 == 0) {
                    class153 var32 = class5.field50[var22];
                    if ((var32.field3821 & 0x7F) == 64 && (var32.field3814 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class133.field2163; var33++) {
                            class204 var34 = class301.field5186[class288.field4914[var33]];
                            if (var34 != null && var34.field3435.field4714 == 1 && var32.field3821 == var34.field3821 && var32.field3814 == var34.field3814) {
                                class194.method1363(var19, 100, class288.field4914[var33], var34.field3435, var20);
                            }
                        }
                        for (int var35 = 0; var35 < class118.field1975; var35++) {
                            class153 var36 = class5.field50[class98.field1617[var35]];
                            if (var36 != null && var32 != var36 && var32.field3821 == var36.field3821 && var32.field3814 == var36.field3814) {
                                class143.method1054(class98.field1617[var35], var36, var19, 0, var20);
                            }
                        }
                    }
                    class143.method1054(var22, var32, var19, 0, var20);
                }
                if (var21 == 3) {
                    class52 var37 = class7.field72[class7.field85][var19][var20];
                    if (var37 != null) {
                        for (class301 var38 = (class301) var37.method337(-117); var38 != null; var38 = (class301) var37.method339(25190)) {
                            int var39 = var38.field5187.field629;
                            class37 var40 = class189.method1320(0, var39);
                            if (class263.field4429 == 1) {
                                class39.method268(true, var19, var20, class73.field1113, (short) 28, (long) var39, class254.method1772(new class62[] { class216.field3671, class236.field4061, var40.field541 }, 0));
                                class4.field35++;
                            } else if (!class106.field1728) {
                                class77.field1282++;
                                class62[] var41 = var40.field512;
                                if (class29.field383) {
                                    var41 = class113.method886(var41, (byte) -95);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class170.field2767++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 21;
                                        }
                                        if (var42 == 1) {
                                            var43 = 12;
                                        }
                                        if (var42 == 2) {
                                            var43 = 8;
                                        }
                                        if (var42 == 3) {
                                            var43 = 51;
                                        }
                                        if (var42 == 4) {
                                            var43 = 17;
                                        }
                                        class39.method268(true, var19, var20, var41[var42], var43, (long) var39, class254.method1772(new class62[] { class113.field1876, var40.field541 }, 0));
                                    } else if (var42 == 2) {
                                        class39.method268(true, var19, var20, class293.field4984, (short) 8, (long) var39, class254.method1772(new class62[] { class113.field1876, var40.field541 }, 0));
                                        class36.field492++;
                                    }
                                }
                                class39.method268(true, var19, var20, class17.field164, (short) 1006, (long) var39, class254.method1772(new class62[] { class113.field1876, var40.field541 }, 0));
                            } else if ((class141.field2271 & 0x1) == 1) {
                                class39.method268(true, var19, var20, class121.field2015, (short) 13, (long) var39, class254.method1772(new class62[] { class281.field4805, class236.field4061, var40.field541 }, 0));
                                class74.field1134++;
                            }
                        }
                    }
                }
            }
        }
        if (arg6 > -100) {
            field27 = -94L;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lmh;Z)I", line = 562)
    public static final int method13(class62 arg0, boolean arg1) {
        if (!arg1) {
            field27 = 71L;
        }
        field20++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class190.field3042; var2++) {
            if (arg0.method436(class294.field5022[var2], 32)) {
                return var2;
            }
        }
        return -1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field21[var0] = var1;
        }
        field23 = class201.method1405(true, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
        field25 = 0;
        field27 = 0L;
        field29 = class201.method1405(true, "(U (X");
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)Lmh;", line = 593)
    public static final class62 method14(int arg0, boolean arg1) {
        if (!arg1) {
            field29 = (class62) null;
        }
        field14++;
        return class244.field4151[arg0].method439(101) > 0 ? class254.method1772(new class62[] { class146.field2317[arg0], class113.field1872, class244.field4151[arg0] }, 0) : class146.field2317[arg0];
    }
}
