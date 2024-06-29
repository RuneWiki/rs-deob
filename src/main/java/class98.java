import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class98 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lka;")
    private class157 field1988 = new class157(256);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lka;")
    private class157 field1991 = new class157(256);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lmc;")
    private class151 field1980;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lmc;")
    private class151 field1983;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lsg;")
    public static class30 field1982 = class167.method1221((byte) 33, ")4p=");

    @OriginalMember(owner = "client!da", name = "k", descriptor = "D")
    public static double field1989 = -1.0D;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1985 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[III)Lbd;")
    private final class258 method798(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4);
        if (arg2 >= -108) {
            return null;
        }
        field1990++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class258 var9 = (class258) this.field1991.method1168(-3, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class95 var10 = (class95) this.field1988.method1168(-3, var7);
            if (var10 == null) {
                var10 = class95.method773(this.field1980, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1988.method1164((byte) -61, var7, var10);
            }
            class258 var11 = var10.method777(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1681(false);
                this.field1991.method1164((byte) 93, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[II)Lbd;")
    public final class258 method799(int arg0, int[] arg1, int arg2) {
        field1992++;
        if (arg0 > -54) {
            this.field1980 = null;
        }
        if (this.field1983.method1108((byte) 19) == 1) {
            return this.method800(0, (byte) -128, arg2, arg1);
        } else if (this.field1983.method1124(arg2, 88) == 1) {
            return this.method800(arg2, (byte) -128, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI[I)Lbd;")
    private final class258 method800(int arg0, byte arg1, int arg2, int[] arg3) {
        field1986++;
        int var5 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFD);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class258 var9 = (class258) this.field1991.method1168(-3, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class237 var10 = class237.method1687(this.field1983, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class258 var11 = var10.method1686();
            if (arg1 > -126) {
                this.method802(-62, (int[]) null, 103);
            }
            this.field1991.method1164((byte) -61, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field4566.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method801(int arg0) {
        if (arg0 != 256) {
            method801(-109);
        }
        field1982 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I[II)Lbd;")
    public final class258 method802(int arg0, int[] arg1, int arg2) {
        field1987++;
        if (this.field1980.method1108((byte) 19) == 1) {
            return this.method798(0, arg1, -125, arg0);
        } else if (arg2 > -48) {
            return null;
        } else if (this.field1980.method1124(arg0, -32) == 1) {
            return this.method798(arg0, arg1, -118, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lmc;Lmc;)V")
    public class98(class151 arg0, class151 arg1) {
        this.field1980 = arg1;
        this.field1983 = arg0;
    }
}
