package deob;

@ObfuscatedName("dc")
public class class129 {

    @ObfuscatedName("dc.a")
    public static boolean field1723 = false;

    @ObfuscatedName("dc.t")
    public static int field1715 = 0;

    @ObfuscatedName("dc.n")
    public static int field1716 = 0;

    @ObfuscatedName("dc.q")
    public static boolean field1726 = false;

    @ObfuscatedName("dc.k")
    public static int field1722 = 0;

    @ObfuscatedName("dc.x")
    public static long[] field1725 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.a(I)I")
    public static int method400() {
        return field1722;
    }

    @ObfuscatedName("gn.t(J)Z")
    public static boolean method3432(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("bp.n(J)Z")
    public static boolean method1944(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("c.q(IB)J")
    public static long method77(int arg0) {
        return field1725[arg0];
    }

    @ObfuscatedName("ju.v(II)I")
    public static int method4871(int arg0) {
        long var1 = field1725[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("bi.l(II)I")
    public static int method1098(int arg0) {
        return method3196(field1725[arg0]);
    }

    @ObfuscatedName("ez.c(J)I")
    public static int method3196(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("fp.o(IIIZIB)J")
    public static long method3245(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("bm.i(B)Z")
    public static final boolean method1202() {
        return field1723;
    }
}
