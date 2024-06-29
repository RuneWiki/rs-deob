import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class75 extends class311 {

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "Z")
    public boolean field1091 = false;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "Z")
    public boolean field1092 = false;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "[I")
    public static int[] field1088 = new int[99];

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "Lkk;")
    public static class125 field1097;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "Ltf;")
    public static class192 field1089;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Llh;Z)V")
    private final void method555(class365 arg0, boolean arg1) {
        if (arg1) {
            this.method560((byte) -99, -119);
        }
        ++field1095;
        if (~(arg0.field5073.length + -arg0.field5069) <= -2) {
            int var3 = arg0.method2099(255);
            if (~var3 <= -1 && ~var3 >= -18) {
                byte var4;
                if (var3 == 17) {
                    var4 = 40;
                } else if (~var3 != -17) {
                    if (~var3 == -16) {
                        var4 = 37;
                    } else if (var3 == 14) {
                        var4 = 36;
                    } else if (~var3 == -14) {
                        var4 = 35;
                    } else if (~var3 == -13) {
                        var4 = 34;
                    } else if (~var3 != -12) {
                        if (var3 != 10) {
                            if (var3 == 9) {
                                var4 = 31;
                            } else if (~var3 == -9) {
                                var4 = 30;
                            } else if (var3 == 7) {
                                var4 = 29;
                            } else if (var3 != 6) {
                                if (var3 == 5) {
                                    var4 = 28;
                                } else if (~var3 == -5) {
                                    var4 = 24;
                                } else if (var3 != 3) {
                                    if (var3 != 2) {
                                        if (~var3 == -2) {
                                            var4 = 23;
                                        } else {
                                            var4 = 19;
                                        }
                                    } else {
                                        var4 = 22;
                                    }
                                } else {
                                    var4 = 23;
                                }
                            } else {
                                var4 = 28;
                            }
                        } else {
                            var4 = 32;
                        }
                    } else {
                        var4 = 33;
                    }
                } else {
                    var4 = 38;
                }
                if (var4 <= arg0.field5073.length - arg0.field5069) {
                    super.field4255 = arg0.method2099(255);
                    if (super.field4255 < 1) {
                        super.field4255 = 1;
                    } else if (super.field4255 > 4) {
                        super.field4255 = 4;
                    }
                    this.method561(arg0.method2099(255) == 1, (byte) -70);
                    super.field4274 = arg0.method2099(255) == 1;
                    super.field4279 = arg0.method2099(255) == 1;
                    super.field4281 = ~arg0.method2099(255) == -2;
                    super.field4268 = ~arg0.method2099(255) == -2 ? 1 : 0;
                    super.field4260 = arg0.method2099(255) == 1;
                    super.field4283 = arg0.method2099(255) == 1;
                    super.field4284 = arg0.method2099(255) == 1;
                    super.field4265 = arg0.method2099(255);
                    if (~super.field4265 < -3) {
                        super.field4265 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field4277 = arg0.method2099(255);
                    }
                    if (~var3 > -3) {
                        super.field4276 = arg0.method2099(255) == 1;
                        arg0.method2099(255);
                    } else {
                        super.field4276 = arg0.method2099(255) == 1;
                        if (~var3 <= -18) {
                            super.field4285 = ~arg0.method2099(255) == -2;
                        }
                    }
                    super.field4287 = arg0.method2099(255) == 1;
                    super.field4250 = ~arg0.method2099(255) == -2;
                    super.field4254 = arg0.method2099(255);
                    if (~super.field4254 < -3) {
                        super.field4254 = 2;
                    }
                    super.field4280 = super.field4254;
                    super.field4266 = ~arg0.method2099(255) == -2;
                    super.field4262 = arg0.method2099(255);
                    if (super.field4262 > 127) {
                        super.field4262 = 127;
                    }
                    super.field4252 = arg0.method2099(255);
                    super.field4273 = arg0.method2099(255);
                    if (~super.field4273 < -128) {
                        super.field4273 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field4269 = arg0.method2062((byte) 14);
                        super.field4253 = arg0.method2062((byte) 14);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method2099(255);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method2099(255);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class463.field6730 < 96) {
                            var5 = 0;
                        }
                        class295.method1699(var5, -10135);
                    }
                    if (~var3 <= -6) {
                        super.field4249 = arg0.method2056((byte) 99);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field4263 = var6 = arg0.method2099(255);
                    }
                    if (~super.field4263 != -2 && super.field4263 != 2) {
                        super.field4263 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field4271 = arg0.method2099(255) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field4261 = ~arg0.method2099(255) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field4275 = arg0.method2099(255);
                    }
                    if (super.field4275 < 0 || super.field4275 > class129.method846(class463.field6730, (byte) -118)) {
                        super.field4275 = 0;
                    }
                    if (var3 >= 10) {
                        super.field4278 = ~arg0.method2099(255) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field4264 = ~arg0.method2099(255) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field4268 = arg0.method2099(255);
                    }
                    if (~super.field4268 > -1 || super.field4268 > 2) {
                        super.field4268 = 1;
                    }
                    if (var3 >= 13) {
                        super.field4251 = ~arg0.method2099(255) == -2;
                    }
                    if (~var3 <= -15) {
                        super.field4272 = arg0.method2099(255);
                    } else if (~var6 != -1) {
                        super.field4272 = 1;
                    } else {
                        super.field4272 = 2;
                    }
                    if (~super.field4272 > -1 || super.field4272 > 3) {
                        super.field4272 = 2;
                    }
                    if (var3 >= 15) {
                        super.field4256 = arg0.method2099(255);
                        if (super.field4256 < 0 || super.field4256 > 4) {
                            super.field4256 = ~class38.field520 != -2 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field4286 = ~arg0.method2099(255) == -2;
                    }
                    if (~var3 > -18 && ~super.field4272 == -1) {
                        super.field4272 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Z")
    public final boolean method556(int arg0, boolean arg1) {
        if (!arg1) {
            return true;
        } else {
            ++field1086;
            return arg0 == 0 ? super.field4258 : true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkj;B)V")
    public final void method557(class397 arg0, byte arg1) {
        ++field1096;
        class219 var3 = null;
        try {
            class409 var4 = arg0.method2292((byte) 104, "");
            while (var4.field5652 == 0) {
                class496.method2931((byte) 127, 1L);
            }
            if (~var4.field5652 == -2) {
                var3 = (class219) var4.field5654;
                class365 var5 = this.method559((byte) 86);
                var3.method1295(0, var5.field5069, (byte) 26, var5.field5073);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1297((byte) 93);
            }
        } catch (Exception var6) {
        }
        if (arg1 != -80) {
            this.method559((byte) -78);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method558(byte arg0) {
        int var1 = -49 / ((63 - arg0) / 44);
        field1088 = null;
        field1097 = null;
        field1089 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Llh;")
    public final class365 method559(byte arg0) {
        ++field1090;
        class365 var2 = new class365(41);
        var2.method2084(17, false);
        var2.method2084(super.field4255, false);
        var2.method2084(super.field4258 ? 1 : 0, false);
        var2.method2084(super.field4274 ? 1 : 0, false);
        var2.method2084(!super.field4279 ? 0 : 1, false);
        var2.method2084(!super.field4281 ? 0 : 1, false);
        int var3 = 113 / (-arg0 / 46);
        var2.method2084(0, false);
        var2.method2084(!super.field4260 ? 0 : 1, false);
        var2.method2084(!super.field4283 ? 0 : 1, false);
        var2.method2084(!super.field4284 ? 0 : 1, false);
        var2.method2084(super.field4265, false);
        var2.method2084(super.field4277, false);
        var2.method2084(!super.field4276 ? 0 : 1, false);
        var2.method2084(super.field4285 ? 1 : 0, false);
        var2.method2084(!super.field4287 ? 0 : 1, false);
        var2.method2084(super.field4250 ? 1 : 0, false);
        var2.method2084(super.field4254, false);
        var2.method2084(super.field4266 ? 1 : 0, false);
        var2.method2084(super.field4262, false);
        var2.method2084(super.field4252, false);
        var2.method2084(super.field4273, false);
        var2.method2070(81954016, super.field4269);
        var2.method2070(81954016, super.field4253);
        var2.method2084(class20.method146(true), false);
        var2.method2074(false, super.field4249);
        var2.method2084(super.field4263, false);
        var2.method2084(super.field4271 ? 1 : 0, false);
        var2.method2084(super.field4261 ? 1 : 0, false);
        var2.method2084(super.field4275, false);
        var2.method2084(super.field4278 ? 1 : 0, false);
        var2.method2084(super.field4264 ? 1 : 0, false);
        var2.method2084(super.field4268, false);
        var2.method2084(super.field4251 ? 1 : 0, false);
        var2.method2084(super.field4272, false);
        var2.method2084(super.field4256, false);
        var2.method2084(!super.field4286 ? 0 : 1, false);
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Z")
    public final boolean method560(byte arg0, int arg1) {
        ++field1093;
        if (arg0 != 115) {
            return false;
        } else {
            return arg1 == 0 && !this.field1092 ? super.field4258 : true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZB)V")
    public final void method561(boolean arg0, byte arg1) {
        super.field4258 = arg0;
        if (arg1 != -70) {
            field1088 = null;
        }
        ++field1094;
        if (class82.field1154 != null) {
            class82.field1154.method2125(arg1 + 134, !this.method560((byte) 115, class278.field3761));
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lkj;)V")
    public class75(class397 arg0) {
        super.field4255 = 3;
        this.method561(true, (byte) -70);
        super.field4280 = 0;
        super.field4284 = true;
        super.field4279 = true;
        super.field4283 = true;
        super.field4265 = 2;
        super.field4262 = 127;
        super.field4253 = 0;
        super.field4269 = 0;
        super.field4268 = 1;
        super.field4274 = true;
        super.field4254 = 0;
        super.field4250 = true;
        super.field4260 = true;
        super.field4273 = 127;
        super.field4277 = 0;
        super.field4287 = true;
        super.field4276 = true;
        super.field4285 = false;
        super.field4281 = true;
        super.field4252 = 255;
        super.field4266 = true;
        if (~class463.field6730 <= -97) {
            class295.method1699(2, -10135);
        } else {
            class295.method1699(0, -10135);
        }
        super.field4272 = 2;
        super.field4251 = true;
        super.field4275 = 0;
        super.field4264 = true;
        super.field4278 = false;
        super.field4271 = false;
        super.field4256 = ~class38.field520 != -2 ? 4 : 2;
        super.field4261 = false;
        super.field4249 = 0;
        super.field4263 = 2;
        class219 var2 = null;
        try {
            class409 var3 = arg0.method2292((byte) 45, "");
            while (~var3.field5652 == -1) {
                class496.method2931((byte) 126, 1L);
            }
            if (var3.field5652 == 1) {
                var2 = (class219) var3.field5654;
                byte[] var4 = new byte[(int) var2.method1296(1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1298(false, var4, var4.length + -var5, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method555(new class365(var4), false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1297((byte) -82);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method562(int arg0, int arg1) {
        ++field1087;
        int var3 = 105 % ((72 - arg0) / 54);
        if (this.field1091) {
            return 0;
        } else if (!this.method560((byte) 115, arg1)) {
            return 1;
        } else {
            return !super.field4274 ? 1 : 2;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field1088[var1] = var0 / 4;
        }
    }
}
