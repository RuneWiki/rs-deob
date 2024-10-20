package deob;

import java.util.Comparator;

@ObfuscatedName("cx")
public class class104 implements Comparator {

    @ObfuscatedName("cx.v")
    public final boolean field1344;

    public class104(boolean arg0) {
        this.field1344 = arg0;
    }

    @ObfuscatedName("cx.v(Lnf;Lnf;B)I")
    public int method2445(class375 arg0, class375 arg1) {
        return this.field1344 ? arg0.field4268 - arg1.field4268 : arg1.field4268 - arg0.field4268;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2445((class375) arg0, (class375) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
