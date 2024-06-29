import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class24 extends class371 {

    @OriginalMember(owner = "client!bh", name = "Fb", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!bh", name = "Qb", descriptor = "J")
    public static long field331 = 0L;

    @OriginalMember(owner = "client!bh", name = "Lb", descriptor = "[Lie;")
    public static class4[] field326 = new class4[4];

    @OriginalMember(owner = "client!bh", name = "Tb", descriptor = "Ljava/lang/String;")
    public static String field334 = "Loaded wordpack";

    @OriginalMember(owner = "client!bh", name = "Nb", descriptor = "Ljava/lang/String;")
    public static String field328 = "Members object";

    @OriginalMember(owner = "client!bh", name = "Ib", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "client!bh", name = "Xb", descriptor = "[Lqo;")
    public static class16[] field338 = new class16[6];

    @OriginalMember(owner = "client!bh", name = "Cb", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bh", name = "Db", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bh", name = "Eb", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!bh", name = "Gb", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bh", name = "Hb", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bh", name = "Mb", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bh", name = "Ob", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!bh", name = "Pb", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bh", name = "Rb", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bh", name = "Sb", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bh", name = "Ub", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bh", name = "Vb", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bh", name = "Wb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bh", name = "Yb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bh", name = "ac", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bh", name = "Kb", descriptor = "Lp;")
    private class120 field325;

    @OriginalMember(owner = "client!bh", name = "Jb", descriptor = "Lqj;")
    public static class296 field324;

    @OriginalMember(owner = "client!bh", name = "Zb", descriptor = "Ljm;")
    public static class409 field340;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IZ)I", line = 10)
    public final int method156(int arg0, boolean arg1) {
        if (arg1) {
            this.method161(87, (int[]) null);
        }
        ++field330;
        return arg0 * 8 + -this.field329;
    }

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "(I)V", line = 22)
    public final void method157(int arg0) {
        int var2 = -11 % ((arg0 - 92) / 33);
        ++field327;
        super.field5273 = (this.field329 - -7) / 8;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V", line = 35)
    public class24(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V", line = 38)
    public final void method158(byte arg0, int arg1) {
        ++field341;
        if (arg0 != 7) {
            this.method158((byte) -81, 30);
        }
        super.field5258[super.field5273++] = (byte) (this.field325.method816((byte) -125) + arg1);
    }

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "(I)V", line = 49)
    public final void method159(int arg0) {
        ++field322;
        this.field329 = super.field5273 * arg0;
    }

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "(B)I", line = 57)
    public final int method160(byte arg0) {
        ++field319;
        if (arg0 <= 48) {
            this.method156(-103, true);
        }
        return super.field5258[super.field5273++] + -this.field325.method816((byte) 112) & 255;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[I)V", line = 77)
    public final void method161(int arg0, int[] arg1) {
        this.field325 = new class120(arg1);
        if (arg0 != 26134) {
            field321 = 70;
        }
        ++field339;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lpm;)V", line = 89)
    public static final void method162(class347 arg0) {
        if (class155.field2185 < 255) {
            class84.field1302[class155.field2185] = arg0;
            class257.field3496[class155.field2185] = false;
            ++class155.field2185;
            int var1 = arg0.field4857;
            if (arg0.field4871) {
                var1 = 0;
            }
            int var2 = arg0.field4857;
            if (arg0.field4868) {
                var2 = class176.field2480 - 1;
            }
            for (int var3 = var1; var3 <= var2; ++var3) {
                int var4 = 0;
                int var5 = arg0.field1591 - arg0.field1584 + 64 >> 7;
                if (var5 < 0) {
                    var4 -= var5;
                    var5 = 0;
                }
                int var6 = arg0.field1591 + arg0.field1584 - 64 >> 7;
                if (var6 >= class371.field5311) {
                    var6 = class371.field5311 - 1;
                }
                for (int var7 = var5; var7 <= var6; ++var7) {
                    short var8 = arg0.field4860[var4++];
                    int var9 = (var8 >>> 8) + (arg0.field1583 - arg0.field1584 + 64 >> 7);
                    int var10 = (var8 & 255) + var9 - 1;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var10 >= class386.field5629) {
                        var10 = class386.field5629 - 1;
                    }
                    for (int var11 = var9; var11 <= var10; ++var11) {
                        int var12 = class36.field551[var3][var11][var7];
                        if ((var12 & 255) == 0) {
                            class36.field551[var3][var11][var7] = var12 | class155.field2185;
                        } else if ((var12 & 65280) == 0) {
                            class36.field551[var3][var11][var7] = var12 | class155.field2185 << 8;
                        } else if ((var12 & 16711680) == 0) {
                            class36.field551[var3][var11][var7] = var12 | class155.field2185 << 16;
                        } else if ((var12 & -16777216) == 0) {
                            class36.field551[var3][var11][var7] = var12 | class155.field2185 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "(II)I", line = 181)
    public final int method163(int arg0, int arg1) {
        if (arg1 > -90) {
            this.method158((byte) -45, -8);
        }
        ++field336;
        int var3 = this.field329 >> 3;
        int var4 = 8 - (7 & this.field329);
        this.field329 += arg0;
        int var5 = 0;
        while (~var4 > ~arg0) {
            var5 += (class323.field4425[var4] & super.field5258[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field5258[var3] & class323.field4425[var4]) + var5;
        } else {
            var6 = (super.field5258[var3] >> -arg0 + var4 & class323.field4425[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "(I)V", line = 211)
    public static final void method164(int arg0) {
        ++field318;
        int[] var1 = new int[class113.field1661];
        int var2 = 0;
        if (arg0 == 25256) {
            for (int var3 = 0; ~class113.field1661 < ~var3; ++var3) {
                class389 var5 = class347.method2222(var3, 18682);
                if (var5.field5671 >= 0 || ~var5.field5672 <= -1) {
                    var1[var2++] = var3;
                }
            }
            class58.field830 = new int[var2];
            for (int var4 = 0; ~var2 < ~var4; ++var4) {
                class58.field830[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIII)V", line = 253)
    public static final void method165(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field337;
        for (class398 var5 = (class398) class140.field1993.method1312((byte) 25); var5 != null; var5 = (class398) class140.field1993.method1304(-92)) {
            class168.method1138(arg3, arg4, arg0, var5, true, arg2);
        }
        if (arg1 != 33) {
            method164(-47);
        }
        for (class398 var6 = (class398) class286.field3939.method1312((byte) 25); var6 != null; var6 = (class398) class286.field3939.method1304(120)) {
            byte var11 = 1;
            class312 var12 = var6.field5811.method402(0);
            if (var6.field5811.field861) {
                var11 = 0;
            } else if (~var6.field5811.field928 != ~var12.field4295 && var6.field5811.field928 != var12.field4299 && var6.field5811.field928 != var12.field4285 && ~var6.field5811.field928 != ~var12.field4294) {
                if (~var6.field5811.field928 == ~var12.field4309 || var6.field5811.field928 == var12.field4280 || var6.field5811.field928 == var12.field4305 || ~var6.field5811.field928 == ~var12.field4286) {
                    var11 = 3;
                }
            } else {
                var11 = 2;
            }
            if (~var6.field5794 != ~var11) {
                int var13 = class323.method2042(-46, var6.field5811);
                if (var6.field5817 != var13) {
                    if (var6.field5799 != null) {
                        class252.field3467.method852(var6.field5799);
                        var6.field5799 = null;
                    }
                    var6.field5817 = var13;
                }
                var6.field5794 = var11;
            }
            var6.field5823 = var6.field5811.field6197;
            var6.field5814 = var6.field5811.field6197 + 64 * var6.field5811.method410((byte) 124);
            var6.field5796 = var6.field5811.field6192;
            var6.field5813 = var6.field5811.field6192 - -(var6.field5811.method410((byte) 54) * 64);
            class168.method1138(arg3, arg4, arg0, var6, true, arg2);
        }
        for (class398 var7 = (class398) class307.field4212.method1413(arg1 ^ 30348); var7 != null; var7 = (class398) class307.field4212.method1420((byte) -34)) {
            byte var8 = 1;
            class312 var9 = var7.field5806.method402(arg1 ^ 33);
            if (var7.field5806.field861) {
                var8 = 0;
            } else if (~var7.field5806.field928 != ~var9.field4295 && var7.field5806.field928 != var9.field4299 && ~var7.field5806.field928 != ~var9.field4285 && ~var7.field5806.field928 != ~var9.field4294) {
                if (~var7.field5806.field928 == ~var9.field4309 || ~var7.field5806.field928 == ~var9.field4280 || ~var7.field5806.field928 == ~var9.field4305 || var7.field5806.field928 == var9.field4286) {
                    var8 = 3;
                }
            } else {
                var8 = 2;
            }
            if (~var7.field5794 != ~var8) {
                int var10 = class232.method1463(arg1 ^ -21550, var7.field5806);
                if (var7.field5817 != var10) {
                    if (var7.field5799 != null) {
                        class252.field3467.method852(var7.field5799);
                        var7.field5799 = null;
                    }
                    var7.field5817 = var10;
                }
                var7.field5794 = var8;
            }
            var7.field5823 = var7.field5806.field6197;
            var7.field5814 = var7.field5806.field6197 + 64 * var7.field5806.method410((byte) 103);
            var7.field5796 = var7.field5806.field6192;
            var7.field5813 = var7.field5806.field6192 + 64 * var7.field5806.method410((byte) 93);
            class168.method1138(arg3, arg4, arg0, var7, true, arg2);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V", line = 366)
    public static final void method166(boolean arg0, int arg1) {
        if (~class399.field5832 == -1) {
            class225.field3024.method194(128, arg1);
        } else {
            class155.field2186 = arg1;
        }
        ++field335;
        if (arg0) {
            method165(77, (byte) 106, 61, -19, -90);
        }
    }

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "(II)V", line = 384)
    public static final void method167(int arg0, int arg1) {
        class41.field615.method1254(arg0, arg1 + -45);
        if (arg1 == 7) {
            ++field332;
        }
    }

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "(B)V", line = 419)
    public static void method168(byte arg0) {
        int var1 = 4 / ((arg0 - 48) / 61);
        field328 = null;
        field340 = null;
        field334 = null;
        field326 = null;
        field338 = null;
        field324 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB[B)V", line = 435)
    public final void method169(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field317;
        int var5 = -102 % ((arg2 - 83) / 38);
        for (int var6 = 0; arg0 > var6; ++var6) {
            arg3[arg1 + var6] = (byte) (super.field5258[super.field5273++] + -this.field325.method816((byte) 94));
        }
    }
}
