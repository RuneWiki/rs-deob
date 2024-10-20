package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class13 implements Comparator {

    @ObfuscatedName("a.w(Lq;Lq;I)I")
    public int method58(class15 arg0, class15 arg1) {
        return arg0.field309 < arg1.field309 ? -1 : (arg0.field309 == arg1.field309 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method58((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
