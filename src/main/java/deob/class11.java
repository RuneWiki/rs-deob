package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class11 implements Comparator {

    @ObfuscatedName("m.q(Li;Li;B)I")
    public int method106(class8 arg0, class8 arg1) {
        return arg0.field54.field61 < arg1.field54.field61 ? -1 : (arg0.field54.field61 == arg1.field54.field61 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method106((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
