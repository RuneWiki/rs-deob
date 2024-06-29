import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class349 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "F")
    public static float field5549 = 0.0F;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lnb;")
    public static class341 field5546 = new class341(64);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
    public static int[] field5547;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 10)
    public static void method2438(int arg0) {
        field5546 = null;
        if (arg0 != 8) {
            field5546 = (class341) null;
        }
        field5547 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 22)
    public static final void method2439(String arg0, int arg1) {
        field5548++;
        if (class158.field2787 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class313.method2158(2254);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class170.method1339(0, "mem=" + var4 + "k", (String) null, (byte) -98);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class313.method2158(2254);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class170.method1339(0, "Memory before cleanup=" + var7 + "k", (String) null, (byte) -98);
                class170.method1340(-113);
                class313.method2158(2254);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class170.method1339(0, "Memory after cleanup=" + var9 + "k", (String) null, (byte) -98);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class170.method1339(0, "Number of player models in cache:" + class135.method1112(4314), (String) null, (byte) -98);
            }
            if (class43.field680 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class151.field2670);
                System.out.println("oncard_2d:" + class151.field2667);
                System.out.println("oncard_texture:" + class151.field2671);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class327.method2272(-97);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class247.field4009.method1974(2083285280);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class247.field4009.method1984(-111);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class85.field1369.method542(false);
                class279.field4426.method176((byte) 95);
                class247.field4009.method1987((byte) 77);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class175.field2985 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class33.method302((byte) -37, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class339.field5419 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class339.field5419 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class282.method1923(false, arg1 ^ 0xFFFFFCD2, 0, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class282.method1923(false, -121, 1, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class282.method1923(false, -84, 2, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class282.method1923(false, -89, 3, 1024, 768);
            }
            if (arg0.startsWith("::setba")) {
                class255.field4104 = class97.method841(arg0.substring(8), (byte) -20);
                class88.method774(true, class85.field1369);
                class257.field4149 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class65.method617(class97.method841(arg0.substring(15), (byte) -20));
                class88.method774(true, class85.field1369);
                class257.field4149 = false;
            }
            if (arg0.startsWith("::fps ") && class246.field3988 != 0) {
                class261.method1804(class97.method841(arg0.substring(6), (byte) -20), arg1 ^ 0xE8);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class324.field5157 = class97.method841(arg0.substring(12).trim(), (byte) -20);
                class170.method1339(0, "rect_debug=" + class324.field5157, (String) null, (byte) -98);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class348.field5537 = true;
            }
            if (arg0.startsWith("::hdr") && class43.field680 && !class212.method1570(!class16.method164(), false)) {
                class170.method1339(0, "Failed to enable hdr", (String) null, (byte) -98);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class255.field4105) {
                    class255.field4105 = false;
                    class170.method1339(0, "Forced tweening disabled.", (String) null, (byte) -98);
                } else {
                    class255.field4105 = true;
                    class170.method1339(0, "Forced tweening ENABLED!", (String) null, (byte) -98);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class295.field4715) {
                    System.out.println("Shift-click disabled.");
                    class295.field4715 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class295.field4715 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class170.method1339(0, "x:" + (class218.field3632.field2036 >> 7) + " z:" + (class218.field3632.field1985 >> 7) + " groundh:" + class137.field2487[class205.field3497][class218.field3632.field2036 >> 7][class218.field3632.field1985 >> 7], (String) null, (byte) -98);
            }
        }
        class341.field5443.method26(242, 7);
        if (arg1 != 768) {
            method2441((class49) null, 118, false, -87);
        }
        class341.field5443.method2370(arg0.length() - 1, (byte) -20);
        class148.field2652++;
        class341.field5443.method2349(true, arg0.substring(2));
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Lti;", line = 243)
    public static final class244 method2440(int arg0, byte arg1) {
        field5543++;
        class244 var2 = (class244) class123.field2133.method467(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class188.field3149.method441(false, arg0, 0);
        class244 var4 = new class244(var3);
        if (arg1 != -119) {
            field5547 = (int[]) null;
        }
        var4.method2242(class12.field187, (int[]) null);
        class123.field2133.method465(var4, (long) arg0, (byte) 116);
        return var4;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lcg;IZI)Ln;", line = 264)
    public static final class309 method2441(class49 arg0, int arg1, boolean arg2, int arg3) {
        field5545++;
        if (class325.method2262(arg3, (byte) 123, arg0, arg1)) {
            return arg2 ? (class309) null : class325.method2259((byte) 105);
        } else {
            return null;
        }
    }
}
