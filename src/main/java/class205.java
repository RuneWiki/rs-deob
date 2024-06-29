import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class205 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    private int field3099 = 65000;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lhl;")
    private class74 field3108 = null;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Lhl;")
    private class74 field3114 = null;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    public static int[] field3109 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[[B")
    public static byte[][] field3103 = new byte[50][];

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Z")
    public static boolean field3110 = false;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[B", line = 4)
    public final byte[] method1433(int arg0, boolean arg1) {
        field3107++;
        class74 var3 = this.field3108;
        synchronized (this.field3108) {
            try {
                Object var10000;
                if (this.field3114.method466(arg1) < ((long) (arg0 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3114.method459(-8874, (long) (arg0 * 6));
                this.field3114.method460(29662, class282.field4504, 0, 6);
                int var4 = (class282.field4504[2] & 0xFF) + ((class282.field4504[1] & 0xFF) << 8) + ((class282.field4504[0] & 0xFF) << 16);
                int var5 = (class282.field4504[5] & 0xFF) + ((class282.field4504[4] & 0xFF) << 8) + (class282.field4504[3] & 0xFF << 16);
                if (var4 < 0 || this.field3099 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 > 0 && this.field3108.method466(true) / 520L >= (long) var5) {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var4 > var8) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field3108.method459(-8874, (long) (var5 * 520));
                        this.field3108.method460(29662, class282.field4504, 0, var9 + 8);
                        int var10 = (class282.field4504[4] & 0xFF << 16) + (class282.field4504[5] & 0xFF << 8) + (class282.field4504[6] & 0xFF);
                        int var11 = ((class282.field4504[2] & 0xFF) << 8) + (class282.field4504[3] & 0xFF);
                        int var12 = class282.field4504[7] & 0xFF;
                        int var13 = (class282.field4504[0] & 0xFF << 8) + (class282.field4504[1] & 0xFF);
                        if (arg0 != var13 || var7 != var11 || this.field3113 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var10 < 0 || ((long) var10) > (this.field3108.method466(arg1) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var7++;
                        var5 = var10;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class282.field4504[var14 + 8];
                        }
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

    @OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;", line = 83)
    public final String toString() {
        field3104++;
        return "Cache:" + this.field3113;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BI)Z", line = 96)
    public final boolean method1434(int arg0, int arg1, byte[] arg2, int arg3) {
        field3102++;
        class74 var5 = this.field3108;
        synchronized (this.field3108) {
            if (arg3 < 96) {
                this.field3113 = 73;
            }
            if (arg0 < 0 || arg0 > this.field3099) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1439(arg1, 25136, true, arg2, arg0);
            if (!var6) {
                var6 = this.method1439(arg1, 25136, false, arg2, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILhi;IIIII)V", line = 128)
    public static final void method1435(int arg0, class323 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class103 var7 = class79.method521(arg4, arg2 ^ 0xFFFFDF1B);
        field3105++;
        if (var7 != null && var7.field1412 && var7.method657(88)) {
            if (var7.field1409 != null) {
                int[] var8 = new int[var7.field1409.length];
                for (int var9 = 0; var9 < (var8.length / 2); var9++) {
                    int var10 = (int) class190.field2855 + class132.field1912 & 0x7FF;
                    int var11 = class104.field1435[var10];
                    int var12 = var11 * 256 / (class67.field831 + 256);
                    int var13 = class104.field1426[var10];
                    int var14 = var13 * 256 / (class67.field831 + 256);
                    var8[var9 * 2] = arg6 - (-(arg1.field5169 / 2) - ((var7.field1409[var9 * 2 + 1] * 4 + arg0) * var14 + ((var7.field1409[var9 * 2] * 4 + arg3) * var12) >> 16));
                    var8[var9 * 2 + 1] = arg1.field5174 / 2 + arg5 - ((arg0 - -(var7.field1409[var9 * 2 - -1] * 4)) * var12 + -((var7.field1409[var9 * 2] * 4 + arg3) * var14) >> 16);
                }
                if (class272.field4317) {
                    class46.method288(var8, var7.field1400, var7.field1400 >>> 24, arg1.field5175, arg1.field5093);
                } else {
                    class183.method1264(var8, var7.field1400, var7.field1400 >>> 24, arg1.field5175, arg1.field5093);
                }
                for (int var15 = 0; var15 < (var8.length / 2 - 1); var15++) {
                    if (class272.field4317) {
                        class239.method1669(var8[var15 * 2], var8[var15 * 2 + 1], var8[var15 * 2 + 2], var8[(var15 + 1) * 2 + 1], var7.field1392, var7.field1392 >>> 24, (class200) arg1.method2249(88, false));
                    } else {
                        class343.method2375(var8[var15 * 2], var8[var15 * 2 + 1], var8[var15 * 2 + 2], var8[(var15 + 1) * 2 + 1], var7.field1392, var7.field1392 >>> 24, arg1.field5175, arg1.field5093);
                    }
                }
                if (class272.field4317) {
                    class239.method1669(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field1392, var7.field1392 >>> 24, (class200) arg1.method2249(arg2 - 8259, false));
                } else {
                    class343.method2375(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field1392, var7.field1392 >>> 24, arg1.field5175, arg1.field5093);
                }
            }
            class149 var16 = null;
            if (var7.field1421 != -1) {
                var16 = var7.method656(false, (byte) -116, false);
                if (var16 != null) {
                    class233.method1608(arg0, arg2 - 8371, arg6, var16, arg3, arg1, arg5);
                }
            }
            if (var7.field1396 != null) {
                int var17 = 0;
                class240 var18 = class344.field5463;
                if (var7.field1407 == 1) {
                    var18 = class41.field446;
                }
                if (var7.field1407 == 2) {
                    var18 = class93.field1233;
                }
                if (var16 != null) {
                    var17 = var16.field2361;
                }
                class87.method549(var17, arg3, var7.field1394, (byte) -6, var18, arg5, arg1, arg0, arg6, var7.field1396);
            }
        }
        if (arg2 != 8370) {
            field3106 = 62;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 218)
    public static void method1436(int arg0) {
        field3109 = null;
        if (arg0 > -10) {
            field3106 = -50;
        }
        field3103 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V", line = 230)
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3112++;
        int var8 = 14 % ((arg5 - 79) / 41);
        if (arg3 >= class337.field5389 && arg1 <= class344.field5460 && arg0 >= class244.field3844 && arg7 <= class2.field22) {
            class168.method1193(arg2, arg7, (byte) -125, arg3, arg6, arg4, arg0, arg1);
        } else {
            class56.method335(arg1, arg2, arg0, arg6, arg3, arg7, 119, arg4);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(ILhl;Lhl;I)V", line = 415)
    public class205(int arg0, class74 arg1, class74 arg2, int arg3) {
        this.field3114 = arg2;
        this.field3099 = arg3;
        this.field3113 = arg0;
        this.field3108 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZBI)Ljava/lang/String;", line = 263)
    public static final String method1438(boolean arg0, byte arg1, int arg2) {
        int var3 = 122 / ((arg1 + 5) / 57);
        field3100++;
        return arg0 && arg2 >= 0 ? class60.method365((byte) -89, 10, arg0, arg2) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ[BI)Z", line = 293)
    private final boolean method1439(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field3111++;
        class74 var6 = this.field3108;
        synchronized (this.field3108) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (((long) (arg0 * 6 + 6)) > this.field3114.method466(true)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3114.method459(arg1 ^ 0xFFFFBF66, (long) (arg0 * 6));
                    this.field3114.method460(29662, class282.field4504, 0, 6);
                    var7 = ((class282.field4504[3] & 0xFF) << 16) + (class282.field4504[4] & 0xFF << 8) + (class282.field4504[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field3108.method466(true) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3108.method466(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class282.field4504[1] = (byte) (arg4 >> 8);
                class282.field4504[2] = (byte) arg4;
                class282.field4504[3] = (byte) (var7 >> 16);
                class282.field4504[0] = (byte) (arg4 >> 16);
                class282.field4504[4] = (byte) (var7 >> 8);
                if (arg1 != 25136) {
                    this.method1439(-91, -89, true, (byte[]) null, -62);
                }
                int var8 = 0;
                class282.field4504[5] = (byte) var7;
                int var9 = 0;
                this.field3114.method459(-8874, (long) (arg0 * 6));
                this.field3114.method464(0, 25756, class282.field4504, 6);
                while (true) {
                    if (arg4 > var8) {
                        label137: {
                            int var10 = 0;
                            if (arg2) {
                                this.field3108.method459(arg1 ^ 0xFFFFBF66, (long) (var7 * 520));
                                try {
                                    this.field3108.method460(29662, class282.field4504, 0, 8);
                                } catch (EOFException var18) {
                                    break label137;
                                }
                                var10 = ((class282.field4504[5] & 0xFF) << 8) + ((class282.field4504[4] & 0xFF) << 16) + (class282.field4504[6] & 0xFF);
                                int var12 = ((class282.field4504[0] & 0xFF) << 8) + (class282.field4504[1] & 0xFF);
                                int var13 = ((class282.field4504[2] & 0xFF) << 8) + (class282.field4504[3] & 0xFF);
                                int var14 = class282.field4504[7] & 0xFF;
                                if (arg0 != var12 || var9 != var13 || this.field3113 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field3108.method466(true) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg2 = false;
                                var10 = (int) ((this.field3108.method466(true) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class282.field4504[7] = (byte) this.field3113;
                            class282.field4504[2] = (byte) (var9 >> 8);
                            class282.field4504[3] = (byte) var9;
                            class282.field4504[0] = (byte) (arg0 >> 8);
                            class282.field4504[1] = (byte) arg0;
                            if (arg4 - var8 <= 512) {
                                var10 = 0;
                            }
                            class282.field4504[6] = (byte) var10;
                            class282.field4504[4] = (byte) (var10 >> 16);
                            var9++;
                            int var15 = arg4 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class282.field4504[5] = (byte) (var10 >> 8);
                            this.field3108.method459(-8874, (long) (var7 * 520));
                            this.field3108.method464(0, 25756, class282.field4504, 8);
                            this.field3108.method464(var8, 25756, arg3, var15);
                            var8 += var15;
                            var7 = var10;
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
