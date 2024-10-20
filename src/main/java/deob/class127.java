package deob;

@ObfuscatedName("dh")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.n(J)V")
    public static final void method1160(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method636(arg0 - 1L);
            method636(1L);
        } else {
            method636(arg0);
        }
    }

    @ObfuscatedName("ab.d(J)V")
    public static final void method636(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
