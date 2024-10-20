package deob;

@ObfuscatedName("cx")
public class class103 extends class351 {

    @ObfuscatedName("cx.c")
    public final boolean field1314;

    public class103(boolean arg0) {
        this.field1314 = arg0;
    }

    @ObfuscatedName("cx.c(Lmp;Lmp;B)I")
    public int method2386(class354 arg0, class354 arg1) {
        if (client.field469 == arg0.field4121) {
            if (client.field469 != arg1.field4121) {
                return this.field1314 ? -1 : 1;
            }
        } else if (client.field469 == arg1.field4121) {
            return this.field1314 ? 1 : -1;
        }
        return this.method5785(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2386((class354) arg0, (class354) arg1);
    }
}
