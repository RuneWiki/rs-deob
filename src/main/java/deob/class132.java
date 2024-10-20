package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fh")
public class class132 implements Callable {

    // $FF: synthetic field
    public final class140 this$0;

    @ObfuscatedName("fh.ac")
    public final class133 field1535;

    @ObfuscatedName("fh.al")
    public final class134 field1533;

    @ObfuscatedName("fh.ak")
    public final class135 field1532;

    @ObfuscatedName("fh.ax")
    public final int field1537;

    public class132(class140 arg0, class133 arg1, class134 arg2, class135 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1535 = arg1;
        this.field1533 = arg2;
        this.field1532 = arg3;
        this.field1537 = arg4;
    }

    public Object call() {
        this.field1535.method2880();
        class133[][] var1;
        if (class134.field1570 == this.field1533) {
            var1 = this.this$0.field1611;
        } else {
            var1 = this.this$0.field1604;
        }
        var1[this.field1537][this.field1532.method2914()] = this.field1535;
        return null;
    }
}
