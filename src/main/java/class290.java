import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class290 extends class192 {

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    private int field3745 = 4096;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    private int field3750 = 3216;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "[I")
    private int[] field3748 = new int[3];

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    private int field3753 = 3216;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "Z")
    public static boolean field3749 = false;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "[I")
    public static int[] field3747 = new int[8];

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Lra;")
    public static class361 field3744 = new class361(5, 6);

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "Law;")
    public static class506 field3752;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 4)
    public class290() {
        super(1, true);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBIIII)Lkn;", line = 9)
    public static final class307 method1724(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3755;
        long var7 = (long) arg5 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg1 * 67481L ^ (long) arg0 * 97549L ^ (long) arg4 * 475427L ^ (long) arg6 * 76724863L;
        class307 var9 = (class307) class138.field1810.method3655(-119, var7);
        if (var9 != null) {
            return var9;
        } else {
            int var10 = 27 % ((arg2 - 80) / 45);
            class307 var11 = class408.field5286.method383(arg1, arg0, arg4, arg3, arg5, arg6);
            class138.field1810.method3650(var7, -117, var11);
            return var11;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 29)
    public static void method1725(int arg0) {
        field3747 = null;
        field3752 = null;
        if (arg0 != 6149) {
            method1725(-101);
        }
        field3744 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILfd;I)V", line = 41)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field3754;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3753 = arg1.method2393(-30727);
                }
            } else {
                this.field3750 = arg1.method2393(arg2 ^ 22393);
            }
        } else {
            this.field3745 = arg1.method2393(-30727);
        }
        if (arg2 != -12160) {
            this.method118(81, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V", line = 86)
    public final void method618(byte arg0) {
        if (arg0 != 63) {
            this.method109(-64, (class418) null, -44);
        }
        ++field3746;
        this.method1726(0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)[I", line = 101)
    public final int[] method118(int arg0, byte arg1) {
        ++field3756;
        if (arg1 >= -123) {
            field3749 = true;
        }
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int var4 = class701.field9798 * this.field3745 >> 12;
            int[] var5 = this.method1253(0, arg0 - 1 & class95.field1247, 0);
            int[] var6 = this.method1253(0, arg0, 0);
            int[] var7 = this.method1253(0, class95.field1247 & arg0 + 1, 0);
            for (int var8 = 0; ~var8 > ~class561.field7319; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class337.field4356] - var6[var8 + 1 & class337.field4356]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class234.field3133[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3748[1] * var16 >> 12;
                int var18 = this.field3748[0] * var14 >> 12;
                int var19 = this.field3748[2] * var15 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V", line = 199)
    private final void method1726(int arg0) {
        ++field3751;
        double var2 = Math.cos((double) ((float) this.field3753 / 4096.0F));
        this.field3748[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3750 / 4096.0F)) * var2);
        this.field3748[1] = (int) (4096.0D * Math.cos((double) ((float) this.field3750 / 4096.0F)) * var2);
        this.field3748[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3753 / 4096.0F)));
        int var4 = this.field3748[arg0] * this.field3748[0] >> 12;
        int var5 = this.field3748[1] * this.field3748[1] >> 12;
        int var6 = this.field3748[2] * this.field3748[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 - -var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field3748[1] = (this.field3748[1] << 12) / var7;
            this.field3748[2] = (this.field3748[2] << 12) / var7;
            this.field3748[0] = (this.field3748[0] << 12) / var7;
        }
    }
}
