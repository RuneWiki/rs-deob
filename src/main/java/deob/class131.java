package deob;

@ObfuscatedName("ev")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.s(J)V")
    public static final void method182(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method155(arg0 - 1L);
            method155(1L);
        } else {
            method155(arg0);
        }
    }

    @ObfuscatedName("u.z(J)V")
    public static final void method155(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
