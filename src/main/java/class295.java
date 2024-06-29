import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class295 extends class315 {

    @OriginalMember(owner = "client!fp", name = "gb", descriptor = "Z")
    public boolean field3963 = false;

    @OriginalMember(owner = "client!fp", name = "vb", descriptor = "Z")
    public boolean field3978 = false;

    @OriginalMember(owner = "client!fp", name = "Eb", descriptor = "Z")
    public boolean field3987 = false;

    @OriginalMember(owner = "client!fp", name = "Ab", descriptor = "Z")
    public boolean field3983 = false;

    @OriginalMember(owner = "client!fp", name = "pb", descriptor = "Z")
    public boolean field3972 = false;

    @OriginalMember(owner = "client!fp", name = "ub", descriptor = "Z")
    public static boolean field3977 = false;

    @OriginalMember(owner = "client!fp", name = "wb", descriptor = "Ljk;")
    public static class585 field3979 = new class585(6, 3);

    @OriginalMember(owner = "client!fp", name = "fb", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!fp", name = "hb", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!fp", name = "ib", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!fp", name = "jb", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!fp", name = "kb", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!fp", name = "lb", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!fp", name = "mb", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!fp", name = "nb", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!fp", name = "ob", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!fp", name = "qb", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!fp", name = "rb", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!fp", name = "sb", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!fp", name = "tb", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!fp", name = "xb", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!fp", name = "yb", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!fp", name = "zb", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!fp", name = "Bb", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!fp", name = "Cb", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!fp", name = "Db", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!fp", name = "Fb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!fp", name = "Gb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!fp", name = "Hb", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!fp", name = "Ib", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lwd;I)V")
    public final void method1742(class248 arg0, int arg1) {
        ++field3969;
        class38 var3 = null;
        try {
            class477 var4 = arg0.method1505("", arg1, true);
            while (~var4.field6693 == -1) {
                class151.method974((byte) -102, 1L);
            }
            if (arg1 != -1) {
                this.field3963 = true;
            }
            if (var4.field6693 == 1) {
                var3 = (class38) var4.field6695;
                class389 var5 = new class389(class673.method3832((byte) -121));
                this.method1846((byte) -111, var5);
                var3.method441(0, var5.field5205, var5.field5195, 3763);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method442((byte) -72);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IZ)V")
    public final void method1743(int arg0, boolean arg1) {
        super.field4166 = arg1;
        ++field3962;
        if (class37.field703 != null) {
            class37.field703.method809(!this.method1747(0, class375.field5039), 30);
        }
        if (arg0 != -26848) {
            field3979 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    private final void method1744(int arg0) {
        if (arg0 == -27136) {
            ++field3966;
            if (~class32.field649 >= -2) {
                super.field4164 = 2;
            } else {
                super.field4164 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static final void method1745(byte arg0) {
        ++field3991;
        class349.field4587.method1131((byte) -101);
        if (arg0 >= -39) {
            field3984 = 68;
        }
        class628.field9000 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BII)I")
    private final int method1746(byte arg0, int arg1, int arg2) {
        ++field3968;
        byte var4;
        if (~arg1 < -20001) {
            this.method1751(arg0 + 12);
            var4 = 4;
        } else if (arg1 <= 10000) {
            if (~arg1 < -5001) {
                var4 = 2;
                this.method1752((byte) -81);
            } else {
                this.method1749(-3660, true);
                var4 = 1;
            }
        } else {
            var4 = 3;
            this.method1762(-83);
        }
        if (~class375.field5039 != ~arg2) {
            super.field4154 = arg2;
            class435.method2608(-60, arg2);
        }
        if (arg0 != -121) {
            this.field3983 = false;
        }
        this.method1742(class517.field7570, arg0 ^ 120);
        return var4;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)Z")
    public final boolean method1747(int arg0, int arg1) {
        ++field3971;
        return arg0 == arg1 && !this.field3987 ? super.field4166 : true;
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)I")
    private final int method1748(int arg0) {
        if (arg0 != 500) {
            this.method1749(-71, false);
        }
        ++field3970;
        byte var3;
        if (~class590.field8558 <= -97) {
            int var2 = class200.method1217(arg0 ^ 398);
            if (~var2 >= -101) {
                var3 = 4;
                this.method1751(arg0 ^ -417);
            } else if (var2 <= 500) {
                this.method1762(-77);
                var3 = 3;
            } else if (~var2 >= -1001) {
                var3 = 2;
                this.method1752((byte) -81);
            } else {
                this.method1749(-3660, true);
                var3 = 1;
            }
        } else {
            var3 = 1;
            this.method1749(arg0 + -4160, true);
        }
        if (~class375.field5039 != -1) {
            super.field4154 = 0;
            class435.method2608(82, 0);
        }
        this.method1742(class517.field7570, -1);
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(IZ)V")
    public final void method1749(int arg0, boolean arg1) {
        ++field3976;
        this.method1743(arg0 + -23188, false);
        super.field4179 = false;
        super.field4165 = !class588.field8518.equals(class668.field9580);
        super.field4170 = false;
        super.field4142 = false;
        super.field4137 = 0;
        super.field4159 = false;
        super.field4146 = super.field4174 = 0;
        super.field4132 = false;
        super.field4157 = false;
        super.field4175 = false;
        if (arg0 != -3660) {
            this.method1743(5, true);
        }
        super.field4147 = super.field4152 = 0;
        super.field4135 = false;
        super.field4136 = false;
        super.field4150 = false;
        class680.method3856(false, 0);
        super.field4149 = false;
        super.field4161 = false;
        super.field4172 = 0;
        this.method1744(arg0 + -23476);
        this.method1761(arg0 + -8157, 2);
        super.field4153 = 1;
        if (arg1) {
            class231.method1399(97693160);
        }
        class221.method1337(arg0 ^ -3664);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lun;B)V")
    private final void method1750(class389 arg0, byte arg1) {
        ++field3974;
        if (~(arg0.field5205.length - arg0.field5195) <= -2) {
            int var3 = arg0.method2229(arg1 ^ -169);
            if (var3 >= 0 && ~var3 >= -23) {
                byte var4;
                if (~var3 == -23) {
                    var4 = 45;
                } else if (var3 == 21) {
                    var4 = 44;
                } else if (~var3 != -21) {
                    if (~var3 != -20) {
                        if (~var3 != -19) {
                            if (var3 != 17) {
                                if (var3 == 16) {
                                    var4 = 38;
                                } else if (var3 != 15) {
                                    if (var3 == 14) {
                                        var4 = 36;
                                    } else if (~var3 == -14) {
                                        var4 = 35;
                                    } else if (~var3 != -13) {
                                        if (var3 != 11) {
                                            if (~var3 != -11) {
                                                if (~var3 == -10) {
                                                    var4 = 31;
                                                } else if (~var3 != -9) {
                                                    if (var3 != 7) {
                                                        if (~var3 != -7) {
                                                            if (~var3 == -6) {
                                                                var4 = 28;
                                                            } else if (var3 == 4) {
                                                                var4 = 24;
                                                            } else if (var3 == 3) {
                                                                var4 = 23;
                                                            } else if (~var3 != -3) {
                                                                if (var3 == 1) {
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
                                                    var4 = 30;
                                                }
                                            } else {
                                                var4 = 32;
                                            }
                                        } else {
                                            var4 = 33;
                                        }
                                    } else {
                                        var4 = 34;
                                    }
                                } else {
                                    var4 = 37;
                                }
                            } else {
                                var4 = 40;
                            }
                        } else {
                            var4 = 41;
                        }
                    } else {
                        var4 = 42;
                    }
                } else {
                    var4 = 43;
                }
                if (~var4 >= ~(arg0.field5205.length - arg0.field5195)) {
                    super.field4171 = arg0.method2229(arg1 ^ -169);
                    if (super.field4171 < 1) {
                        super.field4171 = 1;
                    } else if (~super.field4171 < -5) {
                        super.field4171 = 4;
                    }
                    this.method1743(arg1 ^ 26760, ~arg0.method2229(255) == -2);
                    super.field4179 = ~arg0.method2229(255) == -2;
                    super.field4165 = ~arg0.method2229(255) == -2;
                    super.field4157 = ~arg0.method2229(255) == -2;
                    super.field4137 = ~arg0.method2229(255) != -2 ? 0 : 1;
                    super.field4136 = ~arg0.method2229(255) == -2;
                    super.field4135 = ~arg0.method2229(arg1 ^ -169) == -2;
                    super.field4132 = ~arg0.method2229(255) == -2;
                    super.field4146 = arg0.method2229(arg1 ^ -169);
                    if (~super.field4146 < -3) {
                        super.field4146 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field4174 = arg0.method2229(255);
                    }
                    if (~var3 > -3) {
                        super.field4175 = ~arg0.method2229(255) == -2;
                        arg0.method2229(255);
                    } else {
                        super.field4175 = arg0.method2229(255) == 1;
                        if (var3 >= 17) {
                            super.field4150 = ~arg0.method2229(arg1 ^ -169) == -2;
                        }
                    }
                    super.field4159 = ~arg0.method2229(255) == -2;
                    super.field4170 = ~arg0.method2229(255) == -2;
                    super.field4147 = arg0.method2229(arg1 ^ -169);
                    if (super.field4147 > 2) {
                        super.field4147 = 2;
                    }
                    super.field4152 = super.field4147;
                    super.field4138 = ~arg0.method2229(255) == -2;
                    super.field4155 = arg0.method2229(255);
                    if (super.field4155 > 127) {
                        super.field4155 = 127;
                    }
                    if (var3 < 20) {
                        super.field4176 = super.field4155;
                    } else {
                        super.field4176 = arg0.method2229(255);
                        if (super.field4176 > 127) {
                            super.field4176 = 127;
                        }
                    }
                    super.field4158 = arg0.method2229(255);
                    super.field4134 = arg0.method2229(255);
                    if (super.field4134 > 127) {
                        super.field4134 = 127;
                    }
                    if (~var3 <= -22) {
                        super.field4162 = arg0.method2229(arg1 ^ -169);
                        if (super.field4162 > 127) {
                            super.field4162 = 127;
                        }
                    } else {
                        super.field4162 = super.field4158;
                    }
                    if (var3 >= 1) {
                        super.field4133 = arg0.method2260(-94);
                        super.field4140 = arg0.method2260(-67);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method2229(255);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method2229(arg1 + 343);
                        if (var5 < 0 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class590.field8558 > -97) {
                            var5 = 0;
                        }
                        class680.method3856(false, var5);
                    }
                    if (~var3 <= -6) {
                        super.field4168 = arg0.method2255(255);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field4148 = var6 = arg0.method2229(255);
                    }
                    if (super.field4148 != 1 && super.field4148 != 2) {
                        super.field4148 = 2;
                    }
                    if (arg1 != -88) {
                        this.method1759(32, 75);
                    }
                    if (var3 >= 7) {
                        super.field4163 = arg0.method2229(255) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field4141 = arg0.method2229(255) == 1;
                    }
                    if (var3 >= 9) {
                        super.field4172 = arg0.method2229(arg1 ^ -169);
                    }
                    if (~super.field4172 > -1 || super.field4172 > class467.method2739(class590.field8558, (byte) -8)) {
                        super.field4172 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field4149 = ~arg0.method2229(255) != -1;
                    }
                    if (var3 >= 11) {
                        super.field4151 = ~arg0.method2229(255) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field4137 = arg0.method2229(255);
                    }
                    if (super.field4137 < 0 || ~super.field4137 < -3) {
                        super.field4137 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field4161 = arg0.method2229(255) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 != -1) {
                            super.field4154 = 1;
                        } else {
                            super.field4154 = 2;
                        }
                    } else {
                        super.field4154 = arg0.method2229(arg1 + 343);
                    }
                    if (super.field4154 < 0 || ~super.field4154 < -6) {
                        super.field4154 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field4164 = arg0.method2229(255);
                        if (~super.field4164 > -1 || super.field4164 > 4) {
                            super.field4164 = class32.field649 == 1 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field4142 = ~arg0.method2229(255) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field4142 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && super.field4154 == 0) {
                        super.field4154 = 2;
                    }
                    if (var3 >= 18) {
                        super.field4153 = arg0.method2229(arg1 ^ -169);
                        if (super.field4153 < 0 || ~super.field4153 < -5) {
                            super.field4153 = 0;
                        }
                    }
                    if (~var3 <= -20) {
                        super.field4143 = arg0.method2229(255);
                    } else if (super.field4153 != 1 && super.field4153 != 2) {
                        if (super.field4153 == 3) {
                            super.field4143 = 1;
                        } else {
                            super.field4143 = 0;
                        }
                    } else {
                        super.field4143 = 2;
                    }
                    if (~var3 <= -23) {
                        super.field4173 = arg0.method2229(255);
                    }
                    if (~super.field4154 == -1 && class590.field8558 < 96 && ~super.field4153 != -2 && super.field4153 != 0) {
                        this.method1749(arg1 + -3572, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
    public final void method1751(int arg0) {
        if (arg0 > -83) {
            this.field3987 = true;
        }
        this.method1743(-26848, true);
        ++field3988;
        super.field4135 = true;
        super.field4147 = super.field4152 = 0;
        super.field4165 = true;
        super.field4170 = true;
        super.field4175 = true;
        super.field4146 = super.field4174 = 2;
        super.field4150 = true;
        super.field4142 = true;
        super.field4132 = true;
        super.field4136 = true;
        super.field4157 = true;
        super.field4179 = true;
        super.field4137 = 1;
        super.field4159 = true;
        if (~class590.field8558 < -96) {
            class680.method3856(false, 2);
        } else {
            class680.method3856(false, 0);
        }
        super.field4172 = 0;
        super.field4149 = false;
        super.field4161 = true;
        this.method1744(-27136);
        this.method1761(-11817, 0);
        super.field4153 = 4;
        class231.method1399(97693160);
        class221.method1337(4);
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)V")
    public final void method1752(byte arg0) {
        ++field3986;
        this.method1743(-26848, true);
        super.field4135 = false;
        super.field4179 = false;
        super.field4150 = false;
        super.field4157 = false;
        super.field4136 = false;
        super.field4175 = false;
        super.field4142 = false;
        if (arg0 == -81) {
            super.field4137 = 0;
            super.field4147 = super.field4152 = 0;
            super.field4165 = true;
            super.field4146 = super.field4174 = 0;
            super.field4170 = false;
            super.field4132 = false;
            super.field4159 = false;
            class680.method3856(false, 0);
            super.field4149 = false;
            super.field4161 = true;
            super.field4172 = 0;
            this.method1744(-27136);
            this.method1761(-11817, 2);
            super.field4153 = 2;
            class231.method1399(arg0 + 97693241);
            class221.method1337(arg0 + 85);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I")
    private final int method1753(boolean arg0, int arg1) {
        ++field3989;
        byte var3;
        if (arg1 > 12000) {
            var3 = 4;
            this.method1751(-96);
        } else if (~arg1 < -5001) {
            this.method1762(-119);
            var3 = 3;
        } else if (arg1 > 2000) {
            var3 = 2;
            this.method1752((byte) -81);
        } else {
            this.method1749(-3660, true);
            var3 = 1;
        }
        if (~class375.field5039 != -3) {
            super.field4154 = 2;
            class435.method2608(83, 2);
        }
        if (!arg0) {
            this.field3963 = false;
        }
        this.method1742(class517.field7570, -1);
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)I")
    public static final int method1754(int arg0, int arg1) {
        if (arg1 != 4) {
            return -55;
        } else {
            ++field3965;
            return arg0 >>> 10;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI)Z")
    public final boolean method1755(byte arg0, int arg1) {
        if (arg0 >= -3) {
            field3981 = -81;
        }
        ++field3973;
        return arg1 == 0 ? super.field4166 : true;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)I")
    public final int method1756(byte arg0) {
        ++field3980;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class517.field7570.field3404 && !class517.field7570.field3401) {
            if (class248.field3420.startsWith("win")) {
                if (!class248.field3403.startsWith("amd64") && !class248.field3403.startsWith("x86_64")) {
                    var2 = true;
                }
                var3 = true;
                var4 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field3963) {
            var3 = false;
        }
        if (this.field3972) {
            var2 = false;
        }
        if (this.field3983) {
            var4 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method1748(500);
        } else {
            int var5 = -1;
            int var6 = -83 % ((71 - arg0) / 35);
            int var7 = -1;
            int var8 = -1;
            if (var2) {
                try {
                    var5 = class454.method2693(1000, 2, (byte) 125);
                } catch (Exception var17) {
                }
            }
            if (var4) {
                try {
                    var8 = class454.method2693(1000, 3, (byte) 86);
                    if (~class375.field5039 == -4) {
                        class191 var9 = class68.field1045.method314();
                        long var10 = 281474976710655L & var9.field2333;
                        int var12 = var9.field2327;
                        if (var12 != 4318) {
                            if (~var12 == -4099) {
                                var3 &= ~var10 <= -60129613780L;
                            }
                        } else {
                            var3 &= ~var10 <= -64425238955L;
                        }
                    }
                } catch (Exception var16) {
                }
            }
            if (var3) {
                try {
                    var7 = class454.method2693(1000, 1, (byte) 84);
                } catch (Exception var15) {
                }
            }
            if (var5 == -1 && ~var7 == 0 && ~var8 == 0) {
                return this.method1748(500);
            } else {
                int var13 = (int) ((float) var7 * 1.1F);
                int var14 = (int) ((float) var8 * 1.1F);
                if (var14 < var5 && ~var13 > ~var5) {
                    return this.method1753(true, var5);
                } else {
                    return var13 >= var14 ? this.method1746((byte) -121, var13, 1) : this.method1746((byte) -121, var14, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(IZ)I")
    public final int method1757(int arg0, boolean arg1) {
        ++field3982;
        if (this.field3978) {
            return 0;
        } else if (!this.method1747(0, arg0)) {
            return 1;
        } else {
            if (!arg1) {
                this.field3972 = true;
            }
            return super.field4179 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field3979 = null;
        if (arg0 < 121) {
            field3977 = false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)I")
    public final int method1759(int arg0, int arg1) {
        ++field3967;
        int var3 = 68 / ((arg1 - -21) / 37);
        if (class456.method2712(51, arg0) && !class14.method151(class114.field1485, 0)) {
            return ~class590.field8558 > -97 && class565.method3313((byte) 24, arg0) && ~super.field4143 == -1 ? 1 : super.field4143;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)V")
    public static final void method1760(int arg0) {
        if (class70.field1066 == null) {
            class70.field1066 = class236.method1436((byte) 121);
            class604.field8712 = class70.field1066[0];
            class84.field1197 = class301.method1787((byte) 113);
        }
        ++field3985;
        if (class91.field1282 == null) {
            class87.method692((byte) -104);
        }
        class236 var1 = class604.field8712;
        int var2 = class531.method3124((byte) 42);
        if (arg0 > 115) {
            if (class604.field8712 != var1) {
                if (class604.field8712 == class236.field3181) {
                    class91.field1282 = null;
                    class245.method1487(3, -21316);
                } else {
                    class502.field7009 = var1.field3159.method2561(class370.field4980, 0);
                    class651.field9215 = var1.field3147;
                    if (class604.field8712.field3158) {
                        class502.field7009 = class502.field7009 + var1.field3147 + "%";
                    }
                    if (class604.field8712.field3154 || var1.field3154) {
                        class84.field1197 = class301.method1787((byte) -75);
                    }
                }
            } else {
                class502.field7009 = class604.field8712.field3148.method2561(class370.field4980, 0);
                if (class604.field8712.field3154) {
                    class651.field9215 = (-class604.field8712.field3157 + class604.field8712.field3147) * var2 / 100 + class604.field8712.field3157;
                }
                if (class604.field8712.field3158) {
                    class502.field7009 = class502.field7009 + class651.field9215 + "%";
                }
            }
            if (class91.field1282 != null) {
                class91.field1282.method3286(class84.field1197, class651.field9215, (byte) -39, class604.field8712, class502.field7009);
                if (class268.field3680 != null) {
                    for (int var3 = class626.field8981 + 1; ~class268.field3680.length < ~var3; ++var3) {
                        if (~class268.field3680[var3].method3077(14949) <= -101 && var3 + -1 == class626.field8981 && class114.field1485 >= 1 && class91.field1282.method3293(103)) {
                            try {
                                class268.field3680[var3].method3084(2280);
                            } catch (Exception var4) {
                                class268.field3680 = null;
                                return;
                            }
                            class91.field1282.method3285(0, class268.field3680[var3]);
                            ++class626.field8981;
                            if (class268.field3680.length - 1 <= class626.field8981 && ~class268.field3680.length < -2) {
                                class626.field8981 = !class599.field8647.method603(-84) ? -1 : 0;
                            }
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(II)V")
    public final void method1761(int arg0, int arg1) {
        class90.field1264 = null;
        if (arg0 != -11817) {
            method1760(105);
        }
        class700.field9885 = true;
        ++field3964;
        super.field4143 = arg1;
    }

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "(I)V")
    public final void method1762(int arg0) {
        ++field3975;
        this.method1743(-26848, true);
        super.field4175 = true;
        super.field4142 = true;
        super.field4136 = true;
        super.field4135 = true;
        super.field4146 = super.field4174 = 1;
        super.field4150 = false;
        if (arg0 > -68) {
            this.field3978 = false;
        }
        super.field4170 = true;
        super.field4147 = super.field4152 = 0;
        super.field4132 = true;
        super.field4159 = false;
        super.field4165 = true;
        super.field4137 = 1;
        super.field4157 = true;
        super.field4179 = true;
        if (~class590.field8558 < -96) {
            class680.method3856(false, 1);
        } else {
            class680.method3856(false, 0);
        }
        super.field4172 = 0;
        super.field4149 = false;
        super.field4161 = true;
        this.method1744(-27136);
        this.method1761(-11817, 1);
        super.field4153 = 3;
        class231.method1399(97693160);
        class221.method1337(4);
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lwd;)V")
    public class295(class248 arg0) {
        super.field4153 = 3;
        super.field4171 = 3;
        this.method1743(-26848, true);
        super.field4147 = 0;
        super.field4157 = true;
        super.field4159 = true;
        super.field4158 = 127;
        super.field4140 = 0;
        super.field4175 = true;
        super.field4150 = false;
        super.field4133 = 0;
        super.field4134 = 127;
        super.field4165 = true;
        super.field4176 = 127;
        super.field4174 = 0;
        super.field4132 = true;
        super.field4146 = 2;
        super.field4138 = true;
        super.field4170 = true;
        super.field4179 = true;
        super.field4136 = true;
        super.field4135 = true;
        super.field4162 = 127;
        super.field4137 = 1;
        super.field4155 = 127;
        super.field4152 = 0;
        if (~class590.field8558 > -97) {
            class680.method3856(false, 0);
        } else {
            class680.method3856(false, 2);
        }
        super.field4143 = 0;
        super.field4164 = ~class32.field649 == -2 ? 2 : 4;
        super.field4148 = 2;
        super.field4161 = true;
        super.field4168 = 0;
        super.field4141 = false;
        super.field4151 = true;
        super.field4149 = false;
        super.field4163 = false;
        super.field4154 = 2;
        super.field4172 = 0;
        class38 var2 = null;
        try {
            class477 var3 = arg0.method1505("", -1, true);
            while (~var3.field6693 == -1) {
                class151.method974((byte) -102, 1L);
            }
            if (var3.field6693 == 1) {
                var2 = (class38) var3.field6695;
                byte[] var4 = new byte[(int) var2.method445(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method440(var5, -116, var4.length + -var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1750(new class389(var4), (byte) -88);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method442((byte) -72);
            }
        } catch (Exception var7) {
        }
    }
}
