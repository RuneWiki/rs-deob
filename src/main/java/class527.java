import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class527 extends class529 {

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    private int field7443 = 4096;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "S")
    public static short field7439 = 32767;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Lan;")
    public static class182 field7442 = new class182(7, 5);

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 < 45) {
            field7439 = 106;
        }
        if (~arg0 == -1) {
            this.field7443 = arg2.method1107(false);
        }
        ++field7438;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public static void method3020(int arg0) {
        field7442 = null;
        int var1 = 26 / ((-75 - arg0) / 37);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class527() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field7440;
        int[] var3 = super.field7456.method1635(arg0, -119);
        int var4 = -26 % ((27 - arg1) / 49);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 112, class33.field516 & arg0 + -1, 0);
            int[] var6 = this.method3028((byte) 105, arg0, 0);
            int[] var7 = this.method3028((byte) 105, class33.field516 & arg0 + 1, 0);
            for (int var8 = 0; ~class304.field3909 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field7443;
                int var10 = (var6[var8 - -1 & class404.field5700] + -var6[class404.field5700 & var8 + -1]) * this.field7443;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + var14 + 4096) / 4096.0F)));
                int var16 = var15 != 0 ? 16777216 / var15 : 0;
                var3[var8] = -var16 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
    public static final void method3021(int arg0, byte arg1) {
        class646.field8902 = arg0;
        if (arg1 > -74) {
            field7442 = null;
        }
        ++field7444;
        class114 var2 = class618.field8650;
        synchronized (class618.field8650) {
            class618.field8650.method776((byte) -102);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public static final void method3022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= -52) {
            field7439 = 126;
        }
        class188.field2472 = arg1;
        class654.field9000 = arg5;
        class223.field2945 = arg4;
        ++field7441;
        class579.field8054 = arg0;
        class49.field728 = arg2;
        if (~class188.field2472 <= -101) {
            int var6 = class49.field728 * 512 - -256;
            int var7 = class579.field8054 * 512 + 256;
            int var8 = class592.method3287(false, var7, class223.field2946, var6) - class223.field2945;
            int var9 = -class505.field7134 + var6;
            int var10 = var8 - class524.field7412;
            int var11 = -class407.field5744 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class411.field5801 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12));
            class688.field9781 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 16383;
            if (~class411.field5801 > -1025) {
                class411.field5801 = 1024;
            }
            class156.field1974 = 0;
            if (class411.field5801 > 3072) {
                class411.field5801 = 3072;
            }
        }
        class335.field4311 = -1;
        class147.field1783 = -1;
        class276.field3497 = 2;
    }
}
