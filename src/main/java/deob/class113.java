package deob;

@ObfuscatedName("de")
public class class113 {

    @ObfuscatedName("de.y")
    public static int field1905 = 0;

    @ObfuscatedName("de.k")
    public static int field1909 = 0;

    @ObfuscatedName("de.g")
    public static int field1906 = 0;

    @ObfuscatedName("de.n")
    public static byte[][] field1907 = new byte[1000][];

    @ObfuscatedName("de.t")
    public static byte[][] field1904 = new byte[250][];

    @ObfuscatedName("de.e")
    public static byte[][] field1908 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.y(IS)[B")
    public static synchronized byte[] method2409(int arg0) {
        if (arg0 == 100 && field1905 > 0) {
            byte[] var1 = field1907[--field1905];
            field1907[field1905] = null;
            return var1;
        } else if (arg0 == 5000 && field1909 > 0) {
            byte[] var2 = field1904[--field1909];
            field1904[field1909] = null;
            return var2;
        } else if (arg0 == 30000 && field1906 > 0) {
            byte[] var3 = field1908[--field1906];
            field1908[field1906] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
