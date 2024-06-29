import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class82 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
    public static int[] field1951 = new int[5];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field1949 = 0;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lkc;")
    public static class67 field1953 = class19.method144("mapfunction", 70);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lja;")
    public static class59 field1954 = new class59(32);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lkc;")
    public static class67 field1956 = class19.method144("headicons_pk", 91);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lkc;")
    public static class67 field1957 = class19.method144("Schrifts-=tze geladen)3", 76);

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[Z")
    public static boolean[] field1960 = new boolean[5];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
    public static boolean field1959 = false;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Z")
    public static boolean field1958 = false;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lkc;")
    public static class67 field1962 = class19.method144("Verbinde mit Server)3)3)3", 89);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V", line = 5)
    public static final void method642(int arg0, int arg1, int arg2) {
        field1952++;
        class10 var3 = class4.field67[class112.field2593][arg2][arg0];
        if (var3 == null) {
            class103.field2332.method903(class112.field2593, arg2, arg0);
            return;
        }
        class85 var4 = null;
        int var5 = -99999999;
        for (class85 var6 = (class85) var3.method83(64); var6 != null; var6 = (class85) var3.method81(arg1 ^ 0x8713CD9F)) {
            class131 var11 = class55.method440(var6.field1998, 21467);
            int var12 = var11.field3058;
            if (var11.field3104 == 1) {
                var12 = (var6.field2008 + 1) * var12;
            }
            if (var12 > var5) {
                var5 = var12;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class103.field2332.method903(class112.field2593, arg2, arg0);
            return;
        }
        class85 var7 = null;
        var3.method96(32, var4);
        class85 var8 = null;
        for (class85 var9 = (class85) var3.method83(64); var9 != null; var9 = (class85) var3.method81(-107)) {
            if (var4.field1998 != var9.field1998) {
                if (var7 == null) {
                    var7 = var9;
                }
                if (var7.field1998 != var9.field1998 && var8 == null) {
                    var8 = var9;
                }
            }
        }
        int var10 = (arg0 << arg1) + arg2 + 1610612736;
        class103.field2332.method884(class112.field2593, arg2, arg0, class70.method575(arg0 * 128 + 64, arg1 ^ 0x78EC3226, arg2 * 128 + 64, class112.field2593), var4, var10, var7, var8);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 76)
    public static void method643(int arg0) {
        field1957 = null;
        field1953 = null;
        field1951 = null;
        field1962 = null;
        if (arg0 < -11) {
            field1956 = null;
            field1954 = null;
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)J", line = 102)
    public static final synchronized long method644(int arg0) {
        if (arg0 != 0) {
            return 22L;
        }
        field1961++;
        long var1 = System.currentTimeMillis();
        if (class52.field1267 > var1) {
            class63.field1483 += class52.field1267 - var1;
        }
        class52.field1267 = var1;
        return class63.field1483 + var1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILhd;)V", line = 128)
    public static final void method645(int arg0, class50 arg1) {
        field1950++;
        arg1.field1205 = false;
        if (arg1.field1233 != -1) {
            class112 var2 = class70.method576(12, arg1.field1233);
            if (var2 == null || var2.field2570 == null) {
                arg1.field1233 = -1;
            } else {
                arg1.field1187++;
                if (arg1.field1224 < var2.field2570.length && var2.field2584[arg1.field1224] < arg1.field1187) {
                    arg1.field1224++;
                    arg1.field1187 = 1;
                }
                if (arg1.field1224 >= var2.field2570.length) {
                    arg1.field1224 = 0;
                    arg1.field1187 = 0;
                }
            }
        }
        if (arg0 > -99) {
            return;
        }
        if (arg1.field1194 != -1 && class135.field3243 >= arg1.field1222) {
            if (arg1.field1193 < 0) {
                arg1.field1193 = 0;
            }
            int var3 = class119.method942(arg1.field1194, (byte) 89).field1928;
            if (var3 == -1) {
                arg1.field1194 = -1;
            } else {
                class112 var4 = class70.method576(12, var3);
                if (var4 == null || var4.field2570 == null) {
                    arg1.field1194 = -1;
                } else {
                    arg1.field1261++;
                    if (arg1.field1193 < var4.field2570.length && var4.field2584[arg1.field1193] < arg1.field1261) {
                        arg1.field1261 = 1;
                        arg1.field1193++;
                    }
                    if (arg1.field1193 >= var4.field2570.length && (arg1.field1193 < 0 || var4.field2570.length <= arg1.field1193)) {
                        arg1.field1194 = -1;
                    }
                }
            }
        }
        if (arg1.field1216 != -1 && arg1.field1207 <= 1) {
            class112 var5 = class70.method576(12, arg1.field1216);
            if (var5.field2582 == 1 && arg1.field1246 > 0 && class135.field3243 >= arg1.field1210 && arg1.field1240 < class135.field3243) {
                arg1.field1207 = 1;
                return;
            }
        }
        if (arg1.field1216 != -1 && arg1.field1207 == 0) {
            class112 var6 = class70.method576(12, arg1.field1216);
            if (var6 == null || var6.field2570 == null) {
                arg1.field1216 = -1;
            } else {
                arg1.field1250++;
                if (var6.field2570.length > arg1.field1188 && arg1.field1250 > var6.field2584[arg1.field1188]) {
                    arg1.field1250 = 1;
                    arg1.field1188++;
                }
                if (var6.field2570.length <= arg1.field1188) {
                    arg1.field1252++;
                    if (var6.field2557 <= arg1.field1252) {
                        arg1.field1216 = -1;
                    }
                    arg1.field1188 -= var6.field2553;
                    if (arg1.field1188 < 0 || arg1.field1188 >= var6.field2570.length) {
                        arg1.field1216 = -1;
                    }
                }
                arg1.field1205 = var6.field2577;
            }
        }
        if (arg1.field1207 > 0) {
            arg1.field1207--;
        }
    }
}
