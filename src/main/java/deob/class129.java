package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dw")
public final class class129 {

    @ObfuscatedName("dw.j")
    public static byte[] field1963 = new byte[520];

    @ObfuscatedName("dw.y")
    public class222 field1967 = null;

    @ObfuscatedName("dw.z")
    public class222 field1964 = null;

    @ObfuscatedName("dw.l")
    public int field1970;

    @ObfuscatedName("dw.w")
    public int field1965 = 65000;

    public class129(int arg0, class222 arg1, class222 arg2, int arg3) {
        this.field1970 = arg0;
        this.field1967 = arg1;
        this.field1964 = arg2;
        this.field1965 = arg3;
    }

    @ObfuscatedName("dw.j(II)[B")
    public byte[] method2675(int arg0) {
        class222 var2 = this.field1967;
        synchronized (this.field1967) {
            Object var10000;
            try {
                if (this.field1964.method3797() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1964.method3772((long) (arg0 * 6));
                this.field1964.method3775(field1963, 0, 6);
                int var3 = (field1963[2] & 0xFF) + ((field1963[1] & 0xFF) << 8) + ((field1963[0] & 0xFF) << 16);
                int var4 = (field1963[5] & 0xFF) + ((field1963[4] & 0xFF) << 8) + ((field1963[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field1965) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1967.method3797() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1967.method3772((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1967.method3775(field1963, 0, var8 + 8);
                        int var9 = ((field1963[0] & 0xFF) << 8) + (field1963[1] & 0xFF);
                        int var10 = ((field1963[2] & 0xFF) << 8) + (field1963[3] & 0xFF);
                        int var11 = (field1963[6] & 0xFF) + ((field1963[5] & 0xFF) << 8) + ((field1963[4] & 0xFF) << 16);
                        int var12 = field1963[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1970 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1967.method3797() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1963[var13 + 8];
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

    @ObfuscatedName("dw.y(I[BIB)Z")
    public boolean method2672(int arg0, byte[] arg1, int arg2) {
        class222 var4 = this.field1967;
        synchronized (this.field1967) {
            if (arg2 < 0 || arg2 > this.field1965) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2673(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2673(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("dw.z(I[BIZI)Z")
    public boolean method2673(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class222 var5 = this.field1967;
        synchronized (this.field1967) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1964.method3797() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1964.method3772((long) (arg0 * 6));
                    this.field1964.method3775(field1963, 0, 6);
                    var6 = (field1963[5] & 0xFF) + ((field1963[3] & 0xFF) << 16) + ((field1963[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field1967.method3797() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1967.method3797() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1963[0] = (byte) (arg2 >> 16);
                field1963[1] = (byte) (arg2 >> 8);
                field1963[2] = (byte) arg2;
                field1963[3] = (byte) (var6 >> 16);
                field1963[4] = (byte) (var6 >> 8);
                field1963[5] = (byte) var6;
                this.field1964.method3772((long) (arg0 * 6));
                this.field1964.method3773(field1963, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1967.method3772((long) (var6 * 520));
                                try {
                                    this.field1967.method3775(field1963, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1963[0] & 0xFF) << 8) + (field1963[1] & 0xFF);
                                int var12 = ((field1963[2] & 0xFF) << 8) + (field1963[3] & 0xFF);
                                var9 = (field1963[6] & 0xFF) + ((field1963[4] & 0xFF) << 16) + ((field1963[5] & 0xFF) << 8);
                                int var13 = field1963[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1970 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1967.method3797() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1967.method3797() + 519L) / 520L);
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
                            field1963[0] = (byte) (arg0 >> 8);
                            field1963[1] = (byte) arg0;
                            field1963[2] = (byte) (var8 >> 8);
                            field1963[3] = (byte) var8;
                            field1963[4] = (byte) (var9 >> 16);
                            field1963[5] = (byte) (var9 >> 8);
                            field1963[6] = (byte) var9;
                            field1963[7] = (byte) this.field1970;
                            this.field1967.method3772((long) (var6 * 520));
                            this.field1967.method3773(field1963, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1967.method3773(arg1, var7, var14);
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
