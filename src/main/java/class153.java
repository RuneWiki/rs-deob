import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class153 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Len;")
    private class41 field2382 = null;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Len;")
    private class41 field2387 = null;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    private int field2393 = 65000;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    private int field2384;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[I")
    public static int[] field2392 = new int[2];

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Ln;")
    public static class282 field2390 = new class282(64);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZIZZ)V", line = 10)
    public static final void method1037(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg6) {
            return;
        }
        if (arg2 > arg4) {
            int var7 = (arg2 + arg4) / 2;
            int var8 = arg4;
            class166 var9 = class20.field282[var7];
            class20.field282[var7] = class20.field282[arg2];
            class20.field282[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (class26.method166(var9, class20.field282[var10], 5730, arg0, arg1, arg3, arg5) <= 0) {
                    class166 var11 = class20.field282[var10];
                    class20.field282[var10] = class20.field282[var8];
                    class20.field282[var8++] = var11;
                }
            }
            class20.field282[arg2] = class20.field282[var8];
            class20.field282[var8] = var9;
            method1037(arg0, arg1, var8 - 1, arg3, arg4, arg5, false);
            method1037(arg0, arg1, arg2, arg3, var8 + 1, arg5, false);
        }
        field2396++;
    }

    @OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;", line = 67)
    public final String toString() {
        field2388++;
        return "Cache:" + this.field2384;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILen;Len;I)V", line = 326)
    public class153(int arg0, class41 arg1, class41 arg2, int arg3) {
        this.field2393 = arg3;
        this.field2387 = arg2;
        this.field2384 = arg0;
        this.field2382 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V", line = 81)
    public static final void method1038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 > -15) {
            field2394 = -64;
        }
        field2386++;
        if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
            return;
        }
        if (!class324.method2250(41) && (class92.field1492[0][arg1][arg4] & 0x2) == 0) {
            int var8 = arg2;
            if ((class92.field1492[arg2][arg1][arg4] & 0x8) != 0) {
                var8 = 0;
            }
            if (class109.field1737 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class92.field1492[1][arg1][arg4] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class318.method2210(-96, arg4, arg1, arg2, arg7, var9, class218.field3479[arg2]);
        if (arg0 >= 0) {
            boolean var10 = class22.field307;
            class22.field307 = true;
            class100.method739(var9, false, arg2, false, class218.field3479[arg2], arg0, arg6, arg1, (byte) 50, arg4, arg3);
            class22.field307 = var10;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 145)
    public static void method1039(boolean arg0) {
        field2392 = null;
        field2390 = null;
        if (!arg0) {
            field2390 = (class282) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BB)Z", line = 156)
    public final boolean method1040(int arg0, int arg1, byte[] arg2, byte arg3) {
        field2397++;
        class41 var5 = this.field2382;
        synchronized (this.field2382) {
            if (arg3 != -41) {
                return true;
            } else if (arg1 >= 0 && arg1 <= this.field2393) {
                boolean var6 = this.method1044((byte) 87, arg1, arg0, arg2, true);
                if (!var6) {
                    var6 = this.method1044((byte) 87, arg1, arg0, arg2, false);
                }
                return var6;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[B", line = 182)
    public final byte[] method1041(int arg0, byte arg1) {
        field2385++;
        class41 var3 = this.field2382;
        synchronized (this.field2382) {
            try {
                Object var10000;
                if (this.field2387.method328(0) < ((long) (arg0 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2387.method336(-35, (long) (arg0 * 6));
                this.field2387.method330(0, class104.field1667, 6, 0);
                int var4 = ((class104.field1667[3] & 0xFF) << 16) - (-(class104.field1667[4] & 0xFF << 8) - (class104.field1667[5] & 0xFF));
                int var5 = 24 / ((-arg1 - 4) / 40);
                int var6 = (class104.field1667[2] & 0xFF) + (class104.field1667[1] & 0xFF << 8) + (class104.field1667[0] & 0xFF << 16);
                if (var6 < 0 || this.field2393 < var6) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || ((long) var4) > (this.field2382.method328(0) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var7 = new byte[var6];
                    int var8 = 0;
                    int var9 = 0;
                    while (var8 < var6) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var10 = var6 - var8;
                        this.field2382.method336(-113, (long) (var4 * 520));
                        if (var10 > 512) {
                            var10 = 512;
                        }
                        this.field2382.method330(0, class104.field1667, var10 + 8, 0);
                        int var11 = (class104.field1667[0] & 0xFF << 8) + (class104.field1667[1] & 0xFF);
                        int var12 = (class104.field1667[2] & 0xFF << 8) + (class104.field1667[3] & 0xFF);
                        int var13 = class104.field1667[7] & 0xFF;
                        int var14 = (class104.field1667[4] & 0xFF << 16) + (class104.field1667[5] & 0xFF << 8) + (class104.field1667[6] & 0xFF);
                        if (arg0 != var11 || var9 != var12 || this.field2384 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var14 < 0 || (long) var14 > this.field2382.method328(0) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var15 = 0; var15 < var10; var15++) {
                            var7[var8++] = class104.field1667[var15 + 8];
                        }
                        var9++;
                        var4 = var14;
                    }
                    byte[] var20 = var7;
                    return var20;
                }
            } catch (IOException var18) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lna;", line = 265)
    public static final class26 method1042(int arg0, long arg1) {
        field2383++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            if (arg0 != -29664) {
                method1037(2, -55, -50, false, 52, false, false);
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class139.field2120[(int) (var7 - (arg1 * 37L))];
            }
            class26 var9 = new class26();
            var9.field418 = var6;
            var9.field436 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLve;)V", line = 310)
    public static final void method1043(byte arg0, class266 arg1) {
        field2389++;
        class314.field5374 = arg1;
        int var2 = -52 / ((arg0 + 55) / 36);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII[BZ)Z", line = 340)
    private final boolean method1044(byte arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        field2395++;
        class41 var6 = this.field2382;
        synchronized (this.field2382) {
            try {
                int var7;
                boolean var10000;
                if (arg4) {
                    if (this.field2387.method328(arg0 ^ 0x57) < (long) (arg2 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2387.method336(-116, (long) (arg2 * 6));
                    this.field2387.method330(0, class104.field1667, 6, 0);
                    var7 = (class104.field1667[3] & 0xFF << 16) + (class104.field1667[4] & 0xFF << 8) + (class104.field1667[5] & 0xFF);
                    if (var7 <= 0 || (this.field2382.method328(0) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2382.method328(arg0 - 87) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class104.field1667[0] = (byte) (arg1 >> 16);
                class104.field1667[4] = (byte) (var7 >> 8);
                int var8 = 0;
                class104.field1667[5] = (byte) var7;
                class104.field1667[2] = (byte) arg1;
                class104.field1667[3] = (byte) (var7 >> 16);
                if (arg0 != 87) {
                    this.method1044((byte) 41, 108, -107, (byte[]) null, true);
                }
                int var9 = 0;
                class104.field1667[1] = (byte) (arg1 >> 8);
                this.field2387.method336(-14, (long) (arg2 * 6));
                this.field2387.method335(class104.field1667, 0, arg0 ^ 0xCA2AB3E7, 6);
                while (true) {
                    if (var8 < arg1) {
                        label137: {
                            int var10 = 0;
                            if (arg4) {
                                this.field2382.method336(-116, (long) (var7 * 520));
                                try {
                                    this.field2382.method330(0, class104.field1667, 8, 0);
                                } catch (EOFException var18) {
                                    break label137;
                                }
                                var10 = ((class104.field1667[4] & 0xFF) << 16) + (class104.field1667[5] & 0xFF << 8) + (class104.field1667[6] & 0xFF);
                                int var12 = ((class104.field1667[0] & 0xFF) << 8) + (class104.field1667[1] & 0xFF);
                                int var13 = class104.field1667[7] & 0xFF;
                                int var14 = (class104.field1667[2] & 0xFF << 8) + (class104.field1667[3] & 0xFF);
                                if (arg2 != var12 || var9 != var14 || this.field2384 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field2382.method328(0) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            int var15 = arg1 - var8;
                            if (var10 == 0) {
                                arg4 = false;
                                var10 = (int) ((this.field2382.method328(0) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class104.field1667[7] = (byte) this.field2384;
                            class104.field1667[0] = (byte) (arg2 >> 8);
                            if ((arg1 - var8) <= 512) {
                                var10 = 0;
                            }
                            class104.field1667[4] = (byte) (var10 >> 16);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class104.field1667[1] = (byte) arg2;
                            class104.field1667[6] = (byte) var10;
                            class104.field1667[2] = (byte) (var9 >> 8);
                            class104.field1667[3] = (byte) var9;
                            var9++;
                            class104.field1667[5] = (byte) (var10 >> 8);
                            this.field2382.method336(arg0 - 128, (long) (var7 * 520));
                            var7 = var10;
                            this.field2382.method335(class104.field1667, 0, -903171152, 8);
                            this.field2382.method335(arg3, var8, -903171152, var15);
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
}
