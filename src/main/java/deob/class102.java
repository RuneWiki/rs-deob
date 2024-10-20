package deob;

import java.util.Comparator;

@ObfuscatedName("cp")
public class class102 implements Comparator {

    @ObfuscatedName("cp.c")
    public final boolean field1341;

    public class102(boolean arg0) {
        this.field1341 = arg0;
    }

    @ObfuscatedName("cp.c(Lmd;Lmd;I)I")
    public int method2309(class359 arg0, class359 arg1) {
        return this.field1341 ? arg0.field4173 - arg1.field4173 : arg1.field4173 - arg0.field4173;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2309((class359) arg0, (class359) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
