import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class387 {

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    private int field4941 = 65000;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lkr;")
    private class748 field4945 = null;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Lkr;")
    private class748 field4946 = null;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    private int field4940;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
    public static boolean field4944 = false;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[[[I")
    public static int[][][] field4934;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2199(int arg0) {
        for (int var1 = 0; var1 < class305.field4001.length; var1++) {
            for (int var2 = 0; var2 < class305.field4001[0].length; var2++) {
                for (int var3 = 0; var3 < class305.field4001[0][0].length; var3++) {
                    class305.field4001[var1][var2][var3] = 0;
                }
            }
        }
        field4936++;
        if (arg0 != -1) {
            method2199(-24);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 38)
    public static final String[] method2200(int arg0, String[] arg1) {
        field4935++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg0 > -112) {
            field4934 = null;
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZB[BII)Z", line = 64)
    private final boolean method2201(boolean arg0, byte arg1, byte[] arg2, int arg3, int arg4) {
        field4938++;
        class748 var6 = this.field4946;
        synchronized (this.field4946) {
            try {
                int var8;
                if (arg0) {
                    if (this.field4945.method4165(0) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field4945.method4163((long) (arg3 * 6), 0);
                    this.field4945.method4169(0, 6, class445.field5927, arg1 ^ 0xFFFFFFA5);
                    var8 = (class445.field5927[5] & 0xFF) + ((class445.field5927[4] & 0xFF) << 8) + ((class445.field5927[3] & 0xFF) << 16);
                    if (var8 <= 0 || this.field4946.method4165(0) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4946.method4165(arg1 ^ 0x5A) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class445.field5927[5] = (byte) var8;
                class445.field5927[2] = (byte) arg4;
                class445.field5927[4] = (byte) (var8 >> 8);
                class445.field5927[0] = (byte) (arg4 >> 16);
                class445.field5927[1] = (byte) (arg4 >> 8);
                class445.field5927[3] = (byte) (var8 >> 16);
                this.field4945.method4163((long) (arg3 * 6), 0);
                this.field4945.method4161(0, class445.field5927, 22609, 6);
                int var10 = 0;
                if (arg1 != 90) {
                    return false;
                }
                int var12 = 0;
                while (var10 < arg4) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field4946.method4163((long) (var8 * 520), 0);
                            try {
                                this.field4946.method4169(0, 8, class445.field5927, -1);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class445.field5927[0] & 0xFF) << 8) + (class445.field5927[1] & 0xFF);
                            int var15 = (class445.field5927[2] & 0xFF << 8) + (class445.field5927[3] & 0xFF);
                            var13 = ((class445.field5927[5] & 0xFF) << 8) + ((class445.field5927[4] & 0xFF) << 16) + (class445.field5927[6] & 0xFF);
                            int var16 = class445.field5927[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field4940 == var16) {
                                if (var13 >= 0 && (this.field4946.method4165(arg1 - 90) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field4946.method4165(0) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if (arg4 - var10 <= 512) {
                        var13 = 0;
                    }
                    class445.field5927[2] = (byte) (var12 >> 8);
                    class445.field5927[3] = (byte) var12;
                    class445.field5927[1] = (byte) arg3;
                    class445.field5927[0] = (byte) (arg3 >> 8);
                    class445.field5927[6] = (byte) var13;
                    class445.field5927[5] = (byte) (var13 >> 8);
                    class445.field5927[4] = (byte) (var13 >> 16);
                    class445.field5927[7] = (byte) this.field4940;
                    this.field4946.method4163((long) (var8 * 520), 0);
                    this.field4946.method4161(0, class445.field5927, 22609, 8);
                    int var19 = arg4 - var10;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4946.method4161(var10, arg2, arg1 + 22519, var19);
                    var12++;
                    var8 = var13;
                    var10 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;", line = 188)
    public final String toString() {
        field4937++;
        return "Cache:" + this.field4940;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BII)Z", line = 203)
    public final boolean method2202(int arg0, byte[] arg1, int arg2, int arg3) {
        field4939++;
        class748 var5 = this.field4946;
        synchronized (this.field4946) {
            if (arg2 < 0 || arg2 > this.field4941) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2201(true, (byte) 90, arg1, arg3, arg2);
            if (arg0 == 428) {
                if (!var6) {
                    var6 = this.method2201(false, (byte) 90, arg1, arg3, arg2);
                }
                return var6;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[BIIII[B)V", line = 231)
    public static final void method2203(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4947++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg6 != 1) {
            method2200(44, null);
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg3[arg7++];
                int var14 = arg0++;
                arg8[var14] += arg3[arg7++];
                int var15 = arg0++;
                arg8[var15] += arg3[arg7++];
                int var16 = arg0++;
                arg8[var16] += arg3[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg3[arg7++];
            }
            arg7 += arg2;
            arg0 += arg1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILkr;Lkr;I)V", line = 407)
    public class387(int arg0, class748 arg1, class748 arg2, int arg3) {
        this.field4941 = arg3;
        this.field4946 = arg1;
        this.field4945 = arg2;
        this.field4940 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)[B", line = 288)
    public final byte[] method2204(byte arg0, int arg1) {
        field4943++;
        class748 var3 = this.field4946;
        synchronized (this.field4946) {
            try {
                if (this.field4945.method4165(arg0 - 46) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field4945.method4163((long) (arg1 * 6), arg0 - 46);
                this.field4945.method4169(0, 6, class445.field5927, arg0 - 47);
                int var5 = (class445.field5927[2] & 0xFF) + ((class445.field5927[1] & 0xFF) << 8) + (class445.field5927[0] & 0xFF << 16);
                int var6 = ((class445.field5927[4] & 0xFF) << 8) + (class445.field5927[3] & 0xFF << 16) + (class445.field5927[5] & 0xFF);
                if (var5 < 0 || var5 > this.field4941) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4946.method4165(arg0 ^ 0x2E) / 520L)) {
                    if (arg0 != 46) {
                        field4933 = 122;
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4946.method4163((long) (var6 * 520), arg0 - 46);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4946.method4169(0, var13 + 8, class445.field5927, -1);
                        int var14 = ((class445.field5927[0] & 0xFF) << 8) + (class445.field5927[1] & 0xFF);
                        int var15 = ((class445.field5927[2] & 0xFF) << 8) + (class445.field5927[3] & 0xFF);
                        int var16 = ((class445.field5927[4] & 0xFF) << 16) + (class445.field5927[6] & 0xFF) + (class445.field5927[5] & 0xFF << 8);
                        int var17 = class445.field5927[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4940 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field4946.method4165(0) / 520L) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class445.field5927[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 370)
    public static void method2205(byte arg0) {
        if (arg0 == 99) {
            field4934 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 391)
    public static final void method2206(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class684.field9529 != null) {
            class684.field9529.method3647((byte) -111);
        }
        field4942++;
        if (class317.field4106 != null) {
            class317.field4106.method3647((byte) -111);
        }
    }
}
