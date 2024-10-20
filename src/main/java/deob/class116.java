package deob;

import java.util.Comparator;

@ObfuscatedName("en")
public class class116 implements Comparator {

    @ObfuscatedName("en.au")
    public final boolean field1463;

    public class116(boolean arg0) {
        this.field1463 = arg0;
    }

    @ObfuscatedName("en.au(Lqb;Lqb;I)I")
    public int method2731(class437 arg0, class437 arg1) {
        return this.field1463 ? arg0.field4670 - arg1.field4670 : arg1.field4670 - arg0.field4670;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2731((class437) arg0, (class437) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
