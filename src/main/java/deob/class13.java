package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class13 implements Comparator {

    @ObfuscatedName("r.s(Lq;Lq;B)I")
    public int method128(class8 arg0, class8 arg1) {
        return arg0.field55 < arg1.field55 ? -1 : (arg0.field55 == arg1.field55 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method128((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
