package deob;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.a")
    public byte field57;

    @ObfuscatedName("d.t")
    public int field58;

    @ObfuscatedName("d.n")
    public int field59;

    @ObfuscatedName("d.q")
    public int field60;

    @ObfuscatedName("d.v")
    public int field61;

    @ObfuscatedName("d.l")
    public int field65;

    public class10() {
    }

    public class10(class300 arg0, boolean arg1) {
        this.field57 = arg0.method5268();
        this.field58 = arg0.method5166();
        this.field59 = arg0.method5155();
        this.field60 = arg0.method5155();
        this.field61 = arg0.method5155();
        this.field65 = arg0.method5155();
        if (arg1) {
            this.method104(method3659(arg0));
        }
    }

    @ObfuscatedName("gd.a(Lkc;B)Ljava/lang/Integer;")
    public static Integer method3659(class300 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5123();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5123();
                if (var4 == 255) {
                    break;
                }
                arg0.field3694--;
                if (arg0.method5166() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5155();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.t(Ljava/lang/Integer;I)V")
    public void method104(Integer arg0) {
    }

    @ObfuscatedName("d.n(B)I")
    public int method105() {
        return this.field57 & 0x7;
    }

    @ObfuscatedName("d.q(I)I")
    public int method106() {
        return (this.field57 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.v(IS)V")
    public void method107(int arg0) {
        this.field57 &= 0xFFFFFFF8;
        this.field57 = (byte) (this.field57 | arg0 & 0x7);
    }

    @ObfuscatedName("d.l(II)V")
    public void method120(int arg0) {
        this.field57 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field57 = (byte) (this.field57 | 0x8);
        }
    }
}
