package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fe")
public class class131 implements Callable {

    // $FF: synthetic field
    public final class139 this$0;

    @ObfuscatedName("fe.am")
    public final class132 field1527;

    @ObfuscatedName("fe.ap")
    public final class133 field1525;

    @ObfuscatedName("fe.af")
    public final class134 field1523;

    @ObfuscatedName("fe.aj")
    public final int field1524;

    public class131(class139 arg0, class132 arg1, class133 arg2, class134 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1527 = arg1;
        this.field1525 = arg2;
        this.field1523 = arg3;
        this.field1524 = arg4;
    }

    public Object call() {
        this.field1527.method2958();
        class132[][] var1;
        if (class133.field1554 == this.field1525) {
            var1 = this.this$0.field1600;
        } else {
            var1 = this.this$0.field1599;
        }
        var1[this.field1524][this.field1523.method3000()] = this.field1527;
        return null;
    }
}
