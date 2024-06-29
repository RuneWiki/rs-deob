import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class79 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1919 = -1;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "J")
    public static volatile long field1924 = 0L;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lr;")
    public static class118 field1922 = class153.method1136(109, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lr;")
    public static class118 field1923 = class153.method1136(95, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lr;")
    public static class118 field1925 = class153.method1136(120, "Fps:");

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[I")
    public static int[] field1928 = new int[1000];

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lr;")
    private static class118 field1926 = class153.method1136(93, "Loaded sprites");

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lr;")
    public static class118 field1930 = field1926;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lff;")
    public static class42 field1917;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILr;I)V")
    public static final void method666(int arg0, class118 arg1, int arg2) {
        class1.field22.method722(arg0, (byte) -127);
        class61.field1427++;
        field1918++;
        class1.field22.method833((byte) 71, arg1.method925(0));
        class1.field22.method846(arg2, arg0 ^ 0xFFFFFFA6);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        field1923 = null;
        field1928 = null;
        field1926 = null;
        field1930 = null;
        field1922 = null;
        if (arg0 == 54) {
            field1925 = null;
            field1917 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZBLgf;)V")
    public static final void method668(boolean arg0, byte arg1, class48 arg2) {
        if (class89.field2151 != null) {
            try {
                class89.field2151.method408((byte) 121);
            } catch (Exception var8) {
            }
            class89.field2151 = null;
        }
        field1927++;
        class89.field2151 = arg2;
        class37.method307((byte) -54, arg0);
        if (arg1 < 44) {
            field1924 = 73L;
        }
        class151.field3380 = 0;
        class33.field826.field2404 = 0;
        class151.field3374 = null;
        class53.field1265 = null;
        while (true) {
            class31 var3 = (class31) class72.field1675.method296(0);
            if (var3 == null) {
                while (true) {
                    class31 var4 = (class31) class32.field808.method296(0);
                    if (var4 == null) {
                        if (class74.field1825 != 0) {
                            try {
                                class105 var5 = new class105(4);
                                var5.method800(80, 4);
                                var5.method800(31, class74.field1825);
                                var5.method828(0, (byte) -54);
                                class89.field2151.method409((byte) -82, var5.field2405, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    class89.field2151.method408((byte) 105);
                                } catch (Exception var6) {
                                }
                                class89.field2151 = null;
                                class9.field205++;
                            }
                        }
                        class159.field3661 = 0;
                        class83.field1984 = class120.method945(20794);
                        return;
                    }
                    class74.field1799.method1235(var4, true);
                    class25.field614.method288(var4, var4.field2295, (byte) -91);
                    class34.field847--;
                    class133.field3041++;
                }
            }
            class115.field2672.method288(var3, var3.field2295, (byte) -91);
            class56.field1316++;
            class27.field656--;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static int method669(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static final void method670(byte arg0) {
        field1929++;
        if (arg0 == -103) {
            class132.field3027.method394(12693);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)I")
    public abstract int method665(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Lkc;")
    public static final class72 method671(int arg0, int arg1) {
        field1921++;
        class72 var2 = (class72) class118.field2765.method395((byte) -61, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class72 var3 = class71.method602(arg1, 123, class13.field289, class149.field3360, false);
        if (arg0 > -73) {
            return null;
        } else {
            if (var3 != null) {
                class118.field2765.method391(var3, (long) arg1, true);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public abstract void method660(int arg0);
}
