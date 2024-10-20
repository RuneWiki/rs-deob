package deob;

@ObfuscatedName("dg")
public class class109 {

    @ObfuscatedName("dg.z")
    public static int field1834 = 0;

    @ObfuscatedName("dg.j")
    public static int field1826 = 0;

    @ObfuscatedName("dg.a")
    public static int field1827 = 0;

    @ObfuscatedName("dg.y")
    public static byte[][] field1828 = new byte[1000][];

    @ObfuscatedName("dg.i")
    public static byte[][] field1829 = new byte[250][];

    @ObfuscatedName("dg.b")
    public static byte[][] field1838 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.z(IB)[B")
    public static synchronized byte[] method2357(int arg0) {
        if (arg0 == 100 && field1834 > 0) {
            byte[] var1 = field1828[--field1834];
            field1828[field1834] = null;
            return var1;
        } else if (arg0 == 5000 && field1826 > 0) {
            byte[] var2 = field1829[--field1826];
            field1829[field1826] = null;
            return var2;
        } else if (arg0 == 30000 && field1827 > 0) {
            byte[] var3 = field1838[--field1827];
            field1838[field1827] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
