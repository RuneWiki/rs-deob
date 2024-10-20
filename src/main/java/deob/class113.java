package deob;

@ObfuscatedName("dm")
public class class113 {

    @ObfuscatedName("dm.n")
    public static int field1899 = 0;

    @ObfuscatedName("dm.d")
    public static int field1904 = 0;

    @ObfuscatedName("dm.z")
    public static int field1900 = 0;

    @ObfuscatedName("dm.y")
    public static byte[][] field1901 = new byte[1000][];

    @ObfuscatedName("dm.e")
    public static byte[][] field1902 = new byte[250][];

    @ObfuscatedName("dm.g")
    public static byte[][] field1903 = new byte[50][];

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.n(IB)[B")
    public static synchronized byte[] method2476(int arg0) {
        if (arg0 == 100 && field1899 > 0) {
            byte[] var1 = field1901[--field1899];
            field1901[field1899] = null;
            return var1;
        } else if (arg0 == 5000 && field1904 > 0) {
            byte[] var2 = field1902[--field1904];
            field1902[field1904] = null;
            return var2;
        } else if (arg0 == 30000 && field1900 > 0) {
            byte[] var3 = field1903[--field1900];
            field1903[field1900] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
