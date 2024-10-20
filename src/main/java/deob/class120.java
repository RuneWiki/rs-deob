package deob;

@ObfuscatedName("dd")
public class class120 extends class395 {

    @ObfuscatedName("dd.h")
    public final boolean field1493;

    public class120(boolean arg0) {
        this.field1493 = arg0;
    }

    @ObfuscatedName("dd.h(Loa;Loa;I)I")
    public int method2733(class398 arg0, class398 arg1) {
        if (arg0.field4543 == 0 || arg1.field4543 == 0) {
            return this.method6863(arg0, arg1);
        } else if (this.field1493) {
            return arg0.method6844().method8391(arg1.method6844());
        } else {
            return arg1.method6844().method8391(arg0.method6844());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2733((class398) arg0, (class398) arg1);
    }
}
