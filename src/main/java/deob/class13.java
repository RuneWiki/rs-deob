package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class13 implements Comparator {

    @ObfuscatedName("r.a(Lm;Lm;I)I")
    public int method146(class8 arg0, class8 arg1) {
        return arg0.field50 < arg1.field50 ? -1 : (arg0.field50 == arg1.field50 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method146((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
