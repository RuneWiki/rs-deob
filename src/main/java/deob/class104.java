package deob;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.o")
    public class74[] field1335 = new class74[100];

    @ObfuscatedName("cl.q")
    public int field1334;

    @ObfuscatedName("cl.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbr;")
    public class74 method2153(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1335[99];
        for (int var6 = this.field1334; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1335[var6] = this.field1335[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3388();
            var5.method3379();
            var5.method1087(arg0, arg1, arg3, arg2);
        }
        this.field1335[0] = var5;
        if (this.field1334 < 100) {
            this.field1334++;
        }
        return var5;
    }

    @ObfuscatedName("cl.o(II)Lbr;")
    public class74 method2150(int arg0) {
        return arg0 >= 0 && arg0 < this.field1334 ? this.field1335[arg0] : null;
    }

    @ObfuscatedName("cl.q(I)I")
    public int method2151() {
        return this.field1334;
    }
}
