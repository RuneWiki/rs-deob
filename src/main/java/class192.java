import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class192 extends class159 {

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "Luaa;")
    private class127 field2486;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "Llf;")
    private class250 field2483;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "Lbja;")
    private class34 field2488;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    private int field2501;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    private int field2489;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "[[F")
    private float[][] field2507;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "[[F")
    private float[][] field2494;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "[[F")
    private float[][] field2503;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    private int field2506;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "Ldt;")
    private class254 field2499;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "Luba;")
    private class453 field2492;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "Ltca;")
    private class184 field2505;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "Lvv;")
    private class343 field2498;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "Lot;")
    private class615 field2497;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Lut;")
    private class135 field2490;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "Lut;")
    private class135 field2491;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "Lmw;")
    public static class517 field2496 = new class517(26, 4);

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "Lqia;")
    public static class23 field2500;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1270(byte arg0) {
        field2487++;
        class389.field5637 = class560.field7678.method1691(92);
        boolean var1 = class560.field7678.method1676(255) == 1;
        int var2 = class560.field7678.method1731((byte) 64);
        int var3 = class560.field7678.method1703((byte) 103);
        int var4 = class560.field7678.method1703((byte) 73);
        class176.method1210((byte) -20);
        class394.method2422(var2, -2);
        class560.field7678.method2722(-109);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var21 = 0; var21 < (class102.field1467 >> 3); var21++) {
                for (int var22 = 0; var22 < (class393.field5663 >> 3); var22++) {
                    int var23 = class560.field7678.method2721(1, 1);
                    if (var23 == 1) {
                        class199.field2587[var5][var21][var22] = class560.field7678.method2721(26, 1);
                    } else {
                        class199.field2587[var5][var21][var22] = -1;
                    }
                }
            }
        }
        class560.field7678.method2717((byte) -84);
        int var6 = (class442.field6366 - class560.field7678.field3725) / 16;
        class92.field1289 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var20 = 0; var20 < 4; var20++) {
                class92.field1289[var7][var20] = class560.field7678.method1672(-16516);
            }
        }
        class238.field3158 = new int[var6];
        class649.field8753 = new int[var6];
        class328.field4651 = new byte[var6][];
        class592.field8095 = new int[var6];
        class754.field10206 = new byte[var6][];
        class168.field2216 = new byte[var6][];
        class294.field4168 = new byte[var6][];
        class550.field7592 = null;
        int var8 = 74 / ((arg0 - 15) / 44);
        class639.field8603 = new int[var6];
        class542.field7496 = new int[var6];
        class361.field5245 = null;
        int var9 = 0;
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < (class102.field1467 >> 3); var11++) {
                for (int var12 = 0; var12 < class393.field5663 >> 3; var12++) {
                    int var13 = class199.field2587[var10][var11][var12];
                    if (var13 != -1) {
                        int var14 = (var13 & 0xFFCCE9) >> 14;
                        int var15 = var13 >> 3 & 0x7FF;
                        int var16 = (var14 / 8 << 8) + var15 / 8;
                        for (int var17 = 0; var17 < var9; var17++) {
                            if (class649.field8753[var17] == var16) {
                                var16 = -1;
                                break;
                            }
                        }
                        if (var16 != -1) {
                            class649.field8753[var9] = var16;
                            int var18 = (var16 & 0xFF1D) >> 8;
                            int var19 = var16 & 0xFF;
                            class592.field8095[var9] = class577.field7862.method1173(false, "m" + var18 + "_" + var19);
                            class238.field3158[var9] = class577.field7862.method1173(false, "l" + var18 + "_" + var19);
                            class542.field7496[var9] = class577.field7862.method1173(false, "um" + var18 + "_" + var19);
                            class639.field8603[var9] = class577.field7862.method1173(false, "ul" + var18 + "_" + var19);
                            var9++;
                        }
                    }
                }
            }
        }
        class775.method4264((byte) -87, var3, var1, var4, 11);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII[[Z)V", line = 161)
    public final void method1271(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field2495++;
        if (this.field2498 == null || this.field2501 > arg0 + arg1 || this.field2493 < (arg0 - arg1) || arg1 + arg2 < this.field2482 || this.field2489 < arg2 - arg1) {
            return;
        }
        int var6 = -106 / ((arg3 - 61) / 47);
        for (int var7 = this.field2482; var7 <= this.field2489; var7++) {
            for (int var8 = this.field2501; var8 <= this.field2493; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg2;
                if (-arg1 < var9 && arg1 > var9 && var10 > (-arg1) && var10 < arg1 && arg4[var9 + arg1][arg1 + var10]) {
                    this.field2483.method1624(5634, (int) (this.field2486.method902(0) * 255.0F) << 24);
                    this.field2483.method1634(null, this.field2490, this.field2491, null, (byte) 11);
                    this.field2483.method1568(false, 0, 4, this.field2506, this.field2498);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;", line = 218)
    public static final Class method1272(String arg0, byte arg1) throws ClassNotFoundException {
        field2504++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg1 > -15) {
                method1276(114);
            }
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BS)V", line = 267)
    private final void method1273(byte arg0, short arg1) {
        if (this.field2483.field3561) {
            this.field2499.method1733(arg1, -32466);
        } else {
            this.field2499.method1719(124, arg1);
        }
        field2484++;
        if (arg0 > -127) {
            this.field2497 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V", line = 286)
    public static final void method1274(int arg0, int arg1) {
        field2485++;
        if (arg1 != 1) {
            method1276(-83);
        }
        class778 var2 = class389.method2406(arg1 ^ 0xFFFFFF9B, (long) arg0, 17);
        var2.method4276(arg1 - 1);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIII)V", line = 300)
    private final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2502++;
        long var8 = -1L;
        int var10 = (arg4 << this.field2488.field4179) + arg2;
        int var11 = arg1 + (arg3 << this.field2488.field4179);
        int var12 = this.field2488.method1895(var10, var11, 60);
        if ((arg2 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class159 var13 = this.field2505.method1248(121, var8);
            if (var13 != null) {
                this.method1273((byte) -128, ((class603) var13).field8189);
                return;
            }
        }
        short var14 = (short) (this.field2508++);
        if (var8 != -1L) {
            this.field2505.method1247(4070, var8, new class603(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg1 == 0) {
            var15 = this.field2503[arg5][arg0];
            var16 = this.field2507[arg5][arg0];
            var17 = this.field2494[arg5][arg0];
        } else if (this.field2488.field4177 == arg2 && arg1 == 0) {
            var15 = this.field2503[arg5 + 1][arg0];
            var16 = this.field2507[arg5 + 1][arg0];
            var17 = this.field2494[arg5 + 1][arg0];
        } else if (this.field2488.field4177 == arg2 && this.field2488.field4177 == arg1) {
            var16 = this.field2507[arg5 + 1][arg0 + 1];
            var17 = this.field2494[arg5 + 1][arg0 + 1];
            var15 = this.field2503[arg5 + 1][arg0 + 1];
        } else if (arg2 == 0 && this.field2488.field4177 == arg1) {
            var15 = this.field2503[arg5][arg0 + 1];
            var16 = this.field2507[arg5][arg0 + 1];
            var17 = this.field2494[arg5][arg0 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field2488.field4177;
            float var19 = (float) arg1 / (float) this.field2488.field4177;
            float var20 = this.field2503[arg5][arg0];
            float var21 = this.field2507[arg5][arg0];
            float var22 = this.field2494[arg5][arg0];
            float var23 = this.field2503[arg5 + 1][arg0];
            float var24 = this.field2507[arg5 + 1][arg0];
            float var25 = (this.field2503[arg5][arg0 + 1] - var20) * var18 + var20;
            float var26 = (this.field2503[arg5 + 1][arg0 + 1] - var23) * var18 + var23;
            float var27 = this.field2494[arg5 + 1][arg0];
            float var28 = (this.field2507[arg5 + 1][arg0 + 1] - var24) * var18 + var24;
            float var29 = (this.field2494[arg5][arg0 + 1] - var22) * var18 + var22;
            float var30 = (this.field2507[arg5][arg0 + 1] - var21) * var18 + var21;
            float var31 = (this.field2494[arg5 + 1][arg0 + 1] - var27) * var18 + var27;
            var15 = (var26 - var25) * var19 + var25;
            var16 = (var28 - var30) * var19 + var30;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field2486.method899(true) - var10);
        float var33 = (float) (this.field2486.method904(127) - var12);
        float var34 = (float) (this.field2486.method901((byte) -115) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        int var40 = -96 / ((arg6 + 75) / 51);
        float var41 = var35 / (float) this.field2486.method903((byte) -122);
        float var42 = 1.0F - var41 * var41;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field2486.method898(-85);
        int var46 = (int) ((float) ((var45 & 0xFF2D80) >> 16) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) ((var45 & 0xFF21) >> 8) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (var48 > 255) {
            var48 = 255;
        }
        if (this.field2483.field3561) {
            this.field2492.method2692(-126, (float) var10);
            this.field2492.method2692(-88, (float) var12);
            this.field2492.method2692(-80, (float) var11);
        } else {
            this.field2492.method2693((float) var10, -1001058736);
            this.field2492.method2693((float) var12, -1001058736);
            this.field2492.method2693((float) var11, -1001058736);
        }
        this.field2492.method1725(var46, 31);
        this.field2492.method1725(var47, 87);
        this.field2492.method1725(var48, 121);
        this.field2492.method1725(255, 112);
        this.method1273((byte) -128, var14);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 478)
    public static void method1276(int arg0) {
        field2496 = null;
        field2500 = null;
        if (arg0 != 27199) {
            method1274(-96, 53);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Llf;Lbja;Luaa;[I)V", line = 488)
    public class192(class250 arg0, class34 arg1, class127 arg2, int[] arg3) {
        this.field2486 = arg2;
        this.field2483 = arg0;
        this.field2488 = arg1;
        int var5 = this.field2486.method903((byte) -115) - (arg1.field4177 >> 1);
        this.field2501 = this.field2486.method899(true) - var5 >> arg1.field4179;
        this.field2493 = this.field2486.method899(true) + var5 >> arg1.field4179;
        this.field2482 = this.field2486.method901((byte) -115) - var5 >> arg1.field4179;
        this.field2489 = var5 + this.field2486.method901((byte) -115) >> arg1.field4179;
        int var6 = this.field2493 + 1 - this.field2501;
        int var7 = this.field2489 + 1 - this.field2482;
        this.field2507 = new float[var6 + 1][var7 + 1];
        this.field2494 = new float[var6 + 1][var7 + 1];
        this.field2503 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field2482;
            if (var25 > 0 && var25 < (this.field2488.field4173 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field2501 + var26;
                    if (var27 > 0 && this.field2488.field4174 - 1 > var27) {
                        int var28 = arg1.method1898(var25, var27 + 1, (byte) -98) - arg1.method1898(var25, var27 - 1, (byte) -128);
                        int var29 = arg1.method1898(var25 + 1, var27, (byte) -115) - arg1.method1898(var25 - 1, var27, (byte) -123);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 - (-(var29 * var29) - 65536))));
                        this.field2503[var26][var8] = (float) var28 * var30;
                        this.field2507[var26][var8] = var30 * -256.0F;
                        this.field2494[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2482; var10 <= this.field2489; var10++) {
            if (var10 >= 0 && var10 < arg1.field4173) {
                for (int var21 = this.field2501; var21 <= this.field2493; var21++) {
                    if (var21 >= 0 && arg1.field4174 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field342[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field2506 += 3;
                                    }
                                }
                            } else {
                                this.field2506 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2493 - this.field2501;
            }
        }
        if (this.field2506 > 0) {
            this.field2499 = new class254(this.field2506 * 2);
            this.field2492 = new class453(this.field2506 * 16);
            this.field2505 = new class184(class8.method45(23714, this.field2506));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field2482; var13 <= this.field2489; var13++) {
                if (var13 >= 0 && var13 < arg1.field4173) {
                    int var14 = 0;
                    for (int var15 = this.field2501; var15 <= this.field2493; var15++) {
                        if (var15 >= 0 && var15 < arg1.field4174) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field342[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field347[var15][var13];
                                    int[] var19 = arg1.field324[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1275(var12, var19[var20], var18[var20], var13, var15, var14, -13);
                                                var20++;
                                                this.method1275(var12, var19[var20], var18[var20], var13, var15, var14, 94);
                                                var20++;
                                                this.method1275(var12, var19[var20], var18[var20], var13, var15, var14, 30);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1275(var12, 0, 0, var13, var15, var14, 98);
                                    this.method1275(var12, 0, arg1.field4177, var13, var15, var14, -127);
                                    this.method1275(var12, arg1.field4177, 0, var13, var15, var14, -126);
                                } else if (var16 == 2) {
                                    this.method1275(var12, 0, arg1.field4177, var13, var15, var14, -128);
                                    this.method1275(var12, arg1.field4177, arg1.field4177, var13, var15, var14, 54);
                                    this.method1275(var12, 0, 0, var13, var15, var14, 100);
                                } else if (var16 == 5) {
                                    this.method1275(var12, arg1.field4177, arg1.field4177, var13, var15, var14, 29);
                                    this.method1275(var12, arg1.field4177, 0, var13, var15, var14, -127);
                                    this.method1275(var12, 0, arg1.field4177, var13, var15, var14, 93);
                                } else if (var16 == 4) {
                                    this.method1275(var12, arg1.field4177, 0, var13, var15, var14, 87);
                                    this.method1275(var12, 0, 0, var13, var15, var14, 52);
                                    this.method1275(var12, arg1.field4177, arg1.field4177, var13, var15, var14, -127);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field2493 - this.field2501;
                }
                var12++;
            }
            this.field2498 = this.field2483.method1615(this.field2499.field3789, 5123, false, 0, this.field2499.field3725);
            this.field2497 = this.field2483.method1578((byte) 61, this.field2492.field3725, false, this.field2492.field3789, 16);
            this.field2490 = new class135(this.field2497, 5126, 3, 0);
            this.field2491 = new class135(this.field2497, 5121, 4, 12);
        } else {
            this.field2497 = null;
            this.field2498 = null;
            this.field2490 = null;
            this.field2491 = null;
        }
        this.field2492 = null;
        this.field2503 = this.field2507 = this.field2494 = null;
        this.field2499 = null;
        this.field2505 = null;
    }
}
