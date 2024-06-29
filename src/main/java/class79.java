import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class79 extends class55 {

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    private int field1109 = 0;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Z")
    public boolean field1113 = false;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Lkt;")
    public class158 field1110 = new class158();

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "Lkt;")
    private class158 field1116 = new class158();

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "Z")
    private boolean field1121 = false;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Lwr;")
    public class459 field1101;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "J")
    private long field1114;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Lpaa;")
    public class626 field1103;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lgq;")
    public class516 field1099;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Leia;")
    public class243 field1105;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Ljt;")
    public static class106 field1102 = new class106(50);

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    private int field1118;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Lvd;")
    public static class39 field1115;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1108;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 6)
    public static void method642(boolean arg0) {
        field1108 = null;
        field1115 = null;
        if (arg0) {
            field1108 = null;
        }
        field1102 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lha;IJ)V", line = 24)
    public final void method643(class60 arg0, int arg1, long arg2) {
        field1104++;
        for (class655 var5 = (class655) this.field1105.method1615((byte) 122); var5 != null; var5 = (class655) this.field1105.method1625(-28)) {
            var5.method3790(arg0, arg2);
        }
        if (arg1 > -24) {
            method642(true);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 47)
    public final void method644(int arg0) {
        this.field1110.field2518 = this.field1101.field6774;
        this.field1110.field2521 = this.field1101.field6776;
        this.field1110.field2526 = this.field1101.field6765;
        this.field1110.field2522 = this.field1101.field6758;
        this.field1110.field2530 = this.field1101.field6764;
        field1112++;
        this.field1110.field2527 = this.field1101.field6760;
        this.field1110.field2525 = this.field1101.field6761;
        this.field1110.field2519 = this.field1101.field6768;
        this.field1110.field2529 = this.field1101.field6772;
        if (arg0 < 72) {
            this.field1122 = -45;
        }
        if (this.field1110.field2527 == this.field1110.field2521 && this.field1110.field2529 == this.field1110.field2527 && this.field1110.field2530 == this.field1110.field2526 && this.field1110.field2526 == this.field1110.field2522 && this.field1110.field2519 == this.field1110.field2518 && this.field1110.field2525 == this.field1110.field2519) {
            this.field1121 = true;
        } else if (this.field1121) {
            this.field1121 = false;
            this.field1116.field2529 = this.field1110.field2529;
            this.field1116.field2521 = this.field1110.field2521;
            this.field1116.field2527 = this.field1110.field2527;
            this.field1116.field2525 = this.field1110.field2525;
            this.field1116.field2518 = this.field1110.field2518;
            this.field1116.field2526 = this.field1110.field2526;
            this.field1116.field2530 = this.field1110.field2530;
            this.field1116.field2519 = this.field1110.field2519;
            this.field1116.field2522 = this.field1110.field2522;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZILha;J)V", line = 87)
    public final void method645(boolean arg0, boolean arg1, int arg2, class60 arg3, long arg4) {
        if (this.field1113) {
            arg0 = false;
        } else if (class34.field352 < this.field1099.field7350) {
            arg0 = false;
        } else if (class637.field8950 > class574.field8111[class34.field352]) {
            arg0 = false;
        } else if (this.field1121) {
            arg0 = false;
        } else if (this.field1099.field7315 != -1) {
            int var7 = (int) (arg4 - this.field1114);
            if (this.field1099.field7358 || var7 <= this.field1099.field7315) {
                var7 %= this.field1099.field7315;
            } else {
                arg0 = false;
            }
            if (!this.field1099.field7327 && this.field1099.field7363 > var7) {
                arg0 = false;
            }
            if (this.field1099.field7327 && this.field1099.field7363 <= var7) {
                arg0 = false;
            }
        }
        field1098++;
        if (arg0) {
            class274.field3893++;
            int var8 = (this.field1110.field2521 - (-this.field1110.field2529 - this.field1110.field2527)) / 3;
            int var9 = (this.field1110.field2530 - (-this.field1110.field2526 - this.field1110.field2522)) / 3;
            int var10 = (this.field1110.field2525 + this.field1110.field2519 + this.field1110.field2518) / 3;
            if (this.field1110.field2520 != var8 || this.field1110.field2528 != var9 || this.field1110.field2516 != var10) {
                this.field1110.field2520 = var8;
                this.field1110.field2516 = var10;
                this.field1110.field2528 = var9;
                int var11 = this.field1110.field2527 - this.field1110.field2521;
                int var12 = this.field1110.field2526 - this.field1110.field2530;
                int var13 = this.field1110.field2519 - this.field1110.field2518;
                int var14 = this.field1110.field2529 - this.field1110.field2521;
                int var15 = this.field1110.field2522 - this.field1110.field2530;
                int var16 = this.field1110.field2525 - this.field1110.field2518;
                this.field1118 = var11 * var15 - (var12 * var14);
                this.field1117 = var13 * var14 - (var11 * var16);
                this.field1124 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field1124 <= 32767 && this.field1117 <= 32767 && this.field1118 <= 32767 && this.field1124 >= -32767 && this.field1117 >= -32767 && this.field1118 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field1118 * this.field1118 + this.field1124 * this.field1124 + this.field1117 * this.field1117));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field1117 = this.field1117 * 32767 / var17;
                        this.field1124 = this.field1124 * 32767 / var17;
                        this.field1118 = this.field1118 * 32767 / var17;
                        if (this.field1099.field7314 > 0 || this.field1099.field7333 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field1118, (double) this.field1124) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field1117, Math.sqrt((double) (this.field1124 * this.field1124 + this.field1118 * this.field1118))) * 2607.5945876176133D);
                            this.field1123 = this.field1099.field7314 - this.field1099.field7326;
                            this.field1119 = this.field1099.field7333 - this.field1099.field7323;
                            this.field1122 = this.field1099.field7326 + var18 - (this.field1123 >> 1);
                            this.field1120 = var19 + this.field1099.field7323 - (this.field1119 >> 1);
                        }
                        break;
                    }
                    this.field1118 >>= 0x1;
                    this.field1124 >>= 0x1;
                    this.field1117 >>= 0x1;
                }
            }
            this.field1109 += (int) ((double) arg2 * ((double) this.field1099.field7334 + Math.random() * (double) (this.field1099.field7371 - this.field1099.field7334)));
            if (this.field1109 > 63) {
                int var20 = this.field1109 >> 6;
                this.field1109 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1099.field7314 <= 0 && this.field1099.field7333 <= 0) {
                        var22 = this.field1117;
                        var23 = this.field1124;
                        var24 = this.field1118;
                    } else {
                        int var25 = this.field1122 + (int) (Math.random() * (double) this.field1123);
                        int var26 = var25 & 0x3FFF;
                        int var27 = class373.field5548[var26];
                        int var28 = class373.field5549[var26];
                        int var29 = (int) (Math.random() * (double) this.field1119) + this.field1120;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class373.field5548[var30];
                        int var32 = class373.field5549[var30];
                        byte var33 = 13;
                        var23 = var28 * var31 >> var33;
                        var22 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field1110.field2529 * var36 + (float) this.field1110.field2527 * var35 + (float) this.field1110.field2521 * var34);
                    int var38 = (int) ((float) this.field1110.field2522 * var36 + (float) this.field1110.field2530 * var34 + (float) this.field1110.field2526 * var35);
                    int var39 = (int) ((float) this.field1110.field2525 * var36 + (float) this.field1110.field2519 * var35 + (float) this.field1110.field2518 * var34);
                    int var40 = (int) ((float) this.field1116.field2529 * var36 + (float) this.field1116.field2527 * var35 + (float) this.field1116.field2521 * var34);
                    int var41 = (int) ((float) this.field1116.field2522 * var36 + (float) this.field1116.field2530 * var34 + (float) this.field1116.field2526 * var35);
                    int var42 = (int) ((float) this.field1116.field2525 * var36 + (float) this.field1116.field2519 * var35 + (float) this.field1116.field2518 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = (int) ((double) (this.field1099.field7319 - this.field1099.field7356) * Math.random()) + this.field1099.field7356;
                    int var50 = this.field1099.field7370 + ((int) (Math.random() * (double) (this.field1099.field7372 - this.field1099.field7370)));
                    int var51 = this.field1099.field7329 + ((int) (Math.random() * (double) (this.field1099.field7340 - this.field1099.field7329)));
                    int var52;
                    if (this.field1099.field7344) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field1099.field7337 * var53 + (double) this.field1099.field7307) | (int) ((double) this.field1099.field7347 * var53 + (double) this.field1099.field7349) << 8 | (int) ((double) this.field1099.field7330 * var53 + (double) this.field1099.field7354) << 16 | (int) ((double) this.field1099.field7317 + Math.random() * (double) this.field1099.field7367) << 24;
                    } else {
                        var52 = (int) ((double) this.field1099.field7317 + (double) this.field1099.field7367 * Math.random()) << 24 | (int) ((double) this.field1099.field7307 + (double) this.field1099.field7337 * Math.random()) | (int) (Math.random() * (double) this.field1099.field7347 + (double) this.field1099.field7349) << 8 | (int) ((double) this.field1099.field7330 * Math.random() + (double) this.field1099.field7354) << 16;
                    }
                    int var55 = this.field1099.field7380;
                    if (!arg3.method540() && !this.field1099.field7377) {
                        var55 = -1;
                    }
                    if (class627.field8774 == class103.field1437) {
                        new class655(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field1099.field7322, this.field1099.field7352);
                    } else {
                        class655 var57 = class514.field7296[class103.field1437];
                        class103.field1437 = class103.field1437 + 1 & 0x3FF;
                        var57.method3792(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field1099.field7322, this.field1099.field7352);
                    }
                }
            }
        }
        if (!this.field1110.method1162(this.field1116, (byte) -120)) {
            class158 var58 = this.field1116;
            this.field1116 = this.field1110;
            this.field1110 = var58;
            this.field1110.field2520 = this.field1116.field2520;
            this.field1110.field2521 = this.field1101.field6776;
            this.field1110.field2527 = this.field1101.field6760;
            this.field1110.field2516 = this.field1116.field2516;
            this.field1110.field2518 = this.field1101.field6774;
            this.field1110.field2529 = this.field1101.field6772;
            this.field1110.field2526 = this.field1101.field6765;
            this.field1110.field2519 = this.field1101.field6768;
            this.field1110.field2522 = this.field1101.field6758;
            this.field1110.field2525 = this.field1101.field6761;
            this.field1110.field2530 = this.field1101.field6764;
            this.field1110.field2528 = this.field1116.field2528;
        }
        this.field1107 = 0;
        if (arg1) {
            field1102 = null;
        }
        for (class655 var59 = (class655) this.field1105.method1615((byte) 59); var59 != null; var59 = (class655) this.field1105.method1625(-63)) {
            var59.method3793(arg4, arg2);
            this.field1107++;
        }
        class515.field7306 += this.field1107;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLfo;)Z", line = 349)
    public static final boolean method646(byte arg0, class519 arg1) {
        field1111++;
        if (arg0 <= 76) {
            field1108 = null;
        }
        if (arg1 == null) {
            return false;
        } else if (!arg1.field7446) {
            return false;
        } else if (!arg1.method3065(class84.field1176, -114)) {
            return false;
        } else if (class391.field5887.method2287((long) arg1.field7438, (byte) -117) == null) {
            return class382.field5761.method2287((long) arg1.field7412, (byte) -117) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lha;Lwr;Lpaa;J)V", line = 429)
    public class79(class60 arg0, class459 arg1, class626 arg2, long arg3) {
        this.field1101 = arg1;
        this.field1114 = arg3;
        this.field1103 = arg2;
        this.field1099 = this.field1101.method2804(-28777);
        if (!arg0.method540() && this.field1099.field7359 != -1) {
            this.field1099 = class234.method1559(this.field1099.field7359, 64);
        }
        this.field1105 = new class243();
        this.field1109 = (int) ((double) this.field1109 + Math.random() * 64.0D);
        this.method644(98);
        this.field1116.field2529 = this.field1110.field2529;
        this.field1116.field2519 = this.field1110.field2519;
        this.field1116.field2530 = this.field1110.field2530;
        this.field1116.field2518 = this.field1110.field2518;
        this.field1116.field2526 = this.field1110.field2526;
        this.field1116.field2527 = this.field1110.field2527;
        this.field1116.field2522 = this.field1110.field2522;
        this.field1116.field2521 = this.field1110.field2521;
        this.field1116.field2525 = this.field1110.field2525;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)V", line = 385)
    public static final void method647(boolean arg0, byte arg1) {
        if (class311.field4401 == null) {
            class537.method3156(1914161577);
        }
        field1106++;
        if (arg0) {
            class311.field4401.method3370(10939);
        }
        if (arg1 >= -12) {
            method647(true, (byte) 123);
        }
    }
}
