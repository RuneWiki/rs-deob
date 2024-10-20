package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("du")
public class class125 implements Callable {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("du.f")
    public final class126 field1517;

    @ObfuscatedName("du.w")
    public final class127 field1514;

    @ObfuscatedName("du.v")
    public final class128 field1515;

    @ObfuscatedName("du.s")
    public final int field1516;

    public class125(class134 arg0, class126 arg1, class127 arg2, class128 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1517 = arg1;
        this.field1514 = arg2;
        this.field1515 = arg3;
        this.field1516 = arg4;
    }

    public Object call() {
        this.field1517.method2921();
        class126[][] var1;
        if (class127.field1549 == this.field1514) {
            var1 = this.this$0.field1603;
        } else {
            var1 = this.this$0.field1602;
        }
        var1[this.field1516][this.field1515.method2931()] = this.field1517;
        return null;
    }
}
