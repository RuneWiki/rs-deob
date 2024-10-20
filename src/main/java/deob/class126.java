package deob;

@ObfuscatedName("ed")
public class class126 extends class472 {

    @ObfuscatedName("ed.aq")
    public final boolean field1512;

    public class126(boolean arg0) {
        this.field1512 = arg0;
    }

    @ObfuscatedName("ed.aq(Lsh;Lsh;B)I")
    public int method2870(class475 arg0, class475 arg1) {
        if (client.field500 == arg0.field4957 && client.field500 == arg1.field4957) {
            return this.field1512 ? arg0.field4956 - arg1.field4956 : arg1.field4956 - arg0.field4956;
        } else {
            return this.method7857(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2870((class475) arg0, (class475) arg1);
    }
}
