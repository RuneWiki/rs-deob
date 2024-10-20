package deob;

@ObfuscatedName("du")
public class class109 {

    @ObfuscatedName("du.p")
    public static int field1850 = 0;

    @ObfuscatedName("du.g")
    public static int field1843 = 0;

    @ObfuscatedName("du.x")
    public static int field1844 = 0;

    @ObfuscatedName("du.c")
    public static byte[][] field1845 = new byte[1000][];

    @ObfuscatedName("du.n")
    public static byte[][] field1846 = new byte[250][];

    @ObfuscatedName("du.s")
    public static byte[][] field1847 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.p(II)[B")
    public static synchronized byte[] method2403(int arg0) {
        if (arg0 == 100 && field1850 > 0) {
            byte[] var1 = field1845[--field1850];
            field1845[field1850] = null;
            return var1;
        } else if (arg0 == 5000 && field1843 > 0) {
            byte[] var2 = field1846[--field1843];
            field1846[field1843] = null;
            return var2;
        } else if (arg0 == 30000 && field1844 > 0) {
            byte[] var3 = field1847[--field1844];
            field1847[field1844] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
