import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class108 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
    public static boolean field1681 = false;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1679 = "Ok";

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "J")
    public long field1687;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lsk;")
    public class114 field1684;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method678(int arg0) {
        field1680++;
        class282.field4212.method500(-95);
        for (int var1 = 0; var1 < 32; var1++) {
            class297.field4697[var1] = 0L;
        }
        if (arg0 != 1556908007) {
            field1679 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class22.field268[var2] = 0L;
        }
        class235.field3547 = 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpf;B)V")
    public static final void method679(class294 arg0, byte arg1) {
        class227.field3405 = arg0;
        field1689++;
        if (arg1 != -22) {
            field1690 = -14;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method680(boolean arg0, String arg1) {
        field1683++;
        if (class256.field3893 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class70.method464(!arg0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class48.method321(0, (String) null, "mem=" + var4 + "k", 97);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class70.method464(!arg0);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class48.method321(0, (String) null, "Memory before cleanup=" + var7 + "k", 80);
                class264.method1760((byte) -113);
                class70.method464(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class48.method321(0, (String) null, "Memory after cleanup=" + var9 + "k", -127);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class48.method321(0, (String) null, "Number of player models in cache:" + class133.method819((byte) 105), -104);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class130.method811(125);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class265.field3995.method352((byte) 75);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class265.field3995.method348(false);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class209.field3147.method61((byte) 113);
                class44.field706.method952((byte) -112);
                class265.field3995.method354((byte) 123);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class287.field4302 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class203.method1292(25, false);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class177.field2703 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class177.field2703 = false;
            }
            if (arg1.startsWith("::setba")) {
                class127.field1911 = class267.method1785((byte) 35, arg1.substring(8));
                class147.method894(class209.field3147, true);
                class147.field2139 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class245.method1541(class267.method1785((byte) 35, arg1.substring(15)));
                class147.method894(class209.field3147, true);
                class147.field2139 = false;
            }
            if (arg1.startsWith("::fps ") && class112.field1726 != 0) {
                class251.method1647(class267.method1785((byte) 35, arg1.substring(6)), 10);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class56.field898 = class267.method1785((byte) 35, arg1.substring(12).trim());
                class48.method321(0, (String) null, "rect_debug=" + class56.field898, 103);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class64.field1009 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class258.field3932) {
                    class258.field3932 = false;
                    class48.method321(0, (String) null, "Forced tweening disabled.", -106);
                } else {
                    class258.field3932 = true;
                    class48.method321(0, (String) null, "Forced tweening ENABLED!", -103);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class99.field1563) {
                    System.out.println("Shift-click disabled.");
                    class99.field1563 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class99.field1563 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class48.method321(0, (String) null, "x:" + (class165.field2537.field2251 >> 7) + " z:" + (class165.field2537.field2234 >> 7) + " groundh:" + class67.field1072[class99.field1557][class165.field2537.field2251 >> 7][class165.field2537.field2234 >> 7], -105);
            }
        }
        class123.field1870++;
        if (arg0) {
            class196.field2979.method1106(206, false);
            class196.field2979.method1568(arg1.length() - 1, (byte) 49);
            class196.field2979.method1589((byte) 90, arg1.substring(2));
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILpf;)V")
    public static final void method681(int arg0, class294 arg1) {
        class171.field2596 = class50.method332(12288, class139.field2038, 0, arg1);
        class98.field1553 = class25.method156(class183.field2762, 0, arg1, (byte) -112);
        class82.field1316 = class25.method156(class203.field3062, 0, arg1, (byte) -82);
        class91.field1439 = class25.method156(class59.field948, 0, arg1, (byte) -97);
        field1688++;
        class42.field616 = class25.method156(class63.field986, 0, arg1, (byte) -83);
        class112.field1723 = class25.method156(class92.field1458, 0, arg1, (byte) -124);
        class18.field223 = class25.method156(class11.field144, 0, arg1, (byte) -96);
        class178.field2729 = class296.method1985(class43.field696, 0, arg1, -3);
        class159.field2447 = class237.method1502(class72.field1158, arg1, 0, false);
        class255.field3889 = class237.method1502(class173.field2625, arg1, 0, false);
        class274.field4115 = class163.method1007(class200.field3042, 0, arg1, (byte) 114);
        class143.field2101 = class163.method1007(class106.field1624, 0, arg1, (byte) 125);
        class91.field1435.method1014(class143.field2101, (int[]) null);
        class268.field4036.method1014(class143.field2101, (int[]) null);
        class192.field2953.method1014(class143.field2101, (int[]) null);
        class201 var2 = class273.method1808(class145.field2121, 0, arg1, true);
        var2.method1276();
        class79.field1270 = var2;
        class201[] var3 = class50.method332(12288, class102.field1607, 0, arg1);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1276();
        }
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        if (arg0 < 77) {
            method679((class294) null, (byte) -83);
        }
        class162.field2486 = var3;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class171.field2596.length; var9++) {
            class171.field2596[var9].method1271(var5 + var8, var6 + var8, var7 + var8);
        }
        class65.field1024 = class171.field2596;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method682(boolean arg0) {
        field1679 = null;
        if (!arg0) {
            field1681 = true;
        }
    }
}
