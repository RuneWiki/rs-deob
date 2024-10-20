package deob;

@ObfuscatedName("db")
public class class113 {

    @ObfuscatedName("db.g")
    public static int field1903 = 0;

    @ObfuscatedName("db.e")
    public static int field1901 = 0;

    @ObfuscatedName("db.n")
    public static int field1902 = 0;

    @ObfuscatedName("db.j")
    public static byte[][] field1906 = new byte[1000][];

    @ObfuscatedName("db.i")
    public static byte[][] field1904 = new byte[250][];

    @ObfuscatedName("db.o")
    public static byte[][] field1905 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.g(IS)[B")
    public static synchronized byte[] method2344(int arg0) {
        if (arg0 == 100 && field1903 > 0) {
            byte[] var1 = field1906[--field1903];
            field1906[field1903] = null;
            return var1;
        } else if (arg0 == 5000 && field1901 > 0) {
            byte[] var2 = field1904[--field1901];
            field1904[field1901] = null;
            return var2;
        } else if (arg0 == 30000 && field1902 > 0) {
            byte[] var3 = field1905[--field1902];
            field1905[field1902] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
