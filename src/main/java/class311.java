import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class311 extends class27 {

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Z")
    public static boolean field5021 = false;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field5022 = 0;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[I")
    public static int[] field5026 = new int[14];

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5027 = "K";

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "B")
    public byte field5023;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Lma;")
    public class202 field5024;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "Lvb;")
    public static class61 field5031;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(I)I")
    public final int method163(int arg0) {
        ++field5029;
        if (this.field5024 == null) {
            return 0;
        } else {
            if (arg0 != 8) {
                field5021 = true;
            }
            return this.field5024.field3272 * 100 / (this.field5024.field3234.length + -this.field5023);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
    public static final void method2112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = -17 / ((arg1 - -71) / 49);
        while (~class249.field3967 < ~var5) {
            if (~(class310.field5013[var5] - -class260.field4266[var5]) < ~arg4 && arg2 + arg4 > class310.field5013[var5] && ~arg0 > ~(class73.field1059[var5] - -class150.field2341[var5]) && ~(arg0 - -arg3) < ~class73.field1059[var5]) {
                class241.field3799[var5] = true;
            }
            ++var5;
        }
        ++field5033;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2113(int arg0, String arg1) {
        ++field5030;
        if (class37.field484 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class65.method416(true);
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class286.method2013((byte) -121, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class65.method416(true);
                for (int var5 = 0; ~var5 > -11; ++var5) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                class286.method2013((byte) -98, "Memory before cleanup=" + var7 + "k");
                class52.method314(-117);
                class65.method416(true);
                for (int var8 = 0; var8 < 10; ++var8) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                class286.method2013((byte) -98, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class286.method2013((byte) -122, "Number of player models in cache:" + class120.method782((byte) -126));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class29.method173(40);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class229.field3663.method1697((byte) -8);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class229.field3663.method1704(true);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class259.field4254.method1770((byte) 122);
                class103.field1551.method1274(-1);
                class229.field3663.method1691((byte) -11);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class296.field4864 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class229.method1614(25, 28);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class260.field4264 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class260.field4264 = false;
            }
            if (arg1.startsWith("::setba")) {
                class132.field2028 = class104.method672(arg1.substring(8), (byte) 19);
                class248.method1733(false, class259.field4254);
                class217.field3462 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class77.method504(class104.method672(arg1.substring(15), (byte) 19));
                class248.method1733(false, class259.field4254);
                class217.field3462 = false;
            }
            if (arg1.startsWith("::fps ") && class138.field2130 != 0) {
                class150.method995(class104.method672(arg1.substring(6), (byte) 19), -25454);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class37.field482 = class104.method672(arg1.substring(12).trim(), (byte) 19);
                class286.method2013((byte) -105, "rect_debug=" + class37.field482);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class266.field4381 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class231.field3698) {
                    class231.field3698 = false;
                    class286.method2013((byte) -124, "Forced tweening disabled.");
                } else {
                    class231.field3698 = true;
                    class286.method2013((byte) -113, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (!class253.field4019) {
                    System.out.println("Shift-click ENABLED!");
                    class253.field4019 = true;
                } else {
                    System.out.println("Shift-click disabled.");
                    class253.field4019 = false;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class286.method2013((byte) -125, "x:" + (class309.field5006.field836 >> 7) + " z:" + (class309.field5006.field850 >> 7) + " groundh:" + class242.field3842[class165.field2600][class309.field5006.field836 >> 7][class309.field5006.field850 >> 7]);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class286.method2013((byte) -121, "Height: " + class242.field3842[class165.field2600][class309.field5006.field836 >> 7][class309.field5006.field850 >> 7]);
            }
        }
        class276.field4572.method1391(0, 130);
        ++class157.field2488;
        class276.field4572.method1446((byte) 46, arg1.length() + -1);
        class276.field4572.method1409(arg1.substring(2), (byte) 77);
        int var10 = -116 / ((-29 - arg0) / 58);
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)[B")
    public final byte[] method164(int arg0) {
        ++field5028;
        if (!super.field338 && this.field5024.field3272 >= this.field5024.field3234.length + -this.field5023) {
            if (arg0 != 25976) {
                this.method163(122);
            }
            return this.field5024.field3234;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "(I)V")
    public static void method2114(int arg0) {
        if (arg0 == 1024) {
            field5027 = null;
            field5031 = null;
            field5026 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lfa;ZLfa;)V")
    public static final void method2115(class273 arg0, boolean arg1, class273 arg2) {
        class249.field3970 = class18.method112(arg2, class174.field2725, (byte) 100, arg0, 0);
        if (!arg1) {
            ++field5025;
            class216.field3439 = (class222) class249.field3970;
            class48.field667 = class18.method112(arg2, class192.field3032, (byte) 100, arg0, 0);
            class202.field3227 = class18.method112(arg2, class53.field717, (byte) -36, arg0, 0);
        }
    }
}
