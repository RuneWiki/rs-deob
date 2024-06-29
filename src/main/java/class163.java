import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class163 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lid;")
    public static class149 field3021 = class60.method382("Chargement en cours)3)3)3", (byte) 85);

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lid;")
    public static class149 field3022 = class60.method382("Ausw-=hlen", (byte) 52);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lid;")
    public static class149 field3024 = class60.method382("clignotant1:", (byte) 125);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lid;")
    public static class149 field3018 = class60.method382("Fichiers config charg-Bs", (byte) 111);

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[I")
    public static int[] field3023 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3020 = -1;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I")
    public static final int method1195(int arg0) {
        field3028++;
        if (arg0 != -2) {
            field3021 = null;
        }
        return class127.field2229 && class131.field2312[81] && class60.field1092 > 2 ? class224.field3941[class60.field1092 - 2] : class224.field3941[class60.field1092 - 1];
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1196(byte arg0) {
        if (arg0 != -24) {
            return;
        }
        field3025++;
        while (true) {
            class252 var1;
            class131 var3;
            do {
                var1 = (class252) class95.field1667.method1137(true);
                if (var1 == null) {
                    return;
                }
                if (var1.field4420 >= 0) {
                    int var2 = var1.field4420 - 1;
                    var3 = class38.field572[var2];
                } else {
                    int var4 = -var1.field4420 - 1;
                    if (class258.field4514 == var4) {
                        var3 = class77.field1449;
                    } else {
                        var3 = class107.field1851[var4];
                    }
                }
            } while (var3 == null);
            class268 var5 = class108.method755(arg0 + 11549, var1.field4411);
            int var6;
            int var7;
            if (var1.field4422 == 1 || var1.field4422 == 3) {
                var7 = var5.field4787;
                var6 = var5.field4820;
            } else {
                var6 = var5.field4787;
                var7 = var5.field4820;
            }
            int var8 = (var7 >> 1) + var1.field4414;
            int var9 = var1.field4418 + (var6 >> 1);
            int var10 = (var7 + 1 >> 1) + var1.field4414;
            int[][] var11 = class189.field3393[class277.field4948];
            int var12 = (var6 + 1 >> 1) + var1.field4418;
            class199 var13 = null;
            int var14 = class111.field1919[var1.field4417];
            int var15 = var11[var8][var9] + var11[var8][var12] + var11[var10][var9] + var11[var10][var12] >> 2;
            if (var14 == 0) {
                class125 var19 = class143.method991(class277.field4948, var1.field4414, var1.field4418);
                if (var19 != null) {
                    var13 = var19.field2203;
                }
            } else if (var14 == 1) {
                class158 var16 = class96.method695(class277.field4948, var1.field4414, var1.field4418);
                if (var16 != null) {
                    var13 = var16.field2911;
                }
            } else if (var14 == 2) {
                class23 var18 = class151.method1077(class277.field4948, var1.field4414, var1.field4418);
                if (var18 != null) {
                    var13 = var18.field343;
                }
            } else if (var14 == 3) {
                class100 var17 = class75.method544(class277.field4948, var1.field4414, var1.field4418);
                if (var17 != null) {
                    var13 = var17.field1764;
                }
            }
            if (var13 != null) {
                class83.method616(var1.field4423 + 1, false, 0, var1.field4414, var1.field4412 + 1, var1.field4418, class277.field4948, var14, -1, 0);
                var3.field2361 = var13;
                var3.field2356 = class118.field2022 + var1.field4412;
                var3.field2376 = var15;
                var3.field2396 = var1.field4414 * 128 + (var7 * 64);
                int var20 = var1.field4409;
                var3.field2320 = class118.field2022 + var1.field4423;
                int var21 = var1.field4421;
                var3.field2306 = var1.field4418 * 128 + var6 * 64;
                int var22 = var1.field4416;
                if (var20 < var21) {
                    int var23 = var21;
                    var21 = var20;
                    var20 = var23;
                }
                int var24 = var1.field4413;
                if (var22 > var24) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field2367 = var1.field4418 + var24;
                var3.field2385 = var1.field4414 + var21;
                var3.field2357 = var1.field4418 + var22;
                var3.field2407 = var1.field4414 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILbk;)V")
    public static final void method1197(int arg0, class20 arg1) {
        int var2 = -34 % ((arg0 + 68) / 52);
        field3027++;
        for (class259 var3 = (class259) class259.field4524.method1140(0); var3 != null; var3 = (class259) class259.field4524.method1127(0)) {
            if (var3.field4540 == arg1) {
                if (var3.field4531 != null) {
                    class246.field4318.method814(var3.field4531);
                    var3.field4531 = null;
                }
                var3.method401((byte) -118);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1198(int arg0) {
        if (arg0 != 1560117857) {
            field3018 = null;
        }
        field3024 = null;
        field3021 = null;
        field3018 = null;
        field3023 = null;
        field3022 = null;
    }
}
