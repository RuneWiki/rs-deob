import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class152 {

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "[I")
    private static int[] field2277 = new int[5];

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    private static int field2279 = 0;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    private static int field2288 = 0;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[[I")
    private static int[][] field2290 = new int[5][5000];

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field2289 = new String[1000];

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "[I")
    private static int[] field2282 = new int[1000];

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    private static int field2292 = 0;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "[Lac;")
    private static class225[] field2293 = new class225[50];

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2270 = Calendar.getInstance();

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "[I")
    private static int[] field2294 = new int[3];

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field2296 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "Ld;")
    public static class242 field2295 = new class242(4);

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    private static int field2297 = 0;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Lrk;")
    private static class343 field2283;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "Lfi;")
    private static class38 field2276;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "Lfi;")
    private static class38 field2284;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
    private static int[] field2272;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field2280;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1088(String arg0, int arg1) {
        if (class224.field3421 == 0 && !(!class288.field4478 || class421.field6182) || class108.field1638) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class264.field4221.method1265(0, -102))) {
            var3 = 0;
            arg0 = arg0.substring(class264.field4221.method1265(0, -68).length());
        } else if (var2.startsWith(class467.field6880.method1265(0, -89))) {
            var3 = 1;
            arg0 = arg0.substring(class467.field6880.method1265(0, -106).length());
        } else if (var2.startsWith(class29.field321.method1265(0, -117))) {
            var3 = 2;
            arg0 = arg0.substring(class29.field321.method1265(0, -93).length());
        } else if (var2.startsWith(class5.field64.method1265(0, -114))) {
            var3 = 3;
            arg0 = arg0.substring(class5.field64.method1265(0, -104).length());
        } else if (var2.startsWith(class185.field2840.method1265(0, -65))) {
            var3 = 4;
            arg0 = arg0.substring(class185.field2840.method1265(0, -67).length());
        } else if (var2.startsWith(class228.field3451.method1265(0, -76))) {
            var3 = 5;
            arg0 = arg0.substring(class228.field3451.method1265(0, -70).length());
        } else if (var2.startsWith(class125.field1873.method1265(0, -69))) {
            var3 = 6;
            arg0 = arg0.substring(class125.field1873.method1265(0, -64).length());
        } else if (var2.startsWith(class198.field3096.method1265(0, -127))) {
            var3 = 7;
            arg0 = arg0.substring(class198.field3096.method1265(0, -75).length());
        } else if (var2.startsWith(class56.field843.method1265(0, -84))) {
            var3 = 8;
            arg0 = arg0.substring(class56.field843.method1265(0, -60).length());
        } else if (var2.startsWith(class16.field170.method1265(0, -125))) {
            var3 = 9;
            arg0 = arg0.substring(class16.field170.method1265(0, -74).length());
        } else if (var2.startsWith(class367.field5411.method1265(0, -87))) {
            var3 = 10;
            arg0 = arg0.substring(class367.field5411.method1265(0, -78).length());
        } else if (var2.startsWith(class26.field297.method1265(0, -123))) {
            var3 = 11;
            arg0 = arg0.substring(class26.field297.method1265(0, -113).length());
        } else if (class345.field5141 != 0) {
            if (var2.startsWith(class264.field4221.method1265(class345.field5141, -69))) {
                var3 = 0;
                arg0 = arg0.substring(class264.field4221.method1265(class345.field5141, -80).length());
            } else if (var2.startsWith(class467.field6880.method1265(class345.field5141, -125))) {
                var3 = 1;
                arg0 = arg0.substring(class467.field6880.method1265(class345.field5141, -60).length());
            } else if (var2.startsWith(class29.field321.method1265(class345.field5141, -106))) {
                var3 = 2;
                arg0 = arg0.substring(class29.field321.method1265(class345.field5141, -81).length());
            } else if (var2.startsWith(class5.field64.method1265(class345.field5141, -106))) {
                var3 = 3;
                arg0 = arg0.substring(class5.field64.method1265(class345.field5141, -78).length());
            } else if (var2.startsWith(class185.field2840.method1265(class345.field5141, -92))) {
                var3 = 4;
                arg0 = arg0.substring(class185.field2840.method1265(class345.field5141, -71).length());
            } else if (var2.startsWith(class228.field3451.method1265(class345.field5141, -61))) {
                var3 = 5;
                arg0 = arg0.substring(class228.field3451.method1265(class345.field5141, -72).length());
            } else if (var2.startsWith(class125.field1873.method1265(class345.field5141, -66))) {
                var3 = 6;
                arg0 = arg0.substring(class125.field1873.method1265(class345.field5141, -109).length());
            } else if (var2.startsWith(class198.field3096.method1265(class345.field5141, -116))) {
                var3 = 7;
                arg0 = arg0.substring(class198.field3096.method1265(class345.field5141, -109).length());
            } else if (var2.startsWith(class56.field843.method1265(class345.field5141, -103))) {
                var3 = 8;
                arg0 = arg0.substring(class56.field843.method1265(class345.field5141, -113).length());
            } else if (var2.startsWith(class16.field170.method1265(class345.field5141, -124))) {
                var3 = 9;
                arg0 = arg0.substring(class16.field170.method1265(class345.field5141, -69).length());
            } else if (var2.startsWith(class367.field5411.method1265(class345.field5141, -126))) {
                var3 = 10;
                arg0 = arg0.substring(class367.field5411.method1265(class345.field5141, -74).length());
            } else if (var2.startsWith(class26.field297.method1265(class345.field5141, -117))) {
                var3 = 11;
                arg0 = arg0.substring(class26.field297.method1265(class345.field5141, -89).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class522.field7672.method1265(0, -86))) {
            var5 = 1;
            arg0 = arg0.substring(class522.field7672.method1265(0, -88).length());
        } else if (var4.startsWith(class240.field3613.method1265(0, -123))) {
            var5 = 2;
            arg0 = arg0.substring(class240.field3613.method1265(0, -87).length());
        } else if (var4.startsWith(class523.field7678.method1265(0, -72))) {
            var5 = 3;
            arg0 = arg0.substring(class523.field7678.method1265(0, -69).length());
        } else if (var4.startsWith(class455.field6763.method1265(0, -126))) {
            var5 = 4;
            arg0 = arg0.substring(class455.field6763.method1265(0, -72).length());
        } else if (var4.startsWith(class258.field4131.method1265(0, -87))) {
            var5 = 5;
            arg0 = arg0.substring(class258.field4131.method1265(0, -76).length());
        } else if (class345.field5141 != 0) {
            if (var4.startsWith(class522.field7672.method1265(class345.field5141, -98))) {
                var5 = 1;
                arg0 = arg0.substring(class522.field7672.method1265(class345.field5141, -103).length());
            } else if (var4.startsWith(class240.field3613.method1265(class345.field5141, -104))) {
                var5 = 2;
                arg0 = arg0.substring(class240.field3613.method1265(class345.field5141, -79).length());
            } else if (var4.startsWith(class523.field7678.method1265(class345.field5141, -97))) {
                var5 = 3;
                arg0 = arg0.substring(class523.field7678.method1265(class345.field5141, -58).length());
            } else if (var4.startsWith(class455.field6763.method1265(class345.field5141, -67))) {
                var5 = 4;
                arg0 = arg0.substring(class455.field6763.method1265(class345.field5141, -118).length());
            } else if (var4.startsWith(class258.field4131.method1265(class345.field5141, -96))) {
                var5 = 5;
                arg0 = arg0.substring(class258.field4131.method1265(class345.field5141, -102).length());
            }
        }
        field2269++;
        class110.method857(4095, class103.field1597);
        class312.field4752.method1381(0, (byte) 80);
        int var6 = class312.field4752.field2982;
        if (arg1 == 5021) {
            class312.field4752.method1381(1, (byte) 119);
        } else if (arg1 == 5022) {
            class312.field4752.method1381(2, (byte) 119);
        } else {
            class312.field4752.method1381(0, (byte) 93);
        }
        class312.field4752.method1381(var3, (byte) 118);
        class312.field4752.method1381(var5, (byte) 101);
        class7.method35(class312.field4752, 0, arg0);
        class312.field4752.method1354(class312.field4752.field2982 - var6, true);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leg;II)V")
    public static final void method1089(class34 arg0, int arg1, int arg2) {
        class247 var3 = class389.method2464(arg2, arg0, arg1, 58);
        if (var3 == null) {
            return;
        }
        field2272 = new int[var3.field3703];
        field2280 = new String[var3.field3696];
        if (class159.field2414 == var3.field3695 || class23.field268 == var3.field3695 || class434.field6463 == var3.field3695) {
            int var4 = 0;
            int var5 = 0;
            if (class398.field5876 != null) {
                var4 = class398.field5876.field627;
                var5 = class398.field5876.field540;
            }
            field2272[0] = class377.field5570.method1475((byte) 55) - var4;
            field2272[1] = class377.field5570.method1484(-22647) - var5;
        }
        method1099(var3, 200000);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lqr;)V")
    public static final void method1090(class510 arg0) {
        method1101(arg0, 200000);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    private static final void method1091(int arg0) {
        class38 var1 = class159.method1143(-357225936, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class38[] var3 = class394.field5749[var2];
        if (var3 == null) {
            class38[] var4 = class237.field3555[var2];
            int var5 = var4.length;
            var3 = class394.field5749[var2] = new class38[var5];
            class325.method2133(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class325.method2133(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method1092(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2270.setTime(new Date(var1));
        int var3 = field2270.get(5);
        int var4 = field2270.get(2);
        int var5 = field2270.get(1);
        return var3 + "-" + field2296[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
    public static final void method1093() {
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
    public static final void method1094(int arg0) {
        if (arg0 == -1 || !class31.method189(14, arg0)) {
            return;
        }
        class38[] var1 = class237.field3555[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class38 var3 = var1[var2];
            if (var3.field483 != null) {
                class510 var4 = new class510();
                var4.field7423 = var3;
                var4.field7413 = var3.field483;
                method1101(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "()V")
    public static void method1095() {
        field2272 = null;
        field2280 = null;
        field2277 = null;
        field2290 = null;
        field2282 = null;
        field2289 = null;
        field2293 = null;
        field2284 = null;
        field2276 = null;
        field2283 = null;
        field2270 = null;
        field2296 = null;
        field2294 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
    private static final void method1096(int arg0) {
        class38 var1 = class159.method1143(-357225936, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class38[] var3 = class394.field5749[var2];
        if (var3 == null) {
            class38[] var4 = class237.field3555[var2];
            int var5 = var4.length;
            var3 = class394.field5749[var2] = new class38[var5];
            class325.method2133(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class325.method2133(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)V")
    private static final void method1097(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2282[field2279++] = class29.field311;
                return;
            }
            if (arg0 == 5001) {
                field2279 -= 3;
                class29.field311 = field2282[field2279];
                class463.field6863 = class462.method2833(field2282[field2279 + 1], -1);
                if (class463.field6863 == null) {
                    class463.field6863 = class320.field4850;
                }
                class202.field3134 = field2282[field2279 + 2];
                field2274++;
                class110.method857(4095, class75.field1268);
                class312.field4752.method1381(class29.field311, (byte) 120);
                class312.field4752.method1381(class463.field6863.field4345, (byte) 86);
                class312.field4752.method1381(class202.field3134, (byte) 124);
                return;
            }
            if (arg0 == 5002) {
                field2288 -= 2;
                String var2 = field2289[field2288];
                String var3 = field2289[field2288 + 1];
                field2279 -= 2;
                int var4 = field2282[field2279];
                int var5 = field2282[field2279 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field2291++;
                class110.method857(4095, class463.field6865);
                class312.field4752.method1381(class447.method2755(var2, (byte) 36) + class447.method2755(var3, (byte) 103) + 2, (byte) 98);
                class312.field4752.method1343(var2, (byte) -14);
                class312.field4752.method1381(var4 - 1, (byte) 82);
                class312.field4752.method1381(var5, (byte) 90);
                class312.field4752.method1343(var3, (byte) -14);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field2282[--field2279];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class451.field6714[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field2289[field2288++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field2282[--field2279];
                int var9 = -1;
                if (var8 < 100 && class451.field6714[var8] != null) {
                    var9 = class155.field2383[var8];
                }
                field2282[field2279++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class463.field6863 == null) {
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = class463.field6863.field4345;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field2289[--field2288];
                method1088(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2288 -= 2;
                String var11 = field2289[field2288];
                String var12 = field2289[field2288 + 1];
                if (class224.field3421 != 0 || (!class288.field4478 || class421.field6182) && !class108.field1638) {
                    field2275++;
                    class110.method857(4095, class153.field2351);
                    class312.field4752.method1381(0, (byte) 124);
                    int var13 = class312.field4752.field2982;
                    class312.field4752.method1343(var11, (byte) -14);
                    class7.method35(class312.field4752, 0, var12);
                    class312.field4752.method1354(class312.field4752.field2982 - var13, true);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field2282[--field2279];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class8.field100[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field2289[field2288++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field2282[--field2279];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class59.field897[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field2289[field2288++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field2282[--field2279];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class291.field4509[var18];
                }
                field2282[field2279++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class116.field1781 == null || class116.field1781.field7451 == null) {
                    var20 = class490.field7159;
                } else {
                    var20 = class116.field1781.method3044(true, 73);
                }
                field2289[field2288++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field2282[field2279++] = class202.field3134;
                return;
            }
            if (arg0 == 5017) {
                field2282[field2279++] = class168.field2539;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field2282[--field2279];
                int var22 = 0;
                if (var21 < 100 && class451.field6714[var21] != null) {
                    var22 = class169.field2571[var21];
                }
                field2282[field2279++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field2282[--field2279];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class138.field2088[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field2289[field2288++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class116.field1781 == null || class116.field1781.field7451 == null) {
                    var25 = class490.field7159;
                } else {
                    var25 = class116.field1781.method3039(-13, false);
                }
                field2289[field2288++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field2282[--field2279];
                field2289[field2288++] = class322.field4882.method2194(var26, (byte) 75).field5992;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field2282[--field2279];
                class405 var28 = class322.field4882.method2194(var27, (byte) 75);
                if (var28.field5991 == null) {
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = var28.field5991.length;
                return;
            }
            if (arg0 == 5052) {
                field2279 -= 2;
                int var29 = field2282[field2279];
                int var30 = field2282[field2279 + 1];
                class405 var31 = class322.field4882.method2194(var29, (byte) 75);
                int var32 = var31.field5991[var30];
                field2282[field2279++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field2282[--field2279];
                class405 var34 = class322.field4882.method2194(var33, (byte) 75);
                if (var34.field5979 == null) {
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = var34.field5979.length;
                return;
            }
            if (arg0 == 5054) {
                field2279 -= 2;
                int var35 = field2282[field2279];
                int var36 = field2282[field2279 + 1];
                field2282[field2279++] = class322.field4882.method2194(var35, (byte) 75).field5979[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field2282[--field2279];
                field2289[field2288++] = class376.field5554.method1083(1, var37).method976(0);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field2282[--field2279];
                class133 var39 = class376.field5554.method1083(1, var38);
                if (var39.field1957 == null) {
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = var39.field1957.length;
                return;
            }
            if (arg0 == 5057) {
                field2279 -= 2;
                int var40 = field2282[field2279];
                int var41 = field2282[field2279 + 1];
                field2282[field2279++] = class376.field5554.method1083(1, var40).field1957[var41];
                return;
            }
            if (arg0 == 5058) {
                field2283 = new class343();
                field2283.field5116 = field2282[--field2279];
                field2283.field5118 = class376.field5554.method1083(1, field2283.field5116);
                field2283.field5119 = new int[field2283.field5118.method978((byte) -76)];
                return;
            }
            if (arg0 == 5059) {
                field2285++;
                class110.method857(4095, class149.field2230);
                class312.field4752.method1381(0, (byte) 106);
                int var42 = class312.field4752.field2982;
                class312.field4752.method1381(0, (byte) 93);
                class312.field4752.method1364(field2283.field5116, true);
                field2283.field5118.method971((byte) 80, class312.field4752, field2283.field5119);
                class312.field4752.method1354(class312.field4752.field2982 - var42, true);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field2289[--field2288];
                field2273++;
                class110.method857(4095, class366.field5395);
                class312.field4752.method1381(0, (byte) 127);
                int var44 = class312.field4752.field2982;
                class312.field4752.method1343(var43, (byte) -14);
                class312.field4752.method1364(field2283.field5116, true);
                field2283.field5118.method971((byte) 74, class312.field4752, field2283.field5119);
                class312.field4752.method1354(class312.field4752.field2982 - var44, true);
                return;
            }
            if (arg0 == 5061) {
                field2285++;
                class110.method857(4095, class149.field2230);
                class312.field4752.method1381(0, (byte) 95);
                int var45 = class312.field4752.field2982;
                class312.field4752.method1381(1, (byte) 97);
                class312.field4752.method1364(field2283.field5116, true);
                field2283.field5118.method971((byte) 114, class312.field4752, field2283.field5119);
                class312.field4752.method1354(class312.field4752.field2982 - var45, true);
                return;
            }
            if (arg0 == 5062) {
                field2279 -= 2;
                int var46 = field2282[field2279];
                int var47 = field2282[field2279 + 1];
                field2282[field2279++] = class322.field4882.method2194(var46, (byte) 75).field5985[var47];
                return;
            }
            if (arg0 == 5063) {
                field2279 -= 2;
                int var48 = field2282[field2279];
                int var49 = field2282[field2279 + 1];
                field2282[field2279++] = class322.field4882.method2194(var48, (byte) 75).field5994[var49];
                return;
            }
            if (arg0 == 5064) {
                field2279 -= 2;
                int var50 = field2282[field2279];
                int var51 = field2282[field2279 + 1];
                if (var51 == -1) {
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = class322.field4882.method2194(var50, (byte) 75).method2553((byte) 85, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field2279 -= 2;
                int var52 = field2282[field2279];
                int var53 = field2282[field2279 + 1];
                if (var53 == -1) {
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = class322.field4882.method2194(var52, (byte) 75).method2551((char) var53, (byte) 21);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field2282[--field2279];
                field2282[field2279++] = class376.field5554.method1083(1, var54).method978((byte) 121);
                return;
            }
            if (arg0 == 5067) {
                field2279 -= 2;
                int var55 = field2282[field2279];
                int var56 = field2282[field2279 + 1];
                int var57 = class376.field5554.method1083(1, var55).method975((byte) 113, var56).field4274;
                field2282[field2279++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field2279 -= 2;
                int var58 = field2282[field2279];
                int var59 = field2282[field2279 + 1];
                field2283.field5119[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field2279 -= 2;
                int var60 = field2282[field2279];
                int var61 = field2282[field2279 + 1];
                field2283.field5119[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field2279 -= 3;
                int var62 = field2282[field2279];
                int var63 = field2282[field2279 + 1];
                int var64 = field2282[field2279 + 2];
                class133 var65 = class376.field5554.method1083(1, var62);
                if (var65.method975((byte) 113, var63).field4274 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2282[field2279++] = var65.method974(var63, 70, var64);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field2289[--field2288];
                boolean var67 = field2282[--field2279] == 1;
                class496.method2974(0, var66, var67);
                field2282[field2279++] = class132.field1947;
                return;
            }
            if (arg0 == 5072) {
                if (class6.field75 != null && class186.field2860 < class132.field1947) {
                    field2282[field2279++] = class6.field75[class186.field2860++] & 0xFFFF;
                    return;
                }
                field2282[field2279++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class186.field2860 = 0;
                return;
            }
            if (arg0 == 5074) {
                field2285++;
                class110.method857(4095, class149.field2230);
                class312.field4752.method1381(0, (byte) 88);
                int var68 = class312.field4752.field2982;
                class312.field4752.method1381(2, (byte) 90);
                class312.field4752.method1364(field2283.field5116, true);
                field2283.field5118.method971((byte) 74, class312.field4752, field2283.field5119);
                class312.field4752.method1354(class312.field4752.field2982 - var68, true);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class259.field4151.method30(-7951, 86)) {
                    field2282[field2279++] = 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class259.field4151.method30(-7951, 82)) {
                    field2282[field2279++] = 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class259.field4151.method30(-7951, 81)) {
                    field2282[field2279++] = 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class509.method3031(field2282[--field2279], 127);
                return;
            }
            if (arg0 == 5201) {
                field2282[field2279++] = class342.method2200(1);
                return;
            }
            if (arg0 == 5205) {
                class488.method2948(false, field2282[--field2279], (byte) 54, -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field2282[--field2279];
                class537 var70 = class362.method2297(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = var70.field7879;
                return;
            }
            if (arg0 == 5207) {
                class537 var71 = class362.method2310(field2282[--field2279]);
                if (var71 != null && var71.field7878 != null) {
                    field2289[field2288++] = var71.field7878;
                    return;
                }
                field2289[field2288++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2282[field2279++] = class374.field5533;
                field2282[field2279++] = class63.field1000;
                return;
            }
            if (arg0 == 5209) {
                field2282[field2279++] = class445.field6617 + class362.field5350;
                field2282[field2279++] = class362.field5345 + class274.field4298;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field2282[--field2279];
                class537 var73 = class362.method2310(var72);
                if (var73 == null) {
                    field2282[field2279++] = 0;
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = var73.field7866 >> 14 & 0x3FFF;
                field2282[field2279++] = var73.field7866 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field2282[--field2279];
                class537 var75 = class362.method2310(var74);
                if (var75 == null) {
                    field2282[field2279++] = 0;
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = var75.field7869 - var75.field7876;
                field2282[field2279++] = var75.field7867 - var75.field7871;
                return;
            }
            if (arg0 == 5212) {
                class53 var76 = class86.method763(65487);
                if (var76 == null) {
                    field2282[field2279++] = -1;
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = var76.field824;
                int var77 = var76.field812 << 28 | class362.field5350 + var76.field816 << 14 | class362.field5345 + var76.field809;
                field2282[field2279++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class53 var78 = class291.method1948(-1);
                if (var78 == null) {
                    field2282[field2279++] = -1;
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = var78.field824;
                int var79 = var78.field812 << 28 | class362.field5350 + var78.field816 << 14 | class362.field5345 + var78.field809;
                field2282[field2279++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field2282[--field2279];
                class537 var81 = class23.method147(19042);
                if (var81 != null) {
                    boolean var82 = var81.method3157(var80 >> 28 & 0x3, var80 & 0x3FFF, field2294, var80 >> 14 & 0x3FFF, (byte) -67);
                    if (var82) {
                        class496.method2972(true, field2294[2], field2294[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2279 -= 2;
                int var83 = field2282[field2279];
                int var84 = field2282[field2279 + 1];
                class462 var85 = class362.method2313(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class537 var87 = (class537) var85.method2825(-1); var87 != null; var87 = (class537) var85.method2827(-117)) {
                    if (var87.field7879 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field2282[field2279++] = 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field2282[--field2279];
                class537 var89 = class362.method2310(var88);
                if (var89 == null) {
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = var89.field7877;
                return;
            }
            if (arg0 == 5220) {
                field2282[field2279++] = class307.field4698 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field2282[--field2279];
                class496.method2972(true, var90 & 0x3FFF, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class537 var91 = class23.method147(19042);
                if (var91 != null) {
                    boolean var92 = var91.method3158(class445.field6617 + class362.field5350, field2294, class362.field5345 + class274.field4298, true);
                    if (var92) {
                        field2282[field2279++] = field2294[1];
                        field2282[field2279++] = field2294[2];
                        return;
                    }
                    field2282[field2279++] = -1;
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = -1;
                field2282[field2279++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2279 -= 2;
                int var93 = field2282[field2279];
                int var94 = field2282[field2279 + 1];
                class488.method2948(false, var93, (byte) -94, var94 >> 14 & 0x3FFF, var94 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field2282[--field2279];
                class537 var96 = class23.method147(19042);
                if (var96 != null) {
                    boolean var97 = var96.method3157(var95 >> 28 & 0x3, var95 & 0x3FFF, field2294, var95 >> 14 & 0x3FFF, (byte) -67);
                    if (var97) {
                        field2282[field2279++] = field2294[1];
                        field2282[field2279++] = field2294[2];
                        return;
                    }
                    field2282[field2279++] = -1;
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = -1;
                field2282[field2279++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field2282[--field2279];
                class537 var99 = class23.method147(19042);
                if (var99 != null) {
                    boolean var100 = var99.method3158(var98 >> 14 & 0x3FFF, field2294, var98 & 0x3FFF, true);
                    if (var100) {
                        field2282[field2279++] = field2294[1];
                        field2282[field2279++] = field2294[2];
                        return;
                    }
                    field2282[field2279++] = -1;
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = -1;
                field2282[field2279++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class514.method3051(field2282[--field2279], -1319);
                return;
            }
            if (arg0 == 5227) {
                field2279 -= 2;
                int var101 = field2282[field2279];
                int var102 = field2282[field2279 + 1];
                class488.method2948(true, var101, (byte) -96, var102 >> 14 & 0x3FFF, var102 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class270.field4278 = field2282[--field2279] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2282[field2279++] = class270.field4278 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field2282[--field2279];
                class202.method1423(27266, var103);
                return;
            }
            if (arg0 == 5231) {
                field2279 -= 2;
                int var104 = field2282[field2279];
                boolean var105 = field2282[field2279 + 1] == 1;
                if (class456.field6781 != null) {
                    class130 var106 = class456.field6781.method358((byte) -119, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method947((byte) 120);
                        return;
                    }
                    if (var106 == null && var105) {
                        class130 var107 = new class130();
                        class456.field6781.method357(var107, 1, (long) var104);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field2282[--field2279];
                if (class456.field6781 != null) {
                    class130 var109 = class456.field6781.method358((byte) 92, (long) var108);
                    field2282[field2279++] = var109 == null ? 0 : 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2279 -= 2;
                int var110 = field2282[field2279];
                boolean var111 = field2282[field2279 + 1] == 1;
                if (class183.field2805 != null) {
                    class130 var112 = class183.field2805.method358((byte) 115, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method947((byte) 125);
                        return;
                    }
                    if (var112 == null && var111) {
                        class130 var113 = new class130();
                        class183.field2805.method357(var113, 1, (long) var110);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field2282[--field2279];
                if (class183.field2805 != null) {
                    class130 var115 = class183.field2805.method358((byte) 121, (long) var114);
                    field2282[field2279++] = var115 == null ? 0 : 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2282[field2279++] = class362.field5327 == null ? -1 : class362.field5327.field7879;
                return;
            }
            if (arg0 == 5236) {
                field2279 -= 2;
                int var116 = field2282[field2279];
                int var117 = field2282[field2279 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class163.method1168(var116, -128, var119, var118);
                if (var120 < 0) {
                    field2282[field2279++] = -1;
                    return;
                }
                field2282[field2279++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class209.method1452((byte) -48);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2279 -= 2;
                int var121 = field2282[field2279];
                int var122 = field2282[field2279 + 1];
                class33.method196(3, false, 51, var121, var122);
                field2282[field2279++] = class337.field5072 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class337.field5072 != null) {
                    class33.method196(class40.field667.field4208, false, 51, -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class138[] var123 = class18.method115(true);
                field2282[field2279++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field2282[--field2279];
                class138[] var125 = class18.method115(true);
                field2282[field2279++] = var125[var124].field2085;
                field2282[field2279++] = var125[var124].field2086;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class40.field667.field4188;
                int var127 = class40.field667.field4191;
                int var128 = -1;
                class138[] var129 = class18.method115(true);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class138 var131 = var129[var130];
                    if (var131.field2085 == var126 && var131.field2086 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field2282[field2279++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field2282[field2279++] = class159.method1145((byte) 121);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field2282[--field2279];
                if (var132 >= 1 && var132 <= 2) {
                    class33.method196(var132, false, 51, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2282[field2279++] = class40.field667.field4208;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field2282[--field2279];
                if (var133 >= 1 && var133 <= 2) {
                    class40.field667.field4208 = var133;
                    class40.field667.method422(class122.field1844, 1);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2288 -= 2;
                String var134 = field2289[field2288];
                String var135 = field2289[field2288 + 1];
                int var136 = field2282[--field2279];
                field2278++;
                class110.method857(4095, class533.field7780);
                class312.field4752.method1381(class447.method2755(var134, (byte) -121) + class447.method2755(var135, (byte) -110) + 1, (byte) 101);
                class312.field4752.method1343(var134, (byte) -14);
                class312.field4752.method1343(var135, (byte) -14);
                class312.field4752.method1381(var136, (byte) 105);
                return;
            }
            if (arg0 == 5401) {
                field2279 -= 2;
                class452.field6718[field2282[field2279]] = (short) class187.method1302(false, field2282[field2279 + 1]);
                class300.field4608.method2092(1431655765);
                class300.field4608.method2084((byte) -58);
                class462.field6842.method1234(5);
                class80.method713(-14703);
                return;
            }
            if (arg0 == 5405) {
                field2279 -= 2;
                int var137 = field2282[field2279];
                int var138 = field2282[field2279 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class190.field2914[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2279 -= 7;
                int var139 = field2282[field2279];
                int var140 = field2282[field2279 + 1] << 1;
                int var141 = field2282[field2279 + 2];
                int var142 = field2282[field2279 + 3];
                int var143 = field2282[field2279 + 4];
                int var144 = field2282[field2279 + 5];
                int var145 = field2282[field2279 + 6];
                if (var139 >= 0 && var139 < 2 && class190.field2914[var139] != null && var140 >= 0 && var140 < class190.field2914[var139].length) {
                    class190.field2914[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class190.field2914[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class190.field2914[field2282[--field2279]].length >> 1;
                field2282[field2279++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class337.field5072 != null) {
                    class33.method196(class40.field667.field4208, false, 51, -1, -1);
                }
                if (class237.field3564 != null) {
                    class457.method2799(-30772);
                    System.exit(0);
                    return;
                }
                String var147 = class313.field4767 == null ? class447.method2752(true) : class313.field4767;
                class164.method1175(var147, class122.field1844, false, -70, class108.field1631 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class398.field5888 != null) {
                    if (class398.field5888.field4975 == null) {
                        var148 = class86.method767(class398.field5888.field4973, 520);
                    } else {
                        var148 = (String) class398.field5888.field4975;
                    }
                }
                field2289[field2288++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field2282[field2279++] = class66.field1042 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class337.field5072 != null) {
                    class33.method196(class40.field667.field4208, false, 51, -1, -1);
                }
                String var149 = field2289[--field2288];
                boolean var150 = field2282[--field2279] == 1;
                String var151 = class447.method2752(true) + var149;
                class164.method1175(var151, class122.field1844, var150, 39, class108.field1631 == 1);
                return;
            }
            if (arg0 == 5422) {
                field2288 -= 2;
                String var152 = field2289[field2288];
                String var153 = field2289[field2288 + 1];
                int var154 = field2282[--field2279];
                if (var152.length() > 0) {
                    if (class425.field6306 == null) {
                        class425.field6306 = new String[class30.field361[class401.field5923.field4704]];
                    }
                    class425.field6306[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class381.field5601 == null) {
                        class381.field5601 = new String[class30.field361[class401.field5923.field4704]];
                    }
                    class381.field5601[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2289[--field2288]);
                return;
            }
            if (arg0 == 5424) {
                field2279 -= 11;
                class261.field4169 = field2282[field2279];
                class203.field3135 = field2282[field2279 + 1];
                class236.field3552 = field2282[field2279 + 2];
                class136.field2074 = field2282[field2279 + 3];
                class516.field7507 = field2282[field2279 + 4];
                class534.field7841 = field2282[field2279 + 5];
                class424.field6229 = field2282[field2279 + 6];
                class56.field855 = field2282[field2279 + 7];
                class2.field16 = field2282[field2279 + 8];
                class327.field4948 = field2282[field2279 + 9];
                class231.field3484 = field2282[field2279 + 10];
                class510.field7431.method739((byte) -115, class516.field7507);
                class510.field7431.method739((byte) -69, class534.field7841);
                class510.field7431.method739((byte) -121, class424.field6229);
                class510.field7431.method739((byte) -97, class56.field855);
                class510.field7431.method739((byte) -66, class2.field16);
                class437.field6502 = null;
                client.field7545 = null;
                class192.field2955 = null;
                class364.field5369 = null;
                class162.field2454 = null;
                class171.field2626 = null;
                class276.field4341 = null;
                class307.field4691 = null;
                class86.field1411 = true;
                return;
            }
            if (arg0 == 5425) {
                class452.method2769(-16501);
                class86.field1411 = false;
                return;
            }
            if (arg0 == 5426) {
                field2279 -= 2;
                class33.field400 = field2282[field2279];
                class504.field7324 = field2282[field2279 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2279 -= 2;
                class376.field5549 = field2282[field2279 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2279 -= 2;
                int var155 = field2282[field2279];
                int var156 = field2282[field2279 + 1];
                field2282[field2279++] = class110.method858(var155, (byte) -87, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class481.method2904(false, (byte) 6, field2289[--field2288], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class220.method1510(112, "accountcreated", class122.field1844.field1062);
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2279 -= 4;
                int var157 = field2282[field2279];
                int var158 = field2282[field2279 + 1];
                int var159 = field2282[field2279 + 2];
                int var160 = field2282[field2279 + 3];
                class153.method1115(var158, false, (var157 >> 14 & 0x3FFF) - class422.field6201, (var157 & 0x3FFF) - class23.field273, true, var159, var160);
                return;
            }
            if (arg0 == 5501) {
                field2279 -= 4;
                int var161 = field2282[field2279];
                int var162 = field2282[field2279 + 1];
                int var163 = field2282[field2279 + 2];
                int var164 = field2282[field2279 + 3];
                class383.method2438(var162, (var161 & 0x3FFF) - class23.field273, var164, (var161 >> 14 & 0x3FFF) - class422.field6201, (byte) -63, var163);
                return;
            }
            if (arg0 == 5502) {
                field2279 -= 6;
                int var165 = field2282[field2279];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class480.field7050 = var165;
                int var166 = field2282[field2279 + 1];
                if (var166 + 1 >= class190.field2914[class480.field7050].length >> 1) {
                    throw new RuntimeException();
                }
                class247.field3699 = var166;
                class7.field83 = 0;
                class176.field2710 = field2282[field2279 + 2];
                class196.field3066 = field2282[field2279 + 3];
                int var167 = field2282[field2279 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class420.field6167 = var167;
                int var168 = field2282[field2279 + 5];
                if (var168 + 1 >= class190.field2914[class420.field6167].length >> 1) {
                    throw new RuntimeException();
                }
                class186.field2863 = var168;
                class33.field401 = 3;
                return;
            }
            if (arg0 == 5503) {
                class432.method2686(2);
                return;
            }
            if (arg0 == 5504) {
                field2279 -= 2;
                class209.method1459(0, (byte) -102, field2282[field2279 + 1], field2282[field2279]);
                return;
            }
            if (arg0 == 5505) {
                field2282[field2279++] = (int) class353.field5236 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2282[field2279++] = (int) class434.field6466 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class393.method2470(116);
                return;
            }
            if (arg0 == 5508) {
                class49.method325(8);
                return;
            }
            if (arg0 == 5509) {
                class162.method1159((byte) 106);
                return;
            }
            if (arg0 == 5510) {
                class310.method2054(192);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field2282[--field2279];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class422.field6201;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class338.field5076) {
                    var172 = class338.field5076;
                }
                int var173 = var171 - class23.field273;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class250.field4077) {
                    var173 = class250.field4077;
                }
                class2.field28 = (var172 << 7) + 64;
                class447.field6641 = (var173 << 7) + 64;
                class33.field401 = 4;
                return;
            }
            if (arg0 == 5512) {
                class187.method1300(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2288 -= 2;
                String var174 = field2289[field2288];
                String var175 = field2289[field2288 + 1];
                int var176 = field2282[--field2279];
                if (class460.field6813 != 2) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    class490.field7159 = var174;
                    class240.field3598 = var175;
                    class125.field1877 = var176;
                    class376.method2400(5, (byte) 107);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class527.method3127(21851);
                return;
            }
            if (arg0 == 5602) {
                if (class114.field1750 == 0) {
                    class330.field4979 = -2;
                    class350.field5219 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2279 -= 4;
                if (class460.field6813 != 2) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    class446.method2750(field2282[field2279 + 1], field2282[field2279], field2282[field2279 + 2], field2282[field2279 + 3], 1);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2288--;
                if (class460.field6813 != 2) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    class70.method612(class279.method1891(-77, field2289[field2288]), 0);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2288 -= 2;
                if (class460.field6813 != 2) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    class222.method1541(field2289[field2288 + 1], (byte) 37, class279.method1891(126, field2289[field2288]), false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class259.field4152 == 0) {
                    class336.field5062 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2282[field2279++] = class350.field5219;
                return;
            }
            if (arg0 == 5608) {
                field2282[field2279++] = class196.field3067;
                return;
            }
            if (arg0 == 5609) {
                field2282[field2279++] = class336.field5062;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field2289[field2288++] = class347.field5161.length > var177 ? class316.method2100(class347.field5161[var177], true) : "";
                }
                class347.field5161 = null;
                return;
            }
            if (arg0 == 5611) {
                field2282[field2279++] = class51.field784;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field2282[--field2279];
                if (class460.field6813 != 6) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    if (class541.field7922 != null) {
                        class541.field7922.method2155(false);
                        class541.field7922 = null;
                    }
                    class125.field1877 = var178;
                    class376.method2400(8, (byte) 107);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2282[field2279++] = class350.field5219;
                return;
            }
            if (arg0 == 5615) {
                field2288 -= 2;
                String var179 = field2289[field2288];
                String var180 = field2289[field2288 + 1];
                if (class460.field6813 != 2) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    if (class541.field7922 != null) {
                        class541.field7922.method2155(false);
                        class541.field7922 = null;
                    }
                    class490.field7159 = var179;
                    class240.field3598 = var180;
                    class376.method2400(4, (byte) 107);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class405.method2550(false, 100);
                return;
            }
            if (arg0 == 5617) {
                field2282[field2279++] = class330.field4979;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field2282[--field2279];
                class166.method1188(false, var181, (byte) -5);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field2282[--field2279];
                class166.method1188(true, var182, (byte) -5);
                return;
            }
            if (arg0 == 5620) {
                class525.method3122(117);
                if (class420.field6173 != "" && class420.field6173 != "") {
                    field2282[field2279++] = 1;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2288 -= 2;
                if (class460.field6813 != 2) {
                    return;
                }
                if (class114.field1750 == 0 && class259.field4152 == 0) {
                    class222.method1541(field2289[field2288 + 1], (byte) 37, class279.method1891(124, field2289[field2288]), true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class329 var183 = class122.field1844.method472("3", false, (byte) 12);
                while (var183.field4974 == 0) {
                    class468.method2848(1L, (byte) 116);
                }
                if (var183.field4974 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class95 var184 = (class95) var183.field4975;
                if (var184.method804(6387).exists()) {
                    class194 var185 = new class194(50);
                    try {
                        var184.method805(var185.field2973, true, 0, 50);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method800(false);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field2282[--field2279];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class40.field667.field4207 = var186;
                class8.method39(false);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6002) {
                class40.field667.method419(field2282[--field2279] == 1, 28);
                class8.method39(false);
                class486.method2936(8137);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6003) {
                class40.field667.field4215 = field2282[--field2279] == 1;
                class486.method2936(8137);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6005) {
                class40.field667.field4195 = field2282[--field2279] == 1;
                class8.method39(false);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6006) {
                class40.field667.field4220 = field2282[--field2279] == 1;
                class376.field5542.method591(!class40.field667.field4220);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6007) {
                class40.field667.field4182 = field2282[--field2279];
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6008) {
                class40.field667.field4210 = field2282[--field2279] == 1;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6009) {
                class40.field667.field4216 = field2282[--field2279] == 1;
                class8.method39(false);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6010) {
                class40.field667.field4201 = field2282[--field2279] == 1;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field2282[--field2279];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class40.field667.method1837(class108.field1631, var187, false);
                class8.method39(false);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6012) {
                class40.field667.method1839(field2282[--field2279] == 1, (byte) 19, class108.field1631);
                class499.method2979(32);
                class483.method2912((byte) -50);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6014) {
                class40.field667.field4205 = field2282[--field2279] == 1;
                class8.method39(false);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6015) {
                class40.field667.field4218 = field2282[--field2279] == 1;
                class8.method39(false);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field2282[--field2279];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class40.field667.field4212 = var188;
                class155.method1127(class108.field1631, 94);
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6017) {
                class40.field667.field4203 = field2282[--field2279] == 1;
                class35.method224(22050);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field2282[--field2279];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class40.field667.field4199 = var189;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field2282[--field2279];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class40.field667.field4192 != var190) {
                    if (class40.field667.field4192 == 0 && class235.field3548 != -1) {
                        class15.method87(class235.field3548, var190, 0, class417.field6135, false, 19900);
                        class326.field4938 = false;
                    } else if (var190 == 0) {
                        class241.method1621((byte) -28);
                        class326.field4938 = false;
                    } else {
                        class151.method1087(var190, (byte) -78);
                    }
                    class40.field667.field4192 = var190;
                }
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field2282[--field2279];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class40.field667.field4222 = var191;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6021) {
                class40.field667.field985 = field2282[--field2279] == 1;
                class486.method2936(8137);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field2282[--field2279];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class360.field5314 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class486.method2941(-97, var192);
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                field2282[field2279++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field2282[--field2279];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class40.field667.field4184 = var194;
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field2282[--field2279];
                if (var195 < 0 || var195 > class463.method2837(class360.field5314, (byte) 89)) {
                    var195 = 0;
                }
                class40.field667.field4193 = var195;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field2282[--field2279];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class223.method1544((byte) 120, var196 == 1);
                return;
            }
            if (arg0 == 6028) {
                class40.field667.field4197 = field2282[--field2279] != 0;
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6029) {
                class40.field667.field4182 = field2282[--field2279];
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6030) {
                class40.field667.field4198 = field2282[--field2279] != 0;
                class40.field667.method422(class122.field1844, 1);
                class8.method39(false);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field2282[--field2279];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class155.method1127(var197, -87);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field2282[--field2279];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class40.field667.field4204 = var198;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field2282[--field2279];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class40.field667.field4183 = var199;
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6034) {
                class40.field667.field4217 = field2282[--field2279] == 1;
                class40.field667.method422(class122.field1844, 1);
                class499.method2979(32);
                class129.field1923 = false;
                return;
            }
            if (arg0 == 6035) {
                class40.field667.field986 = field2282[--field2279] == 1;
                class8.method39(false);
                class486.method2936(8137);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2282[field2279++] = class40.field667.field4207;
                return;
            }
            if (arg0 == 6102) {
                field2282[field2279++] = class40.field667.method414(class108.field1631, -106) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2282[field2279++] = class40.field667.field4215 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2282[field2279++] = class40.field667.field4195 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field2282[field2279++] = class40.field667.field4220 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2282[field2279++] = class40.field667.field4182;
                return;
            }
            if (arg0 == 6108) {
                field2282[field2279++] = class40.field667.field4210 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field2282[field2279++] = class40.field667.field4216 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2282[field2279++] = class40.field667.field4201 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2282[field2279++] = class40.field667.method1836(127, class108.field1631);
                return;
            }
            if (arg0 == 6112) {
                field2282[field2279++] = class40.field667.method1835(class108.field1631, true) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2282[field2279++] = class40.field667.field4205 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2282[field2279++] = class40.field667.field4218 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2282[field2279++] = class40.field667.field4212;
                return;
            }
            if (arg0 == 6117) {
                field2282[field2279++] = class40.field667.field4203 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2282[field2279++] = class40.field667.field4199;
                return;
            }
            if (arg0 == 6119) {
                field2282[field2279++] = class40.field667.field4192;
                return;
            }
            if (arg0 == 6120) {
                field2282[field2279++] = class40.field667.field4222;
                return;
            }
            if (arg0 == 6121) {
                field2282[field2279++] = class376.field5542.method581() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field2282[field2279++] = class463.method2835((byte) 107);
                return;
            }
            if (arg0 == 6124) {
                field2282[field2279++] = class40.field667.field4184;
                return;
            }
            if (arg0 == 6125) {
                field2282[field2279++] = class40.field667.field4193;
                return;
            }
            if (arg0 == 6126) {
                field2282[field2279++] = class376.field5542.method515() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field2282[field2279++] = class40.field667.field4202 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2282[field2279++] = class40.field667.field4197 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2282[field2279++] = class40.field667.field4182;
                return;
            }
            if (arg0 == 6130) {
                field2282[field2279++] = class40.field667.field4198 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2282[field2279++] = class108.field1631;
                return;
            }
            if (arg0 == 6132) {
                field2282[field2279++] = class40.field667.field4204;
                return;
            }
            if (arg0 == 6133) {
                field2282[field2279++] = class66.field1042 == 1 || class66.field1042 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field2282[field2279++] = class463.method2837(class360.field5314, (byte) 89);
                return;
            }
            if (arg0 == 6135) {
                field2282[field2279++] = class40.field667.field4183;
                return;
            }
            if (arg0 == 6136) {
                field2282[field2279++] = class40.field667.field4217 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field2282[field2279++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2279 -= 2;
                class285.field4434 = (short) field2282[field2279];
                if (class285.field4434 <= 0) {
                    class285.field4434 = 256;
                }
                class298.field4587 = (short) field2282[field2279 + 1];
                if (class298.field4587 <= 0) {
                    class298.field4587 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2279 -= 2;
                class454.field6754 = (short) field2282[field2279];
                if (class454.field6754 <= 0) {
                    class454.field6754 = 256;
                }
                class17.field187 = (short) field2282[field2279 + 1];
                if (class17.field187 <= 0) {
                    class17.field187 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2279 -= 4;
                class200.field3105 = (short) field2282[field2279];
                if (class200.field3105 <= 0) {
                    class200.field3105 = 1;
                }
                class515.field7498 = (short) field2282[field2279 + 1];
                if (class515.field7498 <= 0) {
                    class515.field7498 = 32767;
                } else if (class515.field7498 < class200.field3105) {
                    class515.field7498 = class200.field3105;
                }
                class78.field1300 = (short) field2282[field2279 + 2];
                if (class78.field1300 <= 0) {
                    class78.field1300 = 1;
                }
                class261.field4168 = (short) field2282[field2279 + 3];
                if (class261.field4168 <= 0) {
                    class261.field4168 = 32767;
                    return;
                }
                if (class261.field4168 < class78.field1300) {
                    class261.field4168 = class78.field1300;
                }
                return;
            }
            if (arg0 == 6203) {
                class171.method1224(0, class53.field817.field629, 0, (byte) 5, class53.field817.field591, false);
                field2282[field2279++] = class487.field7129;
                field2282[field2279++] = class442.field6584;
                return;
            }
            if (arg0 == 6204) {
                field2282[field2279++] = class454.field6754;
                field2282[field2279++] = class17.field187;
                return;
            }
            if (arg0 == 6205) {
                field2282[field2279++] = class285.field4434;
                field2282[field2279++] = class298.field4587;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2282[field2279++] = (int) (class375.method2397((byte) -75) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2282[field2279++] = (int) (class375.method2397((byte) -75) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2279 -= 3;
                int var201 = field2282[field2279];
                int var202 = field2282[field2279 + 1];
                int var203 = field2282[field2279 + 2];
                field2270.clear();
                field2270.set(11, 12);
                field2270.set(var203, var202, var201);
                int var204 = (int) (field2270.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field2282[field2279++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field2270.clear();
                field2270.setTime(new Date(class375.method2397((byte) -75)));
                field2282[field2279++] = field2270.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field2282[--field2279];
                boolean var206 = true;
                if (var205 < 0) {
                    var206 = (var205 + 1) % 4 == 0;
                } else if (var205 < 1582) {
                    var206 = var205 % 4 == 0;
                } else if (var205 % 4 != 0) {
                    var206 = false;
                } else if (var205 % 100 != 0) {
                    var206 = true;
                } else if (var205 % 400 != 0) {
                    var206 = false;
                }
                field2282[field2279++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2282[field2279++] = class471.method2856(-25) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2282[field2279++] = class122.method910((byte) -115) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class460.field6813 == 6 && class114.field1750 == 0 && class259.field4152 == 0) {
                    if (class511.field7482) {
                        field2282[field2279++] = 0;
                        return;
                    }
                    if (class213.field3242 > class375.method2397((byte) -75) - 1000L) {
                        field2282[field2279++] = 1;
                        return;
                    }
                    class511.field7482 = true;
                    class110.method857(4095, class477.field6993);
                    class312.field4752.method1348((byte) -65, class150.field2247);
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class424 var207 = class213.method1466(-9543);
                if (var207 != null) {
                    field2282[field2279++] = var207.field6227;
                    field2282[field2279++] = var207.field2198;
                    field2289[field2288++] = var207.field6230;
                    class330 var208 = var207.method2638(-108);
                    field2282[field2279++] = var208.field4980;
                    field2289[field2288++] = var208.field4981;
                    field2282[field2279++] = var207.field2206;
                    field2282[field2279++] = var207.field6222;
                    field2289[field2288++] = var207.field6223;
                    return;
                }
                field2282[field2279++] = -1;
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                field2282[field2279++] = 0;
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                return;
            }
            if (arg0 == 6502) {
                class424 var209 = class317.method2107(122);
                if (var209 != null) {
                    field2282[field2279++] = var209.field6227;
                    field2282[field2279++] = var209.field2198;
                    field2289[field2288++] = var209.field6230;
                    class330 var210 = var209.method2638(-128);
                    field2282[field2279++] = var210.field4980;
                    field2289[field2288++] = var210.field4981;
                    field2282[field2279++] = var209.field2206;
                    field2282[field2279++] = var209.field6222;
                    field2289[field2288++] = var209.field6223;
                    return;
                }
                field2282[field2279++] = -1;
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                field2282[field2279++] = 0;
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field2282[--field2279];
                String var212 = field2289[--field2288];
                if (class460.field6813 == 6 && class114.field1750 == 0 && class259.field4152 == 0) {
                    field2282[field2279++] = class13.method75(var212, var211, -114) ? 1 : 0;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class40.field667.field4209 = field2282[--field2279];
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6505) {
                field2282[field2279++] = class40.field667.field4209;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field2282[--field2279];
                class424 var214 = class500.method2987(var213, (byte) 125);
                if (var214 != null) {
                    field2282[field2279++] = var214.field2198;
                    field2289[field2288++] = var214.field6230;
                    class330 var215 = var214.method2638(-116);
                    field2282[field2279++] = var215.field4980;
                    field2289[field2288++] = var215.field4981;
                    field2282[field2279++] = var214.field2206;
                    field2282[field2279++] = var214.field6222;
                    field2289[field2288++] = var214.field6223;
                    return;
                }
                field2282[field2279++] = -1;
                field2289[field2288++] = "";
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                field2282[field2279++] = 0;
                field2282[field2279++] = 0;
                field2289[field2288++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2279 -= 4;
                int var216 = field2282[field2279];
                boolean var217 = field2282[field2279 + 1] == 1;
                int var218 = field2282[field2279 + 2];
                boolean var219 = field2282[field2279 + 3] == 1;
                class261.method1824((byte) 100, var218, var217, var216, var219);
                return;
            }
            if (arg0 == 6508) {
                class511.method3037(-122);
                return;
            }
            if (arg0 == 6509) {
                if (class460.field6813 != 6) {
                    return;
                }
                class297.field4577 = field2282[--field2279] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class40.field667.field4187 = field2282[--field2279] == 1;
                class40.field667.method422(class122.field1844, 1);
                return;
            }
            if (arg0 == 6601) {
                field2282[field2279++] = class40.field667.field4187 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class322.field4902 == class156.field2403) {
            if (arg0 == 6700) {
                int var220 = class215.field3248.method364(0);
                if (class134.field2010 != -1) {
                    var220++;
                }
                field2282[field2279++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field2282[--field2279];
                if (class134.field2010 != -1) {
                    if (var221 == 0) {
                        field2282[field2279++] = class134.field2010;
                        return;
                    }
                    var221--;
                }
                class295 var222 = (class295) class215.field3248.method359(true);
                while (var221-- > 0) {
                    var222 = (class295) class215.field3248.method365(-67);
                }
                field2282[field2279++] = var222.field4546;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field2282[--field2279];
                if (class237.field3555[var223] == null) {
                    field2289[field2288++] = "";
                    return;
                }
                String var224 = class237.field3555[var223][0].field529;
                if (var224 == null) {
                    field2289[field2288++] = "";
                    return;
                }
                field2289[field2288++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field2282[--field2279];
                if (class237.field3555[var225] == null) {
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = class237.field3555[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field2279 -= 2;
                int var226 = field2282[field2279];
                int var227 = field2282[field2279 + 1];
                if (class237.field3555[var226] == null) {
                    field2289[field2288++] = "";
                    return;
                }
                String var228 = class237.field3555[var226][var227].field529;
                if (var228 == null) {
                    field2289[field2288++] = "";
                    return;
                }
                field2289[field2288++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field2279 -= 2;
                int var229 = field2282[field2279];
                int var230 = field2282[field2279 + 1];
                if (class237.field3555[var229] == null) {
                    field2282[field2279++] = 0;
                    return;
                }
                field2282[field2279++] = class237.field3555[var229][var230].field579;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2279 -= 3;
                int var231 = field2282[field2279];
                int var232 = field2282[field2279 + 1];
                int var233 = field2282[field2279 + 2];
                class487.method2943("", var233, -126, var231 << 16 | var232, 1);
                return;
            }
            if (arg0 == 6708) {
                field2279 -= 3;
                int var234 = field2282[field2279];
                int var235 = field2282[field2279 + 1];
                int var236 = field2282[field2279 + 2];
                class487.method2943("", var236, -125, var234 << 16 | var235, 2);
                return;
            }
            if (arg0 == 6709) {
                field2279 -= 3;
                int var237 = field2282[field2279];
                int var238 = field2282[field2279 + 1];
                int var239 = field2282[field2279 + 2];
                class487.method2943("", var239, -128, var237 << 16 | var238, 3);
                return;
            }
            if (arg0 == 6710) {
                field2279 -= 3;
                int var240 = field2282[field2279];
                int var241 = field2282[field2279 + 1];
                int var242 = field2282[field2279 + 2];
                class487.method2943("", var242, -117, var240 << 16 | var241, 4);
                return;
            }
            if (arg0 == 6711) {
                field2279 -= 3;
                int var243 = field2282[field2279];
                int var244 = field2282[field2279 + 1];
                int var245 = field2282[field2279 + 2];
                class487.method2943("", var245, -126, var243 << 16 | var244, 5);
                return;
            }
            if (arg0 == 6712) {
                field2279 -= 3;
                int var246 = field2282[field2279];
                int var247 = field2282[field2279 + 1];
                int var248 = field2282[field2279 + 2];
                class487.method2943("", var248, -125, var246 << 16 | var247, 6);
                return;
            }
            if (arg0 == 6713) {
                field2279 -= 3;
                int var249 = field2282[field2279];
                int var250 = field2282[field2279 + 1];
                int var251 = field2282[field2279 + 2];
                class487.method2943("", var251, -122, var249 << 16 | var250, 7);
                return;
            }
            if (arg0 == 6714) {
                field2279 -= 3;
                int var252 = field2282[field2279];
                int var253 = field2282[field2279 + 1];
                int var254 = field2282[field2279 + 2];
                class487.method2943("", var254, -117, var252 << 16 | var253, 8);
                return;
            }
            if (arg0 == 6715) {
                field2279 -= 3;
                int var255 = field2282[field2279];
                int var256 = field2282[field2279 + 1];
                int var257 = field2282[field2279 + 2];
                class487.method2943("", var257, -127, var255 << 16 | var256, 9);
                return;
            }
            if (arg0 == 6716) {
                field2279 -= 3;
                int var258 = field2282[field2279];
                int var259 = field2282[field2279 + 1];
                int var260 = field2282[field2279 + 2];
                class487.method2943("", var260, -124, var258 << 16 | var259, 10);
                return;
            }
            if (arg0 == 6717) {
                field2279 -= 3;
                int var261 = field2282[field2279];
                int var262 = field2282[field2279 + 1];
                int var263 = field2282[field2279 + 2];
                class38 var264 = class327.method2148(var261 << 16 | var262, -7153, var263);
                class62.method415(false);
                class94 var265 = client.method3078(var264);
                class370.method2371(var265.method797(-103), var264, 121, var265.field1498);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field2282[--field2279];
                class30 var267 = class455.field6765.method2182(var266, (byte) -42);
                if (var267.field337 == null) {
                    field2289[field2288++] = "";
                    return;
                }
                field2289[field2288++] = var267.field337;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field2282[--field2279];
                class30 var269 = class455.field6765.method2182(var268, (byte) -42);
                field2282[field2279++] = var269.field331;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field2282[--field2279];
                class30 var271 = class455.field6765.method2182(var270, (byte) -42);
                field2282[field2279++] = var271.field351;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field2282[--field2279];
                class30 var273 = class455.field6765.method2182(var272, (byte) -42);
                field2282[field2279++] = var273.field368;
                return;
            }
            if (arg0 == 6804) {
                field2279 -= 2;
                int var274 = field2282[field2279];
                int var275 = field2282[field2279 + 1];
                class450 var276 = class264.field4225.method2789((byte) 36, var275);
                if (var276.method2764(true)) {
                    field2289[field2288++] = class455.field6765.method2182(var274, (byte) -42).method180(var275, (byte) -118, var276.field6691);
                    return;
                }
                field2282[field2279++] = class455.field6765.method2182(var274, (byte) -42).method177(false, var276.field6692, var275);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field2282[field2279++] = class288.field4478 && !class421.field6182 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field2282[field2279++] = class281.field4378;
                return;
            }
            if (arg0 == 6902) {
                field2282[field2279++] = class379.field5588;
                return;
            }
            if (arg0 == 6903) {
                field2282[field2279++] = class322.field4894;
                return;
            }
            if (arg0 == 6904) {
                field2282[field2279++] = class480.field7037;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class398.field5888 != null) {
                    if (class398.field5888.field4975 == null) {
                        var277 = class86.method767(class398.field5888.field4973, 520);
                    } else {
                        var277 = (String) class398.field5888.field4975;
                    }
                }
                field2289[field2288++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field2282[field2279++] = class305.field4681;
                return;
            }
            if (arg0 == 6907) {
                field2282[field2279++] = class537.field7885;
                return;
            }
            if (arg0 == 6908) {
                field2282[field2279++] = class218.field3287;
                return;
            }
            if (arg0 == 6909) {
                field2282[field2279++] = class159.field2411 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field2282[field2279++] = class153.field2353;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZ)V")
    private static final void method1098(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2279 -= 3;
                int var2 = field2282[field2279];
                int var3 = field2282[field2279 + 1];
                int var4 = field2282[field2279 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class38 var5 = class159.method1143(-357225936, var2);
                if (var5.field610 == null) {
                    var5.field610 = new class38[var4 + 1];
                }
                if (var5.field610.length <= var4) {
                    class38[] var6 = new class38[var4 + 1];
                    for (int var7 = 0; var7 < var5.field610.length; var7++) {
                        var6[var7] = var5.field610[var7];
                    }
                    var5.field610 = var6;
                }
                if (var4 > 0 && var5.field610[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class38 var8 = new class38();
                var8.field503 = var3;
                var8.field600 = var8.field580 = var5.field580;
                var8.field607 = var4;
                var5.field610[var4] = var8;
                if (arg1) {
                    field2276 = var8;
                } else {
                    field2284 = var8;
                }
                class5.method27(var5, -208246073);
                return;
            }
            if (arg0 == 101) {
                class38 var9 = arg1 ? field2276 : field2284;
                if (var9.field607 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class38 var10 = class159.method1143(-357225936, var9.field580);
                var10.field610[var9.field607] = null;
                class5.method27(var10, -208246073);
                return;
            }
            if (arg0 == 102) {
                class38 var11 = class159.method1143(-357225936, field2282[--field2279]);
                var11.field610 = null;
                class5.method27(var11, -208246073);
                return;
            }
            if (arg0 == 200) {
                field2279 -= 2;
                int var12 = field2282[field2279];
                int var13 = field2282[field2279 + 1];
                class38 var14 = class327.method2148(var12, -7153, var13);
                if (var14 != null && var13 != -1) {
                    field2282[field2279++] = 1;
                    if (arg1) {
                        field2276 = var14;
                        return;
                    }
                    field2284 = var14;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2282[--field2279];
                class38 var16 = class159.method1143(-357225936, var15);
                if (var16 != null) {
                    field2282[field2279++] = 1;
                    if (arg1) {
                        field2276 = var16;
                        return;
                    }
                    field2284 = var16;
                    return;
                }
                field2282[field2279++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2282[--field2279];
                method1091(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2282[--field2279];
                method1096(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2279 -= 2;
                int var19 = field2282[field2279];
                int var20 = field2282[field2279 + 1];
                for (int var21 = 0; var21 < class441.field6561.length; var21++) {
                    if (class441.field6561[var21] == var19) {
                        class116.field1781.field7460.method1929(var21, var20, class306.field4682, 114);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class429.field6368.length; var22++) {
                    if (class429.field6368[var22] == var19) {
                        class116.field1781.field7460.method1929(var22, var20, class306.field4682, 126);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2279 -= 2;
                int var23 = field2282[field2279];
                int var24 = field2282[field2279 + 1];
                class116.field1781.field7460.method1924(var23, 8, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2282[--field2279] != 0;
                class116.field1781.field7460.method1922(true, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class38 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class159.method1143(-357225936, field2282[--field2279]);
            } else {
                var26 = arg1 ? field2276 : field2284;
            }
            if (arg0 == 1000) {
                field2279 -= 4;
                var26.field521 = field2282[field2279];
                var26.field585 = field2282[field2279 + 1];
                int var27 = field2282[field2279 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field2282[field2279 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field527 = (byte) var27;
                var26.field630 = (byte) var28;
                class5.method27(var26, -208246073);
                class265.method1846(-22413, var26);
                if (var26.field607 == -1) {
                    class81.method717(var26.field580, 1);
                }
                return;
            }
            if (arg0 == 1001) {
                field2279 -= 4;
                var26.field532 = field2282[field2279];
                var26.field536 = field2282[field2279 + 1];
                var26.field575 = 0;
                var26.field570 = 0;
                int var29 = field2282[field2279 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field2282[field2279 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field513 = (byte) var29;
                var26.field590 = (byte) var30;
                class5.method27(var26, -208246073);
                class265.method1846(-22413, var26);
                if (var26.field503 == 0) {
                    class93.method789(false, (byte) -120, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field2282[--field2279] == 1;
                if (var26.field542 != var31) {
                    var26.field542 = var31;
                    class5.method27(var26, -208246073);
                }
                if (var26.field607 == -1) {
                    class291.method1949(-127, var26.field580);
                }
                return;
            }
            if (arg0 == 1004) {
                field2279 -= 2;
                var26.field587 = field2282[field2279];
                var26.field578 = field2282[field2279 + 1];
                class5.method27(var26, -208246073);
                class265.method1846(-22413, var26);
                if (var26.field503 == 0) {
                    class93.method789(false, (byte) -105, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field505 = field2282[--field2279] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class38 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class159.method1143(-357225936, field2282[--field2279]);
            } else {
                var32 = arg1 ? field2276 : field2284;
            }
            if (arg0 == 1100) {
                field2279 -= 2;
                var32.field488 = field2282[field2279];
                if (var32.field488 > var32.field595 - var32.field629) {
                    var32.field488 = var32.field595 - var32.field629;
                }
                if (var32.field488 < 0) {
                    var32.field488 = 0;
                }
                var32.field504 = field2282[field2279 + 1];
                if (var32.field504 > var32.field604 - var32.field591) {
                    var32.field504 = var32.field604 - var32.field591;
                }
                if (var32.field504 < 0) {
                    var32.field504 = 0;
                }
                class5.method27(var32, -208246073);
                if (var32.field607 == -1) {
                    class43.method283(var32.field580, 22039);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field493 = field2282[--field2279];
                class5.method27(var32, -208246073);
                if (var32.field607 == -1) {
                    class125.method923(-25967, var32.field580);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field616 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1103) {
                var32.field566 = field2282[--field2279];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1104) {
                var32.field564 = field2282[--field2279];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field2282[--field2279];
                if (var32.field634 != var33) {
                    var32.field634 = var33;
                    class5.method27(var32, -208246073);
                }
                if (var32.field607 == -1) {
                    class96.method807(-2, var32.field580);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field482 = field2282[--field2279];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1107) {
                var32.field560 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1108) {
                var32.field640 = 1;
                var32.field491 = field2282[--field2279];
                class5.method27(var32, -208246073);
                if (var32.field607 == -1) {
                    class109.method853(var32.field580, (byte) -125);
                }
                return;
            }
            if (arg0 == 1109) {
                field2279 -= 6;
                var32.field571 = field2282[field2279];
                var32.field539 = field2282[field2279 + 1];
                var32.field572 = field2282[field2279 + 2];
                var32.field611 = field2282[field2279 + 3];
                var32.field517 = field2282[field2279 + 4];
                var32.field647 = field2282[field2279 + 5];
                class5.method27(var32, -208246073);
                if (var32.field607 == -1) {
                    class51.method338(var32.field580, 107);
                    class148.method1052(var32.field580, -126);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field2282[--field2279];
                if (var32.field553 != var34) {
                    var32.field553 = var34;
                    var32.field486 = 0;
                    var32.field487 = 1;
                    var32.field509 = 0;
                    class5.method27(var32, -208246073);
                }
                if (var32.field607 == -1) {
                    class47.method321(var32.field580, -119);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field519 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field2289[--field2288];
                if (!var35.equals(var32.field569)) {
                    var32.field569 = var35;
                    class5.method27(var32, -208246073);
                }
                if (var32.field607 == -1) {
                    class488.method2950((byte) -68, var32.field580);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field635 = field2282[--field2279];
                class5.method27(var32, -208246073);
                if (var32.field607 == -1) {
                    class293.method1959(0, var32.field580);
                }
                return;
            }
            if (arg0 == 1114) {
                field2279 -= 3;
                var32.field613 = field2282[field2279];
                var32.field615 = field2282[field2279 + 1];
                var32.field551 = field2282[field2279 + 2];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1115) {
                var32.field565 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1116) {
                var32.field544 = field2282[--field2279];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1117) {
                var32.field496 = field2282[--field2279];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1118) {
                var32.field592 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1119) {
                var32.field555 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1120) {
                field2279 -= 2;
                var32.field595 = field2282[field2279];
                var32.field604 = field2282[field2279 + 1];
                class5.method27(var32, -208246073);
                if (var32.field503 == 0) {
                    class93.method789(false, (byte) -94, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field2279 -= 2;
                var32.field510 = (short) field2282[field2279];
                var32.field641 = (short) field2282[field2279 + 1];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1122) {
                var32.field498 = field2282[--field2279] == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1123) {
                var32.field647 = field2282[--field2279];
                class5.method27(var32, -208246073);
                if (var32.field607 == -1) {
                    class51.method338(var32.field580, 102);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field2282[--field2279];
                var32.field637 = var36 == 1;
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1125) {
                field2279 -= 2;
                var32.field573 = field2282[field2279];
                var32.field631 = field2282[field2279 + 1];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1126) {
                var32.field545 = field2282[--field2279];
                class5.method27(var32, -208246073);
                return;
            }
            if (arg0 == 1127) {
                field2279 -= 2;
                int var37 = field2282[field2279];
                int var38 = field2282[field2279 + 1];
                class450 var39 = class264.field4225.method2789((byte) 36, var37);
                if (var39.field6692 != var38) {
                    var32.method259(var37, -112, var38);
                    return;
                }
                var32.method256(var37, 66);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field2282[--field2279];
                String var41 = field2289[--field2288];
                class450 var42 = class264.field4225.method2789((byte) 36, var40);
                if (!var42.field6691.equals(var41)) {
                    var32.method255((byte) -124, var41, var40);
                    return;
                }
                var32.method256(var40, 108);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class38 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class159.method1143(-357225936, field2282[--field2279]);
            } else {
                var43 = arg1 ? field2276 : field2284;
            }
            class5.method27(var43, -208246073);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2279 -= 2;
                int var44 = field2282[field2279];
                int var45 = field2282[field2279 + 1];
                if (var43.field607 == -1) {
                    class74.method689((byte) -124, var43.field580);
                    class51.method338(var43.field580, -127);
                    class148.method1052(var43.field580, -115);
                }
                if (var44 == -1) {
                    var43.field640 = 1;
                    var43.field491 = -1;
                    var43.field499 = -1;
                    return;
                }
                var43.field499 = var44;
                var43.field626 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field651 = true;
                } else {
                    var43.field651 = false;
                }
                class221 var46 = class300.field4608.method2088(var44, 124);
                var43.field572 = var46.field3358;
                var43.field611 = var46.field3381;
                var43.field517 = var46.field3305;
                var43.field571 = var46.field3384;
                var43.field539 = var46.field3336;
                var43.field647 = var46.field3359;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field558 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field558 = 1;
                } else {
                    var43.field558 = 2;
                }
                if (var43.field575 > 0) {
                    var43.field647 = var43.field647 * 32 / var43.field575;
                    return;
                }
                if (var43.field532 > 0) {
                    var43.field647 = var43.field647 * 32 / var43.field532;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field640 = 2;
                var43.field491 = field2282[--field2279];
                if (var43.field607 == -1) {
                    class109.method853(var43.field580, (byte) 122);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field640 = 3;
                var43.field491 = -1;
                if (var43.field607 == -1) {
                    class109.method853(var43.field580, (byte) 32);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field640 = 6;
                var43.field491 = field2282[--field2279];
                if (var43.field607 == -1) {
                    class109.method853(var43.field580, (byte) -99);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field640 = 5;
                var43.field491 = field2282[--field2279];
                if (var43.field607 == -1) {
                    class109.method853(var43.field580, (byte) -112);
                }
                return;
            }
            if (arg0 == 1206) {
                field2279 -= 4;
                var43.field586 = field2282[field2279];
                var43.field526 = field2282[field2279 + 1];
                var43.field577 = field2282[field2279 + 2];
                var43.field650 = field2282[field2279 + 3];
                class5.method27(var43, -208246073);
                return;
            }
            if (arg0 == 1207) {
                field2279 -= 2;
                var43.field583 = field2282[field2279];
                var43.field562 = field2282[field2279 + 1];
                class5.method27(var43, -208246073);
                return;
            }
            if (arg0 == 1210) {
                field2279 -= 4;
                var43.field491 = field2282[field2279];
                var43.field632 = field2282[field2279 + 1];
                if (field2282[field2279 + 2] == 1) {
                    var43.field640 = 9;
                } else {
                    var43.field640 = 8;
                }
                if (field2282[field2279 + 3] == 1) {
                    var43.field651 = true;
                } else {
                    var43.field651 = false;
                }
                if (var43.field607 == -1) {
                    class109.method853(var43.field580, (byte) 61);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field640 = 5;
                var43.field491 = class517.field7513;
                var43.field632 = 0;
                if (var43.field607 == -1) {
                    class109.method853(var43.field580, (byte) 108);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class38 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class159.method1143(-357225936, field2282[--field2279]);
                } else {
                    var58 = arg1 ? field2276 : field2284;
                }
                String var59 = field2289[--field2288];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field2282[--field2279];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field2282[--field2279];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field2289[--field2288];
                    } else {
                        var62[var63] = Integer.valueOf(field2282[--field2279]);
                    }
                }
                int var64 = field2282[--field2279];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field605 = var62;
                } else if (arg0 == 1401) {
                    var58.field522 = var62;
                } else if (arg0 == 1402) {
                    var58.field597 = var62;
                } else if (arg0 == 1403) {
                    var58.field588 = var62;
                } else if (arg0 == 1404) {
                    var58.field520 = var62;
                } else if (arg0 == 1405) {
                    var58.field501 = var62;
                } else if (arg0 == 1406) {
                    var58.field549 = var62;
                } else if (arg0 == 1407) {
                    var58.field511 = var62;
                    var58.field535 = var60;
                } else if (arg0 == 1408) {
                    var58.field530 = var62;
                } else if (arg0 == 1409) {
                    var58.field533 = var62;
                } else if (arg0 == 1410) {
                    var58.field559 = var62;
                } else if (arg0 == 1411) {
                    var58.field614 = var62;
                } else if (arg0 == 1412) {
                    var58.field537 = var62;
                } else if (arg0 == 1414) {
                    var58.field512 = var62;
                    var58.field643 = var60;
                } else if (arg0 == 1415) {
                    var58.field508 = var62;
                    var58.field524 = var60;
                } else if (arg0 == 1416) {
                    var58.field495 = var62;
                } else if (arg0 == 1417) {
                    var58.field546 = var62;
                } else if (arg0 == 1418) {
                    var58.field489 = var62;
                } else if (arg0 == 1419) {
                    var58.field563 = var62;
                } else if (arg0 == 1420) {
                    var58.field649 = var62;
                } else if (arg0 == 1421) {
                    var58.field554 = var62;
                } else if (arg0 == 1422) {
                    var58.field582 = var62;
                } else if (arg0 == 1423) {
                    var58.field636 = var62;
                } else if (arg0 == 1424) {
                    var58.field550 = var62;
                } else if (arg0 == 1425) {
                    var58.field601 = var62;
                } else if (arg0 == 1426) {
                    var58.field552 = var62;
                } else if (arg0 == 1427) {
                    var58.field584 = var62;
                } else if (arg0 == 1428) {
                    var58.field619 = var62;
                    var58.field628 = var60;
                } else if (arg0 == 1429) {
                    var58.field492 = var62;
                    var58.field608 = var60;
                } else if (arg0 == 1430) {
                    var58.field490 = var62;
                }
                var58.field557 = true;
                return;
            }
            if (arg0 < 1600) {
                class38 var65 = arg1 ? field2276 : field2284;
                if (arg0 == 1500) {
                    field2282[field2279++] = var65.field627;
                    return;
                }
                if (arg0 == 1501) {
                    field2282[field2279++] = var65.field540;
                    return;
                }
                if (arg0 == 1502) {
                    field2282[field2279++] = var65.field629;
                    return;
                }
                if (arg0 == 1503) {
                    field2282[field2279++] = var65.field591;
                    return;
                }
                if (arg0 == 1504) {
                    field2282[field2279++] = var65.field542 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field2282[field2279++] = var65.field600;
                    return;
                }
                if (arg0 == 1506) {
                    class38 var66 = class184.method1284(var65, (byte) -51);
                    field2282[field2279++] = var66 == null ? -1 : var66.field580;
                    return;
                }
            } else if (arg0 < 1700) {
                class38 var67 = arg1 ? field2276 : field2284;
                if (arg0 == 1600) {
                    field2282[field2279++] = var67.field488;
                    return;
                }
                if (arg0 == 1601) {
                    field2282[field2279++] = var67.field504;
                    return;
                }
                if (arg0 == 1602) {
                    field2289[field2288++] = var67.field569;
                    return;
                }
                if (arg0 == 1603) {
                    field2282[field2279++] = var67.field595;
                    return;
                }
                if (arg0 == 1604) {
                    field2282[field2279++] = var67.field604;
                    return;
                }
                if (arg0 == 1605) {
                    field2282[field2279++] = var67.field647;
                    return;
                }
                if (arg0 == 1606) {
                    field2282[field2279++] = var67.field572;
                    return;
                }
                if (arg0 == 1607) {
                    field2282[field2279++] = var67.field517;
                    return;
                }
                if (arg0 == 1608) {
                    field2282[field2279++] = var67.field611;
                    return;
                }
                if (arg0 == 1609) {
                    field2282[field2279++] = var67.field566;
                    return;
                }
                if (arg0 == 1610) {
                    field2282[field2279++] = var67.field571;
                    return;
                }
                if (arg0 == 1611) {
                    field2282[field2279++] = var67.field539;
                    return;
                }
                if (arg0 == 1612) {
                    field2282[field2279++] = var67.field634;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field2282[--field2279];
                    class450 var69 = class264.field4225.method2789((byte) 36, var68);
                    if (var69.method2764(true)) {
                        field2289[field2288++] = var67.method249(var69.field6691, (byte) -24, var68);
                        return;
                    }
                    field2282[field2279++] = var67.method262((byte) -106, var69.field6692, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class38 var70 = arg1 ? field2276 : field2284;
                if (arg0 == 1700) {
                    field2282[field2279++] = var70.field499;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field499 != -1) {
                        field2282[field2279++] = var70.field626;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field2282[field2279++] = var70.field607;
                    return;
                }
            } else if (arg0 < 1900) {
                class38 var71 = arg1 ? field2276 : field2284;
                if (arg0 == 1800) {
                    field2282[field2279++] = client.method3078(var71).method797(-91);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field2282[--field2279];
                    int var334 = var72 - 1;
                    if (var71.field581 != null && var334 < var71.field581.length && var71.field581[var334] != null) {
                        field2289[field2288++] = var71.field581[var334];
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field543 == null) {
                        field2289[field2288++] = "";
                        return;
                    }
                    field2289[field2288++] = var71.field543;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class38 var332;
                if (arg0 >= 2000) {
                    var332 = class159.method1143(-357225936, field2282[--field2279]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field2276 : field2284;
                }
                if (field2297 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field584 == null) {
                        return;
                    }
                    class510 var333 = new class510();
                    var333.field7423 = var332;
                    var333.field7413 = var332.field584;
                    var333.field7419 = field2297 + 1;
                    class516.field7506.method292((byte) 121, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class38 var73 = class159.method1143(-357225936, field2282[--field2279]);
                if (arg0 == 2500) {
                    field2282[field2279++] = var73.field627;
                    return;
                }
                if (arg0 == 2501) {
                    field2282[field2279++] = var73.field540;
                    return;
                }
                if (arg0 == 2502) {
                    field2282[field2279++] = var73.field629;
                    return;
                }
                if (arg0 == 2503) {
                    field2282[field2279++] = var73.field591;
                    return;
                }
                if (arg0 == 2504) {
                    field2282[field2279++] = var73.field542 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field2282[field2279++] = var73.field600;
                    return;
                }
                if (arg0 == 1506) {
                    class38 var74 = class184.method1284(var73, (byte) -51);
                    field2282[field2279++] = var74 == null ? -1 : var74.field580;
                    return;
                }
            } else if (arg0 < 2700) {
                class38 var75 = class159.method1143(-357225936, field2282[--field2279]);
                if (arg0 == 2600) {
                    field2282[field2279++] = var75.field488;
                    return;
                }
                if (arg0 == 2601) {
                    field2282[field2279++] = var75.field504;
                    return;
                }
                if (arg0 == 2602) {
                    field2289[field2288++] = var75.field569;
                    return;
                }
                if (arg0 == 2603) {
                    field2282[field2279++] = var75.field595;
                    return;
                }
                if (arg0 == 2604) {
                    field2282[field2279++] = var75.field604;
                    return;
                }
                if (arg0 == 2605) {
                    field2282[field2279++] = var75.field647;
                    return;
                }
                if (arg0 == 2606) {
                    field2282[field2279++] = var75.field572;
                    return;
                }
                if (arg0 == 2607) {
                    field2282[field2279++] = var75.field517;
                    return;
                }
                if (arg0 == 2608) {
                    field2282[field2279++] = var75.field611;
                    return;
                }
                if (arg0 == 2609) {
                    field2282[field2279++] = var75.field566;
                    return;
                }
                if (arg0 == 2610) {
                    field2282[field2279++] = var75.field571;
                    return;
                }
                if (arg0 == 2611) {
                    field2282[field2279++] = var75.field539;
                    return;
                }
                if (arg0 == 2612) {
                    field2282[field2279++] = var75.field634;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class38 var76 = class159.method1143(-357225936, field2282[--field2279]);
                    field2282[field2279++] = var76.field499;
                    return;
                }
                if (arg0 == 2701) {
                    class38 var77 = class159.method1143(-357225936, field2282[--field2279]);
                    if (var77.field499 != -1) {
                        field2282[field2279++] = var77.field626;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field2282[--field2279];
                    class295 var79 = (class295) class215.field3248.method358((byte) 96, (long) var78);
                    if (var79 != null) {
                        field2282[field2279++] = 1;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class38 var80 = class159.method1143(-357225936, field2282[--field2279]);
                    if (var80.field610 == null) {
                        field2282[field2279++] = 0;
                        return;
                    }
                    int var81 = var80.field610.length;
                    for (int var82 = 0; var82 < var80.field610.length; var82++) {
                        if (var80.field610[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field2282[field2279++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2279 -= 2;
                    int var83 = field2282[field2279];
                    int var84 = field2282[field2279 + 1];
                    class295 var85 = (class295) class215.field3248.method358((byte) 69, (long) var83);
                    if (var85 != null && var85.field4546 == var84) {
                        field2282[field2279++] = 1;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class38 var86 = class159.method1143(-357225936, field2282[--field2279]);
                if (arg0 == 2800) {
                    field2282[field2279++] = client.method3078(var86).method797(-70);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field2282[--field2279];
                    int var335 = var87 - 1;
                    if (var86.field581 != null && var335 < var86.field581.length && var86.field581[var335] != null) {
                        field2289[field2288++] = var86.field581[var335];
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field543 == null) {
                        field2289[field2288++] = "";
                        return;
                    }
                    field2289[field2288++] = var86.field543;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field2289[--field2288];
                    class492.method2961(0, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field2279 -= 2;
                    class34.method205(18105, field2282[field2279], field2282[field2279 + 1], class116.field1781);
                    return;
                }
                if (arg0 == 3103) {
                    class136.method1000(true, -1);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field2289[--field2288];
                    int var90 = 0;
                    if (class235.method1601(var89, 20979)) {
                        var90 = class453.method2777(var89, 10);
                    }
                    field2287++;
                    class110.method857(4095, class231.field3475);
                    class312.field4752.method1348((byte) -65, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field2289[--field2288];
                    field2281++;
                    class110.method857(4095, class442.field6590);
                    class312.field4752.method1381(var91.length() + 1, (byte) 112);
                    class312.field4752.method1343(var91, (byte) -14);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field2289[--field2288];
                    field2286++;
                    class110.method857(4095, class276.field4329);
                    class312.field4752.method1381(var92.length() + 1, (byte) 104);
                    class312.field4752.method1343(var92, (byte) -14);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field2282[--field2279];
                    String var94 = field2289[--field2288];
                    class539.method3172(var93, (byte) 126, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field2279 -= 3;
                    int var95 = field2282[field2279];
                    int var96 = field2282[field2279 + 1];
                    int var97 = field2282[field2279 + 2];
                    class38 var98 = class159.method1143(-357225936, var97);
                    class107.method846(var95, var96, -11812, var98);
                    return;
                }
                if (arg0 == 3109) {
                    field2279 -= 2;
                    int var99 = field2282[field2279];
                    int var100 = field2282[field2279 + 1];
                    class38 var101 = arg1 ? field2276 : field2284;
                    class107.method846(var99, var100, -11812, var101);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field2282[--field2279];
                    field2271++;
                    class110.method857(4095, class136.field2071);
                    class312.field4752.method1364(var102, true);
                    return;
                }
                if (arg0 == 3111) {
                    field2279 -= 2;
                    int var103 = field2282[field2279];
                    int var104 = field2282[field2279 + 1];
                    class295 var105 = (class295) class215.field3248.method358((byte) -127, (long) var103);
                    if (var105 != null) {
                        class336.method2188(var105.field4546 != var104, 1, true, var105);
                    }
                    class71.method617(true, var104, 3, var103, false);
                    return;
                }
                if (arg0 == 3112) {
                    field2279--;
                    int var106 = field2282[field2279];
                    class295 var107 = (class295) class215.field3248.method358((byte) 43, (long) var106);
                    if (var107 != null && var107.field4542 == 3) {
                        class336.method2188(true, 1, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class319.method2113(field2289[--field2288], (byte) 121);
                    return;
                }
                if (arg0 == 3114) {
                    field2279 -= 2;
                    int var108 = field2282[field2279];
                    int var109 = field2282[field2279 + 1];
                    String var110 = field2289[--field2288];
                    class58.method380("", var110, var108, var109, "", 81);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2279 -= 3;
                    class361.method2292(field2282[field2279 + 1], field2282[field2279 + 2], field2282[field2279], (byte) 112, 255);
                    return;
                }
                if (arg0 == 3201) {
                    class283.method1902(50, 0, field2282[--field2279], 255);
                    return;
                }
                if (arg0 == 3202) {
                    field2279 -= 2;
                    class314.method2080(field2282[field2279], -28619, 255, field2282[field2279 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field2279 -= 4;
                    class361.method2292(field2282[field2279 + 1], field2282[field2279 + 2], field2282[field2279], (byte) 126, field2282[field2279 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field2279 -= 3;
                    class283.method1902(field2282[field2279 + 2], 0, field2282[field2279], field2282[field2279 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field2279 -= 3;
                    class314.method2080(field2282[field2279], -28619, field2282[field2279 + 2], field2282[field2279 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field2279 -= 4;
                    class415.method2602(field2282[field2279], field2282[field2279 + 3], field2282[field2279 + 2], -51, field2282[field2279 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field2282[field2279++] = class446.field6625;
                    return;
                }
                if (arg0 == 3301) {
                    field2279 -= 2;
                    int var111 = field2282[field2279];
                    int var112 = field2282[field2279 + 1];
                    field2282[field2279++] = class125.method922(var112, (byte) 54, false, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field2279 -= 2;
                    int var113 = field2282[field2279];
                    int var114 = field2282[field2279 + 1];
                    field2282[field2279++] = class350.method2247(var114, var113, 0, false);
                    return;
                }
                if (arg0 == 3303) {
                    field2279 -= 2;
                    int var115 = field2282[field2279];
                    int var116 = field2282[field2279 + 1];
                    field2282[field2279++] = class299.method1994(var115, false, var116, 0);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field2282[--field2279];
                    field2282[field2279++] = class195.field3052.method2024((byte) 65, var117).field4431;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field2282[--field2279];
                    field2282[field2279++] = class156.field2395[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field2282[--field2279];
                    field2282[field2279++] = class138.field2091[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field2282[--field2279];
                    field2282[field2279++] = class327.field4955[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class116.field1781.field1274;
                    int var122 = (class116.field1781.field1275 >> 7) + class422.field6201;
                    int var123 = (class116.field1781.field1279 >> 7) + class23.field273;
                    field2282[field2279++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field2282[--field2279];
                    field2282[field2279++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field2282[--field2279];
                    field2282[field2279++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field2282[--field2279];
                    field2282[field2279++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field2282[field2279++] = class324.field4918 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2279 -= 2;
                    int var127 = field2282[field2279];
                    int var128 = field2282[field2279 + 1];
                    field2282[field2279++] = class125.method922(var128, (byte) 54, true, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field2279 -= 2;
                    int var129 = field2282[field2279];
                    int var130 = field2282[field2279 + 1];
                    field2282[field2279++] = class350.method2247(var130, var129, 0, true);
                    return;
                }
                if (arg0 == 3315) {
                    field2279 -= 2;
                    int var131 = field2282[field2279];
                    int var132 = field2282[field2279 + 1];
                    field2282[field2279++] = class299.method1994(var131, true, var132, 0);
                    return;
                }
                if (arg0 == 3316) {
                    if (class224.field3421 >= 2) {
                        field2282[field2279++] = class224.field3421;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field2282[field2279++] = class61.field978;
                    return;
                }
                if (arg0 == 3318) {
                    field2282[field2279++] = class317.field4836.field5143;
                    return;
                }
                if (arg0 == 3321) {
                    field2282[field2279++] = class509.field7411;
                    return;
                }
                if (arg0 == 3322) {
                    field2282[field2279++] = class327.field4952;
                    return;
                }
                if (arg0 == 3323) {
                    if (class159.field2416 >= 5 && class159.field2416 <= 9) {
                        field2282[field2279++] = 1;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class159.field2416 >= 5 && class159.field2416 <= 9) {
                        field2282[field2279++] = class159.field2416;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field2282[field2279++] = class445.field6619 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field2282[field2279++] = class116.field1781.field7469;
                    return;
                }
                if (arg0 == 3327) {
                    field2282[field2279++] = class116.field1781.field7460.field4450 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field2282[field2279++] = class108.field1638 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field2282[--field2279];
                    field2282[field2279++] = class422.method2631(false, var133, 0);
                    return;
                }
                if (arg0 == 3331) {
                    field2279 -= 2;
                    int var134 = field2282[field2279];
                    int var135 = field2282[field2279 + 1];
                    field2282[field2279++] = class510.method3034(var135, var134, false, false, 0);
                    return;
                }
                if (arg0 == 3332) {
                    field2279 -= 2;
                    int var136 = field2282[field2279];
                    int var137 = field2282[field2279 + 1];
                    field2282[field2279++] = class510.method3034(var137, var136, true, false, 0);
                    return;
                }
                if (arg0 == 3333) {
                    field2282[field2279++] = class125.field1877;
                    return;
                }
                if (arg0 == 3335) {
                    field2282[field2279++] = class345.field5141;
                    return;
                }
                if (arg0 == 3336) {
                    field2279 -= 4;
                    int var138 = field2282[field2279];
                    int var139 = field2282[field2279 + 1];
                    int var140 = field2282[field2279 + 2];
                    int var141 = field2282[field2279 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field2282[field2279++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field2282[field2279++] = class516.field7505;
                    return;
                }
                if (arg0 == 3338) {
                    field2282[field2279++] = class293.method1961(0);
                    return;
                }
                if (arg0 == 3339) {
                    field2282[field2279++] = class38.field633 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field2282[field2279++] = class356.field5272 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field2282[field2279++] = class304.field4662 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2279 -= 2;
                    int var145 = field2282[field2279];
                    int var146 = field2282[field2279 + 1];
                    class163 var147 = class250.field4080.method160(22732, var145);
                    field2289[field2288++] = var147.method1169(-20642, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field2279 -= 4;
                    int var148 = field2282[field2279];
                    int var149 = field2282[field2279 + 1];
                    int var150 = field2282[field2279 + 2];
                    int var151 = field2282[field2279 + 3];
                    class163 var152 = class250.field4080.method160(22732, var150);
                    if (var152.field2461 == var148 && var152.field2459 == var149) {
                        if (var149 == 115) {
                            field2289[field2288++] = var152.method1169(-20642, var151);
                            return;
                        }
                        field2282[field2279++] = var152.method1165(var151, (byte) 52);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field2279 -= 3;
                    int var153 = field2282[field2279];
                    int var154 = field2282[field2279 + 1];
                    int var155 = field2282[field2279 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class163 var156 = class250.field4080.method160(22732, var154);
                    if (var156.field2459 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field2282[field2279++] = var156.method1167(-21616, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field2282[--field2279];
                    String var158 = field2289[--field2288];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class163 var159 = class250.field4080.method160(22732, var157);
                    if (var159.field2459 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field2282[field2279++] = var159.method1164(var158, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field2282[--field2279];
                    class163 var161 = class250.field4080.method160(22732, var160);
                    field2282[field2279++] = var161.field2466.method364(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class6.field76 == 0) {
                        field2282[field2279++] = -2;
                        return;
                    }
                    if (class6.field76 == 1) {
                        field2282[field2279++] = -1;
                        return;
                    }
                    field2282[field2279++] = class6.field80;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field2282[--field2279];
                    if (class6.field76 == 2 && var162 < class6.field80) {
                        field2289[field2288++] = class265.field4229[var162];
                        if (class289.field4483[var162] != null) {
                            field2289[field2288++] = class289.field4483[var162];
                            return;
                        }
                        field2289[field2288++] = "";
                        return;
                    }
                    field2289[field2288++] = "";
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field2282[--field2279];
                    if (class6.field76 == 2 && var163 < class6.field80) {
                        field2282[field2279++] = class23.field269[var163];
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field2282[--field2279];
                    if (class6.field76 == 2 && var164 < class6.field80) {
                        field2282[field2279++] = class477.field7014[var164];
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field2289[--field2288];
                    int var166 = field2282[--field2279];
                    class472.method2861(var166, (byte) -83, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field2289[--field2288];
                    class383.method2440(var167, -91);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field2289[--field2288];
                    class339.method2193(var168, (byte) -65);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field2289[--field2288];
                    class155.method1132(false, var169, (byte) 82);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field2289[--field2288];
                    class92.method787(var170, (byte) 33);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field2289[--field2288];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field2282[field2279++] = class183.method1279(-113, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field2282[--field2279];
                    if (class6.field76 == 2 && var172 < class6.field80) {
                        field2289[field2288++] = class353.field5237[var172];
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class216.field3274 != null) {
                        field2289[field2288++] = class316.method2100(class216.field3274, true);
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class216.field3274 != null) {
                        field2282[field2279++] = class94.field1505;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field2282[--field2279];
                    if (class216.field3274 != null && var173 < class94.field1505) {
                        field2289[field2288++] = class433.field6436[var173].field4102;
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field2282[--field2279];
                    if (class216.field3274 != null && var174 < class94.field1505) {
                        field2282[field2279++] = class433.field6436[var174].field4098;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field2282[--field2279];
                    if (class216.field3274 != null && var175 < class94.field1505) {
                        field2282[field2279++] = class433.field6436[var175].field4101;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field2282[field2279++] = class415.field6099;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field2289[--field2288];
                    class35.method229(var176, -118);
                    return;
                }
                if (arg0 == 3618) {
                    field2282[field2279++] = class368.field5422;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field2289[--field2288];
                    class531.method3140(var177, 8192);
                    return;
                }
                if (arg0 == 3620) {
                    class250.method1790((byte) -124);
                    return;
                }
                if (arg0 == 3621) {
                    if (class6.field76 == 0) {
                        field2282[field2279++] = -1;
                        return;
                    }
                    field2282[field2279++] = class324.field4920;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field2282[--field2279];
                    if (class6.field76 != 0 && var178 < class324.field4920) {
                        field2289[field2288++] = class8.field95[var178];
                        if (class484.field7094[var178] != null) {
                            field2289[field2288++] = class484.field7094[var178];
                            return;
                        }
                        field2289[field2288++] = "";
                        return;
                    }
                    field2289[field2288++] = "";
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field2289[--field2288];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field2282[field2279++] = class282.method1900(var179, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field2282[--field2279];
                    if (class433.field6436 != null && var180 < class94.field1505 && class433.field6436[var180].field4103.equalsIgnoreCase(class116.field1781.field7437)) {
                        field2282[field2279++] = 1;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class377.field5557 != null) {
                        field2289[field2288++] = class377.field5557;
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field2282[--field2279];
                    if (class216.field3274 != null && var181 < class94.field1505) {
                        field2289[field2288++] = class433.field6436[var181].field4100;
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field2282[--field2279];
                    if (class6.field76 == 2 && var182 >= 0 && var182 < class6.field80) {
                        field2282[field2279++] = class405.field5988[var182] ? 1 : 0;
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field2289[--field2288];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field2282[field2279++] = class540.method3174(var183, -128);
                    return;
                }
                if (arg0 == 3629) {
                    field2282[field2279++] = class21.field241;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field2289[--field2288];
                    class155.method1132(true, var184, (byte) -29);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field2282[--field2279];
                    field2282[field2279++] = class5.field68[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field2282[--field2279];
                    if (class216.field3274 != null && var186 < class94.field1505) {
                        field2289[field2288++] = class433.field6436[var186].field4103;
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field2282[--field2279];
                    if (class6.field76 != 0 && var187 < class324.field4920) {
                        field2289[field2288++] = class271.field4283[var187];
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field2282[--field2279];
                    field2282[field2279++] = class412.field6084[var188].method688((byte) 32);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field2282[--field2279];
                    field2282[field2279++] = class412.field6084[var189].field1252;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field2282[--field2279];
                    field2282[field2279++] = class412.field6084[var190].field1263;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field2282[--field2279];
                    field2282[field2279++] = class412.field6084[var191].field1259;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field2282[--field2279];
                    field2282[field2279++] = class412.field6084[var192].field1262;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field2282[--field2279];
                    field2282[field2279++] = class412.field6084[var193].field1264;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field2282[--field2279];
                    int var195 = class412.field6084[var194].method691((byte) -105);
                    field2282[field2279++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field2282[--field2279];
                    int var197 = class412.field6084[var196].method691((byte) -121);
                    field2282[field2279++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field2282[--field2279];
                    int var199 = class412.field6084[var198].method691((byte) -125);
                    field2282[field2279++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field2282[--field2279];
                    int var201 = class412.field6084[var200].method691((byte) -110);
                    field2282[field2279++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2279 -= 2;
                    int var202 = field2282[field2279];
                    int var203 = field2282[field2279 + 1];
                    field2282[field2279++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field2279 -= 2;
                    int var204 = field2282[field2279];
                    int var205 = field2282[field2279 + 1];
                    field2282[field2279++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field2279 -= 2;
                    int var206 = field2282[field2279];
                    int var207 = field2282[field2279 + 1];
                    field2282[field2279++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field2279 -= 2;
                    int var208 = field2282[field2279];
                    int var209 = field2282[field2279 + 1];
                    field2282[field2279++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field2282[--field2279];
                    field2282[field2279++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field2282[--field2279];
                    field2282[field2279++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2279 -= 5;
                    int var212 = field2282[field2279];
                    int var213 = field2282[field2279 + 1];
                    int var214 = field2282[field2279 + 2];
                    int var215 = field2282[field2279 + 3];
                    int var216 = field2282[field2279 + 4];
                    field2282[field2279++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field2279 -= 2;
                    long var217 = (long) field2282[field2279];
                    long var219 = (long) field2282[field2279 + 1];
                    field2282[field2279++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field2279 -= 2;
                    int var221 = field2282[field2279];
                    int var222 = field2282[field2279 + 1];
                    field2282[field2279++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field2279 -= 2;
                    int var223 = field2282[field2279];
                    int var224 = field2282[field2279 + 1];
                    field2282[field2279++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2279 -= 2;
                    int var225 = field2282[field2279];
                    int var226 = field2282[field2279 + 1];
                    field2282[field2279++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2279 -= 2;
                    int var227 = field2282[field2279];
                    int var228 = field2282[field2279 + 1];
                    field2282[field2279++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field2279 -= 2;
                    int var229 = field2282[field2279];
                    int var230 = field2282[field2279 + 1];
                    if (var229 == 0) {
                        field2282[field2279++] = 0;
                        return;
                    }
                    field2282[field2279++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field2279 -= 2;
                    int var231 = field2282[field2279];
                    int var232 = field2282[field2279 + 1];
                    if (var231 == 0) {
                        field2282[field2279++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field2282[field2279++] = Integer.MAX_VALUE;
                        return;
                    }
                    field2282[field2279++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field2279 -= 2;
                    int var233 = field2282[field2279];
                    int var234 = field2282[field2279 + 1];
                    field2282[field2279++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field2279 -= 2;
                    int var235 = field2282[field2279];
                    int var236 = field2282[field2279 + 1];
                    field2282[field2279++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field2279 -= 2;
                    int var237 = field2282[field2279];
                    int var238 = field2282[field2279 + 1];
                    field2282[field2279++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field2279 -= 2;
                    int var239 = field2282[field2279];
                    int var240 = field2282[field2279 + 1];
                    field2282[field2279++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field2279 -= 3;
                    long var241 = (long) field2282[field2279];
                    long var243 = (long) field2282[field2279 + 1];
                    long var245 = (long) field2282[field2279 + 2];
                    field2282[field2279++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field2289[--field2288];
                    int var248 = field2282[--field2279];
                    field2289[field2288++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field2288 -= 2;
                    String var249 = field2289[field2288];
                    String var250 = field2289[field2288 + 1];
                    field2289[field2288++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field2289[--field2288];
                    int var252 = field2282[--field2279];
                    field2289[field2288++] = var251 + class31.method190(var252, true, (byte) 92);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field2289[--field2288];
                    field2289[field2288++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2289[field2288++] = method1092(field2282[--field2279]);
                    return;
                }
                if (arg0 == 4105) {
                    field2288 -= 2;
                    String var254 = field2289[field2288];
                    String var255 = field2289[field2288 + 1];
                    if (class116.field1781.field7460 != null && class116.field1781.field7460.field4450) {
                        field2289[field2288++] = var255;
                        return;
                    }
                    field2289[field2288++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field2282[--field2279];
                    field2289[field2288++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field2288 -= 2;
                    field2282[field2279++] = class352.method2255(0, field2289[field2288 + 1], field2289[field2288], class345.field5141);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field2289[--field2288];
                    field2279 -= 2;
                    int var258 = field2282[field2279];
                    int var259 = field2282[field2279 + 1];
                    class29 var260 = class367.method2334(-77, 0, var259, class312.field4754);
                    field2282[field2279++] = var260.method172(var258, var257, class470.field6906, (byte) 63);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field2289[--field2288];
                    field2279 -= 2;
                    int var262 = field2282[field2279];
                    int var263 = field2282[field2279 + 1];
                    class29 var264 = class367.method2334(-114, 0, var263, class312.field4754);
                    field2282[field2279++] = var264.method173(var262, var261, -11352, class470.field6906);
                    return;
                }
                if (arg0 == 4110) {
                    field2288 -= 2;
                    String var265 = field2289[field2288];
                    String var266 = field2289[field2288 + 1];
                    if (field2282[--field2279] == 1) {
                        field2289[field2288++] = var265;
                        return;
                    }
                    field2289[field2288++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field2289[--field2288];
                    field2289[field2288++] = class12.method70(60, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field2289[--field2288];
                    int var269 = field2282[--field2279];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2289[field2288++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field2282[--field2279];
                    field2282[field2279++] = class202.method1422(124, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field2282[--field2279];
                    field2282[field2279++] = class435.method2701((char) var271, -128) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field2282[--field2279];
                    field2282[field2279++] = class483.method2915(50, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field2282[--field2279];
                    field2282[field2279++] = class9.method42((char) var273, -58) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field2289[--field2288];
                    if (var274 != null) {
                        field2282[field2279++] = var274.length();
                        return;
                    }
                    field2282[field2279++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field2289[--field2288];
                    field2279 -= 2;
                    int var276 = field2282[field2279];
                    int var277 = field2282[field2279 + 1];
                    field2289[field2288++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field2289[--field2288];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field2289[field2288++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field2289[--field2288];
                    field2279 -= 2;
                    int var284 = field2282[field2279];
                    int var285 = field2282[field2279 + 1];
                    field2282[field2279++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field2288 -= 2;
                    String var286 = field2289[field2288];
                    String var287 = field2289[field2288 + 1];
                    int var288 = field2282[--field2279];
                    field2282[field2279++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field2282[--field2279];
                    field2282[field2279++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field2282[--field2279];
                    field2282[field2279++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field2282[--field2279] != 0;
                    int var292 = field2282[--field2279];
                    field2289[field2288++] = class190.method1310(0, var291, (long) var292, class345.field5141, 10);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field2289[--field2288];
                    int var294 = field2282[--field2279];
                    class29 var295 = class367.method2334(-124, 0, var294, class312.field4754);
                    field2282[field2279++] = var295.method170(0, class470.field6906, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field2282[--field2279];
                    field2289[field2288++] = class300.field4608.method2088(var296, 112).field3377;
                    return;
                }
                if (arg0 == 4201) {
                    field2279 -= 2;
                    int var297 = field2282[field2279];
                    int var298 = field2282[field2279 + 1];
                    class221 var299 = class300.field4608.method2088(var297, 116);
                    if (var298 >= 1 && var298 <= 5 && var299.field3307[var298 - 1] != null) {
                        field2289[field2288++] = var299.field3307[var298 - 1];
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2279 -= 2;
                    int var300 = field2282[field2279];
                    int var301 = field2282[field2279 + 1];
                    class221 var302 = class300.field4608.method2088(var300, 113);
                    if (var301 >= 1 && var301 <= 5 && var302.field3383[var301 - 1] != null) {
                        field2289[field2288++] = var302.field3383[var301 - 1];
                        return;
                    }
                    field2289[field2288++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field2282[--field2279];
                    field2282[field2279++] = class300.field4608.method2088(var303, 125).field3365;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field2282[--field2279];
                    field2282[field2279++] = class300.field4608.method2088(var304, 121).field3374 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field2282[--field2279];
                    class221 var306 = class300.field4608.method2088(var305, 119);
                    if (var306.field3386 == -1 && var306.field3322 >= 0) {
                        field2282[field2279++] = var306.field3322;
                        return;
                    }
                    field2282[field2279++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field2282[--field2279];
                    class221 var308 = class300.field4608.method2088(var307, 117);
                    if (var308.field3386 >= 0 && var308.field3322 >= 0) {
                        field2282[field2279++] = var308.field3322;
                        return;
                    }
                    field2282[field2279++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field2282[--field2279];
                    field2282[field2279++] = class300.field4608.method2088(var309, 106).field3335 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2279 -= 2;
                    int var310 = field2282[field2279];
                    int var311 = field2282[field2279 + 1];
                    class450 var312 = class264.field4225.method2789((byte) 36, var311);
                    if (var312.method2764(true)) {
                        field2289[field2288++] = class300.field4608.method2088(var310, 119).method1524(var312.field6691, (byte) -72, var311);
                        return;
                    }
                    field2282[field2279++] = class300.field4608.method2088(var310, 124).method1513(var311, var312.field6692, (byte) -99);
                    return;
                }
                if (arg0 == 4209) {
                    field2279 -= 2;
                    int var313 = field2282[field2279];
                    int var314 = field2282[field2279 + 1] - 1;
                    class221 var315 = class300.field4608.method2088(var313, 125);
                    if (var315.field3350 == var314) {
                        field2282[field2279++] = var315.field3312;
                        return;
                    }
                    if (var315.field3379 == var314) {
                        field2282[field2279++] = var315.field3360;
                        return;
                    }
                    field2282[field2279++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field2289[--field2288];
                    int var317 = field2282[--field2279];
                    class10.method47((byte) 108, var316, var317 == 1);
                    field2282[field2279++] = class132.field1947;
                    return;
                }
                if (arg0 == 4211) {
                    if (class6.field75 != null && class186.field2860 < class132.field1947) {
                        field2282[field2279++] = class6.field75[class186.field2860++] & 0xFFFF;
                        return;
                    }
                    field2282[field2279++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class186.field2860 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2279 -= 2;
                    int var318 = field2282[field2279];
                    int var319 = field2282[field2279 + 1];
                    class450 var320 = class264.field4225.method2789((byte) 36, var319);
                    if (var320.method2764(true)) {
                        field2289[field2288++] = class462.field6842.method1229(-21382, var318).method1218(var320.field6691, var319, (byte) 78);
                        return;
                    }
                    field2282[field2279++] = class462.field6842.method1229(-21382, var318).method1226(var320.field6692, (byte) 98, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2279 -= 2;
                    int var321 = field2282[field2279];
                    int var322 = field2282[field2279 + 1];
                    class450 var323 = class264.field4225.method2789((byte) 36, var322);
                    if (var323.method2764(true)) {
                        field2289[field2288++] = class247.field3693.method2281(var321, -9380).method2487(110, var322, var323.field6691);
                        return;
                    }
                    field2282[field2279++] = class247.field3693.method2281(var321, -9380).method2497(var323.field6692, (byte) -122, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2279 -= 2;
                    int var324 = field2282[field2279];
                    int var325 = field2282[field2279 + 1];
                    class450 var326 = class264.field4225.method2789((byte) 36, var325);
                    if (var326.method2764(true)) {
                        field2289[field2288++] = class420.field6176.method926(100, var324).method1182(var326.field6691, var325, (byte) 119);
                        return;
                    }
                    field2282[field2279++] = class420.field6176.method926(111, var324).method1186((byte) -110, var326.field6692, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field2282[--field2279];
                class477 var328 = class315.field4808.method154((byte) 21, var327);
                if (var328.field6984 != null && var328.field6984.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field7003[0];
                    for (int var331 = 1; var331 < var328.field6984.length; var331++) {
                        if (var328.field7003[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field7003[var331];
                        }
                    }
                    field2282[field2279++] = var328.field6984[var329];
                    return;
                }
                field2282[field2279++] = var328.field6996;
                return;
            }
        } else {
            class38 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class159.method1143(-357225936, field2282[--field2279]);
            } else {
                var47 = arg1 ? field2276 : field2284;
            }
            if (arg0 == 1300) {
                int var48 = field2282[--field2279] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method257(var48, 0, field2289[--field2288]);
                    return;
                } else {
                    field2288--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field2279 -= 2;
                int var49 = field2282[field2279];
                int var50 = field2282[field2279 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field644 = null;
                    return;
                }
                var47.field644 = class327.method2148(var49, -7153, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field2282[--field2279];
                if (class147.field2185 != var51 && class10.field116 != var51 && class321.field4858 != var51) {
                    return;
                }
                var47.field547 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field502 = field2282[--field2279];
                return;
            }
            if (arg0 == 1304) {
                var47.field528 = field2282[--field2279];
                return;
            }
            if (arg0 == 1305) {
                var47.field543 = field2289[--field2288];
                return;
            }
            if (arg0 == 1306) {
                var47.field561 = field2289[--field2288];
                return;
            }
            if (arg0 == 1307) {
                var47.field581 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field514 = field2282[--field2279];
                var47.field494 = field2282[--field2279];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field2282[--field2279];
                int var53 = field2282[--field2279];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method247(var52, true, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field625 = field2289[--field2288];
                return;
            }
            if (arg0 == 1311) {
                var47.field618 = field2282[--field2279];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field2279 -= 3;
                    var54 = field2282[field2279] - 1;
                    var55 = field2282[field2279 + 1];
                    var56 = field2282[field2279 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2279 -= 2;
                    var54 = 10;
                    var55 = field2282[field2279];
                    var56 = field2282[field2279 + 1];
                }
                if (var47.field602 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field602 = new byte[11];
                    var47.field606 = new byte[11];
                    var47.field497 = new int[11];
                }
                var47.field602[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field538 = false;
                    for (int var57 = 0; var57 < var47.field602.length; var57++) {
                        if (var47.field602[var57] != 0) {
                            var47.field538 = true;
                            break;
                        }
                    }
                } else {
                    var47.field538 = true;
                }
                var47.field606[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field568 = field2282[--field2279];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ltr;I)V")
    private static final void method1099(class247 arg0, int arg1) {
        field2279 = 0;
        field2288 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3706;
        int[] var4 = arg0.field3704;
        byte var5 = -1;
        field2292 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method1098(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1097(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2282[field2279++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2282[field2279++] = class288.field4476.field5434[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class288.field4476.method2342(field2282[--field2279], -21029, var8);
                } else if (var43 == 3) {
                    field2289[field2288++] = arg0.field3694[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2279 -= 2;
                    if (field2282[field2279 + 1] != field2282[field2279]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2279 -= 2;
                    if (field2282[field2279 + 1] == field2282[field2279]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2279 -= 2;
                    if (field2282[field2279] < field2282[field2279 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2279 -= 2;
                    if (field2282[field2279] > field2282[field2279 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2292 == 0) {
                        return;
                    }
                    class225 var9 = field2293[--field2292];
                    arg0 = var9.field3425;
                    var3 = arg0.field3706;
                    var4 = arg0.field3704;
                    var2 = var9.field3431;
                    field2272 = var9.field3426;
                    field2280 = var9.field3424;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2282[field2279++] = class288.field4476.method2111(var10, 90);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class288.field4476.method2340(field2282[--field2279], var11, 27959);
                } else if (var43 == 31) {
                    field2279 -= 2;
                    if (field2282[field2279] <= field2282[field2279 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2279 -= 2;
                    if (field2282[field2279] >= field2282[field2279 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2282[field2279++] = field2272[var4[var2]];
                } else if (var43 == 34) {
                    field2272[var4[var2]] = field2282[--field2279];
                } else if (var43 == 35) {
                    field2289[field2288++] = field2280[var4[var2]];
                } else if (var43 == 36) {
                    field2280[var4[var2]] = field2289[--field2288];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2288 -= var12;
                    String var13 = class383.method2437(var12, (byte) 125, field2288, field2289);
                    field2289[field2288++] = var13;
                } else if (var43 == 38) {
                    field2279--;
                } else if (var43 == 39) {
                    field2288--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class247 var15 = class30.method188(0, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3703];
                    String[] var17 = new String[var15.field3696];
                    for (int var18 = 0; var18 < var15.field3700; var18++) {
                        var16[var18] = field2282[field2279 + var18 - var15.field3700];
                    }
                    for (int var19 = 0; var19 < var15.field3698; var19++) {
                        var17[var19] = field2289[field2288 + var19 - var15.field3698];
                    }
                    field2279 -= var15.field3700;
                    field2288 -= var15.field3698;
                    class225 var20 = new class225();
                    var20.field3425 = arg0;
                    var20.field3431 = var2;
                    var20.field3426 = field2272;
                    var20.field3424 = field2280;
                    if (field2292 >= field2293.length) {
                        throw new RuntimeException();
                    }
                    field2293[field2292++] = var20;
                    arg0 = var15;
                    var3 = var15.field3706;
                    var4 = var15.field3704;
                    var2 = -1;
                    field2272 = var16;
                    field2280 = var17;
                } else if (var43 == 42) {
                    field2282[field2279++] = class395.field5835[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class395.field5835[var21] = field2282[--field2279];
                    class417.method2609(var21, (byte) 58);
                    class107.field1628 |= class541.field7914[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2282[--field2279];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2277[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field2290[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2282[--field2279];
                    if (var28 < 0 || var28 >= field2277[var27]) {
                        throw new RuntimeException();
                    }
                    field2282[field2279++] = field2290[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2279 -= 2;
                    int var30 = field2282[field2279];
                    if (var30 < 0 || var30 >= field2277[var29]) {
                        throw new RuntimeException();
                    }
                    field2290[var29][var30] = field2282[field2279 + 1];
                } else if (var43 == 47) {
                    String var31 = class15.field161[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2289[field2288++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class15.field161[var32] = field2289[--field2288];
                    class357.method2277(var32, 116);
                } else if (var43 == 51) {
                    class56 var33 = arg0.field3705[var4[var2]];
                    class50 var34 = (class50) var33.method358((byte) -127, (long) field2282[--field2279]);
                    if (var34 != null) {
                        var2 += var34.field771;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3702 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1932).append(" ");
                for (int var41 = field2292 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2293[var41].field3425.field1932).append(" ");
                }
                var40.append("op: ").append(var5);
                class197.method1407(true, var40.toString(), var42);
            } else {
                class492.method2961(0, "Clientscript error in: " + arg0.field3702);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3702).append("\n");
                for (int var38 = field2292 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2293[var38].field3425.field3702).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class197.method1407(true, var37.toString(), var42);
                class442.method2733(var37.toString(), 8);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(IZ)V")
    public static final void method1100(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lqr;I)V")
    private static final void method1101(class510 arg0, int arg1) {
        Object[] var2 = arg0.field7413;
        int var3 = (Integer) var2[0];
        class247 var4 = class30.method188(0, var3);
        if (var4 == null) {
            return;
        }
        field2272 = new int[var4.field3703];
        int var5 = 0;
        field2280 = new String[var4.field3696];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field7416;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field7425;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field7423 == null ? -1 : arg0.field7423.field580;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field7427;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field7423 == null ? -1 : arg0.field7423.field607;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field7417 == null ? -1 : arg0.field7417.field580;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field7417 == null ? -1 : arg0.field7417.field607;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field7430;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field7429;
                }
                field2272[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field7424;
                }
                field2280[var6++] = var9;
            }
        }
        field2297 = arg0.field7419;
        method1099(var4, arg1);
    }
}
