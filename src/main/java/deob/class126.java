package deob;

@ObfuscatedName("dr")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.i(J)V")
    public static final void method738(long arg0) {
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

    @ObfuscatedName("j.w(J)V")
    public static final void method188(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
