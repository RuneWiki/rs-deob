package deob;

@ObfuscatedName("cm")
public class class102 {

    @ObfuscatedName("cm.j")
    public class73[] field1550 = new class73[100];

    @ObfuscatedName("cm.n")
    public int field1551;

    @ObfuscatedName("cm.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class73 method1682(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1550[99];
        for (int var6 = this.field1551; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1550[var6] = this.field1550[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3308();
            var5.method3348();
            var5.method987(arg0, arg1, arg3, arg2);
        }
        this.field1550[0] = var5;
        if (this.field1551 < 100) {
            this.field1551++;
        }
        return var5;
    }

    @ObfuscatedName("cm.j(II)Lbv;")
    public class73 method1683(int arg0) {
        return arg0 >= 0 && arg0 < this.field1551 ? this.field1550[arg0] : null;
    }

    @ObfuscatedName("cm.n(I)I")
    public int method1684() {
        return this.field1551;
    }
}
