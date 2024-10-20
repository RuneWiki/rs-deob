package deob;

@ObfuscatedName("ds")
public class class109 {

    @ObfuscatedName("ds.e")
    public static int field1854 = 0;

    @ObfuscatedName("ds.o")
    public static int field1858 = 0;

    @ObfuscatedName("ds.y")
    public static int field1862 = 0;

    @ObfuscatedName("ds.b")
    public static byte[][] field1857 = new byte[1000][];

    @ObfuscatedName("ds.w")
    public static byte[][] field1855 = new byte[250][];

    @ObfuscatedName("ds.r")
    public static byte[][] field1859 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.e(II)[B")
    public static synchronized byte[] method2291(int arg0) {
        if (arg0 == 100 && field1854 > 0) {
            byte[] var1 = field1857[--field1854];
            field1857[field1854] = null;
            return var1;
        } else if (arg0 == 5000 && field1858 > 0) {
            byte[] var2 = field1855[--field1858];
            field1855[field1858] = null;
            return var2;
        } else if (arg0 == 30000 && field1862 > 0) {
            byte[] var3 = field1859[--field1862];
            field1859[field1862] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
