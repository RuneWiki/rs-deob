package deob;

@ObfuscatedName("ce")
public class class103 extends class356 {

    @ObfuscatedName("ce.c")
    public final boolean field1346;

    public class103(boolean arg0) {
        this.field1346 = arg0;
    }

    @ObfuscatedName("ce.c(Lmd;Lmd;B)I")
    public int method2320(class359 arg0, class359 arg1) {
        if (client.field496 == arg0.field4172) {
            if (client.field496 != arg1.field4172) {
                return this.field1346 ? -1 : 1;
            }
        } else if (client.field496 == arg1.field4172) {
            return this.field1346 ? 1 : -1;
        }
        return this.method5777(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2320((class359) arg0, (class359) arg1);
    }
}
