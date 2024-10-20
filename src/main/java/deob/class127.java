package deob;

@ObfuscatedName("dx")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.z(J)V")
    public static final void method712(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method758(arg0 - 1L);
            method758(1L);
        } else {
            method758(arg0);
        }
    }

    @ObfuscatedName("ae.q(J)V")
    public static final void method758(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
