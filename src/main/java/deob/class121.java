package deob;

@ObfuscatedName("df")
public class class121 {

    @ObfuscatedName("df.j")
    public static int field2004 = 0;

    @ObfuscatedName("df.l")
    public static int field2003 = 0;

    @ObfuscatedName("df.a")
    public static int field2006 = 0;

    @ObfuscatedName("df.i")
    public static byte[][] field2005 = new byte[1000][];

    @ObfuscatedName("df.f")
    public static byte[][] field2008 = new byte[250][];

    @ObfuscatedName("df.m")
    public static byte[][] field2002 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.j(IB)[B")
    public static synchronized byte[] method2541(int arg0) {
        if (arg0 == 100 && field2004 > 0) {
            byte[] var1 = field2005[--field2004];
            field2005[field2004] = null;
            return var1;
        } else if (arg0 == 5000 && field2003 > 0) {
            byte[] var2 = field2008[--field2003];
            field2008[field2003] = null;
            return var2;
        } else if (arg0 == 30000 && field2006 > 0) {
            byte[] var3 = field2002[--field2006];
            field2002[field2006] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
