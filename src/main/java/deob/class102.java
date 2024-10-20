package deob;

import java.util.Comparator;

@ObfuscatedName("ct")
public class class102 implements Comparator {

    @ObfuscatedName("ct.n")
    public final boolean field1310;

    public class102(boolean arg0) {
        this.field1310 = arg0;
    }

    @ObfuscatedName("ct.n(Lmm;Lmm;I)I")
    public int method2252(class341 arg0, class341 arg1) {
        return this.field1310 ? arg0.field3963 - arg1.field3963 : arg1.field3963 - arg0.field3963;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2252((class341) arg0, (class341) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
