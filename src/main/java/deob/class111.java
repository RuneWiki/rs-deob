package deob;

import java.util.Comparator;

@ObfuscatedName("dm")
public class class111 implements Comparator {

    @ObfuscatedName("dm.f")
    public final boolean field1428;

    public class111(boolean arg0) {
        this.field1428 = arg0;
    }

    @ObfuscatedName("dm.f(Loa;Loa;B)I")
    public int method2761(class405 arg0, class405 arg1) {
        return this.field1428 ? arg0.field4575 - arg1.field4575 : arg1.field4575 - arg0.field4575;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2761((class405) arg0, (class405) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
