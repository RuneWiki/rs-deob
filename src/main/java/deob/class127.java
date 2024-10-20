package deob;

@ObfuscatedName("do")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.h(J)V")
    public static final void method952(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method222(arg0 - 1L);
            method222(1L);
        } else {
            method222(arg0);
        }
    }

    @ObfuscatedName("z.m(J)V")
    public static final void method222(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
