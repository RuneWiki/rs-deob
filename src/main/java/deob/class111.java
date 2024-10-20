package deob;

import java.util.Comparator;

@ObfuscatedName("dt")
public class class111 implements Comparator {

    @ObfuscatedName("dt.a")
    public final boolean field1402;

    public class111(boolean arg0) {
        this.field1402 = arg0;
    }

    @ObfuscatedName("dt.a(Lof;Lof;I)I")
    public int method2611(class395 arg0, class395 arg1) {
        return this.field1402 ? arg0.field4494 - arg1.field4494 : arg1.field4494 - arg0.field4494;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2611((class395) arg0, (class395) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
