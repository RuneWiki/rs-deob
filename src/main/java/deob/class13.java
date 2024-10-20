package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class13 implements Comparator {

    @ObfuscatedName("n.m(Ll;Ll;B)I")
    public int method132(class8 arg0, class8 arg1) {
        return arg0.field39 < arg1.field39 ? -1 : (arg0.field39 == arg1.field39 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method132((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
