import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class209 extends class17 {

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lsf;")
    public static class108 field3726 = class140.method973(255, ":clanreq:");

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "Lsf;")
    private static class108 field3728 = class140.method973(255, "Hidden");

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!ah", name = "kb", descriptor = "Lca;")
    public static class98 field3736 = null;

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "Lsf;")
    public static class108 field3733 = class140.method973(255, "::clientjs5drop");

    @OriginalMember(owner = "client!ah", name = "mb", descriptor = "I")
    public static int field3738 = 0;

    @OriginalMember(owner = "client!ah", name = "pb", descriptor = "I")
    public static int field3741 = 2;

    @OriginalMember(owner = "client!ah", name = "lb", descriptor = "Lsf;")
    public static class108 field3737 = field3728;

    @OriginalMember(owner = "client!ah", name = "ob", descriptor = "[Lrm;")
    public static class249[] field3740 = new class249[2048];

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    private int field3727;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ah", name = "jb", descriptor = "I")
    private int field3735;

    @OriginalMember(owner = "client!ah", name = "nb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ah", name = "qb", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ah", name = "sb", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "Lik;")
    public static class262 field3729;

    @OriginalMember(owner = "client!ah", name = "rb", descriptor = "[Lwf;")
    public static class59[] field3743;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLrm;I)V", line = 15)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field3734++;
        if (arg2 == 0) {
            this.method1449(0, arg1.method1749(false));
        }
        if (arg0 != -114) {
            method1451(-84);
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(II)V", line = 48)
    private final void method1449(int arg0, int arg1) {
        field3742++;
        if (arg0 != 0) {
            field3736 = (class98) null;
        }
        this.field3727 = (arg1 & 0xFF0000) >> 12;
        this.field3731 = (arg1 & 0xFF00) >> 4;
        this.field3735 = arg1 & 0xFF << 4;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V", line = 62)
    private class209(int arg0) {
        super(0, false);
        this.method1449(0, arg0);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 94)
    public class209() {
        this(0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lrj;IIIIIIZ)V", line = 99)
    public static final void method1450(class18 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field249.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field249[var9] - class1.field10;
            int var11 = arg0.field260[var9] - class260.field4592;
            int var12 = arg0.field258[var9] - class311.field5381;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field244 != null) {
                class18.field256[var9] = var13;
                class18.field246[var9] = var16;
                class18.field241[var9] = var17;
            }
            class18.field250[var9] = (var13 << 9) / var17 + class263.field4658;
            class18.field242[var9] = (var16 << 9) / var17 + class263.field4662;
        }
        class263.field4660 = 0;
        int var19 = arg0.field245.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field245[var20];
            int var22 = arg0.field252[var20];
            int var23 = arg0.field253[var20];
            int var24 = class18.field250[var21];
            int var25 = class18.field250[var22];
            int var26 = class18.field250[var23];
            int var27 = class18.field242[var21];
            int var28 = class18.field242[var22];
            int var29 = class18.field242[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class1.field7 && class14.method89(class263.field4658 + class170.field3045, class263.field4662 + class160.field2877, var27, var28, var29, var24, var25, var26)) {
                    class242.field4205 = arg5;
                    class200.field3619 = arg6;
                }
                if (!class231.field4051 && !arg7) {
                    class263.field4648 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class263.field4647 || var25 > class263.field4647 || var26 > class263.field4647) {
                        class263.field4648 = true;
                    }
                    if (arg0.field244 == null || arg0.field244[var20] == -1) {
                        if (arg0.field257[var20] != 12345678) {
                            class263.method1897(var27, var28, var29, var24, var25, var26, arg0.field257[var20], arg0.field240[var20], arg0.field254[var20]);
                        }
                    } else if (!class312.field5394) {
                        int var30 = class263.field4661.method564(65535, arg0.field244[var20]);
                        class263.method1897(var27, var28, var29, var24, var25, var26, class190.method1349(var30, arg0.field257[var20]), class190.method1349(var30, arg0.field240[var20]), class190.method1349(var30, arg0.field254[var20]));
                    } else if (arg0.field247) {
                        class263.method1896(var27, var28, var29, var24, var25, var26, arg0.field257[var20], arg0.field240[var20], arg0.field254[var20], class18.field256[0], class18.field256[1], class18.field256[3], class18.field246[0], class18.field246[1], class18.field246[3], class18.field241[0], class18.field241[1], class18.field241[3], arg0.field244[var20]);
                    } else {
                        class263.method1896(var27, var28, var29, var24, var25, var26, arg0.field257[var20], arg0.field240[var20], arg0.field254[var20], class18.field256[var21], class18.field256[var22], class18.field256[var23], class18.field246[var21], class18.field246[var22], class18.field246[var23], class18.field241[var21], class18.field241[var22], class18.field241[var23], arg0.field244[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)[[I", line = 217)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            method1452(62, (int[]) null, 111, 10, -25);
        }
        field3744++;
        int[][] var3 = this.field224.method2081(arg1, -61);
        if (this.field224.field5106) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class116.field2008; var7++) {
                var4[var7] = this.field3727;
                var5[var7] = this.field3731;
                var6[var7] = this.field3735;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)V", line = 259)
    public static void method1451(int arg0) {
        field3729 = null;
        if (arg0 >= -97) {
            return;
        }
        field3728 = null;
        field3733 = null;
        field3743 = null;
        field3726 = null;
        field3737 = null;
        field3740 = null;
        field3736 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[IIII)V", line = 285)
    public static final void method1452(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3739++;
        int var6 = arg0 - 1;
        int var5 = var6 - arg2;
        arg3--;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        while (arg3 < var6) {
            arg3++;
            arg1[arg3] = arg4;
        }
    }
}
