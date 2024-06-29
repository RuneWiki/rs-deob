import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class277 extends class372 {

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    public int[] field3956;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
    public int[] field3958;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Ldc;")
    public static class5 field3959;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3957;

    static {
        new class194("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        new class194("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field3959 = new class5(64);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 3)
    public static final String method1697(int arg0, String[] arg1, int arg2, int arg3) {
        field3957++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (arg0 != 7184) {
                method1699(-107, (byte) -122, null, 111);
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 71)
    public static void method1698(byte arg0) {
        if (arg0 <= 43) {
            field3959 = null;
        }
        field3959 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBLeq;I)V", line = 89)
    public static final void method1699(int arg0, byte arg1, class134 arg2, int arg3) {
        field3955++;
        if (arg0 < 0 || arg3 < 0 || class494.field7533 == 0 || class504.field7696 == 0) {
            return;
        }
        arg2.method769(class483.field6999, client.field2674, class494.field7533, class504.field7696);
        arg2.method810(class245.field3526, class98.field1337, class494.field7533, class504.field7696);
        class33 var4 = arg2.method823();
        var4.method265(class391.field5798, class246.field3537, class139.field1826, class45.field677, class445.field6492, class260.field3721);
        arg2.method837(var4);
        if (class459.field6685 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method757();
            int var8 = (arg0 - class483.field6999) * var7 / class494.field7533;
            int var9 = (arg3 - client.field2674) * var7 / class504.field7696;
            int var10 = arg2.method752();
            int var11 = (arg0 - class483.field6999) * var10 / class494.field7533;
            int var12 = (arg3 - client.field2674) * var10 / class504.field7696;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method272(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method272(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class362.field5442 && var22 < class203.field2813) {
                    int var23 = class415.field6145.field2956;
                    if (var23 < 3 && (class379.field5661[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class459.field6685[var23].method855(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class415.field6145.method1773(-11) - 1 << 6) + var19 >> 7;
                        var6 = (class415.field6145.method1773(arg1 + 38) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class288.field4128 && (class278.field3963 & 0x40) != 0) {
                    class356 var24 = class236.method1433(class71.field1052, class303.field4394, (byte) 99);
                    if (var24 == null) {
                        class489.method2941(arg1 + 77);
                    } else {
                        class495.method2974(true, 0L, 50, class457.field6660, -1, var5, -1, " ->", var6, false, class272.field3802);
                    }
                } else {
                    if (class28.field486 == class156.field1996) {
                        class495.method2974(true, 0L, 19, class278.field3961.method1220(2969, class81.field1122), -1, var5, -1, "", var6, false, -1);
                    }
                    class495.method2974(true, 0L, 58, class226.field3193, -1, var5, -1, "", var6, false, class138.field1807);
                    class112.field1465++;
                }
            }
        }
        class30 var25 = class253.field3653;
        for (class408 var26 = (class408) var25.method242(false); var26 != null; var26 = (class408) var25.method244((byte) -73)) {
            if (class415.field6145.field2956 == var26.field5981 && var26.method2440(0, arg3, arg0, arg2)) {
                if (var26.field5985 instanceof class313) {
                    class313 var27 = (class313) var26.field5985;
                    int var28 = var27.method1773(-104);
                    if ((var28 & 0x1) == 0 && (var27.field2959 & 0x7F) == 0 && (var27.field2966 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field2959 & 0x7F) == 64 && (var27.field2966 & 0x7F) == 64) {
                        int var29 = var27.field2959 - (var27.method1773(-14) - 1 << 6);
                        int var30 = var27.field2966 - (var27.method1773(-11) - 1 << 6);
                        for (int var31 = 0; var31 < class339.field4942; var31++) {
                            class139 var38 = class504.field7697[class263.field3749[var31]];
                            if (var38 != null && class263.field3748 != var38.field4199 && var38.field4185) {
                                int var39 = var38.field2959 - (var38.field1825.field3806 - 1 << 6);
                                int var40 = var38.field2966 - (var38.field1825.field3806 - 1 << 6);
                                if (var29 <= var39 && var38.field1825.field3806 <= var27.method1773(-35) - (var39 - var29 >> 7) && var40 >= var30 && var38.field1825.field3806 <= (var27.method1773(-102) - (var40 - var30 >> 7))) {
                                    class56.method421(-114, class415.field6145.field2956 != var26.field5981, var38);
                                    var38.field4199 = class263.field3748;
                                }
                            }
                        }
                        int var32 = class276.field3953;
                        int[] var33 = class330.field4790;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class313 var35 = class262.field3742[var33[var34]];
                            if (var35 != null && class263.field3748 != var35.field4199 && var27 != var35 && var35.field4185) {
                                int var36 = var35.field2959 - (var35.method1773(-78) - 1 << 6);
                                int var37 = var35.field2966 - (var35.method1773(-38) - 1 << 6);
                                if (var36 >= var29 && var35.method1773(-92) <= (var27.method1773(-103) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method1773(-90) <= (var27.method1773(-64) - (var37 - var30 >> 7))) {
                                    class330.method1985((byte) 127, var35, class415.field6145.field2956 != var26.field5981);
                                    var35.field4199 = class263.field3748;
                                }
                            }
                        }
                    }
                    if (class263.field3748 == var27.field4199) {
                        continue;
                    }
                    class330.method1985((byte) 76, var27, class415.field6145.field2956 != var26.field5981);
                    var27.field4199 = class263.field3748;
                }
                if (var26.field5985 instanceof class139) {
                    class139 var41 = (class139) var26.field5985;
                    if (var41.field1825 != null) {
                        if ((var41.field1825.field3806 & 0x1) == 0 && (var41.field2959 & 0x7F) == 0 && (var41.field2966 & 0x7F) == 0 || (var41.field1825.field3806 & 0x1) == 1 && (var41.field2959 & 0x7F) == 64 && (var41.field2966 & 0x7F) == 64) {
                            int var42 = var41.field2959 - (var41.field1825.field3806 - 1 << 6);
                            int var43 = var41.field2966 - (var41.field1825.field3806 - 1 << 6);
                            for (int var44 = 0; var44 < class339.field4942; var44++) {
                                class139 var51 = class504.field7697[class263.field3749[var44]];
                                if (var51 != null && class263.field3748 != var51.field4199 && var41 != var51 && var51.field4185) {
                                    int var52 = var51.field2959 - (var51.field1825.field3806 - 1 << 6);
                                    int var53 = var51.field2966 - (var51.field1825.field3806 - 1 << 6);
                                    if (var52 >= var42 && var51.field1825.field3806 <= (var41.field1825.field3806 - (var52 - var42 >> 7)) && var43 <= var53 && var51.field1825.field3806 <= (var41.field1825.field3806 - (var53 - var43 >> 7))) {
                                        class56.method421(arg1 ^ 0xFFFFFFC7, class415.field6145.field2956 != var26.field5981, var51);
                                        var51.field4199 = class263.field3748;
                                    }
                                }
                            }
                            int var45 = class276.field3953;
                            int[] var46 = class330.field4790;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class313 var48 = class262.field3742[var46[var47]];
                                if (var48 != null && class263.field3748 != var48.field4199 && var48.field4185) {
                                    int var49 = var48.field2959 - (var48.method1773(-128) - 1 << 6);
                                    int var50 = var48.field2966 - (var48.method1773(arg1 - 37) - 1 << 6);
                                    if (var49 >= var42 && var48.method1773(-25) <= var41.field1825.field3806 - (var49 - var42 >> 7) && var50 >= var43 && var48.method1773(-118) <= var41.field1825.field3806 - (var50 - var43 >> 7)) {
                                        class330.method1985((byte) 93, var48, class415.field6145.field2956 != var26.field5981);
                                        var48.field4199 = class263.field3748;
                                    }
                                }
                            }
                        }
                        if (class263.field3748 == var41.field4199) {
                            continue;
                        }
                        class56.method421(85, class415.field6145.field2956 != var26.field5981, var41);
                        var41.field4199 = class263.field3748;
                    }
                }
                if (var26.field5985 instanceof class276) {
                    class414 var54 = (class414) class473.field6838.method2310((byte) -126, (long) (var26.field5981 << 28 | var26.field5980 << 14 | var26.field5979));
                    if (var54 != null) {
                        for (class231 var55 = (class231) var54.field6139.method2094(arg1 ^ 0xFFFFFFBA); var55 != null; var55 = (class231) var54.field6139.method2098(0)) {
                            class361 var56 = class405.field5947.method1162(var55.field3226, 0);
                            if (!class288.field4128) {
                                if (class415.field6145.field2956 == var26.field5981) {
                                    String[] var58 = var56.field5355;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 6;
                                            }
                                            int var61 = class187.field2656;
                                            if (var59 == 1) {
                                                var60 = 15;
                                            }
                                            if (var59 == 2) {
                                                var60 = 11;
                                            }
                                            if (var59 == 3) {
                                                var60 = 16;
                                            }
                                            if (var56.field5377 == var59) {
                                                var61 = var56.field5408;
                                            }
                                            if (var59 == 4) {
                                                var60 = 25;
                                            }
                                            if (var56.field5395 == var59) {
                                                var61 = var56.field5384;
                                            }
                                            class144.field1861++;
                                            class495.method2974(true, (long) var55.field3226, var60, var58[var59], -1, var26.field5979, -1, "<col=ff9040>" + var56.field5353, var26.field5980, false, var61);
                                        }
                                    }
                                }
                                class495.method2974(true, (long) var55.field3226, 1004, class64.field956.method1220(arg1 ^ 0xFFFFF42B, class81.field1122), -1, var26.field5979, -1, "<col=ff9040>" + var56.field5353, var26.field5980, class415.field6145.field2956 != var26.field5981, class232.field3237);
                                class484.field7004++;
                            } else if (class415.field6145.field2956 == var26.field5981) {
                                class483 var57 = class450.field6554 == -1 ? null : class228.field3209.method1536((byte) -123, class450.field6554);
                                if ((class278.field3963 & 0x1) != 0 && (var57 == null || var56.method2195((byte) -121, class450.field6554, var57.field7000) != var57.field7000)) {
                                    class219.field3087++;
                                    class495.method2974(true, (long) var55.field3226, 45, class457.field6660, arg1 ^ 0x4D, var26.field5979, -1, class211.field2998 + " -> <col=ff9040>" + var56.field5353, var26.field5980, false, class272.field3802);
                                }
                            }
                        }
                    }
                }
                if (var26.field5985 instanceof class113) {
                    class113 var62 = (class113) var26.field5985;
                    class486 var63 = class114.field1471.method2132((byte) 125, var62.method369((byte) 82));
                    if (var63.field7043 != null) {
                        var63 = var63.method2834(class453.field6591, false);
                    }
                    if (var63 != null) {
                        if (!class288.field4128) {
                            if (class415.field6145.field2956 == var26.field5981) {
                                String[] var64 = var63.field7076;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            int var67 = class187.field2656;
                                            if (var65 == 0) {
                                                var66 = 3;
                                            }
                                            if (var65 == 1) {
                                                var66 = 17;
                                            }
                                            if (var65 == 2) {
                                                var66 = 12;
                                            }
                                            if (var65 == 3) {
                                                var66 = 49;
                                            }
                                            if (var63.field7067 == var65) {
                                                var67 = var63.field7045;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1010;
                                            }
                                            if (var63.field7099 == var65) {
                                                var67 = var63.field7057;
                                            }
                                            class188.field2683++;
                                            class495.method2974(true, class288.method1744(var62, 0, var26.field5980, var26.field5979), var66, var64[var65], -1, var26.field5979, -1, "<col=00ffff>" + var63.field7095, var26.field5980, false, var67);
                                        }
                                    }
                                }
                            }
                            class46.field696++;
                            class495.method2974(true, (long) var63.field7046, 1002, class64.field956.method1220(2969, class81.field1122), -1, var26.field5979, -1, "<col=00ffff>" + var63.field7095, var26.field5980, class415.field6145.field2956 != var26.field5981, class232.field3237);
                        } else if (class415.field6145.field2956 == var26.field5981) {
                            class483 var68 = class450.field6554 == -1 ? null : class228.field3209.method1536((byte) -120, class450.field6554);
                            if ((class278.field3963 & 0x4) != 0 && (var68 == null || var63.method2833(arg1 ^ 0xFFFFB008, var68.field7000, class450.field6554) != var68.field7000)) {
                                class93.field1258++;
                                class495.method2974(true, class288.method1744(var62, 0, var26.field5980, var26.field5979), 23, class457.field6660, -1, var26.field5979, -1, class211.field2998 + " -> <col=00ffff>" + var63.field7095, var26.field5980, false, class272.field3802);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -78) {
            method1697(-36, null, -78, 101);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II[I[I)V", line = 551)
    public class277(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3956 = arg2;
        this.field3958 = arg3;
    }
}
