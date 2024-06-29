import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class223 extends class192 {

    @OriginalMember(owner = "client!jea", name = "O", descriptor = "Z")
    private boolean field2913 = true;

    @OriginalMember(owner = "client!jea", name = "P", descriptor = "Z")
    private boolean field2914 = true;

    @OriginalMember(owner = "client!jea", name = "M", descriptor = "Lki;")
    public static class364 field2911 = new class364();

    @OriginalMember(owner = "client!jea", name = "Q", descriptor = "Lra;")
    public static class361 field2915 = new class361(7, 7);

    @OriginalMember(owner = "client!jea", name = "S", descriptor = "[I")
    public static int[] field2917 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!jea", name = "L", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jea", name = "R", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILfd;I)V", line = 6)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field2907;
        if (arg2 != -12160) {
            method1410(-85);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2449 = ~arg1.method2396(-121) == -2;
                }
            } else {
                this.field2914 = ~arg1.method2396(arg2 ^ -12082) == -2;
            }
        } else {
            this.field2913 = arg1.method2396(arg2 + 12277) == 1;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IB)[I", line = 50)
    public final int[] method118(int arg0, byte arg1) {
        ++field2909;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            method1412((byte) 2);
        }
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, !this.field2914 ? arg0 : -arg0 + class95.field1247, 0);
            if (!this.field2913) {
                class443.method2517(var4, 0, var3, 0, class561.field7319);
            } else {
                for (int var5 = 0; class561.field7319 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class337.field4356];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "(B)V", line = 90)
    public static final void method1409(byte arg0) {
        if (arg0 <= -60) {
            class415.field5335 = null;
            ++field2908;
            class660.field9200 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(IB)[[I", line = 102)
    public final int[][] method107(int arg0, byte arg1) {
        ++field2916;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[][] var4 = this.method1251(0, this.field2914 ? -arg0 + class95.field1247 : arg0, (byte) -113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2913) {
                for (int var11 = 0; ~var11 > ~class561.field7319; ++var11) {
                    var8[var11] = var5[-var11 + class337.field4356];
                    var9[var11] = var6[class337.field4356 - var11];
                    var10[var11] = var7[-var11 + class337.field4356];
                }
            } else {
                for (int var12 = 0; class561.field7319 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        int var13 = -98 % ((-14 - arg1) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V", line = 166)
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V", line = 170)
    public static void method1410(int arg0) {
        field2917 = null;
        int var1 = -61 % ((-29 - arg0) / 55);
        field2911 = null;
        field2915 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BLlj;)I", line = 187)
    public static final int method1411(byte arg0, class6 arg1) {
        if (arg0 < 54) {
            method1410(-57);
        }
        ++field2912;
        if (class6.field41 != arg1) {
            if (class6.field46 != arg1) {
                if (class6.field47 != arg1) {
                    if (class6.field48 != arg1) {
                        if (class6.field49 != arg1) {
                            if (class6.field50 != arg1) {
                                if (class6.field51 == arg1) {
                                    return 5131;
                                } else if (class6.field52 == arg1) {
                                    return 5126;
                                } else {
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 5125;
                            }
                        } else {
                            return 5123;
                        }
                    } else {
                        return 5121;
                    }
                } else {
                    return 5124;
                }
            } else {
                return 5122;
            }
        } else {
            return 5120;
        }
    }

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "(B)V", line = 229)
    public static final void method1412(byte arg0) {
        class386.method2199(class655.field9114, false);
        ++field2910;
        ++class49.field685;
        if (class299.field3907 && class659.field9179) {
            int var1 = class691.field9440.method2214(-2703);
            if (arg0 < 0) {
                method1409((byte) 96);
            }
            int var2 = class691.field9440.method2208(30114);
            int var3 = var2 - class576.field7845;
            int var4 = var1 - class429.field5554;
            if (~var4 > ~class11.field119) {
                var4 = class11.field119;
            }
            if (var3 < class24.field263) {
                var3 = class24.field263;
            }
            if (~(class11.field119 + class323.field4197.field6372) > ~(class655.field9114.field6372 + var4)) {
                var4 = class11.field119 - class655.field9114.field6372 + class323.field4197.field6372;
            }
            if (~(class655.field9114.field6224 + var3) < ~(class24.field263 + class323.field4197.field6224)) {
                var3 = -class655.field9114.field6224 + class24.field263 + class323.field4197.field6224;
            }
            int var5 = -class11.field119 + var4 + class323.field4197.field6317;
            int var6 = -class24.field263 + class323.field4197.field6356 + var3;
            if (!class691.field9440.method2672((byte) -95)) {
                if (!class347.field4428) {
                    if ((class457.field5994 == 1 || class52.method461(false)) && ~class291.field3758 < -3) {
                        class385.method2193(class570.field7438 + class429.field5554, (byte) 33, class576.field7845 + class266.field3565);
                    } else if (class185.method1233(-67)) {
                        class385.method2193(class570.field7438 + class429.field5554, (byte) 75, class576.field7845 - -class266.field3565);
                    }
                } else {
                    class695.method3778((byte) 22);
                    if (class655.field9114.field6343 != null) {
                        class155 var7 = new class155();
                        var7.field1962 = class655.field9114.field6343;
                        var7.field1969 = var6;
                        var7.field1967 = class377.field4835;
                        var7.field1970 = var5;
                        var7.field1968 = class655.field9114;
                        class709.method3885(var7);
                    }
                    if (class377.field4835 != null && client.method700(class655.field9114) != null) {
                        class478.method2650(class377.field4835, (byte) -68, class655.field9114);
                    }
                }
                class655.field9114 = null;
            } else {
                if (class49.field685 > class655.field9114.field6250) {
                    int var8 = -class570.field7438 + var4;
                    int var9 = var3 - class266.field3565;
                    if (~var8 < ~class655.field9114.field6355 || var8 < -class655.field9114.field6355 || ~var9 < ~class655.field9114.field6355 || var9 < -class655.field9114.field6355) {
                        class347.field4428 = true;
                    }
                }
                if (class655.field9114.field6348 != null && class347.field4428) {
                    class155 var10 = new class155();
                    var10.field1970 = var5;
                    var10.field1962 = class655.field9114.field6348;
                    var10.field1969 = var6;
                    var10.field1968 = class655.field9114;
                    class709.method3885(var10);
                }
            }
        } else {
            if (~class49.field685 < -2) {
                class655.field9114 = null;
            }
        }
    }
}
