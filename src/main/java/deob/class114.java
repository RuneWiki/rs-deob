package deob;

@ObfuscatedName("dz")
public class class114 {

    @ObfuscatedName("dz.i")
    public static int field1934 = 0;

    @ObfuscatedName("dz.p")
    public static int field1933 = 0;

    @ObfuscatedName("dz.a")
    public static int field1930 = 0;

    @ObfuscatedName("dz.l")
    public static byte[][] field1931 = new byte[1000][];

    @ObfuscatedName("dz.q")
    public static byte[][] field1932 = new byte[250][];

    @ObfuscatedName("dz.b")
    public static byte[][] field1929 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.i(IS)[B")
    public static synchronized byte[] method2257(int arg0) {
        if (arg0 == 100 && field1934 > 0) {
            byte[] var1 = field1931[--field1934];
            field1931[field1934] = null;
            return var1;
        } else if (arg0 == 5000 && field1933 > 0) {
            byte[] var2 = field1932[--field1933];
            field1932[field1933] = null;
            return var2;
        } else if (arg0 == 30000 && field1930 > 0) {
            byte[] var3 = field1929[--field1930];
            field1929[field1930] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
