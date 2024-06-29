import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class353 extends class335 {

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    private int field4699 = 4096;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    private int field4701 = 0;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    private int field4703 = 8192;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    private int field4709 = 2048;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field4707 = 12288;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    private int field4711 = 0;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    private int field4713 = 2048;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "Lsk;")
    public static class452 field4712 = new class452(1);

    @OriginalMember(owner = "client!a", name = "S", descriptor = "[I")
    public static int[] field4714 = new int[1000];

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(III)Z")
    private final boolean method2082(int arg0, int arg1, int arg2) {
        if (arg1 != 9314) {
            this.field4699 = -55;
        }
        ++field4708;
        int var4 = (-arg2 + arg0) * this.field4707 >> 12;
        int var5 = class245.field3211[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4707;
        int var7 = (var6 << 12) / this.field4703;
        int var8 = this.field4699 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(ZI)V")
    public static final void method2083(boolean arg0, int arg1) {
        if (!arg0) {
            method2083(false, -72);
        }
        ++field4704;
        int var2 = class327.field4404 - class323.field4356;
        if (~var2 <= -101) {
            class83.field1004 = -1;
            class342.field4585 = -1;
            class311.field4200 = 1;
        } else {
            int var3 = (int) class475.field6610;
            if (~var3 > ~(class288.field3803 >> 8)) {
                var3 = class288.field3803 >> 8;
            }
            if (class149.field2028[4] && class122.field1589[4] + 128 > var3) {
                var3 = class122.field1589[4] + 128;
            }
            int var4 = 16383 & (int) class565.field7707 + class360.field4780;
            class461.method2581(class424.field5715, var4, arg1, class180.method1211(class298.field3942, arg0, class408.field5369.field398, class408.field5369.field397) + -200, (byte) 103, var3, class470.field6552, (var3 >> 3) * 3 + 600 << 2);
            float var5 = -((float) ((-var2 + 100) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
            class148.field1986 = (int) ((float) (-class490.field6784 + class148.field1986) * var5 + (float) class490.field6784);
            class147.field1980 = (int) ((float) (class147.field1980 - class65.field810) * var5 + (float) class65.field810);
            class558.field7615 = (int) ((float) (-class91.field1120 + class558.field7615) * var5 + (float) class91.field1120);
            class82.field946 = (int) ((float) (-class284.field3742 + class82.field946) * var5 + (float) class284.field3742);
            int var6 = -class292.field3856 + class604.field8440;
            if (~var6 < -8193) {
                var6 -= 16384;
            } else if (~var6 > 8191) {
                var6 += 16384;
            }
            class604.field8440 = (int) ((float) var6 * var5 + (float) class292.field3856);
            class604.field8440 &= 16383;
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(III)Z")
    private final boolean method2084(int arg0, int arg1, int arg2) {
        ++field4697;
        if (arg1 != -2049) {
            this.field4701 = -105;
        }
        int var4 = (arg0 + arg2) * this.field4707 >> 12;
        int var5 = class245.field3211[(var4 * 255 & 1045330) >> 12];
        int var6 = (var5 << 12) / this.field4707;
        int var7 = (var6 << 12) / this.field4703;
        int var8 = this.field4699 * var7 >> 12;
        return var8 > -arg0 + arg2 && ~(-var8) > ~(-arg0 + arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public static final int method2085(int arg0, int arg1) {
        ++field4705;
        double var2 = (double) (arg1 >> 16 & 255) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 255) / 256.0D;
        double var6 = (double) (255 & arg1) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (-var8 + var10);
            } else if (var4 == var10) {
                var12 = (-var2 + var6) / (-var8 + var10) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (2.0D - var10 + -var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 >= 0) {
            if (~var21 < -256) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 <= -1) {
            if (var22 > 255) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (arg0 < var22) {
            var21 >>= 4;
        } else if (var22 > 217) {
            var21 >>= 3;
        } else if (var22 > 192) {
            var21 >>= 2;
        } else if (~var22 < -180) {
            var21 >>= 1;
        }
        return (var21 >> 5 << 7) + ((255 & var20) >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            this.field4703 = 27;
        }
        ++field4710;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = class686.field9697[arg1] + -2048;
            for (int var5 = 0; ~class649.field8968 < ~var5; ++var5) {
                int var6 = class376.field4981[var5] + -2048;
                int var7 = this.field4709 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field4711 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field4701 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = var4 - -this.field4713;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method2082(var12, 9314, var9) && !this.method2084(var15, -2049, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field4706;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field4703 = arg1.method963(-118);
                                }
                            } else {
                                this.field4699 = arg1.method963(-125);
                            }
                        } else {
                            this.field4707 = arg1.method963(arg2 + -62);
                        }
                    } else {
                        this.field4713 = arg1.method963(arg2 ^ 60);
                    }
                } else {
                    this.field4701 = arg1.method963(-126);
                }
            } else {
                this.field4711 = arg1.method963(arg2 + -59);
            }
        } else {
            this.field4709 = arg1.method963(-128);
        }
        if (arg2 != -66) {
            this.method3(false, 92);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class353() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method2086(boolean arg0) {
        if (!arg0) {
            field4714 = null;
        }
        field4714 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(III)V")
    public static final void method2087(int arg0, int arg1, int arg2) {
        if (arg1 == -19472) {
            ++field4700;
            class256 var3 = class592.method3279((byte) -44, 12, arg0);
            var3.method1549(-32042);
            var3.field3358 = arg2;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
    public static final void method2088(byte arg0) {
        class99.field1196 = null;
        class596.field8217 = null;
        class138.field1880 = null;
        class55.field720 = null;
        class121.field1581 = null;
        class237.field3134 = null;
        class623.field8633 = null;
        class364.field4808 = null;
        ++field4698;
        class622.field8625 = null;
        class116.field1489 = null;
        class452.field5968 = null;
        class436.field5813 = null;
        class274.field3655 = null;
        if (arg0 != 28) {
            field4712 = null;
        }
        class158.field2268 = null;
        class401.field5319 = null;
        class410.field5399 = null;
        class369.field4849 = null;
        class399.field5300 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        class420.method2371(10779);
        ++field4702;
        int var2 = 10 % ((arg0 - 58) / 60);
    }
}
