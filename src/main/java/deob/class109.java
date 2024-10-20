package deob;

@ObfuscatedName("dn")
public class class109 {

    @ObfuscatedName("dn.g")
    public static int field1856 = 0;

    @ObfuscatedName("dn.i")
    public static int field1852 = 0;

    @ObfuscatedName("dn.k")
    public static int field1853 = 0;

    @ObfuscatedName("dn.e")
    public static byte[][] field1854 = new byte[1000][];

    @ObfuscatedName("dn.w")
    public static byte[][] field1851 = new byte[250][];

    @ObfuscatedName("dn.m")
    public static byte[][] field1857 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.g(IB)[B")
    public static synchronized byte[] method2327(int arg0) {
        if (arg0 == 100 && field1856 > 0) {
            byte[] var1 = field1854[--field1856];
            field1854[field1856] = null;
            return var1;
        } else if (arg0 == 5000 && field1852 > 0) {
            byte[] var2 = field1851[--field1852];
            field1851[field1852] = null;
            return var2;
        } else if (arg0 == 30000 && field1853 > 0) {
            byte[] var3 = field1857[--field1853];
            field1857[field1853] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
