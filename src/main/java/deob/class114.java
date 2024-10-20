package deob;

@ObfuscatedName("dy")
public class class114 {

    @ObfuscatedName("dy.b")
    public static int field1919 = 0;

    @ObfuscatedName("dy.e")
    public static int field1918 = 0;

    @ObfuscatedName("dy.g")
    public static int field1923 = 0;

    @ObfuscatedName("dy.o")
    public static byte[][] field1917 = new byte[1000][];

    @ObfuscatedName("dy.a")
    public static byte[][] field1914 = new byte[250][];

    @ObfuscatedName("dy.h")
    public static byte[][] field1916 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.b(II)[B")
    public static synchronized byte[] method2295(int arg0) {
        if (arg0 == 100 && field1919 > 0) {
            byte[] var1 = field1917[--field1919];
            field1917[field1919] = null;
            return var1;
        } else if (arg0 == 5000 && field1918 > 0) {
            byte[] var2 = field1914[--field1918];
            field1914[field1918] = null;
            return var2;
        } else if (arg0 == 30000 && field1923 > 0) {
            byte[] var3 = field1916[--field1923];
            field1916[field1923] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
