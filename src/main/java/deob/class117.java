package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dz")
public final class class117 {

    @ObfuscatedName("dz.o")
    public static byte[] field1836 = new byte[520];

    @ObfuscatedName("dz.m")
    public class73 field1837 = null;

    @ObfuscatedName("dz.b")
    public class73 field1830 = null;

    @ObfuscatedName("dz.g")
    public int field1833;

    @ObfuscatedName("dz.h")
    public int field1834 = 65000;

    public class117(int arg0, class73 arg1, class73 arg2, int arg3) {
        this.field1833 = arg0;
        this.field1837 = arg1;
        this.field1830 = arg2;
        this.field1834 = arg3;
    }

    @ObfuscatedName("dz.o(II)[B")
    public byte[] method2040(int arg0) {
        class73 var2 = this.field1837;
        synchronized (this.field1837) {
            Object var10000;
            try {
                if (this.field1830.method1278() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1830.method1277((long) (arg0 * 6));
                this.field1830.method1280(field1836, 0, 6);
                int var3 = (field1836[2] & 0xFF) + ((field1836[0] & 0xFF) << 16) + ((field1836[1] & 0xFF) << 8);
                int var4 = (field1836[5] & 0xFF) + ((field1836[4] & 0xFF) << 8) + ((field1836[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1834) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1837.method1278() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1837.method1277((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1837.method1280(field1836, 0, var8 + 8);
                        int var9 = ((field1836[0] & 0xFF) << 8) + (field1836[1] & 0xFF);
                        int var10 = ((field1836[2] & 0xFF) << 8) + (field1836[3] & 0xFF);
                        int var11 = (field1836[6] & 0xFF) + ((field1836[5] & 0xFF) << 8) + ((field1836[4] & 0xFF) << 16);
                        int var12 = field1836[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1833 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1837.method1278() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1836[var13 + 8];
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

    @ObfuscatedName("dz.m(I[BIB)Z")
    public boolean method2041(int arg0, byte[] arg1, int arg2) {
        class73 var4 = this.field1837;
        synchronized (this.field1837) {
            if (arg2 < 0 || arg2 > this.field1834) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2039(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2039(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("dz.b(I[BIZI)Z")
    public boolean method2039(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class73 var5 = this.field1837;
        synchronized (this.field1837) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1830.method1278() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1830.method1277((long) (arg0 * 6));
                    this.field1830.method1280(field1836, 0, 6);
                    var6 = (field1836[5] & 0xFF) + ((field1836[4] & 0xFF) << 8) + ((field1836[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1837.method1278() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1837.method1278() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1836[0] = (byte) (arg2 >> 16);
                field1836[1] = (byte) (arg2 >> 8);
                field1836[2] = (byte) arg2;
                field1836[3] = (byte) (var6 >> 16);
                field1836[4] = (byte) (var6 >> 8);
                field1836[5] = (byte) var6;
                this.field1830.method1277((long) (arg0 * 6));
                this.field1830.method1282(field1836, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1837.method1277((long) (var6 * 520));
                                try {
                                    this.field1837.method1280(field1836, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1836[0] & 0xFF) << 8) + (field1836[1] & 0xFF);
                                int var12 = ((field1836[2] & 0xFF) << 8) + (field1836[3] & 0xFF);
                                var9 = (field1836[6] & 0xFF) + ((field1836[4] & 0xFF) << 16) + ((field1836[5] & 0xFF) << 8);
                                int var13 = field1836[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1833 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1837.method1278() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1837.method1278() + 519L) / 520L);
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
                            field1836[0] = (byte) (arg0 >> 8);
                            field1836[1] = (byte) arg0;
                            field1836[2] = (byte) (var8 >> 8);
                            field1836[3] = (byte) var8;
                            field1836[4] = (byte) (var9 >> 16);
                            field1836[5] = (byte) (var9 >> 8);
                            field1836[6] = (byte) var9;
                            field1836[7] = (byte) this.field1833;
                            this.field1837.method1277((long) (var6 * 520));
                            this.field1837.method1282(field1836, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1837.method1282(arg1, var7, var14);
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
