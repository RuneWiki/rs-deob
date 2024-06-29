import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class82 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lsd;")
    public static class166 field1659 = class135.method935("(U0a )2 non)2existant gosub script)2num: ", 0);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lsd;")
    public static class166 field1662 = class135.method935("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "[I")
    public static int[] field1663 = new int[100];

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1668 = 0;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lsd;")
    public static class166 field1669 = class135.method935("Spieler kann nicht gefunden werden: ", 0);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lsd;")
    public static class166 field1671 = class135.method935("leuchten2:", 0);

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lsd;")
    public static class166 field1673 = class135.method935(" steht bereits auf Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1675 = 1;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1674 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "J")
    public static long field1665;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lf;")
    public static class47 field1670;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[I")
    public static int[] field1664;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZ)V")
    public static final void method666(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class194.field3842 == 1) {
            class111.field2164[class86.field1716 / 100].method1055(class194.field3849 - 8, class184.field3544 + -8);
        }
        field1667++;
        if (class194.field3842 == 2) {
            class111.field2164[class86.field1716 / 100 + 4].method1055(class194.field3849 - 8, class184.field3544 + -8);
        }
        if (!arg4) {
            return;
        }
        class166.method1157(121);
        if (!class127.field2493) {
            return;
        }
        int var5 = arg3 + 512 - 5;
        int var6 = arg1 + 20;
        class92.field1805.method182(class22.method148(new class166[] { class100.field1907, class174.method1192(false, class4.field85) }, 0), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class97.field1858) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class97.field1858) {
            var9 = 16711680;
        }
        class92.field1805.method182(class22.method148(new class166[] { class54.field1017, class174.method1192(!arg4, var8), class109.field2113 }, 0), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method667(byte arg0) {
        if (arg0 <= 83) {
            field1664 = null;
        }
        field1661++;
        class156.field2989.method705(63, (byte) 9);
        for (class54 var1 = (class54) class103.field2017.method221(0); var1 != null; var1 = (class54) class103.field2017.method222(53)) {
            if (var1.field1021 == 0) {
                class8.method52(var1, true, true);
            }
        }
        if (class11.field201 != null) {
            class68.method550(class11.field201, 15);
            class11.field201 = null;
        }
        class146.field2878++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method668(int arg0) {
        field1660++;
        int var1 = class128.field2510;
        int var2 = class154.field2967;
        int var3 = class146.field2873;
        int var4 = 6116423;
        int var5 = class59.field1226;
        class17.method91(var1, var2, var3, var5, var4);
        class17.method91(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        if (arg0 != 21291) {
            return;
        }
        class17.method97(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        class125.field2464.method178(class114.field2214, var1 + 3, var2 - -14, var4, -1);
        int var6 = class41.field734;
        int var7 = class5.field110;
        for (int var8 = 0; var8 < class160.field3064; var8++) {
            int var9 = (class160.field3064 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var3 > var6 && var7 > var9 - 13 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class125.field2464.method178(class56.method466(var8, -87), var1 + 3, var9, var10, 0);
        }
        class161.method1092(class59.field1226, class154.field2967, (byte) 117, class128.field2510, class146.field2873);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static final void method669(boolean arg0) {
        class77.field1590.method71(500);
        class160.field3055.method71(500);
        if (!arg0) {
            field1662 = null;
        }
        field1666++;
        class142.field2765.method71(500);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method670(byte arg0) {
        field1662 = null;
        field1659 = null;
        if (arg0 != -41) {
            return;
        }
        field1669 = null;
        field1670 = null;
        field1663 = null;
        field1664 = null;
        field1671 = null;
        field1673 = null;
    }
}
