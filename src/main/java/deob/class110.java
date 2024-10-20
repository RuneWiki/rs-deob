package deob;

@ObfuscatedName("dy")
public class class110 extends class372 {

    @ObfuscatedName("dy.c")
    public final boolean field1409;

    public class110(boolean arg0) {
        this.field1409 = arg0;
    }

    @ObfuscatedName("dy.c(Lnm;Lnm;I)I")
    public int method2487(class375 arg0, class375 arg1) {
        if (client.field697 == arg0.field4325 && client.field697 == arg1.field4325) {
            return this.field1409 ? arg0.field4326 - arg1.field4326 : arg1.field4326 - arg0.field4326;
        } else {
            return this.method6090(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2487((class375) arg0, (class375) arg1);
    }
}
