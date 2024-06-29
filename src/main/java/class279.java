import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class279 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public int field4582 = -1;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    private int field4589 = 0;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Z")
    public boolean field4594 = true;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public int field4591 = 128;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
    public static int[] field4584 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field4595 = -1;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lvl;")
    public static class164 field4583 = new class164(16);

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "Lth;")
    public static class57 field4598;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILqm;I)V", line = 6)
    public final void method2062(int arg0, class227 arg1, int arg2) {
        field4596++;
        while (true) {
            int var4 = arg1.method1720((byte) -31);
            if (var4 == 0) {
                if (arg2 < 62) {
                    field4583 = (class164) null;
                }
                return;
            }
            this.method2066((byte) 61, arg0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 27)
    public static void method2063(int arg0) {
        field4583 = null;
        if (arg0 <= -80) {
            field4598 = null;
            field4584 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 42)
    private final void method2064(int arg0, int arg1) {
        field4585++;
        double var3 = (double) ((arg1 & 0xFF17D0) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 != -1811385168) {
            this.method2066((byte) 93, -35, (class227) null, 91);
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        double var13 = var3;
        double var15 = 0.0D;
        if (var3 < var5) {
            var9 = var5;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        if (var5 < var3) {
            var13 = var5;
        }
        if (var7 < var13) {
            var13 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var17 < 0.5D) {
                var11 = (var9 - var13) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var11 = (var9 - var13) / (2.0D - var9 - var13);
            }
            if (var3 == var9) {
                var15 = (var5 - var7) / (var9 - var13);
            } else if (var5 == var9) {
                var15 = (var7 - var3) / (var9 - var13) + 2.0D;
            } else if (var7 == var9) {
                var15 = (var3 - var5) / (var9 - var13) + 4.0D;
            }
        }
        this.field4590 = (int) (var17 * 256.0D);
        double var19 = var15 / 6.0D;
        this.field4593 = (int) (var11 * 256.0D);
        if (var17 > 0.5D) {
            this.field4586 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field4586 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field4593 < 0) {
            this.field4593 = 0;
        } else if (this.field4593 > 255) {
            this.field4593 = 255;
        }
        if (this.field4590 < 0) {
            this.field4590 = 0;
        } else if (this.field4590 > 255) {
            this.field4590 = 255;
        }
        if (this.field4586 < 1) {
            this.field4586 = 1;
        }
        this.field4592 = (int) ((double) this.field4586 * var19);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 136)
    public static final void method2065(int arg0, String arg1) {
        field4587++;
        if (class162.field2572 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class138.method1039(-2);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class182.method1431("mem=" + var4 + "k", (byte) -11);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class138.method1039(-2);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class182.method1431("Memory before cleanup=" + var7 + "k", (byte) -11);
                class216.method1629(arg0 - 1682);
                class138.method1039(arg0 ^ 0xFFFFF92C);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class182.method1431("Memory after cleanup=" + var9 + "k", (byte) -11);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class182.method1431("Number of player models in cache:" + class297.method2129(true), (byte) -11);
            }
            if (class42.field607 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class199.field3169);
                System.out.println("oncard_2d:" + class199.field3174);
                System.out.println("oncard_texture:" + class199.field3173);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class152.method1172(arg0 - 1746);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class241.field3991.method68((byte) 82);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class241.field3991.method62(8086);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class128.field2163.method1116((byte) -121);
                class342.field5449.method920((byte) 55);
                class241.field3991.method54(0);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class64.field1135 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class22.method143(arg0 - 1775, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class16.field185 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class16.field185 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class272.method2043(0, -1, -1, false, arg0 ^ 0xFFFFF92D);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class272.method2043(1, -1, -1, false, -1);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class272.method2043(2, -1, -1, false, -1);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class272.method2043(3, 768, 1024, false, -1);
            }
            if (arg1.startsWith("::setba")) {
                class127.field2147 = class130.method996(arg1.substring(8), 30958);
                class16.method87(class128.field2163, (byte) -64);
                class302.field4861 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class158.method1224(class130.method996(arg1.substring(15), 30958));
                class16.method87(class128.field2163, (byte) -64);
                class302.field4861 = false;
            }
            if (arg1.startsWith("::fps ") && class237.field3922 != 0) {
                class98.method755((byte) 119, class130.method996(arg1.substring(6), arg0 + 29212));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class296.field4764 = class130.method996(arg1.substring(12).trim(), arg0 ^ 0x7E3C);
                class182.method1431("rect_debug=" + class296.field4764, (byte) -11);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class178.field2857 = true;
            }
            if (arg1.startsWith("::hdr") && class42.field607 && !class44.method326((byte) -32, !class68.method578())) {
                class182.method1431("Failed to enable hdr", (byte) -11);
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class94.field1575) {
                    class94.field1575 = false;
                    class182.method1431("Forced tweening disabled.", (byte) -11);
                } else {
                    class94.field1575 = true;
                    class182.method1431("Forced tweening ENABLED!", (byte) -11);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class162.field2569) {
                    System.out.println("Shift-click disabled.");
                    class162.field2569 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class162.field2569 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class182.method1431("x:" + (class6.field55.field3577 >> 7) + " z:" + (class6.field55.field3511 >> 7) + " groundh:" + class101.field1656[class186.field2991][class6.field55.field3577 >> 7][class6.field55.field3511 >> 7], (byte) -11);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class182.method1431("Height: " + class101.field1656[class186.field2991][class6.field55.field3577 >> 7][class6.field55.field3511 >> 7], (byte) -11);
            }
        }
        class36.field520.method2228(88, 16547);
        class36.field520.method1712(arg1.length() - 1, -68);
        class36.field520.method1709(arg1.substring(2), (byte) 120);
        class93.field1563++;
        if (arg0 != 1746) {
            field4598 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BILqm;I)V", line = 375)
    private final void method2066(byte arg0, int arg1, class227 arg2, int arg3) {
        int var5 = -5 / ((-arg0 - 35) / 62);
        field4588++;
        if (arg3 == 1) {
            this.field4589 = arg2.method1736(255);
            this.method2064(-1811385168, this.field4589);
        } else if (arg3 == 2) {
            this.field4582 = arg2.method1765(true);
            if (this.field4582 == 65535) {
                this.field4582 = -1;
            }
        } else if (arg3 == 3) {
            this.field4591 = arg2.method1765(true);
        } else if (arg3 == 4) {
            this.field4594 = false;
        }
    }
}
