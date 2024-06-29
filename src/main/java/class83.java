import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class83 extends class37 {

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lsc;")
    public static class173 field1920;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public static void method627(boolean arg0) {
        if (!arg0) {
            field1920 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class83() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1917;
        if (arg1 < 5) {
            return null;
        } else {
            int[][] var3 = super.field832.method653(-30711, arg0);
            if (super.field832.field1978) {
                int[] var4 = this.method369(2, arg0, (byte) 127);
                int[][] var5 = this.method370(arg0, 0, 3);
                int[][] var6 = this.method370(arg0, 1, 3);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var5[1];
                int[] var10 = var5[2];
                int[] var11 = var3[2];
                int[] var12 = var5[0];
                int[] var13 = var6[1];
                int[] var14 = var6[2];
                int[] var15 = var6[0];
                for (int var16 = 0; ~var16 > ~class72.field1719; ++var16) {
                    int var17 = var4[var16];
                    if (var17 != 4096) {
                        if (var17 != 0) {
                            int var18 = 4096 - var17;
                            var7[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                            var8[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                            var11[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                        } else {
                            var7[var16] = var15[var16];
                            var8[var16] = var13[var16];
                            var11[var16] = var14[var16];
                        }
                    } else {
                        var7[var16] = var12[var16];
                        var8[var16] = var9[var16];
                        var11[var16] = var10[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            super.field825 = arg2.method221(-125) == 1;
        }
        ++field1919;
        if (arg1 != 1) {
            method628(-87);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1916;
        if (arg0 != 75) {
            field1921 = 19;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 127);
            int[] var5 = this.method369(1, arg1, (byte) 125);
            int[] var6 = this.method369(2, arg1, (byte) 127);
            for (int var7 = 0; var7 < class72.field1719; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public static final void method628(int arg0) {
        class137.method937(class181.field3694, (byte) -85);
        ++field1918;
        ++class178.field3662;
        if (class127.field2758 && class200.field4006) {
            if (arg0 < 1) {
                method627(true);
            }
            int var1 = class17.field329;
            int var2 = var1 - class166.field3354;
            if (~var2 > ~class51.field1144) {
                var2 = class51.field1144;
            }
            int var3 = class98.field2168;
            if (~(class181.field3694.field1249 + var2) < ~(class51.field1144 - -class95.field2101.field1249)) {
                var2 = class51.field1144 - -class95.field2101.field1249 + -class181.field3694.field1249;
            }
            int var4 = var3 - class161.field3280;
            int var5 = var2 - class3.field51;
            int var6 = class181.field3694.field1279;
            if (~var4 > ~class121.field2663) {
                var4 = class121.field2663;
            }
            int var7 = var2 - -class95.field2101.field1332 + -class51.field1144;
            if (~(class181.field3694.field1329 + var4) < ~(class121.field2663 + class95.field2101.field1329)) {
                var4 = class121.field2663 + class95.field2101.field1329 - class181.field3694.field1329;
            }
            int var8 = var4 - class105.field2349;
            int var9 = class95.field2101.field1310 + var4 + -class121.field2663;
            if (class181.field3694.field1317 < class178.field3662 && (var6 < var5 || -var6 > var5 || ~var8 < ~var6 || ~(-var6) < ~var8)) {
                class15.field277 = true;
            }
            if (class181.field3694.field1276 != null && class15.field277) {
                class200 var10 = new class200();
                var10.field3998 = var9;
                var10.field4007 = var7;
                var10.field3995 = class181.field3694;
                var10.field4010 = class181.field3694.field1276;
                class1.method2(var10, (byte) -107);
            }
            if (class166.field3364 == 0) {
                if (!class15.field277) {
                    if ((~class210.field4161 == -2 || class163.method1082(class59.field1469 + -1, (byte) 46)) && ~class59.field1469 < -3) {
                        class78.method592(true);
                    } else if (~class59.field1469 < -1) {
                        class21.method189(false, class59.field1469 - 1);
                    }
                } else {
                    if (class181.field3694.field1294 != null) {
                        class200 var11 = new class200();
                        var11.field4004 = class122.field2676;
                        var11.field3998 = var9;
                        var11.field4007 = var7;
                        var11.field4010 = class181.field3694.field1294;
                        var11.field3995 = class181.field3694;
                        class1.method2(var11, (byte) -45);
                    }
                    if (class122.field2676 != null && class80.method602(class181.field3694, (byte) -90) != null) {
                        class1.field11.method659(10, true);
                        class1.field11.method249(class122.field2676.field1383, 103);
                        class1.field11.method254(true, class181.field3694.field1383);
                        class1.field11.method228(class181.field3694.field1339, 15358);
                        class1.field11.method228(class122.field2676.field1339, 15358);
                        ++class118.field2625;
                    }
                }
                class181.field3694 = null;
            }
        } else {
            if (class178.field3662 > 1) {
                class181.field3694 = null;
            }
        }
    }
}
