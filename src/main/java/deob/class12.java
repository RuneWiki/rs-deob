package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class12 implements Comparator {

    @ObfuscatedName("k.m(Ll;Ll;B)I")
    public int method121(class8 arg0, class8 arg1) {
        return arg0.method61().compareTo(arg1.method61());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method121((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
