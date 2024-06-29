import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class296 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lph;")
    public static class229 field4831 = class266.method1858("(U5", 0);

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Z")
    public static boolean field4836 = true;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4832 = -1;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lph;")
    public static class229 field4834 = class266.method1858("voudrait faire un -Bchange avec vous)3", 0);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lph;")
    public static class229 field4833 = class266.method1858("Utiliser", 0);

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lph;")
    private static class229 field4841 = class266.method1858("flash3:", 0);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lph;")
    public static class229 field4835 = field4841;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[Lph;")
    public static class229[] field4840 = new class229[100];

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lph;")
    public static class229 field4839 = field4841;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 12)
    public static void method2002(int arg0) {
        field4835 = null;
        field4839 = null;
        field4833 = null;
        field4841 = null;
        if (arg0 != 4) {
            field4832 = 61;
        }
        field4831 = null;
        field4840 = null;
        field4834 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)I", line = 28)
    public static final int method2003(byte arg0, int arg1) {
        field4843++;
        if (arg0 < 73) {
            method2003((byte) -124, -54);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 46)
    public static final void method2004(int arg0) {
        field4838++;
        if (class12.field164 == 0 || class12.field164 == 5) {
            return;
        }
        try {
            if (arg0 != 0) {
                method2005(79, -27, -2);
            }
            if (++class256.field4287 > 2000) {
                if (class121.field2031 != null) {
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                }
                if (class224.field3679 >= 1) {
                    class12.field164 = 0;
                    class332.field5661 = -5;
                    return;
                }
                class224.field3679++;
                if (class312.field5260 == class103.field1764) {
                    class103.field1764 = class103.field1754;
                } else {
                    class103.field1764 = class312.field5260;
                }
                class256.field4287 = 0;
                class12.field164 = 1;
            }
            if (class12.field164 == 1) {
                class314.field5339 = class249.field4143.method683(class103.field1764, 0, class312.field5261);
                class12.field164 = 2;
            }
            if (class12.field164 == 2) {
                if (class314.field5339.field4125 == 2) {
                    throw new IOException();
                }
                if (class314.field5339.field4125 != 1) {
                    return;
                }
                class121.field2031 = new class67((Socket) class314.field5339.field4123, class249.field4143);
                class314.field5339 = null;
                long var1 = class260.field4348 = class134.field2186.method1634(false);
                class121.field2033.field2670 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class121.field2033.method1188(-94, 14);
                class121.field2033.method1188(-112, var3);
                class121.field2031.method527(class121.field2033.field2668, 20737, 2, 0);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (class110.field1870 != null) {
                    class110.field1870.method662((byte) 93);
                }
                int var4 = class121.field2031.method529(-27959);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (class110.field1870 != null) {
                    class110.field1870.method662((byte) 93);
                }
                if (var4 != 0) {
                    class12.field164 = 0;
                    class332.field5661 = var4;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                }
                class12.field164 = 3;
            }
            if (class12.field164 == 3) {
                if (class121.field2031.method525(false) < 8) {
                    return;
                }
                class121.field2031.method532(false, 8, 0, class88.field1497.field2668);
                int[] var5 = new int[4];
                class88.field1497.field2670 = 0;
                class112.field1906 = class88.field1497.method1174(arg0 - 10985);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class112.field1906 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class121.field2033.field2670 = 0;
                var5[3] = (int) class112.field1906;
                class121.field2033.method1188(arg0 ^ 0xFFFFFF97, 10);
                class121.field2033.method1168(var5[0], (byte) -118);
                class121.field2033.method1168(var5[1], (byte) -83);
                class121.field2033.method1168(var5[2], (byte) -107);
                class121.field2033.method1168(var5[3], (byte) -90);
                class121.field2033.method1208((byte) -6, class134.field2186.method1634(false));
                class121.field2033.method1194(-11504, class134.field2181);
                class121.field2033.method1205(class236.field3884, class230.field3822, (byte) -125);
                class250.field4148.field2670 = 0;
                if (class169.field2786 == 40) {
                    class250.field4148.method1188(-78, 18);
                } else {
                    class250.field4148.method1188(-75, 16);
                }
                class250.field4148.method1155(-1640531527, class121.field2033.field2670 + (class71.method553(false, class232.field3830) + 159));
                class250.field4148.method1168(525, (byte) -89);
                class250.field4148.method1188(arg0 ^ 0xFFFFFFB4, field4832);
                class250.field4148.method1188(arg0 ^ 0xFFFFFF8D, class315.field5363 ? 1 : 0);
                class250.field4148.method1188(-87, 1);
                class250.field4148.method1188(arg0 - 100, class269.method1870(true));
                class250.field4148.method1155(arg0 - 1640531527, class273.field4567);
                class250.field4148.method1155(-1640531527, class266.field4484);
                class250.field4148.method1188(arg0 - 88, class272.field4546);
                class211.method1488((byte) -5, class250.field4148);
                class250.field4148.method1194(arg0 ^ 0xFFFFD310, class232.field3830);
                class250.field4148.method1168(class48.field709, (byte) -83);
                class250.field4148.method1168(class4.method25(79), (byte) -116);
                class116.field1966 = true;
                class250.field4148.method1155(-1640531527, class332.field5660);
                class250.field4148.method1168(class139.field2249.method496(-90), (byte) -78);
                class250.field4148.method1168(class161.field2601.method496(118), (byte) -96);
                class250.field4148.method1168(class236.field3885.method496(60), (byte) -73);
                class250.field4148.method1168(class171.field2811.method496(70), (byte) -93);
                class250.field4148.method1168(class105.field1780.method496(107), (byte) -106);
                class250.field4148.method1168(class131.field2130.method496(-92), (byte) -61);
                class250.field4148.method1168(class219.field3599.method496(arg0 ^ 0xFFFFFF9D), (byte) -89);
                class250.field4148.method1168(class281.field4649.method496(-109), (byte) -105);
                class250.field4148.method1168(class209.field3442.method496(-101), (byte) -85);
                class250.field4148.method1168(class147.field2383.method496(93), (byte) -126);
                class250.field4148.method1168(class312.field5246.method496(arg0 ^ 0xFFFFFF87), (byte) -111);
                class250.field4148.method1168(class1.field17.method496(arg0 ^ 0x50), (byte) -84);
                class250.field4148.method1168(class173.field2829.method496(-102), (byte) -61);
                class250.field4148.method1168(class48.field704.method496(-121), (byte) -76);
                class250.field4148.method1168(class234.field3857.method496(67), (byte) -89);
                class250.field4148.method1168(class97.field1645.method496(arg0 ^ 0xFFFFFF99), (byte) -70);
                class250.field4148.method1168(class201.field3323.method496(-118), (byte) -128);
                class250.field4148.method1168(class89.field1527.method496(arg0 ^ 0xFFFFFFB5), (byte) -83);
                class250.field4148.method1168(class195.field3271.method496(arg0 ^ 0xFFFFFF87), (byte) -126);
                class250.field4148.method1168(class115.field1952.method496(77), (byte) -114);
                class250.field4148.method1168(class70.field1171.method496(arg0 + 90), (byte) -127);
                class250.field4148.method1168(class6.field83.method496(-99), (byte) -103);
                class250.field4148.method1168(class123.field2066.method496(-123), (byte) -71);
                class250.field4148.method1168(class228.field3752.method496(51), (byte) -110);
                class250.field4148.method1168(class222.field3656.method496(arg0 - 108), (byte) -78);
                class250.field4148.method1168(class102.field1741.method496(63), (byte) -92);
                class250.field4148.method1168(class153.field2502.method496(arg0 ^ 0xFFFFFF8C), (byte) -120);
                class250.field4148.method1168(class156.field2528.method496(arg0 + 75), (byte) -59);
                class250.field4148.method1164(0, class121.field2033.field2670, true, class121.field2033.field2668);
                class121.field2031.method527(class250.field4148.field2668, 20737, class250.field4148.field2670, 0);
                class121.field2033.method39(arg0 - 483455965, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class88.field1497.method39(-483455965, var5);
                class12.field164 = 4;
            }
            if (class12.field164 == 4) {
                if (class121.field2031.method525(false) < 1) {
                    return;
                }
                int var7 = class121.field2031.method529(-27959);
                if (var7 == 21) {
                    class12.field164 = 7;
                } else if (var7 == 29) {
                    class12.field164 = 10;
                } else if (var7 == 1) {
                    class332.field5661 = var7;
                    class12.field164 = 5;
                    return;
                } else if (var7 == 2) {
                    class12.field164 = 8;
                } else if (var7 == 15) {
                    class12.field164 = 0;
                    class332.field5661 = var7;
                    return;
                } else if (var7 == 23 && class224.field3679 < 1) {
                    class256.field4287 = 0;
                    class12.field164 = 1;
                    class224.field3679++;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                } else {
                    class12.field164 = 0;
                    class332.field5661 = var7;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                }
            }
            if (class12.field164 == 6) {
                class121.field2033.field2670 = 0;
                class121.field2033.method37(56, 17);
                class121.field2031.method527(class121.field2033.field2668, arg0 + 20737, class121.field2033.field2670, 0);
                class12.field164 = 4;
                return;
            }
            if (class12.field164 == 7) {
                if (class121.field2031.method525(false) >= 1) {
                    class248.field4127 = class121.field2031.method529(-27959) * 60 + 180;
                    class332.field5661 = 21;
                    class12.field164 = 0;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                }
                return;
            }
            if (class12.field164 == 10) {
                if (class121.field2031.method525(false) >= 1) {
                    class122.field2045 = class121.field2031.method529(-27959);
                    class12.field164 = 0;
                    class332.field5661 = 29;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                }
                return;
            }
            if (class12.field164 == 8) {
                if (class121.field2031.method525(false) < 14) {
                    return;
                }
                class121.field2031.method532(false, 14, 0, class88.field1497.field2668);
                class88.field1497.field2670 = 0;
                class27.field378 = class88.field1497.method1178(arg0 ^ 0x8);
                class16.field196 = class88.field1497.method1178(8);
                class143.field2324 = class88.field1497.method1178(8) == 1;
                class190.field3097 = class88.field1497.method1178(8) == 1;
                class257.field4296 = class88.field1497.method1178(8) == 1;
                class8.field110 = class88.field1497.method1178(arg0 + 8) == 1;
                class116.field1957 = class88.field1497.method1178(8) == 1;
                class145.field2354 = class88.field1497.method1161(true);
                class26.field360 = class88.field1497.method1178(8) == 1;
                class185.field3006 = class88.field1497.method1178(8) == 1;
                class213.method1510(16, class185.field3006);
                class299.method2013(22893, class185.field3006);
                if (!class315.field5363) {
                    if ((!class143.field2324 || class257.field4296) && !class26.field360) {
                        try {
                            class1.field31.method1627((byte) 81, class249.field4143.field1561);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class330.field5625.method1627((byte) 34, class249.field4143.field1561);
                        } catch (Throwable var12) {
                        }
                    }
                }
                field4837 = class88.field1497.method31(-27227);
                class187.field3052 = class88.field1497.method1161(true);
                class12.field164 = 9;
            }
            if (class12.field164 == 9) {
                if (class121.field2031.method525(false) >= class187.field3052) {
                    class88.field1497.field2670 = 0;
                    class121.field2031.method532(false, class187.field3052, 0, class88.field1497.field2668);
                    class12.field164 = 0;
                    class332.field5661 = 2;
                    class75.method571(arg0 ^ 0x0);
                    class122.field2054 = -1;
                    class142.method1018((byte) 105, false);
                    field4837 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class121.field2031 != null) {
                class121.field2031.method534(-1);
                class121.field2031 = null;
            }
            if (class224.field3679 >= 1) {
                class332.field5661 = -4;
                class12.field164 = 0;
            } else {
                class256.field4287 = 0;
                class12.field164 = 1;
                if (class312.field5260 == class103.field1764) {
                    class103.field1764 = class103.field1754;
                } else {
                    class103.field1764 = class312.field5260;
                }
                class224.field3679++;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Lwk;", line = 443)
    public static final class207 method2005(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class207 var4 = var3.field1224;
            var3.field1224 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lri;I)V", line = 463)
    public static final void method2006(class301 arg0, int arg1) {
        field4842++;
        if (arg1 > 119 && class185.field3008 == arg0.field5012) {
            class187.field3036[arg0.field4964] = true;
        }
    }
}
