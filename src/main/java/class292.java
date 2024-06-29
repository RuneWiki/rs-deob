import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class292 extends class18 {

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Z")
    public boolean field4976 = true;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    private int field4987 = 0;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Z")
    public boolean field4979 = false;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Lcn;")
    public final class269 field5001;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lki;")
    public final class164 field4983;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "Lic;")
    public class117 field5010;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Lk;")
    public final class237 field4993;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "J")
    private long field5006;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Ljf;")
    public static class229 field5003 = class212.method1457((byte) 100, "brillant3:");

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private int field4984;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    private int field4986;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    private int field4992;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field4998;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    private int field5000;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    private int field5002;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    private int field5004;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field5007;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    private int field5012;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    private int field5013;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lsm;")
    public static class159 field4978;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lcn;Lki;J)V", line = 479)
    public class292(class269 arg0, class164 arg1, long arg2) {
        this.field5001 = arg0;
        this.field4983 = arg1;
        this.field5010 = new class117();
        this.field4987 = (int) ((double) this.field4987 + Math.random() * 64.0D);
        this.field4993 = this.field5001.field4623;
        this.field5006 = arg2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIII)V", line = 37)
    public final void method2024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 <= 85) {
            method2028((byte) 58, -25L);
        }
        this.field5000 = arg0;
        this.field5004 = arg2;
        this.field5002 = arg4;
        this.field4991 = arg7;
        this.field5012 = arg5;
        this.field4984 = arg1;
        this.field5011 = arg9;
        this.field5013 = arg6;
        this.field4986 = arg8;
        int var11 = (this.field5000 + this.field4984 + this.field5011) / 3 + this.field4983.field2812;
        int var12 = (this.field5002 + this.field4991 + this.field4986) / 3 + this.field4983.field2807;
        field4985++;
        int var13 = (this.field5013 + this.field5012 + this.field5004) / 3 + this.field4983.field2809;
        if (this.field5005 != var12 || this.field4988 != var11 || this.field4996 != var13) {
            this.field4996 = var13;
            this.field5005 = var12;
            this.field4988 = var11;
            this.field4976 = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZJII)V", line = 74)
    public final void method2025(int arg0, int arg1, boolean arg2, long arg3, int arg4, int arg5) {
        if (this.field4979) {
            arg2 = false;
        } else if (this.field4993.field4126 > class164.field2800) {
            arg2 = false;
        } else if (this.field5002 == this.field4986 && this.field4991 == this.field4986 && this.field5000 == this.field4984 && this.field5011 == this.field4984 && this.field5013 == this.field5004 && this.field5013 == this.field5012) {
            arg2 = false;
        } else if (this.field4993.field4116 != -1) {
            int var8 = (int) (arg3 - this.field5006);
            if (this.field4993.field4124 || var8 <= this.field4993.field4116) {
                var8 %= this.field4993.field4116;
            } else {
                arg2 = false;
            }
            if (!this.field4993.field4103 && this.field4993.field4125 > var8) {
                arg2 = false;
            }
            if (this.field4993.field4103 && this.field4993.field4125 <= var8) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field4987 += (int) (((double) this.field4993.field4101 + Math.random() * (double) (this.field4993.field4136 - this.field4993.field4101)) * (double) arg1);
            if (this.field4987 > 63) {
                int var9 = this.field4987 >> 6;
                this.field4987 &= 0x3F;
                if (this.field4976) {
                    int var10 = this.field4986 - this.field5002;
                    int var11 = this.field4984 - this.field5000;
                    int var12 = this.field5013 - this.field5004;
                    int var13 = this.field5011 - this.field5000;
                    int var14 = this.field4991 - this.field5002;
                    int var15 = this.field5012 - this.field5004;
                    this.field4994 = var11 * var15 - (var12 * var13);
                    this.field5007 = var12 * var14 - (var10 * var15);
                    this.field4980 = var10 * var13 - var11 * var14;
                    while (true) {
                        if (this.field4994 <= 32767 && this.field5007 <= 32767 && this.field4980 <= 32767 && this.field4994 >= -32767 && this.field5007 >= -32767 && this.field4980 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field4980 * this.field4980 + this.field5007 * this.field5007 + this.field4994 * this.field4994));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field4994 = this.field4994 * 32767 / var16;
                            this.field5007 = this.field5007 * 32767 / var16;
                            this.field4980 = this.field4980 * 32767 / var16;
                            if (this.field4993.field4096 > 0 || this.field4993.field4115 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field4980, (double) this.field4994) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) (this.field4994 * this.field4994 + this.field4980 * this.field4980), (double) this.field5007) * 2047.0D / 6.283185307179586D);
                                int var20 = var18 - this.field4983.field2803;
                                this.field4998 = this.field4993.field4115 - this.field4993.field4106;
                                this.field4992 = var19 + this.field4993.field4106 - (this.field4998 / 2);
                                this.field4982 = this.field4993.field4096 - this.field4993.field4129;
                                this.field4989 = this.field4993.field4129 + var20 - (this.field4982 / 2);
                            } else if (this.field4983.field2803 != 0) {
                                int var17 = this.field4980 * arg0 + (this.field4994 * arg4) >> 16;
                                this.field4980 = this.field4980 * arg4 - (this.field4994 * arg0) >> 16;
                                this.field4994 = var17;
                            }
                            this.field4976 = false;
                            break;
                        }
                        this.field5007 >>= 0x1;
                        this.field4980 >>= 0x1;
                        this.field4994 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = this.field4994;
                    int var23 = this.field5007;
                    int var24 = this.field4980;
                    if (this.field4993.field4096 > 0 || this.field4993.field4115 > 0) {
                        int var25 = this.field4989 + (int) (Math.random() * (double) this.field4982);
                        int var26 = this.field4992 + (int) (Math.random() * (double) this.field4998);
                        int var27 = var26 & 0x3FF;
                        int var28 = var25 & 0x7FF;
                        int var29 = class227.field3896[var28] >> 1;
                        int var30 = class227.field3911[var28] >> 1;
                        int var31 = class227.field3896[var27] >> 1;
                        int var32 = class227.field3911[var27] >> 1;
                        var23 = var32 * -1;
                        var22 = var30 * var31 >> 16;
                        var24 = var29 * var31 >> 16;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var35 - var33;
                    int var37 = this.field5002 * var33 + (this.field4986 * var35) + (this.field4991 * var36) >> 8;
                    int var38 = this.field5000 * var33 + (this.field4984 * var35 + (this.field5011 * var36)) >> 8;
                    int var39 = this.field5004 * var33 + this.field5013 * var35 + this.field5012 * var36 >> 8;
                    if (this.field4983.field2803 != 0) {
                        int var40 = arg0 * var39 + arg4 * var37 >> 16;
                        var39 = arg4 * var39 - arg0 * var37 >> 16;
                        var37 = var40;
                    }
                    int var41 = this.field4993.field4092 + (int) (Math.random() * (double) (this.field4993.field4097 - this.field4993.field4092));
                    int var42 = (int) ((double) (this.field4993.field4105 - this.field4993.field4145) * Math.random()) + this.field4993.field4145;
                    int var45;
                    if (this.field4993.field4150) {
                        double var43 = Math.random();
                        var45 = (int) ((double) this.field4993.field4122 * var43 + (double) this.field4993.field4102) << 24 | (int) ((double) this.field4993.field4107 * var43 + (double) this.field4993.field4094) | (int) ((double) this.field4993.field4111 * var43 + (double) this.field4993.field4112) << 16 | (int) ((double) this.field4993.field4137 * var43 + (double) this.field4993.field4100) << 8;
                    } else {
                        var45 = (int) ((double) this.field4993.field4112 + Math.random() * (double) this.field4993.field4111) << 16 | (int) ((double) this.field4993.field4100 + Math.random() * (double) this.field4993.field4137) << 8 | (int) ((double) this.field4993.field4107 * Math.random() + (double) this.field4993.field4094) | (int) ((double) this.field4993.field4122 * Math.random() + (double) this.field4993.field4102) << 24;
                    }
                    if (class164.field2790 == class164.field2779) {
                        new class181(this, this.field4983.field2807 + var37, this.field4983.field2812 + var38, this.field4983.field2809 + var39, var22, var23, var24, var41, var42, var45);
                    } else {
                        class181 var47 = class164.field2774[class164.field2779];
                        class164.field2779 = class164.field2779 + 1 & 0x3FF;
                        var47.method1247(this, this.field4983.field2807 + var37, this.field4983.field2812 + var38, this.field4983.field2809 + var39, var22, var23, var24, var41, var42, var45);
                    }
                }
            }
        }
        field4997++;
        this.field5008 = 0;
        if (arg5 != -714) {
            method2030((byte) -89);
        }
        for (class181 var48 = (class181) this.field5010.method840(-128); var48 != null; var48 = (class181) this.field5010.method839((byte) 43)) {
            var48.method1245(arg3, arg1);
            this.field5008++;
        }
        class164.field2787 += this.field5008;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIIII)V", line = 305)
    public static final void method2026(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class289.field4942 = arg6;
        field4995++;
        class315.field5340 = arg4;
        class150.field2593 = arg0;
        class295.field5039 = arg3;
        class84.field1602 = arg2;
        if (arg5 != 487899496) {
            method2028((byte) -122, -54L);
        }
        if (arg1 && class295.field5039 >= 100) {
            class243.field4301 = class150.field2593 * 128 + 64;
            class97.field1721 = class84.field1602 * 128 + 64;
            class107.field1881 = class282.method1984((byte) -117, class243.field4301, class97.field1721, class16.field254) - class289.field4942;
        }
        class74.field1405 = 2;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 336)
    public static final void method2027(int arg0) {
        field5009++;
        class111.field1951.method226((byte) -118);
        class118.field2101.method226((byte) -123);
        class183.field3159.method226((byte) -108);
        if (arg0 != 0) {
            field4978 = (class159) null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BJ)V", line = 349)
    public static final void method2028(byte arg0, long arg1) {
        field4990++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class113.field2044 < 100 || class24.field450) || class113.field2044 >= 200) {
            class28.method245((byte) -75, 0, class331.field5638, class105.field1820);
            return;
        }
        class229 var3 = class252.method1800(false, arg1).method1606((byte) 93);
        for (int var4 = 0; var4 < class113.field2044; var4++) {
            if (class31.field536[var4] == arg1) {
                class28.method245((byte) -75, 0, class331.field5638, class142.method989(new class229[] { var3, class42.field760 }, -98));
                return;
            }
        }
        for (int var5 = 0; var5 < class162.field2753; var5++) {
            if (class212.field3643[var5] == arg1) {
                class28.method245((byte) -75, 0, class331.field5638, class142.method989(new class229[] { class6.field69, var3, class174.field3040 }, -126));
                return;
            }
        }
        int var6 = -28 / ((arg0 + 26) / 51);
        if (var3.method1641((byte) -64, class301.field5124.field621)) {
            class28.method245((byte) -75, 0, class331.field5638, class165.field2821);
            return;
        }
        class206.field3593++;
        class74.field1403[class113.field2044] = var3;
        class31.field536[class113.field2044] = arg1;
        class12.field145[class113.field2044] = 0;
        class321.field5426[class113.field2044] = class331.field5638;
        class240.field4231[class113.field2044] = 0;
        class48.field873[class113.field2044] = false;
        class258.field4491 = class6.field70;
        class113.field2044++;
        class84.field1608.method1397(47, 0);
        class84.field1608.method118(arg1, (byte) -127);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)I", line = 417)
    public static final int method2029(int arg0, byte arg1) {
        field4981++;
        if (arg1 != -30) {
            field4978 = (class159) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V", line = 430)
    public static void method2030(byte arg0) {
        field4978 = null;
        int var1 = -17 / ((41 - arg0) / 63);
        field5003 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)V", line = 440)
    public static final void method2031(int arg0, byte arg1, int arg2, int arg3) {
        field4999++;
        class67 var4 = class189.method1305(arg2, 2048, arg0);
        int var5 = 63 / ((arg1 - 24) / 60);
        if (var4 != null && var4.field1172 != null) {
            class192 var6 = new class192();
            var6.field3327 = var4;
            var6.field3324 = var4.field1172;
            class215.method1477(-19319, var6);
        }
        class324.field5471 = arg3;
        class232.field4035 = arg0;
        class273.field4677 = true;
        class157.field2693 = arg2;
        class194.method1328((byte) -95, var4);
    }
}
