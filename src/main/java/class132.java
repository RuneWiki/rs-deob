import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class132 extends class59 {

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Z")
    public static boolean field2145 = false;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Lph;")
    private static class229 field2146 = class266.method1858("skill: ", 0);

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "Lph;")
    public static class229 field2151 = field2146;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Z")
    public static boolean field2149 = false;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[[Lqj;")
    public static class264[][] field2142;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)[Lcl;", line = 4)
    public static final class32[] method938(int arg0) {
        if (arg0 > -26) {
            field2148 = -45;
        }
        class32[] var1 = new class32[class301.field4993];
        for (int var2 = 0; var2 < class301.field4993; var2++) {
            var1[var2] = new class32(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], class279.field4623[var2], class314.field5346);
        }
        field2152++;
        class214.method1517(-25672);
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BILhb;)V", line = 27)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field2144++;
        if (arg0 != 115) {
            method939(39, (byte) -123);
        }
        if (arg1 == 0) {
            this.field841 = arg2.method1178(8) == 1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)Z", line = 40)
    public static final boolean method939(int arg0, byte arg1) {
        if (arg1 != 103) {
            method939(55, (byte) 35);
        }
        field2143++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 68)
    public static final void method940(byte arg0) {
        class235.field3871 = null;
        class321.field5442 = null;
        class16.field190 = (byte[][][]) null;
        class326.field5570 = null;
        class12.field166 = (byte[][][]) null;
        class177.field2925 = (byte[][][]) null;
        class205.field3377 = null;
        field2141++;
        class304.field5084 = (byte[][][]) null;
        class1.field10 = (int[][][]) null;
        class126.field2104 = (byte[][][]) null;
        class114.field1938 = null;
        if (arg0 != 45) {
            field2146 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[I", line = 91)
    public final int[] method63(boolean arg0, int arg1) {
        field2147++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) -115);
            int[] var5 = this.method394(arg1, 1, (byte) 121);
            int[] var6 = this.method394(arg1, 2, (byte) -100);
            for (int var7 = 0; var7 < class293.field4789; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "(I)V", line = 153)
    public static void method941(int arg0) {
        field2142 = (class264[][]) null;
        if (arg0 == 4096) {
            field2146 = null;
            field2151 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 164)
    public class132() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[[I", line = 189)
    public final int[][] method116(int arg0, int arg1) {
        field2140++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (arg1 != 4588) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field838.field4334) {
            int[] var4 = this.method394(arg0, 2, (byte) 115);
            int[][] var5 = this.method397(1, 0, arg0);
            int[][] var6 = this.method397(1, 1, arg0);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class293.field4789; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var7[var16] = var13[var16];
                } else if (var17 == 0) {
                    var9[var16] = var12[var16];
                    var8[var16] = var14[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var9[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }
}
