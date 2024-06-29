import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class611 extends class91 {

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    private int field8680 = 0;

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "Z")
    public boolean field8682 = false;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "Ldba;")
    public class466 field8678 = new class466();

    @OriginalMember(owner = "client!tca", name = "D", descriptor = "Ldba;")
    private class466 field8686 = new class466();

    @OriginalMember(owner = "client!tca", name = "J", descriptor = "Z")
    private boolean field8692 = false;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "J")
    private long field8668;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "Lpi;")
    public class335 field8669;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "Leea;")
    public class187 field8667;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "Lqw;")
    public class623 field8676;

    @OriginalMember(owner = "client!tca", name = "C", descriptor = "Lcp;")
    public class271 field8685;

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "[I")
    private static int[] field8675 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "Lin;")
    public static class380 field8671 = new class380(118, -1);

    @OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
    public static int field8684 = -1;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public int field8674;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!tca", name = "E", descriptor = "I")
    private int field8687;

    @OriginalMember(owner = "client!tca", name = "F", descriptor = "I")
    private int field8688;

    @OriginalMember(owner = "client!tca", name = "G", descriptor = "I")
    private int field8689;

    @OriginalMember(owner = "client!tca", name = "H", descriptor = "I")
    private int field8690;

    @OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
    private int field8691;

    @OriginalMember(owner = "client!tca", name = "K", descriptor = "I")
    private int field8693;

    @OriginalMember(owner = "client!tca", name = "L", descriptor = "I")
    private int field8694;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "Lhia;")
    public static class49 field8673;

    @OriginalMember(owner = "client!tca", name = "A", descriptor = "[[S")
    public static short[][] field8683;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V", line = 8)
    public static void method3532(byte arg0) {
        if (arg0 < -46) {
            field8673 = null;
            field8671 = null;
            field8683 = null;
            field8675 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(JIZILha;)V", line = 22)
    public final void method3533(long arg0, int arg1, boolean arg2, int arg3, class475 arg4) {
        field8677++;
        if (this.field8682) {
            arg2 = false;
        } else if (this.field8676.field8835 > class693.field9762) {
            arg2 = false;
        } else if (class615.field8728 > field8675[class693.field9762]) {
            arg2 = false;
        } else if (this.field8692) {
            arg2 = false;
        } else if (this.field8676.field8802 != -1) {
            int var7 = (int) (arg0 - this.field8668);
            if (this.field8676.field8821 || var7 <= this.field8676.field8802) {
                var7 %= this.field8676.field8802;
            } else {
                arg2 = false;
            }
            if (!this.field8676.field8812 && this.field8676.field8830 > var7) {
                arg2 = false;
            }
            if (this.field8676.field8812 && this.field8676.field8830 <= var7) {
                arg2 = false;
            }
        }
        if (arg2) {
            class781.field10702++;
            int var8 = (this.field8678.field6359 - (-this.field8678.field6360 - this.field8678.field6351)) / 3;
            int var9 = (this.field8678.field6353 + this.field8678.field6348 + this.field8678.field6357) / 3;
            int var10 = (this.field8678.field6362 + this.field8678.field6349 + this.field8678.field6364) / 3;
            if (this.field8678.field6365 != var8 || this.field8678.field6358 != var9 || this.field8678.field6354 != var10) {
                this.field8678.field6354 = var10;
                this.field8678.field6365 = var8;
                this.field8678.field6358 = var9;
                int var11 = this.field8678.field6351 - this.field8678.field6359;
                int var12 = this.field8678.field6353 - this.field8678.field6348;
                int var13 = this.field8678.field6364 - this.field8678.field6349;
                int var14 = this.field8678.field6360 - this.field8678.field6359;
                int var15 = this.field8678.field6357 - this.field8678.field6348;
                int var16 = this.field8678.field6362 - this.field8678.field6349;
                this.field8691 = var13 * var14 - var11 * var16;
                this.field8690 = var11 * var15 - (var12 * var14);
                this.field8688 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field8688 <= 32767 && this.field8691 <= 32767 && this.field8690 <= 32767 && this.field8688 >= -32767 && this.field8691 >= -32767 && this.field8690 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8688 * this.field8688 + (this.field8691 * this.field8691 + (this.field8690 * this.field8690))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8690 = this.field8690 * 32767 / var17;
                        this.field8691 = this.field8691 * 32767 / var17;
                        this.field8688 = this.field8688 * 32767 / var17;
                        if (this.field8676.field8804 > 0 || this.field8676.field8849 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8690, (double) this.field8688) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8691, Math.sqrt((double) (this.field8688 * this.field8688 + (this.field8690 * this.field8690)))) * 2607.5945876176133D);
                            this.field8694 = this.field8676.field8804 - this.field8676.field8851;
                            this.field8693 = var18 + this.field8676.field8851 - (this.field8694 >> 1);
                            this.field8687 = this.field8676.field8849 - this.field8676.field8788;
                            this.field8689 = this.field8676.field8788 + var19 - (this.field8687 >> 1);
                        }
                        break;
                    }
                    this.field8691 >>= 0x1;
                    this.field8688 >>= 0x1;
                    this.field8690 >>= 0x1;
                }
            }
            this.field8680 += (int) ((double) arg1 * ((double) this.field8676.field8836 + Math.random() * (double) (this.field8676.field8792 - this.field8676.field8836)));
            if (this.field8680 > 63) {
                int var20 = this.field8680 >> 6;
                this.field8680 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8676.field8804 <= 0 && this.field8676.field8849 <= 0) {
                        var22 = this.field8691;
                        var23 = this.field8688;
                        var24 = this.field8690;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field8694) + this.field8693;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class253.field3634[var26];
                        int var28 = class253.field3633[var26];
                        int var29 = (int) (Math.random() * (double) this.field8687) + this.field8689;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class253.field3634[var30];
                        int var32 = class253.field3633[var30];
                        byte var33 = 13;
                        var22 = (var32 << 1) * -1;
                        var23 = var28 * var31 >> var33;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field8678.field6360 * var36 + (float) this.field8678.field6359 * var34 + (float) this.field8678.field6351 * var35);
                    int var38 = (int) ((float) this.field8678.field6357 * var36 + (float) this.field8678.field6353 * var35 + (float) this.field8678.field6348 * var34);
                    int var39 = (int) ((float) this.field8678.field6362 * var36 + (float) this.field8678.field6364 * var35 + (float) this.field8678.field6349 * var34);
                    int var40 = (int) ((float) this.field8686.field6360 * var36 + (float) this.field8686.field6359 * var34 + (float) this.field8686.field6351 * var35);
                    int var41 = (int) ((float) this.field8686.field6357 * var36 + (float) this.field8686.field6353 * var35 + (float) this.field8686.field6348 * var34);
                    int var42 = (int) ((float) this.field8686.field6362 * var36 + (float) this.field8686.field6364 * var35 + (float) this.field8686.field6349 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = (int) (Math.random() * (double) (this.field8676.field8831 - this.field8676.field8787)) + this.field8676.field8787;
                    int var50 = this.field8676.field8844 + (int) (Math.random() * (double) (this.field8676.field8857 - this.field8676.field8844));
                    int var51 = this.field8676.field8823 + ((int) ((double) (this.field8676.field8798 - this.field8676.field8823) * Math.random()));
                    int var54;
                    if (this.field8676.field8786) {
                        double var52 = Math.random();
                        var54 = (int) (Math.random() * (double) this.field8676.field8799 + (double) this.field8676.field8852) << 24 | (int) ((double) this.field8676.field8825 * var52 + (double) this.field8676.field8800) | (int) ((double) this.field8676.field8833 * var52 + (double) this.field8676.field8859) << 8 | (int) ((double) this.field8676.field8840 * var52 + (double) this.field8676.field8789) << 16;
                    } else {
                        var54 = (int) ((double) this.field8676.field8799 * Math.random() + (double) this.field8676.field8852) << 24 | (int) ((double) this.field8676.field8800 + (double) this.field8676.field8825 * Math.random()) | (int) (Math.random() * (double) this.field8676.field8833 + (double) this.field8676.field8859) << 8 | (int) ((double) this.field8676.field8840 * Math.random() + (double) this.field8676.field8789) << 16;
                    }
                    int var55 = this.field8676.field8843;
                    if (!arg4.method479() && !this.field8676.field8848) {
                        var55 = -1;
                    }
                    if (class273.field3839 == class244.field3498) {
                        new class537(this, var46, var47, var48, var23, var22, var24, var49, var50, var54, var51, var55, this.field8676.field8818, this.field8676.field8819);
                    } else {
                        class537 var57 = class174.field2630[class244.field3498];
                        class244.field3498 = class244.field3498 + 1 & 0x3FF;
                        var57.method3115(this, var46, var47, var48, var23, var22, var24, var49, var50, var54, var51, var55, this.field8676.field8818, this.field8676.field8819);
                    }
                }
            }
        }
        if (!this.field8678.method2727((byte) 126, this.field8686)) {
            class466 var58 = this.field8686;
            this.field8686 = this.field8678;
            this.field8678 = var58;
            this.field8678.field6351 = this.field8669.field4751;
            this.field8678.field6364 = this.field8669.field4771;
            this.field8678.field6357 = this.field8669.field4764;
            this.field8678.field6360 = this.field8669.field4758;
            this.field8678.field6362 = this.field8669.field4750;
            this.field8678.field6348 = this.field8669.field4755;
            this.field8678.field6349 = this.field8669.field4752;
            this.field8678.field6354 = this.field8686.field6354;
            this.field8678.field6358 = this.field8686.field6358;
            this.field8678.field6365 = this.field8686.field6365;
            this.field8678.field6353 = this.field8669.field4761;
            this.field8678.field6359 = this.field8669.field4762;
        }
        this.field8674 = 0;
        for (class537 var59 = (class537) this.field8685.method1730((byte) 114); var59 != null; var59 = (class537) this.field8685.method1729((byte) 100)) {
            var59.method3116(arg0, arg1);
            this.field8674++;
        }
        class719.field10047 += this.field8674;
        if (arg3 != -14167) {
            this.method3534(null, -64L, -94);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lha;JI)V", line = 283)
    public final void method3534(class475 arg0, long arg1, int arg2) {
        for (class537 var5 = (class537) this.field8685.method1730((byte) 79); var5 != null; var5 = (class537) this.field8685.method1729((byte) 100)) {
            var5.method3113(arg0, arg1);
        }
        if (arg2 >= -20) {
            method3536(null, (byte) 32);
        }
        field8672++;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 311)
    public final void method3535(int arg0) {
        this.field8678.field6353 = this.field8669.field4761;
        this.field8678.field6357 = this.field8669.field4764;
        this.field8678.field6351 = this.field8669.field4751;
        this.field8678.field6349 = this.field8669.field4752;
        this.field8678.field6360 = this.field8669.field4758;
        this.field8678.field6364 = this.field8669.field4771;
        field8681++;
        this.field8678.field6359 = this.field8669.field4762;
        if (arg0 != 0) {
            this.field8689 = -42;
        }
        this.field8678.field6362 = this.field8669.field4750;
        this.field8678.field6348 = this.field8669.field4755;
        if (this.field8678.field6359 == this.field8678.field6351 && this.field8678.field6360 == this.field8678.field6351 && this.field8678.field6353 == this.field8678.field6348 && this.field8678.field6357 == this.field8678.field6353 && this.field8678.field6364 == this.field8678.field6349 && this.field8678.field6364 == this.field8678.field6362) {
            this.field8692 = true;
        } else if (this.field8692) {
            this.field8686.field6348 = this.field8678.field6348;
            this.field8686.field6362 = this.field8678.field6362;
            this.field8686.field6364 = this.field8678.field6364;
            this.field8686.field6357 = this.field8678.field6357;
            this.field8692 = false;
            this.field8686.field6351 = this.field8678.field6351;
            this.field8686.field6349 = this.field8678.field6349;
            this.field8686.field6353 = this.field8678.field6353;
            this.field8686.field6360 = this.field8678.field6360;
            this.field8686.field6359 = this.field8678.field6359;
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lha;Lpi;Leea;J)V", line = 468)
    public class611(class475 arg0, class335 arg1, class187 arg2, long arg3) {
        this.field8668 = arg3;
        this.field8669 = arg1;
        this.field8667 = arg2;
        this.field8676 = this.field8669.method2058(-125);
        if (!arg0.method479() && this.field8676.field8791 != -1) {
            this.field8676 = class25.method221(-126, this.field8676.field8791);
        }
        this.field8685 = new class271();
        this.field8680 = (int) ((double) this.field8680 + Math.random() * 64.0D);
        this.method3535(0);
        this.field8686.field6349 = this.field8678.field6349;
        this.field8686.field6357 = this.field8678.field6357;
        this.field8686.field6351 = this.field8678.field6351;
        this.field8686.field6362 = this.field8678.field6362;
        this.field8686.field6360 = this.field8678.field6360;
        this.field8686.field6353 = this.field8678.field6353;
        this.field8686.field6364 = this.field8678.field6364;
        this.field8686.field6348 = this.field8678.field6348;
        this.field8686.field6359 = this.field8678.field6359;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 358)
    public static final String method3536(String arg0, byte arg1) {
        field8679++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 != -30) {
            method3536(null, (byte) 93);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > var4 + 2) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = 10 - (65 - var6);
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 - 87;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 - 55;
                }
                var4 += 2;
                if (var11 != 0 && class30.method255((byte) var11, (byte) -100)) {
                    var2.append(class478.method2834((byte) 123, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }
}
