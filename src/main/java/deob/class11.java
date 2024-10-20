package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class11 implements Comparator {

    @ObfuscatedName("t.n(Lz;Lz;I)I")
    public int method109(class8 arg0, class8 arg1) {
        return arg0.field55.field63 < arg1.field55.field63 ? -1 : (arg0.field55.field63 == arg1.field55.field63 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method109((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
