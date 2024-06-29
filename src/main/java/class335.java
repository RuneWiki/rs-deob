import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class335 {

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "Lgd;")
    private class133 field4848 = null;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "Lgd;")
    private class133 field4853 = null;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    private int field4850 = 65000;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
    private int field4852;

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4856 = new String[] { method2696(method2695("@`%\u000fD\u0006")), method2696(method2695("U&j\u000f{")), method2696(method2695("@}(M")), method2696(method2695("@`%\u000fE\u0006")), method2696(method2695("@`%\u000fG\u0006")), method2696(method2695("mi'Ic\u0014")), method2696(method2695("@`%\u000frA[0So@ol")), method2696(method2695("@`%\u000f:Gf-U8\u0006")) };

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field4844 = 0;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "Z")
    public static boolean field4851 = false;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "S")
    public static short field4846 = 1;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "([BIII)Z", line = 3)
    public final boolean method2692(byte[] arg0, int arg1, int arg2, int arg3) {
        try {
            field4855++;
            class133 var5 = this.field4853;
            synchronized (this.field4853) {
                if (arg1 < 0 || this.field4850 < arg1) {
                    throw new IllegalArgumentException();
                }
                boolean var6 = this.method2693(true, arg0, arg1, true, arg2);
                if (arg3 != -25614) {
                    this.method2693(true, null, -124, false, 94);
                }
                if (!var6) {
                    var6 = this.method2693(false, arg0, arg1, true, arg2);
                }
                return var6;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4856[3] + (arg0 == null ? field4856[2] : field4856[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;", line = 38)
    public final String toString() {
        try {
            field4845++;
            return field4856[5] + this.field4852;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4856[6] + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILgd;Lgd;I)V", line = 275)
    public class335(int arg0, class133 arg1, class133 arg2, int arg3) {
        try {
            this.field4853 = arg1;
            this.field4852 = arg0;
            this.field4848 = arg2;
            this.field4850 = arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4856[7] + arg0 + ',' + (arg1 == null ? field4856[2] : field4856[1]) + ',' + (arg2 == null ? field4856[2] : field4856[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z[BIZI)Z", line = 59)
    private final boolean method2693(boolean arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        try {
            field4849++;
            class133 var6 = this.field4853;
            synchronized (this.field4853) {
                try {
                    if (!arg3) {
                        this.toString();
                    }
                    int var8;
                    if (arg0) {
                        if (this.field4848.method1164(12191) < (long) (arg4 * 6 + 6)) {
                            return false;
                        }
                        this.field4848.method1166((long) (arg4 * 6), 0);
                        this.field4848.method1162(12858, 6, class703.field9827, 0);
                        var8 = (class703.field9827[5] & 0xFF) + ((class703.field9827[3] & 0xFF) << 16) + (class703.field9827[4] & 0xFF << 8);
                        if (var8 <= 0 || (long) var8 > this.field4853.method1164(12191) / 520L) {
                            return false;
                        }
                    } else {
                        var8 = (int) ((this.field4853.method1164(12191) + 519L) / 520L);
                        if (var8 == 0) {
                            var8 = 1;
                        }
                    }
                    class703.field9827[5] = (byte) var8;
                    class703.field9827[3] = (byte) (var8 >> 16);
                    class703.field9827[4] = (byte) (var8 >> 8);
                    class703.field9827[2] = (byte) arg2;
                    class703.field9827[0] = (byte) (arg2 >> 16);
                    class703.field9827[1] = (byte) (arg2 >> 8);
                    this.field4848.method1166((long) (arg4 * 6), 0);
                    this.field4848.method1157(class703.field9827, -1, 0, 6);
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < arg2) {
                        int var12 = 0;
                        if (arg0) {
                            this.field4853.method1166((long) (var8 * 520), 0);
                            try {
                                this.field4853.method1162(12858, 8, class703.field9827, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var13 = (class703.field9827[0] & 0xFF << 8) + (class703.field9827[1] & 0xFF);
                            int var14 = ((class703.field9827[2] & 0xFF) << 8) + (class703.field9827[3] & 0xFF);
                            var12 = (class703.field9827[6] & 0xFF) + ((class703.field9827[5] & 0xFF) << 8) + (class703.field9827[4] & 0xFF << 16);
                            int var15 = class703.field9827[7] & 0xFF;
                            if (arg4 != var13 || var11 != var14 || this.field4852 != var15) {
                                return false;
                            }
                            if (var12 < 0 || (long) var12 > this.field4853.method1164(12191) / 520L) {
                                return false;
                            }
                        }
                        if (var12 == 0) {
                            arg0 = false;
                            var12 = (int) ((this.field4853.method1164(12191) + 519L) / 520L);
                            if (var12 == 0) {
                                var12++;
                            }
                            if (var8 == var12) {
                                var12++;
                            }
                        }
                        class703.field9827[1] = (byte) arg4;
                        class703.field9827[0] = (byte) (arg4 >> 8);
                        if (arg2 - var10 <= 512) {
                            var12 = 0;
                        }
                        class703.field9827[2] = (byte) (var11 >> 8);
                        class703.field9827[3] = (byte) var11;
                        class703.field9827[6] = (byte) var12;
                        class703.field9827[7] = (byte) this.field4852;
                        class703.field9827[5] = (byte) (var12 >> 8);
                        class703.field9827[4] = (byte) (var12 >> 16);
                        this.field4853.method1166((long) (var8 * 520), 0);
                        this.field4853.method1157(class703.field9827, -1, 0, 8);
                        int var18 = arg2 - var10;
                        if (var18 > 512) {
                            var18 = 512;
                        }
                        this.field4853.method1157(arg1, -1, var10, var18);
                        var10 += var18;
                        var11++;
                        var8 = var12;
                    }
                    return true;
                } catch (IOException var35) {
                    return false;
                }
            }
        } catch (RuntimeException var37) {
            throw class665.method4799(var37, field4856[0] + arg0 + ',' + (arg1 == null ? field4856[2] : field4856[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)[B", line = 181)
    public final byte[] method2694(int arg0, int arg1) {
        try {
            field4847++;
            class133 var3 = this.field4853;
            synchronized (this.field4853) {
                try {
                    if ((long) (arg1 * 6 + 6) > this.field4848.method1164(arg0 + 1543532335)) {
                        return null;
                    }
                    this.field4848.method1166((long) (arg1 * 6), 0);
                    this.field4848.method1162(12858, 6, class703.field9827, 0);
                    int var5 = (class703.field9827[2] & 0xFF) + ((class703.field9827[1] & 0xFF) << 8) + (class703.field9827[0] & 0xFF << 16);
                    int var6 = ((class703.field9827[3] & 0xFF) << 16) + (class703.field9827[4] & 0xFF << 8) + (class703.field9827[5] & 0xFF);
                    if (var5 < 0 || this.field4850 < var5) {
                        return null;
                    } else if (var6 > 0 && (this.field4853.method1164(12191) / 520L) >= ((long) var6)) {
                        byte[] var9 = new byte[var5];
                        int var10 = 0;
                        if (arg0 != -1543520144) {
                            return null;
                        }
                        int var12 = 0;
                        label86: while (var5 > var10) {
                            if (var6 == 0) {
                                return null;
                            }
                            this.field4853.method1166((long) (var6 * 520), arg0 ^ 0xA3FFC070);
                            int var14 = var5 - var10;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field4853.method1162(12858, var14 + 8, class703.field9827, 0);
                            int var15 = (class703.field9827[0] & 0xFF << 8) + (class703.field9827[1] & 0xFF);
                            int var16 = ((class703.field9827[2] & 0xFF) << 8) + (class703.field9827[3] & 0xFF);
                            int var17 = ((class703.field9827[4] & 0xFF) << 16) + ((class703.field9827[5] & 0xFF) << 8) + (class703.field9827[6] & 0xFF);
                            int var18 = class703.field9827[7] & 0xFF;
                            if (arg1 == var15 && var12 == var16 && this.field4852 == var18) {
                                if (var17 >= 0 && ((long) var17) <= (this.field4853.method1164(arg0 ^ 0xA3FFEFEF) / 520L)) {
                                    var6 = var17;
                                    var12++;
                                    int var21 = 0;
                                    while (true) {
                                        if (var14 <= var21) {
                                            continue label86;
                                        }
                                        var9[var10++] = class703.field9827[var21 + 8];
                                        var21++;
                                    }
                                }
                                return null;
                            }
                            return null;
                        }
                        return var9;
                    } else {
                        return null;
                    }
                } catch (IOException var43) {
                    return null;
                }
            }
        } catch (RuntimeException var45) {
            throw class665.method4799(var45, field4856[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2695(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2696(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
