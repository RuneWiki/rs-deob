import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 extends class141 {

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lkd;")
    private static class73 field1961 = class126.method1070((byte) -66, "Report abuse");

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field1968 = 0;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Lkd;")
    public static class73 field1963 = field1961;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Z")
    public static boolean field1971 = false;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Lkd;")
    private static class73 field1965 = class126.method1070((byte) -66, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!la", name = "M", descriptor = "Lkd;")
    public static class73 field1970 = field1965;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "[Lkd;")
    public static class73[] field1978 = new class73[100];

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lpb;")
    public static class106 field1964;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Lua;")
    public static class137 field1973;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "Z")
    public static boolean field1972;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lq;ILq;)I")
    public static final int method664(class111 arg0, int arg1, class111 arg2) {
        int var3 = 0;
        if (arg0.method897(class42.field1131, -17568, class84.field2135)) {
            var3++;
        }
        if (arg2.method897(class42.field1131, -17568, class115.field2890)) {
            var3++;
        }
        field1977++;
        if (arg2.method897(class42.field1131, -17568, class13.field408)) {
            var3++;
        }
        if (arg2.method897(class42.field1131, -17568, class83.field2100)) {
            var3++;
        }
        if (arg1 != 32659) {
            method664(null, -30, null);
        }
        if (arg2.method897(class42.field1131, -17568, class62.field1634)) {
            var3++;
        }
        if (arg2.method897(class42.field1131, -17568, class1.field31)) {
            var3++;
        }
        arg2.method897(class42.field1131, -17568, class72.field1817);
        arg2.method897(class42.field1131, -17568, class31.field874);
        arg2.method897(class42.field1131, -17568, class100.field2511);
        arg2.method897(class42.field1131, arg1 - 50227, class102.field2548);
        arg2.method897(class42.field1131, -17568, class129.field3266);
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLa;)Lkd;")
    public static final class73 method665(byte arg0, class1 arg1) {
        field1962++;
        if (class60.method503(class153.method1225(arg1, -125), (byte) 32) == 0) {
            return null;
        } else if (arg1.field113 == null || arg1.field113.method640(arg0 ^ 0xFFFFFFB5).method632((byte) -125) == 0) {
            return class141.field3515 ? class42.field1140 : null;
        } else {
            if (arg0 != 48) {
                method671(-69, 24, 47, null);
            }
            return arg1.field113;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
    public static final boolean method666(int arg0, int arg1, int arg2) {
        field1975++;
        if (arg1 != 19467) {
            return true;
        }
        class149 var3 = class122.method1045(arg1 ^ 0x4C14, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1195(arg0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method667(int arg0) {
        if (arg0 < 111) {
            method665((byte) -37, null);
        }
        while (class89.field2235.method1203(class81.field2039, 27943) >= 11) {
            int var1 = class89.field2235.method1211(11, 7);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class42.field1141[var1] == null) {
                var2 = true;
                class42.field1141[var1] = new class118();
                if (class38.field1046[var1] != null) {
                    class42.field1141[var1].method1021(126, class38.field1046[var1]);
                }
            }
            class14.field435[class63.field1661++] = var1;
            class118 var3 = class42.field1141[var1];
            var3.field2270 = class49.field1308;
            int var4 = class89.field2235.method1211(1, 7);
            if (var4 == 1) {
                class137.field3422[class110.field2712++] = var1;
            }
            int var5 = class13.field425[class89.field2235.method1211(3, 7)];
            if (var2) {
                var3.field2265 = var5;
            }
            int var6 = class89.field2235.method1211(1, 7);
            int var7 = class89.field2235.method1211(5, 7);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class89.field2235.method1211(5, 7);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method747(961, class73.field1901.field2280[0] + var7, class73.field1901.field2304[0] + var8, var6 == 1);
        }
        class89.field2235.method1210((byte) -127);
        field1969++;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1973 = null;
        field1978 = null;
        if (arg0 != 11) {
            field1971 = false;
        }
        field1961 = null;
        field1970 = null;
        field1965 = null;
        field1963 = null;
        field1964 = null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static final void method669(int arg0) {
        field1966++;
        if (field1971 && class110.field2694 != class11.field320) {
            class115.method984(class9.field303, (byte) -114, class73.field1901.field2304[0], class146.field3598, class73.field1901.field2280[0], class11.field320);
            return;
        }
        if (arg0 != 15) {
            field1973 = null;
        }
        if (class137.field3420 != class11.field320) {
            class137.field3420 = class11.field320;
            class131.method1098(class11.field320, 50);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)I")
    public static final int method670(int arg0, byte arg1, int arg2) {
        if (arg1 <= 60) {
            field1971 = false;
        }
        int var3 = arg0 >>> 31;
        field1976++;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILq;)[Lpb;")
    public static final class106[] method671(int arg0, int arg1, int arg2, class111 arg3) {
        if (arg1 != 16267) {
            method665((byte) -123, null);
        }
        field1967++;
        return class140.method1142(arg0, arg2, -121, arg3) ? class13.method113(22197) : null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class77() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
    public class77(int arg0) {
        this.field1974 = arg0;
    }
}
