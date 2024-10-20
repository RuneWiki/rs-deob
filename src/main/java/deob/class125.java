package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("eh")
public class class125 implements Callable {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("eh.af")
    public final class126 field1504;

    @ObfuscatedName("eh.an")
    public final class127 field1501;

    @ObfuscatedName("eh.aw")
    public final class128 field1506;

    @ObfuscatedName("eh.ac")
    public final int field1503;

    public class125(class134 arg0, class126 arg1, class127 arg2, class128 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1504 = arg1;
        this.field1501 = arg2;
        this.field1506 = arg3;
        this.field1503 = arg4;
    }

    public Object call() {
        this.field1504.method2931();
        class126[][] var1;
        if (class127.field1533 == this.field1501) {
            var1 = this.this$0.field1590;
        } else {
            var1 = this.this$0.field1593;
        }
        var1[this.field1503][this.field1506.method2948()] = this.field1504;
        return null;
    }
}
