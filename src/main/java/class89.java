import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class89 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Ldd;")
    private static class35 field1985 = class180.method1196((byte) -95, "Checking for updates )2 ");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1988 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Ldd;")
    public static class35 field1992 = class180.method1196((byte) -91, "Neuer Benutzer");

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Ldd;")
    public static class35 field1983 = class180.method1196((byte) -17, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Ldd;")
    public static class35 field1997 = field1985;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ldd;")
    public static class35 field1989 = class180.method1196((byte) -50, "lila:");

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field1998 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method654(Component arg0, int arg1) {
        Method var2 = class41.field904;
        field1982++;
        if (arg1 != 32768) {
            method654(null, -1);
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class111.field2443);
        arg0.addFocusListener(class111.field2443);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I")
    public static final int method655(boolean arg0) {
        field1986++;
        if (!arg0) {
            return 9;
        }
        int var1 = 3;
        if (class116.field2593 < 310) {
            int var2 = class26.field571 >> 7;
            int var3 = class8.field122 >> 7;
            int var4 = class71.field1704.field1664 >> 7;
            if ((class40.field894[class175.field3585][var2][var3] & 0x4) != 0) {
                var1 = class175.field3585;
            }
            int var5 = class71.field1704.field1676 >> 7;
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            int var7;
            if (var5 > var3) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            if (var7 >= var6) {
                int var8 = 32768;
                int var9 = var6 * 65536 / var7;
                while (var3 != var5) {
                    var8 += var9;
                    if (var3 < var5) {
                        var3++;
                    } else if (var5 < var3) {
                        var3--;
                    }
                    if ((class40.field894[class175.field3585][var2][var3] & 0x4) != 0) {
                        var1 = class175.field3585;
                    }
                    if (var8 >= 65536) {
                        if (var2 < var4) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class40.field894[class175.field3585][var2][var3] & 0x4) != 0) {
                            var1 = class175.field3585;
                        }
                        var8 -= 65536;
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    var11 += var10;
                    if ((class40.field894[class175.field3585][var2][var3] & 0x4) != 0) {
                        var1 = class175.field3585;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 > var3) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((class40.field894[class175.field3585][var2][var3] & 0x4) != 0) {
                            var1 = class175.field3585;
                        }
                    }
                }
            }
        }
        if ((class40.field894[class175.field3585][class71.field1704.field1664 >> 7][class71.field1704.field1676 >> 7] & 0x4) != 0) {
            var1 = class175.field3585;
        }
        return var1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public static final void method656(boolean arg0) {
        class197.field3916 = null;
        if (!arg0) {
            field1985 = null;
        }
        class68.field1596 = null;
        field1980++;
        class107.field2377 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method657(byte arg0) {
        if (arg0 != 124) {
            method655(false);
        }
        field1992 = null;
        field1989 = null;
        field1997 = null;
        field1985 = null;
        field1983 = null;
    }
}
