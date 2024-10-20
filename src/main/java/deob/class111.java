package deob;

import java.util.Comparator;

@ObfuscatedName("ej")
public class class111 implements Comparator {

    @ObfuscatedName("ej.af")
    public final boolean field1414;

    public class111(boolean arg0) {
        this.field1414 = arg0;
    }

    @ObfuscatedName("ej.af(Lpb;Lpb;B)I")
    public int method2721(class412 arg0, class412 arg1) {
        return this.field1414 ? arg0.field4598 - arg1.field4598 : arg1.field4598 - arg0.field4598;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2721((class412) arg0, (class412) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
