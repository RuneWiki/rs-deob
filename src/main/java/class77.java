import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class77 extends class37 implements class338 {

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "Z")
    private boolean field1139;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "B")
    private byte field1138;

    @OriginalMember(owner = "client!fv", name = "eb", descriptor = "Z")
    private boolean field1163;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "B")
    private byte field1143;

    @OriginalMember(owner = "client!fv", name = "T", descriptor = "Z")
    private boolean field1152;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "S")
    private short field1144;

    @OriginalMember(owner = "client!fv", name = "gb", descriptor = "B")
    private byte field1165;

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "Z")
    private boolean field1148;

    @OriginalMember(owner = "client!fv", name = "Z", descriptor = "Lj;")
    private class377 field1158;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "Lc;")
    public class121 field1137;

    @OriginalMember(owner = "client!fv", name = "V", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!fv", name = "R", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!fv", name = "U", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!fv", name = "W", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fv", name = "X", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!fv", name = "Y", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!fv", name = "ab", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!fv", name = "bb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!fv", name = "cb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fv", name = "db", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fv", name = "fb", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        if (!arg0) {
            this.field1137 = null;
        }
        ++field1156;
        this.field1163 = false;
        if (this.field1137 != null) {
            this.field1137.method860(-65537 & this.field1137.method854());
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (!(arg3 instanceof class51)) {
            if (arg3 instanceof class77) {
                class77 var8 = (class77) arg3;
                if (this.field1137 != null && var8.field1137 != null) {
                    this.field1137.method848(var8.field1137, arg4, arg1, arg5, arg6);
                }
            }
        } else {
            class51 var9 = (class51) arg3;
            if (this.field1137 != null && var9.field784 != null) {
                this.field1137.method848(var9.field784, arg4, arg1, arg5, arg6);
            }
        }
        if (arg0 != 1) {
            this.method344(-8);
        }
        ++field1136;
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)I")
    public final int method488(int arg0) {
        if (arg0 != 2048) {
            this.method488(-9);
        }
        ++field1145;
        return this.field1137 != null ? this.field1137.method885() / 4 : 15;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        ++field1149;
        int var2 = -64 % ((arg0 - 56) / 52);
        if (this.field1137 != null) {
            this.field1137.method837();
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        if (arg0 > -8) {
            this.field1143 = 115;
        }
        ++field1161;
        return this.field1148;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZLqa;II)Len;")
    private final class208 method489(boolean arg0, class162 arg1, int arg2, int arg3) {
        ++field1140;
        class1 var5 = class402.field5388.method1994(-17294, 65535 & this.field1144);
        if (arg2 != 0) {
            this.field1163 = false;
        }
        class35 var6;
        class35 var7;
        if (this.field1139) {
            var6 = class37.field582[this.field1143];
            var7 = class209.field2868[0];
        } else {
            if (this.field1143 < 3) {
                var7 = class209.field2868[this.field1143 + 1];
            } else {
                var7 = null;
            }
            var6 = class209.field2868[this.field1143];
        }
        return var5.method19(arg0, this.field1138 != 11 ? this.field1138 : 10, arg1, super.field574, var6, arg3, arg2 ^ 70, var7, super.field584, ~this.field1138 == -12 ? this.field1165 + 4 : this.field1165, super.field568);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        if (!arg1) {
            this.field1148 = true;
        }
        ++field1153;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lqa;II)Lc;")
    private final class121 method490(class162 arg0, int arg1, int arg2) {
        ++field1142;
        if (this.field1137 != null && ~arg0.method564(this.field1137.method854(), arg2) == -1) {
            return this.field1137;
        } else {
            class208 var4 = this.method489(false, arg0, 0, arg2);
            if (arg1 <= 46) {
                return null;
            } else {
                return var4 == null ? null : var4.field2861;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        ++field1141;
        if (arg0 != -4534) {
            this.method343(-36, -75, (class162) null, -119);
        }
        return this.field1165;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(B)I")
    public final int method285(byte arg0) {
        ++field1147;
        if (arg0 < 113) {
            method492((byte) 57);
        }
        return this.field1137 == null ? 0 : this.field1137.method861();
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lqa;Lus;IIIIIZIIIIIIZ)V")
    public class77(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6 == -2, class487.method2799(arg12, arg13, 0));
        this.field1139 = arg7;
        this.field1138 = (byte) arg12;
        this.field1163 = arg14;
        this.field1143 = (byte) arg3;
        this.field1152 = ~arg1.field83 != -1 && !arg7;
        this.field1144 = (short) arg1.field33;
        this.field1165 = (byte) arg13;
        this.field1148 = arg0.method557() && arg1.field71 && !this.field1139 && ~class154.field2244.method3089((byte) 122, class166.field2414) != -1;
        int var16 = 2048;
        if (this.field1163) {
            var16 |= 65536;
        }
        class208 var17 = this.method489(this.field1148, arg0, 0, var16);
        if (var17 != null) {
            this.field1158 = var17.field2862;
            this.field1137 = var17.field2861;
            if (this.field1163) {
                this.field1137 = this.field1137.method863((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            this.method344(124);
        }
        ++field1157;
        return this.method490(arg1, arg0 ^ -26, arg2);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        ++field1160;
        Object var3 = null;
        class377 var5;
        if (this.field1158 == null && this.field1148) {
            class208 var4 = this.method489(true, arg0, 0, 262144);
            var5 = var4 == null ? null : var4.field2862;
        } else {
            var5 = this.field1158;
            this.field1158 = null;
        }
        if (var5 != null) {
            class238.method1477(var5, this.field1143, super.field584, super.field574, (boolean[]) null);
        }
        if (arg1 != 20203) {
            this.field1152 = true;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        if (arg0 != -87) {
            return -17;
        } else {
            ++field1151;
            return this.field1144 & 65535;
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        if (arg0 != -1736) {
            this.field1158 = null;
        }
        ++field1135;
        return this.field1138;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        ++field1146;
        Object var3 = null;
        if (arg0 != -7803) {
            this.field1139 = false;
        }
        class377 var5;
        if (this.field1158 == null && this.field1148) {
            class208 var4 = this.method489(true, arg1, 0, 262144);
            var5 = var4 == null ? null : var4.field2862;
        } else {
            var5 = this.field1158;
            this.field1158 = null;
        }
        if (var5 != null) {
            class382.method2269(var5, this.field1143, super.field584, super.field574, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field1164;
        class121 var5 = this.method490(arg2, arg0 ^ -91, 131072);
        if (arg0 != -1) {
            this.field1144 = -97;
        }
        if (var5 != null) {
            class414 var6 = arg2.method611();
            var6.method971(super.field584, super.field568, super.field574);
            return var5.method847(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            return true;
        } else {
            ++field1162;
            return this.field1163;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILhq;)V")
    public static final void method491(int arg0, class108 arg1) {
        ++field1159;
        arg1.method750(true);
        int var2 = 0;
        for (int var3 = 0; class461.field6368 > var3; ++var3) {
            int var15 = class461.field6370[var3];
            if ((class66.field1020[var15] & 1) == 0) {
                if (var2 > 0) {
                    class66.field1020[var15] = (byte) class191.method1230(class66.field1020[var15], 2);
                    --var2;
                } else {
                    int var16 = arg1.method756(7, 1);
                    if (var16 == 0) {
                        var2 = class295.method1727((byte) 103, arg1);
                        class66.field1020[var15] = (byte) class191.method1230(class66.field1020[var15], 2);
                    } else {
                        class423.method2434(69, arg1, var15);
                    }
                }
            }
        }
        arg1.method757((byte) 68);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method750(true);
            for (int var4 = 0; ~var4 > ~class461.field6368; ++var4) {
                int var13 = class461.field6370[var4];
                if ((class66.field1020[var13] & 1) != 0) {
                    if (var2 > 0) {
                        --var2;
                        class66.field1020[var13] = (byte) class191.method1230(class66.field1020[var13], 2);
                    } else {
                        int var14 = arg1.method756(7, 1);
                        if (~var14 == -1) {
                            var2 = class295.method1727((byte) 119, arg1);
                            class66.field1020[var13] = (byte) class191.method1230(class66.field1020[var13], 2);
                        } else {
                            class423.method2434(71, arg1, var13);
                        }
                    }
                }
            }
            arg1.method757((byte) 67);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method750(true);
                if (arg0 <= -119) {
                    for (int var5 = 0; ~var5 > ~class193.field2709; ++var5) {
                        int var11 = class385.field5247[var5];
                        if (~(class66.field1020[var11] & 1) != -1) {
                            if (var2 > 0) {
                                --var2;
                                class66.field1020[var11] = (byte) class191.method1230(class66.field1020[var11], 2);
                            } else {
                                int var12 = arg1.method756(7, 1);
                                if (~var12 == -1) {
                                    var2 = class295.method1727((byte) 108, arg1);
                                    class66.field1020[var11] = (byte) class191.method1230(class66.field1020[var11], 2);
                                } else if (class203.method1306(4, var11, arg1)) {
                                    class66.field1020[var11] = (byte) class191.method1230(class66.field1020[var11], 2);
                                }
                            }
                        }
                    }
                    arg1.method757((byte) 45);
                    if (~var2 != -1) {
                        throw new RuntimeException("nsn2");
                    } else {
                        arg1.method750(true);
                        for (int var6 = 0; ~class193.field2709 < ~var6; ++var6) {
                            int var9 = class385.field5247[var6];
                            if ((1 & class66.field1020[var9]) == 0) {
                                if (~var2 < -1) {
                                    class66.field1020[var9] = (byte) class191.method1230(class66.field1020[var9], 2);
                                    --var2;
                                } else {
                                    int var10 = arg1.method756(7, 1);
                                    if (var10 == 0) {
                                        var2 = class295.method1727((byte) 95, arg1);
                                        class66.field1020[var9] = (byte) class191.method1230(class66.field1020[var9], 2);
                                    } else if (class203.method1306(4, var9, arg1)) {
                                        class66.field1020[var9] = (byte) class191.method1230(class66.field1020[var9], 2);
                                    }
                                }
                            }
                        }
                        arg1.method757((byte) 123);
                        if (var2 != 0) {
                            throw new RuntimeException("nsn3");
                        } else {
                            class461.field6368 = 0;
                            class193.field2709 = 0;
                            for (int var7 = 1; ~var7 > -2049; ++var7) {
                                class66.field1020[var7] = (byte) (class66.field1020[var7] >> 1);
                                class515 var8 = class499.field6901[var7];
                                if (var8 == null) {
                                    class385.field5247[class193.field2709++] = var7;
                                } else {
                                    class461.field6370[class461.field6368++] = var7;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(B)V")
    public static final void method492(byte arg0) {
        class238.field3185 = new class403[class14.field279.method2724(0)][];
        if (arg0 != -118) {
            method491(-4, (class108) null);
        }
        ++field1150;
        class462.field6402 = new class403[class14.field279.method2724(arg0 + 118)][];
        class489.field6793 = new boolean[class14.field279.method2724(0)];
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        ++field1155;
        if (this.field1137 == null) {
            return null;
        } else {
            class414 var3 = arg1.method611();
            var3.method971(super.field584, super.field568, super.field574);
            class514 var4 = null;
            if (this.field1152) {
                var4 = class148.method1020(arg0 + -9124, 1);
            }
            if (arg0 != 9124) {
                this.method489(true, (class162) null, -28, -7);
            }
            this.field1137.method853(var3, var4 == null ? null : var4.field7563[0], 0);
            return var4;
        }
    }
}
