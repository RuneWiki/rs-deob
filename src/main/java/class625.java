import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class625 extends class181 {

    @OriginalMember(owner = "client!ql", name = "fb", descriptor = "Z")
    public boolean field8992 = false;

    @OriginalMember(owner = "client!ql", name = "kb", descriptor = "Z")
    public boolean field8997 = false;

    @OriginalMember(owner = "client!ql", name = "xb", descriptor = "Z")
    public boolean field9010 = false;

    @OriginalMember(owner = "client!ql", name = "pb", descriptor = "Z")
    public boolean field9002 = false;

    @OriginalMember(owner = "client!ql", name = "qb", descriptor = "Z")
    public boolean field9003 = false;

    @OriginalMember(owner = "client!ql", name = "nb", descriptor = "Lrg;")
    public static class548 field9000 = new class548(59, 4);

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!ql", name = "gb", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!ql", name = "hb", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!ql", name = "ib", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!ql", name = "jb", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!ql", name = "lb", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!ql", name = "mb", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!ql", name = "ob", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!ql", name = "rb", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!ql", name = "sb", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!ql", name = "tb", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!ql", name = "ub", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!ql", name = "vb", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!ql", name = "wb", descriptor = "I")
    public int field9009;

    @OriginalMember(owner = "client!ql", name = "yb", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!ql", name = "zb", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!ql", name = "Ab", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!ql", name = "Bb", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!ql", name = "Cb", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "Lvs;")
    public static class506 field8991;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I")
    public final int method3573(int arg0) {
        ++field8994;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (arg0 > -4) {
            this.field9003 = false;
        }
        if (~class165.field2028 != -4 && ~class165.field2028 != -3) {
            if (!class165.field2026.startsWith("win")) {
                var3 = true;
            } else {
                var4 = true;
                var3 = true;
                if (!class165.field2010.startsWith("amd64") && !class165.field2010.startsWith("x86_64")) {
                    var2 = true;
                }
            }
        }
        if (this.field9003) {
            var2 = false;
        }
        if (this.field9002) {
            var3 = false;
        }
        if (this.field8992) {
            var4 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method3586((byte) -105);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class552.method3233(2, 1000, 90);
                } catch (Exception var14) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class552.method3233(3, 1000, 109);
                    if (~class529.field7429 == -4) {
                        class448 var8 = class210.field2560.method1172();
                        long var9 = 281474976710655L & var8.field6211;
                        int var11 = var8.field6214;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var13) {
                }
            }
            if (var3) {
                try {
                    var6 = class552.method3233(1, 1000, 18);
                } catch (Exception var12) {
                }
            }
            if (~var5 == 0 && var6 == -1 && var7 == -1) {
                return this.method3586((byte) -66);
            } else if (var7 < var5 && ~var6 > ~var5) {
                return this.method3575(22, var5);
            } else {
                return ~var7 >= ~var6 ? this.method3582((byte) -59, var6, 1) : this.method3582((byte) -59, var7, 3);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public final void method3574(int arg0) {
        ++field8996;
        this.method3589(false, 118);
        super.field2183 = false;
        super.field2198 = false;
        super.field2193 = false;
        super.field2178 = false;
        super.field2173 = 0;
        super.field2166 = super.field2170 = 0;
        super.field2197 = false;
        super.field2181 = false;
        super.field2186 = false;
        super.field2182 = false;
        super.field2205 = super.field2191 = arg0;
        super.field2187 = false;
        super.field2185 = false;
        super.field2189 = false;
        class459.method2677(0, 2);
        super.field2194 = false;
        super.field2175 = 0;
        super.field2169 = false;
        this.method3581((byte) -118);
        super.field2204 = 1;
        class529.method3013(4);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)I")
    private final int method3575(int arg0, int arg1) {
        ++field9014;
        if (arg0 != 22) {
            this.field8997 = true;
        }
        byte var3;
        if (arg1 <= 12000) {
            if (arg1 <= 5000) {
                if (~arg1 < -2001) {
                    var3 = 2;
                    this.method3583(2523);
                } else {
                    this.method3574(0);
                    var3 = 1;
                }
            } else {
                this.method3577((byte) 61);
                var3 = 3;
            }
        } else {
            var3 = 4;
            this.method3591((byte) 116);
        }
        if (class529.field7429 != 2) {
            super.field2188 = 2;
            class24.method144(-2, 2);
        }
        this.method3585(true, class74.field873);
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V")
    public static final void method3576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9007;
        int var5 = 0;
        int var6 = 24 / ((arg1 - -41) / 51);
        int var7 = arg0;
        int var8 = -arg0;
        class62.method363(arg0 + arg3, -128, arg4, class328.field4287[arg2], -arg0 + arg3);
        int var9 = -1;
        while (var7 > var5) {
            var9 += 2;
            var8 += var9;
            ++var5;
            if (~var8 <= -1) {
                --var7;
                var8 -= var7 << 1;
                int[] var10 = class328.field4287[arg2 + var7];
                int[] var11 = class328.field4287[-var7 + arg2];
                int var12 = arg3 - -var5;
                int var13 = -var5 + arg3;
                class62.method363(var12, -128, arg4, var10, var13);
                class62.method363(var12, -127, arg4, var11, var13);
            }
            int var14 = arg3 + var7;
            int var15 = -var7 + arg3;
            int[] var16 = class328.field4287[arg2 + var5];
            int[] var17 = class328.field4287[-var5 + arg2];
            class62.method363(var14, -127, arg4, var16, var15);
            class62.method363(var14, -128, arg4, var17, var15);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public final void method3577(byte arg0) {
        ++field9013;
        this.method3589(true, 39);
        super.field2181 = true;
        super.field2205 = super.field2191 = 1;
        super.field2178 = true;
        super.field2189 = false;
        super.field2173 = 1;
        super.field2198 = true;
        if (arg0 != 61) {
            this.field8992 = false;
        }
        super.field2166 = super.field2170 = 0;
        super.field2197 = true;
        super.field2193 = true;
        super.field2187 = true;
        super.field2185 = true;
        super.field2186 = true;
        super.field2182 = false;
        super.field2183 = true;
        if (class252.field3258 <= 95) {
            class459.method2677(0, arg0 ^ 63);
        } else {
            class459.method2677(1, arg0 + -59);
        }
        super.field2169 = false;
        super.field2175 = 0;
        super.field2194 = true;
        this.method3581((byte) -118);
        super.field2204 = 3;
        class529.method3013(4);
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(II)Lal;")
    public static final class82 method3578(int arg0, int arg1) {
        ++field8990;
        if (arg1 > -23) {
            field8991 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (~arg0 != -9) {
                                            if (~arg0 != -10) {
                                                if (arg0 != 10) {
                                                    if (~arg0 != -12) {
                                                        if (arg0 != 12) {
                                                            if (~arg0 != -14) {
                                                                if (~arg0 != -15) {
                                                                    if (arg0 != 15) {
                                                                        if (~arg0 != -17) {
                                                                            if (~arg0 != -18) {
                                                                                if (~arg0 != -19) {
                                                                                    if (arg0 != 19) {
                                                                                        if (~arg0 != -21) {
                                                                                            if (arg0 != 21) {
                                                                                                if (~arg0 != -23) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (arg0 != 24) {
                                                                                                            if (~arg0 != -26) {
                                                                                                                if (arg0 != 26) {
                                                                                                                    if (arg0 != 27) {
                                                                                                                        if (arg0 != 28) {
                                                                                                                            if (~arg0 != -30) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (arg0 != 31) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (arg0 != 33) {
                                                                                                                                                if (arg0 != 34) {
                                                                                                                                                    if (arg0 != 35) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (~arg0 != -38) {
                                                                                                                                                                if (arg0 != 38) {
                                                                                                                                                                    return arg0 == 39 ? new class462() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class195();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class76();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class105();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class219();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class513();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class427();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class368();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class378();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class106();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class466();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class281();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class228();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class145();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class602();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class586();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class435();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class341();
                                                                                                }
                                                                                            } else {
                                                                                                return new class333();
                                                                                            }
                                                                                        } else {
                                                                                            return new class240();
                                                                                        }
                                                                                    } else {
                                                                                        return new class539();
                                                                                    }
                                                                                } else {
                                                                                    return new class496();
                                                                                }
                                                                            } else {
                                                                                return new class144();
                                                                            }
                                                                        } else {
                                                                            return new class315();
                                                                        }
                                                                    } else {
                                                                        return new class83();
                                                                    }
                                                                } else {
                                                                    return new class286();
                                                                }
                                                            } else {
                                                                return new class472();
                                                            }
                                                        } else {
                                                            return new class530();
                                                        }
                                                    } else {
                                                        return new class289();
                                                    }
                                                } else {
                                                    return new class110();
                                                }
                                            } else {
                                                return new class457();
                                            }
                                        } else {
                                            return new class611();
                                        }
                                    } else {
                                        return new class589();
                                    }
                                } else {
                                    return new class244();
                                }
                            } else {
                                return new class425();
                            }
                        } else {
                            return new class205();
                        }
                    } else {
                        return new class619();
                    }
                } else {
                    return new class456();
                }
            } else {
                return new class461();
            }
        } else {
            return new class35();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILos;)V")
    private final void method3579(int arg0, class374 arg1) {
        ++field8995;
        if (arg1.field4929.length + -arg1.field4966 >= 1) {
            int var3 = arg1.method2129(-73);
            if (~var3 <= -1 && var3 <= 18) {
                byte var4;
                if (~var3 != -19) {
                    if (var3 != 17) {
                        if (~var3 != -17) {
                            if (~var3 != -16) {
                                if (var3 != 14) {
                                    if (~var3 == -14) {
                                        var4 = 35;
                                    } else if (~var3 == -13) {
                                        var4 = 34;
                                    } else if (~var3 != -12) {
                                        if (~var3 != -11) {
                                            if (var3 != 9) {
                                                if (var3 == 8) {
                                                    var4 = 30;
                                                } else if (var3 == 7) {
                                                    var4 = 29;
                                                } else if (var3 == 6) {
                                                    var4 = 28;
                                                } else if (~var3 == -6) {
                                                    var4 = 28;
                                                } else if (~var3 != -5) {
                                                    if (~var3 != -4) {
                                                        if (~var3 != -3) {
                                                            if (var3 != 1) {
                                                                var4 = 19;
                                                            } else {
                                                                var4 = 23;
                                                            }
                                                        } else {
                                                            var4 = 22;
                                                        }
                                                    } else {
                                                        var4 = 23;
                                                    }
                                                } else {
                                                    var4 = 24;
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
                                    var4 = 36;
                                }
                            } else {
                                var4 = 37;
                            }
                        } else {
                            var4 = 38;
                        }
                    } else {
                        var4 = 40;
                    }
                } else {
                    var4 = 41;
                }
                if (~var4 >= ~(arg1.field4929.length - arg1.field4966)) {
                    super.field2201 = arg1.method2129(-114);
                    if (~super.field2201 > -2) {
                        super.field2201 = 1;
                    } else if (super.field2201 > 4) {
                        super.field2201 = 4;
                    }
                    this.method3589(arg1.method2129(-94) == 1, 54);
                    super.field2198 = ~arg1.method2129(-122) == -2;
                    super.field2187 = ~arg1.method2129(-91) == -2;
                    super.field2193 = arg1.method2129(-126) == 1;
                    super.field2173 = arg1.method2129(arg0 ^ -18689) != 1 ? 0 : 1;
                    super.field2197 = ~arg1.method2129(-102) == -2;
                    super.field2181 = ~arg1.method2129(-122) == -2;
                    super.field2186 = arg1.method2129(arg0 ^ -18712) == 1;
                    super.field2205 = arg1.method2129(arg0 ^ -18702);
                    if (super.field2205 > 2) {
                        super.field2205 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field2191 = arg1.method2129(-124);
                    }
                    if (~var3 > -3) {
                        super.field2185 = arg1.method2129(-71) == 1;
                        arg1.method2129(-105);
                    } else {
                        super.field2185 = ~arg1.method2129(-86) == -2;
                        if (var3 >= 17) {
                            super.field2182 = ~arg1.method2129(arg0 ^ -18696) == -2;
                        }
                    }
                    super.field2189 = arg1.method2129(-83) == 1;
                    super.field2178 = arg1.method2129(-80) == 1;
                    super.field2166 = arg1.method2129(-72);
                    if (super.field2166 > 2) {
                        super.field2166 = 2;
                    }
                    super.field2170 = super.field2166;
                    super.field2171 = ~arg1.method2129(-77) == -2;
                    super.field2167 = arg1.method2129(-102);
                    if (~super.field2167 < -128) {
                        super.field2167 = 127;
                    }
                    super.field2192 = arg1.method2129(-124);
                    super.field2177 = arg1.method2129(-69);
                    if (~super.field2177 < -128) {
                        super.field2177 = 127;
                    }
                    if (var3 >= 1) {
                        super.field2174 = arg1.method2136(false);
                        super.field2179 = arg1.method2136(false);
                    }
                    if (~var3 <= -4 && var3 < 6) {
                        arg1.method2129(-113);
                    }
                    if (var3 >= 4) {
                        int var5 = arg1.method2129(-105);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class252.field3258 > -97) {
                            var5 = 0;
                        }
                        class459.method2677(var5, 2);
                    }
                    if (var3 >= 5) {
                        super.field2172 = arg1.method2123(false);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field2168 = var6 = arg1.method2129(-80);
                    }
                    if (~super.field2168 != -2 && ~super.field2168 != -3) {
                        super.field2168 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field2176 = arg1.method2129(-109) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field2184 = ~arg1.method2129(-119) == -2;
                    }
                    if (var3 >= 9) {
                        super.field2175 = arg1.method2129(arg0 + -18897);
                    }
                    if (super.field2175 < 0 || ~super.field2175 < ~class224.method1288(class252.field3258, 59)) {
                        super.field2175 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field2169 = arg1.method2129(-114) != 0;
                    }
                    if (arg0 == 18770) {
                        if (var3 >= 11) {
                            super.field2196 = ~arg1.method2129(-104) != -1;
                        }
                        if (var3 >= 12) {
                            super.field2173 = arg1.method2129(-126);
                        }
                        if (super.field2173 < 0 || ~super.field2173 < -3) {
                            super.field2173 = 1;
                        }
                        if (~var3 <= -14) {
                            super.field2194 = ~arg1.method2129(-111) == -2;
                        }
                        if (var3 >= 14) {
                            super.field2188 = arg1.method2129(arg0 + -18855);
                        } else if (var6 == 0) {
                            super.field2188 = 2;
                        } else {
                            super.field2188 = 1;
                        }
                        if (~super.field2188 > -1 || super.field2188 > 5) {
                            super.field2188 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field2207 = arg1.method2129(-109);
                            if (~super.field2207 > -1 || ~super.field2207 < -5) {
                                super.field2207 = ~class618.field8938 != -2 ? 4 : 2;
                            }
                        }
                        if (var3 >= 16) {
                            super.field2183 = ~arg1.method2129(-65) == -2;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field2183 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && super.field2188 == 0) {
                            super.field2188 = 2;
                        }
                        if (~var3 <= -19) {
                            super.field2204 = arg1.method2129(-79);
                            if (super.field2204 < 0 || super.field2204 > 4) {
                                super.field2204 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(II)Z")
    public final boolean method3580(int arg0, int arg1) {
        ++field9006;
        int var3 = -95 / ((arg1 - 71) / 51);
        return ~arg0 != -1 ? true : super.field2180;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
    private final void method3581(byte arg0) {
        ++field9011;
        if (~class618.field8938 >= -2) {
            super.field2207 = 2;
        } else {
            super.field2207 = 4;
        }
        if (arg0 != -118) {
            method3588(-41);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)I")
    private final int method3582(byte arg0, int arg1, int arg2) {
        ++field8999;
        byte var4;
        if (~arg1 < -20001) {
            this.method3591((byte) 116);
            var4 = 4;
        } else if (~arg1 < -10001) {
            this.method3577((byte) 61);
            var4 = 3;
        } else if (~arg1 < -5001) {
            this.method3583(arg0 + 2582);
            var4 = 2;
        } else {
            this.method3574(0);
            var4 = 1;
        }
        if (arg0 != -59) {
            this.field9010 = false;
        }
        if (class529.field7429 != arg2) {
            super.field2188 = arg2;
            class24.method144(arg0 + 57, arg2);
        }
        this.method3585(true, class74.field873);
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
    public final void method3583(int arg0) {
        ++field9008;
        this.method3589(true, 125);
        super.field2182 = false;
        if (arg0 != 2523) {
            method3588(-76);
        }
        super.field2185 = false;
        super.field2181 = false;
        super.field2205 = super.field2191 = 0;
        super.field2178 = false;
        super.field2193 = false;
        super.field2186 = false;
        super.field2166 = super.field2170 = 0;
        super.field2197 = false;
        super.field2198 = false;
        super.field2187 = false;
        super.field2183 = false;
        super.field2189 = false;
        super.field2173 = 0;
        class459.method2677(0, 2);
        super.field2194 = true;
        super.field2175 = 0;
        super.field2169 = false;
        this.method3581((byte) -118);
        super.field2204 = 2;
        class529.method3013(arg0 + -2519);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lav;ZII)V")
    public static final void method3584(class545 arg0, boolean arg1, int arg2, int arg3) {
        if (arg0.field6465 == arg3 && ~arg3 != 0) {
            class502 var4 = class393.field5190.method770(arg3, -87);
            int var5 = var4.field6940;
            if (var5 == 1) {
                arg0.field6390 = 0;
                arg0.field6477 = 0;
                arg0.field6409 = 1;
                arg0.field6422 = 0;
                arg0.field6449 = arg2;
                class614.method3532(arg0.field8660, var4, true, arg0.field8652, arg0.field6390, class103.field1265 == arg0, arg0.field8661);
            }
            if (~var5 == -3) {
                arg0.field6422 = 0;
            }
        } else if (arg3 == -1 || arg0.field6465 == -1 || ~class393.field5190.method770(arg3, -106).field6948 <= ~class393.field5190.method770(arg0.field6465, -54).field6948) {
            arg0.field6489 = arg0.field6486;
            arg0.field6477 = 0;
            arg0.field6465 = arg3;
            arg0.field6409 = 1;
            arg0.field6449 = arg2;
            arg0.field6422 = 0;
            arg0.field6390 = 0;
            if (arg0.field6465 != -1) {
                class614.method3532(arg0.field8660, class393.field5190.method770(arg0.field6465, -103), true, arg0.field8652, arg0.field6390, class103.field1265 == arg0, arg0.field8661);
            }
        }
        ++field9012;
        if (!arg1) {
            method3578(-37, -2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLpq;)V")
    public final void method3585(boolean arg0, class165 arg1) {
        ++field9015;
        class627 var3 = null;
        try {
            class506 var4 = arg1.method912("", -4588, arg0);
            while (~var4.field7031 == -1) {
                class462.method2688(1L, (byte) 110);
            }
            if (~var4.field7031 == -2) {
                var3 = (class627) var4.field7030;
                class374 var5 = new class374(class593.method3442(false));
                this.method991(var5, true);
                var3.method3593(0, var5.field4929, var5.field4966, (byte) 120);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3596((byte) -95);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)I")
    private final int method3586(byte arg0) {
        if (arg0 > -43) {
            method3588(102);
        }
        ++field8993;
        byte var3;
        if (class252.field3258 >= 96) {
            int var2 = class161.method884(1);
            if (var2 <= 100) {
                this.method3591((byte) 116);
                var3 = 4;
            } else if (var2 > 500) {
                if (~var2 >= -1001) {
                    this.method3583(2523);
                    var3 = 2;
                } else {
                    this.method3574(0);
                    var3 = 1;
                }
            } else {
                var3 = 3;
                this.method3577((byte) 61);
            }
        } else {
            var3 = 1;
            this.method3574(0);
        }
        if (class529.field7429 != 0) {
            super.field2188 = 0;
            class24.method144(-2, 0);
        }
        this.method3585(true, class74.field873);
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
    public final int method3587(byte arg0, int arg1) {
        ++field9004;
        if (this.field8997) {
            return 0;
        } else if (arg0 != 22) {
            return -22;
        } else if (!this.method3590(arg1, -2)) {
            return 1;
        } else {
            return !super.field2198 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V")
    public static void method3588(int arg0) {
        field9000 = null;
        field8991 = null;
        if (arg0 >= -77) {
            field9000 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
    public final void method3589(boolean arg0, int arg1) {
        ++field9001;
        if (arg1 >= 37) {
            super.field2180 = arg0;
            if (class16.field126 != null) {
                class16.field126.method1755(!this.method3590(class529.field7429, -2), (byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(II)Z")
    public final boolean method3590(int arg0, int arg1) {
        ++field8998;
        if (arg1 != -2) {
            this.field8992 = false;
        }
        return ~arg0 == -1 && !this.field9010 ? super.field2180 : true;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lpq;)V")
    public class625(class165 arg0) {
        super.field2201 = 3;
        super.field2204 = 3;
        this.method3589(true, 96);
        super.field2166 = 0;
        super.field2179 = 0;
        super.field2205 = 2;
        super.field2167 = 127;
        super.field2174 = 0;
        super.field2193 = true;
        super.field2170 = 0;
        super.field2186 = true;
        super.field2177 = 127;
        super.field2192 = 127;
        super.field2171 = true;
        super.field2187 = true;
        super.field2198 = true;
        super.field2173 = 1;
        super.field2178 = true;
        super.field2197 = true;
        super.field2182 = false;
        super.field2189 = true;
        super.field2185 = true;
        super.field2181 = true;
        super.field2191 = 0;
        if (class252.field3258 >= 96) {
            class459.method2677(2, 2);
        } else {
            class459.method2677(0, 2);
        }
        super.field2169 = false;
        super.field2196 = true;
        super.field2207 = class618.field8938 == 1 ? 2 : 4;
        super.field2184 = false;
        super.field2172 = 0;
        super.field2176 = false;
        super.field2168 = 2;
        super.field2175 = 0;
        super.field2194 = true;
        super.field2188 = 2;
        class627 var2 = null;
        try {
            class506 var3 = arg0.method912("", -4588, true);
            while (~var3.field7031 == -1) {
                class462.method2688(1L, (byte) 110);
            }
            if (var3.field7031 == 1) {
                var2 = (class627) var3.field7030;
                byte[] var4 = new byte[(int) var2.method3594(-1)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method3597(false, var4, var5, var4.length + -var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method3579(18770, new class374(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3596((byte) -95);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V")
    public final void method3591(byte arg0) {
        ++field9005;
        this.method3589(true, 120);
        super.field2183 = true;
        super.field2193 = true;
        super.field2187 = true;
        super.field2181 = true;
        if (arg0 < 108) {
            this.field8997 = true;
        }
        super.field2178 = true;
        super.field2166 = super.field2170 = 0;
        super.field2198 = true;
        super.field2173 = 1;
        super.field2197 = true;
        super.field2182 = true;
        super.field2186 = true;
        super.field2185 = true;
        super.field2205 = super.field2191 = 2;
        super.field2189 = true;
        if (class252.field3258 > 95) {
            class459.method2677(2, 2);
        } else {
            class459.method2677(0, 2);
        }
        super.field2169 = false;
        super.field2194 = true;
        super.field2175 = 0;
        this.method3581((byte) -118);
        super.field2204 = 4;
        class529.method3013(4);
    }
}
