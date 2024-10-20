package deob;

@ObfuscatedName("ew")
public class class120 extends class422 {

    @ObfuscatedName("ew.at")
    public final boolean field1435;

    public class120(boolean arg0) {
        this.field1435 = arg0;
    }

    @ObfuscatedName("ew.at(Lqg;Lqg;B)I")
    public int method2729(class425 arg0, class425 arg1) {
        if (client.field504 == arg0.field4612 && client.field504 == arg1.field4612) {
            return this.field1435 ? arg0.method7150().method8760(arg1.method7150()) : arg1.method7150().method8760(arg0.method7150());
        } else {
            return this.method7169(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2729((class425) arg0, (class425) arg1);
    }
}
