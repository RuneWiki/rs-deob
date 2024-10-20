package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class12 implements Comparator {

    @ObfuscatedName("c.s(Lq;Lq;B)I")
    public int method117(class8 arg0, class8 arg1) {
        return arg0.method63().compareTo(arg1.method63());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method117((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
