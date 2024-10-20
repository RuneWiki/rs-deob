package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class1 implements Comparator {

    @ObfuscatedName("i.i(Lf;Lf;I)I")
    public int method2(class3 arg0, class3 arg1) {
        return arg0.field24 < arg1.field24 ? -1 : (arg0.field24 == arg1.field24 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
