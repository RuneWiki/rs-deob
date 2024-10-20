package deob;

import java.util.Comparator;

@ObfuscatedName("z")
public final class class13 implements Comparator {

    @ObfuscatedName("z.i(Lj;Lj;I)I")
    public int method46(class15 arg0, class15 arg1) {
        return arg0.field289 < arg1.field289 ? -1 : (arg0.field289 == arg1.field289 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method46((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
