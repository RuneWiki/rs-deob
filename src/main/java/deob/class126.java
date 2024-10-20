package deob;

@ObfuscatedName("dm")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.c(J)V")
    public static final void method2308(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1318(arg0 - 1L);
            method1318(1L);
        } else {
            method1318(arg0);
        }
    }

    @ObfuscatedName("bp.j(J)V")
    public static final void method1318(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
