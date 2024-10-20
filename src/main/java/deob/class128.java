package deob;

@ObfuscatedName("di")
public class class128 {

    @ObfuscatedName("di.a")
    public static boolean field1746 = false;

    @ObfuscatedName("di.s")
    public static int field1731 = 0;

    @ObfuscatedName("di.g")
    public static int field1733 = 0;

    @ObfuscatedName("di.x")
    public static boolean field1734 = false;

    @ObfuscatedName("di.t")
    public static int field1738 = 0;

    @ObfuscatedName("di.l")
    public static long[] field1741 = new long[1000];

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.a(J)Z")
    public static boolean method2068(long arg0) {
        return method3094(arg0) == 2;
    }

    @ObfuscatedName("bk.s(IB)J")
    public static long method1054(int arg0) {
        return field1741[arg0];
    }

    @ObfuscatedName("p.g(II)I")
    public static int method68(int arg0) {
        long var1 = field1741[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ex.h(J)I")
    public static int method3094(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("aq.f(J)Z")
    public static boolean method668(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("w.p(II)I")
    public static int method276(int arg0) {
        return method2337(field1741[arg0]);
    }

    @ObfuscatedName("dn.m(J)I")
    public static int method2337(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("cf.q(IIIZII)J")
    public static long method2069(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ge.b(J)V")
    public static final void method3756(long arg0) {
        field1741[++field1738 - 1] = arg0;
    }

    @ObfuscatedName("j.n(B)Z")
    public static final boolean method291() {
        return field1746;
    }

    @ObfuscatedName("cc.e(I)I")
    public static final int method1935() {
        return field1731;
    }

    @ObfuscatedName("ca.r(I)I")
    public static final int method1927() {
        return field1733;
    }
}
