package deob;

@ObfuscatedName("dt")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.e(J)V")
    public static final void method7(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method825(arg0 - 1L);
            method825(1L);
        } else {
            method825(arg0);
        }
    }

    @ObfuscatedName("ak.v(J)V")
    public static final void method825(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
