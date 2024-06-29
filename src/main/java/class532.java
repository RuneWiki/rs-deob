import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class532 extends class305 {

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public static int field7774 = 0;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "Lla;")
    public static class310 field7770;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "Lwk;")
    public static class329 field7769;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "[Liw;")
    private class409[] field7767;

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
    public class532() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field4675 = arg1.method1337((byte) -107) == 1;
            }
        } else {
            this.field7767 = new class409[arg1.method1337((byte) -7)];
            for (int var4 = 0; ~var4 > ~this.field7767.length; ++var4) {
                int var5 = arg1.method1337((byte) 3);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field7767[var4] = class25.method158(arg1, 2);
                            }
                        } else {
                            this.field7767[var4] = class324.method2129(arg1, (byte) 8);
                        }
                    } else {
                        this.field7767[var4] = class334.method2176(705, arg1);
                    }
                } else {
                    this.field7767[var4] = class368.method2338(-14484, arg1);
                }
            }
        }
        if (arg2 >= 76) {
            ++field7771;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([[II)V")
    private final void method3141(int[][] arg0, int arg1) {
        ++field7773;
        if (arg1 != 8807) {
            field7774 = 43;
        }
        int var3 = class91.field1471;
        int var4 = class537.field7884;
        class158.method1142(arg0, (byte) 113);
        class265.method1845(-116, 0, 0, class228.field3447, class236.field3551);
        if (this.field7767 != null) {
            for (int var5 = 0; ~var5 > ~this.field7767.length; ++var5) {
                class409 var6 = this.field7767[var5];
                int var7 = var6.field6044;
                int var8 = var6.field6043;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method1855(var4, (byte) -15, var3);
                    }
                } else if (~var8 > -1) {
                    var6.method1852(var4, (byte) 88, var3);
                } else {
                    var6.method1850(var4, var3, 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lza;IILc;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method3142(class299 arg0, int arg1, int arg2, class517 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class319.field4840 = arg0;
        class129.field1921 = arg1;
        class182.field2788 = arg3;
        class256.field4122 = class319.field4840.method572() > 0;
        class144.field2126 = arg4 >> class295.field4543;
        class29.field323 = arg6 >> class295.field4543;
        class523.field7679 = arg4;
        class452.field6726 = arg6;
        class202.field3117 = arg5;
        class83.field1368 = class144.field2126 - class16.field166;
        if (class83.field1368 < 0) {
            class321.field4872 = -class83.field1368;
            class83.field1368 = 0;
        } else {
            class321.field4872 = 0;
        }
        class7.field84 = class29.field323 - class16.field166;
        if (class7.field84 < 0) {
            class384.field5661 = -class7.field84;
            class7.field84 = 0;
        } else {
            class384.field5661 = 0;
        }
        class324.field4921 = class16.field166 + class144.field2126;
        if (class324.field4921 > class474.field6947) {
            class324.field4921 = class474.field6947;
        }
        class20.field230 = class29.field323 + class16.field166;
        if (class20.field230 > class443.field6603) {
            class20.field230 = class443.field6603;
        }
        for (int var18 = 0; var18 < class16.field166 + class16.field166 + 2; ++var18) {
            for (int var23 = 0; var23 < class16.field166 + class16.field166 + 2; ++var23) {
                int var24 = class144.field2126 - class16.field166 + var18;
                int var25 = class29.field323 - class16.field166 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class474.field6947 && var25 < class443.field6603) {
                    int var26 = var24 << class295.field4543;
                    int var27 = var25 << class295.field4543;
                    int var28 = class274.field4306[class274.field4306.length - 1].method56(var24, var25) - (1000 << class295.field4543 - 7);
                    int var29 = class288.field4475 != null ? class288.field4475[0].method56(var24, var25) + class90.field1454 : class274.field4306[0].method56(var24, var25) + class90.field1454;
                    class63.field999[var18][var23] = class319.field4840.method578(var26, var28, var27, var26, var29, var27);
                } else {
                    class63.field999[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class16.field166 + class16.field166 + 1; ++var19) {
            for (int var22 = 0; var22 < class16.field166 + class16.field166 + 1; ++var22) {
                class390.field5715[var19][var22] = class63.field999[var19][var22] || class63.field999[var19 + 1][var22] || class63.field999[var19][var22 + 1] || class63.field999[var19 + 1][var22 + 1];
            }
        }
        class54.field834 = arg8;
        class483.field7077 = arg9;
        class276.field4342 = arg10;
        class412.field6085 = arg11;
        class286.field4465 = arg12;
        class536.method3154();
        class276.method1885(86);
        for (class293 var20 = (class293) class103.field1592.method1076((byte) 121); var20 != null; var20 = (class293) class103.field1592.method1077(-1)) {
            var20.method2069(-11);
            class241.method1622(false, var20);
        }
        if (class256.field4122) {
            for (int var21 = 0; var21 < class16.field172; ++var21) {
                class356.field5270[var21].method1267(111, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class319.field4840.method525(0);
            if (class33.field398 == null || class33.field398 instanceof class40) {
                class33.field398 = new class64();
            }
        } else if (class33.field398 == null || class33.field398 instanceof class64) {
            class33.field398 = new class40();
        }
        class33.field398.method270(arg2, 1);
        class33.field398.method269(71);
        if (class360.field5317 != null) {
            class2.method6(true);
            class33.field398.method267((byte) -55, 22);
            class481.method2906(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class33.field398.method269(66);
            class33.field398.method267((byte) -101, 23);
            class2.method6(false);
        }
        class481.method2906(arg2, arg7, arg13, arg14, arg15, arg16);
        class33.field398.method269(94);
        class33.field398.method273((byte) -42);
        class33.field398.method269(48);
        if (arg2 > 1) {
            class319.field4840.method549(0);
        }
        class319.field4840.method519(0, (class344[]) null);
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)V")
    public static void method3143(byte arg0) {
        field7769 = null;
        field7770 = null;
        if (arg0 != 105) {
            method3143((byte) -9);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7768;
        if (arg1 != 4688) {
            this.method3141((int[][]) null, -13);
        }
        int[] var3 = super.field4677.method2174(arg0, 108);
        if (super.field4677.field5040) {
            this.method3141(super.field4677.method2177((byte) -89), 8807);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field7775;
        if (arg1 > -59) {
            return null;
        } else {
            int[][] var3 = super.field4674.method2206(-57, arg0);
            if (super.field4674.field5110) {
                int var4 = class91.field1471;
                int var5 = class537.field7884;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field4674.method2205((byte) 52);
                this.method3141(var6, 8807);
                for (int var8 = 0; class537.field7884 > var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~class91.field1471 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class307.method2028(4080, var15 << 4);
                        var12[var14] = class307.method2028(4080, var15 >> 4);
                        var11[var14] = class307.method2028(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }
}
