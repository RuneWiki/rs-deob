package deob;

@ObfuscatedName("df")
public class class113 {

    @ObfuscatedName("df.n")
    public static int field1896 = 0;

    @ObfuscatedName("df.w")
    public static int field1894 = 0;

    @ObfuscatedName("df.i")
    public static int field1895 = 0;

    @ObfuscatedName("df.e")
    public static byte[][] field1899 = new byte[1000][];

    @ObfuscatedName("df.h")
    public static byte[][] field1897 = new byte[250][];

    @ObfuscatedName("df.q")
    public static byte[][] field1898 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.n(II)[B")
    public static synchronized byte[] method2397(int arg0) {
        if (arg0 == 100 && field1896 > 0) {
            byte[] var1 = field1899[--field1896];
            field1899[field1896] = null;
            return var1;
        } else if (arg0 == 5000 && field1894 > 0) {
            byte[] var2 = field1897[--field1894];
            field1897[field1894] = null;
            return var2;
        } else if (arg0 == 30000 && field1895 > 0) {
            byte[] var3 = field1898[--field1895];
            field1898[field1895] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
