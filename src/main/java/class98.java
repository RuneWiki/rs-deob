import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class98 extends class107 {

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lvc;")
    public static class137 field2273 = class45.method325("Nehmen", -46);

    @OriginalMember(owner = "client!p", name = "B", descriptor = "Lvc;")
    private static class137 field2278 = class45.method325("Friends", -46);

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "Lvc;")
    private static class137 field2289 = class45.method325("Please wait 1 minute and try again)3", -46);

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field2291 = 0;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lme;")
    public static class85 field2272 = null;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Lvc;")
    private static class137 field2286 = class45.method325("Please close the interface you have open before using (Wreport abuse(W", -46);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Lvc;")
    public static class137 field2284 = field2278;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "Lvc;")
    public static class137 field2290 = field2286;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Lvc;")
    public static class137 field2287 = field2289;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lvc;")
    public static class137 field2281 = class45.method325("mapedge", -46);

    @OriginalMember(owner = "client!p", name = "P", descriptor = "Lvc;")
    public static class137 field2292 = field2289;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "[Lvc;")
    public static class137[] field2270 = new class137[200];

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Lvc;")
    public static class137 field2294 = class45.method325("(U1", -46);

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Lvc;")
    private static class137 field2296 = class45.method325("Unexpected loginserver response)3", -46);

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Lvc;")
    public static class137 field2297 = field2296;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lvc;")
    public static class137 field2274 = class45.method325("Name eingeben:", -46);

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Lvc;")
    public static class137 field2298 = class45.method325("Mem:", -46);

    @OriginalMember(owner = "client!p", name = "W", descriptor = "[I")
    public static int[] field2299 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lcf;")
    public class21 field2295;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lfc;")
    public class39 field2279;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "Lfc;")
    public static class39 field2285;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "Lia;")
    public static class57 field2282;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "[B")
    public byte[] field2276;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "[[[B")
    public static byte[][][] field2300;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lvc;Lvc;Lnb;Z)Lvd;")
    public static final class138 method708(class137 arg0, class137 arg1, class88 arg2, boolean arg3) {
        if (arg3) {
            field2286 = null;
        }
        int var4 = arg2.method641(1, arg1);
        field2275++;
        int var5 = arg2.method654(28784, arg0, var4);
        return class114.method888(var5, (byte) 64, arg2, var4);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public static final void method709(byte arg0) {
        class78.field1746 = new byte[4][104][104];
        class84.field1896 = new byte[4][104][104];
        class75.field1683 = new int[4][105][105];
        class12.field272 = new int[105][105];
        class92.field2191 = 99;
        class134.field3108 = new byte[4][104][104];
        class36.field787 = new int[104];
        class114.field2694 = new int[104];
        class127.field3000 = new int[104];
        field2300 = new byte[4][104][104];
        class28.field615 = new byte[4][105][105];
        class37.field828 = new int[104];
        field2277++;
        int var1 = 65 % ((6 - arg0) / 51);
        class11.field239 = new int[104];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILla;)V")
    public static final void method710(int arg0, class75 arg1) {
        arg1.field1661 = false;
        if (arg1.field1668 != -1) {
            class143 var2 = class68.method481(0, arg1.field1668);
            if (var2 == null || var2.field3395 == null) {
                arg1.field1668 = -1;
            } else {
                arg1.field1692++;
                if (var2.field3395.length > arg1.field1637 && arg1.field1692 > var2.field3382[arg1.field1637]) {
                    arg1.field1637++;
                    arg1.field1692 = 1;
                    class43.method301(arg1.field1672, arg1.field1646, false, arg1.field1637, var2);
                }
                if (var2.field3395.length <= arg1.field1637) {
                    arg1.field1637 = 0;
                    arg1.field1692 = 0;
                    class43.method301(arg1.field1672, arg1.field1646, false, arg1.field1637, var2);
                }
            }
        }
        field2283++;
        if (arg0 != 1) {
            method711(-104);
        }
        if (arg1.field1655 != -1 && arg1.field1674 <= class112.field2667) {
            if (arg1.field1660 < 0) {
                arg1.field1660 = 0;
            }
            int var3 = class128.method957(arg1.field1655, 13).field2501;
            if (var3 == -1) {
                arg1.field1655 = -1;
            } else {
                class143 var4 = class68.method481(0, var3);
                if (var4 == null || var4.field3395 == null) {
                    arg1.field1655 = -1;
                } else {
                    arg1.field1621++;
                    if (arg1.field1660 < var4.field3395.length && arg1.field1621 > var4.field3382[arg1.field1660]) {
                        arg1.field1621 = 1;
                        arg1.field1660++;
                        class43.method301(arg1.field1672, arg1.field1646, false, arg1.field1660, var4);
                    }
                    if (var4.field3395.length <= arg1.field1660 && (arg1.field1660 < 0 || var4.field3395.length <= arg1.field1660)) {
                        arg1.field1655 = -1;
                    }
                }
            }
        }
        if (arg1.field1654 != -1 && arg1.field1669 <= 1) {
            class143 var5 = class68.method481(arg0 - 1, arg1.field1654);
            if (var5.field3380 == 1 && arg1.field1623 > 0 && arg1.field1638 <= class112.field2667 && arg1.field1656 < class112.field2667) {
                arg1.field1669 = 1;
                return;
            }
        }
        if (arg1.field1654 != -1 && arg1.field1669 == 0) {
            class143 var6 = class68.method481(0, arg1.field1654);
            if (var6 == null || var6.field3395 == null) {
                arg1.field1654 = -1;
            } else {
                arg1.field1629++;
                if (arg1.field1680 < var6.field3395.length && var6.field3382[arg1.field1680] < arg1.field1629) {
                    arg1.field1629 = 1;
                    arg1.field1680++;
                    class43.method301(arg1.field1672, arg1.field1646, false, arg1.field1680, var6);
                }
                if (var6.field3395.length <= arg1.field1680) {
                    arg1.field1641++;
                    arg1.field1680 -= var6.field3369;
                    if (var6.field3379 <= arg1.field1641) {
                        arg1.field1654 = -1;
                    } else if (arg1.field1680 >= 0 && arg1.field1680 < var6.field3395.length) {
                        class43.method301(arg1.field1672, arg1.field1646, false, arg1.field1680, var6);
                    } else {
                        arg1.field1654 = -1;
                    }
                }
                arg1.field1661 = var6.field3396;
            }
        }
        if (arg1.field1669 > 0) {
            arg1.field1669--;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static final void method711(int arg0) {
        field2271++;
        for (class37 var1 = (class37) class19.field396.method726(arg0 ^ arg0); var1 != null; var1 = (class37) class19.field396.method731((byte) -117)) {
            if (var1.field802 != null) {
                var1.method271((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public static void method712(byte arg0) {
        if (arg0 != -17) {
            return;
        }
        field2273 = null;
        field2298 = null;
        field2296 = null;
        field2286 = null;
        field2289 = null;
        field2272 = null;
        field2290 = null;
        field2274 = null;
        field2270 = null;
        field2284 = null;
        field2297 = null;
        field2281 = null;
        field2287 = null;
        field2285 = null;
        field2292 = null;
        field2282 = null;
        field2278 = null;
        field2294 = null;
        field2299 = null;
        field2300 = null;
    }
}
