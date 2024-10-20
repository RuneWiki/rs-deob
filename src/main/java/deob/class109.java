package deob;

@ObfuscatedName("du")
public class class109 {

    @ObfuscatedName("du.i")
    public static int field1851 = 0;

    @ObfuscatedName("du.c")
    public static int field1848 = 0;

    @ObfuscatedName("du.h")
    public static int field1846 = 0;

    @ObfuscatedName("du.v")
    public static byte[][] field1847 = new byte[1000][];

    @ObfuscatedName("du.q")
    public static byte[][] field1852 = new byte[250][];

    @ObfuscatedName("du.s")
    public static byte[][] field1849 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.i(IB)[B")
    public static synchronized byte[] method2378(int arg0) {
        if (arg0 == 100 && field1851 > 0) {
            byte[] var1 = field1847[--field1851];
            field1847[field1851] = null;
            return var1;
        } else if (arg0 == 5000 && field1848 > 0) {
            byte[] var2 = field1852[--field1848];
            field1852[field1848] = null;
            return var2;
        } else if (arg0 == 30000 && field1846 > 0) {
            byte[] var3 = field1849[--field1846];
            field1849[field1846] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
