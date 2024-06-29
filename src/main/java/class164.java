import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class164 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lja;")
    private class90 field3161 = null;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    private int field3163 = 65000;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lja;")
    private class90 field3168 = null;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lob;")
    public static class141 field3165 = class175.method1195(40, "cookiehost");

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lob;")
    public static class141 field3164 = class175.method1195(40, ")4lang)4de");

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lob;")
    private static class141 field3176 = class175.method1195(40, "No response from server)3");

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Lob;")
    public static class141 field3175 = field3176;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[[S")
    public static short[][] field3173 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[[[B")
    public static byte[][][] field3177 = new byte[4][104][104];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lmd;")
    public static class123 field3160 = new class123(4096);

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lpe;")
    public static class154 field3166;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lca;")
    public static class22 field3174;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI[BI)Z")
    public final boolean method1135(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field3171++;
        class90 var5 = this.field3161;
        synchronized (this.field3161) {
            if (arg1 < 0 || this.field3163 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1137(arg2, arg0, arg1, arg3, 108);
            if (!var6) {
                var6 = this.method1137(arg2, false, arg1, arg3, 71);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[B")
    public final byte[] method1136(int arg0, int arg1) {
        field3162++;
        class90 var3 = this.field3161;
        synchronized (this.field3161) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3168.method620(125)) {
                    return null;
                }
                if (arg0 <= 78) {
                    field3177 = null;
                }
                this.field3168.method619((byte) 14, (long) (arg1 * 6));
                this.field3168.method612(0, class165.field3197, 6, 5);
                int var5 = ((class165.field3197[0] & 0xFF) << 16) + (class165.field3197[2] & 0xFF) + ((class165.field3197[1] & 0xFF) << 8);
                int var6 = ((class165.field3197[4] & 0xFF) << 8) + ((class165.field3197[3] & 0xFF) << 16) + (class165.field3197[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3163) {
                    return null;
                } else if (var6 > 0 && this.field3161.method620(125) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3161.method619((byte) 14, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3161.method612(0, class165.field3197, var13 + 8, 5);
                        int var14 = ((class165.field3197[0] & 0xFF) << 8) + (class165.field3197[1] & 0xFF);
                        int var15 = ((class165.field3197[2] & 0xFF) << 8) + (class165.field3197[3] & 0xFF);
                        int var16 = class165.field3197[7] & 0xFF;
                        int var17 = (class165.field3197[6] & 0xFF) + ((class165.field3197[5] & 0xFF) << 8) + ((class165.field3197[4] & 0xFF) << 16);
                        if (arg1 == var14 && var11 == var15 && this.field3167 == var16) {
                            if (var17 >= 0 && this.field3161.method620(116) / 520L >= (long) var17) {
                                var11++;
                                var6 = var17;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class165.field3197[var20 + 8];
                                    var20++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BZIII)Z")
    private final boolean method1137(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3169++;
        class90 var6 = this.field3161;
        synchronized (this.field3161) {
            try {
                int var8;
                if (arg1) {
                    if (this.field3168.method620(116) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field3168.method619((byte) 14, (long) (arg3 * 6));
                    this.field3168.method612(0, class165.field3197, 6, 5);
                    var8 = ((class165.field3197[3] & 0xFF) << 16) + ((class165.field3197[4] & 0xFF) << 8) + (class165.field3197[5] & 0xFF);
                    if (var8 <= 0 || this.field3161.method620(125) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3161.method620(115) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class165.field3197[1] = (byte) (arg2 >> 8);
                if (arg4 < 57) {
                    return false;
                }
                class165.field3197[3] = (byte) (var8 >> 16);
                class165.field3197[4] = (byte) (var8 >> 8);
                class165.field3197[2] = (byte) arg2;
                class165.field3197[5] = (byte) var8;
                class165.field3197[0] = (byte) (arg2 >> 16);
                this.field3168.method619((byte) 14, (long) (arg3 * 6));
                int var11 = 0;
                this.field3168.method609(class165.field3197, -3818, 0, 6);
                int var12 = 0;
                while (var11 < arg2) {
                    int var13 = 0;
                    if (arg1) {
                        label110: {
                            this.field3161.method619((byte) 14, (long) (var8 * 520));
                            try {
                                this.field3161.method612(0, class165.field3197, 8, 5);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class165.field3197[4] & 0xFF) << 16) + ((class165.field3197[5] & 0xFF) << 8) + (class165.field3197[6] & 0xFF);
                            int var14 = ((class165.field3197[0] & 0xFF) << 8) + (class165.field3197[1] & 0xFF);
                            int var15 = ((class165.field3197[2] & 0xFF) << 8) + (class165.field3197[3] & 0xFF);
                            int var16 = class165.field3197[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field3167 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field3161.method620(122) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg1 = false;
                        var13 = (int) ((this.field3161.method620(115) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class165.field3197[2] = (byte) (var12 >> 8);
                    class165.field3197[7] = (byte) this.field3167;
                    if (arg2 - var11 <= 512) {
                        var13 = 0;
                    }
                    class165.field3197[4] = (byte) (var13 >> 16);
                    class165.field3197[0] = (byte) (arg3 >> 8);
                    class165.field3197[5] = (byte) (var13 >> 8);
                    class165.field3197[3] = (byte) var12;
                    var12++;
                    class165.field3197[6] = (byte) var13;
                    class165.field3197[1] = (byte) arg3;
                    int var19 = arg2 - var11;
                    this.field3161.method619((byte) 14, (long) (var8 * 520));
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field3161.method609(class165.field3197, -3818, 0, 8);
                    this.field3161.method609(arg0, -3818, var11, var19);
                    var8 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method1138(boolean arg0) {
        field3164 = null;
        field3177 = null;
        field3160 = null;
        field3173 = null;
        field3176 = null;
        field3174 = null;
        field3166 = null;
        field3175 = null;
        field3165 = null;
        if (!arg0) {
            field3160 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3172++;
        return "Cache:" + this.field3167;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILja;Lja;I)V")
    public class164(int arg0, class90 arg1, class90 arg2, int arg3) {
        this.field3167 = arg0;
        this.field3161 = arg1;
        this.field3163 = arg3;
        this.field3168 = arg2;
    }
}
