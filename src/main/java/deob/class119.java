package deob;

import java.util.Comparator;

@ObfuscatedName("ey")
public class class119 implements Comparator {

    @ObfuscatedName("ey.ak")
    public final boolean field1495;

    public class119(boolean arg0) {
        this.field1495 = arg0;
    }

    @ObfuscatedName("ey.ak(Lso;Lso;B)I")
    public int method2812(class474 arg0, class474 arg1) {
        return this.field1495 ? arg0.field4933 - arg1.field4933 : arg1.field4933 - arg0.field4933;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2812((class474) arg0, (class474) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
