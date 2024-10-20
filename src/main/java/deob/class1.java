package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class1 implements Comparator {

    @ObfuscatedName("s.s(Lf;Lf;I)I")
    public int method2(class3 arg0, class3 arg1) {
        return arg0.field33 < arg1.field33 ? -1 : (arg0.field33 == arg1.field33 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
