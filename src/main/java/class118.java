import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class118 extends class129 {

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public int field2096 = -1;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public int field2100 = -1;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lnk;")
    public static class326 field2095 = new class326(46, 3);

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        ++field2092;
        class202 var3 = arg1.method820();
        var3.method1246(super.field2216, super.field2217, super.field2222);
        if (arg0 > -24) {
            this.field2091 = 119;
        }
        class430 var4 = class21.method111((byte) 116, 3);
        if (~this.field2100 != 0) {
            class530 var5 = class20.field218.method2221(this.field2100, -1).method703(2048, 0, arg1, 0, (class145) null, false, this.field2098, (class333) null, -1);
            if (var5 != null) {
                var5.method736(var3, var4.field6447[2], 0);
            }
        }
        if (this.field2096 != -1) {
            class530 var6 = class20.field218.method2221(this.field2096, -1).method703(2048, 0, arg1, 0, (class145) null, false, this.field2102, (class333) null, -1);
            if (var6 != null) {
                var6.method736(var3, var4.field6447[1], 0);
            }
        }
        class530 var7 = class20.field218.method2221(this.field2091, -1).method703(2048, 0, arg1, 0, (class145) null, false, this.field2093, (class333) null, -1);
        if (var7 != null) {
            var7.method736(var3, var4.field6447[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lhd;ZLhd;II)I")
    public static final int method941(class239 arg0, boolean arg1, class239 arg2, int arg3, int arg4) {
        ++field2103;
        if (arg3 == 1) {
            int var5 = arg2.field4983;
            int var6 = arg0.field4983;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (~var5 == 0) {
                    var5 = 2001;
                }
            }
            return -var6 + var5;
        } else if (arg4 != 0) {
            return 87;
        } else if (arg3 == 2) {
            return class111.method799(456384544, arg0.method1641(-12531).field13, class300.field4813, arg2.method1641(-12531).field13);
        } else if (~arg3 == -4) {
            if (arg2.field4127.equals("-")) {
                if (arg0.field4127.equals("-")) {
                    return 0;
                } else {
                    return arg1 ? -1 : 1;
                }
            } else if (arg0.field4127.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class111.method799(arg4 + 456384544, arg0.field4127, class300.field4813, arg2.field4127);
            }
        } else if (~arg3 == -5) {
            if (arg2.method2013(-83)) {
                return arg0.method2013(-75) ? 0 : 1;
            } else {
                return !arg0.method2013(-108) ? 0 : -1;
            }
        } else if (arg3 == 5) {
            if (!arg2.method2008((byte) 47)) {
                return arg0.method2008((byte) 99) ? -1 : 0;
            } else {
                return !arg0.method2008((byte) -110) ? 1 : 0;
            }
        } else if (~arg3 == -7) {
            if (arg2.method2009(-1)) {
                return arg0.method2009(-1) ? 0 : 1;
            } else {
                return !arg0.method2009(-1) ? 0 : -1;
            }
        } else if (arg3 == 7) {
            if (arg2.method2010(true)) {
                return arg0.method2010(true) ? 0 : 1;
            } else {
                return !arg0.method2010(true) ? 0 : -1;
            }
        } else if (arg3 == 8) {
            int var7 = arg2.field4123;
            int var8 = arg0.field4123;
            if (!arg1) {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (~var8 == 0) {
                    var8 = 1000;
                }
            } else {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            }
            return var7 - var8;
        } else {
            return -arg0.field4128 + arg2.field4128;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        if (arg0 != 35) {
            this.field2096 = -24;
        }
        ++field2097;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
    public static final void method942(boolean arg0, int arg1) {
        ++field2099;
        if (arg0 && class210.field3321 != null) {
            class13.field151 = class210.field3321.field5444;
        } else {
            class13.field151 = -1;
        }
        class3.field27 = null;
        class536.field7873 = null;
        class210.field3321 = null;
        class57.field900 = 0;
        class210.method1384();
        class210.field3332.method2543(7655);
        class295.field4756 = null;
        class468.field6957 = null;
        class129.field2226 = -1;
        class23.field314 = null;
        class210.field3333 = null;
        class303.field4859 = null;
        class435.field6504 = -1;
        class166.field2667 = null;
        class182.field2881 = null;
        class459.field6809 = null;
        class171.field2740 = null;
        if (arg1 != 25616) {
            field2095 = null;
        }
        class261.field4363 = null;
        class210.field3329.method494((byte) 127);
        class210.field3328.method2006(64, (byte) -117, 64);
        class210.field3329.method496(28167, 128, 64);
        class210.field3323.method786(arg1 + -26262, 64);
        class189.field2953.method2901(arg1 ^ -31728, 64);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lia;IB)Ljava/lang/String;")
    public static final String method943(class23 arg0, int arg1, byte arg2) {
        ++field2094;
        try {
            if (arg2 != -27) {
                return null;
            } else {
                int var3 = arg0.method123(false);
                if (arg1 < var3) {
                    var3 = arg1;
                }
                byte[] var4 = new byte[var3];
                arg0.field301 += class298.field4798.method1320(var4, 0, (byte) -43, arg0.field302, arg0.field301, var3);
                return class444.method2669(4971, var3, 0, var4);
            }
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method944(int arg0) {
        if (arg0 == 0) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 121) {
            return true;
        } else {
            ++field2101;
            class202 var5 = arg0.method820();
            var5.method1246(super.field2216, super.field2217, super.field2222);
            class530 var6 = class20.field218.method2221(this.field2091, -1).method703(131072, 0, arg0, 0, (class145) null, false, this.field2093, (class333) null, -1);
            if (var6 != null && var6.method776(arg3, arg2, var5, true)) {
                return true;
            } else {
                if (~this.field2096 != 0) {
                    class530 var7 = class20.field218.method2221(this.field2096, -1).method703(131072, 0, arg0, 0, (class145) null, false, this.field2102, (class333) null, -1);
                    if (var7 != null && var7.method776(arg3, arg2, var5, true)) {
                        return true;
                    }
                }
                if (~this.field2100 != 0) {
                    class530 var8 = class20.field218.method2221(this.field2100, -1).method703(131072, 0, arg0, 0, (class145) null, false, this.field2098, (class333) null, -1);
                    if (var8 != null && var8.method776(arg3, arg2, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
