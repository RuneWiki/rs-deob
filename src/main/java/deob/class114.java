package deob;

@ObfuscatedName("dq")
public class class114 {

    @ObfuscatedName("dq.a")
    public static int field1927 = 0;

    @ObfuscatedName("dq.x")
    public static int field1925 = 0;

    @ObfuscatedName("dq.e")
    public static int field1930 = 0;

    @ObfuscatedName("dq.r")
    public static byte[][] field1928 = new byte[1000][];

    @ObfuscatedName("dq.p")
    public static byte[][] field1924 = new byte[250][];

    @ObfuscatedName("dq.n")
    public static byte[][] field1929 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.a(II)[B")
    public static synchronized byte[] method2265(int arg0) {
        if (arg0 == 100 && field1927 > 0) {
            byte[] var1 = field1928[--field1927];
            field1928[field1927] = null;
            return var1;
        } else if (arg0 == 5000 && field1925 > 0) {
            byte[] var2 = field1924[--field1925];
            field1924[field1925] = null;
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
