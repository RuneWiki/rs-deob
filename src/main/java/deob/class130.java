package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ep")
public class class130 implements Callable {

    // $FF: synthetic field
    public final class138 this$0;

    @ObfuscatedName("ep.au")
    public final class131 field1544;

    @ObfuscatedName("ep.ae")
    public final class132 field1541;

    @ObfuscatedName("ep.ao")
    public final class133 field1542;

    @ObfuscatedName("ep.at")
    public final int field1543;

    public class130(class138 arg0, class131 arg1, class132 arg2, class133 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1544 = arg1;
        this.field1541 = arg2;
        this.field1542 = arg3;
        this.field1543 = arg4;
    }

    public Object call() {
        this.field1544.method2865();
        class131[][] var1;
        if (class132.field1582 == this.field1541) {
            var1 = this.this$0.field1622;
        } else {
            var1 = this.this$0.field1628;
        }
        var1[this.field1543][this.field1542.method2904()] = this.field1544;
        return null;
    }
}
