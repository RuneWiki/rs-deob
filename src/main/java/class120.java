import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class120 extends class408 {

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public int field1633 = -1;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public int field1640 = 0;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public int field1645 = 0;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public int field1649 = 12800;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public int field1644 = 12800;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Z")
    public boolean field1651 = true;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public int field1646 = -1;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "Ljava/lang/String;")
    public String field1654;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Ljava/lang/String;")
    public String field1634;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "Lada;")
    public class164 field1653;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "Lmia;")
    public static class63 field1638 = new class63(51, 3);

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "Z")
    private static boolean field1655 = true;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
    public static final void method867(int arg0, boolean arg1) {
        field1639++;
        int var2 = class340.field4943;
        int var3 = class725.field10118;
        if (arg1 && class418.field6258) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        if (arg0 >= 89) {
            class736.field10316.method528(var3, var2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Z")
    public static final boolean method868(byte arg0) throws IOException {
        field1637++;
        if (class533.field7668 == null) {
            return false;
        }
        if (class542.field7732 == null) {
            if (field1655) {
                if (!class533.field7668.method852(1, false)) {
                    return false;
                }
                class533.field7668.method853(arg0 ^ 0x22, class469.field6851.field9068, 1, 0);
                class523.field7482 = 0;
                class123.field1666++;
                field1655 = false;
            }
            class469.field6851.field9084 = 0;
            if (class469.field6851.method1922(-76)) {
                if (!class533.field7668.method852(1, false)) {
                    return false;
                }
                class533.field7668.method853(4, class469.field6851.field9068, 1, 1);
                class523.field7482 = 0;
                class123.field1666++;
            }
            field1655 = true;
            class469[] var1 = class24.method121(15513);
            int var2 = class469.field6851.method1915((byte) -14);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class469.field6851.field9084);
            }
            class542.field7732 = var1[var2];
            class228.field3361 = class542.field7732.field6849;
        }
        if (class228.field3361 == -1) {
            if (!class533.field7668.method852(1, false)) {
                return false;
            }
            class533.field7668.method853(4, class469.field6851.field9068, 1, 0);
            class123.field1666++;
            class523.field7482 = 0;
            class228.field3361 = class469.field6851.field9068[0] & 0xFF;
        }
        if (class228.field3361 == -2) {
            if (!class533.field7668.method852(2, false)) {
                return false;
            }
            class533.field7668.method853(4, class469.field6851.field9068, 2, 0);
            class469.field6851.field9084 = 0;
            class228.field3361 = class469.field6851.method3712((byte) 97);
            class523.field7482 = 0;
            class123.field1666 += 2;
        }
        if (class228.field3361 > 0) {
            if (!class533.field7668.method852(class228.field3361, false)) {
                return false;
            }
            class469.field6851.field9084 = 0;
            class533.field7668.method853(4, class469.field6851.field9068, class228.field3361, 0);
            class523.field7482 = 0;
            class123.field1666 += class228.field3361;
        }
        class394.field5924 = class242.field3522;
        class242.field3522 = class128.field1730;
        class128.field1730 = class542.field7732;
        if (class689.field9512 == class542.field7732) {
            class66.field941 = class83.method663((byte) -50, class469.field6851.method3745(-6314));
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class44.field479) {
            class109.method812(class523.field7476, (byte) 100);
            class542.field7732 = null;
            return false;
        } else if (class717.field10081 == class542.field7732) {
            String var3 = class469.field6851.method3752(-2);
            String var4 = class452.method2772(class253.method1663(class469.field6851, arg0 ^ 0xFFFF977C), 3);
            class25.method125(0, var3, 0, var4, 6, var3, var3);
            class542.field7732 = null;
            return true;
        } else if (class80.field1131 == class542.field7732) {
            int var5 = class469.field6851.method3701(-110);
            int var6 = class469.field6851.method3701(arg0 - 161);
            int var7 = class469.field6851.method3693(84);
            int var8 = class469.field6851.method3745(-6314);
            int var9 = class469.field6851.method3717(true);
            class633.method3651(0);
            class251.field3626[var9] = true;
            class603.field8530[var9] = var5;
            class357.field5192[var9] = var8;
            class227.field3330[var9] = var6;
            class602.field8518[var9] = var7;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class406.field6143) {
            int var10 = class469.field6851.method3745(-6314);
            int var11 = var10 >> 5;
            int var12 = var10 & 0x1F;
            if (var12 == 0) {
                class554.field7904[var11] = null;
                class542.field7732 = null;
                return true;
            }
            class635 var13 = new class635();
            var13.field8922 = var12;
            var13.field8924 = class469.field6851.method3745(-6314);
            if (var13.field8924 >= 0 && var13.field8924 < class76.field1063.length) {
                if (var13.field8922 == 1 || var13.field8922 == 10) {
                    var13.field8921 = class469.field6851.method3712((byte) -124);
                    class469.field6851.field9084 += 6;
                } else if (var13.field8922 >= 2 && var13.field8922 <= 6) {
                    if (var13.field8922 == 2) {
                        var13.field8923 = 256;
                        var13.field8930 = 256;
                    }
                    if (var13.field8922 == 3) {
                        var13.field8923 = 0;
                        var13.field8930 = 256;
                    }
                    if (var13.field8922 == 4) {
                        var13.field8930 = 256;
                        var13.field8923 = 512;
                    }
                    if (var13.field8922 == 5) {
                        var13.field8923 = 256;
                        var13.field8930 = 0;
                    }
                    if (var13.field8922 == 6) {
                        var13.field8930 = 512;
                        var13.field8923 = 256;
                    }
                    var13.field8922 = 2;
                    var13.field8927 = class469.field6851.method3745(-6314);
                    var13.field8923 += class469.field6851.method3712((byte) -128) - class361.field5224 << 9;
                    var13.field8930 += class469.field6851.method3712((byte) -120) - class582.field8288 << 9;
                    var13.field8925 = class469.field6851.method3745(-6314) << 2;
                    var13.field8932 = class469.field6851.method3712((byte) 55);
                }
                var13.field8928 = class469.field6851.method3712((byte) -108);
                if (var13.field8928 == 65535) {
                    var13.field8928 = -1;
                }
                class554.field7904[var11] = var13;
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class199.field2992) {
            boolean var14 = class469.field6851.method3745(-6314) == 1;
            String var15 = class469.field6851.method3752(-2);
            String var16 = var15;
            if (var14) {
                var16 = class469.field6851.method3752(-2);
            }
            long var17 = (long) class469.field6851.method3712((byte) -15);
            long var19 = (long) class469.field6851.method3747((byte) -74);
            int var21 = class469.field6851.method3745(-6314);
            int var22 = class469.field6851.method3712((byte) -122);
            long var23 = (var17 << 32) + var19;
            boolean var25 = false;
            int var26 = 0;
            while (true) {
                if (var26 >= 100) {
                    if (var21 <= 1 && class89.method720(-27006, var16)) {
                        var25 = true;
                    }
                    break;
                }
                if (class457.field6740[var26] == var23) {
                    var25 = true;
                    break;
                }
                var26++;
            }
            if (!var25 && class724.field10111 == 0) {
                class457.field6740[class157.field2511] = var23;
                class157.field2511 = (class157.field2511 + 1) % 100;
                String var27 = class31.field325.method1720(var22, arg0 - 37).method3230(arg0 - 87, class469.field6851);
                if (var21 == 2) {
                    class707.method4020(null, 18, "<img=1>" + var16, (byte) 74, var15, var22, var27, "<img=1>" + var15, 0);
                } else if (var21 == 1) {
                    class707.method4020(null, 18, "<img=0>" + var16, (byte) 83, var15, var22, var27, "<img=0>" + var15, 0);
                } else {
                    class707.method4020(null, 18, var16, (byte) 28, var15, var22, var27, var15, 0);
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class756.field10577 == class542.field7732) {
            int var28 = class469.field6851.method3720(-19541);
            int var29 = class469.field6851.method3755(128);
            class633.method3651(0);
            class181.method1281(14, var29, var28);
            class542.field7732 = null;
            return true;
        } else if (class64.field926 == class542.field7732) {
            int var30 = class469.field6851.method3755(128);
            int var31 = class469.field6851.method3693(57);
            int var32 = class469.field6851.method3726(false);
            int var33 = class469.field6851.method3709(true);
            int var34 = class469.field6851.method3745(-6314);
            boolean var35 = (var34 & 0x80) != 0;
            int var36 = var34 & 0x7;
            int var37 = (var34 & 0x7B) >> 3;
            if (var37 == 15) {
                var37 = -1;
            }
            if (var33 >> 30 != 0) {
                int var38 = (var33 & 0x37FA8ADB) >> 28;
                int var39 = (var33 >> 14 & 0x3FFF) - class361.field5224;
                int var40 = (var33 & 0x3FFF) - class582.field8288;
                if (var39 >= 0 && var40 >= 0 && var39 < class194.field2946 && var40 < class255.field3656) {
                    int var41 = var39 * 512 + 256;
                    int var42 = var40 * 512 + 256;
                    int var43 = var38;
                    if (var38 < 3 && class286.method1827(var39, var40, (byte) 113)) {
                        var43 = var38 + 1;
                    }
                    class402 var44 = new class402(var30, var31, class357.field5189, var38, var43, var41, class384.method2468(true, var41, var38, var42) - var32, var42, var39, var39, var40, var40, var36);
                    class209.field3054.method1203(new class650(var44), (byte) 93);
                }
            } else if ((var33 >> 29) != 0) {
                int var60 = var33 & 0xFFFF;
                class432 var61 = (class432) class497.field7067.method2287((long) var60, (byte) -117);
                if (var61 != null) {
                    class282 var62 = var61.field6439;
                    if (var30 == 65535) {
                        var30 = -1;
                    }
                    boolean var63 = true;
                    int var64 = var35 ? var62.field6107 : var62.field6061;
                    if (var30 != -1 && var64 != -1) {
                        if (var30 == var64) {
                            class321 var69 = class499.field7100.method172(var30, 3128);
                            if (var69.field4543 && var69.field4528 != -1) {
                                class288 var70 = class742.field10404.method2663(arg0 ^ 0x26, var69.field4528);
                                int var71 = var70.field4094;
                                if (var71 == 0 || var71 == 2) {
                                    var63 = false;
                                } else if (var71 == 1) {
                                    var63 = true;
                                }
                            }
                        } else {
                            class321 var65 = class499.field7100.method172(var30, 3128);
                            class321 var66 = class499.field7100.method172(var64, 3128);
                            if (var65.field4528 != -1 && var66.field4528 != -1) {
                                class288 var67 = class742.field10404.method2663(0, var65.field4528);
                                class288 var68 = class742.field10404.method2663(0, var66.field4528);
                                if (var67.field4098 < var68.field4098) {
                                    var63 = false;
                                }
                            }
                        }
                    }
                    if (var63) {
                        if (var35) {
                            var62.field6122 = var36;
                            var62.field6084 = 1;
                            var62.field6028 = 0;
                            var62.field6107 = var30;
                            var62.field6087 = 0;
                            var62.field6029 = var37;
                            var62.field6119 = var32;
                            var62.field6022 = class357.field5189 + var31;
                            if (class357.field5189 < var62.field6022) {
                                var62.field6087 = -1;
                            }
                            if (var62.field6107 != -1 && class357.field5189 == var62.field6022) {
                                int var74 = class499.field7100.method172(var62.field6107, 3128).field4528;
                                if (var74 != -1) {
                                    class288 var75 = class742.field10404.method2663(arg0 - 38, var74);
                                    if (var75 != null && var75.field4081 != null && !var62.field6095) {
                                        class294.method1865(0, var62, var75, -58);
                                    }
                                }
                            }
                        } else {
                            var62.field6042 = var37;
                            var62.field6070 = var32;
                            var62.field6049 = 1;
                            var62.field6061 = var30;
                            var62.field6046 = 0;
                            var62.field6102 = class357.field5189 + var31;
                            var62.field6025 = var36;
                            var62.field6055 = 0;
                            if (var62.field6102 > class357.field5189) {
                                var62.field6046 = -1;
                            }
                            if (var62.field6061 != -1 && class357.field5189 == var62.field6102) {
                                int var72 = class499.field7100.method172(var62.field6061, arg0 ^ 0xC1E).field4528;
                                if (var72 != -1) {
                                    class288 var73 = class742.field10404.method2663(0, var72);
                                    if (var73 != null && var73.field4081 != null && !var62.field6095) {
                                        class294.method1865(0, var62, var73, -42);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var33 >> 28 != 0) {
                int var45 = var33 & 0xFFFF;
                class689 var46;
                if (class701.field9775 == var45) {
                    var46 = class130.field1749;
                } else {
                    var46 = class314.field4456[var45];
                }
                if (var46 != null) {
                    if (var30 == 65535) {
                        var30 = -1;
                    }
                    boolean var47 = true;
                    int var48 = var35 ? var46.field6107 : var46.field6061;
                    if (var30 != -1 && var48 != -1) {
                        if (var30 == var48) {
                            class321 var53 = class499.field7100.method172(var30, 3128);
                            if (var53.field4543 && var53.field4528 != -1) {
                                class288 var54 = class742.field10404.method2663(0, var53.field4528);
                                int var55 = var54.field4094;
                                if (var55 == 0 || var55 == 2) {
                                    var47 = false;
                                } else if (var55 == 1) {
                                    var47 = true;
                                }
                            }
                        } else {
                            class321 var49 = class499.field7100.method172(var30, 3128);
                            class321 var50 = class499.field7100.method172(var48, 3128);
                            if (var49.field4528 != -1 && var50.field4528 != -1) {
                                class288 var51 = class742.field10404.method2663(0, var49.field4528);
                                class288 var52 = class742.field10404.method2663(0, var50.field4528);
                                if (var51.field4098 < var52.field4098) {
                                    var47 = false;
                                }
                            }
                        }
                    }
                    if (var47) {
                        if (var35) {
                            var46.field6107 = var30;
                            var46.field6122 = var36;
                            var46.field6022 = class357.field5189 + var31;
                            var46.field6087 = 0;
                            var46.field6119 = var32;
                            var46.field6028 = 0;
                            var46.field6029 = var37;
                            var46.field6084 = 1;
                            if (var46.field6107 == 65535) {
                                var46.field6107 = -1;
                            }
                            if (var46.field6022 > class357.field5189) {
                                var46.field6087 = -1;
                            }
                            if (var46.field6107 != -1 && class357.field5189 == var46.field6022) {
                                int var58 = class499.field7100.method172(var46.field6107, 3128).field4528;
                                if (var58 != -1) {
                                    class288 var59 = class742.field10404.method2663(0, var58);
                                    if (var59 != null && var59.field4081 != null && !var46.field6095) {
                                        class294.method1865(0, var46, var59, -80);
                                    }
                                }
                            }
                        } else {
                            var46.field6102 = class357.field5189 + var31;
                            var46.field6025 = var36;
                            var46.field6046 = 0;
                            var46.field6042 = var37;
                            var46.field6055 = 0;
                            var46.field6049 = 1;
                            var46.field6061 = var30;
                            var46.field6070 = var32;
                            if (var46.field6102 > class357.field5189) {
                                var46.field6046 = -1;
                            }
                            if (var46.field6061 == 65535) {
                                var46.field6061 = -1;
                            }
                            if (var46.field6061 != -1 && class357.field5189 == var46.field6102) {
                                int var56 = class499.field7100.method172(var46.field6061, 3128).field4528;
                                if (var56 != -1) {
                                    class288 var57 = class742.field10404.method2663(0, var56);
                                    if (var57 != null && var57.field4081 != null && !var46.field6095) {
                                        class294.method1865(0, var46, var57, -28);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class538.field7690) {
            byte var76 = class469.field6851.method3724((byte) 106);
            int var77 = class469.field6851.method3717(true);
            class633.method3651(0);
            class245.method1630(var76, -118, var77);
            class542.field7732 = null;
            return true;
        } else if (class693.field9572 == class542.field7732) {
            int var78 = class469.field6851.method3751((byte) 58);
            int var79 = var78 >> 28 & 0x3;
            int var80 = (var78 & 0xFFFDC38) >> 14;
            int var81 = var78 & 0x3FFF;
            int var82 = class469.field6851.method3712((byte) 52);
            if (var82 == 65535) {
                var82 = -1;
            }
            int var83 = class469.field6851.method3714((byte) 19);
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = var81 - class582.field8288;
            int var87 = var80 - class361.field5224;
            int var88 = class331.field4763[var84];
            class417.method2632(62, var79, var86, var85, var88, var82, var84, var87);
            class542.field7732 = null;
            return true;
        } else if (class686.field9484 == class542.field7732) {
            class569.field8065 = class469.field6851.method3745(arg0 - 6352);
            for (int var89 = 0; var89 < class569.field8065; var89++) {
                class254.field3654[var89] = class469.field6851.method3752(class513.method3033(arg0, -40));
                class458.field6753[var89] = class469.field6851.method3752(-2);
                if (class458.field6753[var89].equals("")) {
                    class458.field6753[var89] = class254.field3654[var89];
                }
                class331.field4764[var89] = class469.field6851.method3752(-2);
                class501.field7120[var89] = class469.field6851.method3752(-2);
                if (class501.field7120[var89].equals("")) {
                    class501.field7120[var89] = class331.field4764[var89];
                }
                class489.field6991[var89] = false;
            }
            class542.field7732 = null;
            class211.field3149 = class589.field8351;
            return true;
        } else if (class542.field7732 == class279.field3947) {
            class677.field9413 = class589.field8351;
            if (class228.field3361 == 0) {
                class470.field6856 = null;
                class377.field5712 = 0;
                class249.field3611 = null;
                class542.field7732 = null;
                class467.field6838 = null;
                return true;
            }
            class249.field3611 = class469.field6851.method3752(-2);
            boolean var90 = class469.field6851.method3745(-6314) == 1;
            if (var90) {
                class469.field6851.method3752(-2);
            }
            long var91 = class469.field6851.method3744((byte) 126);
            class470.field6856 = class195.method1357(95, var91);
            class325.field4647 = class469.field6851.method3743(true);
            int var93 = class469.field6851.method3745(-6314);
            if (var93 == 255) {
                class542.field7732 = null;
                return true;
            }
            class377.field5712 = var93;
            class351[] var94 = new class351[100];
            for (int var95 = 0; var95 < class377.field5712; var95++) {
                var94[var95] = new class351();
                var94[var95].field5121 = class469.field6851.method3752(-2);
                boolean var101 = class469.field6851.method3745(-6314) == 1;
                if (var101) {
                    var94[var95].field5120 = class469.field6851.method3752(-2);
                } else {
                    var94[var95].field5120 = var94[var95].field5121;
                }
                var94[var95].field5123 = class712.method4064(-13, var94[var95].field5120);
                var94[var95].field5119 = class469.field6851.method3712((byte) -117);
                var94[var95].field5117 = class469.field6851.method3743(true);
                var94[var95].field5116 = class469.field6851.method3752(arg0 - 40);
                if (var94[var95].field5120.equals(class130.field1749.field9513)) {
                    class168.field2644 = var94[var95].field5117;
                }
            }
            boolean var96 = false;
            int var97 = class377.field5712;
            while (var97 > 0) {
                boolean var98 = true;
                var97--;
                for (int var99 = 0; var99 < var97; var99++) {
                    if (var94[var99].field5123.compareTo(var94[var99 + 1].field5123) > 0) {
                        class351 var100 = var94[var99];
                        var94[var99] = var94[var99 + 1];
                        var98 = false;
                        var94[var99 + 1] = var100;
                    }
                }
                if (var98) {
                    break;
                }
            }
            class467.field6838 = var94;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class327.field4663) {
            int var102 = class469.field6851.method3693(47);
            if (var102 == 65535) {
                var102 = -1;
            }
            int var103 = class469.field6851.method3722((byte) 109);
            class633.method3651(arg0 - 38);
            class317.method2015(-14905, var103, 2, var102, -1);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class117.field1601) {
            int var104 = class469.field6851.method3728((byte) 88);
            int var105 = class469.field6851.method3720(-19541);
            int var106 = class469.field6851.method3745(-6314);
            String var107 = "";
            String var108 = var107;
            if ((var106 & 0x1) != 0) {
                var107 = class469.field6851.method3752(-2);
                if ((var106 & 0x2) == 0) {
                    var108 = var107;
                } else {
                    var108 = class469.field6851.method3752(-2);
                }
            }
            String var109 = class469.field6851.method3752(-2);
            if (var104 == 99) {
                class533.method3136(117, var109);
            } else if (var108.equals("") || !class89.method720(-27006, var108)) {
                class25.method125(var105, var107, 0, var109, var104, var107, var108);
            } else {
                class542.field7732 = null;
                return true;
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class417.field6250) {
            int var110 = class469.field6851.method3693(69);
            if (var110 == 65535) {
                var110 = -1;
            }
            String var111 = class469.field6851.method3752(-2);
            int var112 = class469.field6851.method3714((byte) 19);
            int var113 = class469.field6851.method3745(-6314);
            if (var113 >= 1 && var113 <= 8) {
                if (var111.equalsIgnoreCase("null")) {
                    var111 = null;
                }
                class143.field1869[var113 - 1] = var111;
                class411.field6188[var113 - 1] = var110;
                class597.field8464[var113 - 1] = var112 == 0;
            }
            class542.field7732 = null;
            return true;
        } else if (class8.field105 == class542.field7732) {
            int var114 = class469.field6851.method3726(false);
            int var115 = class469.field6851.method3722((byte) 109);
            class83.field1160.method2613(var115, var114, (byte) -3);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class130.field1746) {
            class642.method3678((byte) 113, class210.field3071);
            class542.field7732 = null;
            return true;
        } else if (class608.field8605 == class542.field7732) {
            int var116 = class469.field6851.method3693(117);
            class633.method3651(0);
            class340.method2166(false, var116);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class488.field6983) {
            int var117 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
            class633.method3651(0);
            class413.field6211 = var117;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class490.field6994) {
            class642.method3678((byte) 113, class716.field10072);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class235.field3418) {
            class327.field4665 = class469.field6851.method3701(-109);
            class587.field8318 = class469.field6851.method3714((byte) 19);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class502.field7139) {
            class210.method1425(arg0 - 38);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class43.field469) {
            int var118 = class469.field6851.method3714((byte) 19);
            int var119 = class469.field6851.method3726(false);
            class83.field1160.method2610(arg0 ^ 0x26, var119, var118);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class356.field5173) {
            class224.method1509(23489, class469.field6851.method3752(-2));
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class396.field5939) {
            class542.field7732 = null;
            class230.field3379 = 1;
            class211.field3149 = class589.field8351;
            return true;
        } else if (class658.field9222 == class542.field7732) {
            class642.method3678((byte) 113, class488.field6982);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class37.field380) {
            int var120 = class469.field6851.method3712((byte) -109);
            if (var120 == 65535) {
                var120 = -1;
            }
            int var121 = class469.field6851.method3720(arg0 ^ 0xFFFFB38D);
            int var122 = class469.field6851.method3693(100);
            if (var122 == 65535) {
                var122 = -1;
            }
            int var123 = class469.field6851.method3722((byte) 109);
            class633.method3651(0);
            for (int var124 = var120; var124 <= var122; var124++) {
                long var125 = ((long) var123 << 32) + ((long) var124);
                class233 var127 = (class233) class255.field3657.method2287(var125, (byte) -117);
                class233 var128;
                if (var127 != null) {
                    var128 = new class233(var121, var127.field3396);
                    var127.method1304((byte) 7);
                } else if (var124 == -1) {
                    var128 = new class233(var121, class405.method2580(var123, -91).field663.field3396);
                } else {
                    var128 = new class233(var121, -1);
                }
                class255.field3657.method2278((byte) -23, var125, var128);
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class236.field3423) {
            class326.field4654 = class469.field6851.method3743(true) << 3;
            class456.field6731 = class469.field6851.method3701(-128);
            class608.field8607 = class469.field6851.method3731(-380) << 3;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class214.field3195) {
            class567.field8049 = class469.field6851.method3745(-6314);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class492.field7016) {
            int var129 = class469.field6851.method3709(true);
            int var130 = class469.field6851.method3726(false);
            class633.method3651(arg0 - 38);
            class683.method3904(var129, true, var130);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class323.field4611) {
            int var131 = class469.field6851.method3722((byte) 109);
            int var132 = class469.field6851.method3755(arg0 ^ 0xA6);
            class633.method3651(arg0 - 38);
            class142.method986(var131, var132, false);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class385.field5814) {
            boolean var133 = class469.field6851.method3745(-6314) == 1;
            String var134 = class469.field6851.method3752(-2);
            String var135 = var134;
            if (var133) {
                var135 = class469.field6851.method3752(-2);
            }
            int var136 = class469.field6851.method3745(arg0 - 6352);
            boolean var137 = false;
            if (var136 <= 1) {
                if (!(!class185.field2825 || class83.field1166) || class394.field5929) {
                    var137 = true;
                } else if (var136 <= 1 && class89.method720(-27006, var135)) {
                    var137 = true;
                }
            }
            if (!var137 && class724.field10111 == 0) {
                String var138 = class452.method2772(class253.method1663(class469.field6851, -26790), 3);
                if (var136 == 2) {
                    class707.method4020(null, 24, "<img=1>" + var135, (byte) 93, var134, -1, var138, "<img=1>" + var134, 0);
                } else if (var136 == 1) {
                    class707.method4020(null, 24, "<img=0>" + var135, (byte) 27, var134, -1, var138, "<img=0>" + var134, 0);
                } else {
                    class707.method4020(null, 24, var135, (byte) 47, var134, -1, var138, var134, 0);
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class571.field8082 == class542.field7732) {
            class46.method346(arg0 + 5);
            class542.field7732 = null;
            return false;
        } else if (class542.field7732 == class353.field5139) {
            class469.field6851.field9084 += 28;
            if (class469.field6851.method3710(arg0 ^ 0x32)) {
                class77.method639(class469.field6851, class469.field6851.field9084 - 28, (byte) 122);
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class379.field5732) {
            if (class87.field1249 != -1) {
                class127.method894(class87.field1249, 0, arg0 ^ 0x2148);
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class302.field4286) {
            boolean var139 = class469.field6851.method3745(-6314) == 1;
            String var140 = class469.field6851.method3752(-2);
            String var141 = var140;
            if (var139) {
                var141 = class469.field6851.method3752(-2);
            }
            long var142 = class469.field6851.method3744((byte) 61);
            long var144 = (long) class469.field6851.method3712((byte) 32);
            long var146 = (long) class469.field6851.method3747((byte) -74);
            int var148 = class469.field6851.method3745(-6314);
            long var149 = (var144 << 32) + var146;
            boolean var151 = false;
            int var152 = 0;
            while (true) {
                if (var152 >= 100) {
                    if (var148 <= 1) {
                        if (!(!class185.field2825 || class83.field1166) || class394.field5929) {
                            var151 = true;
                        } else if (class89.method720(-27006, var141)) {
                            var151 = true;
                        }
                    }
                    break;
                }
                if (class457.field6740[var152] == var149) {
                    var151 = true;
                    break;
                }
                var152++;
            }
            if (!var151 && class724.field10111 == 0) {
                class457.field6740[class157.field2511] = var149;
                class157.field2511 = (class157.field2511 + 1) % 100;
                String var153 = class452.method2772(class253.method1663(class469.field6851, arg0 - 26828), 3);
                if (var148 == 2 || var148 == 3) {
                    class707.method4020(class220.method1478(var142, -124), 9, "<img=1>" + var141, (byte) 35, var140, -1, var153, "<img=1>" + var140, 0);
                } else if (var148 == 1) {
                    class707.method4020(class220.method1478(var142, -124), 9, "<img=0>" + var141, (byte) 93, var140, -1, var153, "<img=0>" + var140, 0);
                } else {
                    class707.method4020(class220.method1478(var142, -128), 9, var141, (byte) 109, var140, -1, var153, var140, 0);
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class133.field1788) {
            class321.method2030(-24);
            class542.field7732 = null;
            return true;
        } else if (class588.field8335 == class542.field7732) {
            int var154 = class469.field6851.method3709(true);
            class633.method3651(arg0 - 38);
            class421 var155 = (class421) class291.field4168.method2287((long) var154, (byte) -117);
            if (var155 != null) {
                class327.method2074(false, false, var155, true);
            }
            if (class625.field8742 != null) {
                class673.method3850(class625.field8742, (byte) -56);
                class625.field8742 = null;
            }
            class542.field7732 = null;
            return true;
        } else if (class603.field8533 == class542.field7732) {
            int var156 = class469.field6851.method3712((byte) -120);
            class689 var157;
            if (class701.field9775 == var156) {
                var157 = class130.field1749;
            } else {
                var157 = class314.field4456[var156];
            }
            if (var157 == null) {
                class542.field7732 = null;
                return true;
            }
            int var158 = class469.field6851.method3712((byte) 124);
            int var159 = class469.field6851.method3745(-6314);
            boolean var160 = (var158 & 0x8000) != 0;
            if (var157.field9513 != null && var157.field9495 != null) {
                boolean var161 = false;
                if (var159 <= 1) {
                    if (!var160 && !(!class185.field2825 || class83.field1166) || class394.field5929) {
                        var161 = true;
                    } else if (class89.method720(arg0 ^ 0xFFFF96A4, var157.field9513)) {
                        var161 = true;
                    }
                }
                if (!var161 && class724.field10111 == 0) {
                    int var162 = -1;
                    String var163;
                    if (var160) {
                        var158 &= 0x7FFF;
                        class86 var164 = class351.method2211(arg0 ^ 0xFFFFF16A, class469.field6851);
                        var162 = var164.field1227;
                        var163 = var164.field1230.method3230(-59, class469.field6851);
                    } else {
                        var163 = class452.method2772(class253.method1663(class469.field6851, -26790), 3);
                    }
                    var157.field6020 = var163.trim();
                    var157.field6050 = var158 & 0xFF;
                    var157.field6044 = var158 >> 8;
                    var157.field6099 = 150;
                    int var165;
                    if (var159 == 1 || var159 == 2) {
                        var165 = var160 ? 17 : 1;
                    } else {
                        var165 = var160 ? 17 : 2;
                    }
                    if (var159 == 2) {
                        class707.method4020(null, var165, "<img=1>" + var157.method3916((byte) -109, false), (byte) 38, var157.field9522, var162, var163, "<img=1>" + var157.method3917((byte) 124, true), 0);
                    } else if (var159 == 1) {
                        class707.method4020(null, var165, "<img=0>" + var157.method3916((byte) -109, false), (byte) 73, var157.field9522, var162, var163, "<img=0>" + var157.method3917((byte) 97, true), 0);
                    } else {
                        class707.method4020(null, var165, var157.method3916((byte) -109, false), (byte) 82, var157.field9522, var162, var163, var157.method3917((byte) 115, true), 0);
                    }
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class99.field1407 == class542.field7732) {
            int var166 = class469.field6851.method3701(-112);
            int var167 = class469.field6851.method3720(-19541);
            int var168 = class469.field6851.method3745(-6314);
            class225.field3309[var168] = var167;
            class91.field1276[var168] = var166;
            class547.field7812[var168] = 1;
            int var169 = class108.field1506[var168] - 1;
            for (int var170 = 0; var170 < var169; var170++) {
                if (var167 >= class476.field6910[var170]) {
                    class547.field7812[var168] = var170 + 2;
                }
            }
            class460.field6784[class493.method2943(class312.field4410++, 31)] = var168;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class530.field7549) {
            class642.method3678((byte) 113, class48.field697);
            class542.field7732 = null;
            return true;
        } else if (class636.field8933 == class542.field7732) {
            int var171 = class469.field6851.method3717(true);
            int var172 = class469.field6851.method3755(128) << 2;
            int var173 = class469.field6851.method3717(true);
            int var174 = class469.field6851.method3745(-6314);
            int var175 = class469.field6851.method3701(-120);
            class633.method3651(0);
            class185.method1305(var174, true, var175, var173, var172, var171);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class489.field6989) {
            int var176 = class469.field6851.method3751((byte) 108);
            int var177 = class469.field6851.method3712((byte) -112);
            class633.method3651(arg0 - 38);
            class594.method3465(2, var176, var177);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class501.field7117) {
            boolean var178 = class469.field6851.method3745(-6314) == 1;
            String var179 = class469.field6851.method3752(-2);
            String var180 = var179;
            if (var178) {
                var180 = class469.field6851.method3752(arg0 ^ 0xFFFFFFD8);
            }
            int var181 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
            int var182 = class469.field6851.method3712((byte) 63);
            boolean var183 = false;
            if (var181 <= 1 && class89.method720(-27006, var180)) {
                var183 = true;
            }
            if (!var183 && class724.field10111 == 0) {
                String var184 = class31.field325.method1720(var182, arg0 ^ 0x27).method3230(-118, class469.field6851);
                if (var181 == 2) {
                    class707.method4020(null, 25, "<img=1>" + var180, (byte) 26, var179, var182, var184, "<img=1>" + var179, 0);
                } else if (var181 == 1) {
                    class707.method4020(null, 25, "<img=0>" + var180, (byte) 21, var179, var182, var184, "<img=0>" + var179, 0);
                } else {
                    class707.method4020(null, 25, var180, (byte) 30, var179, var182, var184, var179, 0);
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class424.field6306) {
            int var185 = class469.field6851.method3720(arg0 - 19579);
            int var186 = class469.field6851.method3726(false);
            int var187 = class469.field6851.method3709(true);
            class633.method3651(0);
            class317.method2015(-14905, var187, 5, var186, var185);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class459.field6755) {
            class456.field6731 = class469.field6851.method3745(-6314);
            class608.field8607 = class469.field6851.method3711(16711680) << 3;
            class326.field4654 = class469.field6851.method3711(arg0 ^ 0xFF0026) << 3;
            for (class258 var188 = (class258) class12.field173.method2283(false); var188 != null; var188 = (class258) class12.field173.method2282((byte) 68)) {
                int var191 = (int) (var188.field2810 >> 28 & 0x3L);
                int var192 = (int) (var188.field2810 & 0x3FFFL);
                int var193 = var192 - class361.field5224;
                int var194 = (int) (var188.field2810 >> 14 & 0x3FFFL);
                int var195 = var194 - class582.field8288;
                if (class456.field6731 == var191 && class326.field4654 <= var193 && (class326.field4654 + 8) > var193 && class608.field8607 <= var195 && var195 < class608.field8607 + 8) {
                    var188.method1304((byte) 7);
                    if (var193 >= 0 && var195 >= 0 && var193 < class194.field2946 && var195 < class255.field3656) {
                        class41.method295(class456.field6731, var193, var195, 0);
                    }
                }
            }
            for (class19 var189 = (class19) class153.field2445.method1195(0); var189 != null; var189 = (class19) class153.field2445.method1201(arg0 - 36)) {
                if (var189.field208 >= class326.field4654 && class326.field4654 + 8 > var189.field208 && class608.field8607 <= var189.field211 && (class608.field8607 + 8) > var189.field211 && class456.field6731 == var189.field209) {
                    var189.field205 = true;
                }
            }
            for (class19 var190 = (class19) class606.field8555.method1195(arg0 ^ 0x26); var190 != null; var190 = (class19) class606.field8555.method1201(2)) {
                if (var190.field208 >= class326.field4654 && class326.field4654 + 8 > var190.field208 && class608.field8607 <= var190.field211 && var190.field211 < (class608.field8607 + 8) && class456.field6731 == var190.field209) {
                    var190.field205 = true;
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class373.field5540) {
            int var196 = class469.field6851.method3749((byte) -113);
            int var197 = class469.field6851.method3720(-19541);
            class633.method3651(arg0 - 38);
            class701.method3976(7838, var196, var197);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class417.field6253) {
            int var198 = class469.field6851.method3726(false);
            class633.method3651(0);
            class755.method4212(false, var198);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class509.field7254) {
            class642.method3678((byte) 113, class234.field3409);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class359.field5207) {
            byte var199 = class469.field6851.method3711(16711680);
            int var200 = class469.field6851.method3726(false);
            class633.method3651(0);
            class192.method1340(var200, (byte) -106, var199);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class334.field4822) {
            int var201 = class469.field6851.method3712((byte) 73);
            int var202 = class469.field6851.method3712((byte) 55);
            int var203 = class469.field6851.method3712((byte) -123);
            class633.method3651(0);
            if (class86.field1229[var201] != null) {
                for (int var204 = var202; var204 < var203; var204++) {
                    int var205 = class469.field6851.method3747((byte) -74);
                    if (var204 < class86.field1229[var201].length && class86.field1229[var201][var204] != null) {
                        class86.field1229[var201][var204].field540 = var205;
                    }
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class294.field4195) {
            int var206 = class469.field6851.method3720(arg0 ^ 0xFFFFB38D);
            int var207 = class469.field6851.method3701(-118);
            class633.method3651(0);
            class29.method143(arg0 ^ 0xFFFFFFB7, var207, var206);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class374.field5679) {
            class642.method3678((byte) 113, class555.field7931);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class44.field474) {
            int var208 = class469.field6851.method3693(123);
            int var209 = class469.field6851.method3722((byte) 109);
            class633.method3651(arg0 - 38);
            class192.method1340(var208, (byte) -100, var209);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class352.field5128) {
            int var210 = class469.field6851.method3751((byte) -118);
            int var211 = class469.field6851.method3726(false);
            if (var211 == 65535) {
                var211 = -1;
            }
            class633.method3651(0);
            class317.method2015(arg0 ^ 0xFFFFC5E1, var210, 1, var211, -1);
            class542.field7732 = null;
            return true;
        } else if (class602.field8517 == class542.field7732) {
            int var212 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
            boolean var213 = (var212 & 0x1) == 1;
            String var214 = class469.field6851.method3752(-2);
            String var215 = class469.field6851.method3752(-2);
            if (var215.equals("")) {
                var215 = var214;
            }
            String var216 = class469.field6851.method3752(-2);
            String var217 = class469.field6851.method3752(-2);
            if (var217.equals("")) {
                var217 = var216;
            }
            if (var213) {
                for (int var218 = 0; var218 < class569.field8065; var218++) {
                    if (class458.field6753[var218].equals(var217)) {
                        class254.field3654[var218] = var214;
                        class458.field6753[var218] = var215;
                        class331.field4764[var218] = var216;
                        class501.field7120[var218] = var217;
                        break;
                    }
                }
            } else {
                class254.field3654[class569.field8065] = var214;
                class458.field6753[class569.field8065] = var215;
                class331.field4764[class569.field8065] = var216;
                class501.field7120[class569.field8065] = var217;
                class489.field6991[class569.field8065] = class493.method2943(2, var212) == 2;
                class569.field8065++;
            }
            class542.field7732 = null;
            class211.field3149 = class589.field8351;
            return true;
        } else if (class542.field7732 == class337.field4913) {
            class642.method3678((byte) 113, class64.field919);
            class542.field7732 = null;
            return true;
        } else if (class581.field8251 == class542.field7732) {
            int var219 = class469.field6851.method3712((byte) 89);
            if (var219 == 65535) {
                var219 = -1;
            }
            int var220 = class469.field6851.method3745(arg0 - 6352);
            int var221 = class469.field6851.method3712((byte) 119);
            int var222 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
            class176.method1258(50, 256, true, var221, var219, var222, var220);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class361.field5230) {
            class109.method812(false, (byte) -74);
            class542.field7732 = null;
            return false;
        } else if (class547.field7815 == class542.field7732) {
            int var223 = class469.field6851.method3714((byte) 19);
            int var224 = class469.field6851.method3745(-6314);
            int var225 = class469.field6851.method3693(78);
            if (var225 == 65535) {
                var225 = -1;
            }
            class12.method83(var224, var225, var223, (byte) 126);
            class542.field7732 = null;
            return true;
        } else if (class569.field8061 == class542.field7732) {
            int var226 = class469.field6851.method3693(83);
            if (var226 == 65535) {
                var226 = -1;
            }
            int var227 = class469.field6851.method3745(arg0 - 6352);
            int var228 = class469.field6851.method3747((byte) -74);
            class261.method1691(-101, var228, var227, var226);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class505.field7180) {
            class273.method1728(class228.field3361, class469.field6851, class179.field2759, -14391);
            class542.field7732 = null;
            return true;
        } else if (class673.field9384 == class542.field7732) {
            String var229 = class469.field6851.method3752(-2);
            int var230 = class469.field6851.method3726(false);
            class633.method3651(arg0 ^ 0x26);
            class13.method87(arg0 - 129, var230, var229);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class168.field2642) {
            class132.field1782 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
            class76.field1064 = class589.field8351;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class350.field5115) {
            int var231 = class469.field6851.method3745(-6314);
            int var232 = class469.field6851.method3722((byte) 109);
            int var233 = class469.field6851.method3693(53);
            class633.method3651(0);
            class421 var234 = (class421) class291.field4168.method2287((long) var232, (byte) -117);
            if (var234 != null) {
                class327.method2074(false, false, var234, var234.field6282 != var233);
            }
            class320.method2024(var231, false, 0, var232, var233);
            class542.field7732 = null;
            return true;
        } else if (class9.field112 == class542.field7732) {
            int var235 = class469.field6851.method3720(arg0 - 19579);
            int var236 = class469.field6851.method3693(86);
            int var237 = class469.field6851.method3693(107);
            if (var237 == 65535) {
                var237 = -1;
            }
            int var238 = class469.field6851.method3693(51);
            class633.method3651(0);
            if (var238 == 65535) {
                var238 = -1;
            }
            for (int var239 = var238; var239 <= var237; var239++) {
                long var240 = ((long) var235 << 32) + (long) var239;
                class233 var242 = (class233) class255.field3657.method2287(var240, (byte) -117);
                class233 var243;
                if (var242 != null) {
                    var243 = new class233(var242.field3393, var236);
                    var242.method1304((byte) 7);
                } else if (var239 == -1) {
                    var243 = new class233(class405.method2580(var235, arg0 ^ 0xFFFFFFAF).field663.field3393, var236);
                } else {
                    var243 = new class233(0, var236);
                }
                class255.field3657.method2278((byte) -32, var240, var243);
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class19.field220) {
            class633.method3651(0);
            class80.method650(-118);
            class542.field7732 = null;
            return true;
        } else if (class750.field10484 == class542.field7732) {
            if (class245.method1631(-10, class87.field1246)) {
                class677.field9415 = (int) ((float) class469.field6851.method3712((byte) 41) * 2.5F);
            } else {
                class677.field9415 = class469.field6851.method3712((byte) -3) * 30;
            }
            class76.field1064 = class589.field8351;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class537.field7684) {
            class43.field463 = class469.field6851.method3718(-28732);
            class185.field2825 = class469.field6851.method3745(-6314) == 1;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class234.field3402) {
            int var244 = class469.field6851.method3714((byte) 19);
            int var245 = class469.field6851.method3712((byte) -108);
            class633.method3651(arg0 - 38);
            class537.method3154(var244, -8070, true, var245);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class54.field747) {
            class642.method3678((byte) 113, class608.field8608);
            class542.field7732 = null;
            return true;
        } else if (class678.field9430 == class542.field7732) {
            int[] var246 = new int[4];
            for (int var247 = 0; var247 < 4; var247++) {
                var246[var247] = class469.field6851.method3693(59);
            }
            int var248 = class469.field6851.method3712((byte) -112);
            int var249 = class469.field6851.method3745(-6314);
            class432 var250 = (class432) class497.field7067.method2287((long) var248, (byte) -117);
            if (var250 != null) {
                class513.method3035(var250.field6439, var246, var249, arg0 ^ 0x26);
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class228.field3347) {
            int var251 = class469.field6851.method3751((byte) -114);
            class633.method3651(0);
            class542.field7732 = null;
            if (var251 == -1) {
                class656.field9191 = -1;
                class67.field967 = -1;
            } else {
                int var252 = (var251 & 0xFFFFC5D) >> 14;
                int var253 = var251 & 0x3FFF;
                int var254 = var252 - class361.field5224;
                if (var254 < 0) {
                    var254 = 0;
                } else if (var254 >= class194.field2946) {
                    var254 = class194.field2946;
                }
                int var255 = var253 - class582.field8288;
                class656.field9191 = (var254 << 9) + 256;
                if (var255 < 0) {
                    var255 = 0;
                } else if (class255.field3656 <= var255) {
                    var255 = class255.field3656;
                }
                class67.field967 = (var255 << 9) + 256;
            }
            return true;
        } else if (class542.field7732 == class445.field6612) {
            class642.method3678((byte) 113, class348.field5102);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class320.field4521) {
            int var256 = class469.field6851.method3712((byte) -105);
            if (var256 == 65535) {
                var256 = -1;
            }
            int var257 = class469.field6851.method3745(-6314);
            int var258 = class469.field6851.method3712((byte) -115);
            int var259 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
            int var260 = class469.field6851.method3712((byte) -110);
            class258.method1683(var260, var259, var256, (byte) -9, var257, var258);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class332.field4770) {
            int var261 = class469.field6851.method3751((byte) -83);
            int var262 = class469.field6851.method3722((byte) 109);
            class633.method3651(0);
            class421 var263 = (class421) class291.field4168.method2287((long) var262, (byte) -117);
            class421 var264 = (class421) class291.field4168.method2287((long) var261, (byte) -117);
            if (var264 != null) {
                class327.method2074(false, false, var264, var263 == null || var263.field6282 != var264.field6282);
            }
            if (var263 != null) {
                var263.method1304((byte) 7);
                class291.field4168.method2278((byte) -80, (long) var261, var263);
            }
            class46 var265 = class405.method2580(var262, -89);
            if (var265 != null) {
                class673.method3850(var265, (byte) -32);
            }
            class46 var266 = class405.method2580(var261, 123);
            if (var266 != null) {
                class673.method3850(var266, (byte) -116);
                class256.method1679(var266, arg0 - 38, true);
            }
            if (class87.field1249 != -1) {
                class127.method894(class87.field1249, 1, arg0 ^ 0x2148);
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class352.field5127) {
            int var267 = class469.field6851.method3745(-6314);
            if (class469.field6851.method3745(-6314) == 0) {
                class661.field9248[var267] = new class646();
            } else {
                class469.field6851.field9084--;
                class661.field9248[var267] = new class646(class469.field6851);
            }
            class727.field10151 = class589.field8351;
            class542.field7732 = null;
            return true;
        } else if (class692.field9559 == class542.field7732) {
            class642.method3678((byte) 113, class608.field8601);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class531.field7571) {
            for (int var268 = 0; var268 < class314.field4456.length; var268++) {
                if (class314.field4456[var268] != null) {
                    class314.field4456[var268].field6039 = null;
                    class314.field4456[var268].field6094 = -1;
                }
            }
            for (int var269 = 0; var269 < class567.field8058; var269++) {
                class488.field6985[var269].field6439.field6039 = null;
                class488.field6985[var269].field6439.field6094 = -1;
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class367.field5286) {
            int var270 = class469.field6851.method3709(true);
            int var271 = class469.field6851.method3693(55);
            int var272 = class469.field6851.method3755(128);
            int var273 = class469.field6851.method3693(99);
            class633.method3651(0);
            class130.method924(var273, var272, arg0 - 30, var271, var270);
            class542.field7732 = null;
            return true;
        } else if (class81.field1141 == class542.field7732) {
            int var274 = class469.field6851.method3755(128);
            byte var275 = class469.field6851.method3724((byte) 124);
            class83.field1160.method2613(var275, var274, (byte) -128);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class213.field3191) {
            int var276 = class469.field6851.method3714((byte) 19);
            int var277 = class469.field6851.method3717(true);
            if (var277 == 255) {
                var276 = -1;
                var277 = -1;
            }
            class117.method859(var276, (byte) 5, var277);
            class542.field7732 = null;
            return true;
        } else if (class707.field9956 == class542.field7732) {
            int var278 = class469.field6851.method3709(true);
            String var279 = class469.field6851.method3752(arg0 ^ 0xFFFFFFD8);
            class633.method3651(0);
            class489.method2927(var279, 3, var278);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class176.field2733) {
            int var280 = class469.field6851.method3726(false);
            int var281 = class469.field6851.method3751((byte) 68);
            class83.field1160.method2610(0, var280, var281);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class382.field5764) {
            boolean var282 = class469.field6851.method3745(-6314) == 1;
            String var283 = class469.field6851.method3752(arg0 - 40);
            String var284 = var283;
            if (var282) {
                var284 = class469.field6851.method3752(-2);
            }
            long var285 = (long) class469.field6851.method3712((byte) -123);
            long var287 = (long) class469.field6851.method3747((byte) -74);
            int var289 = class469.field6851.method3745(-6314);
            long var290 = (var285 << 32) + var287;
            boolean var292 = false;
            int var293 = 0;
            while (true) {
                if (var293 >= 100) {
                    if (var289 <= 1) {
                        if (!(!class185.field2825 || class83.field1166) || class394.field5929) {
                            var292 = true;
                        } else if (class89.method720(arg0 ^ 0xFFFF96A4, var284)) {
                            var292 = true;
                        }
                    }
                    break;
                }
                if (class457.field6740[var293] == var290) {
                    var292 = true;
                    break;
                }
                var293++;
            }
            if (!var292 && class724.field10111 == 0) {
                class457.field6740[class157.field2511] = var290;
                class157.field2511 = (class157.field2511 + 1) % 100;
                String var294 = class452.method2772(class253.method1663(class469.field6851, -26790), 3);
                if (var289 == 2) {
                    class707.method4020(null, 7, "<img=1>" + var284, (byte) 101, var283, -1, var294, "<img=1>" + var283, 0);
                } else if (var289 == 1) {
                    class707.method4020(null, 7, "<img=0>" + var284, (byte) 90, var283, -1, var294, "<img=0>" + var283, 0);
                } else {
                    class707.method4020(null, 3, var284, (byte) 95, var283, -1, var294, var283, 0);
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class575.field8143 == class542.field7732) {
            class633.method3651(0);
            class717.method4070((byte) -117);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class373.field5534) {
            String var295 = class469.field6851.method3752(arg0 - 40);
            boolean var296 = class469.field6851.method3745(-6314) == 1;
            String var297;
            if (var296) {
                var297 = class469.field6851.method3752(-2);
            } else {
                var297 = var295;
            }
            int var298 = class469.field6851.method3712((byte) -104);
            byte var299 = class469.field6851.method3743(true);
            boolean var300 = false;
            if (var299 == -128) {
                var300 = true;
            }
            if (var300) {
                if (class377.field5712 == 0) {
                    class542.field7732 = null;
                    return true;
                }
                boolean var301 = false;
                int var302;
                for (var302 = 0; var302 < class377.field5712 && (!class467.field6838[var302].field5120.equals(var297) || class467.field6838[var302].field5119 != var298); var302++) {
                }
                if (class377.field5712 > var302) {
                    while ((class377.field5712 - 1) > var302) {
                        class467.field6838[var302] = class467.field6838[var302 + 1];
                        var302++;
                    }
                    class377.field5712--;
                    class467.field6838[class377.field5712] = null;
                }
            } else {
                String var303 = class469.field6851.method3752(arg0 - 40);
                class351 var304 = new class351();
                var304.field5121 = var295;
                var304.field5120 = var297;
                var304.field5123 = class712.method4064(-13, var304.field5120);
                var304.field5117 = var299;
                var304.field5119 = var298;
                var304.field5116 = var303;
                int var305;
                for (var305 = class377.field5712 - 1; var305 >= 0; var305--) {
                    int var306 = class467.field6838[var305].field5123.compareTo(var304.field5123);
                    if (var306 == 0) {
                        class467.field6838[var305].field5119 = var298;
                        class467.field6838[var305].field5117 = var299;
                        class467.field6838[var305].field5116 = var303;
                        if (var297.equals(class130.field1749.field9513)) {
                            class168.field2644 = var299;
                        }
                        class542.field7732 = null;
                        class677.field9413 = class589.field8351;
                        return true;
                    }
                    if (var306 < 0) {
                        break;
                    }
                }
                if (class467.field6838.length <= class377.field5712) {
                    class542.field7732 = null;
                    return true;
                }
                for (int var307 = class377.field5712 - 1; var307 > var305; var307--) {
                    class467.field6838[var307 + 1] = class467.field6838[var307];
                }
                if (class377.field5712 == 0) {
                    class467.field6838 = new class351[100];
                }
                class467.field6838[var305 + 1] = var304;
                class377.field5712++;
                if (var297.equals(class130.field1749.field9513)) {
                    class168.field2644 = var299;
                }
            }
            class542.field7732 = null;
            class677.field9413 = class589.field8351;
            return true;
        } else if (class542.field7732 == class535.field7671) {
            class642.method3678((byte) 113, class96.field1357);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class509.field7255) {
            int var308 = class469.field6851.method3714((byte) 19);
            int var309 = class469.field6851.method3726(false);
            class633.method3651(0);
            if (var308 == 2) {
                class565.method3291(14607);
            }
            class87.field1249 = var309;
            class516.method3048(var309, -111);
            class483.method2891(false, false);
            class709.method4037(class87.field1249);
            for (int var310 = 0; var310 < 100; var310++) {
                class228.field3352[var310] = true;
            }
            class542.field7732 = null;
            return true;
        } else if (class59.field839 == class542.field7732) {
            int var311 = class469.field6851.method3720(-19541);
            class638.field8956 = class179.field2759.method4048((byte) -116, var311);
            class542.field7732 = null;
            return true;
        } else if (class758.field10599 == class542.field7732) {
            int var312 = class469.field6851.method3751((byte) -115);
            class633.method3651(0);
            class317.method2015(arg0 ^ 0xFFFFC5E1, var312, 5, class701.field9775, 0);
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class317.field4517) {
            int var313 = class469.field6851.method3714((byte) 19);
            int var314 = class469.field6851.method3712((byte) 16) << 2;
            int var315 = class469.field6851.method3701(-121);
            int var316 = class469.field6851.method3714((byte) 19);
            int var317 = class469.field6851.method3701(arg0 - 151);
            class633.method3651(0);
            class750.method4184(var315, var316, var314, var313, (byte) -116, true, var317);
            class542.field7732 = null;
            return true;
        } else if (class650.field9158 == class542.field7732) {
            while (class228.field3361 > class469.field6851.field9084) {
                boolean var328 = class469.field6851.method3745(-6314) == 1;
                String var329 = class469.field6851.method3752(-2);
                String var330 = class469.field6851.method3752(-2);
                int var331 = class469.field6851.method3712((byte) 101);
                int var332 = class469.field6851.method3745(-6314);
                String var333 = "";
                boolean var334 = false;
                if (var331 > 0) {
                    var333 = class469.field6851.method3752(arg0 - 40);
                    var334 = class469.field6851.method3745(arg0 ^ 0xFFFFE770) == 1;
                }
                for (int var335 = 0; var335 < class690.field9544; var335++) {
                    if (var328) {
                        if (var330.equals(class133.field1790[var335])) {
                            class133.field1790[var335] = var329;
                            class71.field1003[var335] = var330;
                            var329 = null;
                            break;
                        }
                    } else if (var329.equals(class133.field1790[var335])) {
                        if (class686.field9486[var335] != var331) {
                            boolean var336 = true;
                            for (class501 var337 = (class501) class123.field1662.method1615((byte) 100); var337 != null; var337 = (class501) class123.field1662.method1625(-105)) {
                                if (var337.field7118.equals(var329)) {
                                    if (var331 != 0 && var337.field7114 == 0) {
                                        var337.method385((byte) -98);
                                        var336 = false;
                                    } else if (var331 == 0 && var337.field7114 != 0) {
                                        var336 = false;
                                        var337.method385((byte) -66);
                                    }
                                }
                            }
                            if (var336) {
                                class123.field1662.method1616(22437, new class501(var329, var331));
                            }
                            class686.field9486[var335] = var331;
                        }
                        class71.field1003[var335] = var330;
                        class12.field172[var335] = var333;
                        class693.field9576[var335] = var332;
                        class581.field8258[var335] = var334;
                        var329 = null;
                        break;
                    }
                }
                if (var329 != null && class690.field9544 < 200) {
                    class133.field1790[class690.field9544] = var329;
                    class71.field1003[class690.field9544] = var330;
                    class686.field9486[class690.field9544] = var331;
                    class12.field172[class690.field9544] = var333;
                    class693.field9576[class690.field9544] = var332;
                    class581.field8258[class690.field9544] = var334;
                    class690.field9544++;
                }
            }
            class230.field3379 = 2;
            class211.field3149 = class589.field8351;
            boolean var318 = false;
            int var319 = class690.field9544;
            while (var319 > 0) {
                boolean var320 = true;
                var319--;
                for (int var321 = 0; var321 < var319; var321++) {
                    if (class686.field9486[var321] != class528.field7513.field8131 && class686.field9486[var321 + 1] == class528.field7513.field8131 || class686.field9486[var321] == 0 && class686.field9486[var321 + 1] != 0) {
                        int var322 = class686.field9486[var321];
                        class686.field9486[var321] = class686.field9486[var321 + 1];
                        class686.field9486[var321 + 1] = var322;
                        String var323 = class12.field172[var321];
                        class12.field172[var321] = class12.field172[var321 + 1];
                        class12.field172[var321 + 1] = var323;
                        String var324 = class133.field1790[var321];
                        class133.field1790[var321] = class133.field1790[var321 + 1];
                        class133.field1790[var321 + 1] = var324;
                        String var325 = class71.field1003[var321];
                        class71.field1003[var321] = class71.field1003[var321 + 1];
                        class71.field1003[var321 + 1] = var325;
                        int var326 = class693.field9576[var321];
                        class693.field9576[var321] = class693.field9576[var321 + 1];
                        class693.field9576[var321 + 1] = var326;
                        boolean var327 = class581.field8258[var321];
                        class581.field8258[var321] = class581.field8258[var321 + 1];
                        class581.field8258[var321 + 1] = var327;
                        var320 = false;
                    }
                }
                if (var320) {
                    break;
                }
            }
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class390.field5882) {
            int var338 = class469.field6851.method3712((byte) -116);
            int var339 = class469.field6851.method3745(-6314);
            boolean var340 = (var339 & 0x1) == 1;
            while (class228.field3361 > class469.field6851.field9084) {
                int var341 = class469.field6851.method3728((byte) 88);
                int var342 = class469.field6851.method3712((byte) 104);
                int var343 = 0;
                if (var342 != 0) {
                    var343 = class469.field6851.method3745(-6314);
                    if (var343 == 255) {
                        var343 = class469.field6851.method3720(-19541);
                    }
                }
                class662.method3813(var341, 0, var343, var340, var338, var342 - 1);
            }
            class143.field1867[class493.method2943(31, class25.field261++)] = var338;
            class542.field7732 = null;
            return true;
        } else if (class542.field7732 == class299.field4245) {
            int var344 = class469.field6851.method3751((byte) 89);
            class633.method3651(0);
            class317.method2015(-14905, var344, 3, -1, -1);
            class542.field7732 = null;
            return true;
        } else {
            if (arg0 != 38) {
                method875(-122);
            }
            if (class542.field7732 == class223.field3267) {
                int var345 = class469.field6851.method3755(128);
                String var346 = class469.field6851.method3752(arg0 ^ 0xFFFFFFD8);
                class633.method3651(arg0 - 38);
                class13.method87(-101, var345, var346);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class441.field6553) {
                class83.field1160.method2612(-14537);
                class542.field7732 = null;
                class356.field5174 += 32;
                return true;
            } else if (class542.field7732 == class524.field7488) {
                int var347 = class469.field6851.method3709(true);
                int var348 = class469.field6851.method3755(128);
                int var349 = class469.field6851.method3712((byte) -110);
                class633.method3651(0);
                class509.method3016((var349 << 16) + var348, var347, (byte) 112);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class340.field4936) {
                int var350 = class469.field6851.method3712((byte) -115);
                int var351 = class469.field6851.method3745(arg0 ^ 0xFFFFE770);
                boolean var352 = (var351 & 0x1) == 1;
                class345.method2186((byte) -122, var352, var350);
                int var353 = class469.field6851.method3712((byte) -114);
                for (int var354 = 0; var354 < var353; var354++) {
                    int var355 = class469.field6851.method3755(arg0 ^ 0xA6);
                    int var356 = class469.field6851.method3701(-118);
                    if (var356 == 255) {
                        var356 = class469.field6851.method3720(-19541);
                    }
                    class662.method3813(var354, 0, var356, var352, var350, var355 - 1);
                }
                class143.field1867[class493.method2943(class25.field261++, 31)] = var350;
                class542.field7732 = null;
                return true;
            } else if (class642.field9004 == class542.field7732) {
                boolean var357 = class469.field6851.method3745(-6314) == 1;
                byte[] var358 = new byte[class228.field3361 - 1];
                class469.field6851.method3736(28, var358, class228.field3361 - 1, 0);
                class77.method637(20000, var358, var357);
                class542.field7732 = null;
                return true;
            } else if (class728.field10212 == class542.field7732) {
                class337.field4909 = class228.field3361 > 2 ? class469.field6851.method3752(-2) : class430.field6396.method2679(class650.field9160, 82);
                class62.field906 = class228.field3361 > 0 ? class469.field6851.method3712((byte) -16) : -1;
                class542.field7732 = null;
                if (class62.field906 == 65535) {
                    class62.field906 = -1;
                }
                return true;
            } else if (class542.field7732 == class389.field5860) {
                int var359 = class469.field6851.method3720(arg0 - 19579);
                int var360 = class469.field6851.method3722((byte) 109);
                int var361 = class469.field6851.method3693(70);
                class633.method3651(0);
                if (var361 == 65535) {
                    var361 = -1;
                }
                class677.method3888((byte) 116, var359, var360, var361);
                class578 var362 = class336.field4876.method2079(var361, (byte) -113);
                class130.method924(var362.field8207, var362.field8170, 8, var362.field8221, var360);
                class611.method3543(0, var360, var362.field8179, var362.field8172, var362.field8182);
                class542.field7732 = null;
                return true;
            } else if (class92.field1282 == class542.field7732) {
                class642.method3678((byte) 113, class35.field364);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class252.field3637) {
                String var363 = class469.field6851.method3752(-2);
                Object[] var364 = new Object[var363.length() + 1];
                for (int var365 = var363.length() - 1; var365 >= 0; var365--) {
                    if (var363.charAt(var365) == 's') {
                        var364[var365 + 1] = class469.field6851.method3752(-2);
                    } else {
                        var364[var365 + 1] = Integer.valueOf(class469.field6851.method3720(-19541));
                    }
                }
                var364[0] = Integer.valueOf(class469.field6851.method3720(class513.method3033(arg0, -19571)));
                class633.method3651(0);
                class177 var366 = new class177();
                var366.field2737 = var364;
                class709.method4025(var366);
                class542.field7732 = null;
                return true;
            } else if (class76.field1056 == class542.field7732) {
                int var367 = class469.field6851.method3749((byte) -117);
                int var368 = class469.field6851.method3709(true);
                int var369 = class469.field6851.method3694(-37334048);
                class633.method3651(arg0 - 38);
                class231.method1546(var367, var369, var368, -115);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class389.field5853) {
                int var370 = class469.field6851.method3751((byte) 96);
                int var371 = class469.field6851.method3755(128);
                int var372 = class469.field6851.method3693(93);
                int var373 = class469.field6851.method3712((byte) -126);
                class633.method3651(0);
                class317.method2015(-14905, var370, 7, var371 | var373 << 16, var372);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class253.field3647) {
                boolean var374 = class469.field6851.method3717(true) == 1;
                class633.method3651(0);
                class297.field4221 = var374;
                class542.field7732 = null;
                return true;
            } else if (class58.field799 == class542.field7732) {
                int var375 = class469.field6851.method3712((byte) -113);
                if (var375 == 65535) {
                    var375 = -1;
                }
                int var376 = class469.field6851.method3745(-6314);
                int var377 = class469.field6851.method3712((byte) 72);
                int var378 = class469.field6851.method3745(-6314);
                int var379 = class469.field6851.method3712((byte) -5);
                class176.method1258(50, var379, false, var377, var375, var378, var376);
                class542.field7732 = null;
                return true;
            } else if (class566.field8043 == class542.field7732) {
                if (class183.field2801 != null) {
                    class417.method2633(false, -1, class63.field916.field10172.method953(arg0 ^ 0x4479), -1, 4);
                }
                byte[] var380 = new byte[class228.field3361];
                class469.field6851.method1916(var380, arg0 ^ 0x26, class228.field3361, 0);
                String var381 = class46.method332(class228.field3361, 0, 0, var380);
                class425.method2658(class179.field2759, true, (byte) -16, class63.field916.field10200.method3848(17503) == 1, var381);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class432.field6442) {
                int var382 = class469.field6851.method3755(128);
                int var383 = class469.field6851.method3712((byte) -126);
                class633.method3651(0);
                class502.method2985((byte) 76, var383, var382, 0);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class128.field1712) {
                class642.method3678((byte) 113, class224.field3306);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class262.field3720) {
                class291.method1860((byte) -124);
                class542.field7732 = null;
                return false;
            } else if (class542.field7732 == class361.field5221) {
                class276.field3920 = class469.field6851.method3756(arg0 ^ 0x10026);
                class542.field7732 = null;
                class76.field1064 = class589.field8351;
                return true;
            } else if (class99.field1421 == class542.field7732) {
                class642.method3678((byte) 113, class635.field8926);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class189.field2868) {
                int var384 = class469.field6851.method3755(arg0 ^ 0xA6);
                int var385 = class469.field6851.method3714((byte) 19);
                boolean var386 = (var385 & 0x1) == 1;
                class329.method2087(var386, (byte) 103, var384);
                class143.field1867[class493.method2943(class25.field261++, 31)] = var384;
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class307.field4354) {
                class542.field7732 = null;
                return false;
            } else if (class542.field7732 == class381.field5749) {
                int var387 = class469.field6851.method3720(arg0 - 19579);
                int var388 = class469.field6851.method3712((byte) -109);
                if (var388 == 65535) {
                    var388 = -1;
                }
                class633.method3651(0);
                class229.method1541(var387, -69, var388);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class186.field2840) {
                String var389 = class469.field6851.method3752(-2);
                int var390 = class469.field6851.method3712((byte) 42);
                String var391 = class31.field325.method1720(var390, 1).method3230(-117, class469.field6851);
                class707.method4020(null, 19, var389, (byte) 103, var389, var390, var391, var389, 0);
                class542.field7732 = null;
                return true;
            } else if (class758.field10593 == class542.field7732) {
                class153.method1140((byte) 112, class228.field3361, class469.field6851);
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class408.field6151) {
                boolean var392 = class469.field6851.method3745(arg0 ^ 0xFFFFE770) == 1;
                String var393 = class469.field6851.method3752(-2);
                String var394 = var393;
                if (var392) {
                    var394 = class469.field6851.method3752(-2);
                }
                long var395 = class469.field6851.method3744((byte) 96);
                long var397 = (long) class469.field6851.method3712((byte) 112);
                long var399 = (long) class469.field6851.method3747((byte) -74);
                int var401 = class469.field6851.method3745(-6314);
                int var402 = class469.field6851.method3712((byte) -117);
                long var403 = (var397 << 32) + var399;
                boolean var405 = false;
                int var406 = 0;
                while (true) {
                    if (var406 >= 100) {
                        if (var401 <= 1 && class89.method720(-27006, var394)) {
                            var405 = true;
                        }
                        break;
                    }
                    if (class457.field6740[var406] == var403) {
                        var405 = true;
                        break;
                    }
                    var406++;
                }
                if (!var405 && class724.field10111 == 0) {
                    class457.field6740[class157.field2511] = var403;
                    class157.field2511 = (class157.field2511 + 1) % 100;
                    String var407 = class31.field325.method1720(var402, 1).method3230(-116, class469.field6851);
                    if (var401 == 2) {
                        class707.method4020(class220.method1478(var395, -125), 20, "<img=1>" + var394, (byte) 103, var393, var402, var407, "<img=1>" + var393, 0);
                    } else if (var401 == 1) {
                        class707.method4020(class220.method1478(var395, -127), 20, "<img=0>" + var394, (byte) 115, var393, var402, var407, "<img=0>" + var393, 0);
                    } else {
                        class707.method4020(class220.method1478(var395, -124), 20, var394, (byte) 58, var393, var402, var407, var393, 0);
                    }
                }
                class542.field7732 = null;
                return true;
            } else if (class542.field7732 == class49.field712) {
                class608.field8607 = class469.field6851.method3743(true) << 3;
                class456.field6731 = class469.field6851.method3717(true);
                class326.field4654 = class469.field6851.method3743(true) << 3;
                while (class228.field3361 > class469.field6851.field9084) {
                    class629 var408 = class81.method652(60)[class469.field6851.method3745(arg0 ^ 0xFFFFE770)];
                    class642.method3678((byte) 113, var408);
                }
                class542.field7732 = null;
                return true;
            } else if (class559.field7997 == class542.field7732) {
                class642.method3678((byte) 113, class110.field1545);
                class542.field7732 = null;
                return true;
            } else {
                class326.method2072(-3753, null, "T1 - " + (class542.field7732 == null ? -1 : class542.field7732.method2843(true)) + "," + (class242.field3522 == null ? -1 : class242.field3522.method2843(true)) + "," + (class394.field5924 == null ? -1 : class394.field5924.method2843(true)) + " - " + class228.field3361);
                class109.method812(false, (byte) 115);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method869(int arg0) {
        this.field1640 = 0;
        field1635++;
        if (arg0 <= 26) {
            this.field1651 = true;
        }
        this.field1644 = 12800;
        this.field1649 = 12800;
        this.field1645 = 0;
        for (class693 var2 = (class693) this.field1653.method1195(0); var2 != null; var2 = (class693) this.field1653.method1201(2)) {
            if (this.field1649 > var2.field9568) {
                this.field1649 = var2.field9568;
            }
            if (var2.field9582 > this.field1640) {
                this.field1640 = var2.field9582;
            }
            if (var2.field9574 > this.field1645) {
                this.field1645 = var2.field9574;
            }
            if (var2.field9575 < this.field1644) {
                this.field1644 = var2.field9575;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BII)Z")
    public final boolean method870(byte arg0, int arg1, int arg2) {
        field1636++;
        class693 var4 = (class693) this.field1653.method1195(0);
        if (arg0 != 87) {
            method875(-52);
        }
        while (var4 != null) {
            if (var4.method3937(2, arg2, arg1)) {
                return true;
            }
            var4 = (class693) this.field1653.method1201(arg0 - 85);
        }
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB[I)Z")
    public final boolean method871(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 != 45) {
            method867(-126, true);
        }
        field1648++;
        for (class693 var5 = (class693) this.field1653.method1195(arg2 - 45); var5 != null; var5 = (class693) this.field1653.method1201(2)) {
            if (var5.method3935(arg1, arg0, 27505)) {
                var5.method3936(arg1, arg3, arg0, false);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLcq;)V")
    public static final void method872(byte arg0, class468 arg1) {
        field1642++;
        class393.field5917.method1203(arg1, (byte) 79);
        arg1.field6840 = arg1.field6839.field9084;
        class440.field6511 += arg1.field6840;
        arg1.field6839.field9084 = 0;
        int var2 = 40 % ((-arg0 - 3) / 36);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method873(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field1643++;
        for (class693 var6 = (class693) this.field1653.method1195(0); var6 != null; var6 = (class693) this.field1653.method1201(2)) {
            if (var6.method3934(1, arg0, arg2, arg3)) {
                var6.method3932(arg2, arg4, -105, arg3);
                return true;
            }
        }
        if (arg1 > -42) {
            this.method870((byte) -118, 70, -108);
        }
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[IBI)Z")
    public final boolean method874(int arg0, int[] arg1, byte arg2, int arg3) {
        if (arg2 >= -90) {
            return true;
        }
        field1647++;
        for (class693 var5 = (class693) this.field1653.method1195(0); var5 != null; var5 = (class693) this.field1653.method1201(2)) {
            if (var5.method3937(2, arg3, arg0)) {
                var5.method3932(arg0, arg1, -70, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public static void method875(int arg0) {
        field1638 = null;
        if (arg0 != -1) {
            method875(-50);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class120(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1651 = arg5;
        this.field1641 = arg0;
        this.field1633 = arg4;
        this.field1654 = arg1;
        this.field1646 = arg6;
        this.field1652 = arg3;
        this.field1634 = arg2;
        if (this.field1646 == 255) {
            this.field1646 = 0;
        }
        this.field1653 = new class164();
    }
}
