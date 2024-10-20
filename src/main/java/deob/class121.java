package deob;

@ObfuscatedName("db")
public class class121 {

    @ObfuscatedName("db.o")
    public static int field2000 = 0;

    @ObfuscatedName("db.f")
    public static int field1993 = 0;

    @ObfuscatedName("db.i")
    public static int field1992 = 0;

    @ObfuscatedName("db.h")
    public static byte[][] field1995 = new byte[1000][];

    @ObfuscatedName("db.q")
    public static byte[][] field1994 = new byte[250][];

    @ObfuscatedName("db.u")
    public static byte[][] field1990 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.o(II)[B")
    public static synchronized byte[] method2530(int arg0) {
        if (arg0 == 100 && field2000 > 0) {
            byte[] var1 = field1995[--field2000];
            field1995[field2000] = null;
            return var1;
        } else if (arg0 == 5000 && field1993 > 0) {
            byte[] var2 = field1994[--field1993];
            field1994[field1993] = null;
            return var2;
        } else if (arg0 == 30000 && field1992 > 0) {
            byte[] var3 = field1990[--field1992];
            field1990[field1992] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
