package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class11 implements Comparator {

    @ObfuscatedName("n.c(Lv;Lv;I)I")
    public int method100(class8 arg0, class8 arg1) {
        return arg0.field52.field59 < arg1.field52.field59 ? -1 : (arg0.field52.field59 == arg1.field52.field59 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method100((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
