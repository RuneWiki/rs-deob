package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class11 implements Comparator {

    @ObfuscatedName("p.c(Ll;Ll;B)I")
    public int method113(class8 arg0, class8 arg1) {
        return arg0.field45.field56 < arg1.field45.field56 ? -1 : (arg0.field45.field56 == arg1.field45.field56 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method113((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
