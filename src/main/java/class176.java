import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class176 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lrd;")
    private static class173 field3450 = class133.method843("Loading wordpack )2 ", -102);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3452 = -1;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[Lnf;")
    public static class135[] field3459 = new class135[6];

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Z")
    public static boolean field3461 = false;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lrd;")
    public static class173 field3455 = field3450;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3460 = 0;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[Lqf;")
    public static class165[] field3456;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)[Ldh;")
    public static final class39[] method1169(byte arg0) {
        class39[] var1 = new class39[class71.field1387];
        if (arg0 > -7) {
            return null;
        }
        for (int var2 = 0; var2 < class71.field1387; var2++) {
            class39 var3 = new class39();
            var3.field815 = class197.field3845;
            var3.field813 = class166.field3189;
            var3.field808 = class55.field1099[var2];
            var3.field814 = class20.field458[var2];
            var3.field812 = class97.field1775[var2];
            var3.field809 = class30.field622[var2];
            var3.field811 = class112.field2074;
            var3.field810 = class188.field3676[var2];
            var1[var2] = var3;
        }
        class184.method1246((byte) 31);
        field3457++;
        return var1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLph;I)V")
    public static final void method1170(boolean arg0, class157 arg1, int arg2) {
        field3454++;
        int var3 = (int) arg1.field2437;
        int var4 = arg1.field2940;
        arg1.method824((byte) -126);
        if (arg0) {
            class48.method337(var4, (byte) 80);
        }
        class171.method1101(83, var4);
        class165 var5 = class103.method639(var3, true);
        if (var5 != null) {
            class209.method1379(1, var5);
        }
        class195.field3792 = 0;
        if (arg2 != 1540) {
            return;
        }
        class167.field3223 = false;
        class100.method616(class215.field4168, 0, class64.field1270, class51.field1047, class30.field619);
        if (class134.field2539 != -1) {
            class31.method254(arg2 ^ 0x618, class134.field2539, 1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z")
    public static final boolean method1171(int arg0) {
        field3458++;
        if (class34.field738 == null) {
            return false;
        }
        try {
            int var1 = class34.field738.method1094(0);
            if (var1 == 0) {
                return false;
            }
            if (class96.field1764 == -1) {
                var1--;
                class34.field738.method1093(1, 0, (byte) -5, class70.field1358.field2218);
                class70.field1358.field2222 = 0;
                class96.field1764 = class70.field1358.method1024((byte) 76);
                class45.field919 = class107.field2001[class96.field1764];
            }
            if (class45.field919 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class34.field738.method1093(1, 0, (byte) -5, class70.field1358.field2218);
                class45.field919 = class70.field1358.field2218[0] & 0xFF;
            }
            if (class45.field919 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class34.field738.method1093(2, 0, (byte) -5, class70.field1358.field2218);
                class70.field1358.field2222 = 0;
                class45.field919 = class70.field1358.method755((byte) -97);
            }
            if (var1 < class45.field919) {
                return false;
            }
            class70.field1358.field2222 = 0;
            class34.field738.method1093(class45.field919, 0, (byte) -5, class70.field1358.field2218);
            class138.field2587 = 0;
            field3451 = class66.field1278;
            class66.field1278 = class84.field1663;
            class84.field1663 = class96.field1764;
            if (class96.field1764 == 18) {
                for (int var2 = 0; var2 < class183.field3600.length; var2++) {
                    if (class183.field3600[var2] != null) {
                        class183.field3600[var2].field2809 = -1;
                    }
                }
                for (int var3 = 0; var3 < client.field632.length; var3++) {
                    if (client.field632[var3] != null) {
                        client.field632[var3].field2809 = -1;
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (arg0 != -752901085) {
                method1172(null, -97, -53, -25, 66, 70, -8, 52);
            }
            if (class96.field1764 == 154) {
                class10.field174 = class70.field1358.method753(255);
                client.field636 = class70.field1358.method735((byte) -51);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 175) {
                long var4 = class70.field1358.method759(true);
                class70.field1358.method767(-82);
                boolean var6 = false;
                long var7 = class70.field1358.method759(true);
                long var9 = (long) class70.field1358.method755((byte) -105);
                long var11 = (long) class70.field1358.method780(16711680);
                int var13 = class70.field1358.method751((byte) -46);
                long var14 = (var9 << 32) + var11;
                for (int var16 = 0; var16 < 100; var16++) {
                    if (class107.field1993[var16] == var14) {
                        var6 = true;
                        break;
                    }
                }
                if (var13 <= 1) {
                    for (int var17 = 0; var17 < class149.field2840; var17++) {
                        if (class52.field1074[var17] == var4) {
                            var6 = true;
                            break;
                        }
                    }
                }
                if (!var6 && class195.field3786 == 0) {
                    class107.field1993[class9.field170] = var14;
                    class9.field170 = (class9.field170 + 1) % 100;
                    class173 var18 = class83.method520(class197.method1312(arg0 ^ 0xD31FA471, class70.field1358).method1146((byte) -113));
                    if (var13 == 2 || var13 == 3) {
                        class97.method597(var18, class22.method185(-23750, var7).method1142(-98), 9, class173.method1158(-3, new class173[] { class168.field3238, class22.method185(-23750, var4).method1142(arg0 ^ 0x2CE05BBD) }), false);
                    } else if (var13 == 1) {
                        class97.method597(var18, class22.method185(-23750, var7).method1142(-98), 9, class173.method1158(-3, new class173[] { class79.field1544, class22.method185(-23750, var4).method1142(-98) }), false);
                    } else {
                        class97.method597(var18, class22.method185(-23750, var7).method1142(-98), 9, class22.method185(-23750, var4).method1142(-98), false);
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 142) {
                int var19 = class70.field1358.method758(true);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class70.field1358.method777((byte) -87);
                int var21 = class70.field1358.method784((byte) 38);
                class165 var22 = class103.method639(var21, true);
                if (var22.field3108) {
                    var22.field3146 = var20;
                    var22.field3126 = var19;
                    class19 var24 = class195.method1298(1639, var19);
                    var22.field3141 = var24.field397;
                    var22.field3057 = var24.field403;
                    var22.field3125 = var24.field424;
                    var22.field3115 = var24.field443;
                    var22.field3069 = var24.field384;
                    if (var22.field3156 > 0) {
                        var22.field3141 = var22.field3141 * 32 / var22.field3156;
                    }
                    var22.field3143 = var24.field429;
                    class209.method1379(1, var22);
                } else if (var19 == -1) {
                    class96.field1764 = -1;
                    var22.field3086 = 0;
                    return true;
                } else {
                    class19 var23 = class195.method1298(arg0 ^ 0xD31FA244, var19);
                    var22.field3141 = var23.field397 * 100 / var20;
                    var22.field3086 = 4;
                    var22.field3159 = var19;
                    var22.field3115 = var23.field443;
                    var22.field3125 = var23.field424;
                    class209.method1379(1, var22);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 245) {
                int var25 = class70.field1358.method776(64);
                class165 var26 = class103.method639(var25, true);
                for (int var27 = 0; var27 < var26.field3111.length; var27++) {
                    var26.field3111[var27] = -1;
                    var26.field3111[var27] = 0;
                }
                class209.method1379(1, var26);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 216) {
                class59.field1166 = class70.field1358.method746(arg0 ^ 0x2CE01638);
                class139.method867(class59.field1166, -1);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 161) {
                boolean var28 = class70.field1358.method753(255) == 1;
                int var29 = class70.field1358.method777((byte) -61);
                class165 var30 = class103.method639(var29, true);
                if (var30.field3047 != var28) {
                    var30.field3047 = var28;
                    class209.method1379(1, var30);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 225) {
                class149.field2840 = class45.field919 / 8;
                for (int var31 = 0; var31 < class149.field2840; var31++) {
                    class52.field1074[var31] = class70.field1358.method759(true);
                    class191.field3730[var31] = class22.method185(-23750, class52.field1074[var31]);
                }
                class189.field3692 = class34.field741;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 21) {
                int var32 = class70.field1358.method742((byte) -98);
                int var33 = class70.field1358.method758(true);
                class186.field3635 = var32;
                class96.field1764 = -1;
                class183.field3595 = var33;
                return true;
            }
            if (class96.field1764 == 120) {
                int var34 = class70.field1358.method785(arg0 + 752901084);
                class134.field2539 = var34;
                class76.method465(arg0 ^ 0x2CE019B0, var34);
                class221.method1438(-90, class134.field2539);
                for (int var35 = 0; var35 < 100; var35++) {
                    class70.field1373[var35] = true;
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 167) {
                int var36 = class70.field1358.method742((byte) -98);
                byte var37 = class70.field1358.method747(93);
                class93.field1746[var36] = var37;
                if (class45.field913[var36] != var37) {
                    class45.field913[var36] = var37;
                    class9.method59(var36, 4);
                }
                class211.field4090[class209.method1383(class122.field2293++, 31)] = var36;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 204) {
                class17.method153(false);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 184) {
                class10.field174 = class70.field1358.method753(255);
                client.field636 = class70.field1358.method735((byte) -51);
                for (int var38 = client.field636; var38 < client.field636 + 8; var38++) {
                    for (int var39 = class10.field174; var39 < class10.field174 + 8; var39++) {
                        if (class160.field2985[class172.field3347][var38][var39] != null) {
                            class160.field2985[class172.field3347][var38][var39] = null;
                            class187.method1256((byte) -38, var38, var39);
                        }
                    }
                }
                for (class189 var40 = (class189) class108.field2017.method915(-1); var40 != null; var40 = (class189) class108.field2017.method910((byte) 88)) {
                    if (var40.field3707 >= client.field636 && client.field636 + 8 > var40.field3707 && var40.field3681 >= class10.field174 && class10.field174 + 8 > var40.field3681 && class172.field3347 == var40.field3691) {
                        var40.field3704 = 0;
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 114) {
                int var41 = class70.field1358.method758(true);
                if (var41 == 65535) {
                    var41 = -1;
                }
                int var42 = class70.field1358.method776(105);
                int var43 = class70.field1358.method776(-122);
                int var44 = class70.field1358.method755((byte) -125);
                if (var44 == 65535) {
                    var44 = -1;
                }
                for (int var45 = var41; var45 <= var44; var45++) {
                    long var46 = ((long) var42 << 32) + ((long) var45);
                    class129 var48 = class57.field1126.method677(-2755, var46);
                    if (var48 != null) {
                        var48.method824((byte) -128);
                    }
                    class57.field1126.method675(var46, new class76(var43), false);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 174) {
                int var49 = class70.field1358.method732(-65);
                int var50 = class70.field1358.method777((byte) -96);
                int var51 = class70.field1358.method732(arg0 ^ 0xD31FA45D);
                class165 var52 = class103.method639(var50, true);
                int var53 = var52.field3123 + var49;
                int var54 = var52.field3080 + var51;
                if (var52.field3120 != var53 || var52.field3174 != var54) {
                    var52.field3174 = var54;
                    var52.field3120 = var53;
                    class209.method1379(1, var52);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 98) {
                int var55 = class70.field1358.method784((byte) 38);
                int var56 = class70.field1358.method758(true);
                class165 var57 = class103.method639(var55, true);
                if (var57 != null && var57.field3077 == 0) {
                    if (var57.field3153 - var57.field3105 < var56) {
                        var56 = var57.field3153 - var57.field3105;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    }
                    if (var57.field3087 != var56) {
                        var57.field3087 = var56;
                        class209.method1379(1, var57);
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 179) {
                class129.field2441 = class34.field741;
                long var58 = class70.field1358.method759(true);
                if (var58 == 0L) {
                    class96.field1764 = -1;
                    class101.field1847 = null;
                    class172.field3352 = null;
                    class131.field2469 = null;
                    class70.field1352 = 0;
                    return true;
                }
                long var60 = class70.field1358.method759(true);
                class131.field2469 = class22.method185(-23750, var60);
                class101.field1847 = class22.method185(-23750, var58);
                class204.field3992 = class70.field1358.method767(-84);
                int var62 = class70.field1358.method751((byte) -105);
                if (var62 == 255) {
                    class96.field1764 = -1;
                    return true;
                }
                class70.field1352 = var62;
                class55[] var63 = new class55[100];
                for (int var64 = 0; var64 < class70.field1352; var64++) {
                    var63[var64] = new class55();
                    var63[var64].field2437 = class70.field1358.method759(true);
                    var63[var64].field1101 = class22.method185(-23750, var63[var64].field2437);
                    var63[var64].field1104 = class70.field1358.method755((byte) -56);
                    var63[var64].field1098 = class70.field1358.method767(-93);
                    var63[var64].field1096 = class70.field1358.method746(-19941);
                    if (class37.field791 == var63[var64].field2437) {
                        class163.field3021 = var63[var64].field1098;
                    }
                }
                boolean var65 = false;
                int var66 = class70.field1352;
                while (var66 > 0) {
                    boolean var67 = true;
                    var66--;
                    for (int var68 = 0; var68 < var66; var68++) {
                        if (var63[var68].field1101.method1133(arg0 ^ 0x2CE05BB4, var63[var68 + 1].field1101) > 0) {
                            class55 var69 = var63[var68];
                            var67 = false;
                            var63[var68] = var63[var68 + 1];
                            var63[var68 + 1] = var69;
                        }
                    }
                    if (var67) {
                        break;
                    }
                }
                class172.field3352 = var63;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 40) {
                class124.field2341 = class70.field1358.method751((byte) -87);
                class172.field3361 = class70.field1358.method751((byte) 102);
                class37.field787 = class70.field1358.method751((byte) -89);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 194) {
                if (class134.field2539 != -1) {
                    class31.method254(arg0 ^ 0xD31FA43F, class134.field2539, 0);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 19) {
                int var70 = class70.field1358.method751((byte) 122);
                int var71 = var70 >> 6;
                class67 var72 = new class67();
                var72.field1310 = var70 & 0x3F;
                var72.field1309 = class70.field1358.method751((byte) 93);
                if (var72.field1309 >= 0 && class203.field3954.length > var72.field1309) {
                    if (var72.field1310 == 1 || var72.field1310 == 10) {
                        var72.field1311 = class70.field1358.method755((byte) -64);
                    }
                    if (var72.field1310 >= 2 && var72.field1310 <= 6) {
                        if (var72.field1310 == 2) {
                            var72.field1295 = 64;
                            var72.field1294 = 64;
                        }
                        if (var72.field1310 == 3) {
                            var72.field1295 = 64;
                            var72.field1294 = 0;
                        }
                        if (var72.field1310 == 4) {
                            var72.field1295 = 64;
                            var72.field1294 = 128;
                        }
                        if (var72.field1310 == 5) {
                            var72.field1295 = 0;
                            var72.field1294 = 64;
                        }
                        if (var72.field1310 == 6) {
                            var72.field1295 = 128;
                            var72.field1294 = 64;
                        }
                        var72.field1310 = 2;
                        var72.field1299 = class70.field1358.method755((byte) -116);
                        var72.field1302 = class70.field1358.method755((byte) -122);
                        var72.field1298 = class70.field1358.method751((byte) -102);
                    }
                    class105.field1971[var71] = var72;
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 143) {
                class9.method61(class45.field919, class70.field1358, class64.field1264, (byte) 98);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 248) {
                class145.method913(4, false);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 164) {
                class173 var73 = class70.field1358.method746(-19941);
                Object[] var74 = new Object[var73.method1153((byte) -128) + 1];
                for (int var75 = var73.method1153((byte) -128) - 1; var75 >= 0; var75--) {
                    if (var73.method1147(7028, var75) == 115) {
                        var74[var75 + 1] = class70.field1358.method746(class195.method1297(arg0, 752883256));
                    } else {
                        var74[var75 + 1] = Integer.valueOf(class70.field1358.method776(class195.method1297(arg0, -752901035)));
                    }
                }
                var74[0] = Integer.valueOf(class70.field1358.method776(107));
                class117 var76 = new class117();
                var76.field2174 = var74;
                class189.method1265(-3256, var76);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 229) {
                long var77 = class70.field1358.method759(true);
                class173 var79 = class83.method520(class197.method1312(115, class70.field1358).method1146((byte) -94));
                class166.method1074(class22.method185(arg0 + 752877335, var77).method1142(-98), 6, var79, -124);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 44) {
                class174.method1164(53);
                int var80 = class70.field1358.method748(255);
                int var81 = class70.field1358.method735((byte) -51);
                int var82 = class70.field1358.method779(15151);
                class18.field380[var81] = var80;
                class198.field3863[var81] = var82;
                client.field630[var81] = 1;
                for (int var83 = 0; var83 < 98; var83++) {
                    if (class56.field1108[var83] <= var80) {
                        client.field630[var81] = var83 + 2;
                    }
                }
                class43.field880[class209.method1383(class35.field765++, 31)] = var81;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 109) {
                int var84 = class70.field1358.method785(-1);
                if (var84 == 65535) {
                    var84 = -1;
                }
                class110.method668(-97, var84);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 55) {
                int var85 = class70.field1358.method781(arg0 + 752901181);
                int var86 = class70.field1358.method758(true);
                if (var86 == 65535) {
                    var86 = -1;
                }
                client.method239((byte) -68, var85, var86);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 136) {
                int var87 = class70.field1358.method748(255);
                int var88 = class70.field1358.method755((byte) -92);
                int var89 = var88 >> 5 & 0x1F;
                int var90 = var88 & 0x1F;
                int var91 = var88 >> 10 & 0x1F;
                int var92 = (var90 << 3) + (var89 << 11) + (var91 << 19);
                class165 var93 = class103.method639(var87, true);
                if (var93.field3063 != var92) {
                    var93.field3063 = var92;
                    class209.method1379(1, var93);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 129) {
                class145.method913(arg0 ^ 0xD31FA427, true);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 223) {
                class182.method1240(false);
                class96.field1764 = -1;
                return false;
            }
            if (class96.field1764 == 149) {
                int var94 = class70.field1358.method758(true);
                int var95 = class70.field1358.method776(111);
                class93.field1746[var94] = var95;
                if (class45.field913[var94] != var95) {
                    class45.field913[var94] = var95;
                    class9.method59(var94, 4);
                }
                class211.field4090[class209.method1383(31, class122.field2293++)] = var94;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 158) {
                class22.field476 = class70.field1358.method751((byte) -101);
                class96.field1764 = -1;
                class189.field3692 = class34.field741;
                return true;
            }
            if (class96.field1764 == 145) {
                int var96 = class70.field1358.method755((byte) -116);
                int var97 = class70.field1358.method751((byte) 96);
                if (var96 == 65535) {
                    var96 = -1;
                }
                int var98 = class70.field1358.method755((byte) -30);
                class123.method789(var96, var98, var97, 116);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 4) {
                int var99 = class70.field1358.method742((byte) -98);
                if (var99 == 65535) {
                    var99 = -1;
                }
                int var100 = class70.field1358.method776(48);
                class165 var101 = class103.method639(var100, true);
                if (var101.field3086 != 1 || var101.field3159 != var99) {
                    var101.field3159 = var99;
                    var101.field3086 = 1;
                    class209.method1379(arg0 ^ 0xD31FA422, var101);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 254) {
                class212.method1393(-41, class70.field1358);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 89) {
                int var102 = class70.field1358.method776(115);
                int var103 = class70.field1358.method732(120);
                class165 var104 = class103.method639(var102, true);
                if (var104.field3155 != var103 || var103 == -1) {
                    var104.field3155 = var103;
                    var104.field3084 = 0;
                    var104.field3142 = 0;
                    class209.method1379(1, var104);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 238) {
                class111.field2070 = false;
                for (int var105 = 0; var105 < 5; var105++) {
                    class54.field1085[var105] = false;
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 1) {
                long var106 = class70.field1358.method759(true);
                long var108 = (long) class70.field1358.method755((byte) -73);
                long var110 = (long) class70.field1358.method780(16711680);
                int var112 = class70.field1358.method751((byte) 116);
                long var113 = (var108 << 32) + var110;
                boolean var115 = false;
                for (int var116 = 0; var116 < 100; var116++) {
                    if (class107.field1993[var116] == var113) {
                        var115 = true;
                        break;
                    }
                }
                if (var112 <= 1) {
                    for (int var117 = 0; var117 < class149.field2840; var117++) {
                        if (class52.field1074[var117] == var106) {
                            var115 = true;
                            break;
                        }
                    }
                }
                if (!var115 && class195.field3786 == 0) {
                    class107.field1993[class9.field170] = var113;
                    class9.field170 = (class9.field170 + 1) % 100;
                    class173 var118 = class83.method520(class197.method1312(124, class70.field1358).method1146((byte) -89));
                    if (var112 == 2 || var112 == 3) {
                        class166.method1074(class173.method1158(arg0 ^ 0x2CE05BDE, new class173[] { class168.field3238, class22.method185(-23750, var106).method1142(-98) }), 7, var118, 94);
                    } else if (var112 == 1) {
                        class166.method1074(class173.method1158(-3, new class173[] { class79.field1544, class22.method185(arg0 ^ 0x2CE00719, var106).method1142(-98) }), 7, var118, 101);
                    } else {
                        class166.method1074(class22.method185(arg0 + 752877335, var106).method1142(-98), 3, var118, 126);
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 139) {
                int var119 = class70.field1358.method776(66);
                int var120 = class70.field1358.method755((byte) -114);
                if (var120 == 65535) {
                    var120 = -1;
                }
                class165 var121 = class103.method639(var119, true);
                if (var121.field3086 != 2 || var121.field3159 != var120) {
                    var121.field3159 = var120;
                    var121.field3086 = 2;
                    class209.method1379(1, var121);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 28) {
                for (int var122 = 0; var122 < class98.field1794; var122++) {
                    class207 var123 = class48.method334((byte) -6, var122);
                    if (var123 != null && var123.field4038 == 0) {
                        class93.field1746[var122] = 0;
                        class45.field913[var122] = 0;
                    }
                }
                class174.method1164(77);
                class96.field1764 = -1;
                class122.field2293 += 32;
                return true;
            }
            if (class96.field1764 == 156) {
                int var124 = class70.field1358.method776(104);
                class157 var125 = (class157) client.field637.method677(-2755, (long) var124);
                if (var125 != null) {
                    method1170(true, var125, 1540);
                }
                if (class93.field1749 != null) {
                    class209.method1379(1, class93.field1749);
                    class93.field1749 = null;
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 152) {
                int var126 = class45.field919 + class70.field1358.field2222;
                int var127 = class70.field1358.method755((byte) -109);
                int var128 = class70.field1358.method755((byte) -117);
                if (class134.field2539 != var127) {
                    class134.field2539 = var127;
                    class76.method465(-17005, class134.field2539);
                    class221.method1438(arg0 ^ 0x2CE05BFC, class134.field2539);
                    for (int var129 = 0; var129 < 100; var129++) {
                        class70.field1373[var129] = true;
                    }
                }
                while (var128-- > 0) {
                    int var130 = class70.field1358.method776(86);
                    int var131 = class70.field1358.method755((byte) -40);
                    int var132 = class70.field1358.method751((byte) 99);
                    class157 var133 = (class157) client.field637.method677(-2755, (long) var130);
                    if (var133 != null && var133.field2940 != var131) {
                        method1170(true, var133, 1540);
                        var133 = null;
                    }
                    if (var133 == null) {
                        var133 = class125.method801(var132, var131, var130, (byte) 35);
                    }
                    var133.field2951 = true;
                }
                for (class157 var134 = (class157) client.field637.method684((byte) -76); var134 != null; var134 = (class157) client.field637.method678(false)) {
                    if (var134.field2951) {
                        var134.field2951 = false;
                    } else {
                        method1170(true, var134, 1540);
                    }
                }
                class57.field1126 = new class112(512);
                while (class70.field1358.field2222 < var126) {
                    int var135 = class70.field1358.method776(-82);
                    int var136 = class70.field1358.method755((byte) -64);
                    int var137 = class70.field1358.method755((byte) -31);
                    int var138 = class70.field1358.method776(87);
                    for (int var139 = var136; var139 <= var137; var139++) {
                        long var140 = ((long) var135 << 32) + (long) var139;
                        class57.field1126.method675(var140, new class76(var138), false);
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 235) {
                int var142 = class70.field1358.method784((byte) 38);
                class165 var143 = class103.method639(var142, true);
                var143.field3086 = 3;
                var143.field3159 = class175.field3447.field4109.method699((byte) 3);
                class209.method1379(1, var143);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 193) {
                int var144 = class70.field1358.method776(102);
                int var145 = class70.field1358.method755((byte) -84);
                if (var144 < -70000) {
                    var145 += 32768;
                }
                class165 var146;
                if (var144 >= 0) {
                    var146 = class103.method639(var144, true);
                } else {
                    var146 = null;
                }
                if (var146 != null) {
                    for (int var147 = 0; var147 < var146.field3111.length; var147++) {
                        var146.field3111[var147] = 0;
                        var146.field3102[var147] = 0;
                    }
                }
                class1.method2(var145, (byte) -71);
                int var148 = class70.field1358.method755((byte) -124);
                for (int var149 = 0; var149 < var148; var149++) {
                    int var150 = class70.field1358.method742((byte) -98);
                    int var151 = class70.field1358.method753(255);
                    if (var151 == 255) {
                        var151 = class70.field1358.method777((byte) -59);
                    }
                    if (var146 != null && var149 < var146.field3111.length) {
                        var146.field3111[var149] = var150;
                        var146.field3102[var149] = var151;
                    }
                    class196.method1306(arg0 + 752901085, var151, var149, var150 - 1, var145);
                }
                if (var146 != null) {
                    class209.method1379(arg0 + 752901086, var146);
                }
                class174.method1164(77);
                class175.field3440[class209.method1383(31, class196.field3818++)] = class209.method1383(var145, 32767);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 42 || class96.field1764 == 242 || class96.field1764 == 181 || class96.field1764 == 13 || class96.field1764 == 90 || class96.field1764 == 116 || class96.field1764 == 61 || class96.field1764 == 122 || class96.field1764 == 72 || class96.field1764 == 10 || class96.field1764 == 177) {
                class174.method1166((byte) -117);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 104) {
                class111.field2070 = true;
                class78.field1509 = class70.field1358.method751((byte) -121);
                class9.field171 = class70.field1358.method751((byte) 107);
                class182.field3563 = class70.field1358.method755((byte) -48);
                class55.field1102 = class70.field1358.method751((byte) -56);
                class207.field4029 = class70.field1358.method751((byte) -44);
                if (class207.field4029 >= 100) {
                    class62.field1225 = class78.field1509 * 128 + 64;
                    class97.field1778 = class9.field171 * 128 + 64;
                    class168.field3246 = class56.method361(class172.field3347, class97.field1778, (byte) -48, class62.field1225) - class182.field3563;
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 138) {
                long var152 = class70.field1358.method759(true);
                int var154 = class70.field1358.method755((byte) -74);
                byte var155 = class70.field1358.method767(-98);
                boolean var156 = false;
                if ((Long.MIN_VALUE & var152) != 0L) {
                    var156 = true;
                }
                if (var156) {
                    if (class70.field1352 == 0) {
                        class96.field1764 = -1;
                        return true;
                    }
                    boolean var162 = false;
                    long var163 = var152 & Long.MAX_VALUE;
                    int var165;
                    for (var165 = 0; var165 < class70.field1352 && (class172.field3352[var165].field2437 != var163 || class172.field3352[var165].field1104 != var154); var165++) {
                    }
                    if (class70.field1352 > var165) {
                        while (class70.field1352 - 1 > var165) {
                            class172.field3352[var165] = class172.field3352[var165 + 1];
                            var165++;
                        }
                        class70.field1352--;
                        class172.field3352[class70.field1352] = null;
                    }
                } else {
                    class173 var157 = class70.field1358.method746(arg0 ^ 0x2CE01638);
                    class55 var158 = new class55();
                    var158.field2437 = var152;
                    var158.field1101 = class22.method185(-23750, var158.field2437);
                    var158.field1096 = var157;
                    var158.field1098 = var155;
                    var158.field1104 = var154;
                    int var159;
                    for (var159 = class70.field1352 - 1; var159 >= 0; var159--) {
                        int var160 = class172.field3352[var159].field1101.method1133(-113, var158.field1101);
                        if (var160 == 0) {
                            class172.field3352[var159].field1104 = var154;
                            class172.field3352[var159].field1098 = var155;
                            class172.field3352[var159].field1096 = var157;
                            if (class37.field791 == var152) {
                                class163.field3021 = var155;
                            }
                            class129.field2441 = class34.field741;
                            class96.field1764 = -1;
                            return true;
                        }
                        if (var160 < 0) {
                            break;
                        }
                    }
                    if (class70.field1352 >= class172.field3352.length) {
                        class96.field1764 = -1;
                        return true;
                    }
                    for (int var161 = class70.field1352 - 1; var161 > var159; var161--) {
                        class172.field3352[var161 + 1] = class172.field3352[var161];
                    }
                    if (class70.field1352 == 0) {
                        class172.field3352 = new class55[100];
                    }
                    class172.field3352[var159 + 1] = var158;
                    class70.field1352++;
                    if (class37.field791 == var152) {
                        class163.field3021 = var155;
                    }
                }
                class129.field2441 = class34.field741;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 74) {
                int var166 = class70.field1358.method785(-1);
                int var167 = class70.field1358.method785(-1);
                int var168 = class70.field1358.method748(arg0 ^ 0xD31FA4DC);
                class165 var169 = class103.method639(var168, true);
                var169.field3055 = (var166 << 16) + var167;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 51) {
                for (int var170 = 0; var170 < class45.field913.length; var170++) {
                    if (class93.field1746[var170] != class45.field913[var170]) {
                        class45.field913[var170] = class93.field1746[var170];
                        class9.method59(var170, 4);
                        class211.field4090[class209.method1383(class122.field2293++, 31)] = var170;
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 46) {
                int var171 = class70.field1358.method777((byte) -111);
                class183.field3587 = class64.field1264.method834(arg0 ^ 0x2CE05BD5, var171);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 71) {
                int var172 = class70.field1358.method742((byte) -98);
                int var173 = class70.field1358.method748(255);
                int var174 = class70.field1358.method751((byte) -100);
                class157 var175 = (class157) client.field637.method677(-2755, (long) var173);
                if (var175 != null) {
                    method1170(var175.field2940 != var172, var175, 1540);
                }
                class125.method801(var174, var172, var173, (byte) 35);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 3) {
                class111.field2070 = true;
                class34.field743 = class70.field1358.method751((byte) 126);
                class35.field766 = class70.field1358.method751((byte) -102);
                class19.field410 = class70.field1358.method755((byte) -89);
                class64.field1254 = class70.field1358.method751((byte) -73);
                class75.field1479 = class70.field1358.method751((byte) 103);
                if (class75.field1479 >= 100) {
                    int var176 = class34.field743 * 128 + 64;
                    int var177 = class35.field766 * 128 + 64;
                    int var178 = class56.method361(class172.field3347, var177, (byte) -78, var176) - class19.field410;
                    int var179 = var176 - class62.field1225;
                    int var180 = var177 - class97.field1778;
                    int var181 = var178 - class168.field3246;
                    int var182 = (int) Math.sqrt((double) (var179 * var179 + var180 * var180));
                    class186.field3635 = (int) (Math.atan2((double) var181, (double) var182) * 325.949D) & 0x7FF;
                    class183.field3595 = (int) (Math.atan2((double) var179, (double) var180) * -325.949D) & 0x7FF;
                    if (class186.field3635 < 128) {
                        class186.field3635 = 128;
                    }
                    if (class186.field3635 > 383) {
                        class186.field3635 = 383;
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 206) {
                class55.field1094 = 0;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 150) {
                class174.method1164(22);
                class122.field2297 = class70.field1358.method751((byte) -50);
                class117.field2158 = class34.field741;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 92) {
                class64.field1256 = class70.field1358.method751((byte) 99);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 147) {
                int var183 = class70.field1358.method742((byte) -98);
                int var184 = class70.field1358.method742((byte) -98);
                int var185 = class70.field1358.method742((byte) -98);
                int var186 = class70.field1358.method748(255);
                class165 var187 = class103.method639(var186, true);
                if (var187.field3125 != var184 || var187.field3115 != var183 || var187.field3141 != var185) {
                    var187.field3141 = var185;
                    var187.field3125 = var184;
                    var187.field3115 = var183;
                    class209.method1379(1, var187);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 23) {
                int var188 = class70.field1358.method755((byte) -34);
                class25.method197(var188, arg0 + 752883968);
                class175.field3440[class209.method1383(31, class196.field3818++)] = class209.method1383(var188, 32767);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 199) {
                int var189 = class70.field1358.method779(arg0 + 752916236);
                int var190 = class70.field1358.method751((byte) -114);
                int var191 = class70.field1358.method753(255);
                class172.field3347 = var189 >> 1;
                class175.field3447.method970(128, (var189 & 0x1) == 1, var191, var190);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 115) {
                int var192 = class70.field1358.method784((byte) 38);
                class173 var193 = class70.field1358.method746(-19941);
                class165 var194 = class103.method639(var192, true);
                if (!var193.method1128(false, var194.field3129)) {
                    var194.field3129 = var193;
                    class209.method1379(1, var194);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 47) {
                class173 var195 = class70.field1358.method746(-19941);
                if (var195.method1131(126, class22.field484)) {
                    class173 var196 = var195.method1155(0, var195.method1151(class145.field2726, false), (byte) 115);
                    long var197 = var196.method1132(arg0 ^ 0xD31FA446);
                    boolean var199 = false;
                    for (int var200 = 0; var200 < class149.field2840; var200++) {
                        if (class52.field1074[var200] == var197) {
                            var199 = true;
                            break;
                        }
                    }
                    if (!var199 && class195.field3786 == 0) {
                        class166.method1074(var196, 4, class58.field1150, -88);
                    }
                } else if (var195.method1131(126, class216.field4181)) {
                    class173 var224 = var195.method1155(0, var195.method1151(class145.field2726, false), (byte) 118);
                    long var225 = var224.method1132(102);
                    boolean var227 = false;
                    for (int var228 = 0; var228 < class149.field2840; var228++) {
                        if (class52.field1074[var228] == var225) {
                            var227 = true;
                            break;
                        }
                    }
                    if (!var227 && class195.field3786 == 0) {
                        class173 var229 = var195.method1155(var195.method1151(class145.field2726, false) + 1, var195.method1153((byte) -127) - 9, (byte) 118);
                        class166.method1074(var224, 8, var229, -94);
                    }
                } else if (var195.method1131(126, class164.field3030)) {
                    boolean var201 = false;
                    class173 var202 = var195.method1155(0, var195.method1151(class145.field2726, false), (byte) 120);
                    long var203 = var202.method1132(arg0 ^ 0xD31FA45D);
                    for (int var205 = 0; var205 < class149.field2840; var205++) {
                        if (class52.field1074[var205] == var203) {
                            var201 = true;
                            break;
                        }
                    }
                    if (!var201 && class195.field3786 == 0) {
                        class166.method1074(var202, 10, class208.field4049, arg0 ^ 0xD31FA471);
                    }
                } else if (var195.method1131(arg0 ^ 0xD31FA45E, class38.field798)) {
                    class173 var223 = var195.method1155(0, var195.method1151(class38.field798, false), (byte) 104);
                    class166.method1074(class208.field4049, 11, var223, 116);
                } else if (var195.method1131(125, class17.field367)) {
                    class173 var206 = var195.method1155(0, var195.method1151(class17.field367, false), (byte) 90);
                    if (class195.field3786 == 0) {
                        class166.method1074(class208.field4049, 12, var206, -63);
                    }
                } else if (var195.method1131(126, class196.field3828)) {
                    class173 var222 = var195.method1155(0, var195.method1151(class196.field3828, false), (byte) 123);
                    if (class195.field3786 == 0) {
                        class166.method1074(class208.field4049, 13, var222, -114);
                    }
                } else if (var195.method1131(126, class94.field1760)) {
                    class173 var217 = var195.method1155(0, var195.method1151(class145.field2726, false), (byte) 85);
                    long var218 = var217.method1132(122);
                    boolean var220 = false;
                    for (int var221 = 0; var221 < class149.field2840; var221++) {
                        if (class52.field1074[var221] == var218) {
                            var220 = true;
                            break;
                        }
                    }
                    if (!var220 && class195.field3786 == 0) {
                        class166.method1074(var217, 14, class208.field4049, 88);
                    }
                } else if (var195.method1131(arg0 ^ 0xD31FA458, class111.field2057)) {
                    class173 var212 = var195.method1155(0, var195.method1151(class145.field2726, false), (byte) 105);
                    boolean var213 = false;
                    long var214 = var212.method1132(114);
                    for (int var216 = 0; var216 < class149.field2840; var216++) {
                        if (class52.field1074[var216] == var214) {
                            var213 = true;
                            break;
                        }
                    }
                    if (!var213 && class195.field3786 == 0) {
                        class166.method1074(var212, 15, class208.field4049, 106);
                    }
                } else if (var195.method1131(127, class155.field2921)) {
                    class173 var207 = var195.method1155(0, var195.method1151(class145.field2726, false), (byte) 98);
                    long var208 = var207.method1132(125);
                    boolean var210 = false;
                    for (int var211 = 0; var211 < class149.field2840; var211++) {
                        if (class52.field1074[var211] == var208) {
                            var210 = true;
                            break;
                        }
                    }
                    if (!var210 && class195.field3786 == 0) {
                        class166.method1074(var207, 16, class208.field4049, 125);
                    }
                } else {
                    class166.method1074(class208.field4049, 0, var195, -102);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 118) {
                class174.method1164(26);
                class205.field4017 = class70.field1358.method782(true);
                class96.field1764 = -1;
                class117.field2158 = class34.field741;
                return true;
            }
            if (class96.field1764 == 188) {
                int var230 = class70.field1358.method751((byte) 115);
                if (class70.field1358.method751((byte) 105) == 0) {
                    field3459[var230] = new class135();
                } else {
                    class70.field1358.field2222--;
                    field3459[var230] = new class135(class70.field1358);
                }
                class133.field2512 = class34.field741;
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 221) {
                client.field636 = class70.field1358.method751((byte) -52);
                class10.field174 = class70.field1358.method779(15151);
                while (class70.field1358.field2222 < class45.field919) {
                    class96.field1764 = class70.field1358.method751((byte) -121);
                    class174.method1166((byte) -117);
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 111) {
                int var231 = class70.field1358.method776(95);
                int var232 = class70.field1358.method755((byte) -87);
                class165 var233;
                if (var231 < 0) {
                    var233 = null;
                } else {
                    var233 = class103.method639(var231, true);
                }
                if (var231 < -70000) {
                    var232 += 32768;
                }
                while (class45.field919 > class70.field1358.field2222) {
                    int var234 = class70.field1358.method734(-1);
                    int var235 = 0;
                    int var236 = class70.field1358.method755((byte) -75);
                    if (var236 != 0) {
                        var235 = class70.field1358.method751((byte) -83);
                        if (var235 == 255) {
                            var235 = class70.field1358.method776(-82);
                        }
                    }
                    if (var233 != null && var234 >= 0 && var233.field3111.length > var234) {
                        var233.field3111[var234] = var236;
                        var233.field3102[var234] = var235;
                    }
                    class196.method1306(0, var235, var234, var236 - 1, var232);
                }
                if (var233 != null) {
                    class209.method1379(arg0 + 752901086, var233);
                }
                class174.method1164(69);
                class175.field3440[class209.method1383(class196.field3818++, 31)] = class209.method1383(var232, 32767);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 222) {
                class74.method460((byte) -106);
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 135) {
                class173 var237 = class70.field1358.method746(arg0 ^ 0x2CE01638);
                int var238 = class70.field1358.method753(arg0 ^ 0xD31FA4DC);
                int var239 = class70.field1358.method735((byte) -51);
                if (var239 >= 1 && var239 <= 8) {
                    if (var237.method1123(84, class157.field2953)) {
                        var237 = null;
                    }
                    class135.field2557[var239 - 1] = var237;
                    class157.field2944[var239 - 1] = var238 == 0;
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 102) {
                long var240 = class70.field1358.method759(true);
                int var242 = class70.field1358.method755((byte) -27);
                int var243 = class70.field1358.method751((byte) 107);
                class173 var244 = class208.field4049;
                if (var242 > 0) {
                    var244 = class70.field1358.method746(-19941);
                }
                class173 var245 = class22.method185(-23750, var240).method1142(-98);
                for (int var246 = 0; var246 < class129.field2442; var246++) {
                    if (class209.field4061[var246] == var240) {
                        if (class181.field3557[var246] != var242) {
                            class181.field3557[var246] = var242;
                            if (var242 > 0) {
                                class166.method1074(class208.field4049, 5, class173.method1158(-3, new class173[] { var245, class133.field2527 }), arg0 + 752901168);
                            }
                            if (var242 == 0) {
                                class166.method1074(class208.field4049, 5, class173.method1158(-3, new class173[] { var245, class183.field3588 }), 116);
                            }
                        }
                        class62.field1228[var246] = var244;
                        class207.field4031[var246] = var243;
                        var245 = null;
                        break;
                    }
                }
                boolean var247 = false;
                if (var245 != null && class129.field2442 < 200) {
                    class209.field4061[class129.field2442] = var240;
                    class159.field2972[class129.field2442] = var245;
                    class181.field3557[class129.field2442] = var242;
                    class62.field1228[class129.field2442] = var244;
                    class207.field4031[class129.field2442] = var243;
                    class129.field2442++;
                }
                int var248 = class129.field2442;
                class189.field3692 = class34.field741;
                while (var248 > 0) {
                    var248--;
                    boolean var249 = true;
                    for (int var250 = 0; var250 < var248; var250++) {
                        if (class181.field3557[var250] != class133.field2521 && class181.field3557[var250 + 1] == class133.field2521 || class181.field3557[var250] == 0 && class181.field3557[var250 + 1] != 0) {
                            var249 = false;
                            int var251 = class181.field3557[var250];
                            class181.field3557[var250] = class181.field3557[var250 + 1];
                            class181.field3557[var250 + 1] = var251;
                            class173 var252 = class62.field1228[var250];
                            class62.field1228[var250] = class62.field1228[var250 + 1];
                            class62.field1228[var250 + 1] = var252;
                            class173 var253 = class159.field2972[var250];
                            class159.field2972[var250] = class159.field2972[var250 + 1];
                            class159.field2972[var250 + 1] = var253;
                            long var254 = class209.field4061[var250];
                            class209.field4061[var250] = class209.field4061[var250 + 1];
                            class209.field4061[var250 + 1] = var254;
                            int var256 = class207.field4031[var250];
                            class207.field4031[var250] = class207.field4031[var250 + 1];
                            class207.field4031[var250 + 1] = var256;
                        }
                    }
                    if (var249) {
                        break;
                    }
                }
                class96.field1764 = -1;
                return true;
            }
            if (class96.field1764 == 53) {
                class12.field199 = class70.field1358.method785(arg0 + 752901084) * 30;
                class96.field1764 = -1;
                class117.field2158 = class34.field741;
                return true;
            }
            if (class96.field1764 == 127) {
                int var257 = class70.field1358.method751((byte) 110);
                int var258 = class70.field1358.method751((byte) -58);
                int var259 = class70.field1358.method751((byte) 109);
                int var260 = class70.field1358.method751((byte) -73);
                int var261 = class70.field1358.method755((byte) -22);
                class54.field1085[var257] = true;
                class97.field1774[var257] = var258;
                class129.field2432[var257] = var259;
                class117.field2159[var257] = var260;
                class124.field2334[var257] = var261;
                class96.field1764 = -1;
                return true;
            }
            class74.method461((byte) -115, null, "T1 - " + class96.field1764 + "," + class66.field1278 + "," + field3451 + " - " + class45.field919);
            class182.method1240(false);
        } catch (IOException var265) {
            class11.method71(arg0 + 752883015);
        } catch (Exception var266) {
            String var263 = "T2 - " + class96.field1764 + "," + class66.field1278 + "," + field3451 + " - " + class45.field919 + "," + (class175.field3447.field2764[0] + class108.field2024) + "," + (class175.field3447.field2814[0] + class43.field874) + " - ";
            for (int var264 = 0; class45.field919 > var264 && var264 < 50; var264++) {
                var263 = var263 + class70.field1358.field2218[var264] + ",";
            }
            class74.method461((byte) -128, var266, var263);
            class182.method1240(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lfa;IIIIIII)V")
    public static final void method1172(class52 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class98.field1791;
        int var10;
        int var11 = var10 = (arg7 << 7) - class161.field2998;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class124.field2328[arg1][arg6][arg7] - class106.field1984;
        int var17 = class124.field2328[arg1][arg6 + 1][arg7] - class106.field1984;
        int var18 = class124.field2328[arg1][arg6 + 1][arg7 + 1] - class106.field1984;
        int var19 = class124.field2328[arg1][arg6][arg7 + 1] - class106.field1984;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class72.field1411;
        int var45 = (var23 << 9) / var24 + class72.field1398;
        int var46 = (var26 << 9) / var30 + class72.field1411;
        int var47 = (var29 << 9) / var30 + class72.field1398;
        int var48 = (var32 << 9) / var36 + class72.field1411;
        int var49 = (var35 << 9) / var36 + class72.field1398;
        int var50 = (var38 << 9) / var42 + class72.field1411;
        int var51 = (var41 << 9) / var42 + class72.field1398;
        class72.field1409 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class97.field1773 && class134.method850(class3.field23, class57.field1142, var49, var51, var47, var48, var50, var46)) {
                class116.field2154 = arg6;
                class139.field2598 = arg7;
            }
            class72.field1407 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class72.field1402 || var50 > class72.field1402 || var46 > class72.field1402) {
                class72.field1407 = true;
            }
            if (arg0.field1065 == -1) {
                if (arg0.field1066 != 12345678) {
                    class72.method433(var49, var51, var47, var48, var50, var46, arg0.field1066, arg0.field1069, arg0.field1060);
                }
            } else if (class217.field4200) {
                int var52 = class72.field1400.method15(arg0.field1065, 58);
                class72.method433(var49, var51, var47, var48, var50, var46, class126.method806(var52, arg0.field1066), class126.method806(var52, arg0.field1069), class126.method806(var52, arg0.field1060));
            } else if (arg0.field1061) {
                class72.method446(var49, var51, var47, var48, var50, var46, arg0.field1066, arg0.field1069, arg0.field1060, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1065);
            } else {
                class72.method446(var49, var51, var47, var48, var50, var46, arg0.field1066, arg0.field1069, arg0.field1060, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field1065);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class97.field1773 && class134.method850(class3.field23, class57.field1142, var45, var47, var51, var44, var46, var50)) {
            class116.field2154 = arg6;
            class139.field2598 = arg7;
        }
        class72.field1407 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class72.field1402 || var46 > class72.field1402 || var50 > class72.field1402) {
            class72.field1407 = true;
        }
        if (arg0.field1065 != -1) {
            if (!class217.field4200) {
                class72.method446(var45, var47, var51, var44, var46, var50, arg0.field1062, arg0.field1060, arg0.field1069, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1065);
                return;
            }
            int var53 = class72.field1400.method15(arg0.field1065, 110);
            class72.method433(var45, var47, var51, var44, var46, var50, class126.method806(var53, arg0.field1062), class126.method806(var53, arg0.field1060), class126.method806(var53, arg0.field1069));
        } else if (arg0.field1062 != 12345678) {
            class72.method433(var45, var47, var51, var44, var46, var50, arg0.field1062, arg0.field1060, arg0.field1069);
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static void method1173(byte arg0) {
        field3459 = null;
        field3455 = null;
        field3456 = null;
        if (arg0 < -28) {
            field3450 = null;
        }
    }
}
