package deob;

@ObfuscatedName("m")
public class class10 {

    @ObfuscatedName("m.c")
    public byte field63;

    @ObfuscatedName("m.t")
    public int field59;

    @ObfuscatedName("m.o")
    public int field56;

    @ObfuscatedName("m.e")
    public int field58;

    @ObfuscatedName("m.i")
    public int field57;

    @ObfuscatedName("m.g")
    public int field60;

    public class10() {
    }

    public class10(class301 arg0, boolean arg1) {
        this.field63 = arg0.method5130();
        this.field59 = arg0.method5124();
        this.field56 = arg0.method5134();
        this.field58 = arg0.method5134();
        this.field57 = arg0.method5134();
        this.field60 = arg0.method5134();
        if (arg1) {
            this.method89(method374(arg0));
        }
    }

    @ObfuscatedName("af.c(Lkp;I)Ljava/lang/Integer;")
    public static Integer method374(class301 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5129();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5129();
                if (var4 == 255) {
                    break;
                }
                arg0.field3707--;
                if (arg0.method5124() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5134();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("m.t(Ljava/lang/Integer;I)V")
    public void method89(Integer arg0) {
    }

    @ObfuscatedName("m.o(B)I")
    public int method90() {
        return this.field63 & 0x7;
    }

    @ObfuscatedName("m.e(B)I")
    public int method104() {
        return (this.field63 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("m.i(IB)V")
    public void method100(int arg0) {
        this.field63 &= 0xFFFFFFF8;
        this.field63 = (byte) (this.field63 | arg0 & 0x7);
    }

    @ObfuscatedName("m.g(II)V")
    public void method92(int arg0) {
        this.field63 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field63 = (byte) (this.field63 | 0x8);
        }
    }
}
