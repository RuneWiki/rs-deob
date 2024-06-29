import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class162 extends class76 {

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    private int field2835 = 2048;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    private int field2844 = 2;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
    private int field2847 = 0;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    private int field2840 = 5;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "[S")
    private short[] field2842 = new short[512];

    @OriginalMember(owner = "client!qg", name = "ob", descriptor = "I")
    private int field2851 = 1;

    @OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
    private int field2852 = 5;

    @OriginalMember(owner = "client!qg", name = "rb", descriptor = "[B")
    private byte[] field2854 = new byte[512];

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "Lia;")
    public static class257 field2848 = class28.method234(-62, "<col=ffff00>");

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
    public static int field2846 = 0;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "I")
    private static int field2849;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!qg", name = "qb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "[I")
    public static int[] field2837;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIILei;I)Lei;")
    public static final class168 method1121(int arg0, int arg1, int arg2, int arg3, int arg4, class168 arg5, int arg6) {
        long var7 = (long) arg3;
        if (arg6 >= -5) {
            field2846 = -3;
        }
        ++field2850;
        class168 var9 = (class168) class158.field2761.method836(-119, var7);
        if (var9 == null) {
            class67 var10 = class67.method495(class175.field2991, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method506(64, 768, -50, -10, -50);
            class158.field2761.method832(var9, var7, 0);
        }
        int var11 = arg5.method1142();
        int var12 = arg5.method1138();
        int var13 = arg5.method1139();
        int var14 = arg5.method1147();
        class168 var15 = var9.method1140(true, true);
        if (arg1 != 0) {
            var15.method1154(arg1);
        }
        class232 var16 = (class232) var15;
        if (arg2 != class109.method803(class189.field3261, arg0 + var13, (byte) -118, arg4 + var11) || class109.method803(class189.field3261, arg0 + var14, (byte) 110, arg4 + var12) != arg2) {
            for (int var17 = 0; ~var17 > ~var16.field3889; ++var17) {
                var16.field3912[var17] += class109.method803(class189.field3261, var16.field3911[var17] + arg0, (byte) 104, var16.field3895[var17] + arg4) - arg2;
            }
            var16.field3920 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        this.field2854 = class34.method291(this.field2847, arg0 + 144);
        this.method1124(96);
        if (arg0 != 111) {
            this.method169(-66, -114);
        }
        ++field2839;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILib;II)V")
    public static final void method1122(int arg0, class180 arg1, int arg2, int arg3) {
        ++field2845;
        if ((32 & arg3) != 0) {
            arg1.field4171 = class40.field827.method1067(515473640);
            if (arg1.field4171 == 65535) {
                arg1.field4171 = -1;
            }
        }
        if (~(arg3 & 1) != -1) {
            arg1.field4184 = class40.field827.method1063(-17162);
            arg1.field4160 = class40.field827.method1063(-17162);
        }
        if ((256 & arg3) != 0) {
            arg1.field4172 = class40.field827.method1052(false);
            int var4 = class40.field827.method1022(-1);
            arg1.field4181 = 0;
            arg1.field4156 = var4 >> 16;
            if (~arg1.field4172 == -65536) {
                arg1.field4172 = -1;
            }
            arg1.field4150 = 0;
            arg1.field4186 = (var4 & 65535) + class7.field153;
            if (~arg1.field4186 < ~class7.field153) {
                arg1.field4150 = -1;
            }
        }
        if (arg2 >= -105) {
            field2836 = -47;
        }
        if ((512 & arg3) != 0) {
            int var5 = class40.field827.method1051((byte) 110);
            int var6 = class40.field827.method1051((byte) 85);
            arg1.method1581(class7.field153, var5, var6, -95);
        }
        if (~(128 & arg3) != -1) {
            int var7 = class40.field827.method1051((byte) 116);
            byte[] var8 = new byte[var7];
            class152 var9 = new class152(var8);
            class40.field827.method1077(var7, -117, var8, 0);
            class91.field1735[arg0] = var9;
            arg1.method1237(false, var9);
        }
        if ((2 & arg3) != 0) {
            int var10 = class40.field827.method1052(false);
            int var11 = class40.field827.method1045((byte) 119);
            int var12 = class40.field827.method1021((byte) -128);
            int var13 = class40.field827.field2677;
            boolean var14 = (var10 & 32768) != 0;
            if (arg1.field3140 != null && arg1.field3108 != null) {
                long var15 = arg1.field3140.method1668(111);
                boolean var17 = false;
                if (var11 <= 1) {
                    if (!var14 && (class87.field1673 == 1 || class201.field3444 == 1)) {
                        var17 = true;
                    } else {
                        for (int var18 = 0; ~class185.field3215 < ~var18; ++var18) {
                            if (class175.field2981[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var17 && class226.field3800 == 0) {
                    class28.field532.field2677 = 0;
                    class40.field827.method1037(class28.field532.field2638, 0, (byte) 115, var12);
                    int var19 = -1;
                    class28.field532.field2677 = 0;
                    class257 var20;
                    if (!var14) {
                        var20 = class107.method770(class203.method1370(class28.field532, (byte) -68).method1682(-18259));
                    } else {
                        var10 &= 32767;
                        class259 var21 = class124.method866(class28.field532, false);
                        var19 = var21.field4496;
                        var20 = var21.field4505.method1382(0, class28.field532);
                    }
                    arg1.field4168 = var20.method1716((byte) 106);
                    arg1.field4138 = 150;
                    arg1.field4164 = var10 >> 8;
                    arg1.field4141 = 255 & var10;
                    if (~var11 != -3) {
                        if (var11 != 1) {
                            class115.method823(var19, arg1.field3140, var14 ? 17 : 2, var20, -104, (class257) null);
                        } else {
                            class115.method823(var19, class233.method1528(new class257[] { class173.field2963, arg1.field3140 }, 0), var14 ? 17 : 1, var20, -120, (class257) null);
                        }
                    } else {
                        class115.method823(var19, class233.method1528(new class257[] { class72.field1412, arg1.field3140 }, 0), !var14 ? 1 : 17, var20, -121, (class257) null);
                    }
                }
            }
            class40.field827.field2677 = var12 + var13;
        }
        if (~(1024 & arg3) != -1) {
            arg1.field4161 = class40.field827.method1021((byte) 31);
            arg1.field4134 = class40.field827.method1051((byte) 96);
            arg1.field4153 = class40.field827.method1045((byte) 119);
            arg1.field4147 = class40.field827.method1021((byte) -125);
            arg1.field4155 = class40.field827.method1067(515473640) - -class7.field153;
            arg1.field4122 = class40.field827.method1041((byte) 99) + class7.field153;
            arg1.field4130 = class40.field827.method1051((byte) -77);
            arg1.field4167 = 0;
            arg1.field4148 = 1;
        }
        if (~(arg3 & 8) != -1) {
            int var22 = class40.field827.method1067(515473640);
            int var23 = class40.field827.method1051((byte) -48);
            if (~var22 == -65536) {
                var22 = -1;
            }
            class120.method845((byte) 42, var23, var22, arg1);
        }
        if (~(64 & arg3) != -1) {
            arg1.field4168 = class40.field827.method1039(1995);
            if (arg1.field4168.method1688(123, 0) != 126) {
                if (class137.field2441 == arg1) {
                    class197.method1317(-56, 2, arg1.field4168, arg1.field3140);
                }
            } else {
                arg1.field4168 = arg1.field4168.method1674(1, 255);
                class197.method1317(-121, 2, arg1.field4168, arg1.field3140);
            }
            arg1.field4138 = 150;
            arg1.field4164 = 0;
            arg1.field4141 = 0;
        }
        if ((16 & arg3) != 0) {
            int var24 = class40.field827.method1045((byte) 117);
            int var25 = class40.field827.method1021((byte) 62);
            arg1.method1581(class7.field153, var24, var25, -70);
            arg1.field4158 = class7.field153 + 300;
            arg1.field4137 = class40.field827.method1021((byte) 125);
        }
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
    public static void method1123(int arg0) {
        if (arg0 != 65535) {
            method1123(15);
        }
        field2837 = null;
        field2848 = null;
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "(I)V")
    private final void method1124(int arg0) {
        ++field2838;
        Random var2 = new Random((long) this.field2847);
        this.field2842 = new short[512];
        if (this.field2835 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2842[var3] = (short) class8.method112(var2, this.field2835, -125);
            }
        }
        if (arg0 <= 76) {
            this.field2851 = 108;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 < -86) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (arg2 == 6) {
                                        this.field2852 = arg0.method1051((byte) 109);
                                    }
                                } else {
                                    this.field2840 = arg0.method1051((byte) 108);
                                }
                            } else {
                                this.field2851 = arg0.method1051((byte) -66);
                            }
                        } else {
                            this.field2844 = arg0.method1051((byte) -105);
                        }
                    } else {
                        this.field2835 = arg0.method1063(-17162);
                    }
                } else {
                    this.field2847 = arg0.method1051((byte) 97);
                }
            } else {
                this.field2840 = this.field2852 = arg0.method1051((byte) 121);
            }
            ++field2843;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2853;
        if (arg0 != -9351) {
            this.method209((byte) -42);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int var4 = class10.field197[arg1] * this.field2852 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class96.field1807 > var7; ++var7) {
                class125.field2236 = Integer.MAX_VALUE;
                field2849 = Integer.MAX_VALUE;
                class50.field1110 = Integer.MAX_VALUE;
                class219.field3700 = Integer.MAX_VALUE;
                int var8 = class137.field2457[var7] * this.field2840 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field2854[255 & (this.field2852 <= var11 ? -this.field2852 + var11 : var11)] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field2854[255 & var13 - -(~this.field2840 >= ~var14 ? var14 - this.field2840 : var14)]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2842[var15] + var8;
                        int var17 = -this.field2842[var27] + var4 + -(var11 << 12);
                        int var18 = this.field2851;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class219.field3700 >= ~var19) {
                            if (var19 >= class50.field1110) {
                                if (~field2849 >= ~var19) {
                                    if (class125.field2236 > var19) {
                                        class125.field2236 = var19;
                                    }
                                } else {
                                    class125.field2236 = field2849;
                                    field2849 = var19;
                                }
                            } else {
                                class125.field2236 = field2849;
                                field2849 = class50.field1110;
                                class50.field1110 = var19;
                            }
                        } else {
                            class125.field2236 = field2849;
                            field2849 = class50.field1110;
                            class50.field1110 = class219.field3700;
                            class219.field3700 = var19;
                        }
                    }
                }
                int var12 = this.field2844;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class219.field3700 + class50.field1110;
                                }
                            } else {
                                var3[var7] = class125.field2236;
                            }
                        } else {
                            var3[var7] = field2849;
                        }
                    } else {
                        var3[var7] = class50.field1110;
                    }
                } else {
                    var3[var7] = class219.field3700;
                }
            }
        }
        return var3;
    }
}
