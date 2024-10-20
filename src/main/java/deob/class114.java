package deob;

@ObfuscatedName("db")
public class class114 {

    @ObfuscatedName("db.y")
    public static int field1923 = 0;

    @ObfuscatedName("db.m")
    public static int field1924 = 0;

    @ObfuscatedName("db.d")
    public static int field1929 = 0;

    @ObfuscatedName("db.k")
    public static byte[][] field1925 = new byte[1000][];

    @ObfuscatedName("db.n")
    public static byte[][] field1926 = new byte[250][];

    @ObfuscatedName("db.s")
    public static byte[][] field1922 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.y(IS)[B")
    public static synchronized byte[] method2329(int arg0) {
        if (arg0 == 100 && field1923 > 0) {
            byte[] var1 = field1925[--field1923];
            field1925[field1923] = null;
            return var1;
        } else if (arg0 == 5000 && field1924 > 0) {
            byte[] var2 = field1926[--field1924];
            field1926[field1924] = null;
            return var2;
        } else if (arg0 == 30000 && field1929 > 0) {
            byte[] var3 = field1922[--field1929];
            field1922[field1929] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
