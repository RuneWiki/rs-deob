package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fi")
public class class132 implements Callable {

    // $FF: synthetic field
    public final class141 this$0;

    @ObfuscatedName("fi.aq")
    public final class133 field1555;

    @ObfuscatedName("fi.aw")
    public final class134 field1550;

    @ObfuscatedName("fi.al")
    public final class135 field1552;

    @ObfuscatedName("fi.ai")
    public final int field1553;

    public class132(class141 arg0, class133 arg1, class134 arg2, class135 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1555 = arg1;
        this.field1550 = arg2;
        this.field1552 = arg3;
        this.field1553 = arg4;
    }

    public Object call() {
        this.field1555.method2952();
        class133[][] var1;
        if (class134.field1581 == this.field1550) {
            var1 = this.this$0.field1635;
        } else {
            var1 = this.this$0.field1633;
        }
        var1[this.field1553][this.field1552.method2971()] = this.field1555;
        return null;
    }
}
