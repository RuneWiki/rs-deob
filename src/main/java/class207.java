import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class207 extends class315 {

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Z")
    private boolean field3038 = false;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    private int field3042 = 0;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Z")
    public boolean field3046 = false;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lan;")
    public class113 field3030;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lof;")
    public class295 field3024;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "J")
    private long field3015;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ljg;")
    public class475 field3021;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Lmb;")
    public class262 field3045;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Lrc;")
    public static class108 field3039 = new class108(18, 10);

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lch;")
    public static class151 field3048 = new class151("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Z")
    public static boolean field3050 = false;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    private int field3026;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field3029;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    private int field3032;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    private int field3040;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    private int field3041;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    private int field3044;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public final void method1415(int arg0) {
        this.field3025 = this.field3024.field4154;
        this.field3029 = this.field3024.field4172;
        this.field3034 = this.field3024.field4161;
        int var2 = 85 % ((arg0 - 31) / 54);
        this.field3032 = this.field3024.field4167;
        this.field3019 = this.field3024.field4156;
        this.field3036 = this.field3024.field4162;
        this.field3023 = this.field3024.field4163;
        field3022++;
        this.field3017 = this.field3024.field4174;
        this.field3026 = this.field3024.field4171;
        if (this.field3036 == this.field3034 && this.field3034 == this.field3019 && this.field3029 == this.field3026 && this.field3029 == this.field3023 && this.field3032 == this.field3017 && this.field3032 == this.field3025) {
            this.field3038 = true;
            return;
        }
        this.field3038 = false;
        int var3 = (this.field3034 + this.field3019 + this.field3036) / 3;
        int var4 = (this.field3026 + this.field3023 + this.field3029) / 3;
        int var5 = (this.field3017 - (-this.field3032 - this.field3025)) / 3;
        if (this.field3043 == var3 && this.field3020 == var4 && this.field3028 == var5) {
            return;
        }
        this.field3028 = var5;
        this.field3020 = var4;
        this.field3043 = var3;
        int var6 = this.field3034 - this.field3036;
        int var7 = this.field3029 - this.field3026;
        int var8 = this.field3032 - this.field3017;
        int var9 = this.field3019 - this.field3036;
        int var10 = this.field3023 - this.field3026;
        int var11 = this.field3025 - this.field3017;
        this.field3040 = var8 * var9 - (var6 * var11);
        this.field3016 = var7 * var11 - var8 * var10;
        for (this.field3041 = var6 * var10 - (var7 * var9); this.field3016 > 32767 || this.field3040 > 32767 || this.field3041 > 32767 || this.field3016 < -32767 || this.field3040 < -32767 || this.field3041 < -32767; this.field3041 >>= 0x1) {
            this.field3040 >>= 0x1;
            this.field3016 >>= 0x1;
        }
        int var12 = (int) Math.sqrt((double) (this.field3041 * this.field3041 + this.field3040 * this.field3040 + this.field3016 * this.field3016));
        if (var12 <= 0) {
            var12 = 1;
        }
        this.field3041 = this.field3041 * 32767 / var12;
        this.field3016 = this.field3016 * 32767 / var12;
        this.field3040 = this.field3040 * 32767 / var12;
        if (this.field3021.field6728 <= 0 && this.field3021.field6712 <= 0) {
            return;
        }
        int var13 = (int) (Math.atan2((double) this.field3041, (double) this.field3016) * 2607.5945876176133D);
        int var14 = (int) (Math.atan2((double) this.field3040, Math.sqrt((double) (this.field3041 * this.field3041 + this.field3016 * this.field3016))) * 2607.5945876176133D);
        this.field3044 = this.field3021.field6728 - this.field3021.field6723;
        this.field3033 = this.field3021.field6712 - this.field3021.field6685;
        this.field3031 = this.field3021.field6723 + var13 - (this.field3044 >> 1);
        this.field3027 = var14 + this.field3021.field6685 - (this.field3033 >> 1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public static final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3035++;
        class334 var5 = class352.method2172(arg1, 10, 16711935);
        if (arg4 < -115) {
            var5.method2104(0);
            var5.field4635 = arg0;
            var5.field4648 = arg3;
            var5.field4636 = arg2;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Lcj;")
    public static final class192 method1417(int arg0) {
        field3037++;
        if (arg0 != 0) {
            method1420((byte) 7);
        }
        try {
            return new class43();
        } catch (Throwable var2) {
            try {
                return (class192) Class.forName("kl").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class80();
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IJ)V")
    public final void method1418(int arg0, long arg1) {
        if (arg0 < 42) {
            field3039 = null;
        }
        for (class474 var4 = (class474) this.field3045.method1763((byte) -93); var4 != null; var4 = (class474) this.field3045.method1767(true)) {
            var4.method2807(arg1);
        }
        field3049++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lvc;BJIZ)V")
    public final void method1419(class89 arg0, byte arg1, long arg2, int arg3, boolean arg4) {
        if (this.field3046) {
            arg4 = false;
        } else if (class73.field1044 < this.field3021.field6692) {
            arg4 = false;
        } else if (class368.field5057 > class142.field1986[class73.field1044]) {
            arg4 = false;
        } else if (this.field3038) {
            arg4 = false;
        } else if (this.field3021.field6740 != -1) {
            int var7 = (int) (arg2 - this.field3015);
            if (this.field3021.field6727 || var7 <= this.field3021.field6740) {
                var7 %= this.field3021.field6740;
            } else {
                arg4 = false;
            }
            if (!this.field3021.field6736 && var7 < this.field3021.field6730) {
                arg4 = false;
            }
            if (this.field3021.field6736 && this.field3021.field6730 <= var7) {
                arg4 = false;
            }
        }
        field3018++;
        if (arg4) {
            this.field3042 += (int) (((double) this.field3021.field6672 + (double) (this.field3021.field6717 - this.field3021.field6672) * Math.random()) * (double) arg3);
            if (this.field3042 > 63) {
                int var8 = this.field3042 >> 6;
                this.field3042 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3021.field6728 <= 0 && this.field3021.field6712 <= 0) {
                        var10 = this.field3041;
                        var11 = this.field3040;
                        var12 = this.field3016;
                    } else {
                        int var13 = (int) ((double) this.field3044 * Math.random()) + this.field3031;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class319.field4501[var14];
                        int var16 = class319.field4504[var14];
                        int var17 = (int) (Math.random() * (double) this.field3033) + this.field3027;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class319.field4501[var18];
                        var12 = var16 * var19 >> 15;
                        int var20 = class319.field4504[var18];
                        var11 = var20 * -1;
                        var10 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field3034 * var22 + (this.field3036 * var21 + (this.field3019 * var23)) >> 16;
                    int var25 = this.field3023 * var23 + this.field3029 * var22 + this.field3026 * var21 >> 16;
                    int var26 = this.field3032 * var22 + this.field3025 * var23 + this.field3017 * var21 >> 16;
                    int var27 = (int) ((double) (this.field3021.field6677 - this.field3021.field6729) * Math.random()) + this.field3021.field6729;
                    int var28 = (int) (Math.random() * (double) (this.field3021.field6700 - this.field3021.field6691)) + this.field3021.field6691;
                    int var29 = (int) (Math.random() * (double) (this.field3021.field6680 - this.field3021.field6697)) + this.field3021.field6697;
                    int var32;
                    if (this.field3021.field6716) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field3021.field6708 * Math.random() + (double) this.field3021.field6722) << 24 | (int) ((double) this.field3021.field6679 * var30 + (double) this.field3021.field6703) << 16 | (int) ((double) this.field3021.field6683 * var30 + (double) this.field3021.field6720) << 8 | (int) ((double) this.field3021.field6693 * var30 + (double) this.field3021.field6733);
                    } else {
                        var32 = (int) ((double) this.field3021.field6703 + (double) this.field3021.field6679 * Math.random()) << 16 | (int) ((double) this.field3021.field6683 * Math.random() + (double) this.field3021.field6720) << 8 | (int) (Math.random() * (double) this.field3021.field6693 + (double) this.field3021.field6733) | (int) ((double) this.field3021.field6708 * Math.random() + (double) this.field3021.field6722) << 24;
                    }
                    int var33 = this.field3021.field6686;
                    if (!arg0.method455() && !this.field3021.field6673) {
                        var33 = -1;
                    }
                    if (class189.field2811 == class108.field1517) {
                        new class474(this, var24, var25, var26, var12, var11, var10, var27, var28, var32, var29, var33, this.field3021.field6732);
                    } else {
                        class474 var35 = class163.field2378[class108.field1517];
                        class108.field1517 = class108.field1517 + 1 & 0x3FF;
                        var35.method2806(this, var24, var25, var26, var12, var11, var10, var27, var28, var32, var29, var33, this.field3021.field6732);
                    }
                }
            }
        }
        this.field3047 = 0;
        class474 var36 = (class474) this.field3045.method1763((byte) -53);
        if (arg1 < 13) {
            return;
        }
        while (var36 != null) {
            var36.method2805(arg2, arg3);
            this.field3047++;
            var36 = (class474) this.field3045.method1767(true);
        }
        class414.field5682 += this.field3047;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method1420(byte arg0) {
        int var1 = 15 / ((59 - arg0) / 62);
        field3048 = null;
        field3039 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lvc;Lof;Lan;J)V")
    public class207(class89 arg0, class295 arg1, class113 arg2, long arg3) {
        this.field3030 = arg2;
        this.field3024 = arg1;
        this.field3015 = arg3;
        this.field3021 = class30.method194((byte) -25, this.field3024.field4157);
        if (!arg0.method455() && this.field3021.field6688 != -1) {
            this.field3021 = class30.method194((byte) -25, this.field3021.field6688);
        }
        this.field3045 = new class262();
        this.field3042 = (int) ((double) this.field3042 + Math.random() * 64.0D);
        this.method1415(107);
    }
}
