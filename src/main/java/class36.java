import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class36 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lla;")
    public static class319 field523 = new class319(21, 3);

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lpw;")
    public static class507 field526 = new class507();

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Z")
    public static boolean field527 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method312(String arg0, int arg1, byte arg2) {
        field522++;
        int var3 = class20.field310;
        int[] var4 = class55.field778;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class96 var7 = class241.field3398[var4[var6]];
            if (var7 != null && class56.field800 != var7 && var7.field1393 != null && var7.field1393.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    class424.method2582(class425.field6471, -1);
                    class180.field2430++;
                    class538.field7879.method1084(-3577, var4[var6]);
                    class538.field7879.method1075(128, 0);
                } else if (arg1 == 4) {
                    class423.field6447++;
                    class424.method2582(class14.field262, -1);
                    class538.field7879.method1097(-3, var4[var6]);
                    class538.field7879.method1072((byte) 102, 0);
                } else if (arg1 == 5) {
                    class360.field5523++;
                    class424.method2582(class321.field4654, -1);
                    class538.field7879.method1075(128, 0);
                    class538.field7879.method1068(105, var4[var6]);
                } else if (arg1 == 6) {
                    class310.field4512++;
                    class424.method2582(class389.field5947, -1);
                    class538.field7879.method1097(-3, var4[var6]);
                    class538.field7879.method1072((byte) 102, 0);
                } else if (arg1 == 7) {
                    class424.method2582(class245.field3441, -1);
                    class492.field7265++;
                    class538.field7879.method1081(0, -59);
                    class538.field7879.method1068(54, var4[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class62.method444(110, class159.field2051.method2705((byte) 69, class257.field3556) + arg0);
        }
        if (arg2 > -76) {
            method312(null, 24, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method313(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class121.field1654++;
        class520.field7656 = 0;
        for (int var6 = class81.field1167; var6 < class141.field1892; var6++) {
            class452[][] var17 = class443.field6672[var6];
            for (int var18 = class199.field2654; var18 < class522.field7681; var18++) {
                for (int var19 = class380.field5794; var19 < class207.field2821; var19++) {
                    class452 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class203.field2720[var18 + class28.field408 - class187.field2514][var19 + class28.field408 - class25.field358] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field6800 = true;
                            var20.field6806 = true;
                            if (var20.field6814 == null) {
                                var20.field6804 = false;
                            } else {
                                var20.field6804 = true;
                            }
                            class520.field7656++;
                        } else {
                            var20.field6800 = false;
                            var20.field6806 = false;
                            var20.field6802 = 0;
                            if (var18 >= class187.field2514 - 16 && var18 <= class187.field2514 + 16 && var19 >= class25.field358 - 16 && var19 <= class25.field358 + 16 && (var20.field6812 != null || var20.field6797 != null || var20.field6809 != null || var20.field6815 != null || var20.field6801 != null || var20.field6814 != null)) {
                                class463.field6923.method424(var20, -65);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class71.field988 == class306.field4447;
        for (int var8 = class81.field1167; var8 < class141.field1892; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class516.field7574.method755() && var8 >= arg2 && arg1 != null) {
                int var10 = class203.field2720.length;
                if (class203.field2720.length + class199.field2654 > class533.field7842) {
                    var10 -= class203.field2720.length + class199.field2654 - class533.field7842;
                }
                int var11 = class203.field2720[0].length;
                if (class203.field2720[0].length + class380.field5794 > class475.field7051) {
                    var11 -= class203.field2720[0].length + class380.field5794 - class475.field7051;
                }
                int var12 = class511.field7508;
                while (true) {
                    if (var12 >= var10) {
                        class463.field6923.method422(true, var9, 30, var8, class306.field4447[var8]);
                        break;
                    }
                    int var13 = class199.field2654 + var12 - class511.field7508;
                    for (int var14 = class441.field6658; var14 < var11; var14++) {
                        class474.field7039[var12][var14] = false;
                        if (class203.field2720[var12][var14]) {
                            int var15 = class380.field5794 + var14 - class441.field6658;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class443.field6672[var16][var13][var15] != null && class443.field6672[var16][var13][var15].field6810 == var8) {
                                    class474.field7039[var12][var14] = class443.field6672[var16][var13][var15].field6800;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class463.field6923.method422(false, var9, 30, var8, class306.field4447[var8]);
            }
            class463.field6923.method419((byte) 107);
        }
        if (!class468.method2814(true)) {
            class468.method2814(false);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIBIII)Z")
    public static final boolean method314(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field525++;
        if ((arg3 + arg8) <= arg0 || (arg0 + arg1) <= arg3) {
            return false;
        } else if (arg4 < arg7 + arg2 && (arg4 + arg6) > arg7) {
            int var9 = -127 % ((65 - arg5) / 55);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method315(byte arg0) {
        field526 = null;
        field523 = null;
        if (arg0 != 30) {
            field527 = false;
        }
    }
}
