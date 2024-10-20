package deob;

@ObfuscatedName("b")
public class class10 {

    @ObfuscatedName("b.a")
    public byte field71;

    @ObfuscatedName("b.s")
    public int field63;

    @ObfuscatedName("b.g")
    public int field74;

    @ObfuscatedName("b.x")
    public int field66;

    @ObfuscatedName("b.h")
    public int field67;

    @ObfuscatedName("b.f")
    public int field68;

    public class10() {
    }

    public class10(class190 arg0, boolean arg1) {
        this.field71 = arg0.method3599();
        this.field63 = arg0.method3610();
        this.field74 = arg0.method3460();
        this.field66 = arg0.method3460();
        this.field67 = arg0.method3460();
        this.field68 = arg0.method3460();
        if (arg1) {
            this.method100(Statics.method1585(arg0));
        }
    }

    @ObfuscatedName("b.s(Ljava/lang/Integer;I)V")
    public void method100(Integer arg0) {
    }

    @ObfuscatedName("b.g(B)I")
    public int method101() {
        return this.field71 & 0x7;
    }

    @ObfuscatedName("b.x(B)I")
    public int method116() {
        return (this.field71 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("b.h(II)V")
    public void method102(int arg0) {
        this.field71 &= 0xFFFFFFF8;
        this.field71 = (byte) (this.field71 | arg0 & 0x7);
    }

    @ObfuscatedName("b.f(IS)V")
    public void method109(int arg0) {
        this.field71 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field71 = (byte) (this.field71 | 0x8);
        }
    }
}
