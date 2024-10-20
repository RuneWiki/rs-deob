package deob;

@ObfuscatedName("df")
public class class129 {

    @ObfuscatedName("df.s")
    public static boolean field1733 = false;

    @ObfuscatedName("df.j")
    public static int field1721 = 0;

    @ObfuscatedName("df.i")
    public static int field1720 = 0;

    @ObfuscatedName("df.k")
    public static boolean field1723 = false;

    @ObfuscatedName("df.y")
    public static int field1729 = 0;

    @ObfuscatedName("df.p")
    public static long[] field1722 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.s(J)Z")
    public static boolean method624(long arg0) {
        return method623(arg0) == 2;
    }

    @ObfuscatedName("il.j(J)Z")
    public static boolean method4020(long arg0) {
        return arg0 != 0L && !method163(arg0);
    }

    @ObfuscatedName("ej.k(II)I")
    public static int method3045(int arg0) {
        long var1 = field1722[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ax.u(J)I")
    public static int method623(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("e.n(J)Z")
    public static boolean method163(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("ey.t(J)I")
    public static int method3026(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("am.q(IIIZII)J")
    public static long method349(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("iu.x(III)V")
    public static final void method4316(int arg0, int arg1) {
        field1721 = arg0;
        field1720 = arg1;
        field1733 = true;
        field1729 = 0;
        field1723 = false;
    }

    @ObfuscatedName("aa.d(J)V")
    public static final void method629(long arg0) {
        field1722[++field1729 - 1] = arg0;
    }

    @ObfuscatedName("gx.f(B)Z")
    public static final boolean method3349() {
        return field1733;
    }

    @ObfuscatedName("bf.c(B)I")
    public static final int method1057() {
        return field1721;
    }
}
