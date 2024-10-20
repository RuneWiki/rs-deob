package deob;

@ObfuscatedName("f")
public class class10 {

    @ObfuscatedName("f.q")
    public byte field63;

    @ObfuscatedName("f.w")
    public int field60;

    @ObfuscatedName("f.e")
    public int field61;

    @ObfuscatedName("f.p")
    public int field62;

    @ObfuscatedName("f.k")
    public int field59;

    @ObfuscatedName("f.l")
    public int field64;

    public class10() {
    }

    public class10(class301 arg0, boolean arg1) {
        this.field63 = arg0.method5068();
        this.field60 = arg0.method5069();
        this.field61 = arg0.method5072();
        this.field62 = arg0.method5072();
        this.field59 = arg0.method5072();
        this.field64 = arg0.method5072();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5077();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method82(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5077();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field3733--;
                    if (arg0.method5069() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method5072();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("f.q(Ljava/lang/Integer;I)V")
    public void method82(Integer arg0) {
    }

    @ObfuscatedName("f.w(B)I")
    public int method83() {
        return this.field63 & 0x7;
    }

    @ObfuscatedName("f.e(I)I")
    public int method84() {
        return (this.field63 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("f.p(IB)V")
    public void method101(int arg0) {
        this.field63 &= 0xFFFFFFF8;
        this.field63 = (byte) (this.field63 | arg0 & 0x7);
    }

    @ObfuscatedName("f.k(II)V")
    public void method86(int arg0) {
        this.field63 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field63 = (byte) (this.field63 | 0x8);
        }
    }
}
