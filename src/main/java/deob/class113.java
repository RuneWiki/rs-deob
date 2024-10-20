package deob;

@ObfuscatedName("da")
public class class113 {

    @ObfuscatedName("da.z")
    public static int field1918 = 0;

    @ObfuscatedName("da.h")
    public static int field1913 = 0;

    @ObfuscatedName("da.c")
    public static int field1914 = 0;

    @ObfuscatedName("da.p")
    public static byte[][] field1915 = new byte[1000][];

    @ObfuscatedName("da.i")
    public static byte[][] field1916 = new byte[250][];

    @ObfuscatedName("da.v")
    public static byte[][] field1917 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.z(II)[B")
    public static synchronized byte[] method2298(int arg0) {
        if (arg0 == 100 && field1918 > 0) {
            byte[] var1 = field1915[--field1918];
            field1915[field1918] = null;
            return var1;
        } else if (arg0 == 5000 && field1913 > 0) {
            byte[] var2 = field1916[--field1913];
            field1916[field1913] = null;
            return var2;
        } else if (arg0 == 30000 && field1914 > 0) {
            byte[] var3 = field1917[--field1914];
            field1917[field1914] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
