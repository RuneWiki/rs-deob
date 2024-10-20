package deob;

@ObfuscatedName("ek")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.l(J)V")
    public static final void method587(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2744(arg0 - 1L);
            method2744(1L);
        } else {
            method2744(arg0);
        }
    }

    @ObfuscatedName("df.g(J)V")
    public static final void method2744(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
