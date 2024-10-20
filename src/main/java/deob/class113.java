package deob;

@ObfuscatedName("dn")
public class class113 {

    @ObfuscatedName("dn.v")
    public static int field1923 = 0;

    @ObfuscatedName("dn.f")
    public static int field1916 = 0;

    @ObfuscatedName("dn.n")
    public static int field1917 = 0;

    @ObfuscatedName("dn.c")
    public static byte[][] field1918 = new byte[1000][];

    @ObfuscatedName("dn.r")
    public static byte[][] field1919 = new byte[250][];

    @ObfuscatedName("dn.k")
    public static byte[][] field1915 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.v(II)[B")
    public static synchronized byte[] method2326(int arg0) {
        if (arg0 == 100 && field1923 > 0) {
            byte[] var1 = field1918[--field1923];
            field1918[field1923] = null;
            return var1;
        } else if (arg0 == 5000 && field1916 > 0) {
            byte[] var2 = field1919[--field1916];
            field1919[field1916] = null;
            return var2;
        } else if (arg0 == 30000 && field1917 > 0) {
            byte[] var3 = field1915[--field1917];
            field1915[field1917] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
