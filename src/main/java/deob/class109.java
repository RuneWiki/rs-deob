package deob;

@ObfuscatedName("db")
public class class109 {

    @ObfuscatedName("db.k")
    public static int field1869 = 0;

    @ObfuscatedName("db.b")
    public static int field1866 = 0;

    @ObfuscatedName("db.e")
    public static int field1865 = 0;

    @ObfuscatedName("db.i")
    public static byte[][] field1868 = new byte[1000][];

    @ObfuscatedName("db.t")
    public static byte[][] field1867 = new byte[250][];

    @ObfuscatedName("db.z")
    public static byte[][] field1870 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.k(IB)[B")
    public static synchronized byte[] method2346(int arg0) {
        if (arg0 == 100 && field1869 > 0) {
            byte[] var1 = field1868[--field1869];
            field1868[field1869] = null;
            return var1;
        } else if (arg0 == 5000 && field1866 > 0) {
            byte[] var2 = field1867[--field1866];
            field1867[field1866] = null;
            return var2;
        } else if (arg0 == 30000 && field1865 > 0) {
            byte[] var3 = field1870[--field1865];
            field1870[field1865] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
