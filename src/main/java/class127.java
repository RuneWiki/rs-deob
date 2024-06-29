import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class301 {

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Z")
    public boolean field2215 = false;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public int field2219 = -1;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Z")
    public boolean field2210 = false;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2226 = 0;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "B")
    public static byte field2212;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "Ldk;")
    public static class237 field2224;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[I")
    public static int[] field2221;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 6)
    public static final void method905(int arg0, int arg1) {
        field2222++;
        class280.field4575.method896(arg1, (byte) -44);
        class108.field1986.method896(arg1, (byte) -95);
        if (arg0 != 21150) {
            field2212 = 17;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIII)V", line = 34)
    public static final void method906(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class87.field1522; var5++) {
            if (arg2 < (class260.field4257[var5] + class220.field3657[var5]) && arg2 + arg3 > class260.field4257[var5] && arg1 < (class83.field1438[var5] + class54.field1074[var5]) && (arg0 + arg1) > class54.field1074[var5]) {
                class213.field3524[var5] = true;
            }
        }
        field2214++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLek;)V", line = 67)
    public static final void method907(boolean arg0, class206 arg1) {
        class235.field3854 = class173.method1227(9773, arg1, class39.field860, 0);
        class263.field4320 = class173.method1227(9773, arg1, class71.field1298, 0);
        class201.field3382 = class173.method1227(9773, arg1, class36.field784, 0);
        field2218++;
        if (arg0) {
            field2225 = 90;
        }
        class308.field5035 = class173.method1227(9773, arg1, class117.field2085, 0);
        class138.field2351 = class173.method1227(9773, arg1, class90.field1604, 0);
        class133.field2280 = class173.method1227(9773, arg1, class164.field2756, 0);
        class159.field2695 = class19.method182(-7362, 0, class91.field1625, arg1);
        class352.field5622 = class19.method182(-7362, 0, class31.field719, arg1);
        class320.field5211 = class19.method182(-7362, 0, class293.field4740, arg1);
        class28.field686 = class108.method813((byte) 117, arg1, class70.field1287, 0);
        class144.field2424 = class108.method813((byte) 117, arg1, class310.field5060, 0);
        class173.field2877.method624(class144.field2424, (int[]) null);
        class14.field416.method624(class144.field2424, (int[]) null);
        class332.field5297.method624(class144.field2424, (int[]) null);
        if (class241.field4016) {
            class221.field3663 = class176.method1252((byte) -113, class244.field4050, arg1, 0);
            for (int var2 = 0; var2 < class221.field3663.length; var2++) {
                class221.field3663[var2].method1459();
            }
        }
        class288 var3 = class171.method1213(class143.field2401, arg1, 0, (byte) -108);
        var3.method2051();
        if (class241.field4016) {
            class269.field4390 = new class265(var3);
        } else {
            class269.field4390 = var3;
        }
        class288[] var4 = class285.method2025(4096, arg1, 0, class355.field5668);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method2051();
        }
        if (class241.field4016) {
            class37.field810 = new class75[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class37.field810[var6] = new class265(var4[var6]);
            }
        } else {
            class37.field810 = var4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 139)
    public static final void method908(int arg0) {
        field2211++;
        class229.field3755.method889((byte) 89);
        if (arg0 != -32622) {
            field2225 = -74;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 153)
    public static void method909(byte arg0) {
        field2224 = null;
        if (arg0 != 59) {
            field2224 = (class237) null;
        }
        field2221 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V", line = 167)
    public static final void method910(byte arg0, boolean arg1) {
        class207.field3462 = arg1;
        class248.field4072 = !class14.method137(256);
        field2208++;
        if (arg0 <= 10) {
            method905(1, 33);
        }
    }
}
