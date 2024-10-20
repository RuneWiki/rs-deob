package deob;

@ObfuscatedName("dw")
public class class109 {

    @ObfuscatedName("dw.g")
    public static int field1857 = 0;

    @ObfuscatedName("dw.s")
    public static int field1858 = 0;

    @ObfuscatedName("dw.v")
    public static int field1859 = 0;

    @ObfuscatedName("dw.o")
    public static byte[][] field1863 = new byte[1000][];

    @ObfuscatedName("dw.k")
    public static byte[][] field1861 = new byte[250][];

    @ObfuscatedName("dw.m")
    public static byte[][] field1862 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.g(II)[B")
    public static synchronized byte[] method2299(int arg0) {
        if (arg0 == 100 && field1857 > 0) {
            byte[] var1 = field1863[--field1857];
            field1863[field1857] = null;
            return var1;
        } else if (arg0 == 5000 && field1858 > 0) {
            byte[] var2 = field1861[--field1858];
            field1861[field1858] = null;
            return var2;
        } else if (arg0 == 30000 && field1859 > 0) {
            byte[] var3 = field1862[--field1859];
            field1862[field1859] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
