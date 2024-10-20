package deob;

@ObfuscatedName("dz")
public class class111 extends class373 {

    @ObfuscatedName("dz.s")
    public final boolean field1395;

    public class111(boolean arg0) {
        this.field1395 = arg0;
    }

    @ObfuscatedName("dz.s(Lnt;Lnt;I)I")
    public int method2470(class376 arg0, class376 arg1) {
        if (arg0.field4326 == arg1.field4326) {
            return this.method6015(arg0, arg1);
        } else if (this.field1395) {
            return arg0.field4326 - arg1.field4326;
        } else {
            return arg1.field4326 - arg0.field4326;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2470((class376) arg0, (class376) arg1);
    }
}
