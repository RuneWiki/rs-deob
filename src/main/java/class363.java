import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class363 extends class393 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[I")
    public int[] field5302 = new int[] { -1 };

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    public int[] field5312 = new int[1];

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "[I")
    public static int[] field5309 = new int[100];

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Z")
    public static boolean field5313 = true;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Lqj;")
    public static class238 field5315;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lro;")
    public static class249 field5308;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lud;")
    public static class2 field5304;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILil;)Lke;")
    public static final class163 method2377(int arg0, class265 arg1) {
        field5307++;
        if (arg0 != -1) {
            field5309 = null;
        }
        return new class163(arg1.method1698(arg0 ^ 0x9F1BFFFF), arg1.method1698(1625554944), arg1.method1698(arg0 ^ 0x9F1BFFFF), arg1.method1698(1625554944), arg1.method1691(false), arg1.method1697(-64));
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lnr;ILqr;IZIIZLtb;I)Lqc;")
    public final class95 method2378(class437 arg0, int arg1, class15 arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, class103 arg8, int arg9) {
        field5311++;
        class95 var11 = null;
        int var12 = arg6;
        class183 var13 = null;
        if (arg3 != -1) {
            var13 = class132.method899(arg3, (byte) -127);
        }
        int[] var14 = this.field5302;
        if (var13 != null && var13.field2455 != null) {
            var14 = new int[var13.field2455.length];
            for (int var15 = 0; var15 < var13.field2455.length; var15++) {
                int var16 = var13.field2455[var15];
                if (var16 >= 0 && this.field5302.length > var16) {
                    var14[var15] = this.field5302[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = arg7;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class236 var23 = null;
        class236 var24 = null;
        if (arg2 != null) {
            int var25 = arg2.field150[arg1];
            var12 = arg6 | 0x20;
            int var26 = var25 >>> 16;
            var23 = class376.method2496((byte) -119, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method1440(65280, var20);
                var17 = arg7 | var23.method1443((byte) 0, var20);
                var19 |= arg2.field152;
            }
            if ((arg2.field170 || class408.field6114) && arg5 != -1 && arg5 < arg2.field150.length) {
                var22 = arg2.field164[arg1];
                int var27 = arg2.field150[arg5];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class376.method2496((byte) -119, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method1440(65280, var21);
                    var17 |= var24.method1443((byte) 0, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method2381(arg8 == null ? null : arg8.field1391, arg4, arg3, var14, 19367);
        if (class139.field1853 != null) {
            var11 = (class95) class139.field1853.method209(127, var29);
        }
        if (var11 == null || arg0.method2132(var11.method594(), var12) != 0) {
            if (var11 != null) {
                var12 = arg0.method2068(var12, var11.method594());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class166.method1031(var14[var33], false).method1196(!arg7, arg4)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class180[] var34 = new class180[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class166.method1031(var14[var35], false).method1198(true, arg4);
                }
            }
            if (var13 != null && var13.field2463 != null) {
                for (int var36 = 0; var36 < var13.field2463.length; var36++) {
                    if (var13.field2463[var36] != null && var34[var36] != null) {
                        int var37 = var13.field2463[var36][0];
                        int var38 = var13.field2463[var36][1];
                        int var39 = var13.field2463[var36][2];
                        int var40 = var13.field2463[var36][3];
                        int var41 = var13.field2463[var36][4];
                        int var42 = var13.field2463[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1119(var42, var41, false, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1118(var37, var39, 124, var38);
                        }
                    }
                }
            }
            class180 var43 = new class180(var34, var34.length);
            if (arg8 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg0.method2164(var43, var31, class177.field2333, 64, 850);
            if (arg8 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class132.field1777[var44].length > arg8.field1391[var44]) {
                        var11.method601(class434.field6394[var44], class132.field1777[var44][arg8.field1391[var44]]);
                    }
                    if (arg8.field1391[var44] < class312.field4467[var44].length) {
                        var11.method601(class34.field557[var44], class312.field4467[var44][arg8.field1391[var44]]);
                    }
                }
            }
            if (class139.field1853 != null) {
                var11.method589(var12);
                class139.field1853.method202(true, var11, var29);
            }
        }
        if (arg2 == null || var23 == null) {
            return var11;
        } else {
            class95 var45 = var11.method628((byte) 1, var12, true);
            var45.method611(var21, 0, var22, 0, arg9 - 1, var24, arg2.field152, var23, var20);
            return var45;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)I")
    public static final int method2379(byte arg0, int arg1, int arg2) {
        if (arg0 == 21) {
            field5310++;
            int var3 = arg2 >> 31 & arg1 - 1;
            return ((arg2 >>> 31) + arg2) % arg1 + var3;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static final void method2380(byte arg0) {
        field5316++;
        class24 var1 = class249.field3592;
        synchronized (class249.field3592) {
            class249.field3592.method204((byte) 56);
        }
        class24 var2 = class86.field1204;
        synchronized (class86.field1204) {
            class86.field1204.method204((byte) 56);
        }
        class24 var3 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method204((byte) 56);
        }
        if (arg0 != 117) {
            field5313 = true;
        }
        class24 var4 = class295.field4257;
        synchronized (class295.field4257) {
            class295.field4257.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IZI[II)J")
    private final long method2381(int[] arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        field5317++;
        long[] var6 = class381.field5719;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg2) & 0xFFL)];
        if (arg4 != 19367) {
            method2383(-125);
        }
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg0[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    public static final void method2382(byte arg0) {
        class24 var1 = class227.field3192;
        synchronized (class227.field3192) {
            class227.field3192.method204((byte) 56);
        }
        field5306++;
        class24 var2 = class277.field4065;
        synchronized (class277.field4065) {
            class277.field4065.method204((byte) 56);
        }
        if (arg0 != 124) {
            method2385(87, 30, (byte) -41);
        }
        class24 var3 = class169.field2235;
        synchronized (class169.field2235) {
            class169.field2235.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method2383(int arg0) {
        field5314++;
        if (class169.field2222 < 0) {
            class169.field2222 = 0;
            class291.field4211 = -1;
            class115.field1564 = -1;
        }
        if (class169.field2222 > class76.field1032) {
            class115.field1564 = -1;
            class291.field4211 = -1;
            class169.field2222 = class76.field1032;
        }
        if (arg0 < 123) {
            method2380((byte) -17);
        }
        if (class133.field1778 < 0) {
            class133.field1778 = 0;
            class291.field4211 = -1;
            class115.field1564 = -1;
        }
        if (class76.field1046 < class133.field1778) {
            class291.field4211 = -1;
            class133.field1778 = class76.field1046;
            class115.field1564 = -1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static void method2384(int arg0) {
        field5315 = null;
        field5304 = null;
        field5308 = null;
        if (arg0 != -11003) {
            field5309 = null;
        }
        field5309 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)Lhn;")
    public static final class256 method2385(int arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            method2386(69, (Canvas) null, (class386) null, false);
        }
        field5305++;
        class256 var3 = (class256) class355.field5207.method954(-78, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class256(arg0, arg1);
            class355.field5207.method956(false, var3.field5903, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Canvas;Lfl;Z)Lnr;")
    public static final class437 method2386(int arg0, Canvas arg1, class386 arg2, boolean arg3) {
        field5303++;
        if (arg3) {
            method2379((byte) 126, -92, 43);
        }
        return new class389(arg1, arg2, arg0);
    }
}
