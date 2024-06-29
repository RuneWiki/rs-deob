import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class160 {

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lre;")
    public class222 field2824 = new class222();

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2819 = -1;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lcf;")
    public static class93 field2821 = class147.method1066("Mem:", -48);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lje;")
    public static class183 field2817;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lre;")
    private class222 field2830;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lre;")
    public final class222 method1151(int arg0) {
        class222 var2 = this.field2824.field4007;
        if (arg0 < 97) {
            field2821 = null;
        }
        field2814++;
        if (this.field2824 == var2) {
            this.field2830 = null;
            return null;
        } else {
            this.field2830 = var2.field4007;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLre;)V")
    public final void method1152(byte arg0, class222 arg1) {
        field2820++;
        if (arg1.field4005 != null) {
            arg1.method1544((byte) -28);
        }
        arg1.field4007 = this.field2824;
        arg1.field4005 = this.field2824.field4005;
        arg1.field4005.field4007 = arg1;
        arg1.field4007.field4005 = arg1;
        if (arg0 != -5) {
            method1156(73, -122, -75, 80, -29, -19, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public final void method1153(byte arg0) {
        field2826++;
        while (true) {
            class222 var2 = this.field2824.field4007;
            if (this.field2824 == var2) {
                if (arg0 != -6) {
                    this.field2824 = null;
                }
                this.field2830 = null;
                return;
            }
            var2.method1544((byte) -32);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method1154(int arg0) {
        if (arg0 == -1) {
            field2817 = null;
            field2821 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2827++;
        int var7 = class141.method1027(class26.field342, arg3, false, class271.field4820);
        if (arg0 != -24276) {
            field2821 = null;
        }
        int var8 = class141.method1027(class26.field342, arg2, false, class271.field4820);
        int var9 = class141.method1027(class277.field4967, arg5, false, class147.field2593);
        int var10 = class141.method1027(class277.field4967, arg4, false, class147.field2593);
        int var11 = class141.method1027(class26.field342, arg1 + arg3, false, class271.field4820);
        int var12 = class141.method1027(class26.field342, arg2 - arg1, false, class271.field4820);
        for (int var13 = var7; var13 < var11; var13++) {
            class58.method337(var9, class76.field1406[var13], arg6, var10, false);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class58.method337(var9, class76.field1406[var14], arg6, var10, false);
        }
        int var15 = class141.method1027(class277.field4967, arg1 + arg5, false, class147.field2593);
        int var16 = class141.method1027(class277.field4967, arg4 - arg1, false, class147.field2593);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class76.field1406[var17];
            class58.method337(var9, var18, arg6, var15, false);
            class58.method337(var16, var18, arg6, var10, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2829++;
        class241.method1647(20220, arg4);
        int var7 = arg4 - arg2;
        if (arg6 != 0) {
            method1155(-39, 3, 12, 67, 37, 35, 0);
        }
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class76.field1406[arg1];
        int var16 = arg3 - var7;
        class58.method337(arg3 - arg4, var15, arg5, var16, false);
        int var17 = arg3 + var7;
        class58.method337(var16, var15, arg0, var17, false);
        class58.method337(var17, var15, arg5, arg3 + arg4, false);
        while (var8 < var9) {
            var14 += 2;
            var12 += var14;
            var13 += 2;
            if (var12 >= 0 && var11 >= 1) {
                class162.field2867[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            var10 += var13;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var7 > var9) {
                    int[] var18 = class76.field1406[arg1 - var9];
                    int[] var19 = class76.field1406[arg1 + var9];
                    int var20 = class162.field2867[var9];
                    int var21 = arg3 + var8;
                    int var22 = arg3 - var8;
                    int var23 = arg3 - var20;
                    class58.method337(var22, var19, arg5, var23, false);
                    int var24 = arg3 + var20;
                    class58.method337(var23, var19, arg0, var24, false);
                    class58.method337(var24, var19, arg5, var21, false);
                    class58.method337(var22, var18, arg5, var23, false);
                    class58.method337(var23, var18, arg0, var24, false);
                    class58.method337(var24, var18, arg5, var21, false);
                } else {
                    int[] var25 = class76.field1406[arg1 - var9];
                    int var26 = arg3 + var8;
                    int[] var27 = class76.field1406[arg1 + var9];
                    int var28 = arg3 - var8;
                    class58.method337(var28, var27, arg5, var26, false);
                    class58.method337(var28, var25, arg5, var26, false);
                }
            }
            int[] var29 = class76.field1406[arg1 + var8];
            int var30 = arg3 - var9;
            int var31 = arg3 + var9;
            int[] var32 = class76.field1406[arg1 - var8];
            if (var8 < var7) {
                int var33 = var11 < var8 ? class162.field2867[var8] : var11;
                int var34 = arg3 - var33;
                int var35 = arg3 + var33;
                class58.method337(var30, var29, arg5, var34, false);
                class58.method337(var34, var29, arg0, var35, false);
                class58.method337(var35, var29, arg5, var31, false);
                class58.method337(var30, var32, arg5, var34, false);
                class58.method337(var34, var32, arg0, var35, false);
                class58.method337(var35, var32, arg5, var31, false);
            } else {
                class58.method337(var30, var29, arg5, var31, false);
                class58.method337(var30, var32, arg5, var31, false);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Lre;")
    public final class222 method1157(boolean arg0) {
        field2825++;
        class222 var2 = this.field2830;
        if (this.field2824 == var2) {
            this.field2830 = null;
            return null;
        }
        if (!arg0) {
            field2817 = null;
        }
        this.field2830 = var2.field4005;
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lre;")
    public final class222 method1158(int arg0) {
        class222 var2 = this.field2824.field4007;
        field2818++;
        if (arg0 != 1375765729) {
            field2817 = null;
        }
        if (this.field2824 == var2) {
            return null;
        } else {
            var2.method1544((byte) -48);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lre;")
    public final class222 method1159(int arg0) {
        field2816++;
        class222 var2 = this.field2830;
        if (this.field2824 == var2) {
            this.field2830 = null;
            return null;
        }
        this.field2830 = var2.field4007;
        if (arg0 <= 24) {
            field2821 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lre;Z)V")
    public final void method1160(class222 arg0, boolean arg1) {
        if (arg0.field4005 != null) {
            arg0.method1544((byte) -118);
        }
        arg0.field4005 = this.field2824;
        field2822++;
        arg0.field4007 = this.field2824.field4007;
        arg0.field4005.field4007 = arg0;
        arg0.field4007.field4005 = arg0;
        if (arg1) {
            this.field2824 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Lre;")
    public final class222 method1161(int arg0) {
        class222 var2 = this.field2824.field4005;
        if (arg0 != -1059) {
            return null;
        }
        field2828++;
        if (this.field2824 == var2) {
            this.field2830 = null;
            return null;
        } else {
            this.field2830 = var2.field4005;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
    public static final boolean method1162(int arg0, int arg1, int arg2) {
        int var3 = class208.field3732[arg0][arg1][arg2];
        if (-class150.field2639 == var3) {
            return false;
        } else if (class150.field2639 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class268.method1792(var4 + 1, class233.field4151[arg0][arg1][arg2], var5 + 1) && class268.method1792(var4 + 128 - 1, class233.field4151[arg0][arg1 + 1][arg2], var5 + 1) && class268.method1792(var4 + 128 - 1, class233.field4151[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class268.method1792(var4 + 1, class233.field4151[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class208.field3732[arg0][arg1][arg2] = class150.field2639;
                return true;
            } else {
                class208.field3732[arg0][arg1][arg2] = -class150.field2639;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class160() {
        this.field2824.field4005 = this.field2824;
        this.field2824.field4007 = this.field2824;
    }
}
