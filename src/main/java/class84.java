import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class84 {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lje;")
    public class67 field1863 = new class67();

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1860 = 127;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lrd;")
    public static class114 field1873 = method656("(Y", (byte) 123);

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[J")
    public static long[] field1874 = new long[100];

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Ldd;")
    public static class26 field1861 = new class26(100);

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field1883 = 0;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "J")
    public static long field1878 = 0L;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lrd;")
    private static class114 field1881 = method656("wishes to trade with you)3", (byte) 117);

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lrd;")
    public static class114 field1879 = field1881;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lrd;")
    private static class114 field1880 = method656("Drop", (byte) 121);

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lrd;")
    public static class114 field1882 = field1880;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lrd;")
    public static class114 field1884 = method656("Fehler bei der Verbindung zum Server)3", (byte) 124);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lje;")
    private class67 field1876;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V")
    public static final void method643(byte arg0, boolean arg1) {
        if (arg0 <= 52) {
            return;
        }
        field1862++;
        if (class65.field1413 == null) {
            return;
        }
        try {
            class60 var2 = new class60(4);
            var2.method478((byte) 125, arg1 ? 2 : 3);
            var2.method463(-2016590992, 0);
            class65.field1413.method290(false, 4, 0, var2.field1248);
        } catch (IOException var4) {
            try {
                class65.field1413.method292(25830);
            } catch (Exception var3) {
            }
            class65.field1413 = null;
            class13.field295++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lje;")
    public final class67 method644(byte arg0) {
        field1871++;
        if (arg0 != -68) {
            field1860 = -45;
        }
        class67 var2 = this.field1876;
        if (this.field1863 == var2) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var2.field1441;
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lje;B)V")
    public final void method645(class67 arg0, byte arg1) {
        field1869++;
        if (arg0.field1436 != null) {
            arg0.method540(-26669);
        }
        arg0.field1436 = this.field1863.field1436;
        arg0.field1441 = this.field1863;
        arg0.field1436.field1441 = arg0;
        int var3 = 28 % ((39 - arg1) / 47);
        arg0.field1441.field1436 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lje;")
    public final class67 method646(byte arg0) {
        field1868++;
        class67 var2 = this.field1863.field1436;
        if (this.field1863 == var2) {
            this.field1876 = null;
            return null;
        }
        this.field1876 = var2.field1436;
        if (arg0 <= 6) {
            field1882 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILje;)V")
    public final void method647(int arg0, class67 arg1) {
        if (arg1.field1436 != null) {
            arg1.method540(-26669);
        }
        field1867++;
        arg1.field1436 = this.field1863;
        arg1.field1441 = this.field1863.field1441;
        arg1.field1436.field1441 = arg1;
        arg1.field1441.field1436 = arg1;
        if (arg0 != 0) {
            this.method647(50, null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method648(int arg0) {
        field1870++;
        int var2 = -97 % ((21 - arg0) / 50);
        while (true) {
            class67 var3 = this.field1863.field1441;
            if (this.field1863 == var3) {
                return;
            }
            var3.method540(-26669);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method649(int arg0) {
        field1884 = null;
        field1874 = null;
        if (arg0 != 4) {
            method643((byte) 122, true);
        }
        field1880 = null;
        field1879 = null;
        field1881 = null;
        field1861 = null;
        field1873 = null;
        field1882 = null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Lje;")
    public final class67 method650(int arg0) {
        field1864++;
        if (arg0 >= -92) {
            this.method646((byte) 61);
        }
        class67 var2 = this.field1876;
        if (this.field1863 == var2) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var2.field1436;
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lpb;Lpb;B)V")
    public static final void method651(class100 arg0, class100 arg1, byte arg2) {
        if (arg2 >= 61) {
            class73.field1642 = arg0;
            field1859++;
            class116.field2703 = arg1;
            class114.field2648 = class73.field1642.method768(3, false);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Lje;")
    public final class67 method652(boolean arg0) {
        field1866++;
        class67 var2 = this.field1863.field1436;
        if (this.field1863 == var2) {
            return null;
        }
        if (arg0) {
            this.field1863 = null;
        }
        var2.method540(-26669);
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Lje;")
    public final class67 method653(int arg0) {
        class67 var2 = this.field1863.field1441;
        if (arg0 > -42) {
            return null;
        }
        field1872++;
        if (this.field1863 == var2) {
            return null;
        } else {
            var2.method540(-26669);
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)Lje;")
    public final class67 method654(byte arg0) {
        field1875++;
        class67 var2 = this.field1863.field1441;
        if (arg0 <= 19) {
            return null;
        } else if (this.field1863 == var2) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var2.field1441;
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class84() {
        this.field1863.field1436 = this.field1863;
        this.field1863.field1441 = this.field1863;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLje;Lje;)V")
    public final void method655(byte arg0, class67 arg1, class67 arg2) {
        field1865++;
        if (arg2.field1436 != null) {
            arg2.method540(-26669);
        }
        arg2.field1436 = arg1.field1436;
        arg2.field1441 = arg1;
        arg2.field1436.field1441 = arg2;
        arg2.field1441.field1436 = arg2;
        if (arg0 < 102) {
            method651(null, null, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;B)Lrd;")
    public static final class114 method656(String arg0, byte arg1) {
        field1877++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class114 var5 = new class114();
        var5.field2676 = new byte[var3];
        if (arg1 < 113) {
            field1874 = null;
        }
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field2676[var5.field2660++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field2676[var5.field2660++] = (byte) var6;
            }
        }
        var5.method880((byte) 119);
        return var5.method852((byte) 32);
    }
}
