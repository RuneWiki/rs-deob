package deob;

@ObfuscatedName("z")
public class class10 {

    @ObfuscatedName("z.c")
    public byte field67;

    @ObfuscatedName("z.x")
    public int field57;

    @ObfuscatedName("z.t")
    public int field59;

    @ObfuscatedName("z.g")
    public int field60;

    @ObfuscatedName("z.l")
    public int field58;

    @ObfuscatedName("z.u")
    public int field62;

    public class10() {
    }

    public class10(class300 arg0, boolean arg1) {
        this.field67 = arg0.method5168();
        this.field57 = arg0.method5304();
        this.field59 = arg0.method5208();
        this.field60 = arg0.method5208();
        this.field58 = arg0.method5208();
        this.field62 = arg0.method5208();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method5103();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method75(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method5103();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field3696--;
                    if (arg0.method5304() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method5208();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("z.c(Ljava/lang/Integer;I)V")
    public void method75(Integer arg0) {
    }

    @ObfuscatedName("z.x(B)I")
    public int method76() {
        return this.field67 & 0x7;
    }

    @ObfuscatedName("z.t(I)I")
    public int method77() {
        return (this.field67 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("z.g(II)V")
    public void method84(int arg0) {
        this.field67 &= 0xFFFFFFF8;
        this.field67 = (byte) (this.field67 | arg0 & 0x7);
    }

    @ObfuscatedName("z.l(II)V")
    public void method78(int arg0) {
        this.field67 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field67 = (byte) (this.field67 | 0x8);
        }
    }
}
