import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class254 extends class207 {

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4142 = 0;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "Z")
    public static boolean field4146 = false;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Ljf;")
    public static class216 field4148 = new class216(64);

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4151 = "K";

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4152 = "Loaded title screen";

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "Z")
    public static boolean field4154;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "[I")
    public static int[] field4153;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static void method1800(int arg0) {
        field4152 = null;
        int var1 = -83 / ((arg0 + 25) / 33);
        field4148 = null;
        field4151 = null;
        field4153 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1801(String arg0, byte arg1) {
        field4147++;
        if (class72.field1072 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class111.method745(1);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class236.method1655(0, (String) null, arg1 ^ 0x24, "mem=" + var4 + "k");
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class111.method745(1);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class236.method1655(0, (String) null, 113, "Memory before cleanup=" + var7 + "k");
                class299.method2016(false);
                class111.method745(1);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class236.method1655(0, (String) null, 122, "Memory after cleanup=" + var9 + "k");
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class236.method1655(0, (String) null, 99, "Number of player models in cache:" + class167.method1141(arg1 ^ 0xFFFFFFDD));
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class9.method50(-105);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class93.field1397.method182(-122);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class93.field1397.method187(false);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class95.field1425.method1681(91);
                class270.field4405.method559(arg1 + 4907);
                class93.field1397.method179(arg1 + 21671);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class161.field2416 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class95.method651(25, (byte) 56);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class159.field2388 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class159.field2388 = false;
            }
            if (arg0.startsWith("::setba")) {
                class306.field4876 = class144.method946(arg0.substring(8), arg1 - 94);
                class170.method1216(class95.field1425, -123);
                class52.field741 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class65.method426(class144.method946(arg0.substring(15), -1));
                class170.method1216(class95.field1425, -96);
                class52.field741 = false;
            }
            if (arg0.startsWith("::fps ") && class73.field1104 != 0) {
                class191.method1335(65, class144.method946(arg0.substring(6), -1));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class164.field2544 = class144.method946(arg0.substring(12).trim(), -1);
                class236.method1655(0, (String) null, 100, "rect_debug=" + class164.field2544);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class107.field1563 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class229.field3538) {
                    class229.field3538 = false;
                    class236.method1655(0, (String) null, 93, "Forced tweening disabled.");
                } else {
                    class229.field3538 = true;
                    class236.method1655(0, (String) null, 91, "Forced tweening ENABLED!");
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class182.field2860) {
                    System.out.println("Shift-click disabled.");
                    class182.field2860 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class182.field2860 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class236.method1655(0, (String) null, 118, "x:" + (class214.field3347.field3915 >> 7) + " z:" + (class214.field3347.field3920 >> 7) + " groundh:" + class8.field114[class148.field2204][class214.field3347.field3915 >> 7][class214.field3347.field3920 >> 7]);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class236.method1655(0, (String) null, 114, "Height: " + class8.field114[class148.field2204][class214.field3347.field3915 >> 7][class214.field3347.field3920 >> 7]);
            }
        }
        field4144++;
        class150.field2218.method445(0, 7);
        class150.field2218.method1183(arg0.length() - 1, 984049208);
        if (arg1 != 93) {
            method1801((String) null, (byte) -72);
        }
        class150.field2218.method1168((byte) -37, arg0.substring(2));
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Ldh;")
    public static final class158 method1802(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1646; var4++) {
            class158 var5 = var3.field1634[var4];
            if ((var5.field2354 >> 29 & 0x3L) == 2L && var5.field2352 == arg1 && var5.field2359 == arg2) {
                class139.method878(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static final void method1803(int arg0) {
        client.field3874.method1510(10283);
        field4143++;
        if (arg0 == 12196) {
            class282.field4583.method1510(10283);
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static final void method1804(int arg0) {
        class268.field4351 = null;
        class31.field378 = null;
        class268.field4353 = null;
        class150.field2211 = null;
        if (arg0 != 0) {
            return;
        }
        class41.field503 = null;
        class268.field4358 = null;
        class169.field2601 = null;
        class46.field578 = null;
        class104.field1520 = null;
        class97.field1463 = null;
        field4145++;
        class306.field4884 = null;
        class46.field562 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)I")
    public static final int method1805(int arg0, int arg1, int arg2) {
        field4141++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 <= 79) {
            field4152 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)I")
    public static final int method1806(int arg0, byte arg1, int arg2) {
        field4140++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg1 == -85 ? arg0 : -20;
    }
}
