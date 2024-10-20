package deob;

@ObfuscatedName("x")
public class class10 {

    @ObfuscatedName("x.m")
    public byte field57;

    @ObfuscatedName("x.f")
    public int field58;

    @ObfuscatedName("x.q")
    public int field51;

    @ObfuscatedName("x.w")
    public int field52;

    @ObfuscatedName("x.o")
    public int field55;

    @ObfuscatedName("x.u")
    public int field54;

    public class10() {
    }

    public class10(class202 arg0, boolean arg1) {
        this.field57 = arg0.method3537();
        this.field58 = arg0.method3530();
        this.field51 = arg0.method3620();
        this.field52 = arg0.method3620();
        this.field55 = arg0.method3620();
        this.field54 = arg0.method3620();
        if (arg1) {
            this.method86(method3074(arg0));
        }
    }

    @ObfuscatedName("eg.m(Lgr;B)Ljava/lang/Integer;")
    public static Integer method3074(class202 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3551();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3551();
                if (var4 == 255) {
                    break;
                }
                arg0.field2439--;
                if (arg0.method3530() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3620();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("x.f(Ljava/lang/Integer;I)V")
    public void method86(Integer arg0) {
    }

    @ObfuscatedName("x.q(I)I")
    public int method87() {
        return this.field57 & 0x7;
    }

    @ObfuscatedName("x.w(I)I")
    public int method102() {
        return (this.field57 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("x.o(II)V")
    public void method89(int arg0) {
        this.field57 &= 0xFFFFFFF8;
        this.field57 = (byte) (this.field57 | arg0 & 0x7);
    }

    @ObfuscatedName("x.u(II)V")
    public void method90(int arg0) {
        this.field57 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field57 = (byte) (this.field57 | 0x8);
        }
    }
}
