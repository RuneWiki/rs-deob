package deob;

@ObfuscatedName("df")
public class class106 extends class374 {

    @ObfuscatedName("df.c")
    public final boolean field1374;

    public class106(boolean arg0) {
        this.field1374 = arg0;
    }

    @ObfuscatedName("df.c(Lnr;Lnr;B)I")
    public int method2610(class377 arg0, class377 arg1) {
        if (client.field493 == arg0.field4366) {
            if (client.field493 != arg1.field4366) {
                return this.field1374 ? -1 : 1;
            }
        } else if (client.field493 == arg1.field4366) {
            return this.field1374 ? 1 : -1;
        }
        return this.method6238(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2610((class377) arg0, (class377) arg1);
    }
}
