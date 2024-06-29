import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class118 implements class4 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lvo;")
    private class345 field1869;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZI)Z")
    public static final boolean method952(int arg0, int arg1, boolean arg2, int arg3) {
        field1868++;
        if (!class155.field2557) {
            return false;
        } else if (class495.field7220 < 100) {
            return false;
        } else {
            int var4 = class682.field9711[arg0][arg1][arg3];
            if ((-class387.field5674) == var4) {
                return false;
            } else if (class387.field5674 == var4) {
                return true;
            } else if (!arg2) {
                return true;
            } else if (class687.field9745 == class340.field4723) {
                return false;
            } else {
                int var5 = arg1 << class49.field637;
                int var6 = arg3 << class49.field637;
                if (class45.method363(class687.field9745[arg0].method3858(arg3 + 1, arg1 + 1, (byte) 20), 1, class687.field9745[arg0].method3858(arg3, arg1, (byte) 86), class457.field6576 + var6 - 1, var5 - 1 + class457.field6576, class457.field6576 + var6 - 1, var6 + 1, var5 + 1, class687.field9745[arg0].method3858(arg3 + 1, arg1, (byte) 30), var5 + 1) && class45.method363(class687.field9745[arg0].method3858(arg3, arg1 + 1, (byte) 118), 1, class687.field9745[arg0].method3858(arg3, arg1, (byte) 53), var6 + 1, class457.field6576 + var5 - 1, class457.field6576 + var6 - 1, var6 - -1, class457.field6576 + var5 - 1, class687.field9745[arg0].method3858(arg3 + 1, arg1 + 1, (byte) 45), var5 + 1)) {
                    class661.field9298++;
                    class682.field9711[arg0][arg1][arg3] = class387.field5674;
                    return true;
                } else {
                    class682.field9711[arg0][arg1][arg3] = -class387.field5674;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public static final void method953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 8906) {
            return;
        }
        for (class693 var5 = (class693) class33.field477.method3905(arg1 ^ 0xFFFFDD4E); var5 != null; var5 = (class693) class33.field477.method3899(0)) {
            class607.method3454(arg2, arg3, arg0, arg4, var5, false);
        }
        field1872++;
        for (class693 var6 = (class693) class522.field7687.method3905(-126); var6 != null; var6 = (class693) class522.field7687.method3899(0)) {
            byte var12 = 1;
            class674 var13 = var6.field9845.method1093(true);
            if (var6.field9845.field2425 == -1 || var6.field9845.field2353) {
                var12 = 0;
            } else if (var6.field9845.field2425 == var13.field9572 || var6.field9845.field2425 == var13.field9590 || var6.field9845.field2425 == var13.field9609 || var6.field9845.field2425 == var13.field9598) {
                var12 = 2;
            } else if (var6.field9845.field2425 == var13.field9563 || var6.field9845.field2425 == var13.field9570 || var6.field9845.field2425 == var13.field9607 || var6.field9845.field2425 == var13.field9578) {
                var12 = 3;
            }
            if (var6.field9831 != var12) {
                int var14 = class177.method1290(arg1 - 23621, var6.field9845);
                class528 var15 = var6.field9845.field1309;
                if (var15.field7758 != null) {
                    var15 = var15.method3110(class230.field3404, false);
                }
                if (var15 == null || var14 == -1) {
                    var6.field9822 = -1;
                    var6.field9831 = var12;
                    var6.field9832 = false;
                } else if (var6.field9822 == var14 && var6.field9832 == var15.field7739) {
                    var6.field9831 = var12;
                    var6.field9825 = var15.field7765;
                } else {
                    boolean var16 = false;
                    if (var6.field9843 == null) {
                        var16 = true;
                    } else {
                        var6.field9825 -= 512;
                        if (var6.field9825 <= 0) {
                            class387.field5675.method3092(var6.field9843);
                            var16 = true;
                            var6.field9843 = null;
                        }
                    }
                    if (var16) {
                        var6.field9822 = var14;
                        var6.field9832 = var15.field7739;
                        var6.field9834 = null;
                        var6.field9831 = var12;
                        var6.field9840 = null;
                        var6.field9825 = var15.field7765;
                    }
                }
            }
            var6.field9841 = var6.field9845.field3155;
            var6.field9820 = var6.field9845.field3155 + (var6.field9845.method1108(126) << 8);
            var6.field9827 = var6.field9845.field3154;
            var6.field9838 = var6.field9845.field3154 + (var6.field9845.method1108(arg1 - 8817) << 8);
            class607.method3454(arg2, arg3, arg0, arg4, var6, false);
        }
        for (class693 var7 = (class693) class260.field3749.method2815(0); var7 != null; var7 = (class693) class260.field3749.method2814(arg1 ^ 0x22CE)) {
            byte var8 = 1;
            class674 var9 = var7.field9836.method1093(true);
            if (var7.field9836.field2425 == -1 || var7.field9836.field2353) {
                var8 = 0;
            } else if (var7.field9836.field2425 == var9.field9572 || var7.field9836.field2425 == var9.field9590 || var7.field9836.field2425 == var9.field9609 || var7.field9836.field2425 == var9.field9598) {
                var8 = 2;
            } else if (var7.field9836.field2425 == var9.field9563 || var7.field9836.field2425 == var9.field9570 || var7.field9836.field2425 == var9.field9607 || var7.field9836.field2425 == var9.field9578) {
                var8 = 3;
            }
            if (var7.field9831 != var8) {
                int var10 = class3.method19(true, var7.field9836);
                if (var7.field9822 == var10 && var7.field9832 == var7.field9836.field3858) {
                    var7.field9831 = var8;
                    var7.field9825 = var7.field9836.field3854;
                } else {
                    boolean var11 = false;
                    if (var7.field9843 == null) {
                        var11 = true;
                    } else {
                        var7.field9825 -= 512;
                        if (var7.field9825 <= 0) {
                            class387.field5675.method3092(var7.field9843);
                            var7.field9843 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field9831 = var8;
                        var7.field9840 = null;
                        var7.field9834 = null;
                        var7.field9825 = var7.field9836.field3854;
                        var7.field9822 = var10;
                        var7.field9832 = var7.field9836.field3858;
                    }
                }
            }
            var7.field9841 = var7.field9836.field3155;
            var7.field9820 = var7.field9836.field3155 + (var7.field9836.method1108(80) << 8);
            var7.field9827 = var7.field9836.field3154;
            var7.field9838 = var7.field9836.field3154 + (var7.field9836.method1108(83) << 8);
            class607.method3454(arg2, arg3, arg0, arg4, var7, false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
    public final int method20(int arg0) {
        int var2 = -38 / ((arg0 + 32) / 59);
        field1870++;
        return this.field1869.method2076(72) ? 100 : this.field1869.method2079(0);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lvo;)V")
    public class118(class345 arg0) {
        this.field1869 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Lsba;")
    public final class387 method21(byte arg0) {
        field1871++;
        if (arg0 != -44) {
            this.field1869 = null;
        }
        return class387.field5666;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public static final void method954(int arg0, int arg1, int arg2) {
        field1873++;
        class449 var3 = class611.method3463(arg2, (byte) -123, 14);
        var3.method2615((byte) -57);
        var3.field6472 = arg1;
        if (arg0 == 23306) {
            ;
        }
    }
}
