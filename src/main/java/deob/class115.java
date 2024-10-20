package deob;

import java.util.Comparator;

@ObfuscatedName("ek")
public class class115 implements Comparator {

    @ObfuscatedName("ek.at")
    public final boolean field1412;

    public class115(boolean arg0) {
        this.field1412 = arg0;
    }

    @ObfuscatedName("ek.at(Lqg;Lqg;B)I")
    public int method2697(class425 arg0, class425 arg1) {
        return this.field1412 ? arg0.field4613 - arg1.field4613 : arg1.field4613 - arg0.field4613;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2697((class425) arg0, (class425) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
