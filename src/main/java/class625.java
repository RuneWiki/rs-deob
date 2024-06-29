import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class625 extends class642 {

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "[I")
    private int[] field9037 = new int[3];

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    private int field9039 = 4096;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
    private int field9035 = 3216;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "I")
    private int field9045 = 3216;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "Ldc;")
    public static class302 field9038 = new class302();

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "Lmh;")
    public static class139 field9042 = new class139(5, 1);

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "Z")
    public static boolean field9043 = false;

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "Lvg;")
    public static class622 field9046 = new class622(1, -1);

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "[S")
    private static short[] field9047 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hu", name = "T", descriptor = "[S")
    private static short[] field9050 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hu", name = "S", descriptor = "[S")
    private static short[] field9049 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "[[S")
    public static short[][] field9048 = new short[][] { field9047, field9049, field9050 };

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)I")
    public static final int method3594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -60 % ((-2 - arg2) / 60);
        ++field9041;
        int var6 = -class271.field3544[arg3 * 8192 / arg0] + 65536 >> 1;
        return ((65536 - var6) * arg4 >> 16) + (arg1 * var6 >> 16);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 <= 29) {
            this.method1(48, (class540) null, (byte) 66);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field9035 = arg1.method3169(26488);
                }
            } else {
                this.field9045 = arg1.method3169(26488);
            }
        } else {
            this.field9039 = arg1.method3169(26488);
        }
        ++field9044;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field9040;
        int[] var3 = super.field9216.method1185(arg0, -110);
        if (arg1 != -9) {
            method3596(-29);
        }
        if (super.field9216.field2418) {
            int var4 = class645.field9292 * this.field9039 >> 12;
            int[] var5 = this.method3658((byte) 113, arg0 + -1 & class553.field8133, 0);
            int[] var6 = this.method3658((byte) 115, arg0, 0);
            int[] var7 = this.method3658((byte) 109, class553.field8133 & arg0 - -1, 0);
            for (int var8 = 0; ~class338.field4909 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class412.field6121] + -var6[var8 + 1 & class412.field6121]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class365.field5344[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field9037[0] * var14 >> 12;
                int var18 = this.field9037[2] * var16 >> 12;
                int var19 = this.field9037[1] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field9034;
        this.method3595((byte) 46);
        if (arg0 != 6276) {
            this.field9045 = 8;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
    public class625() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
    private final void method3595(byte arg0) {
        ++field9036;
        double var2 = Math.cos((double) ((float) this.field9035 / 4096.0F));
        this.field9037[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field9045 / 4096.0F)));
        this.field9037[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field9045 / 4096.0F)));
        this.field9037[2] = (int) (4096.0D * Math.sin((double) ((float) this.field9035 / 4096.0F)));
        int var4 = this.field9037[0] * this.field9037[0] >> 12;
        if (arg0 == 46) {
            int var5 = this.field9037[1] * this.field9037[1] >> 12;
            int var6 = this.field9037[2] * this.field9037[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
            if (var7 != 0) {
                this.field9037[2] = (this.field9037[2] << 12) / var7;
                this.field9037[0] = (this.field9037[0] << 12) / var7;
                this.field9037[1] = (this.field9037[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)V")
    public static void method3596(int arg0) {
        field9047 = null;
        field9042 = null;
        if (arg0 != 4096) {
            field9042 = null;
        }
        field9038 = null;
        field9050 = null;
        field9046 = null;
        field9048 = null;
        field9049 = null;
    }
}
