import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class66 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lma;")
    public static class5 field1033 = null;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field1035 = 5063219;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lma;")
    public static class5 field1031 = class12.method119("::rebuild", (byte) 65);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lma;")
    public static class5 field1028 = class12.method119("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 127);

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1037 = 3;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[Lrj;")
    public static class237[] field1030;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class150 var5 = (class150) class274.field4660.method1475(14); var5 != null; var5 = (class150) class274.field4660.method1486(38)) {
            class286.method1927(arg4, arg1, arg2, (byte) 115, arg3, var5);
        }
        field1027++;
        for (class150 var6 = (class150) class239.field3953.method1475(14); var6 != null; var6 = (class150) class239.field3953.method1486(38)) {
            byte var7 = 1;
            if (var6.field2154.field202 == var6.field2154.field173) {
                var7 = 0;
            } else if (var6.field2154.field184 == var6.field2154.field173) {
                var7 = 2;
            }
            if (var6.field2155 != var7) {
                int var8 = class90.method590(var6.field2154, -20990);
                if (var6.field2173 != var8) {
                    if (var6.field2163 != null) {
                        class235.field3889.method277(var6.field2163);
                        var6.field2163 = null;
                    }
                    var6.field2173 = var8;
                }
                var6.field2155 = var7;
            }
            var6.field2171 = var6.field2154.field211;
            var6.field2177 = var6.field2154.field178;
            var6.field2157 = var6.field2154.field226 * 64 + var6.field2154.field178;
            var6.field2169 = var6.field2154.field211 + (var6.field2154.field226 * 64);
            class286.method1927(arg4, arg1, arg2, (byte) 117, arg3, var6);
        }
        if (arg0 != 0) {
            field1028 = (class5) null;
        }
        for (class150 var9 = (class150) class86.field1298.method1379(true); var9 != null; var9 = (class150) class86.field1298.method1380((byte) 66)) {
            byte var10 = 1;
            if (var9.field2153.field202 == var9.field2153.field173) {
                var10 = 0;
            } else if (var9.field2153.field184 == var9.field2153.field173) {
                var10 = 2;
            }
            if (var9.field2155 != var10) {
                int var11 = class170.method1131(var9.field2153, arg0 - 4);
                if (var9.field2173 != var11) {
                    if (var9.field2163 != null) {
                        class235.field3889.method277(var9.field2163);
                        var9.field2163 = null;
                    }
                    var9.field2173 = var11;
                }
                var9.field2155 = var10;
            }
            var9.field2177 = var9.field2153.field178;
            var9.field2157 = var9.field2153.field226 * 64 + var9.field2153.field178;
            var9.field2169 = var9.field2153.field211 + (var9.field2153.field226 * 64);
            var9.field2171 = var9.field2153.field211;
            class286.method1927(arg4, arg1, arg2, (byte) 107, arg3, var9);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 118)
    public static final void method470(boolean arg0) {
        field1034++;
        if (!arg0) {
            method473(122, 49, -122, 87, 27);
        }
        if (!class152.method956((byte) -63) && class276.field4709 != class276.field4701) {
            class226.method1598(class280.field4741, class137.field2031, class151.field2183.field175[0], false, class151.field2183.field186[0], -32769, class276.field4701);
        } else if (class276.field4701 != class169.field2580) {
            class169.field2580 = class276.field4701;
            class172.method1141(class276.field4701, (byte) 3);
            class181.method1182((byte) 103);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 154)
    public static void method471(int arg0) {
        field1033 = null;
        field1031 = null;
        field1028 = null;
        if (arg0 != 14869) {
            method470(true);
        }
        field1030 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIII)I", line = 181)
    public static final int method472(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1029++;
        if (arg4 != 2110642128) {
            method473(30, 61, 70, 108, 103);
        }
        int var5 = 65536 - class229.field3806[arg3 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(IIIII)I", line = 197)
    public static final int method473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1036++;
        if (arg2 != 30111) {
            method472(69, 22, -32, 103, 63);
        }
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg4;
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg0 : arg3);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }
}
