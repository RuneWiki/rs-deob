package deob;

import java.util.Comparator;

@ObfuscatedName("ev")
public class class113 implements Comparator {

    @ObfuscatedName("ev.aj")
    public final boolean field1410;

    public class113(boolean arg0) {
        this.field1410 = arg0;
    }

    @ObfuscatedName("ev.aj(Lpt;Lpt;I)I")
    public int method2703(class408 arg0, class408 arg1) {
        return this.field1410 ? arg0.field4534 - arg1.field4534 : arg1.field4534 - arg0.field4534;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2703((class408) arg0, (class408) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
