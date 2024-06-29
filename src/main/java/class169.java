import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class169 extends class107 {

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    private int field2963 = 4096;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    private int field2965 = 4096;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    private int field2967 = 4096;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "[Lie;")
    public static class32[] field2969 = new class32[2048];

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "F")
    public static float field2966;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field2974;
        if (arg2 != -32513) {
            this.field2967 = -104;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2963 = arg0.method339(-16777216);
                }
            } else {
                this.field2965 = arg0.method339(arg2 ^ 16744703);
            }
        } else {
            this.field2967 = arg0.method339(-16777216);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lhk;IZLhk;I)I")
    public static final int method1172(class122 arg0, int arg1, boolean arg2, class122 arg3, int arg4) {
        if (arg1 != 0) {
            method1175(75, -106, -106);
        }
        ++field2971;
        if (arg4 == 1) {
            int var5 = arg3.field3131;
            int var6 = arg0.field3131;
            if (!arg2) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (~var6 == 0) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg3.method875(true).field486.method1611(arg0.method875(true).field486, 89);
        } else if (~arg4 == -4) {
            if (arg3.field2149.method1585((byte) 100, class179.field3146)) {
                if (arg0.field2149.method1585((byte) 50, class179.field3146)) {
                    return 0;
                } else {
                    return arg2 ? -1 : 1;
                }
            } else if (arg0.field2149.method1585((byte) 126, class179.field3146)) {
                return arg2 ? 1 : -1;
            } else {
                return arg3.field2149.method1611(arg0.field2149, 123);
            }
        } else if (arg4 == 4) {
            if (!arg3.method1236(-1)) {
                return arg0.method1236(-1) ? -1 : 0;
            } else {
                return arg0.method1236(-1) ? 0 : 1;
            }
        } else if (~arg4 == -6) {
            if (!arg3.method1234(-79)) {
                return arg0.method1234(arg1 + -64) ? -1 : 0;
            } else {
                return arg0.method1234(-97) ? 0 : 1;
            }
        } else if (arg4 == 6) {
            if (arg3.method1231(14416)) {
                return !arg0.method1231(arg1 + 14416) ? 1 : 0;
            } else {
                return arg0.method1231(14416) ? -1 : 0;
            }
        } else if (arg4 == 7) {
            if (!arg3.method1235(79)) {
                return !arg0.method1235(91) ? 0 : -1;
            } else {
                return !arg0.method1235(arg1 ^ -80) ? 1 : 0;
            }
        } else {
            return arg3.field2157 - arg0.field2157;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILfa;Lfa;)I")
    public static final int method1173(int arg0, class239 arg1, class239 arg2) {
        ++field2970;
        int var3 = 0;
        if (arg2.method1639((byte) 98, class36.field789)) {
            ++var3;
        }
        if (arg2.method1639((byte) 90, class55.field1138)) {
            ++var3;
        }
        if (arg2.method1639((byte) 96, class151.field2680)) {
            ++var3;
        }
        if (arg1.method1639((byte) 117, class36.field789)) {
            ++var3;
        }
        if (arg1.method1639((byte) 90, class55.field1138)) {
            ++var3;
        }
        if (arg0 != 17419) {
            return -47;
        } else {
            if (arg1.method1639((byte) 108, class151.field2680)) {
                ++var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V")
    public static void method1174(boolean arg0) {
        if (!arg0) {
            field2969 = null;
        }
        field2969 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
    public static final void method1175(int arg0, int arg1, int arg2) {
        ++field2975;
        class88 var3 = class32.field674[class274.field4798][arg2][arg1];
        if (var3 == null) {
            class210.method1407(class274.field4798, arg2, arg1);
        } else {
            int var4 = -99999999;
            class10 var5 = null;
            for (class10 var6 = (class10) var3.method673(false); var6 != null; var6 = (class10) var3.method680(55)) {
                class8 var13 = class112.method829((byte) -82, var6.field195.field1129);
                int var14 = var13.field150;
                if (var13.field168 == 1) {
                    var14 = (var6.field195.field1124 - -1) * var14;
                }
                if (~var14 < ~var4) {
                    var5 = var6;
                    var4 = var14;
                }
            }
            if (var5 == null) {
                class210.method1407(class274.field4798, arg2, arg1);
            } else {
                class54 var7 = null;
                class54 var8 = null;
                if (arg0 < 46) {
                    field2972 = 118;
                }
                var3.method679(24549, var5);
                for (class10 var9 = (class10) var3.method673(false); var9 != null; var9 = (class10) var3.method680(18)) {
                    class54 var12 = var9.field195;
                    if (~var5.field195.field1129 != ~var12.field1129) {
                        if (var7 == null) {
                            var7 = var12;
                        }
                        if (var7.field1129 != var12.field1129 && var8 == null) {
                            var8 = var12;
                        }
                    }
                }
                long var10 = (long) (arg2 - -(arg1 << 7) + 1610612736);
                class206.method1386(class274.field4798, arg2, arg1, class23.method216(-73, arg1 * 128 - -64, arg2 * 128 + 64, class274.field4798), var5.field195, var10, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int var3 = 28 / ((26 - arg0) / 45);
        ++field2973;
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var5 = this.method802(3, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class106.field1862; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (~var13 == ~var14 && ~var14 == ~var15) {
                    var10[var12] = this.field2967 * var13 >> 12;
                    var9[var12] = this.field2965 * var14 >> 12;
                    var11[var12] = this.field2963 * var15 >> 12;
                } else {
                    var10[var12] = this.field2967;
                    var9[var12] = this.field2965;
                    var11[var12] = this.field2963;
                }
            }
        }
        return var4;
    }
}
