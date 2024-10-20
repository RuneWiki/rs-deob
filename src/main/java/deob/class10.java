package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("z")
public class class10 {

    @ObfuscatedName("z.h")
    public ExecutorService field40 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("z.v")
    public Future field44;

    @ObfuscatedName("z.x")
    public final class311 field42;

    @ObfuscatedName("z.w")
    public final class13 field39;

    public class10(class311 arg0, class13 arg1) {
        this.field42 = arg0;
        this.field39 = arg1;
        this.method79();
    }

    @ObfuscatedName("z.h(I)Z")
    public boolean method95() {
        return this.field44.isDone();
    }

    @ObfuscatedName("z.v(I)V")
    public void method80() {
        this.field40.shutdown();
        this.field40 = null;
    }

    @ObfuscatedName("z.x(B)Lkj;")
    public class311 method81() {
        try {
            return (class311) this.field44.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("z.w(I)V")
    public void method79() {
        this.field44 = this.field40.submit(new class9(this, this.field42, this.field39));
    }
}
