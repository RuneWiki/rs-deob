package deob;

import java.util.Comparator;

@ObfuscatedName("ck")
public class class102 implements Comparator {

    @ObfuscatedName("ck.l")
    public final boolean field1316;

    public class102(boolean arg0) {
        this.field1316 = arg0;
    }

    @ObfuscatedName("ck.l(Lmi;Lmi;I)I")
    public int method2285(class342 arg0, class342 arg1) {
        return this.field1316 ? arg0.field3975 - arg1.field3975 : arg1.field3975 - arg0.field3975;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2285((class342) arg0, (class342) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
