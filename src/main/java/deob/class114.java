package deob;

@ObfuscatedName("dk")
public class class114 {

    @ObfuscatedName("dk.j")
    public static int field1929 = 0;

    @ObfuscatedName("dk.f")
    public static int field1924 = 0;

    @ObfuscatedName("dk.o")
    public static int field1926 = 0;

    @ObfuscatedName("dk.h")
    public static byte[][] field1928 = new byte[1000][];

    @ObfuscatedName("dk.u")
    public static byte[][] field1927 = new byte[250][];

    @ObfuscatedName("dk.a")
    public static byte[][] field1923 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.j(II)[B")
    public static synchronized byte[] method2320(int arg0) {
        if (arg0 == 100 && field1929 > 0) {
            byte[] var1 = field1928[--field1929];
            field1928[field1929] = null;
            return var1;
        } else if (arg0 == 5000 && field1924 > 0) {
            byte[] var2 = field1927[--field1924];
            field1927[field1924] = null;
            return var2;
        } else if (arg0 == 30000 && field1926 > 0) {
            byte[] var3 = field1923[--field1926];
            field1923[field1926] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
