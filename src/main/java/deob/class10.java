package deob;

@ObfuscatedName("i")
public class class10 {

    @ObfuscatedName("i.u")
    public byte field67;

    @ObfuscatedName("i.f")
    public int field62;

    @ObfuscatedName("i.b")
    public int field63;

    @ObfuscatedName("i.g")
    public int field64;

    @ObfuscatedName("i.z")
    public int field61;

    @ObfuscatedName("i.p")
    public int field66;

    public class10() {
    }

    public class10(class300 arg0, boolean arg1) {
        this.field67 = arg0.method5139();
        this.field62 = arg0.method5337();
        this.field63 = arg0.method5277();
        this.field64 = arg0.method5277();
        this.field61 = arg0.method5277();
        this.field66 = arg0.method5277();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5138();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method86(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5138();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field3707--;
                    if (arg0.method5337() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method5277();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("i.u(Ljava/lang/Integer;I)V")
    public void method86(Integer arg0) {
    }

    @ObfuscatedName("i.f(I)I")
    public int method111() {
        return this.field67 & 0x7;
    }

    @ObfuscatedName("i.b(B)I")
    public int method88() {
        return (this.field67 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("i.g(IB)V")
    public void method89(int arg0) {
        this.field67 &= 0xFFFFFFF8;
        this.field67 = (byte) (this.field67 | arg0 & 0x7);
    }

    @ObfuscatedName("i.z(II)V")
    public void method90(int arg0) {
        this.field67 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field67 = (byte) (this.field67 | 0x8);
        }
    }
}
