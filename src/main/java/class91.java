import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 extends class70 {

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    private int field2306 = 0;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    private int field2308 = 0;

    @OriginalMember(owner = "client!na", name = "vb", descriptor = "Z")
    private boolean field2317 = false;

    @OriginalMember(owner = "client!na", name = "wb", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!na", name = "Fb", descriptor = "I")
    private int field2327;

    @OriginalMember(owner = "client!na", name = "Hb", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!na", name = "sb", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "Ldc;")
    private class25 field2302;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "Llf;")
    public static class82 field2311 = new class82(20);

    @OriginalMember(owner = "client!na", name = "xb", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!na", name = "Cb", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!na", name = "Ab", descriptor = "[S")
    public static short[] field2322 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!na", name = "Bb", descriptor = "[Lh;")
    public static class49[] field2323 = new class49[2048];

    @OriginalMember(owner = "client!na", name = "Gb", descriptor = "[I")
    public static int[] field2328 = new int[25];

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!na", name = "tb", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!na", name = "ub", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!na", name = "yb", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!na", name = "zb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!na", name = "Db", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!na", name = "Eb", descriptor = "Laf;")
    public static class7 field2326;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)Lhe;")
    public static final class54 method745(byte arg0, int arg1) {
        field2303++;
        class54 var2 = (class54) class94.field2407.method675((long) arg1, 26431);
        if (var2 != null) {
            return var2;
        }
        class54 var3 = class143.method1068(false, arg1, class41.field1058, class29.field766, true);
        if (arg0 < 13) {
            field2324 = 21;
        }
        if (var3 != null) {
            class94.field2407.method672(-30464, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
    private final void method746(int arg0, boolean arg1) {
        field2307++;
        if (this.field2317) {
            return;
        }
        this.field2306 += arg0;
        while (this.field2306 > this.field2302.field610[this.field2308]) {
            this.field2306 -= this.field2302.field610[this.field2308];
            this.field2308++;
            if (this.field2302.field625.length <= this.field2308) {
                this.field2317 = true;
                break;
            }
        }
        if (arg1) {
            this.field2318 = -27;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static final void method747(boolean arg0) {
        field2316++;
        if (!arg0) {
            method745((byte) -57, -118);
        }
        for (class91 var1 = (class91) class44.field1131.method682(0); var1 != null; var1 = (class91) class44.field1131.method684((byte) -65)) {
            if (class44.field1127 != var1.field2310 || var1.field2317) {
                var1.method929(113);
            } else if (class23.field561 >= var1.field2318) {
                var1.method746(class76.field1872, false);
                if (var1.field2317) {
                    var1.method929(100);
                } else {
                    class3.field58.method898(var1.field2310, var1.field2327, var1.field2329, var1.field2314, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILdd;Ldd;Lub;)V")
    public static final void method748(boolean arg0, int arg1, class26 arg2, class26 arg3, class141 arg4) {
        field2321++;
        class55.field1363 = arg2;
        class142.field3127 = arg3;
        class89.field2256 = arg0;
        class142.field3127.method181(0, arg1);
        class154.field3329 = arg4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILmd;)V")
    public static final void method749(boolean arg0, int arg1, class87 arg2) {
        field2313++;
        if (arg0) {
            return;
        }
        if (class80.field2000 == null) {
            class84.method696(255, (byte) 0, 255, 0, 7, null, true);
            class99.field2451[arg1] = arg2;
        } else {
            class80.field2000.field3457 = arg1 * 8 + 5;
            int var3 = class80.field2000.method1175((byte) -116);
            int var4 = class80.field2000.method1175((byte) -92);
            arg2.method720(var3, (byte) 111, var4);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Lnb;")
    public final class92 method43(byte arg0) {
        field2320++;
        if (arg0 <= 21) {
            return null;
        }
        class23 var2 = class16.method87(16, this.field2305);
        class92 var3;
        if (this.field2317) {
            var3 = var2.method142(-30, -1);
        } else {
            var3 = var2.method142(-30, this.field2308);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2304++;
        if (arg7 >= -2 || (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102)) {
            return;
        }
        if (class127.field2882 && class44.field1127 != arg3) {
            return;
        }
        int var8 = 0;
        if (arg4 == 0) {
            var8 = class3.field58.method876(arg3, arg2, arg0);
        }
        if (arg4 == 1) {
            var8 = class3.field58.method877(arg3, arg2, arg0);
        }
        if (arg4 == 2) {
            var8 = class3.field58.method914(arg3, arg2, arg0);
        }
        boolean var9 = true;
        if (arg4 == 3) {
            var8 = class3.field58.method906(arg3, arg2, arg0);
        }
        boolean var10 = false;
        boolean var11 = false;
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class3.field58.method868(arg3, arg2, arg0, var8);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg4 == 0) {
                class3.field58.method867(arg3, arg2, arg0);
                class19 var16 = class53.method397(var12, 13415);
                if (var16.field391 != 0) {
                    class108.field2616[arg3].method607(var16.field400, arg2, var15, -112, arg0, var14);
                }
            }
            if (arg4 == 1) {
                class3.field58.method907(arg3, arg2, arg0);
            }
            if (arg4 == 2) {
                class3.field58.method911(arg3, arg2, arg0);
                class19 var17 = class53.method397(var12, 13415);
                if (var17.field418 + arg2 > 103 || arg0 + var17.field418 > 103 || var17.field434 + arg2 > 103 || arg0 + var17.field434 > 103) {
                    return;
                }
                if (var17.field391 != 0) {
                    class108.field2616[arg3].method603(-24696, var17.field400, arg0, var15, var17.field418, arg2, var17.field434);
                }
            }
            if (arg4 == 3) {
                class3.field58.method913(arg3, arg2, arg0);
                class19 var18 = class53.method397(var12, 13415);
                if (var18.field391 == 1) {
                    class108.field2616[arg3].method618(1, arg2, arg0);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var19 = arg3;
        if (arg3 < 3 && (class121.field2785[1][arg2][arg0] & 0x2) == 2) {
            var19 = arg3 + 1;
        }
        class36.method281(arg3, arg5, var19, class3.field58, 0, arg1, class108.field2616[arg3], arg2, arg0, arg6);
        return;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method751(boolean arg0) {
        field2322 = null;
        field2328 = null;
        field2311 = null;
        if (!arg0) {
            field2322 = null;
        }
        field2326 = null;
        field2323 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BILic;II)V")
    public static final void method752(byte arg0, int arg1, class59 arg2, int arg3, int arg4) {
        field2312++;
        class159 var5 = class76.method632(arg1, 128, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field3564 != null) {
            class139 var6 = new class139();
            var6.field3105 = arg2;
            var6.field3104 = var5;
            var6.field3096 = var5.field3564;
            var6.field3109 = arg3;
            class125.method948(var6, arg0 - 30040);
        }
        boolean var7 = true;
        if (var5.field3610 > 0) {
            var7 = class148.method1096(var5, (byte) -115);
        }
        if (!var7) {
            return;
        }
        if (arg0 != -124) {
            field2323 = null;
        }
        if (!class143.method1065(class112.method915(var5, -2042430560), arg3 - 1, -2206)) {
            return;
        }
        if (arg3 == 1) {
            class125.field2842.method1072(238, -1);
            class89.field2252++;
            class125.field2842.method1195(arg1, 852);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 2) {
            class125.field2842.method1072(106, -1);
            class125.field2842.method1195(arg1, arg0 ^ 0xFFFFFCD0);
            class125.field2842.method1206(arg4, true);
            class136.field3033++;
        }
        if (arg3 == 3) {
            class125.field2842.method1072(107, arg0 ^ 0x7B);
            class116.field2729++;
            class125.field2842.method1195(arg1, arg0 + 976);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 4) {
            class88.field2214++;
            class125.field2842.method1072(155, -1);
            class125.field2842.method1195(arg1, 852);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 5) {
            class145.field3167++;
            class125.field2842.method1072(176, -1);
            class125.field2842.method1195(arg1, 852);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 6) {
            class75.field1845++;
            class125.field2842.method1072(89, arg0 ^ 0x7B);
            class125.field2842.method1195(arg1, 852);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 7) {
            class4.field94++;
            class125.field2842.method1072(203, arg0 + 123);
            class125.field2842.method1195(arg1, 852);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 8) {
            class125.field2842.method1072(33, arg0 + 123);
            class25.field631++;
            class125.field2842.method1195(arg1, 852);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 9) {
            class62.field1579++;
            class125.field2842.method1072(214, -1);
            class125.field2842.method1195(arg1, arg0 + 976);
            class125.field2842.method1206(arg4, true);
        }
        if (arg3 == 10) {
            class125.field2842.method1072(123, -1);
            class125.field2842.method1195(arg1, arg0 ^ 0xFFFFFCD0);
            class125.field2842.method1206(arg4, true);
            class42.field1077++;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method753(byte arg0, Component arg1) {
        arg1.addMouseListener(class149.field3262);
        field2325++;
        if (arg0 != -16) {
            field2324 = -51;
        }
        arg1.addMouseMotionListener(class149.field3262);
        arg1.addFocusListener(class149.field3262);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)Z")
    public static final boolean method754(boolean arg0, int arg1) {
        if (!arg0) {
            field2319 = 112;
        }
        field2309++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIII)V")
    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2318 = arg5 + arg6;
        this.field2327 = arg2;
        this.field2329 = arg3;
        this.field2314 = arg4;
        this.field2305 = arg0;
        this.field2310 = arg1;
        int var8 = class16.method87(16, this.field2305).field534;
        if (var8 == -1) {
            this.field2317 = true;
        } else {
            this.field2317 = false;
            this.field2302 = class49.method381(var8, (byte) 103);
        }
    }
}
