package deob;

@ObfuscatedName("dt")
public class class122 {

    @ObfuscatedName("dt.w")
    public static int field2017 = 0;

    @ObfuscatedName("dt.x")
    public static int field2016 = 0;

    @ObfuscatedName("dt.t")
    public static int field2015 = 0;

    @ObfuscatedName("dt.p")
    public static byte[][] field2021 = new byte[1000][];

    @ObfuscatedName("dt.e")
    public static byte[][] field2019 = new byte[250][];

    @ObfuscatedName("dt.y")
    public static byte[][] field2020 = new byte[50][];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.w(II)[B")
    public static synchronized byte[] method2601(int arg0) {
        if (arg0 == 100 && field2017 > 0) {
            byte[] var1 = field2021[--field2017];
            field2021[field2017] = null;
            return var1;
        } else if (arg0 == 5000 && field2016 > 0) {
            byte[] var2 = field2019[--field2016];
            field2019[field2016] = null;
            return var2;
        } else if (arg0 == 30000 && field2015 > 0) {
            byte[] var3 = field2020[--field2015];
            field2020[field2015] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
