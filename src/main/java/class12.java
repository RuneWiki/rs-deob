import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field307 = 65000;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lo;")
    private class152 field305 = null;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lo;")
    private class152 field315 = null;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field312 = new Random();

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
    public static boolean field317 = true;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lqe;")
    private static class179 field318 = class206.method1380("Service unavailable)3", (byte) -126);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lqe;")
    public static class179 field319 = field318;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB[BI)Z")
    public final boolean method81(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != -41) {
            this.field305 = null;
        }
        field314++;
        class152 var5 = this.field315;
        synchronized (this.field315) {
            if (arg3 < 0 || arg3 > this.field307) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method83(arg1 ^ 0x2F10, arg2, arg3, arg0, true);
            if (!var6) {
                var6 = this.method83(-12089, arg2, arg3, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)Lqe;")
    public static final class179 method82(int arg0, long arg1) {
        field316++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != 4) {
                return null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class188.field3501[(int) (var8 - arg1 * 37L)];
            }
            class179 var7 = new class179();
            var7.field3256 = var6;
            var7.field3277 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[BIIZ)Z")
    private final boolean method83(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field309++;
        class152 var6 = this.field315;
        synchronized (this.field315) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg3 * 6 + 6) > this.field305.method969((byte) 99)) {
                        return false;
                    }
                    this.field305.method980((byte) 90, (long) (arg3 * 6));
                    this.field305.method973(6, 0, (byte) 97, class124.field2285);
                    var8 = ((class124.field2285[3] & 0xFF) << 16) + ((class124.field2285[4] & 0xFF) << 8) + (class124.field2285[5] & 0xFF);
                    if (var8 <= 0 || this.field315.method969((byte) 62) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field315.method969((byte) 121) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                if (arg0 != -12089) {
                    return false;
                }
                int var11 = 0;
                class124.field2285[0] = (byte) (arg2 >> 16);
                class124.field2285[1] = (byte) (arg2 >> 8);
                class124.field2285[5] = (byte) var8;
                class124.field2285[2] = (byte) arg2;
                class124.field2285[3] = (byte) (var8 >> 16);
                class124.field2285[4] = (byte) (var8 >> 8);
                this.field305.method980((byte) 90, (long) (arg3 * 6));
                int var12 = 0;
                this.field305.method977(false, class124.field2285, 0, 6);
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field315.method980((byte) 90, (long) (var8 * 520));
                            try {
                                this.field315.method973(8, 0, (byte) 97, class124.field2285);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class124.field2285[2] & 0xFF) << 8) + (class124.field2285[3] & 0xFF);
                            var13 = (class124.field2285[6] & 0xFF) + (((class124.field2285[4] & 0xFF) << 16) + ((class124.field2285[5] & 0xFF) << 8));
                            int var15 = ((class124.field2285[0] & 0xFF) << 8) + (class124.field2285[1] & 0xFF);
                            int var16 = class124.field2285[7] & 0xFF;
                            if (arg3 == var15 && var12 == var14 && this.field308 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field315.method969((byte) 95) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg4 = false;
                        var13 = (int) ((this.field315.method969((byte) 55) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class124.field2285[1] = (byte) arg3;
                    class124.field2285[3] = (byte) var12;
                    if (arg2 - var11 <= 512) {
                        var13 = 0;
                    }
                    class124.field2285[6] = (byte) var13;
                    int var19 = arg2 - var11;
                    class124.field2285[7] = (byte) this.field308;
                    class124.field2285[0] = (byte) (arg3 >> 8);
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class124.field2285[2] = (byte) (var12 >> 8);
                    class124.field2285[4] = (byte) (var13 >> 16);
                    var12++;
                    class124.field2285[5] = (byte) (var13 >> 8);
                    this.field315.method980((byte) 90, (long) (var8 * 520));
                    var8 = var13;
                    this.field315.method977(false, class124.field2285, 0, 8);
                    this.field315.method977(false, arg1, var11, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method84(int arg0) {
        field306++;
        int var1 = (class61.field1298.field3198 >> 7) + class141.field2582;
        class110.field2059 = 0;
        int var2 = (class61.field1298.field3159 >> 7) + class2.field26;
        if (arg0 != 5) {
            return;
        }
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class110.field2059 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class110.field2059 = 1;
        }
        if (class110.field2059 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class110.field2059 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[B")
    public final byte[] method85(int arg0, int arg1) {
        field311++;
        class152 var3 = this.field315;
        synchronized (this.field315) {
            try {
                if (this.field305.method969((byte) 62) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field305.method980((byte) 90, (long) (arg0 * 6));
                this.field305.method973(6, 0, (byte) 97, class124.field2285);
                int var5 = ((class124.field2285[0] & 0xFF) << 16) + ((class124.field2285[1] & 0xFF) << 8) + (class124.field2285[2] & 0xFF);
                int var6 = (class124.field2285[5] & 0xFF) + ((class124.field2285[4] & 0xFF) << 8) + ((class124.field2285[3] & 0xFF) << 16);
                if (arg1 != -1127279480) {
                    field318 = null;
                }
                if (var5 < 0 || var5 > this.field307) {
                    return null;
                } else if (var6 > 0 && this.field315.method969((byte) 53) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field315.method980((byte) 90, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field315.method973(var13 + 8, 0, (byte) 97, class124.field2285);
                        int var14 = ((class124.field2285[2] & 0xFF) << 8) + (class124.field2285[3] & 0xFF);
                        int var15 = ((class124.field2285[0] & 0xFF) << 8) + (class124.field2285[1] & 0xFF);
                        int var16 = ((class124.field2285[4] & 0xFF) << 16) + (class124.field2285[5] << 8 & 0xFF00) + (class124.field2285[6] & 0xFF);
                        int var17 = class124.field2285[7] & 0xFF;
                        if (arg0 == var15 && var11 == var14 && this.field308 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field315.method969((byte) 96) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class124.field2285[var20 + 8];
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

    @OriginalMember(owner = "client!b", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field313++;
        return "Cache:" + this.field308;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field310++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg3 - arg1;
        int var11 = 0;
        int var12 = arg3 * arg3;
        int var13 = arg0 * arg0;
        int var14 = arg0 - arg1;
        int var15 = var10 * var10;
        int var16 = var14 * var14;
        int var17 = var13 << 1;
        int var18 = var12 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg0 << 1;
        int var22 = var13 - (var21 - 1) * var18;
        int var23 = var14 << 1;
        int var24 = (1 - var23) * var15 + var20;
        int var25 = var16 - (var23 - 1) * var19;
        int var26 = (1 - var21) * var12 + var17;
        int var27 = var12 << 2;
        int var28 = var15 << 2;
        int var29 = var16 << 2;
        int var30 = var17 * 3;
        int var31 = var13 << 2;
        int var32 = (var21 - 3) * var18;
        int var33 = var20 * 3;
        int var34 = (arg0 - 1) * var27;
        int var35 = (var23 - 3) * var19;
        int var36 = var29;
        int var37 = var31;
        int var38 = (var14 - 1) * var28;
        int[] var39 = class14.field331[arg2];
        class23.method161(arg4 - var10, -1, arg6, arg4 - arg3, var39);
        class23.method161(arg4 + var10, -1, arg7, arg4 - var10, var39);
        class23.method161(arg3 + arg4, -1, arg6, arg4 + var10, var39);
        while (var9 > 0) {
            if (var26 < 0) {
                while (var26 < 0) {
                    var22 += var37;
                    var26 += var30;
                    var30 += var31;
                    var37 += var31;
                    var8++;
                }
            }
            if (var22 < 0) {
                var8++;
                var22 += var37;
                var37 += var31;
                var26 += var30;
                var30 += var31;
            }
            boolean var40 = var14 >= var9;
            var26 += -var34;
            var9--;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var11++;
                        var24 += var33;
                        var25 += var36;
                        var33 += var29;
                        var36 += var29;
                    }
                }
                if (var25 < 0) {
                    var24 += var33;
                    var33 += var29;
                    var11++;
                    var25 += var36;
                    var36 += var29;
                }
                var24 += -var38;
                var38 -= var28;
                var25 += -var35;
                var35 -= var28;
            }
            var34 -= var27;
            var22 += -var32;
            int var41 = arg2 - var9;
            var32 -= var27;
            int var42 = arg2 + var9;
            int var43 = arg4 + var8;
            int var44 = arg4 - var8;
            if (var40) {
                int var45 = arg4 - var11;
                int var46 = arg4 + var11;
                class23.method161(var45, -1, arg6, var44, class14.field331[var41]);
                class23.method161(var46, -1, arg7, var45, class14.field331[var41]);
                class23.method161(var43, -1, arg6, var46, class14.field331[var41]);
                class23.method161(var45, -1, arg6, var44, class14.field331[var42]);
                class23.method161(var46, -1, arg7, var45, class14.field331[var42]);
                class23.method161(var43, -1, arg6, var46, class14.field331[var42]);
            } else {
                class23.method161(var43, -1, arg6, var44, class14.field331[var41]);
                class23.method161(var43, arg5 ^ 0x53, arg6, var44, class14.field331[var42]);
            }
        }
        if (arg5 != -84) {
            field318 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method87(byte arg0) {
        field318 = null;
        field319 = null;
        if (arg0 != -34) {
            field318 = null;
        }
        field312 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILo;Lo;I)V")
    public class12(int arg0, class152 arg1, class152 arg2, int arg3) {
        this.field308 = arg0;
        this.field305 = arg2;
        this.field315 = arg1;
        this.field307 = arg3;
    }
}
