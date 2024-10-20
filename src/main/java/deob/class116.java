package deob;

import java.util.Comparator;

@ObfuscatedName("en")
public class class116 implements Comparator {

    @ObfuscatedName("en.at")
    public final boolean field1438;

    public class116(boolean arg0) {
        this.field1438 = arg0;
    }

    @ObfuscatedName("en.at(Lrh;Lrh;B)I")
    public int method2790(class449 arg0, class449 arg1) {
        return this.field1438 ? arg0.field4702 - arg1.field4702 : arg1.field4702 - arg0.field4702;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2790((class449) arg0, (class449) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
