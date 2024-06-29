import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class184 extends class278 {

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Z")
    private boolean field2571 = true;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Z")
    private boolean field2574 = true;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "J")
    public static long field2575 = -1L;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "Z")
    public static boolean field2577 = false;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Lwo;")
    public static class522 field2573 = new class522();

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "[B")
    public static byte[] field2578 = new byte[16384];

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Ltp;")
    public static class371 field2579;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class184() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field2573 = null;
        field2578 = null;
        int var1 = -98 % ((-5 - arg0) / 43);
        field2579 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3754 = ~arg0.method2099(255) == -2;
                }
            } else {
                this.field2571 = ~arg0.method2099(255) == -2;
            }
        } else {
            this.field2574 = arg0.method2099(255) == 1;
        }
        if (arg1 == -30446) {
            ++field2572;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        ++field2570;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[][] var4 = this.method1568(5426, 0, !this.field2571 ? arg1 : -arg1 + class40.field549);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2574) {
                for (int var11 = 0; ~var11 > ~class507.field7456; ++var11) {
                    var8[var11] = var5[class412.field6045 - var11];
                    var9[var11] = var6[class412.field6045 - var11];
                    var10[var11] = var7[-var11 + class412.field6045];
                }
            } else {
                for (int var12 = 0; ~class507.field7456 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return arg0 < 75 ? null : var3;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field2576;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 0, this.field2571 ? -arg1 + class40.field549 : arg1);
            if (!this.field2574) {
                class416.method2487(var4, 0, var3, 0, class507.field7456);
            } else {
                for (int var5 = 0; class507.field7456 > var5; ++var5) {
                    var3[var5] = var4[class412.field6045 - var5];
                }
            }
        }
        if (arg0 != -9) {
            method1114(-112);
        }
        return var3;
    }
}
