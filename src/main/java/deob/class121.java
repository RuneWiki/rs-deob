package deob;

@ObfuscatedName("dd")
public class class121 {

    @ObfuscatedName("dd.n")
    public static int field1993 = 0;

    @ObfuscatedName("dd.q")
    public static int field1991 = 0;

    @ObfuscatedName("dd.c")
    public static int field1992 = 0;

    @ObfuscatedName("dd.l")
    public static byte[][] field1996 = new byte[1000][];

    @ObfuscatedName("dd.r")
    public static byte[][] field1994 = new byte[250][];

    @ObfuscatedName("dd.u")
    public static byte[][] field1995 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.n(IB)[B")
    public static synchronized byte[] method2587(int arg0) {
        if (arg0 == 100 && field1993 > 0) {
            byte[] var1 = field1996[--field1993];
            field1996[field1993] = null;
            return var1;
        } else if (arg0 == 5000 && field1991 > 0) {
            byte[] var2 = field1994[--field1991];
            field1994[field1991] = null;
            return var2;
        } else if (arg0 == 30000 && field1992 > 0) {
            byte[] var3 = field1995[--field1992];
            field1995[field1992] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
