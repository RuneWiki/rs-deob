package deob;

@ObfuscatedName("dl")
public class class110 {

    @ObfuscatedName("dl.e")
    public static int field1851 = 0;

    @ObfuscatedName("dl.v")
    public static int field1850 = 0;

    @ObfuscatedName("dl.k")
    public static int field1856 = 0;

    @ObfuscatedName("dl.g")
    public static byte[][] field1852 = new byte[1000][];

    @ObfuscatedName("dl.q")
    public static byte[][] field1853 = new byte[250][];

    @ObfuscatedName("dl.l")
    public static byte[][] field1855 = new byte[50][];

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.e(IS)[B")
    public static synchronized byte[] method2350(int arg0) {
        if (arg0 == 100 && field1851 > 0) {
            byte[] var1 = field1852[--field1851];
            field1852[field1851] = null;
            return var1;
        } else if (arg0 == 5000 && field1850 > 0) {
            byte[] var2 = field1853[--field1850];
            field1853[field1850] = null;
            return var2;
        } else if (arg0 == 30000 && field1856 > 0) {
            byte[] var3 = field1855[--field1856];
            field1855[field1856] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
