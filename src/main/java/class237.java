import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class237 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lps;")
    private class86 field3057 = null;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lps;")
    private class86 field3060 = null;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    private int field3066 = 65000;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lbs;")
    public static class643 field3061 = new class643("stellardawn", 1);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public static int[] field3062 = new int[14];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[[I")
    public static int[][] field3064 = new int[6][];

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
    public static int[] field3070 = new int[1];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIIIIILoa;ILba;IIIIILcu;)Lba;")
    public static final class359 method1427(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class650 arg6, int arg7, class359 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class207 arg14) {
        field3055++;
        if (arg8 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg14 != null) {
            int var16 = var15 | arg14.method1209(-1, false, 124, arg10);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg4 << 48) + ((long) arg2 << 32) + (long) ((arg3 << 24) + (arg13 << 16) + arg1);
        class208 var19 = class634.field8597;
        class359 var20;
        synchronized (class634.field8597) {
            var20 = (class359) class634.field8597.method1221(var17, arg0);
        }
        if (var20 == null || arg6.method493(var20.method2075(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method469(var15, var20.method2075());
            }
            byte var21;
            if (arg1 == 1) {
                var21 = 9;
            } else if (arg1 == 2) {
                var21 = 12;
            } else if (arg1 == 3) {
                var21 = 15;
            } else if (arg1 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class229 var24 = new class229(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method1379(0, 0, 0, (byte) -120);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class243.field3129[var31] * var28 >> 14;
                    int var33 = class243.field3128[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method1379(var32, 0, var33, (byte) -125);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg3 * var35 + arg13 * var36 >> 8);
                short var38 = (short) (((arg2 & 0x7F) * var36 + (arg4 & 0x7F) * var35 & 0x7F00) + ((arg2 & 0x380) * var36 + (arg4 & 0x380) * var35 & 0x38000) + ((arg2 & 0xFC00) * var36 + (arg4 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1392((byte) 1, (byte) -1, var26[0][(var39 + 1) % var21], var37, var25, (short) -1, var26[0][var39], 0, var38);
                    } else {
                        var24.method1392((byte) 1, (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var37, var26[var34 - 1][var39], (short) -1, var26[var34][(var39 + 1) % var21], 0, var38);
                        var24.method1392((byte) 1, (byte) -1, var26[var34][(var39 + 1) % var21], var37, var26[var34 - 1][var39], (short) -1, var26[var34][var39], 0, var38);
                    }
                }
            }
            var20 = arg6.method408(var24, var15, class383.field4917, 64, 768);
            class208 var40 = class634.field8597;
            synchronized (class634.field8597) {
                class634.field8597.method1230((byte) 15, var17, var20);
            }
        }
        int var41 = (arg1 << 8) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg11 != 0) {
            if ((arg11 & 0x2) != 0) {
                var43 -= 512;
            }
            if ((arg11 & 0x8) != 0) {
                var42 -= 512;
            }
            if ((arg11 & 0x1) != 0) {
                var45 = var41 + 512;
            }
            if ((arg11 & 0x4) != 0) {
                var44 = var41 + 512;
            }
        }
        int var46 = arg8.method2061();
        int var47 = arg8.method2068();
        int var48 = arg8.method2089();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        int var49 = arg8.method2054();
        if (!arg0) {
            return null;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class81 var50 = null;
        if (arg14 != null) {
            int var51 = arg14.field2441[arg10];
            var50 = class11.field110.method1137(126, var51 >> 16);
            arg10 = var51 & 0xFFFF;
        }
        class359 var52;
        if (var50 == null) {
            var52 = var20.method951((byte) 3, var15, true);
            var52.method2088(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method2066(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method951((byte) 3, var15, true);
            var52.method2088(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method2066(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2051(arg10, (byte) -11, var50);
        }
        if (arg7 != 0) {
            var52.method2083(arg7);
        }
        if (arg5 != 0) {
            var52.method2070(arg5);
        }
        if (arg9 != 0) {
            var52.method2066(0, arg9, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIZII)Z")
    private final boolean method1428(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3058++;
        class86 var6 = this.field3060;
        synchronized (this.field3060) {
            try {
                int var7;
                if (arg2) {
                    if (this.field3057.method652(0) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field3057.method656(-553161560, (long) (arg3 * 6));
                    this.field3057.method649(class694.field9607, 0, 8, 6);
                    var7 = (class694.field9607[4] & 0xFF << 8) + (class694.field9607[3] & 0xFF << 16) + (class694.field9607[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field3060.method652(0) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3060.method652(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class694.field9607[0] = (byte) (arg1 >> 16);
                class694.field9607[3] = (byte) (var7 >> 16);
                class694.field9607[1] = (byte) (arg1 >> 8);
                class694.field9607[5] = (byte) var7;
                class694.field9607[2] = (byte) arg1;
                class694.field9607[4] = (byte) (var7 >> 8);
                this.field3057.method656(arg4 - 553141995, (long) (arg3 * 6));
                this.field3057.method654(class694.field9607, 6, (byte) -90, 0);
                int var10 = 0;
                if (arg4 != -19565) {
                    return true;
                }
                int var12 = 0;
                while (arg1 > var10) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field3060.method656(-553161560, (long) (var7 * 520));
                            try {
                                this.field3060.method649(class694.field9607, 0, 8, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class694.field9607[0] & 0xFF << 8) + (class694.field9607[1] & 0xFF);
                            int var15 = (class694.field9607[2] & 0xFF << 8) + (class694.field9607[3] & 0xFF);
                            var13 = ((class694.field9607[5] & 0xFF) << 8) + ((class694.field9607[4] & 0xFF) << 16) + (class694.field9607[6] & 0xFF);
                            int var16 = class694.field9607[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field3056 == var16) {
                                if (var13 >= 0 && (this.field3060.method652(0) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field3060.method652(arg4 + 19565) + 519L) / 520L);
                        arg2 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if (arg1 - var10 <= 512) {
                        var13 = 0;
                    }
                    class694.field9607[0] = (byte) (arg3 >> 8);
                    class694.field9607[3] = (byte) var12;
                    class694.field9607[1] = (byte) arg3;
                    class694.field9607[2] = (byte) (var12 >> 8);
                    class694.field9607[7] = (byte) this.field3056;
                    class694.field9607[6] = (byte) var13;
                    class694.field9607[5] = (byte) (var13 >> 8);
                    class694.field9607[4] = (byte) (var13 >> 16);
                    this.field3060.method656(-553161560, (long) (var7 * 520));
                    this.field3060.method654(class694.field9607, 8, (byte) -114, 0);
                    int var19 = arg1 - var10;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field3060.method654(arg0, var19, (byte) -126, var10);
                    var12++;
                    var7 = var13;
                    var10 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lnh;I)I")
    public static final int method1429(class699 arg0, int arg1) {
        if (arg1 != 1002608112) {
            field3061 = null;
        }
        field3065++;
        if (class664.field9019 == arg0) {
            return 6407;
        } else if (class556.field6946 == arg0) {
            return 6408;
        } else if (class190.field2256 == arg0) {
            return 6406;
        } else if (class503.field6258 == arg0) {
            return 6409;
        } else if (class493.field6140 == arg0) {
            return 6410;
        } else if (class210.field2479 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1430(int arg0, byte[] arg1, int arg2, int arg3) {
        field3068++;
        class86 var5 = this.field3060;
        synchronized (this.field3060) {
            if (arg0 < 0 || arg0 > this.field3066) {
                throw new IllegalArgumentException();
            } else if (arg2 < 122) {
                return false;
            } else {
                boolean var7 = this.method1428(arg1, arg0, true, arg3, -19565);
                if (!var7) {
                    var7 = this.method1428(arg1, arg0, false, arg3, -19565);
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1431(int arg0) {
        if (arg0 != -274254239) {
            method1431(-94);
        }
        field3061 = null;
        field3064 = null;
        field3070 = null;
        field3062 = null;
    }

    @OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3059++;
        return "Cache:" + this.field3056;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(ILps;Lps;I)V")
    public class237(int arg0, class86 arg1, class86 arg2, int arg3) {
        this.field3057 = arg2;
        this.field3060 = arg1;
        this.field3056 = arg0;
        this.field3066 = arg3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[B")
    public final byte[] method1432(int arg0, int arg1) {
        field3069++;
        class86 var3 = this.field3060;
        synchronized (this.field3060) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3057.method652(0)) {
                    return null;
                }
                this.field3057.method656(-553161560, (long) (arg0 * 6));
                this.field3057.method649(class694.field9607, 0, arg1 + 31518, 6);
                int var5 = (class694.field9607[2] & 0xFF) + (class694.field9607[1] & 0xFF << 8) + (class694.field9607[0] & 0xFF << 16);
                if (arg1 != -31510) {
                    field3067 = 78;
                }
                int var6 = (class694.field9607[4] & 0xFF << 8) + (class694.field9607[3] & 0xFF << 16) + (class694.field9607[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3066) {
                    return null;
                } else if (var6 > 0 && (this.field3060.method652(0) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3060.method656(-553161560, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3060.method649(class694.field9607, 0, 8, var13 + 8);
                        int var14 = ((class694.field9607[0] & 0xFF) << 8) + (class694.field9607[1] & 0xFF);
                        int var15 = (class694.field9607[2] & 0xFF << 8) + (class694.field9607[3] & 0xFF);
                        int var16 = ((class694.field9607[4] & 0xFF) << 16) + ((class694.field9607[5] & 0xFF) << 8) + (class694.field9607[6] & 0xFF);
                        int var17 = class694.field9607[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3056 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3060.method652(0) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class694.field9607[var20 + 8];
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
}
