import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class218 {

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Le;")
    private class248 field3356 = null;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Le;")
    private class248 field3355 = null;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    private int field3359 = 65000;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    private int field3364;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3357 = 0;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lil;")
    public static class4 field3363 = new class4(8);

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[F")
    public static float[] field3365 = new float[4];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Lsc;")
    public static class158 field3366;

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field3361++;
        return "Cache:" + this.field3364;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V", line = 12)
    public static final void method1471(int arg0, String arg1, String arg2, boolean arg3) {
        field3352++;
        class183.field2844 = arg0;
        class356.field5643 = arg1;
        class203.field3116 = arg2;
        if (class203.field3116.equals("") || class356.field5643.equals("")) {
            class15.field202 = 3;
        } else if (class203.field3111 == -1) {
            class33.field490 = 0;
            class181.field2822 = 0;
            class15.field202 = -3;
            class221.field3424 = 1;
            class313 var4 = new class313(128);
            var4.method2193(10, arg3);
            var4.method2222((int) (Math.random() * 9.9999999E7D), 255);
            var4.method2228(class265.method1872(class203.field3116, 91), true);
            var4.method2222((int) (Math.random() * 9.9999999E7D), 255);
            var4.method2223(0, class356.field5643);
            var4.method2222((int) (Math.random() * 9.9999999E7D), 255);
            var4.method2225(class251.field4006, class132.field2022, (byte) 1);
            class195.field2992.field5137 = 0;
            class195.field2992.method2193(24, arg3);
            class195.field2992.method2193(var4.field5137 + 2, false);
            class195.field2992.method2206(548, (byte) -42);
            class195.field2992.method2235((byte) 22, var4.field5124, 0, var4.field5137);
        } else {
            class31.method263(19130);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLsi;)V", line = 55)
    public static final void method1472(byte arg0, class264 arg1) {
        if (class56.field857 == arg1.field4298) {
            class116.field1694[arg1.field4357] = true;
        }
        if (arg0 <= 95) {
            method1475(68);
        }
        field3351++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lnm;I)V", line = 75)
    public static final void method1473(class221 arg0, int arg1) {
        if (arg1 == 31754) {
            class322.field5298 = arg0;
            field3360++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[BBII)Z", line = 97)
    private final boolean method1474(boolean arg0, byte[] arg1, byte arg2, int arg3, int arg4) {
        field3358++;
        class248 var6 = this.field3355;
        synchronized (this.field3355) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (this.field3356.method1762((byte) -22) < (long) (arg4 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3356.method1756(0, (long) (arg4 * 6));
                    this.field3356.method1766(class147.field2372, 6, (byte) 88, 0);
                    var7 = ((class147.field2372[3] & 0xFF) << 16) + ((class147.field2372[4] & 0xFF) << 8) + (class147.field2372[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field3355.method1762((byte) -126) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3355.method1762((byte) 88) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                int var8 = 0;
                class147.field2372[0] = (byte) (arg3 >> 16);
                class147.field2372[5] = (byte) var7;
                class147.field2372[2] = (byte) arg3;
                if (arg2 != -5) {
                    field3366 = (class158) null;
                }
                class147.field2372[3] = (byte) (var7 >> 16);
                class147.field2372[4] = (byte) (var7 >> 8);
                class147.field2372[1] = (byte) (arg3 >> 8);
                this.field3356.method1756(0, (long) (arg4 * 6));
                int var9 = 0;
                this.field3356.method1755(0, class147.field2372, 6, 54);
                while (true) {
                    if (arg3 > var8) {
                        label137: {
                            int var10 = 0;
                            if (arg0) {
                                this.field3355.method1756(arg2 + 5, (long) (var7 * 520));
                                try {
                                    this.field3355.method1766(class147.field2372, 8, (byte) -119, 0);
                                } catch (EOFException var18) {
                                    break label137;
                                }
                                int var12 = ((class147.field2372[0] & 0xFF) << 8) + (class147.field2372[1] & 0xFF);
                                int var13 = (class147.field2372[2] & 0xFF << 8) + (class147.field2372[3] & 0xFF);
                                var10 = (class147.field2372[4] & 0xFF << 16) + (class147.field2372[6] & 0xFF) + ((class147.field2372[5] & 0xFF) << 8);
                                int var14 = class147.field2372[7] & 0xFF;
                                if (arg4 != var12 || var9 != var13 || this.field3364 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field3355.method1762((byte) -48) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg0 = false;
                                var10 = (int) ((this.field3355.method1762((byte) -92) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class147.field2372[2] = (byte) (var9 >> 8);
                            class147.field2372[3] = (byte) var9;
                            if (arg3 - var8 <= 512) {
                                var10 = 0;
                            }
                            class147.field2372[5] = (byte) (var10 >> 8);
                            class147.field2372[0] = (byte) (arg4 >> 8);
                            class147.field2372[6] = (byte) var10;
                            class147.field2372[7] = (byte) this.field3364;
                            class147.field2372[1] = (byte) arg4;
                            class147.field2372[4] = (byte) (var10 >> 16);
                            this.field3355.method1756(arg2 ^ 0xFFFFFFFB, (long) (var7 * 520));
                            var7 = var10;
                            int var15 = arg3 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var9++;
                            this.field3355.method1755(0, class147.field2372, 8, 94);
                            this.field3355.method1755(var8, arg1, var15, 78);
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

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 218)
    public static void method1475(int arg0) {
        field3365 = null;
        int var1 = -25 / ((arg0 - 59) / 60);
        field3366 = null;
        field3363 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILe;Le;I)V", line = 359)
    public class218(int arg0, class248 arg1, class248 arg2, int arg3) {
        this.field3355 = arg1;
        this.field3364 = arg0;
        this.field3356 = arg2;
        this.field3359 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIIB)Z", line = 245)
    public final boolean method1476(byte[] arg0, int arg1, int arg2, byte arg3) {
        field3362++;
        class248 var5 = this.field3355;
        synchronized (this.field3355) {
            if (arg2 < 0 || this.field3359 < arg2) {
                throw new IllegalArgumentException();
            }
            if (arg3 > -86) {
                this.toString();
            }
            boolean var6 = this.method1474(true, arg0, (byte) -5, arg2, arg1);
            if (!var6) {
                var6 = this.method1474(false, arg0, (byte) -5, arg2, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[B", line = 271)
    public final byte[] method1477(int arg0, int arg1) {
        field3354++;
        if (arg1 <= 53) {
            return (byte[]) null;
        }
        class248 var3 = this.field3355;
        synchronized (this.field3355) {
            try {
                Object var10000;
                if (((long) (arg0 * 6 + 6)) > this.field3356.method1762((byte) 81)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3356.method1756(0, (long) (arg0 * 6));
                this.field3356.method1766(class147.field2372, 6, (byte) -83, 0);
                int var4 = ((class147.field2372[0] & 0xFF) << 16) + (class147.field2372[1] & 0xFF << 8) + (class147.field2372[2] & 0xFF);
                int var5 = ((class147.field2372[4] & 0xFF) << 8) + ((class147.field2372[3] & 0xFF) << 16) + (class147.field2372[5] & 0xFF);
                if (var4 < 0 || var4 > this.field3359) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 > 0 && (this.field3355.method1762((byte) 107) / 520L) >= ((long) var5)) {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    label96: while (var7 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var7;
                        this.field3355.method1756(0, (long) (var5 * 520));
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field3355.method1766(class147.field2372, var9 + 8, (byte) -82, 0);
                        int var10 = ((class147.field2372[0] & 0xFF) << 8) + (class147.field2372[1] & 0xFF);
                        int var11 = (class147.field2372[4] & 0xFF << 16) + (class147.field2372[6] & 0xFF) + ((class147.field2372[5] & 0xFF) << 8);
                        int var12 = (class147.field2372[2] & 0xFF << 8) + (class147.field2372[3] & 0xFF);
                        int var13 = class147.field2372[7] & 0xFF;
                        if (arg0 == var10 && var8 == var12 && this.field3364 == var13) {
                            if (var11 >= 0 && (long) var11 <= this.field3355.method1762((byte) 63) / 520L) {
                                var8++;
                                var5 = var11;
                                int var14 = 0;
                                while (true) {
                                    if (var14 >= var9) {
                                        continue label96;
                                    }
                                    var6[var7++] = class147.field2372[var14 + 8];
                                    var14++;
                                }
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
