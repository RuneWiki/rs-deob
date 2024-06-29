import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class124 extends class104 {

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Z")
    public boolean field2063;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "[Lsc;")
    public class124[] field2057;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Le;")
    public static class191 field2059 = class54.method368("Abbrechen", 2047);

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Le;")
    public static class191 field2060 = class54.method368("Stufe)2", 2047);

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lhg;")
    public class256 field2053;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Lld;")
    public class56 field2064;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)I")
    public int method841(int arg0) {
        field2055++;
        return arg0 == 0 ? -1 : -12;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public static final void method842() {
        for (int var0 = 0; var0 < class179.field3068; var0++) {
            class12 var1 = class33.field573[var0];
            class63.method424(var1);
            class33.field573[var0] = null;
        }
        class179.field3068 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)[I")
    public int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            this.field2057 = null;
        }
        field2054++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)[[I")
    public final int[][] method843(byte arg0, int arg1, int arg2) {
        field2056++;
        if (arg0 > -31) {
            this.method131((byte) -122, 27);
        }
        if (this.field2057[arg2].field2063) {
            int[] var4 = this.field2057[arg2].method131((byte) 122, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2057[arg2].method137(arg1, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)[I")
    public final int[] method844(int arg0, int arg1, int arg2) {
        field2051++;
        if (arg1 < 31) {
            return null;
        } else if (this.field2057[arg0].field2063) {
            return this.field2057[arg0].method131((byte) 122, arg2);
        } else {
            return this.field2057[arg0].method137(arg2, (byte) -7)[0];
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)Lcc;")
    public static final class267 method845(int arg0, int arg1, int arg2, int arg3) {
        field2062++;
        class267 var4 = new class267();
        var4.field4723 = arg2;
        var4.field4721 = arg1;
        class73.field1259.method605((long) arg3, arg0 - 1, var4);
        class18.method139(arg1, 2);
        class33 var5 = class233.method1646(5877, arg3);
        if (var5 != null) {
            class184.method1238(var5, (byte) -56);
        }
        if (class32.field449 != null) {
            class184.method1238(class32.field449, (byte) -75);
            class32.field449 = null;
        }
        int var6 = class167.field2824;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class156.method1069(107, class188.field3306[var7])) {
                class158.method1074(0, var7);
            }
        }
        if (~class167.field2824 == arg0) {
            class258.field4575 = false;
            class71.method469(arg0 ^ 0x6C, class93.field1522, class123.field2041, class192.field3447, class224.field3986);
        } else {
            class71.method469(-106, class93.field1522, class123.field2041, class192.field3447, class224.field3986);
            int var8 = class230.field4128.method302(class107.field1774);
            for (int var9 = 0; var9 < class167.field2824; var9++) {
                int var10 = class230.field4128.method302(class106.method683(arg0 ^ 0x1F5D, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class93.field1522 = class167.field2824 * 15 + 22;
            class224.field3986 = var8 + 8;
        }
        if (var5 != null) {
            class27.method196(var5, false, arg0 + 111);
        }
        class209.method1441(arg1, 4096);
        if (class130.field2166 != -1) {
            class244.method1709(class130.field2166, arg0 ^ 0xFFFFFFFE, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILji;Z)V")
    public void method136(int arg0, class225 arg1, boolean arg2) {
        field2058++;
        if (!arg2) {
            this.field2064 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)V")
    public final void method846(int arg0, int arg1, byte arg2) {
        field2049++;
        if (arg2 != -45) {
            this.field2050 = 91;
        }
        int var4 = this.field2050 == 255 ? arg1 : this.field2050;
        if (this.field2063) {
            this.field2064 = new class56(var4, arg1, arg0);
        } else {
            this.field2053 = new class256(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method847(byte arg0) {
        field2059 = null;
        int var1 = 34 / ((-arg0 - 6) / 38);
        field2060 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[[I")
    public int[][] method137(int arg0, byte arg1) {
        if (arg1 == -7) {
            field2048++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
    public int method848(int arg0) {
        field2047++;
        if (arg0 != 0) {
            this.method137(24, (byte) -80);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public void method849(int arg0) {
        if (arg0 < 96) {
            this.method451(82);
        }
        field2061++;
        if (this.field2063) {
            this.field2064.method377(true);
            this.field2064 = null;
        } else {
            this.field2053.method1769(0);
            this.field2053 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public void method451(int arg0) {
        if (arg0 != -1) {
            this.field2063 = true;
        }
        field2052++;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IZ)V")
    public class124(int arg0, boolean arg1) {
        this.field2063 = arg1;
        this.field2057 = new class124[arg0];
    }
}
