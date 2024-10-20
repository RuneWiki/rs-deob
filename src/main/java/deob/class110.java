package deob;

@ObfuscatedName("dq")
public class class110 extends class356 {

    @ObfuscatedName("dq.c")
    public final boolean field1375;

    public class110(boolean arg0) {
        this.field1375 = arg0;
    }

    @ObfuscatedName("dq.c(Lmd;Lmd;B)I")
    public int method2391(class359 arg0, class359 arg1) {
        if (arg0.field4172 == 0 || arg1.field4172 == 0) {
            return this.method5777(arg0, arg1);
        } else if (this.field1375) {
            return arg0.method5770().method7234(arg1.method5770());
        } else {
            return arg1.method5770().method7234(arg0.method5770());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2391((class359) arg0, (class359) arg1);
    }
}
