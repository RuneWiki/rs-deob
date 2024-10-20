package deob;

@ObfuscatedName("dv")
public class class122 {

    @ObfuscatedName("dv.t")
    public static int field2014 = 0;

    @ObfuscatedName("dv.i")
    public static int field2011 = 0;

    @ObfuscatedName("dv.g")
    public static int field2018 = 0;

    @ObfuscatedName("dv.h")
    public static byte[][] field2019 = new byte[1000][];

    @ObfuscatedName("dv.z")
    public static byte[][] field2015 = new byte[250][];

    @ObfuscatedName("dv.r")
    public static byte[][] field2016 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.t(II)[B")
    public static synchronized byte[] method2543(int arg0) {
        if (arg0 == 100 && field2014 > 0) {
            byte[] var1 = field2019[--field2014];
            field2019[field2014] = null;
            return var1;
        } else if (arg0 == 5000 && field2011 > 0) {
            byte[] var2 = field2015[--field2011];
            field2015[field2011] = null;
            return var2;
        } else if (arg0 == 30000 && field2018 > 0) {
            byte[] var3 = field2016[--field2018];
            field2016[field2018] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
