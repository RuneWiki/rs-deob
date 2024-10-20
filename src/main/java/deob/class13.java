package deob;

import java.util.Comparator;

@ObfuscatedName("x")
public final class class13 implements Comparator {

    @ObfuscatedName("x.q(Li;Li;I)I")
    public int method121(class8 arg0, class8 arg1) {
        return arg0.field43 < arg1.field43 ? -1 : (arg0.field43 == arg1.field43 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method121((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
