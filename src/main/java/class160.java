import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class160 extends class196 {

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Loe;")
    public class79 field2394;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[C")
    public static char[] field2391 = new char[128];

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lhb;")
    public static class318 field2397 = new class318(50);

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field2398 = -1;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2399 = "yellow:";

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field2404 = -1;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "[I")
    public static int[] field2403;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1130(boolean arg0) {
        field2399 = null;
        if (!arg0) {
            field2403 = null;
            field2397 = null;
            field2391 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lch;ILch;)V", line = 35)
    public static final void method1131(class196 arg0, int arg1, class196 arg2) {
        if (arg1 != -179) {
            return;
        }
        if (arg2.field2956 != null) {
            arg2.method1353(29792);
        }
        field2395++;
        arg2.field2956 = arg0;
        arg2.field2948 = arg0.field2948;
        arg2.field2956.field2948 = arg2;
        arg2.field2948.field2956 = arg2;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V", line = 52)
    public static final void method1132(boolean arg0) {
        class171.field2573++;
        class234.field3507.method28(104, arg0);
        field2396++;
        class234.field3507.method1816(0L, 21054);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLjava/lang/String;)V", line = 67)
    public static final void method1133(byte arg0, String arg1) {
        field2393++;
        if (class192.field2863 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class9.method41(true);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class92.method656(0, "mem=" + var4 + "k", (String) null, arg0 + 81);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class9.method41(true);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class92.method656(0, "Memory before cleanup=" + var7 + "k", (String) null, -1);
                class265.method1861(127);
                class9.method41(true);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class92.method656(0, "Memory after cleanup=" + var9 + "k", (String) null, -1);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class92.method656(0, "Number of player models in cache:" + class113.method779(4096), (String) null, -1);
            }
            if (class117.field1817 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class174.field2590);
                System.out.println("oncard_2d:" + class174.field2593);
                System.out.println("oncard_texture:" + class174.field2592);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class154.method1101(0);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class274.field4208.method650((byte) 35);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class274.field4208.method654((byte) -83);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class274.field4200.method1784(arg0 + 10082);
                class168.field2517.method1139((byte) 109);
                class274.field4208.method655(arg0 + 29978);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class149.field2248 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class163.method1155(25, 10);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class203.field3050 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class203.field3050 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class307.method2119(-1, false, -1, false, 0);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class307.method2119(-1, false, -1, false, 1);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class307.method2119(-1, false, -1, false, 2);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class307.method2119(1024, false, 768, false, 3);
            }
            if (arg1.equalsIgnoreCase("::noclip")) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class325.field4896[var10].field2857[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.startsWith("::setparticles")) {
                class18.method118(class286.method1991(arg0 - 5, arg1.substring(15)));
                class6.method17(class274.field4200, (byte) -110);
                class250.field3726 = false;
            }
            if (arg1.startsWith("::fps ") && class252.field3769 != 0) {
                class30.method190(class286.method1991(-109, arg1.substring(6)), 0);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class125.field1965 = class286.method1991(arg0 + 2, arg1.substring(12).trim());
                class92.method656(0, "rect_debug=" + class125.field1965, (String) null, -1);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class250.field3733 = true;
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class145.field2191) {
                    class145.field2191 = false;
                    class92.method656(0, "Forced tweening disabled.", (String) null, arg0 + 81);
                } else {
                    class145.field2191 = true;
                    class92.method656(0, "Forced tweening ENABLED!", (String) null, arg0 ^ 0x51);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class96.field1446) {
                    System.out.println("Shift-click disabled.");
                    class96.field1446 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class96.field1446 = true;
                }
            }
        }
        class17.field206++;
        if (arg0 != -82) {
            field2398 = -57;
        }
        class234.field3507.method28(57, false);
        class234.field3507.method1813(arg0 ^ 0x25, arg1.length() - 1);
        class234.field3507.method1825(arg1.substring(2), (byte) 63);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Loe;)V", line = 293)
    public class160(class79 arg0) {
        this.field2394 = arg0;
    }
}
