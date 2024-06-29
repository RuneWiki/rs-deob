import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class528 extends class45 {

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    private int field7785 = 4096;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    private int field7789 = 4096;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    private int field7791 = 4096;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "[I")
    public static int[] field7783 = new int[16384];

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "Z")
    public static boolean field7788 = false;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "[I")
    public static int[] field7790 = new int[2];

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "[I")
    public static int[] field7786 = new int[16384];

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
    public static int field7794 = -1;

    @OriginalMember(owner = "client!lo", name = "T", descriptor = "Lmq;")
    public static class350 field7795;

    @OriginalMember(owner = "client!lo", name = "U", descriptor = "[S")
    public static short[] field7796;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V")
    public static final void method3131(int arg0) {
        ++field7792;
        class6.field130.method484(-107);
        if (arg0 != 11553) {
            method3132(-30);
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    public class528() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V")
    public static void method3132(int arg0) {
        field7790 = null;
        if (arg0 != -3) {
            field7794 = -49;
        }
        field7795 = null;
        field7786 = null;
        field7783 = null;
        field7796 = null;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field7784;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, 68);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class259.field3768; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field7789 * var12 >> 12;
                    var9[var11] = this.field7791 * var13 >> 12;
                    var10[var11] = this.field7785 * var14 >> 12;
                } else {
                    var8[var11] = this.field7789;
                    var9[var11] = this.field7791;
                    var10[var11] = this.field7785;
                }
            }
        }
        if (arg0 != 8) {
            field7794 = 100;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field7787;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field7785 = arg0.method1069((byte) -44);
                }
            } else {
                this.field7791 = arg0.method1069((byte) -121);
            }
        } else {
            this.field7789 = arg0.method1069((byte) -29);
        }
        if (arg1 != -26471) {
            this.method37((class145) null, -73, 14);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field7783[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field7786[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field7795 = null;
        field7796 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
    }
}
