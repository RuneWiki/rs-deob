import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class51 extends class305 {

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "Lvg;")
    public static class56 field785;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
    public static final void method332(int arg0, int arg1) {
        field778++;
        class87.field1428 = arg0;
        class317.field4831.method1637((byte) 13);
        if (arg1 <= 45) {
            field785 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public static final void method333(int arg0) {
        class443.field6591 = null;
        field779++;
        int var1 = -21 / ((19 - arg0) / 37);
        class124.field1855 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lla;Ljava/lang/String;IZ)V")
    public static final void method334(class310 arg0, String arg1, int arg2, boolean arg3) {
        field783++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = arg2 + var4;
        int var7 = class114.field1755.method173(250, arg1, -11352, null);
        int var8 = class114.field1755.method172(250, arg1, null, (byte) 110) * 13;
        class376.field5542.method506(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var4 + var8, -16777216, 0);
        class376.field5542.method602(var5 - var4, -var4 + var6, var4 + var4 + var7, var8 - -var4 - -var4, -1, 0);
        arg0.method2059(null, 1, 0, 0, -1, 0, null, var6, null, var8, var7, 1, arg1, var5, -1, 0);
        class252.method1795(var4 + var8 + var4, -var4 + var5, var6 - var4, var4 + var7 + var4, false);
        if (arg3) {
            class376.field5542.method530();
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static void method335(int arg0) {
        if (arg0 >= -68) {
            field784 = 10;
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZIIIII)V")
    public static final void method336(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field781++;
        int var7 = class422.field6205;
        int[] var8 = class506.field7363;
        class347.field5179 = 0;
        for (int var9 = 0; var9 < var7 + class231.field3482; var9++) {
            class171 var32 = null;
            class521 var33;
            if (var7 <= var9) {
                var33 = ((class5) class366.field5398.method358((byte) 58, (long) class234.field3513[var9 - var7])).field65;
                var32 = ((class46) var33).field718;
                if (var32.field2611 != null) {
                    var32 = var32.method1221(class288.field4476, 0);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class530.field7747[var8[var9]];
            }
            if (var33.field7593 >= 0 && (class334.field5036 == var33.field7581 || class116.field1781.field1274 == var33.field1274)) {
                class75.method692(var33.method304((byte) -117), 0, arg3 >> 1, var33, arg5, arg0 >> 1, arg2);
                if (class370.field5458[0] >= 0) {
                    if (var33.field7608 != null && (var7 <= var9 || class29.field311 == 0 || class29.field311 == 3 || class29.field311 == 1 && class183.method1279(65, ((class511) var33).field7437)) && class347.field5179 < class392.field5724) {
                        class392.field5725[class347.field5179] = class447.field6643.method174(var33.field7608, (byte) -48) / 2;
                        class392.field5729[class347.field5179] = class370.field5458[0];
                        class392.field5726[class347.field5179] = class370.field5458[1];
                        class392.field5731[class347.field5179] = var33.field7609;
                        class392.field5727[class347.field5179] = var33.field7557;
                        class392.field5723[class347.field5179] = var33.field7570;
                        class392.field5730[class347.field5179] = var33.field7608;
                        class347.field5179++;
                    }
                    int var34 = class370.field5458[1] + arg6;
                    int var45;
                    if (var33.field7568 || class446.field6625 >= var33.field7634) {
                        var45 = var34 - Math.max(class447.field6643.field313, class203.field3138[0].method399());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class511 var37 = class530.field7747[var8[var9]];
                            var38 = var33.method3101(-1).field6989;
                            if (var37.field7448) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field2599;
                            if (var38 == -1) {
                                var38 = var33.method3101(-1).field6989;
                            }
                        }
                        class363[] var39 = class203.field3138;
                        if (var38 != -1) {
                            class363[] var40 = (class363[]) class81.field1329.method1634((long) var38, 64);
                            if (var40 == null) {
                                class309[] var41 = class309.method2045(class510.field7431, var38, 0);
                                if (var41 != null) {
                                    var40 = new class363[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class376.field5542.method574(var41[var42], true);
                                    }
                                    class81.field1329.method1623((long) var38, 17621, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class363 var43 = var39[0];
                        class363 var44 = var39[var36];
                        var45 = var34 - Math.max(class447.field6643.field313, var43.method399());
                        int var46 = class370.field5458[0] + arg4 - (var43.method398() >> 1);
                        int var47 = var43.method398() * var33.field7600 / 255;
                        if (var33.field7600 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2316(var46, var45);
                        class376.field5542.method599(var46, var45, var46 + var47, var43.method399() + var45);
                        var44.method2316(var46, var45);
                        class376.field5542.method571(arg4, arg6, arg4 + arg0, arg6 - -arg3);
                    }
                    var45 -= 2;
                    if (!var33.field7568) {
                        if (class446.field6625 < var33.field7571) {
                            class363 var48 = class12.field130[var33.field7560 ? 2 : 0];
                            class363 var49 = class12.field130[var33.field7560 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class46)) {
                                var51 = var32.field2631;
                                if (var51 == -1) {
                                    var51 = var33.method3101(-1).field7022;
                                }
                            } else {
                                var51 = var33.method3101(-1).field7022;
                            }
                            if (var51 != -1) {
                                class363[] var52 = (class363[]) class531.field7750.method1634((long) var51, 64);
                                if (var52 == null) {
                                    class309[] var53 = class309.method2045(class510.field7431, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class363[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class376.field5542.method574(var53[var54], true);
                                        }
                                        class531.field7750.method1623((long) var51, 17621, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field7560 ? 2 : 0];
                                    var49 = var52[var33.field7560 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field7571 - class446.field6625;
                            int var58;
                            if (var55 > var33.field7569) {
                                int var56 = var55 - var33.field7569;
                                int var57 = var33.field7632 == 0 ? 0 : (var33.field7583 - var56) / var33.field7632 * var33.field7632;
                                var58 = var48.method398() * var57 / var33.field7583;
                            } else {
                                var58 = var48.method398();
                            }
                            int var59 = var48.method399();
                            var45 -= var59;
                            int var60 = arg4 + class370.field5458[0] - (var48.method398() >> 1);
                            var48.method2316(var60, var45);
                            class376.field5542.method599(var60, var45, var58 + var60, var45 + var59);
                            var49.method2316(var60, var45);
                            var45 -= 2;
                            class376.field5542.method571(arg4, arg6, arg0 + arg4, arg6 - -arg3);
                        }
                        if (var7 > var9) {
                            class511 var62 = (class511) var33;
                            if (var62.field7470 != -1) {
                                var45 -= 25;
                                class437.field6513[var62.field7470].method2316(arg4 + class370.field5458[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field7473 != -1) {
                                var45 -= 25;
                                class360.field5315[var62.field7473].method2316(arg4 + class370.field5458[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field2581 >= 0 && var32.field2581 < class360.field5315.length) {
                            var45 -= 25;
                            class363 var61 = class360.field5315[var32.field2581];
                            var61.method2316(arg4 + (class370.field5458[0] - (var61.method398() >> 1)), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class511)) {
                        int var63 = 0;
                        class417[] var64 = class292.field4519;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class417 var67 = var64[var65];
                            if (var67 != null && var67.field6122 == 1 && class234.field3513[var9 - var7] == var67.field6121) {
                                class363 var68 = class522.field7668[var67.field6128];
                                if (var63 < var68.method399()) {
                                    var63 = var68.method399();
                                }
                                if ((class446.field6625 % 20) < 10) {
                                    var68.method2316(class370.field5458[0] + arg4 - 12, -var68.method399() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class417[] var70 = class292.field4519;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class417 var73 = var70[var71];
                            if (var73 != null && var73.field6122 == 10 && var8[var9] == var73.field6121) {
                                class363 var74 = class522.field7668[var73.field6128];
                                if (var74.method399() > var69) {
                                    var69 = var74.method399();
                                }
                                var74.method2316(arg4 + class370.field5458[0] - 12, var45 + -var74.method399());
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (var33.field7556[var75] > class446.field6625) {
                            int var76 = var33.method304((byte) -105) / 2;
                            class75.method692(var76, 0, arg3 >> 1, var33, arg5, arg0 >> 1, arg2);
                            if (class370.field5458[0] > -1) {
                                int var77 = class401.field5914[var33.field7566[var75]].method398();
                                if (var75 == 1) {
                                    class370.field5458[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class370.field5458[0] -= var77 - 9;
                                    class370.field5458[1] -= 10;
                                }
                                if (var75 == 3) {
                                    class370.field5458[0] += var77 - 9;
                                    class370.field5458[1] -= 10;
                                }
                                class401.field5914[var33.field7566[var75]].method2316(class370.field5458[0] + arg4 - (var77 >> 1), class370.field5458[1] + -12 + arg6);
                                class532.field7770.method2047(class370.field5458[0] + arg4 - 1, Integer.toString(var33.field7582[var75]), class370.field5458[1] + arg6 + 3, -1, -1, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class532.field7774; var10++) {
            int var28 = class209.field3196[var10];
            class521 var29;
            if (var28 >= 2048) {
                var29 = ((class5) class366.field5398.method358((byte) -125, (long) (var28 - 2048))).field65;
            } else {
                var29 = class530.field7747[var28];
            }
            int var30 = class232.field3488[var10];
            class521 var31;
            if (var30 >= 2048) {
                var31 = ((class5) class366.field5398.method358((byte) -120, (long) (var30 - 2048))).field65;
            } else {
                var31 = class530.field7747[var30];
            }
            class103.method833(arg2, var31, arg5, arg4, var29, --var29.field7622, arg3, arg6, arg0, -94);
        }
        int var11 = class447.field6643.field313 + class447.field6643.field316 + 2;
        if (arg1) {
            field784 = -93;
        }
        for (int var12 = 0; var12 < class347.field5179; var12++) {
            int var13 = class392.field5729[var12];
            int var14 = class392.field5726[var12];
            int var15 = class392.field5725[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class392.field5726[var27] - var11) && (class392.field5726[var27] + 2) > (var14 - var11) && (class392.field5729[var27] + class392.field5725[var27]) > (var13 - var15) && var13 + var15 > class392.field5729[var27] + -class392.field5725[var27] && (class392.field5726[var27] - var11) < var14) {
                        var14 = class392.field5726[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class392.field5726[var12] = var14;
            String var17 = class392.field5730[var12];
            if (class216.field3265 == 0) {
                int var18 = 16776960;
                if (class392.field5731[var12] < 6) {
                    var18 = class263.field4178[class392.field5731[var12]];
                }
                if (class392.field5731[var12] == 6) {
                    var18 = (class334.field5036 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class392.field5731[var12] == 7) {
                    var18 = class334.field5036 % 20 < 10 ? 255 : 65535;
                }
                if (class392.field5731[var12] == 8) {
                    var18 = (class334.field5036 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class392.field5731[var12] == 9) {
                    int var19 = 150 - class392.field5723[var12];
                    if (var19 < 50) {
                        var18 = (var19 * 1280) + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - var19 * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class392.field5731[var12] == 10) {
                    int var20 = 150 - class392.field5723[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = ((var20 + -100) * 327680) + 255 + 500 - (var20 * 5);
                    }
                }
                if (class392.field5731[var12] == 11) {
                    int var21 = 150 - class392.field5723[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 32768000 - (var21 * 327680 - 16777215);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class392.field5727[var12] == 0) {
                    class441.field6573.method2047(arg4 + var13, var17, arg6 + var14, var22, -1, -16777216);
                }
                if (class392.field5727[var12] == 1) {
                    class441.field6573.method2051(arg4 + var13, -16777216, var17, arg6 + var14, (byte) -104, class334.field5036, var22);
                }
                if (class392.field5727[var12] == 2) {
                    class441.field6573.method2053(class334.field5036, var17, var22, (byte) -100, arg4 + var13, -16777216, arg6 + var14);
                }
                if (class392.field5727[var12] == 3) {
                    class441.field6573.method2055(var17, -16777216, 30319, class334.field5036, var22, 150 - class392.field5723[var12], arg6 + var14, arg4 + var13);
                }
                if (class392.field5727[var12] == 4) {
                    int var23 = (150 - class392.field5723[var12]) * (class447.field6643.method174(var17, (byte) -74) + 100) / 150;
                    class376.field5542.method599(arg4 + var13 - 50, arg6, var13 + arg4 + 50, arg6 - -arg3);
                    class441.field6573.method2052(-16777216, var17, var22, true, arg4 + 50 - (-var13 + var23), arg6 + var14);
                    class376.field5542.method571(arg4, arg6, arg0 + arg4, arg6 - -arg3);
                }
                if (class392.field5727[var12] == 5) {
                    int var24 = 150 - class392.field5723[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class447.field6643.field316 + class447.field6643.field313;
                    class376.field5542.method599(arg4, var14 + arg6 - var26 - 1, arg0 + arg4, arg6 - (-var14 - 5));
                    class441.field6573.method2047(arg4 + var13, var17, arg6 + var14 + var25, var22, -1, -16777216);
                    class376.field5542.method571(arg4, arg6, arg0 + arg4, arg3 + arg6);
                }
            } else {
                class441.field6573.method2047(arg4 + var13, var17, arg6 + var14, -256, -1, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lum;Lum;Lum;Lum;B)V")
    public static final void method337(class83 arg0, class83 arg1, class83 arg2, class83 arg3, byte arg4) {
        class254.field4106 = arg0;
        class511.field7444 = arg3;
        class184.field2814 = arg1;
        int var5 = 42 / ((arg4 - 47) / 61);
        class503.field7314 = arg2;
        field782++;
        class237.field3555 = new class38[class254.field4106.method754(false)][];
        class327.field4950 = new boolean[class254.field4106.method754(false)];
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
    public static final void method338(int arg0, int arg1) {
        field776++;
        class188 var2 = class10.method48((byte) 50, 8, arg0);
        int var3 = 65 / ((-arg1 - 32) / 46);
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)Z")
    public static final boolean method339(int arg0, int arg1, int arg2) {
        field780++;
        if (arg0 != 0) {
            method337(null, null, null, null, (byte) 90);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            method335(-26);
        }
        field777++;
        return class78.field1298;
    }

    static {
        new class179("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        new class179("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field784 = -1;
        new class179("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field785 = new class56(32);
    }
}
