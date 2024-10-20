package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class13 implements Comparator {

    @ObfuscatedName("h.a(Lo;Lo;B)I")
    public int method153(class8 arg0, class8 arg1) {
        return arg0.field42 < arg1.field42 ? -1 : (arg0.field42 == arg1.field42 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method153((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
