import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class218 {

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lrg;")
    private class96 field3884 = null;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lrg;")
    private class96 field3883 = null;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    private int field3892 = 65000;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    private int field3888;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3873 = -1;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[I")
    public static int[] field3877 = new int[256];

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lsf;")
    private static class108 field3875 = class140.method973(255, "shake:");

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lsf;")
    public static class108 field3889 = field3875;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lsf;")
    public static class108 field3876 = field3875;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lsf;")
    public static class108 field3891;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lik;")
    public static class262 field3890;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lsh;")
    public static class292 field3881;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3877[var0] = var1;
        }
        field3891 = class140.method973(255, "Untersuchen");
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1499(int arg0) {
        int var1 = 18 / ((23 - arg0) / 54);
        field3886++;
        class320.field5485 = new class98[class171.field3102.method1879(0)][];
        class180.field3278 = new boolean[class171.field3102.method1879(0)];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)[B", line = 21)
    public final byte[] method1500(int arg0, boolean arg1) {
        field3878++;
        class96 var3 = this.field3884;
        synchronized (this.field3884) {
            Object var10000;
            try {
                if (((long) (arg0 * 6 + 6)) > this.field3883.method657(-1)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3883.method655(0, (long) (arg0 * 6));
                this.field3883.method654(6, class131.field2243, (byte) 40, 0);
                int var4 = ((class131.field2243[0] & 0xFF) << 16) + ((class131.field2243[1] & 0xFF) << 8) + (class131.field2243[2] & 0xFF);
                int var5 = (class131.field2243[5] & 0xFF) + ((class131.field2243[3] & 0xFF) << 16) + (class131.field2243[4] & 0xFF << 8);
                if (var4 < 0 || this.field3892 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var5 > 0 && (long) var5 <= this.field3884.method657(-1) / 520L) {
                    if (!arg1) {
                        this.field3883 = (class96) null;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    byte[] var8 = new byte[var4];
                    while (var4 > var6) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3884.method655(0, (long) (var5 * 520));
                        int var9 = var4 - var6;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field3884.method654(var9 + 8, class131.field2243, (byte) 40, 0);
                        int var10 = ((class131.field2243[0] & 0xFF) << 8) + (class131.field2243[1] & 0xFF);
                        int var11 = ((class131.field2243[4] & 0xFF) << 16) + (class131.field2243[5] & 0xFF << 8) + (class131.field2243[6] & 0xFF);
                        int var12 = ((class131.field2243[2] & 0xFF) << 8) + (class131.field2243[3] & 0xFF);
                        int var13 = class131.field2243[7] & 0xFF;
                        if (arg0 == var10 && var7 == var12 && this.field3888 == var13) {
                            if (var11 >= 0 && this.field3884.method657(-1) / 520L >= (long) var11) {
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var8[var6++] = class131.field2243[var14 + 8];
                                }
                                var5 = var11;
                                var7++;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var19 = var8;
                    return var19;
                }
                var10000 = null;
            } catch (IOException var17) {
                return null;
            }
            return (byte[]) var10000;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIII)V", line = 101)
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3885++;
        if (arg5 == arg9 && arg3 == arg6 && arg1 == arg8 && arg2 == arg4) {
            class215.method1477(arg6, (byte) 106, arg9, arg7, arg2, arg8);
        } else {
            int var10 = arg9;
            int var11 = arg9 * 3;
            int var12 = arg6;
            int var13 = arg6 * 3;
            int var14 = arg3 * 3;
            int var15 = arg5 * 3;
            int var16 = arg1 * 3;
            int var17 = arg4 * 3;
            int var18 = var14 + arg2 - var17 - arg6;
            int var19 = arg8 + var15 - arg9 - var16;
            int var20 = var13 + var17 - (var14 - -var14);
            int var21 = var14 - var13;
            int var22 = var16 + var11 - var15 - var15;
            int var23 = var15 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var24;
                int var31 = var22 * var25;
                int var32 = var21 * var24;
                int var33 = (var27 + var30 + var31 >> 12) + arg9;
                int var34 = (var28 + var29 + var32 >> 12) + arg6;
                class215.method1477(var12, (byte) 106, var10, arg7, var34, var33);
                var10 = var33;
                var12 = var34;
            }
        }
        if (arg0 != 3) {
            method1499(0);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 180)
    public static void method1502(int arg0) {
        field3891 = null;
        field3889 = null;
        field3890 = null;
        field3876 = null;
        field3875 = null;
        if (arg0 != -2042831448) {
            method1504(true);
        }
        field3881 = null;
        field3877 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[B)Z", line = 197)
    public final boolean method1503(int arg0, int arg1, int arg2, byte[] arg3) {
        field3887++;
        class96 var5 = this.field3884;
        synchronized (this.field3884) {
            if (arg0 != 6642) {
                return false;
            } else if (arg2 >= 0 && arg2 <= this.field3892) {
                boolean var6 = this.method1506(94, arg3, true, arg1, arg2);
                if (!var6) {
                    var6 = this.method1506(125, arg3, false, arg1, arg2);
                }
                return var6;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 232)
    public static final void method1504(boolean arg0) {
        class229.field3992.method639(-72);
        field3880++;
        if (arg0) {
            field3881 = (class292) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(ILrg;Lrg;I)V", line = 495)
    public class218(int arg0, class96 arg1, class96 arg2, int arg3) {
        this.field3888 = arg0;
        this.field3884 = arg1;
        this.field3892 = arg3;
        this.field3883 = arg2;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 262)
    public static final void method1505(int arg0) {
        class119.method837();
        class294.field5136 = null;
        field3879++;
        class220.field3919 = -1;
        class303.method2130(0);
        class48.field707.method461(true);
        class162.field2901 = new class155();
        ((class84) class263.field4661).method570(true);
        class267.field4689 = 0;
        class267.field4701 = new class46[255];
        class148.method1042();
        class238.method1652();
        class274.method1981(-9536);
        class68.method456((byte) -73, false);
        class20.method136(1);
        if (arg0 > -43) {
            method1505(-41);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class51 var2 = class96.field1558[var1];
            if (var2 != null) {
                var2.field746 = null;
            }
        }
        if (class231.field4051) {
            class238.method1647(104, 104);
            class165.method1148();
        }
        class172.method1224((byte) -121, class215.field3801, class62.field994);
        class174.method1235(class215.field3801, (byte) 100);
        if (class203.field3658 == 5) {
            class329.method2253(98, class215.field3801);
        }
        if (class203.field3658 == 10) {
            class101.method699(false, (byte) -114);
        }
        if (class203.field3658 == 30) {
            class312.method2177(25, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!i", name = "toString", descriptor = "()Ljava/lang/String;", line = 334)
    public final String toString() {
        field3882++;
        return "Cache:" + this.field3888;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[BZII)Z", line = 342)
    private final boolean method1506(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field3874++;
        class96 var6 = this.field3884;
        synchronized (this.field3884) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (this.field3883.method657(-1) < ((long) (arg3 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3883.method655(0, (long) (arg3 * 6));
                    this.field3883.method654(6, class131.field2243, (byte) 40, 0);
                    var7 = (class131.field2243[5] & 0xFF) + (class131.field2243[3] & 0xFF << 16) + (class131.field2243[4] & 0xFF << 8);
                    if (var7 <= 0 || ((long) var7) > (this.field3884.method657(-1) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3884.method657(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class131.field2243[1] = (byte) (arg4 >> 8);
                class131.field2243[3] = (byte) (var7 >> 16);
                int var8 = 0;
                class131.field2243[0] = (byte) (arg4 >> 16);
                class131.field2243[4] = (byte) (var7 >> 8);
                class131.field2243[5] = (byte) var7;
                int var9 = 0;
                class131.field2243[2] = (byte) arg4;
                this.field3883.method655(0, (long) (arg3 * 6));
                this.field3883.method661(6, -111, 0, class131.field2243);
                while (true) {
                    if (var8 < arg4) {
                        label134: {
                            int var10 = 0;
                            if (arg2) {
                                label154: {
                                    this.field3884.method655(0, (long) (var7 * 520));
                                    try {
                                        this.field3884.method654(8, class131.field2243, (byte) 40, 0);
                                    } catch (EOFException var18) {
                                        break label134;
                                    }
                                    var10 = (class131.field2243[4] & 0xFF << 16) + ((class131.field2243[5] & 0xFF) << 8) + (class131.field2243[6] & 0xFF);
                                    int var12 = class131.field2243[7] & 0xFF;
                                    int var13 = (class131.field2243[0] & 0xFF << 8) + (class131.field2243[1] & 0xFF);
                                    int var14 = (class131.field2243[2] & 0xFF << 8) + (class131.field2243[3] & 0xFF);
                                    if (arg3 == var13 && var9 == var14 && this.field3888 == var12) {
                                        if (var10 >= 0 && (this.field3884.method657(-1) / 520L) >= ((long) var10)) {
                                            break label154;
                                        }
                                        var10000 = false;
                                        return var10000;
                                    }
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg2 = false;
                                var10 = (int) ((this.field3884.method657(-1) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg4 - var8) <= 512) {
                                var10 = 0;
                            }
                            class131.field2243[1] = (byte) arg3;
                            class131.field2243[7] = (byte) this.field3888;
                            class131.field2243[0] = (byte) (arg3 >> 8);
                            class131.field2243[3] = (byte) var9;
                            class131.field2243[5] = (byte) (var10 >> 8);
                            int var15 = arg4 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class131.field2243[4] = (byte) (var10 >> 16);
                            class131.field2243[6] = (byte) var10;
                            class131.field2243[2] = (byte) (var9 >> 8);
                            var9++;
                            this.field3884.method655(0, (long) (var7 * 520));
                            this.field3884.method661(8, -97, 0, class131.field2243);
                            this.field3884.method661(var15, 98, var8, arg1);
                            var7 = var10;
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                if (arg0 < 82) {
                    field3876 = (class108) null;
                }
                return false;
            }
        }
    }
}
