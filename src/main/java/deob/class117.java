package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dd")
public final class class117 {

    @ObfuscatedName("dd.x")
    public static byte[] field1822 = new byte[520];

    @ObfuscatedName("dd.j")
    public class73 field1820 = null;

    @ObfuscatedName("dd.c")
    public class73 field1826 = null;

    @ObfuscatedName("dd.d")
    public int field1821;

    @ObfuscatedName("dd.w")
    public int field1823 = 65000;

    public class117(int arg0, class73 arg1, class73 arg2, int arg3) {
        this.field1821 = arg0;
        this.field1820 = arg1;
        this.field1826 = arg2;
        this.field1823 = arg3;
    }

    @ObfuscatedName("dd.x(II)[B")
    public byte[] method2128(int arg0) {
        class73 var2 = this.field1820;
        synchronized (this.field1820) {
            Object var10000;
            try {
                if (this.field1826.method1373() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1826.method1361((long) (arg0 * 6));
                this.field1826.method1389(field1822, 0, 6);
                int var3 = (field1822[2] & 0xFF) + ((field1822[1] & 0xFF) << 8) + ((field1822[0] & 0xFF) << 16);
                int var4 = (field1822[5] & 0xFF) + ((field1822[4] & 0xFF) << 8) + ((field1822[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1823) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1820.method1373() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1820.method1361((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1820.method1389(field1822, 0, var8 + 8);
                        int var9 = ((field1822[0] & 0xFF) << 8) + (field1822[1] & 0xFF);
                        int var10 = ((field1822[2] & 0xFF) << 8) + (field1822[3] & 0xFF);
                        int var11 = (field1822[6] & 0xFF) + ((field1822[5] & 0xFF) << 8) + ((field1822[4] & 0xFF) << 16);
                        int var12 = field1822[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1821 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1820.method1373() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1822[var13 + 8];
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

    @ObfuscatedName("dd.j(I[BIB)Z")
    public boolean method2129(int arg0, byte[] arg1, int arg2) {
        class73 var4 = this.field1820;
        synchronized (this.field1820) {
            if (arg2 < 0 || arg2 > this.field1823) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2127(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2127(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("dd.c(I[BIZB)Z")
    public boolean method2127(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class73 var5 = this.field1820;
        synchronized (this.field1820) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1826.method1373() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1826.method1361((long) (arg0 * 6));
                    this.field1826.method1389(field1822, 0, 6);
                    var6 = (field1822[5] & 0xFF) + ((field1822[4] & 0xFF) << 8) + ((field1822[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1820.method1373() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1820.method1373() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1822[0] = (byte) (arg2 >> 16);
                field1822[1] = (byte) (arg2 >> 8);
                field1822[2] = (byte) arg2;
                field1822[3] = (byte) (var6 >> 16);
                field1822[4] = (byte) (var6 >> 8);
                field1822[5] = (byte) var6;
                this.field1826.method1361((long) (arg0 * 6));
                this.field1826.method1365(field1822, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1820.method1361((long) (var6 * 520));
                                try {
                                    this.field1820.method1389(field1822, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1822[0] & 0xFF) << 8) + (field1822[1] & 0xFF);
                                int var12 = ((field1822[2] & 0xFF) << 8) + (field1822[3] & 0xFF);
                                var9 = (field1822[6] & 0xFF) + ((field1822[5] & 0xFF) << 8) + ((field1822[4] & 0xFF) << 16);
                                int var13 = field1822[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1821 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1820.method1373() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1820.method1373() + 519L) / 520L);
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
                            field1822[0] = (byte) (arg0 >> 8);
                            field1822[1] = (byte) arg0;
                            field1822[2] = (byte) (var8 >> 8);
                            field1822[3] = (byte) var8;
                            field1822[4] = (byte) (var9 >> 16);
                            field1822[5] = (byte) (var9 >> 8);
                            field1822[6] = (byte) var9;
                            field1822[7] = (byte) this.field1821;
                            this.field1820.method1361((long) (var6 * 520));
                            this.field1820.method1365(field1822, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1820.method1365(arg1, var7, var14);
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
