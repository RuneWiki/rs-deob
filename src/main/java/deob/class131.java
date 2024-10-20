package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ff")
public class class131 implements Callable {

    // $FF: synthetic field
    public final class139 this$0;

    @ObfuscatedName("ff.az")
    public final class132 field1556;

    @ObfuscatedName("ff.ah")
    public final class133 field1555;

    @ObfuscatedName("ff.af")
    public final class134 field1557;

    @ObfuscatedName("ff.at")
    public final int field1554;

    public class131(class139 arg0, class132 arg1, class133 arg2, class134 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1556 = arg1;
        this.field1555 = arg2;
        this.field1557 = arg3;
        this.field1554 = arg4;
    }

    public Object call() {
        this.field1556.method2881();
        class132[][] var1;
        if (class133.field1584 == this.field1555) {
            var1 = this.this$0.field1635;
        } else {
            var1 = this.this$0.field1634;
        }
        var1[this.field1554][this.field1557.method2921()] = this.field1556;
        return null;
    }
}
