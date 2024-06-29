import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    private int[] field5;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    private int[] field9;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lc;")
    private class23 field2;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lc;")
    private class23 field6;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[Lc;")
    private class23[] field3;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lbb;")
    public static class14 field4 = new class14(64);

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lbb;")
    public static class14 field10 = new class14(64);

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ldc;")
    public static class37 field12 = class185.method1233((byte) 86, "scrollen:");

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Ldc;")
    public static class37 field11 = class185.method1233((byte) 86, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method23(int arg0) {
        int var1 = 117 % ((arg0 + 51) / 37);
        field11 = null;
        field10 = null;
        field4 = null;
        field12 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lcj;Lwa;I)Z")
    public final boolean method24(class33 arg0, class238 arg1, int arg2) {
        field7++;
        for (int var4 = arg2; var4 < this.field9.length; var4++) {
            if (!arg1.method1551(-13114, this.field9[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field5.length; var5++) {
            if (!arg0.method271(this.field5[var5], 105)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZILwa;IZLcj;BD)[I")
    public final int[] method25(boolean arg0, int arg1, class238 arg2, int arg3, boolean arg4, class33 arg5, byte arg6, double arg7) {
        field8++;
        int[] var10 = new int[arg1 * arg3];
        class138.method965((byte) -108, arg7);
        class118.field2121 = arg2;
        class88.field1538 = arg5;
        class23.method166(4096, arg3, arg1);
        for (int var11 = 0; var11 < this.field3.length; var11++) {
            this.field3[var11].method157(arg1, arg3, -21809);
        }
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var12 = arg3 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = 1;
            var14 = arg3;
            var12 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2.field407) {
                int[] var22 = this.field2.method57(0, var16);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2.method36(var16, (byte) 9);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var21[var23] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class196.field3670[var24];
                int var28 = class196.field3670[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class196.field3670[var26];
                var10[var15++] = (var27 << 16) + (var29 << 8) + var28;
                if (arg4) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3.length; var17++) {
            this.field3[var17].method158(-1339);
        }
        if (arg6 >= -94) {
            field4 = null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class197.field3689 * arg0 + class124.field2215 * arg3 >> 16;
        int var6 = class197.field3689 * arg3 - class124.field2215 * arg0 >> 16;
        int var7 = class59.field1098 * arg1 + class38.field793 * var6 >> 16;
        int var8 = class38.field793 * arg1 - class59.field1098 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class59.field1098 * arg2 + class38.field793 * var6 >> 16;
        int var12 = class38.field793 * arg2 - class59.field1098 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class105.field1827 && var13 < class105.field1827) {
            return false;
        } else if (var9 > class52.field1043 && var13 > class52.field1043) {
            return false;
        } else if (var10 < class228.field4195 && var14 < class228.field4195) {
            return false;
        } else {
            return var10 <= class41.field857 || var14 <= class41.field857;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        this.field5 = new int[0];
        this.field9 = new int[0];
        this.field2 = new class113();
        this.field2.field408 = 1;
        this.field6 = new class113();
        this.field6.field408 = 1;
        this.field3 = new class23[] { this.field2, this.field6 };
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lce;)V")
    public class2(class28 arg0) {
        int var2 = arg0.method215(-1797813752);
        int var3 = 0;
        this.field3 = new class23[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class23 var16 = class211.method1403((byte) -114, arg0);
            if (var16.method163(120) >= 0) {
                var3++;
            }
            if (var16.method165((byte) 15) >= 0) {
                var4++;
            }
            int var17 = var16.field410.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method215(-1797813752);
            }
            this.field3[var6] = var16;
        }
        this.field9 = new int[var3];
        int var7 = 0;
        this.field5 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class23 var11 = this.field3[var9];
            int var12 = var11.field410.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field410[var13] = this.field3[var5[var9][var13]];
            }
            int var14 = var11.method163(-117);
            int var15 = var11.method165((byte) 15);
            if (var14 > 0) {
                this.field9[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field2 = this.field3[arg0.method215(-1797813752)];
        this.field6 = this.field3[arg0.method215(-1797813752)];
    }
}
