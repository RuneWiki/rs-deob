package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class1 implements Comparator {

    @ObfuscatedName("v.v(Lo;Lo;B)I")
    public int method8(class3 arg0, class3 arg1) {
        return arg0.field24 < arg1.field24 ? -1 : (arg0.field24 == arg1.field24 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
