import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class23 extends class105 {

    @OriginalMember(owner = "client!p", name = "Jb", descriptor = "Ltl;")
    public static class59 field299 = class85.method639("(U0a )2 non)2existant gosub script)2num: ", 9588);

    @OriginalMember(owner = "client!p", name = "Ob", descriptor = "Ltl;")
    public static class59 field304 = null;

    @OriginalMember(owner = "client!p", name = "Nb", descriptor = "Ltl;")
    public static class59 field303 = class85.method639("", 9588);

    @OriginalMember(owner = "client!p", name = "Sb", descriptor = "Ltl;")
    public static class59 field308 = class85.method639(" )2> <col=ffff00>", 9588);

    @OriginalMember(owner = "client!p", name = "Rb", descriptor = "Ltl;")
    public static class59 field307 = class85.method639("cross", 9588);

    @OriginalMember(owner = "client!p", name = "Vb", descriptor = "[Lp;")
    public static class23[] field311 = new class23[32768];

    @OriginalMember(owner = "client!p", name = "Xb", descriptor = "[[S")
    public static short[][] field313 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!p", name = "Ib", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!p", name = "Lb", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!p", name = "Mb", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!p", name = "Pb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!p", name = "Qb", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!p", name = "Tb", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!p", name = "Wb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!p", name = "Yb", descriptor = "Lae;")
    public class119 field314;

    @OriginalMember(owner = "client!p", name = "Kb", descriptor = "Lug;")
    public static class192 field300;

    @OriginalMember(owner = "client!p", name = "Ub", descriptor = "Loe;")
    public static class9 field310;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 6)
    public static final void method145(int arg0) {
        class150 var1 = new class150();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class167.field2711[var2][var3] = var1;
            }
        }
        if (arg0 < -46) {
            field312++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIIZI)V", line = 36)
    public static final void method146(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field301++;
        if (class55.field815) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class290.field4967 + ((class299.field5113 - class290.field4967) * var6 / 100);
            if (var7 < class53.field784) {
                var7 = class53.field784;
            } else if (var7 > class238.field3976) {
                var7 = class238.field3976;
            }
            int var8 = arg1 * 512 * var7 / (arg5 * 334);
            if (var8 < class312.field5294) {
                short var12 = class312.field5294;
                var7 = arg5 * var12 * 334 / (arg1 * 512);
                if (var7 > class238.field3976) {
                    var7 = class238.field3976;
                    int var13 = arg1 * var7 * 512 / (var12 * 334);
                    int var14 = (arg5 - var13) / 2;
                    if (arg0) {
                        class240.method1681();
                        class240.method1688(arg3, arg2, var14, arg1, 0);
                        class240.method1688(arg3 + arg5 - var14, arg2, var14, arg1, 0);
                    }
                    arg5 -= var14 * 2;
                    arg3 += var14;
                }
            } else if (class184.field3094 < var8) {
                short var9 = class184.field3094;
                var7 = arg5 * 334 * var9 / (arg1 * 512);
                if (class53.field784 > var7) {
                    var7 = class53.field784;
                    int var10 = var9 * 334 * arg5 / (var7 * 512);
                    int var11 = (arg1 - var10) / 2;
                    if (arg0) {
                        class240.method1681();
                        class240.method1688(arg3, arg2, arg5, var11, 0);
                        class240.method1688(arg3, arg1 + arg2 - var11, arg5, var11, 0);
                    }
                    arg2 += var11;
                    arg1 -= var11 * 2;
                }
            }
            class237.field3945 = arg1 * var7 / 334;
        }
        class293.field4995 = arg2;
        if (!arg4) {
            class31.field431 = arg3;
            class232.field3812 = (short) arg1;
            class308.field5209 = (short) arg5;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 137)
    public static void method147(int arg0) {
        field313 = (short[][]) null;
        field308 = null;
        field311 = null;
        field299 = null;
        field310 = null;
        field300 = null;
        field307 = null;
        field303 = null;
        field304 = null;
        if (arg0 != 28946) {
            method145(-54);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILfg;JLfg;Lfg;)V", line = 174)
    public static final void method148(int arg0, int arg1, int arg2, int arg3, class176 arg4, long arg5, class176 arg6, class176 arg7) {
        class83 var9 = new class83();
        var9.field1295 = arg4;
        var9.field1301 = arg1 * 128 + 64;
        var9.field1299 = arg2 * 128 + 64;
        var9.field1296 = arg3;
        var9.field1294 = arg5;
        var9.field1297 = arg6;
        var9.field1302 = arg7;
        int var10 = 0;
        class245 var11 = class120.field2010[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4092; var12++) {
                class165 var13 = var11.field4107[var12];
                if ((var13.field2673 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2688.method152();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1300 = -var10;
        if (class120.field2010[arg0][arg1][arg2] == null) {
            class120.field2010[arg0][arg1][arg2] = new class245(arg0, arg1, arg2);
        }
        class120.field2010[arg0][arg1][arg2].field4097 = var9;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)Z", line = 217)
    public final boolean method149(byte arg0) {
        field309++;
        if (arg0 == 104) {
            return this.field314 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIJ)V", line = 241)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field305++;
        if (this.field314 == null) {
            return;
        }
        class129 var11 = this.field1737 != -1 && this.field1786 == 0 ? class265.method1834((byte) -39, this.field1737) : null;
        class129 var12 = this.field1767 == -1 || this.field1767 == this.field1720 && var11 != null ? null : class265.method1834((byte) -39, this.field1767);
        class57 var13 = this.field314.method887(var11, (byte) 98, this.field1781, this.field1746, var12);
        if (var13 == null) {
            return;
        }
        this.field1723 = var13.method152();
        class119 var14 = this.field314;
        if (var14.field1958 != null) {
            var14 = var14.method890(958);
        }
        if (class266.field4584 && var14.field1937) {
            class57 var15 = class13.method85(this.field314.field1948, var12 == null ? this.field1781 : this.field1746, this.field1731, this.field314.field1985, var13, this.field1774, this.field314.field1930, this.field1769, arg0, this.field314.field1984, (byte) -112, var12 == null ? var11 : var12, this.field314.field1953, this.field1753);
            if (class55.field815) {
                float var16 = class55.method419();
                float var17 = class55.method397();
                class55.method390();
                class55.method412(var16, var17 - 150.0F);
                var15.method150(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class55.method411();
                class55.method412(var16, var17);
            } else {
                var15.method150(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field314.field1947 != 0 || this.field314.field1941 != 0) {
            int var21 = class298.field5095[arg0];
            int var22 = class298.field5094[arg0];
            short var23 = this.field314.field1941;
            int var24 = -var23 / 2;
            short var25 = this.field314.field1947;
            int var26 = -var25 / 2;
            int var27 = var21 * var24 + var22 * var26 >> 16;
            int var28 = var22 * var24 - var21 * var26 >> 16;
            int var29 = class73.method589(class247.field4119, true, this.field1774 + var27, this.field1769 - -var28);
            int var30 = var25 / 2;
            int var31 = -var23 / 2;
            int var32 = var21 * var31 + var22 * var30 >> 16;
            int var33 = -var25 / 2;
            int var34 = var22 * var31 - (var21 * var30) >> 16;
            int var35 = class73.method589(class247.field4119, true, this.field1774 + var32, this.field1769 - -var34);
            int var36 = var23 / 2;
            int var37 = var22 * var36 - (var21 * var33) >> 16;
            int var38 = var21 * var36 + var22 * var33 >> 16;
            int var39 = class73.method589(class247.field4119, true, this.field1774 + var38, this.field1769 - -var37);
            int var40 = var25 / 2;
            int var41 = var23 / 2;
            int var42 = var22 * var41 - var21 * var40 >> 16;
            int var43 = var21 * var41 + var22 * var40 >> 16;
            int var44 = var35 > var29 ? var29 : var35;
            int var45 = class73.method589(class247.field4119, true, this.field1774 + var43, this.field1769 + var42);
            int var46 = var45 > var39 ? var39 : var45;
            int var47 = var29 + var45;
            if (var47 > (var35 + var39)) {
                var47 = var35 + var39;
            }
            int var48 = var35 >= var45 ? var45 : var35;
            if (var23 != 0) {
                var18 = (int) (Math.atan2((double) (var44 - var46), (double) var23) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method428(var18);
                }
            }
            int var49 = var39 <= var29 ? var39 : var29;
            if (var25 != 0) {
                var19 = (int) (Math.atan2((double) (var49 - var48), (double) var25) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method432(var19);
                }
            }
            var20 = (var47 >> 1) - this.field1753;
            if (var20 != 0) {
                var13.method441(0, var20, 0);
            }
        }
        class57 var50 = null;
        if (this.field1749 != -1 && this.field1792 != -1) {
            class310 var51 = class221.method1533(this.field1749, (byte) -44);
            var50 = var51.method2141(0, this.field1792);
            if (var50 != null) {
                var50.method441(0, -this.field1730, 0);
                if (var51.field5269) {
                    if (var18 != 0) {
                        var50.method428(var18);
                    }
                    if (var19 != 0) {
                        var50.method432(var19);
                    }
                    if (var20 != 0) {
                        var50.method441(0, var20, 0);
                    }
                }
            }
        }
        if (!class55.field815) {
            if (var50 != null) {
                var13 = ((class258) var13).method1789(var50);
            }
            if (this.field314.field1948 == 1) {
                var13.field844 = true;
            }
            var13.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field314.field1948 == 1) {
            var13.field844 = true;
        }
        var13.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field314.field1948 == 1) {
                var50.field844 = true;
            }
            var50.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIBI)V", line = 447)
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field306++;
        if (arg7 >= class69.field1061 && arg3 <= class153.field2504 && class28.field369 <= arg5 && class62.field957 >= arg2) {
            class288.method2004(arg0, arg7, arg2, arg4, -120, arg1, arg5, arg3);
        } else {
            class43.method288(arg5, arg3, arg7, arg1, arg2, arg4, arg0, (byte) 118);
        }
        if (arg6 > -96) {
            method145(79);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()I", line = 471)
    public final int method152() {
        field298++;
        return this.field1723;
    }
}
