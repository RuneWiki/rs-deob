package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class12 implements Comparator {

    @ObfuscatedName("h.c(Ll;Ll;B)I")
    public int method131(class8 arg0, class8 arg1) {
        return arg0.method75().compareTo(arg1.method75());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method131((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
