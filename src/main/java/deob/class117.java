package deob;

import java.util.Comparator;

@ObfuscatedName("es")
public class class117 implements Comparator {

    @ObfuscatedName("es.az")
    public final boolean field1474;

    public class117(boolean arg0) {
        this.field1474 = arg0;
    }

    @ObfuscatedName("es.az(Lrw;Lrw;I)I")
    public int method2726(class457 arg0, class457 arg1) {
        return this.field1474 ? arg0.field4804 - arg1.field4804 : arg1.field4804 - arg0.field4804;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2726((class457) arg0, (class457) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
