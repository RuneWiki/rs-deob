package deob;

@ObfuscatedName("es")
public class class114 extends class409 {

    @ObfuscatedName("es.af")
    public final boolean field1427;

    public class114(boolean arg0) {
        this.field1427 = arg0;
    }

    @ObfuscatedName("es.af(Lpb;Lpb;I)I")
    public int method2773(class412 arg0, class412 arg1) {
        if (arg0.field4600 == 0) {
            if (arg1.field4600 != 0) {
                return this.field1427 ? 1 : -1;
            }
        } else if (arg1.field4600 == 0) {
            return this.field1427 ? -1 : 1;
        }
        return this.method7183(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2773((class412) arg0, (class412) arg1);
    }
}
