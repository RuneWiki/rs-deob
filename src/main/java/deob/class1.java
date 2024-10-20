package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class1 implements Comparator {

    @ObfuscatedName("f.f(Le;Le;B)I")
    public int method3(class3 arg0, class3 arg1) {
        return arg0.field20 < arg1.field20 ? -1 : (arg0.field20 == arg1.field20 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
