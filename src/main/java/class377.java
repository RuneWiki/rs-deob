import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class377 extends class481 {

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Z")
    private boolean field5416 = false;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    private int field5420 = 0;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Z")
    public boolean field5414 = false;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lmf;")
    public class51 field5422;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "J")
    private long field5432;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lbv;")
    public class471 field5437;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Llv;")
    public class529 field5429;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lgs;")
    public class439 field5412;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field5411 = 2;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    private int field5410;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    private int field5415;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    private int field5417;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field5418;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field5419;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    private int field5424;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    private int field5425;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    private int field5426;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    private int field5428;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    private int field5431;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    private int field5434;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    private int field5436;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    private int field5438;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    private int field5439;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public int field5440;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    private int field5441;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Lmg;")
    public static class530 field5430;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IJ)V", line = 14)
    public final void method2250(int arg0, long arg1) {
        field5421++;
        for (class150 var4 = (class150) this.field5412.method2600((byte) 105); var4 != null; var4 = (class150) this.field5412.method2601(arg0 ^ 0x4285)) {
            var4.method1086(arg1);
        }
        if (arg0 != 17128) {
            this.method2251((byte) -111);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V", line = 34)
    public final void method2251(byte arg0) {
        this.field5415 = this.field5422.field747;
        this.field5431 = this.field5422.field749;
        field5413++;
        this.field5408 = this.field5422.field742;
        this.field5426 = this.field5422.field734;
        int var2 = 92 / ((-arg0 - 8) / 49);
        this.field5425 = this.field5422.field732;
        this.field5409 = this.field5422.field744;
        this.field5441 = this.field5422.field729;
        this.field5428 = this.field5422.field741;
        this.field5433 = this.field5422.field730;
        if (this.field5433 == this.field5428 && this.field5433 == this.field5409 && this.field5441 == this.field5426 && this.field5426 == this.field5408 && this.field5431 == this.field5415 && this.field5431 == this.field5425) {
            this.field5416 = true;
            return;
        }
        this.field5416 = false;
        int var3 = (this.field5433 + this.field5409 + this.field5428) / 3;
        int var4 = (this.field5441 + this.field5426 + this.field5408) / 3;
        int var5 = (this.field5415 + this.field5431 + this.field5425) / 3;
        if (this.field5419 == var3 && this.field5423 == var4 && this.field5418 == var5) {
            return;
        }
        this.field5419 = var3;
        this.field5418 = var5;
        this.field5423 = var4;
        int var6 = this.field5433 - this.field5428;
        int var7 = this.field5426 - this.field5441;
        int var8 = this.field5431 - this.field5415;
        int var9 = this.field5409 - this.field5428;
        int var10 = this.field5408 - this.field5441;
        int var11 = this.field5425 - this.field5415;
        this.field5410 = var6 * var10 - (var7 * var9);
        this.field5436 = var8 * var9 - (var6 * var11);
        this.field5424 = var7 * var11 - (var8 * var10);
        while (this.field5424 > 32767 || this.field5436 > 32767 || this.field5410 > 32767 || this.field5424 < -32767 || this.field5436 < -32767 || this.field5410 < -32767) {
            this.field5436 >>= 0x1;
            this.field5424 >>= 0x1;
            this.field5410 >>= 0x1;
        }
        int var12 = (int) Math.sqrt((double) (this.field5436 * this.field5436 + this.field5424 * this.field5424 + this.field5410 * this.field5410));
        if (var12 <= 0) {
            var12 = 1;
        }
        this.field5436 = this.field5436 * 32767 / var12;
        this.field5424 = this.field5424 * 32767 / var12;
        this.field5410 = this.field5410 * 32767 / var12;
        if (this.field5429.field7718 <= 0 && this.field5429.field7755 <= 0) {
            return;
        }
        int var13 = (int) (Math.atan2((double) this.field5410, (double) this.field5424) * 2607.5945876176133D);
        int var14 = (int) (Math.atan2((double) this.field5436, Math.sqrt((double) (this.field5424 * this.field5424 + this.field5410 * this.field5410))) * 2607.5945876176133D);
        this.field5438 = this.field5429.field7718 - this.field5429.field7785;
        this.field5439 = this.field5429.field7755 - this.field5429.field7722;
        this.field5417 = var13 + this.field5429.field7785 - (this.field5438 >> 1);
        this.field5434 = this.field5429.field7722 + var14 - (this.field5439 >> 1);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lza;Lmf;Lbv;J)V", line = 363)
    public class377(class295 arg0, class51 arg1, class471 arg2, long arg3) {
        this.field5422 = arg1;
        this.field5432 = arg3;
        this.field5437 = arg2;
        this.field5429 = this.field5422.method340(-29383);
        if (!arg0.method492() && this.field5429.field7744 != -1) {
            this.field5429 = class16.method118(this.field5429.field7744, true);
        }
        this.field5412 = new class439();
        this.field5420 = (int) ((double) this.field5420 + Math.random() * 64.0D);
        this.method2251((byte) 94);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lza;IZJI)V", line = 130)
    public final void method2252(class295 arg0, int arg1, boolean arg2, long arg3, int arg4) {
        if (this.field5414) {
            arg2 = false;
        } else if (class330.field4488 < this.field5429.field7748) {
            arg2 = false;
        } else if (class209.field2996[class330.field4488] < class182.field2702) {
            arg2 = false;
        } else if (this.field5416) {
            arg2 = false;
        } else if (this.field5429.field7739 != -1) {
            int var7 = (int) (arg3 - this.field5432);
            if (this.field5429.field7772 || var7 <= this.field5429.field7739) {
                var7 %= this.field5429.field7739;
            } else {
                arg2 = false;
            }
            if (!this.field5429.field7769 && this.field5429.field7780 > var7) {
                arg2 = false;
            }
            if (this.field5429.field7769 && this.field5429.field7780 <= var7) {
                arg2 = false;
            }
        }
        if (arg4 != -6174) {
            this.field5433 = -121;
        }
        field5435++;
        if (arg2) {
            this.field5420 += (int) ((double) arg1 * ((double) this.field5429.field7746 + (double) (this.field5429.field7733 - this.field5429.field7746) * Math.random()));
            if (this.field5420 > 63) {
                int var8 = this.field5420 >> 6;
                this.field5420 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field5429.field7718 <= 0 && this.field5429.field7755 <= 0) {
                        var10 = this.field5424;
                        var11 = this.field5410;
                        var12 = this.field5436;
                    } else {
                        int var13 = this.field5417 + ((int) ((double) this.field5438 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class51.field743[var14];
                        int var16 = class51.field731[var14];
                        int var17 = this.field5434 + (int) (Math.random() * (double) this.field5439);
                        int var18 = var17 & 0x1FFF;
                        int var19 = class51.field743[var18];
                        int var20 = class51.field731[var18];
                        byte var21 = 15;
                        var12 = (var20 << 0) * -1;
                        var10 = var16 * var19 >> var21;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field5433 * (long) var23 + ((long) this.field5428 * (long) var22 + ((long) this.field5409 * (long) var24)) >> 16);
                    int var26 = (int) ((long) this.field5441 * (long) var22 - (-((long) this.field5426 * (long) var23) - ((long) this.field5408 * (long) var24)) >> 16);
                    int var27 = (int) ((long) this.field5425 * (long) var24 + (long) this.field5431 * (long) var23 + (long) this.field5415 * (long) var22 >> 16);
                    int var28 = (int) ((double) (this.field5429.field7765 - this.field5429.field7734) * Math.random()) + this.field5429.field7734;
                    int var29 = this.field5429.field7778 + (int) (Math.random() * (double) (this.field5429.field7731 - this.field5429.field7778));
                    int var30 = this.field5429.field7754 + ((int) ((double) (this.field5429.field7728 - this.field5429.field7754) * Math.random()));
                    int var31;
                    if (this.field5429.field7767) {
                        double var32 = Math.random();
                        var31 = (int) (Math.random() * (double) this.field5429.field7760 + (double) this.field5429.field7764) << 24 | (int) ((double) this.field5429.field7779 * var32 + (double) this.field5429.field7738) << 8 | (int) ((double) this.field5429.field7729 * var32 + (double) this.field5429.field7750) << 16 | (int) ((double) this.field5429.field7735 * var32 + (double) this.field5429.field7773);
                    } else {
                        var31 = (int) ((double) this.field5429.field7764 + (double) this.field5429.field7760 * Math.random()) << 24 | (int) ((double) this.field5429.field7735 * Math.random() + (double) this.field5429.field7773) | (int) (Math.random() * (double) this.field5429.field7779 + (double) this.field5429.field7738) << 8 | (int) ((double) this.field5429.field7729 * Math.random() + (double) this.field5429.field7750) << 16;
                    }
                    int var34 = this.field5429.field7721;
                    if (!arg0.method492() && !this.field5429.field7786) {
                        var34 = -1;
                    }
                    if (class323.field4435 == class279.field3793) {
                        new class150(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field5429.field7753, this.field5429.field7770);
                    } else {
                        class150 var35 = class26.field357[class279.field3793];
                        class279.field3793 = class279.field3793 + 1 & 0x3FF;
                        var35.method1089(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field5429.field7753, this.field5429.field7770);
                    }
                }
            }
        }
        this.field5440 = 0;
        for (class150 var37 = (class150) this.field5412.method2600((byte) -27); var37 != null; var37 = (class150) this.field5412.method2601(116)) {
            var37.method1087(arg3, arg1);
            this.field5440++;
        }
        class197.field2894 += this.field5440;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)Z", line = 292)
    public static final boolean method2253(int arg0, int arg1, byte arg2) {
        if (arg2 < 5) {
            field5411 = 98;
        }
        field5427++;
        return class348.method2088(arg1, (byte) -28, arg0) || class391.method2317(true, arg0, arg1);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILjava/lang/Class;)Ltn;", line = 305)
    public static final class434 method2254(int arg0, int arg1, int arg2, Class arg3) {
        class532 var4 = class103.field1632[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class201 var5 = var4.field7828; var5 != null; var5 = var5.field2918) {
            class434 var6 = var5.field2915;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6290 == arg1 && var6.field6277 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V", line = 343)
    public static void method2255(byte arg0) {
        if (arg0 != -42) {
            method2254(-110, 110, 25, null);
        }
        field5430 = null;
    }
}
