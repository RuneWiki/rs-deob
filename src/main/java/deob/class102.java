package deob;

import java.util.Comparator;

@ObfuscatedName("cu")
public class class102 implements Comparator {

    @ObfuscatedName("cu.c")
    public final boolean field1305;

    public class102(boolean arg0) {
        this.field1305 = arg0;
    }

    @ObfuscatedName("cu.c(Lmp;Lmp;I)I")
    public int method2374(class354 arg0, class354 arg1) {
        return this.field1305 ? arg0.field4120 - arg1.field4120 : arg1.field4120 - arg0.field4120;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2374((class354) arg0, (class354) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
