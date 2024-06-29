import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class180 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field2922 = 65000;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Ldl;")
    private class29 field2931 = null;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Ldl;")
    private class29 field2925 = null;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[[I")
    public static int[][] field2921 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[[S")
    public static short[][] field2920 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2926 = 0;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 8)
    public static void method1326(byte arg0) {
        if (arg0 < 18) {
            field2920 = (short[][]) ((short[][]) null);
        }
        field2921 = (int[][]) null;
        field2920 = (short[][]) null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BZIBI)Z", line = 22)
    private final boolean method1327(byte[] arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field2923++;
        class29 var6 = this.field2931;
        synchronized (this.field2931) {
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if (this.field2925.method269((byte) 62) < (long) (arg4 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2925.method268((long) (arg4 * 6), 128);
                    this.field2925.method263(-117, 0, 6, class265.field4145);
                    var7 = ((class265.field4145[3] & 0xFF) << 16) + (class265.field4145[5] & 0xFF) + ((class265.field4145[4] & 0xFF) << 8);
                    if (var7 <= 0 || ((long) var7) > (this.field2931.method269((byte) 62) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2931.method269((byte) 62) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class265.field4145[2] = (byte) arg2;
                class265.field4145[0] = (byte) (arg2 >> 16);
                class265.field4145[3] = (byte) (var7 >> 16);
                class265.field4145[5] = (byte) var7;
                class265.field4145[1] = (byte) (arg2 >> 8);
                int var8 = 0;
                int var9 = 0;
                class265.field4145[4] = (byte) (var7 >> 8);
                this.field2925.method268((long) (arg4 * 6), 128);
                this.field2925.method266(-32050, 6, 0, class265.field4145);
                while (true) {
                    if (arg2 > var9) {
                        label139: {
                            int var10 = 0;
                            if (arg1) {
                                this.field2931.method268((long) (var7 * 520), 128);
                                try {
                                    this.field2931.method263(114, 0, 8, class265.field4145);
                                } catch (EOFException var18) {
                                    break label139;
                                }
                                var10 = (class265.field4145[6] & 0xFF) + ((class265.field4145[4] & 0xFF) << 16) + ((class265.field4145[5] & 0xFF) << 8);
                                int var12 = ((class265.field4145[0] & 0xFF) << 8) + (class265.field4145[1] & 0xFF);
                                int var13 = (class265.field4145[2] & 0xFF << 8) + (class265.field4145[3] & 0xFF);
                                int var14 = class265.field4145[7] & 0xFF;
                                if (arg4 != var12 || var8 != var13 || this.field2927 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field2931.method269((byte) 62) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field2931.method269((byte) 62) + 519L) / 520L);
                                arg1 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class265.field4145[0] = (byte) (arg4 >> 8);
                            class265.field4145[3] = (byte) var8;
                            class265.field4145[2] = (byte) (var8 >> 8);
                            var8++;
                            if ((arg2 - var9) <= 512) {
                                var10 = 0;
                            }
                            class265.field4145[7] = (byte) this.field2927;
                            class265.field4145[5] = (byte) (var10 >> 8);
                            class265.field4145[6] = (byte) var10;
                            class265.field4145[4] = (byte) (var10 >> 16);
                            class265.field4145[1] = (byte) arg4;
                            this.field2931.method268((long) (var7 * 520), 128);
                            var7 = var10;
                            this.field2931.method266(-32050, 8, 0, class265.field4145);
                            int var15 = arg2 - var9;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field2931.method266(-32050, var15, var9, arg0);
                            var9 += var15;
                            continue;
                        }
                    }
                    if (arg3 <= 37) {
                        method1326((byte) 53);
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ILdl;Ldl;I)V", line = 286)
    public class180(int arg0, class29 arg1, class29 arg2, int arg3) {
        this.field2927 = arg0;
        this.field2931 = arg1;
        this.field2925 = arg2;
        this.field2922 = arg3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[B", line = 147)
    public final byte[] method1328(int arg0, byte arg1) {
        field2928++;
        class29 var3 = this.field2931;
        synchronized (this.field2931) {
            try {
                Object var10000;
                if (this.field2925.method269((byte) 62) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2925.method268((long) (arg0 * 6), 128);
                this.field2925.method263(-36, 0, 6, class265.field4145);
                int var4 = (class265.field4145[1] & 0xFF << 8) + ((class265.field4145[0] & 0xFF) << 16) + (class265.field4145[2] & 0xFF);
                int var5 = (class265.field4145[4] & 0xFF << 8) + ((class265.field4145[3] & 0xFF) << 16) + (class265.field4145[5] & 0xFF);
                if (arg1 >= -74) {
                    field2921 = (int[][]) ((int[][]) null);
                }
                if (var4 < 0 || this.field2922 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field2931.method269((byte) 62) / 520L < (long) var5) {
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
                        int var9 = var4 - var6;
                        this.field2931.method268((long) (var5 * 520), 128);
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2931.method263(-24, 0, var9 + 8, class265.field4145);
                        int var10 = class265.field4145[7] & 0xFF;
                        int var11 = (class265.field4145[0] & 0xFF << 8) + (class265.field4145[1] & 0xFF);
                        int var12 = (class265.field4145[6] & 0xFF) + ((class265.field4145[4] & 0xFF) << 16) + (class265.field4145[5] & 0xFF << 8);
                        int var13 = (class265.field4145[2] & 0xFF << 8) + (class265.field4145[3] & 0xFF);
                        if (arg0 != var11 || var8 != var13 || this.field2927 != var10) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || ((long) var12) > (this.field2931.method269((byte) 62) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var5 = var12;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var7[var6++] = class265.field4145[var14 + 8];
                        }
                        var8++;
                    }
                    byte[] var19 = var7;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII[B)Z", line = 243)
    public final boolean method1329(byte arg0, int arg1, int arg2, byte[] arg3) {
        field2924++;
        class29 var5 = this.field2931;
        synchronized (this.field2931) {
            if (arg0 != -61) {
                field2926 = -100;
            }
            if (arg1 < 0 || arg1 > this.field2922) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1327(arg3, true, arg1, (byte) 113, arg2);
            if (!var6) {
                var6 = this.method1327(arg3, false, arg1, (byte) 88, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "toString", descriptor = "()Ljava/lang/String;", line = 270)
    public final String toString() {
        field2929++;
        return "Cache:" + this.field2927;
    }
}
