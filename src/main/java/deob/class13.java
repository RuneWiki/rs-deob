package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class13 implements Comparator {

    @ObfuscatedName("f.c(Lv;Lv;I)I")
    public int method122(class8 arg0, class8 arg1) {
        return arg0.field45 < arg1.field45 ? -1 : (arg0.field45 == arg1.field45 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method122((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
