import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class136 {

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    private int field2289 = -1;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Z")
    public boolean field2293 = true;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lwga;")
    private class745 field2292;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field2275;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ldg;")
    private class413 field2291;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lwfa;")
    private class200 field2287;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Luq;")
    private class163 field2282;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2279 = -1;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public final void method1108(byte arg0) {
        field2283++;
        if (arg0 >= 77) {
            this.method1112(-126, this.field2282, this.field2294);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2285++;
        if (arg6 >= class140.field2314 && arg5 <= class536.field7419 && class58.field1150 <= arg3 && arg4 <= class479.field6682) {
            if (arg2 == 1) {
                class129.method1072(arg3, arg0, arg1 + 107, arg5, arg6, arg4);
            } else {
                class625.method3564(arg2, arg3, arg6, arg5, arg4, 100, arg0);
            }
        } else if (arg2 == 1) {
            class392.method2465((byte) 103, arg5, arg0, arg4, arg3, arg6);
        } else {
            class273.method1803(arg6, arg4, arg2, arg5, arg0, arg3, (byte) -106);
        }
        if (arg1 != 1) {
            method1110(47, 5, null, 1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILha;I)V")
    public static final void method1110(int arg0, int arg1, class59 arg2, int arg3) {
        class112.field1938 = arg2;
        class168.field2643 = new class387[arg0][arg3];
        if (arg1 != 21719) {
            return;
        }
        field2280++;
        if (class542.field7485 != null) {
            class454.field6406 = class460.method2726(class542.field7485[4], class542.field7485[3], class542.field7485[0], class542.field7485[5], class542.field7485[1], -1, class542.field7485[2]);
        }
        class497.field6955 = new class387();
        class745.method4151(0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    private final void method1111(int arg0) {
        field2284++;
        if (!this.field2293) {
            return;
        }
        this.field2293 = false;
        byte[] var2 = this.field2291.field5989;
        int var3 = 0;
        int var4 = this.field2291.field5990;
        int var5 = this.field2291.field5990 * this.field2290 + this.field2275;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field2287 != null && this.field2289 == var3) {
            this.field2293 = false;
            return;
        }
        this.field2289 = var3;
        if (arg0 != -12763) {
            this.field2277 = -8;
        }
        int var7 = 0;
        int var8 = this.field2290 * var4 + this.field2275;
        if (!this.field2292.method2249(class523.field7249, class556.field7676, (byte) 122)) {
            if (class246.field3579 == null) {
                class246.field3579 = new int[16384];
            }
            int[] var13 = class246.field3579;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field2291.field5990 - 128;
            }
            if (this.field2287 == null) {
                this.field2287 = this.field2292.method4091(128, 128, -15137, false, class246.field3579);
                this.field2287.method1014(false, false, arg0 + 38451);
            } else {
                this.field2287.method1013(128, arg0 + 35572, class246.field3579, 0, 0, 128, 0, 128);
            }
            return;
        }
        if (class641.field8808 == null) {
            class641.field8808 = new byte[16384];
        }
        byte[] var9 = class641.field8808;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field2291.field5990 - 128;
        }
        if (this.field2287 == null) {
            this.field2287 = this.field2292.method4155(class641.field8808, 128, class556.field7676, arg0 ^ 0xFFFFCE27, false, 128);
            this.field2287.method1014(false, false, arg0 ^ 0xFFFFAA7D);
        } else {
            this.field2287.method1007(0, 0, (byte) -45, 128, 128, 128, 0, class641.field8808, class556.field7676);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILuq;I)V")
    public final void method1112(int arg0, class163 arg1, int arg2) {
        if (arg2 > 0) {
            this.method1111(-12763);
            this.field2292.method4097((byte) 119, this.field2287);
            this.field2292.method2276(class34.field855, arg2, arg1, this.field2278, 0, this.field2277 + 1 - this.field2278, 47);
        }
        field2276++;
        if (arg0 > -47) {
            this.field2294 = 75;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
    public static final void method1113(int arg0, int arg1) {
        field2288++;
        class112 var2 = class477.field6656;
        synchronized (class477.field6656) {
            class477.field6656.method987(2, arg0);
        }
        class112 var3 = class491.field6800;
        synchronized (class491.field6800) {
            class491.field6800.method987(2, arg0);
            if (arg1 != 0) {
                method1113(51, 108);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lwga;Ldg;Lqm;IIIII)V")
    public class136(class745 arg0, class413 arg1, class146 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2292 = arg0;
        this.field2275 = arg6;
        this.field2290 = arg7;
        this.field2291 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3937 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2422[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field2294 = 0;
            this.field2287 = null;
        } else {
            this.field2277 = Integer.MIN_VALUE;
            this.field2278 = Integer.MAX_VALUE;
            this.field2282 = this.field2292.method2290(-28633, false);
            this.field2282.method1240(15959, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field2282.method1241(true, false);
                if (var15 != null) {
                    Stream var16 = this.field2292.method4122(var15, 9179);
                    if (Stream.method3789()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3937 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2422[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field2277 < var28) {
                                            this.field2277 = var28;
                                        }
                                        if (var28 < this.field2278) {
                                            this.field2278 = var28;
                                        }
                                        var16.method3790(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3937 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2422[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field2278) {
                                            this.field2278 = var22;
                                        }
                                        if (var22 > this.field2277) {
                                            this.field2277 = var22;
                                        }
                                        var16.method3779(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3784();
                    if (this.field2282.method1239(-23)) {
                        break;
                    }
                }
            }
            this.field2294 = var10 / 3;
        }
    }
}
