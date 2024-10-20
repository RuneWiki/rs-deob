package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class13 implements Comparator {

    @ObfuscatedName("t.i(Lv;Lv;I)I")
    public int method53(class15 arg0, class15 arg1) {
        return arg0.field299 < arg1.field299 ? -1 : (arg0.field299 == arg1.field299 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method53((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
