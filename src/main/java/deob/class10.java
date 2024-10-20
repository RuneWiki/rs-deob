package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("t")
public class class10 {

    @ObfuscatedName("t.f")
    public ExecutorService field45 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("t.b")
    public Future field42;

    @ObfuscatedName("t.l")
    public final class311 field44;

    @ObfuscatedName("t.m")
    public final class13 field41;

    public class10(class311 arg0, class13 arg1) {
        this.field44 = arg0;
        this.field41 = arg1;
        this.method101();
    }

    @ObfuscatedName("t.f(I)Z")
    public boolean method92() {
        return this.field42.isDone();
    }

    @ObfuscatedName("t.b(I)V")
    public void method93() {
        this.field45.shutdown();
        this.field45 = null;
    }

    @ObfuscatedName("t.l(I)Lkb;")
    public class311 method94() {
        try {
            return (class311) this.field42.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("t.m(I)V")
    public void method101() {
        this.field42 = this.field45.submit(new class9(this, this.field44, this.field41));
    }
}
