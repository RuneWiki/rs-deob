package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dy")
public final class class121 {

    @ObfuscatedName("dy.e")
    public static byte[] field1923 = new byte[520];

    @ObfuscatedName("dy.v")
    public class196 field1920 = null;

    @ObfuscatedName("dy.i")
    public int field1926;

    @ObfuscatedName("dy.g")
    public class196 field1921 = null;

    @ObfuscatedName("dy.x")
    public int field1922 = 65000;

    public class121(int arg0, class196 arg1, class196 arg2, int arg3) {
        this.field1926 = arg0;
        this.field1920 = arg1;
        this.field1921 = arg2;
        this.field1922 = arg3;
    }

    @ObfuscatedName("dy.e(IB)[B")
    public byte[] method2442(int arg0) {
        class196 var2 = this.field1920;
        synchronized (this.field1920) {
            Object var10000;
            try {
                if (this.field1921.method3413() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1921.method3426((long) (arg0 * 6));
                this.field1921.method3414(field1923, 0, 6);
                int var3 = (field1923[2] & 0xFF) + ((field1923[1] & 0xFF) << 8) + ((field1923[0] & 0xFF) << 16);
                int var4 = (field1923[5] & 0xFF) + ((field1923[4] & 0xFF) << 8) + ((field1923[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1922) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1920.method3413() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1920.method3426((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1920.method3414(field1923, 0, var8 + 8);
                        int var9 = ((field1923[0] & 0xFF) << 8) + (field1923[1] & 0xFF);
                        int var10 = ((field1923[2] & 0xFF) << 8) + (field1923[3] & 0xFF);
                        int var11 = (field1923[6] & 0xFF) + ((field1923[5] & 0xFF) << 8) + ((field1923[4] & 0xFF) << 16);
                        int var12 = field1923[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1926 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1920.method3413() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1923[var13 + 8];
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

    @ObfuscatedName("dy.v(I[BII)Z")
    public boolean method2444(int arg0, byte[] arg1, int arg2) {
        class196 var4 = this.field1920;
        synchronized (this.field1920) {
            if (arg2 < 0 || arg2 > this.field1922) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2445(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2445(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("dy.i(I[BIZB)Z")
    public boolean method2445(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class196 var5 = this.field1920;
        synchronized (this.field1920) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1921.method3413() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1921.method3426((long) (arg0 * 6));
                    this.field1921.method3414(field1923, 0, 6);
                    var6 = (field1923[5] & 0xFF) + ((field1923[4] & 0xFF) << 8) + ((field1923[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1920.method3413() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1920.method3413() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1923[0] = (byte) (arg2 >> 16);
                field1923[1] = (byte) (arg2 >> 8);
                field1923[2] = (byte) arg2;
                field1923[3] = (byte) (var6 >> 16);
                field1923[4] = (byte) (var6 >> 8);
                field1923[5] = (byte) var6;
                this.field1921.method3426((long) (arg0 * 6));
                this.field1921.method3417(field1923, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1920.method3426((long) (var6 * 520));
                                try {
                                    this.field1920.method3414(field1923, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1923[0] & 0xFF) << 8) + (field1923[1] & 0xFF);
                                int var12 = ((field1923[2] & 0xFF) << 8) + (field1923[3] & 0xFF);
                                var9 = (field1923[6] & 0xFF) + ((field1923[5] & 0xFF) << 8) + ((field1923[4] & 0xFF) << 16);
                                int var13 = field1923[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1926 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1920.method3413() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1920.method3413() + 519L) / 520L);
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
                            field1923[0] = (byte) (arg0 >> 8);
                            field1923[1] = (byte) arg0;
                            field1923[2] = (byte) (var8 >> 8);
                            field1923[3] = (byte) var8;
                            field1923[4] = (byte) (var9 >> 16);
                            field1923[5] = (byte) (var9 >> 8);
                            field1923[6] = (byte) var9;
                            field1923[7] = (byte) this.field1926;
                            this.field1920.method3426((long) (var6 * 520));
                            this.field1920.method3417(field1923, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1920.method3417(arg1, var7, var14);
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
