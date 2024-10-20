package deob;

import java.util.Comparator;

@ObfuscatedName("ej")
public class class118 implements Comparator {

    @ObfuscatedName("ej.ac")
    public final boolean field1450;

    public class118(boolean arg0) {
        this.field1450 = arg0;
    }

    @ObfuscatedName("ej.ac(Lri;Lri;B)I")
    public int method2743(class452 arg0, class452 arg1) {
        return this.field1450 ? arg0.field4711 - arg1.field4711 : arg1.field4711 - arg0.field4711;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2743((class452) arg0, (class452) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
