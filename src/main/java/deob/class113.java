package deob;

@ObfuscatedName("do")
public class class113 {

    @ObfuscatedName("do.p")
    public static int field1891 = 0;

    @ObfuscatedName("do.k")
    public static int field1892 = 0;

    @ObfuscatedName("do.e")
    public static int field1890 = 0;

    @ObfuscatedName("do.f")
    public static byte[][] field1893 = new byte[1000][];

    @ObfuscatedName("do.w")
    public static byte[][] field1894 = new byte[250][];

    @ObfuscatedName("do.t")
    public static byte[][] field1895 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.p(II)[B")
    public static synchronized byte[] method2408(int arg0) {
        if (arg0 == 100 && field1891 > 0) {
            byte[] var1 = field1893[--field1891];
            field1893[field1891] = null;
            return var1;
        } else if (arg0 == 5000 && field1892 > 0) {
            byte[] var2 = field1894[--field1892];
            field1894[field1892] = null;
            return var2;
        } else if (arg0 == 30000 && field1890 > 0) {
            byte[] var3 = field1895[--field1890];
            field1895[field1890] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
