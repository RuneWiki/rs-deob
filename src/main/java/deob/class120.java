package deob;

import java.util.Comparator;

@ObfuscatedName("eq")
public class class120 implements Comparator {

    @ObfuscatedName("eq.aq")
    public final boolean field1492;

    public class120(boolean arg0) {
        this.field1492 = arg0;
    }

    @ObfuscatedName("eq.aq(Lsh;Lsh;I)I")
    public int method2836(class475 arg0, class475 arg1) {
        return this.field1492 ? arg0.field4956 - arg1.field4956 : arg1.field4956 - arg0.field4956;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2836((class475) arg0, (class475) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
