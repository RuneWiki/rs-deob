import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class206 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lvd;")
    public static class222 field3833 = class212.method1357("welle:", 10731);

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
    public static boolean field3835 = false;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[[[I")
    public static int[][][] field3836 = new int[4][13][13];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lvd;")
    public static class222 field3840 = class212.method1357(" weitere Optionen", 10731);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public int field3837;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "J")
    public long field3847;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Le;")
    public class44 field3839;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Le;")
    public class44 field3845;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Le;")
    public class44 field3846;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZI)V")
    public static final void method1326(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            method1328(null, (byte) 126);
        }
        if (class112.field2107 <= arg1 - arg4 && class127.field2448 >= arg1 + arg4 && class129.field2514 <= arg0 - arg4 && class230.field4322 >= arg0 + arg4) {
            class222.method1427(arg0, arg2, arg4, arg1, (byte) -97);
        } else {
            class146.method920(arg2, (byte) 55, arg0, arg4, arg1);
        }
        field3848++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II[BB)Z")
    public static final boolean method1327(int arg0, int arg1, byte[] arg2, byte arg3) {
        field3834++;
        class109 var4 = new class109(arg2);
        if (arg3 != -21) {
            return false;
        }
        boolean var5 = true;
        int var6 = -1;
        label58: while (true) {
            int var7 = var4.method685(false);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method699(15784);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var4.method662((byte) -120) >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class65 var17 = class174.method1102(var6, arg3 + 21);
                        if (var14 != 22 || !class122.field2331 || var17.field1206 != 0 || var17.field1225 == 1 || var17.field1228) {
                            var9 = true;
                            if (!var17.method441((byte) -121)) {
                                class32.field680++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var10 = var4.method699(15784);
                if (var10 == 0) {
                    break;
                }
                var4.method662((byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lge;B)V")
    public static final void method1328(class70 arg0, byte arg1) {
        field3849++;
        if (class175.field3280 == arg0.field1343 || arg0.field1323 == -1 || arg0.field1338 != 0 || arg0.field1359 + 1 > class93.method599((byte) -77, arg0.field1323).field3396[arg0.field1318]) {
            int var2 = arg0.field1343 - arg0.field1367;
            int var3 = class175.field3280 - arg0.field1367;
            int var4 = arg0.field1332 * 128 + arg0.field1331 * 64;
            int var5 = arg0.field1331 * 64 + arg0.field1320 * 128;
            int var6 = arg0.field1329 * 128 + arg0.field1331 * 64;
            int var7 = arg0.field1337 * 128 + arg0.field1331 * 64;
            arg0.field1360 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field1353 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg0.field1314 = 0;
        if (arg0.field1357 == 0) {
            arg0.field1325 = 1024;
        }
        if (arg0.field1357 == 1) {
            arg0.field1325 = 1536;
        }
        if (arg0.field1357 == 2) {
            arg0.field1325 = 0;
        }
        if (arg0.field1357 == 3) {
            arg0.field1325 = 512;
        }
        arg0.field1365 = arg0.field1325;
        if (arg1 <= 51) {
            field3835 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Lge;B)V")
    public static final void method1329(class70 arg0, byte arg1) {
        field3842++;
        arg0.field1370 = arg0.field1322;
        if (arg0.field1326 == 0) {
            arg0.field1314 = 0;
            return;
        }
        if (arg0.field1323 != -1 && arg0.field1338 == 0) {
            class183 var2 = class93.method599((byte) -46, arg0.field1323);
            if (arg0.field1363 > 0 && var2.field3381 == 0) {
                arg0.field1314++;
                return;
            }
            if (arg0.field1363 <= 0 && var2.field3391 == 0) {
                arg0.field1314++;
                return;
            }
        }
        int var3 = arg0.field1360;
        int var4 = arg0.field1333[arg0.field1326 - 1] * 128 + arg0.field1331 * 64;
        int var5 = arg0.field1353;
        if (arg1 != 39) {
            method1328(null, (byte) 111);
        }
        int var6 = arg0.field1358[arg0.field1326 - 1] * 128 + arg0.field1331 * 64;
        if (var4 - var5 > 256 || var4 - var5 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg0.field1360 = var6;
            arg0.field1353 = var4;
            return;
        }
        if (var5 < var4) {
            if (var6 > var3) {
                arg0.field1325 = 1280;
            } else if (var3 <= var6) {
                arg0.field1325 = 1536;
            } else {
                arg0.field1325 = 1792;
            }
        } else if (var5 > var4) {
            if (var6 > var3) {
                arg0.field1325 = 768;
            } else if (var3 > var6) {
                arg0.field1325 = 256;
            } else {
                arg0.field1325 = 512;
            }
        } else if (var6 > var3) {
            arg0.field1325 = 1024;
        } else if (var6 < var3) {
            arg0.field1325 = 0;
        }
        int var7 = arg0.field1325 - arg0.field1365 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1324;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1364;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1355;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1311;
        }
        if (var8 == -1) {
            var8 = arg0.field1364;
        }
        arg0.field1370 = var8;
        boolean var10 = true;
        if (arg0 instanceof class193) {
            var10 = ((class193) arg0).field3558.field2171;
        }
        if (var10) {
            if (arg0.field1365 != arg0.field1325 && arg0.field1330 == -1 && arg0.field1350 != 0) {
                var9 = 2;
            }
            if (arg0.field1326 > 2) {
                var9 = 6;
            }
            if (arg0.field1326 > 3) {
                var9 = 8;
            }
            if (arg0.field1314 > 0 && arg0.field1326 > 1) {
                arg0.field1314--;
                var9 = 8;
            }
        } else {
            if (arg0.field1326 > 1) {
                var9 = 6;
            }
            if (arg0.field1326 > 2) {
                var9 = 8;
            }
            if (arg0.field1314 > 0 && arg0.field1326 > 1) {
                var9 = 8;
                arg0.field1314--;
            }
        }
        if (arg0.field1342[arg0.field1326 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1370 == arg0.field1364 && arg0.field1349 != -1) {
            arg0.field1370 = arg0.field1349;
        }
        if (var4 > var5) {
            arg0.field1353 += var9;
            if (var4 < arg0.field1353) {
                arg0.field1353 = var4;
            }
        } else if (var4 < var5) {
            arg0.field1353 -= var9;
            if (var4 > arg0.field1353) {
                arg0.field1353 = var4;
            }
        }
        if (var3 < var6) {
            arg0.field1360 += var9;
            if (var6 < arg0.field1360) {
                arg0.field1360 = var6;
            }
        } else if (var6 < var3) {
            arg0.field1360 -= var9;
            if (var6 > arg0.field1360) {
                arg0.field1360 = var6;
            }
        }
        if (arg0.field1353 == var4 && arg0.field1360 == var6) {
            if (arg0.field1363 > 0) {
                arg0.field1363--;
            }
            arg0.field1326--;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method1330(byte arg0) {
        field3840 = null;
        field3833 = null;
        field3836 = null;
        int var1 = -98 / ((arg0 + 23) / 63);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Z")
    public static final boolean method1331(byte arg0) throws IOException {
        field3843++;
        if (class31.field656 == null) {
            return false;
        }
        int var1 = class31.field656.method786(78);
        if (var1 == 0) {
            return false;
        }
        if (class202.field3703 == -1) {
            var1--;
            class31.field656.method783((byte) -46, 0, class21.field505.field2006, 1);
            class21.field505.field2053 = 0;
            class202.field3703 = class21.field505.method1351(true);
            class70.field1306 = class18.field437[class202.field3703];
        }
        if (class70.field1306 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class31.field656.method783((byte) 95, 0, class21.field505.field2006, 1);
            var1--;
            class70.field1306 = class21.field505.field2006[0] & 0xFF;
        }
        if (class70.field1306 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class31.field656.method783((byte) 117, 0, class21.field505.field2006, 2);
            var1 -= 2;
            class21.field505.field2053 = 0;
            class70.field1306 = class21.field505.method675(2);
        }
        if (class70.field1306 > var1) {
            return false;
        }
        class21.field505.field2053 = 0;
        class31.field656.method783((byte) -102, 0, class21.field505.field2006, class70.field1306);
        class209.field3885 = 0;
        class173.field3247 = class13.field266;
        class13.field266 = class46.field937;
        class46.field937 = class202.field3703;
        if (class202.field3703 == 149) {
            for (int var2 = 0; var2 < class92.field1735; var2++) {
                class52 var3 = class191.method1190((byte) 18, var2);
                if (var3 != null && var3.field990 == 0) {
                    class210.field3909[var2] = 0;
                    class93.field1751[var2] = 0;
                }
            }
            class162.method1017(7951);
            class183.field3395 += 32;
            class202.field3703 = -1;
            return true;
        } else if (class202.field3703 == 244) {
            class44.field928 = false;
            for (int var4 = 0; var4 < 5; var4++) {
                class204.field3748[var4] = false;
            }
            class202.field3703 = -1;
            return true;
        } else if (class202.field3703 == 245) {
            class44.field928 = true;
            class108.field1985 = class21.field505.method662((byte) -116);
            class81.field1561 = class21.field505.method662((byte) -126);
            class225.field4211 = class21.field505.method675(2);
            class20.field473 = class21.field505.method662((byte) -93);
            class161.field3072 = class21.field505.method662((byte) -98);
            if (class161.field3072 >= 100) {
                class211.field3923 = class108.field1985 * 128 + 64;
                class110.field2059 = class81.field1561 * 128 + 64;
                class118.field2243 = class71.method482(class110.field2059, class211.field3923, class217.field4036, (byte) 125) - class225.field4211;
            }
            class202.field3703 = -1;
            return true;
        } else if (class202.field3703 == 94) {
            for (int var5 = 0; var5 < class54.field1024.length; var5++) {
                if (class54.field1024[var5] != null) {
                    class54.field1024[var5].field1323 = -1;
                }
            }
            for (int var6 = 0; var6 < class202.field3696.length; var6++) {
                if (class202.field3696[var6] != null) {
                    class202.field3696[var6].field1323 = -1;
                }
            }
            class202.field3703 = -1;
            return true;
        } else {
            if (arg0 >= -85) {
                field3836 = null;
            }
            if (class202.field3703 == 186) {
                int var7 = class21.field505.method704(-1405);
                int var8 = class21.field505.method698(-71);
                class13 var9 = class10.method92(923, var7);
                if (var9.field340 != var8 || var8 == -1) {
                    var9.field270 = 0;
                    var9.field262 = 0;
                    var9.field340 = var8;
                    class80.method527(var9, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 15) {
                if (class25.field580 != -1) {
                    class8.method65(class25.field580, 1, 0);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 67) {
                int var10 = class21.field505.method710(28908);
                class128.field2464 = class191.field3509.method282(0, var10);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 58) {
                int var11 = class21.field505.method662((byte) -88);
                if (class21.field505.method662((byte) -91) == 0) {
                    class232.field4351[var11] = new class221();
                } else {
                    class21.field505.field2053--;
                    class232.field4351[var11] = new class221(class21.field505);
                }
                class79.field1523 = class28.field616;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 71) {
                class39.field865 = class21.field505.method662((byte) -124);
                class68.field1283 = class28.field616;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 86) {
                int var12 = class21.field505.method706((byte) -84);
                class13 var13 = class10.method92(923, var12);
                for (int var14 = 0; var14 < var13.field289.length; var14++) {
                    var13.field289[var14] = -1;
                    var13.field289[var14] = 0;
                }
                class80.method527(var13, 31702);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 45) {
                int var15 = class21.field505.method710(28908);
                int var16 = class21.field505.method691(-128);
                int var17 = var16 >> 10 & 0x1F;
                int var18 = var16 & 0x1F;
                int var19 = var16 >> 5 & 0x1F;
                class13 var20 = class10.method92(923, var15);
                int var21 = (var17 << 19) + (var18 << 3) + (var19 << 11);
                if (var20.field358 != var21) {
                    var20.field358 = var21;
                    class80.method527(var20, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 100) {
                class162.method1017(7951);
                class140.field2700 = class21.field505.method662((byte) -90);
                class202.field3703 = -1;
                class52.field1003 = class28.field616;
                return true;
            } else if (class202.field3703 == 152) {
                int var22 = class21.field505.method706((byte) -128);
                int var23 = class21.field505.method675(2);
                class13 var24 = class10.method92(923, var22);
                if (var23 == 65535) {
                    var23 = -1;
                }
                if (var24.field325 != 2 || var24.field224 != var23) {
                    var24.field224 = var23;
                    var24.field325 = 2;
                    class80.method527(var24, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 129) {
                class202.field3690 = class21.field505.method691(-128) * 30;
                class52.field1003 = class28.field616;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 178) {
                int var25 = class21.field505.method710(28908);
                int var26 = class21.field505.method675(2);
                if (var25 < -70000) {
                    var26 += 32768;
                }
                class13 var27;
                if (var25 < 0) {
                    var27 = null;
                } else {
                    var27 = class10.method92(923, var25);
                }
                if (var27 != null) {
                    for (int var28 = 0; var28 < var27.field289.length; var28++) {
                        var27.field289[var28] = 0;
                        var27.field226[var28] = 0;
                    }
                }
                class191.method1194(var26, (byte) 91);
                int var29 = class21.field505.method675(2);
                for (int var30 = 0; var30 < var29; var30++) {
                    int var31 = class21.field505.method680(-20040);
                    if (var31 == 255) {
                        var31 = class21.field505.method710(28908);
                    }
                    int var32 = class21.field505.method691(-128);
                    if (var27 != null && var27.field289.length > var30) {
                        var27.field289[var30] = var32;
                        var27.field226[var30] = var31;
                    }
                    class233.method1525(-17881, var31, var30, var26, var32 - 1);
                }
                if (var27 != null) {
                    class80.method527(var27, 31702);
                }
                class162.method1017(7951);
                class128.field2467[class139.method876(31, class229.field4318++)] = class139.method876(32767, var26);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 57) {
                int var33 = class21.field505.method662((byte) -110);
                int var34 = class21.field505.method662((byte) -85);
                int var35 = class21.field505.method662((byte) -103);
                int var36 = class21.field505.method662((byte) -125);
                int var37 = class21.field505.method675(2);
                class204.field3748[var33] = true;
                class167.field3196[var33] = var34;
                class231.field4337[var33] = var35;
                class84.field1601[var33] = var36;
                class92.field1731[var33] = var37;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 159) {
                class191.field3518 = class21.field505.method662((byte) -103);
                class222.field4164 = class21.field505.method662((byte) -85);
                client.field697 = class21.field505.method662((byte) -94);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 229) {
                class135.field2613 = class21.field505.method674(-56);
                class156.method998(127, class135.field2613);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 98) {
                int var38 = class21.field505.method691(-128);
                int var39 = class21.field505.method686(91);
                int var40 = class21.field505.method679((byte) 118);
                int var41 = class21.field505.method704(-1405);
                class13 var42 = class10.method92(923, var41);
                if (var42.field240 != var38 || var42.field353 != var39 || var42.field334 != var40) {
                    var42.field353 = var39;
                    var42.field240 = var38;
                    var42.field334 = var40;
                    class80.method527(var42, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 208) {
                int var43 = class21.field505.method691(-128);
                int var44 = class21.field505.method691(-128);
                class140.field2697 = var43;
                class116.field2218 = var44;
                class128.method806(-87);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 96) {
                class113.field2131 = class70.field1306 / 8;
                for (int var45 = 0; var45 < class113.field2131; var45++) {
                    class64.field1173[var45] = class21.field505.method709((byte) 7);
                    class82.field1581[var45] = class204.method1317((byte) -75, class64.field1173[var45]);
                }
                class68.field1283 = class28.field616;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 61) {
                class131.field2537 = 0;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 21) {
                int var46 = class21.field505.method704(-1405);
                boolean var47 = class21.field505.method705((byte) 93) == 1;
                class13 var48 = class10.method92(923, var46);
                if (var48.field305 != var47) {
                    var48.field305 = var47;
                    class80.method527(var48, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 4) {
                int var49 = class21.field505.method695(115);
                int var50 = class21.field505.method681(false);
                int var51 = class21.field505.method698(-105);
                class13 var52 = class10.method92(923, var50);
                if (var52.field242 != var49 || var52.field355 != var51) {
                    var52.field295 -= var52.field355;
                    var52.field236 -= var52.field242;
                    var52.field242 = var49;
                    var52.field355 = var51;
                    var52.field295 += var52.field355;
                    var52.field236 += var52.field242;
                    class80.method527(var52, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 117) {
                class107.field1979 = class21.field505.method705((byte) 112);
                class234.field4365 = class21.field505.method705((byte) 29);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 84) {
                int var53 = class21.field505.method710(28908);
                int var54 = class21.field505.method675(2);
                class13 var55;
                if (var53 < 0) {
                    var55 = null;
                } else {
                    var55 = class10.method92(923, var53);
                }
                if (var53 < -70000) {
                    var54 += 32768;
                }
                while (class70.field1306 > class21.field505.field2053) {
                    int var56 = class21.field505.method699(15784);
                    int var57 = class21.field505.method675(2);
                    int var58 = 0;
                    if (var57 != 0) {
                        var58 = class21.field505.method662((byte) -124);
                        if (var58 == 255) {
                            var58 = class21.field505.method710(28908);
                        }
                    }
                    if (var55 != null && var56 >= 0 && var55.field289.length > var56) {
                        var55.field289[var56] = var57;
                        var55.field226[var56] = var58;
                    }
                    class233.method1525(-17881, var58, var56, var54, var57 - 1);
                }
                if (var55 != null) {
                    class80.method527(var55, 31702);
                }
                class162.method1017(7951);
                class128.field2467[class139.method876(class229.field4318++, 31)] = class139.method876(32767, var54);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 183) {
                class128.method812(true, 3);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 92) {
                int var59 = class21.field505.method710(28908);
                class21 var60 = (class21) class208.field3863.method1520((long) var59, 79);
                if (var60 != null) {
                    class168.method1081(true, (byte) -118, var60);
                }
                if (class91.field1713 != null) {
                    class80.method527(class91.field1713, 31702);
                    class91.field1713 = null;
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 56) {
                class50.field977 = class28.field616;
                long var61 = class21.field505.method709((byte) 7);
                if (var61 == 0L) {
                    class151.field2925 = null;
                    class202.field3703 = -1;
                    class75.field1472 = 0;
                    class9.field165 = null;
                    class28.field611 = null;
                    return true;
                }
                long var63 = class21.field505.method709((byte) 7);
                class28.field611 = class204.method1317((byte) -97, var63);
                class151.field2925 = class204.method1317((byte) 105, var61);
                class202.field3692 = class21.field505.method661(255);
                int var65 = class21.field505.method662((byte) -123);
                if (var65 == 255) {
                    class202.field3703 = -1;
                    return true;
                }
                class75.field1472 = var65;
                class80[] var66 = new class80[100];
                for (int var67 = 0; var67 < class75.field1472; var67++) {
                    var66[var67] = new class80();
                    var66[var67].field2555 = class21.field505.method709((byte) 7);
                    var66[var67].field1529 = class204.method1317((byte) -75, var66[var67].field2555);
                    var66[var67].field1537 = class21.field505.method675(2);
                    var66[var67].field1536 = class21.field505.method661(255);
                    var66[var67].field1534 = class21.field505.method674(-41);
                    if (class66.field1245 == var66[var67].field2555) {
                        class139.field2682 = var66[var67].field1536;
                    }
                }
                int var68 = class75.field1472;
                boolean var69 = false;
                while (var68 > 0) {
                    var68--;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var68; var71++) {
                        if (var66[var71].field1529.method1420((byte) -38, var66[var71 + 1].field1529) > 0) {
                            var70 = false;
                            class80 var72 = var66[var71];
                            var66[var71] = var66[var71 + 1];
                            var66[var71 + 1] = var72;
                        }
                    }
                    if (var70) {
                        break;
                    }
                }
                class9.field165 = var66;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 226) {
                int var73 = class21.field505.method675(2);
                if (var73 == 65535) {
                    var73 = -1;
                }
                int var74 = class21.field505.method681(false);
                int var75 = class21.field505.method710(28908);
                class13 var76 = class10.method92(923, var74);
                if (var76.field323) {
                    var76.field335 = var73;
                    var76.field347 = var75;
                    class204 var77 = class112.method728(var73, (byte) 124);
                    var76.field279 = var77.field3735;
                    var76.field334 = var77.field3761;
                    if (var76.field287 > 0) {
                        var76.field334 = var76.field334 * 32 / var76.field287;
                    } else if (var76.field333 > 0) {
                        var76.field334 = var76.field334 * 32 / var76.field333;
                    }
                    var76.field372 = var77.field3786;
                    var76.field240 = var77.field3757;
                    var76.field353 = var77.field3774;
                    var76.field361 = var77.field3763;
                    class80.method527(var76, 31702);
                } else if (var73 == -1) {
                    class202.field3703 = -1;
                    var76.field325 = 0;
                    return true;
                } else {
                    class204 var78 = class112.method728(var73, (byte) 126);
                    var76.field240 = var78.field3757;
                    var76.field334 = var78.field3761 * 100 / var75;
                    var76.field353 = var78.field3774;
                    var76.field325 = 4;
                    var76.field224 = var73;
                    class80.method527(var76, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 9) {
                class111.method719((byte) 108);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 111) {
                int var79 = class21.field505.method675(2);
                int var80 = class21.field505.method680(-20040);
                if (var80 == 1) {
                    class151.method975();
                    for (int var81 = 0; var81 < 4; var81++) {
                        class108.field1993[var81].method69((byte) 116);
                    }
                    System.gc();
                } else if (var80 == 2) {
                    class126.method798(0);
                    System.gc();
                    class55.method410(25, 0);
                }
                class25.field580 = var79;
                client.method268(-17403, var79);
                class200.method1279((byte) -25);
                class10.method91((byte) -99, class25.field580);
                for (int var82 = 0; var82 < 100; var82++) {
                    class93.field1746[var82] = true;
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 122) {
                class222 var83 = class21.field505.method674(-121);
                if (var83.method1434(class234.field4368, -123)) {
                    class222 var84 = var83.method1419(var83.method1445(class201.field3683, (byte) 108), 2, 0);
                    boolean var85 = false;
                    long var86 = var84.method1428(15109);
                    for (int var88 = 0; var88 < class113.field2131; var88++) {
                        if (class64.field1173[var88] == var86) {
                            var85 = true;
                            break;
                        }
                    }
                    if (!var85 && class91.field1714 == 0) {
                        class160.method1007(false, class143.field2766, var84, 4);
                    }
                } else if (var83.method1434(class205.field3820, -106)) {
                    class222 var112 = var83.method1419(var83.method1445(class201.field3683, (byte) -79), 2, 0);
                    long var113 = var112.method1428(15109);
                    boolean var115 = false;
                    for (int var116 = 0; var116 < class113.field2131; var116++) {
                        if (class64.field1173[var116] == var113) {
                            var115 = true;
                            break;
                        }
                    }
                    if (!var115 && class91.field1714 == 0) {
                        class222 var117 = var83.method1419(var83.method1444(-121) - 9, 2, var83.method1445(class201.field3683, (byte) -56) + 1);
                        class160.method1007(false, var117, var112, 8);
                    }
                } else if (var83.method1434(class64.field1171, -118)) {
                    class222 var89 = var83.method1419(var83.method1445(class201.field3683, (byte) -114), 2, 0);
                    boolean var90 = false;
                    long var91 = var89.method1428(15109);
                    for (int var93 = 0; var93 < class113.field2131; var93++) {
                        if (class64.field1173[var93] == var91) {
                            var90 = true;
                            break;
                        }
                    }
                    if (!var90 && class91.field1714 == 0) {
                        class160.method1007(false, class29.field646, var89, 10);
                    }
                } else if (var83.method1434(class179.field3330, -119)) {
                    class222 var111 = var83.method1419(var83.method1445(class179.field3330, (byte) -106), 2, 0);
                    class160.method1007(false, var111, class29.field646, 11);
                } else if (var83.method1434(class139.field2684, -126)) {
                    class222 var110 = var83.method1419(var83.method1445(class139.field2684, (byte) -44), 2, 0);
                    if (class91.field1714 == 0) {
                        class160.method1007(false, var110, class29.field646, 12);
                    }
                } else if (var83.method1434(class18.field440, -115)) {
                    class222 var94 = var83.method1419(var83.method1445(class18.field440, (byte) 83), 2, 0);
                    if (class91.field1714 == 0) {
                        class160.method1007(false, var94, class29.field646, 13);
                    }
                } else if (var83.method1434(class173.field3246, -121)) {
                    class222 var105 = var83.method1419(var83.method1445(class201.field3683, (byte) -48), 2, 0);
                    long var106 = var105.method1428(15109);
                    boolean var108 = false;
                    for (int var109 = 0; var109 < class113.field2131; var109++) {
                        if (class64.field1173[var109] == var106) {
                            var108 = true;
                            break;
                        }
                    }
                    if (!var108 && class91.field1714 == 0) {
                        class160.method1007(false, class29.field646, var105, 14);
                    }
                } else if (var83.method1434(class229.field4310, -115)) {
                    boolean var100 = false;
                    class222 var101 = var83.method1419(var83.method1445(class201.field3683, (byte) -54), 2, 0);
                    long var102 = var101.method1428(15109);
                    for (int var104 = 0; var104 < class113.field2131; var104++) {
                        if (class64.field1173[var104] == var102) {
                            var100 = true;
                            break;
                        }
                    }
                    if (!var100 && class91.field1714 == 0) {
                        class160.method1007(false, class29.field646, var101, 15);
                    }
                } else if (var83.method1434(class188.field3482, -122)) {
                    class222 var95 = var83.method1419(var83.method1445(class201.field3683, (byte) 106), 2, 0);
                    long var96 = var95.method1428(15109);
                    boolean var98 = false;
                    for (int var99 = 0; var99 < class113.field2131; var99++) {
                        if (class64.field1173[var99] == var96) {
                            var98 = true;
                            break;
                        }
                    }
                    if (!var98 && class91.field1714 == 0) {
                        class160.method1007(false, class29.field646, var95, 16);
                    }
                } else {
                    class160.method1007(false, var83, class29.field646, 0);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 20) {
                int var118 = class21.field505.method662((byte) -94);
                int var119 = class21.field505.method688((byte) -127);
                class222 var120 = class21.field505.method674(-72);
                if (var119 >= 1 && var119 <= 8) {
                    if (var120.method1452(class218.field4049, (byte) -127)) {
                        var120 = null;
                    }
                    class160.field3042[var119 - 1] = var120;
                    class217.field4039[var119 - 1] = var118 == 0;
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 93 || class202.field3703 == 137 || class202.field3703 == 80 || class202.field3703 == 33 || class202.field3703 == 235 || class202.field3703 == 195 || class202.field3703 == 127 || class202.field3703 == 154 || class202.field3703 == 73 || class202.field3703 == 184 || class202.field3703 == 91) {
                class43.method325((byte) -119);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 146) {
                int var121 = class21.field505.method710(28908);
                int var122 = class21.field505.method691(-128);
                class210.field3909[var122] = var121;
                if (class93.field1751[var122] != var121) {
                    class93.field1751[var122] = var121;
                    class208.method1336(var122, -135);
                }
                class111.field2077[class139.method876(class183.field3395++, 31)] = var122;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 144) {
                byte[] var123 = new byte[class70.field1306];
                class21.field505.method1349(var123, 7, class70.field1306, 0);
                class91.method584(17407, class73.method496(var123, (byte) 112, class70.field1306, 0));
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 81) {
                class162.method1017(7951);
                int var124 = class21.field505.method706((byte) -57);
                int var125 = class21.field505.method705((byte) 94);
                int var126 = class21.field505.method705((byte) 112);
                class106.field1964[var125] = var124;
                class42.field899[var125] = var126;
                class24.field555[var125] = 1;
                for (int var127 = 0; var127 < 98; var127++) {
                    if (var124 >= class82.field1579[var127]) {
                        class24.field555[var125] = var127 + 2;
                    }
                }
                class38.field838[class139.method876(class121.field2317++, 31)] = var125;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 104) {
                long var128 = class21.field505.method709((byte) 7);
                class222 var130 = class142.method906(class42.method318(class21.field505, (byte) 0).method1424(-6264));
                class160.method1007(false, var130, class204.method1317((byte) -86, var128).method1409(-7899), 6);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 231) {
                class222 var131 = class21.field505.method674(-88);
                Object[] var132 = new Object[var131.method1444(-10) + 1];
                for (int var133 = var131.method1444(-36) - 1; var133 >= 0; var133--) {
                    if (var131.method1442(var133, 69) == 115) {
                        var132[var133 + 1] = class21.field505.method674(-114);
                    } else {
                        var132[var133 + 1] = Integer.valueOf(class21.field505.method710(28908));
                    }
                }
                var132[0] = Integer.valueOf(class21.field505.method710(28908));
                class191 var134 = new class191();
                var134.field3510 = var132;
                class52.method373(-32560, var134);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 134) {
                class68.field1277 = class21.field505.method662((byte) -124);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 162) {
                class162.method1017(7951);
                class47.field962 = class21.field505.method700((byte) 64);
                class202.field3703 = -1;
                class52.field1003 = class28.field616;
                return true;
            } else if (class202.field3703 == 182) {
                long var135 = class21.field505.method709((byte) 7);
                long var137 = (long) class21.field505.method675(2);
                long var139 = (long) class21.field505.method701(869322848);
                boolean var141 = false;
                long var142 = (var137 << 32) + var139;
                int var144 = class21.field505.method662((byte) -119);
                for (int var145 = 0; var145 < 100; var145++) {
                    if (class229.field4317[var145] == var142) {
                        var141 = true;
                        break;
                    }
                }
                if (var144 <= 1) {
                    for (int var146 = 0; var146 < class113.field2131; var146++) {
                        if (class64.field1173[var146] == var135) {
                            var141 = true;
                            break;
                        }
                    }
                }
                if (!var141 && class91.field1714 == 0) {
                    class229.field4317[class56.field1066] = var142;
                    class56.field1066 = (class56.field1066 + 1) % 100;
                    class222 var147 = class142.method906(class42.method318(class21.field505, (byte) 0).method1424(-6264));
                    if (var144 == 2 || var144 == 3) {
                        class160.method1007(false, var147, class234.method1531(new class222[] { class58.field1085, class204.method1317((byte) -77, var135).method1409(-7899) }, -10949), 7);
                    } else if (var144 == 1) {
                        class160.method1007(false, var147, class234.method1531(new class222[] { class179.field3333, class204.method1317((byte) -100, var135).method1409(-7899) }, -10949), 7);
                    } else {
                        class160.method1007(false, var147, class204.method1317((byte) -117, var135).method1409(-7899), 3);
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 116) {
                class137.method865(80);
                class202.field3703 = -1;
                return false;
            } else if (class202.field3703 == 22) {
                byte var148 = class21.field505.method683(-27400);
                int var149 = class21.field505.method686(113);
                class210.field3909[var149] = var148;
                if (class93.field1751[var149] != var148) {
                    class93.field1751[var149] = var148;
                    class208.method1336(var149, -135);
                }
                class111.field2077[class139.method876(31, class183.field3395++)] = var149;
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 238) {
                class37.method302(class191.field3509, false, class21.field505, class70.field1306);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 143) {
                long var150 = class21.field505.method709((byte) 7);
                int var152 = class21.field505.method675(2);
                int var153 = class21.field505.method662((byte) -89);
                class222 var154 = class29.field646;
                if (var152 > 0) {
                    var154 = class21.field505.method674(-73);
                }
                class222 var155 = class204.method1317((byte) -63, var150).method1409(-7899);
                for (int var156 = 0; var156 < class86.field1630; var156++) {
                    if (class116.field2210[var156] == var150) {
                        if (class36.field784[var156] != var152) {
                            class36.field784[var156] = var152;
                            if (var152 > 0) {
                                class160.method1007(false, class234.method1531(new class222[] { var155, class92.field1734 }, -10949), class29.field646, 5);
                            }
                            if (var152 == 0) {
                                class160.method1007(false, class234.method1531(new class222[] { var155, class183.field3382 }, -10949), class29.field646, 5);
                            }
                        }
                        class120.field2270[var156] = var154;
                        var155 = null;
                        class190.field3504[var156] = var153;
                        break;
                    }
                }
                if (var155 != null && class86.field1630 < 200) {
                    class116.field2210[class86.field1630] = var150;
                    class31.field657[class86.field1630] = var155;
                    class36.field784[class86.field1630] = var152;
                    class120.field2270[class86.field1630] = var154;
                    class190.field3504[class86.field1630] = var153;
                    class86.field1630++;
                }
                class68.field1283 = class28.field616;
                boolean var157 = false;
                int var158 = class86.field1630;
                while (var158 > 0) {
                    var158--;
                    boolean var159 = true;
                    for (int var160 = 0; var160 < var158; var160++) {
                        if (class36.field784[var160] != class208.field3875 && class36.field784[var160 + 1] == class208.field3875 || class36.field784[var160] == 0 && class36.field784[var160 + 1] != 0) {
                            var159 = false;
                            int var161 = class36.field784[var160];
                            class36.field784[var160] = class36.field784[var160 + 1];
                            class36.field784[var160 + 1] = var161;
                            class222 var162 = class120.field2270[var160];
                            class120.field2270[var160] = class120.field2270[var160 + 1];
                            class120.field2270[var160 + 1] = var162;
                            class222 var163 = class31.field657[var160];
                            class31.field657[var160] = class31.field657[var160 + 1];
                            class31.field657[var160 + 1] = var163;
                            long var164 = class116.field2210[var160];
                            class116.field2210[var160] = class116.field2210[var160 + 1];
                            class116.field2210[var160 + 1] = var164;
                            int var166 = class190.field3504[var160];
                            class190.field3504[var160] = class190.field3504[var160 + 1];
                            class190.field3504[var160 + 1] = var166;
                        }
                    }
                    if (var159) {
                        break;
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 180) {
                class222 var167 = class21.field505.method674(-54);
                int var168 = class21.field505.method706((byte) -64);
                class13 var169 = class10.method92(923, var168);
                if (!var167.method1454(var169.field374, true)) {
                    var169.field374 = var167;
                    class80.method527(var169, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 27) {
                class107.field1979 = class21.field505.method662((byte) -98);
                class234.field4365 = class21.field505.method662((byte) -112);
                for (int var170 = class107.field1979; var170 < class107.field1979 + 8; var170++) {
                    for (int var172 = class234.field4365; var172 < class234.field4365 + 8; var172++) {
                        if (class237.field4408[class217.field4036][var170][var172] != null) {
                            class237.field4408[class217.field4036][var170][var172] = null;
                            class183.method1153(var172, var170, (byte) -35);
                        }
                    }
                }
                for (class56 var171 = (class56) class80.field1533.method236(0); var171 != null; var171 = (class56) class80.field1533.method237(true)) {
                    if (class107.field1979 <= var171.field1058 && class107.field1979 + 8 > var171.field1058 && var171.field1057 >= class234.field4365 && class234.field4365 + 8 > var171.field1057 && class217.field4036 == var171.field1043) {
                        var171.field1047 = 0;
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 19) {
                long var173 = class21.field505.method709((byte) 7);
                int var175 = class21.field505.method675(2);
                byte var176 = class21.field505.method661(255);
                boolean var177 = false;
                if ((var173 & Long.MIN_VALUE) != 0L) {
                    var177 = true;
                }
                if (var177) {
                    if (class75.field1472 == 0) {
                        class202.field3703 = -1;
                        return true;
                    }
                    long var178 = var173 & Long.MAX_VALUE;
                    boolean var180 = false;
                    int var181;
                    for (var181 = 0; class75.field1472 > var181 && (class9.field165[var181].field2555 != var178 || class9.field165[var181].field1537 != var175); var181++) {
                    }
                    if (class75.field1472 > var181) {
                        while (class75.field1472 - 1 > var181) {
                            class9.field165[var181] = class9.field165[var181 + 1];
                            var181++;
                        }
                        class75.field1472--;
                        class9.field165[class75.field1472] = null;
                    }
                } else {
                    class222 var182 = class21.field505.method674(-93);
                    class80 var183 = new class80();
                    var183.field2555 = var173;
                    var183.field1529 = class204.method1317((byte) -82, var183.field2555);
                    var183.field1536 = var176;
                    var183.field1537 = var175;
                    var183.field1534 = var182;
                    int var184;
                    for (var184 = class75.field1472 - 1; var184 >= 0; var184--) {
                        int var185 = class9.field165[var184].field1529.method1420((byte) -38, var183.field1529);
                        if (var185 == 0) {
                            class9.field165[var184].field1537 = var175;
                            class9.field165[var184].field1536 = var176;
                            class9.field165[var184].field1534 = var182;
                            class202.field3703 = -1;
                            if (class66.field1245 == var173) {
                                class139.field2682 = var176;
                            }
                            class50.field977 = class28.field616;
                            return true;
                        }
                        if (var185 < 0) {
                            break;
                        }
                    }
                    if (class9.field165.length <= class75.field1472) {
                        class202.field3703 = -1;
                        return true;
                    }
                    for (int var186 = class75.field1472 - 1; var186 > var184; var186--) {
                        class9.field165[var186 + 1] = class9.field165[var186];
                    }
                    if (class75.field1472 == 0) {
                        class9.field165 = new class80[100];
                    }
                    class9.field165[var184 + 1] = var183;
                    class75.field1472++;
                    if (class66.field1245 == var173) {
                        class139.field2682 = var176;
                    }
                }
                class202.field3703 = -1;
                class50.field977 = class28.field616;
                return true;
            } else if (class202.field3703 == 222) {
                class234.method1527(class21.field505, -118);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 39) {
                int var187 = class70.field1306 + class21.field505.field2053;
                int var188 = class21.field505.method675(2);
                int var189 = class21.field505.method675(2);
                if (class25.field580 != var188) {
                    class25.field580 = var188;
                    client.method268(-17403, class25.field580);
                    class200.method1279((byte) -25);
                    class10.method91((byte) 16, class25.field580);
                    for (int var190 = 0; var190 < 100; var190++) {
                        class93.field1746[var190] = true;
                    }
                }
                while (var189-- > 0) {
                    int var199 = class21.field505.method710(28908);
                    int var200 = class21.field505.method675(2);
                    int var201 = class21.field505.method662((byte) -96);
                    class21 var202 = (class21) class208.field3863.method1520((long) var199, 22);
                    if (var202 != null && var202.field493 != var200) {
                        class168.method1081(true, (byte) -124, var202);
                        var202 = null;
                    }
                    if (var202 == null) {
                        var202 = class172.method1092(68, var201, var200, var199);
                    }
                    var202.field500 = true;
                }
                for (class21 var191 = (class21) class208.field3863.method1517(0); var191 != null; var191 = (class21) class208.field3863.method1522(-1)) {
                    if (var191.field500) {
                        var191.field500 = false;
                    } else {
                        class168.method1081(true, (byte) -109, var191);
                    }
                }
                class217.field4032 = new class232(512);
                while (var187 > class21.field505.field2053) {
                    int var192 = class21.field505.method710(28908);
                    int var193 = class21.field505.method675(2);
                    int var194 = class21.field505.method675(2);
                    int var195 = class21.field505.method710(28908);
                    for (int var196 = var193; var196 <= var194; var196++) {
                        long var197 = ((long) var192 << 32) + (long) var196;
                        class217.field4032.method1519(true, new class139(var195), var197);
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 47) {
                for (int var203 = 0; var203 < class93.field1751.length; var203++) {
                    if (class93.field1751[var203] != class210.field3909[var203]) {
                        class93.field1751[var203] = class210.field3909[var203];
                        class208.method1336(var203, -135);
                        class111.field2077[class139.method876(31, class183.field3395++)] = var203;
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 227) {
                int var204 = class21.field505.method679((byte) 114);
                int var205 = class21.field505.method691(-128);
                int var206 = class21.field505.method710(28908);
                class13 var207 = class10.method92(923, var206);
                class202.field3703 = -1;
                var207.field243 = (var205 << 16) + var204;
                return true;
            } else if (class202.field3703 == 156) {
                class234.field4365 = class21.field505.method680(-20040);
                class107.field1979 = class21.field505.method680(-20040);
                while (class21.field505.field2053 < class70.field1306) {
                    class202.field3703 = class21.field505.method662((byte) -98);
                    class43.method325((byte) -123);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 230) {
                int var208 = class21.field505.method681(false);
                class13 var209 = class10.method92(923, var208);
                var209.field325 = 3;
                var209.field224 = class17.field432.field850.method1481((byte) 39);
                class80.method527(var209, 31702);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 115) {
                int var210 = class21.field505.method686(106);
                class87.method563(var210, (byte) 48);
                class128.field2467[class139.method876(31, class229.field4318++)] = class139.method876(var210, 32767);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 0) {
                int var211 = class21.field505.method675(2);
                if (var211 == 65535) {
                    var211 = -1;
                }
                int var212 = class21.field505.method662((byte) -120);
                int var213 = class21.field505.method675(2);
                class197.method1211(var213, var212, (byte) 65, var211);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 95) {
                class234.method1529((byte) 117);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 14) {
                int var214 = class21.field505.method675(2);
                if (var214 == 65535) {
                    var214 = -1;
                }
                int var215 = class21.field505.method704(-1405);
                class13 var216 = class10.method92(923, var215);
                if (var216.field325 != 1 || var216.field224 != var214) {
                    var216.field325 = 1;
                    var216.field224 = var214;
                    class80.method527(var216, 31702);
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 113) {
                int var217 = class21.field505.method688((byte) -30);
                int var218 = class21.field505.method688((byte) -74);
                int var219 = class21.field505.method662((byte) -111);
                class217.field4036 = var217 >> 1;
                class17.field432.method477(var218, var219, -126, ~(var217 & 0x1) == -2);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 181) {
                long var220 = class21.field505.method709((byte) 7);
                int var222 = class21.field505.method675(2);
                class222 var223 = class75.method504(true, var222).method1114(class21.field505, (byte) -71);
                class110.method715(null, 19, var222, var223, 106, class204.method1317((byte) 39, var220).method1409(-7899));
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 148) {
                long var224 = class21.field505.method709((byte) 7);
                class21.field505.method661(255);
                long var226 = class21.field505.method709((byte) 7);
                long var228 = (long) class21.field505.method675(2);
                long var230 = (long) class21.field505.method701(869322848);
                int var232 = class21.field505.method662((byte) -115);
                long var233 = (var228 << 32) + var230;
                boolean var235 = false;
                for (int var236 = 0; var236 < 100; var236++) {
                    if (class229.field4317[var236] == var233) {
                        var235 = true;
                        break;
                    }
                }
                if (var232 <= 1) {
                    for (int var237 = 0; var237 < class113.field2131; var237++) {
                        if (class64.field1173[var237] == var224) {
                            var235 = true;
                            break;
                        }
                    }
                }
                if (!var235 && class91.field1714 == 0) {
                    class229.field4317[class56.field1066] = var233;
                    class56.field1066 = (class56.field1066 + 1) % 100;
                    class222 var238 = class142.method906(class42.method318(class21.field505, (byte) 0).method1424(-6264));
                    if (var232 == 2 || var232 == 3) {
                        class230.method1513(class204.method1317((byte) -100, var226).method1409(-7899), class234.method1531(new class222[] { class58.field1085, class204.method1317((byte) 116, var224).method1409(-7899) }, -10949), -1, 9, var238);
                    } else if (var232 == 1) {
                        class230.method1513(class204.method1317((byte) 105, var226).method1409(-7899), class234.method1531(new class222[] { class179.field3333, class204.method1317((byte) 58, var224).method1409(-7899) }, -10949), -1, 9, var238);
                    } else {
                        class230.method1513(class204.method1317((byte) -127, var226).method1409(-7899), class204.method1317((byte) -119, var224).method1409(-7899), -1, 9, var238);
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 142) {
                int var239 = class21.field505.method691(-128);
                int var240 = class21.field505.method681(false);
                class13 var241 = class10.method92(923, var240);
                if (var241 != null && var241.field365 == 0) {
                    if (var241.field354 - var241.field245 < var239) {
                        var239 = var241.field354 - var241.field245;
                    }
                    if (var239 < 0) {
                        var239 = 0;
                    }
                    if (var241.field314 != var239) {
                        var241.field314 = var239;
                        class80.method527(var241, 31702);
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 82) {
                int var242 = class21.field505.method705((byte) 123);
                int var243 = class21.field505.method679((byte) 125);
                int var244 = class21.field505.method706((byte) -99);
                class21 var245 = (class21) class208.field3863.method1520((long) var244, 46);
                if (var245 != null) {
                    class168.method1081(var245.field493 != var243, (byte) -95, var245);
                }
                class172.method1092(61, var242, var243, var244);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 28) {
                long var246 = class21.field505.method709((byte) 7);
                long var248 = (long) class21.field505.method675(2);
                long var250 = (long) class21.field505.method701(869322848);
                long var252 = (var248 << 32) + var250;
                int var254 = class21.field505.method662((byte) -120);
                boolean var255 = false;
                int var256 = class21.field505.method675(2);
                for (int var257 = 0; var257 < 100; var257++) {
                    if (class229.field4317[var257] == var252) {
                        var255 = true;
                        break;
                    }
                }
                if (var254 <= 1) {
                    for (int var258 = 0; var258 < class113.field2131; var258++) {
                        if (class64.field1173[var258] == var246) {
                            var255 = true;
                            break;
                        }
                    }
                }
                if (!var255 && class91.field1714 == 0) {
                    class229.field4317[class56.field1066] = var252;
                    class56.field1066 = (class56.field1066 + 1) % 100;
                    class222 var259 = class75.method504(true, var256).method1114(class21.field505, (byte) -118);
                    if (var254 == 2) {
                        class110.method715(null, 18, var256, var259, 69, class234.method1531(new class222[] { class58.field1085, class204.method1317((byte) -72, var246).method1409(-7899) }, -10949));
                    } else if (var254 == 1) {
                        class110.method715(null, 18, var256, var259, 39, class234.method1531(new class222[] { class179.field3333, class204.method1317((byte) -71, var246).method1409(-7899) }, -10949));
                    } else {
                        class110.method715(null, 18, var256, var259, 86, class204.method1317((byte) 126, var246).method1409(-7899));
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 10) {
                long var260 = class21.field505.method709((byte) 7);
                class21.field505.method661(255);
                long var262 = class21.field505.method709((byte) 7);
                long var264 = (long) class21.field505.method675(2);
                long var266 = (long) class21.field505.method701(869322848);
                int var268 = class21.field505.method662((byte) -101);
                int var269 = class21.field505.method675(2);
                long var270 = (var264 << 32) + var266;
                boolean var272 = false;
                for (int var273 = 0; var273 < 100; var273++) {
                    if (class229.field4317[var273] == var270) {
                        var272 = true;
                        break;
                    }
                }
                if (var268 <= 1) {
                    for (int var274 = 0; var274 < class113.field2131; var274++) {
                        if (class64.field1173[var274] == var260) {
                            var272 = true;
                            break;
                        }
                    }
                }
                if (!var272 && class91.field1714 == 0) {
                    class229.field4317[class56.field1066] = var270;
                    class56.field1066 = (class56.field1066 + 1) % 100;
                    class222 var275 = class75.method504(true, var269).method1114(class21.field505, (byte) -72);
                    if (var268 == 2 || var268 == 3) {
                        class110.method715(class204.method1317((byte) 99, var262).method1409(-7899), 20, var269, var275, 89, class234.method1531(new class222[] { class58.field1085, class204.method1317((byte) -56, var260).method1409(-7899) }, -10949));
                    } else if (var268 == 1) {
                        class110.method715(class204.method1317((byte) 81, var262).method1409(-7899), 20, var269, var275, 16, class234.method1531(new class222[] { class179.field3333, class204.method1317((byte) -71, var260).method1409(-7899) }, -10949));
                    } else {
                        class110.method715(class204.method1317((byte) -75, var262).method1409(-7899), 20, var269, var275, 94, class204.method1317((byte) -82, var260).method1409(-7899));
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 206) {
                class44.field928 = true;
                class116.field2220 = class21.field505.method662((byte) -99);
                class212.field3944 = class21.field505.method662((byte) -101);
                class203.field3726 = class21.field505.method675(2);
                class233.field4357 = class21.field505.method662((byte) -109);
                class213.field3956 = class21.field505.method662((byte) -90);
                if (class213.field3956 >= 100) {
                    int var276 = class116.field2220 * 128 + 64;
                    int var277 = class212.field3944 * 128 + 64;
                    int var278 = class71.method482(var277, var276, class217.field4036, (byte) 125) - class203.field3726;
                    int var279 = var278 - class118.field2243;
                    int var280 = var276 - class211.field3923;
                    int var281 = var277 - class110.field2059;
                    int var282 = (int) Math.sqrt((double) (var280 * var280 + var281 * var281));
                    class11.field213 = (int) (Math.atan2((double) var279, (double) var282) * 325.949D) & 0x7FF;
                    class54.field1021 = (int) (Math.atan2((double) var280, (double) var281) * -325.949D) & 0x7FF;
                    if (class11.field213 < 128) {
                        class11.field213 = 128;
                    }
                    if (class11.field213 > 383) {
                        class11.field213 = 383;
                    }
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 191) {
                class128.method812(false, 3);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 97) {
                int var283 = class21.field505.method662((byte) -88);
                int var284 = var283 >> 6;
                class115 var285 = new class115();
                var285.field2187 = var283 & 0x3F;
                var285.field2185 = class21.field505.method662((byte) -98);
                if (var285.field2185 >= 0 && class91.field1709.length > var285.field2185) {
                    if (var285.field2187 == 1 || var285.field2187 == 10) {
                        var285.field2192 = class21.field505.method675(2);
                        class21.field505.field2053 += 3;
                    } else if (var285.field2187 >= 2 && var285.field2187 <= 6) {
                        if (var285.field2187 == 2) {
                            var285.field2188 = 64;
                            var285.field2190 = 64;
                        }
                        if (var285.field2187 == 3) {
                            var285.field2190 = 64;
                            var285.field2188 = 0;
                        }
                        if (var285.field2187 == 4) {
                            var285.field2188 = 128;
                            var285.field2190 = 64;
                        }
                        if (var285.field2187 == 5) {
                            var285.field2188 = 64;
                            var285.field2190 = 0;
                        }
                        if (var285.field2187 == 6) {
                            var285.field2190 = 128;
                            var285.field2188 = 64;
                        }
                        var285.field2187 = 2;
                        var285.field2191 = class21.field505.method675(2);
                        var285.field2184 = class21.field505.method675(2);
                        var285.field2189 = class21.field505.method662((byte) -94);
                    }
                    var285.field2194 = class21.field505.method675(2);
                    if (var285.field2194 == 65535) {
                        var285.field2194 = -1;
                    }
                    class128.field2471[var284] = var285;
                }
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 62) {
                int var286 = class21.field505.method686(87);
                if (var286 == 65535) {
                    var286 = -1;
                }
                class47.method341(-125, var286);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 126) {
                int var287 = class21.field505.method691(-128);
                if (var287 == 65535) {
                    var287 = -1;
                }
                int var288 = class21.field505.method711(255);
                class137.method866(var287, 0, var288);
                class202.field3703 = -1;
                return true;
            } else if (class202.field3703 == 66) {
                int var289 = class21.field505.method686(-105);
                int var290 = class21.field505.method710(28908);
                int var291 = class21.field505.method704(-1405);
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var292 = class21.field505.method679((byte) 38);
                if (var292 == 65535) {
                    var292 = -1;
                }
                for (int var293 = var292; var293 <= var289; var293++) {
                    long var294 = ((long) var291 << 32) + (long) var293;
                    class132 var296 = class217.field4032.method1520(var294, 89);
                    if (var296 != null) {
                        var296.method826(-22101);
                    }
                    class217.field4032.method1519(true, new class139(var290), var294);
                }
                class202.field3703 = -1;
                return true;
            } else {
                class68.method464(null, 128, "T1 - " + class202.field3703 + "," + class13.field266 + "," + class173.field3247 + " - " + class70.field1306);
                class137.method865(103);
                return true;
            }
        }
    }
}
