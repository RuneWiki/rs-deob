import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class292 extends class404 {

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Z")
    private boolean field4450 = true;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    private int field4449 = 4096;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lbg;")
    public static class310 field4448 = new class310(44, 8);

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "Ltm;")
    public static class254 field4451 = new class254();

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field4452 = 0;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "Lqi;")
    public static class382 field4454 = new class382("WTI", 5);

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V")
    public static void method1781(int arg0) {
        field4451 = null;
        field4448 = null;
        field4454 = null;
        if (arg0 != 1887170476) {
            method1781(-112);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field4450 = arg1.method257((byte) 59) == 1;
            }
        } else {
            this.field4449 = arg1.method254((byte) -57);
        }
        if (arg0 == 0) {
            ++field4447;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        ++field4446;
        if (arg0 != -1) {
            field4452 = -74;
        }
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int[] var4 = this.method2394(0, (byte) 64, arg1 + -1 & class435.field6374);
            int[] var5 = this.method2394(0, (byte) 64, arg1);
            int[] var6 = this.method2394(0, (byte) 64, class435.field6374 & arg1 - -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class431.field6348 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4449;
                int var12 = (var5[class98.field1757 & var10 + 1] + -var5[class98.field1757 & var10 + -1]) * this.field4449;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                }
                if (this.field4450) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class292() {
        super(1, false);
    }
}
