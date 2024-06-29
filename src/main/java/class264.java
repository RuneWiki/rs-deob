import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class264 extends class89 {

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lud;")
    public static class27 field3328 = new class27(14, 0, 4, 1);

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Ldq;")
    public static class493 field3329 = new class493(54, 12);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    public static int[] field3331 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Ll;")
    public static class16 field3333;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lqn;")
    public static class47 field3330;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Ljv;")
    public static class56 field3332;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 9)
    public static void method1571(int arg0) {
        field3329 = null;
        field3330 = null;
        field3333 = null;
        field3328 = null;
        if (arg0 < 38) {
            method1571(-128);
        }
        field3331 = null;
        field3332 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z", line = 25)
    public static final boolean method1572(byte arg0) throws IOException {
        field3327++;
        if (class64.field835 == null) {
            return false;
        }
        int var1 = class64.field835.method2470((byte) 88);
        if (var1 == 0) {
            return false;
        }
        if (class85.field1068 == null) {
            if (class87.field1082) {
                var1--;
                class64.field835.method2472(-20555, 1, class513.field7443.field6618, 0);
                class87.field1082 = false;
                class525.field7764++;
            }
            class513.field7443.field6631 = 0;
            if (class513.field7443.method1197(32348)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class64.field835.method2472(-20555, 1, class513.field7443.field6618, 1);
                class525.field7764++;
            }
            class87.field1082 = true;
            class493[] var2 = class73.method638(arg0 + 29402);
            int var3 = class513.field7443.method1194(true);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class513.field7443.field6631);
            }
            class85.field1068 = var2[var3];
            class312.field3986 = class85.field1068.field7176;
        }
        if (class312.field3986 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class64.field835.method2472(-20555, 1, class513.field7443.field6618, 0);
            class312.field3986 = class513.field7443.field6618[0] & 0xFF;
            class525.field7764++;
            var1--;
        }
        if (class312.field3986 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class64.field835.method2472(arg0 - 20470, 2, class513.field7443.field6618, 0);
            class513.field7443.field6631 = 0;
            class312.field3986 = class513.field7443.method2758((byte) 83);
            var1 -= 2;
            class525.field7764 += 2;
        }
        if (var1 < class312.field3986) {
            return false;
        }
        class513.field7443.field6631 = 0;
        class64.field835.method2472(arg0 - 20470, class312.field3986, class513.field7443.field6618, 0);
        class525.field7764 += class312.field3986;
        class525.field7765 = class301.field3870;
        class507.field7292 = 0;
        class301.field3870 = class181.field2394;
        class181.field2394 = class85.field1068;
        if (class85.field1068 == class447.field6399) {
            class24.method198(false, class12.field207);
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class63.field819) {
            int var4 = class513.field7443.method2781((byte) -122);
            int var5 = class513.field7443.method2766(-13706);
            int var6 = class513.field7443.method2772((byte) 123);
            if (class277.method1637(112, var6)) {
                class69.method614(var5, var4, (byte) -127);
            }
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class450.field6442) {
            class380.method2159(16);
            class85.field1068 = null;
            return false;
        } else if (class85.field1068 == class328.field4141) {
            String var7 = class513.field7443.method2768((byte) 56);
            String var8 = class163.method1051(class334.method1932(class513.field7443, 28462), 21670);
            class443.method2616(var7, var8, 0, false, var7, 6);
            class85.field1068 = null;
            return true;
        } else if (client.field2566 == class85.field1068) {
            class24.method198(false, class390.field5242);
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class115.field1549) {
            class83.field1051 = class312.field3986 > 2 ? class513.field7443.method2768((byte) -113) : class189.field2467.method1936(-26539, class11.field177);
            class507.field7305 = class312.field3986 > 0 ? class513.field7443.method2758((byte) 77) : -1;
            class85.field1068 = null;
            if (class507.field7305 == 65535) {
                class507.field7305 = -1;
            }
            return true;
        } else if (class85.field1068 == class506.field7286) {
            int var9 = class513.field7443.method2758((byte) 80);
            String var10 = class513.field7443.method2768((byte) -56);
            Object[] var11 = new Object[var10.length() + 1];
            for (int var12 = var10.length() - 1; var12 >= 0; var12--) {
                if (var10.charAt(var12) == 's') {
                    var11[var12 + 1] = class513.field7443.method2768((byte) -88);
                } else {
                    var11[var12 + 1] = Integer.valueOf(class513.field7443.method2727(-87));
                }
            }
            var11[0] = Integer.valueOf(class513.field7443.method2727(-110));
            if (class277.method1637(51, var9)) {
                class170 var13 = new class170();
                var13.field2178 = var11;
                class239.method1444(var13);
            }
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class500.field7234) {
            class62.method570((byte) 90, false);
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == field3329) {
            int var14 = class513.field7443.method2737(false);
            int var15 = var14 >> 5;
            int var16 = var14 & 0x1F;
            if (var16 == 0) {
                class147.field1869[var15] = null;
                class85.field1068 = null;
                return true;
            }
            class277 var17 = new class277();
            var17.field3508 = var16;
            var17.field3506 = class513.field7443.method2737(false);
            if (var17.field3506 >= 0 && class293.field3739.length > var17.field3506) {
                if (var17.field3508 == 1 || var17.field3508 == 10) {
                    var17.field3511 = class513.field7443.method2758((byte) 106);
                    class513.field7443.field6631 += 6;
                } else if (var17.field3508 >= 2 && var17.field3508 <= 6) {
                    if (var17.field3508 == 2) {
                        var17.field3503 = 64;
                        var17.field3507 = 64;
                    }
                    if (var17.field3508 == 3) {
                        var17.field3507 = 0;
                        var17.field3503 = 64;
                    }
                    if (var17.field3508 == 4) {
                        var17.field3507 = 128;
                        var17.field3503 = 64;
                    }
                    if (var17.field3508 == 5) {
                        var17.field3507 = 64;
                        var17.field3503 = 0;
                    }
                    if (var17.field3508 == 6) {
                        var17.field3507 = 64;
                        var17.field3503 = 128;
                    }
                    var17.field3508 = 2;
                    var17.field3501 = class513.field7443.method2737(false);
                    var17.field3507 += class513.field7443.method2758((byte) 105) - class441.field6317 << 7;
                    var17.field3503 += class513.field7443.method2758((byte) 85) - class320.field4064 << 7;
                    var17.field3512 = class513.field7443.method2737(false) << 0;
                    var17.field3504 = class513.field7443.method2758((byte) 85);
                }
                var17.field3498 = class513.field7443.method2758((byte) 117);
                if (var17.field3498 == 65535) {
                    var17.field3498 = -1;
                }
                class147.field1869[var15] = var17;
            }
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class48.field614) {
            int var18 = class513.field7443.method2766(-13706);
            int var19 = class513.field7443.method2758((byte) 81);
            if (class277.method1637(arg0 ^ 0x30, var19)) {
                class26.method209((byte) 126, class66.field858, 0, 5, var18);
            }
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class11.field181) {
            String var20 = class513.field7443.method2768((byte) -60);
            int var21 = class513.field7443.method2775(arg0 - 4587);
            int var22 = class513.field7443.method2772((byte) 127);
            if (class277.method1637(-96, var21)) {
                class494.method2992((byte) 18, var22, var20);
            }
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class381.field5024) {
            byte var23 = class513.field7443.method2752(2);
            int var24 = class513.field7443.method2772((byte) 124);
            int var25 = class513.field7443.method2772((byte) 123);
            if (class277.method1637(109, var24)) {
                class379.method2150(-88, var25, var23);
            }
            class85.field1068 = null;
            return true;
        } else if (class85.field1068 == class523.field7628) {
            int var26 = class513.field7443.method2758((byte) 89);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class513.field7443.method2743(false);
            int var28 = class513.field7443.method2742((byte) -95);
            class84.method681(var26, var27, var28, -46);
            class85.field1068 = null;
            return true;
        } else {
            if (arg0 != -85) {
                method1571(-49);
            }
            if (class85.field1068 == class283.field3598) {
                int var29 = class513.field7443.method2761((byte) -128);
                int var30 = class513.field7443.method2742((byte) -104);
                int var31 = class513.field7443.method2786(255);
                if (var31 == 65535) {
                    var31 = -1;
                }
                class247.method1501(var29, var31, var30, (byte) -107);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class252.field3217) {
                String var32 = class513.field7443.method2768((byte) 87);
                boolean var33 = class513.field7443.method2737(false) == 1;
                String var34;
                if (var33) {
                    var34 = class513.field7443.method2768((byte) 68);
                } else {
                    var34 = var32;
                }
                int var35 = class513.field7443.method2758((byte) 84);
                byte var36 = class513.field7443.method2793(32767);
                boolean var37 = false;
                if (var36 == -128) {
                    var37 = true;
                }
                if (var37) {
                    if (class339.field4255 == 0) {
                        class85.field1068 = null;
                        return true;
                    }
                    boolean var43 = false;
                    int var44;
                    for (var44 = 0; var44 < class339.field4255 && (!class313.field3994[var44].field5005.equals(var34) || class313.field3994[var44].field5002 != var35); var44++) {
                    }
                    if (class339.field4255 > var44) {
                        while (var44 < (class339.field4255 - 1)) {
                            class313.field3994[var44] = class313.field3994[var44 + 1];
                            var44++;
                        }
                        class339.field4255--;
                        class313.field3994[class339.field4255] = null;
                    }
                } else {
                    String var38 = class513.field7443.method2768((byte) -118);
                    class380 var39 = new class380();
                    var39.field5000 = var32;
                    var39.field5005 = var34;
                    var39.field5008 = class465.method2803(var39.field5005, (byte) 92);
                    var39.field5010 = var38;
                    var39.field5002 = var35;
                    var39.field5007 = var36;
                    int var40;
                    for (var40 = class339.field4255 - 1; var40 >= 0; var40--) {
                        int var41 = class313.field3994[var40].field5008.compareTo(var39.field5008);
                        if (var41 == 0) {
                            class313.field3994[var40].field5002 = var35;
                            class313.field3994[var40].field5007 = var36;
                            class313.field3994[var40].field5010 = var38;
                            if (var34.equals(class23.field336.field2852)) {
                                class342.field4309 = var36;
                            }
                            class510.field7368 = class160.field2037;
                            class85.field1068 = null;
                            return true;
                        }
                        if (var41 < 0) {
                            break;
                        }
                    }
                    if (class313.field3994.length <= class339.field4255) {
                        class85.field1068 = null;
                        return true;
                    }
                    for (int var42 = class339.field4255 - 1; var42 > var40; var42--) {
                        class313.field3994[var42 + 1] = class313.field3994[var42];
                    }
                    if (class339.field4255 == 0) {
                        class313.field3994 = new class380[100];
                    }
                    class313.field3994[var40 + 1] = var39;
                    class339.field4255++;
                    if (var34.equals(class23.field336.field2852)) {
                        class342.field4309 = var36;
                    }
                }
                class510.field7368 = class160.field2037;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class181.field2391) {
                int var45 = class513.field7443.method2737(false);
                int var46 = var45 >> 2;
                int var47 = var45 & 0x3;
                int var48 = class461.field6590[var46];
                int var49 = class513.field7443.method2766(-13706);
                int var50 = (var49 & 0x3C6B8B62) >> 28;
                int var51 = var49 >> 14 & 0x3FFF;
                int var52 = var49 & 0x3FFF;
                int var53 = class513.field7443.method2772((byte) 125);
                int var54 = var51 - class441.field6317;
                int var55 = var52 - class320.field4064;
                if (var53 == 65535) {
                    var53 = -1;
                }
                class76.method665(var54, var47, var50, (byte) -45, var53, var48, var55, var46);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class523.field7693) {
                class24.method198(false, class468.field6770);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class368.field4769) {
                class10.field163 = class513.field7443.method2743(false);
                class283.field3601 = class513.field7443.method2752(2) << 3;
                class447.field6401 = class513.field7443.method2752(2) << 3;
                for (class91 var56 = (class91) class201.field2614.method2021(114); var56 != null; var56 = (class91) class201.field2614.method2017(arg0 ^ 0x3B)) {
                    int var58 = (int) (var56.field5043 & 0x3FFFL);
                    int var59 = (int) (var56.field5043 >> 14 & 0x3FFFL);
                    int var60 = (int) (var56.field5043 >> 28 & 0x3L);
                    if (class10.field163 == var60 && var58 >= class283.field3601 && class283.field3601 + 8 > var58 && var59 >= class447.field6401 && var59 < (class447.field6401 + 8)) {
                        var56.method2165(arg0 ^ 0xFFFFC0CA);
                        class33.method244((byte) 58, var58, class10.field163, var59);
                    }
                }
                for (class495 var57 = (class495) class223.field2817.method153(0); var57 != null; var57 = (class495) class223.field2817.method161(arg0 ^ 0x16)) {
                    if (var57.field7193 >= class283.field3601 && var57.field7193 < class283.field3601 + 8 && class447.field6401 <= var57.field7186 && (class447.field6401 + 8) > var57.field7186 && class10.field163 == var57.field7192) {
                        var57.field7187 = 0;
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class314.field4008) {
                int var61 = class513.field7443.method2758((byte) 108);
                if (class277.method1637(arg0 ^ 0x26, var61)) {
                    class431.method2522(22876);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class106.field1345) {
                class208.field2694 = 1;
                class85.field1068 = null;
                class72.field932 = class160.field2037;
                return true;
            } else if (class85.field1068 == class372.field4833) {
                class354.field4554 = class513.field7443.method2737(false);
                class85.field1068 = null;
                class106.field1342 = class160.field2037;
                return true;
            } else if (class85.field1068 == class219.field2791) {
                int var62 = class513.field7443.method2786(255);
                int var63 = class513.field7443.method2728((byte) -106);
                int var64 = class513.field7443.method2758((byte) 118);
                if (class277.method1637(-116, var62)) {
                    class492.method2983(var63, var64, -4007);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class102.field1269) {
                for (int var65 = 0; var65 < class387.field5107.length; var65++) {
                    if (class387.field5107[var65] != null) {
                        class387.field5107[var65].field4859 = -1;
                    }
                }
                for (int var66 = 0; var66 < class187.field2446.length; var66++) {
                    if (class187.field2446[var66] != null) {
                        class187.field2446[var66].field4859 = -1;
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class479.field7011) {
                String var67 = class513.field7443.method2768((byte) 47);
                int var68 = class513.field7443.method2742((byte) -115);
                int var69 = class513.field7443.method2776((byte) -27);
                int var70 = class513.field7443.method2775(arg0 - 4587);
                if (var70 == 65535) {
                    var70 = -1;
                }
                if (var69 >= 1 && var69 <= 8) {
                    if (var67.equalsIgnoreCase("null")) {
                        var67 = null;
                    }
                    class339.field4257[var69 - 1] = var67;
                    class123.field1654[var69 - 1] = var70;
                    class155.field1971[var69 - 1] = var68 == 0;
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class159.field2020) {
                int var71 = class513.field7443.method2775(-4672);
                String var72 = class513.field7443.method2768((byte) 92);
                int var73 = class513.field7443.method2772((byte) 124);
                if (class277.method1637(arg0 ^ 0x2, var73)) {
                    class494.method2992((byte) 104, var71, var72);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class320.field4061) {
                int var74 = class513.field7443.method2772((byte) 127);
                int var75 = class513.field7443.method2786(arg0 ^ 0xFFFFFF54);
                int var76 = class513.field7443.method2758((byte) 81);
                int var77 = class513.field7443.method2786(255);
                int var78 = class513.field7443.method2727(-92);
                if (class277.method1637(-93, var77)) {
                    class26.method209((byte) 127, var74 << 16 | var75, var76, 7, var78);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class197.field2552) {
                int var79 = class513.field7443.method2737(false);
                int var80 = class513.field7443.method2772((byte) 127);
                int var81 = class513.field7443.method2728((byte) -116);
                if (class277.method1637(30, var80)) {
                    class310.method1812(var81, var79, 122);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class140.field1799) {
                int var82 = class513.field7443.method2776((byte) -27);
                int var83 = class513.field7443.method2776((byte) -27);
                if (var82 == 255) {
                    var82 = -1;
                    var83 = -1;
                }
                class25.method207(var82, var83, arg0 ^ 0xFFFFFFAB);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class346.field4451) {
                class24.method198(false, class412.field5880);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class33.field412) {
                int var84 = class513.field7443.method2763(-514944944);
                int var85 = class513.field7443.method2727(arg0 ^ 0x3A);
                int var86 = class513.field7443.method2737(false);
                String var87 = "";
                String var88 = var87;
                if ((var86 & 0x1) != 0) {
                    var87 = class513.field7443.method2768((byte) -61);
                    if ((var86 & 0x2) == 0) {
                        var88 = var87;
                    } else {
                        var88 = class513.field7443.method2768((byte) -46);
                    }
                }
                String var89 = class513.field7443.method2768((byte) 118);
                if (var84 == 99) {
                    class306.method1794(var89, arg0 ^ 0x54);
                } else if (var88.equals("") || !class530.method3144(-95, var88)) {
                    class443.method2616(var88, var89, var85, false, var87, var84);
                } else {
                    class85.field1068 = null;
                    return true;
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class473.field6850) {
                int var90 = class513.field7443.method2772((byte) 127);
                int var91 = class513.field7443.method2772((byte) 125);
                int var92 = class513.field7443.method2737(false);
                if (class277.method1637(arg0 - 32, var91)) {
                    if (var92 == 2) {
                        class463.method2792(false);
                    }
                    class277.field3510 = var90;
                    class262.method1569((byte) 35, var90);
                    class161.method1039(false, 80);
                    class239.method1438(class277.field3510);
                    for (int var93 = 0; var93 < 100; var93++) {
                        class229.field2928[var93] = true;
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class143.field1841) {
                int var94 = class513.field7443.method2737(false);
                boolean var95 = (var94 & 0x1) == 1;
                String var96 = class513.field7443.method2768((byte) -107);
                String var97 = class513.field7443.method2768((byte) -112);
                if (var97.equals("")) {
                    var97 = var96;
                }
                String var98 = class513.field7443.method2768((byte) -117);
                String var99 = class513.field7443.method2768((byte) -119);
                if (var99.equals("")) {
                    var99 = var98;
                }
                if (var95) {
                    for (int var100 = 0; var100 < class498.field7223; var100++) {
                        if (class113.field1520[var100].equals(var99)) {
                            class385.field5063[var100] = var96;
                            class113.field1520[var100] = var97;
                            class281.field3580[var100] = var98;
                            class380.field5004[var100] = var99;
                            break;
                        }
                    }
                } else {
                    class385.field5063[class498.field7223] = var96;
                    class113.field1520[class498.field7223] = var97;
                    class281.field3580[class498.field7223] = var98;
                    class380.field5004[class498.field7223] = var99;
                    class28.field395[class498.field7223] = class378.method2145(var94, 2) == 2;
                    class498.field7223++;
                }
                class72.field932 = class160.field2037;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class11.field203) {
                int var101 = class513.field7443.method2746((byte) 38);
                int var102 = class513.field7443.method2775(-4672);
                int var103 = class513.field7443.method2758((byte) 122);
                if (class277.method1637(126, var103)) {
                    class404.method2392(var101, var102, 124);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class145.field1857) {
                int var104 = class513.field7443.method2758((byte) 81);
                int var105 = class513.field7443.method2758((byte) 80);
                int var106 = class513.field7443.method2758((byte) 85);
                int var107 = class513.field7443.method2758((byte) 87);
                if (class277.method1637(-106, var104) && class293.field3725[var105] != null) {
                    for (int var108 = var106; var108 < var107; var108++) {
                        int var109 = class513.field7443.method2738(-44);
                        if (var108 < class293.field3725[var105].length && class293.field3725[var105][var108] != null) {
                            class293.field3725[var105][var108].field7695 = var109;
                        }
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class227.field2892) {
                boolean var110 = class513.field7443.method2737(false) == 1;
                String var111 = class513.field7443.method2768((byte) 52);
                String var112 = var111;
                if (var110) {
                    var112 = class513.field7443.method2768((byte) 99);
                }
                int var113 = class513.field7443.method2737(false);
                boolean var114 = false;
                if (var113 <= 1) {
                    if (!(!class293.field3726 || class284.field3608) || class122.field1641) {
                        var114 = true;
                    } else if (var113 <= 1 && class530.method3144(arg0 ^ 0x6, var112)) {
                        var114 = true;
                    }
                }
                if (!var114 && class25.field358 == 0) {
                    String var115 = class163.method1051(class334.method1932(class513.field7443, arg0 ^ 0xFFFF9085), arg0 ^ 0xFFFFAB0D);
                    if (var113 == 2) {
                        class515.method3076(null, "<img=1>" + var111, "<img=1>" + var112, -1, var115, 0, (byte) -68, 24);
                    } else if (var113 == 1) {
                        class515.method3076(null, "<img=0>" + var111, "<img=0>" + var112, -1, var115, 0, (byte) -44, 24);
                    } else {
                        class515.method3076(null, var111, var112, -1, var115, 0, (byte) -59, 24);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class228.field2919) {
                String var116 = class513.field7443.method2768((byte) -51);
                int var117 = class513.field7443.method2758((byte) 92);
                String var118 = class176.field2307.method847(var117, 32768).method1555(class513.field7443, -39);
                class515.method3076(null, var116, var116, var117, var118, 0, (byte) -50, 19);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class405.field5792) {
                class25.method206(arg0 ^ 0xFFFFFFE3);
                class85.field1068 = null;
                return false;
            } else if (class85.field1068 == class84.field1054) {
                int var119 = class513.field7443.method2786(255);
                if (var119 == 65535) {
                    var119 = -1;
                }
                int var120 = class513.field7443.method2786(255);
                int var121 = class513.field7443.method2746((byte) 54);
                if (class277.method1637(-104, var120)) {
                    class237.method1425(16, var121, var119);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class490.field7136) {
                boolean var122 = class513.field7443.method2737(false) == 1;
                String var123 = class513.field7443.method2768((byte) 46);
                String var124 = var123;
                if (var122) {
                    var124 = class513.field7443.method2768((byte) 84);
                }
                long var125 = class513.field7443.method2754(arg0 + 6);
                long var127 = (long) class513.field7443.method2758((byte) 112);
                long var129 = (long) class513.field7443.method2738(-121);
                int var131 = class513.field7443.method2737(false);
                long var132 = (var127 << 32) + var129;
                boolean var134 = false;
                int var135 = 0;
                while (true) {
                    if (var135 >= 100) {
                        if (var131 <= 1) {
                            if (!(!class293.field3726 || class284.field3608) || class122.field1641) {
                                var134 = true;
                            } else if (class530.method3144(-89, var124)) {
                                var134 = true;
                            }
                        }
                        break;
                    }
                    if (class404.field5747[var135] == var132) {
                        var134 = true;
                        break;
                    }
                    var135++;
                }
                if (!var134 && class25.field358 == 0) {
                    class404.field5747[class24.field350] = var132;
                    class24.field350 = (class24.field350 + 1) % 100;
                    String var136 = class163.method1051(class334.method1932(class513.field7443, 28462), 21670);
                    if (var131 == 2 || var131 == 3) {
                        class515.method3076(class163.method1049(-93, var125), "<img=1>" + var123, "<img=1>" + var124, -1, var136, 0, (byte) -80, 9);
                    } else if (var131 == 1) {
                        class515.method3076(class163.method1049(-66, var125), "<img=0>" + var123, "<img=0>" + var124, -1, var136, 0, (byte) -59, 9);
                    } else {
                        class515.method3076(class163.method1049(-120, var125), var123, var124, -1, var136, 0, (byte) -89, 9);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class385.field5062) {
                class513.field7443.field6631 += 28;
                if (class513.field7443.method2784(4)) {
                    class429.method2515(class513.field7443, class513.field7443.field6631 - 28, 1);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class534.field7858) {
                class426.field6059 = class513.field7443.method2791(true);
                class106.field1342 = class160.field2037;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class76.field983) {
                boolean var137 = class513.field7443.method2737(false) == 1;
                String var138 = class513.field7443.method2768((byte) -42);
                String var139 = var138;
                if (var137) {
                    var139 = class513.field7443.method2768((byte) 44);
                }
                long var140 = class513.field7443.method2754(-109);
                long var142 = (long) class513.field7443.method2758((byte) 78);
                long var144 = (long) class513.field7443.method2738(arg0 - 42);
                int var146 = class513.field7443.method2737(false);
                int var147 = class513.field7443.method2758((byte) 121);
                long var148 = (var142 << 32) + var144;
                boolean var150 = false;
                int var151 = 0;
                while (true) {
                    if (var151 >= 100) {
                        if (var146 <= 1 && class530.method3144(arg0 ^ 0x18, var139)) {
                            var150 = true;
                        }
                        break;
                    }
                    if (class404.field5747[var151] == var148) {
                        var150 = true;
                        break;
                    }
                    var151++;
                }
                if (!var150 && class25.field358 == 0) {
                    class404.field5747[class24.field350] = var148;
                    class24.field350 = (class24.field350 + 1) % 100;
                    String var152 = class176.field2307.method847(var147, 32768).method1555(class513.field7443, -102);
                    if (var146 == 2) {
                        class515.method3076(class163.method1049(-59, var140), "<img=1>" + var138, "<img=1>" + var139, var147, var152, 0, (byte) -87, 20);
                    } else if (var146 == 1) {
                        class515.method3076(class163.method1049(-37, var140), "<img=0>" + var138, "<img=0>" + var139, var147, var152, 0, (byte) -98, 20);
                    } else {
                        class515.method3076(class163.method1049(-68, var140), var138, var139, var147, var152, 0, (byte) -50, 20);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class28.field394) {
                class24.method198(false, class222.field2800);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class296.field3804) {
                int var153 = class513.field7443.method2737(false);
                if (class513.field7443.method2737(false) == 0) {
                    class352.field4518[var153] = new class166();
                } else {
                    class513.field7443.field6631--;
                    class352.field4518[var153] = new class166(class513.field7443);
                }
                class85.field1068 = null;
                class97.field1188 = class160.field2037;
                return true;
            } else if (class85.field1068 == class24.field348) {
                int var154 = class513.field7443.method2728((byte) -111);
                int var155 = class513.field7443.method2772((byte) 122);
                if (class277.method1637(125, var155)) {
                    class26.method209((byte) 126, -1, -1, 3, var154);
                }
                class85.field1068 = null;
                return true;
            } else if (class92.field1123 == class85.field1068) {
                int var156 = class513.field7443.method2728((byte) -99);
                int var157 = class513.field7443.method2775(-4672);
                if (var157 == 65535) {
                    var157 = -1;
                }
                int var158 = class513.field7443.method2772((byte) 125);
                int var159 = class513.field7443.method2728((byte) -88);
                if (class277.method1637(33, var158)) {
                    class256.method1531(var156, var159, var157, (byte) -1);
                    class9 var160 = class376.field4949.method624((byte) -128, var157);
                    class200.method1259(var160.field160, var160.field155, -5783, var159, var160.field112);
                    class208.method1291((byte) 49, var160.field84, var159, var160.field124, var160.field125);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class141.field1830) {
                int var161 = class513.field7443.method2728((byte) -121);
                int var162 = class513.field7443.method2772((byte) 123);
                class491.field7160.method2808(false, var162, var161);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class187.field2447) {
                class187.method1172(class312.field3986, class513.field7443, 0);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class288.field3676) {
                class24.method198(false, class226.field2877);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class80.field1028) {
                int var163 = class513.field7443.method2728((byte) -97);
                int var164 = class513.field7443.method2786(255);
                int var165 = class513.field7443.method2772((byte) 127);
                if (var165 == 65535) {
                    var165 = -1;
                }
                if (class277.method1637(arg0 + 122, var164)) {
                    class26.method209((byte) 127, var165, -1, 2, var163);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class226.field2876) {
                class129.method912((byte) -63);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class411.field5862) {
                class24.method198(false, class522.field7560);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class129.field1709) {
                class24.method198(false, class59.field770);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class179.field2363) {
                int var166 = class513.field7443.method2775(-4672);
                int var167 = class513.field7443.method2742((byte) -97);
                boolean var168 = (var167 & 0x1) == 1;
                class100.method754(var168, var166, 29);
                class415.field5918[class378.method2145(class205.field2682++, 31)] = var166;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class446.field6397) {
                class308.field3931 = class513.field7443.method2743(false);
                class430.field6107 = class513.field7443.method2737(false);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class353.field4540) {
                class491.field7160.method2802((byte) 109);
                class99.field1200 += 32;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class368.field4768) {
                class283.field3601 = class513.field7443.method2752(2) << 3;
                class447.field6401 = class513.field7443.method2752(arg0 ^ 0xFFFFFFA9) << 3;
                class10.field163 = class513.field7443.method2742((byte) -117);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class340.field4275) {
                class24.method198(false, class5.field49);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class364.field4733) {
                int var169 = class513.field7443.method2727(-120);
                int var170 = class513.field7443.method2758((byte) 106);
                int var171 = class513.field7443.method2737(false);
                int var172 = class513.field7443.method2758((byte) 109);
                if (class277.method1637(120, var170)) {
                    class175 var173 = (class175) class397.field5684.method2022(-1, (long) var169);
                    if (var173 != null) {
                        class290.method1706(var173, 111, var173.field2279 != var172, false);
                    }
                    class534.method3159(false, arg0 + 16469, var172, var169, var171);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class513.field7441) {
                int var174 = class513.field7443.method2775(-4672);
                int var175 = class513.field7443.method2786(255);
                int var176 = class513.field7443.method2737(false);
                int var177 = class513.field7443.method2727(arg0 ^ 0x18);
                int var178 = class513.field7443.method2772((byte) 127);
                boolean var179 = (var176 & 0x80) != 0;
                if (var177 >> 30 != 0) {
                    int var180 = (var177 & 0x37E99F03) >> 28;
                    int var181 = (var177 >> 14 & 0x3FFF) - class441.field6317;
                    int var182 = (var177 & 0x3FFF) - class320.field4064;
                    if (var181 >= 0 && var182 >= 0 && var181 < class452.field6526 && var182 < class440.field6307) {
                        int var183 = var181 * 128 + 64;
                        int var184 = var182 * 128 + 64;
                        int var185 = var180;
                        if (var180 < 3 && class256.method1538(arg0 + 87, var181, var182)) {
                            var185 = var180 + 1;
                        }
                        class97 var186 = new class97(var175, 0, class163.field2065, var180, var185, var183, class151.method991(var184, false, var180, var183) - var174, var184, var181, var181, var182, var182, var176);
                        class418.field5939.method163(new class79(var186), 0);
                    }
                } else if ((var177 >> 29) != 0) {
                    int var187 = var177 & 0xFFFF;
                    class295 var188 = class187.field2446[var187];
                    if (var188 != null) {
                        if (var175 == 65535) {
                            var175 = -1;
                        }
                        boolean var189 = true;
                        int var190 = var179 ? var188.field4906 : var188.field4886;
                        if (var175 != -1 && var190 != -1) {
                            if (var175 == var190) {
                                class466 var191 = class120.field1624.method1836(10, var175);
                                if (var191.field6722 && var191.field6746 != -1) {
                                    class415 var192 = class404.field5756.method557(var191.field6746, 15);
                                    int var193 = var192.field5931;
                                    if (var193 == 0 || var193 == 2) {
                                        var189 = false;
                                    } else if (var193 == 1) {
                                        var189 = true;
                                    }
                                }
                            } else {
                                class466 var194 = class120.field1624.method1836(arg0 ^ 0x78, var175);
                                class466 var195 = class120.field1624.method1836(118, var190);
                                if (var194.field6746 != -1 && var195.field6746 != -1) {
                                    class415 var196 = class404.field5756.method557(var194.field6746, arg0 ^ 0xFFFFFFA4);
                                    class415 var197 = class404.field5756.method557(var195.field6746, arg0 + 100);
                                    if (var196.field5913 < var197.field5913) {
                                        var189 = false;
                                    }
                                }
                            }
                        }
                        if (var189) {
                            if (var179) {
                                var188.field4899 = var174;
                                var188.field4892 = class163.field2065 + var178;
                                var188.field4875 = 0;
                                var188.field4854 = 1;
                                var188.field4883 = 0;
                                var188.field4882 = var176 & 0x7;
                                var188.field4906 = var175;
                                if (class163.field2065 < var188.field4892) {
                                    var188.field4883 = -1;
                                }
                                if (var188.field4906 != -1 && class163.field2065 == var188.field4892) {
                                    int var198 = class120.field1624.method1836(arg0 - 32, var188.field4906).field6746;
                                    if (var198 != -1) {
                                        class415 var199 = class404.field5756.method557(var198, 15);
                                        if (var199 != null && var199.field5927 != null) {
                                            class334.method1931(var188.field2666, (byte) 106, var199, var188.field2676, false, 0, var188.field2677);
                                        }
                                    }
                                }
                            } else {
                                var188.field4885 = 1;
                                var188.field4928 = 0;
                                var188.field4886 = var175;
                                var188.field4878 = var174;
                                var188.field4912 = class163.field2065 + var178;
                                var188.field4861 = 0;
                                var188.field4905 = var176 & 0x7;
                                if (class163.field2065 < var188.field4912) {
                                    var188.field4861 = -1;
                                }
                                if (var188.field4886 != -1 && class163.field2065 == var188.field4912) {
                                    int var200 = class120.field1624.method1836(-89, var188.field4886).field6746;
                                    if (var200 != -1) {
                                        class415 var201 = class404.field5756.method557(var200, 15);
                                        if (var201 != null && var201.field5927 != null) {
                                            class334.method1931(var188.field2666, (byte) 105, var201, var188.field2676, false, 0, var188.field2677);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ((var177 >> 28) != 0) {
                    int var202 = var177 & 0xFFFF;
                    class223 var203;
                    if (class66.field858 == var202) {
                        var203 = class23.field336;
                    } else {
                        var203 = class387.field5107[var202];
                    }
                    if (var203 != null) {
                        if (var175 == 65535) {
                            var175 = -1;
                        }
                        boolean var204 = true;
                        int var205 = var179 ? var203.field4906 : var203.field4886;
                        if (var175 != -1 && var205 != -1) {
                            if (var175 == var205) {
                                class466 var210 = class120.field1624.method1836(-44, var175);
                                if (var210.field6722 && var210.field6746 != -1) {
                                    class415 var211 = class404.field5756.method557(var210.field6746, 15);
                                    int var212 = var211.field5931;
                                    if (var212 == 0 || var212 == 2) {
                                        var204 = false;
                                    } else if (var212 == 1) {
                                        var204 = true;
                                    }
                                }
                            } else {
                                class466 var206 = class120.field1624.method1836(-1, var175);
                                class466 var207 = class120.field1624.method1836(-24, var205);
                                if (var206.field6746 != -1 && var207.field6746 != -1) {
                                    class415 var208 = class404.field5756.method557(var206.field6746, arg0 + 100);
                                    class415 var209 = class404.field5756.method557(var207.field6746, 15);
                                    if (var209.field5913 > var208.field5913) {
                                        var204 = false;
                                    }
                                }
                            }
                        }
                        if (var204) {
                            if (var179) {
                                var203.field4875 = 0;
                                var203.field4906 = var175;
                                var203.field4883 = 0;
                                var203.field4854 = 1;
                                var203.field4882 = var176 & 0x7;
                                var203.field4899 = var174;
                                var203.field4892 = class163.field2065 + var178;
                                if (var203.field4892 > class163.field2065) {
                                    var203.field4883 = -1;
                                }
                                if (var203.field4906 == 65535) {
                                    var203.field4906 = -1;
                                }
                                if (var203.field4906 != -1 && class163.field2065 == var203.field4892) {
                                    int var213 = class120.field1624.method1836(121, var203.field4906).field6746;
                                    if (var213 != -1) {
                                        class415 var214 = class404.field5756.method557(var213, 15);
                                        if (var214 != null && var214.field5927 != null) {
                                            class334.method1931(var203.field2666, (byte) 102, var214, var203.field2676, class23.field336 == var203, 0, var203.field2677);
                                        }
                                    }
                                }
                            } else {
                                var203.field4928 = 0;
                                var203.field4886 = var175;
                                var203.field4885 = 1;
                                var203.field4912 = class163.field2065 + var178;
                                var203.field4905 = var176 & 0x7;
                                var203.field4861 = 0;
                                var203.field4878 = var174;
                                if (var203.field4912 > class163.field2065) {
                                    var203.field4861 = -1;
                                }
                                if (var203.field4886 == 65535) {
                                    var203.field4886 = -1;
                                }
                                if (var203.field4886 != -1 && class163.field2065 == var203.field4912) {
                                    int var215 = class120.field1624.method1836(122, var203.field4886).field6746;
                                    if (var215 != -1) {
                                        class415 var216 = class404.field5756.method557(var215, 15);
                                        if (var216 != null && var216.field5927 != null) {
                                            class334.method1931(var203.field2666, (byte) 119, var216, var203.field2676, class23.field336 == var203, 0, var203.field2677);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class128.field1704) {
                int var217 = class513.field7443.method2758((byte) 124);
                int var218 = class513.field7443.method2737(false);
                int var219 = class513.field7443.method2737(false);
                int var220 = class513.field7443.method2737(false);
                int var221 = class513.field7443.method2737(false);
                int var222 = class513.field7443.method2758((byte) 119);
                if (class277.method1637(26, var217)) {
                    class229.field2926[var218] = true;
                    class377.field4962[var218] = var219;
                    class434.field6168[var218] = var220;
                    class529.field7798[var218] = var221;
                    class401.field5715[var218] = var222;
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class421.field5971) {
                class24.method198(false, class300.field3866);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class323.field4101) {
                int var223 = class513.field7443.method2786(arg0 + 340);
                int var224 = class513.field7443.method2776((byte) -27);
                class491.field7160.method2804(var224, true, var223);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class337.field4241) {
                class451.method2688(class513.field7443.method2768((byte) 45), true);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class46.field555) {
                int var225 = class513.field7443.method2728((byte) -116);
                int var226 = class513.field7443.method2728((byte) -96);
                int var227 = class513.field7443.method2775(-4672);
                if (class277.method1637(arg0 + 165, var227)) {
                    class175 var228 = (class175) class397.field5684.method2022(-1, (long) var226);
                    class175 var229 = (class175) class397.field5684.method2022(-1, (long) var225);
                    if (var229 != null) {
                        class290.method1706(var229, -41, var228 == null || var228.field2279 != var229.field2279, false);
                    }
                    if (var228 != null) {
                        var228.method2165(arg0 + 16310);
                        class397.field5684.method2019((byte) -98, var228, (long) var225);
                    }
                    class523 var230 = class310.method1810(var226, 1182823664);
                    if (var230 != null) {
                        class136.method935(var230, -127);
                    }
                    class523 var231 = class310.method1810(var225, 1182823664);
                    if (var231 != null) {
                        class136.method935(var231, -128);
                        class319.method1881(var231, arg0 ^ 0xFFFFFFD7, true);
                    }
                    if (class277.field3510 != -1) {
                        class186.method1166(class277.field3510, 1, (byte) 115);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class233.field2975) {
                class62.method570((byte) 76, true);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class33.field421) {
                class498.field7223 = class513.field7443.method2737(false);
                for (int var232 = 0; var232 < class498.field7223; var232++) {
                    class385.field5063[var232] = class513.field7443.method2768((byte) -120);
                    class113.field1520[var232] = class513.field7443.method2768((byte) 41);
                    if (class113.field1520[var232].equals("")) {
                        class113.field1520[var232] = class385.field5063[var232];
                    }
                    class281.field3580[var232] = class513.field7443.method2768((byte) -85);
                    class380.field5004[var232] = class513.field7443.method2768((byte) 48);
                    if (class380.field5004[var232].equals("")) {
                        class380.field5004[var232] = class281.field3580[var232];
                    }
                    class28.field395[var232] = false;
                }
                class85.field1068 = null;
                class72.field932 = class160.field2037;
                return true;
            } else if (class85.field1068 == class197.field2551) {
                int var233 = class513.field7443.method2775(-4672);
                int var234 = class513.field7443.method2772((byte) 125);
                int var235 = class513.field7443.method2786(arg0 ^ 0xFFFFFF54);
                if (class277.method1637(48, var233)) {
                    class189.method1183(0, var234, var235, 2);
                }
                class85.field1068 = null;
                return true;
            } else if (client.field2573 == class85.field1068) {
                int var236 = class513.field7443.method2758((byte) 84);
                if (var236 == 65535) {
                    var236 = -1;
                }
                int var237 = class513.field7443.method2737(false);
                int var238 = class513.field7443.method2758((byte) 78);
                int var239 = class513.field7443.method2737(false);
                class317.method1870(var236, var237, var238, var239, false);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class54.field715) {
                boolean var240 = class513.field7443.method2737(false) == 1;
                String var241 = class513.field7443.method2768((byte) -79);
                String var242 = var241;
                if (var240) {
                    var242 = class513.field7443.method2768((byte) -55);
                }
                long var243 = (long) class513.field7443.method2758((byte) 100);
                long var245 = (long) class513.field7443.method2738(arg0 - 19);
                int var247 = class513.field7443.method2737(false);
                int var248 = class513.field7443.method2758((byte) 89);
                long var249 = (var243 << 32) + var245;
                boolean var251 = false;
                int var252 = 0;
                while (true) {
                    if (var252 >= 100) {
                        if (var247 <= 1 && class530.method3144(-93, var242)) {
                            var251 = true;
                        }
                        break;
                    }
                    if (class404.field5747[var252] == var249) {
                        var251 = true;
                        break;
                    }
                    var252++;
                }
                if (!var251 && class25.field358 == 0) {
                    class404.field5747[class24.field350] = var249;
                    class24.field350 = (class24.field350 + 1) % 100;
                    String var253 = class176.field2307.method847(var248, 32768).method1555(class513.field7443, arg0 - 14);
                    if (var247 == 2) {
                        class515.method3076(null, "<img=1>" + var241, "<img=1>" + var242, var248, var253, 0, (byte) -38, 18);
                    } else if (var247 == 1) {
                        class515.method3076(null, "<img=0>" + var241, "<img=0>" + var242, var248, var253, 0, (byte) -67, 18);
                    } else {
                        class515.method3076(null, var241, var242, var248, var253, 0, (byte) -80, 18);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class119.field1602) {
                int var254 = class513.field7443.method2775(-4672);
                int var255 = class513.field7443.method2737(false);
                int var256 = class513.field7443.method2775(-4672);
                class295 var257 = class187.field2446[var254];
                if (var257 != null) {
                    class463.method2744(var256, 0, var255, var257);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class251.field3211) {
                int var258 = class513.field7443.method2728((byte) -124);
                int var259 = class513.field7443.method2779((byte) 0);
                int var260 = class513.field7443.method2775(-4672);
                int var261 = class513.field7443.method2767(1);
                if (class277.method1637(-112, var260)) {
                    class166.method1073(var261, var259, (byte) 104, var258);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class135.field1744) {
                boolean var262 = class513.field7443.method2737(false) == 1;
                byte[] var263 = new byte[class312.field3986 - 1];
                class513.field7443.method2735(var263, class312.field3986 - 1, 0, -447463096);
                class85.method686((byte) -128, var262, var263);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class350.field4504) {
                class461.method2721((byte) -76, class209.field2709);
                class85.field1068 = null;
                return false;
            } else if (class85.field1068 == class52.field697) {
                int var264 = class513.field7443.method2758((byte) 126);
                if (class277.method1637(120, var264)) {
                    class349.method2007(1);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class240.field3080) {
                class24.method198(false, class474.field6867);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class204.field2649) {
                class24.method198(false, class163.field2073);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class343.field4368) {
                class306.field3903 = class513.field7443.method2758((byte) 85) * 30;
                class85.field1068 = null;
                class106.field1342 = class160.field2037;
                return true;
            } else if (class85.field1068 == class354.field4552) {
                class10.field163 = class513.field7443.method2742((byte) -98);
                class283.field3601 = class513.field7443.method2752(2) << 3;
                class447.field6401 = class513.field7443.method2793(32767) << 3;
                while (class312.field3986 > class513.field7443.field6631) {
                    class181 var265 = class12.method98((byte) -128)[class513.field7443.method2737(false)];
                    class24.method198(false, var265);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class196.field2534) {
                byte var266 = class513.field7443.method2756(113);
                int var267 = class513.field7443.method2786(255);
                class491.field7160.method2808(false, var267, var266);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class162.field2061) {
                int var268 = class513.field7443.method2746((byte) 78);
                int var269 = class513.field7443.method2772((byte) 123);
                int var270 = class513.field7443.method2772((byte) 127);
                if (var270 == 65535) {
                    var270 = -1;
                }
                int var271 = class513.field7443.method2727(-124);
                int var272 = class513.field7443.method2775(-4672);
                if (var272 == 65535) {
                    var272 = -1;
                }
                if (class277.method1637(37, var269)) {
                    for (int var273 = var270; var273 <= var272; var273++) {
                        long var274 = ((long) var271 << 32) + (long) var273;
                        class73 var276 = (class73) class412.field5876.method2022(-1, var274);
                        class73 var277;
                        if (var276 != null) {
                            var277 = new class73(var268, var276.field937);
                            var276.method2165(16225);
                        } else if (var273 == -1) {
                            var277 = new class73(var268, class310.method1810(var271, arg0 + 1182823749).field7589.field937);
                        } else {
                            var277 = new class73(var268, -1);
                        }
                        class412.field5876.method2019((byte) -113, var277, var274);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class383.field5045) {
                int var278 = class513.field7443.method2758((byte) 111);
                int var279 = class513.field7443.method2737(false);
                int var280 = class513.field7443.method2737(false);
                int var281 = class513.field7443.method2758((byte) 97) << 0;
                int var282 = class513.field7443.method2737(false);
                int var283 = class513.field7443.method2737(false);
                if (class277.method1637(arg0 ^ 0x3B, var278)) {
                    class516.method3081(var279, var282, var283, var280, var281, 64, true);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class64.field829) {
                class510.field7368 = class160.field2037;
                if (class312.field3986 == 0) {
                    class85.field1068 = null;
                    class313.field3994 = null;
                    class372.field4828 = null;
                    class339.field4255 = 0;
                    class279.field3527 = null;
                    return true;
                }
                class372.field4828 = class513.field7443.method2768((byte) -74);
                boolean var284 = class513.field7443.method2737(false) == 1;
                if (var284) {
                    class513.field7443.method2768((byte) -103);
                }
                long var285 = class513.field7443.method2754(-56);
                class279.field3527 = class279.method1651(var285, (byte) -128);
                class156.field1991 = class513.field7443.method2793(32767);
                int var287 = class513.field7443.method2737(false);
                if (var287 == 255) {
                    class85.field1068 = null;
                    return true;
                }
                class339.field4255 = var287;
                class380[] var288 = new class380[100];
                for (int var289 = 0; var289 < class339.field4255; var289++) {
                    var288[var289] = new class380();
                    var288[var289].field5000 = class513.field7443.method2768((byte) 37);
                    boolean var295 = class513.field7443.method2737(false) == 1;
                    if (var295) {
                        var288[var289].field5005 = class513.field7443.method2768((byte) 105);
                    } else {
                        var288[var289].field5005 = var288[var289].field5000;
                    }
                    var288[var289].field5008 = class465.method2803(var288[var289].field5005, (byte) 73);
                    var288[var289].field5002 = class513.field7443.method2758((byte) 106);
                    var288[var289].field5007 = class513.field7443.method2793(32767);
                    var288[var289].field5010 = class513.field7443.method2768((byte) 72);
                    if (var288[var289].field5005.equals(class23.field336.field2852)) {
                        class342.field4309 = var288[var289].field5007;
                    }
                }
                boolean var290 = false;
                int var291 = class339.field4255;
                while (var291 > 0) {
                    boolean var292 = true;
                    var291--;
                    for (int var293 = 0; var293 < var291; var293++) {
                        if (var288[var293].field5008.compareTo(var288[var293 + 1].field5008) > 0) {
                            class380 var294 = var288[var293];
                            var288[var293] = var288[var293 + 1];
                            var288[var293 + 1] = var294;
                            var292 = false;
                        }
                    }
                    if (var292) {
                        break;
                    }
                }
                class85.field1068 = null;
                class313.field3994 = var288;
                return true;
            } else if (client.field2574 == class85.field1068) {
                int var296 = class513.field7443.method2772((byte) 125);
                int var297 = class513.field7443.method2776((byte) -27);
                if (class277.method1637(-94, var296)) {
                    class202.field2629 = var297;
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class230.field2941) {
                int var298 = class513.field7443.method2758((byte) 89);
                if (var298 == 65535) {
                    var298 = -1;
                }
                int var299 = class513.field7443.method2758((byte) 114);
                int var300 = class513.field7443.method2766(-13706);
                if (class277.method1637(127, var299)) {
                    class26.method209((byte) 126, var298, -1, 1, var300);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class503.field7265) {
                int var301 = class513.field7443.method2758((byte) 93);
                int var302 = class513.field7443.method2766(-13706);
                String var303 = class513.field7443.method2768((byte) -86);
                if (class277.method1637(72, var301)) {
                    class329.method1916(true, var303, var302);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class282.field3585) {
                int var304 = class513.field7443.method2758((byte) 81);
                int var305 = class513.field7443.method2775(-4672);
                int var306 = class513.field7443.method2758((byte) 127);
                int var307 = class513.field7443.method2727(arg0 ^ 0x1B);
                int var308 = class513.field7443.method2758((byte) 108);
                if (class277.method1637(arg0 + 147, var306)) {
                    class200.method1259(var304, var305, -5783, var307, var308);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class101.field1220) {
                class24.method198(false, class410.field5856);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class160.field2044) {
                boolean var309 = class513.field7443.method2737(false) == 1;
                String var310 = class513.field7443.method2768((byte) -119);
                String var311 = var310;
                if (var309) {
                    var311 = class513.field7443.method2768((byte) -115);
                }
                int var312 = class513.field7443.method2737(false);
                int var313 = class513.field7443.method2758((byte) 118);
                boolean var314 = false;
                if (var312 <= 1 && class530.method3144(-106, var311)) {
                    var314 = true;
                }
                if (!var314 && class25.field358 == 0) {
                    String var315 = class176.field2307.method847(var313, 32768).method1555(class513.field7443, -46);
                    if (var312 == 2) {
                        class515.method3076(null, "<img=1>" + var310, "<img=1>" + var311, var313, var315, 0, (byte) -114, 25);
                    } else if (var312 == 1) {
                        class515.method3076(null, "<img=0>" + var310, "<img=0>" + var311, var313, var315, 0, (byte) -108, 25);
                    } else {
                        class515.method3076(null, var310, var311, var313, var315, 0, (byte) -47, 25);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class517.field7486) {
                int var316 = class513.field7443.method2758((byte) 99);
                int var317 = class513.field7443.method2737(false);
                boolean var318 = (var317 & 0x1) == 1;
                class19.method167(var316, (byte) -16, var318);
                int var319 = class513.field7443.method2758((byte) 108);
                for (int var320 = 0; var320 < var319; var320++) {
                    int var321 = class513.field7443.method2786(arg0 ^ 0xFFFFFF54);
                    int var322 = class513.field7443.method2776((byte) -27);
                    if (var322 == 255) {
                        var322 = class513.field7443.method2746((byte) 57);
                    }
                    class483.method2940(var316, var321 - 1, 1, var318, var322, var320);
                }
                class415.field5918[class378.method2145(class205.field2682++, 31)] = var316;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class273.field3424) {
                int var323 = class513.field7443.method2758((byte) 93);
                int var324 = class513.field7443.method2737(false);
                boolean var325 = (var324 & 0x1) == 1;
                while (class312.field3986 > class513.field7443.field6631) {
                    int var326 = class513.field7443.method2763(arg0 ^ 0x1EB16FFB);
                    int var327 = class513.field7443.method2758((byte) 93);
                    int var328 = 0;
                    if (var327 != 0) {
                        var328 = class513.field7443.method2737(false);
                        if (var328 == 255) {
                            var328 = class513.field7443.method2727(-94);
                        }
                    }
                    class483.method2940(var323, var327 - 1, 1, var325, var328, var326);
                }
                class415.field5918[class378.method2145(31, class205.field2682++)] = var323;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class402.field5726) {
                int var329 = class513.field7443.method2766(-13706);
                int var330 = class513.field7443.method2758((byte) 118);
                class491.field7160.method2804(var329, true, var330);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class490.field7119) {
                int var331 = class513.field7443.method2758((byte) 101);
                int var332 = class513.field7443.method2772((byte) 123);
                int var333 = class513.field7443.method2766(arg0 ^ 0x35DD);
                if (class277.method1637(arg0 ^ 0xFFFFFFFB, var331)) {
                    class379.method2150(arg0 + 6, var332, var333);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class438.field6288) {
                while (class312.field3986 > class513.field7443.field6631) {
                    boolean var344 = class513.field7443.method2737(false) == 1;
                    String var345 = class513.field7443.method2768((byte) 45);
                    String var346 = class513.field7443.method2768((byte) -124);
                    int var347 = class513.field7443.method2758((byte) 102);
                    int var348 = class513.field7443.method2737(false);
                    String var349 = "";
                    boolean var350 = false;
                    if (var347 > 0) {
                        var349 = class513.field7443.method2768((byte) -62);
                        var350 = class513.field7443.method2737(false) == 1;
                    }
                    for (int var351 = 0; var351 < class280.field3555; var351++) {
                        if (var344) {
                            if (var346.equals(class329.field4163[var351])) {
                                class329.field4163[var351] = var345;
                                var345 = null;
                                class106.field1341[var351] = var346;
                                break;
                            }
                        } else if (var345.equals(class329.field4163[var351])) {
                            if (class401.field5710[var351] != var347) {
                                class401.field5710[var351] = var347;
                                if (var347 > 0) {
                                    class443.method2616("", var345 + class273.field3431.method1936(-26539, class11.field177), 0, false, "", 5);
                                }
                                if (var347 == 0) {
                                    class443.method2616("", var345 + class262.field3309.method1936(-26539, class11.field177), 0, false, "", 5);
                                }
                            }
                            class106.field1341[var351] = var346;
                            class517.field7490[var351] = var349;
                            class444.field6364[var351] = var348;
                            class63.field824[var351] = var350;
                            var345 = null;
                            break;
                        }
                    }
                    if (var345 != null && class280.field3555 < 200) {
                        class329.field4163[class280.field3555] = var345;
                        class106.field1341[class280.field3555] = var346;
                        class401.field5710[class280.field3555] = var347;
                        class517.field7490[class280.field3555] = var349;
                        class444.field6364[class280.field3555] = var348;
                        class63.field824[class280.field3555] = var350;
                        class280.field3555++;
                    }
                }
                class208.field2694 = 2;
                class72.field932 = class160.field2037;
                boolean var334 = false;
                int var335 = class280.field3555;
                while (var335 > 0) {
                    boolean var336 = true;
                    var335--;
                    for (int var337 = 0; var337 < var335; var337++) {
                        if (class401.field5710[var337] != class64.field834.field355 && class401.field5710[var337 + 1] == class64.field834.field355 || class401.field5710[var337] == 0 && class401.field5710[var337 + 1] != 0) {
                            int var338 = class401.field5710[var337];
                            class401.field5710[var337] = class401.field5710[var337 + 1];
                            class401.field5710[var337 + 1] = var338;
                            String var339 = class517.field7490[var337];
                            class517.field7490[var337] = class517.field7490[var337 + 1];
                            class517.field7490[var337 + 1] = var339;
                            String var340 = class329.field4163[var337];
                            class329.field4163[var337] = class329.field4163[var337 + 1];
                            class329.field4163[var337 + 1] = var340;
                            String var341 = class106.field1341[var337];
                            class106.field1341[var337] = class106.field1341[var337 + 1];
                            class106.field1341[var337 + 1] = var341;
                            int var342 = class444.field6364[var337];
                            class444.field6364[var337] = class444.field6364[var337 + 1];
                            class444.field6364[var337 + 1] = var342;
                            boolean var343 = class63.field824[var337];
                            class63.field824[var337] = class63.field824[var337 + 1];
                            var336 = false;
                            class63.field824[var337 + 1] = var343;
                        }
                    }
                    if (var336) {
                        break;
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class97.field1182 == class85.field1068) {
                class24.method198(false, class24.field351);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class447.field6398) {
                int var352 = class513.field7443.method2758((byte) 107);
                int var353 = class513.field7443.method2737(false);
                int var354 = class513.field7443.method2737(false);
                int var355 = class513.field7443.method2758((byte) 126) << 0;
                int var356 = class513.field7443.method2737(false);
                int var357 = class513.field7443.method2737(false);
                if (class277.method1637(64, var352)) {
                    class113.method823(var357, var355, var353, var356, var354, 0);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class351.field4506) {
                int var358 = class513.field7443.method2746((byte) 40);
                int var359 = class513.field7443.method2786(255);
                int var360 = class513.field7443.method2786(255);
                int var361 = class513.field7443.method2758((byte) 114);
                if (class277.method1637(80, var361)) {
                    class25.method203((var359 << 16) + var360, var358, (byte) -109);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class418.field5936) {
                if (class24.field347 != null) {
                    class163.method1052(false, (byte) 125, -1, -1, class407.field5817.field3635);
                }
                byte[] var362 = new byte[class312.field3986];
                class513.field7443.method1205(false, 0, var362, class312.field3986);
                String var363 = class155.method1011(class312.field3986, 0, var362, 9716);
                class90.method707(104, class219.field2794, class377.field4959 == 1, true, var363);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class253.field3225) {
                class491.method2982(class312.field3986, class219.field2794, (byte) -117, class513.field7443);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class180.field2375) {
                int var364 = class513.field7443.method2775(arg0 - 4587);
                int var365 = class513.field7443.method2728((byte) -99);
                int var366 = class513.field7443.method2772((byte) 126);
                int var367 = class513.field7443.method2766(-13706);
                if (class277.method1637(122, var364)) {
                    class26.method209((byte) 127, var366, var367, 5, var365);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class364.field4737) {
                int var368 = class513.field7443.method2758((byte) 85);
                int var369 = class513.field7443.method2727(-120);
                if (class277.method1637(arg0 - 11, var368)) {
                    class175 var370 = (class175) class397.field5684.method2022(-1, (long) var369);
                    if (var370 != null) {
                        class290.method1706(var370, -87, true, false);
                    }
                    if (class466.field6723 != null) {
                        class136.method935(class466.field6723, arg0 ^ 0x2A);
                        class466.field6723 = null;
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class442.field6352) {
                int var371 = class513.field7443.method2728((byte) -88);
                int var372 = class513.field7443.method2776((byte) -27);
                int var373 = class513.field7443.method2742((byte) -100);
                class225.field2869[var373] = var371;
                class350.field4502[var373] = var372;
                class63.field826[var373] = 1;
                int var374 = class322.field4088[var373] - 1;
                for (int var375 = 0; var375 < var374; var375++) {
                    if (class33.field420[var375] <= var371) {
                        class63.field826[var373] = var375 + 2;
                    }
                }
                class359.field4635[class378.method2145(class113.field1521++, 31)] = var373;
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class288.field3680) {
                class24.method198(false, class72.field929);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class465.field6709) {
                int var376 = class513.field7443.method2758((byte) 78);
                if (var376 == 65535) {
                    var376 = -1;
                }
                int var377 = class513.field7443.method2737(false);
                int var378 = class513.field7443.method2758((byte) 90);
                int var379 = class513.field7443.method2737(false);
                class377.method2142(var378, 0, var377, var376, var379);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class205.field2674) {
                int var380 = class513.field7443.method2727(-117);
                class313.field3993 = class219.field2794.method2879(var380, -3390);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class231.field2951) {
                if (class277.field3510 != -1) {
                    class186.method1166(class277.field3510, 0, (byte) -75);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class420.field5949) {
                boolean var381 = class513.field7443.method2737(false) == 1;
                String var382 = class513.field7443.method2768((byte) -53);
                String var383 = var382;
                if (var381) {
                    var383 = class513.field7443.method2768((byte) 124);
                }
                long var384 = (long) class513.field7443.method2758((byte) 88);
                long var386 = (long) class513.field7443.method2738(arg0 ^ 0x1D);
                int var388 = class513.field7443.method2737(false);
                long var389 = (var384 << 32) + var386;
                boolean var391 = false;
                int var392 = 0;
                while (true) {
                    if (var392 >= 100) {
                        if (var388 <= 1) {
                            if (!(!class293.field3726 || class284.field3608) || class122.field1641) {
                                var391 = true;
                            } else if (class530.method3144(-110, var383)) {
                                var391 = true;
                            }
                        }
                        break;
                    }
                    if (class404.field5747[var392] == var389) {
                        var391 = true;
                        break;
                    }
                    var392++;
                }
                if (!var391 && class25.field358 == 0) {
                    class404.field5747[class24.field350] = var389;
                    class24.field350 = (class24.field350 + 1) % 100;
                    String var393 = class163.method1051(class334.method1932(class513.field7443, 28462), arg0 ^ 0xFFFFAB0D);
                    if (var388 == 2) {
                        class515.method3076(null, "<img=1>" + var382, "<img=1>" + var383, -1, var393, 0, (byte) -61, 7);
                    } else if (var388 == 1) {
                        class515.method3076(null, "<img=0>" + var382, "<img=0>" + var383, -1, var393, 0, (byte) -102, 7);
                    } else {
                        class515.method3076(null, var382, var383, -1, var393, 0, (byte) -108, 3);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class291.field3711) {
                int var394 = class513.field7443.method2786(arg0 + 340);
                int var395 = class513.field7443.method2775(-4672);
                int var396 = class513.field7443.method2758((byte) 127);
                if (var396 == 65535) {
                    var396 = -1;
                }
                int var397 = class513.field7443.method2772((byte) 125);
                if (var397 == 65535) {
                    var397 = -1;
                }
                int var398 = class513.field7443.method2766(-13706);
                if (class277.method1637(121, var395)) {
                    for (int var399 = var396; var399 <= var397; var399++) {
                        long var400 = ((long) var398 << 32) + (long) var399;
                        class73 var402 = (class73) class412.field5876.method2022(arg0 ^ 0x54, var400);
                        class73 var403;
                        if (var402 != null) {
                            var403 = new class73(var402.field942, var394);
                            var402.method2165(16225);
                        } else if (var399 == -1) {
                            var403 = new class73(class310.method1810(var398, 1182823664).field7589.field942, var394);
                        } else {
                            var403 = new class73(0, var394);
                        }
                        class412.field5876.method2019((byte) -108, var403, var400);
                    }
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class52.field698) {
                class230.field2942 = class513.field7443.method2737(false);
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class261.field3289) {
                int var404 = class513.field7443.method2772((byte) 125);
                int var405 = class513.field7443.method2727(arg0 ^ 0x3A);
                int var406 = class513.field7443.method2775(-4672);
                if (class277.method1637(arg0 ^ 0x37, var406)) {
                    class288.method1701(var405, 88, var404);
                }
                class85.field1068 = null;
                return true;
            } else if (class85.field1068 == class109.field1474) {
                class177.field2334 = class353.method2026(111, class513.field7443.method2737(false));
                class85.field1068 = null;
                return true;
            } else {
                class461.method2719(null, "T1 - " + (class85.field1068 == null ? -1 : class85.field1068.method2989(true)) + "," + (class301.field3870 == null ? -1 : class301.field3870.method2989(true)) + "," + (class525.field7765 == null ? -1 : class525.field7765.method2989(true)) + " - " + class312.field3986, 1);
                class461.method2721((byte) -76, false);
                return true;
            }
        }
    }
}
