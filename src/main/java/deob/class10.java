package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("z")
public class class10 {

    @ObfuscatedName("z.m")
    public ExecutorService field46 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("z.o")
    public Future field45;

    @ObfuscatedName("z.q")
    public final class310 field41;

    @ObfuscatedName("z.j")
    public final class13 field42;

    public class10(class310 arg0, class13 arg1) {
        this.field41 = arg0;
        this.field42 = arg1;
        this.method84();
    }

    @ObfuscatedName("z.m(I)Z")
    public boolean method81() {
        return this.field45.isDone();
    }

    @ObfuscatedName("z.o(I)V")
    public void method82() {
        this.field46.shutdown();
        this.field46 = null;
    }

    @ObfuscatedName("z.q(I)Lkn;")
    public class310 method83() {
        try {
            return (class310) this.field45.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("z.j(I)V")
    public void method84() {
        this.field45 = this.field46.submit(new class9(this, this.field41, this.field42));
    }
}
