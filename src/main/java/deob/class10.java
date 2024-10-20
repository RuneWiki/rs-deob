package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("m")
public class class10 {

    @ObfuscatedName("m.z")
    public ExecutorService field53 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("m.k")
    public Future field49;

    @ObfuscatedName("m.s")
    public final class310 field50;

    @ObfuscatedName("m.t")
    public final class13 field51;

    public class10(class310 arg0, class13 arg1) {
        this.field50 = arg0;
        this.field51 = arg1;
        this.method86();
    }

    @ObfuscatedName("m.z(B)Z")
    public boolean method77() {
        return this.field49.isDone();
    }

    @ObfuscatedName("m.k(I)V")
    public void method78() {
        this.field53.shutdown();
        this.field53 = null;
    }

    @ObfuscatedName("m.s(I)Lkf;")
    public class310 method90() {
        try {
            return (class310) this.field49.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("m.t(B)V")
    public void method86() {
        this.field49 = this.field53.submit(new class9(this, this.field50, this.field51));
    }
}
