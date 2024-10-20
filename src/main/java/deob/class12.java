package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class12 implements Comparator {

    @ObfuscatedName("h.c(Lv;Lv;I)I")
    public int method103(class8 arg0, class8 arg1) {
        return arg0.method57().compareTo(arg1.method57());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method103((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
