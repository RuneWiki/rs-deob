import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class598 extends class113 {

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Z")
    public boolean field8501 = false;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    private int field8508 = 0;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "Lega;")
    public class452 field8509 = new class452();

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Lega;")
    private class452 field8511 = new class452();

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "Z")
    private boolean field8518 = false;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Lta;")
    public class27 field8502;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Lqv;")
    public class108 field8500;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "J")
    private long field8504;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Lva;")
    public class500 field8497;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Lfw;")
    public class215 field8506;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field8503 = 1;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field8496 = 0;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field8507 = 0;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lgr;")
    public static class530 field8493 = new class530(33, -1);

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Lufa;")
    public static class740 field8510 = new class740(4, 2);

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public int field8495;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    private int field8512;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    private int field8513;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    private int field8514;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    private int field8515;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    private int field8516;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
    private int field8517;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    private int field8519;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public final void method3496(int arg0) {
        this.field8509.field6473 = this.field8500.field1556;
        if (arg0 >= -118) {
            this.field8514 = 75;
        }
        this.field8509.field6469 = this.field8500.field1540;
        this.field8509.field6470 = this.field8500.field1552;
        this.field8509.field6462 = this.field8500.field1548;
        this.field8509.field6461 = this.field8500.field1546;
        this.field8509.field6472 = this.field8500.field1537;
        field8499++;
        this.field8509.field6459 = this.field8500.field1554;
        this.field8509.field6460 = this.field8500.field1549;
        this.field8509.field6464 = this.field8500.field1543;
        if (this.field8509.field6473 == this.field8509.field6464 && this.field8509.field6464 == this.field8509.field6459 && this.field8509.field6470 == this.field8509.field6469 && this.field8509.field6469 == this.field8509.field6460 && this.field8509.field6472 == this.field8509.field6461 && this.field8509.field6472 == this.field8509.field6462) {
            this.field8518 = true;
        } else if (this.field8518) {
            this.field8518 = false;
            this.field8511.field6473 = this.field8509.field6473;
            this.field8511.field6459 = this.field8509.field6459;
            this.field8511.field6469 = this.field8509.field6469;
            this.field8511.field6460 = this.field8509.field6460;
            this.field8511.field6462 = this.field8509.field6462;
            this.field8511.field6461 = this.field8509.field6461;
            this.field8511.field6464 = this.field8509.field6464;
            this.field8511.field6470 = this.field8509.field6470;
            this.field8511.field6472 = this.field8509.field6472;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[[[BIIIIIIIILha;I)V")
    public static final void method3497(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class543 arg11, int arg12) {
        field8498++;
        if (arg3 == arg7 || arg0 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        arg11.method267(arg6, arg10, arg4, arg1, arg5, arg8, arg2[arg7 - 1][arg9], arg0, arg12);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BJLha;)V")
    public final void method3498(byte arg0, long arg1, class543 arg2) {
        if (arg0 < 28) {
            method3499((byte) 111);
        }
        for (class287 var5 = (class287) this.field8506.method1527(64); var5 != null; var5 = (class287) this.field8506.method1523(true)) {
            var5.method1826(arg2, arg1);
        }
        field8494++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static void method3499(byte arg0) {
        field8493 = null;
        if (arg0 != -76) {
            field8510 = null;
        }
        field8510 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lha;IZJI)V")
    public final void method3500(class543 arg0, int arg1, boolean arg2, long arg3, int arg4) {
        field8505++;
        if (this.field8501) {
            arg2 = false;
        } else if (class332.field4511 < this.field8497.field7211) {
            arg2 = false;
        } else if (class301.field4124 > class254.field3670[class332.field4511]) {
            arg2 = false;
        } else if (this.field8518) {
            arg2 = false;
        } else if (this.field8497.field7238 != -1) {
            int var7 = (int) (arg3 - this.field8504);
            if (this.field8497.field7241 || var7 <= this.field8497.field7238) {
                var7 %= this.field8497.field7238;
            } else {
                arg2 = false;
            }
            if (!this.field8497.field7209 && this.field8497.field7245 > var7) {
                arg2 = false;
            }
            if (this.field8497.field7209 && var7 >= this.field8497.field7245) {
                arg2 = false;
            }
        }
        if (arg2) {
            class415.field5903++;
            int var8 = (this.field8509.field6473 + this.field8509.field6464 + this.field8509.field6459) / 3;
            int var9 = (this.field8509.field6470 + this.field8509.field6469 + this.field8509.field6460) / 3;
            int var10 = (this.field8509.field6461 + this.field8509.field6462 + this.field8509.field6472) / 3;
            if (this.field8509.field6458 != var8 || this.field8509.field6465 != var9 || this.field8509.field6466 != var10) {
                this.field8509.field6458 = var8;
                this.field8509.field6466 = var10;
                this.field8509.field6465 = var9;
                int var11 = this.field8509.field6464 - this.field8509.field6473;
                int var12 = this.field8509.field6469 - this.field8509.field6470;
                int var13 = this.field8509.field6472 - this.field8509.field6461;
                int var14 = this.field8509.field6459 - this.field8509.field6473;
                int var15 = this.field8509.field6460 - this.field8509.field6470;
                int var16 = this.field8509.field6462 - this.field8509.field6461;
                this.field8514 = var13 * var14 - (var11 * var16);
                this.field8519 = var11 * var15 - var12 * var14;
                this.field8513 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field8513 <= 32767 && this.field8514 <= 32767 && this.field8519 <= 32767 && this.field8513 >= -32767 && this.field8514 >= -32767 && this.field8519 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8513 * this.field8513 + this.field8519 * this.field8519 + this.field8514 * this.field8514));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8514 = this.field8514 * 32767 / var17;
                        this.field8513 = this.field8513 * 32767 / var17;
                        this.field8519 = this.field8519 * 32767 / var17;
                        if (this.field8497.field7194 > 0 || this.field8497.field7186 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8519, (double) this.field8513) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8514, Math.sqrt((double) (this.field8519 * this.field8519 + this.field8513 * this.field8513))) * 2607.5945876176133D);
                            this.field8515 = this.field8497.field7194 - this.field8497.field7180;
                            this.field8516 = this.field8497.field7186 - this.field8497.field7201;
                            this.field8517 = var18 + this.field8497.field7180 - (this.field8515 >> 1);
                            this.field8512 = var19 + this.field8497.field7201 - (this.field8516 >> 1);
                        }
                        break;
                    }
                    this.field8519 >>= 0x1;
                    this.field8514 >>= 0x1;
                    this.field8513 >>= 0x1;
                }
            }
            this.field8508 += (int) (((double) this.field8497.field7192 + Math.random() * (double) (this.field8497.field7185 - this.field8497.field7192)) * (double) arg4);
            if (this.field8508 > 63) {
                int var20 = this.field8508 >> 6;
                this.field8508 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8497.field7194 <= 0 && this.field8497.field7186 <= 0) {
                        var22 = this.field8514;
                        var23 = this.field8513;
                        var24 = this.field8519;
                    } else {
                        int var25 = (int) ((double) this.field8515 * Math.random()) + this.field8517;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class125.field1736[var26];
                        int var28 = class125.field1729[var26];
                        int var29 = this.field8512 + ((int) ((double) this.field8516 * Math.random()));
                        int var30 = var29 & 0x1FFF;
                        int var31 = class125.field1736[var30];
                        int var32 = class125.field1729[var30];
                        byte var33 = 13;
                        var23 = var28 * var31 >> var33;
                        var22 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field8509.field6459 * var36 + (float) this.field8509.field6473 * var34 + (float) this.field8509.field6464 * var35);
                    int var38 = (int) ((float) this.field8509.field6460 * var36 + (float) this.field8509.field6470 * var34 + (float) this.field8509.field6469 * var35);
                    int var39 = (int) ((float) this.field8509.field6462 * var36 + (float) this.field8509.field6472 * var35 + (float) this.field8509.field6461 * var34);
                    int var40 = (int) ((float) this.field8511.field6459 * var36 + (float) this.field8511.field6473 * var34 + (float) this.field8511.field6464 * var35);
                    int var41 = (int) ((float) this.field8511.field6460 * var36 + (float) this.field8511.field6470 * var34 + (float) this.field8511.field6469 * var35);
                    int var42 = (int) ((float) this.field8511.field6462 * var36 + (float) this.field8511.field6472 * var35 + (float) this.field8511.field6461 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) (Math.random() * (double) var43 + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = (int) (Math.random() * (double) (this.field8497.field7187 - this.field8497.field7237)) + this.field8497.field7237;
                    int var50 = this.field8497.field7221 + ((int) ((double) (this.field8497.field7183 - this.field8497.field7221) * Math.random()));
                    int var51 = this.field8497.field7193 + ((int) ((double) (this.field8497.field7215 - this.field8497.field7193) * Math.random()));
                    int var52;
                    if (this.field8497.field7231) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field8497.field7234 * var53 + (double) this.field8497.field7214) | (int) ((double) this.field8497.field7184 * var53 + (double) this.field8497.field7225) << 16 | (int) ((double) this.field8497.field7246 * var53 + (double) this.field8497.field7251) << 8 | (int) ((double) this.field8497.field7210 * Math.random() + (double) this.field8497.field7223) << 24;
                    } else {
                        var52 = (int) ((double) this.field8497.field7223 + Math.random() * (double) this.field8497.field7210) << 24 | (int) ((double) this.field8497.field7225 + (double) this.field8497.field7184 * Math.random()) << 16 | (int) ((double) this.field8497.field7251 + Math.random() * (double) this.field8497.field7246) << 8 | (int) ((double) this.field8497.field7214 + (double) this.field8497.field7234 * Math.random());
                    }
                    int var55 = this.field8497.field7199;
                    if (!arg0.method207() && !this.field8497.field7205) {
                        var55 = -1;
                    }
                    if (class603.field8549 == class556.field8081) {
                        new class287(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field8497.field7195, this.field8497.field7220);
                    } else {
                        class287 var56 = class472.field6692[class603.field8549];
                        class603.field8549 = class603.field8549 + 1 & 0x3FF;
                        var56.method1825(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field8497.field7195, this.field8497.field7220);
                    }
                }
            }
        }
        if (!this.field8509.method2768(this.field8511, (byte) -66)) {
            class452 var58 = this.field8511;
            this.field8511 = this.field8509;
            this.field8509 = var58;
            this.field8509.field6462 = this.field8500.field1548;
            this.field8509.field6472 = this.field8500.field1537;
            this.field8509.field6460 = this.field8500.field1549;
            this.field8509.field6465 = this.field8511.field6465;
            this.field8509.field6464 = this.field8500.field1543;
            this.field8509.field6469 = this.field8500.field1540;
            this.field8509.field6459 = this.field8500.field1554;
            this.field8509.field6470 = this.field8500.field1552;
            this.field8509.field6461 = this.field8500.field1546;
            this.field8509.field6466 = this.field8511.field6466;
            this.field8509.field6473 = this.field8500.field1556;
            this.field8509.field6458 = this.field8511.field6458;
        }
        this.field8495 = arg1;
        for (class287 var59 = (class287) this.field8506.method1527(46); var59 != null; var59 = (class287) this.field8506.method1523(true)) {
            var59.method1824(arg3, arg4);
            this.field8495++;
        }
        class357.field5266 += this.field8495;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lha;Lqv;Lta;J)V")
    public class598(class543 arg0, class108 arg1, class27 arg2, long arg3) {
        this.field8502 = arg2;
        this.field8500 = arg1;
        this.field8504 = arg3;
        this.field8497 = this.field8500.method796(true);
        if (!arg0.method207() && this.field8497.field7191 != -1) {
            this.field8497 = class64.method582(this.field8497.field7191, 20915);
        }
        this.field8506 = new class215();
        this.field8508 = (int) ((double) this.field8508 + Math.random() * 64.0D);
        this.method3496(-128);
        this.field8511.field6462 = this.field8509.field6462;
        this.field8511.field6459 = this.field8509.field6459;
        this.field8511.field6460 = this.field8509.field6460;
        this.field8511.field6473 = this.field8509.field6473;
        this.field8511.field6461 = this.field8509.field6461;
        this.field8511.field6472 = this.field8509.field6472;
        this.field8511.field6469 = this.field8509.field6469;
        this.field8511.field6470 = this.field8509.field6470;
        this.field8511.field6464 = this.field8509.field6464;
    }
}
