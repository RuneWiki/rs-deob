import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class150 extends class331 {

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "Ljava/lang/String;")
    private String field1843 = "null";

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "Llg;")
    public static class237 field1839 = new class237(500);

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "Lsf;")
    public static class306 field1850 = new class306();

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Liq;")
    public static class362 field1851 = new class362("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "[I")
    public static int[] field1853 = new int[250];

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "C")
    public char field1834;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "C")
    public char field1836;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lva;")
    private class288 field1832;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "Lva;")
    public class288 field1842;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "[Ljava/lang/String;")
    public static String[] field1855;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
    private final void method902(int arg0) {
        field1848++;
        this.field1832 = new class288(this.field1842.method1880((byte) -122));
        for (class49 var2 = (class49) this.field1842.method1884(0); var2 != null; var2 = (class49) this.field1842.method1890(-1)) {
            class309 var3 = new class309(var2.field584, (int) var2.field5855);
            this.field1832.method1886(var3, class289.method1894(var2.field584, (byte) -114), 1);
        }
        if (arg0 != -1) {
            this.method903((byte) 100, 6);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)I")
    public final int method903(byte arg0, int arg1) {
        field1840++;
        if (this.field1842 == null) {
            return this.field1833;
        } else if (arg0 >= -36) {
            return -20;
        } else {
            class25 var3 = (class25) this.field1842.method1888((long) arg1, (byte) -30);
            return var3 == null ? this.field1833 : var3.field311;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method904(int arg0, String arg1) {
        field1844++;
        if (this.field1842 == null) {
            return false;
        }
        if (arg0 != 22686) {
            method913(true);
        }
        if (this.field1832 == null) {
            this.method902(-1);
        }
        for (class309 var3 = (class309) this.field1832.method1888(class289.method1894(arg1, (byte) -65), (byte) -30); var3 != null; var3 = (class309) this.field1832.method1883(-22097)) {
            if (var3.field4381.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ldg;BI)V")
    private final void method905(class236 arg0, byte arg1, int arg2) {
        field1838++;
        if (arg2 == 1) {
            this.field1836 = class8.method57(arg0.method1589(false), 16);
        } else if (arg2 == 2) {
            this.field1834 = class8.method57(arg0.method1589(false), 16);
        } else if (arg2 == 3) {
            this.field1843 = arg0.method1562(false);
        } else if (arg2 == 4) {
            this.field1833 = arg0.method1597(3641);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1617((byte) 48);
            this.field1842 = new class288(class328.method2123(var4, 20867));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1597(3641);
                class406 var7;
                if (arg2 == 5) {
                    var7 = new class49(arg0.method1562(false));
                } else {
                    var7 = new class25(arg0.method1597(3641));
                }
                this.field1842.method1886(var7, (long) var6, 1);
            }
        }
        if (arg1 >= -28) {
            this.method902(-98);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ldg;I)V")
    public final void method906(class236 arg0, int arg1) {
        if (arg1 != -1) {
            method913(true);
        }
        field1847++;
        while (true) {
            int var3 = arg0.method1574(-14);
            if (var3 == 0) {
                return;
            }
            this.method905(arg0, (byte) -53, var3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JB)V")
    public static final void method907(long arg0, byte arg1) {
        field1835++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 != -32) {
            method907(-106L, (byte) 61);
        }
        if ((arg0 % 10L) == 0L) {
            class274.method1816(true, arg0 - 1L);
            class274.method1816(true, 1L);
        } else {
            class274.method1816(true, arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method908(byte arg0, String[] arg1, int arg2, int arg3) {
        field1849++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg3 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg0 <= 18) {
                field1852 = -121;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)Z")
    public final boolean method909(byte arg0, int arg1) {
        field1846++;
        if (arg0 >= -44) {
            return true;
        } else if (this.field1842 == null) {
            return false;
        } else {
            if (this.field1832 == null) {
                this.method910(55);
            }
            class25 var3 = (class25) this.field1832.method1888((long) arg1, (byte) -30);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    private final void method910(int arg0) {
        this.field1832 = new class288(this.field1842.method1880((byte) -122));
        field1837++;
        int var2 = 108 % ((-arg0 - 8) / 51);
        for (class25 var3 = (class25) this.field1842.method1884(0); var3 != null; var3 = (class25) this.field1842.method1890(-1)) {
            class25 var4 = new class25((int) var3.field5855);
            this.field1832.method1886(var4, (long) var3.field311, 1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
    public static final void method911(int arg0, int arg1, int arg2) {
        field1845++;
        if (class268.field3811 != arg2) {
            class189.field2722 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class189.field2722[var3] = (var3 << 12) / arg2;
            }
            class210.field2995 = arg2 - 1;
            class135.field1683 = arg2 * 32;
            class268.field3811 = arg2;
        }
        if (arg1 > 0) {
            field1839 = null;
        }
        if (class140.field1737 == arg0) {
            return;
        }
        if (class268.field3811 == arg0) {
            class163.field2285 = class189.field2722;
        } else {
            class163.field2285 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class163.field2285[var4] = (var4 << 12) / arg0;
            }
        }
        class140.field1737 = arg0;
        class225.field3153 = arg0 - 1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method912(int arg0, byte arg1) {
        int var3 = 65 % ((arg1 + 31) / 48);
        field1841++;
        if (this.field1842 == null) {
            return this.field1843;
        } else {
            class49 var4 = (class49) this.field1842.method1888((long) arg0, (byte) -30);
            return var4 == null ? this.field1843 : var4.field584;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        field1839 = null;
        if (arg0) {
            method908((byte) 123, (String[]) null, -99, 65);
        }
        field1851 = null;
        field1853 = null;
        field1850 = null;
        field1855 = null;
    }

    static {
        new class362("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field1854 = 0;
    }
}
