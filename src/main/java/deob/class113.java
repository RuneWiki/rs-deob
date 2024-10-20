package deob;

@ObfuscatedName("du")
public class class113 {

    @ObfuscatedName("du.t")
    public static int field1876 = 0;

    @ObfuscatedName("du.b")
    public static int field1875 = 0;

    @ObfuscatedName("du.p")
    public static int field1878 = 0;

    @ObfuscatedName("du.e")
    public static byte[][] field1874 = new byte[1000][];

    @ObfuscatedName("du.i")
    public static byte[][] field1880 = new byte[250][];

    @ObfuscatedName("du.o")
    public static byte[][] field1879 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.t(II)[B")
    public static synchronized byte[] method2415(int arg0) {
        if (arg0 == 100 && field1876 > 0) {
            byte[] var1 = field1874[--field1876];
            field1874[field1876] = null;
            return var1;
        } else if (arg0 == 5000 && field1875 > 0) {
            byte[] var2 = field1880[--field1875];
            field1880[field1875] = null;
            return var2;
        } else if (arg0 == 30000 && field1878 > 0) {
            byte[] var3 = field1879[--field1878];
            field1879[field1878] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
