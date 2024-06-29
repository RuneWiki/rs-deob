import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class101 extends class279 {

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    private int field1648 = 1;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    private int field1652 = 1;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Ltl;")
    public static class59 field1644 = class85.method639("runes", 9588);

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Ltl;")
    public static class59 field1643 = class85.method639("k", 9588);

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1646 = 0;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Ltl;")
    public static class59 field1650 = class85.method639("::rebuild", 9588);

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static volatile int field1654 = 0;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "[I")
    public static int[] field1647 = new int[25];

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field1653 = 0;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Lme;")
    public static class295 field1637;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "[[I")
    public static int[][] field1636;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lma;I)Lma;", line = 5)
    public static final class263 method764(class263 arg0, int arg1) {
        field1649++;
        if (~arg0.field4410 != arg1) {
            return class247.method1738(false, arg0.field4410);
        }
        int var2 = arg0.field4392 >>> 16;
        class82 var3 = new class82(class190.field3181);
        for (class297 var4 = (class297) var3.method621(arg1); var4 != null; var4 = (class297) var3.method622(-14)) {
            if (var4.field5089 == var2) {
                return class247.method1738(false, (int) var4.field4932);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V", line = 36)
    public static void method765(int arg0) {
        field1636 = (int[][]) null;
        field1650 = null;
        field1643 = null;
        field1647 = null;
        if (arg0 != 1169286672) {
            field1637 = (class295) null;
        }
        field1637 = null;
        field1644 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)[Loj;", line = 54)
    public static final class260[] method766(byte arg0) {
        field1638++;
        class260[] var1 = new class260[class306.field5183];
        for (int var2 = 0; var2 < class306.field5183; var2++) {
            int var3 = class41.field615[var2] * class236.field3925[var2];
            byte[] var4 = class53.field794[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class284.field4879[class93.method680(var4[var6], 255)];
            }
            if (class55.field815) {
                var1[var2] = new class122(class300.field5123, class165.field2680, class243.field4061[var2], class311.field5274[var2], class41.field615[var2], class236.field3925[var2], var5);
            } else {
                var1[var2] = new class47(class300.field5123, class165.field2680, class243.field4061[var2], class311.field5274[var2], class41.field615[var2], class236.field3925[var2], var5);
            }
        }
        class133.method974((byte) -91);
        if (arg0 != 32) {
            field1637 = (class295) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)[I", line = 97)
    public final int[] method44(boolean arg0, int arg1) {
        field1639++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int var4 = this.field1652 + this.field1652 + 1;
            int var5 = this.field1648 + this.field1648 + 1;
            int var6 = 65536 / var5;
            int[][] var7 = new int[var4][];
            for (int var8 = arg1 - this.field1652; var8 <= this.field1652 + arg1; var8++) {
                int[] var9 = this.method1960(-127, var8 & class132.field2197, 0);
                int[] var10 = new int[class56.field835];
                int var11 = 0;
                for (int var12 = -this.field1648; var12 <= this.field1648; var12++) {
                    var11 += var9[var12 & class310.field5270];
                }
                int var13 = 0;
                while (var13 < class56.field835) {
                    var10[var13] = var6 * var11 >> 16;
                    int var14 = var11 - var9[class310.field5270 & var13 - this.field1648];
                    var13++;
                    var11 = var9[class310.field5270 & var13 + this.field1648] + var14;
                }
                var7[this.field1652 + var8 - arg1] = var10;
            }
            int var15 = 65536 / var4;
            for (int var16 = 0; var16 < class56.field835; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var15 * var17 >> 16;
            }
        }
        return arg0 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLim;)V", line = 184)
    public static final void method767(byte arg0, class175 arg1) {
        field1642++;
        class315 var2 = null;
        try {
            if (arg0 != 50) {
                field1637 = (class295) null;
            }
            class257 var3 = arg1.method1300("runescape", (byte) 102);
            while (var3.field4256 == 0) {
                class183.method1360(false, 1L);
            }
            if (var3.field4256 == 1) {
                var2 = (class315) var3.field4255;
                class170 var4 = class218.method1514(-27411);
                var2.method2170((byte) 125, 0, var4.field2787, var4.field2758);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2169((byte) -111);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILs;)V", line = 234)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 > -125) {
            field1636 = (int[][]) ((int[][]) null);
        }
        if (arg1 == 0) {
            this.field1648 = arg2.method1221(127);
        } else if (arg1 == 1) {
            this.field1652 = arg2.method1221(121);
        } else if (arg1 == 2) {
            this.field4789 = arg2.method1221(114) == 1;
        }
        field1635++;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 292)
    public class101() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)[[I", line = 315)
    public final int[][] method87(int arg0, int arg1) {
        field1640++;
        if (arg0 != -7523) {
            method764((class263) null, 104);
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int var4 = this.field1652 + this.field1652 + 1;
            int var5 = this.field1648 + this.field1648 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field1652; var9 <= (arg1 + this.field1652); var9++) {
                int[][] var10 = this.method1956(0, class132.field2197 & var9, (byte) -112);
                int var11 = 0;
                int var12 = 0;
                int[][] var13 = new int[3][class56.field835];
                int var14 = 0;
                int[] var15 = var10[1];
                int[] var16 = var10[0];
                int[] var17 = var10[2];
                for (int var18 = -this.field1648; var18 <= this.field1648; var18++) {
                    int var19 = class310.field5270 & var18;
                    var11 += var16[var19];
                    var12 += var17[var19];
                    var14 += var15[var19];
                }
                int[] var20 = var13[1];
                int[] var21 = var13[2];
                int[] var22 = var13[0];
                int var23 = 0;
                while (class56.field835 > var23) {
                    var22[var23] = var7 * var11 >> 16;
                    var20[var23] = var7 * var14 >> 16;
                    var21[var23] = var7 * var12 >> 16;
                    int var24 = var23 - this.field1648 & class310.field5270;
                    var23++;
                    int var25 = var12 - var17[var24];
                    int var26 = var11 - var16[var24];
                    int var27 = var14 - var15[var24];
                    int var28 = var23 + this.field1648 & class310.field5270;
                    var12 = var17[var28] + var25;
                    var14 = var15[var28] + var27;
                    var11 = var16[var28] + var26;
                }
                var8[this.field1652 + var9 - arg1] = var13;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class56.field835; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var31[var32] = var6 * var33 >> 16;
                var29[var32] = var6 * var34 >> 16;
                var30[var32] = var6 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)I", line = 448)
    public static final int method768(int arg0, int arg1) {
        if (arg0 != -1701288217) {
            field1636 = (int[][]) ((int[][]) null);
        }
        field1641++;
        return arg1 >>> 7;
    }
}
