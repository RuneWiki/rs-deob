import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class75 extends class634 {

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    private int field785 = 0;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    private int field780 = 0;

    @OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!aw", name = "T", descriptor = "[Lefa;")
    public static class183[] field792 = new class183[2048];

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "Ldh;")
    public static class320 field786 = new class320(61, -1);

    @OriginalMember(owner = "client!aw", name = "X", descriptor = "I")
    public static int field796 = -1;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!aw", name = "Y", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "Ljba;")
    public static class398 field782;

    @OriginalMember(owner = "client!aw", name = "Z", descriptor = "[I")
    public static int[] field798;

    @OriginalMember(owner = "client!aw", name = "W", descriptor = "[Lpc;")
    public static class668[] field795;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 3)
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V", line = 17)
    public static void method540(int arg0) {
        field795 = null;
        field798 = null;
        field782 = null;
        field786 = null;
        field792 = null;
        if (arg0 != -13276) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)[[I", line = 38)
    public final int[][] method7(byte arg0, int arg1) {
        ++field781;
        int[][] var3 = super.field9126.method132(0, arg1);
        int var4 = -45 % ((-56 - arg0) / 53);
        if (super.field9126.field295) {
            int[][] var5 = this.method3642(0, arg1, true);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class635.field9139 > var12; ++var12) {
                this.method541(var8[var12], var7[var12], -67, var6[var12]);
                this.field787 += this.field780;
                this.field784 += this.field791;
                this.field788 += this.field785;
                while (~this.field787 > -1) {
                    this.field787 += 4096;
                }
                while (~this.field787 < -4097) {
                    this.field787 -= 4096;
                }
                if (~this.field788 > -1) {
                    this.field788 = 0;
                }
                if (~this.field788 < -4097) {
                    this.field788 = 4096;
                }
                if (~this.field784 > -1) {
                    this.field784 = 0;
                }
                if (this.field784 > 4096) {
                    this.field784 = 4096;
                }
                this.method542(this.field787, this.field788, (byte) -84, this.field784);
                var9[var12] = this.field783;
                var10[var12] = this.field793;
                var11[var12] = this.field790;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILig;Z)V", line = 113)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field797;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field791 = (arg1.method1448((byte) -92) << 12) / 100;
                }
            } else {
                this.field785 = (arg1.method1448((byte) -121) << 12) / 100;
            }
        } else {
            this.field780 = arg1.method1466((byte) 31);
        }
        if (arg2) {
            this.method541(-15, 79, -69, -12);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)V", line = 162)
    private final void method541(int arg0, int arg1, int arg2, int arg3) {
        ++field794;
        if (arg2 > -52) {
            this.method3(-1, (class244) null, false);
        }
        int var5 = arg3 > arg1 ? arg3 : arg1;
        int var6 = ~arg0 >= ~var5 ? var5 : arg0;
        int var7 = ~arg1 < ~arg3 ? arg3 : arg1;
        int var8 = arg0 >= var7 ? var7 : arg0;
        this.field784 = (var8 - -var6) / 2;
        int var9 = -var8 + var6;
        if (~this.field784 < -1 && ~this.field784 > -4097) {
            this.field788 = (var9 << 12) / (~this.field784 >= -2049 ? this.field784 * 2 : -(this.field784 * 2) + 8192);
        } else {
            this.field788 = 0;
        }
        if (~var9 >= -1) {
            this.field787 = 0;
        } else {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (arg3 != var6) {
                if (~arg1 == ~var6) {
                    this.field787 = ~arg0 == ~var8 ? var10 + 4096 : 12288 - var12;
                } else {
                    this.field787 = arg3 != var8 ? -var10 + 20480 : var11 + 12288;
                }
            } else {
                this.field787 = ~arg1 == ~var8 ? var12 + 20480 : 4096 - var11;
            }
            this.field787 /= 6;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIBI)V", line = 228)
    private final void method542(int arg0, int arg1, byte arg2, int arg3) {
        ++field789;
        int var5 = arg3 <= 2048 ? (arg1 + 4096) * arg3 >> 12 : arg3 - ((arg1 * arg3 >> 12) + -arg1);
        if (arg2 > -77) {
            this.method542(-110, 115, (byte) 119, 115);
        }
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field793 = var14;
                this.field790 = var7;
                this.field783 = var5;
                return;
            }
            if (var9 == 1) {
                this.field790 = var7;
                this.field793 = var5;
                this.field783 = var15;
                return;
            }
            if (~var9 == -3) {
                this.field790 = var14;
                this.field793 = var5;
                this.field783 = var7;
                return;
            }
            if (~var9 == -4) {
                this.field783 = var7;
                this.field793 = var15;
                this.field790 = var5;
                return;
            }
            if (var9 == 4) {
                this.field783 = var14;
                this.field793 = var7;
                this.field790 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field783 = var5;
                this.field790 = var15;
                this.field793 = var7;
                return;
            }
        } else {
            this.field783 = this.field793 = this.field790 = arg3;
        }
    }
}
