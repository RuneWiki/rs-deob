import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class400 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lwh;")
    private class546 field5308 = new class546(256);

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lwh;")
    private class546 field5315 = new class546(256);

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lga;")
    private class332 field5310;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lga;")
    private class332 field5314;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lpu;")
    public static class234 field5313;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Luv;")
    public static class3 field5311;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[[S")
    public static short[][] field5303;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([IBI)Lql;", line = 3)
    public final class161 method2287(int[] arg0, byte arg1, int arg2) {
        field5312++;
        if (arg1 <= 50) {
            this.field5314 = null;
        }
        if (this.field5310.method1933(-124) == 1) {
            return this.method2288(0, 12, arg0, arg2);
        } else if (this.field5310.method1939(0, arg2) == 1) {
            return this.method2288(arg2, -125, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[II)Lql;", line = 23)
    private final class161 method2288(int arg0, int arg1, int[] arg2, int arg3) {
        field5304++;
        int var5 = arg3 ^ ((arg0 & 0xD0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class161 var9 = (class161) this.field5315.method3057(1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            int var10 = 109 / ((arg1 + 78) / 43);
            class577 var11 = (class577) this.field5308.method3057(1, var7);
            if (var11 == null) {
                var11 = class577.method3192(this.field5310, arg0, arg3);
                if (var11 == null) {
                    return null;
                }
                this.field5308.method3061(127, var7, var11);
            }
            class161 var12 = var11.method3188(arg2);
            if (var12 == null) {
                return null;
            } else {
                var11.method242(true);
                this.field5315.method3061(123, var7, var12);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[III)Lql;", line = 70)
    private final class161 method2289(int arg0, int[] arg1, int arg2, int arg3) {
        field5307++;
        int var5 = (arg0 >>> 12 | (arg0 & 0xF0000FFF) << 4) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class161 var9 = (class161) this.field5315.method3057(arg2 - 354962667, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 != 354962668) {
            return null;
        } else if (arg1 == null || arg1[0] > 0) {
            class486 var10 = class486.method2791(this.field5314, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class161 var11 = var10.method2792();
            this.field5315.method3061(127, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field2314.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB[I)Lql;", line = 115)
    public final class161 method2290(int arg0, byte arg1, int[] arg2) {
        field5305++;
        if (this.field5314.method1933(-125) == 1) {
            return this.method2289(0, arg2, 354962668, arg0);
        }
        if (arg1 >= -55) {
            field5303 = null;
        }
        if (this.field5314.method1939(0, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method2289(arg0, arg2, 354962668, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z", line = 139)
    public static final boolean method2291(int arg0, int arg1, int arg2) {
        field5309++;
        return arg0 == 6410 ? (class583.method3216(arg1, (byte) 109, arg2) | class339.method1983(true, arg1, arg2) | class215.method1366(arg2, (byte) 57, arg1)) & class436.method2467(arg2, arg1, false) : true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILsk;)I", line = 150)
    public static final int method2292(int arg0, class452 arg1) {
        if (arg0 != -27762) {
            field5313 = null;
        }
        field5306++;
        if (class568.field7733 == arg1) {
            return 6407;
        } else if (class480.field6686 == arg1) {
            return 6408;
        } else if (class635.field8783 == arg1) {
            return 6406;
        } else if (class86.field1050 == arg1) {
            return 6409;
        } else if (class508.field7012 == arg1) {
            return 6410;
        } else if (class353.field4712 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 185)
    public static void method2293(byte arg0) {
        field5303 = null;
        field5313 = null;
        field5311 = null;
        if (arg0 <= 102) {
            field5311 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lga;Lga;)V", line = 216)
    public class400(class332 arg0, class332 arg1) {
        this.field5310 = arg1;
        this.field5314 = arg0;
    }
}
