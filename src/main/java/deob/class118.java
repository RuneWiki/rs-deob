package deob;

@ObfuscatedName("dt")
public class class118 {

    public class118() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.b(J)V")
    public static final void method2490(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2731(arg0 - 1L);
            method2731(1L);
        } else {
            method2731(arg0);
        }
    }

    @ObfuscatedName("eu.e(J)V")
    public static final void method2731(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
