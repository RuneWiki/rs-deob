package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class12 implements Comparator {

    @ObfuscatedName("u.q(Li;Li;B)I")
    public int method112(class8 arg0, class8 arg1) {
        return arg0.method60().compareTo(arg1.method60());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method112((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
