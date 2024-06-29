import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class107 extends class66 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lrd;")
    public static class114 field2460 = class84.method656("60 Sekunden noch einmal)3)3)3", (byte) 120);

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static volatile int field2452 = -1;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "Ldd;")
    public static class26 field2467 = new class26(30);

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field2474 = -1;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Lrd;")
    private static class114 field2475 = class84.method656("Walk here", (byte) 115);

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Lrd;")
    public static class114 field2476 = class84.method656("Offline", (byte) 115);

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Z")
    public static boolean field2479 = false;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "[I")
    public static int[] field2480 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "Lrd;")
    private static class114 field2481 = class84.method656("level)2", (byte) 118);

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Lrd;")
    public static class114 field2470 = field2475;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lrd;")
    public static class114 field2477 = field2481;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lrd;")
    public static class114 field2471 = class84.method656("Unerwartete Antwort vom Anmelde)2Server)3", (byte) 118);

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Lrd;")
    public static class114 field2478 = class84.method656("redstone3", (byte) 114);

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2462;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2453;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
    public static void method815(byte arg0) {
        field2471 = null;
        field2475 = null;
        field2476 = null;
        field2470 = null;
        field2460 = null;
        int var1 = 118 % ((arg0 - 30) / 35);
        field2467 = null;
        field2480 = null;
        field2477 = null;
        field2481 = null;
        field2478 = null;
    }

    @OriginalMember(owner = "client!qc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2468;
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2464;
    }

    @OriginalMember(owner = "client!qc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2459;
        this.field2453 = arg0;
        arg0.setDimensions(super.field1421, super.field1420);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2462);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2457;
        return this.field2453 == arg0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    private final synchronized void method816(int arg0) {
        ++field2473;
        if (this.field2453 != null) {
            if (arg0 != 0) {
                this.startProduction((ImageConsumer) null);
            }
            this.field2453.setPixels(0, 0, super.field1421, super.field1420, this.field2462, super.field1418, 0, super.field1421);
            this.field2453.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lva;")
    public static final class135 method817(int arg0) {
        ++field2465;
        try {
            int var1 = -58 % ((-25 - arg0) / 40);
            return (class135) Class.forName("oc").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method533(int arg0, int arg1, int arg2, Component arg3) {
        super.field1421 = arg0;
        super.field1418 = new int[arg0 * arg2 + 1];
        super.field1420 = arg2;
        ++field2458;
        this.field2462 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1425 = arg3.createImage(this);
        this.method816(arg1);
        arg3.prepareImage(super.field1425, this);
        this.method816(0);
        arg3.prepareImage(super.field1425, this);
        this.method816(arg1);
        arg3.prepareImage(super.field1425, this);
        this.method528(-1926);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method818(boolean arg0) {
        class49.field1028.field567 = 0;
        class50.field1038 = true;
        ++field2455;
        class60.field1225 = 0L;
        field2456 = 0;
        class92.field2137 = 0;
        class60.field1278 = 0;
        class110.field2545 = 0;
        class143.field3411 = 0;
        class65.field1399 = 0;
        client.field404 = 0;
        client.field402 = 0;
        class102.field2376 = 0;
        class144.field3436 = 0;
        class63.field1348 = 0;
        class110.field2565 = 0;
        class42.field879 = 0;
        class120.field2806 = 0;
        class24.field458 = 0;
        class114.field2684 = 0;
        class89.field1996 = 0;
        class49.field1033 = 0;
        class29.field595 = 0;
        class112.field2605 = 0;
        class92.field2146 = 0;
        class20.field353 = 0;
        class60.field1238 = 0;
        class10.field162 = 0;
        class74.field1692 = 0;
        class31.field644 = 0;
        class72.field1600 = 0;
        class60.field1264 = 0;
        class84.field1871 = 0;
        class61.field1300 = 0;
        class106.field2438 = 0;
        class100.field2270 = 0;
        class79.field1789 = 0;
        class130.field3144 = 0;
        class12.field218 = 0;
        class125.field2970 = 0;
        class32.field646 = 0;
        class62.field1325 = 0;
        class114.field2669 = 0;
        class100.field2304 = 0;
        class16.field329 = 0;
        class140.field3349 = 0;
        class10.field164 = 0;
        class100.field2303 = 0;
        class131.field3162 = 0;
        class114.field2674 = 0;
        class70.field1546 = 0;
        class38.field791 = 0;
        class60.field1256 = 0;
        class39.field807 = 0;
        class124.field2907 = 0;
        class78.field1771 = 0;
        class130.field3151 = 0;
        client.field413 = 0;
        class52.field1108 = 0;
        class126.field3016 = 0;
        class64.field1363 = 0;
        class34.field672 = 0;
        class127.field3043 = 0;
        class39.field808 = 0;
        class58.field1196 = 0;
        class21.field377 = 0;
        class123.field2876 = 0;
        class60.field1228 = 0;
        class26.field535 = 0;
        class21.field388 = 0;
        class63.field1349 = 0;
        class62.field1331 = 0;
        class31.field627 = 0;
        class67.field1438 = 0;
        class117.field2725 = 0;
        class100.field2306 = 0;
        class114.field2643 = 0;
        class22.field445 = 0;
        class89.field1989 = 0;
        class72.field1607 = 0;
        class12.field221 = 0;
        class42.field856 = 0;
        class10.field170 = 0;
        class78.field1781 = 0;
        class72.field1599 = 0;
        class5.field66 = 0;
        class56.field1186 = 0;
        class60.field1220 = 0;
        class25.field506 = 0;
        class60.field1267 = 0;
        class38.field793 = 0;
        class21.field392 = 0;
        class24.field465 = 0;
        class36.field738 = 0;
        class73.field1644 = 0;
        class25.field503 = 0;
        class13.field298 = 0;
        class56.field1190 = 0;
        class90.field2054 = 0;
        class10.field144 = 0;
        class11.field174 = 0;
        field2457 = 0;
        class92.field2138 = 0;
        class90.field2018 = 0;
        class29.field591 = 0;
        class140.field3329 = 0;
        class110.field2535 = 0;
        class60.field1270 = 0;
        class67.field1439 = 0;
        class25.field497 = 0;
        class9.field125 = 0;
        class69.field1486 = 0;
        class10.field160 = 0;
        class117.field2727 = 0;
        class60.field1286 = 0;
        class114.field2650 = 0;
        class79.field1797 = 0;
        class34.field665 = 0;
        class60.field1244 = 0;
        field2473 = 0;
        class84.field1864 = 0;
        class140.field3344 = 0;
        class12.field223 = 0;
        class22.field436 = 0;
        class11.field182 = 0;
        class123.field2887 = 0;
        class121.field2842 = 0;
        field2459 = 0;
        class5.field63 = 0;
        class130.field3146 = 0;
        class12.field240 = 0;
        class126.field2997 = 0;
        class124.field2913 = 0;
        class1.field5 = 0;
        class51.field1060 = 0;
        class60.field1247 = 0;
        class38.field799 = 0;
        class22.field433 = 0;
        class144.field3427 = 0;
        class34.field679 = 0;
        class122.field2853 = 0;
        class144.field3419 = 0;
        class70.field1536 = 0;
        class84.field1866 = 0;
        class73.field1621 = 0;
        class29.field616 = 0;
        class55.field1151 = 0;
        class28.field560 = 0;
        class110.field2557 = 0;
        class109.field2510 = 0;
        class127.field3036 = 0;
        class74.field1690 = 0;
        class131.field3171 = 0;
        class77.field1756 = 0;
        class62.field1314 = 0;
        class52.field1120 = 0;
        class101.field2320 = 0;
        class98.field2226 = 0;
        class96.field2207 = 0;
        class101.field2342 = 0;
        client.field405 = 0;
        class100.field2307 = 0;
        class100.field2256 = 0;
        class50.field1046 = 0;
        class90.field2027 = 0;
        class114.field2658 = 0;
        class110.field2530 = 0;
        class1.field4 = 0;
        class16.field323 = 0;
        class34.field688 = 0;
        class117.field2756 = 0;
        class88.field1962 = 0;
        class123.field2873 = 0;
        class78.field1773 = 0;
        class14.field303 = 0;
        class82.field1838 = 0;
        class117.field2735 = 0;
        class11.field200 = 0;
        class80.field1815 = 0;
        field2455 = 0;
        class61.field1296 = 0;
        class32.field645 = 0;
        class25.field493 = 0;
        class110.field2534 = 0;
        class126.field3012 = 0;
        class126.field2993 = 0;
        class144.field3439 = 0;
        class12.field222 = 0;
        class84.field1875 = 0;
        class142.field3381 = 0;
        class31.field639 = 0;
        class121.field2829 = 0;
        class110.field2560 = 0;
        class100.field2295 = 0;
        class100.field2258 = 0;
        class26.field529 = 0;
        class64.field1361 = 0;
        class48.field998 = 0;
        class24.field482 = 0;
        class92.field2160 = 0;
        class78.field1778 = 0;
        class90.field2109 = 0;
        class65.field1392 = 0;
        class55.field1148 = 0;
        class140.field3330 = 0;
        field2469 = 0;
        class106.field2441 = 0;
        class60.field1257 = 0;
        class73.field1649 = 0;
        class47.field961 = 0;
        class31.field643 = 0;
        class3.field19 = 0;
        class47.field967 = 0;
        class124.field2915 = 0;
        class100.field2279 = 0;
        class100.field2262 = 0;
        client.field418 = 0;
        class82.field1854 = 0;
        class128.field3071 = 0;
        class36.field690 = 0;
        class60.field1288 = 0;
        class73.field1655 = 0;
        class60.field1245 = 0;
        class132.field3184 = 0;
        class106.field2434 = 0;
        class12.field211 = 0;
        class114.field2680 = 0;
        class34.field664 = 0;
        class26.field519 = 0;
        class38.field789 = 0;
        class114.field2633 = 0;
        class60.field1239 = 0;
        class122.field2855 = 0;
        class123.field2888 = 0;
        class106.field2439 = 0;
        class62.field1328 = 0;
        field2465 = 0;
        class52.field1079 = 0;
        class47.field970 = 0;
        class122.field2852 = 0;
        class60.field1222 = 0;
        class96.field2201 = 0;
        class114.field2675 = 0;
        class131.field3176 = 0;
        class10.field165 = 0;
        class48.field995 = 0;
        class145.field3468 = 0;
        class102.field2393 = 0;
        class22.field442 = 0;
        class77.field1750 = 0;
        class101.field2327 = 0;
        class29.field608 = 0;
        class60.field1271 = 0;
        class32.field652 = 0;
        class9.field132 = 0;
        class144.field3430 = 0;
        class29.field612 = 0;
        class60.field1224 = 0;
        class101.field2332 = 0;
        class7.field99 = 0;
        class22.field443 = 0;
        class114.field2677 = 0;
        client.field408 = 0;
        class8.field118 = 0;
        class77.field1753 = 0;
        class60.field1285 = 0;
        class99.field2250 = 0;
        class39.field809 = 0;
        class103.field2403 = 0;
        class78.field1775 = 0;
        class114.field2640 = 0;
        class102.field2365 = 0;
        class114.field2642 = 0;
        class73.field1636 = 0;
        class114.field2665 = 0;
        class143.field3409 = 0;
        class114.field2662 = 0;
        class24.field456 = 0;
        class60.field1246 = 0;
        class114.field2645 = 0;
        class60.field1265 = 0;
        class65.field1389 = 0;
        class12.field231 = 0;
        class86.field1937 = 0;
        class114.field2651 = 0;
        class85.field1887 = 0;
        class60.field1226 = 0;
        client.field416 = 0;
        class110.field2570 = 0;
        class12.field242 = 0;
        class42.field869 = 0;
        class121.field2837 = 0;
        class110.field2571 = 0;
        class73.field1629 = 0;
        class79.field1798 = 0;
        class89.field1992 = 0;
        class18.field337 = 0;
        class135.field3283 = 0;
        class114.field2671 = 0;
        class9.field143 = 0;
        class114.field2649 = 0;
        class110.field2564 = 0;
        class64.field1358 = 0;
        class66.field1431 = 0;
        class8.field107 = 0;
        class60.field1230 = 0;
        class14.field314 = 0;
        class52.field1088 = 0;
        class141.field3352 = 0;
        class49.field1024 = 0;
        class29.field611 = 0;
        class66.field1426 = 0;
        class106.field2437 = 0;
        class22.field428 = 0;
        class48.field988 = 0;
        class42.field875 = 0;
        class137.field3317 = 0;
        class60.field1235 = 0;
        class16.field316 = 0;
        class60.field1262 = 0;
        class114.field2635 = 0;
        class110.field2538 = 0;
        class114.field2670 = 0;
        class66.field1416 = 0;
        class63.field1342 = 0;
        class125.field2977 = 0;
        class24.field486 = 0;
        class145.field3462 = 0;
        class84.field1872 = 0;
        class128.field3055 = 0;
        class123.field2872 = 0;
        client.field414 = 0;
        class74.field1684 = 0;
        class13.field284 = 0;
        class24.field470 = 0;
        class36.field719 = 0;
        class52.field1126 = 0;
        class67.field1445 = 0;
        class24.field472 = 0;
        class122.field2862 = 0;
        class26.field531 = 0;
        class102.field2373 = 0;
        class116.field2709 = 0;
        class24.field453 = 0;
        class114.field2686 = 0;
        class72.field1590 = 0;
        class90.field2069 = 0;
        class42.field851 = 0;
        class31.field640 = 0;
        class118.field2772 = 0;
        class49.field1029 = 0;
        class140.field3343 = 0;
        class118.field2768 = 0;
        class28.field564 = 0;
        class49.field1011 = 0;
        class29.field586 = 0;
        class36.field752 = 0;
        class52.field1083 = 0;
        class60.field1269 = 0;
        class114.field2673 = 0;
        class114.field2683 = 0;
        class1.field3 = 0;
        class12.field208 = 0;
        class70.field1533 = 0;
        class7.field98 = 0;
        class114.field2646 = 0;
        class49.field1020 = 0;
        class104.field2429 = 0;
        client.field403 = 0;
        class90.field2021 = 0;
        class141.field3360 = 0;
        class92.field2147 = 0;
        class114.field2637 = 0;
        class82.field1843 = 0;
        class117.field2740 = 0;
        class28.field559 = 0;
        class84.field1877 = 0;
        class73.field1661 = 0;
        class137.field3306 = 0;
        class101.field2337 = 0;
        class114.field2652 = 0;
        class126.field3007 = 0;
        class75.field1739 = 0;
        class12.field226 = 0;
        class142.field3395 = 0;
        class100.field2287 = 0;
        class42.field878 = 0;
        class61.field1297 = 0;
        class132.field3185 = 0;
        class128.field3065 = 0;
        class122.field2863 = 0;
        class110.field2536 = 0;
        class9.field142 = 0;
        class110.field2547 = 0;
        class60.field1272 = 0;
        class13.field283 = 0;
        class73.field1623 = 0;
        class98.field2224 = 0;
        class101.field2333 = 0;
        class140.field3348 = 0;
        class104.field2426 = 0;
        class55.field1142 = 0;
        class67.field1450 = 0;
        class101.field2313 = 0;
        class63.field1341 = 0;
        field2466 = 0;
        if (arg0) {
            class31.field628 = 0;
            class114.field2657 = 0;
            class78.field1780 = 0;
            class131.field3158 = 0;
            class21.field374 = 0;
            class144.field3421 = 0;
            class60.field1268 = 0;
            class22.field437 = 0;
            class89.field1988 = 0;
            class47.field958 = 0;
            class126.field2986 = 0;
            class73.field1639 = 0;
            class100.field2257 = 0;
            class58.field1200 = 0;
            class62.field1326 = 0;
            class32.field649 = 0;
            class49.field1010 = 0;
            class60.field1254 = 0;
            class29.field601 = 0;
            class46.field942 = 0;
            class22.field441 = 0;
            class100.field2294 = 0;
            class84.field1865 = 0;
            class60.field1266 = 0;
            class114.field2663 = 0;
            class132.field3189 = 0;
            class90.field2076 = 0;
            class114.field2655 = 0;
            class100.field2264 = 0;
            class26.field530 = 0;
            class89.field1974 = 0;
            class22.field440 = 0;
            class12.field245 = 0;
            class109.field2499 = 0;
            class135.field3284 = 0;
            class38.field798 = 0;
            class92.field2139 = 0;
            class141.field3354 = 0;
            class3.field31 = 0;
            class110.field2558 = 0;
            class34.field668 = 0;
            class66.field1419 = 0;
            class127.field3027 = 0;
            class121.field2836 = 0;
            class100.field2292 = 0;
            class126.field3017 = 0;
            class73.field1635 = 0;
            class28.field549 = 0;
            class104.field2420 = 0;
            class51.field1059 = 0;
            class55.field1147 = 0;
            field2468 = 0;
            class52.field1075 = 0;
            class79.field1787 = 0;
            class103.field2404 = 0;
            class84.field1869 = 0;
            class124.field2945 = 0;
            class77.field1763 = 0;
            class47.field977 = 0;
            class114.field2682 = 0;
            class42.field854 = 0;
            class120.field2817 = 0;
            class28.field556 = 0;
            class24.field475 = 0;
            class122.field2856 = 0;
            class89.field1981 = 0;
            class127.field3045 = 0;
            class25.field515 = 0;
            class131.field3178 = 0;
            class90.field2062 = 0;
            class70.field1541 = 0;
            class12.field220 = 0;
            class100.field2268 = 0;
            class141.field3357 = 0;
            class3.field30 = 0;
            class80.field1816 = 0;
            class70.field1530 = 0;
            class110.field2541 = 0;
            class131.field3182 = 0;
            class20.field350 = 0;
            class85.field1891 = 0;
            class114.field2666 = 0;
            class104.field2417 = 0;
            class110.field2552 = 0;
            class60.field1260 = 0;
            class73.field1622 = 0;
            class10.field146 = 0;
            class88.field1956 = 0;
            class18.field335 = 0;
            class90.field2068 = 0;
            class116.field2702 = 0;
            class64.field1366 = 0;
            class144.field3426 = 0;
            class36.field729 = 0;
            class72.field1604 = 0;
            class89.field1985 = 0;
            class142.field3387 = 0;
            class60.field1223 = 0;
            class135.field3288 = 0;
            class82.field1834 = 0;
            field2454 = 0;
            class13.field296 = 0;
            class110.field2542 = 0;
            class78.field1782 = 0;
            class34.field670 = 0;
            class55.field1164 = 0;
            class135.field3285 = 0;
            class89.field2000 = 0;
            class25.field501 = 0;
            class9.field128 = 0;
            class110.field2554 = 0;
            class26.field539 = 0;
            class12.field215 = 0;
            class75.field1734 = 0;
            class11.field191 = 0;
            class50.field1040 = 0;
            class121.field2839 = 0;
            class144.field3441 = 0;
            class90.field2016 = 0;
            class13.field299 = 0;
            class92.field2155 = 0;
            class47.field962 = 0;
            class60.field1279 = 0;
            class78.field1783 = 0;
            class116.field2707 = 0;
            class140.field3331 = 0;
            class56.field1175 = 0;
            class10.field147 = 0;
            class101.field2330 = 0;
            class10.field161 = 0;
            class104.field2418 = 0;
            class117.field2722 = 0;
            class86.field1931 = 0;
            class69.field1510 = 0;
            class42.field847 = 0;
            class29.field579 = 0;
            class26.field540 = 0;
            field2461 = 0;
            class112.field2621 = 0;
            class12.field232 = 0;
            class60.field1273 = 0;
            class18.field334 = 0;
            class24.field484 = 0;
            class122.field2854 = 0;
            class60.field1243 = 0;
            class72.field1602 = 0;
            class92.field2148 = 0;
            class89.field1973 = 0;
            class100.field2276 = 0;
            class42.field871 = 0;
            class90.field2056 = 0;
            class60.field1237 = 0;
            class1.field6 = 0;
            class102.field2386 = 0;
            class106.field2451 = 0;
            class141.field3376 = 0;
            class114.field2681 = 0;
            class36.field723 = 0;
            class122.field2865 = 0;
            class16.field328 = 0;
            class24.field469 = 0;
            class1.field1 = 0;
            class141.field3369 = 0;
            class92.field2156 = 0;
            class82.field1845 = 0;
            class127.field3042 = 0;
            class92.field2152 = 0;
            class92.field2150 = 0;
            class21.field373 = 0;
            class73.field1626 = 0;
            class121.field2823 = 0;
            class79.field1794 = 0;
            class60.field1274 = 0;
            class145.field3454 = 0;
            class131.field3160 = 0;
            class124.field2952 = 0;
            class99.field2254 = 0;
            class92.field2149 = 0;
            class140.field3342 = 0;
            class89.field1979 = 0;
            class110.field2532 = 0;
            class106.field2444 = 0;
            class39.field806 = 0;
            class13.field289 = 0;
            class109.field2503 = 0;
            class140.field3341 = 0;
            class60.field1221 = 0;
            class3.field23 = 0;
            class89.field1972 = 0;
            class21.field384 = 0;
            class131.field3157 = 0;
            class101.field2318 = 0;
            class132.field3187 = 0;
            class112.field2610 = 0;
            class82.field1827 = 0;
            class66.field1432 = 0;
            class89.field1976 = 0;
            class104.field2422 = 0;
            class63.field1345 = 0;
            class103.field2401 = 0;
            class38.field804 = 0;
            class29.field606 = 0;
            class32.field648 = 0;
            class114.field2653 = 0;
            class66.field1430 = 0;
            class122.field2858 = 0;
            class142.field3390 = 0;
            class60.field1255 = 0;
            class86.field1925 = 0;
            class55.field1143 = 0;
            class62.field1319 = 0;
            class7.field101 = 0;
            client.field412 = 0;
            class101.field2340 = 0;
            class60.field1290 = 0;
            class55.field1152 = 0;
            class85.field1905 = 0;
            class128.field3077 = 0;
            class110.field2531 = 0;
            class26.field534 = 0;
            class60.field1229 = 0;
            class88.field1958 = 0;
            class140.field3336 = 0;
            class60.field1234 = 0;
            class144.field3433 = 0;
            class60.field1276 = 0;
            class124.field2951 = 0;
            class84.field1862 = 0;
            class114.field2679 = 0;
            class50.field1037 = 0;
            class60.field1275 = 0;
            class110.field2572 = 0;
            class110.field2551 = 0;
            class11.field186 = 0;
            class100.field2265 = 0;
            class102.field2377 = 0;
            class73.field1657 = 0;
            class25.field508 = 0;
            class124.field2916 = 0;
            class127.field3040 = 0;
            class110.field2546 = 0;
            class140.field3334 = 0;
            class128.field3067 = 0;
            class117.field2746 = 0;
            client.field419 = 0;
            class100.field2284 = 0;
            class141.field3366 = 0;
            class5.field79 = 0;
            class110.field2539 = 0;
            class110.field2537 = 0;
            class14.field301 = 0;
            class100.field2281 = 0;
            class114.field2647 = 0;
            class50.field1043 = 0;
            class60.field1249 = 0;
            class62.field1313 = 0;
            class58.field1204 = 0;
            class24.field476 = 0;
            class92.field2141 = 0;
            class144.field3423 = 0;
            class82.field1852 = 0;
            class141.field3358 = 0;
            class60.field1281 = 0;
            class96.field2204 = 0;
            class124.field2908 = 0;
            class69.field1511 = 0;
            field2458 = 0;
            class12.field246 = 0;
            class62.field1324 = 0;
            class131.field3167 = 0;
            class98.field2223 = 0;
            class124.field2930 = 0;
            class114.field2644 = 0;
            class127.field3039 = 0;
            class60.field1261 = 0;
            class12.field219 = 0;
            class28.field551 = 0;
            class52.field1109 = 0;
            class61.field1294 = 0;
            class84.field1859 = 0;
            class84.field1867 = 0;
            class77.field1768 = 0;
            class85.field1896 = 0;
            class140.field3339 = 0;
            class60.field1258 = 0;
            class39.field816 = 0;
            class145.field3457 = 0;
            class67.field1449 = 0;
            class90.field2041 = 0;
            class124.field2922 = 0;
            class99.field2242 = 0;
            class88.field1954 = 0;
            class49.field1015 = 0;
            class144.field3432 = 0;
            client.field410 = 0;
            class96.field2210 = 0;
            class120.field2800 = 0;
            class28.field554 = 0;
            field2463 = 0;
            class25.field499 = 0;
            class78.field1786 = 0;
            class25.field502 = 0;
            class60.field1284 = 0;
            class111.field2598 = 0;
            class39.field830 = 0;
            class55.field1136 = 0;
            class100.field2275 = 0;
            class32.field647 = 0;
            class28.field566 = 0;
            class21.field390 = 0;
            class109.field2521 = 0;
            class110.field2556 = 0;
            class86.field1935 = 0;
            class7.field91 = 0;
            class89.field1978 = 0;
            class69.field1492 = 0;
            class145.field3469 = 0;
            class89.field1995 = 0;
            class86.field1932 = 0;
            class55.field1144 = 0;
            class24.field479 = 0;
            class3.field20 = 0;
            class116.field2713 = 0;
            class51.field1058 = 0;
            class126.field2994 = 0;
            class110.field2550 = 0;
            class52.field1097 = 0;
            class10.field166 = 0;
            class55.field1156 = 0;
            class112.field2623 = 0;
            class38.field795 = 0;
            class18.field339 = 0;
            class99.field2248 = 0;
            class39.field810 = 0;
            class141.field3361 = 0;
            class47.field971 = 0;
            class29.field610 = 0;
            class75.field1730 = 0;
            field2464 = 0;
            class89.field1990 = 0;
            class111.field2582 = 0;
            class96.field2203 = 0;
            class96.field2213 = 0;
            class100.field2301 = 0;
            class110.field2566 = 0;
            class72.field1591 = 0;
            class12.field225 = 0;
            class26.field523 = 0;
            class102.field2383 = 0;
            class121.field2830 = 0;
            class101.field2311 = 0;
            class60.field1291 = 0;
            class70.field1544 = 0;
            class70.field1545 = 0;
            class130.field3138 = 0;
            class42.field877 = 0;
            class39.field811 = 0;
            class24.field485 = 0;
            class39.field814 = 0;
            class80.field1808 = 0;
            class131.field3163 = 0;
            class144.field3431 = 0;
            class101.field2336 = 0;
            class39.field805 = 0;
            class67.field1437 = 0;
            class28.field558 = 0;
            class100.field2271 = 0;
            class73.field1646 = 0;
            class98.field2218 = 0;
            class48.field996 = 0;
            class70.field1543 = 0;
            class79.field1796 = 0;
            class141.field3363 = 0;
            class24.field457 = 0;
            class141.field3359 = 0;
            class101.field2328 = 0;
            class114.field2641 = 0;
            class24.field450 = 0;
            class118.field2759 = 0;
            class110.field2559 = 0;
            class100.field2266 = 0;
            class66.field1422 = 0;
            class110.field2544 = 0;
            class5.field76 = 0;
            class69.field1526 = 0;
            class62.field1338 = 0;
            class12.field265 = 0;
            class62.field1321 = 0;
            class36.field693 = 0;
            class5.field74 = 0;
            class60.field1242 = 0;
            class90.field2078 = 0;
            class46.field950 = 0;
            class84.field1868 = 0;
            class62.field1330 = 0;
            class16.field332 = 0;
            class100.field2277 = 0;
            class32.field650 = 0;
            class70.field1542 = 0;
            class110.field2562 = 0;
            class84.field1870 = 0;
            class109.field2496 = 0;
            class11.field194 = 0;
            class69.field1522 = 0;
            client.field407 = 0;
            class101.field2321 = 0;
            class99.field2249 = 0;
            class39.field813 = 0;
            class12.field260 = 0;
            class140.field3338 = 0;
            class61.field1299 = 0;
            class110.field2567 = 0;
            class118.field2766 = 0;
            class123.field2890 = 0;
            class120.field2794 = 0;
            class106.field2436 = 0;
            class142.field3384 = 0;
            class144.field3417 = 0;
            class110.field2548 = 0;
            class145.field3467 = 0;
            class11.field196 = 0;
            class49.field1017 = 0;
            class28.field568 = 0;
            class106.field2448 = 0;
            class5.field71 = 0;
            class114.field2659 = 0;
            class100.field2308 = 0;
            class92.field2158 = 0;
            class110.field2553 = 0;
            class66.field1429 = 0;
            class126.field3000 = 0;
            class74.field1680 = 0;
            class114.field2656 = 0;
            class29.field596 = 0;
            class124.field2950 = 0;
            class46.field952 = 0;
            class22.field429 = 0;
            class60.field1231 = 0;
            class3.field33 = 0;
            class86.field1927 = 0;
            class89.field1998 = 0;
            class42.field859 = 0;
            class47.field972 = 0;
            class92.field2140 = 0;
            class103.field2414 = 0;
            class5.field55 = 0;
            class114.field2654 = 0;
            class24.field451 = 0;
            class8.field108 = 0;
            class116.field2712 = 0;
            class116.field2701 = 0;
            class117.field2755 = 0;
            class25.field492 = 0;
            class110.field2549 = 0;
            class117.field2737 = 0;
            class110.field2563 = 0;
            class96.field2212 = 0;
            class21.field381 = 0;
            class26.field520 = 0;
            class114.field2685 = 0;
            class121.field2821 = 0;
            class47.field964 = 0;
            class74.field1671 = 0;
            class64.field1365 = 0;
            class60.field1259 = 0;
            class132.field3192 = 0;
            class69.field1493 = 0;
            class92.field2164 = 0;
            class21.field391 = 0;
            class16.field324 = 0;
            class52.field1104 = 0;
            class90.field2026 = 0;
            class67.field1447 = 0;
            class90.field2036 = 0;
            class38.field792 = 0;
            class114.field2639 = 0;
            class96.field2202 = 0;
            class50.field1036 = 0;
            class34.field667 = 0;
            class104.field2424 = 0;
            class26.field525 = 0;
            class101.field2329 = 0;
            class99.field2241 = 0;
            class34.field682 = 0;
            class78.field1774 = 0;
            class60.field1287 = 0;
            class52.field1093 = 0;
            class98.field2221 = 0;
            class145.field3461 = 0;
            class36.field749 = 0;
            class141.field3355 = 0;
            class67.field1442 = 0;
            class124.field2919 = 0;
            class117.field2750 = 0;
            class60.field1277 = 0;
            class117.field2745 = 0;
            class11.field193 = 0;
            class13.field300 = 0;
            class121.field2835 = true;
            class38.method273(20);
            class29.field587 = 0;
            class88.field1964 = 0;
            class61.field1303.field1227 = 0;
            class60.field1263 = 0;
            class77.field1752.field1227 = 0;
            class123.field2882 = -1;
            class79.field1805 = 0;
            class116.field2714 = false;
            class118.field2757 = 0;
            class24.field462 = -1;
            class66.field1423 = -1;
            class137.field3311 = -1;
            class98.method739(-108, 0);
            for (int var1 = 0; var1 < 100; ++var1) {
                class144.field3425[var1] = null;
            }
            class125.field2975 = false;
            class69.field1505 = -60 + (int) (120.0D * Math.random());
            class85.field1897 = 0;
            class8.field116 = 0;
            class3.field21 = -1;
            class46.field946 = -55 + (int) (Math.random() * 110.0D);
            class100.field2259 = 0;
            class92.field2159 = 2047 & -10 + (int) (20.0D * Math.random());
            class64.field1371 = 0;
            class77.field1765 = 0;
            class90.field2125 = -40 + (int) (Math.random() * 80.0D);
            class145.field3452 = 0;
            class130.field3150 = (int) (Math.random() * 100.0D) + -50;
            class85.field1923 = 0;
            class48.field997 = (int) (30.0D * Math.random()) + -20;
            for (int var2 = 0; ~var2 > -2049; ++var2) {
                class36.field762[var2] = null;
                class120.field2810[var2] = null;
            }
            for (int var3 = 0; var3 < 32768; ++var3) {
                class123.field2894[var3] = null;
            }
            class7.field103 = class36.field762[2047] = new class126();
            class65.field1394.method648(74);
            class58.field1194.method648(77);
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var11 = 0; var11 < 104; ++var11) {
                        class77.field1767[var4][var10][var11] = null;
                    }
                }
            }
            class72.field1598 = new class84();
            class73.field1630 = 0;
            class128.field3058 = 0;
            for (int var5 = 0; class122.field2860 > var5; ++var5) {
                class86 var9 = class141.method1127(var5, -1);
                if (var9 != null && ~var9.field1936 == -1) {
                    class125.field2971[var5] = 0;
                    class123.field2896[var5] = 0;
                }
            }
            for (int var6 = 0; ~class79.field1799.length < ~var6; ++var6) {
                class79.field1799[var6] = -1;
            }
            for (int var7 = 0; var7 < class123.field2906.length; ++var7) {
                if (class123.field2906[var7] != -1) {
                    class104.method800(class123.field2906[var7], (byte) -90);
                    class123.field2906[var7] = -1;
                }
            }
            class104.method800(class8.field120, (byte) -90);
            class8.field120 = -1;
            class104.method800(class123.field2899, (byte) -90);
            class123.field2899 = -1;
            class104.method800(class117.field2747, (byte) -90);
            class117.field2747 = -1;
            class104.method800(class34.field671, (byte) -90);
            class34.field671 = -1;
            class104.method800(class56.field1188, (byte) -90);
            class56.field1188 = -1;
            class104.method800(class123.field2905, (byte) -90);
            class123.field2905 = -1;
            class104.method800(class72.field1608, (byte) -90);
            class39.field822 = -1;
            class116.field2714 = false;
            class102.field2351 = 3;
            class131.field3154 = 0;
            class72.field1608 = -1;
            class20.field357 = -1;
            class5.field75 = false;
            class60.field1250 = null;
            class142.field3382 = 0;
            class116.field2708.method710(false, -1, (byte) -34, new int[5], (int[]) null);
            for (int var8 = 0; ~var8 > -6; ++var8) {
                class116.field2716[var8] = null;
                class124.field2949[var8] = false;
            }
            class118.method915(-1);
            class56.field1170 = true;
        }
    }

    @OriginalMember(owner = "client!qc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2453 == arg0) {
            this.field2453 = null;
        }
        ++field2461;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZI)Lrd;")
    public static final class114 method819(int arg0, boolean arg1, int arg2) {
        if (arg2 != -1) {
            return null;
        } else {
            ++field2469;
            return class130.method1046(arg1, arg0, 10, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lg;ZZ)Z")
    public static final boolean method820(class43 arg0, boolean arg1, boolean arg2) {
        class110.field2575 = 20;
        ++field2456;
        try {
            class98.field2216 = (class118) Class.forName("vd").newInstance();
            return arg1;
        } catch (Throwable var4) {
            class53 var3 = arg0.method303(-71);
            if (var3 != null) {
                class98.field2216 = new class30(arg0, var3);
                return true;
            } else if (arg2) {
                class98.field2216 = new class24(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2463;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method526(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field2454;
        this.method816(arg0);
        arg3.drawImage(super.field1425, arg1, arg2, this);
    }
}
