import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Z")
    public static boolean field21 = false;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lfg;")
    public static class83 field22 = new class83(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[I")
    public static int[] field23 = new int[32];

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V", line = 10)
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -45 % ((74 - arg9) / 52);
        field19++;
        if (arg4 == arg8 && arg0 == arg7 && arg2 == arg5 && arg3 == arg6) {
            class183.method1111(arg7, arg8, arg6, arg5, arg1, -549645428);
            return;
        }
        int var11 = arg8;
        int var12 = arg7;
        int var13 = arg8 * 3;
        int var14 = arg7 * 3;
        int var15 = arg4 * 3;
        int var16 = arg0 * 3;
        int var17 = arg2 * 3;
        int var18 = arg3 * 3;
        int var19 = arg5 + var15 - var17 - arg8;
        int var20 = arg6 + var16 - arg7 - var18;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 + var18 - var16 - var16;
        int var23 = var15 - var13;
        int var24 = var16 - var14;
        for (int var25 = 128; var25 <= 4096; var25 += 128) {
            int var26 = var25 * var25 >> 12;
            int var27 = var25 * var26 >> 12;
            int var28 = var19 * var27;
            int var29 = var20 * var27;
            int var30 = var21 * var26;
            int var31 = var22 * var26;
            int var32 = var23 * var25;
            int var33 = var24 * var25;
            int var34 = (var28 - (-var30 - var32) >> 12) + arg8;
            int var35 = (var31 + var33 + var29 >> 12) + arg7;
            class183.method1111(var12, var11, var35, var34, arg1, -549645428);
            var12 = var35;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 84)
    public static void method7(int arg0) {
        field23 = null;
        if (arg0 != 1) {
            field23 = null;
        }
        field22 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZZIIZ)I", line = 96)
    public static final int method8(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field18++;
        class113 var5 = class223.method1313(arg0, Integer.MIN_VALUE, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (!arg1) {
            return 53;
        }
        for (int var7 = 0; var7 < var5.field1528.length; var7++) {
            if (var5.field1528[var7] >= 0 && var5.field1528[var7] < class75.field1097.field1713) {
                class316 var8 = class75.field1097.method823(!arg1, var5.field1528[var7]);
                int var9 = var8.method1790(27911, arg2, class284.field3819.method1088(arg2, (byte) -120).field1220);
                if (arg4) {
                    var6 += var5.field1529[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(La;B)V", line = 136)
    public static final void method9(class436 arg0, byte arg1) {
        arg0.method2597(115);
        field17++;
        int var2 = class202.field2880;
        class192 var3 = class75.field1089 = class309.field4234[var2] = new class192();
        int var4 = -32 % ((arg1 - 9) / 43);
        var3.field297 = var2;
        int var5 = arg0.method2599((byte) 98, 30);
        byte var6 = (byte) (var5 >> 28);
        int var7 = var5 >> 14 & 0x3FFF;
        var3.field372[0] = var7 - class215.field3059;
        int var8 = var5 & 0x3FFF;
        var3.field466 = (var3.field372[0] << 7) + (var3.method167(-1) << 6);
        var3.field362[0] = var8 - class79.field1134;
        var3.field461 = (var3.field362[0] << 7) + (var3.method167(-1) << 6);
        class400.field5571 = var3.field464 = var6;
        if (class367.field5152[var2] != null) {
            var3.method1167(-10459, class367.field5152[var2]);
        }
        class378.field5322 = 0;
        class95.field1321[class378.field5322++] = var2;
        class220.field3083[var2] = 0;
        class166.field2353 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var2 != var9) {
                int var10 = arg0.method2599((byte) 98, 18);
                int var11 = var10 >> 16;
                int var12 = (var10 & 0xFFAB) >> 8;
                int var13 = var10 & 0xFF;
                class135 var14 = class26.field405[var9] = new class135();
                var14.field1948 = 0;
                var14.field1951 = -1;
                var14.field1947 = false;
                var14.field1944 = (var12 << 14) + (var11 << 28) + var13;
                class77.field1105[class166.field2353++] = var9;
                class220.field3083[var9] = 0;
            }
        }
        arg0.method2601((byte) 56);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZZLuo;)V", line = 206)
    public static final void method10(boolean arg0, boolean arg1, class405 arg2) {
        field20++;
        if (class370.field5198 >= 400) {
            return;
        }
        class336 var3 = arg2.field5623;
        if (var3.field4612 != null) {
            var3 = var3.method1860(class453.field6623, (byte) -39);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4589) {
            return;
        }
        String var4 = var3.field4602;
        if (var3.field4630 != 0) {
            String var5 = class341.field4700 == class288.field3885 ? class330.field4498.method590(class105.field1434, -22602) : class279.field3769.method590(class105.field1434, -22602);
            var4 = var4 + class213.method1278(class75.field1089.field2722, -114, var3.field4630) + " (" + var5 + var3.field4630 + ")";
        }
        if (!class297.field4101) {
            if (!arg0) {
                String[] var6 = var3.field4613;
                if (class45.field639) {
                    var6 = class192.method1156(var6, 22593);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (class341.field4700 != class166.field2348 || !var6[var7].equalsIgnoreCase(class477.field6978.method590(class105.field1434, -22602)))) {
                            byte var8 = 0;
                            if (var7 == 0) {
                                var8 = 16;
                            }
                            int var9 = class118.field1593;
                            if (var7 == 1) {
                                var8 = 46;
                            }
                            if (var7 == 2) {
                                var8 = 2;
                            }
                            if (var7 == 3) {
                                var8 = 22;
                            }
                            if (var7 == 4) {
                                var8 = 15;
                            }
                            if (var3.field4586 == var7) {
                                var9 = var3.field4591;
                            }
                            if (var3.field4575 == var7) {
                                var9 = var3.field4631;
                            }
                            class376.method2167(0, 0, (long) arg2.field297, var8, var9, (byte) -90, -1, false, "<col=ffff00>" + var4, var6[var7], true);
                            class225.field3164++;
                        }
                    }
                }
                if (class341.field4700 == class166.field2348 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class477.field6978.method590(class105.field1434, -22602))) {
                            short var11 = 0;
                            if (var3.field4630 > class75.field1089.field2722) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 16;
                            }
                            if (var10 == 1) {
                                var12 = 46;
                            }
                            if (var10 == 2) {
                                var12 = 2;
                            }
                            if (var10 == 3) {
                                var12 = 22;
                            }
                            if (var10 == 4) {
                                var12 = 15;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class376.method2167(0, 0, (long) arg2.field297, var12, var3.field4611, (byte) -90, -1, false, "<col=ffff00>" + var4, var6[var10], true);
                            class167.field2358++;
                        }
                    }
                }
            }
            class408.field5644++;
            class376.method2167(0, 0, (long) arg2.field297, 1012, class247.field3442, (byte) -90, -1, arg0, "<col=ffff00>" + var4, class441.field6423.method590(class105.field1434, -22602), true);
        } else if (!arg0) {
            class89 var13 = class352.field4810 == -1 ? null : class284.field3819.method1088(class352.field4810, (byte) -127);
            if ((class450.field6497 & 0x2) != 0 && (var13 == null || var3.method1857(class352.field4810, (byte) -126, var13.field1220) != var13.field1220)) {
                class376.method2167(0, 0, (long) arg2.field297, 25, class327.field4483, (byte) -90, -1, false, class526.field7728 + " -> <col=ffff00>" + var4, class344.field4734, true);
                class9.field89++;
            }
        }
        if (!arg1) {
            method9(null, (byte) 90);
        }
    }
}
