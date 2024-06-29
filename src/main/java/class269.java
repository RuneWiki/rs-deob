import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class269 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lnn;")
    public static class151 field4083 = new class151("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lwl;")
    public static class452 field4086 = new class452(65, 14);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lwl;")
    public static class452 field4088 = new class452(48, 14);

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Z")
    public static boolean field4089 = false;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field4087;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Ldr;I)V")
    public static final void method1673(class261 arg0, int arg1) {
        field4084++;
        int var2 = class331.field4957;
        int var3 = class353.field5219;
        int var4 = class331.field4946;
        int var5 = class258.field3957 - 3;
        byte var6 = 20;
        if (class351.field5212 == null || class85.field1126 == null) {
            if (class427.field6274.method822(101, class273.field4187) && class427.field6274.method822(-70, class113.field1492)) {
                class351.field5212 = arg0.method378(class4.method36(class427.field6274, class273.field4187, 0), true);
                class4 var7 = class4.method36(class427.field6274, class113.field1492, 0);
                class85.field1126 = arg0.method378(var7, true);
                var7.method33();
                class288.field4377 = arg0.method378(var7, true);
            } else {
                arg0.method358(var2, var3, var4, var6, 255 - class146.field2030 << 24 | class151.field2080, 1);
            }
        }
        if (class351.field5212 != null && class85.field1126 != null) {
            int var8 = (var4 - (class85.field1126.method1227() * 2)) / class351.field5212.method1227();
            for (int var9 = 0; var9 < var8; var9++) {
                class351.field5212.method1408(var2 + class85.field1126.method1227() + (class351.field5212.method1227() * var9), var3);
            }
            class85.field1126.method1408(var2, var3);
            class288.field4377.method1408(var2 + var4 - class288.field4377.method1227(), var3);
        }
        class161.field2244.method873(class302.field4562.method937((byte) -127, class27.field356), 0, var3 + 14, class456.field6768 | 0xFF000000, -1, var2 + 3);
        arg0.method358(var2, var3 + var6, var4, var5 - var6, -class146.field2030 + 255 << 24 | class151.field2080, 1);
        int var10 = class74.field1004.method505((byte) -118);
        int var11 = class74.field1004.method501(arg1 + 60);
        int var12 = 0;
        for (class306 var13 = (class306) class372.field5433.method2514((byte) 61); var13 != null; var13 = (class306) class372.field5433.method2511(47)) {
            int var30 = var3 + var6 + ((-var12 + -1 + class149.field2067) * 16) + 13;
            var12++;
            if (var10 > var2 && var2 + var4 > var10 && (var30 - 13) < var11 && var30 + 4 > var11 && var13.field4615) {
                arg0.method358(var2, var30 - 12, var4, 16, class85.field1170 | 255 - class388.field5755 << 24, 1);
            }
        }
        if ((class183.field2754 == null || class91.field1289 == null || class430.field6314 == null) && class427.field6274.method822(71, class244.field3664) && class427.field6274.method822(-41, class32.field414) && class427.field6274.method822(114, class201.field3030)) {
            class4 var14 = class4.method36(class427.field6274, class32.field414, 0);
            class91.field1289 = arg0.method378(var14, true);
            var14.method33();
            class99.field1362 = arg0.method378(var14, true);
            class183.field2754 = arg0.method378(class4.method36(class427.field6274, class244.field3664, 0), true);
            class4 var15 = class4.method36(class427.field6274, class201.field3030, 0);
            class430.field6314 = arg0.method378(var15, true);
            var15.method33();
            class416.field6181 = arg0.method378(var15, true);
        }
        if (class183.field2754 != null && class91.field1289 != null && class430.field6314 != null) {
            int var16 = (var4 - (class430.field6314.method1227() * 2)) / class183.field2754.method1227();
            for (int var17 = 0; var17 < var16; var17++) {
                class183.field2754.method1408(var2 + class430.field6314.method1227() + class183.field2754.method1227() * var17, -class183.field2754.method1229() + (var3 - -var5));
            }
            int var18 = (var5 - var6 - class430.field6314.method1229()) / class91.field1289.method1229();
            for (int var19 = 0; var19 < var18; var19++) {
                class91.field1289.method1408(var2, var6 + (var3 + (class91.field1289.method1229() * var19)));
                class99.field1362.method1408(var2 + var4 - class99.field1362.method1227(), var19 * class91.field1289.method1229() + var3 + var6);
            }
            class430.field6314.method1408(var2, var3 + var5 - class430.field6314.method1229());
            class416.field6181.method1408(var2 + var4 - class430.field6314.method1227(), var5 + var3 + -class430.field6314.method1229());
        }
        int var20 = 0;
        for (class306 var21 = (class306) class372.field5433.method2514((byte) 61); var21 != null; var21 = (class306) class372.field5433.method2511(22)) {
            int var22 = (class149.field2067 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class456.field6768 | 0xFF000000;
            if (var2 < var10 && var10 < var2 + var4 && (var22 - 13) < var11 && var11 < var22 + 4 && var21.field4615) {
                var23 = class424.field6239 | 0xFF000000;
            }
            int[] var24 = null;
            if (class68.method466(23, var21.field4616)) {
                var24 = class186.field2796.method1106(50, (int) var21.field4626).field2357;
            } else if (class55.method316(arg1 + 111, var21.field4616)) {
                class155 var27 = class170.field2626[(int) var21.field4626];
                if (var27 != null) {
                    class271 var28 = var27.field2137;
                    if (var28.field4100 != null) {
                        var28 = var28.method1684(arg1 - 10);
                    }
                    if (var28 != null) {
                        var24 = var28.field4130;
                    }
                }
            } else if (class238.method1429(var21.field4616, -35)) {
                Object var25 = null;
                class85 var26;
                if (var21.field4616 == 1002) {
                    var26 = class411.method2575(0, (int) var21.field4626);
                } else {
                    var26 = class411.method2575(0, (int) (var21.field4626 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field1133 != null) {
                    var26 = var26.method542(6796);
                }
                if (var26 != null) {
                    var24 = var26.field1177;
                }
            }
            String var29 = class324.method1991(var21, arg1 ^ 0xFFFFFFEF);
            if (var24 != null) {
                var29 = var29 + class106.method661((byte) -58, var24);
            }
            class161.field2244.method870(class407.field6065, class304.field4590, 0, 0, var2 + 3, var22, var29, var23);
            if (var21.field4622) {
                class153.field2101.method1408(var2 + class188.field2828.method1693(-95, var29) + 5, var22 + -12);
            }
            var20++;
        }
        if (arg1 != 16) {
            field4083 = null;
        }
        class296.method1835(class353.field5219, arg1 ^ 0x3D, class331.field4957, class258.field3957, class331.field4946);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method1674(int arg0, int arg1) {
        field4085++;
        class38.field462.method1481(3, arg1);
        if (arg0 >= -9) {
            method1673((class261) null, -86);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Ldr;I)V")
    public abstract void method15(class261 arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1675(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class254.field3869 = arg0;
        class26.field337 = 0x1 << class254.field3869;
        class267.field4058 = class26.field337 >> 1;
        class20.field277 = (int) Math.sqrt((double) (class267.field4058 * class267.field4058 + class267.field4058 * class267.field4058));
        class275.field4206 = arg2;
        class265.field4044 = arg3;
        class246.field3690 = arg4;
        class17.field251 = new class13[arg1][class275.field4206][class265.field4044];
        class85.field1201 = new class143[arg1];
        if (arg5) {
            class103.field1393 = new class13[1][class275.field4206][class265.field4044];
            class246.field3684 = new int[class275.field4206][class265.field4044];
            class154.field2118 = new class143[1];
        } else {
            class103.field1393 = null;
            class246.field3684 = null;
            class154.field2118 = null;
        }
        if (arg6) {
            class452.field6688 = new long[arg1][arg2][arg3];
            class281.field4303 = new class21[65535];
            class154.field2117 = new boolean[65535];
            class358.field5278 = 0;
        } else {
            class452.field6688 = null;
            class281.field4303 = null;
            class154.field2117 = null;
            class358.field5278 = 0;
        }
        class94.method617(false);
        class176.field2676 = new class112[500];
        class377.field5496 = 0;
        class191.field2848 = new class112[500];
        class453.field6723 = 0;
        client.field6665 = new int[arg1][class275.field4206 + 1][class265.field4044 + 1];
        class360.field5318 = new class141[5000];
        class15.field190 = 0;
        class423.field6230 = new boolean[class246.field3690 + class246.field3690 + 1][class246.field3690 + class246.field3690 + 1];
        class60.field774 = new boolean[class246.field3690 + class246.field3690 + 2][class246.field3690 + class246.field3690 + 2];
        class426.field6271 = null;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4087 = null;
        field4083 = null;
        field4088 = null;
        if (arg0 == 14793) {
            field4086 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILdr;I)Z")
    public abstract boolean method4(int arg0, int arg1, class261 arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(Ldr;I)Lkq;")
    public abstract class70 method10(class261 arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)Z")
    public abstract boolean method112(boolean arg0);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILef;)Lgs;")
    public static final class383 method1677(int arg0, class385 arg1) {
        field4082++;
        if (arg0 != 14) {
            field4083 = null;
        }
        class383 var2 = new class383();
        var2.field5585 = arg1.method2323(-126);
        var2.field5581 = class75.method495((byte) -10, var2.field5585);
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public abstract void method116(byte arg0);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public abstract void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6);
}
