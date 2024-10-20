package deob;

import java.util.Comparator;

@ObfuscatedName("e")
public final class class13 implements Comparator {

    @ObfuscatedName("e.c(Ll;Ll;I)I")
    public int method70(class15 arg0, class15 arg1) {
        return arg0.field274 < arg1.field274 ? -1 : (arg0.field274 == arg1.field274 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method70((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
