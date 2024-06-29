import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class114 extends class255 {

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Z")
    public volatile boolean field2050 = true;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "[Z")
    public static boolean[] field2040 = new boolean[200];

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Leb;")
    public static class230 field2045 = class68.method589(0, "Weiter");

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Leb;")
    public static class230 field2036 = class68.method589(0, " (X");

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Lkk;")
    public static class223 field2037;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "Z")
    public static boolean field2038;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "Z")
    public boolean field2042;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
    public boolean field2046;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "[I")
    public static int[] field2047;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2041;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method911(boolean arg0) {
        field2047 = null;
        field2036 = null;
        field2040 = null;
        field2041 = null;
        if (!arg0) {
            field2045 = null;
            field2037 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)I")
    public abstract int method807(boolean arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILtj;Z)V")
    public static final void method912(int arg0, int arg1, class260 arg2, boolean arg3) {
        if ((arg0 & 0x200) != 0) {
            int var4 = class183.field3182.method167(-1);
            int var5 = class183.field3182.method162((byte) 5);
            arg2.method1001(var4, -76, class259.field4584, var5);
        }
        if ((arg0 & 0x4) != 0) {
            arg2.field2280 = class183.field3182.method161(4);
            if (arg2.field2280 == 65535) {
                arg2.field2280 = -1;
            }
        }
        if ((arg0 & 0x20) != 0) {
            int var6 = class183.field3182.method161(4);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class183.field3182.method200(255);
            class139.method1068(arg2, var7, var6, 64);
        }
        if (!arg3) {
            return;
        }
        field2043++;
        if ((arg0 & 0x80) != 0) {
            arg2.field2269 = class183.field3182.method171((byte) 79);
            if (arg2.field2269.method1609(0, (byte) -120) == 126) {
                arg2.field2269 = arg2.field2269.method1619(-27, 1);
                class227.method1565(arg2.method1806((byte) 93), (byte) 38, 2, arg2.field2269);
            } else if (class56.field1033 == arg2) {
                class227.method1565(arg2.method1806((byte) -120), (byte) 22, 2, arg2.field2269);
            }
            arg2.field2290 = 0;
            arg2.field2240 = 150;
            arg2.field2260 = 0;
        }
        if ((arg0 & 0x10) != 0) {
            int var8 = class183.field3182.method196(-108);
            int var9 = class183.field3182.method168((byte) 86);
            int var10 = class183.field3182.method200(255);
            int var11 = class183.field3182.field318;
            boolean var12 = (var8 & 0x8000) != 0;
            if (arg2.field4620 != null && arg2.field4626 != null) {
                boolean var13 = false;
                long var14 = arg2.field4620.method1587(86);
                if (var9 <= 1) {
                    if (!var12 && (class48.field841 == 1 || class22.field433 == 1)) {
                        var13 = true;
                    } else {
                        for (int var16 = 0; var16 < class45.field796; var16++) {
                            if (class145.field2607[var16] == var14) {
                                var13 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var13 && class65.field1220 == 0) {
                    class169.field2985.field318 = 0;
                    class183.field3182.method160(class169.field2985.field269, (byte) 127, 0, var10);
                    int var17 = -1;
                    class169.field2985.field318 = 0;
                    class230 var18;
                    if (var12) {
                        var8 &= 0x7FFF;
                        class131 var19 = class9.method89(7, class169.field2985);
                        var17 = var19.field2345;
                        var18 = var19.field2355.method284(0, class169.field2985);
                    } else {
                        var18 = class93.method793(class236.method1661(class169.field2985, -32133).method1600(-44));
                    }
                    arg2.field2269 = var18.method1628(12348);
                    arg2.field2260 = var8 & 0xFF;
                    arg2.field2240 = 150;
                    arg2.field2290 = var8 >> 8;
                    if (var9 == 2) {
                        class167.method1236(var18, (byte) 90, class173.method1267((byte) 59, new class230[] { class230.field3986, arg2.method1806((byte) 124) }), (class230) null, var17, var12 ? 17 : 1);
                    } else if (var9 == 1) {
                        class167.method1236(var18, (byte) 36, class173.method1267((byte) 59, new class230[] { class31.field569, arg2.method1806((byte) 122) }), (class230) null, var17, var12 ? 17 : 1);
                    } else {
                        class167.method1236(var18, (byte) 120, arg2.method1806((byte) -99), (class230) null, var17, var12 ? 17 : 2);
                    }
                }
            }
            class183.field3182.field318 = var10 + var11;
        }
        if ((arg0 & 0x100) != 0) {
            arg2.field2277 = class183.field3182.method200(255);
            arg2.field2262 = class183.field3182.method200(255);
            arg2.field2311 = class183.field3182.method162((byte) 5);
            arg2.field2285 = class183.field3182.method200(255);
            arg2.field2238 = class183.field3182.method196(-105) + class259.field4584;
            arg2.field2275 = class183.field3182.method196(-113) + class259.field4584;
            arg2.field2272 = class183.field3182.method162((byte) 5);
            arg2.field2287 = 1;
            arg2.field2299 = 0;
        }
        if ((arg0 & 0x8) != 0) {
            int var20 = class183.field3182.method168((byte) 98);
            byte[] var21 = new byte[var20];
            class14 var22 = new class14(var21);
            class183.field3182.method160(var21, (byte) 127, 0, var20);
            class7.field108[arg1] = var22;
            arg2.method1807(127, var22);
        }
        if ((arg0 & 0x40) != 0) {
            int var23 = class183.field3182.method167(-1);
            int var24 = class183.field3182.method162((byte) 5);
            arg2.method1001(var23, 5, class259.field4584, var24);
            arg2.field2288 = class259.field4584 + 300;
            arg2.field2258 = class183.field3182.method168((byte) 88);
        }
        if ((arg0 & 0x1) != 0) {
            arg2.field2310 = class183.field3182.method151(97);
            arg2.field2236 = class183.field3182.method161(4);
        }
        if ((arg0 & 0x400) == 0) {
            return;
        }
        arg2.field2279 = class183.field3182.method161(4);
        int var25 = class183.field3182.method199(-2);
        arg2.field2261 = (var25 & 0xFFFF) + class259.field4584;
        arg2.field2281 = 0;
        if (class259.field4584 < arg2.field2261) {
            arg2.field2281 = -1;
        }
        arg2.field2244 = 0;
        arg2.field2266 = var25 >> 16;
        if (arg2.field2279 == 65535) {
            arg2.field2279 = -1;
        }
        if (arg2.field2279 == -1 || class259.field4584 != arg2.field2261) {
            return;
        }
        int var26 = class162.method1217((byte) 109, arg2.field2279).field131;
        if (var26 == -1) {
            return;
        }
        class249 var27 = class237.method1667(var26, -116);
        if (var27 != null && var27.field4408 != null) {
            class27.method263(var27, arg2.field2300, arg3, arg2.field2274, class56.field1033 == arg2, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)[B")
    public abstract byte[] method811(byte arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIZIII)V")
    public static final void method913(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field2044++;
        int var9 = arg3 - arg6;
        if (arg5) {
            method913(107, 62, -117, 5, -19, true, 35, -123, 29);
        }
        int var10 = arg0 - arg2;
        int var11 = (arg1 - arg8 << 16) / var10;
        int var12 = (arg7 - arg4 << 16) / var9;
        class123.method962(arg3, arg2, 0, arg4, (byte) -29, arg8, var12, arg0, arg6, var11, 0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILfk;IIBZII)V")
    public static final void method914(int arg0, int arg1, class14 arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7, int arg8) {
        if (arg8 >= 0 && arg8 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg6) {
                class79.field1435[arg3][arg8][arg4] = 0;
            }
            while (true) {
                int var9 = arg2.method200(255);
                if (var9 == 0) {
                    if (arg6) {
                        class106.field1912[0][arg8][arg4] = class237.field4098[0][arg8][arg4];
                    } else if (arg3 == 0) {
                        class106.field1912[0][arg8][arg4] = -class15.method206(arg4 + arg1 + 556238, 35, arg0 + arg8 + 932731) * 8;
                    } else {
                        class106.field1912[arg3][arg8][arg4] = class106.field1912[arg3 - 1][arg8][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method200(255);
                    if (arg6) {
                        class106.field1912[0][arg8][arg4] = var10 * 8 + class237.field4098[0][arg8][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg3 == 0) {
                            class106.field1912[0][arg8][arg4] = -var10 * 8;
                        } else {
                            class106.field1912[arg3][arg8][arg4] = class106.field1912[arg3 - 1][arg8][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class127.field2220[arg3][arg8][arg4] = arg2.method198(false);
                    class157.field2813[arg3][arg8][arg4] = (byte) ((var9 - 2) / 4);
                    class158.field2818[arg3][arg8][arg4] = (byte) class189.method1350(arg7 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class139.field2482[arg3][arg8][arg4] = (byte) (var9 - 81);
                } else if (!arg6) {
                    class79.field1435[arg3][arg8][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method200(255);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method200(255);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method200(255);
                }
            }
        }
        int var12 = -89 % ((57 - arg5) / 47);
        field2048++;
    }
}
