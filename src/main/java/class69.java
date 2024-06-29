import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class69 extends class397 {

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "[B")
    public static byte[] field1019;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Lhe;")
    public static class239 field1020;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "[Lqg;")
    public static class307[] field1018;

    static {
        new class194((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field1019 = new byte[2048];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([Ljava/lang/String;[SB)V", line = 4)
    public static final void method470(String[] arg0, short[] arg1, byte arg2) {
        ++field1017;
        if (arg2 < 0) {
            method471(true);
        }
        class489.method2939(0, arg1, 26641, arg0, arg0.length + -1);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I", line = 16)
    public final int[] method31(int arg0, int arg1) {
        ++field1021;
        int[] var3 = super.field5854.method465(arg1, 127);
        if (super.field5854.field991) {
            class268.method1644(var3, 0, class164.field2152, class447.field6523[arg1]);
        }
        if (arg0 != -780833076) {
            this.method31(79, -93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V", line = 44)
    public static void method471(boolean arg0) {
        field1020 = null;
        field1019 = null;
        field1018 = null;
        if (!arg0) {
            method470((String[]) null, (short[]) null, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLbn;)V", line = 57)
    public static final void method472(boolean arg0, class294 arg1) {
        arg1.field4270 = false;
        if (arg0) {
            ++field1022;
            if (~arg1.field4256 != 0) {
                class168 var2 = class286.field4083.method2602(-24462, arg1.field4256);
                if (var2 != null && var2.field2219 != null) {
                    label400: {
                        ++arg1.field4238;
                        if (~arg1.field4253 > ~var2.field2219.length && arg1.field4238 > var2.field2205[arg1.field4253]) {
                            ++arg1.field4232;
                            arg1.field4238 = 1;
                            ++arg1.field4253;
                            class204.method1258(-1, arg1.field4253, arg1.field2959, class415.field6145 == arg1, var2, arg1.field2966, arg1.field2956);
                        }
                        if (~var2.field2219.length >= ~arg1.field4253) {
                            arg1.field4253 = 0;
                            arg1.field4238 = 0;
                            if (arg1.field4209) {
                                arg1.field4256 = arg1.method1767(16643).method1084(119);
                                if (arg1.field4256 == -1) {
                                    arg1.field4209 = false;
                                    break label400;
                                }
                                var2 = class286.field4083.method2602(-24462, arg1.field4256);
                            }
                            class204.method1258(-1, arg1.field4253, arg1.field2959, class415.field6145 == arg1, var2, arg1.field2966, arg1.field2956);
                        }
                        arg1.field4232 = arg1.field4253 + 1;
                        if (arg1.field4232 >= var2.field2219.length) {
                            arg1.field4232 = 0;
                        }
                    }
                } else {
                    arg1.field4209 = false;
                    arg1.field4256 = -1;
                }
            }
            if (arg1.field4269 != -1 && arg1.field4191 <= class263.field3748) {
                class366 var3 = class53.field820.method2427(arg1.field4269, -17773);
                int var4 = var3.field5501;
                if (~var4 == 0) {
                    arg1.field4269 = -1;
                } else {
                    label402: {
                        class168 var5 = class286.field4083.method2602(-24462, var4);
                        if (var3.field5517) {
                            if (~var5.field2227 != -4) {
                                if (~var5.field2227 == -2 && ~arg1.field4274 < -1 && arg1.field4225 <= class263.field3748 && arg1.field4254 < class263.field3748) {
                                    arg1.field4191 = class263.field3748 + 1;
                                    break label402;
                                }
                            } else if (arg1.field4274 > 0 && class263.field3748 >= arg1.field4225 && arg1.field4254 < class263.field3748) {
                                arg1.field4269 = -1;
                                break label402;
                            }
                        }
                        if (var5 != null && var5.field2219 != null) {
                            if (arg1.field4183 < 0) {
                                arg1.field4183 = 0;
                                class204.method1258(-1, 0, arg1.field2959, class415.field6145 == arg1, var5, arg1.field2966, arg1.field2956);
                            }
                            ++arg1.field4187;
                            if (arg1.field4183 < var5.field2219.length && ~var5.field2205[arg1.field4183] > ~arg1.field4187) {
                                ++arg1.field4183;
                                arg1.field4187 = 1;
                                class204.method1258(-1, arg1.field4183, arg1.field2959, class415.field6145 == arg1, var5, arg1.field2966, arg1.field2956);
                            }
                            if (~arg1.field4183 <= ~var5.field2219.length) {
                                if (!var3.field5517) {
                                    arg1.field4269 = -1;
                                } else {
                                    ++arg1.field4268;
                                    arg1.field4183 -= var5.field2210;
                                    if (~var5.field2211 < ~arg1.field4268) {
                                        if (~arg1.field4183 <= -1 && ~arg1.field4183 > ~var5.field2219.length) {
                                            class204.method1258(-1, arg1.field4183, arg1.field2959, class415.field6145 == arg1, var5, arg1.field2966, arg1.field2956);
                                        } else {
                                            arg1.field4269 = -1;
                                        }
                                    } else {
                                        arg1.field4269 = -1;
                                    }
                                }
                            }
                            arg1.field4258 = arg1.field4183 + 1;
                            if (var5.field2219.length <= arg1.field4258) {
                                if (!var3.field5517) {
                                    arg1.field4258 = -1;
                                } else {
                                    arg1.field4258 -= var5.field2210;
                                    if (~var5.field2211 < ~(arg1.field4268 + 1)) {
                                        if (arg1.field4258 < 0 || var5.field2219.length <= arg1.field4258) {
                                            arg1.field4258 = -1;
                                        }
                                    } else {
                                        arg1.field4258 = -1;
                                    }
                                }
                            }
                        } else {
                            arg1.field4269 = -1;
                        }
                    }
                }
            }
            if (arg1.field4263 != -1 && ~class263.field3748 <= ~arg1.field4235) {
                class366 var6 = class53.field820.method2427(arg1.field4263, -17773);
                int var7 = var6.field5501;
                if (var7 == -1) {
                    arg1.field4263 = -1;
                } else {
                    label405: {
                        class168 var8 = class286.field4083.method2602(-24462, var7);
                        if (var6.field5517) {
                            if (~var8.field2227 == -4) {
                                if (~arg1.field4274 < -1 && ~class263.field3748 <= ~arg1.field4225 && class263.field3748 > arg1.field4254) {
                                    arg1.field4263 = -1;
                                    break label405;
                                }
                            } else if (var8.field2227 == 1 && ~arg1.field4274 < -1 && ~arg1.field4225 >= ~class263.field3748 && class263.field3748 > arg1.field4254) {
                                arg1.field4235 = class263.field3748 + 1;
                                break label405;
                            }
                        }
                        if (var8 != null && var8.field2219 != null) {
                            if (arg1.field4197 < 0) {
                                arg1.field4197 = 0;
                                class204.method1258(-1, 0, arg1.field2959, class415.field6145 == arg1, var8, arg1.field2966, arg1.field2956);
                            }
                            ++arg1.field4218;
                            if (arg1.field4197 < var8.field2219.length && var8.field2205[arg1.field4197] < arg1.field4218) {
                                ++arg1.field4197;
                                arg1.field4218 = 1;
                                class204.method1258(-1, arg1.field4197, arg1.field2959, class415.field6145 == arg1, var8, arg1.field2966, arg1.field2956);
                            }
                            if (~var8.field2219.length >= ~arg1.field4197) {
                                if (var6.field5517) {
                                    arg1.field4197 -= var8.field2210;
                                    ++arg1.field4229;
                                    if (var8.field2211 > arg1.field4229) {
                                        if (arg1.field4197 >= 0 && ~var8.field2219.length < ~arg1.field4197) {
                                            class204.method1258(-1, arg1.field4197, arg1.field2959, class415.field6145 == arg1, var8, arg1.field2966, arg1.field2956);
                                        } else {
                                            arg1.field4263 = -1;
                                        }
                                    } else {
                                        arg1.field4263 = -1;
                                    }
                                } else {
                                    arg1.field4263 = -1;
                                }
                            }
                            arg1.field4220 = arg1.field4197 + 1;
                            if (var8.field2219.length <= arg1.field4220) {
                                if (!var6.field5517) {
                                    arg1.field4220 = -1;
                                } else {
                                    arg1.field4220 -= var8.field2210;
                                    if (~(arg1.field4229 + 1) <= ~var8.field2211) {
                                        arg1.field4220 = -1;
                                    } else if (~arg1.field4220 > -1 || ~arg1.field4220 <= ~var8.field2219.length) {
                                        arg1.field4220 = -1;
                                    }
                                }
                            }
                        } else {
                            arg1.field4263 = -1;
                        }
                    }
                }
            }
            if (~arg1.field4215 != 0 && arg1.field4206 <= 1) {
                class168 var9 = class286.field4083.method2602(-24462, arg1.field4215);
                if (~var9.field2227 != -4) {
                    if (~var9.field2227 == -2 && arg1.field4274 > 0 && arg1.field4225 <= class263.field3748 && arg1.field4254 < class263.field3748) {
                        arg1.field4206 = 2;
                    }
                } else if (arg1.field4274 > 0 && class263.field3748 >= arg1.field4225 && class263.field3748 > arg1.field4254) {
                    arg1.field4215 = -1;
                }
            }
            if (arg1.field4215 != -1 && ~arg1.field4206 == -1) {
                class168 var10 = class286.field4083.method2602(-24462, arg1.field4215);
                if (var10 != null && var10.field2219 != null) {
                    ++arg1.field4261;
                    if (var10.field2219.length > arg1.field4216 && ~var10.field2205[arg1.field4216] > ~arg1.field4261) {
                        arg1.field4261 = 1;
                        ++arg1.field4216;
                        class204.method1258(-1, arg1.field4216, arg1.field2959, class415.field6145 == arg1, var10, arg1.field2966, arg1.field2956);
                    }
                    if (var10.field2219.length <= arg1.field4216) {
                        arg1.field4216 -= var10.field2210;
                        ++arg1.field4198;
                        if (arg1.field4198 >= var10.field2211) {
                            arg1.field4215 = -1;
                        } else if (~arg1.field4216 <= -1 && var10.field2219.length > arg1.field4216) {
                            class204.method1258(-1, arg1.field4216, arg1.field2959, class415.field6145 == arg1, var10, arg1.field2966, arg1.field2956);
                        } else {
                            arg1.field4215 = -1;
                        }
                    }
                    arg1.field4221 = arg1.field4216 + 1;
                    if (arg1.field4221 >= var10.field2219.length) {
                        arg1.field4221 -= var10.field2210;
                        if (~var10.field2211 < ~(arg1.field4198 + 1)) {
                            if (arg1.field4221 < 0 || var10.field2219.length <= arg1.field4221) {
                                arg1.field4221 = -1;
                            }
                        } else {
                            arg1.field4221 = -1;
                        }
                    }
                    arg1.field4270 = var10.field2209;
                } else {
                    arg1.field4215 = -1;
                }
            }
            if (~arg1.field4206 < -1) {
                --arg1.field4206;
            }
            for (int var11 = 0; arg1.field4223.length > var11; ++var11) {
                class55 var12 = arg1.field4223[var11];
                if (var12 != null) {
                    if (var12.field851 > 0) {
                        --var12.field851;
                    } else {
                        class168 var13 = class286.field4083.method2602(-24462, var12.field848);
                        if (var13 != null && var13.field2219 != null) {
                            ++var12.field856;
                            if (var13.field2219.length > var12.field850 && ~var13.field2205[var12.field850] > ~var12.field856) {
                                var12.field856 = 1;
                                ++var12.field850;
                                class204.method1258(-1, var12.field850, arg1.field2959, class415.field6145 == arg1, var13, arg1.field2966, arg1.field2956);
                            }
                            if (var13.field2219.length <= var12.field850) {
                                var12.field850 -= var13.field2210;
                                ++var12.field852;
                                if (~var12.field852 <= ~var13.field2211) {
                                    arg1.field4223[var11] = null;
                                } else if (var12.field850 >= 0 && var13.field2219.length > var12.field850) {
                                    class204.method1258(-1, var12.field850, arg1.field2959, class415.field6145 == arg1, var13, arg1.field2966, arg1.field2956);
                                } else {
                                    arg1.field4223[var11] = null;
                                }
                            }
                            var12.field846 = var12.field850 + 1;
                            if (var13.field2219.length <= var12.field846) {
                                var12.field846 -= var13.field2210;
                                if (var12.field852 + 1 >= var13.field2211) {
                                    var12.field846 = -1;
                                } else if (var12.field846 < 0 || var12.field846 >= var13.field2219.length) {
                                    var12.field846 = -1;
                                }
                            }
                        } else {
                            arg1.field4223[var11] = null;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 478)
    public class69() {
        super(0, true);
    }
}
