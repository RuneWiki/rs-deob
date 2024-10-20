package deob;

@ObfuscatedName("dw")
public class class121 {

    @ObfuscatedName("dw.o")
    public static int field1991 = 0;

    @ObfuscatedName("dw.e")
    public static int field1982 = 0;

    @ObfuscatedName("dw.u")
    public static int field1983 = 0;

    @ObfuscatedName("dw.b")
    public static byte[][] field1984 = new byte[1000][];

    @ObfuscatedName("dw.p")
    public static byte[][] field1985 = new byte[250][];

    @ObfuscatedName("dw.s")
    public static byte[][] field1988 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.o(II)[B")
    public static synchronized byte[] method2586(int arg0) {
        if (arg0 == 100 && field1991 > 0) {
            byte[] var1 = field1984[--field1991];
            field1984[field1991] = null;
            return var1;
        } else if (arg0 == 5000 && field1982 > 0) {
            byte[] var2 = field1985[--field1982];
            field1985[field1982] = null;
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
