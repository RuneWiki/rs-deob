import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class101 extends class561 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Lvt;")
    public static class344 field1342 = new class344("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lvt;")
    public static class344 field1343 = new class344("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method559(byte arg0) {
        field1342 = null;
        if (arg0 <= 117) {
            field1343 = null;
        }
        field1343 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Z")
    public abstract boolean method247(int arg0);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILqo;)V")
    public static final void method560(int arg0, int arg1, int arg2, int arg3, class508 arg4) {
        field1340++;
        long var5 = (long) (arg1 << 14 | arg3 << 28 | arg0);
        class247 var7 = (class247) class241.field3066.method3476(var5, (byte) 28);
        if (var7 == null) {
            class247 var8 = new class247();
            class241.field3066.method3475(-89, var8, var5);
            var8.field3110.method3181(arg4, true);
            return;
        }
        class456 var9 = class98.field1307.method3391(0, arg4.field7085);
        int var10 = var9.field6498;
        if (var9.field6477 == 1) {
            var10 = (arg4.field7088 + 1) * var10;
        }
        for (class508 var11 = (class508) var7.field3110.method3188((byte) -100); var11 != null; var11 = (class508) var7.field3110.method3182((byte) -41)) {
            class456 var12 = class98.field1307.method3391(0, var11.field7085);
            int var13 = var12.field6498;
            if (var12.field6477 == 1) {
                var13 = (var11.field7088 + 1) * var13;
            }
            if (var13 < var10) {
                class502.method2802(var11, arg4, (byte) -126);
                return;
            }
        }
        if (arg2 == 14546) {
            var7.field3110.method3181(arg4, true);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method246(int arg0);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLjj;)V")
    public static final void method561(byte arg0, class66 arg1) {
        arg1.method373(82);
        field1339++;
        int var2 = class182.field2335;
        class20 var3 = class147.field1899 = class364.field5092[var2] = new class20();
        var3.field366 = var2;
        int var4 = arg1.method377(8, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF599) >> 14;
        var3.field419[0] = var6 - class525.field7310;
        int var7 = var4 & 0x3FFF;
        var3.field6362 = (var3.field419[0] << 9) + (var3.method104((byte) -92) << 8);
        var3.field417[0] = var7 - class58.field786;
        var3.field6368 = (var3.field417[0] << 9) + (var3.method104((byte) -92) << 8);
        class187.field2407 = var3.field6358 = var5;
        if (class601.field8697[var2] != null) {
            var3.method108(class601.field8697[var2], -548);
        }
        class512.field7133 = 0;
        class514.field7144[class512.field7133++] = var2;
        class66.field880[var2] = 0;
        int var8 = -45 / ((arg0 - 63) / 45);
        class44.field633 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var2 != var9) {
                int var10 = arg1.method377(8, 18);
                int var11 = var10 >> 16;
                int var12 = var10 >> 8 & 0xFF;
                int var13 = var10 & 0xFF;
                class61 var14 = class58.field785[var9] = new class61();
                var14.field846 = -1;
                var14.field841 = (var11 << 28) + var13 + (var12 << 14);
                var14.field842 = false;
                var14.field844 = 0;
                class362.field5036[class44.field633++] = var9;
                class66.field880[var9] = 0;
            }
        }
        arg1.method378(7);
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
    public static final void method562(int arg0) {
        field1341++;
        class451.method2627((byte) 120, false);
        class440.field5995 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class443.field6126.length; var2++) {
            if (class334.field4672[var2] != -1 && class443.field6126[var2] == null) {
                class443.field6126[var2] = class277.field3612.method2054(true, class334.field4672[var2], 0);
                if (class443.field6126[var2] == null) {
                    var1 = false;
                    class440.field5995++;
                }
            }
            if (class183.field2340[var2] != -1 && class452.field6403[var2] == null) {
                class452.field6403[var2] = class277.field3612.method2071(0, (byte) 110, class183.field2340[var2], class431.field5865[var2]);
                if (class452.field6403[var2] == null) {
                    class440.field5995++;
                    var1 = false;
                }
            }
            if (class146.field1896[var2] != -1 && class534.field7454[var2] == null) {
                class534.field7454[var2] = class277.field3612.method2054(true, class146.field1896[var2], 0);
                if (class534.field7454[var2] == null) {
                    class440.field5995++;
                    var1 = false;
                }
            }
            if (class89.field1190[var2] != -1 && class555.field7758[var2] == null) {
                class555.field7758[var2] = class277.field3612.method2054(true, class89.field1190[var2], 0);
                if (class555.field7758[var2] == null) {
                    class440.field5995++;
                    var1 = false;
                }
            }
            if (class335.field4677 != null && class627.field9135[var2] == null && class335.field4677[var2] != -1) {
                class627.field9135[var2] = class277.field3612.method2071(0, (byte) 114, class335.field4677[var2], class431.field5865[var2]);
                if (class627.field9135[var2] == null) {
                    var1 = false;
                    class440.field5995++;
                }
            }
        }
        if (class438.field5988 == null) {
            if (class410.field5637 == null || !class154.field2007.method2065((byte) -65, class410.field5637.field3440 + "_staticelements")) {
                class438.field5988 = new class106(0);
            } else if (class154.field2007.method2072(class410.field5637.field3440 + "_staticelements", false)) {
                class438.field5988 = class123.method664(class502.field6984, (byte) 63, class154.field2007, class410.field5637.field3440 + "_staticelements");
            } else {
                var1 = false;
                class440.field5995++;
            }
        }
        if (!var1) {
            class383.field5355 = 1;
            return;
        }
        boolean var3 = true;
        class235.field3005 = 0;
        for (int var4 = 0; var4 < class443.field6126.length; var4++) {
            byte[] var19 = class452.field6403[var4];
            if (var19 != null) {
                int var20 = (class258.field3206[var4] >> 8) * 64 - class525.field7310;
                int var21 = (class258.field3206[var4] & 0xFF) * 64 - class58.field786;
                if (class403.field5520 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class173.method1062(class139.field1760, 0, var20, var21, class369.field5135, var19);
            }
            byte[] var22 = class555.field7758[var4];
            if (var22 != null) {
                int var23 = (class258.field3206[var4] >> 8) * 64 - class525.field7310;
                int var24 = (class258.field3206[var4] & 0xFF) * 64 - class58.field786;
                if (class403.field5520 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class173.method1062(class139.field1760, 0, var23, var24, class369.field5135, var22);
            }
        }
        if (!var3) {
            class383.field5355 = 2;
            return;
        }
        if (class383.field5355 != 0) {
            class410.method2447(class512.field7135.method2157(class245.field3103, 4074) + "<br>(100%)", true, -25375, class522.field7281);
        }
        class147.method802((byte) 49);
        class485.method2738(14);
        boolean var5 = false;
        if (class301.field3918.method917() && class501.field6954.field7873) {
            for (int var6 = 0; var6 < class443.field6126.length; var6++) {
                if (class555.field7758[var6] != null || class534.field7454[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class501.field6954.field7872) {
            var7 = class371.field5169[class257.field3193];
        } else {
            var7 = class319.field4400[class257.field3193];
        }
        if (class301.field3918.method970()) {
            var7++;
        }
        class141.method759(9, 4, class139.field1760, class369.field5135, var7, var5, class301.field3918.method914() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class15.field154[var8].method785(2097152);
        }
        class179.method1106((byte) 105);
        class646.method3716(false, (byte) -50);
        class500.method2794(0);
        class174.field2251 = false;
        if (arg0 <= 12) {
            field1343 = null;
        }
        class466.field6615 = null;
        class147.method802((byte) 49);
        System.gc();
        class451.method2627((byte) 120, true);
        class373.method2277((byte) -117);
        class190.field2458 = class501.field6954.method3159(class428.field5845, true);
        class286.field3748 = class501.field6954.field7873;
        class443.field6125 = class282.field3697 >= 96;
        class344.field4773 = class501.field6954.method3152(-111, class428.field5845);
        class265.field3393 = !class501.field6954.field7868;
        class96.field1293 = class501.field6954.method3539(class428.field5845, 2) ? -1 : class475.field6698;
        class486.field6790 = class36.method221(-123, class428.field5845) || class501.field6954.field7847;
        class244.field3087 = class501.field6954.field7880;
        class442.field6004 = new class277(4, class139.field1760, class369.field5135, false);
        if (class403.field5520 == 0) {
            class49.method274(class443.field6126, class442.field6004, (byte) 47);
        } else {
            class562.method3153(class442.field6004, (byte) -2, class443.field6126);
        }
        class93.method510(class139.field1760 >> 4, class369.field5135 >> 4, (byte) -111);
        class235.method1484(false);
        if (var5) {
            class580.method3268(true);
            class353.field4944 = new class277(1, class139.field1760, class369.field5135, true);
            if (class403.field5520 == 0) {
                class49.method274(class534.field7454, class353.field4944, (byte) 47);
                class451.method2627((byte) 120, true);
            } else {
                class562.method3153(class353.field4944, (byte) -2, class534.field7454);
                class451.method2627((byte) 120, true);
            }
            class353.field4944.method526(-107, class442.field6004.field1277[0], 0);
            class353.field4944.method518(null, class301.field3918, null, false);
            class580.method3268(false);
        }
        class442.field6004.method518(var5 ? class353.field4944.field1277 : null, class301.field3918, class15.field154, false);
        if (class403.field5520 == 0) {
            class451.method2627((byte) 120, true);
            class173.method1060(880863144, class452.field6403, class442.field6004);
            if (class627.field9135 != null) {
                class83.method472(23);
            }
        } else {
            class451.method2627((byte) 120, true);
            class401.method2405(class452.field6403, class442.field6004, 0);
        }
        class485.method2738(14);
        if (class282.field3697 < 96) {
            class438.method2549((byte) -16);
        }
        class451.method2627((byte) 120, true);
        class442.field6004.method528(-16373, class301.field3918, null, var5 ? class353.field4949[0] : null);
        class442.field6004.method1710(class301.field3918, (byte) 51);
        class451.method2627((byte) 120, true);
        if (var5) {
            class580.method3268(true);
            class451.method2627((byte) 120, true);
            if (class403.field5520 == 0) {
                class173.method1060(880863144, class555.field7758, class353.field4944);
            } else {
                class401.method2405(class555.field7758, class353.field4944, 0);
            }
            class485.method2738(14);
            class451.method2627((byte) 120, true);
            class353.field4944.method528(-16373, class301.field3918, class50.field672[0], null);
            class353.field4944.method1710(class301.field3918, (byte) 76);
            class451.method2627((byte) 120, true);
            class580.method3268(false);
        }
        class588.method3395((byte) 83);
        int var9 = class442.field6004.field3626;
        if (class187.field2407 < var9) {
            var9 = class187.field2407;
        }
        if (var9 < (class187.field2407 - 1)) {
            var9 = class187.field2407 - 1;
        }
        if (class501.field6954.method3539(class428.field5845, 2)) {
            class68.method389(0);
        } else {
            class68.method389(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class139.field1760; var17++) {
                for (int var18 = 0; var18 < class369.field5135; var18++) {
                    class373.method2278(var17, -25, var18, var10);
                }
            }
        }
        class509.method2848(-4);
        class147.method802((byte) 49);
        class312.method1882((byte) -127);
        class485.method2738(14);
        class29.method170(-18506);
        if (class247.field3111 != null && class96.field1294 != null && class630.field9188 == 10) {
            class296.field3842++;
            class118.method650(true, class227.field2908);
            class272.field3457.method3071(-113, 1057001181);
        }
        if (class403.field5520 == 0) {
            int var11 = (class460.field6561 - (class139.field1760 >> 4)) / 8;
            int var12 = (class460.field6561 + (class139.field1760 >> 4)) / 8;
            int var13 = (class190.field2449 - (class369.field5135 >> 4)) / 8;
            int var14 = ((class369.field5135 >> 4) + class190.field2449) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var12 < var15 || var16 < var13 || var14 < var16) {
                        class277.field3612.method2061(-26570, "m" + var15 + "_" + var16);
                        class277.field3612.method2061(-26570, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class630.field9188 == 3) {
            class597.method3438((byte) 124, 2);
        } else if (class630.field9188 == 7) {
            class597.method3438((byte) 124, 6);
        } else {
            class597.method3438((byte) 124, 9);
            if (class96.field1294 != null) {
                class118.method650(true, class613.field8814);
            }
        }
        class621.method3565(-92);
        class147.method802((byte) 49);
        class49.method266(-1);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        this.field1338 = arg0;
    }
}
