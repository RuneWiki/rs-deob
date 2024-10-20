package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class11 implements Comparator {

    @ObfuscatedName("m.a(Lo;Lo;I)I")
    public int method130(class8 arg0, class8 arg1) {
        return arg0.field45.field59 < arg1.field45.field59 ? -1 : (arg0.field45.field59 == arg1.field45.field59 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method130((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
