import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class66 {

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
    private int[] field1122;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
    private int[] field1111;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lj;")
    private class117 field1118;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lj;")
    private class117 field1112;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[Lj;")
    private class117[] field1121;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field1120 = 50;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    public static int[] field1109 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field1115 = 0;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[Lhh;")
    public static class163[] field1114 = new class163[field1120];

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[I")
    public static int[] field1116 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[I")
    public static int[] field1123 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
    public static int[] field1110 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lhh;")
    private static class163 field1124 = class137.method1065("wave:", 17);

    @OriginalMember(owner = "client!t", name = "t", descriptor = "[I")
    public static int[] field1127 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lhh;")
    public static class163 field1119 = field1124;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[I")
    public static int[] field1128 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lhh;")
    public static class163 field1113 = field1124;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "[I")
    public static int[] field1129 = new int[field1120];

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lhh;")
    public static class163 field1130 = class137.method1065("AUS", 17);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lpa;")
    public static class123 field1125;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLpa;ZLmf;DIII)[I")
    public final int[] method457(boolean arg0, class123 arg1, boolean arg2, class83 arg3, double arg4, int arg5, int arg6, int arg7) {
        int[] var10 = new int[arg5 * arg7];
        class130.method1030(arg4, false);
        field1108++;
        class157.field2917 = arg1;
        class235.field4207 = arg3;
        class19.method136((byte) -49, arg5, arg7);
        for (int var11 = 0; var11 < this.field1121.length; var11++) {
            this.field1121[var11].method935(arg5, arg7, (byte) 26);
        }
        if (arg6 >= -119) {
            method458(-89);
        }
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var13 = arg7 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg7;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1118.field2208) {
                int[] var18 = this.field1118.method61(-21393, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1118.method90(var16, true);
                var20 = var22[0];
                var19 = var22[1];
                var21 = var22[2];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class175.field3181[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class175.field3181[var25];
                int var28 = var21[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class175.field3181[var28];
                var10[var15++] = (var27 << 8) + ((var26 << 16) + var29);
                if (arg0) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1121.length; var17++) {
            this.field1121[var17].method86(0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        field1123 = null;
        field1110 = null;
        field1116 = null;
        field1129 = null;
        field1113 = null;
        field1128 = null;
        if (arg0 != -1746) {
            return;
        }
        field1124 = null;
        field1109 = null;
        field1119 = null;
        field1127 = null;
        field1114 = null;
        field1125 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lmf;Lpa;I)Z")
    public final boolean method459(class83 arg0, class123 arg1, int arg2) {
        field1126++;
        for (int var4 = 0; var4 < this.field1122.length; var4++) {
            if (!arg1.method970(this.field1122[var4], 0)) {
                return false;
            }
        }
        if (arg2 <= 28) {
            return false;
        }
        for (int var5 = 0; var5 < this.field1111.length; var5++) {
            if (!arg0.method671(false, this.field1111[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class66() {
        this.field1122 = new int[0];
        this.field1111 = new int[0];
        this.field1118 = new class248();
        this.field1118.field2237 = 1;
        this.field1112 = new class248();
        this.field1112.field2237 = 1;
        this.field1121 = new class117[] { this.field1118, this.field1112 };
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lpg;)V")
    public class66(class81 arg0) {
        int var2 = arg0.method622(true);
        this.field1121 = new class117[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class117 var16 = class260.method1759(arg0, 16864);
            if (var16.method88((byte) -106) >= 0) {
                var3++;
            }
            if (var16.method934(-24687) >= 0) {
                var5++;
            }
            int var17 = var16.field2236.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method622(true);
            }
            this.field1121[var6] = var16;
        }
        this.field1111 = new int[var5];
        this.field1122 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class117 var11 = this.field1121[var9];
            int var12 = var11.field2236.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2236[var13] = this.field1121[var4[var9][var13]];
            }
            int var14 = var11.method88((byte) -98);
            int var15 = var11.method934(-24687);
            if (var14 > 0) {
                this.field1122[var8++] = var14;
            }
            if (var15 > 0) {
                this.field1111[var7++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field1118 = this.field1121[arg0.method622(true)];
        this.field1112 = this.field1121[arg0.method622(true)];
    }
}
