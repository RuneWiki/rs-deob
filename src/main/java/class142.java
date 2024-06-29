import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class142 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2181 = "flash3:";

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2186 = 0;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[Z")
    public static boolean[] field2184;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method979(int arg0) {
        field2181 = null;
        if (arg0 < 21) {
            method981((class205) null, 40, -50, 6);
        }
        field2184 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method980(int arg0, int arg1, String arg2) {
        if (arg1 == -1) {
            field2185++;
            class295 var3 = class250.method1673(51, 2, arg0);
            var3.method1980(arg1 ^ 0xC30A9413);
            var3.field4634 = arg2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lbf;III)V")
    public static final void method981(class205 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class113.field1777) {
            class23 var4 = class255.field3907[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field363 != null && var4.field363.field2689.method1228()) {
                arg0.method1201(var4.field363.field2689, 128, 0, 0, true);
            }
        }
        if (arg3 < class113.field1777) {
            class23 var5 = class255.field3907[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field363 != null && var5.field363.field2689.method1228()) {
                arg0.method1201(var5.field363.field2689, 0, 0, 128, true);
            }
        }
        if (arg2 < class113.field1777 && arg3 < class191.field3032) {
            class23 var6 = class255.field3907[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field363 != null && var6.field363.field2689.method1228()) {
                arg0.method1201(var6.field363.field2689, 128, 0, 128, true);
            }
        }
        if (arg2 < class113.field1777 && arg3 > 0) {
            class23 var7 = class255.field3907[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field363 != null && var7.field363.field2689.method1228()) {
                arg0.method1201(var7.field363.field2689, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method982(String arg0, boolean arg1) {
        field2183++;
        if (class259.field3968 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class71.method557(18294);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class73.method567((String) null, 0, "mem=" + var4 + "k", 71);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class71.method557(18294);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class73.method567((String) null, 0, "Memory before cleanup=" + var7 + "k", 119);
                class222.method1482((byte) -102);
                class71.method557(18294);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class73.method567((String) null, 0, "Memory after cleanup=" + var9 + "k", 116);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class73.method567((String) null, 0, "Number of player models in cache:" + class121.method863(99), 61);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class227.method1509(40);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class9.field190.method1558(-90);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class9.field190.method1571((byte) -121);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class22.field329.method469(248);
                class118.field1829.method1239(128);
                class9.field190.method1573((byte) -78);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class30.field478 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class77.method609(10, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class186.field2799 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class186.field2799 = false;
            }
            if (arg0.startsWith("::setba")) {
                class144.field2230 = class290.method1955(arg0.substring(8), 0);
                class220.method1477(class22.field329, 0);
                class258.field3956 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class240.method1623(class290.method1955(arg0.substring(15), 0));
                class220.method1477(class22.field329, 0);
                class258.field3956 = false;
            }
            if (arg0.startsWith("::fps ") && class238.field3689 != 0) {
                class37.method326((byte) -122, class290.method1955(arg0.substring(6), 0));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class181.field2699 = class290.method1955(arg0.substring(12).trim(), 0);
                class73.method567((String) null, 0, "rect_debug=" + class181.field2699, 109);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class102.field1626 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class53.field830) {
                    class53.field830 = false;
                    class73.method567((String) null, 0, "Forced tweening disabled.", 27);
                } else {
                    class53.field830 = true;
                    class73.method567((String) null, 0, "Forced tweening ENABLED!", 52);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class181.field2697) {
                    System.out.println("Shift-click disabled.");
                    class181.field2697 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class181.field2697 = true;
                }
            }
        }
        class175.field2601++;
        class292.field4607.method1251(152, (byte) -29);
        if (!arg1) {
            class292.field4607.method287(440742616, arg0.length() - 1);
            class292.field4607.method321(127, arg0.substring(2));
        }
    }
}
