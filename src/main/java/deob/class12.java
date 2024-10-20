package deob;

import java.util.Comparator;

@ObfuscatedName("o")
public final class class12 implements Comparator {

    @ObfuscatedName("o.f(Lx;Lx;I)I")
    public int method108(class8 arg0, class8 arg1) {
        return arg0.method64().compareTo(arg1.method64());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method108((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
