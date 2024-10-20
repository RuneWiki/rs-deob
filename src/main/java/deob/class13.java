package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class13 implements Comparator {

    @ObfuscatedName("g.a(Lt;Lt;I)I")
    public int method54(class15 arg0, class15 arg1) {
        return arg0.field302 < arg1.field302 ? -1 : (arg0.field302 == arg1.field302 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method54((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
