package deob;

@ObfuscatedName("df")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.d(J)V")
    public static final void method112(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1527(arg0 - 1L);
            method1527(1L);
        } else {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @ObfuscatedName("bn.g(J)V")
    public static final void method1527(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
