import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class426 extends class472 {

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "Lko;")
    public class190 field6345;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "[Lmd;")
    public static class214[] field6346 = new class214[128];

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V")
    public static void method2658(byte arg0) {
        if (arg0 != 98) {
            method2658((byte) 76);
        }
        field6346 = null;
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(B)Z")
    public static final boolean method2659(byte arg0) throws IOException {
        field6343++;
        if (class541.field7922 == null) {
            return false;
        }
        if (class136.field2073 == null) {
            if (class80.field1314) {
                if (!class541.field7922.method2158(1, -119)) {
                    return false;
                }
                class541.field7922.method2152(0, class424.field6231.field2973, -110, 1);
                class80.field1314 = false;
                class389.field5699++;
                class457.field6788 = 0;
            }
            class424.field6231.field2982 = 0;
            if (class424.field6231.method2676(124)) {
                if (!class541.field7922.method2158(1, -120)) {
                    return false;
                }
                class541.field7922.method2152(1, class424.field6231.field2973, -110, 1);
                class389.field5699++;
                class457.field6788 = 0;
            }
            class80.field1314 = true;
            class55[] var1 = class456.method2795((byte) -83);
            int var2 = class424.field6231.method2672(-687978552);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class424.field6231.field2982);
            }
            class136.field2073 = var1[var2];
            class429.field6369 = class136.field2073.field840;
        }
        if (class429.field6369 == -1) {
            if (!class541.field7922.method2158(1, -124)) {
                return false;
            }
            class541.field7922.method2152(0, class424.field6231.field2973, -117, 1);
            class457.field6788 = 0;
            class389.field5699++;
            class429.field6369 = class424.field6231.field2973[0] & 0xFF;
        }
        if (class429.field6369 == -2) {
            if (!class541.field7922.method2158(2, -122)) {
                return false;
            }
            class541.field7922.method2152(0, class424.field6231.field2973, -119, 2);
            class424.field6231.field2982 = 0;
            class429.field6369 = class424.field6231.method1396(-105);
            class457.field6788 = 0;
            class389.field5699 += 2;
        }
        if (class429.field6369 > 0) {
            if (!class541.field7922.method2158(class429.field6369, -120)) {
                return false;
            }
            class424.field6231.field2982 = 0;
            class541.field7922.method2152(0, class424.field6231.field2973, -49, class429.field6369);
            class457.field6788 = 0;
            class389.field5699 += class429.field6369;
        }
        class404.field5966 = class498.field7255;
        class498.field7255 = class527.field7716;
        class527.field7716 = class136.field2073;
        if (class286.field4464 == class136.field2073) {
            int var3 = class424.field6231.method1357(false);
            int var4 = class424.field6231.method1344(false);
            int var5 = class424.field6231.method1389(255);
            int var6 = class424.field6231.method1389(255);
            if (class186.method1296(0, var4)) {
                class58.method379((byte) -107, var3, (var6 << 16) + var5);
            }
            class136.field2073 = null;
            return true;
        } else if (class71.field1129 == class136.field2073) {
            class29.field311 = class424.field6231.method1376(255);
            class202.field3134 = class424.field6231.method1337((byte) 81);
            class136.field2073 = null;
            return true;
        } else if (class374.field5536 == class136.field2073) {
            String var7 = class424.field6231.method1347(-114);
            boolean var8 = class424.field6231.method1337((byte) 37) == 1;
            String var9;
            if (var8) {
                var9 = class424.field6231.method1347(-90);
            } else {
                var9 = var7;
            }
            int var10 = class424.field6231.method1396(106);
            byte var11 = class424.field6231.method1398(117);
            boolean var12 = false;
            if (var11 == -128) {
                var12 = true;
            }
            if (var12) {
                if (class94.field1505 == 0) {
                    class136.field2073 = null;
                    return true;
                }
                boolean var13 = false;
                int var14;
                for (var14 = 0; class94.field1505 > var14 && (!class433.field6436[var14].field4103.equals(var9) || class433.field6436[var14].field4098 != var10); var14++) {
                }
                if (var14 < class94.field1505) {
                    while (class94.field1505 - 1 > var14) {
                        class433.field6436[var14] = class433.field6436[var14 + 1];
                        var14++;
                    }
                    class94.field1505--;
                    class433.field6436[class94.field1505] = null;
                }
            } else {
                String var15 = class424.field6231.method1347(-102);
                class253 var16 = new class253();
                var16.field4102 = var7;
                var16.field4103 = var9;
                var16.field4104 = class35.method215(var16.field4103, -93);
                var16.field4100 = var15;
                var16.field4101 = var11;
                var16.field4098 = var10;
                int var17;
                for (var17 = class94.field1505 - 1; var17 >= 0; var17--) {
                    int var18 = class433.field6436[var17].field4104.compareTo(var16.field4104);
                    if (var18 == 0) {
                        class433.field6436[var17].field4098 = var10;
                        class433.field6436[var17].field4101 = var11;
                        class433.field6436[var17].field4100 = var15;
                        if (var9.equals(class116.field1781.field7437)) {
                            class368.field5422 = var11;
                        }
                        class367.field5416 = class348.field5194;
                        class136.field2073 = null;
                        return true;
                    }
                    if (var18 < 0) {
                        break;
                    }
                }
                if (class94.field1505 >= class433.field6436.length) {
                    class136.field2073 = null;
                    return true;
                }
                for (int var19 = class94.field1505 - 1; var19 > var17; var19--) {
                    class433.field6436[var19 + 1] = class433.field6436[var19];
                }
                if (class94.field1505 == 0) {
                    class433.field6436 = new class253[100];
                }
                class433.field6436[var17 + 1] = var16;
                class94.field1505++;
                if (var9.equals(class116.field1781.field7437)) {
                    class368.field5422 = var11;
                }
            }
            class367.field5416 = class348.field5194;
            class136.field2073 = null;
            return true;
        } else if (class99.field1530 == class136.field2073) {
            int var20 = class424.field6231.method1337((byte) 31);
            int var21 = var20 >> 5;
            int var22 = var20 & 0x1F;
            if (var22 == 0) {
                class292.field4519[var21] = null;
                class136.field2073 = null;
                return true;
            }
            class417 var23 = new class417();
            var23.field6122 = var22;
            var23.field6128 = class424.field6231.method1337((byte) -112);
            if (var23.field6128 >= 0 && class522.field7668.length > var23.field6128) {
                if (var23.field6122 == 1 || var23.field6122 == 10) {
                    var23.field6121 = class424.field6231.method1396(-111);
                    class424.field6231.field2982 += 6;
                } else if (var23.field6122 >= 2 && var23.field6122 <= 6) {
                    if (var23.field6122 == 2) {
                        var23.field6129 = 64;
                        var23.field6126 = 64;
                    }
                    if (var23.field6122 == 3) {
                        var23.field6126 = 0;
                        var23.field6129 = 64;
                    }
                    if (var23.field6122 == 4) {
                        var23.field6129 = 64;
                        var23.field6126 = 128;
                    }
                    if (var23.field6122 == 5) {
                        var23.field6126 = 64;
                        var23.field6129 = 0;
                    }
                    if (var23.field6122 == 6) {
                        var23.field6126 = 64;
                        var23.field6129 = 128;
                    }
                    var23.field6122 = 2;
                    var23.field6119 = class424.field6231.method1337((byte) -108);
                    var23.field6126 += class424.field6231.method1396(-97) - class422.field6201 << 7;
                    var23.field6129 += class424.field6231.method1396(-112) - class23.field273 << 7;
                    var23.field6120 = class424.field6231.method1337((byte) -113) << 0;
                    var23.field6123 = class424.field6231.method1396(49);
                }
                var23.field6127 = class424.field6231.method1396(74);
                if (var23.field6127 == 65535) {
                    var23.field6127 = -1;
                }
                class292.field4519[var21] = var23;
            }
            class136.field2073 = null;
            return true;
        } else if (class136.field2073 == class115.field1771) {
            class222.field3398 = class424.field6231.method1380(-63) << 3;
            class351.field5228 = class424.field6231.method1380(115) << 3;
            class505.field7332 = class424.field6231.method1337((byte) 119);
            class136.field2073 = null;
            return true;
        } else if (class168.field2546 == class136.field2073) {
            int var24 = class424.field6231.method1396(-110);
            int var25 = class424.field6231.method1357(false);
            int var26 = class424.field6231.method1396(34);
            if (class186.method1296(0, var26)) {
                class482.method2910(4096, var24, var25);
            }
            class136.field2073 = null;
            return true;
        } else if (class153.field2315 == class136.field2073) {
            class505.method3013(true, class408.field6037);
            class136.field2073 = null;
            return true;
        } else if (class539.field7888 == class136.field2073) {
            class378.field5573 = class424.field6231.method1337((byte) -108);
            class136.field2073 = null;
            return true;
        } else if (class390.field5708 == class136.field2073) {
            boolean var27 = class424.field6231.method1337((byte) -121) == 1;
            String var28 = class424.field6231.method1347(-93);
            String var29 = var28;
            if (var27) {
                var29 = class424.field6231.method1347(-104);
            }
            long var30 = class424.field6231.method1351(true);
            long var32 = (long) class424.field6231.method1396(-108);
            long var34 = (long) class424.field6231.method1339(-32768);
            int var36 = class424.field6231.method1337((byte) -110);
            long var37 = (var32 << 32) + var34;
            boolean var39 = false;
            int var40 = 0;
            while (true) {
                if (var40 >= 100) {
                    if (var36 <= 1) {
                        if (!(!class288.field4478 || class421.field6182) || class108.field1638) {
                            var39 = true;
                        } else if (class282.method1900(var29, false)) {
                            var39 = true;
                        }
                    }
                    break;
                }
                if (class512.field7485[var40] == var37) {
                    var39 = true;
                    break;
                }
                var40++;
            }
            if (!var39 && class203.field3136 == 0) {
                class512.field7485[class3.field41] = var37;
                class3.field41 = (class3.field41 + 1) % 100;
                String var41 = class12.method70(60, class393.method2472(class424.field6231, false));
                if (var36 == 2 || var36 == 3) {
                    class167.method1191(122, "<img=1>" + var28, 0, class34.method206(var30, -124), var41, "<img=1>" + var29, -1, 9);
                } else if (var36 == 1) {
                    class167.method1191(96, "<img=0>" + var28, 0, class34.method206(var30, -123), var41, "<img=0>" + var29, -1, 9);
                } else {
                    class167.method1191(117, var28, 0, class34.method206(var30, -126), var41, var29, -1, 9);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class511.field7477 == class136.field2073) {
            class524.method3120(0);
            class136.field2073 = null;
            return false;
        } else if (class297.field4576 == class136.field2073) {
            class505.method3013(true, class451.field6715);
            class136.field2073 = null;
            return true;
        } else if (class308.field4699 == class136.field2073) {
            class153.field2353 = class424.field6231.method1356(103);
            class288.field4478 = class424.field6231.method1337((byte) -126) == 1;
            class136.field2073 = null;
            return true;
        } else if (class264.field4224 == class136.field2073) {
            String var42 = class424.field6231.method1347(-86);
            int var43 = class424.field6231.method1389(255);
            if (var43 == 65535) {
                var43 = -1;
            }
            int var44 = class424.field6231.method1392(0);
            int var45 = class424.field6231.method1376(255);
            if (var44 >= 1 && var44 <= 8) {
                if (var42.equalsIgnoreCase("null")) {
                    var42 = null;
                }
                class96.field1517[var44 - 1] = var42;
                class52.field791[var44 - 1] = var43;
                class428.field6364[var44 - 1] = var45 == 0;
            }
            class136.field2073 = null;
            return true;
        } else if (class81.field1330 == class136.field2073) {
            byte var46 = class424.field6231.method1380(-46);
            int var47 = class424.field6231.method1391(-109);
            class288.field4476.method2345(var46, var47, false);
            class136.field2073 = null;
            return true;
        } else if (class169.field2568 == class136.field2073) {
            class222.field3398 = class424.field6231.method1380(51) << 3;
            class505.field7332 = class424.field6231.method1383(12504);
            class351.field5228 = class424.field6231.method1398(22) << 3;
            for (class192 var48 = (class192) class249.field3827.method359(true); var48 != null; var48 = (class192) class249.field3827.method365(-109)) {
                int var50 = (int) (var48.field1932 >> 28 & 0x3L);
                int var51 = (int) (var48.field1932 & 0x3FFFL);
                int var52 = var51 - class422.field6201;
                int var53 = (int) (var48.field1932 >> 14 & 0x3FFFL);
                int var54 = var53 - class23.field273;
                if (class505.field7332 == var50 && class222.field3398 <= var52 && var52 < (class222.field3398 + 8) && class351.field5228 <= var54 && class351.field5228 + 8 > var54) {
                    var48.method947((byte) 101);
                    if (var52 >= 0 && var54 >= 0 && class338.field5076 > var52 && var54 < class250.field4077) {
                        class25.method153(var54, class505.field7332, 31755, var52);
                    }
                }
            }
            for (class541 var49 = (class541) class368.field5420.method295((byte) -127); var49 != null; var49 = (class541) class368.field5420.method296(true)) {
                if (class222.field3398 <= var49.field7927 && var49.field7927 < (class222.field3398 + 8) && var49.field7925 >= class351.field5228 && var49.field7925 < class351.field5228 + 8 && class505.field7332 == var49.field7918) {
                    var49.field7924 = 0;
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class222.field3397 == class136.field2073) {
            int var55 = class424.field6231.method1396(-3);
            if (var55 == 65535) {
                var55 = -1;
            }
            int var56 = class424.field6231.method1337((byte) -107);
            int var57 = class424.field6231.method1396(-84);
            int var58 = class424.field6231.method1337((byte) 62);
            class415.method2602(var55, var58, var57, -51, var56);
            class136.field2073 = null;
            return true;
        } else if (class290.field4491 == class136.field2073) {
            class56.method368(class424.field6231, -2, class122.field1844, class429.field6369);
            class136.field2073 = null;
            return true;
        } else if (class228.field3448 == class136.field2073) {
            int var59 = class424.field6231.method1335(false);
            int var60 = class424.field6231.method1371(255);
            int var61 = class424.field6231.method1361(3);
            int var62 = class424.field6231.method1344(false);
            if (class186.method1296(0, var62)) {
                class115.method878(var59, var61, -7696, var60);
            }
            class136.field2073 = null;
            return true;
        } else if (class87.field1424 == class136.field2073) {
            int var63 = class424.field6231.method1396(-128);
            if (class186.method1296(0, var63)) {
                class187.method1300(0);
            }
            class136.field2073 = null;
            return true;
        } else if (class148.field2197 == class136.field2073) {
            int var64 = class424.field6231.method1361(3);
            int var65 = class424.field6231.method1401(-55);
            int var66 = class424.field6231.method1344(false);
            int var67 = class424.field6231.method1344(false);
            if (class186.method1296(0, var66)) {
                class167.method1190(var67, var65, true, var64, 5);
            }
            class136.field2073 = null;
            return true;
        } else if (class136.field2073 == class118.field1817) {
            int var68 = class424.field6231.method1389(255);
            int var69 = class424.field6231.method1345((byte) -117);
            int var70 = class424.field6231.method1396(-117);
            if (class186.method1296(0, var70)) {
                class504.method3004(var69, var68, false);
            }
            class136.field2073 = null;
            return true;
        } else if (class508.field7388 == class136.field2073) {
            int var71 = class424.field6231.method1396(-89);
            int var72 = class424.field6231.method1396(38);
            int var73 = class424.field6231.method1376(255);
            class5 var74 = (class5) class366.field5398.method358((byte) 117, (long) var71);
            if (var74 != null) {
                class411.method2585(var72, var73, 15101, var74.field65);
            }
            class136.field2073 = null;
            return true;
        } else if (class361.field5322 == class136.field2073) {
            class505.method3013(true, class94.field1499);
            class136.field2073 = null;
            return true;
        } else if (class283.field4422 == class136.field2073) {
            int var75 = class424.field6231.method1396(-119);
            int var76 = class424.field6231.method1361(3);
            int var77 = class424.field6231.method1396(11);
            if (class186.method1296(0, var75)) {
                class183.method1276(var77, var76, (byte) -58);
            }
            class136.field2073 = null;
            return true;
        } else if (class340.field5088 == class136.field2073) {
            class136.field2073 = null;
            class221.field3314 = class348.field5194;
            class6.field76 = 1;
            return true;
        } else if (class83.field1345 == class136.field2073) {
            int var78 = class424.field6231.method1357(false);
            int var79 = class424.field6231.method1391(-10);
            if (var79 == 65535) {
                var79 = -1;
            }
            int var80 = class424.field6231.method1344(false);
            if (class186.method1296(0, var80)) {
                class167.method1190(var79, var78, true, -1, 2);
            }
            class136.field2073 = null;
            return true;
        } else if (class56.field861 == class136.field2073) {
            boolean var81 = class424.field6231.method1337((byte) -115) == 1;
            String var82 = class424.field6231.method1347(-87);
            String var83 = var82;
            if (var81) {
                var83 = class424.field6231.method1347(-93);
            }
            long var84 = (long) class424.field6231.method1396(77);
            long var86 = (long) class424.field6231.method1339(-32768);
            int var88 = class424.field6231.method1337((byte) 97);
            int var89 = class424.field6231.method1396(15);
            long var90 = (var84 << 32) + var86;
            boolean var92 = false;
            int var93 = 0;
            while (true) {
                if (var93 >= 100) {
                    if (var88 <= 1 && class282.method1900(var83, false)) {
                        var92 = true;
                    }
                    break;
                }
                if (class512.field7485[var93] == var90) {
                    var92 = true;
                    break;
                }
                var93++;
            }
            if (!var92 && class203.field3136 == 0) {
                class512.field7485[class3.field41] = var90;
                class3.field41 = (class3.field41 + 1) % 100;
                String var94 = class376.field5554.method1083(1, var89).method973(-125, class424.field6231);
                if (var88 == 2) {
                    class167.method1191(92, "<img=1>" + var82, 0, null, var94, "<img=1>" + var83, var89, 18);
                } else if (var88 == 1) {
                    class167.method1191(70, "<img=0>" + var82, 0, null, var94, "<img=0>" + var83, var89, 18);
                } else {
                    class167.method1191(114, var82, 0, null, var94, var83, var89, 18);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class452.field6721 == class136.field2073) {
            if (class134.field2010 != -1) {
                class306.method2022(class134.field2010, 0, (byte) 93);
            }
            class136.field2073 = null;
            return true;
        } else if (class238.field3575 == class136.field2073) {
            boolean var95 = class424.field6231.method1337((byte) 97) == 1;
            byte[] var96 = new byte[class429.field6369 - 1];
            class424.field6231.method1338(0, class429.field6369 - 1, var96, 113);
            class61.method409(var95, var96, (byte) -40);
            class136.field2073 = null;
            return true;
        } else if (class299.field4605 == class136.field2073) {
            for (int var97 = 0; var97 < class530.field7747.length; var97++) {
                if (class530.field7747[var97] != null) {
                    class530.field7747[var97].field7644 = -1;
                }
            }
            for (int var98 = 0; var98 < class412.field6081; var98++) {
                class166.field2507[var98].field65.field7644 = -1;
            }
            class136.field2073 = null;
            return true;
        } else if (class53.field822 == class136.field2073) {
            int var99 = class424.field6231.method1396(-4);
            int var100 = class424.field6231.method1337((byte) 32);
            boolean var101 = (var100 & 0x1) == 1;
            class50.method329(var99, 0, var101);
            int var102 = class424.field6231.method1396(-90);
            for (int var103 = 0; var103 < var102; var103++) {
                int var104 = class424.field6231.method1383(12504);
                if (var104 == 255) {
                    var104 = class424.field6231.method1401(-128);
                }
                int var105 = class424.field6231.method1391(-56);
                class434.method2694(1, var103, var99, var104, var101, var105 - 1);
            }
            class268.field4264[class307.method2028(31, class243.field3677++)] = var99;
            class136.field2073 = null;
            return true;
        } else if (class75.field1270 == class136.field2073) {
            class424.field6231.field2982 += 28;
            if (class424.field6231.method1352(255)) {
                class510.method3036(-3255, class424.field6231, class424.field6231.field2982 - 28);
            }
            class136.field2073 = null;
            return true;
        } else if (class3.field46 == class136.field2073) {
            class505.method3013(true, class474.field6945);
            class136.field2073 = null;
            return true;
        } else if (class50.field773 == class136.field2073) {
            String var106 = class424.field6231.method1347(-94);
            int var107 = class424.field6231.method1396(-2);
            String var108 = class376.field5554.method1083(1, var107).method973(-121, class424.field6231);
            class167.method1191(112, var106, 0, null, var108, var106, var107, 19);
            class136.field2073 = null;
            return true;
        } else if (class449.field6683 == class136.field2073) {
            class505.method3013(true, class482.field7064);
            class136.field2073 = null;
            return true;
        } else if (class470.field6900 == class136.field2073) {
            int var109 = class424.field6231.method1389(255);
            int var110 = class424.field6231.method1345((byte) -110);
            if (class186.method1296(0, var109)) {
                class167.method1190(-1, var110, true, -1, 3);
            }
            class136.field2073 = null;
            return true;
        } else if (class483.field7075 == class136.field2073) {
            class367.field5416 = class348.field5194;
            if (class429.field6369 == 0) {
                class216.field3274 = null;
                class377.field5557 = null;
                class136.field2073 = null;
                class433.field6436 = null;
                class94.field1505 = 0;
                return true;
            }
            class377.field5557 = class424.field6231.method1347(-113);
            boolean var111 = class424.field6231.method1337((byte) 30) == 1;
            if (var111) {
                class424.field6231.method1347(-90);
            }
            long var112 = class424.field6231.method1351(true);
            class216.field3274 = class144.method1029(var112, -17639);
            class415.field6099 = class424.field6231.method1398(28);
            int var114 = class424.field6231.method1337((byte) -110);
            if (var114 == 255) {
                class136.field2073 = null;
                return true;
            }
            class94.field1505 = var114;
            class253[] var115 = new class253[100];
            for (int var116 = 0; var116 < class94.field1505; var116++) {
                var115[var116] = new class253();
                var115[var116].field4102 = class424.field6231.method1347(-104);
                boolean var122 = class424.field6231.method1337((byte) -115) == 1;
                if (var122) {
                    var115[var116].field4103 = class424.field6231.method1347(-94);
                } else {
                    var115[var116].field4103 = var115[var116].field4102;
                }
                var115[var116].field4104 = class35.method215(var115[var116].field4103, -111);
                var115[var116].field4098 = class424.field6231.method1396(-120);
                var115[var116].field4101 = class424.field6231.method1398(67);
                var115[var116].field4100 = class424.field6231.method1347(-127);
                if (var115[var116].field4103.equals(class116.field1781.field7437)) {
                    class368.field5422 = var115[var116].field4101;
                }
            }
            boolean var117 = false;
            int var118 = class94.field1505;
            while (var118 > 0) {
                boolean var119 = true;
                var118--;
                for (int var120 = 0; var120 < var118; var120++) {
                    if (var115[var120].field4104.compareTo(var115[var120 + 1].field4104) > 0) {
                        class253 var121 = var115[var120];
                        var115[var120] = var115[var120 + 1];
                        var119 = false;
                        var115[var120 + 1] = var121;
                    }
                }
                if (var119) {
                    break;
                }
            }
            class136.field2073 = null;
            class433.field6436 = var115;
            return true;
        } else if (class346.field5148 == class136.field2073) {
            class505.method3013(true, class294.field4538);
            class136.field2073 = null;
            return true;
        } else if (class225.field3430 == class136.field2073) {
            int var123 = class424.field6231.method1357(false);
            int var124 = class424.field6231.method1344(false);
            int var125 = class424.field6231.method1383(12504);
            if (class186.method1296(0, var124)) {
                class394.method2477(var125, var123, -23862);
            }
            class136.field2073 = null;
            return true;
        } else if (class377.field5571 == class136.field2073) {
            int var126 = class424.field6231.method1401(-10);
            int var127 = class424.field6231.method1396(-117);
            int var128 = class424.field6231.method1344(false);
            if (class186.method1296(0, var128)) {
                class441.method2729(true, var126, var127);
            }
            class136.field2073 = null;
            return true;
        } else if (class26.field295 == class136.field2073) {
            class321.method2119(true, 107);
            class136.field2073 = null;
            return true;
        } else if (class183.field2804 == class136.field2073) {
            int var129 = class424.field6231.method1391(-52);
            int var130 = class424.field6231.method1344(false);
            int var131 = class424.field6231.method1389(255);
            if (class186.method1296(0, var129)) {
                class209.method1459(0, (byte) -102, var131, var130);
            }
            class136.field2073 = null;
            return true;
        } else if (class408.field6038 == class136.field2073) {
            class446.method2748(true);
            class136.field2073 = null;
            return true;
        } else if (class136.field2073 == class104.field1604) {
            int var132 = class424.field6231.method1345((byte) -119);
            int var133 = class424.field6231.method1345((byte) -125);
            int var134 = class424.field6231.method1391(-94);
            if (class186.method1296(0, var134)) {
                class295 var135 = (class295) class215.field3248.method358((byte) -125, (long) var132);
                class295 var136 = (class295) class215.field3248.method358((byte) -116, (long) var133);
                if (var136 != null) {
                    class336.method2188(var135 == null || var135.field4546 != var136.field4546, 1, false, var136);
                }
                if (var135 != null) {
                    var135.method947((byte) 125);
                    class215.field3248.method357(var135, 1, (long) var133);
                }
                class38 var137 = class159.method1143(-357225936, var132);
                if (var137 != null) {
                    class5.method27(var137, -208246073);
                }
                class38 var138 = class159.method1143(-357225936, var133);
                if (var138 != null) {
                    class5.method27(var138, -208246073);
                    class93.method789(true, (byte) -118, var138);
                }
                if (class134.field2010 != -1) {
                    class306.method2022(class134.field2010, 1, (byte) 60);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class370.field5508 == class136.field2073) {
            int var139 = class424.field6231.method1396(-120);
            int var140 = class424.field6231.method1337((byte) 126);
            int var141 = class424.field6231.method1337((byte) 100);
            int var142 = class424.field6231.method1396(-98) << 0;
            int var143 = class424.field6231.method1337((byte) -118);
            int var144 = class424.field6231.method1337((byte) 64);
            if (class186.method1296(0, var139)) {
                class383.method2438(var142, var141, var144, var140, (byte) -115, var143);
            }
            class136.field2073 = null;
            return true;
        } else if (class240.field3610 == class136.field2073) {
            class463.field6863 = class462.method2833(class424.field6231.method1337((byte) 50), -1);
            class136.field2073 = null;
            return true;
        } else if (class172.field2669 == class136.field2073) {
            int var145 = class424.field6231.method1376(255);
            int var146 = var145 >> 2;
            int var147 = var145 & 0x3;
            int var148 = class184.field2828[var146];
            int var149 = class424.field6231.method1396(-125);
            if (var149 == 65535) {
                var149 = -1;
            }
            int var150 = class424.field6231.method1401(126);
            int var151 = (var150 & 0x3C2B4190) >> 28;
            int var152 = var150 >> 14 & 0x3FFF;
            int var153 = var152 - class422.field6201;
            int var154 = var150 & 0x3FFF;
            int var155 = var154 - class23.field273;
            class76.method699(false, var146, var149, var153, var147, var151, var148, var155);
            class136.field2073 = null;
            return true;
        } else if (class186.field2861 == class136.field2073) {
            String var156 = class424.field6231.method1347(-116);
            int var157 = class424.field6231.method1396(-125);
            int var158 = class424.field6231.method1396(-109);
            if (class186.method1296(0, var157)) {
                class49.method327((byte) 74, var158, var156);
            }
            class136.field2073 = null;
            return true;
        } else if (class46.field712 == class136.field2073) {
            int var159 = class424.field6231.method1396(-12);
            int var160 = class424.field6231.method1337((byte) -121);
            boolean var161 = (var160 & 0x1) == 1;
            while (class424.field6231.field2982 < class429.field6369) {
                int var162 = class424.field6231.method1340(-68);
                int var163 = class424.field6231.method1396(-126);
                int var164 = 0;
                if (var163 != 0) {
                    var164 = class424.field6231.method1337((byte) -116);
                    if (var164 == 255) {
                        var164 = class424.field6231.method1401(123);
                    }
                }
                class434.method2694(1, var162, var159, var164, var161, var163 - 1);
            }
            class268.field4264[class307.method2028(class243.field3677++, 31)] = var159;
            class136.field2073 = null;
            return true;
        } else if (class209.field3194 == class136.field2073) {
            boolean var165 = class424.field6231.method1337((byte) 59) == 1;
            String var166 = class424.field6231.method1347(-100);
            String var167 = var166;
            if (var165) {
                var167 = class424.field6231.method1347(-104);
            }
            long var168 = class424.field6231.method1351(true);
            long var170 = (long) class424.field6231.method1396(-85);
            long var172 = (long) class424.field6231.method1339(-32768);
            int var174 = class424.field6231.method1337((byte) 81);
            int var175 = class424.field6231.method1396(81);
            long var176 = (var170 << 32) + var172;
            boolean var178 = false;
            int var179 = 0;
            while (true) {
                if (var179 >= 100) {
                    if (var174 <= 1 && class282.method1900(var167, false)) {
                        var178 = true;
                    }
                    break;
                }
                if (class512.field7485[var179] == var176) {
                    var178 = true;
                    break;
                }
                var179++;
            }
            if (!var178 && class203.field3136 == 0) {
                class512.field7485[class3.field41] = var176;
                class3.field41 = (class3.field41 + 1) % 100;
                String var180 = class376.field5554.method1083(1, var175).method973(-123, class424.field6231);
                if (var174 == 2) {
                    class167.method1191(63, "<img=1>" + var166, 0, class34.method206(var168, -120), var180, "<img=1>" + var167, var175, 20);
                } else if (var174 == 1) {
                    class167.method1191(52, "<img=0>" + var166, 0, class34.method206(var168, -122), var180, "<img=0>" + var167, var175, 20);
                } else {
                    class167.method1191(30, var166, 0, class34.method206(var168, -124), var180, var167, var175, 20);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (arg0 <= 75) {
            return true;
        } else if (class293.field4522 == class136.field2073) {
            int var181 = class424.field6231.method1340(-80);
            int var182 = class424.field6231.method1401(-25);
            int var183 = class424.field6231.method1337((byte) -6);
            String var184 = "";
            String var185 = var184;
            if ((var183 & 0x1) != 0) {
                var184 = class424.field6231.method1347(-104);
                if ((var183 & 0x2) == 0) {
                    var185 = var184;
                } else {
                    var185 = class424.field6231.method1347(-98);
                }
            }
            String var186 = class424.field6231.method1347(-125);
            if (var181 == 99) {
                class442.method2733(var186, 8);
            } else if (var185.equals("") || !class282.method1900(var185, false)) {
                class58.method380(var184, var186, var181, var182, var185, 76);
            } else {
                class136.field2073 = null;
                return true;
            }
            class136.field2073 = null;
            return true;
        } else if (class523.field7675 == class136.field2073) {
            int var187 = class424.field6231.method1389(255);
            int var188 = class424.field6231.method1357(false);
            int var189 = class424.field6231.method1391(-110);
            if (var189 == 65535) {
                var189 = -1;
            }
            int var190 = class424.field6231.method1389(255);
            if (var190 == 65535) {
                var190 = -1;
            }
            int var191 = class424.field6231.method1389(255);
            if (class186.method1296(0, var191)) {
                for (int var192 = var189; var192 <= var190; var192++) {
                    long var193 = ((long) var188 << 32) + (long) var192;
                    class94 var195 = (class94) class392.field5721.method358((byte) 84, var193);
                    class94 var196;
                    if (var195 != null) {
                        var196 = new class94(var195.field1503, var187);
                        var195.method947((byte) 100);
                    } else if (var192 == -1) {
                        var196 = new class94(class159.method1143(-357225936, var188).field646.field1503, var187);
                    } else {
                        var196 = new class94(0, var187);
                    }
                    class392.field5721.method357(var196, 1, var193);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class410.field6064 == class136.field2073) {
            boolean var197 = class424.field6231.method1337((byte) 12) == 1;
            String var198 = class424.field6231.method1347(-110);
            String var199 = var198;
            if (var197) {
                var199 = class424.field6231.method1347(-82);
            }
            int var200 = class424.field6231.method1337((byte) -108);
            int var201 = class424.field6231.method1396(84);
            boolean var202 = false;
            if (var200 <= 1 && class282.method1900(var199, false)) {
                var202 = true;
            }
            if (!var202 && class203.field3136 == 0) {
                String var203 = class376.field5554.method1083(1, var201).method973(-125, class424.field6231);
                if (var200 == 2) {
                    class167.method1191(29, "<img=1>" + var198, 0, null, var203, "<img=1>" + var199, var201, 25);
                } else if (var200 == 1) {
                    class167.method1191(126, "<img=0>" + var198, 0, null, var203, "<img=0>" + var199, var201, 25);
                } else {
                    class167.method1191(104, var198, 0, null, var203, var199, var201, 25);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class185.field2830 == class136.field2073) {
            int var204 = class424.field6231.method1389(255);
            if (var204 == 65535) {
                var204 = -1;
            }
            int var205 = class424.field6231.method1357(false);
            int var206 = class424.field6231.method1401(-45);
            int var207 = class424.field6231.method1391(-115);
            if (var207 == 65535) {
                var207 = -1;
            }
            int var208 = class424.field6231.method1344(false);
            if (class186.method1296(0, var208)) {
                for (int var209 = var204; var209 <= var207; var209++) {
                    long var210 = ((long) var205 << 32) + (long) var209;
                    class94 var212 = (class94) class392.field5721.method358((byte) -122, var210);
                    class94 var213;
                    if (var212 != null) {
                        var213 = new class94(var206, var212.field1498);
                        var212.method947((byte) 126);
                    } else if (var209 == -1) {
                        var213 = new class94(var206, class159.method1143(-357225936, var205).field646.field1498);
                    } else {
                        var213 = new class94(var206, -1);
                    }
                    class392.field5721.method357(var213, 1, var210);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class296.field4562 == class136.field2073) {
            class385.field5672 = class429.field6369 > 2 ? class424.field6231.method1347(-105) : class272.field4291.method1265(class345.field5141, -118);
            class193.field2968 = class429.field6369 <= 0 ? -1 : class424.field6231.method1396(-90);
            class136.field2073 = null;
            if (class193.field2968 == 65535) {
                class193.field2968 = -1;
            }
            return true;
        } else if (class183.field2796 == class136.field2073) {
            class53.method349(false, class429.field6369, class424.field6231);
            class136.field2073 = null;
            return true;
        } else if (class149.field2219 == class136.field2073) {
            class505.method3013(true, class23.field272);
            class136.field2073 = null;
            return true;
        } else if (class279.field4350 == class136.field2073) {
            int var214 = class424.field6231.method1396(101);
            int var215 = class424.field6231.method1396(-11);
            int var216 = class424.field6231.method1396(23);
            int var217 = class424.field6231.method1396(-83);
            if (class186.method1296(0, var214) && class237.field3555[var215] != null) {
                for (int var218 = var216; var218 < var217; var218++) {
                    int var219 = class424.field6231.method1339(-32768);
                    if (class237.field3555[var215].length > var218 && class237.field3555[var215][var218] != null) {
                        class237.field3555[var215][var218].field579 = var219;
                    }
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class398.field5882 == class136.field2073) {
            int var220 = class424.field6231.method1396(-12);
            int var221 = class424.field6231.method1337((byte) -124);
            int var222 = class424.field6231.method1337((byte) -115);
            int var223 = class424.field6231.method1396(89) << 0;
            int var224 = class424.field6231.method1337((byte) -122);
            int var225 = class424.field6231.method1337((byte) -110);
            if (class186.method1296(0, var220)) {
                class153.method1115(var223, true, var221, var222, true, var224, var225);
            }
            class136.field2073 = null;
            return true;
        } else if (class136.field2073 == class105.field1616) {
            class509.field7411 = class424.field6231.method1337((byte) 36);
            class136.field2073 = null;
            class17.field191 = class348.field5194;
            return true;
        } else if (class14.field156 == class136.field2073) {
            int var226 = class424.field6231.method1337((byte) 98);
            int var227 = class424.field6231.method1391(-19);
            int var228 = class424.field6231.method1389(255);
            if (class186.method1296(0, var227)) {
                if (var226 == 2) {
                    class209.method1452((byte) -42);
                }
                class134.field2010 = var228;
                class356.method2272(111, var228);
                class179.method1264(93, false);
                class152.method1094(class134.field2010);
                for (int var229 = 0; var229 < 100; var229++) {
                    class434.field6439[var229] = true;
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class136.field2073 == class101.field1580) {
            class136.field2073 = null;
            return false;
        } else if (class76.field1288 == class136.field2073) {
            class405.method2550(false, 66);
            class136.field2073 = null;
            return false;
        } else if (class428.field6349 == class136.field2073) {
            String var230 = class424.field6231.method1347(-94);
            int var231 = class424.field6231.method1389(255);
            int var232 = class424.field6231.method1389(255);
            if (class186.method1296(0, var232)) {
                class49.method327((byte) -123, var231, var230);
            }
            class136.field2073 = null;
            return true;
        } else if (class142.field2113 == class136.field2073) {
            class505.method3013(true, class499.field7264);
            class136.field2073 = null;
            return true;
        } else if (class313.field4765 == class136.field2073) {
            int var233 = class424.field6231.method1337((byte) 26);
            if (class424.field6231.method1337((byte) 65) == 0) {
                class412.field6084[var233] = new class74();
            } else {
                class424.field6231.field2982--;
                class412.field6084[var233] = new class74(class424.field6231);
            }
            class136.field2073 = null;
            class415.field6100 = class348.field5194;
            return true;
        } else if (class4.field58 == class136.field2073) {
            int var234 = class424.field6231.method1344(false);
            int var235 = class424.field6231.method1357(false);
            int var236 = class424.field6231.method1344(false);
            if (var236 == 65535) {
                var236 = -1;
            }
            int var237 = class424.field6231.method1401(-66);
            if (class186.method1296(0, var234)) {
                class372.method2394(var235, var236, var237, 9);
                class221 var238 = class300.field4608.method2088(var236, 117);
                class188.method1307(true, var238.field3381, var238.field3358, var235, var238.field3359);
                class106.method843(var238.field3305, (byte) -121, var238.field3384, var238.field3336, var235);
            }
            class136.field2073 = null;
            return true;
        } else if (class522.field7664 == class136.field2073) {
            if (class337.field5072 != null) {
                class33.method196(class40.field667.field4208, false, 51, -1, -1);
            }
            byte[] var239 = new byte[class429.field6369];
            class424.field6231.method2665(var239, 0, 0, class429.field6369);
            String var240 = class355.method2267(0, class429.field6369, var239, (byte) -94);
            class164.method1175(var240, class122.field1844, true, 126, class108.field1631 == 1);
            class136.field2073 = null;
            return true;
        } else if (class52.field808 == class136.field2073) {
            class505.method3013(true, class521.field7643);
            class136.field2073 = null;
            return true;
        } else if (class289.field4480 == class136.field2073) {
            int var241 = class424.field6231.method1396(-100);
            int var242 = class424.field6231.method1361(3);
            class288.field4476.method2346(var241, false, var242);
            class136.field2073 = null;
            return true;
        } else if (class404.field5960 == class136.field2073) {
            int var243 = class424.field6231.method1391(-60);
            int var244 = class424.field6231.method1361(3);
            int var245 = class424.field6231.method1389(255);
            int var246 = class424.field6231.method1391(-82);
            int var247 = class424.field6231.method1389(255);
            if (class186.method1296(0, var246)) {
                class167.method1190(var247 | var245 << 16, var244, true, var243, 7);
            }
            class136.field2073 = null;
            return true;
        } else if (class476.field6955 == class136.field2073) {
            class288.field4476.method2341((byte) -35);
            class315.field4811 += 32;
            class136.field2073 = null;
            return true;
        } else if (class454.field6753 == class136.field2073) {
            int var248 = class424.field6231.method1396(-97);
            int var249 = class424.field6231.method1361(3);
            int var250 = class424.field6231.method1344(false);
            int var251 = class424.field6231.method1391(-14);
            int var252 = class424.field6231.method1344(false);
            if (class186.method1296(0, var248)) {
                class188.method1307(true, var250, var252, var249, var251);
            }
            class136.field2073 = null;
            return true;
        } else if (class293.field4532 == class136.field2073) {
            class505.method3013(true, class252.field4096);
            class136.field2073 = null;
            return true;
        } else if (class136.field2073 == class115.field1763) {
            int var253 = class424.field6231.method1401(122);
            int var254 = class424.field6231.method1392(0);
            int var255 = class424.field6231.method1392(0);
            class327.field4955[var255] = var253;
            class156.field2395[var255] = var254;
            class138.field2091[var255] = 1;
            int var256 = class116.field1795[var255] - 1;
            for (int var257 = 0; var257 < var256; var257++) {
                if (var253 >= class11.field125[var257]) {
                    class138.field2091[var255] = var257 + 2;
                }
            }
            class435.field6488[class307.method2028(class125.field1864++, 31)] = var255;
            class136.field2073 = null;
            return true;
        } else if (class417.field6130 == class136.field2073) {
            int var258 = class424.field6231.method1391(-79);
            if (var258 == 65535) {
                var258 = -1;
            }
            int var259 = class424.field6231.method1337((byte) 56);
            int var260 = class424.field6231.method1392(0);
            class283.method1902(var260, 0, var258, var259);
            class136.field2073 = null;
            return true;
        } else if (class370.field5506 == class136.field2073) {
            int var261 = class424.field6231.method1337((byte) 40);
            int var262 = class424.field6231.method1353((byte) 60);
            int var263 = class424.field6231.method1389(255);
            if (var263 == 65535) {
                var263 = -1;
            }
            class314.method2080(var263, -28619, var261, var262);
            class136.field2073 = null;
            return true;
        } else if (class489.field7142 == class136.field2073) {
            int var264 = class424.field6231.method1344(false);
            int var265 = class424.field6231.method1337((byte) 52);
            if (class186.method1296(0, var264)) {
                class383.field5643 = var265;
            }
            class136.field2073 = null;
            return true;
        } else if (class155.field2380 == class136.field2073) {
            class505.method3013(true, class261.field4164);
            class136.field2073 = null;
            return true;
        } else if (class370.field5494 == class136.field2073) {
            int var266 = class424.field6231.method1396(-110);
            if (var266 == 65535) {
                var266 = -1;
            }
            int var267 = class424.field6231.method1337((byte) -119);
            int var268 = class424.field6231.method1396(4);
            int var269 = class424.field6231.method1337((byte) -118);
            class361.method2292(var267, var268, var266, (byte) 109, var269);
            class136.field2073 = null;
            return true;
        } else if (class98.field1527 == class136.field2073) {
            class505.field7332 = class424.field6231.method1383(12504);
            class222.field3398 = class424.field6231.method1346((byte) -119) << 3;
            class351.field5228 = class424.field6231.method1368((byte) -68) << 3;
            while (class424.field6231.field2982 < class429.field6369) {
                class271 var270 = class445.method2747(-11242)[class424.field6231.method1337((byte) 88)];
                class505.method3013(true, var270);
            }
            class136.field2073 = null;
            return true;
        } else if (class367.field5406 == class136.field2073) {
            class405.method2550(class215.field3256, 71);
            class136.field2073 = null;
            return false;
        } else if (class243.field3676 == class136.field2073) {
            String var271 = class424.field6231.method1347(-96);
            int var272 = class424.field6231.method1389(255);
            int var273 = class424.field6231.method1361(3);
            if (class186.method1296(0, var272)) {
                class422.method2632(var273, (byte) -50, var271);
            }
            class136.field2073 = null;
            return true;
        } else if (class167.field2530 == class136.field2073) {
            int var274 = class424.field6231.method1401(126);
            class398.field5888 = class122.field1844.method444(var274, (byte) -128);
            class136.field2073 = null;
            return true;
        } else if (class438.field6540 == class136.field2073) {
            int var275 = class424.field6231.method1357(false);
            int var276 = class424.field6231.method1389(255);
            if (var276 == 65535) {
                var276 = -1;
            }
            int var277 = class424.field6231.method1396(-114);
            if (class186.method1296(0, var277)) {
                class167.method1190(var276, var275, true, -1, 1);
            }
            class136.field2073 = null;
            return true;
        } else if (class234.field3510 == class136.field2073) {
            class63.method424(-1116334386);
            class136.field2073 = null;
            return false;
        } else if (class277.field4343 == class136.field2073) {
            boolean var278 = class424.field6231.method1337((byte) -119) == 1;
            String var279 = class424.field6231.method1347(-110);
            String var280 = var279;
            if (var278) {
                var280 = class424.field6231.method1347(-81);
            }
            int var281 = class424.field6231.method1337((byte) -128);
            boolean var282 = false;
            if (var281 <= 1) {
                if (!(!class288.field4478 || class421.field6182) || class108.field1638) {
                    var282 = true;
                } else if (var281 <= 1 && class282.method1900(var280, false)) {
                    var282 = true;
                }
            }
            if (!var282 && class203.field3136 == 0) {
                String var283 = class12.method70(60, class393.method2472(class424.field6231, false));
                if (var281 == 2) {
                    class167.method1191(71, "<img=1>" + var279, 0, null, var283, "<img=1>" + var280, -1, 24);
                } else if (var281 == 1) {
                    class167.method1191(109, "<img=0>" + var279, 0, null, var283, "<img=0>" + var280, -1, 24);
                } else {
                    class167.method1191(106, var279, 0, null, var283, var280, -1, 24);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class490.field7156 == class136.field2073) {
            class324.field4920 = class424.field6231.method1337((byte) 26);
            for (int var284 = 0; var284 < class324.field4920; var284++) {
                class8.field95[var284] = class424.field6231.method1347(-120);
                class271.field4283[var284] = class424.field6231.method1347(-84);
                if (class271.field4283[var284].equals("")) {
                    class271.field4283[var284] = class8.field95[var284];
                }
                class484.field7094[var284] = class424.field6231.method1347(-87);
                class280.field4362[var284] = class424.field6231.method1347(-101);
                if (class280.field4362[var284].equals("")) {
                    class280.field4362[var284] = class484.field7094[var284];
                }
                class5.field68[var284] = false;
            }
            class136.field2073 = null;
            class221.field3314 = class348.field5194;
            return true;
        } else if (class9.field102 == class136.field2073) {
            class505.method3013(true, class267.field4256);
            class136.field2073 = null;
            return true;
        } else if (class456.field6784 == class136.field2073) {
            int var285 = class424.field6231.method1376(255);
            int var286 = class424.field6231.method1396(-92);
            boolean var287 = (var285 & 0x1) == 1;
            class377.method2401(var287, -125, var286);
            class268.field4264[class307.method2028(31, class243.field3677++)] = var286;
            class136.field2073 = null;
            return true;
        } else if (class324.field4910 == class136.field2073) {
            int var288 = class424.field6231.method1392(0);
            int var289 = class424.field6231.method1391(-49);
            class288.field4476.method2346(var289, false, var288);
            class136.field2073 = null;
            return true;
        } else if (class44.field689 == class136.field2073) {
            int var290 = class424.field6231.method1361(3);
            int var291 = class424.field6231.method1389(255);
            if (class186.method1296(0, var291)) {
                class167.method1190(class517.field7513, var290, true, 0, 5);
            }
            class136.field2073 = null;
            return true;
        } else if (class168.field2549 == class136.field2073) {
            int var292 = class424.field6231.method1383(12504);
            int var293 = class424.field6231.method1392(0);
            if (var293 == 255) {
                var292 = -1;
                var293 = -1;
            }
            class3.method16(-101, var293, var292);
            class136.field2073 = null;
            return true;
        } else if (class229.field3458 == class136.field2073) {
            while (class429.field6369 > class424.field6231.field2982) {
                boolean var304 = class424.field6231.method1337((byte) 64) == 1;
                String var305 = class424.field6231.method1347(-128);
                String var306 = class424.field6231.method1347(-104);
                int var307 = class424.field6231.method1396(-95);
                int var308 = class424.field6231.method1337((byte) 49);
                String var309 = "";
                boolean var310 = false;
                if (var307 > 0) {
                    var309 = class424.field6231.method1347(-79);
                    var310 = class424.field6231.method1337((byte) 59) == 1;
                }
                for (int var311 = 0; var311 < class6.field80; var311++) {
                    if (var304) {
                        if (var306.equals(class265.field4229[var311])) {
                            class265.field4229[var311] = var305;
                            var305 = null;
                            class289.field4483[var311] = var306;
                            break;
                        }
                    } else if (var305.equals(class265.field4229[var311])) {
                        if (class23.field269[var311] != var307) {
                            boolean var312 = true;
                            for (class42 var313 = (class42) class315.field4810.method1076((byte) 48); var313 != null; var313 = (class42) class315.field4810.method1077(-1)) {
                                if (var313.field674.equals(var305)) {
                                    if (var307 != 0 && var313.field678 == 0) {
                                        var313.method2069(-11);
                                        var312 = false;
                                    } else if (var307 == 0 && var313.field678 != 0) {
                                        var313.method2069(-11);
                                        var312 = false;
                                    }
                                }
                            }
                            if (var312) {
                                class315.field4810.method1082(new class42(var305, var307), 8);
                            }
                            class23.field269[var311] = var307;
                        }
                        class289.field4483[var311] = var306;
                        class353.field5237[var311] = var309;
                        class477.field7014[var311] = var308;
                        var305 = null;
                        class405.field5988[var311] = var310;
                        break;
                    }
                }
                if (var305 != null && class6.field80 < 200) {
                    class265.field4229[class6.field80] = var305;
                    class289.field4483[class6.field80] = var306;
                    class23.field269[class6.field80] = var307;
                    class353.field5237[class6.field80] = var309;
                    class477.field7014[class6.field80] = var308;
                    class405.field5988[class6.field80] = var310;
                    class6.field80++;
                }
            }
            class6.field76 = 2;
            class221.field3314 = class348.field5194;
            boolean var294 = false;
            int var295 = class6.field80;
            while (var295 > 0) {
                var295--;
                boolean var296 = true;
                for (int var297 = 0; var297 < var295; var297++) {
                    if (class23.field269[var297] != class317.field4836.field5143 && class23.field269[var297 + 1] == class317.field4836.field5143 || class23.field269[var297] == 0 && class23.field269[var297 + 1] != 0) {
                        int var298 = class23.field269[var297];
                        class23.field269[var297] = class23.field269[var297 + 1];
                        class23.field269[var297 + 1] = var298;
                        String var299 = class353.field5237[var297];
                        class353.field5237[var297] = class353.field5237[var297 + 1];
                        class353.field5237[var297 + 1] = var299;
                        String var300 = class265.field4229[var297];
                        class265.field4229[var297] = class265.field4229[var297 + 1];
                        class265.field4229[var297 + 1] = var300;
                        String var301 = class289.field4483[var297];
                        class289.field4483[var297] = class289.field4483[var297 + 1];
                        class289.field4483[var297 + 1] = var301;
                        int var302 = class477.field7014[var297];
                        class477.field7014[var297] = class477.field7014[var297 + 1];
                        class477.field7014[var297 + 1] = var302;
                        boolean var303 = class405.field5988[var297];
                        class405.field5988[var297] = class405.field5988[var297 + 1];
                        class405.field5988[var297 + 1] = var303;
                        var296 = false;
                    }
                }
                if (var296) {
                    break;
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class169.field2553 == class136.field2073) {
            int var314 = class424.field6231.method1389(255);
            int var315 = class424.field6231.method1396(33);
            int var316 = class424.field6231.method1337((byte) -116);
            int var317 = class424.field6231.method1357(false);
            if (class186.method1296(0, var315)) {
                class295 var318 = (class295) class215.field3248.method358((byte) -120, (long) var317);
                if (var318 != null) {
                    class336.method2188(var318.field4546 != var314, 1, false, var318);
                }
                class71.method617(false, var314, var316, var317, false);
            }
            class136.field2073 = null;
            return true;
        } else if (class25.field291 == class136.field2073) {
            if (class242.method1638(class460.field6813, 1)) {
                class61.field978 = (int) ((float) class424.field6231.method1396(62) * 2.5F);
            } else {
                class61.field978 = class424.field6231.method1396(-97) * 30;
            }
            class17.field191 = class348.field5194;
            class136.field2073 = null;
            return true;
        } else if (class524.field7687 == class136.field2073) {
            int var319 = class424.field6231.method1396(-118);
            if (class186.method1296(0, var319)) {
                class432.method2686(2);
            }
            class136.field2073 = null;
            return true;
        } else if (class38.field574 == class136.field2073) {
            class522.method3115(class424.field6231.method1347(-101), false);
            class136.field2073 = null;
            return true;
        } else if (class409.field6041 == class136.field2073) {
            String var320 = class424.field6231.method1347(-95);
            String var321 = class12.method70(60, class393.method2472(class424.field6231, false));
            class58.method380(var320, var321, 6, 0, var320, 88);
            class136.field2073 = null;
            return true;
        } else if (class477.field7024 == class136.field2073) {
            class505.method3013(true, class326.field4925);
            class136.field2073 = null;
            return true;
        } else if (class57.field876 == class136.field2073) {
            int var322 = class424.field6231.method1401(-19);
            int var323 = class424.field6231.method1344(false);
            int var324 = class424.field6231.method1389(255);
            if (var324 == 65535) {
                var324 = -1;
            }
            if (class186.method1296(0, var323)) {
                class510.method3035(var322, var324, (byte) -12);
            }
            class136.field2073 = null;
            return true;
        } else if (class222.field3392 == class136.field2073) {
            class505.method3013(true, class12.field131);
            class136.field2073 = null;
            return true;
        } else if (class138.field2089 == class136.field2073) {
            class327.field4952 = class424.field6231.method1384(true);
            class17.field191 = class348.field5194;
            class136.field2073 = null;
            return true;
        } else if (class501.field7280 == class136.field2073) {
            int var325 = class424.field6231.method1344(false);
            int var326 = class424.field6231.method1345((byte) -108);
            class288.field4476.method2345(var326, var325, false);
            class136.field2073 = null;
            return true;
        } else if (class470.field6905 == class136.field2073) {
            int var327 = class424.field6231.method1371(255);
            int var328 = class424.field6231.method1361(3);
            int var329 = class424.field6231.method1396(-115);
            if (class186.method1296(0, var329)) {
                class522.method3111(5, var328, var327);
            }
            class136.field2073 = null;
            return true;
        } else if (class527.field7718 == class136.field2073) {
            int var330 = class424.field6231.method1396(-95);
            int var331 = class424.field6231.method1401(123);
            if (class186.method1296(0, var330)) {
                class295 var332 = (class295) class215.field3248.method358((byte) 30, (long) var331);
                if (var332 != null) {
                    class336.method2188(true, 1, false, var332);
                }
                if (class416.field6108 != null) {
                    class5.method27(class416.field6108, -208246073);
                    class416.field6108 = null;
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class190.field2896 == class136.field2073) {
            int var333 = class424.field6231.method1389(255);
            int var334 = class424.field6231.method1396(-102);
            byte var335 = class424.field6231.method1380(-116);
            if (class186.method1296(0, var334)) {
                class183.method1276(var333, var335, (byte) -35);
            }
            class136.field2073 = null;
            return true;
        } else if (class249.field3894 == class136.field2073) {
            int var336 = class424.field6231.method1383(12504);
            int var337 = class424.field6231.method1357(false);
            int var338 = class424.field6231.method1396(-120);
            int var339 = class424.field6231.method1344(false);
            int var340 = class424.field6231.method1389(255);
            boolean var341 = (var336 & 0x80) != 0;
            if ((var337 >> 30) != 0) {
                int var342 = var337 >> 28 & 0x3;
                int var343 = ((var337 & 0xFFFC6EF) >> 14) - class422.field6201;
                int var344 = (var337 & 0x3FFF) - class23.field273;
                if (var343 >= 0 && var344 >= 0 && class338.field5076 > var343 && var344 < class250.field4077) {
                    int var345 = var343 * 128 + 64;
                    int var346 = var344 * 128 + 64;
                    int var347 = var342;
                    if (var342 < 3 && class38.method251(1, var344, var343)) {
                        var347 = var342 + 1;
                    }
                    class190 var348 = new class190(var340, 0, class446.field6625, var342, var347, var345, class416.method2605(var346, var345, (byte) 118, var342) - var338, var346, var343, var343, var344, var344, var336);
                    class453.field6742.method292((byte) 121, new class426(var348));
                }
            } else if ((var337 >> 29) != 0) {
                int var349 = var337 & 0xFFFF;
                class5 var350 = (class5) class366.field5398.method358((byte) 80, (long) var349);
                if (var350 != null) {
                    if (var340 == 65535) {
                        var340 = -1;
                    }
                    class46 var351 = var350.field65;
                    boolean var352 = true;
                    int var353 = var341 ? var351.field7621 : var351.field7561;
                    if (var340 != -1 && var353 != -1) {
                        if (var340 == var353) {
                            class434 var354 = class232.field3490.method2625((byte) 116, var340);
                            if (var354.field6446 && var354.field6450 != -1) {
                                class61 var355 = class393.field5735.method1538(-4031, var354.field6450);
                                int var356 = var355.field954;
                                if (var356 == 0 || var356 == 2) {
                                    var352 = false;
                                } else if (var356 == 1) {
                                    var352 = true;
                                }
                            }
                        } else {
                            class434 var357 = class232.field3490.method2625((byte) 116, var340);
                            class434 var358 = class232.field3490.method2625((byte) 116, var353);
                            if (var357.field6450 != -1 && var358.field6450 != -1) {
                                class61 var359 = class393.field5735.method1538(-4031, var357.field6450);
                                class61 var360 = class393.field5735.method1538(-4031, var358.field6450);
                                if (var359.field971 < var360.field971) {
                                    var352 = false;
                                }
                            }
                        }
                    }
                    if (var352) {
                        if (var341) {
                            var351.field7559 = 0;
                            var351.field7553 = var336 & 0x7;
                            var351.field7633 = 1;
                            var351.field7558 = class446.field6625 + var339;
                            var351.field7621 = var340;
                            var351.field7645 = 0;
                            var351.field7641 = var338;
                            if (var351.field7558 > class446.field6625) {
                                var351.field7559 = -1;
                            }
                            if (var351.field7621 != -1 && class446.field6625 == var351.field7558) {
                                int var361 = class232.field3490.method2625((byte) 116, var351.field7621).field6450;
                                if (var361 != -1) {
                                    class61 var362 = class393.field5735.method1538(-4031, var361);
                                    if (var362 != null && var362.field976 != null) {
                                        class439.method2721(false, var362, var351.field1275, 0, (byte) 116, var351.field1279, var351.field1274);
                                    }
                                }
                            }
                        } else {
                            var351.field7617 = var336 & 0x7;
                            var351.field7595 = class446.field6625 + var339;
                            var351.field7561 = var340;
                            var351.field7594 = 0;
                            var351.field7635 = 1;
                            var351.field7599 = var338;
                            var351.field7591 = 0;
                            if (var351.field7595 > class446.field6625) {
                                var351.field7591 = -1;
                            }
                            if (var351.field7561 != -1 && class446.field6625 == var351.field7595) {
                                int var363 = class232.field3490.method2625((byte) 116, var351.field7561).field6450;
                                if (var363 != -1) {
                                    class61 var364 = class393.field5735.method1538(-4031, var363);
                                    if (var364 != null && var364.field976 != null) {
                                        class439.method2721(false, var364, var351.field1275, 0, (byte) 116, var351.field1279, var351.field1274);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var337 >> 28) != 0) {
                int var365 = var337 & 0xFFFF;
                class511 var366;
                if (class517.field7513 == var365) {
                    var366 = class116.field1781;
                } else {
                    var366 = class530.field7747[var365];
                }
                if (var366 != null) {
                    if (var340 == 65535) {
                        var340 = -1;
                    }
                    boolean var367 = true;
                    int var368 = var341 ? var366.field7621 : var366.field7561;
                    if (var340 != -1 && var368 != -1) {
                        if (var340 == var368) {
                            class434 var369 = class232.field3490.method2625((byte) 116, var340);
                            if (var369.field6446 && var369.field6450 != -1) {
                                class61 var370 = class393.field5735.method1538(-4031, var369.field6450);
                                int var371 = var370.field954;
                                if (var371 == 0 || var371 == 2) {
                                    var367 = false;
                                } else if (var371 == 1) {
                                    var367 = true;
                                }
                            }
                        } else {
                            class434 var372 = class232.field3490.method2625((byte) 116, var340);
                            class434 var373 = class232.field3490.method2625((byte) 116, var368);
                            if (var372.field6450 != -1 && var373.field6450 != -1) {
                                class61 var374 = class393.field5735.method1538(-4031, var372.field6450);
                                class61 var375 = class393.field5735.method1538(-4031, var373.field6450);
                                if (var374.field971 < var375.field971) {
                                    var367 = false;
                                }
                            }
                        }
                    }
                    if (var367) {
                        if (var341) {
                            var366.field7558 = class446.field6625 + var339;
                            var366.field7641 = var338;
                            var366.field7645 = 0;
                            var366.field7553 = var336 & 0x7;
                            var366.field7633 = 1;
                            var366.field7621 = var340;
                            var366.field7559 = 0;
                            if (var366.field7621 == 65535) {
                                var366.field7621 = -1;
                            }
                            if (class446.field6625 < var366.field7558) {
                                var366.field7559 = -1;
                            }
                            if (var366.field7621 != -1 && class446.field6625 == var366.field7558) {
                                int var378 = class232.field3490.method2625((byte) 116, var366.field7621).field6450;
                                if (var378 != -1) {
                                    class61 var379 = class393.field5735.method1538(-4031, var378);
                                    if (var379 != null && var379.field976 != null) {
                                        class439.method2721(class116.field1781 == var366, var379, var366.field1275, 0, (byte) 116, var366.field1279, var366.field1274);
                                    }
                                }
                            }
                        } else {
                            var366.field7594 = 0;
                            var366.field7617 = var336 & 0x7;
                            var366.field7591 = 0;
                            var366.field7635 = 1;
                            var366.field7561 = var340;
                            var366.field7599 = var338;
                            var366.field7595 = class446.field6625 + var339;
                            if (class446.field6625 < var366.field7595) {
                                var366.field7591 = -1;
                            }
                            if (var366.field7561 == 65535) {
                                var366.field7561 = -1;
                            }
                            if (var366.field7561 != -1 && class446.field6625 == var366.field7595) {
                                int var376 = class232.field3490.method2625((byte) 116, var366.field7561).field6450;
                                if (var376 != -1) {
                                    class61 var377 = class393.field5735.method1538(-4031, var376);
                                    if (var377 != null && var377.field976 != null) {
                                        class439.method2721(class116.field1781 == var366, var377, var366.field1275, 0, (byte) 116, var366.field1279, var366.field1274);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class22.field245 == class136.field2073) {
            class321.method2119(false, 113);
            class136.field2073 = null;
            return true;
        } else if (class234.field3514 == class136.field2073) {
            int var380 = class424.field6231.method1396(-121);
            int var381 = class424.field6231.method1337((byte) -108);
            int var382 = class424.field6231.method1337((byte) 34);
            int var383 = class424.field6231.method1337((byte) -120);
            int var384 = class424.field6231.method1337((byte) 31);
            int var385 = class424.field6231.method1396(10);
            if (class186.method1296(0, var380)) {
                class190.field2911[var381] = true;
                class209.field3203[var381] = var382;
                class193.field2967[var381] = var383;
                class316.field4824[var381] = var384;
                class331.field5004[var381] = var385;
            }
            class136.field2073 = null;
            return true;
        } else if (class472.field6935 == class136.field2073) {
            class505.method3013(true, class386.field5682);
            class136.field2073 = null;
            return true;
        } else if (class322.field4885 == class136.field2073) {
            boolean var386 = class424.field6231.method1337((byte) 1) == 1;
            String var387 = class424.field6231.method1347(-86);
            String var388 = var387;
            if (var386) {
                var388 = class424.field6231.method1347(-76);
            }
            long var389 = (long) class424.field6231.method1396(-101);
            long var391 = (long) class424.field6231.method1339(-32768);
            int var393 = class424.field6231.method1337((byte) 96);
            long var394 = (var389 << 32) + var391;
            boolean var396 = false;
            int var397 = 0;
            while (true) {
                if (var397 >= 100) {
                    if (var393 <= 1) {
                        if (!(!class288.field4478 || class421.field6182) || class108.field1638) {
                            var396 = true;
                        } else if (class282.method1900(var388, false)) {
                            var396 = true;
                        }
                    }
                    break;
                }
                if (class512.field7485[var397] == var394) {
                    var396 = true;
                    break;
                }
                var397++;
            }
            if (!var396 && class203.field3136 == 0) {
                class512.field7485[class3.field41] = var394;
                class3.field41 = (class3.field41 + 1) % 100;
                String var398 = class12.method70(60, class393.method2472(class424.field6231, false));
                if (var393 == 2) {
                    class167.method1191(61, "<img=1>" + var387, 0, null, var398, "<img=1>" + var388, -1, 7);
                } else if (var393 == 1) {
                    class167.method1191(69, "<img=0>" + var387, 0, null, var398, "<img=0>" + var388, -1, 7);
                } else {
                    class167.method1191(71, var387, 0, null, var398, var388, -1, 3);
                }
            }
            class136.field2073 = null;
            return true;
        } else if (class284.field4430 == class136.field2073) {
            int var399 = class424.field6231.method1337((byte) 116);
            boolean var400 = (var399 & 0x1) == 1;
            String var401 = class424.field6231.method1347(-82);
            String var402 = class424.field6231.method1347(-101);
            if (var402.equals("")) {
                var402 = var401;
            }
            String var403 = class424.field6231.method1347(-91);
            String var404 = class424.field6231.method1347(-109);
            if (var404.equals("")) {
                var404 = var403;
            }
            if (var400) {
                for (int var405 = 0; var405 < class324.field4920; var405++) {
                    if (class271.field4283[var405].equals(var404)) {
                        class8.field95[var405] = var401;
                        class271.field4283[var405] = var402;
                        class484.field7094[var405] = var403;
                        class280.field4362[var405] = var404;
                        break;
                    }
                }
            } else {
                class8.field95[class324.field4920] = var401;
                class271.field4283[class324.field4920] = var402;
                class484.field7094[class324.field4920] = var403;
                class280.field4362[class324.field4920] = var404;
                class5.field68[class324.field4920] = class307.method2028(2, var399) == 2;
                class324.field4920++;
            }
            class221.field3314 = class348.field5194;
            class136.field2073 = null;
            return true;
        } else if (class52.field800 == class136.field2073) {
            int var406 = class424.field6231.method1396(6);
            String var407 = class424.field6231.method1347(-105);
            Object[] var408 = new Object[var407.length() + 1];
            for (int var409 = var407.length() - 1; var409 >= 0; var409--) {
                if (var407.charAt(var409) == 's') {
                    var408[var409 + 1] = class424.field6231.method1347(-110);
                } else {
                    var408[var409 + 1] = Integer.valueOf(class424.field6231.method1401(-28));
                }
            }
            var408[0] = Integer.valueOf(class424.field6231.method1401(122));
            if (class186.method1296(0, var406)) {
                class510 var410 = new class510();
                var410.field7413 = var408;
                class152.method1090(var410);
            }
            class136.field2073 = null;
            return true;
        } else {
            class197.method1407(true, "T1 - " + (class136.field2073 == null ? -1 : class136.field2073.method355(-99)) + "," + (class498.field7255 == null ? -1 : class498.field7255.method355(-121)) + "," + (class404.field5966 == null ? -1 : class404.field5966.method355(-109)) + " - " + class429.field6369, null);
            class405.method2550(false, -112);
            return true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lko;)V")
    public class426(class190 arg0) {
        this.field6345 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
    public static final boolean method2660(int arg0, int arg1, int arg2) {
        field6347++;
        if (arg2 > -37) {
            method2658((byte) 49);
        }
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    public static final void method2661(int arg0, int arg1) {
        field6344++;
        for (class130 var2 = class392.field5721.method359(true); var2 != null; var2 = class392.field5721.method365(arg0 - 133)) {
            if ((var2.field1932 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method947((byte) 114);
            }
        }
        if (arg0 != 25) {
            field6346 = null;
        }
    }
}
