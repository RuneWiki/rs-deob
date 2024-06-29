import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class139 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lkb;")
    private class80 field2138 = new class80(256);

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lkb;")
    private class80 field2151 = new class80(256);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Ldk;")
    private class241 field2148;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Ldk;")
    private class241 field2137;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field2150 = 0;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
    public static int[] field2143 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Luf;")
    public static class168 field2139 = class148.method1019(-1720, "headicons_pk");

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public static int[] field2144;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[Lgk;")
    public static class265[] field2147;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[IIB)Llg;", line = 11)
    private final class11 method956(int arg0, int[] arg1, int arg2, byte arg3) {
        if (arg3 >= -37) {
            return (class11) null;
        }
        int var5 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFC);
        field2145++;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class11 var9 = (class11) this.field2151.method493(var7, 100);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class147 var10 = class147.method1014(this.field2148, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class11 var11 = var10.method1015();
            this.field2151.method490(var11, var7, true);
            if (arg1 != null) {
                arg1[0] -= var11.field123.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 60)
    public static void method957(byte arg0) {
        field2139 = null;
        field2143 = null;
        field2147 = null;
        if (arg0 != 17) {
            method957((byte) -56);
        }
        field2144 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I", line = 78)
    public static final int method958(int arg0, int arg1) {
        field2142++;
        return arg1 == 1242436072 ? arg0 >>> 8 : -116;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 94)
    public static final void method959(int arg0) {
        for (int var1 = arg0; var1 < class9.field120; var1++) {
            int var2 = class12.field136[var1];
            class54 var3 = class9.field117[var2];
            int var4 = class166.field2671.method1042((byte) -87);
            if ((var4 & 0x2) != 0) {
                var4 += class166.field2671.method1042((byte) 127) << 8;
            }
            class20.method102(var4, var3, -1, var2);
        }
        field2136++;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ldk;Ldk;)V", line = 233)
    public class139(class241 arg0, class241 arg1) {
        this.field2148 = arg0;
        this.field2137 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[I)Llg;", line = 151)
    public final class11 method960(int arg0, int arg1, int[] arg2) {
        field2140++;
        if (this.field2137.method1640(125) == 1) {
            return this.method961(arg2, arg0, 0, true);
        } else if (arg1 == this.field2137.method1633(arg1 - 107, arg0)) {
            return this.method961(arg2, 0, arg0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([IIIZ)Llg;", line = 168)
    private final class11 method961(int[] arg0, int arg1, int arg2, boolean arg3) {
        field2141++;
        int var5 = (arg2 << 4 & 0xFFFC | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class11 var9 = (class11) this.field2151.method493(var7, 123);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class108 var10 = (class108) this.field2138.method493(var7, 49);
            if (var10 == null) {
                var10 = class108.method797(this.field2137, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2138.method490(var10, var7, true);
            }
            if (!arg3) {
                return (class11) null;
            }
            class11 var11 = var10.method796(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method124((byte) 38);
                this.field2151.method490(var11, var7, arg3);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([IIB)Llg;", line = 212)
    public final class11 method962(int[] arg0, int arg1, byte arg2) {
        int var4 = 92 % ((arg2 - 43) / 52);
        field2146++;
        if (this.field2148.method1640(-78) == 1) {
            return this.method956(arg1, arg0, 0, (byte) -64);
        } else if (this.field2148.method1633(-84, arg1) == 1) {
            return this.method956(0, arg0, arg1, (byte) -45);
        } else {
            throw new RuntimeException();
        }
    }
}
