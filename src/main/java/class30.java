import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class30 {

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lvd;")
    private class258 field433;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field425 = -1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field430 = 0;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[I")
    public static int[] field435 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ldp;")
    public static class347 field427 = new class347(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Ldp;")
    public static class347 field436 = new class347("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field437;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field438;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field431;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method271(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ae", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field429++;
        this.field433.method1559(false, this.field432);
        super.finalize();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILya;)Z", line = 20)
    public static final boolean method268(byte arg0, int arg1, class11 arg2) {
        field437++;
        int var3 = (class50.field640 - 104) / 2;
        int var4 = (class448.field6611 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class41.method328(var52, 2, var51, arg1, var6)) {
                        int var53 = var52;
                        if (class252.method1506(0, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class110.method857(var51, (byte) -79, var6, var53);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class389.field5862 = arg2.method103(var7, 0, 512, 512, 512);
        class384.method2301(64);
        if (arg0 >= -19) {
            return true;
        }
        int var9 = 238 - (10 - ((int) (Math.random() * 20.0D)) - ((-10 + 238 + (int) (Math.random() * 20.0D) << 16) - -(238 - -((int) (Math.random() * 20.0D)) + -10 << 8))) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0x3F1FFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class445.field6563][class445.field6563];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class445.field6563) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class445.field6563) {
                arg2.method84(0, 0, class445.field6563 * 4, class445.field6563 * 4);
                arg2.method85(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class445.field6563; var44++) {
                        for (int var50 = 0; var50 < class445.field6563; var50++) {
                            var12[var44][var50] = class41.method328(var37, 2, var36 + var50, arg1, var13 + var44);
                        }
                    }
                    class213.field3048[var37].method713(0, 0, 1024, var13, var36, class445.field6563 + var13, class445.field6563 + var36, var12);
                    if (!class116.field1748) {
                        for (int var45 = -4; var45 < class445.field6563; var45++) {
                            for (int var46 = -4; var46 < class445.field6563; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var48 >= var4 && class41.method328(var37, 2, var48, arg1, var47)) {
                                    int var49 = var37;
                                    if (class252.method1506(0, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class161.method1138((class445.field6563 - var46) * 4 - 4, (byte) 27, var48, var49, var45 * 4, var47, arg2, var9, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class116.field1748) {
                    class311 var38 = class151.field2300[arg1];
                    for (int var39 = 0; var39 < class445.field6563; var39++) {
                        for (int var40 = 0; var40 < class445.field6563; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field4819[var41 - var38.field4813][var42 - var38.field4820];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method67(94, 4, -1713569622, var39 * 4, 4, (class445.field6563 - var40) * 4 - 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method107(var39 * 4, -1713569622, (byte) -90, (class445.field6563 - var40) * 4 - 4, 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method121((class445.field6563 - var40) * 4 - 4, 4, (byte) 17, -1713569622, var39 * 4 + 3);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method107(var39 * 4, -1713569622, (byte) -90, (class445.field6563 - var40) * 4 - 1, 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method121((class445.field6563 - var40) * 4 - 4, 4, (byte) 90, -1713569622, var39 * 4);
                            }
                        }
                    }
                }
                arg2.method162(0, 0, class445.field6563 * 4, class445.field6563 * 4, var11, 2);
                class389.field5862.method298((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class445.field6563 * 4) + 464, class445.field6563 * 4, class445.field6563 * 4, 0, 0);
            }
        }
        arg2.method94();
        arg2.method85(-16777215);
        class134.method988(-28945);
        class515.field7563 = 0;
        class182.field2705.method2955(2131289328);
        if (!class116.field1748) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class41.method328(var21, 2, var20, arg1, var14)) {
                            class401 var22 = (class401) class341.method2081(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class401) class534.method3160(var21, var14, var20, field438 == null ? (field438 = method271("gf")) : field438);
                            }
                            if (var22 == null) {
                                var22 = (class401) class222.method1406(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class401) class118.method886(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class486 var23 = class119.field1824.method248(var22.method240(-15578), 30);
                                if (!var23.field7243 || class125.field1884) {
                                    int var24 = var23.field7168;
                                    if (var23.field7219 != null) {
                                        for (int var25 = 0; var25 < var23.field7219.length; var25++) {
                                            if (var23.field7219[var25] != -1) {
                                                class486 var26 = class119.field1824.method248(var23.field7219[var25], 30);
                                                if (var26.field7168 >= 0) {
                                                    var24 = var26.field7168;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class473 var28 = class36.field497.method699(var24, 124);
                                            if (var28 != null && var28.field6946) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class151.field2300[var21].field4819;
                                            int var32 = class151.field2300[var21].field4813;
                                            int var33 = class151.field2300[var21].field4820;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 103 > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class249.field3404[class515.field7563] = var23.field7207;
                                        class164.field2440[class515.field7563] = var29;
                                        class535.field7868[class515.field7563] = var30;
                                        class515.field7563++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (client.field7541 != null) {
                class292.field4376.field1051 = 1;
                class36.field497.method702(1024, -14845, 64);
                for (int var15 = 0; var15 < client.field7541.field4349; var15++) {
                    int var16 = client.field7541.field4348[var15];
                    if (var16 >> 28 == class410.field6198.field7686) {
                        int var17 = ((var16 & 0xFFFD927) >> 14) - class267.field3979;
                        int var18 = (var16 & 0x3FFF) - class241.field3358;
                        if (var17 >= 0 && class50.field640 > var17 && var18 >= 0 && var18 < class448.field6611) {
                            class182.field2705.method2958(new class221(var15), (byte) 52);
                        } else {
                            class473 var19 = class36.field497.method699(client.field7541.field4350[var15], 121);
                            if (var19.field6951 != null && (var19.field6970 + var17) >= 0 && (var17 + var19.field6949) < class50.field640 && var19.field6969 + var18 >= 0 && var19.field6961 + var18 < class448.field6611) {
                                class182.field2705.method2958(new class221(var15), (byte) 32);
                            }
                        }
                    }
                }
                class36.field497.method702(128, -14845, 64);
                class292.field4376.field1051 = 2;
                class292.field4376.method517((byte) 9);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V", line = 434)
    public static final void method269(byte arg0, int arg1) {
        field426++;
        class473.field6977 = arg1;
        if (arg0 >= -33) {
            method270((byte) -42);
        }
        field425 = -1;
        field425 = -1;
        class239.method1468((byte) -61);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lvd;II)V", line = 458)
    public class30(class258 arg0, int arg1, int arg2) {
        this.field432 = arg2;
        this.field433 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 474)
    public static void method270(byte arg0) {
        field427 = null;
        field435 = null;
        int var1 = -52 % ((arg0 - 28) / 54);
        field436 = null;
        field431 = null;
    }
}
