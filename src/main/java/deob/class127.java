package deob;

@ObfuscatedName("db")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.a(J)V")
    public static final void method1598(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2321(arg0 - 1L);
            method2321(1L);
        } else {
            method2321(arg0);
        }
    }

    @ObfuscatedName("di.r(J)V")
    public static final void method2321(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
