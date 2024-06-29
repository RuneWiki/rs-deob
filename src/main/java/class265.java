import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class265 extends class573 {

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
    private boolean field3686 = false;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Z")
    private boolean field3689;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[Lnp;")
    private class493[] field3688;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Z")
    public static boolean field3687 = true;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lrt;")
    public static class229 field3696 = class520.method2884(16966);

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lwu;")
    public static class376 field3699;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static final void method1600(int arg0) {
        ++field3692;
        if (class332.field4730 != null) {
            for (int var1 = 0; ~var1 > ~class356.field4995; ++var1) {
                class332.field4730[var1] = null;
            }
            class332.field4730 = null;
        }
        if (class550.field7257 != null) {
            for (int var2 = 0; ~var2 > ~class691.field9633; ++var2) {
                class550.field7257[var2] = null;
            }
            class550.field7257 = null;
        }
        if (class247.field3434 != null) {
            for (int var3 = 0; ~var3 > ~class383.field5368; ++var3) {
                class247.field3434[var3] = null;
            }
            class247.field3434 = null;
        }
        class44.field575 = null;
        class253.field3481 = null;
        if (arg0 != 16711680) {
            field3696 = null;
        }
        class64.field787 = null;
        class721.field10044 = -1;
        class758.field10556 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method1601(class184 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class588.field7675 != class507.field6771) {
            int var6 = class113.field1866[arg1].method1750((byte) 115, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class282 var8 = class113.field1866[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1750((byte) 118, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1740(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1739(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[[F[[S)[[S")
    public static final short[][] method1602(byte arg0, float[][] arg1, short[][] arg2) {
        if (arg0 != -110) {
            field3687 = true;
        }
        for (int var3 = 0; ~var3 > ~arg1.length; ++var3) {
            for (int var4 = 0; ~var4 > ~arg2[var3].length; ++var4) {
                arg2[var3][var4] = (short) ((int) (arg1[var3][var4] * 16383.0F));
            }
        }
        ++field3695;
        return arg2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public final void method602(int arg0, int arg1, int arg2) {
        if (this.field3686) {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method823(this.field3688[arg1 + -1], -8423);
            super.field7517.method934(0, (byte) -65);
        }
        ++field3694;
        if (arg0 != -26427) {
            method1605(-63);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            this.method607((class67) null, -111, (byte) 35);
        }
        ++field3698;
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V")
    public final void method611(boolean arg0, boolean arg1) {
        ++field3693;
        if (this.field3688 != null && arg1) {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method893(124, class716.field9864);
            class615 var3 = super.field7517.method916(0);
            var3.method1705(1024);
            super.field7517.method878(3, class180.field2729);
            if (this.field3689) {
                super.field7517.method849((byte) 112, class99.field1265, class759.field10559);
                super.field7517.method911(-8980, 0, class454.field6199, false, true);
                super.field7517.method845(class92.field1112, (byte) 92, 0);
            } else {
                super.field7517.method849((byte) 103, class312.field4469, class99.field1265);
                super.field7517.method840(0, -127, class227.field3230);
                super.field7517.method934(2, (byte) -65);
                super.field7517.method849((byte) 69, class99.field1265, class759.field10559);
                super.field7517.method840(0, 85, class227.field3230);
                super.field7517.method911(-8980, 1, class227.field3230, false, true);
                super.field7517.method845(class92.field1112, (byte) 123, 0);
                super.field7517.method823(super.field7517.field1809, -8423);
            }
            super.field7517.method934(0, (byte) -65);
            this.field3686 = true;
        } else {
            super.field7517.method845(class92.field1112, (byte) 108, 0);
        }
        if (!arg0) {
            this.method611(true, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lrv;)V")
    public class265(class111 arg0) {
        super(arg0);
        if (arg0.field1811) {
            this.field3689 = ~arg0.field1808 > -4;
            int var2 = this.field3689 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (~var14 == -3) {
                            var15 = var12;
                        } else if (~var14 != -4) {
                            if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field3688 = new class493[3];
            this.field3688[0] = super.field7517.method832((byte) -127, false, var4, 64);
            this.field3688[1] = super.field7517.method832((byte) -100, false, var5, 64);
            this.field3688[2] = super.field7517.method832((byte) -105, false, var3, 64);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static void method1603(byte arg0) {
        field3699 = null;
        if (arg0 != 64) {
            method1603((byte) -100);
        }
        field3696 = null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
    public static final void method1604(boolean arg0) {
        if (!arg0) {
            method1601((class184) null, 92, 82, 66, (boolean[]) null);
        }
        if (~class696.field9701 <= -1) {
            long var1 = class375.method2193(116);
            class696.field9701 = (int) ((long) class696.field9701 - (-class563.field7376 + var1));
            if (~class696.field9701 < -1) {
                int var3 = (class696.field9701 << 8) / class573.field7522;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class635.field8453 = ((65280 & class286.field4047) * var3 - -((class625.field8301.field3173 & 65280) * var4) & 16711680) + (-16711936 & (class286.field4047 & 16711935) * var3 + (class625.field8301.field3173 & 16711935) * var4) >>> 8;
                class580.field7602 = (class625.field8301.field3179 - class350.field4930) * var6 + class350.field4930;
                class329.field4694 = (-class603.field7926 + class625.field8301.field3176) * var6 + class603.field7926;
                class399.field5564 = (-class28.field444 + class625.field8301.field3178) * var6 + class28.field444;
                class326.field4662 = ((65280 & class114.field1870) * var3 + (65280 & class625.field8301.field3188) * var4 & 16711680) + ((16711935 & class114.field1870) * var3 + (16711935 & class625.field8301.field3188) * var4 & -16711936) >>> 8;
                class473.field6490 = (class625.field8301.field3187 - class511.field6788) * var6 + class511.field6788;
                class532.field7034 = class256.field3518 * var3 - -(class625.field8301.field3171 * var4) >> 8;
                class444.field6112 = (class625.field8301.field3169 - class417.field5760) * var6 + class417.field5760;
                class389.field5447 = (-class204.field3060 + class625.field8301.field3183) * var6 + class204.field3060;
                if (class178.field2688 != class625.field8301.field3174) {
                    class193.field2912 = class164.field2494.method429(class178.field2688, class625.field8301.field3174, var6, class193.field2912);
                }
            } else {
                class696.field9701 = -1;
                class326.field4662 = class625.field8301.field3188;
                class389.field5447 = class625.field8301.field3183;
                class193.field2912 = class625.field8301.field3174;
                class399.field5564 = class625.field8301.field3178;
                class532.field7034 = class625.field8301.field3171;
                class580.field7602 = class625.field8301.field3179;
                class444.field6112 = class625.field8301.field3169;
                class329.field4694 = class625.field8301.field3176;
                class473.field6490 = class625.field8301.field3187;
                class635.field8453 = class625.field8301.field3173;
            }
            class563.field7376 = var1;
        }
        ++field3700;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    public final void method610(boolean arg0, int arg1) {
        if (arg1 <= 109) {
            this.method602(-70, -66, 87);
        }
        super.field7517.method849((byte) 90, class99.field1265, class312.field4469);
        ++field3690;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
    public final void method603(boolean arg0) {
        if (!arg0) {
            this.field3688 = null;
        }
        if (!this.field3686) {
            super.field7517.method845(class454.field6199, (byte) 118, 0);
        } else {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method823((class67) null, -8423);
            super.field7517.method893(125, class680.field9501);
            super.field7517.method819(-108);
            if (this.field3689) {
                super.field7517.method849((byte) 121, class312.field4469, class312.field4469);
                super.field7517.method840(0, -69, class454.field6199);
                super.field7517.method845(class454.field6199, (byte) 118, 0);
            } else {
                super.field7517.method849((byte) 61, class312.field4469, class312.field4469);
                super.field7517.method840(0, 83, class454.field6199);
                super.field7517.method934(2, (byte) -65);
                super.field7517.method849((byte) 88, class312.field4469, class312.field4469);
                super.field7517.method840(0, 55, class454.field6199);
                super.field7517.method840(1, 52, class227.field3230);
                super.field7517.method845(class454.field6199, (byte) 94, 0);
                super.field7517.method823((class67) null, -8423);
            }
            super.field7517.method934(0, (byte) -65);
            this.field3686 = false;
        }
        ++field3691;
        super.field7517.method849((byte) 117, class312.field4469, class312.field4469);
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static final void method1605(int arg0) {
        ++field3685;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class555.field7298[var1] = false;
        }
        class5.field132 = arg0;
        class745.field10376 = class332.field4729;
        class20.field337 = -1;
        class92.field1116 = class29.field474;
        class489.field6634 = 0;
        class306.field4407 = class222.field3162;
        class12.field193 = -1;
        class264.field3680 = -1;
        class257.field3522 = class694.field9662;
        class278.field3898 = 5;
        class564.field7416 = class372.field5175;
        class4.field120 = 0;
        class14.field208 = class314.field4488;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwc;IB)V")
    public final void method607(class67 arg0, int arg1, byte arg2) {
        ++field3697;
        super.field7517.method823(arg0, -8423);
        super.field7517.method887((byte) 123, arg1);
        if (arg2 < 68) {
            this.field3688 = null;
        }
    }
}
