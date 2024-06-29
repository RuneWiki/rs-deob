import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 extends class187 {

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Z")
    public boolean field208 = false;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Z")
    public boolean field213 = false;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "Lnd;")
    public static class366 field219 = new class366(9, 4);

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "Lbg;")
    public static class310 field220 = new class310(38, -1);

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method75(int arg0, int arg1) {
        ++field212;
        return ~arg1 == arg0 && !this.field213 ? super.field2969 : true;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 17)
    public static void method76(byte arg0) {
        if (arg0 != 124) {
            field207 = -52;
        }
        field219 = null;
        field220 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(ZB)V", line = 28)
    public final void method77(boolean arg0, byte arg1) {
        if (arg1 > 88) {
            super.field2969 = arg0;
            ++field214;
            if (class128.field2070 != null) {
                class128.field2070.method918(!this.method75(-1, class30.field395), (byte) -100);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z", line = 43)
    public final boolean method78(int arg0, int arg1) {
        ++field216;
        return arg0 != arg1 ? true : super.field2969;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBII)V", line = 55)
    public static final void method79(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field206;
        if (arg2 != -4) {
            field219 = null;
        }
        if (~arg0 > ~arg4) {
            class78.method566(class69.field1212[arg3], arg4, arg1, -7, arg0);
        } else {
            class78.method566(class69.field1212[arg3], arg0, arg1, arg2 + -3, arg4);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lhf;)V", line = 450)
    public class15(class260 arg0) {
        super.field2968 = 3;
        this.method77(true, (byte) 91);
        super.field2960 = 255;
        super.field2949 = 0;
        super.field2948 = true;
        super.field2954 = 0;
        super.field2959 = 0;
        super.field2947 = true;
        super.field2964 = true;
        super.field2941 = 127;
        super.field2974 = 2;
        super.field2953 = true;
        super.field2944 = true;
        super.field2957 = true;
        super.field2952 = 127;
        super.field2972 = true;
        super.field2942 = 1;
        super.field2970 = 0;
        super.field2962 = true;
        super.field2963 = true;
        super.field2943 = true;
        if (~class322.field4841 <= -97) {
            class7.method39(0, 2);
        } else {
            class7.method39(0, 0);
        }
        super.field2946 = 2;
        super.field2955 = false;
        super.field2940 = class463.field7117 != 1 ? 4 : 2;
        super.field2950 = true;
        super.field2958 = false;
        super.field2945 = 2;
        super.field2971 = 0;
        super.field2951 = true;
        super.field2966 = 0;
        super.field2961 = false;
        class333 var2 = null;
        try {
            class180 var3 = arg0.method1568((byte) 72, "");
            while (var3.field2802 == 0) {
                class414.method2437(1L, (byte) -122);
            }
            if (var3.field2802 == 1) {
                var2 = (class333) var3.field2803;
                byte[] var4 = new byte[(int) var2.method2069((byte) -124)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2065(var4, var5, var4.length + -var5, -1);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method81(true, new class40(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2066(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lhf;B)V", line = 81)
    public final void method80(class260 arg0, byte arg1) {
        int var3 = -38 % ((5 - arg1) / 40);
        ++field205;
        class333 var4 = null;
        try {
            class180 var5 = arg0.method1568((byte) 72, "");
            while (~var5.field2802 == -1) {
                class414.method2437(1L, (byte) -122);
            }
            if (~var5.field2802 == -2) {
                var4 = (class333) var5.field2803;
                class40 var6 = this.method83(0);
                var4.method2067(var6.field585, 25525, var6.field536, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var4 != null) {
                var4.method2066(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLha;)V", line = 123)
    private final void method81(boolean arg0, class40 arg1) {
        ++field215;
        if (~(arg1.field536.length + -arg1.field585) <= -2) {
            if (arg0) {
                int var3 = arg1.method257((byte) 52);
                if (var3 >= 0 && ~var3 >= -17) {
                    byte var4;
                    if (var3 == 16) {
                        var4 = 38;
                    } else if (~var3 != -16) {
                        if (var3 == 14) {
                            var4 = 36;
                        } else if (~var3 != -14) {
                            if (~var3 != -13) {
                                if (var3 == 11) {
                                    var4 = 33;
                                } else if (var3 != 10) {
                                    if (var3 == 9) {
                                        var4 = 31;
                                    } else if (var3 == 8) {
                                        var4 = 30;
                                    } else if (var3 != 7) {
                                        if (var3 == 6) {
                                            var4 = 28;
                                        } else if (~var3 != -6) {
                                            if (~var3 == -5) {
                                                var4 = 24;
                                            } else if (var3 == 3) {
                                                var4 = 23;
                                            } else if (~var3 != -3) {
                                                if (~var3 == -2) {
                                                    var4 = 23;
                                                } else {
                                                    var4 = 19;
                                                }
                                            } else {
                                                var4 = 22;
                                            }
                                        } else {
                                            var4 = 28;
                                        }
                                    } else {
                                        var4 = 29;
                                    }
                                } else {
                                    var4 = 32;
                                }
                            } else {
                                var4 = 34;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 37;
                    }
                    if (arg1.field536.length + -arg1.field585 >= var4) {
                        super.field2968 = arg1.method257((byte) 51);
                        if (super.field2968 >= 1) {
                            if (~super.field2968 < -5) {
                                super.field2968 = 4;
                            }
                        } else {
                            super.field2968 = 1;
                        }
                        this.method77(arg1.method257((byte) 64) == 1, (byte) 110);
                        super.field2963 = ~arg1.method257((byte) 83) == -2;
                        super.field2944 = arg1.method257((byte) 63) == 1;
                        super.field2962 = arg1.method257((byte) 54) == 1;
                        super.field2942 = ~arg1.method257((byte) 127) != -2 ? 0 : 1;
                        super.field2964 = arg1.method257((byte) 92) == 1;
                        super.field2948 = ~arg1.method257((byte) 66) == -2;
                        super.field2953 = ~arg1.method257((byte) 75) == -2;
                        super.field2974 = arg1.method257((byte) 123);
                        if (~super.field2974 < -3) {
                            super.field2974 = 2;
                        }
                        if (~var3 <= -3) {
                            super.field2972 = arg1.method257((byte) 65) == 1;
                        } else {
                            super.field2972 = ~arg1.method257((byte) 32) == -2;
                            arg1.method257((byte) 25);
                        }
                        super.field2943 = ~arg1.method257((byte) 75) == -2;
                        super.field2947 = ~arg1.method257((byte) 41) == -2;
                        super.field2959 = arg1.method257((byte) 64);
                        if (~super.field2959 < -3) {
                            super.field2959 = 2;
                        }
                        super.field2970 = super.field2959;
                        super.field2957 = arg1.method257((byte) 36) == 1;
                        super.field2941 = arg1.method257((byte) 69);
                        if (~super.field2941 < -128) {
                            super.field2941 = 127;
                        }
                        super.field2960 = arg1.method257((byte) 119);
                        super.field2952 = arg1.method257((byte) 114);
                        if (~super.field2952 < -128) {
                            super.field2952 = 127;
                        }
                        if (var3 >= 1) {
                            super.field2954 = arg1.method254((byte) -31);
                            super.field2949 = arg1.method254((byte) -47);
                        }
                        if (~var3 <= -4 && ~var3 > -7) {
                            arg1.method257((byte) 51);
                        }
                        if (var3 >= 4) {
                            int var5 = arg1.method257((byte) 46);
                            if (var5 < 0 || ~var5 < -3) {
                                var5 = 0;
                            }
                            if (class322.field4841 < 96) {
                                var5 = 0;
                            }
                            class7.method39(0, var5);
                        }
                        if (~var3 <= -6) {
                            super.field2966 = arg1.method255((byte) 96);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field2946 = var6 = arg1.method257((byte) 37);
                        }
                        if (~super.field2946 != -2 && super.field2946 != 2) {
                            super.field2946 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field2958 = ~arg1.method257((byte) 124) == -2;
                        }
                        if (var3 >= 8) {
                            super.field2961 = ~arg1.method257((byte) 84) == -2;
                        }
                        if (~var3 <= -10) {
                            super.field2971 = arg1.method257((byte) 68);
                        }
                        if (super.field2971 < 0 || ~super.field2971 < ~class91.method680(class322.field4841, true)) {
                            super.field2971 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field2955 = arg1.method257((byte) 97) != 0;
                        }
                        if (var3 >= 11) {
                            super.field2951 = arg1.method257((byte) 56) != 0;
                        }
                        if (~var3 <= -13) {
                            super.field2942 = arg1.method257((byte) 110);
                        }
                        if (super.field2942 < 0 || ~super.field2942 < -3) {
                            super.field2942 = 1;
                        }
                        if (var3 >= 13) {
                            super.field2950 = ~arg1.method257((byte) 33) == -2;
                        }
                        if (var3 < 14) {
                            if (var6 != 0) {
                                super.field2945 = 1;
                            } else {
                                super.field2945 = 2;
                            }
                        } else {
                            super.field2945 = arg1.method257((byte) 35);
                        }
                        if (~super.field2945 > -1 || super.field2945 > 3) {
                            super.field2945 = 2;
                        }
                        if (var3 >= 15) {
                            super.field2940 = arg1.method257((byte) 120);
                            if (super.field2940 < 0 || super.field2940 > 4) {
                                super.field2940 = class463.field7117 != 1 ? 4 : 2;
                            }
                        }
                        if (var3 >= 16) {
                            super.field2938 = ~arg1.method257((byte) 55) != -2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V", line = 365)
    public static final void method82(byte arg0, int arg1) {
        class275.field4169 = -1;
        class322.field4842 = 1;
        class93.field1656 = false;
        if (arg0 <= 12) {
            field211 = 89;
        }
        field207 = 0;
        class232.field3525 = -1;
        class107.field1871 = null;
        ++field218;
        class91.field1639 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lha;", line = 385)
    public final class40 method83(int arg0) {
        ++field209;
        class40 var2 = new class40(39);
        var2.method221(~arg0, 16);
        var2.method221(-1, super.field2968);
        var2.method221(-1, super.field2969 ? 1 : 0);
        var2.method221(-1, super.field2963 ? 1 : 0);
        var2.method221(-1, super.field2944 ? 1 : 0);
        var2.method221(-1, !super.field2962 ? 0 : 1);
        var2.method221(-1, arg0);
        var2.method221(-1, super.field2964 ? 1 : 0);
        var2.method221(-1, super.field2948 ? 1 : 0);
        var2.method221(-1, !super.field2953 ? 0 : 1);
        var2.method221(-1, super.field2974);
        var2.method221(~arg0, super.field2972 ? 1 : 0);
        var2.method221(-1, !super.field2943 ? 0 : 1);
        var2.method221(~arg0, super.field2947 ? 1 : 0);
        var2.method221(-1, super.field2959);
        var2.method221(-1, super.field2957 ? 1 : 0);
        var2.method221(~arg0, super.field2941);
        var2.method221(arg0 + -1, super.field2960);
        var2.method221(-1, super.field2952);
        var2.method246((byte) -80, super.field2954);
        var2.method246((byte) -109, super.field2949);
        var2.method221(-1, class22.method114(-128));
        var2.method253(-108, super.field2966);
        var2.method221(-1, super.field2946);
        var2.method221(-1, !super.field2958 ? 0 : 1);
        var2.method221(~arg0, !super.field2961 ? 0 : 1);
        var2.method221(~arg0, super.field2971);
        var2.method221(-1, !super.field2955 ? 0 : 1);
        var2.method221(-1, !super.field2951 ? 0 : 1);
        var2.method221(-1, super.field2942);
        var2.method221(-1, !super.field2950 ? 0 : 1);
        var2.method221(-1, super.field2945);
        var2.method221(~arg0, super.field2940);
        var2.method221(-1, !super.field2938 ? 1 : 0);
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)I", line = 429)
    public final int method84(int arg0, byte arg1) {
        ++field210;
        if (arg1 != 90) {
            return -93;
        } else if (this.field208) {
            return 0;
        } else if (!this.method75(-1, arg0)) {
            return 1;
        } else {
            return !super.field2963 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZZ)Z", line = 533)
    public static boolean method85(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
