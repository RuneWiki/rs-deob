package deob;

@ObfuscatedName("dj")
public class class124 extends class324 {

    @ObfuscatedName("dj.f")
    public final boolean field1467;

    public class124(boolean arg0) {
        this.field1467 = arg0;
    }

    @ObfuscatedName("dj.f(Lly;Lly;I)I")
    public int method2306(class327 arg0, class327 arg1) {
        if (arg0.field3848 == 0 || arg1.field3848 == 0) {
            return this.method5196(arg0, arg1);
        } else if (this.field1467) {
            return arg0.method5177().method5266(arg1.method5177());
        } else {
            return arg1.method5177().method5266(arg0.method5177());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2306((class327) arg0, (class327) arg1);
    }
}
