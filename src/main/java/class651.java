import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class651 extends class386 {

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    private int field9217 = 32768;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "[I")
    public static int[] field9218 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method3663(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9213;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        if (arg0 == 8) {
            class359.method2018(class678.field9722[arg4], arg1 - -arg2, arg0 ^ -114, arg3, arg1 - arg2);
            int var8 = -1;
            while (var5 < var6) {
                var8 += 2;
                ++var5;
                var7 += var8;
                if (var7 >= 0) {
                    --var6;
                    var7 -= var6 << 1;
                    int[] var9 = class678.field9722[arg4 + var6];
                    int[] var10 = class678.field9722[-var6 + arg4];
                    int var11 = arg1 - -var5;
                    int var12 = arg1 - var5;
                    class359.method2018(var9, var11, 69, arg3, var12);
                    class359.method2018(var10, var11, arg0 ^ 120, arg3, var12);
                }
                int var13 = arg1 + var6;
                int var14 = arg1 - var6;
                int[] var15 = class678.field9722[arg4 + var5];
                int[] var16 = class678.field9722[-var5 + arg4];
                class359.method2018(var15, var13, -108, arg3, var14);
                class359.method2018(var16, var13, arg0 ^ 109, arg3, var14);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V", line = 55)
    public static final void method3664(byte arg0) {
        ++field9212;
        class38 var1 = null;
        try {
            var1 = class248.method1518("2", true);
            class389 var2 = new class389(3 - -(class488.field6827 * 6));
            var2.method2281((byte) 58, 1);
            var2.method2261((byte) 40, class488.field6827);
            if (arg0 > -73) {
                return;
            }
            for (int var3 = 0; class415.field5874.length > var3; ++var3) {
                if (class25.field591[var3]) {
                    var2.method2261((byte) 79, var3);
                    var2.method2233((byte) -122, class415.field5874[var3]);
                }
            }
            var1.method441(0, var2.field5205, var2.field5195, 3763);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method442((byte) -72);
            }
        } catch (Exception var4) {
        }
        class1.field5 = class301.method1787((byte) -40);
        class62.field999 = false;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[I", line = 103)
    public final int[] method359(int arg0, int arg1) {
        ++field9214;
        int[] var3 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int[] var4 = this.method2212((byte) 99, arg0, 1);
            int[] var5 = this.method2212((byte) 76, arg0, 2);
            for (int var6 = 0; ~var6 > ~class599.field8643; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field9217 >> 12;
                int var9 = class197.field2400[var7] * var8 >> 12;
                int var10 = class276.field3778[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class276.field3782;
                int var12 = class206.field2474 & arg0 - -(var10 >> 12);
                int[] var13 = this.method2212((byte) -128, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        int var14 = -106 % ((arg1 - 13) / 40);
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V", line = 150)
    public class651() {
        super(3, false);
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V", line = 156)
    public static void method3665(int arg0) {
        if (arg0 != 0) {
            method3666((byte) 8);
        }
        field9218 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLun;)V", line = 167)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field5145 = ~arg2.method2229(255) == -2;
            }
        } else {
            this.field9217 = arg2.method2260(-103) << 4;
        }
        ++field9216;
        if (arg1 <= 111) {
            this.field9217 = -100;
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(B)V", line = 204)
    public static final void method3666(byte arg0) {
        ++field9221;
        if (arg0 == -69) {
            class394.field5564 = 0;
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class69.field1062[var1] = null;
                class468.field6541[var1] = 1;
                class195.field2364[var1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I", line = 226)
    public final int[][] method645(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            ++field9211;
            int[][] var3 = super.field5148.method1054(arg0, arg1 + 16254);
            if (super.field5148.field2041) {
                int[] var4 = this.method2212((byte) -10, arg0, 1);
                int[] var5 = this.method2212((byte) 99, arg0, 2);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~class599.field8643 < ~var9; ++var9) {
                    int var10 = (var4[var9] * 255 & 1045292) >> 12;
                    int var11 = var5[var9] * this.field9217 >> 12;
                    int var12 = class197.field2400[var10] * var11 >> 12;
                    int var13 = class276.field3778[var10] * var11 >> 12;
                    int var14 = class276.field3782 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg0 & class206.field2474;
                    int[][] var16 = this.method2211(var15, 0, -111);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 287)
    public final void method358(int arg0) {
        class265.method1609((byte) -64);
        ++field9219;
        if (arg0 <= 0) {
            this.field9217 = -79;
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V", line = 301)
    public static final void method3667(int arg0) {
        if (class393.field5309 < 1024.0F) {
            class393.field5309 = 1024.0F;
        }
        ++field9220;
        if (class393.field5309 > 3072.0F) {
            class393.field5309 = 3072.0F;
        }
        while (class115.field1495 >= 16384.0F) {
            class115.field1495 -= 16384.0F;
        }
        while (class115.field1495 < 0.0F) {
            class115.field1495 += 16384.0F;
        }
        int var1 = class281.field3814 >> 9;
        int var2 = class622.field8905 >> 9;
        int var3 = class589.method3416(class281.field3814, -75, class617.field8853, class622.field8905);
        int var4 = 0;
        if (arg0 == -23378) {
            if (~var1 < -4 && var2 > 3 && ~var1 > ~(class473.field6604 - 4) && ~var2 > ~(class205.field2465 - 4)) {
                for (int var5 = var1 + -4; ~(var1 + 4) <= ~var5; ++var5) {
                    for (int var6 = var2 + -4; ~var6 >= ~(var2 + 4); ++var6) {
                        int var7 = class617.field8853;
                        if (var7 < 3 && class626.method3602(var5, var6, (byte) 86)) {
                            ++var7;
                        }
                        int var8 = 0;
                        if (class75.field1116.field5720 != null && class75.field1116.field5720[var7] != null) {
                            var8 = (255 & class75.field1116.field5720[var7][var5][var6]) * 8;
                        }
                        if (class155.field1899 != null && class155.field1899[var7] != null) {
                            int var9 = var3 + var8 + -class155.field1899[var7].method437(89, var6, var5);
                            if (~var9 < ~var4) {
                                var4 = var9;
                            }
                        }
                    }
                }
            }
            int var10 = (var4 >> 2) * 1536;
            if (~var10 < -786433) {
                var10 = 786432;
            }
            if (var10 < 262144) {
                var10 = 262144;
            }
            if (~var10 >= ~class499.field6974) {
                if (var10 < class499.field6974) {
                    class499.field6974 += (-class499.field6974 + var10) / 80;
                    return;
                }
            } else {
                class499.field6974 += (-class499.field6974 + var10) / 24;
            }
        }
    }
}
