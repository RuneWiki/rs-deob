import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class65 extends class120 {

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field912 = 2;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILbd;B)V")
    public static final void method445(int arg0, int arg1, class186 arg2, byte arg3) {
        field908++;
        if ((arg0 & 0x8) != 0) {
            int var4 = class235.field3766.method192((byte) -20);
            int var5 = class235.field3766.method173((byte) 44);
            arg2.method573(107, var5, var4, class111.field1684);
            arg2.field1220 = class111.field1684 + 300;
            arg2.field1255 = class235.field3766.method173((byte) 44);
        }
        if ((arg0 & 0x10) != 0) {
            int var6 = class235.field3766.method198(3);
            int var7 = class235.field3766.method197(128);
            int var8 = class235.field3766.method197(128);
            boolean var9 = (var6 & 0x8000) != 0;
            int var10 = class235.field3766.field349;
            if (arg2.field2912 != null && arg2.field2941 != null) {
                boolean var11 = false;
                long var12 = class162.method1116(arg2.field2912, (byte) 104);
                if (var7 <= 1) {
                    if (!var9 && (class172.field2700 && !class121.field1763 || class50.field666)) {
                        var11 = true;
                    } else {
                        for (int var14 = 0; var14 < class141.field2066; var14++) {
                            if (class46.field590[var14] == var12) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class207.field3237 == 0) {
                    int var15 = -1;
                    class84.field1317.field349 = 0;
                    class235.field3766.method185(0, class84.field1317.field339, var8, -73);
                    class84.field1317.field349 = 0;
                    String var17;
                    if (var9) {
                        var6 &= 0x7FFF;
                        class199 var16 = class262.method1803((byte) 59, class84.field1317);
                        var15 = var16.field3116;
                        var17 = var16.field3119.method40(0, class84.field1317);
                    } else {
                        var17 = class188.method1306(class75.method511((byte) -109, class107.method699(32767, class84.field1317)));
                    }
                    arg2.field1278 = var17.trim();
                    arg2.field1194 = 150;
                    arg2.field1217 = var6 & 0xFF;
                    arg2.field1258 = var6 >> 8;
                    if (var7 == 2) {
                        class107.method700(var15, var9 ? 17 : 1, "<img=1>" + arg2.method1291(16), true, (String) null, var17);
                    } else if (var7 == 1) {
                        class107.method700(var15, var9 ? 17 : 1, "<img=0>" + arg2.method1291(16), true, (String) null, var17);
                    } else {
                        class107.method700(var15, var9 ? 17 : 2, arg2.method1291(16), true, (String) null, var17);
                    }
                }
            }
            class235.field3766.field349 = var10 + var8;
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field1216 = class235.field3766.method197(128);
            arg2.field1279 = class235.field3766.method175(79);
            arg2.field1250 = class235.field3766.method175(96);
            arg2.field1274 = class235.field3766.method197(128);
            arg2.field1208 = class235.field3766.method200((byte) -83) + class111.field1684;
            arg2.field1290 = class235.field3766.method190(-3) + class111.field1684;
            arg2.field1242 = class235.field3766.method175(112);
            arg2.field1246 = 1;
            arg2.field1224 = 0;
        }
        if ((arg0 & 0x1) != 0) {
            int var18 = class235.field3766.method190(-3);
            int var19 = class235.field3766.method197(128);
            if (var18 == 65535) {
                var18 = -1;
            }
            class232.method1586(1, var19, arg2, var18);
        }
        int var20 = -49 % ((arg3 - 42) / 37);
        if ((arg0 & 0x80) != 0) {
            arg2.field1281 = class235.field3766.method198(3);
            if (arg2.field1281 == 65535) {
                arg2.field1281 = -1;
            }
        }
        if ((arg0 & 0x2) != 0) {
            arg2.field1278 = class235.field3766.method189(false);
            if (arg2.field1278.charAt(0) == '~') {
                arg2.field1278 = arg2.field1278.substring(1);
                class106.method693(arg2.method1291(16), 2, arg2.field1278, (byte) -61);
            } else if (class149.field2227 == arg2) {
                class106.method693(arg2.method1291(16), 2, arg2.field1278, (byte) -82);
            }
            arg2.field1194 = 150;
            arg2.field1258 = 0;
            arg2.field1217 = 0;
        }
        if ((arg0 & 0x100) != 0) {
            int var21 = class235.field3766.method173((byte) 44);
            int[] var22 = new int[var21];
            int[] var23 = new int[var21];
            int[] var24 = new int[var21];
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = class235.field3766.method198(3);
                if (var26 == 65535) {
                    var26 = -1;
                }
                var24[var25] = var26;
                var23[var25] = class235.field3766.method201(255);
                var22[var25] = class235.field3766.method190(-3);
            }
            class164.method1126(var23, var24, arg2, var22, 56);
        }
        if ((arg0 & 0x20) != 0) {
            arg2.field1192 = class235.field3766.method200((byte) -83);
            arg2.field1225 = class235.field3766.method200((byte) -83);
        }
        if ((arg0 & 0x200) != 0) {
            int var27 = class235.field3766.method171(-1);
            if (var27 == 65535) {
                var27 = -1;
            }
            boolean var28 = true;
            int var29 = class235.field3766.method194(126);
            if (var27 != -1 && arg2.field1280 != -1 && class104.method688(class77.method521(var27, (byte) -42).field985, 30091).field3082 < class104.method688(class77.method521(arg2.field1280, (byte) -42).field985, 30091).field3082) {
                var28 = false;
            }
            if (var28) {
                arg2.field1266 = (var29 & 0xFFFF) + class111.field1684;
                arg2.field1195 = 0;
                arg2.field1280 = var27;
                arg2.field1191 = 1;
                arg2.field1190 = var29 >> 16;
                arg2.field1292 = 0;
                if (class111.field1684 < arg2.field1266) {
                    arg2.field1292 = -1;
                }
                if (arg2.field1280 != -1 && class111.field1684 == arg2.field1266) {
                    int var30 = class77.method521(arg2.field1280, (byte) -42).field985;
                    if (var30 != -1) {
                        class198 var31 = class104.method688(var30, 30091);
                        if (var31 != null && var31.field3107 != null) {
                            class279.method1870((byte) 65, class149.field2227 == arg2, var31, 0, arg2.field1226, arg2.field1273);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var32 = class235.field3766.method201(255);
            byte[] var33 = new byte[var32];
            class25 var34 = new class25(var33);
            class235.field3766.method203(var32, 0, 255, var33);
            class231.field3724[arg1] = var34;
            arg2.method1293(var34, 0);
        }
        if ((arg0 & 0x800) != 0) {
            int var35 = class235.field3766.method192((byte) -20);
            int var36 = class235.field3766.method175(127);
            arg2.method573(10, var36, var35, class111.field1684);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
    public static final void method446(int arg0, int arg1) {
        field907++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class100.field1553[arg1];
        int var3 = (int) class25.field347[arg1];
        int var4 = class2.field21[arg1];
        long var5 = class25.field347[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var7 = class222.field3591[arg1];
        if (var4 == 10) {
            class56 var8 = class100.field1566[var3];
            if (var8 != null) {
                class283.method1894((byte) 111, class149.field2227.field1272[0], false, 0, 2, 0, var8.field1272[0], var8.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class147.field2157 = 2;
                class38.field513 = class59.field836;
                class37.field481++;
                class272.field4322 = class145.field2140;
                class118.field1740 = 0;
                class13.field165.method892(121, (byte) -30);
                class13.field165.method221(arg0 - 2, var3);
            }
        }
        if (var4 == 41) {
            class198.method1364(var5, var2, 1454410990, var7);
            class261.field4218++;
            class13.field165.method892(252, (byte) -89);
            class13.field165.method223(-1720191288, class246.field3943 + var7);
            class13.field165.method193((byte) 126, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class13.field165.method221(arg0 - 2, class126.field1869 + var2);
        }
        if (var4 == 13) {
            class13.field165.method892(29, (byte) -122);
            class13.field165.method193((byte) -68, var3);
            class241.field3856++;
            class13.field165.method193((byte) -38, var2);
            class13.field165.method222(var7, arg0 ^ 0x3DA8);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 60) {
            if (class80.field1151 == 1) {
                class283.method1894((byte) 113, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            } else {
                boolean var9 = class283.method1894((byte) 124, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
                if (!var9) {
                    class283.method1894((byte) 97, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
                }
            }
            class38.field513 = class59.field836;
            class272.field4322 = class145.field2140;
            class118.field1740 = 0;
            class269.field4287++;
            class147.field2157 = 2;
            class13.field165.method892(38, (byte) -43);
            class13.field165.method178(arg0 ^ 0x82, class246.field3943 + var7);
            class13.field165.method178(128, var3);
            class13.field165.method221(arg0 - 2, class126.field1869 + var2);
        }
        if (var4 == 2) {
            class16.field185++;
            if (class80.field1151 == 1) {
                class283.method1894((byte) 114, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            } else {
                boolean var11 = class283.method1894((byte) 93, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
                if (!var11) {
                    class283.method1894((byte) 83, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
                }
            }
            class272.field4322 = class145.field2140;
            class118.field1740 = 0;
            class38.field513 = class59.field836;
            class147.field2157 = 2;
            class13.field165.method892(104, (byte) -33);
            class13.field165.method221(0, class126.field1869 + var2);
            class13.field165.method178(arg0 + 126, var3);
            class13.field165.method223(arg0 - 1720191290, class246.field3943 + var7);
        }
        if (var4 == 1007) {
            class214 var13 = class206.method1403((byte) 7, var7);
            if (var13 == null || var13.field3441[var2] < 100000) {
                class13.field165.method892(192, (byte) -115);
                class39.field540++;
                class13.field165.method193((byte) -33, var3);
            } else {
                class106.method693("", 0, var13.field3441[var2] + " x " + class162.method1112(var3, (byte) 123).field4035, (byte) -98);
            }
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 39) {
            class261.field4221++;
            boolean var14 = class283.method1894((byte) 122, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
            if (!var14) {
                class283.method1894((byte) 92, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            }
            class38.field513 = class59.field836;
            class147.field2157 = 2;
            class118.field1740 = 0;
            class272.field4322 = class145.field2140;
            class13.field165.method892(52, (byte) -23);
            class13.field165.method221(0, class246.field3943 + var7);
            class13.field165.method221(arg0 ^ 0x2, class63.field872);
            class13.field165.method221(0, class126.field1870);
            class13.field165.method223(-1720191288, var3);
            class13.field165.method166(class252.field4028, -3);
            class13.field165.method223(-1720191288, var2 + class126.field1869);
        }
        if (var4 == 50) {
            class222.method1509(29191);
        }
        if (var4 == 49) {
            if (var3 == 0) {
                class277.method1858(class276.field4398, var2, var7);
            } else if (var3 == 1) {
                if (class280.field4438 > 0 && class123.field1844[82] && class123.field1844[81]) {
                    class257.method1767(class126.field1869 + var2, class276.field4398, class246.field3943 + var7, arg0 + 29100);
                } else if (class283.method1894((byte) 95, class149.field2227.field1272[0], true, 0, 1, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0)) {
                    class13.field165.method184(class18.field219, 127);
                    class13.field165.method184(class41.field557, 90);
                    class13.field165.method223(-1720191288, class29.field392);
                    class13.field165.method184(57, arg0 ^ 0x7D);
                    class13.field165.method184(class68.field957, 93);
                    class13.field165.method184(class116.field1721, 98);
                    class13.field165.method184(89, 103);
                    class13.field165.method223(-1720191288, class149.field2227.field1226);
                    class13.field165.method223(-1720191288, class149.field2227.field1273);
                    class13.field165.method184(class177.field2768, 82);
                    class13.field165.method184(63, arg0 ^ 0x77);
                }
            }
        }
        if (var4 == 34) {
            boolean var16 = true;
            class214 var17 = class206.method1403((byte) 7, var7);
            if (var17.field3390 > 0) {
                var16 = class278.method1863((byte) -113, var17);
            }
            if (var16) {
                class13.field165.method892(214, (byte) -36);
                class13.field165.method166(var7, -3);
                class277.field4408++;
            }
        }
        if (var4 == 45) {
            if (class80.field1151 == 1) {
                class283.method1894((byte) 103, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            } else {
                boolean var18 = class283.method1894((byte) 111, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
                if (!var18) {
                    class283.method1894((byte) 106, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
                }
            }
            class38.field513 = class59.field836;
            class147.field2157 = 2;
            class50.field679++;
            class272.field4322 = class145.field2140;
            class118.field1740 = 0;
            class13.field165.method892(87, (byte) -62);
            class13.field165.method221(0, var2 + class126.field1869);
            class13.field165.method178(128, class246.field3943 + var7);
            class13.field165.method178(arg0 ^ 0x82, var3);
        }
        if (var4 == 24) {
            if (class80.field1151 == 1) {
                class283.method1894((byte) 76, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            } else {
                boolean var20 = class283.method1894((byte) 106, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
                if (!var20) {
                    class283.method1894((byte) 123, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
                }
            }
            class272.field4322 = class145.field2140;
            class118.field1740 = 0;
            class147.field2157 = 2;
            class7.field114++;
            class38.field513 = class59.field836;
            class13.field165.method892(51, (byte) -15);
            class13.field165.method223(-1720191288, var3);
            class13.field165.method178(128, class126.field1869 + var2);
            class13.field165.method193((byte) -116, var7 + class246.field3943);
        }
        if (var4 == 36) {
            class186 var22 = class153.field2277[var3];
            if (var22 != null) {
                class283.method1894((byte) 106, class149.field2227.field1272[0], false, 0, 2, 0, var22.field1272[0], var22.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class118.field1740 = 0;
                class38.field513 = class59.field836;
                class272.field4322 = class145.field2140;
                class147.field2157 = 2;
                class212.field3319++;
                class13.field165.method892(196, (byte) -51);
                class13.field165.method221(0, var3);
            }
        }
        if (var4 == 25 || var4 == 1006) {
            class280.method1872(var7, class19.field225[arg1], 871127916, var3, var2);
        }
        if (var4 == 6) {
            class56 var23 = class100.field1566[var3];
            if (var23 != null) {
                class227.field3663++;
                class283.method1894((byte) 77, class149.field2227.field1272[0], false, 0, 2, 0, var23.field1272[0], var23.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class147.field2157 = 2;
                class272.field4322 = class145.field2140;
                class38.field513 = class59.field836;
                class118.field1740 = 0;
                class13.field165.method892(147, (byte) -51);
                class13.field165.method193((byte) -42, var3);
            }
        }
        if (var4 == 57) {
            class13.field165.method892(176, (byte) -43);
            class203.field3174++;
            class13.field165.method178(128, var2);
            class13.field165.method210(var7, (byte) 72);
            class13.field165.method178(arg0 + 126, var3);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 23) {
            class186 var24 = class153.field2277[var3];
            if (var24 != null) {
                class283.method1894((byte) 121, class149.field2227.field1272[0], false, 0, 2, 0, var24.field1272[0], var24.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class118.field1740 = 0;
                class272.field4322 = class145.field2140;
                class218.field3549++;
                class147.field2157 = 2;
                class38.field513 = class59.field836;
                class13.field165.method892(141, (byte) -35);
                class13.field165.method178(arg0 + 126, var3);
            }
        }
        if (var4 == 29) {
            class186 var25 = class153.field2277[var3];
            if (var25 != null) {
                class283.method1894((byte) 117, class149.field2227.field1272[0], false, 0, 2, 0, var25.field1272[0], var25.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class272.field4322 = class145.field2140;
                class118.field1740 = 0;
                class38.field513 = class59.field836;
                class86.field1361++;
                class147.field2157 = 2;
                class13.field165.method892(77, (byte) -79);
                class13.field165.method223(-1720191288, var3);
            }
        }
        if (var4 == 46) {
            class13.field165.method892(188, (byte) -122);
            class13.field165.method178(arg0 + 126, var3);
            class136.field1981++;
            class13.field165.method166(class252.field4028, arg0 - 5);
            class13.field165.method178(arg0 + 126, class63.field872);
            class13.field165.method223(-1720191288, class126.field1870);
            class13.field165.method221(0, var2);
            class13.field165.method167(var7, arg0 - 1246958458);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 48) {
            class268.field4285++;
            class13.field165.method892(149, (byte) -29);
            class13.field165.method193((byte) -35, var3);
            class13.field165.method193((byte) -67, var2);
            class13.field165.method222(var7, 15786);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 11) {
            class163.method1123((byte) -88);
            class214 var26 = class206.method1403((byte) 7, var7);
            class63.field872 = var2;
            class126.field1870 = var3;
            class66.field921 = 1;
            class252.field4028 = var7;
            class55.method397(arg0 - 2, var26);
            class53.field736 = "<col=ff9040>" + class162.method1112(var3, (byte) 91).field4035 + "<col=ffffff>";
            if (class53.field736 == null) {
                class53.field736 = "null";
            }
            return;
        }
        if (var4 == 43) {
            class122.field1773++;
            class13.field165.method892(225, (byte) -47);
            class13.field165.method178(128, var2);
            class13.field165.method178(arg0 + 126, var3);
            class13.field165.method222(var7, 15786);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 1004) {
            class134.field1950++;
            class272.field4322 = class145.field2140;
            class147.field2157 = 2;
            class38.field513 = class59.field836;
            class118.field1740 = 0;
            class13.field165.method892(114, (byte) -43);
            class13.field165.method223(-1720191288, var3);
        }
        if (var4 == 32) {
            class13.field165.method892(110, (byte) -28);
            class13.field165.method193((byte) -50, var2);
            class13.field165.method166(var7, -3);
            class13.field165.method221(0, var3);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class102.field1587++;
            class75.field1067 = var2;
        }
        if (var4 == 18) {
            class149.field2200++;
            class13.field165.method892(123, (byte) -89);
            class13.field165.method222(var7, arg0 + 15784);
            class13.field165.method221(arg0 ^ 0x2, class50.field668);
            class13.field165.method221(arg0 ^ 0x2, var3);
            class13.field165.method167(class154.field2296, -1246958456);
            class13.field165.method223(-1720191288, var2);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 1002) {
            class198.method1364(var5, var2, 1454410990, var7);
            class13.field165.method892(97, (byte) -16);
            class63.field883++;
            class13.field165.method221(0, class246.field3943 + var7);
            class13.field165.method193((byte) -63, var2 + class126.field1869);
            class13.field165.method223(arg0 ^ 0x9977F6CA, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 35) {
            class198.method1364(var5, var2, arg0 + 1454410988, var7);
            class13.field165.method892(93, (byte) -62);
            class13.field165.method178(128, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class211.field3299++;
            class13.field165.method223(-1720191288, class126.field1869 + var2);
            class13.field165.method221(0, var7 + class246.field3943);
        }
        if (var4 == 19) {
            if (var3 == 0) {
                class130.field1909 = 1;
                class277.method1858(class276.field4398, var2, var7);
            } else if (class280.field4438 > 0 && class123.field1844[82] && class123.field1844[81]) {
                class257.method1767(class126.field1869 + var2, class276.field4398, class246.field3943 + var7, 29102);
            } else {
                class52.field714++;
                class13.field165.method892(215, (byte) -87);
                class13.field165.method223(-1720191288, class246.field3943 + var7);
                class13.field165.method221(0, class126.field1869 + var2);
            }
        }
        if (var4 == 17) {
            class198.method1364(var5, var2, 1454410990, var7);
            class13.field165.method892(12, (byte) -59);
            class164.field2547++;
            class13.field165.method178(128, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class13.field165.method178(arg0 ^ 0x82, class126.field1869 + var2);
            class13.field165.method193((byte) -58, class246.field3943 + var7);
        }
        if (var4 == 58) {
            class186 var27 = class153.field2277[var3];
            if (var27 != null) {
                class283.method1894((byte) 94, class149.field2227.field1272[0], false, 0, 2, 0, var27.field1272[0], var27.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class38.field513 = class59.field836;
                class203.field3176++;
                class272.field4322 = class145.field2140;
                class147.field2157 = 2;
                class118.field1740 = 0;
                class13.field165.method892(154, (byte) -98);
                class13.field165.method223(-1720191288, var3);
            }
        }
        if (var4 == 8) {
            class277.field4408++;
            class13.field165.method892(214, (byte) -77);
            class13.field165.method166(var7, -3);
            class214 var28 = class206.method1403((byte) 7, var7);
            if (var28.field3409 != null && var28.field3409[0][0] == 5) {
                int var29 = var28.field3409[0][1];
                class258.field4166[var29] = 1 - class258.field4166[var29];
                class124.method844(var29, arg0 ^ 0x4D);
            }
        }
        if (var4 == 42) {
            class186 var30 = class153.field2277[var3];
            if (var30 != null) {
                class283.method1894((byte) 112, class149.field2227.field1272[0], false, 0, 2, 0, var30.field1272[0], var30.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class64.field897++;
                class147.field2157 = 2;
                class272.field4322 = class145.field2140;
                class118.field1740 = 0;
                class38.field513 = class59.field836;
                class13.field165.method892(122, (byte) -94);
                class13.field165.method221(arg0 - 2, var3);
            }
        }
        if (var4 == 1) {
            class186 var31 = class153.field2277[var3];
            if (var31 != null) {
                class283.method1894((byte) 86, class149.field2227.field1272[0], false, 0, 2, 0, var31.field1272[0], var31.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class147.field2157 = 2;
                class118.field1740 = 0;
                class272.field4322 = class145.field2140;
                class38.field513 = class59.field836;
                class13.field165.method892(206, (byte) -45);
                class13.field165.method223(arg0 ^ 0x9977F6CA, var3);
                class13.field165.method193((byte) -128, class50.field668);
                class130.field1903++;
                class13.field165.method210(class154.field2296, (byte) 72);
            }
        }
        if (var4 == 5) {
            class13.field165.method892(218, (byte) -29);
            class190.field3005++;
            class13.field165.method178(128, var2);
            class13.field165.method167(var7, -1246958456);
            class13.field165.method221(0, var3);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 1003) {
            class147.field2157 = 2;
            class118.field1740 = 0;
            class39.field540++;
            class38.field513 = class59.field836;
            class272.field4322 = class145.field2140;
            class13.field165.method892(192, (byte) -51);
            class13.field165.method193((byte) 94, var3);
        }
        if (var4 == 14) {
            class186 var32 = class153.field2277[var3];
            if (var32 != null) {
                class85.field1330++;
                class283.method1894((byte) 93, class149.field2227.field1272[0], false, 0, 2, 0, var32.field1272[0], var32.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class38.field513 = class59.field836;
                class272.field4322 = class145.field2140;
                class147.field2157 = 2;
                class118.field1740 = 0;
                class13.field165.method892(211, (byte) -29);
                class13.field165.method221(0, var3);
            }
        }
        if (var4 == 3) {
            class212.field3313++;
            if (class80.field1151 == 1) {
                class283.method1894((byte) 84, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            } else {
                boolean var33 = class283.method1894((byte) 118, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
                if (!var33) {
                    class283.method1894((byte) 91, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
                }
            }
            class147.field2157 = 2;
            class118.field1740 = 0;
            class38.field513 = class59.field836;
            class272.field4322 = class145.field2140;
            class13.field165.method892(13, (byte) -30);
            class13.field165.method178(arg0 + 126, class246.field3943 + var7);
            class13.field165.method221(0, class126.field1869 + var2);
            class13.field165.method193((byte) -111, var3);
        }
        if (var4 == 15) {
            class214 var35 = class136.method918(var2, -21154, var7);
            if (var35 != null) {
                class163.method1123((byte) -19);
                class72 var36 = client.method1038(var35);
                class271.method1832(var35.field3421, var35.field3492, var7, 0, var36.method492((byte) -54), var36.field1024, var2);
                class66.field921 = 0;
                class30.field399 = class94.method630(var35, 124);
                if (class30.field399 == null) {
                    class30.field399 = "Null";
                }
                if (!var35.field3360) {
                    class155.field2307 = "<col=00ff00>" + var35.field3410 + "<col=ffffff>";
                    return;
                }
                class155.field2307 = var35.field3460 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 4) {
            class131.field1916++;
            class13.field165.method892(241, (byte) -47);
            class13.field165.method178(arg0 ^ 0x82, var3);
            class13.field165.method222(var7, 15786);
            class13.field165.method193((byte) -106, var2);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 9) {
            class13.field165.method892(145, (byte) -63);
            class23.field281++;
            class13.field165.method221(arg0 ^ 0x2, var3);
            class13.field165.method166(var7, -3);
            class13.field165.method178(128, var2);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 22) {
            class198.method1364(var5, var2, 1454410990, var7);
            class1.field11++;
            class13.field165.method892(223, (byte) -62);
            class13.field165.method178(128, class126.field1869 + var2);
            class13.field165.method221(0, class246.field3943 + var7);
            class13.field165.method178(128, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 38 && class198.method1364(var5, var2, arg0 + 1454410988, var7)) {
            class28.field387++;
            class13.field165.method892(54, (byte) -60);
            class13.field165.method193((byte) 109, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class13.field165.method178(128, class126.field1869 + var2);
            class13.field165.method223(arg0 - 1720191290, class50.field668);
            class13.field165.method223(-1720191288, class246.field3943 + var7);
            class13.field165.method166(class154.field2296, -3);
        }
        if (var4 == 30 && class249.field3995 == null) {
            class135.method916(var7, (byte) 8, var2);
            class249.field3995 = class136.method918(var2, -21154, var7);
            class55.method397(arg0 ^ 0x2, class249.field3995);
        }
        if (var4 == 33) {
            if (var3 == 0) {
                class73.field1041 = 1;
                class277.method1858(class276.field4398, var2, var7);
            } else if (var3 == 1) {
                class13.field165.method892(162, (byte) -90);
                class13.field165.method178(128, class126.field1869 + var2);
                class146.field2153++;
                class13.field165.method222(class154.field2296, 15786);
                class13.field165.method223(-1720191288, class50.field668);
                class13.field165.method193((byte) 119, class246.field3943 + var7);
            }
        }
        if (var4 == 47) {
            boolean var37 = class283.method1894((byte) 94, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 0, class149.field2227.field1257[0], 0);
            if (!var37) {
                class283.method1894((byte) 94, class149.field2227.field1272[0], false, 0, 2, 0, var7, var2, 0, 1, class149.field2227.field1257[0], 1);
            }
            class4.field59++;
            class272.field4322 = class145.field2140;
            class38.field513 = class59.field836;
            class118.field1740 = 0;
            class147.field2157 = 2;
            class13.field165.method892(233, (byte) -56);
            class13.field165.method193((byte) 95, class50.field668);
            class13.field165.method210(class154.field2296, (byte) 72);
            class13.field165.method223(-1720191288, var7 + class246.field3943);
            class13.field165.method223(-1720191288, class126.field1869 + var2);
            class13.field165.method223(-1720191288, var3);
        }
        if (var4 == 37) {
            class186 var39 = class153.field2277[var3];
            if (var39 != null) {
                class283.method1894((byte) 77, class149.field2227.field1272[0], false, 0, 2, 0, var39.field1272[0], var39.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class272.field4322 = class145.field2140;
                class38.field513 = class59.field836;
                class118.field1740 = 0;
                class147.field2157 = 2;
                class243.field3895++;
                class13.field165.method892(42, (byte) -117);
                class13.field165.method193((byte) 117, var3);
            }
        }
        if (var4 == 44 && class198.method1364(var5, var2, 1454410990, var7)) {
            class13.field165.method892(132, (byte) -85);
            class158.field2430++;
            class13.field165.method221(0, class63.field872);
            class13.field165.method178(128, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class13.field165.method223(arg0 ^ 0x9977F6CA, class126.field1870);
            class13.field165.method221(arg0 ^ 0x2, class126.field1869 + var2);
            class13.field165.method221(arg0 - 2, class246.field3943 + var7);
            class13.field165.method222(class252.field4028, 15786);
        }
        if (var4 == 16) {
            class56 var40 = class100.field1566[var3];
            if (var40 != null) {
                class283.method1894((byte) 86, class149.field2227.field1272[0], false, 0, 2, 0, var40.field1272[0], var40.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class118.field1740 = 0;
                class192.field3027++;
                class38.field513 = class59.field836;
                class272.field4322 = class145.field2140;
                class147.field2157 = 2;
                class13.field165.method892(92, (byte) -51);
                class13.field165.method221(0, var3);
            }
        }
        if (var4 == 20) {
            class56 var41 = class100.field1566[var3];
            if (var41 != null) {
                class172.field2691++;
                class283.method1894((byte) 127, class149.field2227.field1272[0], false, 0, 2, 0, var41.field1272[0], var41.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class147.field2157 = 2;
                class38.field513 = class59.field836;
                class118.field1740 = 0;
                class272.field4322 = class145.field2140;
                class13.field165.method892(25, (byte) -44);
                class13.field165.method178(128, var3);
                class13.field165.method193((byte) 119, class126.field1870);
                class13.field165.method222(class252.field4028, arg0 ^ 0x3DA8);
                class13.field165.method221(arg0 ^ 0x2, class63.field872);
            }
        }
        if (var4 == 7) {
            class186 var42 = class153.field2277[var3];
            if (var42 != null) {
                class203.field3178++;
                class283.method1894((byte) 91, class149.field2227.field1272[0], false, 0, 2, 0, var42.field1272[0], var42.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class118.field1740 = 0;
                class272.field4322 = class145.field2140;
                class38.field513 = class59.field836;
                class147.field2157 = 2;
                class13.field165.method892(43, (byte) -115);
                class13.field165.method178(128, var3);
            }
        }
        if (var4 == 21) {
            class228.field3691++;
            class13.field165.method892(229, (byte) -87);
            class13.field165.method221(0, var2);
            class13.field165.method166(var7, ~arg0);
            class13.field165.method223(-1720191288, var3);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 1001) {
            class147.field2157 = 2;
            class272.field4322 = class145.field2140;
            class118.field1740 = 0;
            class38.field513 = class59.field836;
            class56 var43 = class100.field1566[var3];
            if (var43 != null) {
                class136 var44 = var43.field793;
                if (var44.field1987 != null) {
                    var44 = var44.method928(12);
                }
                if (var44 != null) {
                    class228.field3690++;
                    class13.field165.method892(193, (byte) -68);
                    class13.field165.method221(0, var44.field1975);
                }
            }
        }
        if (arg0 != 2) {
            field912 = 29;
        }
        if (var4 == 12) {
            class186 var45 = class153.field2277[var3];
            if (var45 != null) {
                class74.field1059++;
                class283.method1894((byte) 116, class149.field2227.field1272[0], false, 0, 2, 0, var45.field1272[0], var45.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class147.field2157 = 2;
                class272.field4322 = class145.field2140;
                class38.field513 = class59.field836;
                class118.field1740 = 0;
                class13.field165.method892(181, (byte) -42);
                class13.field165.method221(0, class63.field872);
                class13.field165.method210(class252.field4028, (byte) 72);
                class13.field165.method221(0, var3);
                class13.field165.method178(128, class126.field1870);
            }
        }
        if (var4 == 40) {
            class40.field546++;
            class13.field165.method892(128, (byte) -82);
            class13.field165.method221(0, var2);
            class13.field165.method221(0, var3);
            class13.field165.method167(var7, -1246958456);
            class152.field2251 = 0;
            class262.field4229 = class206.method1403((byte) 7, var7);
            class75.field1067 = var2;
        }
        if (var4 == 28) {
            class56 var46 = class100.field1566[var3];
            if (var46 != null) {
                class99.field1539++;
                class283.method1894((byte) 118, class149.field2227.field1272[0], false, 0, 2, 0, var46.field1272[0], var46.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class118.field1740 = 0;
                class38.field513 = class59.field836;
                class147.field2157 = 2;
                class272.field4322 = class145.field2140;
                class13.field165.method892(216, (byte) -30);
                class13.field165.method178(128, var3);
            }
        }
        if (var4 == 51) {
            class56 var47 = class100.field1566[var3];
            if (var47 != null) {
                class56.field797++;
                class283.method1894((byte) 77, class149.field2227.field1272[0], false, 0, 2, 0, var47.field1272[0], var47.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class38.field513 = class59.field836;
                class272.field4322 = class145.field2140;
                class147.field2157 = 2;
                class118.field1740 = 0;
                class13.field165.method892(161, (byte) -109);
                class13.field165.method223(arg0 - 1720191290, var3);
            }
        }
        if (var4 == 26) {
            class56 var48 = class100.field1566[var3];
            if (var48 != null) {
                class107.field1649++;
                class283.method1894((byte) 83, class149.field2227.field1272[0], false, 0, 2, 0, var48.field1272[0], var48.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                class272.field4322 = class145.field2140;
                class38.field513 = class59.field836;
                class147.field2157 = 2;
                class118.field1740 = 0;
                class13.field165.method892(47, (byte) -82);
                class13.field165.method166(class154.field2296, -3);
                class13.field165.method193((byte) -35, class50.field668);
                class13.field165.method193((byte) 100, var3);
            }
        }
        if (var4 == 59) {
            class13.field165.method892(137, (byte) -55);
            class13.field165.method193((byte) 119, var2);
            class13.field165.method178(arg0 + 126, class50.field668);
            class13.field165.method222(class154.field2296, 15786);
            class13.field165.method166(var7, -3);
            class248.field3963++;
        }
        if (var4 == 31) {
            class13.field165.method892(214, (byte) -83);
            class13.field165.method166(var7, -3);
            class277.field4408++;
            class214 var49 = class206.method1403((byte) 7, var7);
            if (var49.field3409 != null && var49.field3409[0][0] == 5) {
                int var50 = var49.field3409[0][1];
                if (class258.field4166[var50] != var49.field3371[0]) {
                    class258.field4166[var50] = var49.field3371[0];
                    class124.method844(var50, 82);
                }
            }
        }
        if (class66.field921 != 0) {
            class66.field921 = 0;
            class55.method397(0, class206.method1403((byte) 7, class252.field4028));
        }
        if (class45.field572) {
            class163.method1123((byte) 108);
        }
        if (class262.field4229 != null && class152.field2251 == 0) {
            class55.method397(0, class262.field4229);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)V")
    public static final void method447(int arg0, int arg1) {
        class287 var2 = class261.method1786(arg1, false, 5);
        if (arg0 >= -26) {
            method447(110, -86);
        }
        field911++;
        var2.method1912((byte) -112);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)Z")
    public final boolean method448(byte arg0, int arg1, int arg2) {
        int var4 = 43 % ((63 - arg0) / 32);
        field905++;
        return this.field906 <= arg1 && arg1 <= this.field913 && arg2 >= this.field909 && this.field910 >= arg2;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIII)V")
    public class65(int arg0, int arg1, int arg2, int arg3) {
        this.field906 = arg0;
        this.field909 = arg1;
        this.field910 = arg3;
        this.field913 = arg2;
    }
}
