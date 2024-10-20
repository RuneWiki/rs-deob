package deob;

@ObfuscatedName("ds")
public class class122 {

    @ObfuscatedName("ds.a")
    public static int field2010 = 0;

    @ObfuscatedName("ds.w")
    public static int field2004 = 0;

    @ObfuscatedName("ds.d")
    public static int field2005 = 0;

    @ObfuscatedName("ds.c")
    public static byte[][] field2006 = new byte[1000][];

    @ObfuscatedName("ds.y")
    public static byte[][] field2007 = new byte[250][];

    @ObfuscatedName("ds.k")
    public static byte[][] field2003 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.a(IB)[B")
    public static synchronized byte[] method2706(int arg0) {
        if (arg0 == 100 && field2010 > 0) {
            byte[] var1 = field2006[--field2010];
            field2006[field2010] = null;
            return var1;
        } else if (arg0 == 5000 && field2004 > 0) {
            byte[] var2 = field2007[--field2004];
            field2007[field2004] = null;
            return var2;
        } else if (arg0 == 30000 && field2005 > 0) {
            byte[] var3 = field2003[--field2005];
            field2003[field2005] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
