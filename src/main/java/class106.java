import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class106 extends class181 {

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Z")
    public boolean field1907 = true;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "Lli;")
    public static class185 field1917 = class245.method1649("Clientscript error in: ", 124);

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "Lgf;")
    public static class7 field1903 = new class7(50);

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "Lli;")
    private static class185 field1921 = class245.method1649("Opened title screen", 122);

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "Lli;")
    public static class185 field1920 = field1921;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "[I")
    private int[] field1900;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "[I")
    public int[] field1906;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
    public static int[] field1919;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[Lli;")
    private class185[] field1911;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[[I")
    private int[][] field1915;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIB)I")
    public final int method742(int arg0, int arg1, byte arg2) {
        field1910++;
        int var4 = -92 % ((-arg2 - 57) / 49);
        if (this.field1900 == null || arg0 < 0 || arg0 > this.field1900.length) {
            return -1;
        } else if (this.field1915[arg0] == null || arg1 < 0 || arg1 > this.field1915[arg0].length) {
            return -1;
        } else {
            return this.field1915[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljd;B)Lli;")
    public final class185 method743(class118 arg0, byte arg1) {
        field1918++;
        if (arg1 > -62) {
            this.field1915 = null;
        }
        class185 var3 = class37.method232(80, 0);
        if (this.field1900 != null) {
            for (int var4 = 0; var4 < this.field1900.length; var4++) {
                var3.method1337(this.field1911[var4], -27866);
                var3.method1337(class130.method924(false, this.field1915[var4], arg0.method857(class150.field2834[this.field1900[var4]], (byte) -56), this.field1900[var4]), -27866);
            }
        }
        var3.method1337(this.field1911[this.field1911.length - 1], -27866);
        return var3.method1323((byte) -117);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)Lli;")
    public final class185 method744(boolean arg0) {
        field1902++;
        if (!arg0) {
            this.field1915 = null;
        }
        class185 var2 = class37.method232(80, 0);
        if (this.field1911 == null) {
            return class134.field2421;
        }
        var2.method1337(this.field1911[0], -27866);
        for (int var3 = 1; var3 < this.field1911.length; var3++) {
            var2.method1337(class158.field2999, -27866);
            var2.method1337(this.field1911[var3], -27866);
        }
        return var2.method1323((byte) -54);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static void method745(byte arg0) {
        field1921 = null;
        field1919 = null;
        field1903 = null;
        field1917 = null;
        field1920 = null;
        if (arg0 <= 42) {
            field1903 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)I")
    public final int method746(int arg0) {
        field1908++;
        if (arg0 != 14730) {
            this.field1911 = null;
        }
        return this.field1900 == null ? 0 : this.field1900.length;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjd;)V")
    public final void method747(byte arg0, class118 arg1) {
        while (true) {
            int var3 = arg1.method867(false);
            if (var3 == 0) {
                if (arg0 != -70) {
                    return;
                }
                field1916++;
                return;
            }
            this.method748(arg1, var3, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljd;IB)V")
    private final void method748(class118 arg0, int arg1, byte arg2) {
        field1905++;
        if (arg2 >= -113) {
            this.field1915 = null;
        }
        if (arg1 == 1) {
            this.field1911 = arg0.method865(9199).method1333(60, (byte) -54);
        } else if (arg1 == 2) {
            int var4 = arg0.method867(false);
            this.field1906 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1906[var5] = arg0.method827(255);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method867(false);
            this.field1915 = new int[var6][];
            this.field1900 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method827(255);
                this.field1900[var7] = var8;
                this.field1915[var7] = new int[class31.field504[var8]];
                for (int var9 = 0; var9 < class31.field504[var8]; var9++) {
                    this.field1915[var7][var9] = arg0.method827(255);
                }
            }
        } else if (arg1 == 4) {
            this.field1907 = false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public final int method749(int arg0, int arg1) {
        field1913++;
        if (arg1 == 9073) {
            return this.field1900 == null || arg0 < 0 || this.field1900.length < arg0 ? -1 : this.field1900[arg0];
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (arg0 != 23588) {
            this.method748((class118) null, 104, (byte) -21);
        }
        field1901++;
        if (this.field1906 != null) {
            for (int var2 = 0; var2 < this.field1906.length; var2++) {
                this.field1906[var2] = class21.method150(this.field1906[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static final void method751(byte arg0) {
        field1904++;
        if (class200.field3671 == 2) {
            if (class63.field1100 == class52.field861 && class65.field1131 == class48.field792) {
                class200.field3671 = 0;
                if (class227.field4137 && class139.field2615[81] && class127.field2283 > 2) {
                    class113.method784(class127.field2283 - 2, (byte) 10);
                } else {
                    class113.method784(class127.field2283 - 1, (byte) 10);
                }
            }
        } else if (class52.field861 == class161.field3041 && class6.field136 == class48.field792) {
            class200.field3671 = 0;
            if (class227.field4137 && class139.field2615[81] && class127.field2283 > 2) {
                class113.method784(class127.field2283 - 2, (byte) 10);
            } else {
                class113.method784(class127.field2283 - 1, (byte) 10);
            }
        } else {
            class200.field3671 = 2;
            class63.field1100 = class161.field3041;
            class65.field1131 = class6.field136;
        }
        if (arg0 > -54) {
            field1920 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([ILjd;I)V")
    public final void method752(int[] arg0, class118 arg1, int arg2) {
        field1909++;
        if (this.field1900 == null) {
            return;
        }
        for (int var4 = 0; this.field1900.length > var4 && arg0.length > var4; var4++) {
            int var5 = class131.field2351[this.method749(var4, 9073)];
            if (var5 > 0) {
                arg1.method850((long) arg0[var4], var5, 31786);
            }
        }
        if (arg2 >= -23) {
            this.method746(48);
        }
    }
}
