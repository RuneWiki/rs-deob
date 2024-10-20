package deob;

import java.util.Comparator;

@ObfuscatedName("e")
public final class class12 implements Comparator {

    @ObfuscatedName("e.a(Lm;Lm;B)I")
    public int method143(class8 arg0, class8 arg1) {
        return arg0.method76().compareTo(arg1.method76());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method143((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
