package deob;

@ObfuscatedName("df")
public class class121 {

    @ObfuscatedName("df.i")
    public static int field1988 = 0;

    @ObfuscatedName("df.v")
    public static int field1989 = 0;

    @ObfuscatedName("df.r")
    public static int field1990 = 0;

    @ObfuscatedName("df.n")
    public static byte[][] field1991 = new byte[1000][];

    @ObfuscatedName("df.x")
    public static byte[][] field1992 = new byte[250][];

    @ObfuscatedName("df.q")
    public static byte[][] field1993 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.i(IB)[B")
    public static synchronized byte[] method2569(int arg0) {
        if (arg0 == 100 && field1988 > 0) {
            byte[] var1 = field1991[--field1988];
            field1991[field1988] = null;
            return var1;
        } else if (arg0 == 5000 && field1989 > 0) {
            byte[] var2 = field1992[--field1989];
            field1992[field1989] = null;
            return var2;
        } else if (arg0 == 30000 && field1990 > 0) {
            byte[] var3 = field1993[--field1990];
            field1993[field1990] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
