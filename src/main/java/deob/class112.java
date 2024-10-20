package deob;

@ObfuscatedName("do")
public class class112 extends class373 {

    @ObfuscatedName("do.s")
    public final boolean field1398;

    public class112(boolean arg0) {
        this.field1398 = arg0;
    }

    @ObfuscatedName("do.s(Lnt;Lnt;B)I")
    public int method2477(class376 arg0, class376 arg1) {
        if (arg0.field4328 == 0 || arg1.field4328 == 0) {
            return this.method6015(arg0, arg1);
        } else if (this.field1398) {
            return arg0.method5996().method7490(arg1.method5996());
        } else {
            return arg1.method5996().method7490(arg0.method5996());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2477((class376) arg0, (class376) arg1);
    }
}
