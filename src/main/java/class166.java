import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class166 extends class183 {

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2265 = "shake:";

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2268 = "yellow:";

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2272 = "K";

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2269 = -1;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[I")
    public static int[] field2266;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "[[S")
    public static short[][] field2271;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[Lla;Z[B)V", line = 10)
    public static final void method1182(int arg0, int arg1, int arg2, class72[] arg3, boolean arg4, byte[] arg5) {
        class316 var6 = new class316(arg5);
        field2267++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method2185((byte) 101);
            if (var8 == 0) {
                int var9 = 60 / ((arg2 - 49) / 61);
                return;
            }
            int var10 = 0;
            var7 += var8;
            while (true) {
                int var11 = var6.method2193(49152);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 12;
                int var14 = var6.method2219(16448);
                int var15 = (var10 & 0xFDB) >> 6;
                int var16 = var14 >> 2;
                int var17 = arg0 + var15;
                int var18 = var14 & 0x3;
                int var19 = arg1 + var12;
                if (var17 > 0 && var19 > 0 && var17 < 103 && var19 < 103) {
                    class72 var20 = null;
                    if (!arg4) {
                        int var21 = var13;
                        if ((class240.field3406[1][var17][var19] & 0x2) == 2) {
                            var21 = var13 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    class108.method794(var18, var13, var20, var16, !arg4, var13, arg4, var7, var19, var17, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 83)
    public static void method1183(int arg0) {
        field2265 = null;
        if (arg0 >= -101) {
            method1183(-127);
        }
        field2271 = (short[][]) null;
        field2268 = null;
        field2272 = null;
        field2266 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lvh;IIIIIIZ)V", line = 114)
    public static final void method1184(class144 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1986.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1986[var9] - class234.field3310;
            int var11 = arg0.field1982[var9] - class173.field2353;
            int var12 = arg0.field1980[var9] - class113.field1539;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1973 != null) {
                class144.field1988[var9] = var13;
                class144.field1983[var9] = var16;
                class144.field1975[var9] = var17;
            }
            class144.field1984[var9] = (var13 << 9) / var17 + class184.field2529;
            class144.field1972[var9] = (var16 << 9) / var17 + class184.field2539;
        }
        class184.field2541 = 0;
        int var19 = arg0.field1969.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1969[var20];
            int var22 = arg0.field1977[var20];
            int var23 = arg0.field1990[var20];
            int var24 = class144.field1984[var21];
            int var25 = class144.field1984[var22];
            int var26 = class144.field1984[var23];
            int var27 = class144.field1972[var21];
            int var28 = class144.field1972[var22];
            int var29 = class144.field1972[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class312.field4720 && class165.method1179(class88.field1248 + class184.field2529, class184.field2539 + class132.field1804, var27, var28, var29, var24, var25, var26)) {
                    class210.field3030 = arg5;
                    class162.field2231 = arg6;
                }
                if (!class67.field908 && !arg7) {
                    class184.field2534 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class184.field2535 || var25 > class184.field2535 || var26 > class184.field2535) {
                        class184.field2534 = true;
                    }
                    if (arg0.field1973 == null || arg0.field1973[var20] == -1) {
                        if (arg0.field1974[var20] != 12345678) {
                            class184.method1289(var27, var28, var29, var24, var25, var26, arg0.field1974[var20], arg0.field1970[var20], arg0.field1978[var20]);
                        }
                    } else if (!class185.field2558) {
                        int var30 = class184.field2543.method669(arg0.field1973[var20], 64);
                        class184.method1289(var27, var28, var29, var24, var25, var26, class10.method56(var30, arg0.field1974[var20]), class10.method56(var30, arg0.field1970[var20]), class10.method56(var30, arg0.field1978[var20]));
                    } else if (arg0.field1976) {
                        class184.method1284(var27, var28, var29, var24, var25, var26, arg0.field1974[var20], arg0.field1970[var20], arg0.field1978[var20], class144.field1988[0], class144.field1988[1], class144.field1988[3], class144.field1983[0], class144.field1983[1], class144.field1983[3], class144.field1975[0], class144.field1975[1], class144.field1975[3], arg0.field1973[var20]);
                    } else {
                        class184.method1284(var27, var28, var29, var24, var25, var26, arg0.field1974[var20], arg0.field1970[var20], arg0.field1978[var20], class144.field1988[var21], class144.field1988[var22], class144.field1988[var23], class144.field1983[var21], class144.field1983[var22], class144.field1983[var23], class144.field1975[var21], class144.field1975[var22], class144.field1975[var23], arg0.field1973[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V", line = 228)
    public class166(int arg0, int arg1) {
        this.field2274 = arg0;
        this.field2273 = arg1;
    }
}
