package deob;

@ObfuscatedName("da")
public class class114 {

    @ObfuscatedName("da.x")
    public static int field1907 = 0;

    @ObfuscatedName("da.p")
    public static int field1901 = 0;

    @ObfuscatedName("da.k")
    public static int field1905 = 0;

    @ObfuscatedName("da.a")
    public static byte[][] field1904 = new byte[1000][];

    @ObfuscatedName("da.q")
    public static byte[][] field1908 = new byte[250][];

    @ObfuscatedName("da.j")
    public static byte[][] field1906 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.x(IB)[B")
    public static synchronized byte[] method2266(int arg0) {
        if (arg0 == 100 && field1907 > 0) {
            byte[] var1 = field1904[--field1907];
            field1904[field1907] = null;
            return var1;
        } else if (arg0 == 5000 && field1901 > 0) {
            byte[] var2 = field1908[--field1901];
            field1908[field1901] = null;
            return var2;
        } else if (arg0 == 30000 && field1905 > 0) {
            byte[] var3 = field1906[--field1905];
            field1906[field1905] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
