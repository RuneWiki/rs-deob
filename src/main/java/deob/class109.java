package deob;

@ObfuscatedName("dc")
public class class109 {

    @ObfuscatedName("dc.n")
    public static int field1838 = 0;

    @ObfuscatedName("dc.x")
    public static int field1842 = 0;

    @ObfuscatedName("dc.k")
    public static int field1839 = 0;

    @ObfuscatedName("dc.i")
    public static byte[][] field1840 = new byte[1000][];

    @ObfuscatedName("dc.d")
    public static byte[][] field1841 = new byte[250][];

    @ObfuscatedName("dc.q")
    public static byte[][] field1837 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.n(IS)[B")
    public static synchronized byte[] method2343(int arg0) {
        if (arg0 == 100 && field1838 > 0) {
            byte[] var1 = field1840[--field1838];
            field1840[field1838] = null;
            return var1;
        } else if (arg0 == 5000 && field1842 > 0) {
            byte[] var2 = field1841[--field1842];
            field1841[field1842] = null;
            return var2;
        } else if (arg0 == 30000 && field1839 > 0) {
            byte[] var3 = field1837[--field1839];
            field1837[field1839] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
