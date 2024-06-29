import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class179 extends class71 {

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    private int field3249 = 1;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    private int field3253 = 1;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Z")
    public static boolean field3242 = false;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "Lud;")
    public static class279 field3252 = class130.method1024(" est d-Bj-9 dans votre liste d(Wamis)3", 255);

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "[Lud;")
    public static class279[] field3250 = new class279[200];

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lom;")
    public static class70 field3241;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)Z", line = 7)
    public static final boolean method1396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class199.field3555 * arg3 + class108.field2006 * arg0 >> 16;
        int var6 = class108.field2006 * arg3 - class199.field3555 * arg0 >> 16;
        int var7 = class29.field684 * arg1 + class204.field3628 * var6 >> 16;
        int var8 = class204.field3628 * arg1 - class29.field684 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class29.field684 * arg2 + class204.field3628 * var6 >> 16;
        int var12 = class204.field3628 * arg2 - class29.field684 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class12.field383 && var13 < class12.field383) {
            return false;
        } else if (var9 > class141.field2568 && var13 > class141.field2568) {
            return false;
        } else if (var10 < class222.field3936 && var14 < class222.field3936) {
            return false;
        } else {
            return var10 <= class16.field518 || var14 <= class16.field518;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)[I", line = 59)
    public final int[] method199(int arg0, byte arg1) {
        field3246++;
        if (arg1 >= -69) {
            field3252 = (class279) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = this.field3253 + this.field3253 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3249 + this.field3249 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg0 - this.field3253; var9 <= this.field3253 + arg0; var9++) {
                int[] var10 = this.method624(class262.field4688 & var9, -3, 0);
                int[] var11 = new int[class215.field3787];
                int var12 = 0;
                for (int var13 = -this.field3249; var13 <= this.field3249; var13++) {
                    var12 += var10[var13 & class309.field5478];
                }
                int var14 = 0;
                while (var14 < class215.field3787) {
                    var11[var14] = var8 * var12 >> 16;
                    int var15 = var12 - var10[class309.field5478 & var14 - this.field3249];
                    var14++;
                    var12 = var10[this.field3249 + var14 & class309.field5478] + var15;
                }
                var7[var9 + this.field3253 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class215.field3787; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V", line = 149)
    public static void method1397(byte arg0) {
        field3252 = null;
        field3250 = null;
        field3241 = null;
        int var1 = 106 % ((-arg0 - 34) / 47);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLgj;)V", line = 161)
    public static final void method1398(byte arg0, class228 arg1) {
        if (arg1.field3978 != null) {
            arg1.field3978.field5589 = 0;
        }
        field3243++;
        arg1.field3981 = false;
        class228 var2 = arg1.method140();
        if (arg0 != -46) {
            method1397((byte) -5);
        }
        while (var2 != null) {
            method1398((byte) -46, var2);
            var2 = arg1.method133();
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 183)
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLvh;)V", line = 202)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method1396(-112, -44, -116, 11, 51);
        }
        field3251++;
        if (arg0 == 0) {
            this.field3249 = arg2.method483(-110);
        } else if (arg0 == 1) {
            this.field3253 = arg2.method483(-107);
        } else if (arg0 == 2) {
            this.field1389 = arg2.method483(-110) == 1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[[I", line = 255)
    public final int[][] method86(int arg0, int arg1) {
        field3248++;
        int var3 = 0 % ((-arg1 - 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) 84, arg0);
        if (this.field1400.field4363) {
            int var5 = this.field3249 + this.field3249 + 1;
            int var6 = this.field3253 + this.field3253 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var6][][];
            int var9 = 65536 / var5;
            for (int var10 = arg0 - this.field3253; var10 <= this.field3253 + arg0; var10++) {
                int[][] var11 = this.method619(0, 2, class262.field4688 & var10);
                int[][] var12 = new int[3][class215.field3787];
                int var13 = 0;
                int[] var14 = var11[0];
                int var15 = 0;
                int[] var16 = var11[1];
                int var17 = 0;
                int[] var18 = var11[2];
                for (int var19 = -this.field3249; var19 <= this.field3249; var19++) {
                    int var20 = class309.field5478 & var19;
                    var13 += var16[var20];
                    var17 += var18[var20];
                    var15 += var14[var20];
                }
                int[] var21 = var12[0];
                int[] var22 = var12[2];
                int[] var23 = var12[1];
                int var24 = 0;
                while (class215.field3787 > var24) {
                    var21[var24] = var9 * var15 >> 16;
                    var23[var24] = var9 * var13 >> 16;
                    var22[var24] = var9 * var17 >> 16;
                    int var25 = var24 - this.field3249 & class309.field5478;
                    int var26 = var17 - var18[var25];
                    int var27 = var15 - var14[var25];
                    var24++;
                    int var28 = var13 - var16[var25];
                    int var29 = class309.field5478 & this.field3249 + var24;
                    var17 = var18[var29] + var26;
                    var13 = var16[var29] + var28;
                    var15 = var14[var29] + var27;
                }
                var8[this.field3253 + var10 - arg0] = var12;
            }
            int[] var30 = var4[0];
            int[] var31 = var4[2];
            int[] var32 = var4[1];
            for (int var33 = 0; var33 < class215.field3787; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var6; var37++) {
                    int[][] var38 = var8[var37];
                    var35 += var38[1][var33];
                    var36 += var38[2][var33];
                    var34 += var38[0][var33];
                }
                var30[var33] = var7 * var34 >> 16;
                var32[var33] = var7 * var35 >> 16;
                var31[var33] = var7 * var36 >> 16;
            }
        }
        return var4;
    }
}
