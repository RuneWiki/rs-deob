import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class465 extends class354 {

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    private int field6930 = 585;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Lni;")
    public static class367 field6933 = new class367(74, 8);

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Z")
    public static boolean field6936 = false;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
    public static boolean field6935 = false;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "Lla;")
    public static class319 field6937 = new class319(64, 5);

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Z")
    public static boolean field6938 = false;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field6939 = 0;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "[I")
    public static int[] field6940;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBIII)V")
    public static final void method2798(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field6932;
        if (arg2 <= arg0) {
            for (int var5 = arg2; arg0 > var5; ++var5) {
                class466.field6955[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; ++var6) {
                class466.field6955[var6][arg3] = arg4;
            }
        }
        if (arg1 != 83) {
            method2800(92, -111, 33);
        }
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
    public static void method2799(int arg0) {
        field6933 = null;
        if (arg0 != 0) {
            method2798(14, (byte) -48, -118, 76, -67);
        }
        field6937 = null;
        field6940 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class465() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field6929;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 > -74) {
            field6937 = null;
        }
        if (super.field5478.field6213) {
            int var4 = class350.field5392[arg1];
            for (int var5 = 0; ~class531.field7814 < ~var5; ++var5) {
                int var6 = class195.field2616[var5];
                if (~this.field6930 > ~var6 && ~(-this.field6930 + 4096) < ~var6 && -this.field6930 + 2048 < var4 && var4 < 2048 - -this.field6930) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field6930);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field6930 + 2048 && ~(this.field6930 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field6930;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6930 + 2048);
                } else if (~var4 <= ~this.field6930 && 4096 - this.field6930 >= var4) {
                    if (this.field6930 <= var6 && -this.field6930 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6930 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field6930;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6930 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
    public static final boolean method2800(int arg0, int arg1, int arg2) {
        if (arg2 >= -106) {
            return false;
        } else {
            ++field6934;
            return (arg1 & 256) != 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field6930 = arg0.method1074(-635989152);
        }
        ++field6931;
        if (arg2 != 1638) {
            field6937 = null;
        }
    }
}
