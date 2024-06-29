import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class256 {

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Lwg;")
    private class58 field3178 = new class58(128);

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Lwg;")
    public class58 field3185 = new class58(64);

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Lkr;")
    private class329 field3176;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "Lkr;")
    public class329 field3184;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[S")
    public static short[] field3179 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[Ldda;")
    public static class597[] field3175;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "[[I")
    public static int[][] field3173;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method1539(int arg0) {
        field3179 = null;
        field3175 = null;
        field3173 = null;
        if (arg0 != -9670) {
            field3173 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z")
    public static final boolean method1540(byte arg0) throws IOException {
        field3174++;
        if (class96.field1294 == null) {
            return false;
        }
        if (class558.field7814 == null) {
            if (class238.field3051) {
                if (!class96.field1294.method3270(74, 1)) {
                    return false;
                }
                class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                class238.field3051 = false;
                class633.field9215++;
                class189.field2446 = 0;
            }
            class342.field4758.field7707 = 0;
            if (class342.field4758.method376(-4)) {
                if (!class96.field1294.method3270(-115, 1)) {
                    return false;
                }
                class96.field1294.method3267(-25750, 1, 1, class342.field4758.field7693);
                class633.field9215++;
                class189.field2446 = 0;
            }
            class238.field3051 = true;
            class353[] var1 = class639.method3681(16);
            int var2 = class342.field4758.method380(100);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class342.field4758.field7707);
            }
            class558.field7814 = var1[var2];
            class262.field3333 = class558.field7814.field4947;
        }
        if (class262.field3333 == -1) {
            if (!class96.field1294.method3270(-99, 1)) {
                return false;
            }
            class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
            class262.field3333 = class342.field4758.field7693[0] & 0xFF;
            class633.field9215++;
            class189.field2446 = 0;
        }
        if (class262.field3333 == -2) {
            if (!class96.field1294.method3270(-97, 2)) {
                return false;
            }
            class96.field1294.method3267(-25750, 2, 0, class342.field4758.field7693);
            class342.field4758.field7707 = 0;
            class262.field3333 = class342.field4758.method3090(-119);
            class633.field9215 += 2;
            class189.field2446 = 0;
        }
        if (class262.field3333 > 0) {
            if (!class96.field1294.method3270(25, class262.field3333)) {
                return false;
            }
            class342.field4758.field7707 = 0;
            class96.field1294.method3267(-25750, class262.field3333, 0, class342.field4758.field7693);
            class633.field9215 += class262.field3333;
            class189.field2446 = 0;
        }
        class208.field2708 = class501.field6953;
        class501.field6953 = class507.field7078;
        class507.field7078 = class558.field7814;
        if (class558.field7814 == class291.field3778) {
            class410.field5632 = 1;
            class277.field3625 = class591.field8533;
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class216.field2767) {
            int var3 = class342.field4758.method3037(true);
            String var4 = class342.field4758.method3077(-20739);
            int var5 = class342.field4758.method3037(true);
            if (class408.method2436(-8759, var3)) {
                class69.method392(9228, var5, var4);
            }
            class558.field7814 = null;
            return true;
        } else if (class75.field1020 == class558.field7814) {
            int var6 = class342.field4758.method3090(-84);
            int var7 = class342.field4758.method3048(-4);
            if (class408.method2436(-8759, var6)) {
                class496 var8 = (class496) class523.field7289.method3476((long) var7, (byte) 28);
                if (var8 != null) {
                    class489.method2752(false, var8, true, false);
                }
                if (class168.field2123 != null) {
                    class90.method501(class168.field2123, -1);
                    class168.field2123 = null;
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class115.field1465) {
            int var9 = class342.field4758.method3078(16711680);
            int var10 = class342.field4758.method3066((byte) 101);
            class257.field3191.method2356(var9, var10, true);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class527.field7334) {
            if (class23.method136(false, class630.field9188)) {
                class327.field4494 = (int) ((float) class342.field4758.method3090(-125) * 2.5F);
            } else {
                class327.field4494 = class342.field4758.method3090(-123) * 30;
            }
            class558.field7814 = null;
            class411.field5646 = class591.field8533;
            return true;
        } else if (class77.field1045 == class558.field7814) {
            int var11 = class342.field4758.method3045(-127);
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = class94.field1244[var12];
            int var15 = class342.field4758.method3090(-75);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = class342.field4758.method3057(-6);
            int var17 = (var16 & 0x38B39B32) >> 28;
            int var18 = var16 >> 14 & 0x3FFF;
            int var19 = var16 & 0x3FFF;
            int var20 = var18 - class525.field7310;
            int var21 = var19 - class58.field786;
            class171.method1039((byte) 118, var20, var15, var21, var13, var17, var12, var14);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class281.field3674) {
            class119.field1496 = class262.field3333 > 2 ? class342.field4758.method3077(-20739) : class610.field8775.method2157(class245.field3103, 4074);
            class460.field6562 = class262.field3333 <= 0 ? -1 : class342.field4758.method3090(-106);
            class558.field7814 = null;
            if (class460.field6562 == 65535) {
                class460.field6562 = -1;
            }
            return true;
        } else if (class558.field7814 == class209.field2712) {
            boolean var22 = class342.field4758.method3045(-125) == 1;
            String var23 = class342.field4758.method3077(-20739);
            String var24 = var23;
            if (var22) {
                var24 = class342.field4758.method3077(-20739);
            }
            int var25 = class342.field4758.method3045(-126);
            int var26 = class342.field4758.method3090(-82);
            boolean var27 = false;
            if (var25 <= 1 && class442.method2564(var24, 0)) {
                var27 = true;
            }
            if (!var27 && class82.field1119 == 0) {
                String var28 = class548.field7632.method1438(var26, 2).method1226(class342.field4758, (byte) 12);
                if (var25 == 2) {
                    class620.method3554("<img=1>" + var24, (byte) -57, 25, var28, "<img=1>" + var23, null, var26, 0);
                } else if (var25 == 1) {
                    class620.method3554("<img=0>" + var24, (byte) -57, 25, var28, "<img=0>" + var23, null, var26, 0);
                } else {
                    class620.method3554(var24, (byte) -57, 25, var28, var23, null, var26, 0);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class463.field6598) {
            int var29 = class342.field4758.method3064((byte) -100);
            int var30 = class342.field4758.method3045(-125);
            int var31 = class342.field4758.method3066((byte) 101);
            if (var31 == 65535) {
                var31 = -1;
            }
            class135.method711(var30, var29, (byte) 78, var31);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class198.field2594) {
            int var32 = class342.field4758.method3090(-95);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = class342.field4758.method3088(-106);
            int var34 = class342.field4758.method3045(-127);
            class208.method1327(var34, 31944, var32, var33);
            class558.field7814 = null;
            return true;
        } else if (class623.field8998 == class558.field7814) {
            int var35 = class342.field4758.method3035(-957401312);
            int var36 = class342.field4758.method3041((byte) 105);
            if (var35 == 255) {
                var36 = -1;
                var35 = -1;
            }
            class208.method1329(var35, var36, 15);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class544.field7586) {
            int var37 = class342.field4758.method3039((byte) 127);
            int var38 = class342.field4758.method3066((byte) 101);
            int var39 = class342.field4758.method3057(122);
            if (class408.method2436(-8759, var37)) {
                class115.method616(var39, var38, 14);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class206.field2680) {
            class375.method2291(0, class493.field6883);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class176.field2271) {
            class379.field5305 = class342.field4758.method3035(-957401312);
            class540.field7559 = class342.field4758.method3034(18351) << 3;
            class506.field7056 = class342.field4758.method3034(18351) << 3;
            while (class342.field4758.field7707 < class262.field3333) {
                class317 var40 = class460.method2665(true)[class342.field4758.method3045(-128)];
                class375.method2291(0, var40);
            }
            class558.field7814 = null;
            return true;
        } else if (class598.field8639 == class558.field7814) {
            class375.method2291(0, class237.field3041);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class181.field2331) {
            int var41 = class342.field4758.method3090(-97);
            int var42 = class342.field4758.method3048(-4);
            int var43 = class342.field4758.method3045(-126);
            int var44 = class342.field4758.method3066((byte) 101);
            if (class408.method2436(-8759, var44)) {
                class496 var45 = (class496) class523.field7289.method3476((long) var42, (byte) 28);
                if (var45 != null) {
                    class489.method2752(false, var45, var45.field6914 != var41, false);
                }
                class149.method816(var43, var41, false, 1, var42);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class336.field4694) {
            int var46 = class342.field4758.method3090(-119);
            if (class408.method2436(-8759, var46)) {
                class591.method3410(-103);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class161.field2054) {
            boolean var47 = class342.field4758.method3045(-128) == 1;
            String var48 = class342.field4758.method3077(-20739);
            String var49 = var48;
            if (var47) {
                var49 = class342.field4758.method3077(-20739);
            }
            int var50 = class342.field4758.method3045(-126);
            boolean var51 = false;
            if (var50 <= 1) {
                if (!(!class162.field2065 || class586.field8498) || class591.field8543) {
                    var51 = true;
                } else if (var50 <= 1 && class442.method2564(var49, 0)) {
                    var51 = true;
                }
            }
            if (!var51 && class82.field1119 == 0) {
                String var52 = class545.method3016(class443.method2569(1, class342.field4758), (byte) -112);
                if (var50 == 2) {
                    class620.method3554("<img=1>" + var49, (byte) -57, 24, var52, "<img=1>" + var48, null, -1, 0);
                } else if (var50 == 1) {
                    class620.method3554("<img=0>" + var49, (byte) -57, 24, var52, "<img=0>" + var48, null, -1, 0);
                } else {
                    class620.method3554(var49, (byte) -57, 24, var52, var48, null, -1, 0);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class96.field1290 == class558.field7814) {
            class375.method2291(0, class501.field6952);
            class558.field7814 = null;
            return true;
        } else if (class616.field8881 == class558.field7814) {
            int var53 = class342.field4758.method3059(34);
            int var54 = class342.field4758.method3048(-4);
            int var55 = class342.field4758.method3045(-128);
            String var56 = "";
            String var57 = var56;
            if ((var55 & 0x1) != 0) {
                var56 = class342.field4758.method3077(-20739);
                if ((var55 & 0x2) == 0) {
                    var57 = var56;
                } else {
                    var57 = class342.field4758.method3077(-20739);
                }
            }
            String var58 = class342.field4758.method3077(-20739);
            if (var53 == 99) {
                class311.method1872(-4408, var58);
            } else if (var57.equals("") || !class442.method2564(var57, 0)) {
                class392.method2365(var58, (byte) -44, var54, var56, var53, var57);
            } else {
                class558.field7814 = null;
                return true;
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class144.field1874) {
            int var59 = class342.field4758.method3052(124);
            int var60 = class342.field4758.method3037(true);
            int var61 = class342.field4758.method3066((byte) 101);
            int var62 = class342.field4758.method3037(true);
            if (class408.method2436(-8759, var62)) {
                class85.method483((var61 << 16) + var60, 120, var59);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class402.field5500) {
            class375.method2291(0, class195.field2533);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class478.field6723) {
            int var63 = class342.field4758.method3052(-82);
            int var64 = class342.field4758.method3037(true);
            int var65 = class342.field4758.method3066((byte) 101);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class342.field4758.method3090(-72);
            if (var66 == 65535) {
                var66 = -1;
            }
            int var67 = class342.field4758.method3052(-53);
            if (class408.method2436(-8759, var64)) {
                for (int var68 = var65; var68 <= var66; var68++) {
                    long var69 = ((long) var67 << 32) + (long) var68;
                    class493 var71 = (class493) class395.field5459.method3476(var69, (byte) 28);
                    class493 var72;
                    if (var71 != null) {
                        var72 = new class493(var63, var71.field6884);
                        var71.method589(-8880);
                    } else if (var68 == -1) {
                        var72 = new class493(var63, class609.method3486(var67, 983030160).field6220.field6884);
                    } else {
                        var72 = new class493(var63, -1);
                    }
                    class395.field5459.method3475(-88, var72, var69);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class71.field963 == class558.field7814) {
            class493.method2772(false, 18747);
            class558.field7814 = null;
            return false;
        } else if (class72.field990 == class558.field7814) {
            class375.method2291(0, class544.field7584);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class381.field5332) {
            int var73 = class342.field4758.method3090(-111);
            int var74 = class342.field4758.method3066((byte) 101);
            int var75 = class342.field4758.method3078(16711680);
            if (class408.method2436(-8759, var74)) {
                class379.method2312(12, var73, var75);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class183.field2349) {
            boolean var76 = class342.field4758.method3045(-126) == 1;
            String var77 = class342.field4758.method3077(-20739);
            String var78 = var77;
            if (var76) {
                var78 = class342.field4758.method3077(-20739);
            }
            long var79 = (long) class342.field4758.method3090(-76);
            long var81 = (long) class342.field4758.method3043((byte) 49);
            int var83 = class342.field4758.method3045(-127);
            long var84 = (var79 << 32) + var81;
            boolean var86 = false;
            int var87 = 0;
            while (true) {
                if (var87 >= 100) {
                    if (var83 <= 1) {
                        if (!(!class162.field2065 || class586.field8498) || class591.field8543) {
                            var86 = true;
                        } else if (class442.method2564(var78, 0)) {
                            var86 = true;
                        }
                    }
                    break;
                }
                if (class49.field668[var87] == var84) {
                    var86 = true;
                    break;
                }
                var87++;
            }
            if (!var86 && class82.field1119 == 0) {
                class49.field668[class141.field1812] = var84;
                class141.field1812 = (class141.field1812 + 1) % 100;
                String var88 = class545.method3016(class443.method2569(1, class342.field4758), (byte) -118);
                if (var83 == 2) {
                    class620.method3554("<img=1>" + var78, (byte) -57, 7, var88, "<img=1>" + var77, null, -1, 0);
                } else if (var83 == 1) {
                    class620.method3554("<img=0>" + var78, (byte) -57, 7, var88, "<img=0>" + var77, null, -1, 0);
                } else {
                    class620.method3554(var78, (byte) -57, 3, var88, var77, null, -1, 0);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class529.field7398) {
            String var89 = class342.field4758.method3077(-20739);
            String var90 = class545.method3016(class443.method2569(1, class342.field4758), (byte) -120);
            class392.method2365(var90, (byte) 119, 0, var89, 6, var89);
            class558.field7814 = null;
            return true;
        } else if (class586.field8485 == class558.field7814) {
            int var91 = class342.field4758.method3090(-70);
            int var92 = class342.field4758.method3090(-100);
            int var93 = class342.field4758.method3090(-105);
            int var94 = class342.field4758.method3090(-100);
            if (class408.method2436(-8759, var91) && class508.field7087[var92] != null) {
                for (int var95 = var93; var95 < var94; var95++) {
                    int var96 = class342.field4758.method3043((byte) 49);
                    if (var95 < class508.field7087[var92].length && class508.field7087[var92][var95] != null) {
                        class508.field7087[var92][var95].field6268 = var96;
                    }
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class411.field5655) {
            int var97 = class342.field4758.method3052(125);
            int var98 = class342.field4758.method3062((byte) -117);
            int var99 = class342.field4758.method3037(true);
            int var100 = class342.field4758.method3087(true);
            if (class408.method2436(-8759, var99)) {
                class287.method1778(var98, var97, 11, var100);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class483.field6745) {
            int var101 = class342.field4758.method3037(true);
            int var102 = class342.field4758.method3052(-111);
            int var103 = class342.field4758.method3090(-113);
            int var104 = class342.field4758.method3052(-33);
            if (class408.method2436(-8759, var101)) {
                class376.method2301(var103, var104, 5, var102, -31631);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class360.field5025) {
            class375.method2291(0, class82.field1106);
            class558.field7814 = null;
            return true;
        } else if (class610.field8772 == class558.field7814) {
            int var105 = class342.field4758.method3090(-118);
            int var106 = class342.field4758.method3041((byte) 92);
            if (class408.method2436(-8759, var105)) {
                class50.field685 = var106;
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class438.field5963) {
            int var107 = class342.field4758.method3090(-90);
            if (var107 == 65535) {
                var107 = -1;
            }
            int var108 = class342.field4758.method3045(-125);
            int var109 = class342.field4758.method3090(-105);
            int var110 = class342.field4758.method3045(-125);
            class85.method481((byte) -103, var107, var110, var109, var108);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class367.field5112) {
            int var111 = class342.field4758.method3045(-125);
            int var112 = var111 >> 5;
            int var113 = var111 & 0x1F;
            if (var113 == 0) {
                class610.field8771[var112] = null;
                class558.field7814 = null;
                return true;
            }
            class617 var114 = new class617();
            var114.field8891 = var113;
            var114.field8888 = class342.field4758.method3045(-128);
            if (var114.field8888 >= 0 && class428.field5842.length > var114.field8888) {
                if (var114.field8891 == 1 || var114.field8891 == 10) {
                    var114.field8889 = class342.field4758.method3090(-118);
                    class342.field4758.field7707 += 6;
                } else if (var114.field8891 >= 2 && var114.field8891 <= 6) {
                    if (var114.field8891 == 2) {
                        var114.field8890 = 256;
                        var114.field8884 = 256;
                    }
                    if (var114.field8891 == 3) {
                        var114.field8884 = 0;
                        var114.field8890 = 256;
                    }
                    if (var114.field8891 == 4) {
                        var114.field8884 = 512;
                        var114.field8890 = 256;
                    }
                    if (var114.field8891 == 5) {
                        var114.field8884 = 256;
                        var114.field8890 = 0;
                    }
                    if (var114.field8891 == 6) {
                        var114.field8884 = 256;
                        var114.field8890 = 512;
                    }
                    var114.field8891 = 2;
                    var114.field8886 = class342.field4758.method3045(-126);
                    var114.field8884 += class342.field4758.method3090(-72) - class525.field7310 << 9;
                    var114.field8890 += class342.field4758.method3090(-121) - class58.field786 << 9;
                    var114.field8892 = class342.field4758.method3045(-127) << 2;
                    var114.field8883 = class342.field4758.method3090(-109);
                }
                var114.field8882 = class342.field4758.method3090(-82);
                if (var114.field8882 == 65535) {
                    var114.field8882 = -1;
                }
                class610.field8771[var112] = var114;
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class424.field5743) {
            int var115 = class342.field4758.method3037(true);
            int var116 = class342.field4758.method3057(-87);
            int var117 = class342.field4758.method3057(-111);
            if (class408.method2436(-8759, var115)) {
                class496 var118 = (class496) class523.field7289.method3476((long) var116, (byte) 28);
                class496 var119 = (class496) class523.field7289.method3476((long) var117, (byte) 28);
                if (var119 != null) {
                    class489.method2752(false, var119, var118 == null || var118.field6914 != var119.field6914, false);
                }
                if (var118 != null) {
                    var118.method589(-8880);
                    class523.field7289.method3475(-102, var118, (long) var117);
                }
                class447 var120 = class609.method3486(var116, 983030160);
                if (var120 != null) {
                    class90.method501(var120, -1);
                }
                class447 var121 = class609.method3486(var117, 983030160);
                if (var121 != null) {
                    class90.method501(var121, -1);
                    class558.method3136((byte) 89, var121, true);
                }
                if (class126.field1565 != -1) {
                    class562.method3154((byte) 125, 1, class126.field1565);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class171.field2189) {
            class181.method1118(false, -107);
            class558.field7814 = null;
            return true;
        } else if (class579.field8049 == class558.field7814) {
            if (class558.field7815 != null) {
                class459.method2662(class501.field6954.field7835, false, 91, -1, -1);
            }
            byte[] var122 = new byte[class262.field3333];
            class342.field4758.method375(0, 0, class262.field3333, var122);
            String var123 = class492.method2764(class262.field3333, var122, -3, 0);
            class534.method2967(var123, class428.field5845 == 1, true, false, class31.field488);
            class558.field7814 = null;
            return true;
        } else if (class598.field8631 == class558.field7814) {
            class98.method545(32491);
            class558.field7814 = null;
            return true;
        } else if (class57.field761 == class558.field7814) {
            int var124 = class342.field4758.method3041((byte) 100);
            int var125 = class342.field4758.method3039((byte) 127);
            int var126 = class342.field4758.method3090(-109);
            class480 var127 = (class480) class131.field1619.method3476((long) var125, (byte) 28);
            if (var127 != null) {
                class496.method2785(var124, var126, -3, var127.field6729);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class370.field5149) {
            boolean var128 = class342.field4758.method3045(-125) == 1;
            String var129 = class342.field4758.method3077(-20739);
            String var130 = var129;
            if (var128) {
                var130 = class342.field4758.method3077(-20739);
            }
            long var131 = class342.field4758.method3072(-24373);
            long var133 = (long) class342.field4758.method3090(-87);
            long var135 = (long) class342.field4758.method3043((byte) 49);
            int var137 = class342.field4758.method3045(-127);
            int var138 = class342.field4758.method3090(-93);
            long var139 = (var133 << 32) + var135;
            boolean var141 = false;
            int var142 = 0;
            while (true) {
                if (var142 >= 100) {
                    if (var137 <= 1 && class442.method2564(var130, 0)) {
                        var141 = true;
                    }
                    break;
                }
                if (class49.field668[var142] == var139) {
                    var141 = true;
                    break;
                }
                var142++;
            }
            if (!var141 && class82.field1119 == 0) {
                class49.field668[class141.field1812] = var139;
                class141.field1812 = (class141.field1812 + 1) % 100;
                String var143 = class548.field7632.method1438(var138, 2).method1226(class342.field4758, (byte) 12);
                if (var137 == 2) {
                    class620.method3554("<img=1>" + var130, (byte) -57, 20, var143, "<img=1>" + var129, class191.method1224(2783, var131), var138, 0);
                } else if (var137 == 1) {
                    class620.method3554("<img=0>" + var130, (byte) -57, 20, var143, "<img=0>" + var129, class191.method1224(2783, var131), var138, 0);
                } else {
                    class620.method3554(var130, (byte) -57, 20, var143, var129, class191.method1224(2783, var131), var138, 0);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class598.field8637 == class558.field7814) {
            class375.method2291(0, class233.field2974);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class310.field3970) {
            boolean var144 = class342.field4758.method3045(-128) == 1;
            byte[] var145 = new byte[class262.field3333 - 1];
            class342.field4758.method3086(0, var145, true, class262.field3333 - 1);
            class43.method238(var144, var145, (byte) -110);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class203.field2677) {
            boolean var146 = class342.field4758.method3045(-128) == 1;
            String var147 = class342.field4758.method3077(-20739);
            String var148 = var147;
            if (var146) {
                var148 = class342.field4758.method3077(-20739);
            }
            long var149 = class342.field4758.method3072(-24373);
            long var151 = (long) class342.field4758.method3090(-123);
            long var153 = (long) class342.field4758.method3043((byte) 49);
            int var155 = class342.field4758.method3045(-125);
            long var156 = (var151 << 32) + var153;
            boolean var158 = false;
            int var159 = 0;
            while (true) {
                if (var159 >= 100) {
                    if (var155 <= 1) {
                        if (!(!class162.field2065 || class586.field8498) || class591.field8543) {
                            var158 = true;
                        } else if (class442.method2564(var148, 0)) {
                            var158 = true;
                        }
                    }
                    break;
                }
                if (class49.field668[var159] == var156) {
                    var158 = true;
                    break;
                }
                var159++;
            }
            if (!var158 && class82.field1119 == 0) {
                class49.field668[class141.field1812] = var156;
                class141.field1812 = (class141.field1812 + 1) % 100;
                String var160 = class545.method3016(class443.method2569(1, class342.field4758), (byte) -118);
                if (var155 == 2 || var155 == 3) {
                    class620.method3554("<img=1>" + var148, (byte) -57, 9, var160, "<img=1>" + var147, class191.method1224(2783, var149), -1, 0);
                } else if (var155 == 1) {
                    class620.method3554("<img=0>" + var148, (byte) -57, 9, var160, "<img=0>" + var147, class191.method1224(2783, var149), -1, 0);
                } else {
                    class620.method3554(var148, (byte) -57, 9, var160, var147, class191.method1224(2783, var149), -1, 0);
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class268.field3419) {
            class257.field3191.method2359(-19839);
            class558.field7814 = null;
            class130.field1605 += 32;
            return true;
        } else if (class558.field7814 == class118.field1489) {
            class181.method1118(true, -71);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class308.field3939) {
            class493.method2772(class438.field5984, 18747);
            class558.field7814 = null;
            return false;
        } else if (class558.field7814 == class550.field7649) {
            class375.method2291(0, class488.field6796);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class418.field5714) {
            class375.method2291(0, class375.field5223);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class466.field6622) {
            int var161 = class342.field4758.method3090(-113);
            int var162 = class342.field4758.method3037(true);
            int var163 = class342.field4758.method3039((byte) 127);
            if (class408.method2436(-8759, var163)) {
                class406.method2424(false, var162, var161, 0);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class111.field1435) {
            int var164 = class342.field4758.method3090(-90);
            class20 var165;
            if (class182.field2335 == var164) {
                var165 = class147.field1899;
            } else {
                var165 = class364.field5092[var164];
            }
            if (var165 == null) {
                class558.field7814 = null;
                return true;
            }
            int var166 = class342.field4758.method3090(-85);
            int var167 = class342.field4758.method3045(-125);
            boolean var168 = (var166 & 0x8000) != 0;
            if (var165.field257 != null && var165.field274 != null) {
                boolean var169 = false;
                if (var167 <= 1) {
                    if (!var168 && !(!class162.field2065 || class586.field8498) || class591.field8543) {
                        var169 = true;
                    } else if (class442.method2564(var165.field257, 0)) {
                        var169 = true;
                    }
                }
                if (!var169 && class82.field1119 == 0) {
                    int var170 = -1;
                    String var172;
                    if (var168) {
                        var166 &= 0x7FFF;
                        class75 var171 = class249.method1522(0, class342.field4758);
                        var170 = var171.field1021;
                        var172 = var171.field1024.method1226(class342.field4758, (byte) 12);
                    } else {
                        var172 = class545.method3016(class443.method2569(1, class342.field4758), (byte) -126);
                    }
                    var165.field385 = var172.trim();
                    var165.field409 = 150;
                    var165.field412 = var166 >> 8;
                    var165.field333 = var166 & 0xFF;
                    int var173;
                    if (var167 == 1 || var167 == 2) {
                        var173 = var168 ? 17 : 1;
                    } else {
                        var173 = var168 ? 17 : 2;
                    }
                    if (var167 == 2) {
                        class620.method3554("<img=1>" + var165.method106(-1, false), (byte) -57, var173, var172, "<img=1>" + var165.method110(-1, true), null, var170, 0);
                    } else if (var167 == 1) {
                        class620.method3554("<img=0>" + var165.method106(-1, false), (byte) -57, var173, var172, "<img=0>" + var165.method110(-1, true), null, var170, 0);
                    } else {
                        class620.method3554(var165.method106(-1, false), (byte) -57, var173, var172, var165.method110(-1, true), null, var170, 0);
                    }
                }
            }
            class558.field7814 = null;
            return true;
        } else if (class83.field1124 == class558.field7814) {
            int var174 = class342.field4758.method3090(-125);
            int var175 = class342.field4758.method3066((byte) 101);
            int var176 = class342.field4758.method3066((byte) 101);
            int var177 = class342.field4758.method3052(124);
            int var178 = class342.field4758.method3039((byte) 127);
            if (class408.method2436(-8759, var178)) {
                class376.method2301(var176 << 16 | var174, var175, 7, var177, -31631);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class354.field4952) {
            if (class126.field1565 != -1) {
                class562.method3154((byte) -63, 0, class126.field1565);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class539.field7540) {
            class375.method2291(0, class559.field7822);
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class104.field1364) {
            int var179 = class342.field4758.method3090(-99);
            int var180 = class342.field4758.method3045(-125);
            int var181 = class342.field4758.method3045(-128);
            int var182 = class342.field4758.method3090(-120) << 2;
            int var183 = class342.field4758.method3045(-128);
            int var184 = class342.field4758.method3045(-125);
            if (class408.method2436(-8759, var179)) {
                class374.method2280(var184, var181, true, var182, (byte) -24, var180, var183);
            }
            class558.field7814 = null;
            return true;
        } else if (class558.field7814 == class220.field2813) {
            int var185 = class342.field4758.method3048(-4);
            int var186 = class342.field4758.method3039((byte) 127);
            if (class408.method2436(-8759, var186)) {
                class376.method2301(class182.field2335, 0, 5, var185, -31631);
            }
            class558.field7814 = null;
            return true;
        } else if (class584.field8449 == class558.field7814) {
            byte var187 = class342.field4758.method3034(18351);
            int var188 = class342.field4758.method3039((byte) 127);
            class257.field3191.method2360(-113, var188, var187);
            class558.field7814 = null;
            return true;
        } else {
            int var189 = 72 / ((arg0 - 69) / 36);
            if (class621.field8932 == class558.field7814) {
                class375.method2291(0, class97.field1302);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class336.field4695) {
                byte var190 = class342.field4758.method3051((byte) 89);
                int var191 = class342.field4758.method3039((byte) 127);
                int var192 = class342.field4758.method3090(-106);
                if (class408.method2436(-8759, var191)) {
                    class564.method3162(106, var192, var190);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class325.field4467) {
                int var193 = class342.field4758.method3052(2);
                int var194 = class342.field4758.method3039((byte) 127);
                class257.field3191.method2360(-112, var194, var193);
                class558.field7814 = null;
                return true;
            } else if (class634.field9231 == class558.field7814) {
                int var195 = class342.field4758.method3090(-99);
                int var196 = class342.field4758.method3045(-127);
                int var197 = class342.field4758.method3045(-127);
                int var198 = class342.field4758.method3090(-114) << 2;
                int var199 = class342.field4758.method3045(-127);
                int var200 = class342.field4758.method3045(-126);
                if (class408.method2436(-8759, var195)) {
                    class503.method2806(var199, var200, 256, var197, var196, var198);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class151.field1991) {
                class249.method1523(-10486);
                class558.field7814 = null;
                return false;
            } else if (class558.field7814 == class389.field5399) {
                class275.method1700(33);
                class558.field7814 = null;
                return false;
            } else if (class558.field7814 == class510.field7115) {
                int var201 = class342.field4758.method3090(-89);
                int var202 = class342.field4758.method3045(-125);
                boolean var203 = (var202 & 0x1) == 1;
                class438.method2556((byte) 48, var201, var203);
                int var204 = class342.field4758.method3090(-120);
                for (int var205 = 0; var205 < var204; var205++) {
                    int var206 = class342.field4758.method3090(-116);
                    int var207 = class342.field4758.method3045(-126);
                    if (var207 == 255) {
                        var207 = class342.field4758.method3078(16711680);
                    }
                    class20.method102(var206 - 1, var203, 121, var201, var205, var207);
                }
                class413.field5684[class143.method783(class530.field7400++, 31)] = var201;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class536.field7478) {
                class211.field2718 = class342.field4758.method3087(true);
                class558.field7814 = null;
                class411.field5646 = class591.field8533;
                return true;
            } else if (class558.field7814 == class20.field293) {
                int var208 = class342.field4758.method3090(-126);
                if (var208 == 65535) {
                    var208 = -1;
                }
                int var209 = class342.field4758.method3037(true);
                int var210 = class342.field4758.method3052(122);
                if (class408.method2436(-8759, var209)) {
                    class376.method2301(var208, -1, 2, var210, -31631);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class48.field657) {
                int var211 = class342.field4758.method3048(-4);
                class395.field5460 = class31.field488.method1721(var211, 3);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class390.field5409) {
                int var212 = class342.field4758.method3052(-69);
                String var213 = class342.field4758.method3077(-20739);
                int var214 = class342.field4758.method3090(-81);
                if (class408.method2436(-8759, var214)) {
                    class638.method3675(3, var212, var213);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class351.field4908) {
                int var215 = class342.field4758.method3041((byte) 103);
                int var216 = class342.field4758.method3078(16711680);
                int var217 = class342.field4758.method3037(true);
                int var218 = class342.field4758.method3066((byte) 101);
                int var219 = class342.field4758.method3066((byte) 101);
                boolean var220 = (var215 & 0x80) != 0;
                if ((var216 >> 30) != 0) {
                    int var252 = (var216 & 0x32BA922F) >> 28;
                    int var253 = ((var216 & 0xFFFD01C) >> 14) - class525.field7310;
                    int var254 = (var216 & 0x3FFF) - class58.field786;
                    if (var253 >= 0 && var254 >= 0 && class139.field1760 > var253 && class369.field5135 > var254) {
                        int var255 = var253 * 512 + 256;
                        int var256 = var254 * 512 + 256;
                        int var257 = var252;
                        if (var252 < 3 && class291.method1786(var254, (byte) 124, var253)) {
                            var257 = var252 + 1;
                        }
                        class35 var258 = new class35(var219, 0, class7.field61, var252, var257, var255, class341.method2147(var252, var255, 0, var256) - var218, var256, var253, var253, var254, var254, var215 & 0x7);
                        class239.field3052.method3181(new class338(var258), true);
                    }
                } else if ((var216 >> 29) != 0) {
                    int var221 = var216 & 0xFFFF;
                    class480 var222 = (class480) class131.field1619.method3476((long) var221, (byte) 28);
                    if (var222 != null) {
                        if (var219 == 65535) {
                            var219 = -1;
                        }
                        class585 var223 = var222.field6729;
                        boolean var224 = true;
                        int var225 = var220 ? var223.field357 : var223.field380;
                        if (var219 != -1 && var225 != -1) {
                            if (var219 == var225) {
                                class628 var226 = class410.field5636.method348(6410, var219);
                                if (var226.field9162 && var226.field9152 != -1) {
                                    class320 var227 = class609.field8754.method535(var226.field9152, true);
                                    int var228 = var227.field4419;
                                    if (var228 == 0 || var228 == 2) {
                                        var224 = false;
                                    } else if (var228 == 1) {
                                        var224 = true;
                                    }
                                }
                            } else {
                                class628 var229 = class410.field5636.method348(6410, var219);
                                class628 var230 = class410.field5636.method348(6410, var225);
                                if (var229.field9152 != -1 && var230.field9152 != -1) {
                                    class320 var231 = class609.field8754.method535(var229.field9152, true);
                                    class320 var232 = class609.field8754.method535(var230.field9152, true);
                                    if (var232.field4430 > var231.field4430) {
                                        var224 = false;
                                    }
                                }
                            }
                        }
                        if (var224) {
                            if (var220) {
                                var223.field358 = 0;
                                var223.field357 = var219;
                                var223.field352 = 0;
                                var223.field329 = var215 & 0x7;
                                var223.field377 = class7.field61 + var217;
                                var223.field403 = 1;
                                var223.field320 = var218;
                                if (class7.field61 < var223.field377) {
                                    var223.field352 = -1;
                                }
                                if (var223.field357 != -1 && class7.field61 == var223.field377) {
                                    int var233 = class410.field5636.method348(6410, var223.field357).field9152;
                                    if (var233 != -1) {
                                        class320 var234 = class609.field8754.method535(var233, true);
                                        if (var234 != null && var234.field4431 != null) {
                                            class627.method3629(var223.field6368, false, var234, 0, var223.field6358, (byte) -108, var223.field6362);
                                        }
                                    }
                                }
                            } else {
                                var223.field380 = var219;
                                var223.field369 = class7.field61 + var217;
                                var223.field387 = 1;
                                var223.field411 = 0;
                                var223.field374 = var218;
                                var223.field324 = 0;
                                var223.field349 = var215 & 0x7;
                                if (var223.field369 > class7.field61) {
                                    var223.field411 = -1;
                                }
                                if (var223.field380 != -1 && class7.field61 == var223.field369) {
                                    int var235 = class410.field5636.method348(6410, var223.field380).field9152;
                                    if (var235 != -1) {
                                        class320 var236 = class609.field8754.method535(var235, true);
                                        if (var236 != null && var236.field4431 != null) {
                                            class627.method3629(var223.field6368, false, var236, 0, var223.field6358, (byte) -120, var223.field6362);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var216 >> 28 != 0) {
                    int var237 = var216 & 0xFFFF;
                    class20 var238;
                    if (class182.field2335 == var237) {
                        var238 = class147.field1899;
                    } else {
                        var238 = class364.field5092[var237];
                    }
                    if (var238 != null) {
                        if (var219 == 65535) {
                            var219 = -1;
                        }
                        boolean var239 = true;
                        int var240 = var220 ? var238.field357 : var238.field380;
                        if (var219 != -1 && var240 != -1) {
                            if (var219 == var240) {
                                class628 var245 = class410.field5636.method348(6410, var219);
                                if (var245.field9162 && var245.field9152 != -1) {
                                    class320 var246 = class609.field8754.method535(var245.field9152, true);
                                    int var247 = var246.field4419;
                                    if (var247 == 0 || var247 == 2) {
                                        var239 = false;
                                    } else if (var247 == 1) {
                                        var239 = true;
                                    }
                                }
                            } else {
                                class628 var241 = class410.field5636.method348(6410, var219);
                                class628 var242 = class410.field5636.method348(6410, var240);
                                if (var241.field9152 != -1 && var242.field9152 != -1) {
                                    class320 var243 = class609.field8754.method535(var241.field9152, true);
                                    class320 var244 = class609.field8754.method535(var242.field9152, true);
                                    if (var243.field4430 < var244.field4430) {
                                        var239 = false;
                                    }
                                }
                            }
                        }
                        if (var239) {
                            if (var220) {
                                var238.field320 = var218;
                                var238.field403 = 1;
                                var238.field377 = class7.field61 + var217;
                                var238.field352 = 0;
                                var238.field357 = var219;
                                var238.field358 = 0;
                                var238.field329 = var215 & 0x7;
                                if (class7.field61 < var238.field377) {
                                    var238.field352 = -1;
                                }
                                if (var238.field357 == 65535) {
                                    var238.field357 = -1;
                                }
                                if (var238.field357 != -1 && class7.field61 == var238.field377) {
                                    int var248 = class410.field5636.method348(6410, var238.field357).field9152;
                                    if (var248 != -1) {
                                        class320 var249 = class609.field8754.method535(var248, true);
                                        if (var249 != null && var249.field4431 != null) {
                                            class627.method3629(var238.field6368, class147.field1899 == var238, var249, 0, var238.field6358, (byte) -113, var238.field6362);
                                        }
                                    }
                                }
                            } else {
                                var238.field369 = class7.field61 + var217;
                                var238.field324 = 0;
                                var238.field349 = var215 & 0x7;
                                var238.field411 = 0;
                                var238.field387 = 1;
                                var238.field374 = var218;
                                var238.field380 = var219;
                                if (var238.field380 == 65535) {
                                    var238.field380 = -1;
                                }
                                if (class7.field61 < var238.field369) {
                                    var238.field411 = -1;
                                }
                                if (var238.field380 != -1 && class7.field61 == var238.field369) {
                                    int var250 = class410.field5636.method348(6410, var238.field380).field9152;
                                    if (var250 != -1) {
                                        class320 var251 = class609.field8754.method535(var250, true);
                                        if (var251 != null && var251.field4431 != null) {
                                            class627.method3629(var238.field6368, class147.field1899 == var238, var251, 0, var238.field6358, (byte) -127, var238.field6362);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class485.field6775) {
                class342.field4758.field7707 += 28;
                if (class342.field4758.method3070(0)) {
                    class80.method454(26440, class342.field4758, class342.field4758.field7707 - 28);
                }
                class558.field7814 = null;
                return true;
            } else if (class623.field8994 == class558.field7814) {
                int var259 = class342.field4758.method3052(-21);
                int var260 = class342.field4758.method3037(true);
                int var261 = class342.field4758.method3039((byte) 127);
                if (class408.method2436(-8759, var261)) {
                    class353.method2201(var260, var259, 124);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class345.field4779) {
                class558.field7814 = null;
                return false;
            } else if (class558.field7814 == class149.field1931) {
                for (int var262 = 0; var262 < class364.field5092.length; var262++) {
                    if (class364.field5092[var262] != null) {
                        class364.field5092[var262].field368 = -1;
                    }
                }
                for (int var263 = 0; var263 < class604.field8710; var263++) {
                    class179.field2310[var263].field6729.field368 = -1;
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class208.field2704) {
                class466.field6613 = class342.field4758.method3045(-128);
                for (int var264 = 0; var264 < class466.field6613; var264++) {
                    class546.field7616[var264] = class342.field4758.method3077(-20739);
                    class126.field1572[var264] = class342.field4758.method3077(-20739);
                    if (class126.field1572[var264].equals("")) {
                        class126.field1572[var264] = class546.field7616[var264];
                    }
                    class282.field3694[var264] = class342.field4758.method3077(-20739);
                    class321.field4442[var264] = class342.field4758.method3077(-20739);
                    if (class321.field4442[var264].equals("")) {
                        class321.field4442[var264] = class282.field3694[var264];
                    }
                    class404.field5535[var264] = false;
                }
                class277.field3625 = class591.field8533;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class356.field4981) {
                int var265 = class342.field4758.method3090(-118);
                int var266 = class342.field4758.method3045(-125);
                boolean var267 = (var266 & 0x1) == 1;
                while (class262.field3333 > class342.field4758.field7707) {
                    int var268 = class342.field4758.method3059(89);
                    int var269 = class342.field4758.method3090(-86);
                    int var270 = 0;
                    if (var269 != 0) {
                        var270 = class342.field4758.method3045(-125);
                        if (var270 == 255) {
                            var270 = class342.field4758.method3048(-4);
                        }
                    }
                    class20.method102(var269 - 1, var267, 22, var265, var268, var270);
                }
                class413.field5684[class143.method783(31, class530.field7400++)] = var265;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class208.field2705) {
                class375.method2291(0, class288.field3760);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class453.field6428) {
                class618.method3547(class342.field4758, class31.field488, 2, class262.field3333);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class54.field724) {
                class540.field7559 = class342.field4758.method3033((byte) 120) << 3;
                class506.field7056 = class342.field4758.method3033((byte) 107) << 3;
                class379.field5305 = class342.field4758.method3064((byte) -73);
                class558.field7814 = null;
                return true;
            } else if (class637.field9250 == class558.field7814) {
                boolean var271 = class342.field4758.method3045(-125) == 1;
                String var272 = class342.field4758.method3077(-20739);
                String var273 = var272;
                if (var271) {
                    var273 = class342.field4758.method3077(-20739);
                }
                long var274 = (long) class342.field4758.method3090(-102);
                long var276 = (long) class342.field4758.method3043((byte) 49);
                int var278 = class342.field4758.method3045(-125);
                int var279 = class342.field4758.method3090(-108);
                long var280 = (var274 << 32) + var276;
                boolean var282 = false;
                int var283 = 0;
                while (true) {
                    if (var283 >= 100) {
                        if (var278 <= 1 && class442.method2564(var273, 0)) {
                            var282 = true;
                        }
                        break;
                    }
                    if (class49.field668[var283] == var280) {
                        var282 = true;
                        break;
                    }
                    var283++;
                }
                if (!var282 && class82.field1119 == 0) {
                    class49.field668[class141.field1812] = var280;
                    class141.field1812 = (class141.field1812 + 1) % 100;
                    String var284 = class548.field7632.method1438(var279, 2).method1226(class342.field4758, (byte) 12);
                    if (var278 == 2) {
                        class620.method3554("<img=1>" + var273, (byte) -57, 18, var284, "<img=1>" + var272, null, var279, 0);
                    } else if (var278 == 1) {
                        class620.method3554("<img=0>" + var273, (byte) -57, 18, var284, "<img=0>" + var272, null, var279, 0);
                    } else {
                        class620.method3554(var273, (byte) -57, 18, var284, var272, null, var279, 0);
                    }
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class165.field2093) {
                int var285 = class342.field4758.method3037(true);
                int var286 = class342.field4758.method3035(-957401312);
                int var287 = class342.field4758.method3037(true);
                if (class408.method2436(-8759, var287)) {
                    if (var286 == 2) {
                        class497.method2788(-450);
                    }
                    class126.field1565 = var285;
                    class53.method298(var285, 0);
                    class266.method1638(true, false);
                    class218.method1409(class126.field1565);
                    for (int var288 = 0; var288 < 100; var288++) {
                        class99.field1326[var288] = true;
                    }
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class130.field1597) {
                class72.field995 = class99.method554(class342.field4758.method3045(-125), -14821);
                class558.field7814 = null;
                return true;
            } else if (class90.field1199 == class558.field7814) {
                int var289 = class342.field4758.method3090(-91);
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var290 = class342.field4758.method3045(-127);
                int var291 = class342.field4758.method3090(-123);
                int var292 = class342.field4758.method3045(-128);
                class590.method3406(var290, var292, var291, var289, (byte) 103);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class452.field6402) {
                class288.field3764 = class342.field4758.method3045(-128);
                class558.field7814 = null;
                class411.field5646 = class591.field8533;
                return true;
            } else if (class558.field7814 == class150.field1977) {
                int var293 = class342.field4758.method3090(-100);
                String var294 = class342.field4758.method3077(-20739);
                Object[] var295 = new Object[var294.length() + 1];
                for (int var296 = var294.length() - 1; var296 >= 0; var296--) {
                    if (var294.charAt(var296) == 's') {
                        var295[var296 + 1] = class342.field4758.method3077(-20739);
                    } else {
                        var295[var296 + 1] = Integer.valueOf(class342.field4758.method3048(-4));
                    }
                }
                var295[0] = Integer.valueOf(class342.field4758.method3048(-4));
                if (class408.method2436(-8759, var293)) {
                    class9 var297 = new class9();
                    var297.field81 = var295;
                    class218.method1408(var297);
                }
                class558.field7814 = null;
                return true;
            } else if (class9.field74 == class558.field7814) {
                int var298 = class342.field4758.method3090(-98);
                int var299 = class342.field4758.method3045(-125);
                int var300 = class342.field4758.method3045(-128);
                int var301 = class342.field4758.method3045(-128);
                int var302 = class342.field4758.method3045(-125);
                int var303 = class342.field4758.method3090(-84);
                if (class408.method2436(-8759, var298)) {
                    class126.field1570[var299] = true;
                    class463.field6589[var299] = var300;
                    class167.field2120[var299] = var301;
                    class81.field1097[var299] = var302;
                    class641.field9305[var299] = var303;
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class424.field5740) {
                int var304 = class342.field4758.method3090(-99);
                if (var304 == 65535) {
                    var304 = -1;
                }
                int var305 = class342.field4758.method3066((byte) 101);
                int var306 = class342.field4758.method3078(16711680);
                if (class408.method2436(-8759, var305)) {
                    class376.method2301(var304, -1, 1, var306, -31631);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class220.field2816) {
                int var307 = class342.field4758.method3045(-125);
                if (class342.field4758.method3045(-125) == 0) {
                    class615.field8867[var307] = new class190();
                } else {
                    class342.field4758.field7707--;
                    class615.field8867[var307] = new class190(class342.field4758);
                }
                class510.field7110 = class591.field8533;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class356.field4982) {
                int var308 = class342.field4758.method3090(-100);
                int var309 = class342.field4758.method3078(16711680);
                int var310 = class342.field4758.method3048(-4);
                int var311 = class342.field4758.method3037(true);
                if (var311 == 65535) {
                    var311 = -1;
                }
                if (class408.method2436(-8759, var308)) {
                    class255.method1536(var311, false, var309, var310);
                    class456 var312 = class98.field1307.method3391(0, var311);
                    class523.method2927((byte) -60, var312.field6466, var310, var312.field6453, var312.field6517);
                    class221.method1418(var312.field6474, var310, var312.field6510, (byte) -128, var312.field6470);
                }
                class558.field7814 = null;
                return true;
            } else if (class637.field9251 == class558.field7814) {
                class75.field1025 = class591.field8533;
                if (class262.field3333 == 0) {
                    class99.field1331 = null;
                    class323.field4445 = 0;
                    class633.field9207 = null;
                    class502.field6983 = null;
                    class558.field7814 = null;
                    return true;
                }
                class502.field6983 = class342.field4758.method3077(-20739);
                boolean var313 = class342.field4758.method3045(-128) == 1;
                if (var313) {
                    class342.field4758.method3077(-20739);
                }
                long var314 = class342.field4758.method3072(-24373);
                class99.field1331 = class387.method2338((byte) -125, var314);
                class123.field1538 = class342.field4758.method3051((byte) 115);
                int var316 = class342.field4758.method3045(-127);
                if (var316 == 255) {
                    class558.field7814 = null;
                    return true;
                }
                class323.field4445 = var316;
                class527[] var317 = new class527[100];
                for (int var318 = 0; var318 < class323.field4445; var318++) {
                    var317[var318] = new class527();
                    var317[var318].field7333 = class342.field4758.method3077(-20739);
                    boolean var324 = class342.field4758.method3045(-128) == 1;
                    if (var324) {
                        var317[var318].field7328 = class342.field4758.method3077(-20739);
                    } else {
                        var317[var318].field7328 = var317[var318].field7333;
                    }
                    var317[var318].field7336 = class22.method125(94, var317[var318].field7328);
                    var317[var318].field7330 = class342.field4758.method3090(-84);
                    var317[var318].field7332 = class342.field4758.method3051((byte) -100);
                    var317[var318].field7329 = class342.field4758.method3077(-20739);
                    if (var317[var318].field7328.equals(class147.field1899.field257)) {
                        class492.field6877 = var317[var318].field7332;
                    }
                }
                boolean var319 = false;
                int var320 = class323.field4445;
                while (var320 > 0) {
                    boolean var321 = true;
                    var320--;
                    for (int var322 = 0; var322 < var320; var322++) {
                        if (var317[var322].field7336.compareTo(var317[var322 + 1].field7336) > 0) {
                            class527 var323 = var317[var322];
                            var317[var322] = var317[var322 + 1];
                            var317[var322 + 1] = var323;
                            var321 = false;
                        }
                    }
                    if (var321) {
                        break;
                    }
                }
                class558.field7814 = null;
                class633.field9207 = var317;
                return true;
            } else if (class558.field7814 == class125.field1554) {
                int var325 = class342.field4758.method3052(126);
                int var326 = class342.field4758.method3037(true);
                int var327 = class342.field4758.method3037(true);
                if (class408.method2436(-8759, var326)) {
                    class564.method3162(112, var327, var325);
                }
                class558.field7814 = null;
                return true;
            } else if (class643.field9331 == class558.field7814) {
                int var328 = class342.field4758.method3066((byte) 101);
                int var329 = class342.field4758.method3041((byte) 120);
                boolean var330 = (var329 & 0x1) == 1;
                class556.method3117(var328, var330, -30390);
                class413.field5684[class143.method783(31, class530.field7400++)] = var328;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class510.field7114) {
                int var331 = class342.field4758.method3045(-128);
                String var332 = class342.field4758.method3077(-20739);
                int var333 = class342.field4758.method3041((byte) 107);
                int var334 = class342.field4758.method3066((byte) 101);
                if (var334 == 65535) {
                    var334 = -1;
                }
                if (var331 >= 1 && var331 <= 8) {
                    if (var332.equalsIgnoreCase("null")) {
                        var332 = null;
                    }
                    class646.field9352[var331 - 1] = var332;
                    class48.field660[var331 - 1] = var334;
                    class261.field3254[var331 - 1] = var333 == 0;
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class217.field2770) {
                int var335 = class342.field4758.method3039((byte) 127);
                int var336 = class342.field4758.method3037(true);
                String var337 = class342.field4758.method3077(-20739);
                if (class408.method2436(-8759, var336)) {
                    class69.method392(9228, var335, var337);
                }
                class558.field7814 = null;
                return true;
            } else if (class559.field7826 == class558.field7814) {
                int var338 = class342.field4758.method3066((byte) 101);
                if (var338 == 65535) {
                    var338 = -1;
                }
                int var339 = class342.field4758.method3066((byte) 101);
                int var340 = class342.field4758.method3048(-4);
                if (class408.method2436(-8759, var339)) {
                    class554.method3107(-4097, var338, var340);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class40.field599) {
                String var341 = class342.field4758.method3077(-20739);
                int var342 = class342.field4758.method3090(-76);
                String var343 = class548.field7632.method1438(var342, 2).method1226(class342.field4758, (byte) 12);
                class620.method3554(var341, (byte) -57, 19, var343, var341, null, var342, 0);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class150.field1958) {
                int var344 = class342.field4758.method3039((byte) 127);
                int var345 = class342.field4758.method3090(-122);
                if (var345 == 65535) {
                    var345 = -1;
                }
                int var346 = class342.field4758.method3066((byte) 101);
                int var347 = class342.field4758.method3057(111);
                int var348 = class342.field4758.method3037(true);
                if (var348 == 65535) {
                    var348 = -1;
                }
                if (class408.method2436(-8759, var346)) {
                    for (int var349 = var348; var349 <= var345; var349++) {
                        long var350 = ((long) var347 << 32) + ((long) var349);
                        class493 var352 = (class493) class395.field5459.method3476(var350, (byte) 28);
                        class493 var353;
                        if (var352 != null) {
                            var353 = new class493(var352.field6885, var344);
                            var352.method589(-8880);
                        } else if (var349 == -1) {
                            var353 = new class493(class609.method3486(var347, 983030160).field6220.field6885, var344);
                        } else {
                            var353 = new class493(0, var344);
                        }
                        class395.field5459.method3475(-111, var353, var350);
                    }
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class387.field5385) {
                class540.field7559 = class342.field4758.method3034(18351) << 3;
                class379.field5305 = class342.field4758.method3045(-128);
                class506.field7056 = class342.field4758.method3033((byte) 115) << 3;
                for (class247 var354 = (class247) class241.field3066.method3473(-27089); var354 != null; var354 = (class247) class241.field3066.method3478((byte) 5)) {
                    int var356 = (int) (var354.field1401 >> 28 & 0x3L);
                    int var357 = (int) (var354.field1401 & 0x3FFFL);
                    int var358 = var357 - class525.field7310;
                    int var359 = (int) (var354.field1401 >> 14 & 0x3FFFL);
                    int var360 = var359 - class58.field786;
                    if (class379.field5305 == var356 && class506.field7056 <= var358 && class506.field7056 + 8 > var358 && class540.field7559 <= var360 && var360 < class540.field7559 + 8) {
                        var354.method589(-8880);
                        if (var358 >= 0 && var360 >= 0 && var358 < class139.field1760 && var360 < class369.field5135) {
                            class373.method2278(var358, -53, var360, class379.field5305);
                        }
                    }
                }
                for (class596 var355 = (class596) class556.field7781.method3188((byte) -100); var355 != null; var355 = (class596) class556.field7781.method3182((byte) -41)) {
                    if (var355.field8595 >= class506.field7056 && (class506.field7056 + 8) > var355.field8595 && var355.field8590 >= class540.field7559 && var355.field8590 < class540.field7559 + 8 && class379.field5305 == var355.field8599) {
                        var355.field8594 = 0;
                    }
                }
                class558.field7814 = null;
                return true;
            } else if (class635.field9235 == class558.field7814) {
                String var361 = class342.field4758.method3077(-20739);
                boolean var362 = class342.field4758.method3045(-127) == 1;
                String var363;
                if (var362) {
                    var363 = class342.field4758.method3077(-20739);
                } else {
                    var363 = var361;
                }
                int var364 = class342.field4758.method3090(-107);
                byte var365 = class342.field4758.method3051((byte) -61);
                boolean var366 = false;
                if (var365 == -128) {
                    var366 = true;
                }
                if (var366) {
                    if (class323.field4445 == 0) {
                        class558.field7814 = null;
                        return true;
                    }
                    boolean var372 = false;
                    int var373;
                    for (var373 = 0; class323.field4445 > var373 && (!class633.field9207[var373].field7328.equals(var363) || class633.field9207[var373].field7330 != var364); var373++) {
                    }
                    if (var373 < class323.field4445) {
                        while (var373 < (class323.field4445 - 1)) {
                            class633.field9207[var373] = class633.field9207[var373 + 1];
                            var373++;
                        }
                        class323.field4445--;
                        class633.field9207[class323.field4445] = null;
                    }
                } else {
                    String var367 = class342.field4758.method3077(-20739);
                    class527 var368 = new class527();
                    var368.field7328 = var363;
                    var368.field7333 = var361;
                    var368.field7336 = class22.method125(28, var368.field7328);
                    var368.field7330 = var364;
                    var368.field7332 = var365;
                    var368.field7329 = var367;
                    int var369;
                    for (var369 = class323.field4445 - 1; var369 >= 0; var369--) {
                        int var370 = class633.field9207[var369].field7336.compareTo(var368.field7336);
                        if (var370 == 0) {
                            class633.field9207[var369].field7330 = var364;
                            class633.field9207[var369].field7332 = var365;
                            class633.field9207[var369].field7329 = var367;
                            if (var363.equals(class147.field1899.field257)) {
                                class492.field6877 = var365;
                            }
                            class75.field1025 = class591.field8533;
                            class558.field7814 = null;
                            return true;
                        }
                        if (var370 < 0) {
                            break;
                        }
                    }
                    if (class323.field4445 >= class633.field9207.length) {
                        class558.field7814 = null;
                        return true;
                    }
                    for (int var371 = class323.field4445 - 1; var371 > var369; var371--) {
                        class633.field9207[var371 + 1] = class633.field9207[var371];
                    }
                    if (class323.field4445 == 0) {
                        class633.field9207 = new class527[100];
                    }
                    class633.field9207[var369 + 1] = var368;
                    class323.field4445++;
                    if (var363.equals(class147.field1899.field257)) {
                        class492.field6877 = var365;
                    }
                }
                class75.field1025 = class591.field8533;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class449.field6345) {
                class445.method2591(-9009, class342.field4758, class262.field3333);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class443.field6128) {
                class598.field8638 = class342.field4758.method3045(-128);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class329.field4556) {
                int var374 = class342.field4758.method3064((byte) -73);
                int var375 = class342.field4758.method3064((byte) -109);
                int var376 = class342.field4758.method3057(-81);
                class181.field2323[var375] = var376;
                class235.field3012[var375] = var374;
                class99.field1329[var375] = 1;
                int var377 = class197.field2583[var375] - 1;
                for (int var378 = 0; var378 < var377; var378++) {
                    if (class113.field1456[var378] <= var376) {
                        class99.field1329[var375] = var378 + 2;
                    }
                }
                class489.field6805[class143.method783(class459.field6556++, 31)] = var375;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class48.field654) {
                int var379 = class342.field4758.method3037(true);
                int var380 = class342.field4758.method3087(true);
                int var381 = class342.field4758.method3052(122);
                if (class408.method2436(-8759, var379)) {
                    class40.method232(var381, var380, (byte) -124);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class285.field3712) {
                class375.method2291(0, class294.field3826);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class50.field686) {
                class551.field7718 = class342.field4758.method3091((byte) -115);
                class162.field2065 = class342.field4758.method3045(-125) == 1;
                class558.field7814 = null;
                return true;
            } else if (class71.field960 == class558.field7814) {
                class379.method2308(123, class342.field4758.method3077(-20739));
                class558.field7814 = null;
                return true;
            } else if (class7.field59 == class558.field7814) {
                int var382 = class342.field4758.method3037(true);
                int var383 = class342.field4758.method3039((byte) 127);
                int var384 = class342.field4758.method3037(true);
                int var385 = class342.field4758.method3090(-96);
                int var386 = class342.field4758.method3052(123);
                if (class408.method2436(-8759, var384)) {
                    class523.method2927((byte) -60, var383, var386, var385, var382);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class476.field6705) {
                class375.method2291(0, class179.field2306);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class50.field677) {
                class375.method2291(0, class167.field2117);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class459.field6558) {
                while (class262.field3333 > class342.field4758.field7707) {
                    boolean var397 = class342.field4758.method3045(-127) == 1;
                    String var398 = class342.field4758.method3077(-20739);
                    String var399 = class342.field4758.method3077(-20739);
                    int var400 = class342.field4758.method3090(-74);
                    int var401 = class342.field4758.method3045(-125);
                    String var402 = "";
                    boolean var403 = false;
                    if (var400 > 0) {
                        var402 = class342.field4758.method3077(-20739);
                        var403 = class342.field4758.method3045(-128) == 1;
                    }
                    for (int var404 = 0; var404 < class447.field6284; var404++) {
                        if (var397) {
                            if (var399.equals(class395.field5457[var404])) {
                                class395.field5457[var404] = var398;
                                var398 = null;
                                class71.field964[var404] = var399;
                                break;
                            }
                        } else if (var398.equals(class395.field5457[var404])) {
                            if (class337.field4722[var404] != var400) {
                                boolean var405 = true;
                                for (class575 var406 = (class575) class434.field5902.method1876((byte) -49); var406 != null; var406 = (class575) class434.field5902.method1877(0)) {
                                    if (var406.field8023.equals(var398)) {
                                        if (var400 != 0 && var406.field8026 == 0) {
                                            var405 = false;
                                            var406.method3394(false);
                                        } else if (var400 == 0 && var406.field8026 != 0) {
                                            var406.method3394(false);
                                            var405 = false;
                                        }
                                    }
                                }
                                if (var405) {
                                    class434.field5902.method1873(new class575(var398, var400), true);
                                }
                                class337.field4722[var404] = var400;
                            }
                            class71.field964[var404] = var399;
                            class610.field8767[var404] = var402;
                            class489.field6800[var404] = var401;
                            var398 = null;
                            class215.field2761[var404] = var403;
                            break;
                        }
                    }
                    if (var398 != null && class447.field6284 < 200) {
                        class395.field5457[class447.field6284] = var398;
                        class71.field964[class447.field6284] = var399;
                        class337.field4722[class447.field6284] = var400;
                        class610.field8767[class447.field6284] = var402;
                        class489.field6800[class447.field6284] = var401;
                        class215.field2761[class447.field6284] = var403;
                        class447.field6284++;
                    }
                }
                class410.field5632 = 2;
                class277.field3625 = class591.field8533;
                boolean var387 = false;
                int var388 = class447.field6284;
                while (var388 > 0) {
                    boolean var389 = true;
                    var388--;
                    for (int var390 = 0; var390 < var388; var390++) {
                        if (class337.field4722[var390] != class78.field1058.field3702 && class337.field4722[var390 + 1] == class78.field1058.field3702 || class337.field4722[var390] == 0 && class337.field4722[var390 + 1] != 0) {
                            int var391 = class337.field4722[var390];
                            class337.field4722[var390] = class337.field4722[var390 + 1];
                            class337.field4722[var390 + 1] = var391;
                            String var392 = class610.field8767[var390];
                            class610.field8767[var390] = class610.field8767[var390 + 1];
                            class610.field8767[var390 + 1] = var392;
                            String var393 = class395.field5457[var390];
                            class395.field5457[var390] = class395.field5457[var390 + 1];
                            class395.field5457[var390 + 1] = var393;
                            String var394 = class71.field964[var390];
                            class71.field964[var390] = class71.field964[var390 + 1];
                            class71.field964[var390 + 1] = var394;
                            int var395 = class489.field6800[var390];
                            class489.field6800[var390] = class489.field6800[var390 + 1];
                            class489.field6800[var390 + 1] = var395;
                            boolean var396 = class215.field2761[var390];
                            class215.field2761[var390] = class215.field2761[var390 + 1];
                            class215.field2761[var390 + 1] = var396;
                            var389 = false;
                        }
                    }
                    if (var389) {
                        break;
                    }
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class411.field5650) {
                int var407 = class342.field4758.method3052(-85);
                int var408 = class342.field4758.method3090(-128);
                if (class408.method2436(-8759, var408)) {
                    class376.method2301(-1, -1, 3, var407, -31631);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class140.field1779) {
                class594.field8570 = class342.field4758.method3064((byte) -88);
                class20.field296 = class342.field4758.method3045(-126);
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class263.field3354) {
                int var409 = class342.field4758.method3045(-128);
                boolean var410 = (var409 & 0x1) == 1;
                String var411 = class342.field4758.method3077(-20739);
                String var412 = class342.field4758.method3077(-20739);
                if (var412.equals("")) {
                    var412 = var411;
                }
                String var413 = class342.field4758.method3077(-20739);
                String var414 = class342.field4758.method3077(-20739);
                if (var414.equals("")) {
                    var414 = var413;
                }
                if (var410) {
                    for (int var415 = 0; var415 < class466.field6613; var415++) {
                        if (class126.field1572[var415].equals(var414)) {
                            class546.field7616[var415] = var411;
                            class126.field1572[var415] = var412;
                            class282.field3694[var415] = var413;
                            class321.field4442[var415] = var414;
                            break;
                        }
                    }
                } else {
                    class546.field7616[class466.field6613] = var411;
                    class126.field1572[class466.field6613] = var412;
                    class282.field3694[class466.field6613] = var413;
                    class321.field4442[class466.field6613] = var414;
                    class404.field5535[class466.field6613] = class143.method783(var409, 2) == 2;
                    class466.field6613++;
                }
                class277.field3625 = class591.field8533;
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class226.field2889) {
                int var416 = class342.field4758.method3039((byte) 127);
                int var417 = class342.field4758.method3078(16711680);
                int var418 = class342.field4758.method3041((byte) 87);
                if (class408.method2436(-8759, var416)) {
                    class485.method2741(14, var417, var418);
                }
                class558.field7814 = null;
                return true;
            } else if (class558.field7814 == class370.field5161) {
                int var419 = class342.field4758.method3090(-89);
                if (class408.method2436(-8759, var419)) {
                    class529.method2951(0);
                }
                class558.field7814 = null;
                return true;
            } else if (class59.field799 == class558.field7814) {
                int var420 = class342.field4758.method3090(-89);
                int var421 = class342.field4758.method3035(-957401312);
                class257.field3191.method2356(var421, var420, true);
                class558.field7814 = null;
                return true;
            } else {
                class447.method2602(null, 97, "T1 - " + (class558.field7814 == null ? -1 : class558.field7814.method2202((byte) 16)) + "," + (class501.field6953 == null ? -1 : class501.field6953.method2202((byte) 16)) + "," + (class208.field2708 == null ? -1 : class208.field2708.method2202((byte) 16)) + " - " + class262.field3333);
                class493.method2772(false, 18747);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public final void method1541(byte arg0) {
        field3177++;
        class58 var2 = this.field3178;
        synchronized (this.field3178) {
            this.field3178.method317((byte) 21);
        }
        class58 var3 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method317((byte) 21);
        }
        if (arg0 != -20) {
            this.field3178 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZI)V")
    public final void method1542(int arg0, boolean arg1, int arg2) {
        this.field3178 = new class58(arg2);
        field3180++;
        if (arg1) {
            this.method1544(79, 82);
        }
        this.field3185 = new class58(arg0);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V")
    public final void method1543(int arg0, byte arg1) {
        class58 var3 = this.field3178;
        synchronized (this.field3178) {
            this.field3178.method320(arg0, -306674912);
        }
        if (arg1 <= 31) {
            this.field3176 = null;
        }
        field3181++;
        class58 var4 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method320(arg0, -306674912);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Lbl;")
    public final class297 method1544(int arg0, int arg1) {
        field3182++;
        class58 var3 = this.field3178;
        class297 var4;
        synchronized (this.field3178) {
            var4 = (class297) this.field3178.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field3176;
        byte[] var6;
        synchronized (this.field3176) {
            var6 = this.field3176.method2054(true, arg0, arg1);
        }
        class297 var7 = new class297();
        var7.field3882 = arg1;
        var7.field3865 = this;
        if (var6 != null) {
            var7.method1826(arg0 - 36, new class551(var6));
        }
        var7.method1827(arg0 - 35);
        class58 var8 = this.field3178;
        synchronized (this.field3178) {
            this.field3178.method316((long) arg1, (byte) -117, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
    public final void method1545(boolean arg0) {
        class58 var2 = this.field3178;
        synchronized (this.field3178) {
            this.field3178.method315(1);
            if (!arg0) {
                field3175 = null;
            }
        }
        field3183++;
        class58 var3 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method315(1);
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lg;ILkr;Lkr;)V")
    public class256(class513 arg0, int arg1, class329 arg2, class329 arg3) {
        this.field3176 = arg2;
        this.field3184 = arg3;
        this.field3176.method2064(0, 36);
    }
}
