import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class403 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    public static int[] field5592 = new int[200];

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5595 = -1;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
    public static boolean field5599 = false;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljm;")
    public static class485 field5594 = new class485(59, -1);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5594 = null;
        if (arg0 != -1178998393) {
            field5599 = true;
        }
        field5592 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public static final void method2334(int arg0) {
        field5597++;
        if (class437.field6374.method562(-60, class278.field3761) != 2) {
            return;
        }
        byte var1 = (byte) (class87.field1195 - 4 & 0xFF);
        int var2 = class87.field1195 % class442.field6435;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class232.field3217; var16++) {
                class99.field1369[var3][var2][var16] = var1;
            }
        }
        if (class400.field5571 == 3) {
            return;
        }
        for (int var4 = arg0; var4 < 2; var4++) {
            class517.field7595[var4] = -1000000;
            class207.field2940[var4] = 1000000;
            class504.field7415[var4] = 0;
            class289.field3887[var4] = 1000000;
            class308.field4227[var4] = 0;
        }
        if (class128.field1742 != 1) {
            int var15 = class186.method1118(class132.field1901, class310.field4240, 12840, class400.field5571);
            if ((var15 - class526.field7729) >= 800 || (class456.field6661[class400.field5571][class132.field1901 >> 7][class310.field4240 >> 7] & 0x4) == 0) {
                return;
            }
            class449.method2649(class310.field4240 >> 7, false, 1, -1, class385.field5410, class132.field1901 >> 7);
            return;
        }
        if ((class456.field6661[class400.field5571][class75.field1089.field466 >> 7][class75.field1089.field461 >> 7] & 0x4) != 0) {
            class449.method2649(class75.field1089.field461 >> 7, false, 0, -1, class385.field5410, class75.field1089.field466 >> 7);
        }
        if (class476.field6958 >= 2560) {
            return;
        }
        int var5 = class132.field1901 >> 7;
        int var6 = class310.field4240 >> 7;
        int var7 = class75.field1089.field466 >> 7;
        int var8 = class75.field1089.field461 >> 7;
        int var9;
        if (var5 >= var7) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && -class442.field6435 < var9 && var9 < class442.field6435 && var10 > -class232.field3217 && class232.field3217 > var10) {
            if (var10 < var9) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class456.field6661[class400.field5571][var5][var6] & 0x4) != 0) {
                        class449.method2649(var6, false, 1, -1, class385.field5410, var5);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 < var8) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        if ((class456.field6661[class400.field5571][var5][var6] & 0x4) != 0) {
                            class449.method2649(var6, false, 1, -1, class385.field5410, var5);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class456.field6661[class400.field5571][var5][var6] & 0x4) != 0) {
                    class449.method2649(var6, false, 1, -1, class385.field5410, var5);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class456.field6661[class400.field5571][var5][var6] & 0x4) != 0) {
                        class449.method2649(var6, false, 1, -1, class385.field5410, var5);
                        return;
                    }
                }
            }
            return;
        }
        class162.method1000((byte) 67, null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class215.field3059 + "," + class79.field1134);
        return;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static final void method2335(byte arg0) {
        field5596++;
        if (arg0 != -99) {
            field5599 = true;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class442.field6435; var2++) {
            for (int var3 = 0; var3 < class232.field3217; var3++) {
                if (class449.method2649(var3, true, var1, arg0 + 98, class385.field5410, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public static final void method2336(int arg0) {
        field5598++;
        class23.field377 = null;
        class344.field4744 = null;
        class270.field3695 = false;
        class86.field1191 = null;
        class270.field3694 = null;
        class269.field3688 = null;
        if (arg0 < 3) {
            method2334(-53);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIBI)Lir;")
    public static final class22 method2337(int arg0, int arg1, byte arg2, int arg3) {
        field5600++;
        class61 var4 = class385.field5410[arg3][arg1][arg0];
        if (var4 == null) {
            return null;
        } else if (arg2 > -85) {
            return null;
        } else {
            class22 var5 = null;
            int var6 = -1;
            for (class302 var7 = var4.field819; var7 != null; var7 = var7.field4140) {
                class33 var8 = var7.field4136;
                if (var8 instanceof class22) {
                    class22 var9 = (class22) var8;
                    int var10 = (var9.method167(-1) * 64 + 60) - 64;
                    int var11 = var9.field466 - var10 >> 7;
                    int var12 = var9.field461 - var10 >> 7;
                    int var13 = var9.field466 + var10 >> 7;
                    int var14 = var9.field461 + var10 >> 7;
                    if (arg1 >= var11 && var12 <= arg0 && var13 >= arg1 && var14 >= arg0) {
                        int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg0);
                        if (var6 < var15) {
                            var6 = var15;
                            var5 = var9;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I")
    public static final int method2338(int arg0, int arg1, int arg2) {
        if (arg0 < 111) {
            return 90;
        }
        field5593++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }
}
