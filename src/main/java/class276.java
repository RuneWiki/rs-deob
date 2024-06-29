import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class276 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lfa;")
    public static class267 field4391;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[[[B")
    public static byte[][][] field4396;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1886(int arg0) {
        if (arg0 >= 34) {
            field4391 = null;
            field4396 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method1887(byte arg0) {
        field4397++;
        class229.field3640.method1169(true);
        if (arg0 != 60) {
            field4391 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static final void method1888(int arg0) {
        field4392++;
        if (class233.field3686 == 0) {
            return;
        }
        try {
            if (++class170.field2581 > 1500) {
                if (class301.field4848 != null) {
                    class301.field4848.method1306((byte) -67);
                    class301.field4848 = null;
                }
                if (class298.field4806 >= 1) {
                    class129.field1921 = -5;
                    class233.field3686 = 0;
                    return;
                }
                class233.field3686 = 1;
                class298.field4806++;
                if (class95.field1498 == class154.field2300) {
                    class154.field2300 = class211.field3256;
                } else {
                    class154.field2300 = class95.field1498;
                }
                class170.field2581 = 0;
            }
            if (class233.field3686 == 1) {
                class86.field1279 = class123.field1863.method30(class211.field3250, class154.field2300, (byte) 3);
                class233.field3686 = 2;
            }
            if (class233.field3686 == 2) {
                if (class86.field1279.field2082 == 2) {
                    throw new IOException();
                }
                if (class86.field1279.field2082 != 1) {
                    return;
                }
                class301.field4848 = new class182((Socket) class86.field1279.field2080, class123.field1863);
                class86.field1279 = null;
                class301.field4848.method1299(0, class240.field3826.field541, class240.field3826.field560, (byte) 124);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                int var1 = class301.field4848.method1309((byte) -42);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                if (var1 != 101) {
                    class129.field1921 = var1;
                    class233.field3686 = 0;
                    class301.field4848.method1306((byte) -122);
                    class301.field4848 = null;
                    return;
                }
                class233.field3686 = 3;
            }
            if (arg0 <= -18 && class233.field3686 == 3 && class301.field4848.method1302(103) >= 2) {
                int var2 = class301.field4848.method1309((byte) -41) << 8 | class301.field4848.method1309((byte) 124);
                class48.method404(var2, (byte) 121);
                if (class49.field807 == -1) {
                    class129.field1921 = 6;
                    class233.field3686 = 0;
                    class301.field4848.method1306((byte) -73);
                    class301.field4848 = null;
                } else {
                    class233.field3686 = 0;
                    class301.field4848.method1306((byte) -114);
                    class301.field4848 = null;
                    class137.method1019(93);
                }
            }
        } catch (IOException var3) {
            if (class301.field4848 != null) {
                class301.field4848.method1306((byte) -71);
                class301.field4848 = null;
            }
            if (class298.field4806 >= 1) {
                class233.field3686 = 0;
                class129.field1921 = -4;
            } else {
                class170.field2581 = 0;
                class233.field3686 = 1;
                if (class95.field1498 == class154.field2300) {
                    class154.field2300 = class211.field3256;
                } else {
                    class154.field2300 = class95.field1498;
                }
                class298.field4806++;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lcc;IBI)V")
    public static final void method1889(class222 arg0, int arg1, byte arg2, int arg3) {
        field4393++;
        if (class14.field174 < 2 && class173.field2658 == 0 && !class162.field2438 || arg2 > -43) {
            return;
        }
        String var4 = class178.method1264((byte) 40);
        if (arg0 == null) {
            int var6 = class73.field1118.method1786(var4, arg3 + 4, arg1 + 15, 16777215, 0, class230.field3644, class272.field4352);
            class18.method137(arg1, -127, 15, var6 + class73.field1118.method1788(var4), arg3 + 4);
            return;
        }
        class267 var5 = arg0.method1516(class54.field863, 2434);
        if (var5 == null) {
            var5 = class73.field1118;
        }
        var5.method1797(var4, arg3, arg1, arg0.field3408, arg0.field3561, arg0.field3522, arg0.field3423, arg0.field3562, arg0.field3473, class230.field3644, class272.field4352, class128.field1916);
        class18.method137(class128.field1916[1], -125, class128.field1916[3], class128.field1916[2], class128.field1916[0]);
    }
}
