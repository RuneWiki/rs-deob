package deob;

@ObfuscatedName("di")
public class class109 {

    @ObfuscatedName("di.y")
    public static int field1864 = 0;

    @ObfuscatedName("di.u")
    public static int field1859 = 0;

    @ObfuscatedName("di.k")
    public static int field1860 = 0;

    @ObfuscatedName("di.v")
    public static byte[][] field1861 = new byte[1000][];

    @ObfuscatedName("di.l")
    public static byte[][] field1858 = new byte[250][];

    @ObfuscatedName("di.g")
    public static byte[][] field1863 = new byte[50][];

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.y(II)[B")
    public static synchronized byte[] method2328(int arg0) {
        if (arg0 == 100 && field1864 > 0) {
            byte[] var1 = field1861[--field1864];
            field1861[field1864] = null;
            return var1;
        } else if (arg0 == 5000 && field1859 > 0) {
            byte[] var2 = field1858[--field1859];
            field1858[field1859] = null;
            return var2;
        } else if (arg0 == 30000 && field1860 > 0) {
            byte[] var3 = field1863[--field1860];
            field1863[field1860] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
