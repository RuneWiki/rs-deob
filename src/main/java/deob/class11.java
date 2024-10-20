package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class11 implements Comparator {

    @ObfuscatedName("k.u(Ly;Ly;B)I")
    public int method112(class8 arg0, class8 arg1) {
        return arg0.field47.field63 < arg1.field47.field63 ? -1 : (arg0.field47.field63 == arg1.field47.field63 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method112((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
