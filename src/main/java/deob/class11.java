package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class11 implements Comparator {

    @ObfuscatedName("f.s(Lq;Lq;I)I")
    public int method103(class8 arg0, class8 arg1) {
        return arg0.field49.field63 < arg1.field49.field63 ? -1 : (arg0.field49.field63 == arg1.field49.field63 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method103((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
