package deob;

@ObfuscatedName("dj")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.m(II)I")
    public static int method761(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }
}
