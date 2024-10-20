package deob;

@ObfuscatedName("ds")
public class class105 extends class356 {

    @ObfuscatedName("ds.c")
    public final boolean field1357;

    public class105(boolean arg0) {
        this.field1357 = arg0;
    }

    @ObfuscatedName("ds.c(Lmd;Lmd;I)I")
    public int method2344(class359 arg0, class359 arg1) {
        if (arg0.field4172 == 0) {
            if (arg1.field4172 != 0) {
                return this.field1357 ? 1 : -1;
            }
        } else if (arg1.field4172 == 0) {
            return this.field1357 ? -1 : 1;
        }
        return this.method5777(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2344((class359) arg0, (class359) arg1);
    }
}
