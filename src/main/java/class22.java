import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class22 extends class106 {

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Loc;")
    public static class151 field485 = class137.method873(2, "Lade)3)3)3");

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "Loc;")
    private static class151 field501 = class137.method873(2, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Loc;")
    public static class151 field489 = field501;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "Lmh;")
    public class136 field483;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Lmh;")
    public class136 field498;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Lig;")
    public class93 field480;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[I")
    public static int[] field476;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "[I")
    public int[] field486;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        field479++;
        int var2 = this.field496;
        class93 var3 = this.field480.method591((byte) -115);
        if (var3 == null) {
            this.field486 = null;
            this.field494 = 0;
            this.field475 = 0;
            this.field496 = -1;
            this.field499 = 0;
        } else {
            this.field475 = var3.field1739 * 128;
            this.field496 = var3.field1694;
            this.field486 = var3.field1711;
            this.field499 = var3.field1701;
            this.field494 = var3.field1693;
        }
        if (arg0 > -81) {
            method187(-89, -72, false);
        }
        if (this.field496 != var2 && this.field483 != null) {
            class109.field1937.method757(this.field483);
            this.field483 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public static final void method185(boolean arg0) {
        class1.field39.method1317((byte) 6);
        field477++;
        if (arg0) {
            field485 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)Z")
    public static final boolean method186(int arg0) throws IOException {
        field481++;
        if (class142.field2588 == null) {
            return false;
        }
        int var1 = class142.field2588.method337(true);
        if (var1 == 0) {
            return false;
        }
        if (class219.field3813 == -1) {
            class142.field2588.method334((byte) 95, class1.field34.field4087, 0, 1);
            class1.field34.field4101 = 0;
            var1--;
            class219.field3813 = class1.field34.method654((byte) 12);
            class68.field1329 = class150.field2679[class219.field3813];
        }
        if (class68.field1329 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class142.field2588.method334((byte) 95, class1.field34.field4087, 0, 1);
            var1--;
            class68.field1329 = class1.field34.field4087[0] & 0xFF;
        }
        if (class68.field1329 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class142.field2588.method334((byte) 95, class1.field34.field4087, 0, 2);
            class1.field34.field4101 = 0;
            var1 -= 2;
            class68.field1329 = class1.field34.method1490((byte) 73);
        }
        if (class68.field1329 > var1) {
            return false;
        }
        class1.field34.field4101 = 0;
        class142.field2588.method334((byte) 95, class1.field34.field4087, 0, class68.field1329);
        field487 = class171.field3104;
        class144.field2603 = 0;
        class171.field3104 = class196.field3504;
        class196.field3504 = class219.field3813;
        if (class219.field3813 == 151) {
            class89.field1622 = true;
            class193.field3463 = class1.field34.method1475(255);
            class157.field2845 = class1.field34.method1475(255);
            class64.field1252 = class1.field34.method1490((byte) 73);
            class177.field3205 = class1.field34.method1475(255);
            class23.field519 = class1.field34.method1475(255);
            if (class23.field519 >= 100) {
                class181.field3267 = class157.field2845 * 128 + 64;
                class90.field1650 = class193.field3463 * 128 + 64;
                class113.field2011 = class195.method1225(class90.field1650, class234.field4325, class181.field3267, (byte) -118) - class64.field1252;
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 249) {
            for (int var2 = 0; var2 < class153.field2762; var2++) {
                class36 var3 = class234.method1528((byte) -77, var2);
                if (var3 != null && var3.field727 == 0) {
                    class205.field3642[var2] = 0;
                    class156.field2836[var2] = 0;
                }
            }
            class157.method1031(0);
            class179.field3230 += 32;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 217) {
            class59.method393((byte) -68);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 227) {
            class55.field1123 = class1.field34.method1486((byte) -65) * 30;
            class28.field608 = class1.field35;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 160) {
            class152.field2754 = class1.field35;
            long var4 = class1.field34.method1469((byte) -13);
            if (var4 == 0L) {
                class219.field3813 = -1;
                class28.field585 = null;
                class55.field1122 = null;
                class64.field1253 = 0;
                class191.field3370 = null;
                return true;
            }
            long var6 = class1.field34.method1469((byte) -13);
            class191.field3370 = class155.method1016(arg0 ^ 0xFFFFA060, var6);
            class55.field1122 = class155.method1016(0, var4);
            class91.field1673 = class1.field34.method1457(-2);
            int var8 = class1.field34.method1475(arg0 + 24735);
            if (var8 == 255) {
                class219.field3813 = -1;
                return true;
            }
            class64.field1253 = var8;
            class91[] var9 = new class91[100];
            for (int var10 = 0; var10 < class64.field1253; var10++) {
                var9[var10] = new class91();
                var9[var10].field1881 = class1.field34.method1469((byte) -13);
                var9[var10].field1660 = class155.method1016(arg0 + 24480, var9[var10].field1881);
                var9[var10].field1663 = class1.field34.method1490((byte) 73);
                var9[var10].field1662 = class1.field34.method1457(-2);
                var9[var10].field1666 = class1.field34.method1443((byte) -118);
                if (class162.field2939 == var9[var10].field1881) {
                    class33.field675 = var9[var10].field1662;
                }
            }
            boolean var11 = false;
            int var12 = class64.field1253;
            while (var12 > 0) {
                var12--;
                boolean var13 = true;
                for (int var14 = 0; var14 < var12; var14++) {
                    if (var9[var14].field1660.method970(1289, var9[var14 + 1].field1660) > 0) {
                        var13 = false;
                        class91 var15 = var9[var14];
                        var9[var14] = var9[var14 + 1];
                        var9[var14 + 1] = var15;
                    }
                }
                if (var13) {
                    break;
                }
            }
            class28.field585 = var9;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 29) {
            int var16 = class1.field34.method1452(-14498);
            if (var16 == 65535) {
                var16 = -1;
            }
            class134.method822(var16, 0);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 18) {
            int var17 = class1.field34.method1481((byte) -59);
            int var18 = class1.field34.method1441(0);
            if (var18 == 65535) {
                var18 = -1;
            }
            class15.method129((byte) -126, var18, var17);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 233) {
            int var19 = class1.field34.method1474((byte) -115);
            class48.field994 = class174.field3151.method266((byte) 89, var19);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 230) {
            int var20 = class1.field34.method1489(252);
            int var21 = class1.field34.method1441(arg0 ^ 0xFFFFA060);
            if (var20 == 1) {
                class224.method1409();
                for (int var22 = 0; var22 < 4; var22++) {
                    class95.field1768[var22].method886((byte) 121);
                }
                System.gc();
            } else if (var20 == 2) {
                class117.method719((byte) -20);
                System.gc();
                class137.method871(25, (byte) 123);
            }
            class31.field652 = var21;
            class106.method640(0, var21);
            class231.method1507(0);
            class51.method356(32, class31.field652);
            for (int var23 = 0; var23 < 100; var23++) {
                class224.field3911[var23] = true;
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 168) {
            int var24 = class1.field34.method1437(arg0 ^ 0xE6A2ACB8);
            int var25 = class1.field34.method1490((byte) 73);
            int var26 = class1.field34.method1474((byte) 89);
            class232 var27 = class175.method1115(-22192, var24);
            if (var25 == 65535) {
                var25 = -1;
            }
            if (var27.field4237) {
                var27.field4129 = var25;
                var27.field4186 = var26;
                class12 var28 = class43.method311(var25, 0);
                var27.field4213 = var28.field233;
                var27.field4249 = var28.field256;
                var27.field4269 = var28.field258;
                var27.field4230 = var28.field225;
                var27.field4251 = var28.field271;
                if (var27.field4225 > 0) {
                    var27.field4249 = var27.field4249 * 32 / var27.field4225;
                } else if (var27.field4252 > 0) {
                    var27.field4249 = var27.field4249 * 32 / var27.field4252;
                }
                var27.field4130 = var28.field257;
                class27.method208(true, var27);
            } else if (var25 == -1) {
                var27.field4149 = 0;
                class219.field3813 = -1;
                return true;
            } else {
                class12 var29 = class43.method311(var25, arg0 + 24480);
                var27.field4269 = var29.field258;
                var27.field4249 = var29.field256 * 100 / var26;
                var27.field4165 = var25;
                var27.field4149 = 4;
                var27.field4251 = var29.field271;
                class27.method208(true, var27);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 101) {
            int var30 = class1.field34.method1437(425528536);
            int var31 = class1.field34.method1490((byte) 73);
            if (var30 < -70000) {
                var31 += 32768;
            }
            class232 var32;
            if (var30 >= 0) {
                var32 = class175.method1115(-22192, var30);
            } else {
                var32 = null;
            }
            if (var32 != null) {
                for (int var33 = 0; var33 < var32.field4248.length; var33++) {
                    var32.field4248[var33] = 0;
                    var32.field4199[var33] = 0;
                }
            }
            class14.method122(var31, (byte) 73);
            int var34 = class1.field34.method1490((byte) 73);
            for (int var35 = 0; var35 < var34; var35++) {
                int var36 = class1.field34.method1465(-125);
                if (var36 == 255) {
                    var36 = class1.field34.method1433(92);
                }
                int var37 = class1.field34.method1490((byte) 73);
                if (var32 != null && var32.field4248.length > var35) {
                    var32.field4248[var35] = var37;
                    var32.field4199[var35] = var36;
                }
                class69.method470((byte) 7, var37 - 1, var31, var36, var35);
            }
            if (var32 != null) {
                class27.method208(true, var32);
            }
            class157.method1031(0);
            class121.field2179[class26.method206(class169.field3075++, 31)] = class26.method206(32767, var31);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 57) {
            int var38 = class1.field34.method1437(425528536);
            int var39 = class1.field34.method1490((byte) 73);
            class205.field3642[var39] = var38;
            if (class156.field2836[var39] != var38) {
                class156.field2836[var39] = var38;
                class167.method1086(3, var39);
            }
            class51.field1031[class26.method206(31, class179.field3230++)] = var39;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 214) {
            class151 var40 = class1.field34.method1443((byte) -44);
            Object[] var41 = new Object[var40.method988(-1) + 1];
            for (int var42 = var40.method988(arg0 + 24479) - 1; var42 >= 0; var42--) {
                if (var40.method979(var42, (byte) 118) == 115) {
                    var41[var42 + 1] = class1.field34.method1443((byte) -67);
                } else {
                    var41[var42 + 1] = Integer.valueOf(class1.field34.method1437(425528536));
                }
            }
            var41[0] = Integer.valueOf(class1.field34.method1437(arg0 + 425553016));
            class224 var43 = new class224();
            var43.field3895 = var41;
            class110.method664(1785261985, var43);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 106) {
            class215.field3767 = class1.field34.method1443((byte) -45);
            class68.method458(class215.field3767, (byte) 77);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 113) {
            int var44 = class1.field34.method1452(-14498);
            int var45 = class1.field34.method1474((byte) -104);
            class232 var46 = class175.method1115(-22192, var45);
            if (var46 != null && var46.field4173 == 0) {
                if (var44 > var46.field4194 - var46.field4216) {
                    var44 = var46.field4194 - var46.field4216;
                }
                if (var44 < 0) {
                    var44 = 0;
                }
                if (var46.field4195 != var44) {
                    var46.field4195 = var44;
                    class27.method208(true, var46);
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 117) {
            long var47 = class1.field34.method1469((byte) -13);
            int var49 = class1.field34.method1490((byte) 73);
            byte var50 = class1.field34.method1457(-2);
            boolean var51 = false;
            if ((Long.MIN_VALUE & var47) != 0L) {
                var51 = true;
            }
            if (var51) {
                if (class64.field1253 == 0) {
                    class219.field3813 = -1;
                    return true;
                }
                long var52 = var47 & Long.MAX_VALUE;
                boolean var54 = false;
                int var55;
                for (var55 = 0; var55 < class64.field1253 && (class28.field585[var55].field1881 != var52 || class28.field585[var55].field1663 != var49); var55++) {
                }
                if (class64.field1253 > var55) {
                    while (var55 < class64.field1253 - 1) {
                        class28.field585[var55] = class28.field585[var55 + 1];
                        var55++;
                    }
                    class64.field1253--;
                    class28.field585[class64.field1253] = null;
                }
            } else {
                class151 var56 = class1.field34.method1443((byte) -63);
                class91 var57 = new class91();
                var57.field1881 = var47;
                var57.field1660 = class155.method1016(0, var57.field1881);
                var57.field1663 = var49;
                var57.field1662 = var50;
                var57.field1666 = var56;
                int var58;
                for (var58 = class64.field1253 - 1; var58 >= 0; var58--) {
                    int var59 = class28.field585[var58].field1660.method970(1289, var57.field1660);
                    if (var59 == 0) {
                        class28.field585[var58].field1663 = var49;
                        class28.field585[var58].field1662 = var50;
                        class28.field585[var58].field1666 = var56;
                        class152.field2754 = class1.field35;
                        if (class162.field2939 == var47) {
                            class33.field675 = var50;
                        }
                        class219.field3813 = -1;
                        return true;
                    }
                    if (var59 < 0) {
                        break;
                    }
                }
                if (class64.field1253 >= class28.field585.length) {
                    class219.field3813 = -1;
                    return true;
                }
                for (int var60 = class64.field1253 - 1; var60 > var58; var60--) {
                    class28.field585[var60 + 1] = class28.field585[var60];
                }
                if (class64.field1253 == 0) {
                    class28.field585 = new class91[100];
                }
                class28.field585[var58 + 1] = var57;
                if (class162.field2939 == var47) {
                    class33.field675 = var50;
                }
                class64.field1253++;
            }
            class152.field2754 = class1.field35;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 184) {
            int var61 = class1.field34.method1441(0);
            int var62 = class1.field34.method1486((byte) -65);
            class58.field1157 = var62;
            class94.field1761 = var61;
            class2.method21(true);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 241) {
            int var63 = class1.field34.method1490((byte) 73);
            if (var63 == 65535) {
                var63 = -1;
            }
            int var64 = class1.field34.method1474((byte) -67);
            class232 var65 = class175.method1115(-22192, var64);
            if (var65.field4149 != 2 || var65.field4165 != var63) {
                var65.field4149 = 2;
                var65.field4165 = var63;
                class27.method208(true, var65);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 245) {
            int var66 = class1.field34.method1433(52);
            class232 var67 = class175.method1115(arg0 ^ 0x930, var66);
            var67.field4149 = 3;
            var67.field4165 = class228.field3975.field439.method306(173319001);
            class27.method208(true, var67);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 229) {
            long var68 = class1.field34.method1469((byte) -13);
            class1.field34.method1457(-2);
            long var70 = class1.field34.method1469((byte) -13);
            long var72 = (long) class1.field34.method1490((byte) 73);
            long var74 = (long) class1.field34.method1450(-23209);
            long var76 = (var72 << 32) + var74;
            int var78 = class1.field34.method1475(255);
            boolean var79 = false;
            for (int var80 = 0; var80 < 100; var80++) {
                if (class216.field3774[var80] == var76) {
                    var79 = true;
                    break;
                }
            }
            if (var78 <= 1) {
                for (int var81 = 0; var81 < class32.field658; var81++) {
                    if (class224.field3909[var81] == var68) {
                        var79 = true;
                        break;
                    }
                }
            }
            if (!var79 && class19.field397 == 0) {
                class216.field3774[class53.field1082] = var76;
                class53.field1082 = (class53.field1082 + 1) % 100;
                class151 var82 = class201.method1278(class226.method1417(class1.field34, 50).method997(true));
                if (var78 == 2 || var78 == 3) {
                    class110.method661(9, var82, class155.method1016(0, var70).method994(-108), class126.method761(new class151[] { class16.field367, class155.method1016(0, var68).method994(-115) }, 10260), -120);
                } else if (var78 == 1) {
                    class110.method661(9, var82, class155.method1016(0, var70).method994(-108), class126.method761(new class151[] { class220.field3824, class155.method1016(arg0 + 24480, var68).method994(-126) }, 10260), -114);
                } else {
                    class110.method661(9, var82, class155.method1016(arg0 + 24480, var70).method994(-110), class155.method1016(0, var68).method994(-119), -72);
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 130) {
            long var83 = class1.field34.method1469((byte) -13);
            class1.field34.method1457(-2);
            long var85 = class1.field34.method1469((byte) -13);
            long var87 = (long) class1.field34.method1490((byte) 73);
            boolean var89 = false;
            long var90 = (long) class1.field34.method1450(-23209);
            int var92 = class1.field34.method1475(255);
            long var93 = (var87 << 32) + var90;
            int var95 = class1.field34.method1490((byte) 73);
            for (int var96 = 0; var96 < 100; var96++) {
                if (class216.field3774[var96] == var93) {
                    var89 = true;
                    break;
                }
            }
            if (var92 <= 1) {
                for (int var97 = 0; var97 < class32.field658; var97++) {
                    if (class224.field3909[var97] == var83) {
                        var89 = true;
                        break;
                    }
                }
            }
            if (!var89 && class19.field397 == 0) {
                class216.field3774[class53.field1082] = var93;
                class53.field1082 = (class53.field1082 + 1) % 100;
                class151 var98 = class15.method124(arg0 + 24479, var95).method1406(4, class1.field34);
                if (var92 == 2 || var92 == 3) {
                    class67.method448(var95, class155.method1016(0, var85).method994(-101), -1, 20, var98, class126.method761(new class151[] { class16.field367, class155.method1016(0, var83).method994(arg0 + 24385) }, 10260));
                } else if (var92 == 1) {
                    class67.method448(var95, class155.method1016(0, var85).method994(-111), -1, 20, var98, class126.method761(new class151[] { class220.field3824, class155.method1016(0, var83).method994(-127) }, 10260));
                } else {
                    class67.method448(var95, class155.method1016(arg0 + 24480, var85).method994(-112), -1, 20, var98, class155.method1016(0, var83).method994(-104));
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 244) {
            int var99 = class1.field34.method1475(255);
            int var100 = class1.field34.method1475(255);
            int var101 = class1.field34.method1475(255);
            int var102 = class1.field34.method1475(arg0 + 24735);
            int var103 = class1.field34.method1490((byte) 73);
            class19.field411[var99] = true;
            class140.field2552[var99] = var100;
            class235.field4358[var99] = var101;
            class59.field1168[var99] = var102;
            class113.field2023[var99] = var103;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 33) {
            int var104 = class1.field34.method1452(-14498);
            int var105 = var104 >> 5 & 0x1F;
            int var106 = var104 & 0x1F;
            int var107 = class1.field34.method1437(arg0 + 425553016);
            int var108 = var104 >> 10 & 0x1F;
            int var109 = (var106 << 3) + (var108 << 19) + (var105 << 11);
            class232 var110 = class175.method1115(arg0 ^ 0x930, var107);
            if (var110.field4243 != var109) {
                var110.field4243 = var109;
                class27.method208(true, var110);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 69) {
            int var111 = class1.field34.method1466(12435);
            int var112 = class1.field34.method1437(425528536);
            class232 var113 = class175.method1115(-22192, var112);
            if (var113.field4270 != var111 || var111 == -1) {
                var113.field4171 = 0;
                var113.field4270 = var111;
                var113.field4150 = 0;
                class27.method208(true, var113);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 255) {
            int var114 = class68.field1329 + class1.field34.field4101;
            int var115 = class1.field34.method1490((byte) 73);
            int var116 = class1.field34.method1490((byte) 73);
            if (class31.field652 != var115) {
                class31.field652 = var115;
                class106.method640(0, class31.field652);
                class231.method1507(0);
                class51.method356(32, class31.field652);
                for (int var117 = 0; var117 < 100; var117++) {
                    class224.field3911[var117] = true;
                }
            }
            while (var116-- > 0) {
                int var126 = class1.field34.method1437(arg0 ^ 0xE6A2ACB8);
                int var127 = class1.field34.method1490((byte) 73);
                int var128 = class1.field34.method1475(255);
                class147 var129 = (class147) class227.field3961.method1538((long) var126, (byte) 127);
                if (var129 != null && var129.field2631 != var127) {
                    class120.method729(var129, true, (byte) 98);
                    var129 = null;
                }
                if (var129 == null) {
                    var129 = class41.method293(var127, var126, 0, var128);
                }
                var129.field2637 = true;
            }
            for (class147 var118 = (class147) class227.field3961.method1534(20912); var118 != null; var118 = (class147) class227.field3961.method1535(0)) {
                if (var118.field2637) {
                    var118.field2637 = false;
                } else {
                    class120.method729(var118, true, (byte) 71);
                }
            }
            class93.field1729 = new class236(512);
            while (var114 > class1.field34.field4101) {
                int var119 = class1.field34.method1437(425528536);
                int var120 = class1.field34.method1490((byte) 73);
                int var121 = class1.field34.method1490((byte) 73);
                int var122 = class1.field34.method1437(425528536);
                for (int var123 = var120; var123 <= var121; var123++) {
                    long var124 = ((long) var119 << 32) + (long) var123;
                    class93.field1729.method1536((byte) 92, new class170(var122), var124);
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 132) {
            long var130 = class1.field34.method1469((byte) -13);
            class151 var132 = class201.method1278(class226.method1417(class1.field34, arg0 ^ 0xFFFFA052).method997(true));
            client.method246(6, (byte) -117, class155.method1016(0, var130).method994(arg0 ^ 0x5FEE), var132);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 143) {
            class102.method626(class68.field1329, class174.field3151, class1.field34, arg0 + 24481);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 121) {
            class56.field1133 = class1.field34.method1459(255);
            class57.field1141 = class1.field34.method1489(arg0 ^ 0xFFFFA09C);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 201) {
            class195.field3473 = class1.field34.method1475(255);
            class219.field3813 = -1;
            class75.field1441 = class1.field35;
            return true;
        } else if (class219.field3813 == 87) {
            class157.method1031(arg0 + 24480);
            class37.field778 = class1.field34.method1475(255);
            class219.field3813 = -1;
            class28.field608 = class1.field35;
            return true;
        } else if (class219.field3813 == 86) {
            int var133 = class1.field34.method1486((byte) -65);
            int var134 = class1.field34.method1474((byte) -75);
            int var135 = class1.field34.method1489(arg0 ^ 0xFFFFA09C);
            class147 var136 = (class147) class227.field3961.method1538((long) var134, (byte) 127);
            if (var136 != null) {
                class120.method729(var136, var136.field2631 != var133, (byte) 110);
            }
            class41.method293(var133, var134, 0, var135);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 25) {
            if (class31.field652 != -1) {
                class142.method917(class31.field652, 0, 255);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 179) {
            byte[] var137 = new byte[class68.field1329];
            class1.field34.method651(var137, 0, class68.field1329, (byte) -123);
            class120.method725(-79, class210.method1307(0, class68.field1329, var137, (byte) -115));
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 140) {
            int var138 = class1.field34.method1433(97);
            class232 var139 = class175.method1115(-22192, var138);
            for (int var140 = 0; var140 < var139.field4248.length; var140++) {
                var139.field4248[var140] = -1;
                var139.field4248[var140] = 0;
            }
            class27.method208(true, var139);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 90) {
            int var141 = class1.field34.method1487((byte) 115);
            int var142 = class1.field34.method1442(false);
            int var143 = class1.field34.method1466(arg0 ^ 0xFFFF90F3);
            class232 var144 = class175.method1115(-22192, var142);
            var144.field4136 = 0;
            var144.field4191 = var144.field4210 = var141;
            var144.field4246 = 0;
            var144.field4154 = var144.field4131 = var143;
            class27.method208(true, var144);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 152) {
            int var145 = class1.field34.method1475(255);
            if (class1.field34.method1475(255) == 0) {
                class126.field2263[var145] = new class21();
            } else {
                class1.field34.field4101--;
                class126.field2263[var145] = new class21(class1.field34);
            }
            class219.field3813 = -1;
            class142.field2566 = class1.field35;
            return true;
        } else if (class219.field3813 == 145) {
            long var146 = class1.field34.method1469((byte) -13);
            int var148 = class1.field34.method1490((byte) 73);
            int var149 = class1.field34.method1475(255);
            class151 var150 = class134.field2441;
            if (var148 > 0) {
                var150 = class1.field34.method1443((byte) -118);
            }
            class151 var151 = class155.method1016(0, var146).method994(-98);
            for (int var152 = 0; var152 < class36.field758; var152++) {
                if (class233.field4290[var152] == var146) {
                    if (class9.field138[var152] != var148) {
                        class9.field138[var152] = var148;
                        if (var148 > 0) {
                            client.method246(5, (byte) -125, class134.field2441, class126.method761(new class151[] { var151, class175.field3180 }, arg0 + 34740));
                        }
                        if (var148 == 0) {
                            client.method246(5, (byte) -91, class134.field2441, class126.method761(new class151[] { var151, class128.field2308 }, 10260));
                        }
                    }
                    var151 = null;
                    class57.field1147[var152] = var150;
                    class50.field1014[var152] = var149;
                    break;
                }
            }
            boolean var153 = false;
            if (var151 != null && class36.field758 < 200) {
                class233.field4290[class36.field758] = var146;
                class146.field2616[class36.field758] = var151;
                class9.field138[class36.field758] = var148;
                class57.field1147[class36.field758] = var150;
                class50.field1014[class36.field758] = var149;
                class36.field758++;
            }
            class75.field1441 = class1.field35;
            int var154 = class36.field758;
            while (var154 > 0) {
                boolean var155 = true;
                var154--;
                for (int var156 = 0; var156 < var154; var156++) {
                    if (class9.field138[var156] != class13.field296 && class9.field138[var156 + 1] == class13.field296 || class9.field138[var156] == 0 && class9.field138[var156 + 1] != 0) {
                        var155 = false;
                        int var157 = class9.field138[var156];
                        class9.field138[var156] = class9.field138[var156 + 1];
                        class9.field138[var156 + 1] = var157;
                        class151 var158 = class57.field1147[var156];
                        class57.field1147[var156] = class57.field1147[var156 + 1];
                        class57.field1147[var156 + 1] = var158;
                        class151 var159 = class146.field2616[var156];
                        class146.field2616[var156] = class146.field2616[var156 + 1];
                        class146.field2616[var156 + 1] = var159;
                        long var160 = class233.field4290[var156];
                        class233.field4290[var156] = class233.field4290[var156 + 1];
                        class233.field4290[var156 + 1] = var160;
                        int var162 = class50.field1014[var156];
                        class50.field1014[var156] = class50.field1014[var156 + 1];
                        class50.field1014[var156 + 1] = var162;
                    }
                }
                if (var155) {
                    break;
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 50) {
            class57.field1141 = class1.field34.method1459(255);
            class56.field1133 = class1.field34.method1459(255);
            while (class1.field34.field4101 < class68.field1329) {
                class219.field3813 = class1.field34.method1475(255);
                class31.method231(true);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 254) {
            class90.field1657 = class1.field34.method1475(255);
            class206.field3652 = class1.field34.method1475(arg0 ^ 0xFFFFA09F);
            class118.field2130 = class1.field34.method1475(arg0 ^ 0xFFFFA09F);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 4) {
            class89.field1622 = true;
            class67.field1280 = class1.field34.method1475(255);
            class14.field332 = class1.field34.method1475(arg0 + 24735);
            class166.field3021 = class1.field34.method1490((byte) 73);
            class69.field1357 = class1.field34.method1475(255);
            class93.field1752 = class1.field34.method1475(255);
            if (class93.field1752 >= 100) {
                int var163 = class67.field1280 * 128 + 64;
                int var164 = class14.field332 * 128 + 64;
                int var165 = class195.method1225(var163, class234.field4325, var164, (byte) -118) - class166.field3021;
                int var166 = var163 - class90.field1650;
                int var167 = var164 - class181.field3267;
                int var168 = var165 - class113.field2011;
                int var169 = (int) Math.sqrt((double) (var166 * var166 + var167 * var167));
                class37.field779 = (int) (Math.atan2((double) var168, (double) var169) * 325.949D) & 0x7FF;
                class147.field2640 = (int) (-325.949D * Math.atan2((double) var166, (double) var167)) & 0x7FF;
                if (class37.field779 < 128) {
                    class37.field779 = 128;
                }
                if (class37.field779 > 383) {
                    class37.field779 = 383;
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 47) {
            int var170 = class1.field34.method1459(255);
            int var171 = class1.field34.method1459(255);
            int var172 = class1.field34.method1459(255);
            class234.field4325 = var170 >> 1;
            class228.field3975.method1427(var172, (var170 & 0x1) == 1, (byte) 73, var171);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 43) {
            class151 var173 = class1.field34.method1443((byte) -45);
            if (var173.method967(true, class92.field1676)) {
                class151 var174 = var173.method987((byte) 119, var173.method990(class75.field1443, (byte) 17), 0);
                boolean var175 = false;
                long var176 = var174.method981(false);
                for (int var178 = 0; var178 < class32.field658; var178++) {
                    if (class224.field3909[var178] == var176) {
                        var175 = true;
                        break;
                    }
                }
                if (!var175 && class19.field397 == 0) {
                    client.method246(4, (byte) -94, var174, class42.field875);
                }
            } else if (var173.method967(true, class156.field2826)) {
                class151 var202 = var173.method987((byte) 120, var173.method990(class75.field1443, (byte) 52), 0);
                long var203 = var202.method981(false);
                boolean var205 = false;
                for (int var206 = 0; var206 < class32.field658; var206++) {
                    if (class224.field3909[var206] == var203) {
                        var205 = true;
                        break;
                    }
                }
                if (!var205 && class19.field397 == 0) {
                    class151 var207 = var173.method987((byte) 126, var173.method988(arg0 + 24479) - 9, var173.method990(class75.field1443, (byte) 99) + 1);
                    client.method246(8, (byte) -107, var202, var207);
                }
            } else if (var173.method967(true, class218.field3798)) {
                class151 var179 = var173.method987((byte) 125, var173.method990(class75.field1443, (byte) 51), 0);
                long var180 = var179.method981(false);
                boolean var182 = false;
                for (int var183 = 0; var183 < class32.field658; var183++) {
                    if (class224.field3909[var183] == var180) {
                        var182 = true;
                        break;
                    }
                }
                if (!var182 && class19.field397 == 0) {
                    client.method246(10, (byte) -103, var179, class134.field2441);
                }
            } else if (var173.method967(true, class197.field3511)) {
                class151 var201 = var173.method987((byte) 127, var173.method990(class197.field3511, (byte) 5), 0);
                client.method246(11, (byte) -84, class134.field2441, var201);
            } else if (var173.method967(true, class83.field1567)) {
                class151 var184 = var173.method987((byte) 119, var173.method990(class83.field1567, (byte) 21), 0);
                if (class19.field397 == 0) {
                    client.method246(12, (byte) -117, class134.field2441, var184);
                }
            } else if (var173.method967(true, class216.field3777)) {
                class151 var200 = var173.method987((byte) 124, var173.method990(class216.field3777, (byte) 50), 0);
                if (class19.field397 == 0) {
                    client.method246(13, (byte) -118, class134.field2441, var200);
                }
            } else if (var173.method967(true, class106.field1890)) {
                class151 var195 = var173.method987((byte) 121, var173.method990(class75.field1443, (byte) 99), 0);
                long var196 = var195.method981(false);
                boolean var198 = false;
                for (int var199 = 0; var199 < class32.field658; var199++) {
                    if (class224.field3909[var199] == var196) {
                        var198 = true;
                        break;
                    }
                }
                if (!var198 && class19.field397 == 0) {
                    client.method246(14, (byte) -99, var195, class134.field2441);
                }
            } else if (var173.method967(true, class43.field890)) {
                class151 var190 = var173.method987((byte) 118, var173.method990(class75.field1443, (byte) 48), 0);
                long var191 = var190.method981(false);
                boolean var193 = false;
                for (int var194 = 0; var194 < class32.field658; var194++) {
                    if (class224.field3909[var194] == var191) {
                        var193 = true;
                        break;
                    }
                }
                if (!var193 && class19.field397 == 0) {
                    client.method246(15, (byte) -74, var190, class134.field2441);
                }
            } else if (var173.method967(true, class236.field4388)) {
                boolean var185 = false;
                class151 var186 = var173.method987((byte) 118, var173.method990(class75.field1443, (byte) 99), 0);
                long var187 = var186.method981(false);
                for (int var189 = 0; var189 < class32.field658; var189++) {
                    if (class224.field3909[var189] == var187) {
                        var185 = true;
                        break;
                    }
                }
                if (!var185 && class19.field397 == 0) {
                    client.method246(16, (byte) -81, var186, class134.field2441);
                }
            } else {
                client.method246(0, (byte) -117, class134.field2441, var173);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 19) {
            for (int var208 = 0; var208 < class156.field2836.length; var208++) {
                if (class205.field3642[var208] != class156.field2836[var208]) {
                    class156.field2836[var208] = class205.field3642[var208];
                    class167.method1086(arg0 ^ 0xFFFFA063, var208);
                    class51.field1031[class26.method206(class179.field3230++, 31)] = var208;
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 250) {
            class212.method1328((byte) 125, true);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 39) {
            class151 var209 = class1.field34.method1443((byte) -99);
            int var210 = class1.field34.method1474((byte) 108);
            class232 var211 = class175.method1115(arg0 + 2288, var210);
            if (!var209.method976(48, var211.field4182)) {
                var211.field4182 = var209;
                class27.method208(true, var211);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 186) {
            int var212 = class1.field34.method1433(55);
            int var213 = class1.field34.method1441(0);
            if (var213 == 65535) {
                var213 = -1;
            }
            class232 var214 = class175.method1115(arg0 + 2288, var212);
            if (var214.field4149 != 1 || var214.field4165 != var213) {
                var214.field4165 = var213;
                var214.field4149 = 1;
                class27.method208(true, var214);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 185) {
            long var215 = class1.field34.method1469((byte) -13);
            int var217 = class1.field34.method1490((byte) 73);
            class151 var218 = class15.method124(-1, var217).method1406(arg0 ^ 0xFFFFA064, class1.field34);
            class67.method448(var217, null, -1, 19, var218, class155.method1016(0, var215).method994(-109));
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 208) {
            client.field693 = class1.field34.method1475(arg0 ^ 0xFFFFA09F);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 167) {
            class32.field658 = class68.field1329 / 8;
            for (int var219 = 0; var219 < class32.field658; var219++) {
                class224.field3909[var219] = class1.field34.method1469((byte) -13);
                class170.field3103[var219] = class155.method1016(0, class224.field3909[var219]);
            }
            class219.field3813 = -1;
            class75.field1441 = class1.field35;
            return true;
        } else if (class219.field3813 == 32 || class219.field3813 == 99 || class219.field3813 == 77 || class219.field3813 == 181 || class219.field3813 == 88 || class219.field3813 == 175 || class219.field3813 == 196 || class219.field3813 == 112 || class219.field3813 == 224 || class219.field3813 == 100 || class219.field3813 == 15) {
            class31.method231(true);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 172) {
            int var220 = class1.field34.method1452(-14498);
            class120.method727(var220, 128);
            class121.field2179[class26.method206(31, class169.field3075++)] = class26.method206(var220, 32767);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 123) {
            int var221 = class1.field34.method1437(425528536);
            int var222 = class1.field34.method1490((byte) 73);
            if (var221 < -70000) {
                var222 += 32768;
            }
            class232 var223;
            if (var221 < 0) {
                var223 = null;
            } else {
                var223 = class175.method1115(-22192, var221);
            }
            while (class68.field1329 > class1.field34.field4101) {
                int var224 = class1.field34.method1440(19108);
                int var225 = class1.field34.method1490((byte) 73);
                int var226 = 0;
                if (var225 != 0) {
                    var226 = class1.field34.method1475(255);
                    if (var226 == 255) {
                        var226 = class1.field34.method1437(425528536);
                    }
                }
                if (var223 != null && var224 >= 0 && var223.field4248.length > var224) {
                    var223.field4248[var224] = var225;
                    var223.field4199[var224] = var226;
                }
                class69.method470((byte) 7, var225 - 1, var222, var226, var224);
            }
            if (var223 != null) {
                class27.method208(true, var223);
            }
            class157.method1031(arg0 ^ 0xFFFFA060);
            class121.field2179[class26.method206(class169.field3075++, 31)] = class26.method206(32767, var222);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 75) {
            class89.field1622 = false;
            for (int var227 = 0; var227 < 5; var227++) {
                class19.field411[var227] = false;
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 194) {
            boolean var228 = class1.field34.method1475(255) == 1;
            int var229 = class1.field34.method1433(98);
            class232 var230 = class175.method1115(arg0 ^ 0x930, var229);
            if (var228 != var230.field4235) {
                var230.field4235 = var228;
                class27.method208(true, var230);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 237) {
            int var231 = class1.field34.method1437(arg0 + 425553016);
            class147 var232 = (class147) class227.field3961.method1538((long) var231, (byte) 127);
            if (var232 != null) {
                class120.method729(var232, true, (byte) 121);
            }
            if (class7.field113 != null) {
                class27.method208(true, class7.field113);
                class7.field113 = null;
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 116) {
            class57.field1141 = class1.field34.method1465(arg0 + 24388);
            class56.field1133 = class1.field34.method1489(252);
            for (int var233 = class57.field1141; var233 < class57.field1141 + 8; var233++) {
                for (int var235 = class56.field1133; var235 < class56.field1133 + 8; var235++) {
                    if (class29.field615[class234.field4325][var233][var235] != null) {
                        class29.field615[class234.field4325][var233][var235] = null;
                        class167.method1087(var233, var235, 8);
                    }
                }
            }
            for (class212 var234 = (class212) class180.field3257.method1358(-29726); var234 != null; var234 = (class212) class180.field3257.method1360(true)) {
                if (class57.field1141 <= var234.field3728 && var234.field3728 < class57.field1141 + 8 && var234.field3713 >= class56.field1133 && class56.field1133 + 8 > var234.field3713 && class234.field4325 == var234.field3723) {
                    var234.field3720 = 0;
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 178) {
            long var236 = class1.field34.method1469((byte) -13);
            long var238 = (long) class1.field34.method1490((byte) 73);
            long var240 = (long) class1.field34.method1450(-23209);
            int var242 = class1.field34.method1475(255);
            boolean var243 = false;
            long var244 = (var238 << 32) + var240;
            for (int var246 = 0; var246 < 100; var246++) {
                if (class216.field3774[var246] == var244) {
                    var243 = true;
                    break;
                }
            }
            if (var242 <= 1) {
                for (int var247 = 0; var247 < class32.field658; var247++) {
                    if (class224.field3909[var247] == var236) {
                        var243 = true;
                        break;
                    }
                }
            }
            if (!var243 && class19.field397 == 0) {
                class216.field3774[class53.field1082] = var244;
                class53.field1082 = (class53.field1082 + 1) % 100;
                class151 var248 = class201.method1278(class226.method1417(class1.field34, 50).method997(true));
                if (var242 == 2 || var242 == 3) {
                    client.method246(7, (byte) -87, class126.method761(new class151[] { class16.field367, class155.method1016(0, var236).method994(-119) }, 10260), var248);
                } else if (var242 == 1) {
                    client.method246(7, (byte) -105, class126.method761(new class151[] { class220.field3824, class155.method1016(0, var236).method994(arg0 ^ 0x5FED) }, 10260), var248);
                } else {
                    client.method246(3, (byte) -95, class155.method1016(0, var236).method994(-97), var248);
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 206) {
            class117.method713(class1.field34, true);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 247) {
            int var249 = class1.field34.method1490((byte) 73);
            byte var250 = class1.field34.method1451(false);
            class205.field3642[var249] = var250;
            if (class156.field2836[var249] != var250) {
                class156.field2836[var249] = var250;
                class167.method1086(3, var249);
            }
            class51.field1031[class26.method206(31, class179.field3230++)] = var249;
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 147) {
            int var251 = class1.field34.method1475(255);
            int var252 = var251 >> 6;
            class109 var253 = new class109();
            var253.field1935 = var251 & 0x3F;
            var253.field1930 = class1.field34.method1475(255);
            if (var253.field1930 >= 0 && class157.field2838.length > var253.field1930) {
                if (var253.field1935 == 1 || var253.field1935 == 10) {
                    var253.field1922 = class1.field34.method1490((byte) 73);
                    class1.field34.field4101 += 3;
                } else if (var253.field1935 >= 2 && var253.field1935 <= 6) {
                    if (var253.field1935 == 2) {
                        var253.field1920 = 64;
                        var253.field1927 = 64;
                    }
                    if (var253.field1935 == 3) {
                        var253.field1920 = 0;
                        var253.field1927 = 64;
                    }
                    if (var253.field1935 == 4) {
                        var253.field1927 = 64;
                        var253.field1920 = 128;
                    }
                    if (var253.field1935 == 5) {
                        var253.field1920 = 64;
                        var253.field1927 = 0;
                    }
                    if (var253.field1935 == 6) {
                        var253.field1920 = 64;
                        var253.field1927 = 128;
                    }
                    var253.field1935 = 2;
                    var253.field1934 = class1.field34.method1490((byte) 73);
                    var253.field1928 = class1.field34.method1490((byte) 73);
                    var253.field1931 = class1.field34.method1475(arg0 ^ 0xFFFFA09F);
                }
                var253.field1921 = class1.field34.method1490((byte) 73);
                if (var253.field1921 == 65535) {
                    var253.field1921 = -1;
                }
                class47.field967[var252] = var253;
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 126) {
            int var254 = class1.field34.method1441(0);
            int var255 = class1.field34.method1486((byte) -65);
            int var256 = class1.field34.method1452(-14498);
            int var257 = class1.field34.method1433(arg0 ^ 0xFFFFA050);
            class232 var258 = class175.method1115(-22192, var257);
            if (var258.field4251 != var256 || var258.field4269 != var254 || var258.field4249 != var255) {
                var258.field4251 = var256;
                var258.field4249 = var255;
                var258.field4269 = var254;
                class27.method208(true, var258);
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 180) {
            class219.field3813 = -1;
            class122.field2189 = 0;
            return true;
        } else if (class219.field3813 == 91) {
            int var259 = class1.field34.method1490((byte) 73);
            if (var259 == 65535) {
                var259 = -1;
            }
            int var260 = class1.field34.method1475(255);
            int var261 = class1.field34.method1490((byte) 73);
            class211.method1323(24597, var259, var260, var261);
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 31) {
            for (int var262 = 0; var262 < class179.field3229.length; var262++) {
                if (class179.field3229[var262] != null) {
                    class179.field3229[var262].field3991 = -1;
                }
            }
            for (int var263 = 0; var263 < class122.field2190.length; var263++) {
                if (class122.field2190[var263] != null) {
                    class122.field2190[var263].field3991 = -1;
                }
            }
            class219.field3813 = -1;
            return true;
        } else if (class219.field3813 == 209) {
            class157.method1031(arg0 ^ 0xFFFFA060);
            class51.field1026 = class1.field34.method1466(12435);
            class219.field3813 = -1;
            class28.field608 = class1.field35;
            return true;
        } else if (class219.field3813 == 28) {
            int var264 = class1.field34.method1441(0);
            int var265 = class1.field34.method1474((byte) 78);
            if (var264 == 65535) {
                var264 = -1;
            }
            int var266 = class1.field34.method1442(false);
            int var267 = class1.field34.method1452(arg0 ^ 0x673E);
            if (var267 == 65535) {
                var267 = -1;
            }
            for (int var268 = var267; var268 <= var264; var268++) {
                long var269 = ((long) var266 << 32) + (long) var268;
                class106 var271 = class93.field1729.method1538(var269, (byte) 127);
                if (var271 != null) {
                    var271.method636(58);
                }
                class93.field1729.method1536((byte) 70, new class170(var265), var269);
            }
            class219.field3813 = -1;
            return true;
        } else {
            if (arg0 != -24480) {
                field501 = null;
            }
            if (class219.field3813 == 149) {
                class157.method1031(0);
                int var272 = class1.field34.method1489(252);
                int var273 = class1.field34.method1474((byte) -118);
                int var274 = class1.field34.method1465(-100);
                class40.field814[var274] = var273;
                class137.field2501[var274] = var272;
                class130.field2388[var274] = 1;
                for (int var275 = 0; var275 < 98; var275++) {
                    if (var273 >= class206.field3648[var275]) {
                        class130.field2388[var274] = var275 + 2;
                    }
                }
                class204.field3631[class26.method206(class116.field2095++, 31)] = var274;
                class219.field3813 = -1;
                return true;
            } else if (class219.field3813 == 164) {
                class212.method1328((byte) 116, false);
                class219.field3813 = -1;
                return true;
            } else if (class219.field3813 == 111) {
                int var276 = class1.field34.method1441(arg0 + 24480);
                int var277 = class1.field34.method1442(false);
                int var278 = class1.field34.method1486((byte) -65);
                class232 var279 = class175.method1115(-22192, var277);
                class219.field3813 = -1;
                var279.field4138 = (var278 << 16) + var276;
                return true;
            } else if (class219.field3813 == 92) {
                class28.method217(1);
                class219.field3813 = -1;
                return true;
            } else if (class219.field3813 == 6) {
                long var280 = class1.field34.method1469((byte) -13);
                long var282 = (long) class1.field34.method1490((byte) 73);
                long var284 = (long) class1.field34.method1450(-23209);
                long var286 = (var282 << 32) + var284;
                boolean var288 = false;
                int var289 = class1.field34.method1475(255);
                int var290 = class1.field34.method1490((byte) 73);
                for (int var291 = 0; var291 < 100; var291++) {
                    if (class216.field3774[var291] == var286) {
                        var288 = true;
                        break;
                    }
                }
                if (var289 <= 1) {
                    for (int var292 = 0; var292 < class32.field658; var292++) {
                        if (class224.field3909[var292] == var280) {
                            var288 = true;
                            break;
                        }
                    }
                }
                if (!var288 && class19.field397 == 0) {
                    class216.field3774[class53.field1082] = var286;
                    class53.field1082 = (class53.field1082 + 1) % 100;
                    class151 var293 = class15.method124(-1, var290).method1406(4, class1.field34);
                    if (var289 == 2) {
                        class67.method448(var290, null, arg0 + 24479, 18, var293, class126.method761(new class151[] { class16.field367, class155.method1016(0, var280).method994(-99) }, arg0 ^ 0xFFFF8874));
                    } else if (var289 == 1) {
                        class67.method448(var290, null, -1, 18, var293, class126.method761(new class151[] { class220.field3824, class155.method1016(arg0 + 24480, var280).method994(-113) }, arg0 ^ 0xFFFF8874));
                    } else {
                        class67.method448(var290, null, arg0 ^ 0x5F9F, 18, var293, class155.method1016(0, var280).method994(-112));
                    }
                }
                class219.field3813 = -1;
                return true;
            } else if (class219.field3813 == 107) {
                int var294 = class1.field34.method1465(-110);
                int var295 = class1.field34.method1489(252);
                class151 var296 = class1.field34.method1443((byte) -65);
                if (var295 >= 1 && var295 <= 8) {
                    if (var296.method995((byte) -22, class179.field3226)) {
                        var296 = null;
                    }
                    class223.field3882[var295 - 1] = var296;
                    class67.field1305[var295 - 1] = var294 == 0;
                }
                class219.field3813 = -1;
                return true;
            } else if (class219.field3813 == 238) {
                class158.method1035(arg0 + 29778);
                class219.field3813 = -1;
                return false;
            } else {
                class123.method746(null, "T1 - " + class219.field3813 + "," + class171.field3104 + "," + field487 + " - " + class68.field1329, -12134);
                class158.method1035(arg0 ^ 0xFFFFB4D2);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZ)I")
    public static final int method187(int arg0, int arg1, boolean arg2) {
        field493++;
        if (!arg2) {
            field487 = -42;
        }
        class110 var3 = (class110) class166.field3032.method1538((long) arg1, (byte) 127);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field1952.length) {
            return var3.field1952[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public static void method188(int arg0) {
        field485 = null;
        field489 = null;
        int var1 = -8 % ((arg0 - 67) / 59);
        field501 = null;
        field476 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
    public static final void method189(int arg0, boolean arg1) {
        if (arg0 <= 81) {
            return;
        }
        for (int var2 = 0; var2 < class23.field505; var2++) {
            class203 var3 = class122.field2190[class81.field1553[var2]];
            long var4 = (long) class81.field1553[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method173(2) && var3.field3608.field1304 == arg1 && var3.field3608.method445(105)) {
                int var6 = var3.field4029 >> 7;
                int var7 = var3.field3976 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field4007 == 1 && (var3.field3976 & 0x7F) == 64 && (var3.field4029 & 0x7F) == 64) {
                        if (class101.field1828[var7][var6] == class116.field2080) {
                            continue;
                        }
                        class101.field1828[var7][var6] = class116.field2080;
                    }
                    if (!var3.field3608.field1318) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3989 = class195.method1225(var3.field4007 * 64 + var3.field3976 - 64, class234.field4325, var3.field4029 + (var3.field4007 - 1) * 64, (byte) -118);
                    class154.method1014(class234.field4325, var3.field3976, var3.field4029, var3.field3989, var3.field4007 * 64 + 60 - 64, var3, var3.field4024, var4, var3.field4038);
                }
            }
        }
        field497++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Loc;Lsd;BLoc;Lsd;)Ljh;")
    public static final class105 method190(class151 arg0, class192 arg1, byte arg2, class151 arg3, class192 arg4) {
        field495++;
        int var5 = arg4.method1198(arg2 + 25086, arg3);
        if (arg2 == 42) {
            int var6 = arg4.method1202(arg0, var5, 121);
            return class12.method92(var6, arg1, arg4, 2, var5);
        } else {
            return null;
        }
    }
}
