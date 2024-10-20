package deob;

@ObfuscatedName("ds")
public class class109 {

    @ObfuscatedName("ds.k")
    public static int field1882 = 0;

    @ObfuscatedName("ds.r")
    public static int field1874 = 0;

    @ObfuscatedName("ds.y")
    public static int field1875 = 0;

    @ObfuscatedName("ds.w")
    public static byte[][] field1876 = new byte[1000][];

    @ObfuscatedName("ds.m")
    public static byte[][] field1881 = new byte[250][];

    @ObfuscatedName("ds.j")
    public static byte[][] field1878 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.k(II)[B")
    public static synchronized byte[] method2337(int arg0) {
        if (arg0 == 100 && field1882 > 0) {
            byte[] var1 = field1876[--field1882];
            field1876[field1882] = null;
            return var1;
        } else if (arg0 == 5000 && field1874 > 0) {
            byte[] var2 = field1881[--field1874];
            field1881[field1874] = null;
            return var2;
        } else if (arg0 == 30000 && field1875 > 0) {
            byte[] var3 = field1878[--field1875];
            field1878[field1875] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
