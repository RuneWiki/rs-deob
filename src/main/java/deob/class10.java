package deob;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.s")
    public byte field65;

    @ObfuscatedName("d.j")
    public int field70;

    @ObfuscatedName("d.i")
    public int field63;

    @ObfuscatedName("d.k")
    public int field62;

    @ObfuscatedName("d.u")
    public int field61;

    @ObfuscatedName("d.n")
    public int field66;

    public class10() {
    }

    public class10(class300 arg0, boolean arg1) {
        this.field65 = arg0.method5034();
        this.field70 = arg0.method5054();
        this.field63 = arg0.method5056();
        this.field62 = arg0.method5056();
        this.field61 = arg0.method5056();
        this.field66 = arg0.method5056();
        if (arg1) {
            this.method80(method259(arg0));
        }
    }

    @ObfuscatedName("v.s(Lky;I)Ljava/lang/Integer;")
    public static Integer method259(class300 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method5179();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method5179();
                if (var4 == 255) {
                    break;
                }
                arg0.field3704--;
                if (arg0.method5054() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method5056();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.j(Ljava/lang/Integer;B)V")
    public void method80(Integer arg0) {
    }

    @ObfuscatedName("d.i(I)I")
    public int method81() {
        return this.field65 & 0x7;
    }

    @ObfuscatedName("d.k(I)I")
    public int method84() {
        return (this.field65 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.u(II)V")
    public void method85(int arg0) {
        this.field65 &= 0xFFFFFFF8;
        this.field65 = (byte) (this.field65 | arg0 & 0x7);
    }

    @ObfuscatedName("d.n(II)V")
    public void method101(int arg0) {
        this.field65 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field65 = (byte) (this.field65 | 0x8);
        }
    }
}
