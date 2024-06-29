import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class140 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
    public static volatile boolean field1919 = true;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lqc;")
    public static class99 field1918 = new class99(4);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 249)
    public class140() {
        new class164();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 23)
    public static void method1013(int arg0) {
        field1918 = null;
        if (arg0 != 4336) {
            field1918 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 36)
    public static final void method1014(String arg0, int arg1) {
        field1917++;
        if (class323.field4898 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class122.method881(512);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class93.method695((byte) 106, 0, "mem=" + var4 + "k", (String) null);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class122.method881(512);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class93.method695((byte) -71, 0, "Memory before cleanup=" + var7 + "k", (String) null);
                class196.method1389(38);
                class122.method881(512);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class93.method695((byte) -126, 0, "Memory after cleanup=" + var9 + "k", (String) null);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class93.method695((byte) 125, 0, "Number of player models in cache:" + class99.method718(-44), (String) null);
            }
            if (class67.field908 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class180.field2409);
                System.out.println("oncard_2d:" + class180.field2414);
                System.out.println("oncard_texture:" + class180.field2412);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class11.method65((byte) -21);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class78.field1133.method83((byte) -5);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class78.field1133.method72((byte) 63);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class165.field2258.method613(102);
                class39.field442.method1578((byte) -75);
                class78.field1133.method81(-1);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class340.field5112 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class189.method1325(1, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class221.field3165 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class221.field3165 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class85.method663(0, -1, false, (byte) 44, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class85.method663(1, -1, false, (byte) 44, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class85.method663(2, -1, false, (byte) 44, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class85.method663(3, 1024, false, (byte) 44, 768);
            }
            if (arg0.startsWith("::setba")) {
                class96.field1297 = class190.method1332(arg0.substring(8), (byte) 121);
                class275.method1894((byte) -91, class165.field2258);
                class301.field4464 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class265.method1802(class190.method1332(arg0.substring(15), (byte) -108));
                class275.method1894((byte) -19, class165.field2258);
                class301.field4464 = false;
            }
            if (arg0.startsWith("::fps ") && class6.field46 != 0) {
                class125.method906(true, class190.method1332(arg0.substring(6), (byte) 109));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class194.field2677 = class190.method1332(arg0.substring(12).trim(), (byte) -122);
                class93.method695((byte) -3, 0, "rect_debug=" + class194.field2677, (String) null);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class63.field823 = true;
            }
            if (arg0.startsWith("::hdr") && class67.field908 && !class247.method1694(-123, !class40.method240())) {
                class93.method695((byte) -40, 0, "Failed to enable hdr", (String) null);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class101.field1396) {
                    class101.field1396 = false;
                    class93.method695((byte) 114, 0, "Forced tweening disabled.", (String) null);
                } else {
                    class101.field1396 = true;
                    class93.method695((byte) 108, 0, "Forced tweening ENABLED!", (String) null);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class167.field2276) {
                    System.out.println("Shift-click disabled.");
                    class167.field2276 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class167.field2276 = true;
                }
            }
        }
        class90.field1264.method2238(99, (byte) -128);
        int var10 = -51 / ((arg1 - 39) / 44);
        class90.field1264.method2184((byte) 89, arg0.length() - 1);
        class90.field1264.method2157((byte) -60, arg0.substring(2));
        class310.field4680++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 266)
    public static final void method1015(int arg0, int arg1) {
        field1916++;
        int var2 = 14 / ((-arg0 - 32) / 57);
        class143 var3 = class163.method1176((byte) 92, arg1, 5);
        var3.method1038(0);
    }
}
