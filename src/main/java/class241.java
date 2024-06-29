import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class241 extends class197 {

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    private int field4187 = 1;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    private int field4183 = 1;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field4184 = 0;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "Loh;")
    public static class258 field4185 = class153.method1046("Zugewiesener Speicher)3", 87);

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "[S")
    public static short[] field4186 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field4189 = 0;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "Lkl;")
    public static class65 field4182;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 11)
    public static void method1645(int arg0) {
        field4185 = null;
        if (arg0 != 0) {
            method1646((byte) -16);
        }
        field4186 = null;
        field4182 = null;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(B)Lci;", line = 33)
    public static final class286 method1646(byte arg0) {
        field4191++;
        class286 var1 = (class286) class128.field2267.method1308((byte) -100);
        if (var1 != null) {
            var1.method1054((byte) 93);
            var1.method1298(true);
            return var1;
        }
        if (arg0 != 14) {
            field4184 = -25;
        }
        class286 var2;
        do {
            var2 = (class286) class176.field3167.method1308((byte) -100);
            if (var2 == null) {
                return null;
            }
            if (var2.method2019(0) > class25.method197(-3418)) {
                return null;
            }
            var2.method1054((byte) 103);
            var2.method1298(true);
        } while ((Long.MIN_VALUE & var2.field3397) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[[I", line = 74)
    public final int[][] method101(int arg0, byte arg1) {
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        int var4 = -55 % ((arg1 - 1) / 37);
        field4188++;
        if (this.field3461.field4765) {
            int var5 = this.field4183 + this.field4183 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field4187 + this.field4187 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var7][][];
            for (int var10 = arg0 - this.field4187; var10 <= (arg0 + this.field4187); var10++) {
                int[][] var11 = this.method1322(0, class155.field2662 & var10, 0);
                int var12 = 0;
                int var13 = 0;
                int[][] var14 = new int[3][class190.field3362];
                int[] var15 = var11[0];
                int[] var16 = var11[1];
                int var17 = 0;
                int[] var18 = var11[2];
                for (int var19 = -this.field4183; var19 <= this.field4183; var19++) {
                    int var20 = var19 & class48.field723;
                    var17 += var18[var20];
                    var13 += var16[var20];
                    var12 += var15[var20];
                }
                int[] var21 = var14[0];
                int[] var22 = var14[1];
                int[] var23 = var14[2];
                int var24 = 0;
                while (class190.field3362 > var24) {
                    var21[var24] = var6 * var12 >> 16;
                    var22[var24] = var6 * var13 >> 16;
                    var23[var24] = var6 * var17 >> 16;
                    int var25 = var24 - this.field4183 & class48.field723;
                    int var26 = var17 - var18[var25];
                    var24++;
                    int var27 = var13 - var16[var25];
                    int var28 = var12 - var15[var25];
                    int var29 = this.field4183 + var24 & class48.field723;
                    var12 = var15[var29] + var28;
                    var17 = var18[var29] + var26;
                    var13 = var16[var29] + var27;
                }
                var9[this.field4187 + var10 - arg0] = var14;
            }
            int[] var30 = var3[0];
            int[] var31 = var3[1];
            int[] var32 = var3[2];
            for (int var33 = 0; var33 < class190.field3362; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var7; var37++) {
                    int[][] var38 = var9[var37];
                    var36 += var38[2][var33];
                    var34 += var38[0][var33];
                    var35 += var38[1][var33];
                }
                var30[var33] = var8 * var34 >> 16;
                var31[var33] = var8 * var35 >> 16;
                var32[var33] = var8 * var36 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 203)
    public class241() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILva;I)V", line = 222)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4183 = arg1.method1589(55);
        } else if (arg2 == 1) {
            this.field4187 = arg1.method1589(118);
        } else if (arg2 == 2) {
            this.field3462 = arg1.method1589(68) == 1;
        }
        field4192++;
        if (arg0 != 7955) {
            field4190 = -31;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[I", line = 262)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, 0);
        field4193++;
        if (this.field3456.field5115) {
            int var4 = this.field4187 + this.field4187 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4183 + this.field4183 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field4187; var9 <= (this.field4187 + arg1); var9++) {
                int[] var10 = this.method1327(0, -125, var9 & class155.field2662);
                int[] var11 = new int[class190.field3362];
                int var12 = 0;
                for (int var13 = -this.field4183; var13 <= this.field4183; var13++) {
                    var12 += var10[var13 & class48.field723];
                }
                int var14 = 0;
                while (class190.field3362 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class48.field723 & var14 - this.field4183];
                    var14++;
                    var12 = var10[class48.field723 & this.field4183 + var14] + var15;
                }
                var8[this.field4187 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class190.field3362; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        if (arg0 != -16221) {
            field4190 = 77;
        }
        return var3;
    }
}
