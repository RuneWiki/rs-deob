import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class113 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[F")
    public static float[] field1726 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lnk;")
    public static class2 field1731 = new class2();

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 10)
    public static final void method756(String arg0, byte arg1) {
        field1727++;
        if (class215.field3399 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class288.method1878(true);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class343.method2390("mem=" + var4 + "k", 0, false, (String) null);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class288.method1878(true);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class343.method2390("Memory before cleanup=" + var7 + "k", 0, false, (String) null);
                class294.method1928(30392);
                class288.method1878(true);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class343.method2390("Memory after cleanup=" + var9 + "k", 0, false, (String) null);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class343.method2390("Number of player models in cache:" + class29.method224(-102), 0, false, (String) null);
            }
            if (class333.field5166 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class301.field4650);
                System.out.println("oncard_2d:" + class301.field4647);
                System.out.println("oncard_texture:" + class301.field4648);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class330.method2232(107);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class124.field1938.method1679((byte) 84);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class124.field1938.method1675(-2);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class89.field1359.method1527((byte) 110);
                class308.field4851.method597((byte) 111);
                class124.field1938.method1676(false);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class280.field4325 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class231.method1583(25, (byte) -37);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class315.field4964 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class315.field4964 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class120.method818(2, 0, false, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class120.method818(2, 1, false, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class120.method818(2, 2, false, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class120.method818(2, 3, false, 768, 1024);
            }
            if (arg0.startsWith("::setba")) {
                class338.field5235 = class154.method1073(101, arg0.substring(8));
                class268.method1777(-27637, class89.field1359);
                class342.field5335 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class243.method1652(class154.method1073(65, arg0.substring(15)));
                class268.method1777(-27637, class89.field1359);
                class342.field5335 = false;
            }
            if (arg0.startsWith("::fps ") && class208.field3307 != 0) {
                class184.method1268((byte) 125, class154.method1073(109, arg0.substring(6)));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class288.field4416 = class154.method1073(-126, arg0.substring(12).trim());
                class343.method2390("rect_debug=" + class288.field4416, 0, false, (String) null);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class269.field4149 = true;
            }
            if (arg0.startsWith("::hdr") && class333.field5166 && !class128.method870(0, !class279.method1836())) {
                class343.method2390("Failed to enable hdr", 0, false, (String) null);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class129.field2024) {
                    class129.field2024 = false;
                    class343.method2390("Forced tweening disabled.", 0, false, (String) null);
                } else {
                    class129.field2024 = true;
                    class343.method2390("Forced tweening ENABLED!", 0, false, (String) null);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class86.field1301) {
                    System.out.println("Shift-click disabled.");
                    class86.field1301 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class86.field1301 = true;
                }
            }
        }
        class265.field4095.method2064(255, 236);
        class3.field35++;
        class265.field4095.method2034(-89, arg0.length() - 1);
        if (arg1 >= 124) {
            class265.field4095.method2057(23, arg0.substring(2));
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 220)
    public static void method757(int arg0) {
        if (arg0 != 2) {
            field1731 = (class2) null;
        }
        field1731 = null;
        field1726 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZZ)V", line = 236)
    public static final void method758(boolean arg0, boolean arg1) {
        field1728++;
        for (class229 var2 = (class229) class240.field3812.method10((byte) 74); var2 != null; var2 = (class229) class240.field3812.method13((byte) -32)) {
            if (var2.field3690 != null) {
                class74.field1102.method221(var2.field3690);
                var2.field3690 = null;
            }
            if (var2.field3694 != null) {
                class74.field1102.method221(var2.field3694);
                var2.field3694 = null;
            }
            var2.method1284(0);
        }
        if (arg0) {
            for (class229 var3 = (class229) class203.field3066.method10((byte) 118); var3 != null; var3 = (class229) class203.field3066.method13((byte) -32)) {
                if (var3.field3690 != null) {
                    class74.field1102.method221(var3.field3690);
                    var3.field3690 = null;
                }
                var3.method1284(0);
            }
            for (class229 var4 = (class229) class175.field2681.method1549((byte) 112); var4 != null; var4 = (class229) class175.field2681.method1546(-1)) {
                if (var4.field3690 != null) {
                    class74.field1102.method221(var4.field3690);
                    var4.field3690 = null;
                }
                var4.method1284(0);
            }
        }
        if (!arg1) {
            method760((String) null, -14);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)V", line = 305)
    public static final void method759(boolean arg0, int arg1) {
        if (arg0) {
            field1731 = (class2) null;
        }
        class75 var2 = class204.method1371(1, 7, arg1);
        field1730++;
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 319)
    public static final void method760(String arg0, int arg1) {
        System.out.println("Error: " + class338.method2338(arg0, "%0a", "\n", (byte) -22));
        field1725++;
        if (arg1 != -1) {
            field1726 = (float[]) null;
        }
    }
}
