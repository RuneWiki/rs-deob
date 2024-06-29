import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class188 extends class33 {

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    private int field3666 = 4096;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "Laf;")
    public static class7 field3671 = new class7(30);

    @OriginalMember(owner = "client!si", name = "W", descriptor = "Lrd;")
    public static class173 field3673 = class133.method843("Bitte warten Sie eine Minute", 106);

    @OriginalMember(owner = "client!si", name = "V", descriptor = "Lrd;")
    public static class173 field3672 = class133.method843("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -120);

    @OriginalMember(owner = "client!si", name = "X", descriptor = "Lrd;")
    private static class173 field3674 = class133.method843("Error loading your profile)3", 60);

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Lrd;")
    public static class173 field3675 = field3674;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "[[B")
    public static byte[][] field3676;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3668;
        if (~(arg6 & 1) == -2) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        int var8 = arg5 & 3;
        if (~var8 == -1) {
            return arg1;
        } else if (~var8 == -2) {
            return arg2;
        } else if (~var8 == -3) {
            return -arg4 + 7 + -arg1 + 1;
        } else {
            if (arg0 >= -82) {
                field3673 = null;
            }
            return -arg2 + 7 - (arg3 + -1);
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
    public static void method1260(int arg0) {
        field3674 = null;
        field3676 = null;
        field3673 = null;
        field3671 = null;
        field3675 = null;
        field3672 = null;
        if (arg0 < 102) {
            field3675 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 77 % ((arg1 - -65) / 60);
        ++field3664;
        int[] var4 = super.field718.method514(arg0, -47);
        if (super.field718.field1615) {
            int[] var5 = this.method262(class26.field545 & arg0 + -1, 67, 0);
            int[] var6 = this.method262(arg0, 93, 0);
            int[] var7 = this.method262(class26.field545 & arg0 + 1, 100, 0);
            for (int var8 = 0; class117.field2173 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field3666;
                int var10 = (var6[class125.field2347 & var8 + 1] - var6[class125.field2347 & var8 + -1]) * this.field3666;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var12 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = ~var15 == -1 ? 0 : 16777216 / var15;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)I")
    public static final int method1261(int arg0, int arg1, int arg2, int arg3) {
        ++field3665;
        int var4 = arg0 / arg2;
        int var5 = arg2 + -1 & arg0;
        int var6 = arg2 + -1 & arg3;
        int var7 = arg3 / arg2;
        int var8 = class205.method1364(var7, 99, var4);
        if (arg1 != 32087) {
            return -5;
        } else {
            int var9 = class205.method1364(var7, 87, var4 + 1);
            int var10 = class205.method1364(var7 - -1, 109, var4);
            int var11 = class205.method1364(var7 + 1, 117, var4 + 1);
            int var12 = class74.method458(var8, true, arg2, var9, var5);
            int var13 = class74.method458(var10, true, arg2, var11, var5);
            return class74.method458(var12, true, arg2, var13, var6);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)V")
    public static final void method1262(int arg0, byte arg1) {
        ++field3663;
        if (arg1 > 96) {
            if (~arg0 == 2) {
                class47.method330(97, class187.field3645, class203.field3967, class40.field828);
            } else if (~arg0 == 1) {
                class47.method330(122, class118.field2178, class203.field3961, class203.field3979);
            } else if (arg0 == -1) {
                class47.method330(87, class187.field3652, class203.field3980, class117.field2170);
            } else if (arg0 == 3) {
                class47.method330(63, class219.field4227, class203.field3975, class203.field3986);
            } else if (arg0 != 4) {
                if (arg0 != 5) {
                    if (arg0 != 6) {
                        if (arg0 == 7) {
                            class47.method330(83, class157.field2939, class203.field3987, class157.field2941);
                        } else if (~arg0 != -9) {
                            if (arg0 != 9) {
                                if (arg0 != 10) {
                                    if (~arg0 != -12) {
                                        if (arg0 == 12) {
                                            class47.method330(25, class172.field3316, class203.field3932, class144.field2686);
                                        } else if (~arg0 == -14) {
                                            class47.method330(96, class187.field3654, class203.field3976, class190.field3723);
                                        } else if (arg0 != 14) {
                                            if (~arg0 != -17) {
                                                if (~arg0 == -18) {
                                                    class47.method330(67, class82.field1596, class203.field3966, class101.field1854);
                                                } else if (~arg0 != -19) {
                                                    if (arg0 == 19) {
                                                        class47.method330(90, class62.field1224, class157.field2954, class60.field1201);
                                                    } else if (~arg0 != -21) {
                                                        if (arg0 == 22) {
                                                            class47.method330(29, class28.field584, class203.field3953, class47.field1002);
                                                        } else if (arg0 == 23) {
                                                            class47.method330(89, class133.field2505, class203.field3981, class166.field3200);
                                                        } else if (~arg0 != -25) {
                                                            if (~arg0 != -26) {
                                                                if (~arg0 != -27) {
                                                                    if (~arg0 == -28) {
                                                                        class47.method330(56, class202.field3901, class203.field3944, class203.field3934);
                                                                    } else {
                                                                        class47.method330(31, class187.field3662, class203.field3985, class202.field3923);
                                                                    }
                                                                } else {
                                                                    class47.method330(45, class133.field2513, class203.field3959, class196.field3829);
                                                                }
                                                            } else {
                                                                class47.method330(36, class187.field3657, class203.field3952, class122.field2296);
                                                            }
                                                        } else {
                                                            class47.method330(81, class74.field1440, class203.field3931, field3675);
                                                        }
                                                    } else {
                                                        class47.method330(119, class187.field3649, class203.field3936, class59.field1163);
                                                    }
                                                } else {
                                                    class47.method330(99, class14.field319, class203.field3972, class46.field992);
                                                }
                                            } else {
                                                class47.method330(40, class55.field1100, class203.field3956, class54.field1075);
                                            }
                                        } else {
                                            class47.method330(114, class133.field2507, class203.field3950, class8.field149);
                                        }
                                    } else {
                                        class47.method330(67, class166.field3211, class203.field3946, class186.field3632);
                                    }
                                } else {
                                    class47.method330(101, class5.field110, class203.field3940, class64.field1263);
                                }
                            } else {
                                class47.method330(57, class182.field3578, class203.field3964, class221.field4242);
                            }
                        } else {
                            class47.method330(110, class78.field1512, class203.field3978, class64.field1252);
                        }
                    } else {
                        class47.method330(81, class60.field1195, class203.field3974, class114.field2123);
                    }
                } else {
                    class47.method330(38, class189.field3689, class203.field3943, class75.field1465);
                }
            } else {
                class47.method330(122, class37.field785, class203.field3941, class54.field1083);
            }
            class148.method978(10, 8780);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 >= -99) {
            field3674 = null;
        }
        ++field3667;
        if (arg0 == 0) {
            this.field3666 = arg2.method755((byte) -80);
        }
    }
}
