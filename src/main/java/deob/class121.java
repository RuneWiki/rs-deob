package deob;

@ObfuscatedName("dm")
public class class121 {

    @ObfuscatedName("dm.y")
    public static int field1986 = 0;

    @ObfuscatedName("dm.d")
    public static int field1984 = 0;

    @ObfuscatedName("dm.g")
    public static int field1983 = 0;

    @ObfuscatedName("dm.w")
    public static byte[][] field1985 = new byte[1000][];

    @ObfuscatedName("dm.e")
    public static byte[][] field1987 = new byte[250][];

    @ObfuscatedName("dm.c")
    public static byte[][] field1988 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.y(IB)[B")
    public static synchronized byte[] method2568(int arg0) {
        if (arg0 == 100 && field1986 > 0) {
            byte[] var1 = field1985[--field1986];
            field1985[field1986] = null;
            return var1;
        } else if (arg0 == 5000 && field1984 > 0) {
            byte[] var2 = field1987[--field1984];
            field1987[field1984] = null;
            return var2;
        } else if (arg0 == 30000 && field1983 > 0) {
            byte[] var3 = field1988[--field1983];
            field1988[field1983] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
