import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class171 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lhca;")
    private class455 field2081 = null;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lhca;")
    private class455 field2086 = null;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    private int field2090 = 65000;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    private int field2088;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lgfa;")
    public static class696 field2091 = new class696(7, 0, 1, 1);

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[I")
    public static int[] field2093 = null;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([BIII)Z")
    public final boolean method1075(byte[] arg0, int arg1, int arg2, int arg3) {
        field2084++;
        class455 var5 = this.field2081;
        synchronized (this.field2081) {
            if (arg1 < 0 || this.field2090 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1078(arg3, arg0, true, 0, arg1);
            if (!var6) {
                var6 = this.method1078(arg3, arg0, false, 0, arg1);
            }
            int var7 = -56 / ((arg2 - 39) / 40);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[B")
    public final byte[] method1076(int arg0, int arg1) {
        field2082++;
        class455 var3 = this.field2081;
        synchronized (this.field2081) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field2086.method2701(false)) {
                    return null;
                }
                this.field2086.method2698((byte) -79, (long) (arg1 * 6));
                this.field2086.method2700(class443.field6306, 0, 6, false);
                int var5 = (class443.field6306[2] & 0xFF) + (class443.field6306[1] & 0xFF << 8) + (class443.field6306[0] & 0xFF << 16);
                int var6 = (class443.field6306[3] & 0xFF << 16) - (-(class443.field6306[4] & 0xFF << 8) - (class443.field6306[5] & 0xFF));
                if (var5 < 0 || var5 > this.field2090) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field2081.method2701(false) / 520L)) {
                    if (arg0 != 21946) {
                        field2089 = 21;
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2081.method2698((byte) -119, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2081.method2700(class443.field6306, 0, var13 + 8, false);
                        int var14 = ((class443.field6306[0] & 0xFF) << 8) + (class443.field6306[1] & 0xFF);
                        int var15 = ((class443.field6306[2] & 0xFF) << 8) + (class443.field6306[3] & 0xFF);
                        int var16 = (class443.field6306[6] & 0xFF) + (((class443.field6306[4] & 0xFF) << 16) + ((class443.field6306[5] & 0xFF) << 8));
                        int var17 = class443.field6306[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field2088 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field2081.method2701(false) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class443.field6306[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method1077(byte arg0) {
        if (arg0 != -6) {
            field2092 = -101;
        }
        field2093 = null;
        field2091 = null;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(ILhca;Lhca;I)V")
    public class171(int arg0, class455 arg1, class455 arg2, int arg3) {
        this.field2086 = arg2;
        this.field2081 = arg1;
        this.field2088 = arg0;
        this.field2090 = arg3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method1078(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field2083++;
        class455 var6 = this.field2081;
        synchronized (this.field2081) {
            try {
                int var7;
                if (arg2) {
                    if (this.field2086.method2701(false) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field2086.method2698((byte) -105, (long) (arg0 * 6));
                    this.field2086.method2700(class443.field6306, 0, 6, false);
                    var7 = (class443.field6306[4] & 0xFF << 8) + (class443.field6306[3] & 0xFF << 16) + (class443.field6306[5] & 0xFF);
                    if (var7 <= 0 || this.field2081.method2701(false) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2081.method2701(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class443.field6306[2] = (byte) arg4;
                class443.field6306[0] = (byte) (arg4 >> 16);
                class443.field6306[5] = (byte) var7;
                class443.field6306[4] = (byte) (var7 >> 8);
                class443.field6306[3] = (byte) (var7 >> 16);
                class443.field6306[1] = (byte) (arg4 >> 8);
                this.field2086.method2698((byte) -80, (long) (arg0 * 6));
                this.field2086.method2702(6, 8, 0, class443.field6306);
                int var10 = arg3;
                int var11 = 0;
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label105: {
                            this.field2081.method2698((byte) -93, (long) (var7 * 520));
                            try {
                                this.field2081.method2700(class443.field6306, 0, 8, false);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class443.field6306[0] & 0xFF) << 8) + (class443.field6306[1] & 0xFF);
                            int var14 = ((class443.field6306[2] & 0xFF) << 8) + (class443.field6306[3] & 0xFF);
                            var12 = (class443.field6306[6] & 0xFF) + (class443.field6306[4] & 0xFF << 16) + (class443.field6306[5] & 0xFF << 8);
                            int var15 = class443.field6306[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field2088 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2081.method2701(false) / 520L) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field2081.method2701(false) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class443.field6306[3] = (byte) var11;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class443.field6306[2] = (byte) (var11 >> 8);
                    class443.field6306[0] = (byte) (arg0 >> 8);
                    class443.field6306[1] = (byte) arg0;
                    class443.field6306[5] = (byte) (var12 >> 8);
                    class443.field6306[7] = (byte) this.field2088;
                    class443.field6306[6] = (byte) var12;
                    class443.field6306[4] = (byte) (var12 >> 16);
                    this.field2081.method2698((byte) -106, (long) (var7 * 520));
                    this.field2081.method2702(8, arg3 ^ 0x8, 0, class443.field6306);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2081.method2702(var18, 8, var10, arg1);
                    var7 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIII)V")
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= class587.field8513 && class221.field2866 >= arg5 && arg4 >= class598.field8632 && class288.field3883 >= arg3) {
            class463.method2724(arg3, 967, arg5, arg4, arg2, arg0);
        } else {
            class420.method2533(arg2, arg4, arg5, arg0, arg3, (byte) 85);
        }
        field2087++;
        if (arg1 >= -13) {
            field2089 = -81;
        }
    }

    @OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2085++;
        return "Cache:" + this.field2088;
    }
}
