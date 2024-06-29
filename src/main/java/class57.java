import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class57 extends class573 {

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    private int field1317 = -1;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field1316 = 1406;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "[I")
    public static int[] field1327 = new int[25];

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "[I")
    public int[] field1323;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "(I)[Lqfa;")
    public static final class85[] method669(int arg0) {
        if (arg0 != 25) {
            field1327 = null;
        }
        ++field1322;
        return new class85[] { class32.field953, class603.field8670, class66.field1443, class518.field7308, class479.field6877, class136.field2404, class167.field2774, class30.field950, class5.field480, class439.field6326, class334.field4950, class292.field4384, class704.field9894, class2.field377, class698.field9824, class177.field2891, class243.field3673, class607.field8835, class198.field3078, class127.field2325, class98.field1749, class629.field9069, class102.field1811, class217.field3301, class108.field1860, class550.field7801, class155.field2615, class177.field2886, class417.field6024, class514.field7255, class672.field9571, class600.field8599, class614.field8930, class441.field6344, class666.field9549, class459.field6550, class290.field4366, class636.field9174, class577.field8395, class178.field2897, class580.field8418, class77.field1563, class341.field5068, class266.field3943, class44.field1101, class609.field8866, class423.field6121, class50.field1174, class694.field9766, class696.field9797, class317.field4662, class228.field3395, class680.field9647, class515.field7290, class8.field524, class319.field4697, class612.field8914, class264.field3866, class156.field2663, class49.field1163, class645.field9296, class435.field6292, class9.field544, class631.field9087, class343.field5106, class547.field7775, class388.field5673, class27.field918, class268.field3975, class703.field9888, class350.field5257, class573.field8338, class219.field3325, class301.field4479, class467.field6617, class328.field4815, class315.field4651, class175.field2882, class400.field5810, class387.field5666, class118.field2119, class161.field2719, class324.field4756, class248.field3728, class168.field2799, class342.field5083, class438.field6319, class164.field2748, class475.field6784, class272.field4072, class485.field6946, class137.field2425, class78.field1568, class127.field2311, class637.field9181, class112.field2015, class39.field1061, class487.field6981, class70.field1478, class37.field1049, class323.field4738, class84.field1605, class605.field8795, class158.field2699, class454.field6481, class646.field9310, class222.field3348, class507.field7184, class607.field8841, class395.field5773, class583.field8435, class185.field2975, class457.field6508, class211.field3232, class225.field3372, class291.field4372, class145.field2520 };
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lbw;I)V")
    public static final void method670(class641 arg0, int arg1) {
        ++field1315;
        int var2 = 0;
        arg0.method3650((byte) 125);
        for (int var3 = 0; var3 < class237.field3520; ++var3) {
            int var15 = class47.field1140[var3];
            if ((class282.field4185[var15] & 1) == 0) {
                if (~var2 < -1) {
                    class282.field4185[var15] = (byte) class2.method189(class282.field4185[var15], 2);
                    --var2;
                } else {
                    int var16 = arg0.method3648(-104, 1);
                    if (var16 == 0) {
                        var2 = class619.method3541(arg0, false);
                        class282.field4185[var15] = (byte) class2.method189(class282.field4185[var15], 2);
                    } else {
                        class168.method1276(arg0, 0, var15);
                    }
                }
            }
        }
        arg0.method3647(-126);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method3650((byte) 47);
            for (int var4 = 0; var4 < class237.field3520; ++var4) {
                int var13 = class47.field1140[var4];
                if (~(1 & class282.field4185[var13]) != -1) {
                    if (var2 > 0) {
                        class282.field4185[var13] = (byte) class2.method189(class282.field4185[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg0.method3648(-104, 1);
                        if (var14 == 0) {
                            var2 = class619.method3541(arg0, false);
                            class282.field4185[var13] = (byte) class2.method189(class282.field4185[var13], 2);
                        } else {
                            class168.method1276(arg0, 0, var13);
                        }
                    }
                }
            }
            arg0.method3647(-49);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method3650((byte) 47);
                for (int var5 = 0; class102.field1807 > var5; ++var5) {
                    int var11 = class363.field5393[var5];
                    if ((class282.field4185[var11] & 1) != 0) {
                        if (var2 > 0) {
                            class282.field4185[var11] = (byte) class2.method189(class282.field4185[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg0.method3648(-83, 1);
                            if (~var12 == -1) {
                                var2 = class619.method3541(arg0, false);
                                class282.field4185[var11] = (byte) class2.method189(class282.field4185[var11], 2);
                            } else if (class675.method3802(arg0, var11, 6)) {
                                class282.field4185[var11] = (byte) class2.method189(class282.field4185[var11], 2);
                            }
                        }
                    }
                }
                arg0.method3647(-48);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method3650((byte) 72);
                    for (int var6 = 0; class102.field1807 > var6; ++var6) {
                        int var9 = class363.field5393[var6];
                        if (~(1 & class282.field4185[var9]) == -1) {
                            if (~var2 < -1) {
                                --var2;
                                class282.field4185[var9] = (byte) class2.method189(class282.field4185[var9], 2);
                            } else {
                                int var10 = arg0.method3648(62, 1);
                                if (var10 == 0) {
                                    var2 = class619.method3541(arg0, false);
                                    class282.field4185[var9] = (byte) class2.method189(class282.field4185[var9], 2);
                                } else if (class675.method3802(arg0, var9, 6)) {
                                    class282.field4185[var9] = (byte) class2.method189(class282.field4185[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method3647(-50);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class102.field1807 = 0;
                        if (arg1 <= 53) {
                            field1327 = null;
                        }
                        class237.field3520 = 0;
                        for (int var7 = 1; ~var7 > -2049; ++var7) {
                            class282.field4185[var7] = (byte) (class282.field4185[var7] >> 1);
                            class602 var8 = class59.field1341[var7];
                            if (var8 != null) {
                                class47.field1140[class237.field3520++] = var7;
                            } else {
                                class363.field5393[class102.field1807++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public final void method671(int arg0) {
        ++field1319;
        if (arg0 != -10208) {
            method669(70);
        }
        super.method671(arg0);
        this.field1323 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)I")
    public final int method672(byte arg0) {
        ++field1318;
        return arg0 <= 125 ? -48 : this.field1317;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public final boolean method673(boolean arg0) {
        ++field1325;
        if (!arg0) {
            this.method442(34, -81);
        }
        if (this.field1323 != null) {
            return true;
        } else if (this.field1317 >= 0) {
            class279 var2 = class533.field7465 >= 0 ? class279.method1841(class220.field3333, class533.field7465, this.field1317) : class279.method1848(class220.field3333, this.field1317);
            var2.method1847();
            this.field1323 = var2.method1842();
            this.field1324 = var2.field4174;
            this.field1321 = var2.field4171;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)[[I")
    public int[][] method442(int arg0, int arg1) {
        if (arg0 > -116) {
            return null;
        } else {
            ++field1320;
            int[][] var3 = super.field8320.method1504(arg1, -2);
            if (super.field8320.field3295 && this.method673(true)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field1324 * (class419.field6037 == this.field1321 ? arg1 : this.field1321 * arg1 / class419.field6037);
                if (~class540.field7555 == ~this.field1324) {
                    for (int var8 = 0; var8 < class540.field7555; ++var8) {
                        int var9 = this.field1323[var7++];
                        var6[var8] = class481.method2919(var9, 255) << 4;
                        var5[var8] = class481.method2919(var9, 65280) >> 4;
                        var4[var8] = class481.method2919(16711680, var9) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~var10 > ~class540.field7555; ++var10) {
                        int var11 = this.field1324 * var10 / class540.field7555;
                        int var12 = this.field1323[var7 + var11];
                        var6[var10] = class481.method2919(4080, var12 << 4);
                        var5[var10] = class481.method2919(var12 >> 4, 4080);
                        var4[var10] = class481.method2919(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "(I)V")
    public static void method674(int arg0) {
        field1327 = null;
        int var1 = -57 / ((21 - arg0) / 45);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.method442(16, 54);
        }
        ++field1326;
        if (~arg1 == -1) {
            this.field1317 = arg0.method723((byte) -25);
        }
    }
}
