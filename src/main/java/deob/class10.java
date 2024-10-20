package deob;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.f")
    public byte field58;

    @ObfuscatedName("d.i")
    public int field52;

    @ObfuscatedName("d.y")
    public int field64;

    @ObfuscatedName("d.w")
    public int field55;

    @ObfuscatedName("d.p")
    public int field56;

    @ObfuscatedName("d.b")
    public int field54;

    public class10() {
    }

    public class10(class300 arg0, boolean arg1) {
        this.field58 = arg0.method5297();
        this.field52 = arg0.method5112();
        this.field64 = arg0.method5192();
        this.field55 = arg0.method5192();
        this.field56 = arg0.method5192();
        this.field54 = arg0.method5192();
        if (arg1) {
            this.method76(method3052(arg0));
        }
    }

    @ObfuscatedName("ec.f(Lkq;I)Ljava/lang/Integer;")
    public static Integer method3052(class300 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5110();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5110();
                if (var4 == 255) {
                    break;
                }
                arg0.field3703--;
                if (arg0.method5112() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5192();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.i(Ljava/lang/Integer;I)V")
    public void method76(Integer arg0) {
    }

    @ObfuscatedName("d.y(I)I")
    public int method77() {
        return this.field58 & 0x7;
    }

    @ObfuscatedName("d.w(I)I")
    public int method89() {
        return (this.field58 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.p(II)V")
    public void method79(int arg0) {
        this.field58 &= 0xFFFFFFF8;
        this.field58 = (byte) (this.field58 | arg0 & 0x7);
    }

    @ObfuscatedName("d.b(II)V")
    public void method80(int arg0) {
        this.field58 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field58 = (byte) (this.field58 | 0x8);
        }
    }
}
