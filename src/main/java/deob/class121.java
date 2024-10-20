package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bj")
public final class class121 {

    @ObfuscatedName("bj.o")
    public class167 field1848 = null;

    @ObfuscatedName("bj.j")
    public static byte[] field1852 = new byte[520];

    @ObfuscatedName("bj.h")
    public int field1857 = 65000;

    @ObfuscatedName("bj.t")
    public int field1849;

    @ObfuscatedName("bj.p")
    public class167 field1847 = null;

    @ObfuscatedName("bj.p(I[BII)Z")
    public boolean method2008(int arg0, byte[] arg1, int arg2) {
        class167 var4 = this.field1847;
        synchronized (this.field1847) {
            if (arg2 < 0 || arg2 > this.field1857) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2009(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2009(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    public class121(int arg0, class167 arg1, class167 arg2, int arg3) {
        this.field1849 = arg0;
        this.field1847 = arg1;
        this.field1848 = arg2;
        this.field1857 = arg3;
    }

    @ObfuscatedName("bj.o(I[BIZI)Z")
    public boolean method2009(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class167 var5 = this.field1847;
        synchronized (this.field1847) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1848.method3215() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1848.method3222((long) (arg0 * 6));
                    this.field1848.method3217(field1852, 0, 6);
                    var6 = (field1852[5] & 0xFF) + ((field1852[4] & 0xFF) << 8) + ((field1852[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1847.method3215() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1847.method3215() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1852[0] = (byte) (arg2 >> 16);
                field1852[1] = (byte) (arg2 >> 8);
                field1852[2] = (byte) arg2;
                field1852[3] = (byte) (var6 >> 16);
                field1852[4] = (byte) (var6 >> 8);
                field1852[5] = (byte) var6;
                this.field1848.method3222((long) (arg0 * 6));
                this.field1848.method3219(field1852, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1847.method3222((long) (var6 * 520));
                                try {
                                    this.field1847.method3217(field1852, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1852[0] & 0xFF) << 8) + (field1852[1] & 0xFF);
                                int var12 = ((field1852[2] & 0xFF) << 8) + (field1852[3] & 0xFF);
                                var9 = (field1852[6] & 0xFF) + ((field1852[4] & 0xFF) << 16) + ((field1852[5] & 0xFF) << 8);
                                int var13 = field1852[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1849 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1847.method3215() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1847.method3215() + 519L) / 520L);
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
                            field1852[0] = (byte) (arg0 >> 8);
                            field1852[1] = (byte) arg0;
                            field1852[2] = (byte) (var8 >> 8);
                            field1852[3] = (byte) var8;
                            field1852[4] = (byte) (var9 >> 16);
                            field1852[5] = (byte) (var9 >> 8);
                            field1852[6] = (byte) var9;
                            field1852[7] = (byte) this.field1849;
                            this.field1847.method3222((long) (var6 * 520));
                            this.field1847.method3219(field1852, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1847.method3219(arg1, var7, var14);
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

    @ObfuscatedName("bj.j(II)[B")
    public byte[] method2015(int arg0) {
        class167 var2 = this.field1847;
        synchronized (this.field1847) {
            Object var10000;
            try {
                if (this.field1848.method3215() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1848.method3222((long) (arg0 * 6));
                this.field1848.method3217(field1852, 0, 6);
                int var3 = (field1852[2] & 0xFF) + ((field1852[0] & 0xFF) << 16) + ((field1852[1] & 0xFF) << 8);
                int var4 = (field1852[5] & 0xFF) + ((field1852[3] & 0xFF) << 16) + ((field1852[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field1857) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1847.method3215() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1847.method3222((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1847.method3217(field1852, 0, var8 + 8);
                        int var9 = ((field1852[0] & 0xFF) << 8) + (field1852[1] & 0xFF);
                        int var10 = ((field1852[2] & 0xFF) << 8) + (field1852[3] & 0xFF);
                        int var11 = (field1852[6] & 0xFF) + ((field1852[5] & 0xFF) << 8) + ((field1852[4] & 0xFF) << 16);
                        int var12 = field1852[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1849 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1847.method3215() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1852[var13 + 8];
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
}
