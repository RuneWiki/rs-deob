import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class292 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Laf;")
    private class122 field4370 = null;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    private int field4373 = 65000;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Laf;")
    private class122 field4368 = null;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    private int field4375;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field4379 = -1;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "[S")
    public static short[] field4377 = new short[256];

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Lok;")
    public static class74 field4376;

    @OriginalMember(owner = "client!ur", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field4378++;
        return "Cache:" + this.field4375;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1808(boolean arg0) {
        field4376 = null;
        field4377 = null;
        if (arg0) {
            method1814(53, -111, 29, 75, null, 90, false, null);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([BIII)Z", line = 24)
    public final boolean method1809(byte[] arg0, int arg1, int arg2, int arg3) {
        field4372++;
        class122 var5 = this.field4368;
        synchronized (this.field4368) {
            if (arg1 < 0 || this.field4373 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1813(arg2 ^ 0xFFFFFFDD, arg0, arg1, arg3, true);
            if (arg2 != 0) {
                method1810(49);
            }
            if (!var6) {
                var6 = this.method1813(-15, arg0, arg1, arg3, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILaf;Laf;I)V", line = 314)
    public class292(int arg0, class122 arg1, class122 arg2, int arg3) {
        this.field4375 = arg0;
        this.field4373 = arg3;
        this.field4370 = arg2;
        this.field4368 = arg1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 61)
    public static final void method1810(int arg0) {
        class520.field7639.method2293(false);
        field4371++;
        class334.field5170.method2293(false);
        if (arg0 != 8) {
            method1814(-109, -46, 31, -101, null, 39, true, null);
        }
        class510.field7491.method2293(false);
        class179.field2643.method2293(false);
        class81.field1152.method2293(false);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[B", line = 79)
    public final byte[] method1811(int arg0, int arg1) {
        field4382++;
        class122 var3 = this.field4368;
        synchronized (this.field4368) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field4370.method907((byte) 118)) {
                    return null;
                }
                this.field4370.method908((long) (arg1 * 6), (byte) -126);
                this.field4370.method912(class494.field7343, false, 0, 6);
                int var5 = ((class494.field7343[1] & 0xFF) << 8) + (class494.field7343[0] & 0xFF << 16) + (class494.field7343[2] & 0xFF);
                int var6 = (class494.field7343[5] & 0xFF) + (class494.field7343[4] & 0xFF << 8) + (class494.field7343[3] & 0xFF << 16);
                if (var5 < 0 || this.field4373 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4368.method907((byte) 117) / 520L)) {
                    byte[] var9 = new byte[var5];
                    if (arg0 != -424700720) {
                        field4376 = null;
                    }
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4368.method908((long) (var6 * 520), (byte) -103);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4368.method912(class494.field7343, false, 0, var13 + 8);
                        int var14 = (class494.field7343[0] & 0xFF << 8) + (class494.field7343[1] & 0xFF);
                        int var15 = ((class494.field7343[2] & 0xFF) << 8) + (class494.field7343[3] & 0xFF);
                        int var16 = ((class494.field7343[4] & 0xFF) << 16) + (class494.field7343[5] & 0xFF << 8) + (class494.field7343[6] & 0xFF);
                        int var17 = class494.field7343[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4375 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field4368.method907((byte) 117) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class494.field7343[var20 + 8];
                                }
                                var11++;
                                var6 = var16;
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

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILgo;)V", line = 175)
    public static final void method1812(int arg0, class310 arg1) {
        field4381++;
        if (class206.field2993 == arg1.field4683) {
            class147.field2223[arg1.field4688] = true;
        }
        if (arg0 != -14307) {
            method1814(-6, 86, -25, -82, null, 56, true, null);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[BIIZ)Z", line = 193)
    private final boolean method1813(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field4374++;
        class122 var6 = this.field4368;
        synchronized (this.field4368) {
            try {
                int var8;
                if (arg4) {
                    if (this.field4370.method907((byte) 120) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field4370.method908((long) (arg3 * 6), (byte) -111);
                    this.field4370.method912(class494.field7343, false, 0, 6);
                    var8 = (class494.field7343[3] & 0xFF << 16) + ((class494.field7343[4] & 0xFF) << 8) + (class494.field7343[5] & 0xFF);
                    if (var8 <= 0 || this.field4368.method907((byte) 122) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4368.method907((byte) 125) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class494.field7343[1] = (byte) (arg2 >> 8);
                class494.field7343[0] = (byte) (arg2 >> 16);
                class494.field7343[4] = (byte) (var8 >> 8);
                class494.field7343[5] = (byte) var8;
                class494.field7343[3] = (byte) (var8 >> 16);
                class494.field7343[2] = (byte) arg2;
                this.field4370.method908((long) (arg3 * 6), (byte) -105);
                this.field4370.method909(6, 0, class494.field7343, 16711680);
                int var10 = 0;
                int var11 = 0;
                if (arg0 > -9) {
                    field4380 = 82;
                }
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg4) {
                        label106: {
                            this.field4368.method908((long) (var8 * 520), (byte) -117);
                            try {
                                this.field4368.method912(class494.field7343, false, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class494.field7343[0] & 0xFF) << 8) + (class494.field7343[1] & 0xFF);
                            int var14 = ((class494.field7343[2] & 0xFF) << 8) + (class494.field7343[3] & 0xFF);
                            var12 = (class494.field7343[5] & 0xFF << 8) + ((class494.field7343[4] & 0xFF) << 16) + (class494.field7343[6] & 0xFF);
                            int var15 = class494.field7343[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field4375 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field4368.method907((byte) -26) / 520L) {
                                    break label106;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field4368.method907((byte) -59) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class494.field7343[2] = (byte) (var11 >> 8);
                    class494.field7343[1] = (byte) arg3;
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class494.field7343[0] = (byte) (arg3 >> 8);
                    class494.field7343[3] = (byte) var11;
                    class494.field7343[6] = (byte) var12;
                    class494.field7343[7] = (byte) this.field4375;
                    class494.field7343[4] = (byte) (var12 >> 16);
                    class494.field7343[5] = (byte) (var12 >> 8);
                    this.field4368.method908((long) (var8 * 520), (byte) -113);
                    this.field4368.method909(8, 0, class494.field7343, 16711680);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4368.method909(var18, var10, arg1, 16711680);
                    var10 += var18;
                    var8 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIILvd;IZ[B)Lwq;", line = 328)
    public static final class283 method1814(int arg0, int arg1, int arg2, int arg3, class258 arg4, int arg5, boolean arg6, byte[] arg7) {
        field4369++;
        if (arg5 != 3557) {
            return null;
        } else if (!arg4.field3845 && (!class384.method2305(1, arg0) || !class384.method2305(1, arg3))) {
            return arg4.field3744 ? new class283(arg4, 34037, arg2, arg0, arg3, arg6, arg7, arg1) : new class283(arg4, arg2, arg0, arg3, class143.method1039(arg5 ^ 0xDED, arg0), class143.method1039(8, arg3), arg7, arg1);
        } else {
            return new class283(arg4, 3553, arg2, arg0, arg3, arg6, arg7, arg1);
        }
    }
}
