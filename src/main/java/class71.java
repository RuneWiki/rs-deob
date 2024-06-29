import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lkd;")
    private static class73 field1793 = class126.method1070((byte) -66, "Please wait)3)3)3");

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lkd;")
    public static class73 field1787 = class126.method1070((byte) -66, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lkd;")
    public static class73 field1788 = field1793;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "J")
    public static volatile long field1796 = 0L;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lkd;")
    public static class73 field1792 = field1793;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
    public static boolean field1797 = false;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lle;")
    public static class81 field1795 = new class81();

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lkd;")
    private static class73 field1800 = class126.method1070((byte) -66, "Nov");

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lkd;")
    private static class73 field1805 = class126.method1070((byte) -66, "Apr");

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lkd;")
    private static class73 field1804 = class126.method1070((byte) -66, "Jul");

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lkd;")
    private static class73 field1806 = class126.method1070((byte) -66, "Feb");

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lkd;")
    private static class73 field1801 = class126.method1070((byte) -66, "Mar");

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lkd;")
    private static class73 field1802 = class126.method1070((byte) -66, "Sep");

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lkd;")
    private static class73 field1811 = class126.method1070((byte) -66, "May");

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lkd;")
    private static class73 field1808 = class126.method1070((byte) -66, "Jan");

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lkd;")
    private static class73 field1813 = class126.method1070((byte) -66, "Jun");

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Lkd;")
    private static class73 field1812 = class126.method1070((byte) -66, "Oct");

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lkd;")
    private static class73 field1807 = class126.method1070((byte) -66, "Dec");

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Lkd;")
    private static class73 field1810 = class126.method1070((byte) -66, "Aug");

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "[Lkd;")
    public static class73[] field1809 = new class73[] { field1808, field1806, field1801, field1805, field1811, field1813, field1804, field1810, field1802, field1812, field1800, field1807 };

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Ljb;")
    public static class64 field1803 = new class64(128);

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Lkd;")
    private static class73 field1814 = class126.method1070((byte) -66, "Prepared visibility map");

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Lkd;")
    public static class73 field1815 = field1814;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
    public static final int method591(int arg0) {
        field1794++;
        int var1 = class70.method585(class11.field320, class30.field857, class70.field1785, (byte) -48);
        if (arg0 < 69) {
            field1813 = null;
        }
        return var1 - class23.field664 >= 800 || (class55.field1482[class11.field320][class30.field857 >> 7][class70.field1785 >> 7] & 0x4) == 0 ? 3 : class11.field320;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method592(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(arg0);
        field1790++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILa;)Z")
    public static final boolean method593(int arg0, class1 arg1) {
        field1789++;
        int var2 = arg1.field84;
        if (class132.field3303 == 2) {
            if (var2 == 201) {
                class9.field316 = class121.field3095;
                class2.field146 = 0;
                class104.field2603 = true;
                class132.field3304 = true;
                class9.field299 = class9.field298;
                class72.field1837 = 1;
            }
            if (var2 == 202) {
                class104.field2603 = true;
                class2.field146 = 0;
                class9.field299 = class9.field298;
                class9.field316 = class47.field1260;
                class132.field3304 = true;
                class72.field1837 = 2;
            }
        }
        if (var2 == 205) {
            class118.field3017 = 250;
            return true;
        }
        if (var2 == 501) {
            class104.field2603 = true;
            class132.field3304 = true;
            class9.field299 = class9.field298;
            class9.field316 = class23.field669;
            class72.field1837 = 4;
            class2.field146 = 0;
        }
        if (var2 == 502) {
            class72.field1837 = 5;
            class132.field3304 = true;
            class9.field316 = class36.field999;
            class104.field2603 = true;
            class2.field146 = 0;
            class9.field299 = class9.field298;
        }
        if (arg0 != -19725) {
            method597((byte) -94);
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class131.field3294.method435(var3, var4 == 1, (byte) 95);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class131.field3294.method438(var6 == 1, var5, false);
        }
        if (var2 == 324) {
            class131.field3294.method433((byte) -38, false);
        }
        if (var2 == 325) {
            class131.field3294.method433((byte) -38, true);
        }
        if (var2 == 326) {
            class43.field1149++;
            class121.field3079.method1215(-100, 3);
            class131.field3294.method431(73, class121.field3079);
            return true;
        }
        if (var2 == 620) {
            class50.field1316 = !class50.field1316;
        }
        if (var2 >= 601 && var2 <= 613) {
            client.method181((byte) 3);
            if (class9.field312.method632((byte) -58) > 0) {
                class66.field1724++;
                class121.field3079.method1215(-93, 71);
                class121.field3079.method967(true, class9.field312.method643(255));
                class121.field3079.method956((byte) 10, var2 - 601);
                class121.field3079.method956((byte) 10, class50.field1316 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLkd;La;)Lkd;")
    public static final class73 method594(byte arg0, class73 arg1, class1 arg2) {
        if (arg1.method623(-1893532698, class23.field674) != -1) {
            label58: while (true) {
                int var3 = arg1.method623(-1893532698, class57.field1527);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method623(-1893532698, class57.field1520);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method623(-1893532698, class149.field3637);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method623(-1893532698, class38.field1042);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method623(-1893532698, class64.field1692);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method623(-1893532698, class1.field8);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class73 var9 = class9.field298;
                                                        if (class140.field3471 != null) {
                                                            var9 = class52.method421(class140.field3471.field1697, 124291536);
                                                            try {
                                                                if (class140.field3471.field1693 != null) {
                                                                    byte[] var10 = ((String) class140.field3471.field1693).getBytes("ISO-8859-1");
                                                                    var9 = class139.method1131(0, var10, var10.length, false);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class32.method258(-61, new class73[] { arg1.method630(var8, 0, -24023), var9, arg1.method638(var8 + 4, -102) });
                                                    }
                                                }
                                                arg1 = class32.method258(-125, new class73[] { arg1.method630(var7, 0, -24023), class9.method92(-4628, class149.method1192(4, arg2, 0)), arg1.method638(var7 + 2, 127) });
                                            }
                                        }
                                        arg1 = class32.method258(-95, new class73[] { arg1.method630(var6, 0, -24023), class9.method92(-4628, class149.method1192(3, arg2, 0)), arg1.method638(var6 + 2, -44) });
                                    }
                                }
                                arg1 = class32.method258(-94, new class73[] { arg1.method630(var5, 0, -24023), class9.method92(-4628, class149.method1192(2, arg2, 0)), arg1.method638(var5 + 2, -94) });
                            }
                        }
                        arg1 = class32.method258(-116, new class73[] { arg1.method630(var4, 0, -24023), class9.method92(-4628, class149.method1192(1, arg2, 0)), arg1.method638(var4 + 2, 127) });
                    }
                }
                arg1 = class32.method258(-61, new class73[] { arg1.method630(var3, 0, -24023), class9.method92(-4628, class149.method1192(0, arg2, 0)), arg1.method638(var3 + 2, 124) });
            }
        }
        int var11 = -68 % ((arg0 + 70) / 35);
        field1791++;
        return arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBII)I")
    public static final int method595(int arg0, byte arg1, int arg2, int arg3) {
        if (arg3 > 179) {
            arg0 /= 2;
        }
        if (arg3 > 192) {
            arg0 /= 2;
        }
        field1786++;
        if (arg1 >= -63) {
            field1813 = null;
        }
        if (arg3 > 217) {
            arg0 /= 2;
        }
        if (arg3 > 243) {
            arg0 /= 2;
        }
        return arg3 / 2 + (arg2 / 4 << 10) + (arg0 / 32 << 7);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I")
    public static final int method596(int arg0, int arg1, int arg2) {
        field1799++;
        if (arg0 == -2) {
            return 12345678;
        } else if (~arg0 == arg2) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method597(byte arg0) {
        field1814 = null;
        field1804 = null;
        field1806 = null;
        field1788 = null;
        field1808 = null;
        field1813 = null;
        field1805 = null;
        field1787 = null;
        field1803 = null;
        field1792 = null;
        field1809 = null;
        field1811 = null;
        field1793 = null;
        field1800 = null;
        field1815 = null;
        int var1 = -124 % ((arg0 + 62) / 44);
        field1807 = null;
        field1810 = null;
        field1795 = null;
        field1801 = null;
        field1812 = null;
        field1802 = null;
    }
}
