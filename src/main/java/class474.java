import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class474 extends class29 {

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "Z")
    public boolean field7092 = false;

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "Z")
    public boolean field7097 = false;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field7083 = 0;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "F")
    public static float field7094 = 1.0F;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "[I")
    public static int[] field7086 = new int[14];

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!fb", name = "jb", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lbu;")
    public static class17 field7088;

    @OriginalMember(owner = "client!fb", name = "kb", descriptor = "Lvu;")
    public static class222 field7099;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lcu;I)V", line = 3)
    private final void method2833(class145 arg0, int arg1) {
        ++field7096;
        if (arg0.field2270.length + -arg0.field2289 >= 1) {
            int var3 = arg0.method1063((byte) 117);
            if (~var3 <= -1 && var3 <= 17) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (~var3 != -17) {
                    if (var3 == 15) {
                        var4 = 37;
                    } else if (var3 != 14) {
                        if (var3 != 13) {
                            if (var3 == 12) {
                                var4 = 34;
                            } else if (var3 != 11) {
                                if (~var3 != -11) {
                                    if (var3 != 9) {
                                        if (~var3 != -9) {
                                            if (var3 != 7) {
                                                if (~var3 == -7) {
                                                    var4 = 28;
                                                } else if (~var3 != -6) {
                                                    if (~var3 == -5) {
                                                        var4 = 24;
                                                    } else if (~var3 == -4) {
                                                        var4 = 23;
                                                    } else if (~var3 == -3) {
                                                        var4 = 22;
                                                    } else if (~var3 == -2) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
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
                                        var4 = 31;
                                    }
                                } else {
                                    var4 = 32;
                                }
                            } else {
                                var4 = 33;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 36;
                    }
                } else {
                    var4 = 38;
                }
                if (arg0.field2270.length - arg0.field2289 >= var4) {
                    super.field602 = arg0.method1063((byte) 120);
                    if (super.field602 < 1) {
                        super.field602 = 1;
                    } else if (~super.field602 < -5) {
                        super.field602 = 4;
                    }
                    this.method2845(~arg0.method1063((byte) 126) == -2, false);
                    super.field631 = arg0.method1063((byte) -28) == 1;
                    super.field593 = arg0.method1063((byte) 125) == 1;
                    super.field618 = arg1 == arg0.method1063((byte) 114);
                    super.field595 = ~arg0.method1063((byte) 123) != -2 ? 0 : 1;
                    super.field598 = ~arg0.method1063((byte) -64) == -2;
                    super.field632 = ~arg0.method1063((byte) -28) == -2;
                    super.field612 = arg0.method1063((byte) 114) == 1;
                    super.field625 = arg0.method1063((byte) -115);
                    if (super.field625 > 2) {
                        super.field625 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field597 = arg0.method1063((byte) 116);
                    }
                    if (var3 >= 2) {
                        super.field613 = arg0.method1063((byte) 105) == 1;
                        if (var3 >= 17) {
                            super.field605 = ~arg0.method1063((byte) 117) == -2;
                        }
                    } else {
                        super.field613 = arg0.method1063((byte) -67) == 1;
                        arg0.method1063((byte) 104);
                    }
                    super.field629 = ~arg0.method1063((byte) -21) == -2;
                    super.field609 = ~arg0.method1063((byte) -77) == -2;
                    super.field611 = arg0.method1063((byte) -50);
                    if (~super.field611 < -3) {
                        super.field611 = 2;
                    }
                    super.field610 = super.field611;
                    super.field621 = ~arg0.method1063((byte) 127) == -2;
                    super.field630 = arg0.method1063((byte) 116);
                    if (super.field630 > 127) {
                        super.field630 = 127;
                    }
                    super.field594 = arg0.method1063((byte) 115);
                    super.field607 = arg0.method1063((byte) -93);
                    if (~super.field607 < -128) {
                        super.field607 = 127;
                    }
                    if (var3 >= 1) {
                        super.field599 = arg0.method1069((byte) -47);
                        super.field628 = arg0.method1069((byte) -120);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method1063((byte) -41);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method1063((byte) 113);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (class457.field6854 < 96) {
                            var5 = 0;
                        }
                        class156.method1174(arg1 ^ 62, var5);
                    }
                    if (var3 >= 5) {
                        super.field620 = arg0.method1070(-32387);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field619 = var6 = arg0.method1063((byte) -29);
                    }
                    if (super.field619 != 1 && ~super.field619 != -3) {
                        super.field619 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field608 = ~arg0.method1063((byte) -119) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field601 = ~arg0.method1063((byte) -21) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field615 = arg0.method1063((byte) 125);
                    }
                    if (~super.field615 > -1 || ~super.field615 < ~class87.method684(class457.field6854, 99)) {
                        super.field615 = 0;
                    }
                    if (var3 >= 10) {
                        super.field623 = ~arg0.method1063((byte) 109) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field617 = ~arg0.method1063((byte) -67) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field595 = arg0.method1063((byte) -82);
                    }
                    if (~super.field595 > -1 || super.field595 > 2) {
                        super.field595 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field596 = arg0.method1063((byte) -40) == 1;
                    }
                    if (~var3 > -15) {
                        if (~var6 != -1) {
                            super.field604 = 1;
                        } else {
                            super.field604 = 2;
                        }
                    } else {
                        super.field604 = arg0.method1063((byte) -50);
                    }
                    if (~super.field604 > -1 || super.field604 > 3) {
                        super.field604 = 2;
                    }
                    if (var3 >= 15) {
                        super.field626 = arg0.method1063((byte) 127);
                        if (~super.field626 > -1 || super.field626 > 4) {
                            super.field626 = class57.field997 != 1 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field616 = arg0.method1063((byte) 121) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field616 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field604 == -1) {
                        super.field604 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 265)
    public static final void method2834(byte arg0) {
        for (int var1 = 0; var1 < class237.field3431.length; ++var1) {
            for (int var3 = 0; class237.field3431[var1].length > var3; ++var3) {
                class237.field3431[var1][var3] = class427.field6352;
            }
        }
        ++field7080;
        int var2 = 117 % ((arg0 - 27) / 40);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 292)
    public static void method2835(boolean arg0) {
        if (arg0) {
            method2842(53);
        }
        field7088 = null;
        field7099 = null;
        field7086 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I", line = 311)
    public final int method2836(int arg0, int arg1) {
        ++field7089;
        if (this.field7092) {
            return 0;
        } else if (!this.method2840(255, arg0)) {
            return 1;
        } else {
            if (arg1 != -2) {
                method2846((class162) null, (class17) null, -89);
            }
            return super.field631 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z", line = 331)
    public static final boolean method2837(int arg0, int arg1, int arg2) {
        ++field7093;
        int var3 = 75 / ((45 - arg0) / 50);
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILmq;)V", line = 343)
    public static final void method2838(int arg0, int arg1, int arg2, class350 arg3) {
        ++field7079;
        if (arg3 != null) {
            if (arg3.field5237 != null) {
                class207 var4 = new class207();
                var4.field2995 = arg3;
                var4.field2996 = arg3.field5237;
                class437.method2614(var4);
            }
            class347.field5187 = arg3.field5354;
            class417.field6234 = arg0;
            if (arg1 != -11) {
                field7090 = 29;
            }
            class383.field5790 = arg3.field5322;
            class99.field1638 = true;
            class56.field980 = arg3.field5357;
            class245.field3518 = arg3.field5309;
            class63.field1086 = arg3.field5273;
            class140.field2234 = arg2;
            class302.method1902((byte) -118, arg3);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 376)
    public static final void method2839(byte arg0) {
        class28.method321(class97.field1623, -5001);
        ++field7084;
        ++class426.field6343;
        class410.field6141.method1109(false, class8.method43(false));
        class410.field6141.method1094(1618659784, class466.field6952);
        int var1 = -58 / ((arg0 - 28) / 56);
        class410.field6141.method1094(1618659784, class77.field1297);
        class410.field6141.method1109(false, class443.field6623.field610);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)Z", line = 392)
    public final boolean method2840(int arg0, int arg1) {
        ++field7081;
        if (arg0 != 255) {
            method2846((class162) null, (class17) null, -87);
        }
        return arg1 == 0 && !this.field7097 ? super.field603 : true;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lli;)V", line = 588)
    public class474(class293 arg0) {
        super.field602 = 3;
        this.method2845(true, false);
        super.field632 = true;
        super.field609 = true;
        super.field629 = true;
        super.field612 = true;
        super.field611 = 0;
        super.field621 = true;
        super.field625 = 2;
        super.field607 = 127;
        super.field597 = 0;
        super.field598 = true;
        super.field605 = false;
        super.field628 = 0;
        super.field613 = true;
        super.field594 = 255;
        super.field593 = true;
        super.field630 = 127;
        super.field599 = 0;
        super.field595 = 1;
        super.field618 = true;
        super.field631 = true;
        super.field610 = 0;
        if (~class457.field6854 <= -97) {
            class156.method1174(75, 2);
        } else {
            class156.method1174(127, 0);
        }
        super.field604 = 2;
        super.field623 = false;
        super.field596 = true;
        super.field619 = 2;
        super.field620 = 0;
        super.field615 = 0;
        super.field601 = false;
        super.field608 = false;
        super.field626 = class57.field997 == 1 ? 2 : 4;
        super.field617 = true;
        class346 var2 = null;
        try {
            class324 var3 = arg0.method1856(0, "");
            while (~var3.field4940 == -1) {
                class71.method583(1L, -113);
            }
            if (~var3.field4940 == -2) {
                var2 = (class346) var3.field4939;
                byte[] var4 = new byte[(int) var2.method2200(false)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2198(var5, var4.length + -var5, var4, false);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2833(new class145(var4), 1);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2199((byte) -122);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lcu;", line = 425)
    public final class145 method2841(int arg0) {
        ++field7087;
        class145 var2 = new class145(41);
        var2.method1109(false, 17);
        var2.method1109(false, super.field602);
        var2.method1109(false, !super.field603 ? 0 : 1);
        var2.method1109(false, !super.field631 ? 0 : 1);
        var2.method1109(false, super.field593 ? 1 : 0);
        var2.method1109(false, !super.field618 ? 0 : 1);
        var2.method1109(false, 0);
        var2.method1109(false, !super.field598 ? 0 : 1);
        var2.method1109(false, !super.field632 ? 0 : 1);
        var2.method1109(false, super.field612 ? 1 : 0);
        var2.method1109(false, super.field625);
        var2.method1109(false, super.field597);
        var2.method1109(false, !super.field613 ? 0 : 1);
        var2.method1109(false, !super.field605 ? 0 : 1);
        var2.method1109(false, super.field629 ? 1 : 0);
        var2.method1109(false, !super.field609 ? 0 : 1);
        var2.method1109(false, super.field611);
        var2.method1109(false, !super.field621 ? 0 : 1);
        var2.method1109(false, super.field630);
        var2.method1109(false, super.field594);
        var2.method1109(false, super.field607);
        var2.method1094(1618659784, super.field599);
        var2.method1094(1618659784, super.field628);
        var2.method1109(false, class389.method2398(1006));
        var2.method1117(super.field620, (byte) 12);
        var2.method1109(false, super.field619);
        var2.method1109(false, !super.field608 ? 0 : 1);
        if (arg0 != 19707) {
            method2839((byte) -100);
        }
        var2.method1109(false, super.field601 ? 1 : 0);
        var2.method1109(false, super.field615);
        var2.method1109(false, super.field623 ? 1 : 0);
        var2.method1109(false, !super.field617 ? 0 : 1);
        var2.method1109(false, super.field595);
        var2.method1109(false, !super.field596 ? 0 : 1);
        var2.method1109(false, super.field604);
        var2.method1109(false, super.field626);
        var2.method1109(false, !super.field616 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 476)
    public static final void method2842(int arg0) {
        if (~class384.field5800 <= -1) {
            long var1 = class211.method1419(arg0 + -52359);
            class384.field5800 = (int) ((long) class384.field5800 - (var1 - class487.field7213));
            if (class384.field5800 <= 0) {
                class515.field7571 = class519.field7714.field3219;
                class118.field1946 = class519.field7714.field3222;
                class453.field6777 = class519.field7714.field3208;
                class384.field5800 = -1;
                class219.field3143 = class519.field7714.field3217;
                class60.field1061 = class519.field7714.field3216;
                class237.field3432 = class519.field7714.field3210;
                class134.field2105 = class519.field7714.field3209;
                class234.field3408 = class519.field7714.field3215;
                class292.field4158 = class519.field7714.field3224;
                class97.field1620 = class519.field7714.field3211;
            } else {
                int var3 = (class384.field5800 << 8) / class291.field4146;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class237.field3432 = (16711680 & (class85.field1477 & 65280) * var3 - -((class519.field7714.field3210 & 65280) * var4)) + (-16711936 & (16711935 & class85.field1477) * var3 - -((class519.field7714.field3210 & 16711935) * var4)) >>> 8;
                class134.field2105 = class410.field6142 * var3 + class519.field7714.field3209 * var4 >> 8;
                class292.field4158 = (-class521.field7733 + class519.field7714.field3224) * var6 + class521.field7733;
                class219.field3143 = (-class361.field5467 + class519.field7714.field3217) * var6 + class361.field5467;
                class97.field1620 = (class519.field7714.field3211 - class483.field7191) * var6 + class483.field7191;
                class515.field7571 = (class519.field7714.field3219 - class388.field5837) * var6 + class388.field5837;
                class60.field1061 = (-class460.field6895 + class519.field7714.field3216) * var6 + class460.field6895;
                class234.field3408 = (-class421.field6295 + class519.field7714.field3215) * var6 + class421.field6295;
                class118.field1946 = (-16711936 & (class121.field1975 & 16711935) * var3 - -((16711935 & class519.field7714.field3222) * var4)) - -(16711680 & (class121.field1975 & 65280) * var3 + (65280 & class519.field7714.field3222) * var4) >>> 8;
                if (class480.field7153 != class519.field7714.field3208) {
                    class453.field6777 = class412.field6158.method295(class480.field7153, class519.field7714.field3208, var6, class453.field6777);
                }
            }
            class487.field7213 = var1;
        }
        if (arg0 != 65280) {
            method2834((byte) 82);
        }
        ++field7085;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)Z", line = 533)
    public final boolean method2843(int arg0, int arg1) {
        ++field7091;
        if (arg0 <= 33) {
            field7090 = -22;
        }
        return arg1 != 0 ? true : super.field603;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lli;I)V", line = 549)
    public final void method2844(class293 arg0, int arg1) {
        ++field7098;
        if (arg1 == 25133) {
            class346 var3 = null;
            try {
                class324 var4 = arg0.method1856(0, "");
                while (~var4.field4940 == -1) {
                    class71.method583(1L, 123);
                }
                if (~var4.field4940 == -2) {
                    var3 = (class346) var4.field4939;
                    class145 var5 = this.method2841(arg1 ^ 11990);
                    var3.method2202(var5.field2270, 127, 0, var5.field2289);
                }
            } catch (Exception var7) {
            }
            try {
                if (var3 != null) {
                    var3.method2199((byte) -122);
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V", line = 673)
    public final void method2845(boolean arg0, boolean arg1) {
        super.field603 = arg0;
        ++field7095;
        if (arg1) {
            this.method2841(-36);
        }
        if (class319.field4807 != null) {
            class319.field4807.method2872((byte) -59, !this.method2840(255, class169.field2624));
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lqa;Lbu;I)V", line = 688)
    public static final void method2846(class162 arg0, class17 arg1, int arg2) {
        ++field7082;
        class279[] var3 = class279.method1779(arg1, class398.field6005, 0);
        class419.field6268 = new class529[var3.length];
        for (int var4 = 0; var4 < var3.length; ++var4) {
            class419.field6268[var4] = arg0.method304(var3[var4], true);
        }
        class279[] var5 = class279.method1779(arg1, class284.field4057, 0);
        class228.field3248 = new class529[var5.length];
        for (int var6 = 0; var5.length > var6; ++var6) {
            class228.field3248[var6] = arg0.method304(var5[var6], true);
        }
        class279[] var7 = class279.method1779(arg1, class76.field1277, 0);
        class45.field843 = new class529[var7.length];
        for (int var8 = 0; var7.length > var8; ++var8) {
            class45.field843[var8] = arg0.method304(var7[var8], true);
        }
        class279[] var9 = class279.method1779(arg1, class77.field1300, 0);
        class85.field1469 = new class529[var9.length];
        for (int var10 = 0; ~var9.length < ~var10; ++var10) {
            class85.field1469[var10] = arg0.method304(var9[var10], true);
        }
        class279[] var11 = class279.method1779(arg1, class333.field5038, 0);
        class491.field7266 = new class529[var11.length];
        for (int var12 = 0; ~var11.length < ~var12; ++var12) {
            class491.field7266[var12] = arg0.method304(var11[var12], true);
        }
        class279[] var13 = class279.method1779(arg1, class463.field6932, 0);
        class261.field3789 = new class529[var13.length];
        for (int var14 = 0; var14 < var13.length; ++var14) {
            class261.field3789[var14] = arg0.method304(var13[var14], true);
        }
        class279[] var15 = class279.method1779(arg1, class349.field5210, 0);
        class376.field5707 = new class529[var15.length];
        for (int var16 = 0; ~var15.length < ~var16; ++var16) {
            class376.field5707[var16] = arg0.method304(var15[var16], true);
        }
        class279[] var17 = class279.method1779(arg1, class491.field7264, 0);
        class8.field144 = new class529[var17.length];
        for (int var18 = 0; var18 < var17.length; ++var18) {
            class8.field144[var18] = arg0.method304(var17[var18], true);
        }
        class279[] var19 = class279.method1779(arg1, class470.field7058, 0);
        class414.field6182 = new class529[var19.length];
        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
            class414.field6182[var20] = arg0.method304(var19[var20], true);
        }
        class279[] var21 = class279.method1779(arg1, class263.field3799, 0);
        class320.field4907 = new class529[var21.length];
        for (int var22 = 0; var22 < var21.length; ++var22) {
            class320.field4907[var22] = arg0.method304(var21[var22], true);
        }
        class279[] var23 = class279.method1779(arg1, class104.field1728, 0);
        class202.field2947 = new class529[var23.length];
        for (int var24 = 0; var23.length > var24; ++var24) {
            class202.field2947[var24] = arg0.method304(var23[var24], true);
        }
        class279[] var25 = class279.method1779(arg1, class100.field1647, 0);
        class35.field675 = new class529[var25.length];
        for (int var26 = 0; ~var25.length < ~var26; ++var26) {
            class35.field675[var26] = arg0.method304(var25[var26], true);
        }
        class77.field1301 = arg0.method304(class279.method1789(arg1, class19.field330, 0), true);
        class377.field5711 = arg0.method304(class279.method1789(arg1, class173.field2665, 0), true);
        class279[] var27 = class279.method1779(arg1, class271.field3919, 0);
        class399.field6021 = new class529[var27.length];
        for (int var28 = 0; var28 < var27.length; ++var28) {
            class399.field6021[var28] = arg0.method304(var27[var28], true);
        }
        if (arg2 < 73) {
            field7083 = -34;
        }
    }
}
