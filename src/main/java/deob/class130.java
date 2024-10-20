package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ep")
public class class130 implements Callable {

    // $FF: synthetic field
    public final class138 this$0;

    @ObfuscatedName("ep.aw")
    public final class131 field1528;

    @ObfuscatedName("ep.ay")
    public final class132 field1530;

    @ObfuscatedName("ep.ar")
    public final class133 field1527;

    @ObfuscatedName("ep.am")
    public final int field1526;

    public class130(class138 arg0, class131 arg1, class132 arg2, class133 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1528 = arg1;
        this.field1530 = arg2;
        this.field1527 = arg3;
        this.field1526 = arg4;
    }

    public Object call() {
        this.field1528.method2857();
        class131[][] var1;
        if (class132.field1558 == this.field1530) {
            var1 = this.this$0.field1611;
        } else {
            var1 = this.this$0.field1609;
        }
        var1[this.field1526][this.field1527.method2886()] = this.field1528;
        return null;
    }
}
