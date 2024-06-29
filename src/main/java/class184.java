import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class184 extends class56 {

    @OriginalMember(owner = "client!c", name = "F", descriptor = "Lgda;")
    public static class53 field2489 = new class53(21, 3);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lms;")
    public static class758 field2497 = new class758();

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lfp;")
    public static class323 field2495;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "[Lkaa;")
    private class46[] field2496;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)I")
    public static final int method1162(int arg0, byte arg1) {
        ++field2499;
        return arg1 != -128 ? 69 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field2498;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            method1164((byte) -5);
        }
        if (super.field673.field8073) {
            this.method1166(-1, super.field673.method3269(arg1));
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Lhha;")
    public static final class519 method1163(boolean arg0) {
        ++field2491;
        if (arg0) {
            field2493 = -119;
        }
        return ~class758.field10532 == -1 ? new class519() : class496.field7140[--class758.field10532];
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        field2489 = null;
        field2497 = null;
        field2495 = null;
        if (arg0 < 20) {
            field2493 = -16;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[[I")
    public final int[][] method5(int arg0, int arg1) {
        ++field2488;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field668.method3009(0, arg0);
            if (super.field668.field7292) {
                int var4 = class328.field4576;
                int var5 = class226.field3050;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field668.method3008(1);
                this.method1166(arg1 + -2, var6);
                for (int var8 = 0; var8 < class226.field3050; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; var14 < class328.field4576; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class286.method1877(var15 << 4, 4080);
                        var12[var14] = class286.method1877(var15, 65280) >> 4;
                        var11[var14] = class286.method1877(var15, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2496 = new class46[arg1.method3750((byte) 35)];
            for (int var4 = 0; ~var4 > ~this.field2496.length; ++var4) {
                int var5 = arg1.method3750((byte) 35);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2496[var4] = class188.method1182((byte) 57, arg1);
                            }
                        } else {
                            this.field2496[var4] = class601.method3371(arg1, (byte) 110);
                        }
                    } else {
                        this.field2496[var4] = class471.method2811(arg1, (byte) -115);
                    }
                } else {
                    this.field2496[var4] = class146.method1009(arg1, (byte) 111);
                }
            }
        } else if (~arg2 == -2) {
            super.field674 = arg1.method3750((byte) 35) == 1;
        }
        ++field2492;
        if (arg0 != 3731) {
            field2489 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public static final void method1165(int arg0) {
        ++field2490;
        try {
            if (class469.field6659 == arg0) {
                int var1 = class165.field2262.method1394(-108);
                if (var1 > 0 && class165.field2262.method1374((byte) 114)) {
                    int var2 = var1 - class681.field9343;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class165.field2262.method1391(var2, -111);
                    return;
                }
                class165.field2262.method1364(arg0 + -123);
                class165.field2262.method1362(26920);
                class326.field4519 = null;
                class515.field7345 = null;
                if (class226.field3049 != null) {
                    class469.field6659 = 2;
                } else {
                    class469.field6659 = 0;
                }
            }
            if (class469.field6659 == 3) {
                int var3 = class165.field2262.method1394(-80);
                if (class444.field6316 > var3 && class165.field2262.method1374((byte) 114)) {
                    int var4 = class98.field1182 + var3;
                    if (var4 > class444.field6316) {
                        var4 = class444.field6316;
                    }
                    class165.field2262.method1391(var4, -59);
                } else {
                    class469.field6659 = 0;
                    class98.field1182 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class165.field2262.method1364(87);
            class515.field7345 = null;
            class469.field6659 = 0;
            class326.field4519 = null;
            class561.field7881 = null;
            class226.field3049 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[[I)V")
    private final void method1166(int arg0, int[][] arg1) {
        ++field2487;
        int var3 = class328.field4576;
        if (arg0 == -1) {
            int var4 = class226.field3050;
            class14.method95(arg1, 108);
            class385.method2436(class445.field6318, class636.field8759, 0, 0, (byte) 37);
            if (this.field2496 != null) {
                for (int var5 = 0; ~var5 > ~this.field2496.length; ++var5) {
                    class46 var6 = this.field2496[var5];
                    int var7 = var6.field549;
                    int var8 = var6.field545;
                    if (~var7 <= -1) {
                        if (var8 < 0) {
                            var6.method301(false, var4, var3);
                        } else {
                            var6.method300(var3, -113, var4);
                        }
                    } else if (~var8 <= -1) {
                        var6.method303(var4, -12939, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static final void method1167(byte arg0) {
        class470.field6672.method789((byte) -63);
        ++field2494;
        class181.field2416.method2185((byte) -93);
        class606.field8530.method2003(true);
        class612.field8588.method555((byte) 73);
        class231.field3110.method2801(true);
        class682.field9361.method3417(137);
        class343.field4785.method3523(true);
        class220.field2879.method978((byte) 78);
        class130.field1568.method176(arg0 ^ 61);
        class472.field6696.method4046(15);
        class200.field2638.method3507(-123);
        class48.field564.method1411(2060105417);
        class569.field8079.method3085((byte) -86);
        class70.field890.method1206(35);
        class605.field8497.method155(0);
        class192.field2556.method1975(102);
        class6.field64.method3776(true);
        class538.field7542.method201(arg0 + 194);
        if (arg0 != -73) {
            method1162(-45, (byte) 78);
        }
        class30.field404.method3842(0);
        class116.field1417.method1355(200);
        class29.method170(true);
        class115.method801(0);
        class745.method4148((byte) -118);
        class385.method2438((byte) -11);
        if (class408.field5781 != class277.field3922) {
            for (int var1 = 0; var1 < class739.field10278.length; ++var1) {
                class739.field10278[var1] = null;
            }
            class583.field8208 = 0;
        }
        class748.method4156(0);
        class470.method2806(93);
        class470.method2808(true);
        class158.method1055(0);
        class408.method2524(arg0 ^ -29);
        class241.field3229.method4023((byte) -33);
        class268.field3831.method376();
        class355.method2287(true);
        class415.method2551(0);
        class210.field2772.method2081(-96);
        class608.field8562.method2081(-96);
        class580.field8187.method2081(arg0 ^ 47);
        class705.field9810.method2081(-84);
        class727.field10173.method2081(-94);
        class299.field4218.method2081(-124);
        class587.field8276.method2081(-97);
        class626.field8695.method2081(-83);
        class374.field5245.method2081(-82);
        class549.field7671.method2081(-117);
        class228.field3062.method2081(-84);
        class120.field1447.method2081(-94);
        class164.field2255.method2081(-94);
        class405.field5725.method2081(-103);
        class530.field7473.method2081(-106);
        field2495.method2081(-83);
        class236.field3172.method2081(-93);
        class211.field2784.method2081(-115);
        class360.field5104.method2081(-97);
        class48.field567.method2081(arg0 ^ 43);
        class476.field6761.method2081(-85);
        class119.field1444.method2081(arg0 ^ 60);
        class467.field6617.method2081(-94);
        class662.field9065.method2081(-127);
        class318.field4413.method2081(-104);
        class511.field7311.method2081(-103);
        class52.field592.method2081(-85);
        class606.field8527.method2081(-83);
        class456.field6432.method2081(-124);
        class488.field6898.method2081(-89);
        class571.field8097.method2081(-100);
        class452.field6395.method2081(arg0 + -35);
        class94.field1106.method2081(-84);
        class180.field2406.method4023((byte) -128);
        class272.field3890.method4023((byte) -11);
        class378.field5300.method4023((byte) -126);
        class723.field10076.method4023((byte) -127);
    }
}
