import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public static int[] field2408 = new int[100];

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lpa;")
    public static class105 field2412 = new class105();

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Ltd;")
    public static class136 field2415 = class145.method1172("lila:", 45);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Ltd;")
    private static class136 field2416 = class145.method1172("This world is running a closed Beta)3", 45);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ltd;")
    public static class136 field2414 = field2416;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lne;")
    public static class95 field2413;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method810(byte arg0) {
        field2412 = null;
        field2408 = null;
        field2416 = null;
        field2414 = null;
        int var1 = 121 % ((-arg0 - 16) / 54);
        field2413 = null;
        field2415 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lne;BLne;)V")
    public static final void method811(class95 arg0, byte arg1, class95 arg2) {
        field2410++;
        if (class101.field2430 == null) {
            class101.field2430 = class43.method348(class143.field3328, 1674879824, class81.field1934, class35.field810);
        }
        if (class154.field3514 == null) {
            class154.field3514 = class31.method274(class49.field1117, class143.field3328, class81.field1934, (byte) -113);
        }
        if (class24.field551 == null) {
            class24.field551 = class31.method274(class16.field321, class143.field3328, class81.field1934, (byte) -113);
        }
        int var3 = 105 / ((-arg1 - 34) / 52);
        if (class51.field1151 == null) {
            class51.field1151 = class31.method274(class16.field331, class143.field3328, class81.field1934, (byte) -113);
        }
        class114.method891(0, 23, 765, 480, 0);
        class114.method903(0, 0, 125, 23, 12425273, 9135624);
        class114.method903(125, 0, 640, 23, 5197647, 2697513);
        arg2.method724(class113.field2628, 62, 15, 0, -1);
        if (class51.field1151 != null) {
            class51.field1151[1].method693(140, 1);
            arg0.method702(class75.field1702, 152, 10, 16777215, -1);
            class51.field1151[0].method693(140, 12);
            arg0.method702(class26.field584, 152, 21, 16777215, -1);
        }
        if (class24.field551 != null) {
            short var4 = 280;
            if (class127.field3021[0] == 0 && class107.field2529[0] == 0) {
                class24.field551[2].method693(var4, 4);
            } else {
                class24.field551[0].method693(var4, 4);
            }
            short var5 = 610;
            if (class127.field3021[0] == 0 && class107.field2529[0] == 1) {
                class24.field551[3].method693(var4 + 15, 4);
            } else {
                class24.field551[1].method693(var4 + 15, 4);
            }
            short var6 = 390;
            short var7 = 500;
            arg2.method702(class35.field843, var4 + 32, 17, 16777215, -1);
            if (class127.field3021[0] == 1 && class107.field2529[0] == 0) {
                class24.field551[2].method693(var6, 4);
            } else {
                class24.field551[0].method693(var6, 4);
            }
            if (class127.field3021[0] == 1 && class107.field2529[0] == 1) {
                class24.field551[3].method693(var6 + 15, 4);
            } else {
                class24.field551[1].method693(var6 + 15, 4);
            }
            arg2.method702(class89.field2100, var6 + 32, 17, 16777215, -1);
            if (class127.field3021[0] == 2 && class107.field2529[0] == 0) {
                class24.field551[2].method693(var7, 4);
            } else {
                class24.field551[0].method693(var7, 4);
            }
            if (class127.field3021[0] == 2 && class107.field2529[0] == 1) {
                class24.field551[3].method693(var7 + 15, 4);
            } else {
                class24.field551[1].method693(var7 + 15, 4);
            }
            arg2.method702(class2.field47, var7 + 32, 17, 16777215, -1);
            if (class127.field3021[0] == 3 && class107.field2529[0] == 0) {
                class24.field551[2].method693(var5, 4);
            } else {
                class24.field551[0].method693(var5, 4);
            }
            if (class127.field3021[0] == 3 && class107.field2529[0] == 1) {
                class24.field551[3].method693(var5 + 15, 4);
            } else {
                class24.field551[1].method693(var5 + 15, 4);
            }
            arg2.method702(class84.field1991, var5 + 32, 17, 16777215, -1);
        }
        class114.method891(708, 4, 50, 16, 0);
        arg0.method724(class89.field2114, 733, 16, 16777215, -1);
        class19.field381 = -1;
        if (class101.field2430 != null) {
            byte var8 = 88;
            byte var9 = 19;
            int var10 = 765 / (var8 + 1);
            int var11 = 480 / (var9 + 1);
            int var12;
            int var13;
            do {
                var12 = var11;
                var13 = var10;
                if ((var10 - 1) * var11 >= class145.field3356) {
                    var10--;
                }
                if (class145.field3356 <= (var11 - 1) * var10) {
                    var11--;
                }
                if ((var11 - 1) * var10 >= class145.field3356) {
                    var11--;
                }
            } while (var11 != var12 || var10 != var13);
            int var14 = (480 - var9 * var11) / (var11 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - var8 * var10) / (var10 + 1);
            int var16 = (480 - (var11 - 1) * var14 - var9 * var11) / 2;
            int var17 = var16 + 23;
            int var18 = 0;
            if (var15 > 5) {
                var15 = 5;
            }
            int var19 = (765 - var8 * var10 - (var10 - 1) * var15) / 2;
            int var20 = var19;
            for (int var21 = 0; var21 < class145.field3356; var21++) {
                class11 var22 = class11.field189[var21];
                boolean var23 = true;
                class136 var24 = class19.method140(var22.field197, -114);
                if (var22.field197 == -1) {
                    var23 = false;
                    var24 = class1.field3;
                } else if (var22.field197 > 1980) {
                    var24 = class106.field2507;
                    var23 = false;
                }
                if (var20 <= class18.field360 && var17 <= class142.field3292 && class18.field360 < var8 + var20 && var17 + var9 > class142.field3292 && var23) {
                    class19.field381 = var21;
                    class101.field2430[var22.field181 ? 1 : 0].method65(var20, var17, 128, 16777215);
                } else {
                    class101.field2430[var22.field181 ? 1 : 0].method51(var20, var17);
                }
                if (class154.field3514 != null) {
                    class154.field3514[(var22.field181 ? 8 : 0) + var22.field199].method693(var20 + 29, var17);
                }
                arg2.method724(class19.method140(var22.field182, -81), var20 + 15, var9 / 2 + var17 + 5, 0, -1);
                arg0.method724(var24, var20 + 60, var9 / 2 + var17 - -5, 268435455, -1);
                var17 += var14 + var9;
                var18++;
                if (var11 <= var18) {
                    var20 += var8 + var15;
                    var17 = var16 + 23;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var25 = class14.field279.getGraphics();
            class12.field219.method521(0, 0, 0, var25);
        } catch (Exception var26) {
            class14.field279.repaint();
        }
    }
}
