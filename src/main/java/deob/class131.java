package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fd")
public class class131 implements Callable {

    // $FF: synthetic field
    public final class140 this$0;

    @ObfuscatedName("fd.at")
    public final class132 field1521;

    @ObfuscatedName("fd.ah")
    public final class133 field1524;

    @ObfuscatedName("fd.ar")
    public final class134 field1522;

    @ObfuscatedName("fd.ao")
    public final int field1520;

    public class131(class140 arg0, class132 arg1, class133 arg2, class134 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1521 = arg1;
        this.field1524 = arg2;
        this.field1522 = arg3;
        this.field1520 = arg4;
    }

    public Object call() {
        this.field1521.method2962();
        class132[][] var1;
        if (class133.field1551 == this.field1524) {
            var1 = this.this$0.field1598;
        } else {
            var1 = this.this$0.field1597;
        }
        var1[this.field1520][this.field1522.method2983()] = this.field1521;
        return null;
    }
}
