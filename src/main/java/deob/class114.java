package deob;

@ObfuscatedName("da")
public class class114 {

    @ObfuscatedName("da.p")
    public static int field1924 = 0;

    @ObfuscatedName("da.l")
    public static int field1923 = 0;

    @ObfuscatedName("da.d")
    public static int field1930 = 0;

    @ObfuscatedName("da.x")
    public static byte[][] field1925 = new byte[1000][];

    @ObfuscatedName("da.o")
    public static byte[][] field1926 = new byte[250][];

    @ObfuscatedName("da.a")
    public static byte[][] field1927 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.p(IB)[B")
    public static synchronized byte[] method2347(int arg0) {
        if (arg0 == 100 && field1924 > 0) {
            byte[] var1 = field1925[--field1924];
            field1925[field1924] = null;
            return var1;
        } else if (arg0 == 5000 && field1923 > 0) {
            byte[] var2 = field1926[--field1923];
            field1926[field1923] = null;
            return var2;
        } else if (arg0 == 30000 && field1930 > 0) {
            byte[] var3 = field1927[--field1930];
            field1927[field1930] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
