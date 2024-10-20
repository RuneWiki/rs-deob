package deob;

@ObfuscatedName("dx")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.y(J)V")
    public static final void method488(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method838(arg0 - 1L);
            method838(1L);
        } else {
            method838(arg0);
        }
    }

    @ObfuscatedName("aw.k(J)V")
    public static final void method838(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
