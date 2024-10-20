package deob;

import java.util.Comparator;

@ObfuscatedName("cp")
public class class104 implements Comparator {

    @ObfuscatedName("cp.o")
    public final boolean field1376;

    public class104(boolean arg0) {
        this.field1376 = arg0;
    }

    @ObfuscatedName("cp.o(Lns;Lns;I)I")
    public int method2429(class376 arg0, class376 arg1) {
        return this.field1376 ? arg0.field4336 - arg1.field4336 : arg1.field4336 - arg0.field4336;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2429((class376) arg0, (class376) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
