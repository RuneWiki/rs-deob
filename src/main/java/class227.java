import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class227 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field3913 = 0;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lsb;")
    public static class98 field3914 = class47.method368("compass", 0);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Ldf;")
    public static class137 field3917;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BII)Z")
    public static final boolean method1566(byte arg0, int arg1, int arg2) {
        int var3 = -93 / ((arg0 + 70) / 35);
        field3909++;
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Llj;I)Lb;")
    public static final class113 method1567(class216 arg0, int arg1) {
        field3911++;
        if (arg1 != 11777) {
            method1571(-63, -44, 124, (class98) null, 2);
        }
        return new class113(arg0.method1483(-83), arg0.method1483(-91), arg0.method1483(-124), arg0.method1483(-124), arg0.method1448(26420), arg0.method1448(arg1 + 14643), arg0.method1446(arg1 ^ 0x3AE7));
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)Z")
    public static final boolean method1568(byte arg0) {
        long var1 = class164.method1183((byte) 80);
        int var3 = (int) (var1 - class137.field2421);
        if (var3 > 200) {
            var3 = 200;
        }
        field3912++;
        class68.field1088 += var3;
        class137.field2421 = var1;
        if (class225.field3879 == 0 && class146.field2560 == 0 && class116.field2086 == 0 && class101.field1788 == 0) {
            return true;
        } else if (class75.field1328 == null) {
            return false;
        } else {
            try {
                if (class68.field1088 > 30000) {
                    throw new IOException();
                }
                while (class146.field2560 < 20 && class101.field1788 > 0) {
                    class33 var4 = (class33) class97.field1664.method1514((byte) 80);
                    class216 var5 = new class216(4);
                    var5.method1477(1, -26755);
                    var5.method1462((byte) -74, (int) var4.field4061);
                    class75.field1328.method788(true, 0, 4, var5.field3706);
                    class72.field1179.method1513(var4.field4061, var4, arg0 - 104);
                    class101.field1788--;
                    class146.field2560++;
                }
                if (arg0 != 103) {
                    return true;
                }
                while (class225.field3879 < 20 && class116.field2086 > 0) {
                    class33 var6 = (class33) class117.field2095.method129(0);
                    class216 var7 = new class216(4);
                    var7.method1477(0, -26755);
                    var7.method1462((byte) -74, (int) var6.field4061);
                    class75.field1328.method788(true, 0, 4, var7.field3706);
                    var6.method1368((byte) 3);
                    class28.field529.method1513(var6.field4061, var6, -1);
                    class116.field2086--;
                    class225.field3879++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class75.field1328.method786(4316);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class68.field1088 = 0;
                    byte var10 = 0;
                    if (class78.field1397 == null) {
                        var10 = 8;
                    } else if (class87.field1534 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class26.field511.field3706.length - class78.field1397.field581;
                        int var12 = 512 - class87.field1534;
                        if ((var11 - class26.field511.field3728) < var12) {
                            var12 = var11 - class26.field511.field3728;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class75.field1328.method787(class26.field511.field3706, class26.field511.field3728, 0, var12);
                        if (class53.field858 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class26.field511.field3706[class26.field511.field3728 + var13] = (byte) class184.method1267(class26.field511.field3706[class26.field511.field3728 + var13], class53.field858);
                            }
                        }
                        class87.field1534 += var12;
                        class26.field511.field3728 += var12;
                        if (class26.field511.field3728 == var11) {
                            if (class78.field1397.field4061 == 16711935L) {
                                class112.field1991 = class26.field511;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class188 var16 = class183.field3149[var15];
                                    if (var16 != null) {
                                        class112.field1991.field3728 = var15 * 8 + 5;
                                        int var17 = class112.field1991.method1442(-1330139880);
                                        int var18 = class112.field1991.method1442(-1330139880);
                                        var16.method1298((byte) 20, var17, var18);
                                    }
                                }
                            } else {
                                class96.field1654.reset();
                                class96.field1654.update(class26.field511.field3706, 0, var11);
                                int var14 = (int) class96.field1654.getValue();
                                if (class78.field1397.field574 != var14) {
                                    try {
                                        class75.field1328.method790(false);
                                    } catch (Exception var30) {
                                    }
                                    class169.field2991++;
                                    class75.field1328 = null;
                                    class53.field858 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                class169.field2991 = 0;
                                class112.field1995 = 0;
                                class78.field1397.field580.method1295(class26.field511.field3706, (class78.field1397.field4061 & 0xFF0000L) == 16711680L, class224.field3872, (int) (class78.field1397.field4061 & 0xFFFFL), (byte) -125);
                            }
                            class78.field1397.method1611((byte) 124);
                            class87.field1534 = 0;
                            if (class224.field3872) {
                                class146.field2560--;
                            } else {
                                class225.field3879--;
                            }
                            class78.field1397 = null;
                            class26.field511 = null;
                        } else {
                            if (class87.field1534 != 512) {
                                break;
                            }
                            class87.field1534 = 0;
                        }
                    } else {
                        int var19 = var10 - class242.field4192.field3728;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class75.field1328.method787(class242.field4192.field3706, class242.field4192.field3728, 0, var19);
                        if (class53.field858 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class242.field4192.field3706[class242.field4192.field3728 + var20] = (byte) class184.method1267(class242.field4192.field3706[class242.field4192.field3728 + var20], class53.field858);
                            }
                        }
                        class242.field4192.field3728 += var19;
                        if (var10 > class242.field4192.field3728) {
                            break;
                        }
                        if (class78.field1397 == null) {
                            class242.field4192.field3728 = 0;
                            int var21 = class242.field4192.method1446(5350);
                            int var22 = class242.field4192.method1487(arg0 ^ 0x48);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class242.field4192.method1446(5350);
                            int var26 = class242.field4192.method1442(arg0 - 1330139983);
                            class33 var27 = (class33) class72.field1179.method1511((byte) -127, var23);
                            class224.field3872 = true;
                            if (var27 == null) {
                                var27 = (class33) class28.field529.method1511((byte) -125, var23);
                                class224.field3872 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            int var28 = var25 == 0 ? 5 : 9;
                            class78.field1397 = var27;
                            class26.field511 = new class216(var28 + class78.field1397.field581 + var26);
                            class26.field511.method1477(var25, arg0 - 26858);
                            class26.field511.method1456(var26, -23438);
                            class87.field1534 = 8;
                            class242.field4192.field3728 = 0;
                        } else if (class87.field1534 == 0) {
                            if (class242.field4192.field3706[0] == -1) {
                                class87.field1534 = 1;
                                class242.field4192.field3728 = 0;
                            } else {
                                class78.field1397 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class75.field1328.method790(false);
                } catch (Exception var29) {
                }
                class75.field1328 = null;
                class112.field1995++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    public static final void method1569(int arg0, int arg1) {
        field3910++;
        if (arg0 < 0) {
            return;
        }
        long var2 = class88.field1569[arg0];
        int var4 = class129.field2309[arg0];
        int var5 = class182.field3138[arg0];
        int var6 = (int) class88.field1569[arg0];
        int var7 = class212.field3630[arg0];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 41) {
            class192 var8 = class141.field2499[var6];
            if (var8 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var8.field4501[0], var8.field4491[0]);
                class228.field3923 = class139.field2471;
                class108.field1932 = 2;
                class31.field555++;
                class82.field1449 = class250.field4384;
                class51.field836 = 0;
                class237.field4084.method490(126, -72);
                class237.field4084.method1460(var6, 16851);
            }
        }
        if (var7 == 38) {
            class192 var9 = class141.field2499[var6];
            if (var9 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, arg1 ^ 0x829C7550, 1, 2, 0, class163.field2943.field4501[0], false, 0, var9.field4501[0], var9.field4491[0]);
                class228.field3923 = class139.field2471;
                class8.field160++;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class51.field836 = 0;
                class237.field4084.method490(185, arg1 - 69);
                class237.field4084.method1464(var6, -128);
                class237.field4084.method1464(class53.field847, -128);
                class237.field4084.method1474(class198.field3411, 255);
                class237.field4084.method1464(class212.field3621, arg1 - 128);
            }
        }
        if (var7 == 1006) {
            class51.field836 = 0;
            class93.field1630++;
            class108.field1932 = 2;
            class228.field3923 = class139.field2471;
            class82.field1449 = class250.field4384;
            class237.field4084.method490(156, -79);
            class237.field4084.method1493(var6, false);
        }
        if (var7 == 1002) {
            class256.field4535++;
            class97.method694(var2, var4, arg1 ^ 0xFFFFD383, var5);
            class237.field4084.method490(3, arg1 - 80);
            class237.field4084.method1470((byte) -122, class182.field3143 + var4);
            class237.field4084.method1470((byte) -122, class189.field3277 + var5);
            class237.field4084.method1464((int) (var2 >>> 32) & Integer.MAX_VALUE, -128);
        }
        if (var7 == 1) {
            class108 var10 = class180.field3109[var6];
            if (var10 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var10.field4501[0], var10.field4491[0]);
                class51.field836 = 0;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class191.field3305++;
                class228.field3923 = class139.field2471;
                class237.field4084.method490(231, -115);
                class237.field4084.method1464(var6, -128);
            }
        }
        if (var7 == 6) {
            class237.field4084.method490(155, -58);
            class237.field4084.method1470((byte) -122, var5);
            class93.field1635++;
            class237.field4084.method1460(var6, arg1 + 16851);
            class237.field4084.method1453(var4, -29263);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(arg1 ^ 0xCD17E090, var4);
            class157.field2857 = var5;
        }
        if (var7 == 43) {
            class108 var11 = class180.field3109[var6];
            if (var11 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, arg1 - 2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var11.field4501[0], var11.field4491[0]);
                class51.field836 = 0;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class256.field4544++;
                class228.field3923 = class139.field2471;
                class237.field4084.method490(177, -52);
                class237.field4084.method1464(var6, -128);
            }
        }
        if (var7 == 1001) {
            class51.field836 = 0;
            class228.field3923 = class139.field2471;
            class82.field1449 = class250.field4384;
            class108.field1932 = 2;
            class108 var12 = class180.field3109[var6];
            if (var12 != null) {
                class120 var13 = var12.field1928;
                if (var13.field2189 != null) {
                    var13 = var13.method895(-1);
                }
                if (var13 != null) {
                    class185.field3173++;
                    class237.field4084.method490(228, arg1 ^ 0xFFFFFFAC);
                    class237.field4084.method1493(var13.field2151, false);
                }
            }
        }
        if (var7 == 12) {
            class97.method694(var2, var4, -11389, var5);
            class237.field4084.method490(206, -66);
            class264.field4626++;
            class237.field4084.method1470((byte) -122, (int) (var2 >>> 32) & Integer.MAX_VALUE);
            class237.field4084.method1470((byte) -122, var4 + class182.field3143);
            class237.field4084.method1493(class189.field3277 + var5, false);
        }
        if (var7 == 8) {
            class84.field1466++;
            boolean var14 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var14) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class228.field3923 = class139.field2471;
            class82.field1449 = class250.field4384;
            class51.field836 = 0;
            class108.field1932 = 2;
            class237.field4084.method490(137, -65);
            class237.field4084.method1464(class189.field3277 + var5, -128);
            class237.field4084.method1464(class182.field3143 + var4, -128);
            class237.field4084.method1460(var6, arg1 ^ 0x41D3);
        }
        if (var7 == 44) {
            class171.field3017++;
            class237.field4084.method490(175, -61);
            class237.field4084.method1493(var6, false);
            class237.field4084.method1456(class105.field1872, arg1 ^ 0xFFFFA472);
            class237.field4084.method1460(var5, 16851);
            class237.field4084.method1493(class202.field3438, false);
            class237.field4084.method1453(var4, -29263);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 7) {
            boolean var16 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var16) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class82.field1449 = class250.field4384;
            class228.field3923 = class139.field2471;
            class51.field836 = 0;
            class108.field1932 = 2;
            class171.field3015++;
            class237.field4084.method490(103, -101);
            class237.field4084.method1493(var6, false);
            class237.field4084.method1460(class189.field3277 + var5, 16851);
            class237.field4084.method1470((byte) -122, class182.field3143 + var4);
        }
        if (var7 == 3) {
            class148 var18 = class157.method1138(var4, (byte) -107, var5);
            if (var18 != null) {
                class2.method9(true);
                class92.method674(var4, class148.method1091((byte) 127, client.method761(var18)), -12659, var5);
                class111.field1975 = 0;
                class67.field1080 = class207.method1397(arg1 ^ 0xFFFFDE03, var18);
                if (class67.field1080 == null) {
                    class67.field1080 = class25.field491;
                }
                if (!var18.field2619) {
                    class91.field1609 = class186.method1288(new class98[] { class98.field1693, var18.field2697, class244.field4247 }, 31618);
                    return;
                }
                class91.field1609 = class186.method1288(new class98[] { var18.field2687, class244.field4247 }, arg1 ^ 0x7B82);
            }
            return;
        }
        if (var7 == 21) {
            class198.method1352(class265.field4640, var5, var4);
        }
        if (var7 == 17) {
            class192 var19 = class141.field2499[var6];
            if (var19 != null) {
                class222.field3845++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var19.field4501[0], var19.field4491[0]);
                class51.field836 = 0;
                class228.field3923 = class139.field2471;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class237.field4084.method490(21, -60);
                class237.field4084.method1464(var6, -128);
            }
        }
        if (var7 == 37) {
            class203.field3471++;
            class237.field4084.method490(62, arg1 ^ 0xFFFFFFA3);
            class237.field4084.method1453(var4, -29263);
            class237.field4084.method1470((byte) -122, var5);
            class237.field4084.method1464(var6, -128);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 40 && class188.field3244 == null) {
            class47.method367(var5, 87, var4);
            class188.field3244 = class157.method1138(var4, (byte) 95, var5);
            class72.method512(class188.field3244, arg1 + 2);
        }
        if (var7 == 57) {
            class23.field479++;
            boolean var20 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var20) {
                class87.method643(0, class163.field2943.field4491[0], 1, arg1 ^ 0x829C7550, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class82.field1449 = class250.field4384;
            class228.field3923 = class139.field2471;
            class51.field836 = 0;
            class108.field1932 = 2;
            class237.field4084.method490(119, -107);
            class237.field4084.method1474(class198.field3411, arg1 + 255);
            class237.field4084.method1464(var6, -128);
            class237.field4084.method1493(var5 + class189.field3277, false);
            class237.field4084.method1470((byte) -122, class53.field847);
            class237.field4084.method1470((byte) -122, class212.field3621);
            class237.field4084.method1493(class182.field3143 + var4, false);
        }
        if (var7 == 30) {
            class2.method9(true);
            class148 var22 = class62.method455(-854073200, var4);
            class111.field1975 = 1;
            class53.field847 = var6;
            class198.field3411 = var4;
            class212.field3621 = var5;
            class72.method512(var22, 2);
            class55.field879 = class186.method1288(new class98[] { class243.field4214, class235.method1605(-93, var6).field4255, class244.field4247 }, 31618);
            if (class55.field879 == null) {
                class55.field879 = class99.field1745;
            }
            return;
        }
        if (var7 == 39) {
            class192 var23 = class141.field2499[var6];
            if (var23 != null) {
                class232.field3988++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var23.field4501[0], var23.field4491[0]);
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class51.field836 = 0;
                class228.field3923 = class139.field2471;
                class237.field4084.method490(40, arg1 ^ 0xFFFFFFA9);
                class237.field4084.method1493(var6, false);
            }
        }
        if (var7 == 9) {
            class237.field4084.method490(6, arg1 ^ 0xFFFFFFAA);
            class237.field4084.method1474(var4, arg1 + 255);
            class161.field2922++;
            class237.field4084.method1460(var5, 16851);
            class237.field4084.method1493(var6, false);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 5) {
            class113.field2012++;
            class237.field4084.method490(194, -111);
            class237.field4084.method1460(var6, 16851);
            class237.field4084.method1456(var4, -23438);
            class237.field4084.method1460(var5, 16851);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 33) {
            class237.field4084.method490(95, -72);
            class221.field3803++;
            class237.field4084.method1470((byte) -122, class202.field3438);
            class237.field4084.method1491(var4, (byte) 19);
            class237.field4084.method1474(class105.field1872, 255);
            class237.field4084.method1460(var5, 16851);
        }
        if (var7 == 26) {
            class192 var24 = class141.field2499[var6];
            if (var24 != null) {
                class32.field570++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var24.field4501[0], var24.field4491[0]);
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class51.field836 = 0;
                class228.field3923 = class139.field2471;
                class237.field4084.method490(46, arg1 ^ 0xFFFFFFBE);
                class237.field4084.method1493(var6, false);
            }
        }
        if (var7 == 10) {
            class9.field200++;
            class237.field4084.method490(120, -126);
            class237.field4084.method1456(class198.field3411, -23438);
            class237.field4084.method1464(var5, -128);
            class237.field4084.method1493(var6, false);
            class237.field4084.method1460(class212.field3621, 16851);
            class237.field4084.method1464(class53.field847, -128);
            class237.field4084.method1456(var4, -23438);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 46) {
            class192 var25 = class141.field2499[var6];
            if (var25 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var25.field4501[0], var25.field4491[0]);
                class82.field1449 = class250.field4384;
                class239.field4111++;
                class228.field3923 = class139.field2471;
                class108.field1932 = 2;
                class51.field836 = 0;
                class237.field4084.method490(140, -124);
                class237.field4084.method1460(var6, 16851);
            }
        }
        if (var7 == 35) {
            class108 var26 = class180.field3109[var6];
            if (var26 != null) {
                class72.field1172++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var26.field4501[0], var26.field4491[0]);
                class51.field836 = 0;
                class228.field3923 = class139.field2471;
                class108.field1932 = 2;
                class82.field1449 = class250.field4384;
                class237.field4084.method490(85, -63);
                class237.field4084.method1460(var6, 16851);
            }
        }
        if (var7 == 14) {
            class181.field3121++;
            boolean var27 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var27) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class82.field1449 = class250.field4384;
            class108.field1932 = 2;
            class51.field836 = 0;
            class228.field3923 = class139.field2471;
            class237.field4084.method490(226, arg1 ^ 0xFFFFFF9F);
            class237.field4084.method1493(var5 + class189.field3277, false);
            class237.field4084.method1460(var6, 16851);
            class237.field4084.method1493(class182.field3143 + var4, false);
        }
        if (var7 == 45) {
            class108 var29 = class180.field3109[var6];
            if (var29 != null) {
                class45.field752++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var29.field4501[0], var29.field4491[0]);
                class228.field3923 = class139.field2471;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class51.field836 = 0;
                class237.field4084.method490(5, arg1 - 96);
                class237.field4084.method1493(var6, false);
            }
        }
        if (var7 == 42) {
            class237.field4084.method490(173, arg1 - 116);
            class218.field3755++;
            class237.field4084.method1456(var4, -23438);
            class148 var30 = class62.method455(arg1 ^ 0xCD17E090, var4);
            if (var30.field2659 != null && var30.field2659[0][0] == 5) {
                int var31 = var30.field2659[0][1];
                class118.field2117[var31] = 1 - class118.field2117[var31];
                class141.method1057(var31, 30);
            }
        }
        if (var7 == 32) {
            class33.field578++;
            class97.method694(var2, var4, arg1 - 11389, var5);
            class237.field4084.method490(248, -66);
            class237.field4084.method1460(var4 + class182.field3143, arg1 + 16851);
            class237.field4084.method1470((byte) -122, Integer.MAX_VALUE & (int) (var2 >>> 32));
            class237.field4084.method1464(class189.field3277 + var5, -128);
        }
        if (var7 == 18) {
            class44.field740++;
            boolean var32 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var32) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class51.field836 = 0;
            class82.field1449 = class250.field4384;
            class228.field3923 = class139.field2471;
            class108.field1932 = 2;
            class237.field4084.method490(227, arg1 - 58);
            class237.field4084.method1493(var6, false);
            class237.field4084.method1456(class105.field1872, -23438);
            class237.field4084.method1464(var5 + class189.field3277, -128);
            class237.field4084.method1493(class182.field3143 + var4, false);
            class237.field4084.method1493(class202.field3438, false);
        }
        if (var7 == 31) {
            class192 var34 = class141.field2499[var6];
            if (var34 != null) {
                class215.field3652++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var34.field4501[0], var34.field4491[0]);
                class51.field836 = 0;
                class228.field3923 = class139.field2471;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class237.field4084.method490(205, -70);
                class237.field4084.method1493(var6, false);
                class237.field4084.method1493(class202.field3438, false);
                class237.field4084.method1453(class105.field1872, -29263);
            }
        }
        if (var7 == 58) {
            class237.field4084.method490(58, -94);
            class237.field4084.method1464(var6, -128);
            class79.field1405++;
            class237.field4084.method1491(var4, (byte) 19);
            class237.field4084.method1493(var5, false);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 1005) {
            class148 var35 = class62.method455(-854073200, var4);
            if (var35 == null || var35.field2612[var5] < 100000) {
                class202.field3447++;
                class237.field4084.method490(9, arg1 - 69);
                class237.field4084.method1460(var6, 16851);
            } else {
                class176.method1228(class233.field4011, class186.method1288(new class98[] { class125.method930(25904, var35.field2612[var5]), class112.field1988, class235.method1605(-103, var6).field4255 }, arg1 ^ 0x7B82), (byte) -49, 0);
            }
            class75.field1321 = 0;
            class85.field1501 = class62.method455(arg1 ^ 0xCD17E090, var4);
            class157.field2857 = var5;
        }
        if (var7 == 22) {
            boolean var36 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var36) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class228.field3923 = class139.field2471;
            class108.field1932 = 2;
            class68.field1089++;
            class82.field1449 = class250.field4384;
            class51.field836 = 0;
            class237.field4084.method490(192, arg1 ^ 0xFFFFFF8C);
            class237.field4084.method1470((byte) -122, class189.field3277 + var5);
            class237.field4084.method1470((byte) -122, var6);
            class237.field4084.method1470((byte) -122, class182.field3143 + var4);
        }
        if (var7 == 49) {
            class192 var38 = class141.field2499[var6];
            if (var38 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var38.field4501[0], var38.field4491[0]);
                class199.field3413++;
                class228.field3923 = class139.field2471;
                class82.field1449 = class250.field4384;
                class108.field1932 = 2;
                class51.field836 = 0;
                class237.field4084.method490(135, -95);
                class237.field4084.method1493(var6, false);
            }
        }
        if (var7 == 24 || var7 == 1004) {
            method1571(-116, var6, var4, class217.field3751[arg0], var5);
        }
        if (var7 == 19 && class97.method694(var2, var4, -11389, var5)) {
            class13.field244++;
            class237.field4084.method490(129, -53);
            class237.field4084.method1460((int) (var2 >>> 32) & Integer.MAX_VALUE, 16851);
            class237.field4084.method1474(class105.field1872, 255);
            class237.field4084.method1460(class202.field3438, 16851);
            class237.field4084.method1493(class182.field3143 + var4, false);
            class237.field4084.method1493(class189.field3277 + var5, false);
        }
        if (var7 == 11) {
            class256.field4542++;
            class97.method694(var2, var4, -11389, var5);
            class237.field4084.method490(251, arg1 ^ 0xFFFFFF9B);
            class237.field4084.method1464(class182.field3143 + var4, -128);
            class237.field4084.method1464(class189.field3277 + var5, -128);
            class237.field4084.method1470((byte) -122, (int) (var2 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 2 && class97.method694(var2, var4, arg1 - 11389, var5)) {
            class237.field4084.method490(164, -101);
            class237.field4084.method1460(class53.field847, 16851);
            class118.field2128++;
            class237.field4084.method1460(var4 + class182.field3143, 16851);
            class237.field4084.method1464(class212.field3621, -128);
            class237.field4084.method1491(class198.field3411, (byte) 19);
            class237.field4084.method1470((byte) -122, class189.field3277 + var5);
            class237.field4084.method1470((byte) -122, Integer.MAX_VALUE & (int) (var2 >>> 32));
        }
        if (var7 == 28) {
            class192 var39 = class141.field2499[var6];
            if (var39 != null) {
                class71.field1148++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var39.field4501[0], var39.field4491[0]);
                class228.field3923 = class139.field2471;
                class108.field1932 = 2;
                class82.field1449 = class250.field4384;
                class51.field836 = 0;
                class237.field4084.method490(78, -119);
                class237.field4084.method1460(var6, 16851);
            }
        }
        if (var7 == 15) {
            class134.field2367++;
            class237.field4084.method490(81, -72);
            class237.field4084.method1493(var6, false);
            class237.field4084.method1493(var5, false);
            class237.field4084.method1491(var4, (byte) 19);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 36) {
            class221.field3809++;
            class237.field4084.method490(104, -107);
            class237.field4084.method1470((byte) -122, var5);
            class237.field4084.method1470((byte) -122, var6);
            class237.field4084.method1456(var4, -23438);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 29) {
            class102.field1811++;
            class237.field4084.method490(51, arg1 - 81);
            class237.field4084.method1456(var4, -23438);
            class237.field4084.method1464(var5, -128);
            class237.field4084.method1464(var6, arg1 ^ 0xFFFFFF80);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 25) {
            class218.field3755++;
            class237.field4084.method490(173, -89);
            class237.field4084.method1456(var4, -23438);
            class148 var40 = class62.method455(-854073200, var4);
            if (var40.field2659 != null && var40.field2659[0][0] == 5) {
                int var41 = var40.field2659[0][1];
                if (class118.field2117[var41] != var40.field2605[0]) {
                    class118.field2117[var41] = var40.field2605[0];
                    class141.method1057(var41, 53);
                }
            }
        }
        if (var7 == 23) {
            class253.field4427++;
            class237.field4084.method490(13, -112);
            class237.field4084.method1460(var6, 16851);
            class237.field4084.method1460(var5, arg1 + 16851);
            class237.field4084.method1453(var4, -29263);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 13) {
            class108 var42 = class180.field3109[var6];
            if (var42 != null) {
                class14.field274++;
                class87.method643(0, class163.field2943.field4491[0], 1, arg1 ^ 0x829C7550, 1, 2, 0, class163.field2943.field4501[0], false, 0, var42.field4501[0], var42.field4491[0]);
                class108.field1932 = 2;
                class228.field3923 = class139.field2471;
                class82.field1449 = class250.field4384;
                class51.field836 = 0;
                class237.field4084.method490(168, -54);
                class237.field4084.method1493(class202.field3438, false);
                class237.field4084.method1470((byte) -122, var6);
                class237.field4084.method1474(class105.field1872, 255);
            }
        }
        if (var7 == 47) {
            class122.field2233++;
            class97.method694(var2, var4, arg1 ^ 0xFFFFD383, var5);
            class237.field4084.method490(180, arg1 ^ 0xFFFFFF85);
            class237.field4084.method1493(class182.field3143 + var4, false);
            class237.field4084.method1460(class189.field3277 + var5, 16851);
            class237.field4084.method1460(Integer.MAX_VALUE & (int) (var2 >>> 32), arg1 ^ 0x41D3);
        }
        if (var7 == 20) {
            class148 var43 = class62.method455(-854073200, var4);
            boolean var44 = true;
            if (var43.field2691 > 0) {
                var44 = class122.method909(0, var43);
            }
            if (var44) {
                class237.field4084.method490(173, -73);
                class237.field4084.method1456(var4, -23438);
                class218.field3755++;
            }
        }
        if (var7 == 50) {
            class250.method1736((byte) 7);
        }
        if (var7 == 48) {
            boolean var45 = class87.method643(0, class163.field2943.field4491[0], 0, arg1 - 2103675568, 0, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            if (!var45) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var5, var4);
            }
            class108.field1932 = 2;
            class51.field836 = 0;
            class228.field3923 = class139.field2471;
            class113.field2000++;
            class82.field1449 = class250.field4384;
            class237.field4084.method490(10, -122);
            class237.field4084.method1464(var6, -128);
            class237.field4084.method1493(class182.field3143 + var4, false);
            class237.field4084.method1470((byte) -122, class189.field3277 + var5);
        }
        if (var7 == 4) {
            class69.field1100++;
            class237.field4084.method490(203, -63);
            class237.field4084.method1453(var4, -29263);
            class237.field4084.method1470((byte) -122, var6);
            class237.field4084.method1460(var5, 16851);
            class75.field1321 = 0;
            class85.field1501 = class62.method455(-854073200, var4);
            class157.field2857 = var5;
        }
        if (var7 == 51) {
            class192 var47 = class141.field2499[var6];
            if (var47 != null) {
                class210.field3596++;
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var47.field4501[0], var47.field4491[0]);
                class51.field836 = 0;
                class82.field1449 = class250.field4384;
                class228.field3923 = class139.field2471;
                class108.field1932 = 2;
                class237.field4084.method490(22, arg1 ^ 0xFFFFFFB1);
                class237.field4084.method1464(var6, -128);
            }
        }
        if (var7 == 34) {
            class108 var48 = class180.field3109[var6];
            if (var48 != null) {
                class87.method643(0, class163.field2943.field4491[0], 1, -2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var48.field4501[0], var48.field4491[0]);
                class82.field1449 = class250.field4384;
                class228.field3923 = class139.field2471;
                class51.field836 = 0;
                client.field1779++;
                class108.field1932 = 2;
                class237.field4084.method490(38, arg1 - 54);
                class237.field4084.method1456(class198.field3411, -23438);
                class237.field4084.method1460(var6, 16851);
                class237.field4084.method1464(class212.field3621, -128);
                class237.field4084.method1460(class53.field847, 16851);
            }
        }
        if (var7 == 1007) {
            class51.field836 = 0;
            class228.field3923 = class139.field2471;
            class202.field3447++;
            class108.field1932 = 2;
            class82.field1449 = class250.field4384;
            class237.field4084.method490(9, -56);
            class237.field4084.method1460(var6, arg1 + 16851);
        }
        if (var7 == 16) {
            class108 var49 = class180.field3109[var6];
            if (var49 != null) {
                class67.field1057++;
                class87.method643(0, class163.field2943.field4491[0], 1, arg1 - 2103675568, 1, 2, 0, class163.field2943.field4501[0], false, 0, var49.field4501[0], var49.field4491[0]);
                class51.field836 = 0;
                class82.field1449 = class250.field4384;
                class228.field3923 = class139.field2471;
                class108.field1932 = 2;
                class237.field4084.method490(250, -116);
                class237.field4084.method1464(var6, -128);
            }
        }
        if (class111.field1975 != arg1) {
            class111.field1975 = 0;
            class72.method512(class62.method455(-854073200, class198.field3411), 2);
        }
        if (class56.field892) {
            class2.method9(true);
        }
        if (class85.field1501 != null && class75.field1321 == 0) {
            class72.method512(class85.field1501, arg1 + 2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method1570(int arg0) {
        field3917 = null;
        field3914 = null;
        if (arg0 >= -119) {
            field3915 = 108;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILsb;I)V")
    public static final void method1571(int arg0, int arg1, int arg2, class98 arg3, int arg4) {
        class148 var5 = class157.method1138(arg2, (byte) 106, arg4);
        field3918++;
        if (var5 == null) {
            return;
        }
        if (var5.field2626 != null) {
            class28 var6 = new class28();
            var6.field522 = arg3;
            var6.field532 = arg1;
            var6.field514 = var5.field2626;
            var6.field517 = var5;
            class192.method1327(var6, 200000);
        }
        if (arg0 >= -47) {
            method1572((class98) null, (byte) -113);
        }
        boolean var7 = true;
        if (var5.field2691 > 0) {
            var7 = class122.method909(0, var5);
        }
        if (!var7 || !method1566((byte) -123, arg1 - 1, client.method761(var5))) {
            return;
        }
        if (arg1 == 1) {
            class237.field4084.method490(24, -60);
            class237.field4084.method1456(arg2, -23438);
            class47.field791++;
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 2) {
            class216.field3713++;
            class237.field4084.method490(240, -67);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 3) {
            class237.field4084.method490(239, -88);
            class79.field1404++;
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 4) {
            class237.field4084.method490(116, -54);
            class114.field2018++;
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 5) {
            class126.field2271++;
            class237.field4084.method490(214, -54);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 6) {
            class45.field764++;
            class237.field4084.method490(35, -125);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 7) {
            class237.field4084.method490(92, -101);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
            client.field1775++;
        }
        if (arg1 == 8) {
            class137.field2431++;
            class237.field4084.method490(181, -65);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 9) {
            class174.field3042++;
            class237.field4084.method490(198, -108);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
        if (arg1 == 10) {
            class243.field4207++;
            class237.field4084.method490(69, -122);
            class237.field4084.method1456(arg2, -23438);
            class237.field4084.method1470((byte) -122, arg4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lsb;B)Z")
    public static final boolean method1572(class98 arg0, byte arg1) {
        field3916++;
        if (arg1 != -64) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class191.field3318; var2++) {
                if (arg0.method731((byte) -57, class181.field3131[var2])) {
                    return true;
                }
            }
            return false;
        }
    }
}
