package deob;

@ObfuscatedName("dn")
public class class110 {

    @ObfuscatedName("dn.g")
    public static int field1829 = 0;

    @ObfuscatedName("dn.j")
    public static int field1833 = 0;

    @ObfuscatedName("dn.z")
    public static int field1831 = 0;

    @ObfuscatedName("dn.b")
    public static byte[][] field1830 = new byte[1000][];

    @ObfuscatedName("dn.k")
    public static byte[][] field1840 = new byte[250][];

    @ObfuscatedName("dn.c")
    public static byte[][] field1834 = new byte[50][];

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.g(IB)[B")
    public static synchronized byte[] method2307(int arg0) {
        if (arg0 == 100 && field1829 > 0) {
            byte[] var1 = field1830[--field1829];
            field1830[field1829] = null;
            return var1;
        } else if (arg0 == 5000 && field1833 > 0) {
            byte[] var2 = field1840[--field1833];
            field1840[field1833] = null;
            return var2;
        } else if (arg0 == 30000 && field1831 > 0) {
            byte[] var3 = field1834[--field1831];
            field1834[field1831] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
