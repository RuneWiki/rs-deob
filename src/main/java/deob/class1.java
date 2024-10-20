package deob;

import java.util.Comparator;

@ObfuscatedName("y")
public final class class1 implements Comparator {

    @ObfuscatedName("y.y(Ln;Ln;I)I")
    public int method2(class3 arg0, class3 arg1) {
        return arg0.field18 < arg1.field18 ? -1 : (arg0.field18 == arg1.field18 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
