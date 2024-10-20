package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class13 implements Comparator {

    @ObfuscatedName("s.a(Ly;Ly;B)I")
    public int method42(class15 arg0, class15 arg1) {
        return arg0.field282 < arg1.field282 ? -1 : (arg0.field282 == arg1.field282 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method42((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
