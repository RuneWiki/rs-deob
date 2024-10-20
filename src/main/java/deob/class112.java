package deob;

import java.util.Comparator;

@ObfuscatedName("dv")
public class class112 implements Comparator {

    @ObfuscatedName("dv.h")
    public final boolean field1457;

    public class112(boolean arg0) {
        this.field1457 = arg0;
    }

    @ObfuscatedName("dv.h(Loa;Loa;I)I")
    public int method2664(class398 arg0, class398 arg1) {
        return this.field1457 ? arg0.field4545 - arg1.field4545 : arg1.field4545 - arg0.field4545;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2664((class398) arg0, (class398) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
