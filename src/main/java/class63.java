import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class63 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lao;")
    public static class191 field727 = new class191(10, 8);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lho;")
    public static class103 field732 = new class103(48, 11);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lsb;")
    public static class193 field735;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method376(int arg0) {
        if (arg0 <= 12) {
            method377(-107, null, -115, -89, null);
        }
        field735 = null;
        field732 = null;
        field727 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[SII[Ljava/lang/String;)V")
    public static final void method377(int arg0, short[] arg1, int arg2, int arg3, String[] arg4) {
        if (arg2 > arg3) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg3;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method377(0, arg1, var6 - 1, arg3, arg4);
            method377(0, arg1, arg2, var6 + 1, arg4);
        }
        field729++;
        if (arg0 != 0) {
            method376(22);
        }
    }

    @OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field728++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field730++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg6 - arg0;
        int var12 = arg7 - arg0;
        int var13 = arg6 * arg6;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        if (arg5 != 29831) {
            return;
        }
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class5.field54[arg1];
        class476.method2907(arg2 - var11, arg5 + -29705, arg3, var39, arg2 - arg6);
        class476.method2907(arg2 + var11, 90, arg4, var39, arg2 - var11);
        class476.method2907(arg2 + arg6, 95, arg3, var39, arg2 + var11);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg1 - var9;
            int var42 = arg1 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class476.method2907(var46, 53, arg3, class5.field54[var41], var44);
                class476.method2907(var45, 44, arg4, class5.field54[var41], var46);
                class476.method2907(var43, 105, arg3, class5.field54[var41], var45);
                class476.method2907(var46, 76, arg3, class5.field54[var42], var44);
                class476.method2907(var45, 98, arg4, class5.field54[var42], var46);
                class476.method2907(var43, 104, arg3, class5.field54[var42], var45);
            } else {
                class476.method2907(var43, 60, arg3, class5.field54[var41], var44);
                class476.method2907(var43, 63, arg3, class5.field54[var42], var44);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIII)V")
    public class63(int arg0, int arg1, int arg2, int arg3) {
        this.field734 = arg0;
        this.field726 = arg3;
        this.field731 = arg1;
        this.field724 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V")
    public static final void method379(int arg0, int arg1, boolean arg2) {
        field725++;
        if (class372.method2199(-65, arg1)) {
            class15.method87(arg2, arg0, class339.field4491[arg1]);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lu;")
    public static final class54 method380(int arg0, byte arg1) {
        field733++;
        if (class65.field754 && arg0 >= class327.field4345 && arg0 <= class412.field5887) {
            if (arg1 >= -41) {
                field727 = null;
            }
            return class178.field2306[arg0 - class327.field4345];
        } else {
            return null;
        }
    }
}
