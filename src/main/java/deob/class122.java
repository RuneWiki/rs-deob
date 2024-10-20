package deob;

import java.util.Comparator;

@ObfuscatedName("ew")
public class class122 implements Comparator {

    @ObfuscatedName("ew.ap")
    public final boolean field1503;

    public class122(boolean arg0) {
        this.field1503 = arg0;
    }

    @ObfuscatedName("ew.ap(Lsv;Lsv;B)I")
    public int method3128(class479 arg0, class479 arg1) {
        return this.field1503 ? arg0.field5025 - arg1.field5025 : arg1.field5025 - arg0.field5025;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3128((class479) arg0, (class479) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
