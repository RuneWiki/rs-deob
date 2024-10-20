package deob;

import java.util.Comparator;

@ObfuscatedName("ch")
public class class104 implements Comparator {

    @ObfuscatedName("ch.c")
    public final boolean field1376;

    public class104(boolean arg0) {
        this.field1376 = arg0;
    }

    @ObfuscatedName("ch.c(Lnm;Lnm;B)I")
    public int method2434(class375 arg0, class375 arg1) {
        return this.field1376 ? arg0.field4326 - arg1.field4326 : arg1.field4326 - arg0.field4326;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2434((class375) arg0, (class375) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
