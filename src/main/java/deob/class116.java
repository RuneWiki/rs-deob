package deob;

import java.util.Comparator;

@ObfuscatedName("en")
public class class116 implements Comparator {

    @ObfuscatedName("en.aw")
    public final boolean field1444;

    public class116(boolean arg0) {
        this.field1444 = arg0;
    }

    @ObfuscatedName("en.aw(Lqa;Lqa;B)I")
    public int method2722(class438 arg0, class438 arg1) {
        return this.field1444 ? arg0.field4670 - arg1.field4670 : arg1.field4670 - arg0.field4670;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2722((class438) arg0, (class438) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
