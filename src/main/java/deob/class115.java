package deob;

import java.util.Comparator;

@ObfuscatedName("dz")
public class class115 implements Comparator {

    @ObfuscatedName("dz.f")
    public final boolean field1413;

    public class115(boolean arg0) {
        this.field1413 = arg0;
    }

    @ObfuscatedName("dz.f(Llg;Llg;I)I")
    public int method2130(class325 arg0, class325 arg1) {
        return this.field1413 ? arg0.field3851 - arg1.field3851 : arg1.field3851 - arg0.field3851;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2130((class325) arg0, (class325) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
