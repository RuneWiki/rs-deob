package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class11 implements Comparator {

    @ObfuscatedName("c.f(Lx;Lx;B)I")
    public int method100(class8 arg0, class8 arg1) {
        return arg0.field38.field64 < arg1.field38.field64 ? -1 : (arg0.field38.field64 == arg1.field38.field64 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method100((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
