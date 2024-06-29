import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class304 extends class213 {

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field4451 = -1;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public static int field4453 = -1;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "Lic;")
    private class329 field4446;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "Lwf;")
    public static class333 field4450;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V", line = 6)
    public static void method2124(int arg0) {
        field4450 = null;
        if (arg0 < 45) {
            method2126((byte) -20);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[[[BIBII)V", line = 16)
    public static final void method2125(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class130.field1770++;
        class223.field3212 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class124.field1653; var12 < class23.field258; var12++) {
            class119[][] var13 = class345.field5367[var12];
            for (int var14 = class64.field800; var14 < class175.field2404; var14++) {
                for (int var15 = class16.field202; var15 < class3.field20; var15++) {
                    class119 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class15.field170[var14 + class255.field3728 - class116.field1507][var15 + class255.field3728 - class288.field4178] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field1574 = true;
                            var16.field1548 = true;
                            if (var16.field1563 > 0) {
                                var16.field1555 = true;
                            } else {
                                var16.field1555 = false;
                            }
                            class223.field3212++;
                        } else {
                            var16.field1574 = false;
                            var16.field1548 = false;
                            var16.field1557 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1552 != null) {
                                    class231 var17 = var16.field1552;
                                    var17.field3309.method573(0, var12, var17.field3310, var17.field3306, var17.field3304);
                                    if (var17.field3305 != null) {
                                        var17.field3305.method573(0, var12, var17.field3310, var17.field3306, var17.field3304);
                                    }
                                }
                                if (var16.field1566 != null) {
                                    class66 var18 = var16.field1566;
                                    var18.field848.method573(var18.field843, var12, var18.field839, var18.field838, var18.field836);
                                    if (var18.field845 != null) {
                                        var18.field845.method573(var18.field843, var12, var18.field839, var18.field838, var18.field836);
                                    }
                                }
                                if (var16.field1577 != null) {
                                    class24 var19 = var16.field1577;
                                    var19.field269.method573(0, var12, var19.field273, var19.field272, var19.field271);
                                }
                                if (var16.field1549 != null) {
                                    for (int var20 = 0; var20 < var16.field1563; var20++) {
                                        class294 var21 = var16.field1549[var20];
                                        var21.field4275.method573(var21.field4272, var12, var21.field4282, var21.field4280, var21.field4288);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class74.field978 == class161.field2296;
        if (class47.field623) {
            GL var23 = class47.field592;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class194.method1403();
                class255.method1781(3, -1, -102);
                class321.field4723 = true;
                class111.method788();
                class118.field1542 = -1;
                class261.field3783 = -1;
                for (int var24 = 0; var24 < class240.field3491[0].length; var24++) {
                    class70 var25 = class240.field3491[0][var24];
                    float var26 = 251.5F - (var25.field909 ? 1.0F : 0.5F);
                    if (class118.field1542 != var25.field898) {
                        class118.field1542 = var25.field898;
                        class233.method1659(var25.field898, 65535);
                        class41.method291(class91.method657(72));
                    }
                    var25.method515(class345.field5367, var26, false);
                }
                class111.method786();
            } else {
                int var27 = class124.field1653;
                while (true) {
                    if (var27 >= class23.field258) {
                        class22.method141(class116.field1507, class288.field4178, class345.field5367);
                        break;
                    }
                    for (int var28 = 0; var28 < class240.field3491[var27].length; var28++) {
                        class70 var29 = class240.field3491[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field909 ? 1.0F : 0.5F);
                        if (var29.field913 != -1 && class328.method2271(class350.field5467.method905(var29.field913, 255), (byte) -106) && class177.field2436) {
                            class233.method1659(var29.field898, 65535);
                        }
                        var29.method515(class345.field5367, var30, false);
                    }
                    if (var27 == 0 && class89.field1119 > 0) {
                        class47.method370(101.5F);
                        class151.method1165(class116.field1507, class288.field4178, class255.field3728, arg1, class15.field170, class74.field978[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class124.field1653; var31 < class23.field258; var31++) {
            class119[][] var32 = class345.field5367[var31];
            for (int var33 = -class255.field3728; var33 <= 0; var33++) {
                int var34 = class116.field1507 + var33;
                int var35 = class116.field1507 - var33;
                if (var34 >= class64.field800 || var35 < class175.field2404) {
                    for (int var36 = -class255.field3728; var36 <= 0; var36++) {
                        int var37 = class288.field4178 + var36;
                        int var38 = class288.field4178 - var36;
                        if (var34 >= class64.field800) {
                            if (var37 >= class16.field202) {
                                class119 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1574) {
                                    class25.method169(var39, true);
                                }
                            }
                            if (var38 < class3.field20) {
                                class119 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1574) {
                                    class25.method169(var40, true);
                                }
                            }
                        }
                        if (var35 < class175.field2404) {
                            if (var37 >= class16.field202) {
                                class119 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1574) {
                                    class25.method169(var41, true);
                                }
                            }
                            if (var38 < class3.field20) {
                                class119 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1574) {
                                    class25.method169(var42, true);
                                }
                            }
                        }
                        if (class223.field3212 == 0) {
                            if (!var22) {
                                class95.field1242 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class124.field1653; var43 < class23.field258; var43++) {
            class119[][] var44 = class345.field5367[var43];
            for (int var45 = -class255.field3728; var45 <= 0; var45++) {
                int var46 = class116.field1507 + var45;
                int var47 = class116.field1507 - var45;
                if (var46 >= class64.field800 || var47 < class175.field2404) {
                    for (int var48 = -class255.field3728; var48 <= 0; var48++) {
                        int var49 = class288.field4178 + var48;
                        int var50 = class288.field4178 - var48;
                        if (var46 >= class64.field800) {
                            if (var49 >= class16.field202) {
                                class119 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1574) {
                                    class25.method169(var51, false);
                                }
                            }
                            if (var50 < class3.field20) {
                                class119 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1574) {
                                    class25.method169(var52, false);
                                }
                            }
                        }
                        if (var47 < class175.field2404) {
                            if (var49 >= class16.field202) {
                                class119 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1574) {
                                    class25.method169(var53, false);
                                }
                            }
                            if (var50 < class3.field20) {
                                class119 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1574) {
                                    class25.method169(var54, false);
                                }
                            }
                        }
                        if (class223.field3212 == 0) {
                            if (!var22) {
                                class95.field1242 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class95.field1242 = false;
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(B)V", line = 387)
    public static final void method2126(byte arg0) {
        class152.method1173(5, (byte) -23);
        field4452++;
        class313.method2167(5, true);
        class212.method1554(5, 3);
        class142.method1105(23, 5);
        class347.method2411(5, 3);
        class319.method2202(5, -128);
        class84.method617(5, (byte) -86);
        class264.method1817(arg0 ^ 0x15, 5);
        class133.method1017(5, (byte) -123);
        class247.method1733((byte) 125, 5);
        class142.method1095((byte) 126, 5);
        class100.method715((byte) 114, 5);
        class232.method1652(true, 5);
        class194.method1401(5, -79);
        class326.method2254(5, arg0 + 55);
        class341.method2370(5, arg0 ^ 0xFFFFFFE8);
        class333.method2323(5, 69);
        class167.method1245(-99, 5);
        if (arg0 != 23) {
            field4453 = -94;
        }
        class284.method1931(false, 50);
        class17.method123(2260, 5);
        class216.method1569(arg0 - 24, 5);
        class224.field3232.method2264((byte) -75, 5);
        class159.field2258.method2264((byte) -124, 5);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lfd;BI)V", line = 420)
    private final void method2127(class299 arg0, byte arg1, int arg2) {
        field4443++;
        if (arg2 == 249) {
            int var4 = arg0.method2096((byte) -122);
            if (this.field4446 == null) {
                int var5 = class262.method1805(var4, (byte) -44);
                this.field4446 = new class329(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method2096((byte) -122) == 1;
                int var8 = arg0.method2085((byte) 119);
                class26 var9;
                if (var7) {
                    var9 = new class29(arg0.method2060(-12482));
                } else {
                    var9 = new class7(arg0.method2062(-25795));
                }
                this.field4446.method2275(var9, 88, (long) var8);
            }
        }
        if (arg1 < 122) {
            field4451 = 3;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)I", line = 467)
    public final int method2128(int arg0, int arg1, int arg2) {
        field4445++;
        if (this.field4446 == null) {
            return arg0;
        }
        class7 var4 = (class7) this.field4446.method2279((long) arg1, arg2 + 17005);
        if (arg2 == -16959) {
            return var4 == null ? arg0 : var4.field67;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lfd;I)V", line = 495)
    public final void method2129(class299 arg0, int arg1) {
        field4449++;
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method2127((class299) null, (byte) -85, 16);
                }
                return;
            }
            this.method2127(arg0, (byte) 127, var3);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIB)I", line = 516)
    public static final int method2130(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        field4444++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg3 != 24) {
            field4450 = (class333) null;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZB)V", line = 545)
    public static final void method2131(boolean arg0, byte arg1) {
        if (arg1 != -15) {
            method2124(41);
        }
        class218.field3076 = new int[104];
        class247.field3602 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class299.field4396 = new int[104];
        class55.field710 = new byte[var2][104][104];
        class178.field2439 = new byte[var2][104][104];
        class29.field329 = new int[104];
        class169.field2356 = new byte[var2][105][105];
        field4448++;
        class270.field3880 = new int[104];
        class263.field3827 = new byte[var2][104][104];
        class195.field2692 = new int[var2][105][105];
        class352.field5500 = new byte[var2][104][104];
        class177.field2428 = new int[104];
        class83.field1070 = new int[5];
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 575)
    public final String method2132(String arg0, int arg1, byte arg2) {
        field4447++;
        if (arg2 >= -105) {
            field4450 = (class333) null;
        }
        if (this.field4446 == null) {
            return arg0;
        } else {
            class29 var4 = (class29) this.field4446.method2279((long) arg1, -122);
            return var4 == null ? arg0 : var4.field332;
        }
    }
}
