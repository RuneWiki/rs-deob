import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class237 extends class335 {

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field3769 = 1;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    private int field3778 = 1;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "Lql;")
    public static class87 field3775 = new class87();

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field3779 = 99;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "F")
    public static float field3777;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "[Lqf;")
    public static class341[] field3780;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)V", line = 10)
    public static final void method1656(int arg0, int arg1) {
        if (arg0 != -4248) {
            method1659(119);
        }
        for (class46 var2 = class47.field767.method1228(true); var2 != null; var2 = class47.field767.method1223((byte) 13)) {
            if ((var2.field758 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method403(1);
            }
        }
        field3776++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[I", line = 35)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            return (int[]) null;
        }
        field3773++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = this.field3778 - (-this.field3778 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field3769 + this.field3769 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field3778; var9 <= (arg0 + this.field3778); var9++) {
                int[] var10 = this.method2330(var9 & class227.field3597, true, 0);
                int[] var11 = new int[class105.field1630];
                int var12 = 0;
                for (int var13 = -this.field3769; var13 <= this.field3769; var13++) {
                    var12 += var10[class244.field3906 & var13];
                }
                int var14 = 0;
                while (var14 < class105.field1630) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field3769 & class244.field3906];
                    var14++;
                    var12 = var10[class244.field3906 & this.field3769 + var14] + var15;
                }
                var8[var9 + this.field3778 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class105.field1630; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)Lfa;", line = 124)
    public static final class299 method1657(int arg0, int arg1) {
        class299 var2 = (class299) class321.field5014.method2179(false, (long) arg1);
        field3772++;
        if (arg0 != 2) {
            return (class299) null;
        } else if (var2 == null) {
            byte[] var3 = class71.field1171.method980(class34.method285(arg1, 160), class128.method929(arg0 + 4099, arg1), 5);
            class299 var4 = new class299();
            var4.field4637 = arg1;
            if (var3 != null) {
                var4.method2042(new class166(var3), -12064);
            }
            var4.method2027((byte) 105);
            if (var4.field4616 != -1) {
                var4.method2024(arg0 + 101, method1657(arg0 ^ 0x0, var4.field4616), method1657(2, var4.field4623));
            }
            if (var4.field4668 != -1) {
                var4.method2030(5, method1657(2, var4.field4668), method1657(2, var4.field4635));
            }
            if (!class344.field5338 && var4.field4609) {
                var4.field4650 = class315.field4894;
                var4.field4679 = 0;
                var4.field4643 = class75.field1208;
                var4.field4619 = false;
                var4.field4606 = class37.field572;
            }
            class321.field5014.method2173(var4, true, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[[I", line = 168)
    public final int[][] method249(int arg0, byte arg1) {
        if (arg1 != 51) {
            this.field3778 = 10;
        }
        field3774++;
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int var4 = this.field3778 + this.field3778 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3769 + this.field3769 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field3778; var9 <= this.field3778 + arg0; var9++) {
                int[][] var10 = this.method2328(var9 & class227.field3597, false, 0);
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int[][] var14 = new int[3][class105.field1630];
                int[] var15 = var10[1];
                int[] var16 = var10[2];
                int[] var17 = var10[0];
                for (int var18 = -this.field3769; var18 <= this.field3769; var18++) {
                    int var19 = var18 & class244.field3906;
                    var13 += var16[var19];
                    var11 += var17[var19];
                    var12 += var15[var19];
                }
                int[] var20 = var14[0];
                int[] var21 = var14[1];
                int[] var22 = var14[2];
                int var23 = 0;
                while (class105.field1630 > var23) {
                    var20[var23] = var7 * var11 >> 16;
                    var21[var23] = var7 * var12 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    int var24 = class244.field3906 & var23 - this.field3769;
                    int var25 = var13 - var16[var24];
                    var23++;
                    int var26 = var11 - var17[var24];
                    int var27 = var12 - var15[var24];
                    int var28 = class244.field3906 & var23 + this.field3769;
                    var12 = var15[var28] + var27;
                    var11 = var17[var28] + var26;
                    var13 = var16[var28] + var25;
                }
                var8[this.field3778 + var9 - arg0] = var14;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class105.field1630; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V", line = 301)
    public static final void method1658(int arg0, int arg1, int arg2, int arg3) {
        field3770++;
        class338 var4 = class195.method1391(11, (byte) -92, arg0);
        var4.method2352((byte) 127);
        if (arg3 != 24333) {
            method1658(-105, -74, 87, 94);
        }
        var4.field5288 = arg1;
        var4.field5279 = arg2;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V", line = 316)
    public static void method1659(int arg0) {
        if (arg0 == -28481) {
            field3775 = null;
            field3780 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILkh;I)V", line = 337)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3769 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field3778 = arg1.method1178(0);
        } else if (arg0 == 2) {
            this.field5234 = arg1.method1178(0) == 1;
        }
        field3771++;
        if (arg2 < 51) {
            method1656(-15, 42);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 374)
    public class237() {
        super(1, false);
    }
}
