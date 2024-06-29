import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class127 {

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field1907 = 0;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Luf;")
    public static class180 field1904 = new class180();

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field1908 = 1;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1910 = " has logged in.";

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[I")
    public static int[] field1902;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[S")
    public static short[] field1912;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[[[I")
    public static int[][][] field1905;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method947(int arg0) {
        if (arg0 != -1) {
            method952(90);
        }
        field1902 = null;
        field1905 = null;
        field1904 = null;
        field1910 = null;
        field1912 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lha;IB)V")
    private final void method948(class31 arg0, int arg1, byte arg2) {
        int var4 = 109 / ((arg2 - 18) / 42);
        field1900++;
        if (arg1 == 5) {
            this.field1907 = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public static final void method949(int arg0) {
        class183.field2900.method1763(-1);
        field1911++;
        int var1 = class183.field2900.method1765(8, (byte) -124);
        if (var1 < class117.field1782) {
            for (int var2 = var1; var2 < class117.field1782; var2++) {
                class178.field2738[class253.field4052++] = class255.field4084[var2];
            }
        }
        if (var1 > class117.field1782) {
            throw new RuntimeException("gnpov1");
        }
        class117.field1782 = 0;
        if (arg0 != -6) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class255.field4084[var3];
            class161 var5 = class116.field1781[var4];
            int var6 = class183.field2900.method1765(1, (byte) -124);
            if (var6 == 0) {
                class255.field4084[class117.field1782++] = var4;
                var5.field4761 = class41.field686;
            } else {
                int var7 = class183.field2900.method1765(2, (byte) -119);
                if (var7 == 0) {
                    class255.field4084[class117.field1782++] = var4;
                    var5.field4761 = class41.field686;
                    class147.field2179[class122.field1840++] = var4;
                } else if (var7 == 1) {
                    class255.field4084[class117.field1782++] = var4;
                    var5.field4761 = class41.field686;
                    int var8 = class183.field2900.method1765(3, (byte) 127);
                    var5.method1980((byte) -128, 1, var8);
                    int var9 = class183.field2900.method1765(1, (byte) -118);
                    if (var9 == 1) {
                        class147.field2179[class122.field1840++] = var4;
                    }
                } else if (var7 == 2) {
                    class255.field4084[class117.field1782++] = var4;
                    var5.field4761 = class41.field686;
                    if (class183.field2900.method1765(1, (byte) -123) == 1) {
                        int var10 = class183.field2900.method1765(3, (byte) 12);
                        var5.method1980((byte) -127, 2, var10);
                        int var11 = class183.field2900.method1765(3, (byte) 27);
                        var5.method1980((byte) -126, 2, var11);
                    } else {
                        int var12 = class183.field2900.method1765(3, (byte) -116);
                        var5.method1980((byte) -125, 0, var12);
                    }
                    int var13 = class183.field2900.method1765(1, (byte) -123);
                    if (var13 == 1) {
                        class147.field2179[class122.field1840++] = var4;
                    }
                } else if (var7 == 3) {
                    class178.field2738[class253.field4052++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLha;)V")
    public final void method950(boolean arg0, class31 arg1) {
        while (true) {
            int var3 = arg1.method265(-99);
            if (var3 == 0) {
                field1903++;
                if (!arg0) {
                    method949(89);
                    return;
                }
                return;
            }
            this.method948(arg1, var3, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)I")
    public static final int method951(byte arg0) {
        if (arg0 != 39) {
            method952(-34);
        }
        field1906++;
        try {
            if (class92.field1459 == 0) {
                if (class279.field4425 > (class242.method1650(23) - 5000L)) {
                    return 0;
                }
                class86.field1279 = class123.field1863.method30(class211.field3250, class154.field2300, (byte) 3);
                class181.field2836 = class242.method1650(36);
                class92.field1459 = 1;
            }
            if (class242.method1650(119) > (class181.field2836 + 30000L)) {
                return class7.method47(1000, true);
            }
            if (class92.field1459 == 1) {
                if (class86.field1279.field2082 == 2) {
                    return class7.method47(1001, true);
                }
                if (class86.field1279.field2082 != 1) {
                    return -1;
                }
                class301.field4848 = new class182((Socket) class86.field1279.field2080, class123.field1863);
                int var1 = 0;
                class240.field3826.field541 = 0;
                if (class179.field2759) {
                    var1 = class288.field4504;
                }
                class86.field1279 = null;
                class240.field3826.method305(23, true);
                class240.field3826.method258(var1, -1527329320);
                class301.field4848.method1299(0, class240.field3826.field541, class240.field3826.field560, (byte) 127);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                int var2 = class301.field4848.method1309((byte) -66);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(arg0 - 7162);
                }
                if (var2 != 0) {
                    return class7.method47(var2, true);
                }
                class92.field1459 = 2;
            }
            if (class92.field1459 == 2) {
                if (class301.field4848.method1302(106) < 2) {
                    return -1;
                }
                class301.field4845 = class301.field4848.method1309((byte) -80);
                class301.field4845 <<= 0x8;
                class301.field4845 += class301.field4848.method1309((byte) 121);
                class92.field1459 = 3;
                class191.field2988 = 0;
                class183.field2896 = new byte[class301.field4845];
            }
            if (class92.field1459 != 3) {
                return -1;
            }
            int var3 = class301.field4848.method1302(arg0 - 92);
            if (var3 < 1) {
                return -1;
            }
            if (class301.field4845 - class191.field2988 < var3) {
                var3 = class301.field4845 - class191.field2988;
            }
            class301.field4848.method1301(class191.field2988, -124, var3, class183.field2896);
            class191.field2988 += var3;
            if (class301.field4845 > class191.field2988) {
                return -1;
            } else if (class106.method803(class183.field2896, -2)) {
                class261.field4126 = new class98[class278.field4413];
                int var4 = 0;
                for (int var5 = class193.field3026; var5 <= class85.field1265; var5++) {
                    class98 var6 = class41.method358(var5, (byte) 124);
                    if (var6 != null) {
                        class261.field4126[var4++] = var6;
                    }
                }
                class301.field4848.method1306((byte) -57);
                class183.field2896 = null;
                class301.field4848 = null;
                class80.field1213 = 0;
                class92.field1459 = 0;
                class279.field4425 = class242.method1650(54);
                return 0;
            } else {
                return class7.method47(1002, true);
            }
        } catch (IOException var7) {
            return class7.method47(1003, true);
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public static final void method952(int arg0) {
        class166.field2509.method1172((byte) 109);
        if (arg0 <= 117) {
            method951((byte) 10);
        }
        class128.field1913.method1172((byte) 126);
        field1901++;
    }
}
