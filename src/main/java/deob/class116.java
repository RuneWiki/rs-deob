package deob;

@ObfuscatedName("dm")
public class class116 {

    @ObfuscatedName("dm.j")
    public static int field1900 = 0;

    @ObfuscatedName("dm.y")
    public static int field1905 = 0;

    @ObfuscatedName("dm.z")
    public static int field1902 = 0;

    @ObfuscatedName("dm.l")
    public static byte[][] field1903 = new byte[1000][];

    @ObfuscatedName("dm.w")
    public static byte[][] field1904 = new byte[250][];

    @ObfuscatedName("dm.d")
    public static byte[][] field1906 = new byte[50][];

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.j(IB)[B")
    public static synchronized byte[] method2566(int arg0) {
        if (arg0 == 100 && field1900 > 0) {
            byte[] var1 = field1903[--field1900];
            field1903[field1900] = null;
            return var1;
        } else if (arg0 == 5000 && field1905 > 0) {
            byte[] var2 = field1904[--field1905];
            field1904[field1905] = null;
            return var2;
        } else if (arg0 == 30000 && field1902 > 0) {
            byte[] var3 = field1906[--field1902];
            field1906[field1902] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
