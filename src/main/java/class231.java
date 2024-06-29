import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class231 extends class177 {

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    private int field3571 = 4096;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field3574 = -1;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "[I")
    public static int[] field3575 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhb;II)V", line = 6)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            method1643(-81);
        }
        if (arg2 == 0) {
            this.field3571 = arg0.method300(-1394191632);
        }
        field3572++;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V", line = 23)
    public static void method1643(int arg0) {
        field3575 = null;
        int var1 = -59 % ((arg0 - 63) / 49);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 31)
    public class231() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[I", line = 55)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 > -52) {
            return (int[]) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -101);
        field3577++;
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1 - 1 & class11.field120, 0, false);
            int[] var5 = this.method1280(arg1, 0, false);
            int[] var6 = this.method1280(arg1 + 1 & class11.field120, 0, false);
            for (int var7 = 0; var7 < class287.field4415; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3571;
                int var9 = (var5[class133.field2090 & var7 + 1] - var5[class133.field2090 & var7 - 1]) * this.field3571;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Llb;Llb;ZB)V", line = 107)
    public static final void method1644(class211 arg0, class211 arg1, boolean arg2, byte arg3) {
        field3573++;
        class118.field1858 = arg2;
        class273.field4133 = arg0;
        if (arg3 != -51) {
            method1644((class211) null, (class211) null, false, (byte) 123);
        }
        class225.field3502 = arg1;
    }
}
