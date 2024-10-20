package deob;

import java.util.Comparator;

@ObfuscatedName("ev")
public class class117 implements Comparator {

    @ObfuscatedName("ev.aq")
    public final boolean field1453;

    public class117(boolean arg0) {
        this.field1453 = arg0;
    }

    @ObfuscatedName("ev.aq(Lry;Lry;S)I")
    public int method2790(class456 arg0, class456 arg1) {
        return this.field1453 ? arg0.field4771 - arg1.field4771 : arg1.field4771 - arg0.field4771;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2790((class456) arg0, (class456) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
