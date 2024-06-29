import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class161 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lmd;")
    private class111 field3346 = null;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    private int field3356 = 65000;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lmd;")
    private class111 field3365 = null;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lea;")
    private static class38 field3347 = class9.method46((byte) 101, "Your account has been disabled)3");

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lea;")
    public static class38 field3348 = field3347;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lea;")
    public static class38 field3351 = class9.method46((byte) 121, ": ");

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lea;")
    public static class38 field3353 = class9.method46((byte) 104, "<col=00ffff>");

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[Lea;")
    public static class38[] field3357 = new class38[200];

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lea;")
    public static class38 field3362 = class9.method46((byte) 127, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lea;")
    private static class38 field3358 = class9.method46((byte) 102, "Error loading your profile)3");

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lea;")
    public static class38 field3354 = field3358;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Lea;")
    private static class38 field3364 = class9.method46((byte) 110, "Loaded interfaces");

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lea;")
    public static class38 field3361 = field3364;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lob;")
    public static class127 field3345;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lob;")
    public static class127 field3350;

    @OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3349++;
        return "Cache:" + this.field3360;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BIZII)Z")
    private final boolean method1158(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3355++;
        class111 var6 = this.field3365;
        synchronized (this.field3365) {
            try {
                if (arg3 != 20356) {
                    this.method1158(null, 64, false, 103, 75);
                }
                int var8;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field3346.method883((byte) -110)) {
                        return false;
                    }
                    this.field3346.method881((long) (arg4 * 6), 0);
                    this.field3346.method876(0, (byte) 99, 6, class95.field2133);
                    var8 = ((class95.field2133[3] & 0xFF) << 16) + (class95.field2133[5] & 0xFF) + ((class95.field2133[4] & 0xFF) << 8);
                    if (var8 <= 0 || (long) var8 > this.field3365.method883((byte) -102) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3365.method883((byte) -83) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class95.field2133[2] = (byte) arg1;
                class95.field2133[3] = (byte) (var8 >> 16);
                int var10 = 0;
                class95.field2133[4] = (byte) (var8 >> 8);
                class95.field2133[1] = (byte) (arg1 >> 8);
                class95.field2133[0] = (byte) (arg1 >> 16);
                class95.field2133[5] = (byte) var8;
                this.field3346.method881((long) (arg4 * 6), arg3 - 20356);
                this.field3346.method882(class95.field2133, 0, -128, 6);
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field3365.method881((long) (var8 * 520), 0);
                            try {
                                this.field3365.method876(0, (byte) 99, 8, class95.field2133);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class95.field2133[5] & 0xFF) << 8) + (class95.field2133[4] << 16 & 0xFF0000) + (class95.field2133[6] & 0xFF);
                            int var13 = ((class95.field2133[0] & 0xFF) << 8) + (class95.field2133[1] & 0xFF);
                            int var14 = ((class95.field2133[2] & 0xFF) << 8) + (class95.field2133[3] & 0xFF);
                            int var15 = class95.field2133[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field3360 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3365.method883((byte) -54) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg1 - var10;
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field3365.method883((byte) -118) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class95.field2133[7] = (byte) this.field3360;
                    class95.field2133[0] = (byte) (arg4 >> 8);
                    class95.field2133[2] = (byte) (var11 >> 8);
                    class95.field2133[3] = (byte) var11;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class95.field2133[4] = (byte) (var12 >> 16);
                    class95.field2133[1] = (byte) arg4;
                    class95.field2133[6] = (byte) var12;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class95.field2133[5] = (byte) (var12 >> 8);
                    var11++;
                    this.field3365.method881((long) (var8 * 520), 0);
                    this.field3365.method882(class95.field2133, 0, -119, 8);
                    var8 = var12;
                    this.field3365.method882(arg0, var10, -128, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1159(boolean arg0) {
        field3348 = null;
        field3362 = null;
        field3358 = null;
        if (arg0) {
            field3347 = null;
        }
        field3354 = null;
        field3353 = null;
        field3361 = null;
        field3345 = null;
        field3357 = null;
        field3347 = null;
        field3350 = null;
        field3364 = null;
        field3351 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[B")
    public final byte[] method1160(int arg0, int arg1) {
        field3363++;
        class111 var3 = this.field3365;
        synchronized (this.field3365) {
            try {
                if (this.field3346.method883((byte) -118) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field3346.method881((long) (arg0 * 6), 0);
                this.field3346.method876(0, (byte) 99, 6, class95.field2133);
                if (arg1 > -99) {
                    method1159(false);
                }
                int var5 = ((class95.field2133[0] & 0xFF) << 16) + (class95.field2133[2] & 0xFF) + ((class95.field2133[1] & 0xFF) << 8);
                int var6 = (class95.field2133[5] & 0xFF) + ((class95.field2133[3] & 0xFF) << 16) + ((class95.field2133[4] & 0xFF) << 8);
                if (var5 < 0 || this.field3356 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3365.method883((byte) -124) / 520L) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3365.method881((long) (var6 * 520), 0);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3365.method876(0, (byte) 99, var13 + 8, class95.field2133);
                        int var14 = ((class95.field2133[0] & 0xFF) << 8) + (class95.field2133[1] & 0xFF);
                        int var15 = ((class95.field2133[2] & 0xFF) << 8) + (class95.field2133[3] & 0xFF);
                        int var16 = (class95.field2133[6] & 0xFF) + ((class95.field2133[4] & 0xFF) << 16) + ((class95.field2133[5] & 0xFF) << 8);
                        int var17 = class95.field2133[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3360 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3365.method883((byte) -66) / 520L) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class95.field2133[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1161(int arg0, int arg1, byte[] arg2, int arg3) {
        field3359++;
        class111 var5 = this.field3365;
        synchronized (this.field3365) {
            if (arg3 < 0 || this.field3356 < arg3) {
                throw new IllegalArgumentException();
            }
            if (arg0 != 520) {
                field3361 = null;
            }
            boolean var6 = this.method1158(arg2, arg3, true, 20356, arg1);
            if (!var6) {
                var6 = this.method1158(arg2, arg3, false, 20356, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILmd;Lmd;I)V")
    public class161(int arg0, class111 arg1, class111 arg2, int arg3) {
        this.field3356 = arg3;
        this.field3346 = arg2;
        this.field3360 = arg0;
        this.field3365 = arg1;
    }
}
