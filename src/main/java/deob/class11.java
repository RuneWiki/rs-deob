package deob;

import java.util.Comparator;

@ObfuscatedName("d")
public final class class11 implements Comparator {

    @ObfuscatedName("d.m(Ll;Ll;I)I")
    public int method107(class8 arg0, class8 arg1) {
        return arg0.field41.field51 < arg1.field41.field51 ? -1 : (arg0.field41.field51 == arg1.field41.field51 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method107((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
