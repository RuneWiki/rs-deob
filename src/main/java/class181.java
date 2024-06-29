import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class181 extends class288 {

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    private int field2907 = 16;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    private int field2909 = 4096;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    private int field2916 = 0;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    private int field2917 = 2000;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "[[B")
    public static byte[][] field2914 = new byte[250][];

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static void method1248(int arg0) {
        if (arg0 == -32252) {
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method26(-17, -37);
        }
        ++field2913;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = this.field2909 >> 1;
            int[][] var5 = super.field4609.method583(9115);
            Random var6 = new Random((long) this.field2916);
            for (int var7 = 0; ~var7 > ~this.field2917; ++var7) {
                int var8 = ~this.field2909 < -1 ? this.field2911 - (-class256.method1680(var6, (byte) -90, this.field2909) - -var4) : this.field2911;
                int var9 = (var8 & 4093) >> 4;
                int var10 = class256.method1680(var6, (byte) 126, class186.field2986);
                int var11 = class256.method1680(var6, (byte) -23, class205.field3296);
                int var12 = var10 - -(class272.field4388[var9] * this.field2907 >> 12);
                int var13 = (class50.field709[var9] * this.field2907 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        int var18 = var10;
                        var13 = var17;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = 1024 - (class256.method1680(var6, (byte) -46, 4096) >> 2);
                    int var23 = -var10 + var12;
                    int var24 = -var11 + var13;
                    int var25 = ~var13 >= ~var11 ? -1 : 1;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var26 = 2048 / var23;
                    int var27 = -var23 / 2;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var27 += var24;
                        int var29 = var28 & class34.field422;
                        int var30 = (-var10 + var28) * var26 + var22 + 1024;
                        int var31 = var21 & class144.field2332;
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                        if (var27 > 0) {
                            var21 += var25;
                            var27 += -var23;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2908;
        int var6 = -arg2 + arg1;
        int var7 = arg5 - arg3;
        if (~var7 != -1) {
            if (~var6 == -1) {
                class227.method1498(arg0, arg3, -119, arg2, arg5);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (var7 < 0) {
                    var7 = -var7;
                }
                boolean var8 = ~var7 > ~var6;
                if (var8) {
                    int var9 = arg5;
                    int var10 = arg3;
                    arg5 = arg1;
                    arg3 = arg2;
                    arg2 = var10;
                    arg1 = var9;
                }
                if (~arg3 < ~arg5) {
                    int var11 = arg2;
                    arg2 = arg1;
                    int var12 = arg3;
                    arg3 = arg5;
                    arg5 = var12;
                    arg1 = var11;
                }
                int var13 = arg2;
                if (arg4 <= -54) {
                    int var14 = -arg3 + arg5;
                    int var15 = arg1 - arg2;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    int var16 = arg1 <= arg2 ? -1 : 1;
                    int var17 = -(var14 >> 1);
                    if (!var8) {
                        for (int var18 = arg3; ~var18 >= ~arg5; ++var18) {
                            var17 += var15;
                            class85.field1162[var13][var18] = arg0;
                            if (~var17 < -1) {
                                var17 -= var14;
                                var13 += var16;
                            }
                        }
                    } else {
                        for (int var19 = arg3; ~arg5 <= ~var19; ++var19) {
                            class85.field1162[var19][var13] = arg0;
                            var17 += var15;
                            if (var17 > 0) {
                                var13 += var16;
                                var17 -= var14;
                            }
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class219.method1458(arg0, arg3, arg2, -39, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        class206.method1389(4096);
        ++field2919;
        if (arg0 != -125) {
            this.method26(-66, -59);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1250(byte arg0, String arg1) {
        ++field2912;
        if (class225.field3572 != null && ~arg1.length() != -1) {
            for (int var2 = 0; ~var2 > ~class225.field3572.field1086; ++var2) {
                if (class247.method1630(" ", (byte) 123, "<br>", class225.field3572.field1083[var2]).equals(arg1)) {
                    return var2;
                }
            }
            if (arg0 != 84) {
                method1249(-51, -118, -119, 118, -84, 84);
            }
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field2920;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field2909 = arg0.method1777(-53);
                        }
                    } else {
                        this.field2911 = arg0.method1777(arg1 ^ 42);
                    }
                } else {
                    this.field2907 = arg0.method1779(-118);
                }
            } else {
                this.field2917 = arg0.method1777(-121);
            }
        } else {
            this.field2916 = arg0.method1779(-56);
        }
        if (arg1 != -19) {
            this.method20((class264) null, (byte) -128, -80);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)Lhi;")
    public static final class264 method1251(boolean arg0) {
        class264 var1 = new class264(34);
        ++field2910;
        var1.method1757(11, (byte) -128);
        var1.method1757(class257.field4109, (byte) 112);
        var1.method1757(!class185.field2970 ? 0 : 1, (byte) 125);
        var1.method1757(class38.field468 ? 1 : 0, (byte) 105);
        var1.method1757(!class205.field3279 ? 0 : 1, (byte) 126);
        var1.method1757(class168.field2735 ? 1 : 0, (byte) -117);
        var1.method1757(class183.field2928 ? 1 : 0, (byte) 0);
        var1.method1757(!class96.field1442 ? 0 : 1, (byte) -52);
        var1.method1757(class9.field138 ? 1 : 0, (byte) 108);
        var1.method1757(!class22.field270 ? 0 : 1, (byte) 127);
        if (arg0) {
            field2914 = null;
        }
        var1.method1757(class96.field1454, (byte) -22);
        var1.method1757(!class28.field339 ? 0 : 1, (byte) -78);
        var1.method1757(!class133.field2207 ? 0 : 1, (byte) 124);
        var1.method1757(class235.field3744 ? 1 : 0, (byte) -81);
        var1.method1757(class239.field3819, (byte) 125);
        var1.method1757(!class195.field3161 ? 0 : 1, (byte) 116);
        var1.method1757(class153.field2469, (byte) 124);
        var1.method1757(class92.field1319, (byte) -71);
        var1.method1757(class45.field548, (byte) 108);
        var1.method1761(class285.field4549, 4334);
        var1.method1761(class283.field4508, 4334);
        var1.method1757(class4.method29(), (byte) 109);
        var1.method1789((byte) -38, class71.field981);
        var1.method1757(class207.field3332, (byte) 127);
        var1.method1757(!class119.field2006 ? 0 : 1, (byte) 118);
        var1.method1757(class107.field1867 ? 1 : 0, (byte) 115);
        var1.method1757(class105.field1819, (byte) 113);
        var1.method1757(class79.field1093 ? 1 : 0, (byte) -27);
        var1.method1757(class94.field1376 ? 1 : 0, (byte) -120);
        return var1;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
    public static final void method1252(byte arg0) {
        class122.field2046 = null;
        class265.field4259 = null;
        class116.field1983 = null;
        class168.field2733 = null;
        if (arg0 < 95) {
            field2914 = null;
        }
        class266.field4321 = null;
        class131.field2189 = null;
        class109.field1896 = null;
        class161.field2624 = null;
        class197.field3178 = null;
        class281.field4501 = null;
        ++field2915;
        class150.field2411 = null;
        class279.field4465 = null;
    }
}
