package deob;

@ObfuscatedName("dd")
public class class113 {

    @ObfuscatedName("dd.n")
    public static int field1909 = 0;

    @ObfuscatedName("dd.g")
    public static int field1906 = 0;

    @ObfuscatedName("dd.a")
    public static int field1908 = 0;

    @ObfuscatedName("dd.m")
    public static byte[][] field1911 = new byte[1000][];

    @ObfuscatedName("dd.s")
    public static byte[][] field1910 = new byte[250][];

    @ObfuscatedName("dd.j")
    public static byte[][] field1912 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.n(II)[B")
    public static synchronized byte[] method2439(int arg0) {
        if (arg0 == 100 && field1909 > 0) {
            byte[] var1 = field1911[--field1909];
            field1911[field1909] = null;
            return var1;
        } else if (arg0 == 5000 && field1906 > 0) {
            byte[] var2 = field1910[--field1906];
            field1910[field1906] = null;
            return var2;
        } else if (arg0 == 30000 && field1908 > 0) {
            byte[] var3 = field1912[--field1908];
            field1912[field1908] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
