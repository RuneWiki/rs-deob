package deob;

import java.util.Comparator;

@ObfuscatedName("es")
public class class122 implements Comparator {

    @ObfuscatedName("es.ac")
    public final boolean field1514;

    public class122(boolean arg0) {
        this.field1514 = arg0;
    }

    @ObfuscatedName("es.ac(Lsq;Lsq;B)I")
    public int method3012(class478 arg0, class478 arg1) {
        return this.field1514 ? arg0.field4997 - arg1.field4997 : arg1.field4997 - arg0.field4997;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3012((class478) arg0, (class478) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
