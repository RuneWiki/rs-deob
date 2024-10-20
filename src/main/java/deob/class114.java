package deob;

@ObfuscatedName("dd")
public class class114 {

    @ObfuscatedName("dd.g")
    public static int field1922 = 0;

    @ObfuscatedName("dd.h")
    public static int field1920 = 0;

    @ObfuscatedName("dd.s")
    public static int field1917 = 0;

    @ObfuscatedName("dd.o")
    public static byte[][] field1918 = new byte[1000][];

    @ObfuscatedName("dd.p")
    public static byte[][] field1919 = new byte[250][];

    @ObfuscatedName("dd.x")
    public static byte[][] field1915 = new byte[50][];

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.g(IB)[B")
    public static synchronized byte[] method2352(int arg0) {
        if (arg0 == 100 && field1922 > 0) {
            byte[] var1 = field1918[--field1922];
            field1918[field1922] = null;
            return var1;
        } else if (arg0 == 5000 && field1920 > 0) {
            byte[] var2 = field1919[--field1920];
            field1919[field1920] = null;
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
