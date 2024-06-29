import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class314 implements class21 {

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[F")
    private float[] field5327 = new float[4];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
    public static boolean field5320 = false;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Z")
    public static boolean field5328 = true;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lve;")
    public static class255 field5331 = class87.method607(88, " <col=ffff00>");

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field5334 = -1;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lve;")
    private static class255 field5336 = class87.method607(78, "Connecting to update server");

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lve;")
    public static class255 field5332 = field5336;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    private int field5324;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lud;")
    public static class269 field5317;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lt;Z)I", line = 5)
    public static final int method2164(class242 arg0, boolean arg1) {
        field5330++;
        int var2 = arg0.field4050;
        if (arg0.field5114 == arg0.field5113) {
            var2 = arg0.field4084;
        } else if (arg0.field5145 == arg0.field5114) {
            var2 = arg0.field4071;
        }
        if (!arg1) {
            field5334 = 114;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 25)
    public static final int method2165(int arg0, int arg1) {
        if (arg0 != 12860) {
            field5317 = (class269) null;
        }
        field5318++;
        return arg1 == 16711935 ? -1 : class289.method2044(-111, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()I", line = 39)
    public final int method117() {
        field5322++;
        return 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIILme;IZJ)Z", line = 50)
    public static final boolean method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class177 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class279.field4783 == class106.field1783;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class29.field449 || var16 >= class315.field5347) {
                    return false;
                }
                class249 var17 = class118.field1984[arg0][var15][var16];
                if (var17 != null && var17.field4188 >= 5) {
                    return false;
                }
            }
        }
        class250 var18 = new class250();
        var18.field4206 = arg11;
        var18.field4211 = arg0;
        var18.field4214 = arg5;
        var18.field4203 = arg6;
        var18.field4204 = arg7;
        var18.field4215 = arg8;
        var18.field4217 = arg9;
        var18.field4212 = arg1;
        var18.field4216 = arg2;
        var18.field4207 = arg1 + arg3 - 1;
        var18.field4208 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class118.field1984[var22][var19][var20] == null) {
                        class118.field1984[var22][var19][var20] = new class249(var22, var19, var20);
                    }
                }
                class249 var23 = class118.field1984[arg0][var19][var20];
                var23.field4182[var23.field4188] = var18;
                var23.field4199[var23.field4188] = var21;
                var23.field4194 |= var21;
                var23.field4188++;
                if (var13 && class118.field1982[var19][var20] != 0) {
                    var14 = class118.field1982[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class118.field1982[var24][var25] == 0) {
                        class118.field1982[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class253.field4262[class124.field2058++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 183)
    private final void method2167(int arg0) {
        field5321++;
        GL var2 = class281.field4839;
        this.field5324 = var2.glGenLists(2);
        var2.glNewList(this.field5324, 4864);
        if (arg0 != -6565) {
            this.field5324 = -30;
        }
        var2.glActiveTexture(33985);
        if (class86.field1391) {
            var2.glBindTexture(32879, class86.field1394);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field5324 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class86.field1391) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILtl;)Lve;", line = 227)
    public static final class255 method2168(int arg0, class197 arg1) {
        field5326++;
        if (class64.method389(client.method1673(arg1), 265157387) == 0) {
            return null;
        } else if (arg0 != -1) {
            return (class255) null;
        } else if (arg1.field3414 == null || arg1.field3414.method1771(255).method1774(-41) == 0) {
            return class198.field3421 ? class92.field1581 : null;
        } else {
            return arg1.field3414;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V", line = 255)
    public static final void method2169(boolean arg0, int arg1) {
        if (arg0) {
            field5317 = (class269) null;
        }
        field5335++;
        class148.field2502.method562((byte) 82, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 269)
    public static final void method2170(int arg0, int arg1, int arg2) {
        field5333++;
        if (class136.field2272 < 2 && class72.field1182 == 0 && !class42.field653) {
            return;
        }
        class255 var3;
        if (class72.field1182 == 1 && class136.field2272 < 2) {
            var3 = class3.method14(new class255[] { class33.field527, class225.field3764, class123.field2044, class192.field3064 }, (byte) -99);
        } else if (class42.field653 && class136.field2272 < 2) {
            var3 = class3.method14(new class255[] { class82.field1342, class225.field3764, class254.field4285, class192.field3064 }, (byte) -61);
        } else {
            var3 = class9.method47(true, class136.field2272 - 1);
        }
        if (arg2 != 104) {
            return;
        }
        if (class136.field2272 > 2) {
            var3 = class3.method14(new class255[] { var3, class92.field1578, class215.method1532(class136.field2272 - 2, true), class67.field1001 }, (byte) -80);
        }
        int var4 = class277.field4761.method491(var3, arg0 + 4, arg1 + 15, 16777215, 0, class49.field732, class147.field2496);
        class124.method915(arg0 + 4, 15, -2, arg1, var4 + class277.field4761.method498(var3));
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "()V", line = 300)
    public final void method118() {
        field5325++;
        GL var1 = class281.field4839;
        var1.glCallList(this.field5324);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 319)
    public final void method116() {
        field5329++;
        GL var1 = class281.field4839;
        var1.glCallList(this.field5324 + 1);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 329)
    public class314() {
        this.method2167(-6565);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 340)
    public static final void method2171(byte arg0) {
        field5316++;
        if (class75.field1230 == 72) {
            int var129 = class160.field2692.method426((byte) -23);
            int var130 = class160.field2692.method473(-16350);
            int var131 = var130 & 0x3;
            int var132 = var130 >> 2;
            int var133 = class109.field1852[var132];
            int var134 = class160.field2692.method473(-16350);
            int var135 = class289.field4974 + (var134 & 0x7);
            int var136 = ((var134 & 0x70) >> 4) + class239.field3976;
            if (var136 >= 0 && var135 >= 0 && var136 < 104 && var135 < 104) {
                class255.method1758(var135, var133, 0, -29351, var131, var129, -1, var132, client.field4039, var136);
            }
        } else if (class75.field1230 == 0) {
            int var122 = class160.field2692.method431((byte) 50);
            int var123 = (var122 >> 4 & 0x7) + class239.field3976;
            int var124 = (var122 & 0x7) + class289.field4974;
            int var125 = class160.field2692.method423(255);
            int var126 = class160.field2692.method426((byte) -23);
            int var127 = class160.field2692.method476((byte) 72);
            if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104 && class14.field210 != var127) {
                class173 var128 = new class173();
                var128.field2859 = var125;
                var128.field2853 = var126;
                if (class16.field230[client.field4039][var123][var124] == null) {
                    class16.field230[client.field4039][var123][var124] = new class203();
                }
                class16.field230[client.field4039][var123][var124].method1472(true, new class159(var128));
                class298.method2094((byte) -122, var124, var123);
            }
        } else {
            if (arg0 <= 2) {
                method2165(98, -11);
            }
            if (class75.field1230 == 179) {
                int var113 = class160.field2692.method481(0);
                int var114 = class239.field3976 + ((var113 & 0x71) >> 4);
                int var115 = (var113 & 0x7) + class289.field4974;
                int var116 = class160.field2692.method423(255);
                int var117 = class160.field2692.method481(0);
                int var118 = class160.field2692.method423(255);
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var119 = var115 * 128 + 64;
                    int var120 = var114 * 128 + 64;
                    class128 var121 = new class128(var116, client.field4039, var120, var119, class113.method861((byte) 127, var120, var119, client.field4039) - var117, var118, class277.field4768);
                    class218.field3692.method1472(true, new class130(var121));
                }
            } else if (class75.field1230 == 188) {
                int var107 = class160.field2692.method423(255);
                int var108 = class160.field2692.method439(-32768);
                int var109 = class160.field2692.method431((byte) 72);
                int var110 = class239.field3976 + ((var109 & 0x7F) >> 4);
                int var111 = (var109 & 0x7) + class289.field4974;
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class173 var112 = new class173();
                    var112.field2853 = var108;
                    var112.field2859 = var107;
                    if (class16.field230[client.field4039][var110][var111] == null) {
                        class16.field230[client.field4039][var110][var111] = new class203();
                    }
                    class16.field230[client.field4039][var110][var111].method1472(true, new class159(var112));
                    class298.method2094((byte) -105, var111, var110);
                }
            } else if (class75.field1230 == 133) {
                int var1 = class160.field2692.method481(0);
                int var2 = class289.field4974 + (var1 & 0x7);
                int var3 = class239.field3976 + (var1 >> 4 & 0x7);
                int var4 = class160.field2692.method423(255);
                int var5 = class160.field2692.method423(255);
                int var6 = class160.field2692.method423(255);
                if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                    class203 var7 = class16.field230[client.field4039][var3][var2];
                    if (var7 != null) {
                        for (class159 var8 = (class159) var7.method1471((byte) 17); var8 != null; var8 = (class159) var7.method1475((byte) 83)) {
                            class173 var9 = var8.field2690;
                            if ((var4 & 0x7FFF) == var9.field2859 && var9.field2853 == var5) {
                                var9.field2853 = var6;
                                break;
                            }
                        }
                        class298.method2094((byte) -114, var2, var3);
                    }
                }
            } else if (class75.field1230 == 166) {
                int var99 = class160.field2692.method431((byte) 44);
                int var100 = (var99 & 0x7) + class289.field4974;
                int var101 = (var99 >> 4 & 0x7) + class239.field3976;
                int var102 = class160.field2692.method481(0);
                int var103 = var102 >> 2;
                int var104 = class109.field1852[var103];
                int var105 = var102 & 0x3;
                int var106 = class160.field2692.method426((byte) -23);
                if (var106 == 65535) {
                    var106 = -1;
                }
                class96.method755((byte) -121, var100, var101, var106, var103, var104, var105, client.field4039);
            } else {
                if (class75.field1230 == 243) {
                    byte var10 = class160.field2692.method466((byte) -90);
                    byte var11 = class160.field2692.method444(92);
                    int var12 = class160.field2692.method473(-16350);
                    int var13 = class239.field3976 + ((var12 & 0x7F) >> 4);
                    int var14 = class289.field4974 + (var12 & 0x7);
                    int var15 = class160.field2692.method431((byte) 76);
                    int var16 = var15 & 0x3;
                    int var17 = var15 >> 2;
                    int var18 = class109.field1852[var17];
                    byte var19 = class160.field2692.method466((byte) -109);
                    byte var20 = class160.field2692.method461(128);
                    int var21 = class160.field2692.method423(255);
                    int var22 = class160.field2692.method423(255);
                    int var23 = class160.field2692.method423(255);
                    int var24 = class160.field2692.method426((byte) -23);
                    class242 var25;
                    if (class14.field210 == var23) {
                        var25 = class276.field4742;
                    } else {
                        var25 = class151.field2555[var23];
                    }
                    if (!class281.field4827 && var25 != null) {
                        class145 var26 = class289.method2046(-12453, var21);
                        int var27;
                        int var28;
                        if (var16 == 1 || var16 == 3) {
                            var28 = var26.field2444;
                            var27 = var26.field2442;
                        } else {
                            var27 = var26.field2444;
                            var28 = var26.field2442;
                        }
                        int var29 = var13 + (var28 >> 1);
                        int var30 = (var28 + 1 >> 1) + var13;
                        int[][] var31 = (int[][]) null;
                        int var32 = var14 + (var27 + 1 >> 1);
                        if (client.field4039 < 3) {
                            var31 = class106.field1783[client.field4039 + 1];
                        }
                        int[][] var33 = class106.field1783[client.field4039];
                        int var34 = (var27 >> 1) + var14;
                        int var35 = var33[var29][var32] + var33[var30][var32] + var33[var29][var34] + var33[var30][var34] >> 2;
                        int var36 = (var13 << 7) + (var28 << 6);
                        int var37 = (var14 << 7) + (var27 << 6);
                        class209 var38 = var26.method1077(var17, var31, var35, var16, var33, var36, false, -74, var26.field2480, var37, (class273) null);
                        if (var38 != null) {
                            if (var20 < var11) {
                                byte var39 = var11;
                                var11 = var20;
                                var20 = var39;
                            }
                            class255.method1758(var14, var18, var22 + 1, -29351, 0, -1, var24 + 1, 0, client.field4039, var13);
                            var25.field4065 = var35;
                            var25.field4058 = var13 * 128 + (var28 * 64);
                            if (var10 > var19) {
                                byte var40 = var10;
                                var10 = var19;
                                var19 = var40;
                            }
                            var25.field4078 = class277.field4768 + var24;
                            var25.field4088 = class277.field4768 + var22;
                            var25.field4073 = var11 + var13;
                            var25.field4059 = var14 + var10;
                            var25.field4072 = var13 + var20;
                            var25.field4077 = var14 * 128 + var27 * 64;
                            var25.field4063 = var14 + var19;
                            var25.field4055 = (class227) var38.field3573;
                        }
                    }
                }
                if (class75.field1230 == 5) {
                    int var92 = class160.field2692.method431((byte) 62);
                    int var93 = (var92 >> 4 & 0x7) + class239.field3976;
                    int var94 = (var92 & 0x7) + class289.field4974;
                    int var95 = class160.field2692.method431((byte) 88);
                    int var96 = var95 >> 2;
                    int var97 = var95 & 0x3;
                    int var98 = class109.field1852[var96];
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        class255.method1758(var94, var98, 0, -29351, var97, -1, -1, var96, client.field4039, var93);
                    }
                } else if (class75.field1230 == 79) {
                    int var86 = class160.field2692.method439(-32768);
                    int var87 = class160.field2692.method482(6205);
                    int var88 = (var87 & 0x7) + class289.field4974;
                    int var89 = ((var87 & 0x7E) >> 4) + class239.field3976;
                    if (var89 >= 0 && var88 >= 0 && var89 < 104 && var88 < 104) {
                        class203 var90 = class16.field230[client.field4039][var89][var88];
                        if (var90 != null) {
                            for (class159 var91 = (class159) var90.method1471((byte) -87); var91 != null; var91 = (class159) var90.method1475((byte) 83)) {
                                if ((var86 & 0x7FFF) == var91.field2690.field2859) {
                                    var91.method1502((byte) -82);
                                    break;
                                }
                            }
                            if (var90.method1471((byte) 27) == null) {
                                class16.field230[client.field4039][var89][var88] = null;
                            }
                            class298.method2094((byte) -128, var88, var89);
                        }
                    }
                } else if (class75.field1230 == 254) {
                    int var77 = class160.field2692.method481(0);
                    int var78 = (var77 >> 4 & 0x7) + class239.field3976;
                    int var79 = (var77 & 0x7) + class289.field4974;
                    int var80 = class160.field2692.method423(255);
                    if (var80 == 65535) {
                        var80 = -1;
                    }
                    int var81 = class160.field2692.method481(0);
                    int var82 = var81 & 0x7;
                    int var83 = (var81 & 0xF5) >> 4;
                    int var84 = class160.field2692.method481(0);
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        int var85 = var83 + 1;
                        if (var78 - var85 <= class276.field4742.field5125[0] && var78 + var85 >= class276.field4742.field5125[0] && class276.field4742.field5154[0] >= (var79 - var85) && class276.field4742.field5154[0] <= var79 + var85 && class301.field5169 != 0 && var82 > 0 && class255.field4356 < 50 && var80 != -1) {
                            class25.field410[class255.field4356] = var80;
                            class124.field2054[class255.field4356] = var82;
                            class25.field406[class255.field4356] = var84;
                            class269.field4626[class255.field4356] = null;
                            class255.field4357[class255.field4356] = (var79 << 8) + (var78 << 16) + var83;
                            class255.field4356++;
                        }
                    }
                } else if (class75.field1230 == 229) {
                    int var41 = class160.field2692.method481(0);
                    int var42 = ((var41 & 0xF9) >> 4) + class239.field3976 * 2;
                    int var43 = class289.field4974 * 2 + (var41 & 0xF);
                    int var44 = var42 + class160.field2692.method466((byte) -88);
                    int var45 = class160.field2692.method466((byte) -113) + var43;
                    int var46 = class160.field2692.method454((byte) 84);
                    int var47 = class160.field2692.method423(255);
                    int var48 = class160.field2692.method481(0) * 4;
                    int var49 = class160.field2692.method481(0) * 4;
                    int var50 = class160.field2692.method423(255);
                    int var51 = class160.field2692.method423(255);
                    int var52 = class160.field2692.method481(0);
                    int var53 = class160.field2692.method481(0);
                    if (var42 >= 0 && var43 >= 0 && var42 < 208 && var43 < 208 && var44 >= 0 && var45 >= 0 && var44 < 208 && var45 < 208 && var47 != 65535) {
                        int var54 = var44 * 64;
                        int var55 = var45 * 64;
                        int var56 = var43 * 64;
                        int var57 = var42 * 64;
                        class30 var58 = new class30(var47, client.field4039, var57, var56, class113.method861((byte) -23, var57, var56, client.field4039) - var48, class277.field4768 + var50, class277.field4768 + var51, var52, var53, var46, var49);
                        var58.method169(var55, var50 + class277.field4768, class113.method861((byte) -56, var54, var55, client.field4039) - var49, var54, -32768);
                        class19.field312.method1472(true, new class298(var58));
                    }
                } else if (class75.field1230 == 117) {
                    int var59 = class160.field2692.method481(0);
                    int var60 = (var59 >> 4 & 0x7) + class239.field3976;
                    int var61 = (var59 & 0x7) + class289.field4974;
                    int var62 = class160.field2692.method466((byte) -99) + var60;
                    int var63 = var61 + class160.field2692.method466((byte) -23);
                    int var64 = class160.field2692.method454((byte) 84);
                    int var65 = class160.field2692.method423(255);
                    int var66 = class160.field2692.method481(0) * 4;
                    int var67 = class160.field2692.method481(0) * 4;
                    int var68 = class160.field2692.method423(255);
                    int var69 = class160.field2692.method423(255);
                    int var70 = class160.field2692.method481(0);
                    int var71 = class160.field2692.method481(0);
                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var65 != 65535) {
                        int var72 = var62 * 128 + 64;
                        int var73 = var61 * 128 + 64;
                        int var74 = var63 * 128 + 64;
                        int var75 = var60 * 128 + 64;
                        class30 var76 = new class30(var65, client.field4039, var75, var73, class113.method861((byte) -14, var75, var73, client.field4039) - var66, class277.field4768 + var68, var69 + class277.field4768, var70, var71, var64, var67);
                        var76.method169(var74, class277.field4768 + var68, class113.method861((byte) 121, var72, var74, client.field4039) + -var67, var72, -32768);
                        class19.field312.method1472(true, new class298(var76));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 882)
    public final void method119(int arg0) {
        field5319++;
        GL var2 = class281.field4839;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field5327[2] = 0.0F;
            this.field5327[0] = var6;
            this.field5327[1] = 0.0F;
            this.field5327[3] = 0.0F;
        } else {
            this.field5327[2] = var6;
            this.field5327[3] = 0.0F;
            this.field5327[0] = 0.0F;
            this.field5327[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class13.field180 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class213.field3641 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class258.field4388), (float) (-class224.field3751), (float) (-class276.field4738));
        var2.glTexGenfv(8192, 9474, this.field5327, 0);
        this.field5327[1] = var6;
        this.field5327[3] = (float) class281.field4810 * var3;
        this.field5327[2] = 0.0F;
        this.field5327[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field5327, 0);
        var2.glPopMatrix();
        if (class86.field1391) {
            this.field5327[1] = 0.0F;
            this.field5327[2] = 0.0F;
            this.field5327[3] = (float) class281.field4810 * var4;
            this.field5327[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5327, 0);
        } else {
            int var7 = (int) ((float) class281.field4810 * var4 * 64.0F);
            var2.glBindTexture(3553, class86.field1395[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 954)
    public static void method2172(byte arg0) {
        field5336 = null;
        field5332 = null;
        field5331 = null;
        field5317 = null;
        if (arg0 != -124) {
            method2169(true, -11);
        }
    }
}
