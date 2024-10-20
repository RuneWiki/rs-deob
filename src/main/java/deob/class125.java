package deob;

@ObfuscatedName("dm")
public class class125 {

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.j(J)V")
    public static final void method112(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method244(arg0 - 1L);
            method244(1L);
        } else {
            method244(arg0);
        }
    }

    @ObfuscatedName("h.y(J)V")
    public static final void method244(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
