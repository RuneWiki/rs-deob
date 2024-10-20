package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class1 implements Comparator {

    @ObfuscatedName("q.q(Lh;Lh;I)I")
    public int method9(class3 arg0, class3 arg1) {
        return arg0.field31 < arg1.field31 ? -1 : (arg0.field31 == arg1.field31 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
