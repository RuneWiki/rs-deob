package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("eg")
public class class129 implements Callable {

    // $FF: synthetic field
    public final class137 this$0;

    @ObfuscatedName("eg.at")
    public final class130 field1503;

    @ObfuscatedName("eg.an")
    public final class131 field1497;

    @ObfuscatedName("eg.av")
    public final class132 field1498;

    @ObfuscatedName("eg.as")
    public final int field1500;

    public class129(class137 arg0, class130 arg1, class131 arg2, class132 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1503 = arg1;
        this.field1497 = arg2;
        this.field1498 = arg3;
        this.field1500 = arg4;
    }

    public Object call() {
        this.field1503.method2836();
        class130[][] var1;
        if (class131.field1530 == this.field1497) {
            var1 = this.this$0.field1585;
        } else {
            var1 = this.this$0.field1584;
        }
        var1[this.field1500][this.field1498.method2861()] = this.field1503;
        return null;
    }
}
