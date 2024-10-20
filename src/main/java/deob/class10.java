package deob;

@ObfuscatedName("i")
public class class10 {

    @ObfuscatedName("i.z")
    public byte field60;

    @ObfuscatedName("i.n")
    public int field61;

    @ObfuscatedName("i.v")
    public int field57;

    @ObfuscatedName("i.u")
    public int field58;

    @ObfuscatedName("i.r")
    public int field59;

    @ObfuscatedName("i.p")
    public int field56;

    public class10() {
    }

    public class10(class300 arg0, boolean arg1) {
        this.field60 = arg0.method5002();
        this.field61 = arg0.method4992();
        this.field57 = arg0.method5085();
        this.field58 = arg0.method5085();
        this.field59 = arg0.method5085();
        this.field56 = arg0.method5085();
        if (arg1) {
            this.method92(method70(arg0));
        }
    }

    @ObfuscatedName("m.z(Lkl;I)Ljava/lang/Integer;")
    public static Integer method70(class300 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method4990();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method4990();
                if (var4 == 255) {
                    break;
                }
                arg0.field3702--;
                if (arg0.method4992() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5085();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("i.n(Ljava/lang/Integer;I)V")
    public void method92(Integer arg0) {
    }

    @ObfuscatedName("i.v(I)I")
    public int method94() {
        return this.field60 & 0x7;
    }

    @ObfuscatedName("i.u(B)I")
    public int method95() {
        return (this.field60 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("i.r(II)V")
    public void method96(int arg0) {
        this.field60 &= 0xFFFFFFF8;
        this.field60 = (byte) (this.field60 | arg0 & 0x7);
    }

    @ObfuscatedName("i.p(IB)V")
    public void method103(int arg0) {
        this.field60 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field60 = (byte) (this.field60 | 0x8);
        }
    }
}
