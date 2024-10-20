package deob;

@ObfuscatedName("db")
public class class109 {

    @ObfuscatedName("db.b")
    public static int field1858 = 0;

    @ObfuscatedName("db.u")
    public static int field1856 = 0;

    @ObfuscatedName("db.x")
    public static int field1863 = 0;

    @ObfuscatedName("db.j")
    public static byte[][] field1865 = new byte[1000][];

    @ObfuscatedName("db.o")
    public static byte[][] field1861 = new byte[250][];

    @ObfuscatedName("db.n")
    public static byte[][] field1860 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.b(II)[B")
    public static synchronized byte[] method2382(int arg0) {
        if (arg0 == 100 && field1858 > 0) {
            byte[] var1 = field1865[--field1858];
            field1865[field1858] = null;
            return var1;
        } else if (arg0 == 5000 && field1856 > 0) {
            byte[] var2 = field1861[--field1856];
            field1861[field1856] = null;
            return var2;
        } else if (arg0 == 30000 && field1863 > 0) {
            byte[] var3 = field1860[--field1863];
            field1860[field1863] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
