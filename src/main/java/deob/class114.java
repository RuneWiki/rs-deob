package deob;

@ObfuscatedName("dp")
public class class114 {

    @ObfuscatedName("dp.d")
    public static int field1927 = 0;

    @ObfuscatedName("dp.g")
    public static int field1926 = 0;

    @ObfuscatedName("dp.a")
    public static int field1931 = 0;

    @ObfuscatedName("dp.t")
    public static byte[][] field1928 = new byte[1000][];

    @ObfuscatedName("dp.f")
    public static byte[][] field1929 = new byte[250][];

    @ObfuscatedName("dp.c")
    public static byte[][] field1925 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.d(IB)[B")
    public static synchronized byte[] method2261(int arg0) {
        if (arg0 == 100 && field1927 > 0) {
            byte[] var1 = field1928[--field1927];
            field1928[field1927] = null;
            return var1;
        } else if (arg0 == 5000 && field1926 > 0) {
            byte[] var2 = field1929[--field1926];
            field1929[field1926] = null;
            return var2;
        } else if (arg0 == 30000 && field1931 > 0) {
            byte[] var3 = field1925[--field1931];
            field1925[field1931] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
