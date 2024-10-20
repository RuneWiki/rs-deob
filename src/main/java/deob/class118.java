package deob;

@ObfuscatedName("dc")
public class class118 {

    public class118() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.p(J)V")
    public static final void method1901(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method608(arg0 - 1L);
            method608(1L);
        } else {
            method608(arg0);
        }
    }

    @ObfuscatedName("av.y(J)V")
    public static final void method608(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
