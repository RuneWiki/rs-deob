package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class13 implements Comparator {

    @ObfuscatedName("w.o(Ll;Ll;I)I")
    public int method54(class15 arg0, class15 arg1) {
        return arg0.field296 < arg1.field296 ? -1 : (arg0.field296 == arg1.field296 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method54((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
