import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class62 extends class455 implements class113 {

    @OriginalMember(owner = "client!al", name = "u", descriptor = "Lro;")
    public class2 field912;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Z")
    private boolean field924;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Leq;Z)Lgl;", line = 7)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field926;
        class327 var3 = this.field912.method16(super.field6625, -1, super.field6633, arg0, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class33 var4 = arg0.method830();
            var4.method278(super.field6633 + super.field6627, super.field6639, super.field6635 + super.field6625);
            class408 var5 = null;
            if (this.field924) {
                var5 = class118.method675(-126, 1);
            }
            if (this.field912.field15 == null) {
                var3.method191(var4, var5 == null ? null : var5.field5983[0], 0);
            } else {
                class191 var6 = this.field912.field15.method2005();
                arg0.method787(var3, var6, var4, var5 == null ? null : var5.field5983[0], 0);
            }
            int var7 = super.field6633 >> 7;
            int var8 = super.field6625 >> 7;
            this.field912.method13(var3, -32533, var8, var7, true, var7, arg0, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Leq;Z)V", line = 45)
    public final void method360(class134 arg0, boolean arg1) {
        ++field927;
        if (!arg1) {
            this.field924 = false;
        }
        this.field912.method4((byte) -62, arg0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Leq;I)V", line = 56)
    public final void method361(class134 arg0, int arg1) {
        ++field920;
        class327 var3 = this.field912.method16(super.field6625, arg1, super.field6633, arg0, false, 262144, true);
        if (var3 != null) {
            int var4 = super.field6633 >> 7;
            int var5 = super.field6625 >> 7;
            this.field912.method13(var3, -32533, var5, var4, false, var4, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILeq;BI)Z", line = 76)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field917;
        class327 var5 = this.field912.method16(super.field6625, -1, super.field6633, arg1, false, 131072, false);
        int var6 = -30 % ((-23 - arg2) / 38);
        if (var5 == null) {
            return false;
        } else {
            class33 var7 = arg1.method830();
            var7.method278(super.field6633 + super.field6627, super.field6639, super.field6625 - -super.field6635);
            return var5.method184(arg0, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLeq;)V", line = 95)
    public final void method372(byte arg0, class134 arg1) {
        if (arg0 >= -49) {
            this.field924 = true;
        }
        ++field913;
        this.field912.method7(arg1, (byte) 22);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)Z", line = 107)
    public final boolean method371(boolean arg0) {
        ++field923;
        if (arg0) {
            method438(114, 121, (class294) null, 126, 32);
        }
        return this.field912.method14((byte) 123);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I", line = 120)
    public final int method362(byte arg0) {
        ++field919;
        return arg0 != -72 ? -53 : this.field912.field9;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 133)
    public final void method368(int arg0) {
        ++field916;
        if (arg0 != 5894) {
            this.method371(false);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)V", line = 143)
    public static final void method437(byte arg0, int arg1) {
        if (class378.field5658 != 0) {
            class8.field139 = arg1;
        } else {
            class8.field133.method1525(true, arg1);
        }
        int var2 = 103 % ((arg0 - -33) / 49);
        ++field918;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILbn;II)V", line = 165)
    public static final void method438(int arg0, int arg1, class294 arg2, int arg3, int arg4) {
        ++field914;
        class171 var5 = arg2.method1767(16643);
        int var6 = 16383 & -arg2.field4200.field416 + arg2.field4240;
        if (arg4 != -1) {
            if (~arg2.field4222 != 0 && (var6 >= 10240 || ~var6 >= -2049)) {
                int var7 = 16383 & class361.field5432[arg0] - arg2.field4200.field416;
                if (~arg4 == -3 && var5.field2285 != -1) {
                    if (var7 > 2048 && ~var7 >= -6145 && var5.field2282 != -1) {
                        arg2.field4256 = var5.field2282;
                    } else if (~var7 <= -10241 && var7 < 14336 && var5.field2306 != -1) {
                        arg2.field4256 = var5.field2306;
                    } else if (~var7 < -6145 && ~var7 > -10241 && var5.field2302 != -1) {
                        arg2.field4256 = var5.field2302;
                    } else {
                        arg2.field4256 = var5.field2285;
                    }
                } else if (arg4 == 0 && var5.field2318 != -1) {
                    if (var7 > 2048 && ~var7 >= -6145 && var5.field2320 != -1) {
                        arg2.field4256 = var5.field2320;
                    } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field2299 != 0) {
                        arg2.field4256 = var5.field2299;
                    } else if (var7 > 6144 && var7 < 10240 && var5.field2314 != -1) {
                        arg2.field4256 = var5.field2314;
                    } else {
                        arg2.field4256 = var5.field2318;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && var5.field2293 != -1) {
                    arg2.field4256 = var5.field2293;
                } else if (var7 >= 10240 && var7 < 14336 && ~var5.field2329 != 0) {
                    arg2.field4256 = var5.field2329;
                } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field2332 != 0) {
                    arg2.field4256 = var5.field2332;
                } else {
                    arg2.field4256 = var5.field2309;
                }
                arg2.field4209 = false;
            } else if (var6 == 0 && ~arg2.field4228 >= -26) {
                if (arg4 == 2 && var5.field2285 != -1) {
                    arg2.field4256 = var5.field2285;
                } else if (arg4 == 0 && ~var5.field2318 != 0) {
                    arg2.field4256 = var5.field2318;
                } else {
                    arg2.field4256 = var5.field2309;
                }
                arg2.field4209 = false;
            } else {
                if (~arg4 == -3 && var5.field2285 != -1) {
                    if (arg3 < 0 && var5.field2308 != -1) {
                        arg2.field4256 = var5.field2308;
                    } else if (~arg3 < -1 && var5.field2291 != -1) {
                        arg2.field4256 = var5.field2291;
                    } else {
                        arg2.field4256 = var5.field2285;
                    }
                } else if (arg4 == 0 && var5.field2318 != -1) {
                    if (arg3 < 0 && var5.field2327 != -1) {
                        arg2.field4256 = var5.field2327;
                    } else if (~arg3 < -1 && ~var5.field2307 != 0) {
                        arg2.field4256 = var5.field2307;
                    } else {
                        arg2.field4256 = var5.field2318;
                    }
                } else if (~arg3 > -1 && ~var5.field2286 != 0) {
                    arg2.field4256 = var5.field2286;
                } else if (arg3 > 0 && var5.field2300 != -1) {
                    arg2.field4256 = var5.field2300;
                } else {
                    arg2.field4256 = var5.field2309;
                }
                arg2.field4209 = false;
            }
        } else if (var6 == 0 && ~arg2.field4228 >= -26) {
            if (!arg2.field4209 || !var5.method1083(arg2.field4256, 2)) {
                arg2.field4256 = var5.method1084(-120);
                arg2.field4209 = arg2.field4256 != -1;
            }
        } else {
            if (arg3 < 0 && ~var5.field2310 != 0) {
                arg2.field4256 = var5.field2310;
            } else if (~arg3 < -1 && ~var5.field2316 != 0) {
                arg2.field4256 = var5.field2316;
            } else {
                arg2.field4256 = var5.field2309;
            }
            arg2.field4209 = false;
        }
        if (arg1 >= -110) {
            method438(16, -2, (class294) null, 84, 45);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILeq;Z)Lva;", line = 328)
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            this.field924 = false;
        }
        ++field921;
        return this.field912.method16(0, -1, 0, arg1, false, arg0, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 339)
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            this.field924 = false;
        }
        ++field915;
        return this.field912.field39;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Leq;Lhn;IIIIIZIIIIII)V", line = 351)
    public class62(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class354.method2145(-5, arg11, arg12));
        this.field912 = new class2(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field924 = ~arg1.field7041 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I", line = 360)
    public final int method370(byte arg0) {
        if (arg0 > -3) {
            this.field912 = null;
        }
        ++field925;
        return this.field912.method12((byte) -69);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I", line = 373)
    public final int method369(byte arg0) {
        if (arg0 < 24) {
            return -40;
        } else {
            ++field922;
            return this.field912.field12;
        }
    }
}
