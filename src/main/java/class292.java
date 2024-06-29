import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class292 extends class436 {

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "[I")
    private int[] field3712 = new int[this.field6226];

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Ljk;")
    public static class449 field3717 = new class449(64);

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
    public static boolean field3723 = false;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    private int field3724;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "[B")
    private byte[] field3714;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIF)V")
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field6226 > var7; ++var7) {
            this.field3712[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public static void method1710(int arg0) {
        if (arg0 != 4095) {
            method1714(75, (byte) -52, (byte[]) null, -119, -124, 119, -48, -84, (byte[]) null);
        }
        field3717 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public final void method1711(boolean arg0) {
        this.field3720 = Math.abs(this.field3720);
        ++field3721;
        if (!arg0) {
            this.field3714 = null;
        }
        if (this.field3720 >= 4096) {
            this.field3720 = 4095;
        }
        this.method1715(this.field3724++, (byte) (this.field3720 >> 4), (byte) 45);
        this.field3720 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1712(byte arg0) {
        ++field3722;
        int var1 = -97 % ((3 - arg0) / 49);
        class466.field6728 = new class212[50];
        class189.field2475 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method1713(int arg0) {
        this.field3724 = 0;
        if (arg0 != -32685) {
            this.field3714 = null;
        }
        this.field3720 = 0;
        ++field3718;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB[BIIIII[B)V")
    public static final void method1714(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field3719;
        int var9 = -(arg7 >> 2);
        int var10 = -46 / ((38 - arg1) / 44);
        int var11 = -(3 & arg7);
        for (int var12 = -arg0; ~var12 > -1; ++var12) {
            int var10001;
            for (int var13 = var9; ~var13 > -1; ++var13) {
                var10001 = arg3++;
                arg2[var10001] += arg8[arg4++];
                int var15 = arg3++;
                arg2[var15] += arg8[arg4++];
                int var16 = arg3++;
                arg2[var16] += arg8[arg4++];
                int var17 = arg3++;
                arg2[var17] += arg8[arg4++];
            }
            for (int var14 = var11; ~var14 > -1; ++var14) {
                var10001 = arg3++;
                arg2[var10001] += arg8[arg4++];
            }
            arg3 += arg6;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBB)V")
    public void method1715(int arg0, byte arg1, byte arg2) {
        this.field3714[this.field3724++] = (byte) (127 + class378.method2145(arg1 >> 1, 127));
        if (arg2 != 45) {
            field3717 = null;
        }
        ++field3715;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
    public final void method1716(int arg0, int arg1, byte arg2) {
        if (arg2 != 41) {
            method1714(65, (byte) 66, (byte[]) null, -18, -91, -40, 13, -29, (byte[]) null);
        }
        ++field3713;
        this.field3720 += this.field3712[arg1] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)Z")
    public static final boolean method1717(boolean arg0) {
        ++field3716;
        if (arg0) {
            field3723 = true;
        }
        return class324.field4107 != class218.field2784 || class322.field4086 >= 2;
    }
}
