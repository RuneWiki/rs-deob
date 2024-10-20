package deob;

@ObfuscatedName("dp")
public final class class125 {

    @ObfuscatedName("dp.k")
    public class130 field1862 = new class130();

    @ObfuscatedName("dp.y")
    public int field1861;

    @ObfuscatedName("dp.o")
    public int field1863;

    @ObfuscatedName("dp.r")
    public class126 field1864;

    @ObfuscatedName("dp.w")
    public class121 field1865 = new class121();

    public class125(int arg0) {
        this.field1861 = arg0;
        this.field1863 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1864 = new class126(var2);
    }

    @ObfuscatedName("dp.k(J)Ldh;")
    public class130 method2159(long arg0) {
        class130 var3 = (class130) this.field1864.method2171(arg0);
        if (var3 != null) {
            this.field1865.method2122(var3);
        }
        return var3;
    }

    @ObfuscatedName("dp.y(J)V")
    public void method2160(long arg0) {
        class130 var3 = (class130) this.field1864.method2171(arg0);
        if (var3 != null) {
            var3.method2214();
            var3.method2251();
            this.field1863++;
        }
    }

    @ObfuscatedName("dp.o(Ldh;J)V")
    public void method2164(class130 arg0, long arg1) {
        if (this.field1863 == 0) {
            class130 var4 = this.field1865.method2121();
            var4.method2214();
            var4.method2251();
            if (this.field1862 == var4) {
                class130 var5 = this.field1865.method2121();
                var5.method2214();
                var5.method2251();
            }
        } else {
            this.field1863--;
        }
        this.field1864.method2173(arg0, arg1);
        this.field1865.method2122(arg0);
    }

    @ObfuscatedName("dp.r()V")
    public void method2161() {
        this.field1865.method2126();
        this.field1864.method2180();
        this.field1862 = new class130();
        this.field1863 = this.field1861;
    }
}
