package deob;

import java.util.Comparator;

@ObfuscatedName("er")
public class class116 implements Comparator {

    @ObfuscatedName("er.am")
    public final boolean field1444;

    public class116(boolean arg0) {
        this.field1444 = arg0;
    }

    @ObfuscatedName("er.am(Lrj;Lrj;I)I")
    public int method2811(class453 arg0, class453 arg1) {
        return this.field1444 ? arg0.field4741 - arg1.field4741 : arg1.field4741 - arg0.field4741;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2811((class453) arg0, (class453) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
