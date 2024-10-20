package deob;

@ObfuscatedName("dj")
public class class112 {

    @ObfuscatedName("dj.v")
    public static int field1865 = 0;

    @ObfuscatedName("dj.t")
    public static int field1866 = 0;

    @ObfuscatedName("dj.f")
    public static int field1861 = 0;

    @ObfuscatedName("dj.j")
    public static byte[][] field1859 = new byte[1000][];

    @ObfuscatedName("dj.l")
    public static byte[][] field1863 = new byte[250][];

    @ObfuscatedName("dj.g")
    public static byte[][] field1864 = new byte[50][];

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.v(II)[B")
    public static synchronized byte[] method2393(int arg0) {
        if (arg0 == 100 && field1865 > 0) {
            byte[] var1 = field1859[--field1865];
            field1859[field1865] = null;
            return var1;
        } else if (arg0 == 5000 && field1866 > 0) {
            byte[] var2 = field1863[--field1866];
            field1863[field1866] = null;
            return var2;
        } else if (arg0 == 30000 && field1861 > 0) {
            byte[] var3 = field1864[--field1861];
            field1864[field1861] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
