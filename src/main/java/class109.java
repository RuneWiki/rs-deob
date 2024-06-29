import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class109 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1491 = "Ok";

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1498 = "flash2:";

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1495 = 0;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field1503 = -1;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BLjava/lang/String;)V", line = 4)
    public static final void method702(byte arg0, String arg1) {
        field1496++;
        if (class100.field1350 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class214.method1494((byte) 0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class306.method2157("mem=" + var4 + "k", false, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class214.method1494((byte) 0);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class306.method2157("Memory before cleanup=" + var7 + "k", false, 0, (String) null);
                class194.method1349(-32315);
                class214.method1494((byte) 0);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class306.method2157("Memory after cleanup=" + var9 + "k", false, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class306.method2157("Number of player models in cache:" + class161.method1166(-21), false, 0, (String) null);
            }
            if (class272.field4317 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class1.field6);
                System.out.println("oncard_2d:" + class1.field5);
                System.out.println("oncard_texture:" + class1.field2);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class194.method1350((byte) 106);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class179.field2684.method508(false);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class179.field2684.method509((byte) 34);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class156.field2451.method161(11191);
                class147.field2352.method1526((byte) 34);
                class179.field2684.method501(20);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class345.field5475 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class219.method1525((byte) 103, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class226.field3425 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class226.field3425 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class145.method1074(false, 0, -1, -1, -90);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class145.method1074(false, 1, -1, -1, 127);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class145.method1074(false, 2, -1, -1, -69);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class145.method1074(false, 3, 1024, 768, -28);
            }
            if (arg1.startsWith("::setba")) {
                class75.field966 = class74.method467(-72, arg1.substring(8));
                class160.method1162(class156.field2451, (byte) -127);
                class250.field3967 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class141.method986(class74.method467(-37, arg1.substring(15)));
                class160.method1162(class156.field2451, (byte) -128);
                class250.field3967 = false;
            }
            if (arg1.startsWith("::fps ") && class296.field4656 != 0) {
                class127.method861(class74.method467(-34, arg1.substring(6)), 1000);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class92.field1208 = class74.method467(-83, arg1.substring(12).trim());
                class306.method2157("rect_debug=" + class92.field1208, false, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class214.field3244 = true;
            }
            if (arg1.startsWith("::hdr") && class272.field4317 && !class123.method791(!class152.method1116(), false)) {
                class306.method2157("Failed to enable hdr", false, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class325.field5215) {
                    class325.field5215 = false;
                    class306.method2157("Forced tweening disabled.", false, 0, (String) null);
                } else {
                    class325.field5215 = true;
                    class306.method2157("Forced tweening ENABLED!", false, 0, (String) null);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class67.field847) {
                    System.out.println("Shift-click disabled.");
                    class67.field847 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class67.field847 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class306.method2157("x:" + (class11.field113.field3767 >> 7) + " z:" + (class11.field113.field3763 >> 7) + " groundh:" + class72.field902[class219.field3290][class11.field113.field3767 >> 7][class11.field113.field3763 >> 7], false, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class306.method2157("Height: " + class72.field902[class219.field3290][class11.field113.field3767 >> 7][class11.field113.field3763 >> 7], false, 0, (String) null);
            }
        }
        class247.field3908++;
        class328.field5282.method304(186, 19830);
        class328.field5282.method1055(arg1.length() - 1, 109);
        if (arg0 > 9) {
            class328.field5282.method1050(arg1.substring(2), -40);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 230)
    public static void method703(int arg0) {
        field1491 = null;
        field1498 = null;
        if (arg0 != 7303) {
            method703(16);
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z", line = 251)
    public final boolean method704(int arg0) {
        field1499++;
        if (arg0 == 0) {
            return (this.field1500 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Z", line = 268)
    public final boolean method705(int arg0) {
        if (arg0 == 0) {
            field1497++;
            return (this.field1500 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Llf;I)Lgb;", line = 285)
    public static final class191 method706(class143 arg0, int arg1) {
        field1492++;
        if (arg1 != 6808) {
            method702((byte) 3, (String) null);
        }
        return new class191(arg0.method1021(-1), arg0.method1021(-1), arg0.method1021(-1), arg0.method1021(-1), arg0.method1017((byte) 101), arg0.method1017((byte) 101), arg0.method1043(true));
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)Z", line = 301)
    public final boolean method707(int arg0) {
        int var2 = -91 % ((70 - arg0) / 33);
        field1501++;
        return (this.field1500 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z", line = 310)
    public final boolean method708(boolean arg0) {
        if (!arg0) {
            this.field1494 = -14;
        }
        field1502++;
        return (this.field1500 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[B)[B", line = 321)
    public static final byte[] method709(int arg0, byte[] arg1) {
        field1504++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        if (arg0 != -18433) {
            field1503 = -84;
        }
        class8.method50(arg1, 0, var2, 0, arg1.length);
        return var2;
    }
}
