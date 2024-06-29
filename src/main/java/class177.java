import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class177 {

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lbj;")
    private class51 field3121 = null;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    private int field3125 = 65000;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Lbj;")
    private class51 field3127 = null;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3111 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lmh;")
    private static class128 field3110 = class22.method156(122, "glow2:");

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lmh;")
    public static class128 field3120 = field3110;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lmh;")
    private static class128 field3113 = class22.method156(123, "Created gameworld");

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lmh;")
    public static class128 field3117 = class22.method156(125, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Lmh;")
    public static class128 field3123 = field3110;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lmh;")
    private static class128 field3122 = class22.method156(125, "flash1:");

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lmh;")
    public static class128 field3109 = field3122;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lmh;")
    public static class128 field3114 = field3113;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lmh;")
    public static class128 field3116 = field3122;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1212(int arg0, int arg1) {
        field3118++;
        return arg1 == 6 ? arg0 & 0xFF : -23;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IJ)V", line = 31)
    public static final void method1213(int arg0, long arg1) {
        field3108++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == (long) arg0) {
            class241.method1641(true, arg1 - 1L);
            class241.method1641(true, 1L);
        } else {
            class241.method1641(true, arg1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILbj;Lbj;I)V", line = 354)
    public class177(int arg0, class51 arg1, class51 arg2, int arg3) {
        this.field3124 = arg0;
        this.field3127 = arg1;
        this.field3121 = arg2;
        this.field3125 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[B", line = 71)
    public final byte[] method1214(int arg0, int arg1) {
        field3126++;
        class51 var3 = this.field3127;
        synchronized (this.field3127) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field3121.method352(-1)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3121.method348((long) (arg1 * 6), arg0 ^ arg0);
                this.field3121.method353(6, class223.field3918, -1, 0);
                int var4 = (class223.field3918[5] & 0xFF) + (class223.field3918[4] & 0xFF << 8) + (class223.field3918[3] & 0xFF << 16);
                int var5 = ((class223.field3918[1] & 0xFF) << 8) + ((class223.field3918[0] & 0xFF) << 16) + (class223.field3918[2] & 0xFF);
                if (var5 < 0 || this.field3125 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || this.field3127.method352(arg0 + 13720) / 520L < (long) var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3127.method348((long) (var4 * 520), 0);
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field3127.method353(var9 + 8, class223.field3918, arg0 ^ 0x3598, 0);
                        int var10 = (class223.field3918[6] & 0xFF) + (class223.field3918[5] & 0xFF << 8) + (class223.field3918[4] & 0xFF << 16);
                        int var11 = ((class223.field3918[2] & 0xFF) << 8) + (class223.field3918[3] & 0xFF);
                        int var12 = class223.field3918[7] & 0xFF;
                        int var13 = ((class223.field3918[0] & 0xFF) << 8) + (class223.field3918[1] & 0xFF);
                        if (arg1 != var13 || var8 != var11 || this.field3124 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var10 < 0 || ((long) var10) > (this.field3127.method352(-1) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var8++;
                        var4 = var10;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class223.field3918[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ[BII)Z", line = 166)
    private final boolean method1215(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        if (arg3 > -36) {
            return false;
        }
        field3112++;
        class51 var6 = this.field3127;
        synchronized (this.field3127) {
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field3121.method352(-1)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3121.method348((long) (arg0 * 6), 0);
                    this.field3121.method353(6, class223.field3918, -1, 0);
                    var7 = (class223.field3918[5] & 0xFF) + ((class223.field3918[4] & 0xFF) << 8) + ((class223.field3918[3] & 0xFF) << 16);
                    if (var7 <= 0 || ((long) var7) > (this.field3127.method352(-1) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3127.method352(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class223.field3918[0] = (byte) (arg4 >> 16);
                class223.field3918[2] = (byte) arg4;
                class223.field3918[1] = (byte) (arg4 >> 8);
                class223.field3918[5] = (byte) var7;
                class223.field3918[4] = (byte) (var7 >> 8);
                class223.field3918[3] = (byte) (var7 >> 16);
                this.field3121.method348((long) (arg0 * 6), 0);
                int var8 = 0;
                int var9 = 0;
                this.field3121.method347((byte) -119, 0, 6, class223.field3918);
                while (true) {
                    if (var9 < arg4) {
                        label138: {
                            int var10 = 0;
                            if (arg1) {
                                this.field3127.method348((long) (var7 * 520), 0);
                                try {
                                    this.field3127.method353(8, class223.field3918, -1, 0);
                                } catch (EOFException var18) {
                                    break label138;
                                }
                                var10 = ((class223.field3918[5] & 0xFF) << 8) + ((class223.field3918[4] & 0xFF) << 16) + (class223.field3918[6] & 0xFF);
                                int var12 = ((class223.field3918[0] & 0xFF) << 8) + (class223.field3918[1] & 0xFF);
                                int var13 = ((class223.field3918[2] & 0xFF) << 8) + (class223.field3918[3] & 0xFF);
                                int var14 = class223.field3918[7] & 0xFF;
                                if (arg0 != var12 || var8 != var13 || this.field3124 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field3127.method352(-1) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg1 = false;
                                var10 = (int) ((this.field3127.method352(-1) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class223.field3918[0] = (byte) (arg0 >> 8);
                            class223.field3918[1] = (byte) arg0;
                            class223.field3918[3] = (byte) var8;
                            class223.field3918[2] = (byte) (var8 >> 8);
                            var8++;
                            if ((arg4 - var9) <= 512) {
                                var10 = 0;
                            }
                            class223.field3918[5] = (byte) (var10 >> 8);
                            class223.field3918[6] = (byte) var10;
                            class223.field3918[4] = (byte) (var10 >> 16);
                            int var15 = arg4 - var9;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class223.field3918[7] = (byte) this.field3124;
                            this.field3127.method348((long) (var7 * 520), 0);
                            var7 = var10;
                            this.field3127.method347((byte) -108, 0, 8, class223.field3918);
                            this.field3127.method347((byte) -107, var9, var15, arg2);
                            var9 += var15;
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

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;", line = 289)
    public final String toString() {
        field3115++;
        return "Cache:" + this.field3124;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 308)
    public static void method1216(byte arg0) {
        field3114 = null;
        int var1 = -91 % ((arg0 - 15) / 33);
        field3109 = null;
        field3116 = null;
        field3120 = null;
        field3117 = null;
        field3122 = null;
        field3110 = null;
        field3123 = null;
        field3113 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[BB)Z", line = 328)
    public final boolean method1217(int arg0, int arg1, byte[] arg2, byte arg3) {
        field3119++;
        class51 var5 = this.field3127;
        synchronized (this.field3127) {
            if (arg1 < 0 || this.field3125 < arg1) {
                throw new IllegalArgumentException();
            } else if (arg3 == -56) {
                boolean var6 = this.method1215(arg0, true, arg2, -61, arg1);
                if (!var6) {
                    var6 = this.method1215(arg0, false, arg2, arg3 - 18, arg1);
                }
                return var6;
            } else {
                return false;
            }
        }
    }
}
