package deob;

import java.util.Comparator;

@ObfuscatedName("ev")
public class class120 implements Comparator {

    @ObfuscatedName("ev.ab")
    public final boolean field1478;

    public class120(boolean arg0) {
        this.field1478 = arg0;
    }

    @ObfuscatedName("ev.ab(Lsc;Lsc;I)I")
    public int method2900(class476 arg0, class476 arg1) {
        return this.field1478 ? arg0.field4934 - arg1.field4934 : arg1.field4934 - arg0.field4934;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2900((class476) arg0, (class476) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
