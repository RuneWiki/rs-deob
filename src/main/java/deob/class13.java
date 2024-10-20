package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class13 implements Comparator {

    @ObfuscatedName("p.n(Lt;Lt;I)I")
    public int method59(class15 arg0, class15 arg1) {
        return arg0.field276 < arg1.field276 ? -1 : (arg0.field276 == arg1.field276 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method59((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
