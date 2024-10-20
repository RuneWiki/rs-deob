package deob;

@ObfuscatedName("ds")
public class class122 {

    @ObfuscatedName("ds.e")
    public static int field1994 = 0;

    @ObfuscatedName("ds.w")
    public static int field1996 = 0;

    @ObfuscatedName("ds.f")
    public static int field1991 = 0;

    @ObfuscatedName("ds.s")
    public static byte[][] field1992 = new byte[1000][];

    @ObfuscatedName("ds.p")
    public static byte[][] field1993 = new byte[250][];

    @ObfuscatedName("ds.h")
    public static byte[][] field1990 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.e(II)[B")
    public static synchronized byte[] method2583(int arg0) {
        if (arg0 == 100 && field1994 > 0) {
            byte[] var1 = field1992[--field1994];
            field1992[field1994] = null;
            return var1;
        } else if (arg0 == 5000 && field1996 > 0) {
            byte[] var2 = field1993[--field1996];
            field1993[field1996] = null;
            return var2;
        } else if (arg0 == 30000 && field1991 > 0) {
            byte[] var3 = field1990[--field1991];
            field1990[field1991] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
