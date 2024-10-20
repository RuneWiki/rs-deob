package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class11 implements Comparator {

    @ObfuscatedName("c.z(Lm;Lm;I)I")
    public int method117(class8 arg0, class8 arg1) {
        return arg0.field45.field57 < arg1.field45.field57 ? -1 : (arg0.field45.field57 == arg1.field45.field57 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method117((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
