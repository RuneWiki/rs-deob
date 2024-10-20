package deob;

import java.util.Comparator;

@ObfuscatedName("co")
public class class102 implements Comparator {

    @ObfuscatedName("co.i")
    public final boolean field1303;

    public class102(boolean arg0) {
        this.field1303 = arg0;
    }

    @ObfuscatedName("co.i(Lmt;Lmt;I)I")
    public int method2314(class342 arg0, class342 arg1) {
        return this.field1303 ? arg0.field3966 - arg1.field3966 : arg1.field3966 - arg0.field3966;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2314((class342) arg0, (class342) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
