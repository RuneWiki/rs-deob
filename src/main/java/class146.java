import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class146 extends class266 {

    @OriginalMember(owner = "client!he", name = "W", descriptor = "Lma;")
    private class5 field2123 = class65.field1022;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Lma;")
    public static class5 field2115 = class12.method119("<)4col>", (byte) 126);

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Lma;")
    public static class5 field2107 = class12.method119("Art", (byte) 124);

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    private int field2125;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Lje;")
    public static class158 field2112;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lni;")
    public static class202 field2122;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lbf;")
    private class209 field2109;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "Lbf;")
    private class209 field2124;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
    public static int[] field2117;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V", line = 4)
    private final void method921(byte arg0) {
        field2116++;
        this.field2109 = new class209(this.field2124.method1381((byte) 32));
        for (class276 var2 = (class276) this.field2124.method1379(true); var2 != null; var2 = (class276) this.field2124.method1380((byte) 66)) {
            class276 var3 = new class276((int) var2.field5004);
            this.field2109.method1376((long) var2.field4703, -1, var3);
        }
        if (arg0 > -45) {
            method922(-42, -14, -76);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V", line = 27)
    public static final void method922(int arg0, int arg1, int arg2) {
        field2106++;
        class130 var3 = class188.method1237(111, arg1);
        int var4 = var3.field1949;
        if (arg2 != 1) {
            return;
        }
        int var5 = var3.field1946;
        int var6 = var3.field1945;
        int var7 = class231.field3837[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class235.method1666(class149.field2149[var4] & ~var8 | arg0 << var5 & var8, var4, true);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z", line = 64)
    public final boolean method923(int arg0, int arg1) {
        field2120++;
        if (this.field2124 == null) {
            return false;
        }
        if (this.field2109 == null) {
            this.method921((byte) -55);
        }
        if (arg0 != 0) {
            this.field2113 = 51;
        }
        class276 var3 = (class276) this.field2109.method1372(false, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)I", line = 90)
    public final int method924(int arg0, int arg1) {
        field2110++;
        if (this.field2124 == null) {
            return this.field2125;
        }
        if (arg1 != 3) {
            this.method930(119, (class221) null);
        }
        class276 var3 = (class276) this.field2124.method1372(false, (long) arg0);
        return var3 == null ? this.field2125 : var3.field4703;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLii;)V", line = 113)
    private final void method925(int arg0, byte arg1, class221 arg2) {
        if (arg0 == 1) {
            this.field2121 = arg2.method1509(true);
        } else if (arg0 == 2) {
            this.field2113 = arg2.method1509(true);
        } else if (arg0 == 3) {
            this.field2123 = arg2.method1501((byte) -56);
        } else if (arg0 == 4) {
            this.field2125 = arg2.method1517((byte) -114);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1524((byte) 112);
            this.field2124 = new class209(class275.method1871(var4, 1110164296));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1517((byte) -121);
                class297 var7;
                if (arg0 == 5) {
                    var7 = new class127(arg2.method1501((byte) -56));
                } else {
                    var7 = new class276(arg2.method1517((byte) -108));
                }
                this.field2124.method1376((long) var6, -1, var7);
            }
        }
        field2111++;
        int var8 = 64 % ((arg1 + 60) / 50);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lma;I)Z", line = 170)
    public final boolean method926(class5 arg0, int arg1) {
        field2108++;
        if (this.field2124 == null) {
            return false;
        }
        if (this.field2109 == null) {
            this.method927(5898);
        }
        class80 var3 = (class80) this.field2109.method1372(false, arg0.method60(-1));
        int var4 = -119 / ((-arg1 - 42) / 61);
        while (var3 != null) {
            if (var3.field1248.method62(arg0, -23269)) {
                return true;
            }
            var3 = (class80) this.field2109.method1373(-1);
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V", line = 200)
    private final void method927(int arg0) {
        this.field2109 = new class209(this.field2124.method1381((byte) 32));
        if (arg0 != 5898) {
            this.method927(106);
        }
        for (class127 var2 = (class127) this.field2124.method1379(true); var2 != null; var2 = (class127) this.field2124.method1380((byte) 66)) {
            class80 var3 = new class80(var2.field1901, (int) var2.field5004);
            this.field2109.method1376(var2.field1901.method60(arg0 - 5899), -1, var3);
        }
        field2118++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V", line = 223)
    public static void method928(boolean arg0) {
        if (arg0) {
            return;
        }
        field2117 = null;
        field2107 = null;
        field2112 = null;
        field2122 = null;
        field2115 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Lma;", line = 238)
    public final class5 method929(int arg0, byte arg1) {
        field2105++;
        if (this.field2124 == null) {
            return this.field2123;
        }
        class127 var3 = (class127) this.field2124.method1372(false, (long) arg0);
        if (arg1 >= -16) {
            this.method925(117, (byte) 35, (class221) null);
        }
        return var3 == null ? this.field2123 : var3.field1901;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILii;)V", line = 275)
    public final void method930(int arg0, class221 arg1) {
        field2114++;
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                int var4 = -102 / ((-arg0 - 68) / 32);
                return;
            }
            this.method925(var3, (byte) -116, arg1);
        }
    }
}
