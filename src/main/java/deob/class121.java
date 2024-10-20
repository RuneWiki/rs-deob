package deob;

@ObfuscatedName("dg")
public class class121 {

    @ObfuscatedName("dg.v")
    public static int field1998 = 0;

    @ObfuscatedName("dg.f")
    public static int field1990 = 0;

    @ObfuscatedName("dg.i")
    public static int field1995 = 0;

    @ObfuscatedName("dg.d")
    public static byte[][] field1993 = new byte[1000][];

    @ObfuscatedName("dg.o")
    public static byte[][] field1994 = new byte[250][];

    @ObfuscatedName("dg.c")
    public static byte[][] field1991 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.v(II)[B")
    public static synchronized byte[] method2596(int arg0) {
        if (arg0 == 100 && field1998 > 0) {
            byte[] var1 = field1993[--field1998];
            field1993[field1998] = null;
            return var1;
        } else if (arg0 == 5000 && field1990 > 0) {
            byte[] var2 = field1994[--field1990];
            field1994[field1990] = null;
            return var2;
        } else if (arg0 == 30000 && field1995 > 0) {
            byte[] var3 = field1991[--field1995];
            field1991[field1995] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
