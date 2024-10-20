package deob;

@ObfuscatedName("dm")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.k(J)V")
    public static final void method1888(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2362(arg0 - 1L);
            method2362(1L);
        } else {
            method2362(arg0);
        }
    }

    @ObfuscatedName("ds.y(J)V")
    public static final void method2362(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
