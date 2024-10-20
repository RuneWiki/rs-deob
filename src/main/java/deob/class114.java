package deob;

@ObfuscatedName("df")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.z(J)V")
    public static final void method1960(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2061(arg0 - 1L);
            method2061(1L);
        } else {
            method2061(arg0);
        }
    }

    @ObfuscatedName("ct.j(J)V")
    public static final void method2061(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
