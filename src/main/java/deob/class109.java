package deob;

@ObfuscatedName("do")
public class class109 {

    @ObfuscatedName("do.e")
    public static int field1857 = 0;

    @ObfuscatedName("do.p")
    public static int field1853 = 0;

    @ObfuscatedName("do.a")
    public static int field1854 = 0;

    @ObfuscatedName("do.g")
    public static byte[][] field1852 = new byte[1000][];

    @ObfuscatedName("do.u")
    public static byte[][] field1855 = new byte[250][];

    @ObfuscatedName("do.k")
    public static byte[][] field1856 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.e(II)[B")
    public static synchronized byte[] method2368(int arg0) {
        if (arg0 == 100 && field1857 > 0) {
            byte[] var1 = field1852[--field1857];
            field1852[field1857] = null;
            return var1;
        } else if (arg0 == 5000 && field1853 > 0) {
            byte[] var2 = field1855[--field1853];
            field1855[field1853] = null;
            return var2;
        } else if (arg0 == 30000 && field1854 > 0) {
            byte[] var3 = field1856[--field1854];
            field1856[field1854] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
