import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class195 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Lqp;")
    private class441 field3048 = null;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lqp;")
    private class441 field3050 = null;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    private int field3047 = 65000;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    private int field3054;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3049;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BBI)Z", line = 9)
    public final boolean method1378(int arg0, byte[] arg1, byte arg2, int arg3) {
        field3051++;
        class441 var5 = this.field3048;
        synchronized (this.field3048) {
            if (arg3 < 0 || this.field3047 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1380(arg2 ^ 0xFFFFFFCA, arg1, arg3, true, arg0);
            if (arg2 != -54) {
                this.field3050 = null;
            }
            if (!var6) {
                var6 = this.method1380(0, arg1, arg3, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(ILqp;Lqp;I)V", line = 270)
    public class195(int arg0, class441 arg1, class441 arg2, int arg3) {
        this.field3048 = arg1;
        this.field3054 = arg0;
        this.field3047 = arg3;
        this.field3050 = arg2;
    }

    @OriginalMember(owner = "client!vm", name = "toString", descriptor = "()Ljava/lang/String;", line = 39)
    public final String toString() {
        field3055++;
        return "Cache:" + this.field3054;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 47)
    public static void method1379(int arg0) {
        if (arg0 == 6684) {
            field3049 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BIZI)Z", line = 57)
    private final boolean method1380(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        field3053++;
        class441 var6 = this.field3048;
        synchronized (this.field3048) {
            try {
                int var8;
                if (arg3) {
                    if (((long) (arg4 * 6 + 6)) > this.field3050.method2580(false)) {
                        return false;
                    }
                    this.field3050.method2579(-50, (long) (arg4 * 6));
                    this.field3050.method2574(6, 4781, class703.field9950, 0);
                    var8 = (class703.field9950[3] & 0xFF << 16) + ((class703.field9950[4] & 0xFF) << 8) + (class703.field9950[5] & 0xFF);
                    if (var8 <= 0 || ((long) var8) > (this.field3048.method2580(false) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3048.method2580(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class703.field9950[2] = (byte) arg2;
                class703.field9950[0] = (byte) (arg2 >> 16);
                class703.field9950[1] = (byte) (arg2 >> 8);
                class703.field9950[3] = (byte) (var8 >> 16);
                class703.field9950[5] = (byte) var8;
                class703.field9950[4] = (byte) (var8 >> 8);
                this.field3050.method2579(-51, (long) (arg4 * 6));
                this.field3050.method2576(6, class703.field9950, (byte) 75, 0);
                int var10 = arg0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label104: {
                            this.field3048.method2579(-114, (long) (var8 * 520));
                            try {
                                this.field3048.method2574(8, arg0 + 4781, class703.field9950, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class703.field9950[0] & 0xFF << 8) + (class703.field9950[1] & 0xFF);
                            int var14 = (class703.field9950[2] & 0xFF << 8) + (class703.field9950[3] & 0xFF);
                            var12 = ((class703.field9950[4] & 0xFF) << 16) + (class703.field9950[6] & 0xFF) + (class703.field9950[5] & 0xFF << 8);
                            int var15 = class703.field9950[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field3054 == var15) {
                                if (var12 >= 0 && (this.field3048.method2580(false) / 520L) >= ((long) var12)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3048.method2580(false) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class703.field9950[3] = (byte) var11;
                    class703.field9950[0] = (byte) (arg4 >> 8);
                    class703.field9950[2] = (byte) (var11 >> 8);
                    class703.field9950[1] = (byte) arg4;
                    class703.field9950[7] = (byte) this.field3054;
                    class703.field9950[6] = (byte) var12;
                    class703.field9950[4] = (byte) (var12 >> 16);
                    class703.field9950[5] = (byte) (var12 >> 8);
                    this.field3048.method2579(arg0 - 36, (long) (var8 * 520));
                    this.field3048.method2576(8, class703.field9950, (byte) 103, 0);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3048.method2576(var18, arg1, (byte) 80, var10);
                    var11++;
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)[B", line = 174)
    public final byte[] method1381(boolean arg0, int arg1) {
        field3052++;
        class441 var3 = this.field3048;
        synchronized (this.field3048) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3050.method2580(false)) {
                    return null;
                }
                this.field3050.method2579(-83, (long) (arg1 * 6));
                this.field3050.method2574(6, 4781, class703.field9950, 0);
                int var5 = (class703.field9950[0] & 0xFF << 16) - (-(class703.field9950[1] & 0xFF << 8) - (class703.field9950[2] & 0xFF));
                if (!arg0) {
                    this.field3048 = null;
                }
                int var6 = ((class703.field9950[3] & 0xFF) << 16) + (class703.field9950[5] & 0xFF) + (class703.field9950[4] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field3047) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field3048.method2580(false) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3048.method2579(-102, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3048.method2574(var13 + 8, 4781, class703.field9950, 0);
                        int var14 = (class703.field9950[0] & 0xFF << 8) + (class703.field9950[1] & 0xFF);
                        int var15 = ((class703.field9950[2] & 0xFF) << 8) + (class703.field9950[3] & 0xFF);
                        int var16 = ((class703.field9950[4] & 0xFF) << 16) + (class703.field9950[5] & 0xFF << 8) + (class703.field9950[6] & 0xFF);
                        int var17 = class703.field9950[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3054 == var17) {
                            if (var16 >= 0 && (this.field3048.method2580(false) / 520L) >= ((long) var16)) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class703.field9950[var20 + 8];
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
}
