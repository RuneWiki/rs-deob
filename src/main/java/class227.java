import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class227 {

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lct;")
    public static class285 field3322 = new class285(21, -1);

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Lsh;")
    public static class472 field3328 = new class472(91, -2);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lmu;")
    public static class315 field3321;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 3)
    public static void method1473(byte arg0) {
        field3328 = null;
        if (arg0 != -62) {
            method1479(73, 127, -26, 74);
        }
        field3322 = null;
        field3321 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZIIFII)[I", line = 15)
    public static final int[] method1474(int arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        field3317++;
        int[] var8 = new int[arg3];
        class105 var9 = new class105();
        var9.field1465 = arg2;
        var9.field1459 = arg6;
        var9.field1473 = arg1;
        var9.field1474 = arg4;
        var9.field1462 = (int) (arg5 * 4096.0F);
        var9.field1461 = arg7;
        var9.method653(true);
        class12.method123(1, (byte) -69, arg3);
        var9.method780(7, arg0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lre;B)V", line = 36)
    public final void method1475(class446 arg0, byte arg1) {
        field3325++;
        if (arg1 != -82) {
            field3322 = null;
        }
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                return;
            }
            this.method1480((byte) 85, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[[[BIBII)V", line = 58)
    public static final void method1476(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class382.field5657++;
        class341.field5111 = 0;
        for (int var6 = class426.field6093; var6 < class344.field5192; var6++) {
            class337[][] var17 = class170.field2427[var6];
            for (int var18 = class473.field6635; var18 < class121.field1671; var18++) {
                for (int var19 = class314.field4723; var19 < class385.field5698; var19++) {
                    class337 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class206.field3116[var18 + class281.field4243 - class307.field4577][var19 + class281.field4243 - class386.field5702] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field5060 = true;
                            var20.field5061 = true;
                            if (var20.field5054 == null) {
                                var20.field5045 = false;
                            } else {
                                var20.field5045 = true;
                            }
                            class341.field5111++;
                        } else {
                            var20.field5060 = false;
                            var20.field5061 = false;
                            var20.field5049 = 0;
                            if (var18 >= class307.field4577 - 16 && var18 <= class307.field4577 + 16 && var19 >= class386.field5702 - 16 && var19 <= class386.field5702 + 16 && (var20.field5044 != null || var20.field5047 != null || var20.field5058 != null || var20.field5050 != null || var20.field5063 != null || var20.field5054 != null)) {
                                class44.field632.method94((byte) 37, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class55.field765 == class479.field6745;
        for (int var8 = class426.field6093; var8 < class344.field5192; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class432.field6150.method556() && var8 >= arg2 && arg1 != null) {
                int var10 = class206.field3116.length;
                if (class206.field3116.length + class473.field6635 > class412.field5957) {
                    var10 -= class206.field3116.length + class473.field6635 - class412.field5957;
                }
                int var11 = class206.field3116[0].length;
                if (class206.field3116[0].length + class314.field4723 > class315.field4743) {
                    var11 -= class206.field3116[0].length + class314.field4723 - class315.field4743;
                }
                int var12 = class145.field2049;
                while (true) {
                    if (var12 >= var10) {
                        class44.field632.method91(var8, class479.field6745[var8], true, 81, var9);
                        break;
                    }
                    int var13 = class473.field6635 + var12 - class145.field2049;
                    for (int var14 = class27.field360; var14 < var11; var14++) {
                        class10.field155[var12][var14] = false;
                        if (class206.field3116[var12][var14]) {
                            int var15 = class314.field4723 + var14 - class27.field360;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class170.field2427[var16][var13][var15] != null && class170.field2427[var16][var13][var15].field5051 == var8) {
                                    class10.field155[var12][var14] = class170.field2427[var16][var13][var15].field5060;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class44.field632.method91(var8, class479.field6745[var8], false, 21, var9);
            }
            class44.field632.method93(70);
        }
        if (!class72.method622(true)) {
            class72.method622(false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[Lrt;", line = 196)
    public static final class124[] method1477(int arg0) {
        if (arg0 <= 17) {
            field3321 = null;
        }
        field3323++;
        return new class124[] { class21.field262, class424.field6068, class38.field523 };
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CB)C", line = 211)
    public static final char method1478(char arg0, byte arg1) {
        if (arg1 < 13) {
            field3322 = null;
        }
        field3324++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)Z", line = 613)
    public static final boolean method1479(int arg0, int arg1, int arg2, int arg3) {
        if (class247.method1583(arg0, arg1, arg2)) {
            int var4 = arg1 << class426.field6091;
            int var5 = arg2 << class426.field6091;
            return class92.method710(var4 + 1, class479.field6745[arg0].method199(arg1, arg2) + arg3, var5 + 1) && class92.method710(class75.field1055 + var4 - 1, class479.field6745[arg0].method199(arg1 + 1, arg2) + arg3, var5 + 1) && class92.method710(class75.field1055 + var4 - 1, class479.field6745[arg0].method199(arg1 + 1, arg2 + 1) + arg3, class75.field1055 + var5 - 1) && class92.method710(var4 + 1, class479.field6745[arg0].method199(arg1, arg2 + 1) + arg3, class75.field1055 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLre;I)V", line = 630)
    private final void method1480(byte arg0, class446 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3316 = arg1.method2631(2530);
            this.field3320 = arg1.method2628(49152);
            this.field3326 = arg1.method2628(49152);
        }
        if (arg0 < 6) {
            method1477(34);
        }
        field3319++;
    }
}
