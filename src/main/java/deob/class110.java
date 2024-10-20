package deob;

@ObfuscatedName("dj")
public class class110 extends class373 {

    @ObfuscatedName("dj.o")
    public final boolean field1404;

    public class110(boolean arg0) {
        this.field1404 = arg0;
    }

    @ObfuscatedName("dj.o(Lns;Lns;B)I")
    public int method2468(class376 arg0, class376 arg1) {
        if (client.field539 == arg0.field4335 && client.field539 == arg1.field4335) {
            return this.field1404 ? arg0.field4336 - arg1.field4336 : arg1.field4336 - arg0.field4336;
        } else {
            return this.method6016(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2468((class376) arg0, (class376) arg1);
    }
}
