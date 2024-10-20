package deob;

@ObfuscatedName("dx")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.c(J)V")
    public static final void method2079(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2712(arg0 - 1L);
            method2712(1L);
        } else {
            method2712(arg0);
        }
    }

    @ObfuscatedName("em.h(J)V")
    public static final void method2712(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
