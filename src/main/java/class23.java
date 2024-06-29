import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class23 {

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "Lsi;")
    private class769 field259 = new class769(256);

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "Lsi;")
    private class769 field266 = new class769(256);

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "Lgga;")
    private class513 field261;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "Lgga;")
    private class513 field258;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "[I")
    public static int[] field263 = new int[2];

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "[[[B")
    public static byte[][][] field257;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(III[I)Lud;", line = 3)
    private final class101 method212(int arg0, int arg1, int arg2, int[] arg3) {
        field267++;
        int var5 = (arg1 << 4 & 0xFFF4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        if (arg0 != 0) {
            method213(false);
        }
        class101 var9 = (class101) this.field266.method4253(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class520 var10 = class520.method3057(this.field258, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class101 var11 = var10.method3056();
            this.field266.method4252(false, var11, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field1495.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)V", line = 40)
    public static void method213(boolean arg0) {
        field263 = null;
        field257 = null;
        if (!arg0) {
            field263 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "([III)Lud;", line = 55)
    public final class101 method214(int[] arg0, int arg1, int arg2) {
        field262++;
        if (arg2 != 27312) {
            method216(false, 40, -86, 87);
        }
        if (this.field261.method3011((byte) 98) == 1) {
            return this.method215((byte) 115, arg1, arg0, 0);
        } else if (this.field261.method3007(-1, arg1) == 1) {
            return this.method215((byte) 122, 0, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BI[II)Lud;", line = 78)
    private final class101 method215(byte arg0, int arg1, int[] arg2, int arg3) {
        field265++;
        int var5 = (arg3 >>> 12 | (arg3 & 0x40000FFF) << 4) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class101 var9 = (class101) this.field266.method4253(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class543 var10 = (class543) this.field259.method4253(var7, -1);
            if (var10 == null) {
                var10 = class543.method3139(this.field261, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field259.method4252(false, var10, var7);
            }
            class101 var11 = var10.method3141(arg2);
            if (var11 == null) {
                return null;
            }
            if (arg0 <= 104) {
                this.field258 = null;
            }
            var10.method4237(-1);
            this.field266.method4252(false, var11, var7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZIII)I", line = 124)
    public static final int method216(boolean arg0, int arg1, int arg2, int arg3) {
        field264++;
        if (!arg0) {
            return -114;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lgga;Lgga;)V", line = 162)
    public class23(class513 arg0, class513 arg1) {
        this.field261 = arg1;
        this.field258 = arg0;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(II[I)Lud;", line = 173)
    public final class101 method217(int arg0, int arg1, int[] arg2) {
        field260++;
        if (arg0 != 0) {
            this.method212(-23, -88, -127, null);
        }
        if (this.field258.method3011((byte) -118) == 1) {
            return this.method212(0, 0, arg1, arg2);
        } else if (this.field258.method3007(arg0 - 1, arg1) == 1) {
            return this.method212(arg0, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }
}
