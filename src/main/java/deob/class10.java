package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("l")
public class class10 {

    @ObfuscatedName("l.n")
    public ExecutorService field57 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("l.v")
    public Future field54;

    @ObfuscatedName("l.d")
    public final class311 field59;

    @ObfuscatedName("l.c")
    public final class13 field56;

    public class10(class311 arg0, class13 arg1) {
        this.field59 = arg0;
        this.field56 = arg1;
        this.method73();
    }

    @ObfuscatedName("l.n(I)Z")
    public boolean method89() {
        return this.field54.isDone();
    }

    @ObfuscatedName("l.v(I)V")
    public void method74() {
        this.field57.shutdown();
        this.field57 = null;
    }

    @ObfuscatedName("l.d(I)Lkx;")
    public class311 method75() {
        try {
            return (class311) this.field54.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("l.c(I)V")
    public void method73() {
        this.field54 = this.field57.submit(new class9(this, this.field59, this.field56));
    }
}
