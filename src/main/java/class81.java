import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class81 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    private int[] field1549;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[I")
    private int[] field1560;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Ltg;")
    private class205 field1563;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ltg;")
    private class205 field1547;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[Ltg;")
    private class205[] field1556;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lig;")
    public static class93 field1550 = new class93(128);

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lvd;")
    private static class222 field1557 = class212.method1357("Please subscribe)1 or use a different world)3", 10731);

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lvd;")
    public static class222 field1552 = field1557;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1564 = 0;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lvd;")
    private static class222 field1559 = class212.method1357("wave2:", 10731);

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lvd;")
    public static class222 field1553 = field1559;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lvd;")
    public static class222 field1558 = field1559;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1566 = -1;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lwd;")
    public static class232 field1562;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lab;")
    public static class3 field1555;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lsg;ILab;)Z")
    public final boolean method529(class195 arg0, int arg1, class3 arg2) {
        field1568++;
        for (int var4 = 0; var4 < this.field1560.length; var4++) {
            if (!arg2.method21(true, this.field1560[var4])) {
                return false;
            }
        }
        if (arg1 != 255) {
            field1553 = null;
        }
        for (int var5 = 0; var5 < this.field1549.length; var5++) {
            if (!arg0.method1179(-4606, this.field1549[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method530(byte arg0) {
        for (class138 var1 = (class138) class56.field1059.method236(arg0 ^ 0x44); var1 != null; var1 = (class138) class56.field1059.method237(true)) {
            if (var1.field2675 != null) {
                class18.field443.method754(var1.field2675);
                var1.field2675 = null;
            }
            if (var1.field2668 != null) {
                class18.field443.method754(var1.field2668);
                var1.field2668 = null;
            }
        }
        if (arg0 != 68) {
            field1550 = null;
        }
        field1554++;
        class56.field1059.method238(1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZIILab;BLsg;D)[I")
    public final int[] method531(boolean arg0, boolean arg1, int arg2, int arg3, class3 arg4, byte arg5, class195 arg6, double arg7) {
        int[] var10 = new int[arg2 * arg3];
        if (arg5 >= -58) {
            method530((byte) -116);
        }
        class237.method1547((byte) -66, arg7);
        field1548++;
        class125.field2391 = arg6;
        class138.field2679 = arg4;
        class98.method616(arg3, (byte) -109, arg2);
        for (int var11 = 0; var11 < this.field1556.length; var11++) {
            this.field1556[var11].method1324((byte) 121, arg3, arg2);
        }
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = -1;
            var13 = arg3 - 1;
            var14 = -1;
        } else {
            var14 = 1;
            var12 = arg3;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1563.field3812) {
                int[] var18 = this.field1563.method4(0, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1563.method96(var16, (byte) 113);
                var19 = var22[1];
                var20 = var22[2];
                var21 = var22[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var21[var23] >> 4;
                int var25 = var19[var23] >> 4;
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = class47.field967[var26];
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var28 = class47.field967[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var29 = class47.field967[var24];
                var10[var15++] = (var28 << 8) + (var29 << 16) + var27;
                if (arg0) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1556.length; var17++) {
            this.field1556[var17].method95(3);
        }
        return var10;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[III)V")
    public static final void method532(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int var13 = arg3 - 1;
        int var5 = arg4 + var13;
        arg0--;
        field1551++;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg2[var6] = arg1;
            int var7 = var6 + 1;
            arg2[var7] = arg1;
            int var8 = var7 + 1;
            arg2[var8] = arg1;
            int var9 = var8 + 1;
            arg2[var9] = arg1;
            int var10 = var9 + 1;
            arg2[var10] = arg1;
            int var11 = var10 + 1;
            arg2[var11] = arg1;
            int var12 = var11 + 1;
            arg2[var12] = arg1;
            arg0 = var12 + 1;
            arg2[arg0] = arg1;
        }
        while (var13 > arg0) {
            arg0++;
            arg2[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class81() {
        this.field1549 = new int[0];
        this.field1560 = new int[0];
        this.field1563 = new class197();
        this.field1563.field3814 = 1;
        this.field1547 = new class197();
        this.field1556 = new class205[] { this.field1563, this.field1547 };
        this.field1547.field3814 = 1;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lka;)V")
    public class81(class109 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method662((byte) -124);
        this.field1556 = new class205[var4];
        int[][] var5 = new int[var4][];
        for (int var6 = 0; var6 < var4; var6++) {
            class205 var16 = class221.method1404(0, arg0);
            if (var16.method97(8521) >= 0) {
                var2++;
            }
            if (var16.method214(-71) >= 0) {
                var3++;
            }
            int var17 = var16.field3822.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method662((byte) -83);
            }
            this.field1556[var6] = var16;
        }
        this.field1560 = new int[var2];
        this.field1549 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var4; var9++) {
            class205 var11 = this.field1556[var9];
            int var12 = var11.field3822.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3822[var13] = this.field1556[var5[var9][var13]];
            }
            int var14 = var11.method97(8521);
            int var15 = var11.method214(-61);
            if (var14 > 0) {
                this.field1560[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1549[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1563 = this.field1556[arg0.method662((byte) -97)];
        Object var10 = null;
        this.field1547 = this.field1556[arg0.method662((byte) -128)];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method533(int arg0) {
        field1562 = null;
        if (arg0 > -106) {
            return;
        }
        field1553 = null;
        field1552 = null;
        field1558 = null;
        field1555 = null;
        field1557 = null;
        field1559 = null;
        field1550 = null;
    }
}
