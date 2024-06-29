import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class308 {

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field4051 = 1;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "[I")
    public static int[] field4054;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field4052;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field4056;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1790(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class304("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field4054 = new int[64];
        field4053 = -1;
        field4055 = 0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 3)
    public static void method1786(int arg0) {
        field4054 = null;
        if (arg0 != -14603) {
            field4054 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1787(byte arg0) {
        try {
            Method var1 = (field4056 == null ? (field4056 = method1790("java.lang.Runtime")) : field4056).getMethod("availableProcessors");
            int var2 = -32 / ((arg0 + 80) / 35);
            if (var1 != null) {
                try {
                    Runtime var3 = Runtime.getRuntime();
                    Integer var4 = (Integer) var1.invoke(var3, (Object[]) null);
                    class422.field5778 = var4;
                } catch (Throwable var5) {
                }
            }
        } catch (Exception var6) {
        }
        field4052++;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IJ)V", line = 44)
    public static final void method1788(int arg0, long arg1) {
        field4050++;
        if (class497.field6886 != null) {
            if (class42.field623 == 1 || class42.field623 == 5) {
                class387.method2287(arg1, arg0 + 125);
            } else if (class42.field623 == 4) {
                class238.method1473(arg1, arg0 + 10);
            }
        }
        class110.method763(arg0 - 116, (long) class31.field516, class370.field4984);
        if (class474.field6555 != -1) {
            class130.method928(class474.field6555, -1);
        }
        for (int var3 = 0; var3 < class210.field2871; var3++) {
            if (class204.field2824[var3]) {
                class153.field2231[var3] = true;
            }
            class110.field1586[var3] = class204.field2824[var3];
            class204.field2824[var3] = false;
        }
        class56.field884 = class31.field516;
        if (class370.field4984.method627()) {
            class228.field3080 = true;
        }
        if (class474.field6555 != arg0) {
            class210.field2871 = 0;
            class57.method409(arg0 - 19088);
        }
        class370.field4984.method539();
        class1.method11(true, class370.field4984);
        int var4 = class258.method1560((byte) -11);
        if (var4 == -1) {
            var4 = class16.field285;
        }
        if (var4 == -1) {
            var4 = class385.field5243;
        }
        class278.method1653(false, var4);
        class307.method1784(class128.field1871, class385.field5232.field573, (byte) -117, class385.field5232.field584, class385.field5232.field574);
        class128.field1871 = 0;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)Z", line = 108)
    public static final boolean method1789(byte arg0) throws IOException {
        field4049++;
        if (class304.field4004 == null) {
            return false;
        }
        int var1 = class304.field4004.method1879(0);
        if (var1 == 0) {
            return false;
        }
        if (class34.field551 == null) {
            if (class70.field1047) {
                class304.field4004.method1884(1, class481.field6632.field5152, 0, (byte) 126);
                var1--;
                class70.field1047 = false;
                class386.field5259++;
            }
            class481.field6632.field5173 = 0;
            if (class481.field6632.method753(0)) {
                if (var1 == 0) {
                    return false;
                }
                class304.field4004.method1884(1, class481.field6632.field5152, 1, (byte) 126);
                var1--;
                class386.field5259++;
            }
            class70.field1047 = true;
            class9[] var2 = class245.method1492((byte) 124);
            int var3 = class481.field6632.method758(-14533);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class481.field6632.field5173);
            }
            class34.field551 = var2[var3];
            class219.field2965 = class34.field551.field216;
        }
        if (class219.field2965 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class304.field4004.method1884(1, class481.field6632.field5152, 0, (byte) 126);
            class219.field2965 = class481.field6632.field5152[0] & 0xFF;
            var1--;
            class386.field5259++;
        }
        if (class219.field2965 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class304.field4004.method1884(2, class481.field6632.field5152, 0, (byte) 125);
            class481.field6632.field5173 = 0;
            class219.field2965 = class481.field6632.method2212((byte) 83);
            var1 -= 2;
            class386.field5259 += 2;
        }
        if (class219.field2965 > var1) {
            return false;
        }
        class481.field6632.field5173 = 0;
        class304.field4004.method1884(class219.field2965, class481.field6632.field5152, 0, (byte) 126);
        class466.field6425 = 0;
        class339.field4424 = class167.field2425;
        int var4 = 119 % ((-arg0 - 26) / 59);
        class386.field5259 += class219.field2965;
        class167.field2425 = class170.field2482;
        class170.field2482 = class34.field551;
        if (class364.field4933 == class34.field551) {
            int var5 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var5, true)) {
                class430.method2483(true);
            }
            class34.field551 = null;
            return true;
        } else if (class56.field874 == class34.field551) {
            int var6 = class481.field6632.method2217((byte) 124);
            int var7 = class481.field6632.method2222(-127);
            if (var7 == 255) {
                var6 = -1;
                var7 = -1;
            }
            class331.method1906(15, var6, var7);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class238.field3183) {
            int var8 = class481.field6632.method2244(-1776827528);
            int var9 = class481.field6632.method2240(255);
            int var10 = class481.field6632.method2207(-101);
            int var11 = class481.field6632.method2207(-123);
            if (class309.method1794(var11, true)) {
                class301 var12 = (class301) class27.field457.method182((long) var8, (byte) 107);
                if (var12 != null) {
                    class347.method2023(var12, false, var12.field3982 != var10, (byte) 97);
                }
                class283.method1683(false, -19434, var9, var10, var8);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class17.field294) {
            int var13 = class481.field6632.method2238(255);
            if (class481.field6632.method2238(255) == 0) {
                class518.field7681[var13] = new class342();
            } else {
                class481.field6632.field5173--;
                class518.field7681[var13] = new class342(class481.field6632);
            }
            class494.field6859 = field4051;
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class295.field3861) {
            int var14 = class481.field6632.method2233((byte) -114);
            int var15 = class481.field6632.method2248((byte) -97);
            class301.field3980.method1724(var14, (byte) 35, var15);
            class34.field551 = null;
            return true;
        } else if (class514.field7585 == class34.field551) {
            class184.method1202(class165.field2407, false);
            class34.field551 = null;
            return true;
        } else if (class478.field6582 == class34.field551) {
            class260.method1569(class389.field5281, class481.field6632, false, class219.field2965);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class301.field3984) {
            int var16 = class481.field6632.method2212((byte) 83);
            int var17 = class481.field6632.method2238(255);
            boolean var18 = (var17 & 0x1) == 1;
            while (class219.field2965 > class481.field6632.field5173) {
                int var19 = class481.field6632.method2199((byte) 88);
                int var20 = class481.field6632.method2212((byte) 83);
                int var21 = 0;
                if (var20 != 0) {
                    var21 = class481.field6632.method2238(255);
                    if (var21 == 255) {
                        var21 = class481.field6632.method2232((byte) 125);
                    }
                }
                class497.method2849(var20 - 1, var16, -70, var21, var19, var18);
            }
            class312.field4109[class494.method2839(31, class375.field5091++)] = var16;
            class34.field551 = null;
            return true;
        } else if (class375.field5090 == class34.field551) {
            int var22 = class481.field6632.method2232((byte) 124);
            int var23 = class481.field6632.method2248((byte) -70);
            int var24 = class481.field6632.method2207(39);
            if (class309.method1794(var24, true)) {
                class301 var25 = (class301) class27.field457.method182((long) var23, (byte) 101);
                class301 var26 = (class301) class27.field457.method182((long) var22, (byte) 94);
                if (var26 != null) {
                    class347.method2023(var26, false, var25 == null || var25.field3982 != var26.field3982, (byte) -104);
                }
                if (var25 != null) {
                    var25.method300(false);
                    class27.field457.method173((long) var22, var25, (byte) 92);
                }
                class403 var27 = class213.method1345((byte) -116, var23);
                if (var27 != null) {
                    class412.method2378(var27, (byte) -115);
                }
                class403 var28 = class213.method1345((byte) -104, var22);
                if (var28 != null) {
                    class412.method2378(var28, (byte) -112);
                    class388.method2290(124, true, var28);
                }
                if (class474.field6555 != -1) {
                    class269.method1615(class474.field6555, 1, (byte) 20);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class307.field4045) {
            if (class474.field6555 != -1) {
                class269.method1615(class474.field6555, 0, (byte) 20);
            }
            class34.field551 = null;
            return true;
        } else if (class61.field964 == class34.field551) {
            class184.method1202(class389.field5276, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class1.field93) {
            class471.field6484 = class481.field6632.method2202(-26372);
            class222.field2994 = field4051;
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class117.field1667) {
            boolean var29 = class481.field6632.method2238(255) == 1;
            String var30 = class481.field6632.method2218(127);
            String var31 = var30;
            if (var29) {
                var31 = class481.field6632.method2218(119);
            }
            long var32 = class481.field6632.method2220(943016720);
            long var34 = (long) class481.field6632.method2212((byte) 83);
            long var36 = (long) class481.field6632.method2249((byte) 113);
            int var38 = class481.field6632.method2238(255);
            long var39 = (var34 << 32) + var36;
            boolean var41 = false;
            int var42 = 0;
            while (true) {
                if (var42 >= 100) {
                    if (var38 <= 1) {
                        if (!(!class16.field282 || class513.field7557) || class362.field4900) {
                            var41 = true;
                        } else if (class386.method2284(var31, -92)) {
                            var41 = true;
                        }
                    }
                    break;
                }
                if (class63.field973[var42] == var39) {
                    var41 = true;
                    break;
                }
                var42++;
            }
            if (!var41 && class50.field772 == 0) {
                class63.field973[class525.field7780] = var39;
                class525.field7780 = (class525.field7780 + 1) % 100;
                String var43 = class517.method3046(class29.method238((byte) 105, class481.field6632), (byte) 74);
                if (var38 == 2 || var38 == 3) {
                    class413.method2394(-4694, var43, "<img=1>" + var31, "<img=1>" + var30, -1, 0, class339.method1926(1007, var32), 9);
                } else if (var38 == 1) {
                    class413.method2394(-4694, var43, "<img=0>" + var31, "<img=0>" + var30, -1, 0, class339.method1926(1007, var32), 9);
                } else {
                    class413.method2394(-4694, var43, var31, var30, -1, 0, class339.method1926(1007, var32), 9);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class220.field2981) {
            class439.method2536((byte) 95, false);
            class34.field551 = null;
            return true;
        } else if (class451.field6138 == class34.field551) {
            class481.field6632.field5173 += 28;
            if (class481.field6632.method2223(57)) {
                class75.method484((byte) 99, class481.field6632, class481.field6632.field5173 - 28);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class337.field4408) {
            class184.method1202(class92.field1398, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class28.field466) {
            boolean var44 = class481.field6632.method2238(255) == 1;
            String var45 = class481.field6632.method2218(127);
            String var46 = var45;
            if (var44) {
                var46 = class481.field6632.method2218(121);
            }
            int var47 = class481.field6632.method2238(255);
            boolean var48 = false;
            if (var47 <= 1) {
                if (!(!class16.field282 || class513.field7557) || class362.field4900) {
                    var48 = true;
                } else if (var47 <= 1 && class386.method2284(var46, 116)) {
                    var48 = true;
                }
            }
            if (!var48 && class50.field772 == 0) {
                String var49 = class517.method3046(class29.method238((byte) -124, class481.field6632), (byte) 46);
                if (var47 == 2) {
                    class413.method2394(-4694, var49, "<img=1>" + var46, "<img=1>" + var45, -1, 0, null, 24);
                } else if (var47 == 1) {
                    class413.method2394(-4694, var49, "<img=0>" + var46, "<img=0>" + var45, -1, 0, null, 24);
                } else {
                    class413.method2394(-4694, var49, var46, var45, -1, 0, null, 24);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class466.field6435 == class34.field551) {
            int var50 = class481.field6632.method2222(-128);
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = class333.field4373[var51];
            int var54 = class481.field6632.method2245(255);
            if (var54 == 65535) {
                var54 = -1;
            }
            int var55 = class481.field6632.method2244(-1776827528);
            int var56 = var55 >> 28 & 0x3;
            int var57 = var55 >> 14 & 0x3FFF;
            int var58 = var55 & 0x3FFF;
            int var59 = var57 - class401.field5382;
            int var60 = var58 - class421.field5762;
            class110.method761((byte) -109, var54, var51, var60, var59, var56, var52, var53);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class157.field2290) {
            class170.field2484 = class481.field6632.method2238(255);
            class34.field551 = null;
            class222.field2994 = field4051;
            return true;
        } else if (class34.field551 == class103.field1516) {
            class444.field6090 = class481.field6632.method2194(-1) << 3;
            class208.field2858 = class481.field6632.method2240(255);
            class67.field1031 = class481.field6632.method2213(true) << 3;
            class34.field551 = null;
            return true;
        } else if (class54.field844 == class34.field551) {
            int var61 = class481.field6632.method2212((byte) 83);
            String var62 = class481.field6632.method2218(-126);
            int var63 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var63, true)) {
                class415.method2406(var62, true, var61);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class290.field3793) {
            boolean var64 = class481.field6632.method2238(255) == 1;
            String var65 = class481.field6632.method2218(122);
            String var66 = var65;
            if (var64) {
                var66 = class481.field6632.method2218(-34);
            }
            int var67 = class481.field6632.method2238(255);
            int var68 = class481.field6632.method2212((byte) 83);
            boolean var69 = false;
            if (var67 <= 1 && class386.method2284(var66, -105)) {
                var69 = true;
            }
            if (!var69 && class50.field772 == 0) {
                String var70 = class507.field7044.method2504((byte) 60, var68).method1170(class481.field6632, true);
                if (var67 == 2) {
                    class413.method2394(-4694, var70, "<img=1>" + var66, "<img=1>" + var65, var68, 0, null, 25);
                } else if (var67 == 1) {
                    class413.method2394(-4694, var70, "<img=0>" + var66, "<img=0>" + var65, var68, 0, null, 25);
                } else {
                    class413.method2394(-4694, var70, var66, var65, var68, 0, null, 25);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class350.field4717 == class34.field551) {
            boolean var71 = class481.field6632.method2238(255) == 1;
            String var72 = class481.field6632.method2218(2);
            String var73 = var72;
            if (var71) {
                var73 = class481.field6632.method2218(22);
            }
            long var74 = (long) class481.field6632.method2212((byte) 83);
            long var76 = (long) class481.field6632.method2249((byte) 85);
            int var78 = class481.field6632.method2238(255);
            long var79 = (var74 << 32) + var76;
            boolean var81 = false;
            int var82 = 0;
            while (true) {
                if (var82 >= 100) {
                    if (var78 <= 1) {
                        if (!(!class16.field282 || class513.field7557) || class362.field4900) {
                            var81 = true;
                        } else if (class386.method2284(var73, 121)) {
                            var81 = true;
                        }
                    }
                    break;
                }
                if (class63.field973[var82] == var79) {
                    var81 = true;
                    break;
                }
                var82++;
            }
            if (!var81 && class50.field772 == 0) {
                class63.field973[class525.field7780] = var79;
                class525.field7780 = (class525.field7780 + 1) % 100;
                String var83 = class517.method3046(class29.method238((byte) 32, class481.field6632), (byte) 40);
                if (var78 == 2) {
                    class413.method2394(-4694, var83, "<img=1>" + var73, "<img=1>" + var72, -1, 0, null, 7);
                } else if (var78 == 1) {
                    class413.method2394(-4694, var83, "<img=0>" + var73, "<img=0>" + var72, -1, 0, null, 7);
                } else {
                    class413.method2394(-4694, var83, var73, var72, -1, 0, null, 3);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class55.field868 == class34.field551) {
            int var84 = class481.field6632.method2232((byte) 124);
            String var85 = class481.field6632.method2218(-34);
            int var86 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var86, true)) {
                class331.method1910((byte) 93, var85, var84);
            }
            class34.field551 = null;
            return true;
        } else if (class428.field5842 == class34.field551) {
            class184.method1202(class201.field2787, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class320.field4192) {
            int var87 = class481.field6632.method2207(124);
            int var88 = class481.field6632.method2247(-1);
            int var89 = class481.field6632.method2232((byte) 125);
            if (class309.method1794(var87, true)) {
                class167.method1122(var88, var89, -122);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class1.field87) {
            class184.method1202(class209.field2864, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class237.field3175) {
            int var90 = class481.field6632.method2212((byte) 83);
            String var91 = class481.field6632.method2218(-107);
            Object[] var92 = new Object[var91.length() + 1];
            for (int var93 = var91.length() - 1; var93 >= 0; var93--) {
                if (var91.charAt(var93) == 's') {
                    var92[var93 + 1] = class481.field6632.method2218(-37);
                } else {
                    var92[var93 + 1] = Integer.valueOf(class481.field6632.method2232((byte) 124));
                }
            }
            var92[0] = Integer.valueOf(class481.field6632.method2232((byte) 127));
            if (class309.method1794(var90, true)) {
                class353 var94 = new class353();
                var94.field4772 = var92;
                class122.method893(var94);
            }
            class34.field551 = null;
            return true;
        } else if (class53.field830 == class34.field551) {
            int var95 = class481.field6632.method2245(255);
            int var96 = class481.field6632.method2212((byte) 83);
            int var97 = class481.field6632.method2240(255);
            int var98 = class481.field6632.method2248((byte) -51);
            int var99 = class481.field6632.method2207(120);
            boolean var100 = (var97 & 0x80) != 0;
            if ((var98 >> 30) != 0) {
                int var101 = (var98 & 0x3CDA4317) >> 28;
                int var102 = ((var98 & 0xFFFD283) >> 14) - class401.field5382;
                int var103 = (var98 & 0x3FFF) - class421.field5762;
                if (var102 >= 0 && var103 >= 0 && class12.field251 > var102 && class289.field3782 > var103) {
                    int var104 = var102 * 128 + 64;
                    int var105 = var103 * 128 + 64;
                    int var106 = var101;
                    if (var101 < 3 && class401.method2330(var103, var102, 2)) {
                        var106 = var101 + 1;
                    }
                    class373 var107 = new class373(var95, 0, class31.field516, var101, var106, var104, class210.method1330(var101, (byte) -96, var104, var105) - var99, var105, var102, var102, var103, var103, var97);
                    class375.field5093.method1666((byte) 111, new class283(var107));
                }
            } else if (var98 >> 29 != 0) {
                int var108 = var98 & 0xFFFF;
                class117 var109 = class291.field3822[var108];
                if (var109 != null) {
                    if (var95 == 65535) {
                        var95 = -1;
                    }
                    boolean var110 = true;
                    int var111 = var100 ? var109.field6238 : var109.field6163;
                    if (var95 != -1 && var111 != -1) {
                        if (var95 == var111) {
                            class155 var116 = class441.field6049.method725(14896, var95);
                            if (var116.field2264 && var116.field2271 != -1) {
                                class5 var117 = class423.field5791.method1601(var116.field2271, (byte) -128);
                                int var118 = var117.field126;
                                if (var118 == 0 || var118 == 2) {
                                    var110 = false;
                                } else if (var118 == 1) {
                                    var110 = true;
                                }
                            }
                        } else {
                            class155 var112 = class441.field6049.method725(14896, var95);
                            class155 var113 = class441.field6049.method725(14896, var111);
                            if (var112.field2271 != -1 && var113.field2271 != -1) {
                                class5 var114 = class423.field5791.method1601(var112.field2271, (byte) -126);
                                class5 var115 = class423.field5791.method1601(var113.field2271, (byte) -123);
                                if (var114.field135 < var115.field135) {
                                    var110 = false;
                                }
                            }
                        }
                    }
                    if (var110) {
                        if (var100) {
                            var109.field6173 = 0;
                            var109.field6213 = class31.field516 + var96;
                            var109.field6224 = 1;
                            var109.field6188 = var99;
                            var109.field6194 = 0;
                            var109.field6197 = var97 & 0x7;
                            var109.field6238 = var95;
                            if (class31.field516 < var109.field6213) {
                                var109.field6173 = -1;
                            }
                            if (var109.field6238 != -1 && class31.field516 == var109.field6213) {
                                int var119 = class441.field6049.method725(14896, var109.field6238).field2271;
                                if (var119 != -1) {
                                    class5 var120 = class423.field5791.method1601(var119, (byte) -122);
                                    if (var120 != null && var120.field129 != null) {
                                        class291.method1711(var120, 0, var109.field574, -87, var109.field573, var109.field584, false);
                                    }
                                }
                            }
                        } else {
                            var109.field6201 = 0;
                            var109.field6163 = var95;
                            var109.field6183 = var99;
                            var109.field6252 = 1;
                            var109.field6246 = 0;
                            var109.field6218 = var97 & 0x7;
                            var109.field6209 = class31.field516 + var96;
                            if (var109.field6209 > class31.field516) {
                                var109.field6246 = -1;
                            }
                            if (var109.field6163 != -1 && class31.field516 == var109.field6209) {
                                int var121 = class441.field6049.method725(14896, var109.field6163).field2271;
                                if (var121 != -1) {
                                    class5 var122 = class423.field5791.method1601(var121, (byte) -116);
                                    if (var122 != null && var122.field129 != null) {
                                        class291.method1711(var122, 0, var109.field574, -53, var109.field573, var109.field584, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var98 >> 28) != 0) {
                int var123 = var98 & 0xFFFF;
                class515 var124;
                if (class391.field5305 == var123) {
                    var124 = class385.field5232;
                } else {
                    var124 = class499.field6901[var123];
                }
                if (var124 != null) {
                    if (var95 == 65535) {
                        var95 = -1;
                    }
                    boolean var125 = true;
                    int var126 = var100 ? var124.field6238 : var124.field6163;
                    if (var95 != -1 && var126 != -1) {
                        if (var95 == var126) {
                            class155 var131 = class441.field6049.method725(14896, var95);
                            if (var131.field2264 && var131.field2271 != -1) {
                                class5 var132 = class423.field5791.method1601(var131.field2271, (byte) -126);
                                int var133 = var132.field126;
                                if (var133 == 0 || var133 == 2) {
                                    var125 = false;
                                } else if (var133 == 1) {
                                    var125 = true;
                                }
                            }
                        } else {
                            class155 var127 = class441.field6049.method725(14896, var95);
                            class155 var128 = class441.field6049.method725(14896, var126);
                            if (var127.field2271 != -1 && var128.field2271 != -1) {
                                class5 var129 = class423.field5791.method1601(var127.field2271, (byte) -125);
                                class5 var130 = class423.field5791.method1601(var128.field2271, (byte) -127);
                                if (var129.field135 < var130.field135) {
                                    var125 = false;
                                }
                            }
                        }
                    }
                    if (var125) {
                        if (var100) {
                            var124.field6197 = var97 & 0x7;
                            var124.field6238 = var95;
                            var124.field6188 = var99;
                            var124.field6173 = 0;
                            var124.field6194 = 0;
                            var124.field6213 = class31.field516 + var96;
                            var124.field6224 = 1;
                            if (var124.field6213 > class31.field516) {
                                var124.field6173 = -1;
                            }
                            if (var124.field6238 == 65535) {
                                var124.field6238 = -1;
                            }
                            if (var124.field6238 != -1 && class31.field516 == var124.field6213) {
                                int var136 = class441.field6049.method725(14896, var124.field6238).field2271;
                                if (var136 != -1) {
                                    class5 var137 = class423.field5791.method1601(var136, (byte) -117);
                                    if (var137 != null && var137.field129 != null) {
                                        class291.method1711(var137, 0, var124.field574, -9, var124.field573, var124.field584, class385.field5232 == var124);
                                    }
                                }
                            }
                        } else {
                            var124.field6209 = class31.field516 + var96;
                            var124.field6218 = var97 & 0x7;
                            var124.field6183 = var99;
                            var124.field6252 = 1;
                            var124.field6246 = 0;
                            var124.field6201 = 0;
                            var124.field6163 = var95;
                            if (var124.field6163 == 65535) {
                                var124.field6163 = -1;
                            }
                            if (var124.field6209 > class31.field516) {
                                var124.field6246 = -1;
                            }
                            if (var124.field6163 != -1 && class31.field516 == var124.field6209) {
                                int var134 = class441.field6049.method725(14896, var124.field6163).field2271;
                                if (var134 != -1) {
                                    class5 var135 = class423.field5791.method1601(var134, (byte) -117);
                                    if (var135 != null && var135.field129 != null) {
                                        class291.method1711(var135, 0, var124.field574, -7, var124.field573, var124.field584, class385.field5232 == var124);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class228.field3081) {
            class184.method1202(class250.field3317, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class103.field1522) {
            String var138 = class481.field6632.method2218(121);
            boolean var139 = class481.field6632.method2238(255) == 1;
            String var140;
            if (var139) {
                var140 = class481.field6632.method2218(-104);
            } else {
                var140 = var138;
            }
            int var141 = class481.field6632.method2212((byte) 83);
            byte var142 = class481.field6632.method2194(-1);
            boolean var143 = false;
            if (var142 == -128) {
                var143 = true;
            }
            if (var143) {
                if (class237.field3176 == 0) {
                    class34.field551 = null;
                    return true;
                }
                boolean var144 = false;
                int var145;
                for (var145 = 0; var145 < class237.field3176 && (!class265.field3506[var145].field5084.equals(var140) || class265.field3506[var145].field5095 != var141); var145++) {
                }
                if (var145 < class237.field3176) {
                    while (class237.field3176 - 1 > var145) {
                        class265.field3506[var145] = class265.field3506[var145 + 1];
                        var145++;
                    }
                    class237.field3176--;
                    class265.field3506[class237.field3176] = null;
                }
            } else {
                String var146 = class481.field6632.method2218(127);
                class375 var147 = new class375();
                var147.field5084 = var140;
                var147.field5087 = var138;
                var147.field5088 = class264.method1587(var147.field5084, -18488);
                var147.field5086 = var142;
                var147.field5095 = var141;
                var147.field5089 = var146;
                int var148;
                for (var148 = class237.field3176 - 1; var148 >= 0; var148--) {
                    int var149 = class265.field3506[var148].field5088.compareTo(var147.field5088);
                    if (var149 == 0) {
                        class265.field3506[var148].field5095 = var141;
                        class265.field3506[var148].field5086 = var142;
                        class265.field3506[var148].field5089 = var146;
                        if (var140.equals(class385.field5232.field7638)) {
                            class282.field3704 = var142;
                        }
                        class462.field6404 = field4051;
                        class34.field551 = null;
                        return true;
                    }
                    if (var149 < 0) {
                        break;
                    }
                }
                if (class237.field3176 >= class265.field3506.length) {
                    class34.field551 = null;
                    return true;
                }
                for (int var150 = class237.field3176 - 1; var150 > var148; var150--) {
                    class265.field3506[var150 + 1] = class265.field3506[var150];
                }
                if (class237.field3176 == 0) {
                    class265.field3506 = new class375[100];
                }
                class265.field3506[var148 + 1] = var147;
                class237.field3176++;
                if (var140.equals(class385.field5232.field7638)) {
                    class282.field3704 = var142;
                }
            }
            class462.field6404 = field4051;
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class174.field2540) {
            String var151 = class481.field6632.method2218(125);
            int var152 = class481.field6632.method2207(67);
            int var153 = class481.field6632.method2207(-122);
            if (class309.method1794(var152, true)) {
                class415.method2406(var151, true, var153);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class128.field1865) {
            int var154 = class481.field6632.method2245(255);
            if (var154 == 65535) {
                var154 = -1;
            }
            int var155 = class481.field6632.method2207(-99);
            int var156 = class481.field6632.method2243(false);
            int var157 = class481.field6632.method2232((byte) 127);
            if (class309.method1794(var155, true)) {
                class171.method1142(var156, 1, var154, var157);
                class482 var158 = class127.field1852.method2390(70, var154);
                class347.method2022(var158.field6678, var158.field6704, var158.field6668, var157, (byte) -118);
                class388.method2292(var157, var158.field6714, -76, var158.field6694, var158.field6654);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class135.field1936) {
            class184.method1202(class466.field6428, false);
            class34.field551 = null;
            return true;
        } else if (class340.field4478 == class34.field551) {
            String var159 = class481.field6632.method2218(127);
            String var160 = class517.method3046(class29.method238((byte) -126, class481.field6632), (byte) 27);
            class223.method1400(var159, 6, var159, var160, false, 0);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class176.field2565) {
            int var161 = class481.field6632.method2245(255);
            int var162 = class481.field6632.method2212((byte) 83);
            int var163 = class481.field6632.method2244(-1776827528);
            if (class309.method1794(var162, true)) {
                class487.method2798(var161, var163, (byte) -118);
            }
            class34.field551 = null;
            return true;
        } else if (class367.field4962 == class34.field551) {
            class184.method1202(class199.field2757, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class129.field1885) {
            class359.method2094(-1745423069);
            class34.field551 = null;
            return false;
        } else if (class96.field1449 == class34.field551) {
            class184.method1202(class526.field7783, false);
            class34.field551 = null;
            return true;
        } else if (class478.field6595 == class34.field551) {
            int var164 = class481.field6632.method2212((byte) 83);
            if (var164 == 65535) {
                var164 = -1;
            }
            int var165 = class481.field6632.method2238(255);
            int var166 = class481.field6632.method2212((byte) 83);
            int var167 = class481.field6632.method2238(255);
            class259.method1568(0, var167, var165, var166, var164);
            class34.field551 = null;
            return true;
        } else if (class76.field1134 == class34.field551) {
            class184.method1202(class29.field489, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class288.field3765) {
            int var168 = class481.field6632.method2232((byte) 124);
            class99.field1481 = class389.field5281.method1357((byte) -33, var168);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class103.field1519) {
            int var169 = class481.field6632.method2212((byte) 83);
            int var170 = class481.field6632.method2207(-126);
            int var171 = class481.field6632.method2243(false);
            int var172 = class481.field6632.method2212((byte) 83);
            int var173 = class481.field6632.method2233((byte) -121);
            if (class309.method1794(var172, true)) {
                class347.method2022(var170, var169, var173, var171, (byte) -118);
            }
            class34.field551 = null;
            return true;
        } else if (class484.field6738 == class34.field551) {
            int var174 = class481.field6632.method2244(-1776827528);
            int var175 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var175, true)) {
                class189.method1216(0, class391.field5305, var174, 5, (byte) 106);
            }
            class34.field551 = null;
            return true;
        } else if (class525.field7771 == class34.field551) {
            int var176 = class481.field6632.method2238(255);
            int var177 = class481.field6632.method2245(255);
            if (var177 == 65535) {
                var177 = -1;
            }
            int var178 = class481.field6632.method2240(255);
            class463.method2643(var178, var176, (byte) 85, var177);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class297.field3879) {
            int var179 = class481.field6632.method2187((byte) -58);
            int var180 = class481.field6632.method2222(-127);
            int var181 = class481.field6632.method2233((byte) -118);
            if (var181 == 65535) {
                var181 = -1;
            }
            class420.method2422(var179, var180, 128, var181);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class258.field3416) {
            class393.method2307(class481.field6632, class219.field2965, (byte) 18);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class114.field1618) {
            class208.field2858 = class481.field6632.method2238(255);
            class444.field6090 = class481.field6632.method2213(true) << 3;
            class67.field1031 = class481.field6632.method2194(-1) << 3;
            for (class289 var182 = (class289) class436.field5982.method181((byte) -70); var182 != null; var182 = (class289) class436.field5982.method179(1)) {
                int var184 = (int) (var182.field622 & 0x3FFFL);
                int var185 = (int) (var182.field622 >> 14 & 0x3FFFL);
                int var186 = (int) (var182.field622 >> 28 & 0x3L);
                if (class208.field2858 == var186 && var184 >= class67.field1031 && var184 < (class67.field1031 + 8) && class444.field6090 <= var185 && var185 < class444.field6090 + 8) {
                    var182.method300(false);
                    class97.method692(class208.field2858, var184, (byte) -126, var185);
                }
            }
            for (class322 var183 = (class322) class157.field2287.method1672((byte) -111); var183 != null; var183 = (class322) class157.field2287.method1668(-1)) {
                if (class67.field1031 <= var183.field4224 && var183.field4224 < class67.field1031 + 8 && var183.field4228 >= class444.field6090 && class444.field6090 + 8 > var183.field4228 && class208.field2858 == var183.field4222) {
                    var183.field4217 = 0;
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class206.field2841) {
            int var187 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var187, true)) {
                class125.method911(98);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class228.field3079) {
            int var188 = class481.field6632.method2207(-112);
            byte var189 = class481.field6632.method2194(-1);
            int var190 = class481.field6632.method2233((byte) -106);
            if (class309.method1794(var190, true)) {
                class47.method341(var188, var189, (byte) 66);
            }
            class34.field551 = null;
            return true;
        } else if (class412.field5690 == class34.field551) {
            byte var191 = class481.field6632.method2213(true);
            int var192 = class481.field6632.method2212((byte) 83);
            class301.field3980.method1724(var192, (byte) 57, var191);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class123.field1805) {
            class34.field551 = null;
            class57.field895 = field4051;
            class28.field482 = 1;
            return true;
        } else if (class34.field551 == class209.field2867) {
            class439.method2536((byte) 95, true);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class189.field2664) {
            class369.method2139(class481.field6632.method2218(-55), false);
            class34.field551 = null;
            return true;
        } else if (class72.field1093 == class34.field551) {
            class184.method1202(class392.field5310, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class319.field4183) {
            while (class481.field6632.field5173 < class219.field2965) {
                boolean var203 = class481.field6632.method2238(255) == 1;
                String var204 = class481.field6632.method2218(41);
                String var205 = class481.field6632.method2218(124);
                int var206 = class481.field6632.method2212((byte) 83);
                int var207 = class481.field6632.method2238(255);
                String var208 = "";
                boolean var209 = false;
                if (var206 > 0) {
                    var208 = class481.field6632.method2218(-68);
                    var209 = class481.field6632.method2238(255) == 1;
                }
                for (int var210 = 0; var210 < class267.field3528; var210++) {
                    if (var203) {
                        if (var205.equals(class471.field6485[var210])) {
                            class471.field6485[var210] = var204;
                            class71.field1076[var210] = var205;
                            var204 = null;
                            break;
                        }
                    } else if (var204.equals(class471.field6485[var210])) {
                        if (class127.field1853[var210] != var206) {
                            class127.field1853[var210] = var206;
                            if (var206 > 0) {
                                class223.method1400("", 5, "", var204 + class88.field1335.method1764(class489.field6789, false), false, 0);
                            }
                            if (var206 == 0) {
                                class223.method1400("", 5, "", var204 + class296.field3872.method1764(class489.field6789, false), false, 0);
                            }
                        }
                        class71.field1076[var210] = var205;
                        class176.field2566[var210] = var208;
                        class427.field5837[var210] = var207;
                        var204 = null;
                        class454.field6157[var210] = var209;
                        break;
                    }
                }
                if (var204 != null && class267.field3528 < 200) {
                    class471.field6485[class267.field3528] = var204;
                    class71.field1076[class267.field3528] = var205;
                    class127.field1853[class267.field3528] = var206;
                    class176.field2566[class267.field3528] = var208;
                    class427.field5837[class267.field3528] = var207;
                    class454.field6157[class267.field3528] = var209;
                    class267.field3528++;
                }
            }
            class57.field895 = field4051;
            class28.field482 = 2;
            boolean var193 = false;
            int var194 = class267.field3528;
            while (var194 > 0) {
                var194--;
                boolean var195 = true;
                for (int var196 = 0; var196 < var194; var196++) {
                    if (class127.field1853[var196] != class145.field2063 && class127.field1853[var196 + 1] == class145.field2063 || class127.field1853[var196] == 0 && class127.field1853[var196 + 1] != 0) {
                        int var197 = class127.field1853[var196];
                        class127.field1853[var196] = class127.field1853[var196 + 1];
                        class127.field1853[var196 + 1] = var197;
                        String var198 = class176.field2566[var196];
                        class176.field2566[var196] = class176.field2566[var196 + 1];
                        class176.field2566[var196 + 1] = var198;
                        String var199 = class471.field6485[var196];
                        class471.field6485[var196] = class471.field6485[var196 + 1];
                        class471.field6485[var196 + 1] = var199;
                        String var200 = class71.field1076[var196];
                        class71.field1076[var196] = class71.field1076[var196 + 1];
                        class71.field1076[var196 + 1] = var200;
                        int var201 = class427.field5837[var196];
                        class427.field5837[var196] = class427.field5837[var196 + 1];
                        class427.field5837[var196 + 1] = var201;
                        boolean var202 = class454.field6157[var196];
                        class454.field6157[var196] = class454.field6157[var196 + 1];
                        class454.field6157[var196 + 1] = var202;
                        var195 = false;
                    }
                }
                if (var195) {
                    break;
                }
            }
            class34.field551 = null;
            return true;
        } else if (class352.field4761 == class34.field551) {
            class208.field2858 = class481.field6632.method2240(255);
            class444.field6090 = class481.field6632.method2231((byte) 85) << 3;
            class67.field1031 = class481.field6632.method2194(-1) << 3;
            while (class219.field2965 > class481.field6632.field5173) {
                class166 var211 = class385.method2277(128)[class481.field6632.method2238(255)];
                class184.method1202(var211, false);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class203.field2821) {
            int var212 = class481.field6632.method2212((byte) 83);
            int var213 = class481.field6632.method2244(-1776827528);
            int var214 = class481.field6632.method2222(-127);
            if (class309.method1794(var212, true)) {
                class112.method768((byte) -68, var214, var213);
            }
            class34.field551 = null;
            return true;
        } else if (class411.field5652 == class34.field551) {
            class184.method1202(class280.field3685, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class34.field549) {
            int var215 = class481.field6632.method2212((byte) 83);
            int var216 = class481.field6632.method2212((byte) 83);
            int var217 = class481.field6632.method2212((byte) 83);
            int var218 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var215, true) && class238.field3185[var216] != null) {
                for (int var219 = var217; var219 < var218; var219++) {
                    int var220 = class481.field6632.method2249((byte) 115);
                    if (class238.field3185[var216].length > var219 && class238.field3185[var216][var219] != null) {
                        class238.field3185[var216][var219].field5538 = var220;
                    }
                }
            }
            class34.field551 = null;
            return true;
        } else if (class488.field6778 == class34.field551) {
            class130.field1894 = class481.field6632.method2238(255);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class261.field3450) {
            String var221 = class481.field6632.method2218(121);
            int var222 = class481.field6632.method2212((byte) 83);
            String var223 = class507.field7044.method2504((byte) 60, var222).method1170(class481.field6632, true);
            class413.method2394(-4694, var223, var221, var221, var222, 0, null, 19);
            class34.field551 = null;
            return true;
        } else if (class353.field4765 == class34.field551) {
            int var224 = class481.field6632.method2243(false);
            int var225 = class481.field6632.method2243(false);
            int var226 = class481.field6632.method2233((byte) -104);
            int var227 = class481.field6632.method2233((byte) -122);
            if (class309.method1794(var226, true)) {
                class189.method1216(var225, var227, var224, 5, (byte) 120);
            }
            class34.field551 = null;
            return true;
        } else if (class518.field7669 == class34.field551) {
            class514.field7592 = class267.method1607(115, class481.field6632.method2238(255));
            class34.field551 = null;
            return true;
        } else if (class525.field7740 == class34.field551) {
            int var228 = class481.field6632.method2248((byte) -91);
            int var229 = class481.field6632.method2233((byte) -107);
            if (var229 == 65535) {
                var229 = -1;
            }
            int var230 = class481.field6632.method2245(255);
            int var231 = class481.field6632.method2207(101);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var232 = class481.field6632.method2232((byte) 126);
            if (class309.method1794(var230, true)) {
                for (int var233 = var231; var233 <= var229; var233++) {
                    long var234 = ((long) var228 << 32) + (long) var233;
                    class350 var236 = (class350) class127.field1849.method182(var234, (byte) 97);
                    class350 var237;
                    if (var236 != null) {
                        var237 = new class350(var232, var236.field4718);
                        var236.method300(false);
                    } else if (var233 == -1) {
                        var237 = new class350(var232, class213.method1345((byte) -103, var228).field5410.field4718);
                    } else {
                        var237 = new class350(var232, -1);
                    }
                    class127.field1849.method173(var234, var237, (byte) 99);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class121.field1770) {
            int var238 = class481.field6632.method2217((byte) 119);
            int var239 = class481.field6632.method2233((byte) -108);
            if (class309.method1794(var239, true)) {
                class172.field2505 = var238;
            }
            class34.field551 = null;
            return true;
        } else if (class55.field871 == class34.field551) {
            int var240 = class481.field6632.method2207(118);
            int var241 = class481.field6632.method2245(255);
            int var242 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var241, true)) {
                class487.method2795(var242, 92, 0, var240);
            }
            class34.field551 = null;
            return true;
        } else if (class37.field572 == class34.field551) {
            int var243 = class481.field6632.method2212((byte) 83);
            if (var243 == 65535) {
                var243 = -1;
            }
            int var244 = class481.field6632.method2238(255);
            int var245 = class481.field6632.method2212((byte) 83);
            int var246 = class481.field6632.method2238(255);
            class520.method3062(var246, var245, var243, var244, (byte) -47);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class268.field3537) {
            int var247 = class481.field6632.method2245(255);
            int var248 = class481.field6632.method2238(255);
            int var249 = class481.field6632.method2207(-125);
            if (class309.method1794(var247, true)) {
                if (var248 == 2) {
                    class420.method2419(true);
                }
                class474.field6555 = var249;
                class259.method1564(var249, (byte) -122);
                class329.method1899(11153, false);
                class122.method897(class474.field6555);
                for (int var250 = 0; var250 < 100; var250++) {
                    class204.field2824[var250] = true;
                }
            }
            class34.field551 = null;
            return true;
        } else if (class92.field1393 == class34.field551) {
            boolean var251 = class481.field6632.method2238(255) == 1;
            String var252 = class481.field6632.method2218(-117);
            String var253 = var252;
            if (var251) {
                var253 = class481.field6632.method2218(119);
            }
            long var254 = class481.field6632.method2220(943016720);
            long var256 = (long) class481.field6632.method2212((byte) 83);
            long var258 = (long) class481.field6632.method2249((byte) 121);
            int var260 = class481.field6632.method2238(255);
            int var261 = class481.field6632.method2212((byte) 83);
            long var262 = (var256 << 32) + var258;
            boolean var264 = false;
            int var265 = 0;
            while (true) {
                if (var265 >= 100) {
                    if (var260 <= 1 && class386.method2284(var253, 120)) {
                        var264 = true;
                    }
                    break;
                }
                if (class63.field973[var265] == var262) {
                    var264 = true;
                    break;
                }
                var265++;
            }
            if (!var264 && class50.field772 == 0) {
                class63.field973[class525.field7780] = var262;
                class525.field7780 = (class525.field7780 + 1) % 100;
                String var266 = class507.field7044.method2504((byte) 60, var261).method1170(class481.field6632, true);
                if (var260 == 2) {
                    class413.method2394(-4694, var266, "<img=1>" + var253, "<img=1>" + var252, var261, 0, class339.method1926(1007, var254), 20);
                } else if (var260 == 1) {
                    class413.method2394(-4694, var266, "<img=0>" + var253, "<img=0>" + var252, var261, 0, class339.method1926(1007, var254), 20);
                } else {
                    class413.method2394(-4694, var266, var253, var252, var261, 0, class339.method1926(1007, var254), 20);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class26.field447) {
            int var267 = class481.field6632.method2212((byte) 83);
            int var268 = class481.field6632.method2207(49);
            int var269 = class481.field6632.method2212((byte) 83);
            int var270 = class481.field6632.method2244(-1776827528);
            int var271 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var271, true)) {
                class189.method1216(var268, var269 << 16 | var267, var270, 7, (byte) 61);
            }
            class34.field551 = null;
            return true;
        } else if (class478.field6596 == class34.field551) {
            int var272 = class481.field6632.method2212((byte) 83);
            int var273 = class481.field6632.method2238(255);
            int var274 = class481.field6632.method2238(255);
            int var275 = class481.field6632.method2212((byte) 83) << 0;
            int var276 = class481.field6632.method2238(255);
            int var277 = class481.field6632.method2238(255);
            if (class309.method1794(var272, true)) {
                class363.method2114(var277, 107, var274, var275, var276, var273);
            }
            class34.field551 = null;
            return true;
        } else if (class376.field5100 == class34.field551) {
            class168.method1128((byte) -121);
            class34.field551 = null;
            return false;
        } else if (class386.field5255 == class34.field551) {
            int var278 = class481.field6632.method2212((byte) 83);
            int var279 = class481.field6632.method2238(255);
            int var280 = class481.field6632.method2238(255);
            int var281 = class481.field6632.method2212((byte) 83) << 0;
            int var282 = class481.field6632.method2238(255);
            int var283 = class481.field6632.method2238(255);
            if (class309.method1794(var278, true)) {
                class59.method417(var280, true, var282, var279, var281, var283, true);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class315.field4121) {
            int var284 = class481.field6632.method2212((byte) 83);
            int var285 = class481.field6632.method2232((byte) 124);
            if (class309.method1794(var284, true)) {
                class301 var286 = (class301) class27.field457.method182((long) var285, (byte) 75);
                if (var286 != null) {
                    class347.method2023(var286, false, true, (byte) -107);
                }
                if (class71.field1072 != null) {
                    class412.method2378(class71.field1072, (byte) -123);
                    class71.field1072 = null;
                }
            }
            class34.field551 = null;
            return true;
        } else if (class367.field4961 == class34.field551) {
            int var287 = class481.field6632.method2232((byte) 124);
            int var288 = class481.field6632.method2245(255);
            if (var288 == 65535) {
                var288 = -1;
            }
            int var289 = class481.field6632.method2245(255);
            if (class309.method1794(var289, true)) {
                class189.method1216(-1, var288, var287, 2, (byte) 82);
            }
            class34.field551 = null;
            return true;
        } else if (class377.field5104 == class34.field551) {
            int var290 = class481.field6632.method2245(255);
            int var291 = class481.field6632.method2222(-127);
            boolean var292 = (var291 & 0x1) == 1;
            class334.method1914(var290, var292, 116);
            class312.field4109[class494.method2839(class375.field5091++, 31)] = var290;
            class34.field551 = null;
            return true;
        } else if (class78.field1170 == class34.field551) {
            class184.method1202(class191.field2684, false);
            class34.field551 = null;
            return true;
        } else if (class76.field1131 == class34.field551) {
            int var293 = class481.field6632.method2236(false);
            int var294 = class481.field6632.method2243(false);
            int var295 = class481.field6632.method2233((byte) -121);
            int var296 = class481.field6632.method2202(-26372);
            if (class309.method1794(var295, true)) {
                class179.method1189(var294, -31829, var293, var296);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class302.field3990) {
            int var297 = class481.field6632.method2233((byte) -108);
            int var298 = class481.field6632.method2244(-1776827528);
            int var299 = class481.field6632.method2212((byte) 83);
            if (var299 == 65535) {
                var299 = -1;
            }
            if (class309.method1794(var297, true)) {
                class112.method773(var299, (byte) -78, var298);
            }
            class34.field551 = null;
            return true;
        } else if (class62.field968 == class34.field551) {
            class377.field5106 = class481.field6632.method2212((byte) 83) * 30;
            class34.field551 = null;
            class222.field2994 = field4051;
            return true;
        } else if (class34.field551 == class232.field3116) {
            int var300 = class481.field6632.method2207(47);
            int var301 = class481.field6632.method2222(-128);
            int var302 = class481.field6632.method2233((byte) -111);
            class117 var303 = class291.field3822[var300];
            if (var303 != null) {
                class128.method918(var301, var303, var302, 111);
            }
            class34.field551 = null;
            return true;
        } else if (class379.field5187 == class34.field551) {
            class312.field4106 = class219.field2965 > 2 ? class481.field6632.method2218(-70) : class103.field1520.method1764(class489.field6789, false);
            class53.field835 = class219.field2965 <= 0 ? -1 : class481.field6632.method2212((byte) 83);
            if (class53.field835 == 65535) {
                class53.field835 = -1;
            }
            class34.field551 = null;
            return true;
        } else if (class494.field6862 == class34.field551) {
            if (class297.field3882 != null) {
                class412.method2388(-65, false, -1, -1, class154.field2244.field7752);
            }
            byte[] var304 = new byte[class219.field2965];
            class481.field6632.method759(class219.field2965, var304, 0, (byte) 93);
            String var305 = class315.method1824(class219.field2965, 0, (byte) -37, var304);
            class118.method828(true, class166.field2414 == 1, var305, class389.field5281, (byte) 64);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class237.field3174) {
            int var306 = class481.field6632.method2233((byte) -126);
            int var307 = class481.field6632.method2243(false);
            int var308 = class481.field6632.method2207(-119);
            int var309 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var309, true)) {
                class323.method1867(13, var307, (var306 << 16) + var308);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class202.field2794) {
            for (int var310 = 0; var310 < class499.field6901.length; var310++) {
                if (class499.field6901[var310] != null) {
                    class499.field6901[var310].field6185 = -1;
                }
            }
            for (int var311 = 0; var311 < class291.field3822.length; var311++) {
                if (class291.field3822[var311] != null) {
                    class291.field3822[var311].field6185 = -1;
                }
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class302.field3986) {
            int var312 = class481.field6632.method2240(255);
            String var313 = class481.field6632.method2218(118);
            int var314 = class481.field6632.method2245(255);
            if (var314 == 65535) {
                var314 = -1;
            }
            int var315 = class481.field6632.method2217((byte) 91);
            if (var315 >= 1 && var315 <= 8) {
                if (var313.equalsIgnoreCase("null")) {
                    var313 = null;
                }
                class268.field3532[var315 - 1] = var313;
                class291.field3819[var315 - 1] = var314;
                class170.field2485[var315 - 1] = var312 == 0;
            }
            class34.field551 = null;
            return true;
        } else if (class379.field5185 == class34.field551) {
            class184.method1202(class339.field4422, false);
            class34.field551 = null;
            return true;
        } else if (class430.field5887 == class34.field551) {
            class301.field3980.method1723(83);
            class34.field551 = null;
            class49.field763 += 32;
            return true;
        } else if (class45.field668 == class34.field551) {
            int var316 = class481.field6632.method2222(-127);
            int var317 = class481.field6632.method2248((byte) -113);
            int var318 = class481.field6632.method2240(255);
            class138.field1994[var318] = var317;
            class305.field4013[var318] = var316;
            class252.field3337[var318] = 1;
            int var319 = class93.field1411[var318] - 1;
            for (int var320 = 0; var320 < var319; var320++) {
                if (var317 >= class454.field6156[var320]) {
                    class252.field3337[var318] = var320 + 2;
                }
            }
            class72.field1092[class494.method2839(class42.field628++, 31)] = var318;
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class146.field2067) {
            int var321 = class481.field6632.method2199((byte) 106);
            int var322 = class481.field6632.method2232((byte) 125);
            int var323 = class481.field6632.method2238(255);
            String var324 = "";
            String var325 = var324;
            if ((var323 & 0x1) != 0) {
                var324 = class481.field6632.method2218(-32);
                if ((var323 & 0x2) == 0) {
                    var325 = var324;
                } else {
                    var325 = class481.field6632.method2218(120);
                }
            }
            String var326 = class481.field6632.method2218(-123);
            if (var321 == 99) {
                class176.method1181(var326, false);
            } else if (var325.equals("") || !class386.method2284(var325, -116)) {
                class223.method1400(var324, var321, var325, var326, false, var322);
            } else {
                class34.field551 = null;
                return true;
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class309.field4068) {
            int var327 = class481.field6632.method2245(255);
            int var328 = class481.field6632.method2212((byte) 83);
            int var329 = class481.field6632.method2248((byte) -94);
            if (class309.method1794(var328, true)) {
                class433.method2495(var329, var327, 14);
            }
            class34.field551 = null;
            return true;
        } else if (class48.field751 == class34.field551) {
            int var330 = class481.field6632.method2243(false);
            int var331 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var331, true)) {
                class189.method1216(-1, -1, var330, 3, (byte) 100);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class289.field3776) {
            int var332 = class481.field6632.method2238(255);
            boolean var333 = (var332 & 0x1) == 1;
            String var334 = class481.field6632.method2218(125);
            String var335 = class481.field6632.method2218(-48);
            if (var335.equals("")) {
                var335 = var334;
            }
            String var336 = class481.field6632.method2218(119);
            String var337 = class481.field6632.method2218(124);
            if (var337.equals("")) {
                var337 = var336;
            }
            if (var333) {
                for (int var338 = 0; var338 < class114.field1621; var338++) {
                    if (class222.field2989[var338].equals(var337)) {
                        class227.field3064[var338] = var334;
                        class222.field2989[var338] = var335;
                        class184.field2622[var338] = var336;
                        class309.field4070[var338] = var337;
                        break;
                    }
                }
            } else {
                class227.field3064[class114.field1621] = var334;
                class222.field2989[class114.field1621] = var335;
                class184.field2622[class114.field1621] = var336;
                class309.field4070[class114.field1621] = var337;
                class140.field2040[class114.field1621] = class494.method2839(2, var332) == 2;
                class114.field1621++;
            }
            class34.field551 = null;
            class57.field895 = field4051;
            return true;
        } else if (class494.field6863 == class34.field551) {
            int var339 = class481.field6632.method2212((byte) 83);
            int var340 = class481.field6632.method2238(255);
            boolean var341 = (var340 & 0x1) == 1;
            class307.method1780(var339, 0, var341);
            int var342 = class481.field6632.method2212((byte) 83);
            for (int var343 = 0; var343 < var342; var343++) {
                int var344 = class481.field6632.method2212((byte) 83);
                int var345 = class481.field6632.method2217((byte) 93);
                if (var345 == 255) {
                    var345 = class481.field6632.method2248((byte) -80);
                }
                class497.method2849(var344 - 1, var339, -88, var345, var343, var341);
            }
            class312.field4109[class494.method2839(31, class375.field5091++)] = var339;
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class264.field3487) {
            int var346 = class481.field6632.method2207(-105);
            int var347 = class481.field6632.method2212((byte) 83);
            int var348 = class481.field6632.method2248((byte) -105);
            if (class309.method1794(var347, true)) {
                class47.method341(var346, var348, (byte) 122);
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class299.field3963) {
            int var349 = class481.field6632.method2233((byte) -109);
            int var350 = class481.field6632.method2240(255);
            class301.field3980.method1728(19511, var349, var350);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class212.field2886) {
            int var351 = class481.field6632.method2248((byte) -63);
            int var352 = class481.field6632.method2207(46);
            int var353 = class481.field6632.method2245(255);
            if (var353 == 65535) {
                var353 = -1;
            }
            if (class309.method1794(var352, true)) {
                class189.method1216(-1, var353, var351, 1, (byte) 30);
            }
            class34.field551 = null;
            return true;
        } else if (class487.field6765 == class34.field551) {
            int var354 = class481.field6632.method2238(255);
            int var355 = var354 >> 5;
            int var356 = var354 & 0x1F;
            if (var356 == 0) {
                class335.field4395[var355] = null;
                class34.field551 = null;
                return true;
            }
            class370 var357 = new class370();
            var357.field4980 = var356;
            var357.field4977 = class481.field6632.method2238(255);
            if (var357.field4977 >= 0 && var357.field4977 < class44.field662.length) {
                if (var357.field4980 == 1 || var357.field4980 == 10) {
                    var357.field4973 = class481.field6632.method2212((byte) 83);
                    class481.field6632.field5173 += 6;
                } else if (var357.field4980 >= 2 && var357.field4980 <= 6) {
                    if (var357.field4980 == 2) {
                        var357.field4982 = 64;
                        var357.field4976 = 64;
                    }
                    if (var357.field4980 == 3) {
                        var357.field4976 = 64;
                        var357.field4982 = 0;
                    }
                    if (var357.field4980 == 4) {
                        var357.field4976 = 64;
                        var357.field4982 = 128;
                    }
                    if (var357.field4980 == 5) {
                        var357.field4982 = 64;
                        var357.field4976 = 0;
                    }
                    if (var357.field4980 == 6) {
                        var357.field4976 = 128;
                        var357.field4982 = 64;
                    }
                    var357.field4980 = 2;
                    var357.field4985 = class481.field6632.method2238(255);
                    var357.field4982 += class481.field6632.method2212((byte) 83) - class401.field5382 << 7;
                    var357.field4976 += class481.field6632.method2212((byte) 83) - class421.field5762 << 7;
                    var357.field4974 = class481.field6632.method2238(255);
                    var357.field4978 = class481.field6632.method2212((byte) 83);
                }
                var357.field4979 = class481.field6632.method2212((byte) 83);
                if (var357.field4979 == 65535) {
                    var357.field4979 = -1;
                }
                class335.field4395[var355] = var357;
            }
            class34.field551 = null;
            return true;
        } else if (class35.field554 == class34.field551) {
            class462.field6404 = field4051;
            if (class219.field2965 == 0) {
                class476.field6563 = null;
                class265.field3506 = null;
                class125.field1840 = null;
                class34.field551 = null;
                class237.field3176 = 0;
                return true;
            }
            class125.field1840 = class481.field6632.method2218(119);
            boolean var358 = class481.field6632.method2238(255) == 1;
            if (var358) {
                class481.field6632.method2218(-50);
            }
            long var359 = class481.field6632.method2220(943016720);
            class476.field6563 = class470.method2674(var359, (byte) -126);
            class377.field5108 = class481.field6632.method2194(-1);
            int var361 = class481.field6632.method2238(255);
            if (var361 == 255) {
                class34.field551 = null;
                return true;
            }
            class237.field3176 = var361;
            class375[] var362 = new class375[100];
            for (int var363 = 0; var363 < class237.field3176; var363++) {
                var362[var363] = new class375();
                var362[var363].field5087 = class481.field6632.method2218(118);
                boolean var369 = class481.field6632.method2238(255) == 1;
                if (var369) {
                    var362[var363].field5084 = class481.field6632.method2218(118);
                } else {
                    var362[var363].field5084 = var362[var363].field5087;
                }
                var362[var363].field5088 = class264.method1587(var362[var363].field5084, -18488);
                var362[var363].field5095 = class481.field6632.method2212((byte) 83);
                var362[var363].field5086 = class481.field6632.method2194(-1);
                var362[var363].field5089 = class481.field6632.method2218(28);
                if (var362[var363].field5084.equals(class385.field5232.field7638)) {
                    class282.field3704 = var362[var363].field5086;
                }
            }
            boolean var364 = false;
            int var365 = class237.field3176;
            while (var365 > 0) {
                boolean var366 = true;
                var365--;
                for (int var367 = 0; var367 < var365; var367++) {
                    if (var362[var367].field5088.compareTo(var362[var367 + 1].field5088) > 0) {
                        class375 var368 = var362[var367];
                        var362[var367] = var362[var367 + 1];
                        var362[var367 + 1] = var368;
                        var366 = false;
                    }
                }
                if (var366) {
                    break;
                }
            }
            class265.field3506 = var362;
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class14.field265) {
            class211.method1336(Integer.MIN_VALUE);
            class34.field551 = null;
            return true;
        } else if (class372.field5011 == class34.field551) {
            int var370 = class481.field6632.method2248((byte) -74);
            int var371 = class481.field6632.method2212((byte) 83);
            class301.field3980.method1728(19511, var371, var370);
            class34.field551 = null;
            return true;
        } else if (class386.field5258 == class34.field551) {
            class184.method1202(class91.field1378, false);
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class317.field4157) {
            class476.method2735(255);
            class34.field551 = null;
            return false;
        } else if (class34.field551 == class316.field4152) {
            int var372 = class481.field6632.method2207(-123);
            int var373 = class481.field6632.method2245(255);
            if (var373 == 65535) {
                var373 = -1;
            }
            int var374 = class481.field6632.method2233((byte) -120);
            int var375 = class481.field6632.method2212((byte) 83);
            if (var375 == 65535) {
                var375 = -1;
            }
            int var376 = class481.field6632.method2248((byte) -118);
            if (class309.method1794(var374, true)) {
                for (int var377 = var373; var377 <= var375; var377++) {
                    long var378 = ((long) var376 << 32) + ((long) var377);
                    class350 var380 = (class350) class127.field1849.method182(var378, (byte) 97);
                    class350 var381;
                    if (var380 != null) {
                        var381 = new class350(var380.field4714, var372);
                        var380.method300(false);
                    } else if (var377 == -1) {
                        var381 = new class350(class213.method1345((byte) 115, var376).field5410.field4714, var372);
                    } else {
                        var381 = new class350(0, var372);
                    }
                    class127.field1849.method173(var378, var381, (byte) 109);
                }
            }
            class34.field551 = null;
            return true;
        } else if (class78.field1176 == class34.field551) {
            int var382 = class481.field6632.method2207(78);
            int var383 = class481.field6632.method2243(false);
            int var384 = class481.field6632.method2207(121);
            if (class309.method1794(var382, true)) {
                class228.method1422(12, var384, var383);
            }
            class34.field551 = null;
            return true;
        } else if (class465.field6418 == class34.field551) {
            class114.field1621 = class481.field6632.method2238(255);
            for (int var385 = 0; var385 < class114.field1621; var385++) {
                class227.field3064[var385] = class481.field6632.method2218(124);
                class222.field2989[var385] = class481.field6632.method2218(122);
                if (class222.field2989[var385].equals("")) {
                    class222.field2989[var385] = class227.field3064[var385];
                }
                class184.field2622[var385] = class481.field6632.method2218(-123);
                class309.field4070[var385] = class481.field6632.method2218(26);
                if (class309.field4070[var385].equals("")) {
                    class309.field4070[var385] = class184.field2622[var385];
                }
                class140.field2040[var385] = false;
            }
            class57.field895 = field4051;
            class34.field551 = null;
            return true;
        } else if (class506.field7030 == class34.field551) {
            int var386 = class481.field6632.method2212((byte) 83);
            int var387 = class481.field6632.method2238(255);
            int var388 = class481.field6632.method2238(255);
            int var389 = class481.field6632.method2238(255);
            int var390 = class481.field6632.method2238(255);
            int var391 = class481.field6632.method2212((byte) 83);
            if (class309.method1794(var386, true)) {
                class265.field3504[var387] = true;
                class65.field1013[var387] = var388;
                class222.field2990[var387] = var389;
                class225.field3045[var387] = var390;
                class189.field2665[var387] = var391;
            }
            class34.field551 = null;
            return true;
        } else if (class34.field551 == class156.field2277) {
            class58.field913 = class481.field6632.method2222(-128);
            class280.field3683 = class481.field6632.method2240(255);
            class34.field551 = null;
            return true;
        } else if (class73.field1106 == class34.field551) {
            boolean var392 = class481.field6632.method2238(255) == 1;
            String var393 = class481.field6632.method2218(-99);
            String var394 = var393;
            if (var392) {
                var394 = class481.field6632.method2218(-62);
            }
            long var395 = (long) class481.field6632.method2212((byte) 83);
            long var397 = (long) class481.field6632.method2249((byte) 77);
            int var399 = class481.field6632.method2238(255);
            int var400 = class481.field6632.method2212((byte) 83);
            long var401 = (var395 << 32) + var397;
            boolean var403 = false;
            int var404 = 0;
            while (true) {
                if (var404 >= 100) {
                    if (var399 <= 1 && class386.method2284(var394, -61)) {
                        var403 = true;
                    }
                    break;
                }
                if (class63.field973[var404] == var401) {
                    var403 = true;
                    break;
                }
                var404++;
            }
            if (!var403 && class50.field772 == 0) {
                class63.field973[class525.field7780] = var401;
                class525.field7780 = (class525.field7780 + 1) % 100;
                String var405 = class507.field7044.method2504((byte) 60, var400).method1170(class481.field6632, true);
                if (var399 == 2) {
                    class413.method2394(-4694, var405, "<img=1>" + var394, "<img=1>" + var393, var400, 0, null, 18);
                } else if (var399 == 1) {
                    class413.method2394(-4694, var405, "<img=0>" + var394, "<img=0>" + var393, var400, 0, null, 18);
                } else {
                    class413.method2394(-4694, var405, var394, var393, var400, 0, null, 18);
                }
            }
            class34.field551 = null;
            return true;
        } else {
            class504.method2879(null, "T1 - " + (class34.field551 == null ? -1 : class34.field551.method106(76)) + "," + (class167.field2425 == null ? -1 : class167.field2425.method106(76)) + "," + (class339.field4424 == null ? -1 : class339.field4424.method106(126)) + " - " + class219.field2965, -19638);
            class476.method2735(255);
            return true;
        }
    }
}
