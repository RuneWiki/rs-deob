package deob;

@ObfuscatedName("dd")
public class class105 extends class338 {

    @ObfuscatedName("dd.n")
    public final boolean field1324;

    public class105(boolean arg0) {
        this.field1324 = arg0;
    }

    @ObfuscatedName("dd.n(Lmm;Lmm;I)I")
    public int method2285(class341 arg0, class341 arg1) {
        if (arg0.field3965 == 0) {
            if (arg1.field3965 != 0) {
                return this.field1324 ? 1 : -1;
            }
        } else if (arg1.field3965 == 0) {
            return this.field1324 ? -1 : 1;
        }
        return this.method5476(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2285((class341) arg0, (class341) arg1);
    }
}
