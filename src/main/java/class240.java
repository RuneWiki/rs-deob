import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class240 {

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "S")
    public short field3533;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "S")
    public short field3535;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "B")
    public byte field3532;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "Z")
    public boolean field3536;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "S")
    public short field3524;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "B")
    public byte field3526;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field3525 = 0;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "[I")
    public static int[] field3527 = new int[500];

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public static int field3531 = 0;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "Lvo;")
    public static class345 field3534;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "()V", line = 6)
    public static final void method1557() {
        for (int var0 = class415.field5896; var0 < class596.field8626; var0++) {
            for (int var1 = 0; var1 < class33.field474; var1++) {
                for (int var2 = 0; var2 < class687.field9758; var2++) {
                    class293 var3 = class541.field7946[var0][var1][var2];
                    if (var3 != null) {
                        class197 var4 = var3.field4091;
                        class197 var5 = var3.field4095;
                        if (var4 != null && var4.method592(-15258)) {
                            class354.method2140(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method592(-15258)) {
                                class354.method2140(var5, var0, var1, var2, 1, 1);
                                var5.method590(var4, 0, false, class490.field7029, 0, 0, (byte) 75);
                                var5.method585(96);
                            }
                            var4.method585(96);
                        }
                        for (class198 var6 = var3.field4097; var6 != null; var6 = var6.field3078) {
                            class144 var8 = var6.field3085;
                            if (var8 != null && var8.method592(-15258)) {
                                class354.method2140(var8, var0, var1, var2, var8.field2483 + 1 - var8.field2481, var8.field2486 - var8.field2484 + 1);
                                var8.method585(96);
                            }
                        }
                        class686 var7 = var3.field4084;
                        if (var7 != null && var7.method592(-15258)) {
                            class632.method3565(var7, var0, var1, var2);
                            var7.method585(96);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 97)
    public static void method1558(int arg0) {
        field3527 = null;
        if (arg0 != 31) {
            method1559(123, -76, -120, 69, 93, -22, 6);
        }
        field3534 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIII)V", line = 115)
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3529++;
        int var7 = -46 % ((45 - arg6) / 41);
        int var8 = arg1 + arg5;
        int var9 = arg4 - arg5;
        for (int var10 = arg1; var10 < var8; var10++) {
            class223.method1484(class657.field9275[var10], arg3, -125, arg0, arg2);
        }
        for (int var11 = arg4; var11 > var9; var11--) {
            class223.method1484(class657.field9275[var11], arg3, -101, arg0, arg2);
        }
        int var12 = arg3 - arg5;
        int var13 = arg2 + arg5;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class657.field9275[var14];
            class223.method1484(var15, var13, -113, arg0, arg2);
            class223.method1484(var15, arg3, -80, arg0, var12);
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lr;B)V", line = 158)
    public static final void method1560(class98 arg0, byte arg1) {
        field3530++;
        int var2 = class150.field2534;
        int var3 = class485.field6918;
        int var4 = class69.field1093;
        int var5 = class273.field3904;
        int var6 = -10660793;
        arg0.method792(var5, (byte) -88, var4, var3, var6, var2);
        arg0.method792(16, (byte) -88, var4 - 2, var3 - -1, -16777216, var2 + 1);
        arg0.method762(var3 + 18, var4 + -2, -16777216, var5 - 19, var2 + 1, (byte) -78);
        class148.field2503.method2394((byte) 126, var2 + 3, class343.field4773.method2059(class238.field3511, true), -1, var6, var3 + 14);
        int var7 = class313.field4336.method310(false);
        int var8 = class313.field4336.method321(115);
        int var9 = 0;
        if (arg1 < 70) {
            return;
        }
        for (class673 var10 = (class673) class150.field2533.method3905(-118); var10 != null; var10 = (class673) class150.field2533.method3899(0)) {
            int var11 = (class400.field5784 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < (var11 + 3) && var10.field9553) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class586.method3382(var10.field9544, (byte) 45)) {
                var13 = class430.field6132.method42((int) var10.field9543, false).field6159;
            } else if (var10.field9550 != -1) {
                var13 = class430.field6132.method42(var10.field9550, false).field6159;
            } else if (class642.method3609((byte) 109, var10.field9544)) {
                class6 var16 = (class6) class314.field4359.method2818(-22803, (long) ((int) var10.field9543));
                if (var16 != null) {
                    class88 var17 = var16.field49;
                    class528 var18 = var17.field1309;
                    if (var18.field7758 != null) {
                        var18 = var18.method3110(class230.field3404, false);
                    }
                    if (var18 != null) {
                        var13 = var18.field7763;
                    }
                }
            } else if (class140.method1092(var10.field9544, -105)) {
                Object var14 = null;
                class119 var15;
                if (var10.field9544 == 1008) {
                    var15 = class14.field224.method2834(0, (int) var10.field9543);
                } else {
                    var15 = class14.field224.method2834(0, (int) (var10.field9543 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field1924 != null) {
                    var15 = var15.method969(class230.field3404, 92);
                }
                if (var15 != null) {
                    var13 = var15.field1948;
                }
            }
            String var19 = class115.method931(0, var10);
            if (var13 != null) {
                var19 = var19 + class192.method1356(var13, (byte) -6);
            }
            class148.field2503.method2396(var11, var19, class106.field1755, var2 + 3, var12, class252.field3646, (byte) -124, 0);
            var9++;
            if (var10.field9539) {
                class160.field2601.method1638(class246.field3584.method2870(true, var19) + var2 + 5, var11 - 12);
            }
        }
        class345.method2095(class150.field2534, class485.field6918, class69.field1093, class273.field3904, (byte) -23);
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 269)
    public class240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field3533 = (short) arg6;
        this.field3535 = (short) arg4;
        this.field3528 = arg10;
        this.field3532 = (byte) arg7;
        this.field3537 = arg0;
        this.field3536 = arg9;
        this.field3524 = (short) arg5;
        this.field3526 = (byte) arg8;
    }
}
