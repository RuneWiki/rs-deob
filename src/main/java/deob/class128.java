package deob;

@ObfuscatedName("dn")
public class class128 {

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.t(J)V")
    public static final void method894(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method938(arg0 - 1L);
            method938(1L);
        } else {
            method938(arg0);
        }
    }

    @ObfuscatedName("at.i(J)V")
    public static final void method938(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
