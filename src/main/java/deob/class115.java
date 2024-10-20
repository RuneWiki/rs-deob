package deob;

import java.util.Comparator;

@ObfuscatedName("dv")
public class class115 implements Comparator {

    @ObfuscatedName("dv.v")
    public final boolean field1430;

    public class115(boolean arg0) {
        this.field1430 = arg0;
    }

    @ObfuscatedName("dv.v(Llv;Llv;I)I")
    public int method2208(class326 arg0, class326 arg1) {
        return this.field1430 ? arg0.field3850 - arg1.field3850 : arg1.field3850 - arg0.field3850;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2208((class326) arg0, (class326) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
