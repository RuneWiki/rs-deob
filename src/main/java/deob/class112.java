package deob;

@ObfuscatedName("ds")
public class class112 {

    @ObfuscatedName("ds.p")
    public static int field1857 = 0;

    @ObfuscatedName("ds.y")
    public static int field1851 = 0;

    @ObfuscatedName("ds.d")
    public static int field1849 = 0;

    @ObfuscatedName("ds.c")
    public static byte[][] field1852 = new byte[1000][];

    @ObfuscatedName("ds.r")
    public static byte[][] field1853 = new byte[250][];

    @ObfuscatedName("ds.f")
    public static byte[][] field1854 = new byte[50][];

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.p(IB)[B")
    public static synchronized byte[] method2361(int arg0) {
        if (arg0 == 100 && field1857 > 0) {
            byte[] var1 = field1852[--field1857];
            field1852[field1857] = null;
            return var1;
        } else if (arg0 == 5000 && field1851 > 0) {
            byte[] var2 = field1853[--field1851];
            field1853[field1851] = null;
            return var2;
        } else if (arg0 == 30000 && field1849 > 0) {
            byte[] var3 = field1854[--field1849];
            field1854[field1849] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
