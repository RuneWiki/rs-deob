import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class358 extends class397 {

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    private int field5304 = 32768;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "Lum;")
    public static class347 field5308 = new class347();

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "Z")
    public static boolean field5311 = true;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "Liu;")
    public static class390 field5310 = new class390(52, 7);

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "Lak;")
    public static class222 field5313 = new class222(13, 0, 1, 0);

    @OriginalMember(owner = "client!ur", name = "Z", descriptor = "Z")
    public static boolean field5314 = true;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
    public static int field5309;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ur", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field5315;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "[[[Lhg;")
    public static class468[][][] field5312;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
    public static void method2172(int arg0) {
        field5313 = null;
        field5308 = null;
        field5310 = null;
        if (arg0 == 1046859) {
            field5312 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field5307;
        int[] var3 = super.field5854.method465(arg1, 105);
        if (super.field5854.field991) {
            int[] var4 = this.method2376(94, 1, arg1);
            int[] var5 = this.method2376(93, 2, arg1);
            for (int var6 = 0; class164.field2152 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field5304 >> 12;
                int var9 = class150.field1944[var7] * var8 >> 12;
                int var10 = class348.field5044[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class107.field1429;
                int var12 = class340.field4948 & (var10 >> 12) + arg1;
                int[] var13 = this.method2376(arg0 ^ -780833141, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 != -780833076) {
            field5313 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
    public static final void method2173() {
        for (int var0 = 0; var0 < class387.field5731; ++var0) {
            if (!class415.field6147[var0]) {
                class373 var1 = class76.field1084[var0];
                class472 var2 = var1.field5595;
                int var3 = var1.field5590;
                int var4 = var2.method2764(false) - class170.field2281;
                int var5 = (var4 * 2 >> class41.field628) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2759(123) - var4 >> class41.field628;
                int var9 = var2.method2761(0) - var4 >> class41.field628;
                int var10 = var2.method2761(0) + var4 >> class41.field628;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class98.field1339) {
                    var10 = class98.field1339 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field5592[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class282.field4031) {
                        var16 = class282.field4031 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class210 var19 = class124.method701(var3, var17, var11, field5315 != null ? field5315 : (field5315 = method2176("jo")));
                        if (var19 != null && var19.field2974 != 0) {
                            if (var19.field2974 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field5592[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field5592[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field5592[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field5592[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class415.field6147[var0] = true;
                class311.field4527[var3].method854(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2174(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            if (~arg3 <= ~class7.field131 && class92.field1252 >= arg3) {
                int var5 = class372.method2266(class473.field6839, -20228, class63.field933, arg0);
                int var6 = class372.method2266(class473.field6839, -20228, class63.field933, arg2);
                class192.method1209(true, arg3, arg1, var6, var5);
            }
            ++field5301;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field5859 = arg2.method941((byte) 124) == 1;
            }
        } else {
            this.field5304 = arg2.method993((byte) -36) << 4;
        }
        if (arg1 != 80) {
            method2175((byte) -21, -41);
        }
        ++field5305;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field5303;
        if (arg0 <= 81) {
            field5311 = false;
        }
        int[][] var3 = super.field5848.method1692(arg1, 92);
        if (super.field5848.field3939) {
            int[] var4 = this.method2376(124, 1, arg1);
            int[] var5 = this.method2376(72, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class164.field2152; ++var9) {
                int var10 = (1046859 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field5304 >> 12;
                int var12 = class150.field1944[var10] * var11 >> 12;
                int var13 = class348.field5044[var10] * var11 >> 12;
                int var14 = class107.field1429 & (var12 >> 12) + var9;
                int var15 = class340.field4948 & arg1 - -(var13 >> 12);
                int[][] var16 = this.method2377(var15, -74, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 == 255) {
            ++field5302;
            class270.method1651((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class358() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(BI)Z")
    public static final boolean method2175(byte arg0, int arg1) {
        ++field5306;
        class483.field7002 = true;
        class176.field2435 = 65535 & arg1 + 1;
        if (arg0 >= -68) {
            method2174(-10, -20, -53, 63, false);
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2176(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
