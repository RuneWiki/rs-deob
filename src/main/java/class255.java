import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class255 extends class187 {

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4048 = "Ok";

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Z")
    public static boolean field4057 = false;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Lrg;")
    public static class104 field4044;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Lsi;")
    public static class332 field4050;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Lkb;")
    public static class39 field4047;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Ljava/lang/String;")
    public String field4052;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Ljava/lang/String;")
    public String field4053;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 12)
    public static void method1793(int arg0) {
        field4048 = null;
        field4047 = null;
        field4050 = null;
        if (arg0 == 8256) {
            field4044 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILgn;)V", line = 34)
    public static final void method1794(int arg0, class6 arg1) {
        field4055++;
        class301 var2 = null;
        try {
            if (arg0 != 150) {
                field4050 = (class332) null;
            }
            class217 var3 = arg1.method31((byte) -55, "runescape");
            while (var3.field3488 == 0) {
                class20.method128(0, 1L);
            }
            if (var3.field3488 == 1) {
                var2 = (class301) var3.field3490;
                class192 var4 = class16.method104(false);
                var2.method2105(var4.field3129, false, 0, var4.field3128);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2106((byte) -110);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lkb;B)V", line = 69)
    public static final void method1795(class39 arg0, byte arg1) {
        if (arg1 < -45) {
            field4056++;
            class68.field884 = arg0;
            class92.field1424 = class68.field884.method261(-124, 4);
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)I", line = 85)
    public static final int method1796(byte arg0) {
        field4043++;
        return arg0 == 35 ? class80.field1201.method1614(0) : -50;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 96)
    public static final void method1797(String arg0, int arg1) {
        if (arg1 < -99) {
            System.out.println("Error: " + class341.method2350((byte) -53, "%0a", arg0, "\n"));
            field4040++;
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Lgj;", line = 107)
    public final class245 method1798(int arg0) {
        field4046++;
        if (arg0 >= -75) {
            method1797((String) null, -11);
        }
        return class37.field495[this.field3029];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIB)I", line = 118)
    public static final int method1799(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 <= 33) {
            field4057 = false;
        }
        field4054++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lok;B)V", line = 142)
    public static final void method1800(class160 arg0, byte arg1) {
        field4051++;
        if (arg1 != 101) {
            method1794(-83, (class6) null);
        }
        int var2 = arg0.field2461;
        if (var2 == 324) {
            if (class140.field2088 == -1) {
                class140.field2088 = arg0.field2473;
                class91.field1403 = arg0.field2450;
            }
            if (class69.field899.field4736) {
                arg0.field2473 = class140.field2088;
            } else {
                arg0.field2473 = class91.field1403;
            }
        } else if (var2 == 325) {
            if (class140.field2088 == -1) {
                class91.field1403 = arg0.field2450;
                class140.field2088 = arg0.field2473;
            }
            if (class69.field899.field4736) {
                arg0.field2473 = class91.field1403;
            } else {
                arg0.field2473 = class140.field2088;
            }
        } else if (var2 == 327) {
            arg0.field2586 = 150;
            arg0.field2582 = (int) (Math.sin((double) class48.field648 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2624 = -1;
            arg0.field2621 = 5;
        } else if (var2 == 328) {
            if (class13.field159.field5003 == null) {
                arg0.field2624 = 0;
            } else {
                arg0.field2586 = 150;
                arg0.field2582 = (int) (Math.sin((double) class48.field648 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2621 = 5;
                arg0.field2624 = ((int) class232.method1669(37, class13.field159.field5003) << 11) + 2047;
                arg0.field2600 = 0;
                arg0.field2605 = class13.field159.field1987;
                arg0.field2596 = class13.field159.field1994;
                arg0.field2618 = class13.field159.field2031;
            }
        }
    }
}
