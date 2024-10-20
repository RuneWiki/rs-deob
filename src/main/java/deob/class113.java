package deob;

@ObfuscatedName("dg")
public class class113 {

    @ObfuscatedName("dg.n")
    public static int field1897 = 0;

    @ObfuscatedName("dg.o")
    public static int field1901 = 0;

    @ObfuscatedName("dg.a")
    public static int field1906 = 0;

    @ObfuscatedName("dg.w")
    public static byte[][] field1899 = new byte[1000][];

    @ObfuscatedName("dg.m")
    public static byte[][] field1900 = new byte[250][];

    @ObfuscatedName("dg.h")
    public static byte[][] field1898 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.n(II)[B")
    public static synchronized byte[] method2487(int arg0) {
        if (arg0 == 100 && field1897 > 0) {
            byte[] var1 = field1899[--field1897];
            field1899[field1897] = null;
            return var1;
        } else if (arg0 == 5000 && field1901 > 0) {
            byte[] var2 = field1900[--field1901];
            field1900[field1901] = null;
            return var2;
        } else if (arg0 == 30000 && field1906 > 0) {
            byte[] var3 = field1898[--field1906];
            field1898[field1906] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
