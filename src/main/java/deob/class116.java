package deob;

import java.util.Comparator;

@ObfuscatedName("dt")
public class class116 implements Comparator {

    @ObfuscatedName("dt.f")
    public final boolean field1435;

    public class116(boolean arg0) {
        this.field1435 = arg0;
    }

    @ObfuscatedName("dt.f(Lly;Lly;I)I")
    public int method2250(class327 arg0, class327 arg1) {
        return this.field1435 ? arg0.field3847 - arg1.field3847 : arg1.field3847 - arg0.field3847;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2250((class327) arg0, (class327) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
