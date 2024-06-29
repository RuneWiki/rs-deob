import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class376 extends class670 {

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    private int field5260 = 0;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "Z")
    public boolean field5271 = false;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Luia;")
    public class362 field5268 = new class362();

    @OriginalMember(owner = "client!at", name = "v", descriptor = "Luia;")
    private class362 field5275 = new class362();

    @OriginalMember(owner = "client!at", name = "D", descriptor = "Z")
    private boolean field5283 = false;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "J")
    private long field5263;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Lur;")
    public class537 field5266;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lde;")
    public class531 field5269;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "Lef;")
    public class487 field5264;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "Leh;")
    public class360 field5274;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "Lrb;")
    public static class352 field5272 = new class352("", 12);

    @OriginalMember(owner = "client!at", name = "E", descriptor = "Lqfa;")
    public static class98 field5284 = new class98(91, 6);

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    private int field5281;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    private int field5282;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "[[B")
    public static byte[][] field5273;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBII)I", line = 6)
    public static final int method2359(int arg0, byte arg1, int arg2, int arg3) {
        field5259++;
        if (arg1 != 107) {
            method2362((char) 65470, -59, (byte) -108);
        }
        if ((class651.field8948[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class651.field8948[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lha;Lde;Lur;J)V", line = 419)
    public class376(class58 arg0, class531 arg1, class537 arg2, long arg3) {
        this.field5263 = arg3;
        this.field5266 = arg2;
        this.field5269 = arg1;
        this.field5264 = this.field5269.method3098(24844);
        if (!arg0.method392() && this.field5264.field6863 != -1) {
            this.field5264 = class488.method2915(this.field5264.field6863, true);
        }
        this.field5274 = new class360();
        this.field5260 = (int) ((double) this.field5260 + Math.random() * 64.0D);
        this.method2360((byte) -115);
        this.field5275.field5139 = this.field5268.field5139;
        this.field5275.field5129 = this.field5268.field5129;
        this.field5275.field5132 = this.field5268.field5132;
        this.field5275.field5127 = this.field5268.field5127;
        this.field5275.field5134 = this.field5268.field5134;
        this.field5275.field5142 = this.field5268.field5142;
        this.field5275.field5136 = this.field5268.field5136;
        this.field5275.field5137 = this.field5268.field5137;
        this.field5275.field5140 = this.field5268.field5140;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 37)
    public final void method2360(byte arg0) {
        this.field5268.field5129 = this.field5269.field7478;
        field5270++;
        this.field5268.field5140 = this.field5269.field7490;
        this.field5268.field5127 = this.field5269.field7485;
        this.field5268.field5136 = this.field5269.field7495;
        this.field5268.field5137 = this.field5269.field7491;
        if (arg0 >= -96) {
            return;
        }
        this.field5268.field5132 = this.field5269.field7479;
        this.field5268.field5134 = this.field5269.field7477;
        this.field5268.field5139 = this.field5269.field7488;
        this.field5268.field5142 = this.field5269.field7480;
        if (this.field5268.field5140 == this.field5268.field5129 && this.field5268.field5140 == this.field5268.field5139 && this.field5268.field5142 == this.field5268.field5127 && this.field5268.field5142 == this.field5268.field5136 && this.field5268.field5137 == this.field5268.field5132 && this.field5268.field5134 == this.field5268.field5132) {
            this.field5283 = true;
        } else if (this.field5283) {
            this.field5275.field5134 = this.field5268.field5134;
            this.field5275.field5140 = this.field5268.field5140;
            this.field5275.field5137 = this.field5268.field5137;
            this.field5275.field5142 = this.field5268.field5142;
            this.field5275.field5132 = this.field5268.field5132;
            this.field5283 = false;
            this.field5275.field5136 = this.field5268.field5136;
            this.field5275.field5139 = this.field5268.field5139;
            this.field5275.field5129 = this.field5268.field5129;
            this.field5275.field5127 = this.field5268.field5127;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(JLha;Z)V", line = 79)
    public final void method2361(long arg0, class58 arg1, boolean arg2) {
        if (!arg2) {
            this.field5264 = null;
        }
        for (class259 var5 = (class259) this.field5274.method2301(-31182); var5 != null; var5 = (class259) this.field5274.method2310(37)) {
            var5.method1699(arg1, arg0);
        }
        field5265++;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(CIB)I", line = 98)
    public static final int method2362(char arg0, int arg1, byte arg2) {
        field5267++;
        if (arg2 >= -44) {
            method2362((char) 65504, 123, (byte) -22);
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lha;BZJI)V", line = 129)
    public final void method2363(class58 arg0, byte arg1, boolean arg2, long arg3, int arg4) {
        if (this.field5271) {
            arg2 = false;
        } else if (class530.field7471 < this.field5264.field6821) {
            arg2 = false;
        } else if (class70.field888 > class355.field5063[class530.field7471]) {
            arg2 = false;
        } else if (this.field5283) {
            arg2 = false;
        } else if (this.field5264.field6871 != -1) {
            int var7 = (int) (arg3 - this.field5263);
            if (this.field5264.field6851 || this.field5264.field6871 >= var7) {
                var7 %= this.field5264.field6871;
            } else {
                arg2 = false;
            }
            if (!this.field5264.field6872 && this.field5264.field6877 > var7) {
                arg2 = false;
            }
            if (this.field5264.field6872 && this.field5264.field6877 <= var7) {
                arg2 = false;
            }
        }
        field5261++;
        if (arg2) {
            class140.field2022++;
            int var8 = (this.field5268.field5139 + this.field5268.field5129 + this.field5268.field5140) / 3;
            int var9 = (this.field5268.field5136 + this.field5268.field5127 + this.field5268.field5142) / 3;
            int var10 = (this.field5268.field5137 + this.field5268.field5132 + this.field5268.field5134) / 3;
            if (this.field5268.field5131 != var8 || this.field5268.field5133 != var9 || this.field5268.field5141 != var10) {
                this.field5268.field5131 = var8;
                this.field5268.field5141 = var10;
                this.field5268.field5133 = var9;
                int var11 = this.field5268.field5140 - this.field5268.field5129;
                int var12 = this.field5268.field5142 - this.field5268.field5127;
                int var13 = this.field5268.field5132 - this.field5268.field5137;
                int var14 = this.field5268.field5139 - this.field5268.field5129;
                int var15 = this.field5268.field5136 - this.field5268.field5127;
                int var16 = this.field5268.field5134 - this.field5268.field5137;
                this.field5277 = var13 * var14 - (var11 * var16);
                this.field5276 = var11 * var15 - (var12 * var14);
                this.field5282 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field5282 <= 32767 && this.field5277 <= 32767 && this.field5276 <= 32767 && this.field5282 >= -32767 && this.field5277 >= -32767 && this.field5276 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field5276 * this.field5276 + (this.field5282 * this.field5282 + (this.field5277 * this.field5277))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field5277 = this.field5277 * 32767 / var17;
                        this.field5276 = this.field5276 * 32767 / var17;
                        this.field5282 = this.field5282 * 32767 / var17;
                        if (this.field5264.field6856 > 0 || this.field5264.field6854 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field5276, (double) this.field5282) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field5277, Math.sqrt((double) (this.field5282 * this.field5282 + this.field5276 * this.field5276))) * 2607.5945876176133D);
                            this.field5278 = this.field5264.field6856 - this.field5264.field6838;
                            this.field5281 = var18 + this.field5264.field6838 - (this.field5278 >> 1);
                            this.field5279 = this.field5264.field6854 - this.field5264.field6866;
                            this.field5280 = this.field5264.field6866 + var19 - (this.field5279 >> 1);
                        }
                        break;
                    }
                    this.field5276 >>= 0x1;
                    this.field5282 >>= 0x1;
                    this.field5277 >>= 0x1;
                }
            }
            this.field5260 += (int) ((Math.random() * (double) (this.field5264.field6859 - this.field5264.field6832) + (double) this.field5264.field6832) * (double) arg4);
            if (this.field5260 > 63) {
                int var20 = this.field5260 >> 6;
                this.field5260 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field5264.field6856 <= 0 && this.field5264.field6854 <= 0) {
                        var22 = this.field5276;
                        var23 = this.field5277;
                        var24 = this.field5282;
                    } else {
                        int var25 = (int) ((double) this.field5278 * Math.random()) + this.field5281;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class164.field2258[var26];
                        int var28 = class164.field2252[var26];
                        int var29 = (int) (Math.random() * (double) this.field5279) + this.field5280;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class164.field2258[var30];
                        int var32 = class164.field2252[var30];
                        byte var33 = 13;
                        var24 = var28 * var31 >> var33;
                        var23 = (var32 << 1) * -1;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var35 - var34;
                    int var37 = (int) ((float) this.field5268.field5139 * var36 + (float) this.field5268.field5140 * var35 + (float) this.field5268.field5129 * var34);
                    int var38 = (int) ((float) this.field5268.field5136 * var36 + (float) this.field5268.field5142 * var35 + (float) this.field5268.field5127 * var34);
                    int var39 = (int) ((float) this.field5268.field5134 * var36 + (float) this.field5268.field5137 * var34 + (float) this.field5268.field5132 * var35);
                    int var40 = (int) ((float) this.field5275.field5139 * var36 + (float) this.field5275.field5140 * var35 + (float) this.field5275.field5129 * var34);
                    int var41 = (int) ((float) this.field5275.field5136 * var36 + (float) this.field5275.field5142 * var35 + (float) this.field5275.field5127 * var34);
                    int var42 = (int) ((float) this.field5275.field5134 * var36 + (float) this.field5275.field5137 * var34 + (float) this.field5275.field5132 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = this.field5264.field6843 + ((int) (Math.random() * (double) (this.field5264.field6822 - this.field5264.field6843)));
                    int var50 = (int) (Math.random() * (double) (this.field5264.field6839 - this.field5264.field6864)) + this.field5264.field6864;
                    int var51 = this.field5264.field6862 + (int) (Math.random() * (double) (this.field5264.field6857 - this.field5264.field6862));
                    int var52;
                    if (this.field5264.field6852) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field5264.field6890 + (double) this.field5264.field6836 * Math.random()) << 24 | (int) ((double) this.field5264.field6884 * var53 + (double) this.field5264.field6849) << 8 | (int) ((double) this.field5264.field6869 * var53 + (double) this.field5264.field6820) << 16 | (int) ((double) this.field5264.field6840 * var53 + (double) this.field5264.field6861);
                    } else {
                        var52 = (int) ((double) this.field5264.field6861 + (double) this.field5264.field6840 * Math.random()) | (int) ((double) this.field5264.field6849 + Math.random() * (double) this.field5264.field6884) << 8 | (int) ((double) this.field5264.field6820 + (double) this.field5264.field6869 * Math.random()) << 16 | (int) ((double) this.field5264.field6890 + (double) this.field5264.field6836 * Math.random()) << 24;
                    }
                    int var55 = this.field5264.field6829;
                    if (!arg0.method392() && !this.field5264.field6887) {
                        var55 = -1;
                    }
                    if (class33.field436 == class191.field2551) {
                        new class259(this, var46, var47, var48, var24, var23, var22, var49, var50, var52, var51, var55, this.field5264.field6850, this.field5264.field6837);
                    } else {
                        class259 var56 = class110.field1327[class191.field2551];
                        class191.field2551 = class191.field2551 + 1 & 0x3FF;
                        var56.method1697(this, var46, var47, var48, var24, var23, var22, var49, var50, var52, var51, var55, this.field5264.field6850, this.field5264.field6837);
                    }
                }
            }
        }
        if (!this.field5268.method2316(-46, this.field5275)) {
            class362 var58 = this.field5275;
            this.field5275 = this.field5268;
            this.field5268 = var58;
            this.field5268.field5127 = this.field5269.field7485;
            this.field5268.field5134 = this.field5269.field7477;
            this.field5268.field5139 = this.field5269.field7488;
            this.field5268.field5136 = this.field5269.field7495;
            this.field5268.field5137 = this.field5269.field7491;
            this.field5268.field5141 = this.field5275.field5141;
            this.field5268.field5132 = this.field5269.field7479;
            this.field5268.field5133 = this.field5275.field5133;
            this.field5268.field5140 = this.field5269.field7490;
            this.field5268.field5131 = this.field5275.field5131;
            this.field5268.field5142 = this.field5269.field7480;
            this.field5268.field5129 = this.field5269.field7478;
        }
        this.field5262 = 0;
        if (arg1 > -101) {
            return;
        }
        for (class259 var59 = (class259) this.field5274.method2301(-31182); var59 != null; var59 = (class259) this.field5274.method2310(125)) {
            var59.method1701(arg3, arg4);
            this.field5262++;
        }
        class409.field5798 += this.field5262;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 389)
    public static void method2364(int arg0) {
        field5284 = null;
        if (arg0 == -7050) {
            field5272 = null;
            field5273 = null;
        }
    }
}
