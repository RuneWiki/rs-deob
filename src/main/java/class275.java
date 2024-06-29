import java.io.EOFException;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class275 {

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    private int field4415 = 65000;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Lwm;")
    private class524 field4419 = null;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Lwm;")
    private class524 field4414 = null;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    private int field4423;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field4413 = 0;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4418 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field4426 = 104;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lffa;")
    public static class170 field4412;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "Lri;")
    public static class97 field4424;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)[B")
    public final byte[] method1930(int arg0, int arg1) {
        field4422++;
        class524 var3 = this.field4414;
        synchronized (this.field4414) {
            try {
                if ((long) (arg0 * arg1 + 6) > this.field4419.method3155(true)) {
                    return null;
                }
                this.field4419.method3154((byte) -75, (long) (arg1 * 6));
                this.field4419.method3163((byte) -106, 0, 6, class66.field856);
                int var5 = (class66.field856[0] & 0xFF << 16) + (class66.field856[1] & 0xFF << 8) + (class66.field856[2] & 0xFF);
                int var6 = ((class66.field856[3] & 0xFF) << 16) + ((class66.field856[4] & 0xFF) << 8) + (class66.field856[5] & 0xFF);
                if (var5 < 0 || this.field4415 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field4414.method3155(true) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4414.method3154((byte) -75, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4414.method3163((byte) -106, 0, var13 + 8, class66.field856);
                        int var14 = (class66.field856[0] & 0xFF << 8) + (class66.field856[1] & 0xFF);
                        int var15 = ((class66.field856[2] & 0xFF) << 8) + (class66.field856[3] & 0xFF);
                        int var16 = ((class66.field856[5] & 0xFF) << 8) + (class66.field856[4] & 0xFF << 16) + (class66.field856[6] & 0xFF);
                        int var17 = class66.field856[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4423 == var17) {
                            if (var16 >= 0 && this.field4414.method3155(true) / 520L >= (long) var16) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class66.field856[var20 + 8];
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

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([BIII)[B")
    public static final byte[] method1931(byte[] arg0, int arg1, int arg2, int arg3) {
        field4416++;
        byte[] var4;
        if (arg2 > 0) {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg0[arg2 + var5];
            }
        } else {
            var4 = arg0;
        }
        class301 var6 = new class301();
        var6.method2081((byte) 3);
        var6.method2078((long) (arg1 * 8), false, var4);
        if (arg3 != 29654) {
            field4412 = null;
        }
        byte[] var7 = new byte[64];
        var6.method2077(var7, 0, (byte) 81);
        return var7;
    }

    @OriginalMember(owner = "client!mu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4425++;
        return "Cache:" + this.field4423;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static void method1932(int arg0) {
        if (arg0 != 65000) {
            method1931(null, -40, -114, 82);
        }
        field4418 = null;
        field4412 = null;
        field4424 = null;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "([BIII)Z")
    public final boolean method1933(byte[] arg0, int arg1, int arg2, int arg3) {
        field4421++;
        class524 var5 = this.field4414;
        synchronized (this.field4414) {
            if (arg1 < 0 || arg1 > this.field4415) {
                throw new IllegalArgumentException();
            }
            if (arg2 <= 94) {
                this.field4423 = 39;
            }
            boolean var6 = this.method1934(arg3, arg0, false, true, arg1);
            if (!var6) {
                var6 = this.method1934(arg3, arg0, false, false, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BZZI)Z")
    private final boolean method1934(int arg0, byte[] arg1, boolean arg2, boolean arg3, int arg4) {
        field4420++;
        class524 var6 = this.field4414;
        synchronized (this.field4414) {
            try {
                int var7;
                if (arg3) {
                    if (this.field4419.method3155(true) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field4419.method3154((byte) -75, (long) (arg0 * 6));
                    this.field4419.method3163((byte) -106, 0, 6, class66.field856);
                    var7 = ((class66.field856[4] & 0xFF) << 8) + (class66.field856[3] & 0xFF << 16) + (class66.field856[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field4414.method3155(!arg2) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4414.method3155(!arg2) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class66.field856[0] = (byte) (arg4 >> 16);
                class66.field856[4] = (byte) (var7 >> 8);
                class66.field856[2] = (byte) arg4;
                class66.field856[1] = (byte) (arg4 >> 8);
                class66.field856[5] = (byte) var7;
                if (arg2) {
                    return false;
                }
                class66.field856[3] = (byte) (var7 >> 16);
                this.field4419.method3154((byte) -75, (long) (arg0 * 6));
                this.field4419.method3158(arg2, 6, 0, class66.field856);
                int var11 = 0;
                int var12 = 0;
                while (arg4 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        this.field4414.method3154((byte) -75, (long) (var7 * 520));
                        try {
                            this.field4414.method3163((byte) -106, 0, 8, class66.field856);
                        } catch (EOFException var36) {
                            return true;
                        }
                        int var14 = ((class66.field856[0] & 0xFF) << 8) + (class66.field856[1] & 0xFF);
                        var13 = (class66.field856[5] & 0xFF << 8) + (((class66.field856[4] & 0xFF) << 16) + (class66.field856[6] & 0xFF));
                        int var15 = (class66.field856[2] & 0xFF << 8) + (class66.field856[3] & 0xFF);
                        int var16 = class66.field856[7] & 0xFF;
                        if (arg0 != var14 || var12 != var15 || this.field4423 != var16) {
                            return false;
                        }
                        if (var13 < 0 || this.field4414.method3155(true) / 520L < (long) var13) {
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field4414.method3155(true) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class66.field856[3] = (byte) var12;
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class66.field856[2] = (byte) (var12 >> 8);
                    class66.field856[0] = (byte) (arg0 >> 8);
                    class66.field856[1] = (byte) arg0;
                    class66.field856[5] = (byte) (var13 >> 8);
                    class66.field856[4] = (byte) (var13 >> 16);
                    class66.field856[6] = (byte) var13;
                    class66.field856[7] = (byte) this.field4423;
                    this.field4414.method3154((byte) -75, (long) (var7 * 520));
                    this.field4414.method3158(false, 8, 0, class66.field856);
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4414.method3158(false, var19, var11, arg1);
                    var11 += var19;
                    var7 = var13;
                    var12++;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(ILwm;Lwm;I)V")
    public class275(int arg0, class524 arg1, class524 arg2, int arg3) {
        this.field4423 = arg0;
        this.field4414 = arg1;
        this.field4419 = arg2;
        this.field4415 = arg3;
    }
}
