import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class56 {

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lqfa;")
    public static class98 field46 = new class98(79, 2);

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "J")
    public static long field49;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lvs;")
    public static class591 field50;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field47;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            field50 = null;
        }
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 0, arg0);
            int[] var5 = this.method367(4463, 1, arg0);
            int[] var6 = this.method367(4463, 2, arg0);
            for (int var7 = 0; ~var7 > ~class328.field4576; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field51;
        if (~arg2 == -1) {
            super.field674 = ~arg1.method3750((byte) 35) == -2;
        }
        if (arg0 != 3731) {
            field46 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method25(int arg0, String arg1) {
        ++field48;
        if (class436.field6191.startsWith("win")) {
            return arg1 + ".dll";
        } else if (!class436.field6191.startsWith("linux")) {
            if (class436.field6191.startsWith("mac")) {
                return "lib" + arg1 + ".dylib";
            } else {
                return arg0 != 4096 ? null : null;
            }
        } else {
            return "lib" + arg1 + ".so";
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public static void method26(byte arg0) {
        field50 = null;
        if (arg0 == 35) {
            field46 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class5() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(III)Z")
    public static final boolean method27(int arg0, int arg1, int arg2) {
        ++field45;
        if (arg2 > -3) {
            method25(12, (String) null);
        }
        return class755.method4200(33, arg0, arg1) | ~(458752 & arg0) != -1 || class757.method4207((byte) 115, arg1, arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[[I")
    public final int[][] method5(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method5(-67, 4);
        }
        ++field53;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[] var4 = this.method367(4463, 2, arg0);
            int[][] var5 = this.method369(arg0, arg1 ^ -39, 0);
            int[][] var6 = this.method369(arg0, 127, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class328.field4576 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field52;
        class592 var5 = class682.method3825(-652872096, 10, arg2);
        var5.method3351(0);
        var5.field8341 = arg1;
        var5.field8337 = arg4;
        var5.field8343 = arg3;
        if (arg0 != -818245748) {
            field50 = null;
        }
    }
}
