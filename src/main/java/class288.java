import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class288 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4159 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
    public static int[] field4157;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static void method1965(byte arg0) {
        field4159 = null;
        if (arg0 < 55) {
            field4157 = null;
        }
        field4157 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIII)V")
    public static final void method1966(byte arg0, int arg1, int arg2, int arg3) {
        field4158++;
        if (arg0 != 73) {
            return;
        }
        if (arg1 == 1007) {
            class123.method782(10, arg3, arg2);
        } else if (arg1 == 1010) {
            class123.method782(11, arg3, arg2);
        } else if (arg1 == 1002) {
            class123.method782(12, arg3, arg2);
        } else if (arg1 == 1012) {
            class123.method782(13, arg3, arg2);
            return;
        } else if (arg1 == 1001) {
            class123.method782(14, arg3, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1967(int arg0, int arg1, int arg2, Class arg3) {
        class254 var4 = class213.field2852[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class328 var5 = var4.field3515; var5 != null; var5 = var5.field4783) {
            class55 var6 = var5.field4785;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field743 == arg1 && var6.field726 == arg2) {
                class244.method1469(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1968(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class291.field4165++;
        class375.field5462 = 0;
        for (int var6 = class68.field875; var6 < class180.field2380; var6++) {
            class254[][] var17 = class213.field2852[var6];
            for (int var18 = class34.field476; var18 < class63.field849; var18++) {
                for (int var19 = class310.field4561; var19 < class5.field65; var19++) {
                    class254 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class211.field2799[var18 + class264.field3838 - class104.field1491][var19 + class264.field3838 - class428.field6302] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field3501 = true;
                            var20.field3508 = true;
                            if (var20.field3515 == null) {
                                var20.field3520 = false;
                            } else {
                                var20.field3520 = true;
                            }
                            class375.field5462++;
                        } else {
                            var20.field3501 = false;
                            var20.field3508 = false;
                            var20.field3509 = 0;
                            if (var18 >= class104.field1491 - 16 && var18 <= class104.field1491 + 16 && var19 >= class428.field6302 - 16 && var19 <= class428.field6302 + 16 && (var20.field3510 != null || var20.field3512 != null || var20.field3519 != null || var20.field3502 != null || var20.field3527 != null || var20.field3515 != null)) {
                                class328.field4782.method559(true, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class191.field2557 == class12.field205;
        for (int var8 = class68.field875; var8 < class180.field2380; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class296.field4257.method1720() && var8 >= arg2 && arg1 != null) {
                int var10 = class211.field2799.length;
                if (class211.field2799.length + class34.field476 > class104.field1436) {
                    var10 -= class211.field2799.length + class34.field476 - class104.field1436;
                }
                int var11 = class211.field2799[0].length;
                if (class211.field2799[0].length + class310.field4561 > class214.field2858) {
                    var11 -= class211.field2799[0].length + class310.field4561 - class214.field2858;
                }
                int var12 = class444.field6505;
                while (true) {
                    if (var12 >= var10) {
                        class328.field4782.method557(var9, var8, true, 128, class12.field205[var8]);
                        break;
                    }
                    int var13 = class34.field476 + var12 - class444.field6505;
                    for (int var14 = class372.field5418; var14 < var11; var14++) {
                        class5.field67[var12][var14] = false;
                        if (class211.field2799[var12][var14]) {
                            int var15 = class310.field4561 + var14 - class372.field5418;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class213.field2852[var16][var13][var15] != null && class213.field2852[var16][var13][var15].field3507 == var8) {
                                    class5.field67[var12][var14] = class213.field2852[var16][var13][var15].field3501;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class328.field4782.method557(var9, var8, false, 128, class12.field205[var8]);
            }
            class328.field4782.method558((byte) -81);
        }
        if (!class184.method1119(true)) {
            class184.method1119(false);
        }
    }
}
