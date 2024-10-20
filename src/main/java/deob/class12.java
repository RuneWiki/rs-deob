package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class12 implements Comparator {

    @ObfuscatedName("p.a(Lo;Lo;I)I")
    public int method149(class8 arg0, class8 arg1) {
        return arg0.method83().compareTo(arg1.method83());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method149((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
