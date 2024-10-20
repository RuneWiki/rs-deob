package deob;

@ObfuscatedName("dg")
public class class121 {

    @ObfuscatedName("dg.n")
    public static int field1990 = 0;

    @ObfuscatedName("dg.d")
    public static int field1992 = 0;

    @ObfuscatedName("dg.s")
    public static int field1986 = 0;

    @ObfuscatedName("dg.q")
    public static byte[][] field1988 = new byte[1000][];

    @ObfuscatedName("dg.j")
    public static byte[][] field1989 = new byte[250][];

    @ObfuscatedName("dg.k")
    public static byte[][] field1993 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.n(II)[B")
    public static synchronized byte[] method2571(int arg0) {
        if (arg0 == 100 && field1990 > 0) {
            byte[] var1 = field1988[--field1990];
            field1988[field1990] = null;
            return var1;
        } else if (arg0 == 5000 && field1992 > 0) {
            byte[] var2 = field1989[--field1992];
            field1989[field1992] = null;
            return var2;
        } else if (arg0 == 30000 && field1986 > 0) {
            byte[] var3 = field1993[--field1986];
            field1993[field1986] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
