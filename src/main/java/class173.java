import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class173 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lag;")
    public static class97 field2471 = new class97();

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2479 = "";

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Z")
    public static boolean field2475 = false;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field2472;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    public static int[] field2470;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
    public int[] field2476;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lve;Z)V")
    public static final void method1137(class233 arg0, boolean arg1) {
        field2481++;
        if (arg1) {
            field2470 = null;
        }
        class67.field1042 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public abstract void method206(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method1138(byte arg0) {
        field2474++;
        for (class272 var1 = (class272) class91.field1382.method656(108); var1 != null; var1 = (class272) class91.field1382.method650(126)) {
            if (var1.field4308 == -1) {
                var1.field4302 = 0;
                class233.method1523(var1, 30312);
            } else {
                var1.method1706(-123);
            }
        }
        int var2 = -125 / (arg0 / 40);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method201(byte arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1139(int arg0, String arg1) {
        field2469++;
        if (class270.field4228 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class60.method395(true);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class255.method1712((byte) 72, "mem=" + var4 + "k", 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class60.method395(true);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class255.method1712((byte) 72, "Memory before cleanup=" + var7 + "k", 0, (String) null);
                class29.method214((byte) 66);
                class60.method395(true);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class255.method1712((byte) 72, "Memory after cleanup=" + var9 + "k", 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class255.method1712((byte) 72, "Number of player models in cache:" + class87.method595(125), 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class259.method1736((byte) -13);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class81.field1257.method1619((byte) -107);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class81.field1257.method1625(-5938);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class163.field2378.method560(5000);
                class10.field180.method364((byte) -43);
                class81.field1257.method1616(0);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class248.field3729 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class245.method1608((byte) 84, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class246.field3676 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class246.field3676 = false;
            }
            if (arg1.equalsIgnoreCase("::noclip")) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class246.field3681[var10].field1319[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.startsWith("::setparticles")) {
                class112.method727(class16.method124((byte) 19, arg1.substring(15)));
                class285.method1920(class163.field2378, (byte) -114);
                class15.field229 = false;
            }
            if (arg1.startsWith("::fps ") && class180.field2579 != 0) {
                class267.method1787(class16.method124((byte) 19, arg1.substring(6)), false);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class222.field3305 = class16.method124((byte) 19, arg1.substring(12).trim());
                class255.method1712((byte) 72, "rect_debug=" + class222.field3305, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class268.field4194 = true;
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class5.field80) {
                    class5.field80 = false;
                    class255.method1712((byte) 72, "Forced tweening disabled.", 0, (String) null);
                } else {
                    class5.field80 = true;
                    class255.method1712((byte) 72, "Forced tweening ENABLED!", 0, (String) null);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class268.field4204) {
                    System.out.println("Shift-click disabled.");
                    class268.field4204 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class268.field4204 = true;
                }
            }
        }
        class95.field1451.method522(57, 28727);
        class95.field1451.method775(arg1.length() - 1, -115);
        class124.field1796++;
        if (arg0 == 10) {
            class95.field1451.method734((byte) 92, arg1.substring(2));
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method1140(boolean arg0) {
        field2480++;
        class12.field192++;
        class95.field1451.method522(183, 28727);
        if (arg0) {
            return;
        }
        for (class261 var1 = (class261) class128.field1874.method1219(1); var1 != null; var1 = (class261) class128.field1874.method1223(117)) {
            if (var1.field3941 == 0) {
                class69.method466((byte) -120, var1, true);
            }
        }
        if (class101.field1508 != null) {
            class217.method1396(false, class101.field1508);
            class101.field1508 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIZIZ)V")
    public static final void method1141(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field2473++;
        if (arg0 == 3) {
            method1141(class161.field2333, true, arg2, -1, true, -1, true);
            return;
        }
        Container var7;
        if (class166.field2415 != null) {
            var7 = class166.field2415;
        } else if (class282.field4503 == null) {
            var7 = class163.field2378.field1273;
        } else {
            var7 = class282.field4503;
        }
        class286.field4545 = var7.getSize().width;
        class191.field2735 = var7.getSize().height;
        if (class282.field4503 == var7) {
            Insets var8 = class282.field4503.getInsets();
            class191.field2735 -= var8.top + var8.bottom;
            class286.field4545 -= var8.right + var8.left;
        }
        if (arg0 < 2) {
            class23.field294 = 0;
            class290.field4581 = (class286.field4545 - 765) / 2;
            class250.field3813 = 503;
            class214.field3080 = 765;
        } else {
            class23.field294 = 0;
            class214.field3080 = class286.field4545;
            class250.field3813 = class191.field2735;
            class290.field4581 = 0;
        }
        if (arg4) {
            class28.method211(class80.field1247, -118);
            class17.method130(class80.field1247, (byte) -5);
            if (class27.field388 != null) {
                class27.field388.method82(class80.field1247, -27503);
            }
            class80.field1237.method1000(0);
            class211.method1346(127, class80.field1247);
            class240.method1566((byte) 117, class80.field1247);
            if (class27.field388 != null) {
                class27.field388.method84(class80.field1247, (byte) 53);
            }
        } else {
            class80.field1247.setSize(class214.field3080, class250.field3813);
            if (class282.field4503 == var7) {
                Insets var9 = class282.field4503.getInsets();
                class80.field1247.setLocation(class290.field4581 + var9.left, class23.field294 + var9.top);
            } else {
                class80.field1247.setLocation(class290.field4581, class23.field294);
            }
        }
        if (arg0 > 0) {
            method1141(0, true, arg2, -1, true, -1, true);
            return;
        }
        class168.field2441 = !class202.method1310(false);
        if (class193.field2774 != -1) {
            class38.method266(0, true);
        }
        if (class10.field180 != null && (class192.field2754 == 30 || class192.field2754 == 25)) {
            class146.method976((byte) -1);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class21.field278[var10] = true;
        }
        client.field3297 = arg6;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method1142(int arg0) {
        if (arg0 != 25) {
            this.field2477 = -2;
        }
        class144.method959(this.field2476, this.field2482, this.field2477);
        field2478++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static void method1143(byte arg0) {
        field2479 = null;
        field2471 = null;
        field2470 = null;
        if (arg0 <= 34) {
            field2479 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method204(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method1144(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field2483++;
        class267 var5 = class22.method165(arg4, false, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field4147 != null) {
            class234 var6 = new class234();
            var6.field3520 = arg3;
            var6.field3518 = arg0;
            var6.field3531 = var5;
            var6.field3530 = var5.field4147;
            class15.method118((byte) 77, var6);
        }
        boolean var7 = true;
        if (arg1 != 15119) {
            method1139(-7, (String) null);
        }
        if (var5.field4104 > 0) {
            var7 = class271.method1820(-105, var5);
        }
        if (!var7 || !client.method1439(var5).method631((byte) -55, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class95.field1451.method522(89, 28727);
            class95.field1451.method737(-2645, arg2);
            class236.field3564++;
            class95.field1451.method794(arg4, (byte) -87);
        }
        if (arg0 == 2) {
            class100.field1490++;
            class95.field1451.method522(175, 28727);
            class95.field1451.method737(-2645, arg2);
            class95.field1451.method794(arg4, (byte) -46);
        }
        if (arg0 == 3) {
            class67.field1048++;
            class95.field1451.method522(252, 28727);
            class95.field1451.method737(-2645, arg2);
            class95.field1451.method794(arg4, (byte) -66);
        }
        if (arg0 == 4) {
            class92.field1397++;
            class95.field1451.method522(191, arg1 ^ 0x4B38);
            class95.field1451.method737(-2645, arg2);
            class95.field1451.method794(arg4, (byte) -122);
        }
        if (arg0 == 5) {
            class182.field2601++;
            class95.field1451.method522(64, 28727);
            class95.field1451.method737(-2645, arg2);
            class95.field1451.method794(arg4, (byte) -26);
        }
        if (arg0 == 6) {
            class184.field2634++;
            class95.field1451.method522(248, arg1 + 13608);
            class95.field1451.method737(arg1 - 17764, arg2);
            class95.field1451.method794(arg4, (byte) -20);
        }
        if (arg0 == 7) {
            class95.field1451.method522(213, 28727);
            class95.field1451.method737(-2645, arg2);
            class180.field2569++;
            class95.field1451.method794(arg4, (byte) -73);
        }
        if (arg0 == 8) {
            class95.field1451.method522(44, arg1 + 13608);
            class95.field1451.method737(-2645, arg2);
            class261.field3944++;
            class95.field1451.method794(arg4, (byte) -36);
        }
        if (arg0 == 9) {
            class189.field2679++;
            class95.field1451.method522(40, 28727);
            class95.field1451.method737(-2645, arg2);
            class95.field1451.method794(arg4, (byte) -86);
        }
        if (arg0 == 10) {
            class88.field1349++;
            class95.field1451.method522(60, 28727);
            class95.field1451.method737(arg1 ^ 0xFFFFCEA4, arg2);
            class95.field1451.method794(arg4, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    protected class173() {
    }
}
