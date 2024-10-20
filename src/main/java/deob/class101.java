package deob;

@ObfuscatedName("cv")
public class class101 {

    @ObfuscatedName("cv.j")
    public class73[] field1563 = new class73[100];

    @ObfuscatedName("cv.a")
    public int field1565;

    @ObfuscatedName("cv.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbt;")
    public class73 method1718(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1563[99];
        for (int var6 = this.field1565; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1563[var6] = this.field1563[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3397();
            var5.method3445();
            var5.method1026(arg0, arg1, arg3, arg2);
        }
        this.field1563[0] = var5;
        if (this.field1565 < 100) {
            this.field1565++;
        }
        return var5;
    }

    @ObfuscatedName("cv.j(IB)Lbt;")
    public class73 method1714(int arg0) {
        return arg0 >= 0 && arg0 < this.field1565 ? this.field1563[arg0] : null;
    }

    @ObfuscatedName("cv.a(I)I")
    public int method1715() {
        return this.field1565;
    }
}
