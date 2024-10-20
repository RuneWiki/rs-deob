package deob;

@ObfuscatedName("dd")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.b(J)V")
    public static final void method2914(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2676(arg0 - 1L);
            method2676(1L);
        } else {
            method2676(arg0);
        }
    }

    @ObfuscatedName("el.u(J)V")
    public static final void method2676(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
