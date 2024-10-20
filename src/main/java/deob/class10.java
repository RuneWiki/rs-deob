package deob;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.n")
    public byte field68;

    @ObfuscatedName("d.h")
    public int field67;

    @ObfuscatedName("d.l")
    public int field63;

    @ObfuscatedName("d.g")
    public int field64;

    @ObfuscatedName("d.b")
    public int field65;

    @ObfuscatedName("d.a")
    public int field61;

    public class10() {
    }

    public class10(class190 arg0, boolean arg1) {
        this.field68 = arg0.method3512();
        this.field67 = arg0.method3513();
        this.field63 = arg0.method3562();
        this.field64 = arg0.method3562();
        this.field65 = arg0.method3562();
        this.field61 = arg0.method3562();
        if (arg1) {
            this.method85(method663(arg0));
        }
    }

    @ObfuscatedName("ay.n(Lgc;B)Ljava/lang/Integer;")
    public static Integer method663(class190 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3511();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3511();
                if (var4 == 255) {
                    break;
                }
                arg0.field2423--;
                if (arg0.method3513() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3562();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("d.h(Ljava/lang/Integer;I)V")
    public void method85(Integer arg0) {
    }

    @ObfuscatedName("d.l(S)I")
    public int method86() {
        return this.field68 & 0x7;
    }

    @ObfuscatedName("d.g(I)I")
    public int method104() {
        return (this.field68 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("d.b(II)V")
    public void method88(int arg0) {
        this.field68 &= 0xFFFFFFF8;
        this.field68 = (byte) (this.field68 | arg0 & 0x7);
    }

    @ObfuscatedName("d.a(II)V")
    public void method89(int arg0) {
        this.field68 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field68 = (byte) (this.field68 | 0x8);
        }
    }
}
