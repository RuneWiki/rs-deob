import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class137 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Z")
    private boolean field3112 = false;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lid;")
    public static class60 field3104 = class11.method72("<col=80ff00>", (byte) 120);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3102 = 0;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Lid;")
    private static class60 field3132 = class11.method72("Fehler beim Laden Ihres Spielcharakters)3", (byte) 108);

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Lid;")
    private static class60 field3128 = class11.method72("Bitte starten Sie eine Mitgliedschaft", (byte) -64);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Z")
    public static boolean field3139;

    @OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3131++;
        class48.field1266 = true;
        class99.field2411 = true;
    }

    @OriginalMember(owner = "client!te", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3111++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method1065(int arg0) {
        class139.field3151 = class33.field778;
        class145.field3266 = class141.field3208;
        class41.field1087 = client.field501;
        class129.field2953 = class60.field1491;
        class64.field1603 = class1.field37;
        class23.field572 = class85.field2135;
        class80.field1961 = class56.field1408;
        class13.field231 = class23.field570;
        class7.field112 = class132.field3008;
        class113.field2704 = class93.field2305;
        class153.field3433 = class8.field118;
        class4.field66 = class62.field1549;
        class80.field1963 = class56.field1408;
        class136.field3079 = class93.field2294;
        class80.field1965 = class62.field1562;
        class80.field1992 = class64.field1605;
        class85.field2117 = class152.field3419;
        class80.field1947 = class56.field1408;
        class46.field1226 = class145.field3261;
        class128.field2927 = class141.field3204;
        class4.field71 = class25.field617;
        class31.field716 = class66.field1620;
        class128.field2924 = class48.field1268;
        class53.field1346 = field3128;
        class74.field1791 = class90.field2258;
        class157.field3612 = class48.field1270;
        class80.field1944 = class56.field1408;
        class90.field2229 = class77.field1877;
        class131.field2985 = class112.field2695;
        class125.field2876 = class102.field2477;
        class4.field77 = class55.field1373;
        class155.field3516 = class15.field360;
        class133.field3013 = class132.field3010;
        class148.field3331 = class158.field3626;
        class101.field2466 = class155.field3545;
        class105.field2576 = class111.field2674;
        class19.field465 = class47.field1245;
        class80.field1984 = class11.field190;
        class99.field2419 = class81.field2007;
        class148.field3373 = class7.field108;
        class53.field1348 = class52.field1306;
        class5.field79 = class23.field555;
        class100.field2426 = class140.field3184;
        class81.field2023 = class133.field3040;
        class13.field241 = class22.field518;
        class61.field1513 = class62.field1560;
        class12.field198 = class64.field1592;
        class153.field3450 = class100.field2440;
        class124.field2861 = class72.field1746;
        class4.field64 = class42.field1121;
        class17.field407 = class44.field1171;
        class42.field1118 = class146.field3297;
        class80.field1972 = class7.field101;
        class52.field1307 = class105.field2575;
        class80.field1958 = class56.field1408;
        class62.field1552 = class146.field3276;
        class80.field1990 = class101.field2456;
        class23.field573 = class43.field1136;
        class45.field1193 = class141.field3214;
        class136.field3092 = class93.field2294;
        class23.field571 = class56.field1408;
        class133.field3043 = class73.field1752;
        class17.field417 = class148.field3375;
        class80.field1968 = class56.field1408;
        class40.field1012 = class25.field611;
        class7.field105 = class93.field2301;
        class75.field1810 = class154.field3466;
        class133.field3026 = class80.field1998;
        class80.field1985 = class46.field1203;
        class80.field2002 = class131.field2981;
        class80.field1962 = class101.field2456;
        class125.field2878 = class90.field2235;
        class12.field221 = field3132;
        class24.field592 = class54.field1352;
        class80.field1989 = class140.field3187;
        class28.field658 = class12.field200;
        class80.field1955 = class56.field1408;
        class14.field255 = class139.field3180;
        class139.field3179 = class18.field448;
        class4.field76 = class66.field1629;
        class4.field70 = class87.field2191;
        class1.field28 = class97.field2383;
        class66.field1630 = class90.field2257;
        class40.field1060 = class120.field2758;
        class34.field793 = class129.field2948;
        class98.field2403 = class133.field3034;
        class155.field3509 = class99.field2412;
        class155.field3528 = class38.field922;
        class9.field149 = class35.field888;
        class81.field2014 = class90.field2254;
        class12.field215 = class32.field758;
        class50.field1287 = class90.field2234;
        class136.field3077 = class8.field119;
        field3137++;
        class124.field2841 = class78.field1926;
        class89.field2220 = class53.field1345;
        class80.field2000 = class56.field1408;
        class80.field1946 = class56.field1408;
        class28.field682 = class73.field1772;
        class136.field3083 = class121.field2780;
        class89.field2211 = class54.field1356;
        class50.field1286 = class136.field3097;
        class82.field2066 = class8.field122;
        class72.field1749 = class153.field3430;
        class81.field2029 = class63.field1572;
        class43.field1156 = class60.field1465;
        class86.field2151 = class106.field2620;
        class80.field1950 = class56.field1408;
        class80.field1987 = class56.field1408;
        class14.field294 = class64.field1605;
        class135.field3069 = class87.field2195;
        class14.field271 = class31.field727;
        class146.field3291 = class129.field2946;
        class41.field1105 = class31.field732;
        class14.field314 = class31.field727;
        class80.field1964 = class56.field1408;
        class80.field1977 = class56.field1408;
        class16.field389 = class105.field2581;
        class52.field1329 = class97.field2389;
        class24.field587 = class56.field1399;
        class41.field1106 = class100.field2444;
        class74.field1790 = class14.field248;
        class45.field1194 = class141.field3214;
        class139.field3176 = class12.field208;
        class23.field568 = class39.field935;
        class115.field2721 = class90.field2241;
        class80.field1957 = class106.field2628;
        class140.field3188 = class98.field2401;
        class80.field2001 = class56.field1408;
        class124.field2870 = class63.field1568;
        if (arg0 <= 119) {
            providesignlink(null);
        }
        class148.field3326 = class93.field2304;
        class14.field247 = class64.field1605;
        class86.field2145 = class155.field3502;
        class77.field1884 = class140.field3191;
        class80.field1959 = class80.field1967;
        class153.field3438 = class87.field2196;
        class32.field750 = class10.field178;
        class104.field2553 = class121.field2783;
        class113.field2706 = class93.field2305;
        class98.field2398 = class13.field230;
        class80.field1982 = class56.field1408;
        class23.field553 = class7.field106;
        class82.field2067 = class1.field11;
        class124.field2854 = class56.field1395;
        class23.field559 = class154.field3458;
        class121.field2775 = class135.field3061;
        class80.field1980 = class46.field1203;
        class78.field1925 = class106.field2617;
        class106.field2616 = class56.field1405;
        class56.field1398 = class34.field795;
        class1.field22 = class77.field1887;
        class77.field1893 = class18.field442;
        class80.field1966 = class56.field1408;
        class80.field1971 = class56.field1408;
        class62.field1565 = class104.field2544;
        class47.field1242 = class86.field2160;
        class146.field3277 = class50.field1277;
        class111.field2664 = class152.field3403;
        class80.field2004 = class56.field1408;
        class86.field2144 = class1.field27;
        class109.field2658 = class144.field3243;
        class80.field1974 = class55.field1382;
        class111.field2667 = class152.field3403;
        class47.field1246 = class39.field924;
        class30.field704 = class56.field1400;
        class104.field2554 = class9.field150;
        class80.field1969 = class56.field1408;
        class158.field3619 = class41.field1103;
        class125.field2880 = class41.field1083;
        class80.field2003 = class97.field2387;
        class48.field1255 = class1.field36;
        class139.field3173 = class85.field2086;
        class100.field2441 = class101.field2460;
        class152.field3416 = class120.field2750;
        class33.field776 = class128.field2934;
        class105.field2586 = class111.field2674;
        class42.field1135 = class43.field1137;
        class43.field1154 = class41.field1077;
        class63.field1573 = class32.field755;
        class80.field1996 = class129.field2955;
        class151.field3391 = class133.field3029;
        class73.field1767 = class22.field549;
        class148.field3374 = class148.field3327;
        class103.field2515 = class48.field1262;
        class53.field1349 = class52.field1304;
        class61.field1523 = class55.field1376;
        class80.field1960 = class56.field1408;
        class129.field2942 = class8.field125;
        class75.field1800 = class81.field2015;
        class14.field287 = class64.field1605;
        class34.field803 = class46.field1210;
        class97.field2385 = class141.field3229;
        class80.field1951 = class56.field1408;
        class121.field2771 = class39.field933;
        class14.field263 = class53.field1343;
        class1.field18 = class85.field2110;
        class74.field1783 = class90.field2258;
        if (field3139) {
        }
    }

    @OriginalMember(owner = "client!te", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3110++;
        if (class116.field2734 == this && !class34.field784) {
            class87.field2197 = class39.method307(8);
            class128.method1007((byte) 97, 5000L);
            class28.field653 = null;
            this.method1066(-16);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    private final synchronized void method1066(int arg0) {
        field3130++;
        if (class34.field784) {
            return;
        }
        class34.field784 = true;
        try {
            class9.field148.removeFocusListener(this);
            if (arg0 != -16) {
                this.focusLost(null);
            }
        } catch (Exception var5) {
        }
        try {
            this.method172(0);
        } catch (Exception var4) {
        }
        if (class136.field3090 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class116.field2731 != null) {
            try {
                class116.field2731.method198(false);
            } catch (Exception var2) {
            }
        }
        this.method168(false);
    }

    @OriginalMember(owner = "client!te", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3108++;
        if (class136.field3090 == null) {
            return class116.field2731 == null || class116.field2731.field632 == this ? super.getCodeBase() : class116.field2731.field632.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!te", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3105++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
    public static final int method1067(byte arg0) {
        field3114++;
        if (arg0 != 94) {
            field3128 = null;
        }
        return class32.field753++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
    public final void method1068(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3125++;
        try {
            if (class116.field2734 == null) {
                class54.field1365 = arg1;
                if (arg3 == -31773) {
                    class116.field2734 = this;
                    class17.field411 = arg2;
                    class21.field496 = arg4;
                    if (class116.field2731 == null) {
                        class28.field653 = class116.field2731 = new class26(false, this, arg0, null, 0);
                    }
                    class116.field2731.method201(1, (byte) -57, this);
                }
            } else {
                class2.field46++;
                if (class2.field46 >= 3) {
                    this.method1072(-83, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class73.method558(arg3 + 31772, null, var7);
            this.method1072(arg3 + 31670, "crash");
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILfd;IIIIII)V")
    public static final void method1069(int arg0, class40 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 4) {
            return;
        }
        if (class139.field3149) {
            class64.field1596 = 32;
        } else {
            class64.field1596 = 0;
        }
        class139.field3149 = false;
        field3115++;
        if (class28.field672 != 0) {
            if (arg0 >= arg3 && arg3 + 16 > arg0 && arg4 <= arg7 && arg7 < arg4 + 16) {
                arg1.field1031 -= 4;
                class12.method79(-30833, arg1);
            } else if (arg0 >= arg3 && arg0 < arg3 + 16 && arg7 >= arg2 + arg4 - 16 && arg2 + arg4 > arg7) {
                arg1.field1031 += 4;
                class12.method79(-30833, arg1);
            } else if (arg3 - class64.field1596 <= arg0 && arg0 < arg3 + class64.field1596 + 16 && arg7 >= arg4 + 16 && arg7 < arg4 + arg2 - 16) {
                int var8 = (arg2 - 32) * arg2 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - var8 / 2 - arg4 - 16;
                int var10 = arg2 - var8 - 32;
                arg1.field1031 = (arg5 - arg2) * var9 / var10;
                class12.method79(-30833, arg1);
                class139.field3149 = true;
            }
        }
        if (class151.field3392 == 0) {
            return;
        }
        int var11 = arg1.field1038;
        if (arg0 >= arg3 - var11 && arg4 <= arg7 && arg3 + 16 > arg0 && arg2 + arg4 >= arg7) {
            arg1.field1031 += class151.field3392 * 45;
            class12.method79(-30833, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
    public final boolean method1070(boolean arg0) {
        field3103++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            }
            if (arg0) {
                this.field3112 = false;
            }
            this.method1072(-82, "invalidhost");
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3119++;
    }

    @OriginalMember(owner = "client!te", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3134++;
        if (class136.field3090 == null) {
            return class116.field2731 == null || class116.field2731.field632 == this ? super.getParameter(arg0) : class116.field2731.field632.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public abstract void method176(int arg0);

    @OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class48.field1266 = false;
        field3123++;
    }

    @OriginalMember(owner = "client!te", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3113++;
    }

    @OriginalMember(owner = "client!te", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3116++;
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
    public final void run() {
        field3107++;
        try {
            if (class26.field625 != null) {
                String var1 = class26.field625.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class26.field631;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1072(-119, "wrongjava");
                        return;
                    }
                    class21.field495 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class26.field631 == null || class26.field631.equals("1.4.2"))) {
                    this.method1072(-60, "wrongjava");
                    return;
                }
            }
            if (class116.field2731.field632 != null) {
                Method var3 = class26.field626;
                if (var3 != null) {
                    try {
                        var3.invoke(class116.field2731.field632, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1077(false);
            class69.field1660 = class8.method52(class54.field1365, class21.field496, class9.field148, 113);
            this.method176(0);
            class56.field1409 = class63.method492((byte) 93);
            while (class87.field2197 == 0L || class87.field2197 > class39.method307(8)) {
                class33.field767 = class56.field1409.method146(class61.field1502, class21.field495, -1);
                for (int var4 = 0; var4 < class33.field767; var4++) {
                    this.method1073((byte) 107);
                }
                this.method1071((byte) -22);
                class106.method872(class116.field2731, class9.field148, -51);
            }
        } catch (Exception var7) {
            class73.method558(-1, null, var7);
            this.method1072(-82, "crash");
        }
        this.method1066(-16);
    }

    @OriginalMember(owner = "client!te", name = "start", descriptor = "()V")
    public final void start() {
        field3127++;
        if (class116.field2734 == this && !class34.field784) {
            class87.field2197 = 0L;
        }
    }

    @OriginalMember(owner = "client!te", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3106++;
        this.destroy();
    }

    @OriginalMember(owner = "client!te", name = "providesignlink", descriptor = "(Ldd;)V")
    public static final void providesignlink(class26 arg0) {
        field3136++;
        class116.field2731 = arg0;
        class28.field653 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public abstract void method171(int arg0);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    private final void method1071(byte arg0) {
        long var2 = class39.method307(arg0 ^ 0xFFFFFFE2);
        field3138++;
        long var4 = class34.field801[class60.field1477];
        class34.field801[class60.field1477] = var2;
        class60.field1477 = class60.field1477 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class56.field1404 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != -22) {
            field3104 = null;
        }
        if (class97.field2380++ > 50) {
            class99.field2411 = true;
            class97.field2380 -= 50;
            class9.field148.setSize(class54.field1365, class21.field496);
            class9.field148.setVisible(true);
            if (class136.field3090 == null) {
                class9.field148.setLocation(0, 0);
            } else {
                Insets var7 = class136.field3090.getInsets();
                class9.field148.setLocation(var7.left, var7.top);
            }
        }
        this.method171(40);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public abstract void method168(boolean arg0);

    @OriginalMember(owner = "client!te", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3122++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1072(int arg0, String arg1) {
        if (arg0 >= -46) {
            field3128 = null;
        }
        field3129++;
        if (this.field3112) {
            return;
        }
        this.field3112 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    private final void method1073(byte arg0) {
        long var2 = class55.field1384[class66.field1635];
        long var4 = class39.method307(8);
        class55.field1384[class66.field1635] = var4;
        field3121++;
        if (arg0 < 41) {
            field3128 = null;
        }
        class66.field1635 = class66.field1635 + 1 & 0x1F;
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class158.field3621 = class48.field1266;
        }
        this.method177(1);
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!te", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3118++;
        if (class136.field3090 == null) {
            return class116.field2731 == null || class116.field2731.field632 == this ? super.getAppletContext() : class116.field2731.field632.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIII)V")
    public static final void method1074(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class11.field196 == 1) {
            class25.field615[class10.field177 / 100].method29(class148.field3369 - 8, class121.field2792 + -8);
        }
        field3109++;
        if (class11.field196 == 2) {
            class25.field615[class10.field177 / 100 + 4].method29(class148.field3369 - 8, class121.field2792 - 8);
        }
        class5.method16(3199);
        if (arg1 != 55) {
            field3104 = null;
        }
        if (!class34.field800) {
            return;
        }
        int var5 = arg0 + 512 - 5;
        int var6 = arg3 + 20;
        class69.field1656.method966(class104.method853(arg1 - 171, new class60[] { class107.field2635, class98.method774((byte) -121, class56.field1404) }), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var10 = var6 + 15;
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class22.field548) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class22.field548) {
            var9 = 16711680;
        }
        class69.field1656.method966(class104.method853(-119, new class60[] { class74.field1794, class98.method774((byte) -121, var8), class106.field2619 }), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!te", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3133++;
        if (class116.field2734 != this || class34.field784) {
            return;
        }
        class99.field2411 = true;
        if (class26.field631 != null && class26.field631.startsWith("1.5") && class39.method307(8) - class153.field3451 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class54.field1365 <= var2.width && class21.field496 <= var2.height) {
                class87.field2169 = true;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3124++;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field3128 = null;
        if (arg0 <= -69) {
            field3104 = null;
            field3132 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIILjava/lang/String;II)V")
    public final void method1076(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field3101++;
        try {
            class116.field2734 = this;
            class17.field411 = arg5;
            class21.field496 = arg0;
            class54.field1365 = arg6;
            class136.field3090 = new Frame();
            class136.field3090.setTitle("Jagex");
            class136.field3090.setResizable(false);
            class136.field3090.addWindowListener(this);
            class136.field3090.setVisible(true);
            int var8 = 27 / ((-arg1 - 28) / 63);
            class136.field3090.toFront();
            Insets var9 = class136.field3090.getInsets();
            class136.field3090.setSize(var9.right + arg6 + var9.left, arg0 - -var9.top + var9.bottom);
            class28.field653 = class116.field2731 = new class26(true, null, arg2, arg4, arg3);
            class116.field2731.method201(1, (byte) -57, this);
        } catch (Exception var11) {
            class73.method558(-1, null, var11);
        }
    }

    @OriginalMember(owner = "client!te", name = "stop", descriptor = "()V")
    public final void stop() {
        field3135++;
        if (class116.field2734 == this && !class34.field784) {
            class87.field2197 = class39.method307(8) + 4000L;
        }
    }

    @OriginalMember(owner = "client!te", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3120++;
        if (class136.field3090 == null) {
            return class116.field2731 == null || class116.field2731.field632 == this ? super.getDocumentBase() : class116.field2731.field632.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
    public final synchronized void method1077(boolean arg0) {
        field3126++;
        Container var2;
        if (class136.field3090 == null) {
            var2 = class116.field2731.field632;
        } else {
            var2 = class136.field3090;
        }
        if (class9.field148 != null) {
            class9.field148.removeFocusListener(this);
            var2.remove(class9.field148);
        }
        class9.field148 = new class43(this);
        var2.add(class9.field148);
        class9.field148.setSize(class54.field1365, class21.field496);
        class9.field148.setVisible(true);
        if (class136.field3090 == null) {
            class9.field148.setLocation(0, 0);
        } else {
            Insets var3 = class136.field3090.getInsets();
            class9.field148.setLocation(var3.left, var3.top);
        }
        class9.field148.addFocusListener(this);
        class9.field148.requestFocus();
        class99.field2411 = true;
        class87.field2169 = arg0;
        class153.field3451 = class39.method307(8);
    }
}
