package deob;

@ObfuscatedName("ds")
public class class109 {

    @ObfuscatedName("ds.k")
    public static int field1852 = 0;

    @ObfuscatedName("ds.y")
    public static int field1850 = 0;

    @ObfuscatedName("ds.s")
    public static int field1851 = 0;

    @ObfuscatedName("ds.g")
    public static byte[][] field1849 = new byte[1000][];

    @ObfuscatedName("ds.h")
    public static byte[][] field1848 = new byte[250][];

    @ObfuscatedName("ds.l")
    public static byte[][] field1853 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.k(IB)[B")
    public static synchronized byte[] method2360(int arg0) {
        if (arg0 == 100 && field1852 > 0) {
            byte[] var1 = field1849[--field1852];
            field1849[field1852] = null;
            return var1;
        } else if (arg0 == 5000 && field1850 > 0) {
            byte[] var2 = field1848[--field1850];
            field1848[field1850] = null;
            return var2;
        } else if (arg0 == 30000 && field1851 > 0) {
            byte[] var3 = field1853[--field1851];
            field1853[field1851] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
