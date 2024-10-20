package deob;

@ObfuscatedName("dl")
public class class128 {

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.s(J)V")
    public static final void method2294(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method188(arg0 - 1L);
            method188(1L);
        } else {
            method188(arg0);
        }
    }

    @ObfuscatedName("e.j(J)V")
    public static final void method188(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
