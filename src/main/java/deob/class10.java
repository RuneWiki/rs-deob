package deob;

@ObfuscatedName("fl")
public class class10 {

    @ObfuscatedName("fl.h")
    public class10 field54;

    @ObfuscatedName("fl.t")
    public class10 field55;

    @ObfuscatedName("fl.j()V")
    public void method216() {
        if (this.field54 != null) {
            this.field54.field55 = this.field55;
            this.field55.field54 = this.field54;
            this.field55 = null;
            this.field54 = null;
        }
    }
}
