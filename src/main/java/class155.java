import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class155 extends class276 {

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    private int field2599 = -1;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field2590 = -1;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lci;")
    public static class60 field2591 = new class60();

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Lam;")
    public static class297 field2597 = null;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field2598 = new String[100];

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "[I")
    public static int[] field2600 = new int[] { 3, 2, -1, 0, 0, 0, 3, 0, 2, 0, 0, 7, 1, 8, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 0, 12, 0, -2, 8, 0, 0, 10, 0, 2, 0, 6, 0, 15, 0, 0, 0, 0, 0, 4, 11, 0, 10, 3, 0, 0, -1, 0, 0, -1, -2, 0, 0, 0, 6, 0, 3, 0, 0, 0, 3, 5, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 20, 17, 0, 0, 0, 0, 6, 5, 0, -1, 0, 0, 0, 7, 0, 3, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 14, -1, 0, 4, 0, 8, -2, 0, 28, 3, 8, 8, -1, 6, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 12, 0, 5, 0, 0, -1, 0, 8, 0, 0, 0, 1, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 0, 0, 6, 0, -1, 10, 0, 8, 0, 10, 8, 2, 0, -2, -1, 0, 6, 9, 0, 2, -1, 0, 0, 0, 0, 2, 0, 0, 0, 6, 0, 7, 12, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 7, 0, 0, -1, 4, -2, 1, 0, 0, 0, 5, 6, 0, 6, 0, 0, 8, 0, -2, 0, 0, -2, 0, 1, -1, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 12, 0, -1, 0, 0, 0, 0, 0, 0, 0, 6 };

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
    public static int[] field2601 = new int[1000];

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "Ldl;")
    public static class46 field2606 = null;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "[I")
    public int[] field2607;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
    public static void method1060(int arg0) {
        field2606 = null;
        field2601 = null;
        field2591 = null;
        if (arg0 != 0) {
            field2591 = null;
        }
        field2598 = null;
        field2597 = null;
        field2600 = null;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)I")
    public final int method1061(int arg0) {
        if (arg0 >= -20) {
            field2598 = null;
        }
        ++field2592;
        return this.field2599;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)J")
    public static final long method1062(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        return var3 != null && var3.field1976 != null ? var3.field1976.field3759 : 0L;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[[I")
    public int[][] method300(int arg0, int arg1) {
        ++field2595;
        if (arg1 != -1) {
            return null;
        } else {
            int[][] var3 = super.field4418.method835((byte) 112, arg0);
            if (super.field4418.field2164 && this.method1063((byte) -93)) {
                int[] var4 = var3[1];
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                int var7 = (class209.field3540 == this.field2596 ? arg0 : this.field2596 * arg0 / class209.field3540) * this.field2605;
                if (~class53.field929 == ~this.field2605) {
                    for (int var8 = 0; ~class53.field929 < ~var8; ++var8) {
                        int var9 = this.field2607[var7++];
                        var6[var8] = class113.method791(var9 << 4, 4080);
                        var4[var8] = class113.method791(var9, 65280) >> 4;
                        var5[var8] = class113.method791(4080, var9 >> 12);
                    }
                } else {
                    for (int var10 = 0; class53.field929 > var10; ++var10) {
                        int var11 = this.field2605 * var10 / class53.field929;
                        int var12 = this.field2607[var7 - -var11];
                        var6[var10] = class113.method791(255, var12) << 4;
                        var4[var10] = class113.method791(var12 >> 4, 4080);
                        var5[var10] = class113.method791(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)Z")
    public final boolean method1063(byte arg0) {
        if (arg0 > -23) {
            this.method300(106, 106);
        }
        ++field2593;
        if (this.field2607 != null) {
            return true;
        } else if (this.field2599 >= 0) {
            class197 var2 = class144.field2462 >= 0 ? class84.method553((byte) -75, class144.field2462, class11.field162, this.field2599) : class31.method209(51, class11.field162, this.field2599);
            var2.method1311();
            this.field2605 = var2.field1218;
            this.field2607 = var2.field3189;
            this.field2596 = var2.field1229;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)[Lda;")
    public static final class197[] method1064(int arg0) {
        ++field2602;
        if (arg0 != -15847) {
            return null;
        } else {
            class197[] var1 = new class197[class110.field1990];
            for (int var2 = 0; var2 < class110.field1990; ++var2) {
                byte[] var3 = class199.field3226[var2];
                int var4 = class12.field168[var2] * class110.field1983[var2];
                int[] var5 = new int[var4];
                for (int var6 = 0; ~var4 < ~var6; ++var6) {
                    var5[var6] = class54.field941[class113.method791(255, var3[var6])];
                }
                var1[var2] = new class197(class79.field1365, class9.field116, class112.field2028[var2], class213.field3588[var2], class110.field1983[var2], class12.field168[var2], var5);
            }
            class253.method1679((byte) -81);
            return var1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field2599 = arg1.method677(false);
        }
        ++field2588;
        if (arg2 != -1) {
            method1060(8);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public final void method1065(byte arg0) {
        super.method1065(arg0);
        this.field2607 = null;
        ++field2603;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILnh;ILga;IIILte;)V")
    public static final void method1066(int arg0, class288 arg1, int arg2, class141 arg3, int arg4, int arg5, int arg6, class206 arg7) {
        ++field2587;
        class57 var8 = new class57();
        var8.field984 = arg2;
        var8.field1009 = arg0 * 128;
        if (arg5 == 6330) {
            var8.field991 = arg6 * 128;
            if (arg7 == null) {
                if (arg3 == null) {
                    if (arg1 != null) {
                        var8.field994 = arg1;
                        var8.field985 = 128 * (arg6 - -arg1.method528(-37));
                        var8.field983 = (arg1.method528(6) + arg0) * 128;
                        var8.field988 = class207.method1379((byte) -95, arg1);
                        var8.field1000 = arg1.field4588;
                        var8.field1004 = arg1.field4596 * 128;
                        class58.field1018.method780((byte) -78, class103.method702(true, arg1.field4601), var8);
                        return;
                    }
                } else {
                    var8.field1002 = arg3;
                    class208 var9 = arg3.field2421;
                    if (var9.field3521 != null) {
                        var8.field990 = true;
                        var9 = var9.method1402((byte) -119);
                    }
                    if (var9 != null) {
                        var8.field983 = (var9.field3537 + arg0) * 128;
                        var8.field985 = (var9.field3537 + arg6) * 128;
                        var8.field988 = class52.method326((byte) -108, arg3);
                        var8.field1004 = var9.field3525 * 128;
                        var8.field1000 = var9.field3526;
                    }
                    field2591.method374(-1, var8);
                }
            } else {
                var8.field1003 = arg7.field3385;
                var8.field1000 = arg7.field3370;
                var8.field998 = arg7.field3398;
                var8.field989 = arg7;
                var8.field1004 = arg7.field3362 * 128;
                var8.field997 = arg7.field3413;
                int var10 = arg7.field3377;
                int var11 = arg7.field3404;
                if (arg4 == 1 || arg4 == 3) {
                    var10 = arg7.field3404;
                    var11 = arg7.field3377;
                }
                var8.field983 = (arg0 + var11) * 128;
                var8.field988 = arg7.field3380;
                var8.field985 = (arg6 + var10) * 128;
                if (arg7.field3373 != null) {
                    var8.field990 = true;
                    var8.method355(-114);
                }
                if (var8.field997 != null) {
                    var8.field992 = (int) ((double) (-var8.field1003 + var8.field998) * Math.random()) + var8.field1003;
                }
                class254.field4154.method374(-1, var8);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIB)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field2604;
        class93.method598(-7, arg0 + arg1, -arg1 + arg0, class167.field2735[arg3], arg2);
        if (arg4 <= -10) {
            int var5 = arg1;
            int var6 = -arg1;
            int var7 = 0;
            int var8 = -1;
            while (~var7 > ~var5) {
                var8 += 2;
                var6 += var8;
                ++var7;
                if (~var6 <= -1) {
                    --var5;
                    var6 -= var5 << 1;
                    int[] var9 = class167.field2735[arg3 + var5];
                    int var10 = arg0 + var7;
                    int[] var11 = class167.field2735[-var5 + arg3];
                    int var12 = arg0 - var7;
                    class93.method598(-7, var10, var12, var9, arg2);
                    class93.method598(-7, var10, var12, var11, arg2);
                }
                int var13 = -var5 + arg0;
                int var14 = arg0 + var5;
                int[] var15 = class167.field2735[arg3 + var7];
                int[] var16 = class167.field2735[-var7 + arg3];
                class93.method598(-7, var14, var13, var15, arg2);
                class93.method598(-7, var14, var13, var16, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2594;
        if (~arg0 == ~arg1) {
            class3.method20(arg4, arg3, arg5, arg1, (byte) 114);
        } else {
            if (arg2 != 1988751940) {
                field2598 = null;
            }
            if (class126.field2222 <= -arg1 + arg4 && ~(arg1 + arg4) >= ~class118.field2098 && ~class118.field2094 >= ~(-arg0 + arg3) && ~(arg0 + arg3) >= ~class89.field1582) {
                class105.method717(arg3, arg5, (byte) -95, arg0, arg4, arg1);
            } else {
                class145.method1005(arg0, arg5, arg3, arg1, arg4, arg2 + -1988751943);
            }
        }
    }
}
