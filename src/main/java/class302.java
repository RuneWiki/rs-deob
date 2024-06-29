import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class302 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lwi;")
    private class233 field4852 = null;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lwi;")
    private class233 field4854 = null;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    private int field4856 = 65000;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    private int field4859;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Z")
    public static boolean field4861 = true;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)[B", line = 5)
    public final byte[] method2157(boolean arg0, int arg1) {
        field4857++;
        class233 var3 = this.field4854;
        synchronized (this.field4854) {
            try {
                Object var10000;
                if (((long) (arg1 * 6 + 6)) > this.field4852.method1797(256)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4852.method1794((long) (arg1 * 6), (byte) 96);
                this.field4852.method1798(-12264, class117.field1958, 6, 0);
                int var4 = (class117.field1958[2] & 0xFF) + ((class117.field1958[1] & 0xFF) << 8) + (class117.field1958[0] & 0xFF << 16);
                int var5 = ((class117.field1958[4] & 0xFF) << 8) + (((class117.field1958[3] & 0xFF) << 16) + (class117.field1958[5] & 0xFF));
                if (var4 < 0 || this.field4856 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (long) var5 > this.field4854.method1797(256) / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var6 = 0;
                    byte[] var7 = new byte[var4];
                    int var8 = 0;
                    while (var4 > var6) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field4854.method1794((long) (var5 * 520), (byte) 113);
                        int var9 = var4 - var6;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4854.method1798(-12264, class117.field1958, var9 + 8, 0);
                        int var10 = class117.field1958[7] & 0xFF;
                        int var11 = (class117.field1958[0] & 0xFF << 8) + (class117.field1958[1] & 0xFF);
                        int var12 = ((class117.field1958[2] & 0xFF) << 8) + (class117.field1958[3] & 0xFF);
                        int var13 = (class117.field1958[4] & 0xFF << 16) + ((class117.field1958[5] & 0xFF) << 8) + (class117.field1958[6] & 0xFF);
                        if (arg1 == var11 && var8 == var12 && this.field4859 == var10) {
                            if (var13 >= 0 && (this.field4854.method1797(256) / 520L) >= ((long) var13)) {
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var7[var6++] = class117.field1958[var14 + 8];
                                }
                                var8++;
                                var5 = var13;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    if (!arg0) {
                        this.toString();
                    }
                    byte[] var19 = var7;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(ILwi;Lwi;I)V", line = 125)
    public class302(int arg0, class233 arg1, class233 arg2, int arg3) {
        this.field4854 = arg1;
        this.field4859 = arg0;
        this.field4856 = arg3;
        this.field4852 = arg2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIBII)V", line = 106)
    public static final void method2158(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -37 % ((arg2 - 50) / 60);
        class321 var6 = class46.method370(4, (byte) -106, arg3);
        field4853++;
        var6.method2265(false);
        var6.field5112 = arg0;
        var6.field5109 = arg1;
        var6.field5101 = arg4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI[BI)Z", line = 140)
    public final boolean method2159(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field4855++;
        class233 var5 = this.field4854;
        synchronized (this.field4854) {
            if (arg3 < 0 || arg3 > this.field4856) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2160(arg3, arg0, 3, arg2, arg1);
            if (!var6) {
                var6 = this.method2160(arg3, false, 3, arg2, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;", line = 163)
    public final String toString() {
        field4851++;
        return "Cache:" + this.field4859;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI[BI)Z", line = 172)
    private final boolean method2160(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field4858++;
        class233 var6 = this.field4854;
        synchronized (this.field4854) {
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if (((long) (arg4 * 6 + 6)) > this.field4852.method1797(256)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4852.method1794((long) (arg4 * 6), (byte) 78);
                    this.field4852.method1798(-12264, class117.field1958, 6, 0);
                    var7 = ((class117.field1958[3] & 0xFF) << 16) + (class117.field1958[4] & 0xFF << 8) + (class117.field1958[5] & 0xFF);
                    if (var7 <= 0 || (this.field4854.method1797(256) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4854.method1797(256) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class117.field1958[5] = (byte) var7;
                class117.field1958[4] = (byte) (var7 >> 8);
                class117.field1958[arg2] = (byte) (var7 >> 16);
                int var8 = 0;
                int var9 = 0;
                class117.field1958[2] = (byte) arg0;
                class117.field1958[0] = (byte) (arg0 >> 16);
                class117.field1958[1] = (byte) (arg0 >> 8);
                this.field4852.method1794((long) (arg4 * 6), (byte) 113);
                this.field4852.method1796((byte) -118, 0, class117.field1958, 6);
                while (true) {
                    if (var8 < arg0) {
                        label131: {
                            int var10 = 0;
                            if (arg1) {
                                label150: {
                                    this.field4854.method1794((long) (var7 * 520), (byte) 114);
                                    try {
                                        this.field4854.method1798(-12264, class117.field1958, 8, 0);
                                    } catch (EOFException var18) {
                                        break label131;
                                    }
                                    var10 = (class117.field1958[4] & 0xFF << 16) + (class117.field1958[5] & 0xFF << 8) + (class117.field1958[6] & 0xFF);
                                    int var12 = ((class117.field1958[0] & 0xFF) << 8) + (class117.field1958[1] & 0xFF);
                                    int var13 = (class117.field1958[2] & 0xFF << 8) + (class117.field1958[3] & 0xFF);
                                    int var14 = class117.field1958[7] & 0xFF;
                                    if (arg4 == var12 && var9 == var13 && this.field4859 == var14) {
                                        if (var10 >= 0 && (this.field4854.method1797(arg2 ^ 0x103) / 520L) >= ((long) var10)) {
                                            break label150;
                                        }
                                        var10000 = false;
                                        return var10000;
                                    }
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field4854.method1797(256) + 519L) / 520L);
                                arg1 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg0 - var8) <= 512) {
                                var10 = 0;
                            }
                            class117.field1958[2] = (byte) (var9 >> 8);
                            class117.field1958[1] = (byte) arg4;
                            class117.field1958[0] = (byte) (arg4 >> 8);
                            class117.field1958[4] = (byte) (var10 >> 16);
                            class117.field1958[7] = (byte) this.field4859;
                            class117.field1958[6] = (byte) var10;
                            class117.field1958[3] = (byte) var9;
                            var9++;
                            class117.field1958[5] = (byte) (var10 >> 8);
                            this.field4854.method1794((long) (var7 * 520), (byte) 115);
                            int var15 = arg0 - var8;
                            var7 = var10;
                            this.field4854.method1796((byte) -122, 0, class117.field1958, 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field4854.method1796((byte) -68, var8, arg3, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBII)V", line = 295)
    public static final void method2161(int arg0, byte arg1, int arg2, int arg3) {
        field4860++;
        int var4 = class235.field3899 * arg2 >> 8;
        if (arg1 >= -124) {
            method2158(46, 58, (byte) 93, 58, 120);
        }
        if (var4 != 0 && arg3 != -1) {
            class287.method2087(0, 82, class84.field1429, false, arg3, var4);
            class32.field461 = true;
        }
    }
}
