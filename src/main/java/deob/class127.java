package deob;

@ObfuscatedName("dh")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.m(J)V")
    public static final void method3199(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method617(arg0 - 1L);
            method617(1L);
        } else {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @ObfuscatedName("z.l(J)V")
    public static final void method617(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
