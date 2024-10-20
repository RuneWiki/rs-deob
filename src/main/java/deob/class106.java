package deob;

@ObfuscatedName("di")
public class class106 {

    @ObfuscatedName("di.m")
    public static int field1821 = 0;

    @ObfuscatedName("di.k")
    public static int field1822 = 0;

    @ObfuscatedName("di.y")
    public static int field1813 = 0;

    @ObfuscatedName("di.g")
    public static byte[][] field1812 = new byte[1000][];

    @ObfuscatedName("di.r")
    public static byte[][] field1816 = new byte[250][];

    @ObfuscatedName("di.i")
    public static byte[][] field1817 = new byte[50][];

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.m(II)[B")
    public static synchronized byte[] method2369(int arg0) {
        if (arg0 == 100 && field1821 > 0) {
            byte[] var1 = field1812[--field1821];
            field1812[field1821] = null;
            return var1;
        } else if (arg0 == 5000 && field1822 > 0) {
            byte[] var2 = field1816[--field1822];
            field1816[field1822] = null;
            return var2;
        } else if (arg0 == 30000 && field1813 > 0) {
            byte[] var3 = field1817[--field1813];
            field1817[field1813] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
