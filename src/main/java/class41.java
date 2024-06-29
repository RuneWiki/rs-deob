import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class41 extends class3 {

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    private int field618 = 1;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    private int field619 = 1;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "[J")
    public static long[] field621 = new long[1000];

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field623 = 0;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "Lui;")
    public static class98 field624 = new class98(64);

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "Lui;")
    public static class98 field627 = new class98(4);

    @OriginalMember(owner = "client!tn", name = "W", descriptor = "F")
    public static float field629 = 0.0F;

    @OriginalMember(owner = "client!tn", name = "X", descriptor = "Ljo;")
    public static class150 field630 = new class150();

    @OriginalMember(owner = "client!tn", name = "ab", descriptor = "Lsi;")
    public static class264 field633 = null;

    @OriginalMember(owner = "client!tn", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field631 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!tn", name = "Z", descriptor = "Lnm;")
    public static class221 field632;

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "[Llj;")
    public static class289[] field626;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)[I", line = 6)
    public final int[] method25(byte arg0, int arg1) {
        field617++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = this.field619 + this.field619 + 1;
            int var5 = this.field618 + this.field618 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field619; var9 <= (this.field619 + arg1); var9++) {
                int[] var10 = this.method24(class129.field1970 & var9, 1, 0);
                int var11 = 0;
                int[] var12 = new int[class326.field5342];
                for (int var13 = -this.field618; var13 <= this.field618; var13++) {
                    var11 += var10[class5.field70 & var13];
                }
                int var14 = 0;
                while (var14 < class326.field5342) {
                    var12[var14] = var7 * var11 >> 16;
                    int var15 = var11 - var10[class5.field70 & var14 - this.field618];
                    var14++;
                    var11 = var10[this.field618 + var14 & class5.field70] + var15;
                }
                var8[var9 + this.field619 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class326.field5342; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return arg0 <= 57 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lfh;IZ)V", line = 105)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field618 = arg0.method2224(-121);
        } else if (arg1 == 1) {
            this.field619 = arg0.method2224(-125);
        } else if (arg1 == 2) {
            this.field34 = arg0.method2224(-119) == 1;
        }
        field620++;
        if (arg2) {
            method325(5);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 454)
    public class41() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[I", line = 147)
    public final int[][] method22(int arg0, int arg1) {
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int var4 = this.field619 + this.field619 + 1;
            int var5 = this.field618 + this.field618 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field619; var9 <= (this.field619 + arg1); var9++) {
                int[][] var10 = this.method16(class129.field1970 & var9, 0, (byte) -106);
                int var11 = 0;
                int[][] var12 = new int[3][class326.field5342];
                int var13 = 0;
                int[] var14 = var10[0];
                int var15 = 0;
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field618; var18 <= this.field618; var18++) {
                    int var19 = class5.field70 & var18;
                    var11 += var14[var19];
                    var13 += var17[var19];
                    var15 += var16[var19];
                }
                int[] var20 = var12[0];
                int[] var21 = var12[1];
                int[] var22 = var12[2];
                int var23 = 0;
                while (class326.field5342 > var23) {
                    var20[var23] = var7 * var11 >> 16;
                    var21[var23] = var7 * var15 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    int var24 = class5.field70 & var23 - this.field618;
                    int var25 = var15 - var16[var24];
                    int var26 = var11 - var14[var24];
                    var23++;
                    int var27 = var13 - var17[var24];
                    int var28 = this.field618 + var23 & class5.field70;
                    var11 = var14[var28] + var26;
                    var15 = var16[var28] + var25;
                    var13 = var17[var28] + var27;
                }
                var8[var9 + this.field619 - arg1] = var12;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class326.field5342; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                    var34 += var37[1][var32];
                }
                var29[var32] = var6 * var33 >> 16;
                var31[var32] = var6 * var34 >> 16;
                var30[var32] = var6 * var35 >> 16;
            }
        }
        field615++;
        if (arg0 != -21194) {
            this.method22(105, -72);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)V", line = 285)
    public static void method324(byte arg0) {
        field631 = null;
        field630 = null;
        field632 = null;
        field626 = null;
        if (arg0 <= 35) {
            field633 = (class264) null;
        }
        field627 = null;
        field633 = null;
        field624 = null;
        field621 = null;
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)Lnf;", line = 303)
    public static final class275 method325(int arg0) {
        field614++;
        if (arg0 != -30462) {
            field626 = (class289[]) null;
        }
        return class88.field1260;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V", line = 315)
    public static final void method326(int arg0, int arg1) {
        class204.field3120 = 1000 / arg1;
        field613++;
        if (arg0 != 540359664) {
            method326(27, 54);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILrc;III)V", line = 329)
    public static final void method327(int arg0, int arg1, class250 arg2, int arg3, int arg4, int arg5) {
        field622++;
        if (~arg2.field3972 == arg0 && arg2.field3974 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field3970 < arg1) {
            var6 += arg1 - arg2.field3970;
        } else if (arg2.field3987 > arg1) {
            var6 += arg2.field3987 - arg1;
        }
        if (arg4 > arg2.field3977) {
            var6 += arg4 - arg2.field3977;
        } else if (arg2.field3989 > arg4) {
            var6 += arg2.field3989 - arg4;
        }
        int var7 = class58.field878 * arg2.field3973 >> 8;
        if (arg2.field3980 == 0 || (var6 - 64) > arg2.field3980 || class58.field878 == 0 || arg2.field3978 != arg5) {
            if (arg2.field3983 != null) {
                class28.field434.method1412(arg2.field3983);
                arg2.field3983 = null;
            }
            if (arg2.field3985 != null) {
                class28.field434.method1412(arg2.field3985);
                arg2.field3985 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field3980 - var6) * var7 / arg2.field3980;
        if (arg2.field3983 != null) {
            arg2.field3983.method1637(var8);
        } else if (arg2.field3972 >= 0) {
            class80 var9 = class80.method542(class99.field1433, arg2.field3972, 0);
            if (var9 != null) {
                class321 var10 = var9.method543().method2307(class131.field2012);
                class237 var11 = class237.method1632(var10, 100, var8);
                var11.method1640(-1);
                class28.field434.method1414(var11);
                arg2.field3983 = var11;
            }
        }
        if (arg2.field3985 != null) {
            arg2.field3985.method1637(var8);
            if (!arg2.field3985.method1132(arg0 - 126)) {
                arg2.field3985 = null;
            }
        } else if (arg2.field3974 != null && (arg2.field3971 -= arg3) <= 0) {
            int var12 = (int) (Math.random() * (double) arg2.field3974.length);
            class80 var13 = class80.method542(class99.field1433, arg2.field3974[var12], 0);
            if (var13 != null) {
                class321 var14 = var13.method543().method2307(class131.field2012);
                class237 var15 = class237.method1632(var14, 100, var8);
                var15.method1640(0);
                class28.field434.method1414(var15);
                arg2.field3985 = var15;
                arg2.field3971 = arg2.field3981 + ((int) ((double) (arg2.field3997 - arg2.field3981) * Math.random()));
            }
        }
    }
}
