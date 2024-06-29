import jagex3.jagmisc.jagmisc;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class429 {

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    private static int field6294 = 0;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "[I")
    private static int[] field6302 = new int[5];

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[[I")
    private static int[][] field6307 = new int[5][5000];

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "[I")
    private static int[] field6301 = new int[1000];

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    private static int field6309 = 0;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "[Lqk;")
    private static class14[] field6292 = new class14[50];

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "[Ljava/lang/String;")
    private static String[] field6304 = new String[1000];

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    private static int field6310 = 0;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6300 = Calendar.getInstance();

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field6316 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "[I")
    private static int[] field6319 = new int[3];

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "Lnj;")
    public static class162 field6318 = new class162(4);

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    private static int field6320 = 0;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "Lem;")
    private static class150 field6296;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Lem;")
    private static class150 field6314;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "Lql;")
    private static class515 field6311;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
    private static int[] field6298;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field6313;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Ljava/lang/String;", line = 9)
    private static final String method2535(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6300.setTime(new Date(var1));
        int var3 = field6300.get(5);
        int var4 = field6300.get(2);
        int var5 = field6300.get(1);
        return var3 + "-" + field6316[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()V", line = 19)
    public static final void method2536() {
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lof;)V", line = 25)
    public static final void method2537(class437 arg0) {
        method2543(arg0, 200000);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 30)
    private static final void method2538(int arg0) {
        class150 var1 = class60.method497(arg0, (byte) -118);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class150[] var3 = class421.field6175[var2];
        if (var3 == null) {
            class150[] var4 = class495.field7226[var2];
            int var5 = var4.length;
            var3 = class421.field6175[var2] = new class150[var5];
            class91.method679(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class91.method679(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V", line = 70)
    private static final void method2539(int arg0) {
        class150 var1 = class60.method497(arg0, (byte) -120);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class150[] var3 = class421.field6175[var2];
        if (var3 == null) {
            class150[] var4 = class495.field7226[var2];
            int var5 = var4.length;
            var3 = class421.field6175[var2] = new class150[var5];
            class91.method679(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class91.method679(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lol;II)V", line = 108)
    public static final void method2540(class187 arg0, int arg1, int arg2) {
        class242 var3 = class176.method1139((byte) -107, arg0, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field6298 = new int[var3.field3377];
        field6313 = new String[var3.field3383];
        if (class335.field4520 == var3.field3379 || class50.field607 == var3.field3379 || class401.field5883 == var3.field3379) {
            int var4 = 0;
            int var5 = 0;
            if (class68.field931 != null) {
                var4 = class68.field931.field2309;
                var5 = class68.field931.field2247;
            }
            field6298[0] = class518.field7668.method1813(0) - var4;
            field6298[1] = class518.field7668.method1822(126) - var5;
        }
        method2544(var3, 200000);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)V", line = 144)
    private static final void method2541(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6310 -= 3;
                int var2 = field6301[field6310];
                int var3 = field6301[field6310 + 1];
                int var4 = field6301[field6310 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class150 var5 = class60.method497(var2, (byte) -117);
                if (var5.field2299 == null) {
                    var5.field2299 = new class150[var4 + 1];
                }
                if (var5.field2299.length <= var4) {
                    class150[] var6 = new class150[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2299.length; var7++) {
                        var6[var7] = var5.field2299[var7];
                    }
                    var5.field2299 = var6;
                }
                if (var4 > 0 && var5.field2299[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class150 var8 = new class150();
                var8.field2315 = var3;
                var8.field2259 = var8.field2277 = var5.field2277;
                var8.field2248 = var4;
                var5.field2299[var4] = var8;
                if (arg1) {
                    field6314 = var8;
                } else {
                    field6296 = var8;
                }
                class370.method2222(0, var5);
                return;
            }
            if (arg0 == 101) {
                class150 var9 = arg1 ? field6314 : field6296;
                if (var9.field2248 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class150 var10 = class60.method497(var9.field2277, (byte) -123);
                var10.field2299[var9.field2248] = null;
                class370.method2222(0, var10);
                return;
            }
            if (arg0 == 102) {
                class150 var11 = class60.method497(field6301[--field6310], (byte) -118);
                var11.field2299 = null;
                class370.method2222(0, var11);
                return;
            }
            if (arg0 == 200) {
                field6310 -= 2;
                int var12 = field6301[field6310];
                int var13 = field6301[field6310 + 1];
                class150 var14 = class525.method3121(var13, var12, -9140);
                if (var14 != null && var13 != -1) {
                    field6301[field6310++] = 1;
                    if (arg1) {
                        field6314 = var14;
                        return;
                    }
                    field6296 = var14;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6301[--field6310];
                class150 var16 = class60.method497(var15, (byte) -123);
                if (var16 != null) {
                    field6301[field6310++] = 1;
                    if (arg1) {
                        field6314 = var16;
                        return;
                    }
                    field6296 = var16;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6301[--field6310];
                method2539(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6301[--field6310];
                method2538(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6310 -= 2;
                int var19 = field6301[field6310];
                int var20 = field6301[field6310 + 1];
                for (int var21 = 0; var21 < class431.field6338.length; var21++) {
                    if (class431.field6338[var21] == var19) {
                        class316.field4324.field6417.method2617(3, var21, var20, class168.field2515);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class433.field6350.length; var22++) {
                    if (class433.field6350[var22] == var19) {
                        class316.field4324.field6417.method2617(3, var22, var20, class168.field2515);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6310 -= 2;
                int var23 = field6301[field6310];
                int var24 = field6301[field6310 + 1];
                class316.field4324.field6417.method2630(false, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6301[--field6310] != 0;
                class316.field4324.field6417.method2629(var25, -104);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class150 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class60.method497(field6301[--field6310], (byte) -128);
            } else {
                var26 = arg1 ? field6314 : field6296;
            }
            if (arg0 == 1000) {
                field6310 -= 4;
                var26.field2166 = field6301[field6310];
                var26.field2197 = field6301[field6310 + 1];
                int var27 = field6301[field6310 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field6301[field6310 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2280 = (byte) var27;
                var26.field2258 = (byte) var28;
                class370.method2222(0, var26);
                class490.method2869(-104, var26);
                if (var26.field2248 == -1) {
                    class166.method1103(32401, var26.field2277);
                }
                return;
            }
            if (arg0 == 1001) {
                field6310 -= 4;
                var26.field2172 = field6301[field6310];
                var26.field2174 = field6301[field6310 + 1];
                var26.field2236 = 0;
                var26.field2301 = 0;
                int var29 = field6301[field6310 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field6301[field6310 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2323 = (byte) var29;
                var26.field2180 = (byte) var30;
                class370.method2222(0, var26);
                class490.method2869(-113, var26);
                if (var26.field2315 == 0) {
                    class356.method2132(var26, (byte) 65, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field6301[--field6310] == 1;
                if (var26.field2268 != var31) {
                    var26.field2268 = var31;
                    class370.method2222(0, var26);
                }
                if (var26.field2248 == -1) {
                    class212.method1309(var26.field2277, (byte) -94);
                }
                return;
            }
            if (arg0 == 1004) {
                field6310 -= 2;
                var26.field2251 = field6301[field6310];
                var26.field2217 = field6301[field6310 + 1];
                class370.method2222(0, var26);
                class490.method2869(-120, var26);
                if (var26.field2315 == 0) {
                    class356.method2132(var26, (byte) 65, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2232 = field6301[--field6310] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class150 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class60.method497(field6301[--field6310], (byte) -121);
            } else {
                var32 = arg1 ? field6314 : field6296;
            }
            if (arg0 == 1100) {
                field6310 -= 2;
                var32.field2181 = field6301[field6310];
                if (var32.field2181 > var32.field2187 - var32.field2204) {
                    var32.field2181 = var32.field2187 - var32.field2204;
                }
                if (var32.field2181 < 0) {
                    var32.field2181 = 0;
                }
                var32.field2173 = field6301[field6310 + 1];
                if (var32.field2173 > var32.field2308 - var32.field2322) {
                    var32.field2173 = var32.field2308 - var32.field2322;
                }
                if (var32.field2173 < 0) {
                    var32.field2173 = 0;
                }
                class370.method2222(0, var32);
                if (var32.field2248 == -1) {
                    class385.method2276((byte) -28, var32.field2277);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field2288 = field6301[--field6310];
                class370.method2222(0, var32);
                if (var32.field2248 == -1) {
                    class510.method3053(var32.field2277, (byte) 0);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2278 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field2163 = field6301[--field6310];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field2214 = field6301[--field6310];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field6301[--field6310];
                if (var32.field2198 != var33) {
                    var32.field2198 = var33;
                    class370.method2222(0, var32);
                }
                if (var32.field2248 == -1) {
                    class80.method647(var32.field2277, 1);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field2191 = field6301[--field6310];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field2319 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field2297 = 1;
                var32.field2229 = field6301[--field6310];
                class370.method2222(0, var32);
                if (var32.field2248 == -1) {
                    class36.method212(var32.field2277, 48);
                }
                return;
            }
            if (arg0 == 1109) {
                field6310 -= 6;
                var32.field2213 = field6301[field6310];
                var32.field2225 = field6301[field6310 + 1];
                var32.field2276 = field6301[field6310 + 2];
                var32.field2234 = field6301[field6310 + 3];
                var32.field2326 = field6301[field6310 + 4];
                var32.field2304 = field6301[field6310 + 5];
                class370.method2222(0, var32);
                if (var32.field2248 == -1) {
                    class141.method942((byte) 113, var32.field2277);
                    class331.method1914(var32.field2277, (byte) 64);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field6301[--field6310];
                if (var32.field2262 != var34) {
                    var32.field2262 = var34;
                    var32.field2267 = 0;
                    var32.field2281 = 1;
                    var32.field2240 = 0;
                    class370.method2222(0, var32);
                }
                if (var32.field2248 == -1) {
                    class220.method1365(var32.field2277, (byte) -98);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2285 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field6304[--field6309];
                if (!var35.equals(var32.field2199)) {
                    var32.field2199 = var35;
                    class370.method2222(0, var32);
                }
                if (var32.field2248 == -1) {
                    class520.method3105(-21708, var32.field2277);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field2282 = field6301[--field6310];
                class370.method2222(0, var32);
                if (var32.field2248 == -1) {
                    class493.method2887((byte) 45, var32.field2277);
                }
                return;
            }
            if (arg0 == 1114) {
                field6310 -= 3;
                var32.field2171 = field6301[field6310];
                var32.field2263 = field6301[field6310 + 1];
                var32.field2190 = field6301[field6310 + 2];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field2291 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field2228 = field6301[--field6310];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field2223 = field6301[--field6310];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field2186 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field2272 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1120) {
                field6310 -= 2;
                var32.field2187 = field6301[field6310];
                var32.field2308 = field6301[field6310 + 1];
                class370.method2222(0, var32);
                if (var32.field2315 == 0) {
                    class356.method2132(var32, (byte) 65, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field6310 -= 2;
                var32.field2314 = (short) field6301[field6310];
                var32.field2320 = (short) field6301[field6310 + 1];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field2294 = field6301[--field6310] == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field2304 = field6301[--field6310];
                class370.method2222(0, var32);
                if (var32.field2248 == -1) {
                    class141.method942((byte) 104, var32.field2277);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field6301[--field6310];
                var32.field2253 = var36 == 1;
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1125) {
                field6310 -= 2;
                var32.field2249 = field6301[field6310];
                var32.field2178 = field6301[field6310 + 1];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field2311 = field6301[--field6310];
                class370.method2222(0, var32);
                return;
            }
            if (arg0 == 1127) {
                field6310 -= 2;
                int var37 = field6301[field6310];
                int var38 = field6301[field6310 + 1];
                class177 var39 = class177.field2622.method2033((byte) -74, var37);
                if (var39.field2615 != var38) {
                    var32.method1008(84, var38, var37);
                    return;
                }
                var32.method997(var37, (byte) -93);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field6301[--field6310];
                String var41 = field6304[--field6309];
                class177 var42 = class177.field2622.method2033((byte) 93, var40);
                if (!var42.field2619.equals(var41)) {
                    var32.method1000(var40, var41, 76);
                    return;
                }
                var32.method997(var40, (byte) -90);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class150 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class60.method497(field6301[--field6310], (byte) -126);
            } else {
                var43 = arg1 ? field6314 : field6296;
            }
            class370.method2222(0, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6310 -= 2;
                int var44 = field6301[field6310];
                int var45 = field6301[field6310 + 1];
                if (var43.field2248 == -1) {
                    class60.method483(var43.field2277, (byte) -111);
                    class141.method942((byte) 113, var43.field2277);
                    class331.method1914(var43.field2277, (byte) 64);
                }
                if (var44 == -1) {
                    var43.field2297 = 1;
                    var43.field2229 = -1;
                    var43.field2237 = -1;
                    return;
                }
                var43.field2237 = var44;
                var43.field2257 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2266 = true;
                } else {
                    var43.field2266 = false;
                }
                class508 var46 = class328.field4480.method3091(58, var44);
                var43.field2276 = var46.field7517;
                var43.field2234 = var46.field7546;
                var43.field2326 = var46.field7508;
                var43.field2213 = var46.field7498;
                var43.field2225 = var46.field7548;
                var43.field2304 = var46.field7500;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field2324 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field2324 = 1;
                } else {
                    var43.field2324 = 2;
                }
                if (var43.field2236 > 0) {
                    var43.field2304 = var43.field2304 * 32 / var43.field2236;
                    return;
                }
                if (var43.field2172 > 0) {
                    var43.field2304 = var43.field2304 * 32 / var43.field2172;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2297 = 2;
                var43.field2229 = field6301[--field6310];
                if (var43.field2248 == -1) {
                    class36.method212(var43.field2277, 48);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2297 = 3;
                var43.field2229 = -1;
                if (var43.field2248 == -1) {
                    class36.method212(var43.field2277, 48);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2297 = 6;
                var43.field2229 = field6301[--field6310];
                if (var43.field2248 == -1) {
                    class36.method212(var43.field2277, 48);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2297 = 5;
                var43.field2229 = field6301[--field6310];
                if (var43.field2248 == -1) {
                    class36.method212(var43.field2277, 48);
                }
                return;
            }
            if (arg0 == 1206) {
                field6310 -= 4;
                var43.field2279 = field6301[field6310];
                var43.field2221 = field6301[field6310 + 1];
                var43.field2310 = field6301[field6310 + 2];
                var43.field2245 = field6301[field6310 + 3];
                class370.method2222(0, var43);
                return;
            }
            if (arg0 == 1207) {
                field6310 -= 2;
                var43.field2292 = field6301[field6310];
                var43.field2185 = field6301[field6310 + 1];
                class370.method2222(0, var43);
                return;
            }
            if (arg0 == 1210) {
                field6310 -= 4;
                var43.field2229 = field6301[field6310];
                var43.field2194 = field6301[field6310 + 1];
                if (field6301[field6310 + 2] == 1) {
                    var43.field2297 = 9;
                } else {
                    var43.field2297 = 8;
                }
                if (field6301[field6310 + 3] == 1) {
                    var43.field2266 = true;
                } else {
                    var43.field2266 = false;
                }
                if (var43.field2248 == -1) {
                    class36.method212(var43.field2277, 48);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2297 = 5;
                var43.field2229 = class152.field2335;
                var43.field2194 = 0;
                if (var43.field2248 == -1) {
                    class36.method212(var43.field2277, 48);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class150 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class60.method497(field6301[--field6310], (byte) -121);
                } else {
                    var58 = arg1 ? field6314 : field6296;
                }
                String var59 = field6304[--field6309];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field6301[--field6310];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field6301[--field6310];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field6304[--field6309];
                    } else {
                        var62[var63] = Integer.valueOf(field6301[--field6310]);
                    }
                }
                int var64 = field6301[--field6310];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field2274 = var62;
                } else if (arg0 == 1401) {
                    var58.field2175 = var62;
                } else if (arg0 == 1402) {
                    var58.field2312 = var62;
                } else if (arg0 == 1403) {
                    var58.field2283 = var62;
                } else if (arg0 == 1404) {
                    var58.field2169 = var62;
                } else if (arg0 == 1405) {
                    var58.field2177 = var62;
                } else if (arg0 == 1406) {
                    var58.field2206 = var62;
                } else if (arg0 == 1407) {
                    var58.field2254 = var62;
                    var58.field2231 = var60;
                } else if (arg0 == 1408) {
                    var58.field2164 = var62;
                } else if (arg0 == 1409) {
                    var58.field2209 = var62;
                } else if (arg0 == 1410) {
                    var58.field2182 = var62;
                } else if (arg0 == 1411) {
                    var58.field2293 = var62;
                } else if (arg0 == 1412) {
                    var58.field2227 = var62;
                } else if (arg0 == 1414) {
                    var58.field2306 = var62;
                    var58.field2261 = var60;
                } else if (arg0 == 1415) {
                    var58.field2260 = var62;
                    var58.field2233 = var60;
                } else if (arg0 == 1416) {
                    var58.field2168 = var62;
                } else if (arg0 == 1417) {
                    var58.field2226 = var62;
                } else if (arg0 == 1418) {
                    var58.field2196 = var62;
                } else if (arg0 == 1419) {
                    var58.field2176 = var62;
                } else if (arg0 == 1420) {
                    var58.field2307 = var62;
                } else if (arg0 == 1421) {
                    var58.field2275 = var62;
                } else if (arg0 == 1422) {
                    var58.field2296 = var62;
                } else if (arg0 == 1423) {
                    var58.field2321 = var62;
                } else if (arg0 == 1424) {
                    var58.field2290 = var62;
                } else if (arg0 == 1425) {
                    var58.field2318 = var62;
                } else if (arg0 == 1426) {
                    var58.field2201 = var62;
                } else if (arg0 == 1427) {
                    var58.field2210 = var62;
                } else if (arg0 == 1428) {
                    var58.field2250 = var62;
                    var58.field2255 = var60;
                } else if (arg0 == 1429) {
                    var58.field2193 = var62;
                    var58.field2244 = var60;
                } else if (arg0 == 1430) {
                    var58.field2242 = var62;
                }
                var58.field2162 = true;
                return;
            }
            if (arg0 < 1600) {
                class150 var65 = arg1 ? field6314 : field6296;
                if (arg0 == 1500) {
                    field6301[field6310++] = var65.field2309;
                    return;
                }
                if (arg0 == 1501) {
                    field6301[field6310++] = var65.field2247;
                    return;
                }
                if (arg0 == 1502) {
                    field6301[field6310++] = var65.field2204;
                    return;
                }
                if (arg0 == 1503) {
                    field6301[field6310++] = var65.field2322;
                    return;
                }
                if (arg0 == 1504) {
                    field6301[field6310++] = var65.field2268 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6301[field6310++] = var65.field2259;
                    return;
                }
                if (arg0 == 1506) {
                    class150 var66 = class3.method9(125, var65);
                    field6301[field6310++] = var66 == null ? -1 : var66.field2277;
                    return;
                }
            } else if (arg0 < 1700) {
                class150 var67 = arg1 ? field6314 : field6296;
                if (arg0 == 1600) {
                    field6301[field6310++] = var67.field2181;
                    return;
                }
                if (arg0 == 1601) {
                    field6301[field6310++] = var67.field2173;
                    return;
                }
                if (arg0 == 1602) {
                    field6304[field6309++] = var67.field2199;
                    return;
                }
                if (arg0 == 1603) {
                    field6301[field6310++] = var67.field2187;
                    return;
                }
                if (arg0 == 1604) {
                    field6301[field6310++] = var67.field2308;
                    return;
                }
                if (arg0 == 1605) {
                    field6301[field6310++] = var67.field2304;
                    return;
                }
                if (arg0 == 1606) {
                    field6301[field6310++] = var67.field2276;
                    return;
                }
                if (arg0 == 1607) {
                    field6301[field6310++] = var67.field2326;
                    return;
                }
                if (arg0 == 1608) {
                    field6301[field6310++] = var67.field2234;
                    return;
                }
                if (arg0 == 1609) {
                    field6301[field6310++] = var67.field2163;
                    return;
                }
                if (arg0 == 1610) {
                    field6301[field6310++] = var67.field2213;
                    return;
                }
                if (arg0 == 1611) {
                    field6301[field6310++] = var67.field2225;
                    return;
                }
                if (arg0 == 1612) {
                    field6301[field6310++] = var67.field2198;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field6301[--field6310];
                    class177 var69 = class177.field2622.method2033((byte) 116, var68);
                    if (var69.method1143((byte) -72)) {
                        field6304[field6309++] = var67.method1010(var69.field2619, var68, 21793);
                    } else {
                        field6301[field6310++] = var67.method996((byte) 99, var68, var69.field2615);
                    }
                }
            } else if (arg0 < 1800) {
                class150 var70 = arg1 ? field6314 : field6296;
                if (arg0 == 1700) {
                    field6301[field6310++] = var70.field2237;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field2237 != -1) {
                        field6301[field6310++] = var70.field2257;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6301[field6310++] = var70.field2248;
                    return;
                }
            } else if (arg0 < 1900) {
                class150 var71 = arg1 ? field6314 : field6296;
                if (arg0 == 1800) {
                    field6301[field6310++] = client.method1228(var71).method1182((byte) 104);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field6301[--field6310];
                    int var334 = var72 - 1;
                    if (var71.field2271 != null && var334 < var71.field2271.length && var71.field2271[var334] != null) {
                        field6304[field6309++] = var71.field2271[var334];
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field2203 == null) {
                        field6304[field6309++] = "";
                        return;
                    }
                    field6304[field6309++] = var71.field2203;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class150 var332;
                if (arg0 >= 2000) {
                    var332 = class60.method497(field6301[--field6310], (byte) -120);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field6314 : field6296;
                }
                if (field6320 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field2210 == null) {
                        return;
                    }
                    class437 var333 = new class437();
                    var333.field6390 = var332;
                    var333.field6389 = var332.field2210;
                    var333.field6385 = field6320 + 1;
                    class416.field6052.method2809(var333, 2);
                    return;
                }
            } else if (arg0 < 2600) {
                class150 var73 = class60.method497(field6301[--field6310], (byte) -125);
                if (arg0 == 2500) {
                    field6301[field6310++] = var73.field2309;
                    return;
                }
                if (arg0 == 2501) {
                    field6301[field6310++] = var73.field2247;
                    return;
                }
                if (arg0 == 2502) {
                    field6301[field6310++] = var73.field2204;
                    return;
                }
                if (arg0 == 2503) {
                    field6301[field6310++] = var73.field2322;
                    return;
                }
                if (arg0 == 2504) {
                    field6301[field6310++] = var73.field2268 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6301[field6310++] = var73.field2259;
                    return;
                }
                if (arg0 == 1506) {
                    class150 var74 = class3.method9(119, var73);
                    field6301[field6310++] = var74 == null ? -1 : var74.field2277;
                    return;
                }
            } else if (arg0 < 2700) {
                class150 var75 = class60.method497(field6301[--field6310], (byte) -125);
                if (arg0 == 2600) {
                    field6301[field6310++] = var75.field2181;
                    return;
                }
                if (arg0 == 2601) {
                    field6301[field6310++] = var75.field2173;
                    return;
                }
                if (arg0 == 2602) {
                    field6304[field6309++] = var75.field2199;
                    return;
                }
                if (arg0 == 2603) {
                    field6301[field6310++] = var75.field2187;
                    return;
                }
                if (arg0 == 2604) {
                    field6301[field6310++] = var75.field2308;
                    return;
                }
                if (arg0 == 2605) {
                    field6301[field6310++] = var75.field2304;
                    return;
                }
                if (arg0 == 2606) {
                    field6301[field6310++] = var75.field2276;
                    return;
                }
                if (arg0 == 2607) {
                    field6301[field6310++] = var75.field2326;
                    return;
                }
                if (arg0 == 2608) {
                    field6301[field6310++] = var75.field2234;
                    return;
                }
                if (arg0 == 2609) {
                    field6301[field6310++] = var75.field2163;
                    return;
                }
                if (arg0 == 2610) {
                    field6301[field6310++] = var75.field2213;
                    return;
                }
                if (arg0 == 2611) {
                    field6301[field6310++] = var75.field2225;
                    return;
                }
                if (arg0 == 2612) {
                    field6301[field6310++] = var75.field2198;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class150 var76 = class60.method497(field6301[--field6310], (byte) -124);
                    field6301[field6310++] = var76.field2237;
                    return;
                }
                if (arg0 == 2701) {
                    class150 var77 = class60.method497(field6301[--field6310], (byte) -128);
                    if (var77.field2237 == -1) {
                        field6301[field6310++] = 0;
                        return;
                    } else {
                        field6301[field6310++] = var77.field2257;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field6301[--field6310];
                    class295 var79 = (class295) class212.field2960.method1492((long) var78, 6340);
                    if (var79 != null) {
                        field6301[field6310++] = 1;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class150 var80 = class60.method497(field6301[--field6310], (byte) -125);
                    if (var80.field2299 == null) {
                        field6301[field6310++] = 0;
                        return;
                    }
                    int var81 = var80.field2299.length;
                    for (int var82 = 0; var82 < var80.field2299.length; var82++) {
                        if (var80.field2299[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field6301[field6310++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6310 -= 2;
                    int var83 = field6301[field6310];
                    int var84 = field6301[field6310 + 1];
                    class295 var85 = (class295) class212.field2960.method1492((long) var83, 6340);
                    if (var85 != null && var85.field4055 == var84) {
                        field6301[field6310++] = 1;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class150 var86 = class60.method497(field6301[--field6310], (byte) -124);
                if (arg0 == 2800) {
                    field6301[field6310++] = client.method1228(var86).method1182((byte) 104);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field6301[--field6310];
                    int var335 = var87 - 1;
                    if (var86.field2271 != null && var335 < var86.field2271.length && var86.field2271[var335] != null) {
                        field6304[field6309++] = var86.field2271[var335];
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field2203 == null) {
                        field6304[field6309++] = "";
                        return;
                    }
                    field6304[field6309++] = var86.field2203;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field6304[--field6309];
                    class49.method438(var88, (byte) -95);
                    return;
                }
                if (arg0 == 3101) {
                    field6310 -= 2;
                    client.method1236(-11, class316.field4324, field6301[field6310 + 1], field6301[field6310]);
                    return;
                }
                if (arg0 == 3103) {
                    class305.method1773(true, 0);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field6304[--field6309];
                    int var90 = 0;
                    if (class325.method1882(var89, false)) {
                        var90 = class104.method765(var89, 128);
                    }
                    field6297++;
                    class491.method2878((byte) 92, class377.field5515);
                    class481.field7027.method2359(var90, -98);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field6304[--field6309];
                    field6312++;
                    class491.method2878((byte) 92, class179.field2632);
                    class481.field7027.method2302(-4, var91.length() + 1);
                    class481.field7027.method2349(var91, true);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field6304[--field6309];
                    field6305++;
                    class491.method2878((byte) 92, class36.field453);
                    class481.field7027.method2302(-4, var92.length() + 1);
                    class481.field7027.method2349(var92, true);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field6301[--field6310];
                    String var94 = field6304[--field6309];
                    class483.method2840(0, var93, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field6310 -= 3;
                    int var95 = field6301[field6310];
                    int var96 = field6301[field6310 + 1];
                    int var97 = field6301[field6310 + 2];
                    class150 var98 = class60.method497(var97, (byte) -122);
                    class300.method1757(var95, var98, var96, (byte) -92);
                    return;
                }
                if (arg0 == 3109) {
                    field6310 -= 2;
                    int var99 = field6301[field6310];
                    int var100 = field6301[field6310 + 1];
                    class150 var101 = arg1 ? field6314 : field6296;
                    class300.method1757(var99, var101, var100, (byte) -91);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field6301[--field6310];
                    field6306++;
                    class491.method2878((byte) 92, class398.field5806);
                    class481.field7027.method2355(1686288168, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field6310 -= 2;
                    int var103 = field6301[field6310];
                    int var104 = field6301[field6310 + 1];
                    class295 var105 = (class295) class212.field2960.method1492((long) var103, 6340);
                    if (var105 != null) {
                        class51.method447(var105, true, var105.field4055 != var104, true);
                    }
                    class486.method2859(3, 17328, true, var104, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field6310--;
                    int var106 = field6301[field6310];
                    class295 var107 = (class295) class212.field2960.method1492((long) var106, 6340);
                    if (var107 != null && var107.field4059 == 3) {
                        class51.method447(var107, true, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class187.method1177(16703, field6304[--field6309]);
                    return;
                }
                if (arg0 == 3114) {
                    field6310 -= 2;
                    int var108 = field6301[field6310];
                    int var109 = field6301[field6310 + 1];
                    String var110 = field6304[--field6309];
                    class310.method1795(var108, var109, "", "", 12406, var110);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6310 -= 3;
                    class506.method3019(-36, field6301[field6310], field6301[field6310 + 1], field6301[field6310 + 2], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class39.method331(50, 255, (byte) -101, field6301[--field6310]);
                    return;
                }
                if (arg0 == 3202) {
                    field6310 -= 2;
                    class258.method1557(field6301[field6310 + 1], 255, field6301[field6310], -24278);
                    return;
                }
                if (arg0 == 3203) {
                    field6310 -= 4;
                    class506.method3019(-21, field6301[field6310], field6301[field6310 + 1], field6301[field6310 + 2], field6301[field6310 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field6310 -= 3;
                    class39.method331(field6301[field6310 + 2], field6301[field6310 + 1], (byte) -119, field6301[field6310]);
                    return;
                }
                if (arg0 == 3205) {
                    field6310 -= 3;
                    class258.method1557(field6301[field6310 + 1], field6301[field6310 + 2], field6301[field6310], -24278);
                    return;
                }
                if (arg0 == 3206) {
                    field6310 -= 4;
                    class308.method1786(field6301[field6310 + 2], field6301[field6310], field6301[field6310 + 3], (byte) -109, field6301[field6310 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6301[field6310++] = class441.field6516;
                    return;
                }
                if (arg0 == 3301) {
                    field6310 -= 2;
                    int var111 = field6301[field6310];
                    int var112 = field6301[field6310 + 1];
                    field6301[field6310++] = class509.method3050(var112, false, var111, (byte) 85);
                    return;
                }
                if (arg0 == 3302) {
                    field6310 -= 2;
                    int var113 = field6301[field6310];
                    int var114 = field6301[field6310 + 1];
                    field6301[field6310++] = class441.method2624(var114, (byte) -87, false, var113);
                    return;
                }
                if (arg0 == 3303) {
                    field6310 -= 2;
                    int var115 = field6301[field6310];
                    int var116 = field6301[field6310 + 1];
                    field6301[field6310++] = class66.method568(var116, var115, false, 0);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field6301[--field6310];
                    field6301[field6310++] = class154.field2359.method2275(var117, (byte) -11).field3333;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field6301[--field6310];
                    field6301[field6310++] = class87.field1271[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field6301[--field6310];
                    field6301[field6310++] = class418.field6072[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field6301[--field6310];
                    field6301[field6310++] = class510.field7567[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class316.field4324.field1738;
                    int var122 = (class316.field4324.field1732 >> 7) + class510.field7566;
                    int var123 = (class316.field4324.field1735 >> 7) + class14.field204;
                    field6301[field6310++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field6301[--field6310];
                    field6301[field6310++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field6301[--field6310];
                    field6301[field6310++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field6301[--field6310];
                    field6301[field6310++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6301[field6310++] = class64.field870 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6310 -= 2;
                    int var127 = field6301[field6310];
                    int var128 = field6301[field6310 + 1];
                    field6301[field6310++] = class509.method3050(var128, true, var127, (byte) 85);
                    return;
                }
                if (arg0 == 3314) {
                    field6310 -= 2;
                    int var129 = field6301[field6310];
                    int var130 = field6301[field6310 + 1];
                    field6301[field6310++] = class441.method2624(var130, (byte) -99, true, var129);
                    return;
                }
                if (arg0 == 3315) {
                    field6310 -= 2;
                    int var131 = field6301[field6310];
                    int var132 = field6301[field6310 + 1];
                    field6301[field6310++] = class66.method568(var132, var131, true, 0);
                    return;
                }
                if (arg0 == 3316) {
                    if (class68.field929 >= 2) {
                        field6301[field6310++] = class68.field929;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6301[field6310++] = class122.field1831;
                    return;
                }
                if (arg0 == 3318) {
                    field6301[field6310++] = class316.field4329;
                    return;
                }
                if (arg0 == 3321) {
                    field6301[field6310++] = class197.field2813;
                    return;
                }
                if (arg0 == 3322) {
                    field6301[field6310++] = class37.field463;
                    return;
                }
                if (arg0 == 3323) {
                    if (class244.field3418 >= 5 && class244.field3418 <= 9) {
                        field6301[field6310++] = 1;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class244.field3418 >= 5 && class244.field3418 <= 9) {
                        field6301[field6310++] = class244.field3418;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6301[field6310++] = class217.field3019 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6301[field6310++] = class316.field4324.field6415;
                    return;
                }
                if (arg0 == 3327) {
                    field6301[field6310++] = class316.field4324.field6417.field6514 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field6301[field6310++] = class58.field691 && !class275.field3776 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6301[field6310++] = class414.field6040 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field6301[--field6310];
                    field6301[field6310++] = class95.method702(100, false, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field6310 -= 2;
                    int var134 = field6301[field6310];
                    int var135 = field6301[field6310 + 1];
                    field6301[field6310++] = class475.method2789(false, var135, var134, false, 15267);
                    return;
                }
                if (arg0 == 3332) {
                    field6310 -= 2;
                    int var136 = field6301[field6310];
                    int var137 = field6301[field6310 + 1];
                    field6301[field6310++] = class475.method2789(true, var137, var136, false, 15267);
                    return;
                }
                if (arg0 == 3333) {
                    field6301[field6310++] = class360.field5257;
                    return;
                }
                if (arg0 == 3335) {
                    field6301[field6310++] = class372.field5455;
                    return;
                }
                if (arg0 == 3336) {
                    field6310 -= 4;
                    int var138 = field6301[field6310];
                    int var139 = field6301[field6310 + 1];
                    int var140 = field6301[field6310 + 2];
                    int var141 = field6301[field6310 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field6301[field6310++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field6301[field6310++] = class461.field6784;
                    return;
                }
                if (arg0 == 3338) {
                    field6301[field6310++] = class157.method1044((byte) -49);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6310 -= 2;
                    int var145 = field6301[field6310];
                    int var146 = field6301[field6310 + 1];
                    class223 var147 = class231.field3269.method1165(var145, 27894);
                    field6304[field6309++] = var147.method1387(17489, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field6310 -= 4;
                    int var148 = field6301[field6310];
                    int var149 = field6301[field6310 + 1];
                    int var150 = field6301[field6310 + 2];
                    int var151 = field6301[field6310 + 3];
                    class223 var152 = class231.field3269.method1165(var150, 27894);
                    if (var152.field3188 == var148 && var152.field3191 == var149) {
                        if (var149 == 115) {
                            field6304[field6309++] = var152.method1387(17489, var151);
                            return;
                        }
                        field6301[field6310++] = var152.method1382(var151, (byte) -89);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field6310 -= 3;
                    int var153 = field6301[field6310];
                    int var154 = field6301[field6310 + 1];
                    int var155 = field6301[field6310 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class223 var156 = class231.field3269.method1165(var154, 27894);
                    if (var156.field3191 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6301[field6310++] = var156.method1384(4096, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field6301[--field6310];
                    String var158 = field6304[--field6309];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class223 var159 = class231.field3269.method1165(var157, 27894);
                    if (var159.field3191 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6301[field6310++] = var159.method1386((byte) -86, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field6301[--field6310];
                    class223 var161 = class231.field3269.method1165(var160, 27894);
                    field6301[field6310++] = var161.field3174.method1486((byte) -81);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class492.field7177 == 0) {
                        field6301[field6310++] = -2;
                        return;
                    }
                    if (class492.field7177 == 1) {
                        field6301[field6310++] = -1;
                        return;
                    }
                    field6301[field6310++] = class174.field2588;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field6301[--field6310];
                    if (class492.field7177 == 2 && var162 < class174.field2588) {
                        field6304[field6309++] = class258.field3597[var162];
                        if (class473.field6913[var162] != null) {
                            field6304[field6309++] = class473.field6913[var162];
                            return;
                        }
                        field6304[field6309++] = "";
                        return;
                    }
                    field6304[field6309++] = "";
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field6301[--field6310];
                    if (class492.field7177 == 2 && var163 < class174.field2588) {
                        field6301[field6310++] = class434.field6365[var163];
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field6301[--field6310];
                    if (class492.field7177 == 2 && var164 < class174.field2588) {
                        field6301[field6310++] = class438.field6407[var164];
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field6304[--field6309];
                    int var166 = field6301[--field6310];
                    class111.method807(var166, var165, 1);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field6304[--field6309];
                    class76.method606(-201, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field6304[--field6309];
                    class41.method346((byte) -112, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field6304[--field6309];
                    class210.method1297((byte) -126, var169, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field6304[--field6309];
                    class252.method1511(var170, (byte) 101);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field6304[--field6309];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field6301[field6310++] = class202.method1259(var171, 77) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field6301[--field6310];
                    if (class492.field7177 == 2 && var172 < class174.field2588) {
                        field6304[field6309++] = class178.field2628[var172];
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class346.field4958 != null) {
                        field6304[field6309++] = class466.method2732(class346.field4958, (byte) 87);
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class346.field4958 != null) {
                        field6301[field6310++] = class465.field6831;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field6301[--field6310];
                    if (class346.field4958 != null && var173 < class465.field6831) {
                        field6304[field6309++] = class290.field4026[var173].field1324;
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field6301[--field6310];
                    if (class346.field4958 != null && var174 < class465.field6831) {
                        field6301[field6310++] = class290.field4026[var174].field1320;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field6301[--field6310];
                    if (class346.field4958 != null && var175 < class465.field6831) {
                        field6301[field6310++] = class290.field4026[var175].field1317;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6301[field6310++] = class256.field3556;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field6304[--field6309];
                    class336.method1923(-102, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field6301[field6310++] = class279.field3819;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field6304[--field6309];
                    class240.method1462(109, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class312.method1810(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class492.field7177 == 0) {
                        field6301[field6310++] = -1;
                        return;
                    }
                    field6301[field6310++] = class18.field235;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field6301[--field6310];
                    if (class492.field7177 != 0 && var178 < class18.field235) {
                        field6304[field6309++] = class165.field2479[var178];
                        if (class413.field6031[var178] != null) {
                            field6304[field6309++] = class413.field6031[var178];
                            return;
                        }
                        field6304[field6309++] = "";
                        return;
                    }
                    field6304[field6309++] = "";
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field6304[--field6309];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field6301[field6310++] = class129.method888(false, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field6301[--field6310];
                    if (class290.field4026 != null && var180 < class465.field6831 && class290.field4026[var180].field1323.equalsIgnoreCase(class316.field4324.field6421)) {
                        field6301[field6310++] = 1;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class509.field7562 != null) {
                        field6304[field6309++] = class509.field7562;
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field6301[--field6310];
                    if (class346.field4958 != null && var181 < class465.field6831) {
                        field6304[field6309++] = class290.field4026[var181].field1321;
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field6301[--field6310];
                    if (class492.field7177 == 2 && var182 >= 0 && var182 < class174.field2588) {
                        field6301[field6310++] = class489.field7142[var182] ? 1 : 0;
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field6304[--field6309];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field6301[field6310++] = class124.method864(var183, (byte) 72);
                    return;
                }
                if (arg0 == 3629) {
                    field6301[field6310++] = class50.field616;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field6304[--field6309];
                    class210.method1297((byte) -125, var184, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field6301[--field6310];
                    field6301[field6310++] = class366.field5375[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field6301[--field6310];
                    if (class346.field4958 != null && var186 < class465.field6831) {
                        field6304[field6309++] = class290.field4026[var186].field1323;
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field6301[--field6310];
                    if (class492.field7177 != 0 && var187 < class18.field235) {
                        field6304[field6309++] = class267.field3692[var187];
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field6301[--field6310];
                    field6301[field6310++] = class65.field896[var188].method1160(-75);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field6301[--field6310];
                    field6301[field6310++] = class65.field896[var189].field2661;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field6301[--field6310];
                    field6301[field6310++] = class65.field896[var190].field2666;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field6301[--field6310];
                    field6301[field6310++] = class65.field896[var191].field2667;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field6301[--field6310];
                    field6301[field6310++] = class65.field896[var192].field2663;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field6301[--field6310];
                    field6301[field6310++] = class65.field896[var193].field2665;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field6301[--field6310];
                    int var195 = class65.field896[var194].method1162(-20677);
                    field6301[field6310++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field6301[--field6310];
                    int var197 = class65.field896[var196].method1162(-20677);
                    field6301[field6310++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field6301[--field6310];
                    int var199 = class65.field896[var198].method1162(-20677);
                    field6301[field6310++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field6301[--field6310];
                    int var201 = class65.field896[var200].method1162(-20677);
                    field6301[field6310++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6310 -= 2;
                    int var202 = field6301[field6310];
                    int var203 = field6301[field6310 + 1];
                    field6301[field6310++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field6310 -= 2;
                    int var204 = field6301[field6310];
                    int var205 = field6301[field6310 + 1];
                    field6301[field6310++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field6310 -= 2;
                    int var206 = field6301[field6310];
                    int var207 = field6301[field6310 + 1];
                    field6301[field6310++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field6310 -= 2;
                    int var208 = field6301[field6310];
                    int var209 = field6301[field6310 + 1];
                    field6301[field6310++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field6301[--field6310];
                    field6301[field6310++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field6301[--field6310];
                    field6301[field6310++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6310 -= 5;
                    int var212 = field6301[field6310];
                    int var213 = field6301[field6310 + 1];
                    int var214 = field6301[field6310 + 2];
                    int var215 = field6301[field6310 + 3];
                    int var216 = field6301[field6310 + 4];
                    field6301[field6310++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field6310 -= 2;
                    long var217 = (long) field6301[field6310];
                    long var219 = (long) field6301[field6310 + 1];
                    field6301[field6310++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field6310 -= 2;
                    int var221 = field6301[field6310];
                    int var222 = field6301[field6310 + 1];
                    field6301[field6310++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field6310 -= 2;
                    int var223 = field6301[field6310];
                    int var224 = field6301[field6310 + 1];
                    field6301[field6310++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6310 -= 2;
                    int var225 = field6301[field6310];
                    int var226 = field6301[field6310 + 1];
                    field6301[field6310++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6310 -= 2;
                    int var227 = field6301[field6310];
                    int var228 = field6301[field6310 + 1];
                    field6301[field6310++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field6310 -= 2;
                    int var229 = field6301[field6310];
                    int var230 = field6301[field6310 + 1];
                    if (var229 == 0) {
                        field6301[field6310++] = 0;
                        return;
                    }
                    field6301[field6310++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field6310 -= 2;
                    int var231 = field6301[field6310];
                    int var232 = field6301[field6310 + 1];
                    if (var231 == 0) {
                        field6301[field6310++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field6301[field6310++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6301[field6310++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field6310 -= 2;
                    int var233 = field6301[field6310];
                    int var234 = field6301[field6310 + 1];
                    field6301[field6310++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field6310 -= 2;
                    int var235 = field6301[field6310];
                    int var236 = field6301[field6310 + 1];
                    field6301[field6310++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field6310 -= 2;
                    int var237 = field6301[field6310];
                    int var238 = field6301[field6310 + 1];
                    field6301[field6310++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field6310 -= 2;
                    int var239 = field6301[field6310];
                    int var240 = field6301[field6310 + 1];
                    field6301[field6310++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field6310 -= 3;
                    long var241 = (long) field6301[field6310];
                    long var243 = (long) field6301[field6310 + 1];
                    long var245 = (long) field6301[field6310 + 2];
                    field6301[field6310++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field6304[--field6309];
                    int var248 = field6301[--field6310];
                    field6304[field6309++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field6309 -= 2;
                    String var249 = field6304[field6309];
                    String var250 = field6304[field6309 + 1];
                    field6304[field6309++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field6304[--field6309];
                    int var252 = field6301[--field6310];
                    field6304[field6309++] = var251 + class219.method1358(var252, 111, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field6304[--field6309];
                    field6304[field6309++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6304[field6309++] = method2535(field6301[--field6310]);
                    return;
                }
                if (arg0 == 4105) {
                    field6309 -= 2;
                    String var254 = field6304[field6309];
                    String var255 = field6304[field6309 + 1];
                    if (class316.field4324.field6417 != null && class316.field4324.field6417.field6514) {
                        field6304[field6309++] = var255;
                        return;
                    }
                    field6304[field6309++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field6301[--field6310];
                    field6304[field6309++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field6309 -= 2;
                    field6301[field6310++] = class126.method868(field6304[field6309], class372.field5455, field6304[field6309 + 1], 0);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field6304[--field6309];
                    field6310 -= 2;
                    int var258 = field6301[field6310];
                    int var259 = field6301[field6310 + 1];
                    class490 var260 = class310.method1796(0, class188.field2726, var259, (byte) 127);
                    field6301[field6310++] = var260.method2870(var258, 62, class134.field1947, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field6304[--field6309];
                    field6310 -= 2;
                    int var262 = field6301[field6310];
                    int var263 = field6301[field6310 + 1];
                    class490 var264 = class310.method1796(0, class188.field2726, var263, (byte) 127);
                    field6301[field6310++] = var264.method2865(-81, var262, class134.field1947, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field6309 -= 2;
                    String var265 = field6304[field6309];
                    String var266 = field6304[field6309 + 1];
                    if (field6301[--field6310] == 1) {
                        field6304[field6309++] = var265;
                        return;
                    }
                    field6304[field6309++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field6304[--field6309];
                    field6304[field6309++] = class427.method2528((byte) 121, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field6304[--field6309];
                    int var269 = field6301[--field6310];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6304[field6309++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field6301[--field6310];
                    field6301[field6310++] = class410.method2456(338, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field6301[--field6310];
                    field6301[field6310++] = class44.method414((char) var271, 48) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field6301[--field6310];
                    field6301[field6310++] = class67.method574((byte) -118, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field6301[--field6310];
                    field6301[field6310++] = class376.method2241((byte) 81, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field6304[--field6309];
                    if (var274 != null) {
                        field6301[field6310++] = var274.length();
                        return;
                    }
                    field6301[field6310++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field6304[--field6309];
                    field6310 -= 2;
                    int var276 = field6301[field6310];
                    int var277 = field6301[field6310 + 1];
                    field6304[field6309++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field6304[--field6309];
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
                    field6304[field6309++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field6304[--field6309];
                    field6310 -= 2;
                    int var284 = field6301[field6310];
                    int var285 = field6301[field6310 + 1];
                    field6301[field6310++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field6309 -= 2;
                    String var286 = field6304[field6309];
                    String var287 = field6304[field6309 + 1];
                    int var288 = field6301[--field6310];
                    field6301[field6310++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field6301[--field6310];
                    field6301[field6310++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field6301[--field6310];
                    field6301[field6310++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field6301[--field6310] != 0;
                    int var292 = field6301[--field6310];
                    field6304[field6309++] = class252.method1514(class372.field5455, var291, (long) var292, 0, (byte) 62);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field6304[--field6309];
                    int var294 = field6301[--field6310];
                    class490 var295 = class310.method1796(0, class188.field2726, var294, (byte) 127);
                    field6301[field6310++] = var295.method2876(var293, 255, class134.field1947);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field6301[--field6310];
                    field6304[field6309++] = class328.field4480.method3091(105, var296).field7506;
                    return;
                }
                if (arg0 == 4201) {
                    field6310 -= 2;
                    int var297 = field6301[field6310];
                    int var298 = field6301[field6310 + 1];
                    class508 var299 = class328.field4480.method3091(41, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field7502[var298 - 1] != null) {
                        field6304[field6309++] = var299.field7502[var298 - 1];
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6310 -= 2;
                    int var300 = field6301[field6310];
                    int var301 = field6301[field6310 + 1];
                    class508 var302 = class328.field4480.method3091(49, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field7483[var301 - 1] != null) {
                        field6304[field6309++] = var302.field7483[var301 - 1];
                        return;
                    }
                    field6304[field6309++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field6301[--field6310];
                    field6301[field6310++] = class328.field4480.method3091(124, var303).field7501;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field6301[--field6310];
                    field6301[field6310++] = class328.field4480.method3091(96, var304).field7511 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field6301[--field6310];
                    class508 var306 = class328.field4480.method3091(92, var305);
                    if (var306.field7530 == -1 && var306.field7487 >= 0) {
                        field6301[field6310++] = var306.field7487;
                        return;
                    }
                    field6301[field6310++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field6301[--field6310];
                    class508 var308 = class328.field4480.method3091(85, var307);
                    if (var308.field7530 >= 0 && var308.field7487 >= 0) {
                        field6301[field6310++] = var308.field7487;
                        return;
                    }
                    field6301[field6310++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field6301[--field6310];
                    field6301[field6310++] = class328.field4480.method3091(60, var309).field7472 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6310 -= 2;
                    int var310 = field6301[field6310];
                    int var311 = field6301[field6310 + 1];
                    class177 var312 = class177.field2622.method2033((byte) -50, var311);
                    if (var312.method1143((byte) -111)) {
                        field6304[field6309++] = class328.field4480.method3091(71, var310).method3041(2516, var311, var312.field2619);
                        return;
                    }
                    field6301[field6310++] = class328.field4480.method3091(50, var310).method3044(var311, -29012, var312.field2615);
                    return;
                }
                if (arg0 == 4209) {
                    field6310 -= 2;
                    int var313 = field6301[field6310];
                    int var314 = field6301[field6310 + 1] - 1;
                    class508 var315 = class328.field4480.method3091(63, var313);
                    if (var315.field7534 == var314) {
                        field6301[field6310++] = var315.field7481;
                        return;
                    }
                    if (var315.field7526 == var314) {
                        field6301[field6310++] = var315.field7507;
                        return;
                    }
                    field6301[field6310++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field6304[--field6309];
                    int var317 = field6301[--field6310];
                    class509.method3047(var316, -123, var317 == 1);
                    field6301[field6310++] = class525.field7763;
                    return;
                }
                if (arg0 == 4211) {
                    if (class170.field2530 != null && class131.field1924 < class525.field7763) {
                        field6301[field6310++] = class170.field2530[class131.field1924++] & 0xFFFF;
                        return;
                    }
                    field6301[field6310++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class131.field1924 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6310 -= 2;
                    int var318 = field6301[field6310];
                    int var319 = field6301[field6310 + 1];
                    class177 var320 = class177.field2622.method2033((byte) 102, var319);
                    if (var320.method1143((byte) -111)) {
                        field6304[field6309++] = class158.field2401.method2208(var318, -117).method645(var319, var320.field2619, 74);
                        return;
                    }
                    field6301[field6310++] = class158.field2401.method2208(var318, -93).method638(var319, var320.field2615, 5);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6310 -= 2;
                    int var321 = field6301[field6310];
                    int var322 = field6301[field6310 + 1];
                    class177 var323 = class177.field2622.method2033((byte) -102, var322);
                    if (var323.method1143((byte) -82)) {
                        field6304[field6309++] = class78.field1141.method2103(var321, true).method1364(255, var322, var323.field2619);
                        return;
                    }
                    field6301[field6310++] = class78.field1141.method2103(var321, true).method1373(var323.field2615, -101, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6310 -= 2;
                    int var324 = field6301[field6310];
                    int var325 = field6301[field6310 + 1];
                    class177 var326 = class177.field2622.method2033((byte) 101, var325);
                    if (var326.method1143((byte) -82)) {
                        field6304[field6309++] = class360.field5255.method2287((byte) 50, var324).method1746(var325, 0, var326.field2619);
                        return;
                    }
                    field6301[field6310++] = class360.field5255.method2287((byte) 50, var324).method1745(var325, (byte) 84, var326.field2615);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field6301[--field6310];
                class93 var328 = class501.field7375.method1305(var327, (byte) -84);
                if (var328.field1373 != null && var328.field1373.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field1329[0];
                    for (int var331 = 1; var331 < var328.field1373.length; var331++) {
                        if (var328.field1329[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field1329[var331];
                        }
                    }
                    field6301[field6310++] = var328.field1373[var329];
                    return;
                }
                field6301[field6310++] = var328.field1351;
                return;
            }
        } else {
            class150 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class60.method497(field6301[--field6310], (byte) -125);
            } else {
                var47 = arg1 ? field6314 : field6296;
            }
            if (arg0 == 1300) {
                int var48 = field6301[--field6310] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1007(1, field6304[--field6309], var48);
                    return;
                }
                field6309--;
                return;
            }
            if (arg0 == 1301) {
                field6310 -= 2;
                int var49 = field6301[field6310];
                int var50 = field6301[field6310 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2305 = null;
                    return;
                }
                var47.field2305 = class525.method3121(var50, var49, -9140);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field6301[--field6310];
                if (class174.field2591 != var51 && class523.field7738 != var51 && class28.field365 != var51) {
                    return;
                }
                var47.field2235 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2212 = field6301[--field6310];
                return;
            }
            if (arg0 == 1304) {
                var47.field2252 = field6301[--field6310];
                return;
            }
            if (arg0 == 1305) {
                var47.field2203 = field6304[--field6309];
                return;
            }
            if (arg0 == 1306) {
                var47.field2325 = field6304[--field6309];
                return;
            }
            if (arg0 == 1307) {
                var47.field2271 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field2219 = field6301[--field6310];
                var47.field2224 = field6301[--field6310];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field6301[--field6310];
                int var53 = field6301[--field6310];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1002(-14, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field2303 = field6304[--field6309];
                return;
            }
            if (arg0 == 1311) {
                var47.field2313 = field6301[--field6310];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field6310 -= 3;
                    var54 = field6301[field6310] - 1;
                    var55 = field6301[field6310 + 1];
                    var56 = field6301[field6310 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6310 -= 2;
                    var54 = 10;
                    var55 = field6301[field6310];
                    var56 = field6301[field6310 + 1];
                }
                if (var47.field2208 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2208 = new byte[11];
                    var47.field2239 = new byte[11];
                    var47.field2216 = new int[11];
                }
                var47.field2208[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2316 = false;
                    for (int var57 = 0; var57 < var47.field2208.length; var57++) {
                        if (var47.field2208[var57] != 0) {
                            var47.field2316 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2316 = true;
                }
                var47.field2239[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2256 = field6301[--field6310];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3734)
    private static final void method2542(String arg0, int arg1) {
        if (class68.field929 == 0 && !(!class58.field691 || class275.field3776) || class414.field6040) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class307.field4191.method2731(62, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class307.field4191.method2731(62, 0).length());
        } else if (var2.startsWith(class68.field926.method2731(62, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class68.field926.method2731(62, 0).length());
        } else if (var2.startsWith(class348.field5043.method2731(62, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class348.field5043.method2731(62, 0).length());
        } else if (var2.startsWith(class375.field5493.method2731(62, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class375.field5493.method2731(62, 0).length());
        } else if (var2.startsWith(class351.field5159.method2731(62, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class351.field5159.method2731(62, 0).length());
        } else if (var2.startsWith(class501.field7380.method2731(62, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class501.field7380.method2731(62, 0).length());
        } else if (var2.startsWith(class431.field6339.method2731(62, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class431.field6339.method2731(62, 0).length());
        } else if (var2.startsWith(class434.field6367.method2731(62, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class434.field6367.method2731(62, 0).length());
        } else if (var2.startsWith(class225.field3197.method2731(62, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class225.field3197.method2731(62, 0).length());
        } else if (var2.startsWith(class58.field709.method2731(62, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class58.field709.method2731(62, 0).length());
        } else if (var2.startsWith(class517.field7622.method2731(62, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class517.field7622.method2731(62, 0).length());
        } else if (var2.startsWith(class507.field7463.method2731(62, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class507.field7463.method2731(62, 0).length());
        } else if (class372.field5455 != 0) {
            if (var2.startsWith(class307.field4191.method2731(62, class372.field5455))) {
                var3 = 0;
                arg0 = arg0.substring(class307.field4191.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class68.field926.method2731(62, class372.field5455))) {
                var3 = 1;
                arg0 = arg0.substring(class68.field926.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class348.field5043.method2731(62, class372.field5455))) {
                var3 = 2;
                arg0 = arg0.substring(class348.field5043.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class375.field5493.method2731(62, class372.field5455))) {
                var3 = 3;
                arg0 = arg0.substring(class375.field5493.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class351.field5159.method2731(62, class372.field5455))) {
                var3 = 4;
                arg0 = arg0.substring(class351.field5159.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class501.field7380.method2731(62, class372.field5455))) {
                var3 = 5;
                arg0 = arg0.substring(class501.field7380.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class431.field6339.method2731(62, class372.field5455))) {
                var3 = 6;
                arg0 = arg0.substring(class431.field6339.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class434.field6367.method2731(62, class372.field5455))) {
                var3 = 7;
                arg0 = arg0.substring(class434.field6367.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class225.field3197.method2731(62, class372.field5455))) {
                var3 = 8;
                arg0 = arg0.substring(class225.field3197.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class58.field709.method2731(62, class372.field5455))) {
                var3 = 9;
                arg0 = arg0.substring(class58.field709.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class517.field7622.method2731(62, class372.field5455))) {
                var3 = 10;
                arg0 = arg0.substring(class517.field7622.method2731(62, class372.field5455).length());
            } else if (var2.startsWith(class507.field7463.method2731(62, class372.field5455))) {
                var3 = 11;
                arg0 = arg0.substring(class507.field7463.method2731(62, class372.field5455).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class433.field6352.method2731(62, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class433.field6352.method2731(62, 0).length());
        } else if (var4.startsWith(class89.field1291.method2731(62, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class89.field1291.method2731(62, 0).length());
        } else if (var4.startsWith(class97.field1464.method2731(62, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class97.field1464.method2731(62, 0).length());
        } else if (var4.startsWith(class275.field3766.method2731(62, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class275.field3766.method2731(62, 0).length());
        } else if (var4.startsWith(class158.field2387.method2731(62, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class158.field2387.method2731(62, 0).length());
        } else if (class372.field5455 != 0) {
            if (var4.startsWith(class433.field6352.method2731(62, class372.field5455))) {
                var5 = 1;
                arg0 = arg0.substring(class433.field6352.method2731(62, class372.field5455).length());
            } else if (var4.startsWith(class89.field1291.method2731(62, class372.field5455))) {
                var5 = 2;
                arg0 = arg0.substring(class89.field1291.method2731(62, class372.field5455).length());
            } else if (var4.startsWith(class97.field1464.method2731(62, class372.field5455))) {
                var5 = 3;
                arg0 = arg0.substring(class97.field1464.method2731(62, class372.field5455).length());
            } else if (var4.startsWith(class275.field3766.method2731(62, class372.field5455))) {
                var5 = 4;
                arg0 = arg0.substring(class275.field3766.method2731(62, class372.field5455).length());
            } else if (var4.startsWith(class158.field2387.method2731(62, class372.field5455))) {
                var5 = 5;
                arg0 = arg0.substring(class158.field2387.method2731(62, class372.field5455).length());
            }
        }
        field6293++;
        class491.method2878((byte) 92, class157.field2377);
        class481.field7027.method2302(-4, 0);
        int var6 = class481.field7027.field5719;
        if (arg1 == 5021) {
            class481.field7027.method2302(-4, 1);
        } else if (arg1 == 5022) {
            class481.field7027.method2302(-4, 2);
        } else {
            class481.field7027.method2302(-4, 0);
        }
        class481.field7027.method2302(-4, var3);
        class481.field7027.method2302(-4, var5);
        class423.method2516(arg0, class481.field7027, (byte) 119);
        class481.field7027.method2301(class481.field7027.field5719 - var6, -4595);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lof;I)V", line = 4020)
    private static final void method2543(class437 arg0, int arg1) {
        Object[] var2 = arg0.field6389;
        int var3 = (Integer) var2[0];
        class242 var4 = class336.method1925(var3, -123);
        if (var4 == null) {
            return;
        }
        field6298 = new int[var4.field3377];
        int var5 = 0;
        field6313 = new String[var4.field3383];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6387;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6388;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6390 == null ? -1 : arg0.field6390.field2277;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6397;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6390 == null ? -1 : arg0.field6390.field2248;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6391 == null ? -1 : arg0.field6391.field2277;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6391 == null ? -1 : arg0.field6391.field2248;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6398;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6384;
                }
                field6298[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6386;
                }
                field6313[var6++] = var9;
            }
        }
        field6320 = arg0.field6385;
        method2544(var4, arg1);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leh;I)V", line = 4098)
    private static final void method2544(class242 arg0, int arg1) {
        field6310 = 0;
        field6309 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3381;
        int[] var4 = arg0.field3386;
        byte var5 = -1;
        field6294 = 0;
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
                        method2541(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2547(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6301[field6310++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6301[field6310++] = class421.field6166.field1972[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class421.field6166.method930(true, field6301[--field6310], var8);
                } else if (var43 == 3) {
                    field6304[field6309++] = arg0.field3382[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6310 -= 2;
                    if (field6301[field6310 + 1] != field6301[field6310]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6310 -= 2;
                    if (field6301[field6310 + 1] == field6301[field6310]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6310 -= 2;
                    if (field6301[field6310] < field6301[field6310 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6310 -= 2;
                    if (field6301[field6310] > field6301[field6310 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6294 == 0) {
                        return;
                    }
                    class14 var9 = field6292[--field6294];
                    arg0 = var9.field206;
                    var3 = arg0.field3381;
                    var4 = arg0.field3386;
                    var2 = var9.field202;
                    field6298 = var9.field209;
                    field6313 = var9.field205;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6301[field6310++] = class421.field6166.method934(var10, -117);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class421.field6166.method935(0, var11, field6301[--field6310]);
                } else if (var43 == 31) {
                    field6310 -= 2;
                    if (field6301[field6310] <= field6301[field6310 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6310 -= 2;
                    if (field6301[field6310] >= field6301[field6310 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6301[field6310++] = field6298[var4[var2]];
                } else if (var43 == 34) {
                    field6298[var4[var2]] = field6301[--field6310];
                } else if (var43 == 35) {
                    field6304[field6309++] = field6313[var4[var2]];
                } else if (var43 == 36) {
                    field6313[var4[var2]] = field6304[--field6309];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6309 -= var12;
                    String var13 = class202.method1256(field6309, 0, field6304, var12);
                    field6304[field6309++] = var13;
                } else if (var43 == 38) {
                    field6310--;
                } else if (var43 == 39) {
                    field6309--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class242 var15 = class336.method1925(var14, -124);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3377];
                    String[] var17 = new String[var15.field3383];
                    for (int var18 = 0; var18 < var15.field3378; var18++) {
                        var16[var18] = field6301[field6310 + var18 - var15.field3378];
                    }
                    for (int var19 = 0; var19 < var15.field3376; var19++) {
                        var17[var19] = field6304[field6309 + var19 - var15.field3376];
                    }
                    field6310 -= var15.field3378;
                    field6309 -= var15.field3376;
                    class14 var20 = new class14();
                    var20.field206 = arg0;
                    var20.field202 = var2;
                    var20.field209 = field6298;
                    var20.field205 = field6313;
                    if (field6294 >= field6292.length) {
                        throw new RuntimeException();
                    }
                    field6292[field6294++] = var20;
                    arg0 = var15;
                    var3 = var15.field3381;
                    var4 = var15.field3386;
                    var2 = -1;
                    field6298 = var16;
                    field6313 = var17;
                } else if (var43 == 42) {
                    field6301[field6310++] = class263.field3635[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class263.field3635[var21] = field6301[--field6310];
                    class297.method1742(-10931, var21);
                    class489.field7143 |= class357.field5216[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6301[--field6310];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6302[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field6307[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6301[--field6310];
                    if (var28 < 0 || var28 >= field6302[var27]) {
                        throw new RuntimeException();
                    }
                    field6301[field6310++] = field6307[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6310 -= 2;
                    int var30 = field6301[field6310];
                    if (var30 < 0 || var30 >= field6302[var29]) {
                        throw new RuntimeException();
                    }
                    field6307[var29][var30] = field6301[field6310 + 1];
                } else if (var43 == 47) {
                    String var31 = class518.field7673[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6304[field6309++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class518.field7673[var32] = field6304[--field6309];
                    class62.method507(var32, (byte) -121);
                } else if (var43 == 51) {
                    class247 var33 = arg0.field3387[var4[var2]];
                    class500 var34 = (class500) var33.method1492((long) field6301[--field6310], 6340);
                    if (var34 != null) {
                        var2 += var34.field7369;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3374 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field3615).append(" ");
                for (int var41 = field6294 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6292[var41].field206.field3615).append(" ");
                }
                var40.append("op: ").append(var5);
                class320.method1861(var42, (byte) -123, var40.toString());
            } else {
                class49.method438("Clientscript error in: " + arg0.field3374, (byte) -105);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3374).append("\n");
                for (int var38 = field6294 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6292[var38].field206.field3374).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class320.method1861(var42, (byte) -108, var37.toString());
                class156.method1040(-21411, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZ)V", line = 4536)
    public static final void method2545(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "()V", line = 4541)
    public static void method2546() {
        field6298 = null;
        field6313 = null;
        field6302 = null;
        field6307 = null;
        field6301 = null;
        field6304 = null;
        field6292 = null;
        field6296 = null;
        field6314 = null;
        field6311 = null;
        field6300 = null;
        field6316 = null;
        field6319 = null;
        field6318 = null;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(IZ)V", line = 4565)
    private static final void method2547(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6301[field6310++] = class341.field4919;
                return;
            }
            if (arg0 == 5001) {
                field6310 -= 3;
                class341.field4919 = field6301[field6310];
                class209.field2904 = class264.method1586(field6301[field6310 + 1], -121);
                if (class209.field2904 == null) {
                    class209.field2904 = class439.field6490;
                }
                class508.field7553 = field6301[field6310 + 2];
                field6295++;
                class491.method2878((byte) 92, class302.field4140);
                class481.field7027.method2302(-4, class341.field4919);
                class481.field7027.method2302(-4, class209.field2904.field3863);
                class481.field7027.method2302(-4, class508.field7553);
                return;
            }
            if (arg0 == 5002) {
                field6309 -= 2;
                String var2 = field6304[field6309];
                String var3 = field6304[field6309 + 1];
                field6310 -= 2;
                int var4 = field6301[field6310];
                int var5 = field6301[field6310 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field6317++;
                class491.method2878((byte) 92, class450.field6618);
                class481.field7027.method2302(-4, class252.method1507(var2, true) + class252.method1507(var3, true) + 2);
                class481.field7027.method2349(var2, true);
                class481.field7027.method2302(-4, var4 - 1);
                class481.field7027.method2302(-4, var5);
                class481.field7027.method2349(var3, true);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field6301[--field6310];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class453.field6663[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field6304[field6309++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field6301[--field6310];
                int var9 = -1;
                if (var8 < 100 && class453.field6663[var8] != null) {
                    var9 = class340.field4903[var8];
                }
                field6301[field6310++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class209.field2904 == null) {
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = class209.field2904.field3863;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field6304[--field6309];
                method2542(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6309 -= 2;
                String var11 = field6304[field6309];
                String var12 = field6304[field6309 + 1];
                if (class68.field929 != 0 || (!class58.field691 || class275.field3776) && !class414.field6040) {
                    field6308++;
                    class491.method2878((byte) 92, class466.field6832);
                    class481.field7027.method2302(-4, 0);
                    int var13 = class481.field7027.field5719;
                    class481.field7027.method2349(var11, true);
                    class423.method2516(var12, class481.field7027, (byte) 113);
                    class481.field7027.method2301(class481.field7027.field5719 - var13, -4595);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field6301[--field6310];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class20.field267[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field6304[field6309++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field6301[--field6310];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class128.field1897[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field6304[field6309++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field6301[--field6310];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class140.field1987[var18];
                }
                field6301[field6310++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class316.field4324 == null || class316.field4324.field6404 == null) {
                    var20 = class491.field7167;
                } else {
                    var20 = class316.field4324.method2588((byte) 96, true);
                }
                field6304[field6309++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field6301[field6310++] = class508.field7553;
                return;
            }
            if (arg0 == 5017) {
                field6301[field6310++] = class199.field2822;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field6301[--field6310];
                int var22 = 0;
                if (var21 < 100 && class453.field6663[var21] != null) {
                    var22 = class340.field4903[var21];
                }
                field6301[field6310++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field6301[--field6310];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class147.field2127[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field6304[field6309++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class316.field4324 == null || class316.field4324.field6404 == null) {
                    var25 = class491.field7167;
                } else {
                    var25 = class316.field4324.method2581(false, (byte) 114);
                }
                field6304[field6309++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field6301[--field6310];
                field6304[field6309++] = class398.field5822.method1216(var26, false).field5224;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field6301[--field6310];
                class358 var28 = class398.field5822.method1216(var27, false);
                if (var28.field5228 == null) {
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = var28.field5228.length;
                return;
            }
            if (arg0 == 5052) {
                field6310 -= 2;
                int var29 = field6301[field6310];
                int var30 = field6301[field6310 + 1];
                class358 var31 = class398.field5822.method1216(var29, false);
                int var32 = var31.field5228[var30];
                field6301[field6310++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field6301[--field6310];
                class358 var34 = class398.field5822.method1216(var33, false);
                if (var34.field5217 == null) {
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = var34.field5217.length;
                return;
            }
            if (arg0 == 5054) {
                field6310 -= 2;
                int var35 = field6301[field6310];
                int var36 = field6301[field6310 + 1];
                field6301[field6310++] = class398.field5822.method1216(var35, false).field5217[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field6301[--field6310];
                field6304[field6309++] = class224.field3195.method1560(var37, -2621).method2168(0);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field6301[--field6310];
                class361 var39 = class224.field3195.method1560(var38, -2621);
                if (var39.field5279 == null) {
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = var39.field5279.length;
                return;
            }
            if (arg0 == 5057) {
                field6310 -= 2;
                int var40 = field6301[field6310];
                int var41 = field6301[field6310 + 1];
                field6301[field6310++] = class224.field3195.method1560(var40, -2621).field5279[var41];
                return;
            }
            if (arg0 == 5058) {
                field6311 = new class515();
                field6311.field7614 = field6301[--field6310];
                field6311.field7616 = class224.field3195.method1560(field6311.field7614, -2621);
                field6311.field7613 = new int[field6311.field7616.method2167((byte) -100)];
                return;
            }
            if (arg0 == 5059) {
                field6299++;
                class491.method2878((byte) 92, class9.field136);
                class481.field7027.method2302(-4, 0);
                int var42 = class481.field7027.field5719;
                class481.field7027.method2302(-4, 0);
                class481.field7027.method2355(1686288168, field6311.field7614);
                field6311.field7616.method2176(class481.field7027, -1, field6311.field7613);
                class481.field7027.method2301(class481.field7027.field5719 - var42, -4595);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field6304[--field6309];
                field6303++;
                class491.method2878((byte) 92, class296.field4076);
                class481.field7027.method2302(-4, 0);
                int var44 = class481.field7027.field5719;
                class481.field7027.method2349(var43, true);
                class481.field7027.method2355(1686288168, field6311.field7614);
                field6311.field7616.method2176(class481.field7027, -1, field6311.field7613);
                class481.field7027.method2301(class481.field7027.field5719 - var44, -4595);
                return;
            }
            if (arg0 == 5061) {
                field6299++;
                class491.method2878((byte) 92, class9.field136);
                class481.field7027.method2302(-4, 0);
                int var45 = class481.field7027.field5719;
                class481.field7027.method2302(-4, 1);
                class481.field7027.method2355(1686288168, field6311.field7614);
                field6311.field7616.method2176(class481.field7027, -1, field6311.field7613);
                class481.field7027.method2301(class481.field7027.field5719 - var45, -4595);
                return;
            }
            if (arg0 == 5062) {
                field6310 -= 2;
                int var46 = field6301[field6310];
                int var47 = field6301[field6310 + 1];
                field6301[field6310++] = class398.field5822.method1216(var46, false).field5221[var47];
                return;
            }
            if (arg0 == 5063) {
                field6310 -= 2;
                int var48 = field6301[field6310];
                int var49 = field6301[field6310 + 1];
                field6301[field6310++] = class398.field5822.method1216(var48, false).field5218[var49];
                return;
            }
            if (arg0 == 5064) {
                field6310 -= 2;
                int var50 = field6301[field6310];
                int var51 = field6301[field6310 + 1];
                if (var51 == -1) {
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = class398.field5822.method1216(var50, false).method2148(-1, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field6310 -= 2;
                int var52 = field6301[field6310];
                int var53 = field6301[field6310 + 1];
                if (var53 == -1) {
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = class398.field5822.method1216(var52, false).method2147(64, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field6301[--field6310];
                field6301[field6310++] = class224.field3195.method1560(var54, -2621).method2167((byte) -125);
                return;
            }
            if (arg0 == 5067) {
                field6310 -= 2;
                int var55 = field6301[field6310];
                int var56 = field6301[field6310 + 1];
                int var57 = class224.field3195.method1560(var55, -2621).method2174(101, var56).field655;
                field6301[field6310++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field6310 -= 2;
                int var58 = field6301[field6310];
                int var59 = field6301[field6310 + 1];
                field6311.field7613[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field6310 -= 2;
                int var60 = field6301[field6310];
                int var61 = field6301[field6310 + 1];
                field6311.field7613[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field6310 -= 3;
                int var62 = field6301[field6310];
                int var63 = field6301[field6310 + 1];
                int var64 = field6301[field6310 + 2];
                class361 var65 = class224.field3195.method1560(var62, -2621);
                if (var65.method2174(119, var63).field655 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6301[field6310++] = var65.method2179(0, var64, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field6304[--field6309];
                boolean var67 = field6301[--field6310] == 1;
                class472.method2779(false, var67, var66);
                field6301[field6310++] = class525.field7763;
                return;
            }
            if (arg0 == 5072) {
                if (class170.field2530 != null && class131.field1924 < class525.field7763) {
                    field6301[field6310++] = class170.field2530[class131.field1924++] & 0xFFFF;
                    return;
                }
                field6301[field6310++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class131.field1924 = 0;
                return;
            }
            if (arg0 == 5074) {
                field6299++;
                class491.method2878((byte) 92, class9.field136);
                class481.field7027.method2302(-4, 0);
                int var68 = class481.field7027.field5719;
                class481.field7027.method2302(-4, 2);
                class481.field7027.method2355(1686288168, field6311.field7614);
                field6311.field7616.method2176(class481.field7027, -1, field6311.field7613);
                class481.field7027.method2301(class481.field7027.field5719 - var68, -4595);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class310.field4231.method901(0, 86)) {
                    field6301[field6310++] = 1;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class310.field4231.method901(0, 82)) {
                    field6301[field6310++] = 1;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class310.field4231.method901(0, 81)) {
                    field6301[field6310++] = 1;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class469.method2743(field6301[--field6310], (byte) 1);
                return;
            }
            if (arg0 == 5201) {
                field6301[field6310++] = class83.method652(false);
                return;
            }
            if (arg0 == 5205) {
                class289.method1723(field6301[--field6310], -1, -1, (byte) 127, false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field6301[--field6310];
                class252 var70 = class350.method2091(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = var70.field3487;
                return;
            }
            if (arg0 == 5207) {
                class252 var71 = class350.method2100(field6301[--field6310]);
                if (var71 != null && var71.field3476 != null) {
                    field6304[field6309++] = var71.field3476;
                    return;
                }
                field6304[field6309++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6301[field6310++] = class284.field3921;
                field6301[field6310++] = class281.field3843;
                return;
            }
            if (arg0 == 5209) {
                field6301[field6310++] = class350.field5133 + class299.field4107;
                field6301[field6310++] = class80.field1216 + class350.field5124;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field6301[--field6310];
                class252 var73 = class350.method2100(var72);
                if (var73 == null) {
                    field6301[field6310++] = 0;
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = var73.field3479 >> 14 & 0x3FFF;
                field6301[field6310++] = var73.field3479 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field6301[--field6310];
                class252 var75 = class350.method2100(var74);
                if (var75 == null) {
                    field6301[field6310++] = 0;
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = var75.field3493 - var75.field3480;
                field6301[field6310++] = var75.field3492 - var75.field3494;
                return;
            }
            if (arg0 == 5212) {
                class109 var76 = class28.method159(16);
                if (var76 == null) {
                    field6301[field6310++] = -1;
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = var76.field1639;
                int var77 = var76.field1648 << 28 | class350.field5133 + var76.field1645 << 14 | class350.field5124 + var76.field1644;
                field6301[field6310++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class109 var78 = class480.method2823(125);
                if (var78 == null) {
                    field6301[field6310++] = -1;
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = var78.field1639;
                int var79 = var78.field1648 << 28 | class350.field5133 + var78.field1645 << 14 | class350.field5124 + var78.field1644;
                field6301[field6310++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field6301[--field6310];
                class252 var81 = class489.method2861((byte) -63);
                if (var81 != null) {
                    boolean var82 = var81.method1508(var80 & 0x3FFF, field6319, var80 >> 14 & 0x3FFF, var80 >> 28 & 0x3, 10593);
                    if (var82) {
                        class78.method632(field6319[2], field6319[1], -113);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6310 -= 2;
                int var83 = field6301[field6310];
                int var84 = field6301[field6310 + 1];
                class356 var85 = class350.method2098(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class252 var87 = (class252) var85.method2130(false); var87 != null; var87 = (class252) var85.method2131(true)) {
                    if (var87.field3487 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field6301[field6310++] = 1;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field6301[--field6310];
                class252 var89 = class350.method2100(var88);
                if (var89 == null) {
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = var89.field3484;
                return;
            }
            if (arg0 == 5220) {
                field6301[field6310++] = class373.field5474 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field6301[--field6310];
                class78.method632(var90 & 0x3FFF, var90 >> 14 & 0x3FFF, -107);
                return;
            }
            if (arg0 == 5222) {
                class252 var91 = class489.method2861((byte) -76);
                if (var91 != null) {
                    boolean var92 = var91.method1516((byte) -64, field6319, class350.field5133 + class299.field4107, class80.field1216 + class350.field5124);
                    if (var92) {
                        field6301[field6310++] = field6319[1];
                        field6301[field6310++] = field6319[2];
                        return;
                    }
                    field6301[field6310++] = -1;
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = -1;
                field6301[field6310++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6310 -= 2;
                int var93 = field6301[field6310];
                int var94 = field6301[field6310 + 1];
                class289.method1723(var93, var94 & 0x3FFF, var94 >> 14 & 0x3FFF, (byte) -34, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field6301[--field6310];
                class252 var96 = class489.method2861((byte) -84);
                if (var96 != null) {
                    boolean var97 = var96.method1508(var95 & 0x3FFF, field6319, var95 >> 14 & 0x3FFF, var95 >> 28 & 0x3, 10593);
                    if (var97) {
                        field6301[field6310++] = field6319[1];
                        field6301[field6310++] = field6319[2];
                        return;
                    }
                    field6301[field6310++] = -1;
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = -1;
                field6301[field6310++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field6301[--field6310];
                class252 var99 = class489.method2861((byte) -121);
                if (var99 != null) {
                    boolean var100 = var99.method1516((byte) -124, field6319, var98 >> 14 & 0x3FFF, var98 & 0x3FFF);
                    if (var100) {
                        field6301[field6310++] = field6319[1];
                        field6301[field6310++] = field6319[2];
                        return;
                    }
                    field6301[field6310++] = -1;
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = -1;
                field6301[field6310++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class328.method1901(field6301[--field6310], 127);
                return;
            }
            if (arg0 == 5227) {
                field6310 -= 2;
                int var101 = field6301[field6310];
                int var102 = field6301[field6310 + 1];
                class289.method1723(var101, var102 & 0x3FFF, var102 >> 14 & 0x3FFF, (byte) -125, true);
                return;
            }
            if (arg0 == 5228) {
                class471.field6883 = field6301[--field6310] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6301[field6310++] = class471.field6883 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field6301[--field6310];
                class439.method2611(var103, 85);
                return;
            }
            if (arg0 == 5231) {
                field6310 -= 2;
                int var104 = field6301[field6310];
                boolean var105 = field6301[field6310 + 1] == 1;
                if (class250.field3451 != null) {
                    class260 var106 = class250.field3451.method1492((long) var104, 6340);
                    if (var106 != null && !var105) {
                        var106.method1565(0);
                        return;
                    }
                    if (var106 == null && var105) {
                        class260 var107 = new class260();
                        class250.field3451.method1487(-42, (long) var104, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field6301[--field6310];
                if (class250.field3451 != null) {
                    class260 var109 = class250.field3451.method1492((long) var108, 6340);
                    field6301[field6310++] = var109 == null ? 0 : 1;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6310 -= 2;
                int var110 = field6301[field6310];
                boolean var111 = field6301[field6310 + 1] == 1;
                if (class268.field3704 != null) {
                    class260 var112 = class268.field3704.method1492((long) var110, 6340);
                    if (var112 != null && !var111) {
                        var112.method1565(0);
                        return;
                    }
                    if (var112 == null && var111) {
                        class260 var113 = new class260();
                        class268.field3704.method1487(-82, (long) var110, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field6301[--field6310];
                if (class268.field3704 != null) {
                    class260 var115 = class268.field3704.method1492((long) var114, 6340);
                    field6301[field6310++] = var115 == null ? 0 : 1;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6301[field6310++] = class350.field5111 == null ? -1 : class350.field5111.field3487;
                return;
            }
            if (arg0 == 5236) {
                field6310 -= 2;
                int var116 = field6301[field6310];
                int var117 = field6301[field6310 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class381.method2262(var116, var119, 255, var118);
                if (var120 < 0) {
                    field6301[field6310++] = -1;
                    return;
                }
                field6301[field6310++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6310 -= 2;
                int var121 = field6301[field6310];
                int var122 = field6301[field6310 + 1];
                class463.method2721(var121, var122, false, 3, (byte) 113);
                field6301[field6310++] = class147.field2140 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class147.field2140 != null) {
                    class463.method2721(-1, -1, false, class20.field269.field7643, (byte) 113);
                }
                return;
            }
            if (arg0 == 5302) {
                class68[] var123 = class121.method841(-37);
                field6301[field6310++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field6301[--field6310];
                class68[] var125 = class121.method841(-38);
                field6301[field6310++] = var125[var124].field924;
                field6301[field6310++] = var125[var124].field928;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class20.field269.field7642;
                int var127 = class20.field269.field7637;
                int var128 = -1;
                class68[] var129 = class121.method841(-93);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class68 var131 = var129[var130];
                    if (var131.field924 == var126 && var131.field928 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field6301[field6310++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field6301[field6310++] = class50.method445(-8);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field6301[--field6310];
                if (var132 >= 1 && var132 <= 2) {
                    class463.method2721(-1, -1, false, var132, (byte) 113);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6301[field6310++] = class20.field269.field7643;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field6301[--field6310];
                if (var133 >= 1 && var133 <= 2) {
                    class20.field269.field7643 = var133;
                    class20.field269.method1715((byte) -127, class202.field2840);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6309 -= 2;
                String var134 = field6304[field6309];
                String var135 = field6304[field6309 + 1];
                int var136 = field6301[--field6310];
                field6315++;
                class491.method2878((byte) 92, class466.field6837);
                class481.field7027.method2302(-4, class252.method1507(var134, true) + class252.method1507(var135, true) + 1);
                class481.field7027.method2349(var134, true);
                class481.field7027.method2349(var135, true);
                class481.field7027.method2302(-4, var136);
                return;
            }
            if (arg0 == 5401) {
                field6310 -= 2;
                class435.field6377[field6301[field6310]] = (short) class385.method2274(field6301[field6310 + 1], false);
                class328.field4480.method3090(109);
                class328.field4480.method3097(8);
                class158.field2401.method2207(-1);
                class361.method2180(true);
                return;
            }
            if (arg0 == 5405) {
                field6310 -= 2;
                int var137 = field6301[field6310];
                int var138 = field6301[field6310 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class270.field3722[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6310 -= 7;
                int var139 = field6301[field6310];
                int var140 = field6301[field6310 + 1] << 1;
                int var141 = field6301[field6310 + 2];
                int var142 = field6301[field6310 + 3];
                int var143 = field6301[field6310 + 4];
                int var144 = field6301[field6310 + 5];
                int var145 = field6301[field6310 + 6];
                if (var139 >= 0 && var139 < 2 && class270.field3722[var139] != null && var140 >= 0 && var140 < class270.field3722[var139].length) {
                    class270.field3722[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class270.field3722[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class270.field3722[field6301[--field6310]].length >> 1;
                field6301[field6310++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class147.field2140 != null) {
                    class463.method2721(-1, -1, false, class20.field269.field7643, (byte) 113);
                }
                if (class367.field5383 != null) {
                    class207.method1285((byte) -75);
                    System.exit(0);
                    return;
                }
                String var147 = class374.field5486 == null ? class194.method1209((byte) 125) : class374.field5486;
                class186.method1173(false, class202.field2840, class152.field2332 == 1, 3, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class167.field2511 != null) {
                    if (class167.field2511.field670 == null) {
                        var148 = class296.method1738(-19544, class167.field2511.field665);
                    } else {
                        var148 = (String) class167.field2511.field670;
                    }
                }
                field6304[field6309++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field6301[field6310++] = class504.field7417 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class147.field2140 != null) {
                    class463.method2721(-1, -1, false, class20.field269.field7643, (byte) 113);
                }
                String var149 = field6304[--field6309];
                boolean var150 = field6301[--field6310] == 1;
                String var151 = class194.method1209((byte) -100) + var149;
                class186.method1173(var150, class202.field2840, class152.field2332 == 1, 3, var151);
                return;
            }
            if (arg0 == 5422) {
                field6309 -= 2;
                String var152 = field6304[field6309];
                String var153 = field6304[field6309 + 1];
                int var154 = field6301[--field6310];
                if (var152.length() > 0) {
                    if (class214.field2998 == null) {
                        class214.field2998 = new String[class378.field5541[class323.field4400.field907]];
                    }
                    class214.field2998[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class256.field3550 == null) {
                        class256.field3550 = new String[class378.field5541[class323.field4400.field907]];
                    }
                    class256.field3550[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6304[--field6309]);
                return;
            }
            if (arg0 == 5424) {
                field6310 -= 11;
                class382.field5581 = field6301[field6310];
                class370.field5403 = field6301[field6310 + 1];
                class520.field7706 = field6301[field6310 + 2];
                class289.field4014 = field6301[field6310 + 3];
                class240.field3366 = field6301[field6310 + 4];
                class336.field4522 = field6301[field6310 + 5];
                class300.field4124 = field6301[field6310 + 6];
                class127.field1890 = field6301[field6310 + 7];
                class93.field1339 = field6301[field6310 + 8];
                class275.field3769 = field6301[field6310 + 9];
                class402.field5899 = field6301[field6310 + 10];
                class364.field5334.method747(class240.field3366, (byte) -68);
                class364.field5334.method747(class336.field4522, (byte) -68);
                class364.field5334.method747(class300.field4124, (byte) -68);
                class364.field5334.method747(class127.field1890, (byte) -68);
                class364.field5334.method747(class93.field1339, (byte) -68);
                class17.field233 = null;
                class531.field7824 = null;
                class483.field7052 = null;
                class457.field6711 = null;
                class89.field1306 = null;
                class98.field1487 = null;
                class258.field3592 = null;
                class316.field4327 = null;
                class476.field6942 = true;
                return;
            }
            if (arg0 == 5425) {
                class419.method2498(-74);
                class476.field6942 = false;
                return;
            }
            if (arg0 == 5426) {
                field6310 -= 2;
                class297.field4078 = field6301[field6310];
                class380.field5557 = field6301[field6310 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6310 -= 2;
                class6.field111 = field6301[field6310 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6310 -= 2;
                int var155 = field6301[field6310];
                int var156 = field6301[field6310 + 1];
                field6301[field6310++] = class177.method1141(true, var155, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class326.method1893(-105, false, field6304[--field6309]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class390.method2298("accountcreated", class202.field2840.field7425, (byte) 101);
                    return;
                } catch (Throwable var267) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6310 -= 4;
                int var157 = field6301[field6310];
                int var158 = field6301[field6310 + 1];
                int var159 = field6301[field6310 + 2];
                int var160 = field6301[field6310 + 3];
                class474.method2787(var159, (byte) 123, (var157 >> 14 & 0x3FFF) - class510.field7566, false, var160, (var157 & 0x3FFF) - class14.field204, var158);
                return;
            }
            if (arg0 == 5501) {
                field6310 -= 4;
                int var161 = field6301[field6310];
                int var162 = field6301[field6310 + 1];
                int var163 = field6301[field6310 + 2];
                int var164 = field6301[field6310 + 3];
                class268.method1604((byte) 126, (var161 >> 14 & 0x3FFF) - class510.field7566, var164, var162, var163, (var161 & 0x3FFF) - class14.field204);
                return;
            }
            if (arg0 == 5502) {
                field6310 -= 6;
                int var165 = field6301[field6310];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class401.field5886 = var165;
                int var166 = field6301[field6310 + 1];
                if (var166 + 1 >= class270.field3722[class401.field5886].length >> 1) {
                    throw new RuntimeException();
                }
                class216.field3009 = var166;
                class147.field2138 = 0;
                class149.field2155 = field6301[field6310 + 2];
                class440.field6505 = field6301[field6310 + 3];
                int var167 = field6301[field6310 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class59.field721 = var167;
                int var168 = field6301[field6310 + 5];
                if (var168 + 1 >= class270.field3722[class59.field721].length >> 1) {
                    throw new RuntimeException();
                }
                class393.field5745 = var168;
                class491.field7168 = 3;
                return;
            }
            if (arg0 == 5503) {
                class146.method977(26);
                return;
            }
            if (arg0 == 5504) {
                field6310 -= 2;
                class517.method3076(0, field6301[field6310], field6301[field6310 + 1], 3);
                return;
            }
            if (arg0 == 5505) {
                field6301[field6310++] = (int) class252.field3498 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6301[field6310++] = (int) class498.field7255 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class201.method1253((byte) -7);
                return;
            }
            if (arg0 == 5508) {
                class257.method1551(5890);
                return;
            }
            if (arg0 == 5509) {
                class65.method563((byte) -41);
                return;
            }
            if (arg0 == 5510) {
                class183.method1167(-15383);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field6301[--field6310];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class510.field7566;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class527.field7799) {
                    var172 = class527.field7799;
                }
                int var173 = var171 - class14.field204;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class422.field6182) {
                    var173 = class422.field6182;
                }
                class405.field5940 = (var172 << 7) + 64;
                class177.field2621 = (var173 << 7) + 64;
                class491.field7168 = 4;
                return;
            }
            if (arg0 == 5512) {
                class374.method2239((byte) -114);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6309 -= 2;
                String var174 = field6304[field6309];
                String var175 = field6304[field6309 + 1];
                int var176 = field6301[--field6310];
                if (class492.field7178 != 10) {
                    return;
                }
                if (class489.field7144 == 0 && class459.field6727 == 0 && class66.field906 == 0 && class86.field1266 == 0) {
                    class485.method2853(var176, var174, (byte) -98, var175);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class306.method1779(-6);
                return;
            }
            if (arg0 == 5602) {
                if (class459.field6727 == 0) {
                    class154.field2357 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field6310 -= 4;
                if (class492.field7178 != 10) {
                    return;
                }
                if (class489.field7144 == 0 && class459.field6727 == 0 && class66.field906 == 0 && class86.field1266 == 0) {
                    class85.method661(field6301[field6310], field6301[field6310 + 2], field6301[field6310 + 1], field6301[field6310 + 3], 27499);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field6309--;
                if (class492.field7178 != 10) {
                    return;
                }
                if (class489.field7144 == 0 && class459.field6727 == 0 && class66.field906 == 0 && class86.field1266 == 0) {
                    class411.method2464(class506.method3021(-1453, field6304[field6309]), 18059);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6309 -= 3;
                field6310 -= 7;
                if (class492.field7178 != 10) {
                    return;
                }
                if (class489.field7144 == 0 && class459.field6727 == 0 && class66.field906 == 0 && class86.field1266 == 0) {
                    class435.method2564(class506.method3021(-1453, field6304[field6309]), field6301[field6310], field6304[field6309 + 2], field6301[field6310 + 4] == 1, field6301[field6310 + 2], field6301[field6310 + 3], field6304[field6309 + 1], 96, field6301[field6310 + 1], field6301[field6310 + 5] == 1, field6301[field6310 + 6] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class66.field906 == 0) {
                    class377.field5530 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6301[field6310++] = class154.field2357;
                return;
            }
            if (arg0 == 5608) {
                field6301[field6310++] = class149.field2156;
                return;
            }
            if (arg0 == 5609) {
                field6301[field6310++] = class377.field5530;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field6304[field6309++] = class194.field2762.length > var177 ? class466.method2732(class194.field2762[var177], (byte) 114) : "";
                }
                class194.field2762 = null;
                return;
            }
            if (arg0 == 5611) {
                field6301[field6310++] = class438.field6405;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field6301[--field6310];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class20.field269.field7666 = var178;
                class80.method650(3);
                class20.field269.method1715((byte) -125, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6002) {
                class20.field269.method1710(field6301[--field6310] == 1, -105);
                class80.method650(3);
                class53.method459(1);
                class20.field269.method1715((byte) -124, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6003) {
                class20.field269.field7665 = field6301[--field6310] == 1;
                class53.method459(1);
                class20.field269.method1715((byte) -112, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6005) {
                class20.field269.field7649 = field6301[--field6310] == 1;
                class80.method650(3);
                class20.field269.method1715((byte) 76, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6006) {
                class20.field269.field7652 = field6301[--field6310] == 1;
                class269.field3721.method321(!class20.field269.field7652);
                class20.field269.method1715((byte) 54, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6007) {
                class20.field269.field7661 = field6301[--field6310];
                class20.field269.method1715((byte) -111, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6008) {
                class20.field269.field7667 = field6301[--field6310] == 1;
                class20.field269.method1715((byte) -109, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6009) {
                class20.field269.field7660 = field6301[--field6310] == 1;
                class80.method650(3);
                class20.field269.method1715((byte) 107, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6010) {
                class20.field269.field7664 = field6301[--field6310] == 1;
                class20.field269.method1715((byte) 123, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field6301[--field6310];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class20.field269.method3083(var179, (byte) -125, class152.field2332);
                class80.method650(3);
                class20.field269.method1715((byte) -114, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6012) {
                class20.field269.method3081(class152.field2332, field6301[--field6310] == 1, (byte) -101);
                class446.method2643(-3623);
                class136.method920((byte) -1);
                class20.field269.method1715((byte) -116, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6014) {
                class20.field269.field7636 = field6301[--field6310] == 1;
                class80.method650(3);
                class20.field269.method1715((byte) 24, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6015) {
                class20.field269.field7653 = field6301[--field6310] == 1;
                class80.method650(3);
                class20.field269.method1715((byte) 76, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field6301[--field6310];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class20.field269.field7670 = var180;
                class455.method2675(96, class152.field2332);
                class20.field269.method1715((byte) 19, class202.field2840);
                return;
            }
            if (arg0 == 6017) {
                class20.field269.field7646 = field6301[--field6310] == 1;
                class472.method2781(-82);
                class20.field269.method1715((byte) 48, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field6301[--field6310];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class20.field269.field7650 = var181;
                class20.field269.method1715((byte) 79, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field6301[--field6310];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class20.field269.field7671 != var182) {
                    if (class20.field269.field7671 == 0 && class173.field2570 != -1) {
                        class5.method31(false, class177.field2625, 0, (byte) 115, class173.field2570, var182);
                        class486.field7122 = false;
                    } else if (var182 == 0) {
                        class339.method2014((byte) 126);
                        class486.field7122 = false;
                    } else {
                        class244.method1478(var182, -100);
                    }
                    class20.field269.field7671 = var182;
                }
                class20.field269.method1715((byte) -111, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field6301[--field6310];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class20.field269.field7640 = var183;
                class20.field269.method1715((byte) -121, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6021) {
                class20.field269.field3980 = field6301[--field6310] == 1;
                class53.method459(1);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field6301[--field6310];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class261.field3627 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class292.method1732(2794, var184);
                class20.field269.method1715((byte) 32, class202.field2840);
                class143.field2052 = false;
                field6301[field6310++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field6301[--field6310];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class20.field269.field7663 = var186;
                class20.field269.method1715((byte) 108, class202.field2840);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field6301[--field6310];
                if (var187 < 0 || var187 > class76.method607(class261.field3627, -20636)) {
                    var187 = 0;
                }
                class20.field269.field7669 = var187;
                class20.field269.method1715((byte) -112, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field6301[--field6310];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class323.method1867(var188 == 1, 3);
                return;
            }
            if (arg0 == 6028) {
                class20.field269.field7638 = field6301[--field6310] != 0;
                class20.field269.method1715((byte) 30, class202.field2840);
                return;
            }
            if (arg0 == 6029) {
                class20.field269.field7661 = field6301[--field6310];
                class20.field269.method1715((byte) -107, class202.field2840);
                return;
            }
            if (arg0 == 6030) {
                class20.field269.field7631 = field6301[--field6310] != 0;
                class20.field269.method1715((byte) -121, class202.field2840);
                class80.method650(3);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field6301[--field6310];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class455.method2675(108, var189);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field6301[--field6310];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class20.field269.field7662 = var190;
                class20.field269.method1715((byte) 36, class202.field2840);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field6301[--field6310];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class20.field269.field7635 = var191;
                class20.field269.method1715((byte) -116, class202.field2840);
                return;
            }
            if (arg0 == 6034) {
                class20.field269.field7632 = field6301[--field6310] == 1;
                class20.field269.method1715((byte) 121, class202.field2840);
                class446.method2643(-3623);
                class143.field2052 = false;
                return;
            }
            if (arg0 == 6035) {
                class20.field269.field3982 = field6301[--field6310] == 1;
                class80.method650(3);
                class53.method459(1);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6301[field6310++] = class20.field269.field7666;
                return;
            }
            if (arg0 == 6102) {
                field6301[field6310++] = class20.field269.method1713(class152.field2332, -22186) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6301[field6310++] = class20.field269.field7665 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6301[field6310++] = class20.field269.field7649 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field6301[field6310++] = class20.field269.field7652 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6301[field6310++] = class20.field269.field7661;
                return;
            }
            if (arg0 == 6108) {
                field6301[field6310++] = class20.field269.field7667 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field6301[field6310++] = class20.field269.field7660 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6301[field6310++] = class20.field269.field7664 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6301[field6310++] = class20.field269.method3085(class152.field2332, (byte) 123);
                return;
            }
            if (arg0 == 6112) {
                field6301[field6310++] = class20.field269.method3084((byte) -105, class152.field2332) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6301[field6310++] = class20.field269.field7636 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6301[field6310++] = class20.field269.field7653 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6301[field6310++] = class20.field269.field7670;
                return;
            }
            if (arg0 == 6117) {
                field6301[field6310++] = class20.field269.field7646 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6301[field6310++] = class20.field269.field7650;
                return;
            }
            if (arg0 == 6119) {
                field6301[field6310++] = class20.field269.field7671;
                return;
            }
            if (arg0 == 6120) {
                field6301[field6310++] = class20.field269.field7640;
                return;
            }
            if (arg0 == 6121) {
                field6301[field6310++] = class269.field3721.method309() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field6301[field6310++] = class122.method861((byte) -73);
                return;
            }
            if (arg0 == 6124) {
                field6301[field6310++] = class20.field269.field7663;
                return;
            }
            if (arg0 == 6125) {
                field6301[field6310++] = class20.field269.field7669;
                return;
            }
            if (arg0 == 6126) {
                field6301[field6310++] = class269.field3721.method287() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field6301[field6310++] = class20.field269.field7656 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6301[field6310++] = class20.field269.field7638 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6301[field6310++] = class20.field269.field7661;
                return;
            }
            if (arg0 == 6130) {
                field6301[field6310++] = class20.field269.field7631 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6301[field6310++] = class152.field2332;
                return;
            }
            if (arg0 == 6132) {
                field6301[field6310++] = class20.field269.field7662;
                return;
            }
            if (arg0 == 6133) {
                field6301[field6310++] = class504.field7417 == 1 || class504.field7417 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field6301[field6310++] = class76.method607(class261.field3627, -20636);
                return;
            }
            if (arg0 == 6135) {
                field6301[field6310++] = class20.field269.field7635;
                return;
            }
            if (arg0 == 6136) {
                field6301[field6310++] = class20.field269.field7632 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var192 = true;
                try {
                    var192 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var268) {
                }
                field6301[field6310++] = var192 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6310 -= 2;
                class526.field7791 = (short) field6301[field6310];
                if (class526.field7791 <= 0) {
                    class526.field7791 = 256;
                }
                class174.field2590 = (short) field6301[field6310 + 1];
                if (class174.field2590 <= 0) {
                    class174.field2590 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6310 -= 2;
                class360.field5254 = (short) field6301[field6310];
                if (class360.field5254 <= 0) {
                    class360.field5254 = 256;
                }
                class131.field1923 = (short) field6301[field6310 + 1];
                if (class131.field1923 <= 0) {
                    class131.field1923 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6310 -= 4;
                class272.field3752 = (short) field6301[field6310];
                if (class272.field3752 <= 0) {
                    class272.field3752 = 1;
                }
                class433.field6353 = (short) field6301[field6310 + 1];
                if (class433.field6353 <= 0) {
                    class433.field6353 = 32767;
                } else if (class433.field6353 < class272.field3752) {
                    class433.field6353 = class272.field3752;
                }
                class353.field5181 = (short) field6301[field6310 + 2];
                if (class353.field5181 <= 0) {
                    class353.field5181 = 1;
                }
                class407.field5958 = (short) field6301[field6310 + 3];
                if (class407.field5958 <= 0) {
                    class407.field5958 = 32767;
                    return;
                }
                if (class407.field5958 < class353.field5181) {
                    class407.field5958 = class353.field5181;
                }
                return;
            }
            if (arg0 == 6203) {
                class84.method654(class510.field7564.field2204, 0, 0, class510.field7564.field2322, -125, false);
                field6301[field6310++] = class336.field4533;
                field6301[field6310++] = class13.field200;
                return;
            }
            if (arg0 == 6204) {
                field6301[field6310++] = class360.field5254;
                field6301[field6310++] = class131.field1923;
                return;
            }
            if (arg0 == 6205) {
                field6301[field6310++] = class526.field7791;
                field6301[field6310++] = class174.field2590;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6301[field6310++] = (int) (class246.method1483(5957) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6301[field6310++] = (int) (class246.method1483(5957) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6310 -= 3;
                int var193 = field6301[field6310];
                int var194 = field6301[field6310 + 1];
                int var195 = field6301[field6310 + 2];
                field6300.clear();
                field6300.set(11, 12);
                field6300.set(var195, var194, var193);
                field6301[field6310++] = (int) (field6300.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field6300.clear();
                field6300.setTime(new Date(class246.method1483(5957)));
                field6301[field6310++] = field6300.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var196 = field6301[--field6310];
                boolean var197 = true;
                if (var196 < 0) {
                    var197 = (var196 + 1) % 4 == 0;
                } else if (var196 < 1582) {
                    var197 = var196 % 4 == 0;
                } else if (var196 % 4 != 0) {
                    var197 = false;
                } else if (var196 % 100 != 0) {
                    var197 = true;
                } else if (var196 % 400 != 0) {
                    var197 = false;
                }
                field6301[field6310++] = var197 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6301[field6310++] = class388.method2290((byte) 12) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6301[field6310++] = class381.method2264(12648) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class492.field7178 == 10 && class489.field7144 == 0 && class459.field6727 == 0 && class66.field906 == 0) {
                    field6301[field6310++] = class266.method1597(-29218) == -1 ? 0 : 1;
                    return;
                }
                field6301[field6310++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class61 var198 = class441.method2625(true);
                if (var198 != null) {
                    field6301[field6310++] = var198.field760;
                    field6301[field6310++] = var198.field3399;
                    field6304[field6309++] = var198.field758;
                    class229 var199 = var198.method504(24857);
                    field6301[field6310++] = var199.field3248;
                    field6304[field6309++] = var199.field3247;
                    field6301[field6310++] = var198.field3393;
                    field6301[field6310++] = var198.field755;
                    return;
                }
                field6301[field6310++] = -1;
                field6301[field6310++] = 0;
                field6304[field6309++] = "";
                field6301[field6310++] = 0;
                field6304[field6309++] = "";
                field6301[field6310++] = 0;
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class61 var200 = class420.method2502(1407);
                if (var200 != null) {
                    field6301[field6310++] = var200.field760;
                    field6301[field6310++] = var200.field3399;
                    field6304[field6309++] = var200.field758;
                    class229 var201 = var200.method504(24857);
                    field6301[field6310++] = var201.field3248;
                    field6304[field6309++] = var201.field3247;
                    field6301[field6310++] = var200.field3393;
                    field6301[field6310++] = var200.field755;
                    return;
                }
                field6301[field6310++] = -1;
                field6301[field6310++] = 0;
                field6304[field6309++] = "";
                field6301[field6310++] = 0;
                field6304[field6309++] = "";
                field6301[field6310++] = 0;
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var202 = field6301[--field6310];
                if (class492.field7178 == 10 && class489.field7144 == 0 && class459.field6727 == 0 && class66.field906 == 0) {
                    field6301[field6310++] = class345.method2046(var202, 125) ? 1 : 0;
                    return;
                }
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class20.field269.field7645 = field6301[--field6310];
                class20.field269.method1715((byte) -118, class202.field2840);
                return;
            }
            if (arg0 == 6505) {
                field6301[field6310++] = class20.field269.field7645;
                return;
            }
            if (arg0 == 6506) {
                int var203 = field6301[--field6310];
                class61 var204 = class310.method1797(false, var203);
                if (var204 != null) {
                    field6301[field6310++] = var204.field3399;
                    field6304[field6309++] = var204.field758;
                    class229 var205 = var204.method504(24857);
                    field6301[field6310++] = var205.field3248;
                    field6304[field6309++] = var205.field3247;
                    field6301[field6310++] = var204.field3393;
                    field6301[field6310++] = var204.field755;
                    return;
                }
                field6301[field6310++] = -1;
                field6304[field6309++] = "";
                field6301[field6310++] = 0;
                field6304[field6309++] = "";
                field6301[field6310++] = 0;
                field6301[field6310++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field6310 -= 4;
                int var206 = field6301[field6310];
                boolean var207 = field6301[field6310 + 1] == 1;
                int var208 = field6301[field6310 + 2];
                boolean var209 = field6301[field6310 + 3] == 1;
                class26.method151(var208, var206, var209, (byte) -64, var207);
                return;
            }
            if (arg0 == 6508) {
                class472.method2782(20728);
                return;
            }
            if (arg0 == 6509) {
                if (class492.field7178 != 10) {
                    return;
                }
                class60.field752 = field6301[--field6310] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class20.field269.field7654 = field6301[--field6310] == 1;
                class20.field269.method1715((byte) 79, class202.field2840);
                return;
            }
            if (arg0 == 6601) {
                field6301[field6310++] = class20.field269.field7654 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class423.field6196 == class138.field1976) {
            if (arg0 == 6700) {
                int var210 = class212.field2960.method1486((byte) -81);
                if (class188.field2723 != -1) {
                    var210++;
                }
                field6301[field6310++] = var210;
                return;
            }
            if (arg0 == 6701) {
                int var211 = field6301[--field6310];
                if (class188.field2723 != -1) {
                    if (var211 == 0) {
                        field6301[field6310++] = class188.field2723;
                        return;
                    }
                    var211--;
                }
                class295 var212 = (class295) class212.field2960.method1494(0);
                while (var211-- > 0) {
                    var212 = (class295) class212.field2960.method1493((byte) 104);
                }
                field6301[field6310++] = var212.field4055;
                return;
            }
            if (arg0 == 6702) {
                int var213 = field6301[--field6310];
                if (class495.field7226[var213] == null) {
                    field6304[field6309++] = "";
                    return;
                }
                String var214 = class495.field7226[var213][0].field2300;
                if (var214 == null) {
                    field6304[field6309++] = "";
                    return;
                }
                field6304[field6309++] = var214.substring(0, var214.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var215 = field6301[--field6310];
                if (class495.field7226[var215] == null) {
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = class495.field7226[var215].length;
                return;
            }
            if (arg0 == 6704) {
                field6310 -= 2;
                int var216 = field6301[field6310];
                int var217 = field6301[field6310 + 1];
                if (class495.field7226[var216] == null) {
                    field6304[field6309++] = "";
                    return;
                }
                String var218 = class495.field7226[var216][var217].field2300;
                if (var218 == null) {
                    field6304[field6309++] = "";
                    return;
                }
                field6304[field6309++] = var218;
                return;
            }
            if (arg0 == 6705) {
                field6310 -= 2;
                int var219 = field6301[field6310];
                int var220 = field6301[field6310 + 1];
                if (class495.field7226[var219] == null) {
                    field6301[field6310++] = 0;
                    return;
                }
                field6301[field6310++] = class495.field7226[var219][var220].field2269;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field6310 -= 3;
                int var221 = field6301[field6310];
                int var222 = field6301[field6310 + 1];
                int var223 = field6301[field6310 + 2];
                class462.method2714(var221 << 16 | var222, "", -31433, var223, 1);
                return;
            }
            if (arg0 == 6708) {
                field6310 -= 3;
                int var224 = field6301[field6310];
                int var225 = field6301[field6310 + 1];
                int var226 = field6301[field6310 + 2];
                class462.method2714(var224 << 16 | var225, "", -31433, var226, 2);
                return;
            }
            if (arg0 == 6709) {
                field6310 -= 3;
                int var227 = field6301[field6310];
                int var228 = field6301[field6310 + 1];
                int var229 = field6301[field6310 + 2];
                class462.method2714(var227 << 16 | var228, "", -31433, var229, 3);
                return;
            }
            if (arg0 == 6710) {
                field6310 -= 3;
                int var230 = field6301[field6310];
                int var231 = field6301[field6310 + 1];
                int var232 = field6301[field6310 + 2];
                class462.method2714(var230 << 16 | var231, "", -31433, var232, 4);
                return;
            }
            if (arg0 == 6711) {
                field6310 -= 3;
                int var233 = field6301[field6310];
                int var234 = field6301[field6310 + 1];
                int var235 = field6301[field6310 + 2];
                class462.method2714(var233 << 16 | var234, "", -31433, var235, 5);
                return;
            }
            if (arg0 == 6712) {
                field6310 -= 3;
                int var236 = field6301[field6310];
                int var237 = field6301[field6310 + 1];
                int var238 = field6301[field6310 + 2];
                class462.method2714(var236 << 16 | var237, "", -31433, var238, 6);
                return;
            }
            if (arg0 == 6713) {
                field6310 -= 3;
                int var239 = field6301[field6310];
                int var240 = field6301[field6310 + 1];
                int var241 = field6301[field6310 + 2];
                class462.method2714(var239 << 16 | var240, "", -31433, var241, 7);
                return;
            }
            if (arg0 == 6714) {
                field6310 -= 3;
                int var242 = field6301[field6310];
                int var243 = field6301[field6310 + 1];
                int var244 = field6301[field6310 + 2];
                class462.method2714(var242 << 16 | var243, "", -31433, var244, 8);
                return;
            }
            if (arg0 == 6715) {
                field6310 -= 3;
                int var245 = field6301[field6310];
                int var246 = field6301[field6310 + 1];
                int var247 = field6301[field6310 + 2];
                class462.method2714(var245 << 16 | var246, "", -31433, var247, 9);
                return;
            }
            if (arg0 == 6716) {
                field6310 -= 3;
                int var248 = field6301[field6310];
                int var249 = field6301[field6310 + 1];
                int var250 = field6301[field6310 + 2];
                class462.method2714(var248 << 16 | var249, "", -31433, var250, 10);
                return;
            }
            if (arg0 == 6717) {
                field6310 -= 3;
                int var251 = field6301[field6310];
                int var252 = field6301[field6310 + 1];
                int var253 = field6301[field6310 + 2];
                class150 var254 = class525.method3121(var253, var251 << 16 | var252, -9140);
                class88.method668((byte) -70);
                class188 var255 = client.method1228(var254);
                class26.method150(var254, -8605, var255.method1182((byte) 104), var255.field2720);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var256 = field6301[--field6310];
                class146 var257 = class362.field5299.method141(var256, false);
                if (var257.field2082 == null) {
                    field6304[field6309++] = "";
                    return;
                }
                field6304[field6309++] = var257.field2082;
                return;
            }
            if (arg0 == 6801) {
                int var258 = field6301[--field6310];
                class146 var259 = class362.field5299.method141(var258, false);
                field6301[field6310++] = var259.field2113;
                return;
            }
            if (arg0 == 6802) {
                int var260 = field6301[--field6310];
                class146 var261 = class362.field5299.method141(var260, false);
                field6301[field6310++] = var261.field2092;
                return;
            }
            if (arg0 == 6803) {
                int var262 = field6301[--field6310];
                class146 var263 = class362.field5299.method141(var262, false);
                field6301[field6310++] = var263.field2070;
                return;
            }
            if (arg0 == 6804) {
                field6310 -= 2;
                int var264 = field6301[field6310];
                int var265 = field6301[field6310 + 1];
                class177 var266 = class177.field2622.method2033((byte) 83, var265);
                if (var266.method1143((byte) -55)) {
                    field6304[field6309++] = class362.field5299.method141(var264, false).method983(var265, var266.field2619, (byte) 87);
                    return;
                }
                field6301[field6310++] = class362.field5299.method141(var264, false).method979(1386, var266.field2615, var265);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V", line = 7544)
    public static final void method2548(int arg0) {
        if (arg0 == -1 || !class256.method1534(32554, arg0)) {
            return;
        }
        class150[] var1 = class495.field7226[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class150 var3 = var1[var2];
            if (var3.field2184 != null) {
                class437 var4 = new class437();
                var4.field6390 = var3;
                var4.field6389 = var3.field2184;
                method2543(var4, 2000000);
            }
        }
    }
}
