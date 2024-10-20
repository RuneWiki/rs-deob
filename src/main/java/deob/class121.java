package deob;

@ObfuscatedName("dr")
public class class121 {

    @ObfuscatedName("dr.f")
    public static int field2009 = 0;

    @ObfuscatedName("dr.s")
    public static int field2002 = 0;

    @ObfuscatedName("dr.q")
    public static int field2001 = 0;

    @ObfuscatedName("dr.g")
    public static byte[][] field2004 = new byte[1000][];

    @ObfuscatedName("dr.m")
    public static byte[][] field2005 = new byte[250][];

    @ObfuscatedName("dr.t")
    public static byte[][] field2010 = new byte[50][];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.f(II)[B")
    public static synchronized byte[] method2596(int arg0) {
        if (arg0 == 100 && field2009 > 0) {
            byte[] var1 = field2004[--field2009];
            field2004[field2009] = null;
            return var1;
        } else if (arg0 == 5000 && field2002 > 0) {
            byte[] var2 = field2005[--field2002];
            field2005[field2002] = null;
            return var2;
        } else if (arg0 == 30000 && field2001 > 0) {
            byte[] var3 = field2010[--field2001];
            field2010[field2001] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
