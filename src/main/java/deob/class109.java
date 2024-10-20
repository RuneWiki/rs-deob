package deob;

@ObfuscatedName("dz")
public class class109 {

    @ObfuscatedName("dz.e")
    public static int field1850 = 0;

    @ObfuscatedName("dz.v")
    public static int field1851 = 0;

    @ObfuscatedName("dz.i")
    public static int field1861 = 0;

    @ObfuscatedName("dz.g")
    public static byte[][] field1855 = new byte[1000][];

    @ObfuscatedName("dz.x")
    public static byte[][] field1854 = new byte[250][];

    @ObfuscatedName("dz.b")
    public static byte[][] field1860 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.e(IB)[B")
    public static synchronized byte[] method2354(int arg0) {
        if (arg0 == 100 && field1850 > 0) {
            byte[] var1 = field1855[--field1850];
            field1855[field1850] = null;
            return var1;
        } else if (arg0 == 5000 && field1851 > 0) {
            byte[] var2 = field1854[--field1851];
            field1854[field1851] = null;
            return var2;
        } else if (arg0 == 30000 && field1861 > 0) {
            byte[] var3 = field1860[--field1861];
            field1860[field1861] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
