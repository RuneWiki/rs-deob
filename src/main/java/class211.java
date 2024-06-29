import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class211 extends class95 {

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "[I")
    private final int[] field3603 = new int[this.field1634];

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lkh;")
    public static class13 field3594 = new class13(64);

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field3600 = 1;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "[B")
    private byte[] field3596;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1510(boolean arg0) {
        field3594 = null;
        if (arg0) {
            field3600 = -31;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V", line = 14)
    public void method844(int arg0, byte arg1) {
        field3595++;
        this.field3596[this.field3593++] = (byte) (class154.method1134(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lsi;", line = 22)
    public static final class304 method1511(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class304 var4 = var3.field4184;
            var3.field4184 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[[II[[F[IILaa;ILaj;[[F[[F)V", line = 34)
    public static final void method1512(int arg0, int[][] arg1, int arg2, float[][] arg3, int[] arg4, int arg5, class8 arg6, int arg7, class1 arg8, float[][] arg9, float[][] arg10) {
        if (arg5 != 1) {
            return;
        }
        int[] var11 = new int[arg4.length / 2];
        field3599++;
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg4[var12 + var12];
            int var14 = arg4[var12 + var12 + 1];
            if (arg2 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg2 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg2 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg0][arg7];
                var18 = arg3[arg0][arg7];
                var19 = arg10[arg0][arg7];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg10[arg0 + 1][arg7];
                var17 = arg9[arg0 + 1][arg7];
                var18 = arg3[arg0 + 1][arg7];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg3[arg0 + 1][arg7 + 1];
                var19 = arg10[arg0 + 1][arg7 + 1];
                var17 = arg9[arg0 + 1][arg7 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg3[arg0][arg7 + 1];
                var19 = arg10[arg0][arg7 + 1];
                var17 = arg9[arg0][arg7 + 1];
            } else {
                float var20 = arg3[arg0][arg7];
                float var21 = arg9[arg0][arg7];
                float var22 = (float) var13 / 128.0F;
                float var23 = (arg9[arg0 + 1][arg7] - var21) * var22 + var21;
                float var24 = (arg3[arg0 + 1][arg7] - var20) * var22 + var20;
                float var25 = arg10[arg0][arg7];
                float var26 = (float) var14 / 128.0F;
                float var27 = arg10[arg0][arg7 + 1];
                float var28 = (arg10[arg0 + 1][arg7 + 1] - var27) * var22 + var27;
                float var29 = (arg10[arg0 + 1][arg7] - var25) * var22 + var25;
                var19 = (var28 - var29) * var26 + var29;
                float var30 = arg3[arg0][arg7 + 1];
                float var31 = (arg3[arg0 + 1][arg7 + 1] - var30) * var22 + var30;
                float var32 = arg9[arg0][arg7 + 1];
                var18 = (var31 - var24) * var26 + var24;
                float var33 = (arg9[arg0 + 1][arg7 + 1] - var32) * var22 + var32;
                var17 = (var33 - var23) * var26 + var23;
            }
            int var34 = (arg0 << 7) + var13;
            int var35 = class5.method30(var14, arg0, (byte) -100, var13, arg7, arg1);
            int var36 = (arg7 << 7) + var14;
            var11[var12] = arg6.method46(arg8, var34, var35, var36, var19, var18, var17);
        }
        arg6.method42(var11);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 155)
    public final void method740(int arg0) {
        field3604++;
        this.field3593 = 0;
        this.field3602 = 0;
        if (arg0 >= -6) {
            field3594 = (class13) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)V", line = 191)
    public final void method743(int arg0, int arg1, byte arg2) {
        this.field3602 += this.field3603[arg1] * arg0 >> 12;
        field3597++;
        int var4 = -46 / ((-arg2 - 47) / 41);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIF)V", line = 213)
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1634; var7++) {
            this.field3603[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 234)
    public final void method741(byte arg0) {
        field3598++;
        if (arg0 != -119) {
            this.method844(-23, (byte) -29);
        }
        this.field3602 = Math.abs(this.field3602);
        if (this.field3602 >= 4096) {
            this.field3602 = 4095;
        }
        this.method844(this.field3593++, (byte) (this.field3602 >> 4));
        this.field3602 = 0;
    }
}
