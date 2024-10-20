package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class11 implements Comparator {

    @ObfuscatedName("n.a(Lm;Lm;I)I")
    public int method119(class8 arg0, class8 arg1) {
        return arg0.field51.field74 < arg1.field51.field74 ? -1 : (arg0.field51.field74 == arg1.field51.field74 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method119((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
