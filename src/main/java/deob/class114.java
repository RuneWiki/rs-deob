package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("br")
public final class class114 {

    @ObfuscatedName("br.b")
    public static byte[] field1899 = new byte[520];

    @ObfuscatedName("br.k")
    public class166 field1897 = null;

    @ObfuscatedName("br.h")
    public class166 field1903 = null;

    @ObfuscatedName("br.w")
    public int field1900;

    @ObfuscatedName("br.t")
    public int field1901 = 65000;

    public class114(int arg0, class166 arg1, class166 arg2, int arg3) {
        this.field1900 = arg0;
        this.field1903 = arg1;
        this.field1897 = arg2;
        this.field1901 = arg3;
    }

    @ObfuscatedName("br.b(IS)[B")
    public byte[] method2054(int arg0) {
        class166 var2 = this.field1903;
        synchronized (this.field1903) {
            Object var10000;
            try {
                if (this.field1897.method2878() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1897.method2877((long) (arg0 * 6));
                this.field1897.method2880(field1899, 0, 6);
                int var3 = (field1899[2] & 0xFF) + ((field1899[0] & 0xFF) << 16) + ((field1899[1] & 0xFF) << 8);
                int var4 = (field1899[5] & 0xFF) + ((field1899[4] & 0xFF) << 8) + ((field1899[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1901) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1903.method2878() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1903.method2877((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1903.method2880(field1899, 0, var8 + 8);
                        int var9 = ((field1899[0] & 0xFF) << 8) + (field1899[1] & 0xFF);
                        int var10 = ((field1899[2] & 0xFF) << 8) + (field1899[3] & 0xFF);
                        int var11 = (field1899[6] & 0xFF) + ((field1899[5] & 0xFF) << 8) + ((field1899[4] & 0xFF) << 16);
                        int var12 = field1899[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1900 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1903.method2878() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1899[var13 + 8];
                        }
                        var4 = var11;
                        var7++;
                    }
                    byte[] var18 = var5;
                    return var18;
                }
                var10000 = null;
            } catch (IOException var16) {
                return null;
            }
            return (byte[]) var10000;
        }
    }

    @ObfuscatedName("br.h(I[BII)Z")
    public boolean method2055(int arg0, byte[] arg1, int arg2) {
        class166 var4 = this.field1903;
        synchronized (this.field1903) {
            if (arg2 < 0 || arg2 > this.field1901) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2056(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2056(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("br.k(I[BIZI)Z")
    public boolean method2056(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class166 var5 = this.field1903;
        synchronized (this.field1903) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1897.method2878() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1897.method2877((long) (arg0 * 6));
                    this.field1897.method2880(field1899, 0, 6);
                    var6 = (field1899[5] & 0xFF) + ((field1899[4] & 0xFF) << 8) + ((field1899[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1903.method2878() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1903.method2878() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1899[0] = (byte) (arg2 >> 16);
                field1899[1] = (byte) (arg2 >> 8);
                field1899[2] = (byte) arg2;
                field1899[3] = (byte) (var6 >> 16);
                field1899[4] = (byte) (var6 >> 8);
                field1899[5] = (byte) var6;
                this.field1897.method2877((long) (arg0 * 6));
                this.field1897.method2883(field1899, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1903.method2877((long) (var6 * 520));
                                try {
                                    this.field1903.method2880(field1899, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1899[0] & 0xFF) << 8) + (field1899[1] & 0xFF);
                                int var12 = ((field1899[2] & 0xFF) << 8) + (field1899[3] & 0xFF);
                                var9 = (field1899[6] & 0xFF) + ((field1899[5] & 0xFF) << 8) + ((field1899[4] & 0xFF) << 16);
                                int var13 = field1899[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1900 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1903.method2878() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1903.method2878() + 519L) / 520L);
                                if (var9 == 0) {
                                    var9++;
                                }
                                if (var6 == var9) {
                                    var9++;
                                }
                            }
                            if (arg2 - var7 <= 512) {
                                var9 = 0;
                            }
                            field1899[0] = (byte) (arg0 >> 8);
                            field1899[1] = (byte) arg0;
                            field1899[2] = (byte) (var8 >> 8);
                            field1899[3] = (byte) var8;
                            field1899[4] = (byte) (var9 >> 16);
                            field1899[5] = (byte) (var9 >> 8);
                            field1899[6] = (byte) var9;
                            field1899[7] = (byte) this.field1900;
                            this.field1903.method2877((long) (var6 * 520));
                            this.field1903.method2883(field1899, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1903.method2883(arg1, var7, var14);
                            var7 += var14;
                            var6 = var9;
                            var8++;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var18) {
                return false;
            }
        }
    }
}
