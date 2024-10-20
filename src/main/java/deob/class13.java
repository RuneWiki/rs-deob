package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class13 implements Comparator {

    @ObfuscatedName("i.n(Lz;Lz;B)I")
    public int method149(class8 arg0, class8 arg1) {
        return arg0.field49 < arg1.field49 ? -1 : (arg0.field49 == arg1.field49 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method149((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
