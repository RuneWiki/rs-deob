import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class58 extends class142 {

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    private int field1008 = 20;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    private int field1009 = 0;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    private int field1019 = 1365;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    private int field1015 = 0;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field1024 = 50;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "[[I")
    public static int[][] field1025 = new int[104][104];

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "[Ll;")
    public static class100[] field1022 = new class100[4];

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lai;")
    public static class10 field1027 = class44.method278("sl_flags", -124);

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Lai;")
    private static class10 field1020 = class44.method278("red:", -115);

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lai;")
    public static class10 field1026 = field1020;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lai;")
    public static class10 field1007 = field1020;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lai;")
    private static class10 field1021 = class44.method278("Enter your username (V password)3", 96);

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Lai;")
    public static class10 field1010 = field1021;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field1011;
        if (arg2 >= -34) {
            this.method6(false, 18);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1009 = arg0.method762((byte) 104);
                    }
                } else {
                    this.field1015 = arg0.method762((byte) 115);
                }
            } else {
                this.field1008 = arg0.method762((byte) 110);
            }
        } else {
            this.field1019 = arg0.method762((byte) 90);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILai;ZLc;Lai;)V")
    public static final void method391(boolean arg0, int arg1, class10 arg2, boolean arg3, class21 arg4, class10 arg5) {
        ++field1012;
        if (arg3) {
            field1021 = null;
        }
        int var6 = arg4.method156(0, arg5);
        int var7 = arg4.method154(var6, true, arg2);
        class205.method1323(arg1, 10000, arg4, arg0, var6, var7);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public static final void method392(int arg0) {
        if (class196.field3709 == null || class179.field3400 == null) {
            class196.field3709 = new int[256];
            class179.field3400 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class196.field3709[var1] = (int) (Math.sin(var2) * 4096.0D);
                class179.field3400[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 < 16) {
            field1022 = null;
        }
        ++field1017;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field1023;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            for (int var4 = 0; var4 < class133.field2499; ++var4) {
                int var5 = (class13.field212[arg1] << 12) / this.field1019 - -this.field1009;
                int var6 = (class79.field1395[var4] << 12) / this.field1019 - -this.field1015;
                int var7 = var6;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6 * var6 >> 12;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var5;
                while (~(var10 + var11) > -16385 && ~this.field1008 < ~var12) {
                    ++var12;
                    var13 = (var8 * var13 >> 12) * 2 + var9;
                    var8 = var10 - var11 - -var7;
                    var11 = var13 * var13 >> 12;
                    var10 = var8 * var8 >> 12;
                }
                var3[var4] = var12 < this.field1008 + -1 ? (var12 << 12) / this.field1008 : 0;
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[Lwa;BIIIII)V")
    public static final void method393(int arg0, int arg1, class200[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1013;
        if (arg3 != 23) {
            method393(-83, 22, (class200[]) null, (byte) -125, 115, 1, -62, 97, -11);
        }
        for (int var9 = 0; ~var9 > ~arg2.length; ++var9) {
            class200 var10 = arg2[var9];
            if (var10 != null && (!var10.field3927 || ~var10.field3888 == -1 || var10.field3851 || class203.method1318(0, var10) != 0 || class11.field174 == var10) && var10.field3794 == arg6 && (!var10.field3927 || !class185.method1195(var10, (byte) 90))) {
                int var11 = var10.field3822 + arg7;
                int var12 = var10.field3842 + arg5;
                if (class100.field1871 == var10) {
                    class118.field2275 = true;
                    class36.field570 = var12;
                    class107.field1990 = var11;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field3888 == 2) {
                    var13 = arg8;
                    var14 = arg1;
                    var15 = arg0;
                    var16 = arg4;
                } else if (~var10.field3888 == -10) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var10.field3925 + var12;
                    int var20 = var10.field3845 + var11;
                    if (var11 > var20) {
                        var17 = var20;
                        var20 = var11;
                    }
                    ++var20;
                    var15 = ~var20 > ~arg0 ? var20 : arg0;
                    var16 = ~arg4 <= ~var17 ? arg4 : var17;
                    if (~var12 < ~var19) {
                        var18 = var19;
                        var19 = var12;
                    }
                    var13 = arg8 >= var18 ? arg8 : var18;
                    ++var19;
                    var14 = var19 >= arg1 ? arg1 : var19;
                } else {
                    var16 = ~arg4 > ~var11 ? var11 : arg4;
                    var13 = arg8 >= var12 ? arg8 : var12;
                    int var23 = var10.field3845 + var11;
                    var15 = ~var23 <= ~arg0 ? arg0 : var23;
                    int var24 = var10.field3925 + var12;
                    var14 = ~var24 <= ~arg1 ? arg1 : var24;
                }
                if (!var10.field3927 || var15 > var16 && ~var14 < ~var13) {
                    if (~var10.field3865 == -1338) {
                        class168.method1116(var10, -111);
                    } else if (var10.field3865 == 1338) {
                        class141.method957(arg3 + -27, var11, var12);
                    } else {
                        if (~var10.field3888 == -1) {
                            if (!var10.field3927 && class185.method1195(var10, (byte) 94) && class77.field1342 != var10) {
                                continue;
                            }
                            method393(var15, var14, arg2, (byte) 23, var16, -var10.field3907 + var12, var10.field3833, -var10.field3829 + var11, var13);
                            if (var10.field3796 != null) {
                                method393(var15, var14, var10.field3796, (byte) 23, var16, -var10.field3907 + var12, var10.field3833, -var10.field3829 + var11, var13);
                            }
                            class118 var25 = (class118) class165.field3162.method213(-115, (long) var10.field3833);
                            if (var25 != null) {
                                class201.method1304(var16, var15, var12, var11, var13, arg3 + -142, var14, var25.field2272);
                            }
                        }
                        if (var10.field3927) {
                            boolean var26 = false;
                            boolean var27 = false;
                            boolean var28;
                            if (var16 <= class79.field1389 && class89.field1559 >= var13 && ~class79.field1389 > ~var15 && var14 > class89.field1559) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            if (~field1014 == -2 && var28) {
                                var26 = true;
                            }
                            if (~class25.field384 == -2 && ~var16 >= ~class172.field3330 && var13 <= class5.field58 && ~var15 < ~class172.field3330 && ~class5.field58 > ~var14) {
                                var27 = true;
                            }
                            if (var27) {
                                class77.method473(-var11 + class172.field3330, -7, var10, -var12 + class5.field58);
                            }
                            if (class100.field1871 != null && class100.field1871 != var10 && var28 && class91.method555(class203.method1318(0, var10), 85)) {
                                class207.field4033 = var10;
                            }
                            if (class11.field174 == var10) {
                                class49.field854 = var12;
                                class194.field3694 = var11;
                                class13.field209 = true;
                            }
                            if (var10.field3851) {
                                if (var28 && ~class169.field3264 != -1 && var10.field3906 != null) {
                                    class5 var29 = new class5();
                                    var29.field53 = var10.field3906;
                                    var29.field55 = var10;
                                    var29.field52 = class169.field3264;
                                    class166.field3175.method1230(var29, true);
                                }
                                if (class100.field1871 != null || class33.field511 != null || class180.field3415) {
                                    var28 = false;
                                    var26 = false;
                                    var27 = false;
                                }
                                if (!var10.field3816 && var27) {
                                    var10.field3816 = true;
                                    if (var10.field3832 != null) {
                                        class5 var30 = new class5();
                                        var30.field59 = -var11 + class172.field3330;
                                        var30.field53 = var10.field3832;
                                        var30.field52 = -var12 + class5.field58;
                                        var30.field55 = var10;
                                        class166.field3175.method1230(var30, true);
                                    }
                                }
                                if (var10.field3816 && var26 && var10.field3846 != null) {
                                    class5 var31 = new class5();
                                    var31.field52 = class89.field1559 - var12;
                                    var31.field53 = var10.field3846;
                                    var31.field55 = var10;
                                    var31.field59 = -var11 + class79.field1389;
                                    class166.field3175.method1230(var31, true);
                                }
                                if (var10.field3816 && !var26) {
                                    var10.field3816 = false;
                                    if (var10.field3843 != null) {
                                        class5 var32 = new class5();
                                        var32.field55 = var10;
                                        var32.field52 = class89.field1559 - var12;
                                        var32.field59 = -var11 + class79.field1389;
                                        var32.field53 = var10.field3843;
                                        class120.field2303.method1230(var32, true);
                                    }
                                }
                                if (var26 && var10.field3784 != null) {
                                    class5 var33 = new class5();
                                    var33.field52 = -var12 + class89.field1559;
                                    var33.field55 = var10;
                                    var33.field53 = var10.field3784;
                                    var33.field59 = class79.field1389 - var11;
                                    class166.field3175.method1230(var33, true);
                                }
                                if (!var10.field3847 && var28) {
                                    var10.field3847 = true;
                                    if (var10.field3875 != null) {
                                        class5 var34 = new class5();
                                        var34.field52 = class89.field1559 - var12;
                                        var34.field55 = var10;
                                        var34.field59 = -var11 + class79.field1389;
                                        var34.field53 = var10.field3875;
                                        class166.field3175.method1230(var34, true);
                                    }
                                }
                                if (var10.field3847 && var28 && var10.field3808 != null) {
                                    class5 var35 = new class5();
                                    var35.field55 = var10;
                                    var35.field59 = -var11 + class79.field1389;
                                    var35.field52 = class89.field1559 - var12;
                                    var35.field53 = var10.field3808;
                                    class166.field3175.method1230(var35, true);
                                }
                                if (var10.field3847 && !var28) {
                                    var10.field3847 = false;
                                    if (var10.field3903 != null) {
                                        class5 var36 = new class5();
                                        var36.field59 = -var11 + class79.field1389;
                                        var36.field55 = var10;
                                        var36.field52 = -var12 + class89.field1559;
                                        var36.field53 = var10.field3903;
                                        class120.field2303.method1230(var36, true);
                                    }
                                }
                                if (var10.field3856 != null) {
                                    class5 var37 = new class5();
                                    var37.field53 = var10.field3856;
                                    var37.field55 = var10;
                                    class5.field54.method1230(var37, true);
                                }
                                if (var10.field3852 != null && var10.field3926 < class4.field33) {
                                    if (var10.field3863 != null && class4.field33 - var10.field3926 <= 32) {
                                        label383: for (int var38 = var10.field3926; ~var38 > ~class4.field33; ++var38) {
                                            int var39 = class128.field2429[31 & var38];
                                            for (int var40 = 0; var40 < var10.field3863.length; ++var40) {
                                                if (~var10.field3863[var40] == ~var39) {
                                                    class5 var41 = new class5();
                                                    var41.field53 = var10.field3852;
                                                    var41.field55 = var10;
                                                    class166.field3175.method1230(var41, true);
                                                    break label383;
                                                }
                                            }
                                        }
                                    } else {
                                        class5 var42 = new class5();
                                        var42.field53 = var10.field3852;
                                        var42.field55 = var10;
                                        class166.field3175.method1230(var42, true);
                                    }
                                    var10.field3926 = class4.field33;
                                }
                                if (var10.field3798 != null && var10.field3850 < class21.field343) {
                                    if (var10.field3896 != null && ~(-var10.field3850 + class21.field343) >= -33) {
                                        label363: for (int var43 = var10.field3850; ~var43 > ~class21.field343; ++var43) {
                                            int var44 = class19.field276[31 & var43];
                                            for (int var45 = 0; ~var10.field3896.length < ~var45; ++var45) {
                                                if (~var10.field3896[var45] == ~var44) {
                                                    class5 var46 = new class5();
                                                    var46.field55 = var10;
                                                    var46.field53 = var10.field3798;
                                                    class166.field3175.method1230(var46, true);
                                                    break label363;
                                                }
                                            }
                                        }
                                    } else {
                                        class5 var47 = new class5();
                                        var47.field53 = var10.field3798;
                                        var47.field55 = var10;
                                        class166.field3175.method1230(var47, true);
                                    }
                                    var10.field3850 = class21.field343;
                                }
                                if (var10.field3826 != null && class3.field29 > var10.field3761) {
                                    if (var10.field3835 != null && -var10.field3761 + class3.field29 <= 32) {
                                        label343: for (int var48 = var10.field3761; var48 < class3.field29; ++var48) {
                                            int var49 = class116.field2216[var48 & 31];
                                            for (int var50 = 0; var50 < var10.field3835.length; ++var50) {
                                                if (var10.field3835[var50] == var49) {
                                                    class5 var51 = new class5();
                                                    var51.field53 = var10.field3826;
                                                    var51.field55 = var10;
                                                    class166.field3175.method1230(var51, true);
                                                    break label343;
                                                }
                                            }
                                        }
                                    } else {
                                        class5 var52 = new class5();
                                        var52.field53 = var10.field3826;
                                        var52.field55 = var10;
                                        class166.field3175.method1230(var52, true);
                                    }
                                    var10.field3761 = class3.field29;
                                }
                                if (~class125.field2393 < ~var10.field3886 && var10.field3823 != null) {
                                    class5 var53 = new class5();
                                    var53.field53 = var10.field3823;
                                    var53.field55 = var10;
                                    class166.field3175.method1230(var53, true);
                                }
                                if (~class98.field1812 < ~var10.field3886 && var10.field3824 != null) {
                                    class5 var54 = new class5();
                                    var54.field55 = var10;
                                    var54.field53 = var10.field3824;
                                    class166.field3175.method1230(var54, true);
                                }
                                if (class7.field79 > var10.field3886 && var10.field3834 != null) {
                                    class5 var55 = new class5();
                                    var55.field55 = var10;
                                    var55.field53 = var10.field3834;
                                    class166.field3175.method1230(var55, true);
                                }
                                if (~class130.field2471 < ~var10.field3886 && var10.field3897 != null) {
                                    class5 var56 = new class5();
                                    var56.field55 = var10;
                                    var56.field53 = var10.field3897;
                                    class166.field3175.method1230(var56, true);
                                }
                                if (~class129.field2444 < ~var10.field3886 && var10.field3769 != null) {
                                    class5 var57 = new class5();
                                    var57.field53 = var10.field3769;
                                    var57.field55 = var10;
                                    class166.field3175.method1230(var57, true);
                                }
                                var10.field3886 = class7.field78;
                                if (var10.field3855 != null) {
                                    for (int var58 = 0; ~class15.field252 < ~var58; ++var58) {
                                        class5 var59 = new class5();
                                        var59.field55 = var10;
                                        var59.field60 = class175.field3365[var58];
                                        var59.field49 = class203.field3969[var58];
                                        var59.field53 = var10.field3855;
                                        class166.field3175.method1230(var59, true);
                                    }
                                }
                            }
                        }
                        if (!var10.field3927) {
                            if (class100.field1871 != null || class33.field511 != null || class180.field3415) {
                                return;
                            }
                            if ((var10.field3838 >= 0 || var10.field3771 != 0) && ~class79.field1389 <= ~var16 && ~class89.field1559 <= ~var13 && var15 > class79.field1389 && ~var14 < ~class89.field1559) {
                                if (~var10.field3838 > -1) {
                                    class77.field1342 = var10;
                                } else {
                                    class77.field1342 = arg2[var10.field3838];
                                }
                            }
                            if (~var10.field3888 == -9 && class79.field1389 >= var16 && class89.field1559 >= var13 && var15 > class79.field1389 && ~class89.field1559 > ~var14) {
                                class102.field1908 = var10;
                            }
                            if (~var10.field3925 > ~var10.field3873) {
                                class117.method833(var10, var12, class79.field1389, -98, var10.field3873, var10.field3925, var10.field3845 + var11, class89.field1559);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public static void method394(int arg0) {
        field1020 = null;
        if (arg0 == 8982) {
            field1027 = null;
            field1026 = null;
            field1022 = null;
            field1025 = null;
            field1021 = null;
            field1010 = null;
            field1007 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method395(Component arg0, byte arg1) {
        ++field1016;
        arg0.removeMouseListener(class84.field1460);
        if (arg1 > -29) {
            field1026 = null;
        }
        arg0.removeMouseMotionListener(class84.field1460);
        arg0.removeFocusListener(class84.field1460);
        class45.field737 = 0;
    }
}
