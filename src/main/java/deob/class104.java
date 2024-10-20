package deob;

import java.util.Comparator;

@ObfuscatedName("ck")
public class class104 implements Comparator {

    @ObfuscatedName("ck.s")
    public final boolean field1362;

    public class104(boolean arg0) {
        this.field1362 = arg0;
    }

    @ObfuscatedName("ck.s(Lnt;Lnt;I)I")
    public int method2397(class376 arg0, class376 arg1) {
        return this.field1362 ? arg0.field4325 - arg1.field4325 : arg1.field4325 - arg0.field4325;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2397((class376) arg0, (class376) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
