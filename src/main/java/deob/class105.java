package deob;

import java.util.Comparator;

@ObfuscatedName("db")
public class class105 implements Comparator {

    @ObfuscatedName("db.c")
    public final boolean field1369;

    public class105(boolean arg0) {
        this.field1369 = arg0;
    }

    @ObfuscatedName("db.c(Lnr;Lnr;B)I")
    public int method2608(class377 arg0, class377 arg1) {
        return this.field1369 ? arg0.field4367 - arg1.field4367 : arg1.field4367 - arg0.field4367;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2608((class377) arg0, (class377) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
