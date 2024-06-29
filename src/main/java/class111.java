import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class111 {

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "J")
    public long field2001 = 0L;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Leb;")
    public static class230 field1985 = class68.method589(0, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Leb;")
    public static class230 field1987 = class68.method589(0, ")1");

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Leb;")
    public static class230 field2000 = class68.method589(0, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lkk;")
    public static class223 field1984;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lhj;")
    public class70 field1993;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ)V")
    public static final void method895(int arg0, int arg1, boolean arg2) {
        class225.field3887[arg0] = arg1;
        field1983++;
        class247 var3 = (class247) class138.field2464.method394((long) arg0, -21083);
        if (arg2) {
            return;
        }
        if (var3 == null) {
            class247 var4 = new class247(4611686018427387905L);
            class138.field2464.method388(-1, (long) arg0, var4);
        } else if (var3.field4383 != 4611686018427387905L) {
            var3.field4383 = class201.method1419(5) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static final void method896(boolean arg0) {
        field1991++;
        if (class37.field703 != null || class229.field3940 != null) {
            return;
        }
        int var1 = class96.field1727;
        if (class243.field4188) {
            if (var1 != 1) {
                int var2 = class34.field620;
                int var3 = class251.field4497;
                if (class30.field555 - 10 > var2 || (class30.field555 + class53.field920 + 10) < var2 || var3 < (class275.field4826 - 10) || class275.field4826 + class218.field3759 + 10 < var3) {
                    class243.field4188 = false;
                    class14.method149(class218.field3759, class30.field555, class275.field4826, -14160, class53.field920);
                }
            }
            if (var1 == 1) {
                int var4 = class30.field555;
                int var5 = class275.field4826;
                int var6 = class53.field920;
                int var7 = class225.field3886;
                int var8 = class92.field1657;
                int var9 = -1;
                for (int var10 = 0; var10 < class186.field3266; var10++) {
                    int var11 = (class186.field3266 - var10 - 1) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < (var4 + var6) && var8 > (var11 - 13) && (var11 + 3) > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class234.method1648(var9, arg0);
                }
                class243.field4188 = false;
                class14.method149(class218.field3759, class30.field555, class275.field4826, -14160, class53.field920);
            }
        } else {
            if (var1 == 1 && class186.field3266 > 0) {
                short var12 = class225.field3890[class186.field3266 - 1];
                if (var12 == 31 || var12 == 30 || var12 == 23 || var12 == 45 || var12 == 22 || var12 == 44 || var12 == 46 || var12 == 26 || var12 == 7 || var12 == 25 || var12 == 33 || var12 == 1003) {
                    int var13 = class46.field809[class186.field3266 - 1];
                    int var14 = class244.field4196[class186.field3266 - 1];
                    class245 var15 = class155.method1183(var14, 17);
                    if (class237.method1668(client.method1167(var15), 117) || class45.method384(-128, client.method1167(var15))) {
                        class232.field4026 = 0;
                        class249.field4413 = false;
                        if (class37.field703 != null) {
                            class92.method777((byte) -65, class37.field703);
                        }
                        class37.field703 = class155.method1183(var14, 17);
                        class25.field475 = class92.field1657;
                        class39.field718 = var13;
                        class61.field1176 = class225.field3886;
                        class92.method777((byte) -65, class37.field703);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class159.field2834 == 1 && class186.field3266 > 2 || class106.method881(class186.field3266 - 1, (byte) 56))) {
                var1 = 2;
            }
            if (var1 == 2 && class186.field3266 > 0 || class176.field3083 == 1) {
                class266.method1840((byte) -80);
            }
            if (var1 == 1 && class186.field3266 > 0 || class176.field3083 == 2) {
                class158.method1200(-127);
            }
        }
        if (!arg0) {
            field1987 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method897(byte arg0) {
        field1987 = null;
        field1985 = null;
        field2000 = null;
        if (arg0 == -49) {
            field1984 = null;
        }
    }
}
