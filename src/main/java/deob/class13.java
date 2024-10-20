package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class13 implements Comparator {

    @ObfuscatedName("n.d(Ly;Ly;S)I")
    public int method63(class15 arg0, class15 arg1) {
        return arg0.field281 < arg1.field281 ? -1 : (arg0.field281 == arg1.field281 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method63((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
