import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class165 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Z")
    private boolean field2304 = false;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
    private boolean field2301 = false;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
    public static int[] field2299 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Z")
    public static boolean field2319;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "Z")
    public static boolean field2320;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "Z")
    public static boolean field2322;

    @OriginalMember(owner = "client!pj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2306++;
    }

    @OriginalMember(owner = "client!pj", name = "start", descriptor = "()V")
    public final void start() {
        field2284++;
        if (class391.field5767 == this && !class89.field1247) {
            class380.field5643 = 0L;
        }
    }

    @OriginalMember(owner = "client!pj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2303++;
        if (class316.field4749 == null) {
            return class21.field261 == null || class21.field261.field2125 == this ? super.getDocumentBase() : class21.field261.field2125.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2307++;
        if (class391.field5767 == this && !class89.field1247) {
            class380.field5643 = class435.method2539(-10659);
            class325.method2005(true, 5000L);
            client.field6670 = null;
            this.method1118((byte) 82, false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V")
    public static final void method1116(boolean arg0, byte arg1) {
        field2317++;
        if (arg1 >= -96) {
            field2299 = null;
        }
        for (class43 var2 = (class43) class390.field5742.method2456(32101); var2 != null; var2 = (class43) class390.field5742.method2461(301)) {
            if (var2.field580 != null) {
                class452.field6419.method2415(var2.field580);
                var2.field580 = null;
            }
            if (var2.field584 != null) {
                class452.field6419.method2415(var2.field584);
                var2.field584 = null;
            }
            var2.method283(2);
        }
        if (!arg0) {
            return;
        }
        for (class43 var3 = (class43) class131.field1825.method2456(32101); var3 != null; var3 = (class43) class131.field1825.method2461(301)) {
            if (var3.field580 != null) {
                class452.field6419.method2415(var3.field580);
                var3.field580 = null;
            }
            var3.method283(2);
        }
        for (class43 var4 = (class43) class4.field82.method2296((byte) 39); var4 != null; var4 = (class43) class4.field82.method2297(true)) {
            if (var4.field580 != null) {
                class452.field6419.method2415(var4.field580);
                var4.field580 = null;
            }
            var4.method283(2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2285++;
    }

    @OriginalMember(owner = "client!pj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2313++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1117(String arg0, byte arg1) {
        field2296++;
        if (this.field2304) {
            return;
        }
        this.field2304 = true;
        System.out.println("error_game_" + arg0);
        try {
            class399.method2383(class21.field261.field2125, -10423, "loggedout");
        } catch (Throwable var4) {
        }
        if (arg1 == -50) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZ)V")
    private final void method1118(byte arg0, boolean arg1) {
        field2308++;
        synchronized (this) {
            if (class89.field1247) {
                return;
            }
            class89.field1247 = true;
        }
        if (class21.field261.field2125 != null) {
            class21.field261.field2125.destroy();
        }
        try {
            this.method1132(-88);
        } catch (Exception var11) {
        }
        if (this.field2301) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field2301 = false;
        }
        if (arg0 < 9) {
            return;
        }
        class397 var4 = class21.field261.method1036(class391.field5767.getClass(), true);
        while (var4.field5822 == 0) {
            class325.method2005(true, 100L);
        }
        if (class378.field5618 != null) {
            try {
                class378.field5618.removeFocusListener(this);
                class378.field5618.getParent().remove(class378.field5618);
            } catch (Exception var9) {
            }
        }
        if (class21.field261 != null) {
            try {
                class21.field261.method1042(-104);
            } catch (Exception var8) {
            }
        }
        this.method1133(64);
        if (class316.field4749 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public abstract void method1119(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        field2298++;
        class73.field983.field6378 = 1;
        class29.field387 = 0;
        class273.field4153 = 0;
        class96.field1384 = 0;
        class37.field477 = 0;
        class164.field2277 = 0;
        class51.field738 = 0;
        class450.field6359 = 0;
        class439.field6194 = 0;
        class57.field793 = 0;
        class174.field2467 = 0;
        class261.field3876 = 0;
        class477.field6700 = 0;
        class367.field5547 = 0;
        class164.field2271 = 0;
        field2305 = 0;
        class345.field5268 = 0;
        class184.field2796 = 0;
        class492.field6927 = 0;
        class304.field4524 = 0;
        class147.field2090 = 0;
        class87.field1234 = 0;
        class453.field6432 = 0;
        class486.field6824 = 0;
        class109.field1521 = 0;
        class287.field4379 = 0;
        class229.field3359 = 0;
        class63.field864 = 0;
        class446.field6293 = 0;
        class271.field4065 = 0;
        class478.field6728 = 0;
        class94.field1294 = 0;
        class144.field2041 = 0;
        class89.field1249 = 0;
        class2.field37 = 0;
        class212.field3189 = 0;
        class318.field4773 = 0;
        class257.field3800 = 0;
        class313.field4717 = 0;
        class129.field1805 = 0;
        class245.field3508 = 0;
        class251.field3612 = 0;
        class8.field133 = 0;
        class84.field1190 = 0;
        class349.field5319 = 0;
        class36.field449 = 0;
        class3.field66 = 0;
        class322.field4837 = 0;
        class362.field5482 = 0;
        class491.field6894 = 0;
        class225.field3266 = 0;
        class365.field5517 = 0;
        class439.field6192 = 0;
        class206.field3121 = 0;
        class400.field5837 = 0;
        class349.field5312 = 0;
        class51.field731 = 0;
        class1.field5 = 0;
        class462.field6511 = 0;
        class330.field4939 = 0;
        class412.field5946 = 0;
        class46.field661 = 0;
        class140.field1998 = 0;
        client.field6663 = 0;
        class9.field146 = 0;
        class150.field2111 = 0;
        class220.field3244 = 0;
        class18.field234 = 0;
        class94.field1295 = 0;
        class212.field3186 = 0;
        class390.field5728 = 0;
        class321.field4791 = 0;
        class362.field5481 = 0;
        class446.field6327 = 0;
        class233.field3410 = 0;
        class210.field3159 = 0;
        class18.field239 = 0;
        class51.field728 = 0;
        class58.field806 = 0;
        class271.field4079 = 0;
        class134.field1952 = 0;
        class322.field4828 = 0;
        class358.field5442 = 0;
        class299.field4469 = 0;
        class4.field81 = 0;
        class18.field236 = 0;
        class439.field6199 = 0;
        client.field6662 = 0;
        class446.field6291 = 0;
        class401.field5858 = 0;
        class322.field4826 = 0;
        class304.field4530 = 0;
        class344.field5208 = 0;
        class245.field3517 = 0;
        class246.field3546 = 0;
        class233.field3415 = 0;
        class360.field5447 = 0;
        class187.field2838 = 0;
        class180.field2679 = 0;
        class412.field5965 = 0;
        class410.field5933 = 0;
        class433.field6154 = 0;
        class150.field2103 = 0;
        class250.field3599 = 0;
        class344.field5189 = 0;
        class305.field4540 = 0;
        class182.field2698 = 0;
        class349.field5316 = 0;
        class446.field6318 = 0;
        class271.field4080 = 0;
        class257.field3813 = 0;
        class403.field5881 = 0;
        class446.field6276 = 0;
        class448.field6341 = 0;
        class257.field3845 = 0;
        class439.field6190 = 0;
        class95.field1352 = 0;
        class446.field6321 = 0;
        class166.field2340 = 0;
        class103.field1440 = 0;
        class12.field160 = 0;
        class414.field5968 = 0;
        class116.field1625 = 0;
        class126.field1727 = 0;
        class333.field4978 = 0;
        class29.field380 = 0;
        class183.field2716 = 0;
        class379.field5638 = 0;
        class428.field6107 = 0;
        class258.field3856 = 0;
        class262.field3882 = 0;
        class307.field4587 = 0;
        class478.field6705 = 0;
        class200.field3012 = 0;
        class451.field6375 = 0;
        class36.field454 = 0;
        class116.field1624 = 0;
        class29.field391 = 0;
        class472.field6614 = 0;
        class63.field859 = 0;
        class430.field6122 = 0;
        class166.field2387 = 0;
        class446.field6279 = 0;
        class235.field3430 = 0;
        class53.field754 = 0;
        class263.field3905 = 0;
        class55.field778 = 0;
        class109.field1525 = 0;
        class302.field4495 = 0;
        class491.field6900 = 0;
        class95.field1344 = 0;
        class88.field1245 = 0;
        class439.field6200 = 0;
        class307.field4574 = 0;
        class95.field1351 = 0;
        class454.field6449 = 0;
        class281.field4241 = 0;
        class13.field183 = 0;
        class38.field502 = 0;
        class463.field6531 = 0;
        class451.field6408 = 0;
        class204.field3096 = 0;
        class391.field5749 = 0;
        class42.field569 = 0;
        class164.field2282 = 0;
        class28.field365 = 0;
        class380.field5648 = 0;
        class273.field4125 = 0;
        class203.field3090 = 0;
        class446.field6299 = 0;
        class443.field6251 = 0;
        class341.field5105 = 0;
        class279.field4227 = 0;
        class491.field6893 = 0;
        class166.field2371 = 0;
        field2295 = 0;
        class451.field6374 = 0;
        class158.field2195 = 0;
        class100.field1429 = 0;
        class307.field4576 = 0;
        class187.field2848 = 0;
        class31.field406 = 0;
        class105.field1467 = 0;
        class92.field1278 = 0;
        class200.field3025 = 0;
        class73.field986 = 0;
        class340.field5097 = 0;
        class446.field6300 = 0;
        class286.field4368 = 0;
        class115.field1598 = 0;
        class335.field5014 = 0;
        class406.field5901 = 0;
        class43.field590 = 0;
        class327.field4889 = 0;
        class162.field2246 = 0;
        class349.field5331 = 0;
        class281.field4244 = 0;
        class142.field2028 = 0;
        class362.field5485 = 0;
        class193.field2945 = 0;
        class349.field5322 = 0;
        class432.field6139 = 0;
        class164.field2278 = 0;
        class147.field2084 = 0;
        class105.field1476 = 0;
        class406.field5899 = 0;
        class236.field3444 = 0;
        class456.field6485 = 0;
        class150.field2112 = 0;
        class95.field1353 = 0;
        class209.field3149 = 0;
        class247.field3584 = 0;
        class76.field1068 = 0;
        class371.field5594 = 0;
        class228.field3340 = 0;
        class129.field1804 = 0;
        class446.field6297 = 0;
        class485.field6814 = 0;
        class154.field2151 = 0;
        class115.field1599 = 0;
        class392.field5782 = 0;
        class44.field616 = 0;
        class120.field1670 = 0;
        class307.field4579 = 0;
        class5.field89 = 0;
        class327.field4901 = 0;
        class475.field6643 = 0;
        class446.field6317 = 0;
        class330.field4934 = 0;
        class340.field5090 = 0;
        class267.field3962 = 0;
        class82.field1156 = 0;
        class307.field4566 = 0;
        class251.field3614 = 0;
        class324.field4862 = 0;
        class162.field2231 = 0;
        class412.field5949 = 0;
        class349.field5317 = 0;
        class315.field4745 = 0;
        class314.field4729 = 0;
        class226.field3288 = 0;
        class275.field4171 = 0;
        class486.field6823 = 0;
        class262.field3884 = 0;
        class45.field643 = 0;
        class130.field1814 = 0;
        class25.field321 = 0;
        class302.field4502 = 0;
        class385.field5697 = 0;
        class446.field6295 = 0;
        field2294 = 0;
        class489.field6857 = 0;
        class55.field773 = 0;
        class204.field3101 = 0;
        class132.field1834 = 0;
        class156.field2174 = 0;
        field2311 = 0;
        class317.field4759 = 0;
        class246.field3568 = 0;
        class330.field4956 = 0;
        class463.field6530 = 0;
        class71.field957 = 0;
        class446.field6304 = 0;
        class345.field5258 = 0;
        class228.field3345 = 0;
        class263.field3907 = 0;
        class178.field2533 = 0;
        class442.field6242 = 0;
        class166.field2338 = 0;
        class427.field6094 = 0;
        class362.field5490 = 0;
        class155.field2159 = 0;
        class147.field2091 = 0;
        class335.field5007 = 0;
        class294.field4422 = 0;
        class14.field201 = 0;
        class282.field4261 = 0;
        field2291 = 0;
        class401.field5857 = 0;
        class237.field3451 = 0;
        class4.field79 = 0;
        class327.field4904 = 0;
        class166.field2358 = 0;
        class110.field1554 = 0;
        class439.field6193 = 0;
        class40.field561 = 0;
        class162.field2229 = 0;
        class49.field714 = 0;
        class105.field1468 = 0;
        field2297 = 0;
        class439.field6209 = 0;
        class408.field5914 = 0;
        class219.field3234 = 0;
        class46.field662 = 0;
        class491.field6895 = 0;
        class166.field2365 = 0;
        class332.field4968 = 0;
        class361.field5468 = 0;
        class428.field6109 = 0;
        class293.field4421 = 0;
        class387.field5707 = 0;
        class446.field6294 = 0;
        class360.field5459 = 0;
        class282.field4273 = 0;
        class184.field2723 = 0;
        class351.field5357 = 0;
        class439.field6219 = 0;
        class478.field6723 = 0;
        class335.field5006 = 0;
        class491.field6901 = 0;
        class226.field3298 = 0;
        field2290 = 0;
        class335.field5016 = 0;
        class188.field2854 = 0;
        class29.field382 = 0;
        class462.field6521 = 0;
        class129.field1796 = 0;
        class144.field2042 = 0;
        class425.field6077 = 0;
        class23.field307 = 0;
        class424.field6063 = 0;
        class324.field4861 = 0;
        class332.field4965 = 0;
        class416.field5992 = 0;
        class200.field3019 = 0;
        class233.field3412 = 0;
        class200.field3030 = 0;
        class82.field1149 = 0;
        class145.field2053 = 0;
        class271.field4019 = 0;
        class269.field3980 = 0;
        class419.field6022 = 0;
        class273.field4132 = 0;
        class98.field1399 = 0;
        class122.field1683 = 0;
        class229.field3353 = 0;
        class347.field5295 = 0;
        class94.field1304 = 0;
        class416.field5994 = 0;
        class400.field5843 = 0;
        class285.field4353 = 0;
        class24.field313 = 0;
        class200.field3010 = 0;
        class422.field6044 = 0;
        class76.field1066 = 0;
        class469.field6591 = 0;
        class398.field5825 = 0;
        class136.field1967 = 0;
        class20.field254 = 0;
        class162.field2249 = 0;
        class27.field346 = 0;
        class335.field4998 = 0;
        field2303 = 0;
        class228.field3336 = 0;
        class157.field2180 = 0;
        class14.field196 = 0;
        class161.field2226 = 0;
        class163.field2253 = 0;
        class70.field946 = 0;
        class3.field52 = 0;
        class392.field5780 = 0;
        class367.field5548 = 0;
        class226.field3278 = 0;
        class206.field3114 = 0;
        class52.field746 = 0;
        class53.field759 = 0;
        class282.field4256 = 0;
        class271.field4058 = 0;
        class312.field4707 = 0;
        class53.field757 = 0;
        class115.field1602 = 0;
        class257.field3838 = 0;
        class57.field798 = 0;
        class384.field5683 = 0;
        class431.field6124 = 0;
        class131.field1821 = 0;
        class446.field6301 = 0;
        class119.field1665 = 0;
        class229.field3355 = 0;
        class8.field137 = 0;
        class251.field3615 = 0;
        class309.field4606 = 0;
        class327.field4890 = 0;
        client.field6669 = 0;
        class327.field4915 = 0;
        class462.field6519 = 0;
        class126.field1716 = 0;
        class96.field1378 = 0;
        class8.field125 = 0;
        class403.field5880 = 0;
        class83.field1173 = 0;
        class188.field2856 = 0;
        class442.field6246 = 0;
        class281.field4240 = 0;
        class188.field2865 = 0;
        class296.field4440 = 0;
        class237.field3447 = 0;
        class395.field5814 = 0;
        class387.field5712 = 0;
        client.field6671 = 0;
        class346.field5281 = 0;
        class483.field6770 = 0;
        class287.field4386 = 0;
        class24.field315 = 0;
        class29.field389 = 0;
        class116.field1621 = 0;
        class491.field6908 = 0;
        class156.field2168 = 0;
        class140.field2002 = 0;
        class253.field3636 = 0;
        class95.field1339 = 0;
        class115.field1593 = 0;
        class178.field2599 = 0;
        class270.field3991 = 0;
        class63.field862 = 0;
        field2307 = 0;
        class446.field6314 = 0;
        class321.field4793 = 0;
        class271.field4017 = 0;
        class124.field1705 = 0;
        class13.field185 = 0;
        class381.field5652 = 0;
        class345.field5261 = 0;
        class52.field750 = 0;
        class392.field5786 = 0;
        class456.field6467 = 0;
        class96.field1377 = 0;
        class169.field2406 = 0;
        class358.field5443 = 0;
        class451.field6404 = 0;
        class200.field3009 = 0;
        class44.field605 = 0;
        class406.field5905 = 0;
        class334.field4982 = 0;
        class446.field6325 = 0;
        class467.field6569 = 0;
        class150.field2101 = 0;
        class55.field772 = 0;
        class355.field5385 = 0;
        class228.field3335 = 0;
        field2289 = 0;
        class403.field5877 = 0;
        class280.field4235 = 0;
        class390.field5729 = 0;
        class419.field6012 = 0;
        class309.field4624 = 0;
        class386.field5704 = 0;
        class171.field2437 = 0;
        class412.field5944 = 0;
        class206.field3112 = 0;
        class197.field2972 = 0;
        class212.field3195 = 0;
        class103.field1439 = 0;
        class225.field3259 = 0;
        class390.field5727 = 0;
        field2313 = 0;
        class439.field6220 = 0;
        class450.field6366 = 0;
        class491.field6906 = 0;
        class19.field249 = 0;
        class51.field744 = 0;
        class238.field3468 = 0;
        class282.field4268 = 0;
        class122.field1682 = 0;
        class1.field10 = 0;
        class446.field6326 = 0;
        class298.field4459 = 0;
        class370.field5568 = 0;
        class443.field6257 = 0;
        class166.field2333 = 0;
        class275.field4176 = 0;
        class116.field1623 = 0;
        class1.field4 = 0;
        class262.field3878 = 0;
        class250.field3605 = 0;
        class346.field5272 = 0;
        class298.field4460 = 0;
        class446.field6328 = 0;
        class10.field154 = 0;
        class451.field6388 = 0;
        class78.field1098 = 0;
        class229.field3361 = 0;
        class203.field3083 = 0;
        class85.field1209 = 0;
        class9.field150 = 0;
        class303.field4510 = 0;
        class335.field5022 = 0;
        field2285 = 0;
        class162.field2230 = 0;
        class55.field771 = 0;
        class12.field164 = 0;
        class228.field3339 = 0;
        class247.field3581 = 0;
        class143.field2036 = 0;
        class44.field626 = 0;
        class164.field2274 = 0;
        class446.field6269 = 0;
        class307.field4568 = 0;
        class246.field3558 = 0;
        class166.field2337 = 0;
        class131.field1824 = 0;
        class72.field977 = 0;
        class271.field4002 = 0;
        class338.field5070 = 0;
        class205.field3110 = 0;
        class69.field941 = 0;
        class472.field6617 = 0;
        class116.field1616 = 0;
        class315.field4739 = 0;
        class44.field610 = 0;
        class456.field6469 = 0;
        class126.field1712 = 0;
        class335.field5020 = 0;
        class21.field259 = 0;
        class479.field6749 = 0;
        class463.field6537 = 0;
        class44.field629 = 0;
        class147.field2075 = 0;
        class478.field6704 = 0;
        class327.field4887 = 0;
        class371.field5589 = 0;
        class280.field4233 = 0;
        class45.field639 = 0;
        class398.field5827 = 0;
        class162.field2241 = 0;
        class446.field6267 = 0;
        class105.field1469 = 0;
        class132.field1839 = 0;
        class51.field732 = 0;
        class29.field390 = 0;
        class257.field3843 = 0;
        class13.field188 = 0;
        class390.field5740 = 0;
        class166.field2386 = 0;
        class179.field2670 = 0;
        class422.field6045 = 0;
        class467.field6573 = 0;
        class250.field3598 = 0;
        class126.field1719 = 0;
        class443.field6254 = 0;
        class406.field5903 = 0;
        class96.field1379 = 0;
        class269.field3979 = 0;
        class147.field2076 = 0;
        class365.field5527 = 0;
        class294.field4423 = 0;
        class456.field6473 = 0;
        class166.field2324 = 0;
        class446.field6298 = 0;
        class467.field6577 = 0;
        class304.field4525 = 0;
        class317.field4758 = 0;
        class466.field6559 = 0;
        class128.field1780 = 0;
        class220.field3245 = 0;
        class451.field6398 = 0;
        class395.field5811 = 0;
        class116.field1610 = 0;
        class304.field4526 = 0;
        class43.field595 = 0;
        class436.field6173 = 0;
        class96.field1385 = 0;
        class227.field3317 = 0;
        class178.field2609 = 0;
        class240.field3480 = 0;
        class2.field43 = 0;
        class14.field199 = 0;
        class157.field2178 = 0;
        class332.field4970 = 0;
        class478.field6726 = 0;
        class183.field2703 = 0;
        class327.field4897 = 0;
        class285.field4354 = 0;
        class229.field3367 = 0;
        class45.field640 = 0;
        class96.field1382 = 0;
        class33.field429 = 0;
        class307.field4578 = 0;
        class327.field4916 = 0;
        class367.field5550 = 0;
        class36.field467 = 0;
        class49.field701 = 0;
        class492.field6925 = 0;
        class446.field6312 = 0;
        class162.field2240 = 0;
        class257.field3814 = 0;
        class370.field5570 = 0;
        class463.field6525 = 0;
        class443.field6249 = 0;
        class285.field4351 = 0;
        class63.field865 = 0;
        class17.field219 = 0;
        class200.field3018 = 0;
        class461.field6508 = 0;
        class166.field2361 = 0;
        class8.field131 = 0;
        class450.field6358 = 0;
        class446.field6296 = 0;
        class351.field5353 = 0;
        class3.field60 = 0;
        class15.field211 = 0;
        class95.field1348 = 0;
        client.field6665 = 0;
        class337.field5037 = 0;
        class129.field1792 = 0;
        class78.field1096 = 0;
        class335.field5013 = 0;
        class485.field6809 = 0;
        class392.field5779 = 0;
        class200.field3020 = 0;
        class263.field3909 = 0;
        class480.field6764 = 0;
        class45.field649 = 0;
        class350.field5337 = 0;
        class1.field11 = 0;
        class94.field1296 = 0;
        class57.field790 = 0;
        class402.field5867 = 0;
        class156.field2166 = 0;
        class150.field2113 = 0;
        class384.field5687 = 0;
        class371.field5596 = 0;
        class134.field1951 = 0;
        class184.field2727 = 0;
        class51.field737 = 0;
        class142.field2031 = 0;
        class410.field5931 = 0;
        class36.field453 = 0;
        class176.field2505 = 0;
        class203.field3089 = 0;
        class477.field6691 = 0;
        class83.field1163 = 0;
        class65.field894 = 0;
        class229.field3373 = 0;
        class63.field858 = 0;
        class344.field5198 = 0;
        class38.field510 = 0;
        client.field6656 = 0;
        class469.field6597 = 0;
        class394.field5803 = 0;
        class402.field5870 = 0;
        class250.field3601 = 0;
        class352.field5358 = 0;
        class205.field3108 = 0;
        class431.field6126 = 0;
        class451.field6385 = 0;
        class191.field2924 = 0;
        class295.field4435 = 0;
        class355.field5381 = 0;
        class334.field4984 = 0;
        class95.field1347 = 0;
        class282.field4266 = 0;
        class472.field6619 = 0;
        class362.field5499 = 0;
        class236.field3443 = 0;
        class403.field5884 = 0;
        class456.field6478 = 0;
        class432.field6149 = 0;
        class183.field2718 = 0;
        class331.field4961 = 0;
        class371.field5586 = 0;
        class484.field6800 = 0;
        class446.field6286 = 0;
        class228.field3333 = 0;
        class231.field3395 = 0;
        class273.field4126 = 0;
        class124.field1702 = 0;
        class491.field6905 = 0;
        class141.field2011 = 0;
        class327.field4908 = 0;
        class442.field6240 = 0;
        class109.field1531 = 0;
        class412.field5956 = 0;
        class304.field4522 = 0;
        class3.field65 = 0;
        field2314 = 0;
        class130.field1815 = 0;
        class309.field4647 = 0;
        class439.field6211 = 0;
        class35.field432 = 0;
        class154.field2155 = 0;
        class134.field1946 = 0;
        class246.field3531 = 0;
        class327.field4903 = 0;
        class4.field77 = 0;
        class94.field1321 = 0;
        class317.field4761 = 0;
        class193.field2940 = 0;
        class100.field1428 = 0;
        class184.field2737 = 0;
        class439.field6196 = 0;
        class390.field5736 = 0;
        class44.field623 = 0;
        class416.field6000 = 0;
        class191.field2930 = 0;
        class51.field736 = 0;
        class352.field5360 = 0;
        class44.field602 = 0;
        class476.field6655 = 0;
        class492.field6926 = 0;
        class184.field2755 = 0;
        class307.field4569 = 0;
        class410.field5934 = 0;
        class17.field229 = 0;
        class403.field5878 = 0;
        class423.field6053 = 0;
        class37.field486 = 0;
        class247.field3585 = 0;
        class184.field2764 = 0;
        class245.field3512 = 0;
        class400.field5840 = 0;
        class390.field5734 = 0;
        class8.field134 = 0;
        class123.field1699 = 0;
        class484.field6795 = 0;
        class187.field2842 = 0;
        class103.field1441 = 0;
        class439.field6218 = 0;
        class143.field2040 = 0;
        class247.field3579 = 0;
        class29.field398 = 0;
        class51.field729 = 0;
        class63.field857 = 0;
        class184.field2754 = 0;
        class463.field6529 = 0;
        class450.field6363 = 0;
        class473.field6627 = 0;
        class451.field6395 = 0;
        class309.field4599 = 0;
        class283.field4331 = 0;
        class3.field56 = 0;
        class163.field2252 = 0;
        class302.field4498 = 0;
        class156.field2173 = 0;
        class90.field1251 = 0;
        class463.field6528 = 0;
        class201.field3052 = 0;
        class327.field4918 = 0;
        class439.field6212 = 0;
        class137.field1975 = 0;
        class305.field4539 = 0;
        class352.field5361 = 0;
        class451.field6369 = 0;
        class58.field807 = 0;
        class467.field6575 = 0;
        field2302 = 0;
        class183.field2705 = 0;
        field2298 = 0;
        class257.field3804 = 0;
        class197.field2967 = 0;
        class201.field3049 = 0;
        class456.field6471 = 0;
        class64.field890 = 0;
        class487.field6841 = 0;
        class28.field366 = 0;
        class45.field635 = 0;
        class206.field3120 = 0;
        class365.field5516 = 0;
        class280.field4232 = 0;
        class439.field6214 = 0;
        class344.field5230 = 0;
        class96.field1383 = 0;
        class96.field1374 = 0;
        class32.field419 = 0;
        class362.field5479 = 0;
        class95.field1343 = 0;
        class400.field5834 = 0;
        class28.field369 = 0;
        client.field6660 = 0;
        class261.field3875 = 0;
        class132.field1845 = 0;
        class216.field3212 = 0;
        class58.field803 = 0;
        class166.field2336 = 0;
        class17.field214 = 0;
        class201.field3060 = 0;
        class219.field3236 = 0;
        class400.field5839 = 0;
        class262.field3880 = 0;
        class250.field3606 = 0;
        class287.field4380 = 0;
        class257.field3824 = 0;
        class82.field1155 = 0;
        class285.field4360 = 0;
        class171.field2436 = 0;
        class400.field5842 = 0;
        class363.field5506 = 0;
        class424.field6060 = 0;
        class425.field6074 = 0;
        class228.field3343 = 0;
        class237.field3452 = 0;
        class72.field967 = 0;
        class453.field6441 = 0;
        class3.field58 = 0;
        class406.field5902 = 0;
        class119.field1655 = 0;
        class446.field6305 = 0;
        class36.field456 = 0;
        class36.field468 = 0;
        class120.field1666 = 0;
        class384.field5684 = 0;
        class350.field5336 = 0;
        class298.field4457 = 0;
        class462.field6512 = 0;
        class307.field4570 = 0;
        class360.field5451 = 0;
        class408.field5916 = 0;
        class44.field620 = 0;
        class92.field1277 = 0;
        class262.field3901 = 0;
        class408.field5912 = 0;
        class439.field6215 = 0;
        class416.field5998 = 0;
        class162.field2238 = 0;
        class226.field3290 = 0;
        class178.field2663 = 0;
        class250.field3608 = 0;
        class176.field2507 = 0;
        class350.field5340 = 0;
        class492.field6917 = 0;
        class459.field6494 = 0;
        class144.field2046 = 0;
        class45.field637 = 0;
        class478.field6725 = 0;
        class450.field6360 = 0;
        class346.field5286 = 0;
        class184.field2790 = 0;
        class446.field6306 = 0;
        class143.field2038 = 0;
        class156.field2171 = 0;
        class58.field802 = 0;
        class142.field2033 = 0;
        class271.field4037 = 0;
        class46.field660 = 0;
        class347.field5296 = 0;
        class378.field5628 = 0;
        class273.field4149 = 0;
        class28.field362 = 0;
        class212.field3199 = 0;
        class178.field2627 = 0;
        class478.field6718 = 0;
        class51.field734 = 0;
        class315.field4737 = 0;
        class228.field3347 = 0;
        field2310 = 0;
        class184.field2759 = 0;
        class307.field4571 = 0;
        class270.field3995 = 0;
        class414.field5967 = 0;
        class29.field395 = 0;
        class432.field6141 = 0;
        class129.field1799 = 0;
        class273.field4164 = 0;
        class273.field4144 = 0;
        class262.field3898 = 0;
        class95.field1338 = 0;
        class456.field6475 = 0;
        class441.field6229 = 0;
        class462.field6515 = 0;
        class446.field6270 = 0;
        class216.field3217 = 0;
        class335.field5010 = 0;
        class172.field2442 = 0;
        class169.field2410 = 0;
        class6.field100 = 0;
        class451.field6411 = 0;
        class18.field238 = 0;
        class387.field5708 = 0;
        class351.field5349 = 0;
        class446.field6310 = 0;
        class232.field3402 = 0;
        class262.field3894 = 0;
        class166.field2347 = 0;
        class400.field5854 = 0;
        class492.field6930 = 0;
        class206.field3118 = 0;
        class287.field4382 = 0;
        class282.field4269 = 0;
        class237.field3448 = 0;
        class45.field645 = 0;
        class198.field2981 = 0;
        class3.field54 = 0;
        class333.field4977 = 0;
        class360.field5455 = 0;
        class212.field3193 = 0;
        class419.field6015 = 0;
        class55.field764 = 0;
        class193.field2939 = 0;
        class82.field1146 = 0;
        class49.field712 = 0;
        class49.field715 = 0;
        class410.field5929 = 0;
        class312.field4704 = 0;
        class344.field5190 = 0;
        class186.field2820 = 0;
        class89.field1248 = 0;
        class78.field1094 = 0;
        class210.field3157 = 0;
        class72.field976 = 0;
        class303.field4505 = 0;
        class392.field5787 = 0;
        class451.field6406 = 0;
        class480.field6755 = 0;
        class250.field3597 = 0;
        class136.field1964 = 0;
        class129.field1807 = 0;
        class186.field2826 = 0;
        class429.field6113 = 0;
        class188.field2868 = 0;
        class166.field2380 = 0;
        class77.field1087 = 0;
        class17.field213 = 0;
        class451.field6373 = 0;
        class238.field3467 = 0;
        class334.field4981 = 0;
        class109.field1529 = 0;
        class350.field5334 = 0;
        class184.field2793 = 0;
        class166.field2342 = 0;
        class246.field3573 = 0;
        class317.field4764 = 0;
        class415.field5988 = 0;
        class126.field1722 = 0;
        class183.field2704 = 0;
        class273.field4159 = 0;
        class415.field5981 = 0;
        class356.field5392 = 0;
        class361.field5465 = 0;
        class491.field6885 = 0;
        class487.field6838 = 0;
        class485.field6807 = 0;
        class448.field6344 = 0;
        class63.field863 = 0;
        class362.field5487 = 0;
        class81.field1134 = 0;
        class327.field4902 = 0;
        class465.field6551 = 0;
        class361.field5464 = 0;
        class303.field4517 = 0;
        class227.field3319 = 0;
        class400.field5849 = 0;
        class49.field709 = 0;
        class485.field6816 = 0;
        class226.field3310 = 0;
        class178.field2571 = 0;
        class8.field136 = 0;
        class51.field730 = 0;
        class412.field5960 = 0;
        class163.field2256 = 0;
        class228.field3349 = 0;
        class166.field2375 = 0;
        class204.field3099 = 0;
        class453.field6422 = 0;
        class488.field6844 = 0;
        class45.field650 = 0;
        class166.field2370 = 0;
        class63.field866 = 0;
        class432.field6148 = 0;
        class400.field5851 = 0;
        class257.field3819 = 0;
        class46.field663 = 0;
        class255.field3782 = 0;
        class335.field5003 = 0;
        class232.field3400 = 0;
        class188.field2860 = 0;
        class335.field5023 = 0;
        class36.field448 = 0;
        class230.field3376 = 0;
        class485.field6811 = 0;
        class115.field1596 = 0;
        class187.field2839 = 0;
        class477.field6684 = 0;
        field2308 = 0;
        class477.field6678 = 0;
        class162.field2243 = 0;
        class462.field6516 = 0;
        class427.field6096 = 0;
        class362.field5498 = 0;
        class459.field6498 = 0;
        class456.field6465 = 0;
        class451.field6380 = 0;
        class304.field4523 = 0;
        class150.field2109 = 0;
        class424.field6070 = 0;
        class226.field3300 = 0;
        class37.field490 = 0;
        class439.field6197 = 0;
        class174.field2472 = 0;
        class210.field3156 = 0;
        class491.field6886 = 0;
        class1.field7 = 0;
        class483.field6773 = 0;
        class8.field141 = 0;
        class334.field4985 = 0;
        class307.field4585 = 0;
        class229.field3357 = 0;
        class36.field444 = 0;
        class391.field5759 = 0;
        class459.field6500 = 0;
        class305.field4544 = 0;
        class236.field3434 = 0;
        field2296 = 0;
        class492.field6921 = 0;
        class419.field6011 = 0;
        class166.field2356 = 0;
        class271.field4072 = 0;
        class229.field3362 = 0;
        class350.field5341 = 0;
        class360.field5449 = 0;
        class229.field3370 = 0;
        class46.field671 = 0;
        class129.field1793 = 0;
        class283.field4318 = 0;
        class193.field2942 = 0;
        class36.field446 = 0;
        class493.field6944 = 0;
        class128.field1775 = 0;
        class282.field4271 = 0;
        class109.field1522 = 0;
        class335.field5011 = 0;
        class186.field2828 = 0;
        class209.field3146 = 0;
        class400.field5853 = 0;
        class392.field5773 = 0;
        field2317 = 0;
        class69.field932 = 0;
        class293.field4419 = 0;
        class235.field3427 = 0;
        class309.field4622 = 0;
        class228.field3344 = 0;
        class320.field4785 = 0;
        class480.field6751 = 0;
        class332.field4972 = 0;
        class76.field1073 = 0;
        class335.field5008 = 0;
        class37.field484 = 0;
        class72.field964 = 0;
        class246.field3553 = 0;
        class72.field966 = 0;
        class128.field1777 = 0;
        class327.field4900 = 0;
        class446.field6320 = 0;
        class182.field2695 = 0;
        class226.field3273 = 0;
        class204.field3100 = 0;
        class229.field3365 = 0;
        class477.field6699 = 0;
        class378.field5622 = 0;
        class447.field6335 = 0;
        class273.field4129 = 0;
        class324.field4863 = 0;
        class282.field4264 = 0;
        class451.field6371 = 0;
        class131.field1823 = 0;
        class451.field6384 = 0;
        class96.field1387 = 0;
        class335.field4997 = 0;
        class477.field6686 = 0;
        class271.field4073 = 0;
        class442.field6244 = 0;
        class188.field2866 = 0;
        class431.field6127 = 0;
        class105.field1463 = 0;
        class282.field4265 = 0;
        class446.field6288 = 0;
        class44.field627 = 0;
        class446.field6289 = 0;
        class461.field6506 = 0;
        class235.field3431 = 0;
        class197.field2961 = 0;
        class318.field4767 = 0;
        class184.field2745 = 0;
        class36.field457 = 0;
        class130.field1811 = 0;
        class150.field2102 = 0;
        class200.field3035 = 0;
        class116.field1613 = 0;
        class12.field167 = 0;
        class44.field614 = 0;
        class208.field3133 = 0;
        class38.field509 = 0;
        class335.field5019 = 0;
        class475.field6644 = 0;
        class116.field1611 = 0;
        class147.field2093 = 0;
        field2284 = 0;
        class480.field6759 = 0;
        class166.field2357 = 0;
        class349.field5311 = 0;
        class391.field5762 = 0;
        class154.field2156 = 0;
        class356.field5390 = 0;
        class262.field3886 = 0;
        class327.field4905 = 0;
        class256.field3791 = 0;
        class63.field860 = 0;
        class269.field3977 = 0;
        class140.field2000 = 0;
        class247.field3580 = 0;
        class384.field5679 = 0;
        class110.field1558 = 0;
        class178.field2578 = 0;
        class485.field6812 = 0;
        class330.field4950 = 0;
        class199.field3003 = 0;
        class491.field6896 = 0;
        class446.field6329 = 0;
        class95.field1356 = 0;
        class201.field3067 = 0;
        class212.field3198 = 0;
        class324.field4868 = 0;
        class349.field5328 = 0;
        class321.field4790 = 0;
        class260.field3868 = 0;
        class141.field2009 = 0;
        class332.field4969 = 0;
        class257.field3834 = 0;
        class96.field1389 = 0;
        class82.field1157 = 0;
        class282.field4272 = 0;
        class257.field3848 = 0;
        class100.field1427 = 0;
        class250.field3603 = 0;
        class166.field2383 = 0;
        class178.field2536 = 0;
        class378.field5619 = 0;
        class171.field2431 = 0;
        class446.field6330 = 0;
        class282.field4263 = 0;
        class245.field3519 = 0;
        class119.field1652 = 0;
        class345.field5254 = 0;
        class232.field3399 = 0;
        class99.field1403 = 0;
        class25.field325 = 0;
        class180.field2684 = 0;
        class49.field703 = 0;
        class406.field5904 = 0;
        class203.field3093 = 0;
        class190.field2917 = 0;
        class477.field6689 = 0;
        class388.field5715 = 0;
        class240.field3481 = 0;
        class408.field5921 = 0;
        class172.field2449 = 0;
        class313.field4715 = 0;
        class227.field3323 = 0;
        class303.field4515 = 0;
        class193.field2935 = 0;
        class166.field2332 = 0;
        class327.field4907 = 0;
        class486.field6825 = 0;
        class142.field2027 = 0;
        class315.field4746 = 0;
        client.field6664 = 0;
        class446.field6285 = 0;
        class23.field302 = 0;
        field2286 = 0;
        class58.field800 = 0;
        class134.field1949 = 0;
        class57.field797 = 0;
        class8.field138 = 0;
        class186.field2824 = 0;
        class446.field6277 = 0;
        class478.field6724 = 0;
        class380.field5646 = 0;
        class157.field2183 = 0;
        class228.field3331 = 0;
        class365.field5530 = 0;
        class412.field5954 = 0;
        class197.field2969 = 0;
        class172.field2452 = 0;
        class13.field191 = 0;
        class129.field1802 = 0;
        class219.field3243 = 0;
        class226.field3303 = 0;
        class186.field2827 = 0;
        class8.field127 = 0;
        class335.field5000 = 0;
        class162.field2239 = 0;
        class370.field5566 = 0;
        class463.field6532 = 0;
        class110.field1561 = 0;
        class371.field5582 = 0;
        class491.field6903 = 0;
        class178.field2600 = 0;
        class365.field5515 = 0;
        class18.field235 = 0;
        class309.field4640 = 0;
        class109.field1540 = 0;
        class166.field2378 = 0;
        class477.field6697 = 0;
        class309.field4593 = 0;
        class491.field6902 = 0;
        class456.field6472 = 0;
        class36.field466 = 0;
        class312.field4710 = 0;
        class69.field937 = 0;
        class201.field3041 = 0;
        class162.field2233 = 0;
        class389.field5721 = 0;
        class109.field1523 = 0;
        class301.field4486 = 0;
        class226.field3274 = 0;
        class483.field6774 = 0;
        class95.field1350 = 0;
        class28.field368 = 0;
        class37.field485 = 0;
        class347.field5302 = 0;
        class262.field3899 = 0;
        class161.field2220 = 0;
        class346.field5279 = 0;
        class68.field925 = 0;
        class483.field6772 = 0;
        class423.field6050 = 0;
        class423.field6057 = 0;
        client.field6673 = 0;
        class226.field3308 = 0;
        class37.field474 = 0;
        class44.field607 = 0;
        class35.field438 = 0;
        class361.field5467 = 0;
        class342.field5118 = 0;
        class227.field3325 = 0;
        class360.field5450 = 0;
        class24.field312 = 0;
        class451.field6389 = 0;
        class273.field4103 = 0;
        class478.field6719 = 0;
        class412.field5950 = 0;
        class439.field6207 = 0;
        class78.field1093 = 0;
        class367.field5542 = 0;
        class130.field1810 = 0;
        class451.field6376 = 0;
        class201.field3058 = 0;
        class147.field2070 = 0;
        class3.field63 = 0;
        class370.field5575 = 0;
        class96.field1391 = 0;
        class141.field2016 = 0;
        class82.field1153 = 0;
        class184.field2720 = 0;
        class443.field6250 = 0;
        class170.field2426 = 0;
        class370.field5574 = 0;
        class228.field3332 = 0;
        class480.field6756 = 0;
        class14.field203 = 0;
        class309.field4654 = 0;
        class361.field5463 = 0;
        class5.field93 = 0;
        class307.field4582 = 0;
        class174.field2474 = 0;
        class453.field6436 = 0;
        class29.field381 = 0;
        class226.field3282 = 0;
        class301.field4482 = 0;
        class344.field5193 = 0;
        class115.field1601 = 0;
        class52.field747 = 0;
        class477.field6694 = 0;
        class40.field557 = 0;
        class349.field5315 = 0;
        class17.field215 = 0;
        class228.field3338 = 0;
        class432.field6143 = 0;
        class400.field5836 = 0;
        class473.field6630 = 0;
        class219.field3231 = 0;
        class443.field6256 = 0;
        class137.field1970 = 0;
        class401.field5856 = 0;
        class358.field5439 = 0;
        class57.field796 = 0;
        class145.field2051 = 0;
        class379.field5635 = 0;
        class166.field2334 = 0;
        class147.field2094 = 0;
        class491.field6909 = 0;
        class12.field177 = 0;
        field2300 = 0;
        class230.field3377 = 0;
        class303.field4509 = 0;
        class236.field3432 = 0;
        class137.field1973 = 0;
        class316.field4748 = 0;
        class442.field6248 = 0;
        class269.field3982 = 0;
        class390.field5741 = 0;
        class170.field2414 = 0;
        class122.field1675 = 0;
        class208.field3137 = 0;
        class436.field6170 = 0;
        class446.field6302 = 0;
        class466.field6561 = 0;
        class282.field4262 = 0;
        class178.field2551 = 0;
        class15.field209 = 0;
        class296.field4441 = 0;
        class63.field867 = 0;
        class1.field1 = 0;
        class370.field5572 = 0;
        class255.field3784 = 0;
        class412.field5948 = 0;
        class418.field6007 = 0;
        class409.field5924 = 0;
        class166.field2351 = 0;
        class184.field2725 = 0;
        class257.field3815 = 0;
        class442.field6238 = 0;
        class126.field1724 = 0;
        class356.field5420 = 0;
        class451.field6402 = 0;
        class136.field1966 = 0;
        class350.field5338 = 0;
        class2.field27 = 0;
        class49.field697 = 0;
        class109.field1537 = 0;
        class346.field5282 = 0;
        class166.field2360 = 0;
        class44.field609 = 0;
        class346.field5274 = 0;
        client.field6658 = 0;
        class391.field5757 = 0;
        class390.field5730 = 0;
        class464.field6545 = 0;
        class316.field4754 = 0;
        class306.field4557 = 0;
        class362.field5500 = 0;
        class453.field6439 = 0;
        class225.field3258 = 0;
        class462.field6522 = 0;
        class341.field5107 = 0;
        class32.field417 = 0;
        class184.field2763 = 0;
        class57.field789 = 0;
        class392.field5776 = 0;
        class350.field5342 = 0;
        class271.field4070 = 0;
        class451.field6382 = 0;
        class392.field5774 = 0;
        class48.field688 = 0;
        class365.field5521 = 0;
        class409.field5926 = 0;
        class72.field965 = 0;
        class345.field5263 = 0;
        class178.field2633 = 0;
        class412.field5963 = 0;
        class451.field6405 = 0;
        class27.field336 = 0;
        class446.field6282 = 0;
        class210.field3154 = 0;
        class446.field6273 = 0;
        class285.field4358 = 0;
        class92.field1275 = 0;
        class425.field6079 = 0;
        class394.field5808 = 0;
        class187.field2840 = 0;
        class469.field6594 = 0;
        class28.field363 = 0;
        class478.field6729 = 0;
        class273.field4099 = 0;
        class29.field377 = 0;
        class85.field1214 = 0;
        class96.field1376 = 0;
        class129.field1800 = 0;
        class451.field6379 = 0;
        class70.field945 = 0;
        class412.field5959 = 0;
        class335.field5002 = 0;
        client.field6668 = 0;
        class391.field5761 = 0;
        class83.field1181 = 0;
        class9.field149 = 0;
        class430.field6120 = 0;
        class334.field4992 = 0;
        class17.field223 = 0;
        class362.field5478 = 0;
        class334.field4991 = 0;
        class128.field1786 = 0;
        class360.field5448 = 0;
        class94.field1317 = 0;
        class55.field777 = 0;
        class324.field4866 = 0;
        class70.field949 = 0;
        class247.field3587 = 0;
        class229.field3352 = 0;
        class28.field370 = 0;
        class441.field6230 = 0;
        class8.field130 = 0;
        class166.field2379 = 0;
        class184.field2789 = 0;
        class257.field3807 = 0;
        class451.field6392 = 0;
        class166.field2368 = 0;
        class446.field6271 = 0;
        class38.field513 = 0;
        class187.field2843 = 0;
        class349.field5330 = 0;
        class257.field3846 = 0;
        class390.field5731 = 0;
        class3.field70 = 0;
        class230.field3378 = 0;
        class257.field3841 = 0;
        class373.field5602 = 0;
        class442.field6247 = 0;
        class384.field5681 = 0;
        class257.field3821 = 0;
        class17.field222 = 0;
        class229.field3356 = 0;
        class301.field4483 = 0;
        class335.field5018 = 0;
        class365.field5520 = 0;
        class226.field3294 = 0;
        class446.field6284 = 0;
        class166.field2363 = 0;
        class489.field6860 = 0;
        class423.field6052 = 0;
        class302.field4496 = 0;
        class279.field4225 = 0;
        class271.field4013 = 0;
        class257.field3818 = 0;
        class286.field4365 = 0;
        class85.field1207 = 0;
        class446.field6322 = 0;
        class200.field3028 = 0;
        class166.field2353 = 0;
        class176.field2497 = 0;
        class314.field4721 = 0;
        class72.field973 = 0;
        class270.field3989 = 0;
        class164.field2273 = 0;
        class200.field3024 = 0;
        class109.field1533 = 0;
        class142.field2025 = 0;
        class446.field6278 = 0;
        class309.field4638 = 0;
        class446.field6274 = 0;
        class349.field5321 = 0;
        class330.field4949 = 0;
        class200.field3031 = 0;
        class46.field668 = 0;
        class210.field3155 = 0;
        class286.field4367 = 0;
        class408.field5917 = 0;
        class320.field4784 = 0;
        class335.field5009 = 0;
        class410.field5935 = 0;
        class228.field3337 = 0;
        class128.field1782 = 0;
        class230.field3381 = 0;
        class43.field588 = 0;
        class327.field4906 = 0;
        class403.field5883 = 0;
        class362.field5474 = 0;
        class451.field6383 = 0;
        class345.field5251 = 0;
        class330.field4955 = 0;
        class334.field4989 = 0;
        class226.field3280 = 0;
        class382.field5661 = 0;
        class219.field3230 = 0;
        class298.field4456 = 0;
        class390.field5733 = 0;
        class478.field6707 = 0;
        class362.field5472 = 0;
        class96.field1372 = 0;
        class349.field5310 = 0;
        class331.field4957 = 0;
        class295.field4436 = 0;
        class37.field488 = 0;
        client.field6657 = 0;
        class236.field3437 = 0;
        field2283 = 0;
        class109.field1524 = 0;
        class451.field6396 = 0;
        class184.field2746 = 0;
        class492.field6931 = 0;
        class3.field57 = 0;
        class391.field5755 = 0;
        class492.field6914 = 0;
        class229.field3363 = 0;
        class163.field2258 = 0;
        class335.field5004 = 0;
        class461.field6505 = 0;
        class317.field4763 = 0;
        class92.field1279 = 0;
        class468.field6582 = 0;
        class129.field1806 = 0;
        class6.field97 = 0;
        class166.field2327 = 0;
        class263.field3917 = 0;
        class44.field619 = 0;
        class44.field617 = 0;
        class340.field5094 = 0;
        class83.field1168 = 0;
        class279.field4224 = 0;
        class158.field2198 = 0;
        class283.field4294 = 0;
        class468.field6589 = 0;
        class136.field1965 = 0;
        class334.field4993 = 0;
        class228.field3329 = 0;
        field2316 = 0;
        class299.field4467 = 0;
        class230.field3384 = 0;
        class129.field1809 = 0;
        class309.field4645 = 0;
        class212.field3200 = 0;
        class184.field2778 = 0;
        class50.field724 = 0;
        class178.field2558 = 0;
        class95.field1340 = 0;
        class198.field2973 = 0;
        class166.field2382 = 0;
        class29.field392 = 0;
        class166.field2326 = 0;
        class469.field6598 = 0;
        class391.field5753 = 0;
        class360.field5457 = 0;
        class479.field6743 = 0;
        class350.field5339 = 0;
        class170.field2415 = 0;
        class463.field6541 = 0;
        class322.field4801 = 0;
        class36.field447 = 0;
        class2.field24 = 0;
        class57.field792 = 0;
        class341.field5106 = 0;
        class237.field3450 = 0;
        class346.field5275 = 0;
        class169.field2404 = 0;
        class412.field5955 = 0;
        class424.field6061 = 0;
        class48.field691 = 0;
        class327.field4911 = 0;
        class281.field4239 = 0;
        class129.field1794 = 0;
        class427.field6098 = 0;
        class491.field6887 = 0;
        class105.field1464 = 0;
        class36.field458 = 0;
        class318.field4769 = 0;
        class454.field6453 = 0;
        class454.field6451 = 0;
        class75.field1054 = 0;
        field2309 = 0;
        class174.field2466 = 0;
        class226.field3302 = 0;
        class216.field3213 = 0;
        class238.field3470 = 0;
        class347.field5300 = 0;
        class480.field6758 = 0;
        class322.field4819 = 0;
        class330.field4943 = 0;
        class423.field6048 = 0;
        class235.field3423 = 0;
        class475.field6645 = 0;
        class84.field1187 = 0;
        class349.field5323 = 0;
        class327.field4895 = 0;
        class290.field4407 = 0;
        class342.field5113 = 0;
        class122.field1679 = 0;
        class446.field6311 = 0;
        class69.field940 = 0;
        class358.field5433 = 0;
        class78.field1103 = 0;
        class129.field1808 = 0;
        class138.field1987 = 0;
        class201.field3053 = 0;
        class84.field1185 = 0;
        class269.field3988 = 0;
        class456.field6479 = 0;
        class206.field3113 = 0;
        class36.field464 = 0;
        class446.field6281 = 0;
        class310.field4684 = 0;
        class309.field4602 = 0;
        class439.field6195 = 0;
        class29.field394 = 0;
        class82.field1151 = 0;
        class138.field1985 = 0;
        class403.field5875 = 0;
        class253.field3633 = 0;
        class170.field2418 = 0;
        class324.field4864 = 0;
        class391.field5752 = 0;
        class345.field5265 = 0;
        class94.field1320 = 0;
        class327.field4888 = 0;
        class287.field4388 = 0;
        class38.field525 = 0;
        class426.field6083 = 0;
        class335.field5015 = 0;
        class484.field6788 = 0;
        class29.field385 = 0;
        class49.field699 = 0;
        class4.field78 = 0;
        class161.field2222 = 0;
        class166.field2344 = 0;
        class451.field6381 = 0;
        class129.field1791 = 0;
        class227.field3324 = 0;
        class201.field3059 = 0;
        class57.field795 = 0;
        class446.field6319 = 0;
        class392.field5793 = 0;
        class197.field2966 = 0;
        class338.field5066 = 0;
        class316.field4750 = 0;
        class318.field4776 = 0;
        class384.field5686 = 0;
        class219.field3239 = 0;
        class23.field301 = 0;
        class176.field2500 = 0;
        class306.field4559 = 0;
        class451.field6394 = 0;
        class68.field928 = 0;
        class170.field2417 = 0;
        class109.field1538 = 0;
        class466.field6558 = 0;
        class246.field3529 = 0;
        class307.field4583 = 0;
        class269.field3976 = 0;
        class4.field75 = 0;
        class46.field665 = 0;
        class157.field2179 = 0;
        class299.field4468 = 0;
        class131.field1820 = 0;
        class371.field5588 = 0;
        class109.field1528 = 0;
        class94.field1307 = 0;
        class166.field2349 = 0;
        class186.field2814 = 0;
        class119.field1662 = 0;
        class37.field482 = 0;
        class253.field3635 = 0;
        class486.field6826 = 0;
        class451.field6400 = 0;
        class391.field5751 = 0;
        class287.field4389 = 0;
        class446.field6266 = 0;
        class28.field364 = 0;
        class349.field5332 = 0;
        class105.field1460 = 0;
        class451.field6407 = 0;
        class484.field6786 = 0;
        class197.field2963 = 0;
        class166.field2328 = 0;
        class237.field3449 = 0;
        class12.field174 = 0;
        class295.field4434 = 0;
        class303.field4516 = 0;
        class251.field3610 = 0;
        class491.field6892 = 0;
        class116.field1612 = 0;
        class285.field4357 = 0;
        class446.field6308 = 0;
        class371.field5591 = 0;
        class286.field4366 = 0;
        class6.field96 = 0;
        class432.field6133 = 0;
        class463.field6533 = 0;
        class103.field1434 = 0;
        class226.field3299 = 0;
        class282.field4257 = 0;
        class392.field5775 = 0;
        class297.field4446 = 0;
        class110.field1552 = 0;
        class245.field3523 = 0;
        class229.field3360 = 0;
        class463.field6535 = 0;
        field2292 = 0;
        class49.field717 = 0;
        class451.field6391 = 0;
        class392.field5770 = 0;
        class37.field487 = 0;
        class340.field5093 = 0;
        class110.field1553 = 0;
        class228.field3348 = 0;
        class469.field6599 = 0;
        class477.field6690 = 0;
        class246.field3575 = 0;
        class36.field463 = 0;
        class400.field5846 = 0;
        class183.field2719 = 0;
        class489.field6862 = 0;
        class230.field3375 = 0;
        class253.field3639 = 0;
        class451.field6370 = 0;
        class169.field2408 = 0;
        class109.field1535 = 0;
        class258.field3850 = 0;
        class446.field6280 = 0;
        class3.field69 = 0;
        class81.field1142 = 0;
        field2315 = 0;
        class419.field6020 = 0;
        class12.field168 = 0;
        class105.field1466 = 0;
        class463.field6526 = 0;
        class439.field6216 = 0;
        class12.field173 = 0;
        field2312 = 0;
        class454.field6446 = 0;
        class463.field6536 = 0;
        class229.field3366 = 0;
        class340.field5091 = 0;
        class271.field4025 = 0;
        class331.field4960 = 0;
        class325.field4874 = 0;
        class94.field1325 = 0;
        class456.field6480 = 0;
        class475.field6648 = 0;
        class400.field5852 = 0;
        class85.field1203 = 0;
        class246.field3555 = 0;
        class362.field5476 = 0;
        class309.field4614 = 0;
        class78.field1092 = 0;
        class382.field5653 = 0;
        class129.field1801 = 0;
        class257.field3817 = 0;
        class203.field3082 = 0;
        class49.field711 = 0;
        class236.field3438 = 0;
        class247.field3582 = 0;
        class225.field3257 = 0;
        class182.field2694 = 0;
        class451.field6387 = 0;
        class44.field622 = 0;
        class314.field4730 = 0;
        class461.field6507 = 0;
        class237.field3459 = 0;
        class412.field5952 = 0;
        class53.field758 = 0;
        class446.field6290 = 0;
        class485.field6815 = 0;
        class297.field4447 = 0;
        class433.field6155 = 0;
        class391.field5768 = 0;
        class327.field4891 = 0;
        class116.field1619 = 0;
        class96.field1373 = 0;
        class237.field3456 = 0;
        class155.field2158 = 0;
        class157.field2185 = 0;
        class419.field6013 = 0;
        class46.field667 = 0;
        class258.field3852 = 0;
        class132.field1837 = 0;
        class36.field461 = 0;
        class315.field4741 = 0;
        class157.field2177 = 0;
        class154.field2153 = 0;
        class18.field243 = 0;
        class219.field3229 = 0;
        class3.field53 = 0;
        class122.field1676 = 0;
        class157.field2182 = 0;
        class387.field5711 = 0;
        class232.field3406 = 0;
        class258.field3854 = 0;
        class306.field4560 = 0;
        class100.field1426 = 0;
        class198.field2992 = 0;
        class229.field3364 = 0;
        class237.field3457 = 0;
        class395.field5812 = 0;
        class347.field5293 = 0;
        class73.field987 = 0;
        class116.field1626 = 0;
        class478.field6714 = 0;
        class295.field4432 = 0;
        class412.field5964 = 0;
        class346.field5278 = 0;
        class17.field218 = 0;
        class13.field190 = 0;
        class412.field5958 = 0;
        class129.field1803 = 0;
        class467.field6574 = 0;
        class253.field3638 = 0;
        class68.field918 = 0;
        class349.field5327 = 0;
        class115.field1592 = 0;
        class493.field6941 = 0;
        class69.field939 = 0;
        class371.field5583 = 0;
        class309.field4625 = 0;
        class446.field6283 = 0;
        class147.field2086 = 0;
        class479.field6746 = 0;
        class335.field5017 = 0;
        class24.field318 = 0;
        class134.field1948 = 0;
        class327.field4899 = 0;
        class331.field4962 = 0;
        class362.field5496 = 0;
        class282.field4258 = 0;
        class157.field2181 = 0;
        class200.field3013 = 0;
        class119.field1663 = 0;
        class166.field2366 = 0;
        class398.field5828 = 0;
        class90.field1256 = 0;
        class423.field6055 = 0;
        class406.field5907 = 0;
        class257.field3805 = 0;
        class446.field6331 = 0;
        class337.field5041 = 0;
        class262.field3902 = 0;
        class44.field612 = 0;
        class96.field1375 = 0;
        class307.field4586 = 0;
        class299.field4464 = 0;
        class216.field3216 = 0;
        class372.field5599 = 0;
        class351.field5352 = 0;
        class37.field480 = 0;
        class349.field5318 = 0;
        class350.field5343 = 0;
        class451.field6393 = 0;
        class9.field148 = 0;
        class3.field55 = 0;
        class410.field5937 = 0;
        class13.field186 = 0;
        class240.field3482 = 0;
        class390.field5732 = 0;
        class209.field3148 = 0;
        class228.field3342 = 0;
        class446.field6313 = 0;
        class439.field6204 = 0;
        class83.field1183 = 0;
        class229.field3354 = 0;
        class425.field6081 = 0;
        class131.field1822 = 0;
        class333.field4979 = 0;
        class491.field6888 = 0;
        class320.field4782 = 0;
        class356.field5406 = 0;
        class176.field2502 = 0;
        class416.field5993 = 0;
        class262.field3883 = 0;
        class428.field6106 = 0;
        class144.field2048 = 0;
        class408.field5918 = 0;
        class18.field237 = 0;
        class357.field5425 = 0;
        class335.field4999 = 0;
        class193.field2943 = 0;
        class44.field631 = 0;
        field2288 = 0;
        class459.field6496 = 0;
        class14.field207 = 0;
        class266.field3958 = 0;
        class268.field3966 = 0;
        class84.field1189 = 0;
        class43.field586 = 0;
        class356.field5391 = 0;
        class183.field2706 = 0;
        class57.field791 = 0;
        class472.field6616 = 0;
        class134.field1955 = 0;
        class392.field5771 = 0;
        class307.field4573 = 0;
        field2287 = 0;
        class226.field3287 = 0;
        class484.field6793 = 0;
        class257.field3823 = 0;
        class330.field4946 = 0;
        class24.field311 = 0;
        class229.field3358 = 0;
        class179.field2671 = 0;
        class473.field6626 = 0;
        class451.field6390 = 0;
        class29.field383 = 0;
        class225.field3255 = 0;
        class138.field1989 = 0;
        class427.field6099 = 0;
        class126.field1720 = 0;
        class71.field955 = 0;
        class303.field4514 = 0;
        class94.field1299 = 0;
        class285.field4356 = 0;
        class109.field1530 = 0;
        class360.field5454 = 0;
        class49.field705 = 0;
        class246.field3557 = 0;
        class142.field2024 = 0;
        class166.field2323 = 0;
        class172.field2443 = 0;
        class446.field6324 = 0;
        class314.field4726 = 0;
        class129.field1795 = 0;
        class452.field6414 = 0;
        class94.field1313 = 0;
        class446.field6268 = 0;
        class227.field3318 = 0;
        class204.field3098 = 0;
        class262.field3903 = 0;
        class250.field3596 = 0;
        class480.field6754 = 0;
        class294.field4427 = 0;
        class122.field1685 = 0;
        class294.field4428 = 0;
        class163.field2259 = 0;
        class263.field3916 = 0;
        class356.field5408 = 0;
        class142.field2032 = 0;
        class465.field6554 = 0;
        class306.field4564 = 0;
        class176.field2501 = 0;
        class370.field5565 = 0;
        class147.field2081 = 0;
        class410.field5928 = 0;
        class321.field4792 = 0;
        class256.field3790 = 0;
        class49.field720 = 0;
        class116.field1609 = 0;
        class38.field505 = 0;
        class201.field3042 = 0;
        class436.field6166 = 0;
        class283.field4275 = 0;
        class138.field1988 = 0;
        class124.field1706 = 0;
        class162.field2244 = 0;
        class484.field6785 = 0;
        class491.field6889 = 0;
        class171.field2434 = 0;
        class18.field244 = 0;
        class330.field4933 = 0;
        class71.field954 = 0;
        class85.field1217 = 0;
        class29.field397 = 0;
        class344.field5196 = 0;
        class279.field4221 = 0;
        class132.field1838 = 0;
        class456.field6484 = 0;
        class69.field933 = 0;
        class271.field4022 = 0;
        class446.field6265 = 0;
        class353.field5368 = 0;
        class225.field3260 = 0;
        class439.field6217 = 0;
        class320.field4789 = 0;
        class269.field3972 = 0;
        class302.field4493 = 0;
        class371.field5593 = 0;
        class320.field4788 = 0;
        class485.field6810 = 0;
        class1.field8 = 0;
        class84.field1194 = 0;
        class483.field6777 = 0;
        class88.field1241 = 0;
        class283.field4333 = 0;
        class201.field3045 = 0;
        class69.field935 = 0;
        class392.field5769 = 0;
        class307.field4580 = 0;
        class287.field4381 = 0;
        class347.field5290 = 0;
        class246.field3569 = 0;
        class400.field5841 = 0;
        class17.field228 = 0;
        class422.field6040 = 0;
        class489.field6864 = 0;
        class327.field4898 = 0;
        class6.field102 = 0;
        class237.field3455 = 0;
        class176.field2499 = 0;
        class443.field6252 = 0;
        class293.field4416 = 0;
        class312.field4701 = 0;
        class200.field3029 = 0;
        class182.field2697 = 0;
        class1.field2 = 0;
        class337.field5040 = 0;
        class391.field5758 = 0;
        class184.field2758 = 0;
        class483.field6775 = 0;
        class463.field6524 = 0;
        class443.field6253 = 0;
        class296.field4442 = 0;
        class246.field3566 = 0;
        class406.field5910 = 0;
        class451.field6367 = 0;
        class479.field6744 = 0;
        class371.field5592 = 0;
        field2293 = 0;
        class341.field5103 = 0;
        class452.field6412 = 0;
        class302.field4497 = 0;
        class309.field4590 = 0;
        class356.field5407 = 0;
        client.field6659 = 0;
        class52.field751 = 0;
        class166.field2376 = 0;
        class8.field128 = 0;
        class453.field6426 = 0;
        class37.field478 = 0;
        class446.field6272 = 0;
        class147.field2097 = 0;
        class29.field384 = 0;
        class312.field4700 = 0;
        class451.field6401 = 0;
        class201.field3046 = 0;
        class146.field2063 = 0;
        class303.field4507 = 0;
        class360.field5452 = 0;
        class268.field3964 = 0;
        class400.field5848 = 0;
        class335.field4996 = 0;
        class400.field5844 = 0;
        class232.field3401 = 0;
        class446.field6307 = 0;
        class363.field5509 = 0;
        class90.field1254 = 0;
        class356.field5404 = 0;
        class124.field1703 = 0;
        class480.field6765 = 0;
        class430.field6123 = 0;
        class49.field721 = 0;
        class51.field742 = 0;
        class378.field5621 = 0;
        class246.field3538 = 0;
        class330.field4944 = 0;
        class286.field4363 = 0;
        class392.field5772 = 0;
        class246.field3565 = 0;
        class163.field2251 = 0;
        class463.field6539 = 0;
        class493.field6936 = 0;
        class269.field3984 = 0;
        class479.field6748 = 0;
        class162.field2232 = 0;
        class230.field3383 = 0;
        class330.field4945 = 0;
        class103.field1437 = 0;
        class46.field656 = 0;
        class115.field1594 = 0;
        class163.field2255 = 0;
        class119.field1649 = 0;
        class1.field13 = 0;
        class246.field3564 = 0;
        class119.field1650 = 0;
        class362.field5473 = 0;
        class162.field2242 = 0;
        class465.field6557 = 0;
        class485.field6806 = 0;
        class477.field6680 = 0;
        class478.field6709 = 0;
        class70.field944 = 0;
        class37.field489 = 0;
        class380.field5644 = 0;
        class8.field140 = 0;
        class200.field3034 = 0;
        class111.field1569 = 0;
        class81.field1133 = 0;
        class141.field2008 = 0;
        class255.field3785 = 0;
        class391.field5763 = 0;
        class37.field481 = 0;
        class58.field808 = 0;
        class448.field6342 = 0;
        class65.field895 = 0;
        class201.field3050 = 0;
        class463.field6527 = 0;
        class229.field3351 = 0;
        class260.field3865 = 0;
        class349.field5314 = 0;
        class138.field1981 = 0;
        class132.field1844 = 0;
        class446.field6332 = 0;
        class134.field1950 = 0;
        class238.field3465 = 0;
        class320.field4783 = 0;
        class382.field5655 = 0;
        class318.field4771 = 0;
        class109.field1526 = 0;
        class480.field6752 = 0;
        class281.field4238 = 0;
        class36.field473 = 0;
        class226.field3293 = 0;
        class120.field1668 = 0;
        class426.field6087 = 0;
        class111.field1565 = 0;
        class47.field678 = 0;
        class137.field1974 = 0;
        class356.field5400 = 0;
        class325.field4872 = 0;
        class427.field6100 = 0;
        field2306 = 0;
        class318.field4770 = 0;
        class65.field897 = 0;
        class230.field3380 = 0;
        class147.field2095 = 0;
        class279.field4226 = 0;
        class273.field4128 = 0;
        class414.field5972 = 0;
        class424.field6072 = 0;
        class44.field599 = 0;
        class390.field5735 = 0;
        class338.field5073 = 0;
        class349.field5325 = 0;
        class231.field3392 = 0;
        class491.field6907 = 0;
        class166.field2384 = 0;
        class21.field263 = 0;
        class122.field1677 = 0;
        class391.field5754 = 0;
        class446.field6275 = 0;
        class95.field1345 = 0;
        class485.field6818 = 0;
        class346.field5280 = 0;
        class147.field2071 = 0;
        class138.field1978 = 0;
        class137.field1969 = 0;
        class188.field2855 = 0;
        class303.field4504 = 0;
        class180.field2682 = 0;
        class446.field6292 = 0;
        class38.field515 = 0;
        class161.field2214 = 0;
        class353.field5366 = 0;
        class12.field176 = 0;
        class294.field4431 = 0;
        class33.field427 = 0;
        class439.field6208 = 0;
        class390.field5739 = 0;
        class48.field687 = 0;
        class43.field573 = 0;
        class371.field5590 = 0;
        class25.field326 = 0;
        class427.field6097 = 0;
        class154.field2144 = 0;
        class141.field2010 = 0;
        class310.field4691 = 0;
        client.field6661 = 0;
        class37.field483 = 0;
        class199.field2997 = 0;
        class75.field1026 = 0;
        class23.field306 = 0;
        class129.field1797 = 0;
        class423.field6049 = 0;
        class184.field2730 = 0;
        class330.field4942 = 0;
        class256.field3792 = 0;
        class45.field642 = 0;
        client.field6666 = 0;
        class188.field2872 = 0;
        class123.field1691 = 0;
        class307.field4575 = 0;
        class178.field2658 = 0;
        class271.field4009 = 0;
        class446.field6303 = 0;
        class204.field3095 = 0;
        class29.field388 = 0;
        class257.field3825 = 0;
        class44.field601 = 0;
        class88.field1239 = 0;
        class312.field4712.method1122((byte) -30);
        class115.field1597 = true;
        class78.field1104 = true;
        class6.method40((byte) -108);
        class230.field3390.field6315 = 0;
        class147.field2072 = 0;
        class273.field4143 = null;
        class280.field4236 = null;
        class147.field2099 = null;
        class352.field5365 = 0;
        class392.field5788 = null;
        class32.field422 = 0;
        class220.field3246.field6315 = 0;
        for (int var1 = 0; var1 < class365.field5522.length; var1++) {
            class365.field5522[var1] = null;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            class261.field3874[var2] = null;
        }
        class324.field4869 = (int) (Math.random() * 110.0D) - 55;
        class423.field6058 = (int) (Math.random() * 100.0D) - 50;
        class198.field2984 = 0;
        class17.field226 = 0;
        class465.field6555 = (int) (Math.random() * 80.0D) - 40;
        class384.field5682 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
        class347.field5291 = (int) (Math.random() * 120.0D) - 60;
        class432.field6152 = false;
        class358.field5437 = (int) (Math.random() * 30.0D) - 20;
        class115.method821(115);
        for (int var3 = 0; var3 < 2048; var3++) {
            class40.field565[var3] = null;
        }
        class256.field3797 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class18.field241[var4] = null;
        }
        class36.field460.method2459(300);
        class467.field6578.method2459(300);
        class322.field4845.method1590(arg0 - 27978);
        class491.field6897.method2299((byte) -50);
        class428.field6108 = new class412();
        class157.field2190 = 0;
        class425.field6082 = 0;
        class315.field4736.method27(false);
        class297.method1861(0);
        class77.field1089 = 0;
        class88.field1246 = 0;
        class88.field1243 = 0;
        class306.field4562 = 0;
        class15.field210 = 0;
        class251.field3622 = 0;
        class2.field42 = 0;
        class486.field6835 = 0;
        class310.field4693 = 0;
        class358.field5438 = 0;
        for (int var5 = 0; var5 < class156.field2170.length; var5++) {
            if (!class12.field158[var5]) {
                class156.field2170[var5] = -1;
            }
        }
        if (class279.field4220 != -1) {
            class427.method2514((byte) -37, class279.field4220);
        }
        for (class468 var6 = (class468) class466.field6564.method2296((byte) 39); var6 != null; var6 = (class468) class466.field6564.method2297(true)) {
            if (!var6.method282(arg0 ^ 0x324B)) {
                var6 = (class468) class466.field6564.method2296((byte) 39);
                if (var6 == null) {
                    break;
                }
            }
            class479.method2811(1711162608, false, var6, true);
        }
        class279.field4220 = -1;
        class466.field6564 = new class371(8);
        class137.method960(-18170);
        class232.field3403 = null;
        for (int var7 = 0; var7 < 8; var7++) {
            class163.field2267[var7] = null;
            class432.field6132[var7] = false;
            class447.field6336[var7] = -1;
        }
        class172.method1187(arg0 ^ 0x3227);
        class179.field2673 = true;
        for (int var8 = 0; var8 < 100; var8++) {
            class103.field1442[var8] = true;
        }
        class119.field1651 = null;
        class210.field3152 = 0;
        class353.field5369 = null;
        for (int var9 = 0; var9 < 6; var9++) {
            class447.field6338[var9] = new class379();
        }
        for (int var10 = 0; var10 < 25; var10++) {
            class126.field1721[var10] = 0;
            class219.field3242[var10] = 0;
            class441.field6227[var10] = 0;
        }
        class414.method2471(arg0 ^ arg0);
        class306.field4561 = class146.field2065 = class398.field5830 = class76.field1075 = new short[256];
        class380.field5645 = true;
        class200.field3036 = class485.field6808.method2036(class4.field85, (byte) -21);
        class337.field5038.field5453 = false;
        class337.field5038.field5456 = false;
        class81.field1138 = 0;
        class3.method23(-123);
        class81.method667((byte) -125);
        class73.field983.field6378 = 2;
        class51.field741 = 0L;
        class3.field64 = null;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    private final void method1121(byte arg0) {
        field2300++;
        long var2 = class435.method2539(-10659);
        long var4 = class9.field143[class429.field6116];
        class9.field143[class429.field6116] = var2;
        class429.field6116 = class429.field6116 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class83.field1174 = ((var6 >> 1) + 32000) / var6;
        }
        if (class472.field6618++ > 50) {
            class472.field6618 -= 50;
            class442.field6243 = true;
            class378.field5618.setSize(class342.field5115, class233.field3411);
            class378.field5618.setVisible(true);
            if (class316.field4749 != null && class123.field1698 == null) {
                Insets var7 = class316.field4749.getInsets();
                class378.field5618.setLocation(class73.field979 + var7.left, class433.field6157 + var7.top);
            } else {
                class378.field5618.setLocation(class73.field979, class433.field6157);
            }
        }
        this.method1119((byte) 23);
        if (arg0 != -66) {
            field2299 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "stop", descriptor = "()V")
    public final void stop() {
        field2314++;
        if (class391.field5767 == this && !class89.field1247) {
            class380.field5643 = class435.method2539(-10659) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2305++;
        if (class316.field4749 == null) {
            return class21.field261 == null || class21.field261.field2125 == this ? super.getCodeBase() : class21.field261.field2125.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class389.field5722 = true;
        field2286++;
        class442.field6243 = true;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    public final void method1122(byte arg0) {
        if (arg0 != -30) {
            this.start();
        }
        field2294++;
        if (this.field2301) {
            return;
        }
        try {
            class397 var2 = class21.field261.method1029(arg0 + 110, class391.field5767.getClass());
            while (var2.field5822 == 0) {
                class325.method2005(true, 100L);
            }
            if (var2.field5823 != null) {
                throw (Throwable) var2.field5823;
            }
            jagmisc.init();
            this.field2301 = true;
            class260.field3869 = class228.method1481((byte) -89);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILjava/lang/String;IIZBI)V")
    public final void method1123(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5, byte arg6, int arg7) {
        try {
            class73.field979 = 0;
            class233.field3411 = arg7;
            class321.field4794 = arg7;
            class342.field5115 = arg1;
            class297.field4450 = arg1;
            class391.field5767 = this;
            class89.field1250 = arg4;
            class433.field6157 = 0;
            class316.field4749 = new Frame();
            class316.field4749.setTitle("Jagex");
            class316.field4749.setResizable(true);
            class316.field4749.addWindowListener(this);
            class316.field4749.setVisible(true);
            class316.field4749.toFront();
            Insets var9 = class316.field4749.getInsets();
            class316.field4749.setSize(class297.field4450 + var9.right + var9.left, class321.field4794 + var9.bottom - -var9.top);
            client.field6670 = class21.field261 = new class153((Applet) null, arg3, arg2, arg0);
            class397 var10 = class21.field261.method1040(2, 1, this);
            while (var10.field5822 == 0) {
                class325.method2005(true, 10L);
            }
        } catch (Exception var12) {
            class416.method2475(false, var12, (String) null);
        }
        if (arg6 != -70) {
            this.field2304 = true;
        }
        field2312++;
    }

    @OriginalMember(owner = "client!pj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2283++;
        if (class391.field5767 != this || class89.field1247) {
            return;
        }
        class442.field6243 = true;
        if (class347.field5294 && class435.method2539(-10659) - class182.field2699 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class297.field4450 && var2.height >= class321.field4794) {
                class115.field1607 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBI)V")
    public final void method1124(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2315++;
        try {
            if (class391.field5767 == null) {
                if (arg3 <= 70) {
                    method1120(27);
                }
                class89.field1250 = arg0;
                class233.field3411 = arg1;
                class321.field4794 = arg1;
                class73.field979 = 0;
                class433.field6157 = 0;
                class391.field5767 = this;
                class342.field5115 = arg2;
                class297.field4450 = arg2;
                if (class21.field261 == null) {
                    client.field6670 = class21.field261 = new class153(this, arg4, (String) null, 0);
                }
                class397 var6 = class21.field261.method1040(2, 1, this);
                while (var6.field5822 == 0) {
                    class325.method2005(true, 10L);
                }
            } else {
                class105.field1478++;
                if (class105.field1478 >= 3) {
                    this.method1117("alreadyloaded", (byte) -50);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class416.method2475(false, var8, (String) null);
            this.method1117("crash", (byte) -50);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public abstract void method1125(int arg0);

    @OriginalMember(owner = "client!pj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2316++;
        if (class316.field4749 == null) {
            return class21.field261 == null || class21.field261.field2125 == this ? super.getParameter(arg0) : class21.field261.field2125.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2293++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method1126(boolean arg0) {
        if (!arg0) {
            field2299 = null;
        }
        field2299 = null;
    }

    @OriginalMember(owner = "client!pj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2302++;
    }

    @OriginalMember(owner = "client!pj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
    public final boolean method1127(boolean arg0) {
        field2291++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else if (arg0) {
                this.method1117("invalidhost", (byte) -50);
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lak;III)V")
    public static final void method1128(class32 arg0, int arg1, int arg2, int arg3) {
        long var4 = class275.field4190[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field415 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field418[arg0.field415++] = class78.field1108[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field415; var9 < 4; var9++) {
            arg0.field418[var9] = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    private final void method1129(byte arg0) {
        int var2 = -84 / ((arg0 - 18) / 36);
        field2311++;
        long var3 = class435.method2539(-10659);
        long var5 = class281.field4245[class452.field6416];
        class281.field4245[class452.field6416] = var3;
        boolean var10000;
        if (var5 == 0L || var5 >= var3) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class452.field6416 = class452.field6416 + 1 & 0x1F;
        synchronized (this) {
            class78.field1104 = class389.field5722;
        }
        this.method1125(20490);
    }

    @OriginalMember(owner = "client!pj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2295++;
    }

    @OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2309++;
        class389.field5722 = false;
    }

    @OriginalMember(owner = "client!pj", name = "run", descriptor = "()V")
    public final void run() {
        field2289++;
        try {
            label114: {
                if (class153.field2129 != null) {
                    String var1 = class153.field2129.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class153.field2127;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1117("wrongjava", (byte) -50);
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class153.field2127 == null || class153.field2127.equals("1.4.2"))) {
                        this.method1117("wrongjava", (byte) -50);
                        break label114;
                    }
                }
                if (class153.field2127 != null && class153.field2127.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class153.field2127.length()) {
                        char var5 = class153.field2127.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class347.field5294 = true;
                    }
                }
                if (class21.field261.field2125 != null) {
                    Method var6 = class153.field2141;
                    if (var6 != null) {
                        try {
                            var6.invoke(class21.field261.field2125, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class313.method1938(0);
                class279.method1798((byte) 106);
                this.method1130(0);
                this.method1131(true);
                class260.field3869 = class228.method1481((byte) -89);
                this.method1122((byte) -30);
                while (class380.field5643 == 0L || class435.method2539(-10659) < class380.field5643) {
                    class293.field4418 = class260.field3869.method719(-70, class171.field2435);
                    for (int var7 = 0; var7 < class293.field4418; var7++) {
                        this.method1129((byte) 89);
                    }
                    this.method1121((byte) -66);
                    class450.method2652(class21.field261, class378.field5618, 50);
                }
            }
        } catch (Exception var10) {
            class416.method2475(false, var10, (String) null);
            this.method1117("crash", (byte) -50);
        }
        this.method1118((byte) 107, true);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final synchronized void method1130(int arg0) {
        if (class378.field5618 != null) {
            class378.field5618.removeFocusListener(this);
            class378.field5618.getParent().remove(class378.field5618);
        }
        field2287++;
        Container var2;
        if (class123.field1698 != null) {
            var2 = class123.field1698;
        } else if (class316.field4749 == null) {
            var2 = class21.field261.field2125;
        } else {
            var2 = class316.field4749;
        }
        var2.setLayout((LayoutManager) null);
        class378.field5618 = new class261(this);
        var2.add(class378.field5618);
        class378.field5618.setSize(class342.field5115, class233.field3411);
        class378.field5618.setVisible(true);
        if (class316.field4749 == var2) {
            Insets var3 = class316.field4749.getInsets();
            class378.field5618.setLocation(class73.field979 + var3.left, var3.top - -class433.field6157);
        } else {
            class378.field5618.setLocation(class73.field979, class433.field6157);
        }
        class378.field5618.addFocusListener(this);
        class378.field5618.requestFocus();
        class389.field5722 = true;
        class78.field1104 = true;
        class442.field6243 = true;
        if (arg0 != 0) {
            field2299 = null;
        }
        class115.field1607 = false;
        class182.field2699 = class435.method2539(-10659);
    }

    @OriginalMember(owner = "client!pj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2290++;
        if (class316.field4749 == null) {
            return class21.field261 == null || class21.field261.field2125 == this ? super.getAppletContext() : class21.field261.field2125.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
    public abstract void method1131(boolean arg0);

    @OriginalMember(owner = "client!pj", name = "providesignlink", descriptor = "(Lng;)V")
    public static final void providesignlink(class153 arg0) {
        class21.field261 = arg0;
        client.field6670 = arg0;
        field2297++;
    }

    @OriginalMember(owner = "client!pj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2310++;
    }

    @OriginalMember(owner = "client!pj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2292++;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public abstract void method1132(int arg0);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public abstract void method1133(int arg0);
}
