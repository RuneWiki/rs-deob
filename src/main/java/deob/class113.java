package deob;

@ObfuscatedName("ds")
public class class113 {

    @ObfuscatedName("ds.q")
    public static int field1871 = 0;

    @ObfuscatedName("ds.s")
    public static int field1860 = 0;

    @ObfuscatedName("ds.h")
    public static int field1862 = 0;

    @ObfuscatedName("ds.e")
    public static byte[][] field1863 = new byte[1000][];

    @ObfuscatedName("ds.n")
    public static byte[][] field1870 = new byte[250][];

    @ObfuscatedName("ds.t")
    public static byte[][] field1865 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.q(II)[B")
    public static synchronized byte[] method2370(int arg0) {
        if (arg0 == 100 && field1871 > 0) {
            byte[] var1 = field1863[--field1871];
            field1863[field1871] = null;
            return var1;
        } else if (arg0 == 5000 && field1860 > 0) {
            byte[] var2 = field1870[--field1860];
            field1870[field1860] = null;
            return var2;
        } else if (arg0 == 30000 && field1862 > 0) {
            byte[] var3 = field1865[--field1862];
            field1865[field1862] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
