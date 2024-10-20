package deob;

@ObfuscatedName("dt")
public class class113 {

    @ObfuscatedName("dt.b")
    public static int field1906 = 0;

    @ObfuscatedName("dt.e")
    public static int field1900 = 0;

    @ObfuscatedName("dt.a")
    public static int field1901 = 0;

    @ObfuscatedName("dt.k")
    public static byte[][] field1907 = new byte[1000][];

    @ObfuscatedName("dt.p")
    public static byte[][] field1903 = new byte[250][];

    @ObfuscatedName("dt.l")
    public static byte[][] field1904 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.b(II)[B")
    public static synchronized byte[] method2371(int arg0) {
        if (arg0 == 100 && field1906 > 0) {
            byte[] var1 = field1907[--field1906];
            field1907[field1906] = null;
            return var1;
        } else if (arg0 == 5000 && field1900 > 0) {
            byte[] var2 = field1903[--field1900];
            field1903[field1900] = null;
            return var2;
        } else if (arg0 == 30000 && field1901 > 0) {
            byte[] var3 = field1904[--field1901];
            field1904[field1901] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
