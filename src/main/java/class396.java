import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class396 extends class30 {

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field5925 = 100;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Ljava/lang/String;")
    public static String field5933 = "green:";

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[Z")
    public static boolean[] field5927 = new boolean[100];

    @OriginalMember(owner = "client!h", name = "L", descriptor = "B")
    public static byte field5926;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Lpe;")
    public static class362 field5932;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 3)
    public class396() {
        super(3, false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[I", line = 8)
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 < 49) {
            method2495(-50, (byte) 65, 78, -48, -32);
        }
        ++field5934;
        int[] var3 = super.field371.method2367((byte) -117, arg0);
        if (super.field371.field5586) {
            int[] var4 = this.method210((byte) 66, 0, arg0);
            int[] var5 = this.method210((byte) 58, 1, arg0);
            int[] var6 = this.method210((byte) 16, 2, arg0);
            for (int var7 = 0; class369.field5610 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ltm;III)V", line = 68)
    public static final void method2494(class219 arg0, int arg1, int arg2, int arg3) {
        ++field5924;
        if ((arg2 & 512) != 0) {
            int var4 = class158.field2514.method1287(false);
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            for (int var8 = 0; ~var4 < ~var8; ++var8) {
                int var9 = class158.field2514.method1314(true);
                if (~var9 == -65536) {
                    var9 = -1;
                }
                var5[var8] = var9;
                var6[var8] = class158.field2514.method1322(false);
                var7[var8] = class158.field2514.method1272((byte) -73);
            }
            class256.method1767(arg0, var7, var5, var6, false);
        }
        int var10 = -126 % ((79 - arg3) / 39);
        if ((4 & arg2) != 0) {
            int var11 = class158.field2514.method1299(-82);
            int var12 = class158.field2514.method1287(false);
            arg0.method913(var12, class183.field2987, -5, var11);
            arg0.field1863 = class183.field2987 + 300;
            arg0.field1884 = class158.field2514.method1285((byte) -33);
        }
        if ((arg2 & 2048) != 0) {
            int var13 = class158.field2514.method1272((byte) -62);
            arg0.field1822 = class158.field2514.method1285((byte) -33);
            arg0.field1856 = class158.field2514.method1313(-67);
            arg0.field1877 = ~(var13 & 32768) != -1;
            arg0.field1887 = 32767 & var13;
            arg0.field1820 = class183.field2987 - -arg0.field1822 + arg0.field1887;
        }
        if (~(arg2 & 32) != -1) {
            int var14 = class158.field2514.method1285((byte) -33);
            byte[] var15 = new byte[var14];
            class186 var16 = new class186(var15);
            class158.field2514.method1292(0, var15, 1847860680, var14);
            class430.field6327[arg1] = var16;
            arg0.method1564(var16, -127);
        }
        if (~(8 & arg2) != -1) {
            arg0.field1832 = class158.field2514.method1279(255);
            if (arg0.field1832 == 65535) {
                arg0.field1832 = -1;
            }
        }
        if (~(arg2 & 1) != -1) {
            arg0.field1823 = class158.field2514.method1270(-9970);
            if (arg0.field1823.charAt(0) == '~') {
                arg0.field1823 = arg0.field1823.substring(1);
                class429.method2656(2, 0, -1, arg0.method1566(true, -13847), arg0.field1823, arg0.method1570(false, 255));
            } else if (class261.field4201 == arg0) {
                class429.method2656(2, 0, -1, arg0.method1566(true, -13847), arg0.field1823, arg0.method1570(false, 255));
            }
            arg0.field1859 = 0;
            arg0.field1855 = 0;
            arg0.field1846 = 150;
        }
        if ((arg2 & 4096) != 0) {
            int var17 = class158.field2514.method1279(255);
            int var18 = class158.field2514.method1284(8388607);
            if (~var17 == -65536) {
                var17 = -1;
            }
            boolean var19 = true;
            if (var17 != -1 && arg0.field1873 != -1) {
                if (arg0.field1873 != var17) {
                    class379 var20 = class115.method839((byte) -57, var17);
                    class379 var21 = class115.method839((byte) -57, arg0.field1873);
                    if (~var20.field5734 != 0 && ~var21.field5734 != 0) {
                        class417 var22 = class156.method1099(var20.field5734, 92);
                        class417 var23 = class156.method1099(var21.field5734, 52);
                        if (var23.field6166 > var22.field6166) {
                            var19 = false;
                        }
                    }
                } else {
                    class379 var24 = class115.method839((byte) -57, var17);
                    if (var24.field5731 && var24.field5734 != -1) {
                        class417 var25 = class156.method1099(var24.field5734, 58);
                        int var26 = var25.field6172;
                        if (var26 != 0) {
                            if (~var26 == -2) {
                                var19 = true;
                            } else if (~var26 == -3) {
                                arg0.field1858 = 0;
                                var19 = false;
                            }
                        } else {
                            var19 = false;
                        }
                    }
                }
            }
            if (var19) {
                arg0.field1826 = var18 >> 16;
                arg0.field1867 = 1;
                arg0.field1879 = 0;
                arg0.field1866 = 0;
                arg0.field1873 = var17;
                arg0.field1886 = (var18 & 65535) + class183.field2987;
                if (class183.field2987 < arg0.field1886) {
                    arg0.field1879 = -1;
                }
                if (~arg0.field1873 != 0 && ~class183.field2987 == ~arg0.field1886) {
                    int var27 = class115.method839((byte) -57, arg0.field1873).field5734;
                    if (var27 != -1) {
                        class417 var28 = class156.method1099(var27, 110);
                        if (var28 != null && var28.field6177 != null) {
                            class196.method1374(arg0.field722, (byte) -104, 0, arg0.field724, class261.field4201 == arg0, var28);
                        }
                    }
                }
            }
        }
        if (~(arg2 & 16) != -1) {
            int var29 = class158.field2514.method1314(true);
            if (~var29 == -65536) {
                var29 = -1;
            }
            int var30 = class158.field2514.method1285((byte) -33);
            class349.method2276(0, arg0, var30, var29);
        }
        if (~(1024 & arg2) != -1) {
            int var31 = class158.field2514.method1299(-88);
            int var32 = class158.field2514.method1285((byte) -33);
            arg0.method913(var32, class183.field2987, -5, var31);
        }
        if ((256 & arg2) != 0) {
            arg0.field1842 = class158.field2514.method1287(false);
            arg0.field1892 = class158.field2514.method1322(false);
            arg0.field1889 = class158.field2514.method1322(false);
            arg0.field1882 = class158.field2514.method1285((byte) -33);
            arg0.field1840 = class158.field2514.method1279(255) - -class183.field2987;
            arg0.field1888 = class158.field2514.method1273((byte) -63) + class183.field2987;
            arg0.field1895 = class158.field2514.method1313(-118);
            arg0.field1909 = 1;
            arg0.field1911 = 0;
        }
        if ((128 & arg2) != 0) {
            arg0.field1848 = class158.field2514.method1273((byte) -43);
            arg0.field1844 = class158.field2514.method1314(true);
        }
        if ((arg2 & 64) != 0) {
            int var33 = class158.field2514.method1273((byte) -91);
            int var34 = class158.field2514.method1322(false);
            int var35 = class158.field2514.method1313(-119);
            int var36 = class158.field2514.field3044;
            boolean var37 = ~(var33 & 32768) != -1;
            if (arg0.field3588 != null && arg0.field3599 != null) {
                boolean var38 = false;
                if (var34 <= 1) {
                    if (!var37 && (class52.field651 && !class277.field4416 || class333.field5199)) {
                        var38 = true;
                    } else if (class309.method2071(78, arg0.field3588)) {
                        var38 = true;
                    }
                }
                if (!var38 && ~class413.field6110 == -1) {
                    class67.field846.field3044 = 0;
                    class158.field2514.method1291(class67.field846.field3066, 0, var35, 97);
                    class67.field846.field3044 = 0;
                    int var39 = -1;
                    String var40;
                    if (!var37) {
                        var40 = class348.method2272(class341.method2238(true, class201.method1398((byte) 110, class67.field846)), true);
                    } else {
                        var33 &= 32767;
                        class343 var41 = class77.method482(class67.field846, 0);
                        var39 = var41.field5288;
                        var40 = var41.field5289.method1242((byte) 3, class67.field846);
                    }
                    arg0.field1823 = var40.trim();
                    arg0.field1859 = var33 >> 8;
                    arg0.field1855 = 255 & var33;
                    arg0.field1846 = 150;
                    int var42;
                    if (var34 != 1 && ~var34 != -3) {
                        var42 = var37 ? 17 : 2;
                    } else {
                        var42 = !var37 ? 1 : 17;
                    }
                    if (var34 == 2) {
                        class102.method764(var42, (String) null, -4461, "<img=1>" + arg0.method1566(true, -13847), 0, "<img=1>" + arg0.method1570(false, 255), var39, var40);
                    } else if (var34 != 1) {
                        class102.method764(var42, (String) null, -4461, arg0.method1566(true, -13847), 0, arg0.method1570(false, 255), var39, var40);
                    } else {
                        class102.method764(var42, (String) null, -4461, "<img=0>" + arg0.method1566(true, -13847), 0, "<img=0>" + arg0.method1570(false, 255), var39, var40);
                    }
                }
            }
            class158.field2514.field3044 = var35 + var36;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[[I", line = 393)
    public final int[][] method203(byte arg0, int arg1) {
        ++field5930;
        if (arg0 != -93) {
            method2496(17);
        }
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[] var4 = this.method210((byte) 114, 2, arg1);
            int[][] var5 = this.method206(arg1, arg0 ^ -95, 0);
            int[][] var6 = this.method206(arg1, 2, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class369.field5610 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBIII)Z", line = 473)
    public static final boolean method2495(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field5929;
        if ((2 & class31.field382[0][arg0][arg4]) != 0) {
            return true;
        } else if ((class31.field382[arg3][arg0][arg4] & 16) != 0) {
            return false;
        } else if (arg2 == class13.method122(arg3, arg4, arg0, 27731)) {
            return true;
        } else {
            return arg1 != 59;
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 498)
    public static void method2496(int arg0) {
        field5932 = null;
        field5927 = null;
        field5933 = null;
        if (arg0 != 4096) {
            field5925 = -90;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljg;II)V", line = 511)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field5931;
        if (arg2 == 0) {
            super.field376 = ~arg0.method1322(false) == -2;
        }
        if (arg1 != 6456) {
            field5927 = null;
        }
    }
}
