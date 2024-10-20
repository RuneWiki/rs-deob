package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("e")
public class class10 {

    @ObfuscatedName("e.x")
    public ExecutorService field50 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("e.m")
    public Future field46;

    @ObfuscatedName("e.k")
    public final class310 field45;

    @ObfuscatedName("e.d")
    public final class13 field47;

    public class10(class310 arg0, class13 arg1) {
        this.field45 = arg0;
        this.field47 = arg1;
        this.method87();
    }

    @ObfuscatedName("e.x(I)Z")
    public boolean method84() {
        return this.field46.isDone();
    }

    @ObfuscatedName("e.m(I)V")
    public void method83() {
        this.field50.shutdown();
        this.field50 = null;
    }

    @ObfuscatedName("e.k(I)Lkb;")
    public class310 method86() {
        try {
            return (class310) this.field46.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("e.d(I)V")
    public void method87() {
        this.field46 = this.field50.submit(new class9(this, this.field45, this.field47));
    }
}
