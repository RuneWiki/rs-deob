import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lva;")
    public static class121 field1981 = class107.method797("@red@", -10983);

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lva;")
    private static class121 field1982 = class107.method797("Loaded sprites", -10983);

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lva;")
    public static class121 field1985 = class107.method797("Cabbage", -10983);

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lva;")
    public static class121 field1980 = field1982;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lva;")
    private static class121 field1977 = class107.method797("Your ignore list is full)3 Max of 100 hit", -10983);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lva;")
    public static class121 field1989 = field1977;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lva;")
    private static class121 field1971 = class107.method797("Please contact customer support)3", -10983);

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lva;")
    public static class121 field1974 = field1971;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Li;")
    public static class48 field1992 = new class48(10);

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lva;")
    public static class121 field1996 = class107.method797("null", -10983);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lw;")
    public static class125 field1988;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lm;")
    public static class72 field1987;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Loa;")
    public class85 field1979;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Z")
    public static boolean field1993;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    public static int[] field1973;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
    public static int[] field1986;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 6)
    public static final void method599(byte arg0) {
        field1983++;
        if (class69.field1653 == 0) {
            return;
        }
        int var1 = 0;
        if (class21.field560 != 0) {
            var1 = 1;
        }
        class117 var2 = class119.field2757;
        for (int var3 = 0; var3 < 100; var3++) {
            if (class47.field1098[var3] != null) {
                int var5 = class61.field1479[var3];
                class121 var6 = class58.field1354[var3];
                byte var7 = 0;
                if (var6 != null && var6.method948(class126.field2866, 0)) {
                    var7 = 1;
                    var6 = var6.method965(63, 5);
                }
                if (var6 != null && var6.method948(class54.field1249, 0)) {
                    var7 = 2;
                    var6 = var6.method965(63, 5);
                }
                if ((var5 == 3 || var5 == 7) && (var5 == 7 || class19.field492 == 0 || class19.field492 == 1 && class114.method876(-67, var6))) {
                    byte var8 = 4;
                    int var9 = 329 - var1 * 13;
                    var1++;
                    var2.method897(class61.field1472, var8, var9, 0);
                    var2.method897(class61.field1472, var8, var9 - 1, 65535);
                    int var10 = var8 + var2.method898(class61.field1472);
                    int var11 = var10 + var2.method901(32);
                    if (var7 == 1) {
                        class28.field698[0].method502(var11, var9 - 12);
                        var11 += 14;
                    }
                    if (var7 == 2) {
                        class28.field698[1].method502(var11, var9 - 12);
                        var11 += 14;
                    }
                    var2.method897(class113.method866((byte) -71, new class121[] { var6, class96.field2154, class47.field1098[var3] }), var11, var9, 0);
                    var2.method897(class113.method866((byte) -95, new class121[] { var6, class96.field2154, class47.field1098[var3] }), var11, var9 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var5 == 5 && class19.field492 < 2) {
                    int var12 = 329 - var1 * 13;
                    var2.method897(class47.field1098[var3], 4, var12, 0);
                    var1++;
                    var2.method897(class47.field1098[var3], 4, var12 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var5 == 6 && class19.field492 < 2) {
                    int var13 = 329 - var1 * 13;
                    var1++;
                    var2.method897(class113.method866((byte) -74, new class121[] { class113.field2562, class27.field687, var6, class96.field2154, class47.field1098[var3] }), 4, var13, 0);
                    var2.method897(class113.method866((byte) -107, new class121[] { class113.field2562, class27.field687, var6, class96.field2154, class47.field1098[var3] }), 4, var13 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        int var4 = -36 / ((-arg0 - 21) / 56);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 130)
    public static final void method600(byte arg0) {
        if (arg0 != -39) {
            return;
        }
        field1976++;
        if (class95.field2120 == 2) {
            class60.method441(class19.field493 * 2, arg0 + 121, (-class9.field132 + class37.field871 << 7) + class61.field1469, (class113.field2559 - class129.field2977 << 7) + class47.field1103);
            if (class47.field1133 > -1 && class115.field2614 % 20 < 10) {
                class95.field2111[0].method71(class47.field1133 - 12, class40.field910 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 180)
    public static void method601(int arg0) {
        field1988 = null;
        field1989 = null;
        field1985 = null;
        int var1 = -58 / ((arg0 + 32) / 54);
        field1974 = null;
        field1992 = null;
        field1980 = null;
        field1981 = null;
        field1982 = null;
        field1977 = null;
        field1986 = null;
        field1973 = null;
        field1996 = null;
        field1987 = null;
        field1971 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 212)
    public static final void method602(int arg0) {
        while (true) {
            if (class66.field1578.method619(class5.field90, (byte) -88) >= 26) {
                int var1 = class66.field1578.method626(14, -64);
                if (var1 != 16383) {
                    if (class8.field110[var1] == null) {
                        class8.field110[var1] = new class50();
                    }
                    class50 var2 = class8.field110[var1];
                    class1.field7[class42.field965++] = var1;
                    var2.field722 = class115.field2614;
                    int var3 = class66.field1578.method626(5, -116);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = class66.field1578.method626(5, -120);
                    var2.field1183 = class63.method456((byte) 105, class66.field1578.method626(13, arg0 ^ 0x3411));
                    int var5 = class66.field1578.method626(1, -74);
                    if (var5 == 1) {
                        class15.field274[class92.field2087++] = var1;
                    }
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var6 = class66.field1578.method626(1, -62);
                    var2.field759 = var2.field1183.field328;
                    var2.field740 = var2.field1183.field325;
                    var2.field786 = var2.field1183.field345;
                    var2.field765 = var2.field1183.field340;
                    var2.field769 = var2.field1183.field348;
                    var2.field728 = var2.field1183.field316;
                    var2.field721 = var2.field1183.field306;
                    var2.method233(class62.field1494.field730[0] + var3, var6 == 1, false, class62.field1494.field767[0] + var4);
                    continue;
                }
            }
            field1991++;
            if (arg0 != -13354) {
                field1981 = null;
            }
            class66.field1578.method620(0);
            return;
        }
    }
}
