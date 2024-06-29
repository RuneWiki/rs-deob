import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class360 extends class266 {

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "Z")
    public boolean field5453 = false;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "Z")
    public boolean field5456 = false;

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "Z")
    public static boolean field5458 = false;

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "[I")
    public static int[] field5462;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "F")
    public static float field5460;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    public static int field5459;

    static {
        new class332("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field5462 = new int[13];
        field5461 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)Z", line = 5)
    public final boolean method2206(int arg0, boolean arg1) {
        ++field5455;
        if (arg1) {
            this.field5456 = false;
        }
        return ~arg0 == -1 ? super.field3926 : true;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Llk;", line = 21)
    public static final class290 method2207(int arg0) {
        ++field5452;
        if (class189.field2885 != null && class110.field1562 != null) {
            for (class290 var1 = (class290) class110.field1562.method860(0); var1 != null; var1 = (class290) class110.field1562.method860(0)) {
                class94 var2 = class189.field2877.method1111(var1.field4401, -13516);
                if (var2 != null && var2.field1331 && var2.method727(-1, class189.field2876)) {
                    return var1;
                }
            }
            if (arg0 >= -105) {
                method2215(1);
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILng;)V", line = 50)
    public final void method2208(int arg0, class153 arg1) {
        ++field5454;
        class223 var3 = null;
        try {
            class397 var4 = arg1.method1030(-8026);
            while (var4.field5822 == 0) {
                class325.method2005(true, 1L);
            }
            if (var4.field5822 == 1) {
                var3 = (class223) var4.field5823;
                class446 var5 = this.method2210(1);
                var3.method1454((byte) 97, var5.field6316, var5.field6315, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1458((byte) 105);
            }
        } catch (Exception var6) {
        }
        if (arg0 >= -5) {
            field5461 = 32;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z", line = 88)
    public final boolean method2209(int arg0, int arg1) {
        ++field5450;
        int var3 = 53 / ((arg1 - -32) / 34);
        return arg0 == 0 && !this.field5456 ? super.field3926 : true;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Lre;", line = 103)
    public final class446 method2210(int arg0) {
        ++field5448;
        class446 var2 = new class446(39);
        var2.method2619((byte) 11, 16);
        var2.method2619((byte) -128, super.field3932);
        var2.method2619((byte) -122, !super.field3926 ? 0 : 1);
        var2.method2619((byte) 55, !super.field3928 ? 0 : 1);
        var2.method2619((byte) -123, super.field3937 ? 1 : 0);
        var2.method2619((byte) 126, super.field3939 ? 1 : 0);
        var2.method2619((byte) -4, 0);
        var2.method2619((byte) 14, !super.field3929 ? 0 : 1);
        var2.method2619((byte) 85, super.field3927 ? 1 : 0);
        var2.method2619((byte) -125, !super.field3938 ? 0 : 1);
        var2.method2619((byte) -128, super.field3952);
        var2.method2619((byte) 116, super.field3957 ? 1 : 0);
        var2.method2619((byte) 20, super.field3933 ? 1 : 0);
        if (arg0 != 1) {
            method2214((String) null, -51);
        }
        var2.method2619((byte) 91, super.field3924 ? 1 : 0);
        var2.method2619((byte) 98, super.field3941);
        var2.method2619((byte) 23, !super.field3936 ? 0 : 1);
        var2.method2619((byte) -119, super.field3949);
        var2.method2619((byte) 108, super.field3946);
        var2.method2619((byte) 92, super.field3934);
        var2.method2592(super.field3944, (byte) -119);
        var2.method2592(super.field3948, (byte) -126);
        var2.method2619((byte) -126, class197.method1343(118));
        var2.method2596((byte) -97, super.field3923);
        var2.method2619((byte) -123, super.field3947);
        var2.method2619((byte) 3, super.field3931 ? 1 : 0);
        var2.method2619((byte) -119, !super.field3942 ? 0 : 1);
        var2.method2619((byte) -119, super.field3951);
        var2.method2619((byte) -121, super.field3922 ? 1 : 0);
        var2.method2619((byte) -126, super.field3925 ? 1 : 0);
        var2.method2619((byte) 88, super.field3943);
        var2.method2619((byte) -119, super.field3945 ? 1 : 0);
        var2.method2619((byte) -123, super.field3935);
        var2.method2619((byte) 52, super.field3953);
        var2.method2619((byte) -125, !super.field3950 ? 1 : 0);
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lng;)V", line = 428)
    public class360(class153 arg0) {
        super.field3932 = 3;
        this.method2211(true, 22974);
        super.field3941 = 0;
        super.field3949 = 127;
        super.field3929 = true;
        super.field3957 = true;
        super.field3943 = 1;
        super.field3948 = 0;
        super.field3952 = 2;
        super.field3928 = true;
        super.field3927 = true;
        super.field3930 = 0;
        super.field3936 = true;
        super.field3939 = true;
        super.field3938 = true;
        super.field3934 = 127;
        super.field3937 = true;
        super.field3944 = 0;
        super.field3924 = true;
        super.field3946 = 255;
        super.field3933 = true;
        if (class45.field646 < 96) {
            class36.method288((byte) 43, 0);
        } else {
            class36.method288((byte) 63, 2);
        }
        super.field3942 = false;
        super.field3953 = class469.field6604 != 1 ? 4 : 2;
        super.field3931 = false;
        super.field3922 = false;
        super.field3945 = true;
        super.field3925 = true;
        super.field3923 = 0;
        super.field3947 = 2;
        super.field3951 = 0;
        super.field3935 = 2;
        class223 var2 = null;
        try {
            class397 var3 = arg0.method1030(-8026);
            while (var3.field5822 == 0) {
                class325.method2005(true, 1L);
            }
            if (var3.field5822 == 1) {
                var2 = (class223) var3.field5823;
                byte[] var4 = new byte[(int) var2.method1457((byte) 91)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method1455(-124, var4, var4.length - var5, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2212(new class446(var4), -2);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1458((byte) 66);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)V", line = 156)
    public final void method2211(boolean arg0, int arg1) {
        if (arg1 != 22974) {
            field5460 = -0.5963893F;
        }
        ++field5459;
        super.field3926 = arg0;
        if (class206.field3124 != null) {
            class206.field3124.method344(true, !this.method2209(class170.field2424, -121));
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lre;I)V", line = 170)
    private final void method2212(class446 arg0, int arg1) {
        ++field5449;
        if (~(arg0.field6316.length + -arg0.field6315) <= -2) {
            int var3 = arg0.method2628(arg1 + 49154);
            if (var3 >= 0 && var3 <= 16) {
                byte var4;
                if (var3 == 16) {
                    var4 = 38;
                } else if (var3 == 15) {
                    var4 = 37;
                } else if (~var3 != -15) {
                    if (var3 != 13) {
                        if (~var3 != -13) {
                            if (~var3 != -12) {
                                if (~var3 == -11) {
                                    var4 = 32;
                                } else if (~var3 != -10) {
                                    if (var3 == 8) {
                                        var4 = 30;
                                    } else if (var3 != 7) {
                                        if (var3 == 6) {
                                            var4 = 28;
                                        } else if (var3 == 5) {
                                            var4 = 28;
                                        } else if (~var3 == -5) {
                                            var4 = 24;
                                        } else if (var3 == 3) {
                                            var4 = 23;
                                        } else if (var3 != 2) {
                                            if (var3 == 1) {
                                                var4 = 23;
                                            } else {
                                                var4 = 19;
                                            }
                                        } else {
                                            var4 = 22;
                                        }
                                    } else {
                                        var4 = 29;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 33;
                            }
                        } else {
                            var4 = 34;
                        }
                    } else {
                        var4 = 35;
                    }
                } else {
                    var4 = 36;
                }
                if (~var4 >= ~(arg0.field6316.length + -arg0.field6315)) {
                    super.field3932 = arg0.method2628(arg1 ^ -49154);
                    if (super.field3932 < 1) {
                        super.field3932 = 1;
                    } else if (~super.field3932 < -5) {
                        super.field3932 = 4;
                    }
                    this.method2211(~arg0.method2628(49152) == arg1, arg1 + 22976);
                    super.field3928 = arg0.method2628(arg1 ^ -49154) == 1;
                    super.field3937 = ~arg0.method2628(49152) == -2;
                    super.field3939 = ~arg0.method2628(49152) == -2;
                    super.field3943 = ~arg0.method2628(49152) == -2 ? 1 : 0;
                    super.field3929 = ~arg0.method2628(49152) == -2;
                    super.field3927 = ~arg0.method2628(49152) == -2;
                    super.field3938 = arg0.method2628(49152) == 1;
                    super.field3952 = arg0.method2628(49152);
                    if (~super.field3952 < -3) {
                        super.field3952 = 2;
                    }
                    if (~var3 > -3) {
                        super.field3957 = ~arg0.method2628(arg1 + 49154) == -2;
                        arg0.method2628(49152);
                    } else {
                        super.field3957 = arg0.method2628(49152) == 1;
                    }
                    super.field3933 = ~arg0.method2628(49152) == -2;
                    super.field3924 = ~arg0.method2628(49152) == -2;
                    super.field3941 = arg0.method2628(49152);
                    if (~super.field3941 < -3) {
                        super.field3941 = 2;
                    }
                    super.field3930 = super.field3941;
                    super.field3936 = arg0.method2628(49152) == 1;
                    super.field3949 = arg0.method2628(49152);
                    if (~super.field3949 < -128) {
                        super.field3949 = 127;
                    }
                    super.field3946 = arg0.method2628(49152);
                    super.field3934 = arg0.method2628(49152);
                    if (~super.field3934 < -128) {
                        super.field3934 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field3944 = arg0.method2631(2530);
                        super.field3948 = arg0.method2631(2530);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg0.method2628(49152);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method2628(49152);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class45.field646 > -97) {
                            var5 = 0;
                        }
                        class36.method288((byte) 81, var5);
                    }
                    if (var3 >= 5) {
                        super.field3923 = arg0.method2604(127);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field3947 = var6 = arg0.method2628(49152);
                    }
                    if (~super.field3947 != -2 && ~super.field3947 != -3) {
                        super.field3947 = 2;
                    }
                    if (var3 >= 7) {
                        super.field3931 = arg0.method2628(49152) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field3942 = arg0.method2628(49152) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field3951 = arg0.method2628(arg1 + 49154);
                    }
                    if (super.field3951 < 0 || ~super.field3951 < ~class263.method1733(class45.field646, 18795)) {
                        super.field3951 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field3922 = ~arg0.method2628(49152) != -1;
                    }
                    if (var3 >= 11) {
                        super.field3925 = arg0.method2628(49152) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field3943 = arg0.method2628(arg1 + 49154);
                    }
                    if (~super.field3943 > -1 || super.field3943 > 2) {
                        super.field3943 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field3945 = arg0.method2628(49152) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 != -1) {
                            super.field3935 = 1;
                        } else {
                            super.field3935 = 2;
                        }
                    } else {
                        super.field3935 = arg0.method2628(49152);
                    }
                    if (~super.field3935 > -1 || super.field3935 > 3) {
                        super.field3935 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field3953 = arg0.method2628(arg1 ^ -49154);
                        if (~super.field3953 > -1 || super.field3953 > 4) {
                            super.field3953 = ~class469.field6604 != -2 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field3950 = arg0.method2628(49152) != 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)I", line = 407)
    public final int method2213(int arg0, int arg1) {
        ++field5457;
        if (this.field5453) {
            return 0;
        } else if (!this.method2209(arg1, 58)) {
            return 1;
        } else {
            if (arg0 < 94) {
                this.method2209(-83, 103);
            }
            return super.field3928 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 511)
    public static final void method2214(String arg0, int arg1) {
        if (class362.field5480 == null) {
            class237.method1540((byte) -28);
        }
        if (arg1 != -15036) {
            method2207(-99);
        }
        ++field5451;
        String[] var2 = class3.method17(arg0, 11205, '\n');
        for (int var3 = 0; var2.length > var3; ++var3) {
            for (int var4 = class186.field2831; var4 > 0; --var4) {
                class362.field5480[var4] = class362.field5480[var4 + -1];
            }
            class362.field5480[0] = var2[var3];
            if (class362.field5480.length + -1 > class186.field2831) {
                ++class186.field2831;
                if (class230.field3391 > 0) {
                    ++class230.field3391;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 555)
    public static void method2215(int arg0) {
        field5462 = null;
        if (arg0 != -15406) {
            field5461 = -20;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lje;III)V", line = 566)
    public static final void method2216(class178 arg0, int arg1, int arg2, int arg3) {
        ++field5447;
        class401 var4 = arg0.method1235(class138.field1976, (byte) 28);
        if (var4 != null) {
            int var5 = -90 % ((85 - arg2) / 34);
            class138.field1976.method500(arg3, arg1, arg0.field2595 + arg3, arg0.field2589 + arg1);
            if (~class488.field6847 <= -4) {
                class138.field1976.method499(-16777216, var4, arg3, arg1);
            } else {
                class349.field5324.method1960((float) arg0.field2595 / 2.0F + (float) arg3, (float) arg0.field2589 / 2.0F + (float) arg1, 4096, (int) (-class384.field5682) << 2 & 65532, var4, arg3, arg1);
            }
        }
    }
}
