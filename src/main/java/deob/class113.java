package deob;

@ObfuscatedName("ds")
public class class113 extends class395 {

    @ObfuscatedName("ds.h")
    public final boolean field1465;

    public class113(boolean arg0) {
        this.field1465 = arg0;
    }

    @ObfuscatedName("ds.h(Loa;Loa;B)I")
    public int method2668(class398 arg0, class398 arg1) {
        if (client.field683 == arg0.field4543) {
            if (client.field683 != arg1.field4543) {
                return this.field1465 ? -1 : 1;
            }
        } else if (client.field683 == arg1.field4543) {
            return this.field1465 ? 1 : -1;
        }
        return this.method6863(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2668((class398) arg0, (class398) arg1);
    }
}
