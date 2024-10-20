package deob;

@ObfuscatedName("dx")
public class class110 {

    @ObfuscatedName("dx.l")
    public static int field1834 = 0;

    @ObfuscatedName("dx.y")
    public static int field1832 = 0;

    @ObfuscatedName("dx.g")
    public static int field1840 = 0;

    @ObfuscatedName("dx.j")
    public static byte[][] field1829 = new byte[1000][];

    @ObfuscatedName("dx.w")
    public static byte[][] field1833 = new byte[250][];

    @ObfuscatedName("dx.c")
    public static byte[][] field1835 = new byte[50][];

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.l(IS)[B")
    public static synchronized byte[] method2378(int arg0) {
        if (arg0 == 100 && field1834 > 0) {
            byte[] var1 = field1829[--field1834];
            field1829[field1834] = null;
            return var1;
        } else if (arg0 == 5000 && field1832 > 0) {
            byte[] var2 = field1833[--field1832];
            field1833[field1832] = null;
            return var2;
        } else if (arg0 == 30000 && field1840 > 0) {
            byte[] var3 = field1835[--field1840];
            field1835[field1840] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
