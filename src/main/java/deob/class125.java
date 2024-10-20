package deob;

@ObfuscatedName("eh")
public class class125 extends class454 {

    @ObfuscatedName("eh.az")
    public final boolean field1507;

    public class125(boolean arg0) {
        this.field1507 = arg0;
    }

    @ObfuscatedName("eh.az(Lrw;Lrw;I)I")
    public int method2804(class457 arg0, class457 arg1) {
        if (arg0.field4807 == 0 || arg1.field4807 == 0) {
            return this.method7450(arg0, arg1);
        } else if (this.field1507) {
            return arg0.method7433().method9080(arg1.method7433());
        } else {
            return arg1.method7433().method9080(arg0.method7433());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2804((class457) arg0, (class457) arg1);
    }
}
