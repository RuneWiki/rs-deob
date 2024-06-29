import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 extends class12 {

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    private int field2453 = 1;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    private int field2462 = 1;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field2459 = 1;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Ltg;")
    private static class184 field2458 = method812("Please use a different world)3", 3);

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "Ltg;")
    public static class184 field2450 = field2458;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "[Ltg;")
    public static class184[] field2460 = new class184[1000];

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "Ltg;")
    public static class184 field2467 = field2458;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "Lvb;")
    public static class197 field2451;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            this.method59((class97) null, 112, true);
        }
        ++field2449;
        int[] var3 = super.field224.method7((byte) 86, arg0);
        if (super.field224.field53) {
            int var4 = this.field2462 - -1 + this.field2462;
            int var5 = this.field2453 + this.field2453 + 1;
            int[][] var6 = new int[var4][];
            for (int var7 = -this.field2462 + arg0; this.field2462 + arg0 >= var7; ++var7) {
                int[] var11 = this.method77(0, var7 & class173.field3274, arg1 ^ -106);
                int var12 = 0;
                int[] var13 = new int[class201.field3889];
                for (int var14 = -this.field2453; ~var14 >= ~this.field2453; ++var14) {
                    var12 += var11[class51.field937 & var14];
                }
                int var15 = 0;
                while (class201.field3889 > var15) {
                    var13[var15] = var12 / var5;
                    int var16 = var12 - var11[class51.field937 & var15 - this.field2453];
                    ++var15;
                    var12 = var11[this.field2453 + var15 & class51.field937] + var16;
                }
                var6[var7 - -this.field2462 + -arg0] = var13;
            }
            for (int var8 = 0; ~var8 > ~class201.field3889; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var4 < ~var10; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field2452;
        int var3 = 45 / ((-58 - arg1) / 34);
        int[][] var4 = super.field232.method673(arg0, 98);
        if (super.field232.field1962) {
            int var5 = this.field2462 + this.field2462 + 1;
            int var6 = this.field2453 + this.field2453 + 1;
            int[][][] var7 = new int[var5][][];
            for (int var8 = -this.field2462 + arg0; ~(this.field2462 + arg0) <= ~var8; ++var8) {
                int[][] var18 = this.method76(class173.field3274 & var8, 6218, 0);
                int var19 = 0;
                int[][] var20 = new int[3][class201.field3889];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var18[0];
                int[] var24 = var18[1];
                int[] var25 = var18[2];
                for (int var26 = -this.field2453; ~this.field2453 <= ~var26; ++var26) {
                    int var36 = var26 & class51.field937;
                    var21 += var23[var36];
                    var22 += var25[var36];
                    var19 += var24[var36];
                }
                int[] var27 = var20[0];
                int[] var28 = var20[1];
                int[] var29 = var20[2];
                int var30 = 0;
                while (~class201.field3889 < ~var30) {
                    var27[var30] = var21 / var6;
                    var28[var30] = var19 / var6;
                    var29[var30] = var22 / var6;
                    int var31 = class51.field937 & -this.field2453 + var30;
                    int var32 = var22 - var25[var31];
                    ++var30;
                    int var33 = var21 - var23[var31];
                    int var34 = var19 - var24[var31];
                    int var35 = class51.field937 & this.field2453 + var30;
                    var22 = var25[var35] + var32;
                    var21 = var23[var35] + var33;
                    var19 = var24[var35] + var34;
                }
                var7[this.field2462 + var8 - arg0] = var20;
            }
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class201.field3889 > var12; ++var12) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 0; var5 > var16; ++var16) {
                    int[][] var17 = var7[var16];
                    var14 += var17[1][var12];
                    var15 += var17[2][var12];
                    var13 += var17[0][var12];
                }
                var9[var12] = var13 / var5;
                var10[var12] = var14 / var5;
                var11[var12] = var15 / var5;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static final void method811(int arg0) {
        ++field2465;
        if (class180.field3435 != null) {
            class180.field3435.method515(-128);
            class180.field3435 = null;
        }
        class11.method71((byte) 125);
        class186.method1180();
        for (int var1 = 0; var1 < 4; ++var1) {
            class159.field2883[var1].method379((byte) -67);
        }
        System.gc();
        class120.method724((byte) 125, 2);
        class7.field131 = -1;
        int var2 = 31 % ((35 - arg0) / 38);
        class159.field2856 = false;
        class3.method13(1);
        class161.method972(10, (byte) 126);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)Ltg;")
    public static final class184 method812(String arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            byte[] var2 = arg0.getBytes();
            int var3 = var2.length;
            ++field2457;
            class184 var4 = new class184();
            int var5 = 0;
            var4.field3527 = new byte[var3];
            while (var5 < var3) {
                int var6 = 255 & var2[var5++];
                if (var6 <= 45 && var6 >= 40) {
                    if (~var3 >= ~var5) {
                        break;
                    }
                    int var7 = var2[var5++] & 255;
                    var4.field3527[var4.field3555++] = (byte) ((var6 - 40) * 43 + var7 + -48);
                } else if (~var6 != -1) {
                    var4.field3527[var4.field3555++] = (byte) var6;
                }
            }
            var4.method1164(arg1 ^ -6328);
            return var4.method1136((byte) 108);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)I")
    public static final int method813(int arg0, int arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        ++field2461;
        int var3 = arg0 * arg1 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class135() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static void method814(int arg0) {
        field2451 = null;
        field2458 = null;
        if (arg0 < 32) {
            field2458 = null;
        }
        field2450 = null;
        field2467 = null;
        field2460 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field211 = ~arg0.method588((byte) -69) == -2;
                }
            } else {
                this.field2462 = arg0.method588((byte) -98);
            }
        } else {
            this.field2453 = arg0.method588((byte) -78);
        }
        if (arg2) {
            method817(-118, -121);
        }
        ++field2456;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
    public static final void method815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2447;
        long var6 = class21.method131(arg0, arg4, arg3);
        if (~var6 != -1L) {
            int var8 = 3 & (int) var6 >> 20;
            int var9 = (int) var6 >> 14 & 31;
            int[] var10 = class129.field2330.field2493;
            int var11 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
            int var12 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var13 = arg5;
            class58 var14 = class14.method88(-115, var12);
            if (var6 > 0L) {
                var13 = arg1;
            }
            if (var14.field1085 != -1) {
                class171 var15 = class202.field3896[var14.field1085];
                if (var15 != null) {
                    int var16 = (var14.field1027 * 4 + -var15.field3246) / 2;
                    int var17 = (var14.field1084 * 4 + -var15.field3250) / 2;
                    var15.method1062(arg4 * 4 + 48 + var16, (-var14.field1084 + 104 - arg3) * 4 - -var17 + 48);
                }
            } else {
                if (~var9 == -1 || ~var9 == -3) {
                    if (var8 == 0) {
                        var10[var11] = var13;
                        var10[var11 - -512] = var13;
                        var10[var11 + 1024] = var13;
                        var10[var11 + 1536] = var13;
                    } else if (var8 != 1) {
                        if (~var8 == -3) {
                            var10[var11 + 3] = var13;
                            var10[var11 + 3 + 512] = var13;
                            var10[var11 + 1024 - -3] = var13;
                            var10[var11 + 1536 + 3] = var13;
                        } else if (~var8 == -4) {
                            var10[var11 + 1536] = var13;
                            var10[var11 + 1536 + 1] = var13;
                            var10[var11 + 1536 + 2] = var13;
                            var10[var11 + 1539] = var13;
                        }
                    } else {
                        var10[var11] = var13;
                        var10[var11 - -1] = var13;
                        var10[var11 - -2] = var13;
                        var10[var11 + 3] = var13;
                    }
                }
                if (~var9 == -4) {
                    if (var8 != 0) {
                        if (var8 == 1) {
                            var10[var11 - -3] = var13;
                        } else if (~var8 == -3) {
                            var10[var11 + 3 + 1536] = var13;
                        } else if (var8 == 3) {
                            var10[var11 + 1536] = var13;
                        }
                    } else {
                        var10[var11] = var13;
                    }
                }
                if (~var9 == -3) {
                    if (~var8 == -4) {
                        var10[var11] = var13;
                        var10[var11 + 512] = var13;
                        var10[var11 - -1024] = var13;
                        var10[var11 + 1536] = var13;
                    } else if (var8 == 0) {
                        var10[var11] = var13;
                        var10[var11 + 1] = var13;
                        var10[var11 - -2] = var13;
                        var10[var11 + 3] = var13;
                    } else if (var8 == 1) {
                        var10[var11 + 3] = var13;
                        var10[var11 + 515] = var13;
                        var10[var11 + 1024 - -3] = var13;
                        var10[var11 + 1536 + 3] = var13;
                    } else if (var8 == 2) {
                        var10[var11 + 1536] = var13;
                        var10[var11 + 1537] = var13;
                        var10[var11 + 1538] = var13;
                        var10[var11 - -3 + 1536] = var13;
                    }
                }
            }
        }
        long var18 = class117.method713(arg0, arg4, arg3);
        if ((long) arg2 != var18) {
            int var20 = 3 & (int) var18 >> 20;
            int var21 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            int var22 = ((int) var18 & 509540) >> 14;
            class58 var23 = class14.method88(23, var21);
            if (var23.field1085 == -1) {
                if (~var22 == -10) {
                    int var24 = 15658734;
                    int[] var25 = class129.field2330.field2493;
                    if (var18 > 0L) {
                        var24 = 15597568;
                    }
                    int var26 = (-(arg3 * 512) + 52736) * 4 + arg4 * 4 + 24624;
                    if (var20 != 0 && var20 != 2) {
                        var25[var26] = var24;
                        var25[var26 + 512 + 1] = var24;
                        var25[var26 + 1024 - -2] = var24;
                        var25[var26 + 3 + 1536] = var24;
                    } else {
                        var25[var26 + 1536] = var24;
                        var25[var26 + 1 + 1024] = var24;
                        var25[var26 + 512 + 2] = var24;
                        var25[var26 + 3] = var24;
                    }
                }
            } else {
                class171 var27 = class202.field3896[var23.field1085];
                if (var27 != null) {
                    int var28 = (var23.field1027 * 4 + -var27.field3246) / 2;
                    int var29 = (var23.field1084 * 4 - var27.field3250) / 2;
                    var27.method1062(arg4 * 4 + 48 + var28, (-arg3 + 104 + -var23.field1084) * 4 + var29 + 48);
                }
            }
        }
        long var30 = class52.method286(arg0, arg4, arg3);
        if (~var30 != -1L) {
            int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
            class58 var33 = class14.method88(39, var32);
            if (var33.field1085 != -1) {
                class171 var34 = class202.field3896[var33.field1085];
                if (var34 != null) {
                    int var35 = (var33.field1027 * 4 + -var34.field3246) / 2;
                    int var36 = (var33.field1084 * 4 + -var34.field3250) / 2;
                    var34.method1062(arg4 * 4 - -var35 + 48, (-var33.field1084 + -arg3 + 104) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Laf;")
    public static final class7 method816(int arg0, int arg1, int arg2, int arg3) {
        ++field2466;
        class7 var4 = new class7();
        var4.field119 = arg2;
        var4.field130 = arg0;
        class134.field2436.method55((byte) -74, var4, (long) arg1);
        class154.method934(-51, arg2);
        class190.method1216(-61, arg2);
        class167 var5 = class44.method255(arg1, 10583);
        if (arg3 != 2) {
            method812((String) null, 32);
        }
        if (var5 != null) {
            class57.method305(arg3 ^ -113, var5);
        }
        if (class50.field925 != null) {
            class57.method305(-128, class50.field925);
            class50.field925 = null;
        }
        class170.field3244 = false;
        class133.field2404 = 0;
        class74.method439(arg3 ^ 31092, class67.field1302, class113.field2043, class125.field2256, class52.field955);
        if (class110.field1986 != -1) {
            class185.method1173(1, 78, class110.field1986);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)V")
    public static final void method817(int arg0, int arg1) {
        ++field2463;
        if (arg1 != -1) {
            if (class59.field1104[arg1]) {
                class119.field2151.method1260(109, arg1);
                if (class149.field2670[arg1] != null) {
                    boolean var2 = true;
                    if (arg0 != -61440) {
                        method814(90);
                    }
                    for (int var3 = 0; ~class149.field2670[arg1].length < ~var3; ++var3) {
                        if (class149.field2670[arg1][var3] != null) {
                            if (~class149.field2670[arg1][var3].field3061 != -3) {
                                class149.field2670[arg1][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }
                    if (var2) {
                        class149.field2670[arg1] = null;
                    }
                    class59.field1104[arg1] = false;
                }
            }
        }
    }
}
