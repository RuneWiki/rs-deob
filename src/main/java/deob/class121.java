package deob;

@ObfuscatedName("df")
public class class121 {

    @ObfuscatedName("df.j")
    public static int field1992 = 0;

    @ObfuscatedName("df.m")
    public static int field1998 = 0;

    @ObfuscatedName("df.f")
    public static int field1994 = 0;

    @ObfuscatedName("df.l")
    public static byte[][] field1993 = new byte[1000][];

    @ObfuscatedName("df.u")
    public static byte[][] field1991 = new byte[250][];

    @ObfuscatedName("df.a")
    public static byte[][] field1995 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.j(II)[B")
    public static synchronized byte[] method2614(int arg0) {
        if (arg0 == 100 && field1992 > 0) {
            byte[] var1 = field1993[--field1992];
            field1993[field1992] = null;
            return var1;
        } else if (arg0 == 5000 && field1998 > 0) {
            byte[] var2 = field1991[--field1998];
            field1991[field1998] = null;
            return var2;
        } else if (arg0 == 30000 && field1994 > 0) {
            byte[] var3 = field1995[--field1994];
            field1995[field1994] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
