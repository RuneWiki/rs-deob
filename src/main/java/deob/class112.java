package deob;

@ObfuscatedName("di")
public class class112 {

    @ObfuscatedName("di.b")
    public static int field1867 = 0;

    @ObfuscatedName("di.e")
    public static int field1866 = 0;

    @ObfuscatedName("di.i")
    public static int field1864 = 0;

    @ObfuscatedName("di.k")
    public static byte[][] field1874 = new byte[1000][];

    @ObfuscatedName("di.h")
    public static byte[][] field1865 = new byte[250][];

    @ObfuscatedName("di.p")
    public static byte[][] field1869 = new byte[50][];

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.b(IB)[B")
    public static synchronized byte[] method2362(int arg0) {
        if (arg0 == 100 && field1867 > 0) {
            byte[] var1 = field1874[--field1867];
            field1874[field1867] = null;
            return var1;
        } else if (arg0 == 5000 && field1866 > 0) {
            byte[] var2 = field1865[--field1866];
            field1865[field1866] = null;
            return var2;
        } else if (arg0 == 30000 && field1864 > 0) {
            byte[] var3 = field1869[--field1864];
            field1869[field1864] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
