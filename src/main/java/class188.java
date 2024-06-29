import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class188 extends class330 {

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    private int field2344 = 4;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    private int field2343 = 4;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "[I")
    public static int[] field2346 = new int[64];

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "Lqk;")
    public static class1 field2345 = new class1(22, 7);

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "[F")
    public static float[] field2349 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "J")
    public static long field2351 = 1L;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 3)
    public static final void method1174(int arg0) {
        class387.field5519.method314(-2);
        if (arg0 != 16) {
            field2351 = -61L;
        }
        ++field2338;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lsha;II)Ljava/lang/String;", line = 19)
    public static final String method1175(class115 arg0, int arg1, int arg2) {
        ++field2339;
        if (arg1 != -1) {
            return null;
        } else if (!client.method779(arg0).method1108(-112857776, arg2) && arg0.field1477 == null) {
            return null;
        } else if (arg0.field1421 != null && ~arg0.field1421.length < ~arg2 && arg0.field1421[arg2] != null && ~arg0.field1421[arg2].trim().length() != -1) {
            return arg0.field1421[arg2];
        } else {
            return class635.field8860 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V", line = 42)
    public static final void method1176(int arg0, int arg1) {
        if (arg0 != 3) {
            method1177((byte) -128);
        }
        ++field2341;
        class444.field6150 = arg1;
        class226.field3432.method314(-2);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[I", line = 56)
    public final int[][] method537(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2348;
            int[][] var3 = super.field4621.method1597(arg1, true);
            if (super.field4621.field3510) {
                int var4 = class80.field901 / this.field2344;
                int var5 = class291.field4285 / this.field2343;
                int[][] var6;
                if (~var5 >= -1) {
                    var6 = this.method2082(0, 0, 124);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method2082(class291.field4285 * var7 / var5, 0, arg0 ^ 125);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class80.field901 < ~var14; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class80.field901 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)I", line = 127)
    public static final int method1177(byte arg0) {
        ++field2352;
        if (class81.field906 == null) {
            if (!class263.field3850 && class99.field1151 != null) {
                return class99.field1151.field2182;
            }
            int var1 = class205.field2881.method354((byte) -20);
            int var2 = class205.field2881.method351(-25269);
            if (class48.field577) {
                if (~var1 < ~class689.field9609 && ~(class689.field9609 - -class788.field10819) < ~var1) {
                    int var3 = -1;
                    for (int var4 = 0; class367.field5278 > var4; ++var4) {
                        if (class474.field6578) {
                            int var8 = var4 * 16 + class221.field3026 + 33;
                            if (~(var8 + -13) > ~var2 && var2 <= var8 + 3) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + class221.field3026 + 31;
                            if (~(var9 + -13) > ~var2 && var9 + 3 >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class384 var6 = new class384(class362.field5218);
                        for (class498 var7 = (class498) var6.method2388(109); var7 != null; var7 = (class498) var6.method2390(102)) {
                            if (~var3 == ~(var5++)) {
                                return ((class171) var7.field6826.field2266.field591).field2182;
                            }
                        }
                    }
                } else if (class694.field9684 != null && var1 > class49.field587 && ~var1 > ~(class49.field587 + class339.field4914)) {
                    int var10 = -1;
                    for (int var11 = 0; ~class694.field9684.field6833 < ~var11; ++var11) {
                        if (class474.field6578) {
                            int var15 = var11 * 16 + class79.field894 + 33;
                            if (var2 > var15 - 13 && ~var2 >= ~(var15 - -3)) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = var11 * 16 + class79.field894 + 31;
                            if (~var2 < ~(var16 + -13) && var16 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (~var10 != 0) {
                        int var12 = 0;
                        class384 var13 = new class384(class694.field9684.field6826);
                        for (class171 var14 = (class171) var13.method2388(-125); var14 != null; var14 = (class171) var13.method2390(-85)) {
                            if (var10 == var12++) {
                                return var14.field2182;
                            }
                        }
                    }
                }
            } else if (~var1 < ~class689.field9609 && ~var1 > ~(class788.field10819 + class689.field9609)) {
                int var17 = -1;
                for (int var18 = 0; var18 < class640.field8992; ++var18) {
                    if (!class474.field6578) {
                        int var22 = (-var18 + -1 + class640.field8992) * 16 + (class221.field3026 - -31);
                        if (~(var22 - 13) > ~var2 && ~var2 >= ~(var22 - -3)) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = class221.field3026 + 33 - -((-var18 + class640.field8992 + -1) * 16);
                        if (~(var23 + -13) > ~var2 && ~var2 >= ~(var23 + 3)) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class395 var20 = new class395(class646.field9038);
                    for (class171 var21 = (class171) var20.method2437(1316); var21 != null; var21 = (class171) var20.method2439(5154)) {
                        if (~(var19++) == ~var17) {
                            return var21.field2182;
                        }
                    }
                }
            }
        }
        if (arg0 > -94) {
            method1176(31, -104);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lgga;IB)V", line = 324)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field2347;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2343 = arg0.method3013(-101);
            }
        } else {
            this.field2344 = arg0.method3013(33);
        }
        int var5 = -116 % ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z", line = 361)
    public static final boolean method1178(int arg0) {
        ++field2350;
        return arg0 < 23 ? true : class246.field3642;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)[I", line = 372)
    public final int[] method464(int arg0, boolean arg1) {
        ++field2342;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            this.field2343 = -94;
        }
        if (super.field4630.field5704) {
            int var4 = class80.field901 / this.field2344;
            int var5 = class291.field4285 / this.field2343;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2084(0, class291.field4285 * var6 / var5, (byte) 83);
            } else {
                var7 = this.method2084(0, 0, (byte) -120);
            }
            for (int var8 = 0; ~class80.field901 < ~var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class80.field901 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "(I)V", line = 430)
    public static void method1179(int arg0) {
        int var1 = 38 % ((10 - arg0) / 40);
        field2346 = null;
        field2349 = null;
        field2345 = null;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 443)
    public class188() {
        super(1, false);
    }
}
