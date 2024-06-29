import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class218 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
    public static boolean field3350 = false;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lbg;")
    public static class310 field3354 = new class310(43, 3);

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lsk;")
    public static class423 field3355 = new class423("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Loe;")
    public static class127 field3356 = new class127(19, 6);

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lvl;")
    public static class11 field3349;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[[I")
    public static int[][] field3348;

    static {
        new class423("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 3)
    public static final int method1335(String arg0, int arg1) {
        if (arg1 == 10) {
            field3353++;
            return class278.method1700(arg0, (byte) 106, 10, true);
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lia;II)Z", line = 14)
    public static final boolean method1336(class399 arg0, int arg1, int arg2) {
        field3352++;
        int var3 = arg0.method2364(arg1, true);
        if (var3 == 0) {
            if (arg0.method2364(1, true) != 0) {
                method1336(arg0, 2, arg2);
            }
            int var4 = arg0.method2364(6, true);
            int var5 = arg0.method2364(6, true);
            boolean var6 = arg0.method2364(1, true) == 1;
            if (var6) {
                class341.field5098[class287.field4352++] = arg2;
            }
            if (class224.field3450[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class322 var7 = class60.field1010[arg2];
            class47 var8 = class224.field3450[arg2] = new class47();
            var8.field2197 = arg2;
            if (class58.field997[arg2] != null) {
                var8.method340((byte) 97, class58.field997[arg2]);
            }
            var8.method902(var7.field4839, (byte) 104);
            var8.field2148 = var7.field4838;
            int var9 = var7.field4837;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field688 = var7.field4840;
            var8.field2234[0] = class86.field1498[arg2];
            var8.field3217 = (byte) var10;
            var8.method336((var12 << 6) + var5 - class320.field4827, -22509, (var11 << 6) + var4 - class381.field5550);
            var8.field691 = false;
            class60.field1010[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method2364(2, true);
            int var14 = class60.field1010[arg2].field4837;
            class60.field1010[arg2].field4837 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method2364(5, true);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class60.field1010[arg2].field4837;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class60.field1010[arg2].field4837 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method2364(18, true);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class60.field1010[arg2].field4837;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var26 + var25 & 0xFF;
            class60.field1010[arg2].field4837 = (var27 << 28) - (-(var28 << 14) - var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V", line = 177)
    public static final void method1337(int arg0, int arg1) {
        class452 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class343 var4 = class201.field3195[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class347.field5132; var5++) {
                    for (int var6 = 0; var6 < class377.field5492; var6++) {
                        var2 = var4.method309(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class239.field3602;
                            int var8 = var5 << class239.field3602;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class343 var10 = class201.field3195[var9];
                                if (var10 != null) {
                                    int var11 = var4.method318(var6, var5) - var10.method318(var6, var5);
                                    int var12 = var4.method318(var6 + 1, var5) - var10.method318(var6 + 1, var5);
                                    int var13 = var4.method318(var6 + 1, var5 + 1) - var10.method318(var6 + 1, var5 + 1);
                                    int var14 = var4.method318(var6, var5 + 1) - var10.method318(var6, var5 + 1);
                                    var10.method304(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 244)
    public static void method1338(int arg0) {
        field3356 = null;
        field3348 = null;
        field3355 = null;
        field3354 = null;
        field3349 = null;
        if (arg0 != 1) {
            field3357 = 105;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 264)
    public static final void method1339(byte arg0) {
        field3351++;
        if (class296.field4492 == class230.field3507) {
            return;
        }
        try {
            class209.method1278(5633, class6.field75, "tbrefresh");
        } catch (Throwable var2) {
        }
        int var1 = 1 / ((arg0 - 5) / 58);
    }
}
