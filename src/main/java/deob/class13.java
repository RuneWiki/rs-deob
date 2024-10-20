package deob;

import java.util.Comparator;

@ObfuscatedName("o")
public final class class13 implements Comparator {

    @ObfuscatedName("o.z(Lm;Lm;B)I")
    public int method141(class8 arg0, class8 arg1) {
        return arg0.field51 < arg1.field51 ? -1 : (arg0.field51 == arg1.field51 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method141((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
