import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class226 extends class178 {

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "Z")
    private boolean field3794 = false;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
    private int field3799 = -1;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "Z")
    private volatile boolean field3796 = false;

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "Ls;")
    private class229 field3801;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "Ls;")
    private class229 field3805;

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
    public static int field3800 = 0;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
    private int field3795;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
    private int field3809;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "[I")
    public static int[] field3802;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "[Z")
    private volatile boolean[] field3806;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "[[Z")
    public static boolean[][] field3793;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I")
    public final int method1475(int arg0) {
        ++field3810;
        if (this.field3796) {
            return 100;
        } else if (arg0 != -7) {
            return -75;
        } else if (super.field3038 != null) {
            return 99;
        } else {
            int var2 = class260.method1734(this.field3803, -13398, 255);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I")
    public final int method1200(int arg0, int arg1) {
        if (arg1 != 25537) {
            method1482(-126);
        }
        ++field3807;
        if (!this.method1219(arg0, -101)) {
            return 0;
        } else if (super.field3038[arg0] != null) {
            return 100;
        } else {
            return this.field3806[arg0] ? 100 : class260.method1734(arg0, -13398, this.field3803);
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
    public static void method1476(int arg0) {
        if (arg0 == -1) {
            field3793 = null;
            field3802 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(II)V")
    public static final void method1477(int arg0, int arg1) {
        class187.field3246.method831(arg1, -123);
        if (arg0 == 4468) {
            class253.field4349.method831(arg1, arg0 ^ -4367);
            class187.field3245.method831(arg1, -124);
            ++field3797;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIZ[B)V")
    public final void method1478(int arg0, boolean arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field3808;
        if (arg0 == 26864) {
            if (arg3) {
                if (this.field3796) {
                    throw new RuntimeException();
                } else {
                    if (this.field3801 != null) {
                        class248.method1623(this.field3801, arg4, this.field3803, (byte) -111);
                    }
                    this.method1228(arg4, false);
                    this.method1479(10);
                }
            } else {
                arg4[arg4.length + -2] = (byte) (super.field3062[arg2] >> 8);
                arg4[arg4.length + -1] = (byte) super.field3062[arg2];
                if (this.field3805 != null) {
                    class248.method1623(this.field3805, arg4, arg2, (byte) -124);
                    this.field3806[arg2] = true;
                }
                if (arg1) {
                    super.field3038[arg2] = class204.method1374(arg4, false, -137);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
    private final void method1479(int arg0) {
        ++field3791;
        this.field3806 = new boolean[super.field3038.length];
        for (int var2 = 0; ~var2 > ~this.field3806.length; ++var2) {
            this.field3806[var2] = false;
        }
        if (this.field3805 == null) {
            this.field3796 = true;
        } else {
            this.field3799 = -1;
            for (int var3 = 0; var3 < this.field3806.length; ++var3) {
                if (super.field3052[var3] > 0) {
                    class212.method1432(-123, this, this.field3805, var3);
                    this.field3799 = var3;
                }
            }
            if (~this.field3799 == 0) {
                this.field3796 = true;
            }
            if (arg0 != 10) {
                this.method1481(-113, 71, 49);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ls;Ls;IZZZ)V")
    public class226(class229 arg0, class229 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3801 = arg1;
        this.field3794 = arg5;
        this.field3805 = arg0;
        this.field3803 = arg2;
        class89.method667(this.field3803, 70, this);
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(II)V")
    public static final void method1480(int arg0, int arg1) {
        class59.field1243.method831(arg1, -127);
        ++field3798;
        class183.field3176.method831(arg1, -126);
        if (arg0 >= 117) {
            class140.field2482.method831(arg1, -123);
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(II)V")
    public final void method1225(int arg0, int arg1) {
        ++field3789;
        if (arg1 > 58) {
            if (this.method1219(arg0, -128)) {
                class12.method132(1351464912, this.field3803, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(III)V")
    public final void method1481(int arg0, int arg1, int arg2) {
        this.field3809 = arg0;
        ++field3790;
        this.field3795 = arg2;
        if (this.field3801 == null) {
            class250.method1635(true, this.field3803, (byte) 0, false, this, 255, this.field3795);
        } else {
            class187.method1266(0, this.field3803, this, this.field3801);
        }
        if (arg1 != -74) {
            this.method1481(52, 115, 76);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
    public final void method1205(int arg0, boolean arg1) {
        ++field3804;
        if (!arg1) {
            this.field3805 = null;
        }
        if (this.method1219(arg0, -115)) {
            if (this.field3805 != null && this.field3806 != null && this.field3806[arg0]) {
                class187.method1266(0, arg0, this, this.field3805);
            } else {
                class250.method1635(true, arg0, (byte) 2, false, this, this.field3803, super.field3057[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "(I)V")
    public static final void method1482(int arg0) {
        ++field3788;
        if (class161.field2828 != null) {
            if (~class35.field698 > -11) {
                if (!class10.field195.method1208((byte) 108, class161.field2828)) {
                    class35.field698 = class10.field195.method1198(class161.field2828, 0) / 10;
                    return;
                }
                class140.method955((byte) -126);
                class35.field698 = 10;
            }
            if (~class35.field698 != -11) {
                if (class35.field698 == 20) {
                    class24.method216(class10.field195.method1213(class80.field1567, class161.field2828, 0), arg0 + 1191873687);
                    class35.field698 = 30;
                    class173.method1178(arg0 ^ 1191847006, true);
                    class123.method860(arg0 + 1191847006);
                } else if (~class35.field698 == -31) {
                    class210.method1409((byte) -113, class10.field195.method1213(class43.field859, class161.field2828, 0));
                    class35.field698 = 40;
                    class123.method860(-1);
                } else if (~class35.field698 == -41) {
                    class133.method926(true, class10.field195.method1213(class151.field2590, class161.field2828, 0));
                    class35.field698 = 50;
                    class123.method860(arg0 ^ 1191847006);
                } else if (~class35.field698 == -51) {
                    class136.method941(9175, class10.field195.method1213(class124.field2226, class161.field2828, 0));
                    class35.field698 = 60;
                    class173.method1178(-1, true);
                    class123.method860(arg0 ^ 1191847006);
                } else if (class35.field698 == 60) {
                    class29.method246((byte) -56, class10.field195.method1213(class140.field2486, class161.field2828, 0));
                    class35.field698 = 70;
                    class123.method860(-1);
                } else if (class35.field698 == 70) {
                    class138.field2460 = new class51(11, true, class156.field2728);
                    class35.field698 = 73;
                    class173.method1178(-1, true);
                    class123.method860(-1);
                } else if (~class35.field698 == -74) {
                    class241.field4163 = new class51(12, true, class156.field2728);
                    class35.field698 = 76;
                    class173.method1178(-1, true);
                    class123.method860(-1);
                } else if (class35.field698 == 76) {
                    class182.field3174 = new class51(14, true, class156.field2728);
                    class35.field698 = 79;
                    class173.method1178(arg0 ^ 1191847006, true);
                    class123.method860(arg0 ^ 1191847006);
                } else if (~class35.field698 == -80) {
                    class158.field2778 = new class51(17, true, class156.field2728);
                    class35.field698 = 82;
                    class173.method1178(arg0 + 1191847006, true);
                    class123.method860(arg0 ^ 1191847006);
                } else if (class35.field698 == 82) {
                    class68.field1361 = new class51(19, true, class156.field2728);
                    class35.field698 = 85;
                    class173.method1178(-1, true);
                    class123.method860(-1);
                } else if (~class35.field698 == -86) {
                    class197.field3333 = new class51(22, true, class156.field2728);
                    class35.field698 = 88;
                    class173.method1178(-1, true);
                    class123.method860(arg0 + 1191847006);
                } else if (class35.field698 == 88) {
                    class209.field3571 = new class51(26, true, class156.field2728);
                    class35.field698 = 91;
                    class173.method1178(-1, true);
                    class123.method860(-1);
                } else {
                    class11.field201 = new class51(30, true, class156.field2728);
                    class35.field698 = 100;
                    class173.method1178(-1, true);
                    class123.method860(arg0 ^ 1191847006);
                    class143.field2516 = -1;
                    if (arg0 != -1191847007) {
                        method1482(-128);
                    }
                    class26.field510 = -1;
                    System.gc();
                }
            } else {
                class152 var1 = new class152(class10.field195.method1213(class143.field2508, class161.field2828, 0));
                int var2 = var1.method1063(-17162);
                int var3 = var1.method1063(arg0 + 1191829845);
                int var4 = var1.method1063(-17162);
                int var5 = var1.method1063(-17162);
                int var6 = var1.method1063(-17162);
                int var7 = var1.method1063(-17162);
                class8.field174 = var3 * 64;
                class181.field3149 = (var5 - var3) * 64 - -64;
                class15.field332 = 8.0D;
                class32.field628 = 8.0D;
                class252.field4337 = (-var2 + var4) * 64 + 64;
                class182.field3159 = var2 * 64;
                int var8 = (class137.field2441.field4177 >> 7) + -class182.field3159 + class244.field4232;
                int var9 = class231.field3878 - -(class137.field2441.field4143 >> 7) + -class8.field174;
                int var10 = var9 + -5 + (int) (10.0D * Math.random());
                int var11 = var8 + -5 + (int) (Math.random() * 10.0D);
                if (var11 >= 0 && var11 < class252.field4337 && ~var10 <= -1 && var10 < class181.field3149) {
                    class181.field3146 = var11;
                    class233.field3997 = -var10 + class181.field3149;
                } else {
                    class233.field3997 = class8.field174 - var7 * 64 + class181.field3149;
                    class181.field3146 = var6 * 64 - class182.field3159;
                }
                class228.method1488((byte) 106);
                int var12 = class46.field1052 >> 2 << 10;
                int var13 = class233.field3953 >> 1;
                int var14 = class181.field3149 >> 6;
                int var15 = class252.field4337 >> 6;
                class244.field4234 = new int[var15][var14][];
                class257.field4452 = new int[class238.field4097 + 1];
                class138.field2476 = new byte[var15][var14][];
                class94.field1781 = new byte[var15][var14][];
                class257.field4438 = new int[var15][var14][];
                class207.field3553 = new byte[var15][var14][];
                class221.field3737 = new byte[var15][var14][];
                class158.field2779 = new byte[var15][var14][];
                class250.field4311 = new byte[var15][var14][];
                for (int var16 = 0; ~class238.field4097 < ~var16; ++var16) {
                    class134 var17 = class91.method676(arg0 ^ 1191853676, var16);
                    if (var17 != null) {
                        int var18 = var17.field2395;
                        if (~var18 <= -1 && !class101.field1870.method94(arg0 ^ -1191847005, var18)) {
                            var18 = -1;
                        }
                        int var22;
                        if (var17.field2392 >= 0) {
                            int var19 = var17.field2392;
                            int var20 = (var19 & 127) + var13;
                            if (var20 < 0) {
                                var20 = 0;
                            } else if (var20 > 127) {
                                var20 = 127;
                            }
                            int var21 = (var19 & 896) + ((64512 & var19 - -var12) - -var20);
                            var22 = class101.field1873[class20.method178(var21, 96, (byte) 100)];
                        } else if (var18 < 0) {
                            if (var17.field2398 == -1) {
                                var22 = -1;
                            } else {
                                int var23 = var17.field2398;
                                int var24 = (127 & var23) + var13;
                                if (var24 < 0) {
                                    var24 = 0;
                                } else if (var24 > 127) {
                                    var24 = 127;
                                }
                                int var25 = (var12 + var23 & 64512) + (var23 & 896) + var24;
                                var22 = class101.field1873[class20.method178(var25, 96, (byte) 95)];
                            }
                        } else {
                            var22 = class101.field1873[class20.method178(class101.field1870.method97(var18, 65535), 96, (byte) 101)];
                        }
                        class257.field4452[var16 + 1] = var22;
                    }
                }
                class35.field698 = 20;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIILs;Z)V")
    public final void method1483(byte[] arg0, int arg1, int arg2, class229 arg3, boolean arg4) {
        ++field3792;
        if (arg2 != 127) {
            this.method1475(-8);
        }
        if (this.field3801 == arg3) {
            if (this.field3796) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class250.method1635(true, this.field3803, (byte) 0, false, this, 255, this.field3795);
            } else {
                class45.field1039.reset();
                class45.field1039.update(arg0, 0, arg0.length);
                int var6 = (int) class45.field1039.getValue();
                if (~this.field3795 != ~var6) {
                    class250.method1635(true, this.field3803, (byte) 0, false, this, 255, this.field3795);
                } else {
                    class152 var7;
                    try {
                        var7 = new class152(class8.method111(arg0, false));
                    } catch (RuntimeException var12) {
                        class250.method1635(true, this.field3803, (byte) 0, false, this, 255, this.field3795);
                        return;
                    }
                    int var8 = var7.method1051((byte) 124);
                    if (var8 != 5 && ~var8 != -7) {
                        class250.method1635(true, this.field3803, (byte) 0, false, this, 255, this.field3795);
                    } else {
                        int var9 = 0;
                        if (~var8 <= -7) {
                            var9 = var7.method1042(124);
                        }
                        if (~this.field3809 != ~var9) {
                            class250.method1635(true, this.field3803, (byte) 0, false, this, 255, this.field3795);
                        } else {
                            this.method1228(arg0, false);
                            this.method1479(10);
                        }
                    }
                }
            }
        } else {
            if (!arg4 && this.field3799 == arg1) {
                this.field3796 = true;
            }
            if (arg0 != null && ~arg0.length < -3) {
                class45.field1039.reset();
                class45.field1039.update(arg0, 0, arg0.length + -2);
                int var10 = (int) class45.field1039.getValue();
                int var11 = ((255 & arg0[arg0.length + -2]) << 8) + (arg0[arg0.length + -1] & 255);
                if (super.field3057[arg1] == var10 && super.field3062[arg1] == var11) {
                    this.field3806[arg1] = true;
                    if (arg4) {
                        super.field3038[arg1] = class204.method1374(arg0, false, -137);
                    }
                } else {
                    this.field3806[arg1] = false;
                    if (this.field3794 || arg4) {
                        class250.method1635(arg4, arg1, (byte) 2, false, this, this.field3803, super.field3057[arg1]);
                    }
                }
            } else {
                this.field3806[arg1] = false;
                if (this.field3794 || arg4) {
                    class250.method1635(arg4, arg1, (byte) 2, false, this, this.field3803, super.field3057[arg1]);
                }
            }
        }
    }
}
