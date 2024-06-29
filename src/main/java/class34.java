import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class34 extends class23 {

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    private int field690 = 585;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Ldc;")
    private static class37 field694 = class185.method1233((byte) 86, "Invalid username or password)3");

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Ldc;")
    public static class37 field693 = field694;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Lbb;")
    public static class14 field691 = new class14(64);

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Ldc;")
    public static class37 field695 = class185.method1233((byte) 86, "compass");

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Z")
    public static boolean field696 = false;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public static void method287(byte arg0) {
        field695 = null;
        field694 = null;
        if (arg0 <= 88) {
            field696 = false;
        }
        field693 = null;
        field691 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field689;
        if (arg2 != 1000) {
            this.method57(43, -76);
        }
        if (arg1 == 0) {
            this.field690 = arg0.method230((byte) -127);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field692;
        if (arg0 != 0) {
            field694 = null;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -112);
        if (super.field405.field4114) {
            int var4 = class167.field3196[arg1];
            for (int var5 = 0; ~class199.field3705 < ~var5; ++var5) {
                int var6 = class133.field2477[var5];
                if (var6 > this.field690 && var6 < -this.field690 + 4096 && ~var4 < ~(2048 - this.field690) && var4 < this.field690 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field690 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field690 < var6 && var6 < this.field690 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field690;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field690 + 2048);
                } else if (var4 >= this.field690 && var4 <= 4096 - this.field690) {
                    if (~var6 <= ~this.field690 && var6 <= 4096 - this.field690) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field690 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field690;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field690 + 2048);
                }
            }
        }
        return var3;
    }
}
