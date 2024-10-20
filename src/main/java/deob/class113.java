package deob;

@ObfuscatedName("dj")
public class class113 {

    @ObfuscatedName("dj.c")
    public static int field1904 = 0;

    @ObfuscatedName("dj.j")
    public static int field1912 = 0;

    @ObfuscatedName("dj.f")
    public static int field1906 = 0;

    @ObfuscatedName("dj.y")
    public static byte[][] field1907 = new byte[1000][];

    @ObfuscatedName("dj.x")
    public static byte[][] field1911 = new byte[250][];

    @ObfuscatedName("dj.e")
    public static byte[][] field1909 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.c(IS)[B")
    public static synchronized byte[] method2190(int arg0) {
        if (arg0 == 100 && field1904 > 0) {
            byte[] var1 = field1907[--field1904];
            field1907[field1904] = null;
            return var1;
        } else if (arg0 == 5000 && field1912 > 0) {
            byte[] var2 = field1911[--field1912];
            field1911[field1912] = null;
            return var2;
        } else if (arg0 == 30000 && field1906 > 0) {
            byte[] var3 = field1909[--field1906];
            field1909[field1906] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
