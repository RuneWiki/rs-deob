import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class99 extends class80 {

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
    public boolean field1938;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "[Llf;")
    public class99[] field1948;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[I")
    public static int[] field1931 = new int[1000];

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "[I")
    public static int[] field1927 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Lr;")
    public static class66 field1935 = class93.method641(43, "cross");

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lr;")
    public static class66 field1929 = class93.method641(43, ":tradereq:");

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "[I")
    public static int[] field1951 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Lti;")
    public class111 field1943;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lof;")
    public class121 field1946;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "[Ldh;")
    public static class265[] field1928;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)I")
    public int method676(int arg0) {
        if (arg0 == 9485) {
            field1934++;
            return -1;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public void method12(byte arg0) {
        field1939++;
        if (arg0 >= -22) {
            this.method12((byte) -47);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field1928 = null;
        if (arg0 != 50) {
            return;
        }
        field1935 = null;
        field1927 = null;
        field1929 = null;
        field1931 = null;
        field1951 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public static final void method678(int arg0, byte arg1) {
        class54.field948 = -1;
        class242.field4225 = false;
        class246.field4292 = -1;
        field1940++;
        class248.field4334 = 0;
        class73.field1453 = 1;
        if (arg1 < 118) {
            field1928 = null;
        }
        class96.field1860 = arg0;
        class244.field4263 = null;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)I")
    public int method679(byte arg0) {
        field1925++;
        if (arg0 > -43) {
            field1930 = -96;
        }
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public void method680(int arg0) {
        if (this.field1938) {
            this.field1943.method752(true);
            this.field1943 = null;
        } else {
            this.field1946.method822(0);
            this.field1946 = null;
        }
        field1942++;
        if (arg0 != 8) {
            field1930 = 91;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public final void method681(int arg0, int arg1, int arg2) {
        field1936++;
        int var4 = ~this.field1949 == arg1 ? arg2 : this.field1949;
        if (this.field1938) {
            this.field1943 = new class111(var4, arg2, arg0);
        } else {
            this.field1946 = new class121(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)[I")
    public final int[] method682(int arg0, int arg1, int arg2) {
        field1941++;
        if (arg2 != 29149) {
            method677((byte) -29);
        }
        return this.field1948[arg0].field1938 ? this.field1948[arg0].method10((byte) -61, arg1) : this.field1948[arg0].method37(arg1, true)[0];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[[I")
    public int[][] method37(int arg0, boolean arg1) {
        field1933++;
        if (!arg1) {
            field1950 = 55;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I")
    public int[] method10(byte arg0, int arg1) {
        field1926++;
        if (arg0 != -61) {
            this.field1949 = 9;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)[[I")
    public final int[][] method683(int arg0, int arg1, int arg2) {
        field1932++;
        if (arg0 >= -8) {
            method677((byte) -105);
        }
        if (!this.field1948[arg1].field1938) {
            return this.field1948[arg1].method37(arg2, true);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1948[arg1].method10((byte) -61, arg2);
        var4[2] = var5;
        var4[0] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IZ)V")
    public class99(int arg0, boolean arg1) {
        this.field1938 = arg1;
        this.field1948 = new class99[arg0];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Llh;II)V")
    public void method11(class249 arg0, int arg1, int arg2) {
        field1944++;
        if (arg2 != -1) {
            method677((byte) -125);
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method684(int arg0) {
        field1947++;
        if (arg0 != 0) {
            return;
        }
        for (class75 var1 = (class75) class230.field3981.method1382(arg0 ^ 0xFFFF807E); var1 != null; var1 = (class75) class230.field3981.method1386((byte) -101)) {
            int var2 = var1.field1492;
            if (class164.method1107(var2, (byte) -2)) {
                class63[] var3 = class31.field466[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1186;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1560;
                    class63 var7 = class54.method367(var6, (byte) -80);
                    if (var7 != null) {
                        class215.method1385(var7, -124);
                    }
                }
            }
        }
    }
}
