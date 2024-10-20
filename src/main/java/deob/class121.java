package deob;

@ObfuscatedName("dj")
public class class121 {

    @ObfuscatedName("dj.l")
    public static int field2003 = 0;

    @ObfuscatedName("dj.e")
    public static int field1999 = 0;

    @ObfuscatedName("dj.q")
    public static int field1996 = 0;

    @ObfuscatedName("dj.o")
    public static byte[][] field1997 = new byte[1000][];

    @ObfuscatedName("dj.g")
    public static byte[][] field1995 = new byte[250][];

    @ObfuscatedName("dj.m")
    public static byte[][] field1994 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.l(IB)[B")
    public static synchronized byte[] method2616(int arg0) {
        if (arg0 == 100 && field2003 > 0) {
            byte[] var1 = field1997[--field2003];
            field1997[field2003] = null;
            return var1;
        } else if (arg0 == 5000 && field1999 > 0) {
            byte[] var2 = field1995[--field1999];
            field1995[field1999] = null;
            return var2;
        } else if (arg0 == 30000 && field1996 > 0) {
            byte[] var3 = field1994[--field1996];
            field1994[field1996] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
