package deob;

@ObfuscatedName("di")
public class class121 {

    @ObfuscatedName("di.i")
    public static int field1994 = 0;

    @ObfuscatedName("di.v")
    public static int field1992 = 0;

    @ObfuscatedName("di.f")
    public static int field1993 = 0;

    @ObfuscatedName("di.h")
    public static byte[][] field1995 = new byte[1000][];

    @ObfuscatedName("di.a")
    public static byte[][] field1996 = new byte[250][];

    @ObfuscatedName("di.s")
    public static byte[][] field1991 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.i(II)[B")
    public static synchronized byte[] method2543(int arg0) {
        if (arg0 == 100 && field1994 > 0) {
            byte[] var1 = field1995[--field1994];
            field1995[field1994] = null;
            return var1;
        } else if (arg0 == 5000 && field1992 > 0) {
            byte[] var2 = field1996[--field1992];
            field1996[field1992] = null;
            return var2;
        } else if (arg0 == 30000 && field1993 > 0) {
            byte[] var3 = field1991[--field1993];
            field1991[field1993] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
