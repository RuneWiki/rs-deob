package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ez")
public class class127 implements Callable {

    // $FF: synthetic field
    public final class135 this$0;

    @ObfuscatedName("ez.aj")
    public final class128 field1495;

    @ObfuscatedName("ez.al")
    public final class129 field1492;

    @ObfuscatedName("ez.ac")
    public final class130 field1494;

    @ObfuscatedName("ez.ab")
    public final int field1493;

    public class127(class135 arg0, class128 arg1, class129 arg2, class130 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1495 = arg1;
        this.field1492 = arg2;
        this.field1494 = arg3;
        this.field1493 = arg4;
    }

    public Object call() {
        this.field1495.method2858();
        class128[][] var1;
        if (class129.field1535 == this.field1492) {
            var1 = this.this$0.field1576;
        } else {
            var1 = this.this$0.field1569;
        }
        var1[this.field1493][this.field1494.method2875()] = this.field1495;
        return null;
    }
}
