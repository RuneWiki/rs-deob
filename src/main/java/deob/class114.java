package deob;

@ObfuscatedName("dd")
public class class114 {

    @ObfuscatedName("dd.q")
    public static int field1930 = 0;

    @ObfuscatedName("dd.c")
    public static int field1927 = 0;

    @ObfuscatedName("dd.p")
    public static int field1928 = 0;

    @ObfuscatedName("dd.z")
    public static byte[][] field1929 = new byte[1000][];

    @ObfuscatedName("dd.m")
    public static byte[][] field1933 = new byte[250][];

    @ObfuscatedName("dd.k")
    public static byte[][] field1931 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.q(IB)[B")
    public static synchronized byte[] method2290(int arg0) {
        if (arg0 == 100 && field1930 > 0) {
            byte[] var1 = field1929[--field1930];
            field1929[field1930] = null;
            return var1;
        } else if (arg0 == 5000 && field1927 > 0) {
            byte[] var2 = field1933[--field1927];
            field1933[field1927] = null;
            return var2;
        } else if (arg0 == 30000 && field1928 > 0) {
            byte[] var3 = field1931[--field1928];
            field1931[field1928] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
