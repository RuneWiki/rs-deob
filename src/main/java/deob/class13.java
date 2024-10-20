package deob;

import java.util.Comparator;

@ObfuscatedName("o")
public final class class13 implements Comparator {

    @ObfuscatedName("o.u(Ly;Ly;I)I")
    public int method139(class8 arg0, class8 arg1) {
        return arg0.field45 < arg1.field45 ? -1 : (arg0.field45 == arg1.field45 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method139((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
