package deob;

@ObfuscatedName("dd")
public class class111 {

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.z(J)V")
    public static final void method1306(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method120(arg0 - 1L);
            method120(1L);
        } else {
            method120(arg0);
        }
    }

    @ObfuscatedName("v.n(J)V")
    public static final void method120(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
