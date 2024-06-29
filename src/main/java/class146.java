import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class146 extends class300 {

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2175 = "wave2:";

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "J")
    public static long field2177 = 0L;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2180 = "white:";

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2183 = "wave2:";

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "Lac;")
    public static class153 field2184;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field2176;
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            class103.method695(var3, 0, class180.field2826, class235.field3797[arg0]);
        }
        return arg1 != -957953300 ? null : var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILvl;Lvl;)V")
    public static final void method993(int arg0, class73 arg1, class73 arg2) {
        class178.field2788 = class182.method1293(arg1, (byte) -126, class260.field4241, 0, arg2);
        ++field2179;
        int var3 = 93 / ((arg0 - 72) / 42);
        class142.field2074 = (class109) class178.field2788;
        class183.field2880 = class182.method1293(arg1, (byte) -128, class296.field4732, 0, arg2);
        class306.field4885 = class182.method1293(arg1, (byte) -125, class225.field3504, 0, arg2);
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public static void method994(int arg0) {
        field2183 = null;
        if (arg0 == 474) {
            field2184 = null;
            field2175 = null;
            field2180 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JB)V")
    public static final void method995(long arg0, byte arg1) {
        int var3 = class214.field3347.field3915 - -class97.field1466;
        if (!class180.field2832) {
            class215.field3356 += (float) arg0 * class233.field3768 / 40.0F;
            class144.field2145 += (float) arg0 * class296.field4731 / 40.0F;
        }
        ++field2178;
        if (arg1 != -21) {
            method998((byte) -8);
        }
        int var4 = class206.field3221 + class214.field3347.field3920;
        if (~(-var3 + class99.field1477) > 499 || -var3 + class99.field1477 > 500 || ~(-var4 + class263.field4271) > 499 || -var4 + class263.field4271 > 500) {
            class263.field4271 = var4;
            class99.field1477 = var3;
        }
        if (class99.field1477 != var3) {
            int var5 = var3 - class99.field1477;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (~var5 < -1) {
                if (~var6 != -1) {
                    if (var5 < var6) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
            } else if (var6 != 0) {
                if (~var5 < ~var6) {
                    var6 = var5;
                }
            } else {
                var6 = -1;
            }
            class99.field1477 += var6;
        }
        if (class263.field4271 != var4) {
            int var7 = -class263.field4271 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (~var7 < ~var8) {
                    var8 = var7;
                }
            } else if (~var8 != -1) {
                if (var7 < var8) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class263.field4271 += var8;
        }
        class186.method1312(false);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)Z")
    public static final boolean method996(byte arg0) throws IOException {
        ++field2182;
        if (class270.field4405 == null) {
            return false;
        } else {
            int var1 = class270.field4405.method558(-23644);
            if (~var1 == -1) {
                return false;
            } else {
                if (~class105.field1530 == 0) {
                    class270.field4405.method566(1, class175.field2763.field2650, false, 0);
                    --var1;
                    class175.field2763.field2676 = 0;
                    class105.field1530 = class175.field2763.method444((byte) 48);
                    class262.field4252 = class193.field3070[class105.field1530];
                }
                if (~class262.field4252 == 0) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class270.field4405.method566(1, class175.field2763.field2650, false, 0);
                    --var1;
                    class262.field4252 = class175.field2763.field2650[0] & 255;
                }
                if (class262.field4252 == -2) {
                    if (var1 <= 1) {
                        return false;
                    }
                    var1 -= 2;
                    class270.field4405.method566(2, class175.field2763.field2650, false, 0);
                    class175.field2763.field2676 = 0;
                    class262.field4252 = class175.field2763.method1186((byte) -35);
                }
                if (var1 < class262.field4252) {
                    return false;
                } else {
                    class175.field2763.field2676 = 0;
                    class270.field4405.method566(class262.field4252, class175.field2763.field2650, false, 0);
                    class303.field4812 = class158.field2372;
                    class158.field2372 = class297.field4735;
                    class297.field4735 = class105.field1530;
                    class215.field3354 = 0;
                    if (~class105.field1530 == -241) {
                        int var2 = class175.field2763.method1186((byte) -75);
                        int var3 = class175.field2763.method1218(-59);
                        int var4 = class175.field2763.method1218(-68);
                        int var5 = class175.field2763.method1186((byte) -93);
                        int var6 = class175.field2763.method1218(arg0 ^ -60);
                        int var7 = class175.field2763.method1218(-54);
                        if (class115.method761(-84, var2)) {
                            class52.method352(var7, var4, 29043, var3, var6, var5);
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 205) {
                        long var8 = class175.field2763.method1181(27081);
                        class175.field2763.method1215(arg0 ^ -247);
                        long var10 = class175.field2763.method1181(27081);
                        long var12 = (long) class175.field2763.method1186((byte) -93);
                        long var14 = (long) class175.field2763.method1212(arg0 + 460736967);
                        int var16 = class175.field2763.method1218(71);
                        int var17 = class175.field2763.method1186((byte) -76);
                        long var18 = (var12 << 32) + var14;
                        boolean var20 = false;
                        int var21 = 0;
                        label1220: while (true) {
                            if (var21 >= 100) {
                                if (var16 <= 1) {
                                    for (int var22 = 0; ~class84.field1302 < ~var22; ++var22) {
                                        if (~class58.field863[var22] == ~var8) {
                                            var20 = true;
                                            break label1220;
                                        }
                                    }
                                }
                                break;
                            }
                            if (~class273.field4439[var21] == ~var18) {
                                var20 = true;
                                break;
                            }
                            ++var21;
                        }
                        if (!var20 && ~class104.field1515 == -1) {
                            class273.field4439[class250.field4087] = var18;
                            class250.field4087 = (class250.field4087 + 1) % 100;
                            String var23 = class218.method1526(var17, false).method466(-25161, class175.field2763);
                            if (var16 != 2 && ~var16 != -4) {
                                if (~var16 == -2) {
                                    class102.method686(var23, class178.method1264(var10, (byte) 103), (byte) -92, "<img=0>" + class178.method1264(var8, (byte) 103), var17, 20);
                                } else {
                                    class102.method686(var23, class178.method1264(var10, (byte) 103), (byte) -115, class178.method1264(var8, (byte) 103), var17, 20);
                                }
                            } else {
                                class102.method686(var23, class178.method1264(var10, (byte) 103), (byte) -92, "<img=1>" + class178.method1264(var8, (byte) 103), var17, 20);
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -139) {
                        String var24 = class175.field2763.method1195(-1);
                        if (!var24.endsWith(":tradereq:")) {
                            if (!var24.endsWith(":chalreq:")) {
                                if (!var24.endsWith(":assistreq:")) {
                                    if (!var24.endsWith(":clan:")) {
                                        if (!var24.endsWith(":trade:")) {
                                            if (var24.endsWith(":assist:")) {
                                                String var25 = var24.substring(0, var24.indexOf(":assist:"));
                                                if (class104.field1515 == 0) {
                                                    class236.method1655(13, "", 108, var25);
                                                }
                                            } else if (!var24.endsWith(":duelstake:")) {
                                                if (var24.endsWith(":duelfriend:")) {
                                                    String var26 = var24.substring(0, var24.indexOf(":"));
                                                    long var27 = class176.method1256((byte) 127, var26);
                                                    boolean var29 = false;
                                                    for (int var30 = 0; var30 < class84.field1302; ++var30) {
                                                        if (class58.field863[var30] == var27) {
                                                            var29 = true;
                                                            break;
                                                        }
                                                    }
                                                    if (!var29 && class104.field1515 == 0) {
                                                        class236.method1655(15, var26, arg0 + 216, "");
                                                    }
                                                } else if (var24.endsWith(":clanreq:")) {
                                                    String var31 = var24.substring(0, var24.indexOf(":"));
                                                    long var32 = class176.method1256((byte) 127, var31);
                                                    boolean var34 = false;
                                                    for (int var35 = 0; class84.field1302 > var35; ++var35) {
                                                        if (~class58.field863[var35] == ~var32) {
                                                            var34 = true;
                                                            break;
                                                        }
                                                    }
                                                    if (!var34 && class104.field1515 == 0) {
                                                        class236.method1655(16, var31, arg0 ^ -9, "");
                                                    }
                                                } else if (!var24.endsWith(":allyreq:")) {
                                                    if (!var24.endsWith(":spam:")) {
                                                        class236.method1655(0, "", 92, var24);
                                                    } else {
                                                        String var36 = var24.substring(0, var24.length() + -6);
                                                        if (class104.field1515 == 0) {
                                                            class236.method1655(22, "", 123, var36);
                                                        }
                                                    }
                                                } else {
                                                    String var37 = var24.substring(0, var24.indexOf(":"));
                                                    long var38 = class176.method1256((byte) 127, var37);
                                                    boolean var40 = false;
                                                    for (int var41 = 0; ~var41 > ~class84.field1302; ++var41) {
                                                        if (~class58.field863[var41] == ~var38) {
                                                            var40 = true;
                                                            break;
                                                        }
                                                    }
                                                    if (!var40 && class104.field1515 == 0) {
                                                        String var42 = var24.substring(1 + var24.indexOf(":"), -9 + var24.length());
                                                        class236.method1655(21, var37, 121, var42);
                                                    }
                                                }
                                            } else {
                                                String var43 = var24.substring(0, var24.indexOf(":"));
                                                long var44 = class176.method1256((byte) 127, var43);
                                                boolean var46 = false;
                                                for (int var47 = 0; ~var47 > ~class84.field1302; ++var47) {
                                                    if (~class58.field863[var47] == ~var44) {
                                                        var46 = true;
                                                        break;
                                                    }
                                                }
                                                if (!var46 && ~class104.field1515 == -1) {
                                                    class236.method1655(14, var43, 111, "");
                                                }
                                            }
                                        } else {
                                            String var48 = var24.substring(0, var24.indexOf(":trade:"));
                                            if (~class104.field1515 == -1) {
                                                class236.method1655(12, "", arg0 + 240, var48);
                                            }
                                        }
                                    } else {
                                        String var49 = var24.substring(0, var24.indexOf(":clan:"));
                                        class236.method1655(11, "", 116, var49);
                                    }
                                } else {
                                    boolean var50 = false;
                                    String var51 = var24.substring(0, var24.indexOf(":"));
                                    long var52 = class176.method1256((byte) 127, var51);
                                    for (int var54 = 0; ~class84.field1302 < ~var54; ++var54) {
                                        if (class58.field863[var54] == var52) {
                                            var50 = true;
                                            break;
                                        }
                                    }
                                    if (!var50 && ~class104.field1515 == -1) {
                                        class236.method1655(10, var51, 94, "");
                                    }
                                }
                            } else {
                                String var55 = var24.substring(0, var24.indexOf(":"));
                                long var56 = class176.method1256((byte) 127, var55);
                                boolean var58 = false;
                                for (int var59 = 0; ~class84.field1302 < ~var59; ++var59) {
                                    if (~class58.field863[var59] == ~var56) {
                                        var58 = true;
                                        break;
                                    }
                                }
                                if (!var58 && ~class104.field1515 == -1) {
                                    String var60 = var24.substring(1 + var24.indexOf(":"), var24.length() - 9);
                                    class236.method1655(8, var55, 95, var60);
                                }
                            }
                        } else {
                            String var61 = var24.substring(0, var24.indexOf(":"));
                            boolean var62 = false;
                            long var63 = class176.method1256((byte) 127, var61);
                            for (int var65 = 0; ~var65 > ~class84.field1302; ++var65) {
                                if (class58.field863[var65] == var63) {
                                    var62 = true;
                                    break;
                                }
                            }
                            if (!var62 && ~class104.field1515 == -1) {
                                class236.method1655(4, var61, 112, class79.field1195);
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 60) {
                        class3.field43 = class175.field2763.method1218(112);
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -54) {
                        for (int var66 = 0; ~var66 > ~class299.field4770.length; ++var66) {
                            if (class299.field4770[var66] != class110.field1596[var66]) {
                                class299.field4770[var66] = class110.field1596[var66];
                                class61.method391(-7, var66);
                                class200.field3158[class205.method1411(31, class158.field2369++)] = var66;
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -11) {
                        int var67 = class175.field2763.method1189(arg0 ^ 16);
                        class163.method1127(127, var67);
                        class89.field1340[class205.method1411(31, class47.field597++)] = class205.method1411(32767, var67);
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -18) {
                        int var68 = class175.field2763.method1190(6345);
                        int var69 = class175.field2763.method1189(-47);
                        int var70 = class175.field2763.method1189(-85);
                        int var71 = class175.field2763.method1189(-100);
                        if (var68 >> 30 == 0) {
                            if (var68 >> 29 != 0) {
                                int var72 = var68 & 65535;
                                class86 var73 = class191.field3045[var72];
                                if (var73 != null) {
                                    boolean var74 = true;
                                    if (~var71 == -65536) {
                                        var71 = -1;
                                    }
                                    if (var71 != -1 && ~var73.field3904 != 0) {
                                        if (var73.field3904 == var71) {
                                            class214 var75 = class92.method629(var71, arg0 ^ -12407);
                                            if (var75.field3346 && ~var75.field3338 != 0) {
                                                class57 var76 = class174.method1241(-123, var75.field3338);
                                                int var77 = var76.field839;
                                                if (var77 == 1) {
                                                    var73.field3930 = 0;
                                                    var74 = false;
                                                    var73.field3893 = 1;
                                                    var73.field3935 = class311.field4996 + var70;
                                                    var73.field3909 = 0;
                                                    var73.field3953 = 0;
                                                    class173.method1240(var73.field3915, var73.field3920, -9160, false, var76, var73.field3930);
                                                } else if (~var77 == -3) {
                                                    var73.field3899 = 0;
                                                    var74 = false;
                                                }
                                            }
                                        } else {
                                            class214 var78 = class92.method629(var71, 12288);
                                            class214 var79 = class92.method629(var73.field3904, 12288);
                                            if (var78.field3338 != -1 && ~var79.field3338 != 0) {
                                                class57 var80 = class174.method1241(-127, var78.field3338);
                                                class57 var81 = class174.method1241(-122, var79.field3338);
                                                if (var81.field833 > var80.field833) {
                                                    var74 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var74) {
                                        var73.field3930 = 0;
                                        var73.field3935 = class311.field4996 + var70;
                                        var73.field3909 = 0;
                                        var73.field3963 = var69;
                                        var73.field3904 = var71;
                                        if (~class311.field4996 > ~var73.field3935) {
                                            var73.field3930 = -1;
                                        }
                                        var73.field3893 = 1;
                                        if (var73.field3904 != -1 && ~class311.field4996 == ~var73.field3935) {
                                            int var82 = class92.method629(var73.field3904, 12288).field3338;
                                            if (var82 != -1) {
                                                class57 var83 = class174.method1241(-18, var82);
                                                if (var83 != null && var83.field850 != null) {
                                                    class173.method1240(var73.field3915, var73.field3920, -9160, false, var83, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var68 >> 28 != 0) {
                                int var84 = 65535 & var68;
                                class1 var85;
                                if (~class22.field289 != ~var84) {
                                    var85 = class35.field409[var84];
                                } else {
                                    var85 = class214.field3347;
                                }
                                if (var85 != null) {
                                    boolean var86 = true;
                                    if (var71 == 65535) {
                                        var71 = -1;
                                    }
                                    if (var71 != -1 && var85.field3904 != -1) {
                                        if (var85.field3904 != var71) {
                                            class214 var87 = class92.method629(var71, 12288);
                                            class214 var88 = class92.method629(var85.field3904, arg0 ^ -12407);
                                            if (var87.field3338 != -1 && var88.field3338 != -1) {
                                                class57 var89 = class174.method1241(arg0 ^ -89, var87.field3338);
                                                class57 var90 = class174.method1241(-121, var88.field3338);
                                                if (~var89.field833 > ~var90.field833) {
                                                    var86 = false;
                                                }
                                            }
                                        } else {
                                            class214 var91 = class92.method629(var71, 12288);
                                            if (var91.field3346 && ~var91.field3338 != 0) {
                                                class57 var92 = class174.method1241(60, var91.field3338);
                                                int var93 = var92.field839;
                                                if (var93 == 1) {
                                                    var85.field3935 = class311.field4996 + var70;
                                                    var85.field3930 = 0;
                                                    var85.field3893 = 1;
                                                    var86 = false;
                                                    var85.field3909 = 0;
                                                    var85.field3953 = 0;
                                                    class173.method1240(var85.field3915, var85.field3920, -9160, false, var92, var85.field3930);
                                                } else if (var93 == 2) {
                                                    var85.field3899 = 0;
                                                    var86 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var86) {
                                        var85.field3904 = var71;
                                        var85.field3909 = 0;
                                        var85.field3893 = 1;
                                        if (var85.field3904 == 65535) {
                                            var85.field3904 = -1;
                                        }
                                        var85.field3935 = class311.field4996 + var70;
                                        var85.field3963 = var69;
                                        var85.field3930 = 0;
                                        if (var85.field3935 > class311.field4996) {
                                            var85.field3930 = -1;
                                        }
                                        if (var85.field3904 != -1 && class311.field4996 == var85.field3935) {
                                            int var94 = class92.method629(var85.field3904, 12288).field3338;
                                            if (~var94 != 0) {
                                                class57 var95 = class174.method1241(arg0 + -9, var94);
                                                if (var95 != null && var95.field850 != null) {
                                                    class173.method1240(var85.field3915, var85.field3920, -9160, class214.field3347 == var85, var95, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var96 = 3 & var68 >> 28;
                            int var97 = (16383 & var68 >> 14) + -class113.field1653;
                            int var98 = (16383 & var68) - class5.field77;
                            if (var97 >= 0 && var98 >= 0 && var97 < 104 && ~var98 > -105) {
                                int var99 = var97 * 128 - -64;
                                int var100 = var98 * 128 - -64;
                                class179 var101 = new class179(var71, var96, var99, var100, -var69 + class52.method351(-93, var100, var99, var96), var70, class311.field4996);
                                class181.field2857.method1540(new class97(var101), (byte) -85);
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -175) {
                        long var102 = class175.field2763.method1181(arg0 ^ -27072);
                        long var104 = (long) class175.field2763.method1186((byte) -127);
                        long var106 = (long) class175.field2763.method1212(460736848);
                        long var108 = (var104 << 32) + var106;
                        int var110 = class175.field2763.method1218(arg0 ^ -22);
                        boolean var111 = false;
                        int var112 = 0;
                        label1321: while (true) {
                            if (~var112 <= -101) {
                                if (~var110 >= -2) {
                                    if ((!class235.field3799 || class83.field1280) && !class211.field3283) {
                                        for (int var113 = 0; ~class84.field1302 < ~var113; ++var113) {
                                            if (class58.field863[var113] == var102) {
                                                var111 = true;
                                                break label1321;
                                            }
                                        }
                                    } else {
                                        var111 = true;
                                    }
                                }
                                break;
                            }
                            if (class273.field4439[var112] == var108) {
                                var111 = true;
                                break;
                            }
                            ++var112;
                        }
                        if (!var111 && ~class104.field1515 == -1) {
                            class273.field4439[class250.field4087] = var108;
                            class250.field4087 = (class250.field4087 + 1) % 100;
                            String var114 = class213.method1472(class128.method825(false, class277.method1920(class175.field2763, -111)));
                            if (var110 != 2 && var110 != 3) {
                                if (var110 != 1) {
                                    class236.method1655(3, class178.method1264(var102, (byte) 103), 127, var114);
                                } else {
                                    class236.method1655(7, "<img=0>" + class178.method1264(var102, (byte) 103), 109, var114);
                                }
                            } else {
                                class236.method1655(7, "<img=1>" + class178.method1264(var102, (byte) 103), 126, var114);
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -126) {
                        if (class262.field4252 != 0) {
                            class248.field4034 = class175.field2763.method1195(arg0 ^ 118);
                        } else {
                            class248.field4034 = class178.field2791;
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 243) {
                        class120.method785(arg0 + 119);
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 220) {
                        int var115 = class175.field2763.method1186((byte) -81);
                        String var116 = class175.field2763.method1195(-1);
                        int var117 = class175.field2763.method1166(-269096912);
                        if (class115.method761(arg0 + 209, var115)) {
                            class233.method1640(var117, var116, -126);
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -101) {
                        int var118 = class175.field2763.method1186((byte) -73);
                        int var119 = class175.field2763.method1209(arg0 ^ 118);
                        class253.method1798(var118, var119, arg0 + -8);
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 221) {
                        class222.method1573((byte) -81);
                        class105.field1530 = -1;
                        return false;
                    } else if (class105.field1530 == 211) {
                        int var120 = class175.field2763.method1172(true);
                        int var121 = class175.field2763.method1159((byte) -121);
                        int var122 = class175.field2763.method1209(-1);
                        if (class115.method761(33, var120)) {
                            class268.method1868(var122, var121, 113);
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -132) {
                        String var123 = class175.field2763.method1195(-1);
                        int var124 = class175.field2763.method1172(true);
                        int var125 = class175.field2763.method1200(128);
                        if (class115.method761(110, var125)) {
                            class9.method53(var123, -1, var124);
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 189) {
                        int var126 = class175.field2763.method1200(128);
                        int var127 = class175.field2763.method1186((byte) -101);
                        int var128 = class175.field2763.method1182((byte) -126);
                        if (class115.method761(arg0 ^ 30, var126)) {
                            if (var128 == 2) {
                                class75.method519(-16777216);
                            }
                            class238.field3824 = var127;
                            class181.method1287((byte) 121, var127);
                            class287.method1960(false, (byte) 45);
                            class303.method2033(-3, class238.field3824);
                            for (int var129 = 0; ~var129 > -101; ++var129) {
                                class302.field4808[var129] = true;
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 73) {
                        long var130 = class175.field2763.method1181(arg0 ^ -27072);
                        int var132 = class175.field2763.method1186((byte) -51);
                        byte var133 = class175.field2763.method1215(128);
                        boolean var134 = false;
                        if (~(Long.MIN_VALUE & var130) != -1L) {
                            var134 = true;
                        }
                        if (var134) {
                            if (~class220.field3456 == -1) {
                                class105.field1530 = -1;
                                return true;
                            }
                            long var135 = var130 & Long.MAX_VALUE;
                            boolean var137 = false;
                            int var138;
                            for (var138 = 0; class220.field3456 > var138 && (~class215.field3360[var138].field4018 != ~var135 || class215.field3360[var138].field505 != var132); ++var138) {
                            }
                            if (~class220.field3456 < ~var138) {
                                while (~(class220.field3456 + -1) < ~var138) {
                                    class215.field3360[var138] = class215.field3360[var138 + 1];
                                    ++var138;
                                }
                                --class220.field3456;
                                class215.field3360[class220.field3456] = null;
                            }
                        } else {
                            String var139 = class175.field2763.method1195(-1);
                            class41 var140 = new class41();
                            var140.field4018 = var130;
                            var140.field498 = class23.method124(var140.field4018, false);
                            var140.field501 = var139;
                            var140.field502 = var133;
                            var140.field505 = var132;
                            int var141;
                            for (var141 = class220.field3456 + -1; var141 >= 0; --var141) {
                                int var142 = class215.field3360[var141].field498.compareTo(var140.field498);
                                if (var142 == 0) {
                                    class215.field3360[var141].field505 = var132;
                                    class215.field3360[var141].field502 = var133;
                                    class215.field3360[var141].field501 = var139;
                                    if (class46.field564 == var130) {
                                        class312.field5007 = var133;
                                    }
                                    class105.field1530 = -1;
                                    class35.field420 = client.field3871;
                                    return true;
                                }
                                if (var142 < 0) {
                                    break;
                                }
                            }
                            if (class215.field3360.length <= class220.field3456) {
                                class105.field1530 = -1;
                                return true;
                            }
                            for (int var143 = class220.field3456 + -1; var143 > var141; --var143) {
                                class215.field3360[var143 + 1] = class215.field3360[var143];
                            }
                            if (~class220.field3456 == -1) {
                                class215.field3360 = new class41[100];
                            }
                            class215.field3360[var141 + 1] = var140;
                            ++class220.field3456;
                            if (~class46.field564 == ~var130) {
                                class312.field5007 = var133;
                            }
                        }
                        class105.field1530 = -1;
                        class35.field420 = client.field3871;
                        return true;
                    } else if (class105.field1530 == 37) {
                        int var144 = class175.field2763.method1200(128);
                        String var145 = class175.field2763.method1195(arg0 ^ 118);
                        int var146 = class175.field2763.method1189(-53);
                        if (class115.method761(-116, var146)) {
                            class9.method53(var145, arg0 ^ 118, var144);
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 == -64) {
                        int var147 = class175.field2763.method1189(-104);
                        int var148 = class175.field2763.method1189(-105);
                        int var149 = class175.field2763.method1158(-241746104);
                        int var150 = class175.field2763.method1172(true);
                        if (class115.method761(-87, var147)) {
                            class150.method1012((byte) -52, (var148 << 16) + var150, var149);
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (class105.field1530 == 97) {
                        long var151 = class175.field2763.method1181(27081);
                        int var153 = class175.field2763.method1186((byte) -84);
                        int var154 = class175.field2763.method1218(-89);
                        boolean var155 = true;
                        if (~var151 > -1L) {
                            var155 = false;
                            var151 &= Long.MAX_VALUE;
                        }
                        String var156 = "";
                        if (~var153 < -1) {
                            var156 = class175.field2763.method1195(arg0 ^ 118);
                        }
                        String var157 = class178.method1264(var151, (byte) 103);
                        for (int var158 = 0; ~var158 > ~class76.field1142; ++var158) {
                            if (~class218.field3419[var158] == ~var151) {
                                if (~class127.field1821[var158] != ~var153) {
                                    class127.field1821[var158] = var153;
                                    if (var153 > 0) {
                                        class236.method1655(5, "", 119, var157 + class313.field5019);
                                    }
                                    if (var153 == 0) {
                                        class236.method1655(5, "", 95, var157 + class178.field2792);
                                    }
                                }
                                class198.field3143[var158] = var156;
                                class113.field1655[var158] = var154;
                                var157 = null;
                                class214.field3349[var158] = var155;
                                break;
                            }
                        }
                        if (var157 != null && ~class76.field1142 > -201) {
                            class218.field3419[class76.field1142] = var151;
                            class301.field4799[class76.field1142] = var157;
                            class127.field1821[class76.field1142] = var153;
                            class198.field3143[class76.field1142] = var156;
                            class113.field1655[class76.field1142] = var154;
                            class214.field3349[class76.field1142] = var155;
                            ++class76.field1142;
                        }
                        class250.field4088 = client.field3871;
                        boolean var159 = false;
                        int var160 = class76.field1142;
                        while (~var160 < -1) {
                            boolean var161 = true;
                            --var160;
                            for (int var162 = 0; ~var162 > ~var160; ++var162) {
                                if (~class127.field1821[var162] != ~class67.field991 && ~class127.field1821[var162 - -1] == ~class67.field991 || class127.field1821[var162] == 0 && class127.field1821[var162 + 1] != 0) {
                                    int var163 = class127.field1821[var162];
                                    var161 = false;
                                    class127.field1821[var162] = class127.field1821[var162 + 1];
                                    class127.field1821[var162 + 1] = var163;
                                    String var164 = class198.field3143[var162];
                                    class198.field3143[var162] = class198.field3143[var162 - -1];
                                    class198.field3143[var162 + 1] = var164;
                                    String var165 = class301.field4799[var162];
                                    class301.field4799[var162] = class301.field4799[var162 - -1];
                                    class301.field4799[var162 + 1] = var165;
                                    long var166 = class218.field3419[var162];
                                    class218.field3419[var162] = class218.field3419[var162 - -1];
                                    class218.field3419[var162 + 1] = var166;
                                    int var168 = class113.field1655[var162];
                                    class113.field1655[var162] = class113.field1655[var162 + 1];
                                    class113.field1655[var162 + 1] = var168;
                                    boolean var169 = class214.field3349[var162];
                                    class214.field3349[var162] = class214.field3349[var162 - -1];
                                    class214.field3349[var162 + 1] = var169;
                                }
                            }
                            if (var161) {
                                break;
                            }
                        }
                        class105.field1530 = -1;
                        return true;
                    } else if (~class105.field1530 != -148 && class105.field1530 != 185 && ~class105.field1530 != -247 && ~class105.field1530 != -184 && class105.field1530 != 225 && class105.field1530 != 203 && ~class105.field1530 != -10 && class105.field1530 != 130 && class105.field1530 != 13 && ~class105.field1530 != -46 && class105.field1530 != 175 && ~class105.field1530 != -209 && class105.field1530 != 155 && ~class105.field1530 != -164) {
                        if (~class105.field1530 == -228) {
                            class266.method1859(true, (byte) 64);
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -86) {
                            int var170 = class175.field2763.method1209(-1);
                            int var171 = class175.field2763.method1200(arg0 ^ -247);
                            int var172 = class175.field2763.method1172(true);
                            if (class115.method761(87, var171)) {
                                class214.method1498(var170, var172, (byte) -124);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 41) {
                            class247.field4014 = class175.field2763.method1211(arg0 + 208);
                            class312.field5011 = class175.field2763.method1218(-98);
                            while (class262.field4252 > class175.field2763.field2676) {
                                class105.field1530 = class175.field2763.method1218(-122);
                                class304.method2040(-1);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -117) {
                            int var173 = class175.field2763.method1172(true);
                            int var174 = class175.field2763.method1166(arg0 ^ 269096889);
                            int var175 = class175.field2763.method1186((byte) -60);
                            if (class115.method761(58, var173)) {
                                class148.method1003(var175, (byte) 52, var174);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -210) {
                            int var176 = class175.field2763.method1200(128);
                            int var177 = class175.field2763.method1191(true);
                            int var178 = class175.field2763.method1158(-241746104);
                            int var179 = class175.field2763.method1171(65280);
                            if (class115.method761(42, var176)) {
                                class237.method1663(arg0 ^ 118, var179, var178, var177);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -215) {
                            int var180 = class175.field2763.method1200(arg0 ^ -247);
                            int var181 = class175.field2763.method1196((byte) 42);
                            int var182 = class175.field2763.method1158(-241746104);
                            if (class115.method761(-101, var180)) {
                                class96.method655(-2033032820, var181, var182);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -242) {
                            int var183 = class175.field2763.method1190(6345);
                            class307.field4914 = class95.field1425.method1675(var183, true);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 16) {
                            int var184 = class175.field2763.method1190(6345);
                            int var185 = class175.field2763.method1186((byte) -96);
                            if (~var184 > 69999) {
                                var185 += 32768;
                            }
                            class231 var186;
                            if (~var184 > -1) {
                                var186 = null;
                            } else {
                                var186 = class201.method1398(var184, 0);
                            }
                            if (var186 != null) {
                                for (int var187 = 0; ~var187 > ~var186.field3708.length; ++var187) {
                                    var186.field3708[var187] = 0;
                                    var186.field3582[var187] = 0;
                                }
                            }
                            class114.method755(var185, -1);
                            int var188 = class175.field2763.method1186((byte) -43);
                            for (int var189 = 0; ~var188 < ~var189; ++var189) {
                                int var190 = class175.field2763.method1186((byte) -54);
                                int var191 = class175.field2763.method1218(arg0 ^ 6);
                                if (~var191 == -256) {
                                    var191 = class175.field2763.method1166(arg0 + -269096793);
                                }
                                if (var186 != null && ~var186.field3708.length < ~var189) {
                                    var186.field3708[var189] = var190;
                                    var186.field3582[var189] = var191;
                                }
                                class301.method2025(var185, -1, var191, var190 - 1, var189);
                            }
                            if (var186 != null) {
                                class247.method1761(var186, (byte) -119);
                            }
                            class45.method253(arg0 ^ -18335);
                            class89.field1340[class205.method1411(31, class47.field597++)] = class205.method1411(var185, 32767);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 216) {
                            class312.field5011 = class175.field2763.method1196((byte) 59);
                            class247.field4014 = class175.field2763.method1218(103);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 69) {
                            int var192 = class175.field2763.method1186((byte) -126);
                            if (class115.method761(-82, var192)) {
                                class163.method1124(-31);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -180) {
                            int var193 = class175.field2763.method1186((byte) -124);
                            if (var193 == 65535) {
                                var193 = -1;
                            }
                            int var194 = class175.field2763.method1189(-83);
                            int var195 = class175.field2763.method1190(6345);
                            int var196 = class175.field2763.method1209(-1);
                            if (class115.method761(109, var194)) {
                                class231 var197 = class201.method1398(var196, arg0 + 119);
                                if (!var197.field3585) {
                                    if (~var193 == 0) {
                                        class105.field1530 = -1;
                                        var197.field3675 = 0;
                                        return true;
                                    }
                                    class162 var198 = class104.method696((byte) -26, var193);
                                    var197.field3609 = var193;
                                    var197.field3675 = 4;
                                    var197.field3651 = var198.field2468;
                                    var197.field3695 = var198.field2481;
                                    var197.field3727 = var198.field2442 * 100 / var195;
                                    class247.method1761(var197, (byte) -81);
                                } else {
                                    class89.method598(var193, var196, var195, 122);
                                    class162 var199 = class104.method696((byte) -26, var193);
                                    class117.method774(var196, var199.field2481, arg0 + 127, var199.field2468, var199.field2442);
                                    class3.method23(var199.field2426, var199.field2428, var199.field2461, var196, (byte) -76);
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -174) {
                            int var200 = class175.field2763.method1186((byte) -42);
                            if (class115.method761(101, var200)) {
                                class290.method1974((byte) -16);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 159) {
                            int var201 = class175.field2763.method1200(arg0 ^ -247);
                            int var202 = class175.field2763.method1189(-53);
                            byte var203 = class175.field2763.method1205(-97);
                            if (class115.method761(arg0 + 2, var201)) {
                                class214.method1498(var203, var202, (byte) 83);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -231) {
                            int var204 = class175.field2763.method1189(-67);
                            byte var205 = class175.field2763.method1170(117);
                            class253.method1798(var204, var205, -111);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 81) {
                            int var206 = class175.field2763.method1189(arg0 + 20);
                            if (~var206 == -65536) {
                                var206 = -1;
                            }
                            int var207 = class175.field2763.method1189(-47);
                            if (~var207 == -65536) {
                                var207 = -1;
                            }
                            int var208 = class175.field2763.method1189(arg0 + 16);
                            int var209 = class175.field2763.method1209(-1);
                            int var210 = class175.field2763.method1186((byte) -44);
                            if (class115.method761(96, var208)) {
                                for (int var211 = var206; ~var207 <= ~var211; ++var211) {
                                    long var212 = ((long) var209 << 32) - -((long) var211);
                                    class29 var214 = (class29) class243.field3918.method1064(arg0 + 118, var212);
                                    class29 var215;
                                    if (var214 == null) {
                                        if (~var211 == 0) {
                                            var215 = new class29(class201.method1398(var209, 0).field3731.field367, var210);
                                        } else {
                                            var215 = new class29(0, var210);
                                        }
                                    } else {
                                        var215 = new class29(var214.field367, var210);
                                        var214.method1764(64);
                                    }
                                    class243.field3918.method1054(-3510, var215, var212);
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -30) {
                            class282.method1941(class95.field1425, class175.field2763, arg0 ^ -119, class262.field4252);
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -8) {
                            int var216 = class175.field2763.method1200(arg0 ^ -247);
                            if (var216 == 65535) {
                                var216 = -1;
                            }
                            int var217 = class175.field2763.method1209(-1);
                            int var218 = class175.field2763.method1190(6345);
                            int var219 = class175.field2763.method1200(128);
                            if (~var219 == -65536) {
                                var219 = -1;
                            }
                            int var220 = class175.field2763.method1186((byte) -109);
                            if (class115.method761(-122, var220)) {
                                for (int var221 = var216; var219 >= var221; ++var221) {
                                    long var222 = ((long) var218 << 32) - -((long) var221);
                                    class29 var224 = (class29) class243.field3918.method1064(arg0 + 118, var222);
                                    class29 var225;
                                    if (var224 == null) {
                                        if (~var221 == 0) {
                                            var225 = new class29(var217, class201.method1398(var218, 0).field3731.field362);
                                        } else {
                                            var225 = new class29(var217, -1);
                                        }
                                    } else {
                                        var225 = new class29(var217, var224.field362);
                                        var224.method1764(64);
                                    }
                                    class243.field3918.method1054(-3510, var225, var222);
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 110) {
                            class172.method1234(true);
                            class45.method253(18408);
                            class105.field1530 = -1;
                            class158.field2369 += 32;
                            return true;
                        } else if (~class105.field1530 == -110) {
                            class247.field4014 = class175.field2763.method1196((byte) 22);
                            class312.field5011 = class175.field2763.method1218(arg0 ^ 89);
                            for (int var226 = class247.field4014; class247.field4014 + 8 > var226; ++var226) {
                                for (int var228 = class312.field5011; var228 < class312.field5011 - -8; ++var228) {
                                    if (class74.field1128[class148.field2204][var226][var228] != null) {
                                        class74.field1128[class148.field2204][var226][var228] = null;
                                        class273.method1900((byte) -97, var228, var226);
                                    }
                                }
                            }
                            for (class183 var227 = (class183) class192.field3051.method1548(0); var227 != null; var227 = (class183) class192.field3051.method1549(arg0 + 92)) {
                                if (~var227.field2870 <= ~class247.field4014 && ~(class247.field4014 + 8) < ~var227.field2870 && ~var227.field2877 <= ~class312.field5011 && ~var227.field2877 > ~(class312.field5011 + 8) && ~class148.field2204 == ~var227.field2878) {
                                    var227.field2882 = 0;
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 74) {
                            int var229 = class175.field2763.method1200(arg0 ^ -247);
                            int var230 = class175.field2763.method1209(arg0 + 118);
                            int var231 = class175.field2763.method1166(arg0 ^ 269096889);
                            if (class115.method761(25, var229)) {
                                class104 var232 = (class104) class115.field1674.method1064(-1, (long) var230);
                                class104 var233 = (class104) class115.field1674.method1064(-1, (long) var231);
                                if (var233 != null) {
                                    class74.method514(var232 == null || var232.field1511 != var233.field1511, (byte) 105, var233);
                                }
                                if (var232 != null) {
                                    var232.method1764(64);
                                    class115.field1674.method1054(-3510, var232, (long) var231);
                                }
                                class231 var234 = class201.method1398(var230, 0);
                                if (var234 != null) {
                                    class247.method1761(var234, (byte) -125);
                                }
                                class231 var235 = class201.method1398(var231, 0);
                                if (var235 != null) {
                                    class247.method1761(var235, (byte) -84);
                                    class130.method831((byte) 94, var235, true);
                                }
                                if (~class238.field3824 != 0) {
                                    class290.method1969(1, class238.field3824, 6404);
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 232) {
                            class35.field420 = client.field3871;
                            long var236 = class175.field2763.method1181(27081);
                            if (~var236 == -1L) {
                                class220.field3456 = 0;
                                class215.field3360 = null;
                                class105.field1530 = -1;
                                class193.field3064 = null;
                                class28.field351 = null;
                                return true;
                            } else {
                                long var238 = class175.field2763.method1181(27081);
                                class28.field351 = class23.method124(var238, false);
                                class193.field3064 = class23.method124(var236, false);
                                class89.field1337 = class175.field2763.method1215(128);
                                int var240 = class175.field2763.method1218(108);
                                if (var240 == 255) {
                                    class105.field1530 = -1;
                                    return true;
                                } else {
                                    class41[] var241 = new class41[100];
                                    class220.field3456 = var240;
                                    for (int var242 = 0; ~var242 > ~class220.field3456; ++var242) {
                                        var241[var242] = new class41();
                                        var241[var242].field4018 = class175.field2763.method1181(27081);
                                        var241[var242].field498 = class23.method124(var241[var242].field4018, false);
                                        var241[var242].field505 = class175.field2763.method1186((byte) -41);
                                        var241[var242].field502 = class175.field2763.method1215(arg0 ^ -247);
                                        var241[var242].field501 = class175.field2763.method1195(arg0 ^ 118);
                                        if (~class46.field564 == ~var241[var242].field4018) {
                                            class312.field5007 = var241[var242].field502;
                                        }
                                    }
                                    boolean var243 = false;
                                    int var244 = class220.field3456;
                                    while (~var244 < -1) {
                                        boolean var245 = true;
                                        --var244;
                                        for (int var246 = 0; ~var244 < ~var246; ++var246) {
                                            if (~var241[var246].field498.compareTo(var241[var246 + 1].field498) < -1) {
                                                var245 = false;
                                                class41 var247 = var241[var246];
                                                var241[var246] = var241[var246 + 1];
                                                var241[var246 + 1] = var247;
                                            }
                                        }
                                        if (var245) {
                                            break;
                                        }
                                    }
                                    class105.field1530 = -1;
                                    class215.field3360 = var241;
                                    return true;
                                }
                            }
                        } else if (class105.field1530 == 156) {
                            class84.field1302 = class262.field4252 / 8;
                            for (int var248 = 0; ~var248 > ~class84.field1302; ++var248) {
                                class58.field863[var248] = class175.field2763.method1181(27081);
                                class309.field4975[var248] = class15.method92(class58.field863[var248], (byte) -122);
                                class82.field1249[var248] = false;
                            }
                            class105.field1530 = -1;
                            class250.field4088 = client.field3871;
                            return true;
                        } else if (class105.field1530 == 128) {
                            long var249 = class175.field2763.method1181(27081);
                            int var251 = class175.field2763.method1186((byte) -74);
                            String var252 = class218.method1526(var251, false).method466(-25161, class175.field2763);
                            class102.method686(var252, (String) null, (byte) -114, class178.method1264(var249, (byte) 103), var251, 19);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 252) {
                            int var253 = class175.field2763.method1186((byte) -69);
                            int var254 = class175.field2763.method1209(arg0 ^ 118);
                            if (~var253 == -65536) {
                                var253 = -1;
                            }
                            int var255 = class175.field2763.method1186((byte) -127);
                            if (class115.method761(arg0 + 134, var255)) {
                                class228.method1610(-1, var253, var254, 2, (byte) 93);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -169) {
                            int var256 = class175.field2763.method1218(-65);
                            int var257 = var256 >> 5;
                            int var258 = 31 & var256;
                            if (~var258 == -1) {
                                class130.field1865[var257] = null;
                                class105.field1530 = -1;
                                return true;
                            } else {
                                class306 var259 = new class306();
                                var259.field4882 = var258;
                                var259.field4890 = class175.field2763.method1218(70);
                                if (~var259.field4890 <= -1 && ~class111.field1608.length < ~var259.field4890) {
                                    if (~var259.field4882 != -2 && ~var259.field4882 != -11) {
                                        if (var259.field4882 >= 2 && ~var259.field4882 >= -7) {
                                            if (~var259.field4882 == -3) {
                                                var259.field4878 = 64;
                                                var259.field4883 = 64;
                                            }
                                            if (~var259.field4882 == -4) {
                                                var259.field4878 = 64;
                                                var259.field4883 = 0;
                                            }
                                            if (~var259.field4882 == -5) {
                                                var259.field4878 = 64;
                                                var259.field4883 = 128;
                                            }
                                            if (var259.field4882 == 5) {
                                                var259.field4878 = 0;
                                                var259.field4883 = 64;
                                            }
                                            if (var259.field4882 == 6) {
                                                var259.field4878 = 128;
                                                var259.field4883 = 64;
                                            }
                                            var259.field4882 = 2;
                                            var259.field4891 = class175.field2763.method1186((byte) -113);
                                            var259.field4888 = class175.field2763.method1186((byte) -45);
                                            var259.field4881 = class175.field2763.method1218(116);
                                            var259.field4887 = class175.field2763.method1186((byte) -95);
                                        }
                                    } else {
                                        var259.field4875 = class175.field2763.method1186((byte) -98);
                                        class175.field2763.field2676 += 5;
                                    }
                                    var259.field4874 = class175.field2763.method1186((byte) -66);
                                    if (~var259.field4874 == -65536) {
                                        var259.field4874 = -1;
                                    }
                                    class130.field1865[var257] = var259;
                                }
                                class105.field1530 = -1;
                                return true;
                            }
                        } else if (class105.field1530 == 42) {
                            int var260 = class175.field2763.method1186((byte) -76);
                            int var261 = class175.field2763.method1172(true);
                            int var262 = class175.field2763.method1189(arg0 ^ 2);
                            int var263 = class175.field2763.method1158(-241746104);
                            int var264 = class175.field2763.method1186((byte) -92);
                            if (class115.method761(-105, var264)) {
                                class228.method1610(var262, var260 << 16 | var261, var263, 7, (byte) 93);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 44) {
                            int var265 = class175.field2763.method1218(arg0 + 200);
                            int var266 = class175.field2763.method1196((byte) 119);
                            int var267 = class175.field2763.method1218(-115);
                            class148.field2204 = var266 >> 1;
                            class214.field3347.method5((var266 & 1) == 1, 360000, var265, var267);
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -1) {
                            int var268 = class175.field2763.method1190(6345);
                            int var269 = class175.field2763.method1186((byte) -115);
                            class212.method1467(var269, var268, 26591);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 106) {
                            int var270 = class175.field2763.method1189(arg0 + 36);
                            int var271 = class175.field2763.method1166(-269096912);
                            if (class115.method761(arg0 + -4, var270)) {
                                int var272 = 0;
                                if (class214.field3347.field33 != null) {
                                    var272 = class214.field3347.field33.method1230(true);
                                }
                                class228.method1610(-1, var272, var271, 3, (byte) 93);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 201) {
                            class45.method253(arg0 ^ -18335);
                            int var273 = class175.field2763.method1182((byte) -128);
                            int var274 = class175.field2763.method1166(-269096912);
                            int var275 = class175.field2763.method1211(95);
                            class118.field1701[var275] = var274;
                            class305.field4862[var275] = var273;
                            class274.field4450[var275] = 1;
                            for (int var276 = 0; var276 < 98; ++var276) {
                                if (class304.field4826[var276] <= var274) {
                                    class274.field4450[var275] = var276 - -2;
                                }
                            }
                            class257.field4189[class205.method1411(class181.field2836++, 31)] = var275;
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 247) {
                            int var277 = class175.field2763.method1211(104);
                            int var278 = class175.field2763.method1172(true);
                            if (var278 == 65535) {
                                var278 = -1;
                            }
                            class135.method858(var277, var278, true);
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -177) {
                            int var279 = class175.field2763.method1182((byte) -123);
                            int var280 = class175.field2763.method1194((byte) -59);
                            int var281 = class175.field2763.method1200(arg0 + 247);
                            if (var281 == 65535) {
                                var281 = -1;
                            }
                            class62.method393(var279, var281, -1922, var280);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 150) {
                            int var282 = class175.field2763.method1186((byte) -106);
                            if (var282 == 65535) {
                                var282 = -1;
                            }
                            int var283 = class175.field2763.method1218(120);
                            int var284 = class175.field2763.method1186((byte) -73);
                            int var285 = class175.field2763.method1218(68);
                            class205.method1416(var282, var283, 8526, var284, var285);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 34) {
                            if (class238.field3824 != -1) {
                                class290.method1969(0, class238.field3824, 6404);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 207) {
                            byte[] var286 = new byte[class262.field4252];
                            class175.field2763.method442(0, -115, var286, class262.field4252);
                            String var287 = class77.method529(var286, 0, 0, class262.field4252);
                            if (class73.field1086 != null || class239.field3844 != 3 && class239.field3830.startsWith("win") && !class24.field298) {
                                class258.field4201 = var287;
                                class275.field4466 = true;
                                class123.field1762 = class95.field1425.method1686((byte) 113, var287);
                            } else {
                                class297.method2002(9558, var287, true);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 113) {
                            class60.field880 = class175.field2763.method1218(-101);
                            class250.field4088 = client.field3871;
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 162) {
                            class175.field2763.field2676 += 28;
                            if (class175.field2763.method1197(arg0 + 117)) {
                                class209.method1453(class175.field2763.field2676 + -28, class175.field2763, 0);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 55) {
                            int var288 = class175.field2763.method1186((byte) -49);
                            int var289 = class175.field2763.method1182((byte) -94);
                            if (class115.method761(-109, var288)) {
                                class19.field263 = var289;
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 237) {
                            int var290 = class175.field2763.method1186((byte) -128);
                            int var291 = class175.field2763.method1218(-47);
                            int var292 = class175.field2763.method1218(arg0 ^ -55);
                            int var293 = class175.field2763.method1186((byte) -112);
                            int var294 = class175.field2763.method1218(101);
                            int var295 = class175.field2763.method1218(arg0 + 3);
                            if (class115.method761(65, var290)) {
                                class229.method1615(var294, true, var295, var291, var292, 8806, var293);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -41) {
                            int var296 = class175.field2763.method1190(6345);
                            int var297 = class175.field2763.method1200(128);
                            int var298 = class175.field2763.method1218(-53);
                            int var299 = class175.field2763.method1172(true);
                            if (class115.method761(-112, var299)) {
                                class104 var300 = (class104) class115.field1674.method1064(-1, (long) var296);
                                if (var300 != null) {
                                    class74.method514(var300.field1511 != var297, (byte) 105, var300);
                                }
                                class158.method1091(var296, false, var298, var297);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 83) {
                            class266.method1859(false, (byte) 64);
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -95) {
                            int var301 = class175.field2763.method1189(arg0 + 41);
                            int var302 = class175.field2763.method1182((byte) -117);
                            class212.method1467(var301, var302, 26591);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 140) {
                            int var303 = class175.field2763.method1166(-269096912);
                            class231 var304 = class201.method1398(var303, 0);
                            for (int var305 = 0; var304.field3708.length > var305; ++var305) {
                                var304.field3708[var305] = -1;
                                var304.field3708[var305] = 0;
                            }
                            class247.method1761(var304, (byte) -89);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 171) {
                            class115.method760(arg0 ^ 30024);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 165) {
                            int var306 = class175.field2763.method1186((byte) -87);
                            String var307 = class175.field2763.method1195(-1);
                            Object[] var308 = new Object[1 + var307.length()];
                            for (int var309 = -1 + var307.length(); ~var309 <= -1; --var309) {
                                if (~var307.charAt(var309) == -116) {
                                    var308[var309 + 1] = class175.field2763.method1195(class299.method2011(arg0, 118));
                                } else {
                                    var308[var309 + 1] = new Integer(class175.field2763.method1190(class299.method2011(arg0, -6336)));
                                }
                            }
                            var308[0] = new Integer(class175.field2763.method1190(6345));
                            if (class115.method761(62, var306)) {
                                class122 var310 = new class122();
                                var310.field1755 = var308;
                                class122.method795(var310, -95);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -198) {
                            long var311 = class175.field2763.method1181(arg0 + 27200);
                            String var313 = class213.method1472(class128.method825(false, class277.method1920(class175.field2763, -112)));
                            class236.method1655(6, class178.method1264(var311, (byte) 103), 89, var313);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 120) {
                            long var314 = class175.field2763.method1181(arg0 ^ -27072);
                            long var316 = (long) class175.field2763.method1186((byte) -91);
                            boolean var318 = false;
                            long var319 = (long) class175.field2763.method1212(arg0 + 460736967);
                            int var321 = class175.field2763.method1218(104);
                            int var322 = class175.field2763.method1186((byte) -71);
                            long var323 = (var316 << 32) - -var319;
                            int var325 = 0;
                            label1532: while (true) {
                                if (~var325 <= -101) {
                                    if (var321 <= 1) {
                                        for (int var326 = 0; var326 < class84.field1302; ++var326) {
                                            if (class58.field863[var326] == var314) {
                                                var318 = true;
                                                break label1532;
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (class273.field4439[var325] == var323) {
                                    var318 = true;
                                    break;
                                }
                                ++var325;
                            }
                            if (!var318 && ~class104.field1515 == -1) {
                                class273.field4439[class250.field4087] = var323;
                                class250.field4087 = (class250.field4087 + 1) % 100;
                                String var327 = class218.method1526(var322, false).method466(-25161, class175.field2763);
                                if (var321 == 2) {
                                    class102.method686(var327, (String) null, (byte) -85, "<img=1>" + class178.method1264(var314, (byte) 103), var322, 18);
                                } else if (var321 != 1) {
                                    class102.method686(var327, (String) null, (byte) -102, class178.method1264(var314, (byte) 103), var322, 18);
                                } else {
                                    class102.method686(var327, (String) null, (byte) -108, "<img=0>" + class178.method1264(var314, (byte) 103), var322, 18);
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 == 161) {
                            int var328 = class175.field2763.method1186((byte) -98);
                            int var329 = class175.field2763.method1172(true);
                            int var330 = class175.field2763.method1172(true);
                            if (class115.method761(9, var328)) {
                                class302.method2029((byte) -9, var330, var329);
                            }
                            class105.field1530 = -1;
                            return true;
                        } else if (~class105.field1530 == -67) {
                            class73.field1097 = class175.field2763.method1218(105);
                            class303.field4822 = class175.field2763.method1218(arg0 + 83);
                            class21.field275 = class175.field2763.method1218(-60);
                            class105.field1530 = -1;
                            return true;
                        } else if (class105.field1530 != 80) {
                            if (class105.field1530 == 158) {
                                int var346 = class175.field2763.method1189(arg0 ^ 51);
                                int var347 = class175.field2763.method1200(arg0 + 247);
                                int var348 = class175.field2763.method1172(true);
                                int var349 = class175.field2763.method1200(128);
                                int var350 = class175.field2763.method1190(arg0 + 6464);
                                if (class115.method761(29, var349)) {
                                    class117.method774(var350, var346, arg0 ^ -127, var347, var348);
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (class105.field1530 == 43) {
                                class127.method820(class175.field2763.method1195(-1), (byte) 122);
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -21) {
                                int var351 = class175.field2763.method1158(-241746104);
                                int var352 = 3 & var351 >> 28;
                                int var353 = var351 & 16383;
                                int var354 = 16383 & var351 >> 14;
                                int var355 = class175.field2763.method1218(-30);
                                int var356 = var355 >> 2;
                                int var357 = 3 & var355;
                                int var358 = class293.field4706[var356];
                                int var359 = class175.field2763.method1186((byte) -105);
                                int var360 = var354 - class113.field1653;
                                int var361 = var353 - class5.field77;
                                if (~var359 == -65536) {
                                    var359 = -1;
                                }
                                class226.method1596(var360, var358, arg0 + 39, var356, var361, var357, var352, var359);
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -122) {
                                for (int var362 = 0; class35.field409.length > var362; ++var362) {
                                    if (class35.field409[var362] != null) {
                                        class35.field409[var362].field3987 = -1;
                                    }
                                }
                                for (int var363 = 0; class191.field3045.length > var363; ++var363) {
                                    if (class191.field3045[var363] != null) {
                                        class191.field3045[var363].field3987 = -1;
                                    }
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (class105.field1530 == 226) {
                                int var364 = class175.field2763.method1186((byte) -101);
                                int var365 = class175.field2763.method1218(108);
                                int var366 = class175.field2763.method1218(101);
                                int var367 = class175.field2763.method1218(98);
                                int var368 = class175.field2763.method1218(arg0 + 182);
                                int var369 = class175.field2763.method1186((byte) -106);
                                if (class115.method761(82, var364)) {
                                    class49.field623[var365] = true;
                                    class312.field5006[var365] = var366;
                                    class94.field1411[var365] = var367;
                                    class92.field1386[var365] = var368;
                                    class1.field16[var365] = var369;
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -22) {
                                int var370 = class175.field2763.method1218(-33);
                                if (class175.field2763.method1218(arg0 + 205) != 0) {
                                    --class175.field2763.field2676;
                                    class60.field883[var370] = new class272(class175.field2763);
                                } else {
                                    class60.field883[var370] = new class272();
                                }
                                class105.field1530 = -1;
                                class198.field3139 = client.field3871;
                                return true;
                            } else if (~class105.field1530 == -234) {
                                class205.field3200 = class175.field2763.method1172(true) * 30;
                                class105.field1530 = -1;
                                class165.field2550 = client.field3871;
                                return true;
                            } else if (~class105.field1530 == -216) {
                                int var371 = class175.field2763.method1190(6345);
                                int var372 = class175.field2763.method1186((byte) -116);
                                if (~var371 > 69999) {
                                    var372 += 32768;
                                }
                                class231 var373;
                                if (~var371 <= -1) {
                                    var373 = class201.method1398(var371, 0);
                                } else {
                                    var373 = null;
                                }
                                while (class175.field2763.field2676 < class262.field4252) {
                                    int var374 = class175.field2763.method1162(arg0 ^ 246);
                                    int var375 = class175.field2763.method1186((byte) -61);
                                    int var376 = 0;
                                    if (~var375 != -1) {
                                        var376 = class175.field2763.method1218(arg0 ^ -40);
                                        if (var376 == 255) {
                                            var376 = class175.field2763.method1190(6345);
                                        }
                                    }
                                    if (var373 != null && var374 >= 0 && var374 < var373.field3708.length) {
                                        var373.field3708[var374] = var375;
                                        var373.field3582[var374] = var376;
                                    }
                                    class301.method2025(var372, arg0 + 118, var376, var375 + -1, var374);
                                }
                                if (var373 != null) {
                                    class247.method1761(var373, (byte) -121);
                                }
                                class45.method253(arg0 ^ -18335);
                                class89.field1340[class205.method1411(class47.field597++, 31)] = class205.method1411(var372, 32767);
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -211) {
                                class105.field1530 = -1;
                                class31.field380 = 0;
                                return true;
                            } else if (arg0 != -119) {
                                return false;
                            } else if (class105.field1530 == 65) {
                                int var377 = class175.field2763.method1196((byte) 105);
                                int var378 = class175.field2763.method1172(true);
                                int var379 = class175.field2763.method1189(-47);
                                class86 var380 = class191.field3045[var378];
                                if (var380 != null) {
                                    class167.method1139(var379, var380, arg0 ^ -110, var377);
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -28) {
                                int var381 = class175.field2763.method1189(-40);
                                int var382 = class175.field2763.method1200(128);
                                int var383 = class175.field2763.method1209(-1);
                                if (class115.method761(3, var381)) {
                                    class283.method1946((byte) 127, var382, var383);
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -213) {
                                int var384 = class175.field2763.method1166(arg0 ^ 269096889);
                                int var385 = class175.field2763.method1172(true);
                                int var386 = class175.field2763.method1189(-45);
                                if (~var386 == -65536) {
                                    var386 = -1;
                                }
                                if (class115.method761(-86, var385)) {
                                    class228.method1610(-1, var386, var384, 1, (byte) 93);
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (class105.field1530 == 71) {
                                class45.method253(18408);
                                class234.field3778 = class175.field2763.method1193(-1);
                                class105.field1530 = -1;
                                class165.field2550 = client.field3871;
                                return true;
                            } else if (~class105.field1530 == -249) {
                                int var387 = class175.field2763.method1189(-37);
                                int var388 = class175.field2763.method1211(127);
                                if (var387 == 65535) {
                                    var387 = -1;
                                }
                                int var389 = class175.field2763.method1182((byte) -117);
                                String var390 = class175.field2763.method1195(arg0 ^ 118);
                                if (~var389 <= -2 && ~var389 >= -9) {
                                    if (var390.equalsIgnoreCase("null")) {
                                        var390 = null;
                                    }
                                    class196.field3098[var389 + -1] = var390;
                                    class253.field4134[var389 - 1] = var387;
                                    class76.field1143[var389 - 1] = var388 == 0;
                                }
                                class105.field1530 = -1;
                                return true;
                            } else if (~class105.field1530 == -187) {
                                class45.method253(18408);
                                class304.field4828 = class175.field2763.method1218(-44);
                                class165.field2550 = client.field3871;
                                class105.field1530 = -1;
                                return true;
                            } else if (class105.field1530 == 236) {
                                int var391 = class175.field2763.method1186((byte) -80);
                                int var392 = class175.field2763.method1190(arg0 + 6464);
                                if (class115.method761(-2, var391)) {
                                    class104 var393 = (class104) class115.field1674.method1064(-1, (long) var392);
                                    if (var393 != null) {
                                        class74.method514(true, (byte) 105, var393);
                                    }
                                    if (class137.field1969 != null) {
                                        class247.method1761(class137.field1969, (byte) -112);
                                        class137.field1969 = null;
                                    }
                                }
                                class105.field1530 = -1;
                                return true;
                            } else {
                                class285.method1952((Throwable) null, (byte) -118, "T1 - " + class105.field1530 + "," + class158.field2372 + "," + class303.field4812 + " - " + class262.field4252);
                                class222.method1573((byte) -81);
                                return true;
                            }
                        } else {
                            long var331 = class175.field2763.method1181(27081);
                            class175.field2763.method1215(arg0 ^ -247);
                            long var333 = class175.field2763.method1181(27081);
                            long var335 = (long) class175.field2763.method1186((byte) -99);
                            long var337 = (long) class175.field2763.method1212(arg0 + 460736967);
                            boolean var339 = false;
                            long var340 = (var335 << 32) + var337;
                            int var342 = class175.field2763.method1218(arg0 + 242);
                            int var343 = 0;
                            label1624: while (true) {
                                if (var343 >= 100) {
                                    if (var342 <= 1) {
                                        if ((!class235.field3799 || class83.field1280) && !class211.field3283) {
                                            for (int var344 = 0; ~class84.field1302 < ~var344; ++var344) {
                                                if (class58.field863[var344] == var331) {
                                                    var339 = true;
                                                    break label1624;
                                                }
                                            }
                                        } else {
                                            var339 = true;
                                        }
                                    }
                                    break;
                                }
                                if (class273.field4439[var343] == var340) {
                                    var339 = true;
                                    break;
                                }
                                ++var343;
                            }
                            if (!var339 && class104.field1515 == 0) {
                                class273.field4439[class250.field4087] = var340;
                                class250.field4087 = (class250.field4087 + 1) % 100;
                                String var345 = class213.method1472(class128.method825(false, class277.method1920(class175.field2763, -112)));
                                if (var342 != 2 && var342 != 3) {
                                    if (var342 != 1) {
                                        class169.method1155(class178.method1264(var331, (byte) 103), -3, class178.method1264(var333, (byte) 103), 9, var345);
                                    } else {
                                        class169.method1155("<img=0>" + class178.method1264(var331, (byte) 103), -3, class178.method1264(var333, (byte) 103), 9, var345);
                                    }
                                } else {
                                    class169.method1155("<img=1>" + class178.method1264(var331, (byte) 103), -3, class178.method1264(var333, (byte) 103), 9, var345);
                                }
                            }
                            class105.field1530 = -1;
                            return true;
                        }
                    } else {
                        class304.method2040(arg0 ^ 118);
                        class105.field1530 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILim;)Lle;")
    public static final class233 method997(int arg0, class170 arg1) {
        if (arg0 != 226) {
            field2184 = null;
        }
        ++field2174;
        class233 var2 = new class233();
        var2.field3761 = arg1.method1186((byte) -87);
        var2.field3767 = class218.method1526(var2.field3761, false);
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)V")
    public static final void method998(byte arg0) {
        if (arg0 != 32) {
            method995(30L, (byte) 84);
        }
        class205.field3204.method1511((byte) 105);
        ++field2181;
    }
}
