import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class180 extends class154 {

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lcf;")
    public static class93 field3167 = class147.method1066("::fps ", -48);

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lcf;")
    public static class93 field3169 = class147.method1066("M-Bmoire en cours d(Wattribution", -48);

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3173 = 1;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lcf;")
    public static class93 field3166 = class147.method1066(")1a2)1m", -48);

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field3177 = 0;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lcf;")
    public static class93 field3178 = class147.method1066("headicons_prayer", -48);

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lnl;")
    public static class95 field3171;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[[[I")
    public static int[][][] field3174;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLhg;Lhg;BLmd;)V")
    public static final void method1321(boolean arg0, class177 arg1, class177 arg2, byte arg3, class221 arg4) {
        class110.field1883 = arg2;
        class40.field622 = arg1;
        field3170++;
        class124.field2211 = arg0;
        int var5 = class40.field622.method1279(-1) - 1;
        class186.field3435 = var5 * 256 + class40.field622.method1283(var5, -5357);
        class34.field536 = new class93[] { null, null, null, null, class228.field4093 };
        int var6 = -16 / ((14 - arg3) / 51);
        class169.field2982 = new class93[] { null, null, class234.field4180, null, null };
        class19.field262 = arg4;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)I")
    public static final int method1322(int arg0, byte arg1) {
        double var2 = (double) ((arg0 & 0xFF64B9) >> 16) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var6 > var2) {
            var8 = var6;
        }
        field3172++;
        double var10 = 0.0D;
        double var12 = 0.0D;
        if (var8 < var4) {
            var8 = var4;
        }
        double var14 = var2;
        if (var2 > var6) {
            var14 = var6;
        }
        if (var4 < var14) {
            var14 = var4;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var10 = (var8 - var14) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var10 = (var8 - var14) / (2.0D - var8 - var14);
            }
            if (var2 == var8) {
                var12 = (var6 - var4) / (var8 - var14);
            } else if (var6 == var8) {
                var12 = (var4 - var2) / (var8 - var14) + 2.0D;
            } else if (var4 == var8) {
                var12 = (var2 - var6) / (var8 - var14) + 4.0D;
            }
        }
        int var18 = (int) (var16 * 256.0D);
        double var19 = var12 / 6.0D;
        if (arg1 <= 122) {
            field3167 = null;
        }
        int var21 = (int) (var10 * 256.0D);
        int var22 = (int) (var19 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var21 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1323(boolean arg0) {
        field3174 = null;
        field3169 = null;
        field3166 = null;
        field3171 = null;
        if (arg0) {
            field3167 = null;
        }
        field3167 = null;
        field3178 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)J")
    public static final long method1324(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field645; var4++) {
            class229 var5 = var3.field637[var4];
            if ((var5.field4094 >> 29 & 0x3L) == 2L && var5.field4095 == arg1 && var5.field4099 == arg2) {
                return var5.field4094;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1325(int arg0) {
        for (int var1 = 0; var1 < class138.field2407; var1++) {
            int var2 = class264.field4708[var1];
            class227 var3 = class155.field2709[var2];
            int var4 = class250.field4504.method1907(arg0 - 10327);
            if ((var4 & 0x80) != 0) {
                var4 += class250.field4504.method1907(16832) << 8;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class250.field4504.method1879(1483502360);
                int var6 = class250.field4504.method1879(1483502360);
                var3.method1485(class275.field4921, var6, (byte) -106, var5);
            }
            if ((var4 & 0x10) != 0) {
                var3.field3841 = class250.field4504.method1877((byte) -26);
                if (var3.field3841 == 65535) {
                    var3.field3841 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class250.field4504.method1876((byte) -82);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class250.field4504.method1890(false);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var10[var11] = class250.field4504.method1876((byte) -82);
                    var9[var11] = class250.field4504.method1890(false);
                }
                class54.method301(arg0 ^ 0x2E40, var9, var8, var3, var10);
            }
            if ((var4 & 0x40) != 0) {
                var3.field3792 = class250.field4504.method1889((byte) -67);
                var3.field3773 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field3865 = class250.field4504.method1909((byte) 92);
                var3.field3826 = class250.field4504.method1890(false);
            }
            if ((var4 & 0x1) != 0) {
                int var13 = class250.field4504.method1877((byte) -26);
                int var14 = class250.field4504.method1876((byte) -82);
                if (var13 == 65535) {
                    var13 = -1;
                }
                class164.method1187(var13, var14, var3, (byte) 120);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field4062.method1048(arg0 ^ 0xFFFFB511)) {
                    class213.method1505(-1, var3);
                }
                var3.method1561(class5.method19((byte) -59, class250.field4504.method1909((byte) 107)), 14579);
                var3.method1479(var3.field4062.field2504, arg0 - 27160);
                var3.field3861 = var3.field4062.field2533;
                if (var3.field4062.method1048(-8442)) {
                    class159.method1146((class237) null, var3, (class240) null, (byte) -128, var3.field3820[0], class138.field2405, 0, var3.field3805[0]);
                }
            }
            if ((var4 & 0x20) != 0) {
                int var15 = class250.field4504.method1879(1483502360);
                int var16 = class250.field4504.method1879(1483502360);
                var3.method1485(class275.field4921, var16, (byte) -106, var15);
                var3.field3772 = class275.field4921 + 300;
                var3.field3855 = class250.field4504.method1907(arg0 - 10327);
            }
            if ((var4 & 0x4) != 0) {
                boolean var17 = true;
                int var18 = class250.field4504.method1891(-120);
                int var19 = class250.field4504.method1871(-115);
                if (var18 == 65535) {
                    var18 = -1;
                }
                if (var18 != -1 && var3.field3846 != -1 && class131.method964(class188.method1359(var18, arg0 ^ 0xFFFF9588).field2352, true).field475 < class131.method964(class188.method1359(var3.field3846, -109).field2352, true).field475) {
                    var17 = false;
                }
                if (var17) {
                    var3.field3844 = var19 >> 16;
                    var3.field3847 = 0;
                    var3.field3798 = 0;
                    var3.field3829 = 1;
                    var3.field3846 = var18;
                    var3.field3802 = (var19 & 0xFFFF) + class275.field4921;
                    if (class275.field4921 < var3.field3802) {
                        var3.field3847 = -1;
                    }
                    if (var3.field3846 != -1 && class275.field4921 == var3.field3802) {
                        int var20 = class188.method1359(var3.field3846, -99).field2352;
                        if (var20 != -1) {
                            class31 var21 = class131.method964(var20, true);
                            if (var21 != null && var21.field479 != null) {
                                class55.method309(var3.field3784, 0, var21, var3.field3868, arg0 - 44633, false);
                            }
                        }
                    }
                }
            }
        }
        field3176++;
        if (arg0 != 27159) {
            method1322(113, (byte) -115);
        }
    }
}
