import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class173 extends class71 {

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    private int field3117 = 4;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    private int field3124 = 4;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field3121 = 0;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "Lhc;")
    public static class171 field3125 = new class171(50);

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "Lud;")
    public static class279 field3126 = class130.method1024("Hidden)2use", 255);

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V", line = 6)
    public static final void method1345(int arg0) {
        class85.method733(false, arg0 - 3);
        field3115++;
        System.gc();
        if (arg0 != 2) {
            field3121 = -53;
        }
        class172.method1343(25, -29401);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIB)V", line = 20)
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 0;
        class152.method1208(arg1 - arg3, arg2, arg1 + arg3, class182.field3348[arg0], -7);
        field3122++;
        if (arg4 <= 94) {
            return;
        }
        int var6 = -arg3;
        int var7 = -1;
        int var8 = arg3;
        while (var8 > var5) {
            var7 += 2;
            var5++;
            var6 += var7;
            if (var6 >= 0) {
                var8--;
                var6 -= var8 << 1;
                int[] var9 = class182.field3348[arg0 + var8];
                int var10 = arg1 - var5;
                int var11 = arg1 + var5;
                int[] var12 = class182.field3348[arg0 - var8];
                class152.method1208(var10, arg2, var11, var9, -7);
                class152.method1208(var10, arg2, var11, var12, -7);
            }
            int var13 = arg1 + var8;
            int var14 = arg1 - var8;
            int[] var15 = class182.field3348[arg0 - var5];
            int[] var16 = class182.field3348[arg0 + var5];
            class152.method1208(var14, arg2, var13, var16, -7);
            class152.method1208(var14, arg2, var13, var15, -7);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZLvh;)V", line = 77)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            field3114 = 71;
        }
        if (arg0 == 0) {
            this.field3124 = arg2.method483(-106);
        } else if (arg0 == 1) {
            this.field3117 = arg2.method483(-109);
        }
        field3118++;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)V", line = 117)
    public static void method1347(byte arg0) {
        int var1 = -104 % ((20 - arg0) / 57);
        field3126 = null;
        field3125 = null;
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(B)V", line = 126)
    public static final void method1348(byte arg0) {
        class283.field5052.method1338((byte) -118);
        if (arg0 != -75) {
            method1349(60, -114, 68, 78, -55);
        }
        field3116++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 140)
    public static final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3120++;
        if (class249.field4449 <= arg3 && arg3 <= class44.field929) {
            int var5 = class125.method1001(arg1, class108.field2002, false, class135.field2463);
            int var6 = class125.method1001(arg2, class108.field2002, false, class135.field2463);
            class7.method44(83, arg4, var5, var6, arg3);
        }
        if (arg0 != 4) {
            method1349(-37, -36, 85, -59, 90);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IB)[I", line = 161)
    public final int[] method199(int arg0, byte arg1) {
        field3113++;
        if (arg1 > -69) {
            this.method199(91, (byte) -68);
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = class215.field3787 / this.field3124;
            int var5 = class324.field5667 / this.field3117;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method624(class324.field5667 * var6 / var5, -3, 0);
            } else {
                var7 = this.method624(0, -3, 0);
            }
            for (int var8 = 0; var8 < class215.field3787; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class215.field3787 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 305)
    public class173() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[[I", line = 228)
    public final int[][] method86(int arg0, int arg1) {
        field3123++;
        int var3 = -22 / ((-arg1 - 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) 102, arg0);
        if (this.field1400.field4363) {
            int var5 = class215.field3787 / this.field3124;
            int var6 = class324.field5667 / this.field3117;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method619(0, 2, class324.field5667 * var7 / var6);
            } else {
                var8 = this.method619(0, 2, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class215.field3787; var15++) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class215.field3787 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var4;
    }
}
