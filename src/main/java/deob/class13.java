package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class13 implements Comparator {

    @ObfuscatedName("u.s(Le;Le;I)I")
    public int method57(class15 arg0, class15 arg1) {
        return arg0.field299 < arg1.field299 ? -1 : (arg0.field299 == arg1.field299 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method57((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
