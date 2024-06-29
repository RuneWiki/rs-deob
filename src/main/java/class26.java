import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class26 extends class328 {

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    private int field357 = 585;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Lpp;")
    public static class464 field355 = new class464(64, 15);

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Lrl;")
    public static class633 field358;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method243(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class99.field1716 != null) {
            class99.field1716[arg0][arg1] = -16777216 | arg2;
        }
        if (class470.field6764 != null) {
            class470.field6764[arg0][arg1] = (short) arg3;
        }
        if (class103.field1746 != null) {
            class103.field1746[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BILco;)V", line = 19)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg1 == 0) {
            this.field357 = arg2.method1745(32132);
        }
        if (arg0 <= 75) {
            this.method4(16, -24);
        }
        ++field354;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 45)
    public static void method244(byte arg0) {
        field358 = null;
        if (arg0 > -14) {
            method244((byte) 42);
        }
        field355 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I", line = 62)
    public final int[] method4(int arg0, int arg1) {
        ++field353;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = 95 / ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            int var5 = class638.field9258[arg0];
            for (int var6 = 0; ~var6 > ~class449.field6539; ++var6) {
                int var7 = class206.field2924[var6];
                if (~var7 < ~this.field357 && ~(4096 - this.field357) < ~var7 && -this.field357 + 2048 < var5 && ~(this.field357 + 2048) < ~var5) {
                    int var8 = -var7 + 2048;
                    int var9 = ~var8 <= -1 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field357);
                    var3[var6] = -var11 + 4096;
                } else if (var7 > -this.field357 + 2048 && this.field357 + 2048 > var7) {
                    int var12 = var5 - 2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field357;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (-this.field357 + 2048);
                } else if (~this.field357 >= ~var5 && ~var5 >= ~(-this.field357 + 4096)) {
                    if (this.field357 <= var7 && 4096 - this.field357 >= var7) {
                        var3[var6] = 0;
                    } else {
                        int var16 = 2048 - var5;
                        int var17 = var16 >= 0 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field357 + 2048);
                        var3[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 <= -1 ? var20 : -var20;
                    int var22 = var21 - this.field357;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (-this.field357 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 142)
    public class26() {
        super(0, true);
    }
}
