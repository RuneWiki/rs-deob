import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class70 extends class13 {

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field1029 = 32768;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "Z")
    public static boolean field1032 = true;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field1027;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            this.method29(false, -45);
        }
        if (super.field263.field1845) {
            int[] var4 = this.method223(1, -11541, arg1);
            int[] var5 = this.method223(2, -11541, arg1);
            for (int var6 = 0; class269.field3751 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field1029 >> 12;
                int var9 = class33.field521[var7] * var8 >> 12;
                int var10 = class139.field1995[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class343.field4677;
                int var12 = class123.field1710 & (var10 >> 12) + arg1;
                int[] var13 = this.method223(0, -11541, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field1026;
        class282.method1845(-51);
        int var2 = -31 % ((2 - arg0) / 51);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field1028;
        int[][] var3 = super.field256.method1930(arg1, (byte) 124);
        if (super.field256.field4154) {
            int[] var4 = this.method223(1, -11541, arg1);
            int[] var5 = this.method223(2, arg0 ^ 16803, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class269.field3751; ++var9) {
                int var10 = (var4[var9] * 255 & 1048262) >> 12;
                int var11 = var5[var9] * this.field1029 >> 12;
                int var12 = class33.field521[var10] * var11 >> 12;
                int var13 = class139.field1995[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class343.field4677;
                int var15 = class123.field1710 & (var13 >> 12) + arg1;
                int[][] var16 = this.method227(false, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -27832) {
            field1032 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)I")
    public static final int method536(int arg0, boolean arg1) {
        ++field1031;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1) {
            method536(-93, false);
        }
        int var3 = arg0 * 6 + -61440;
        int var4 = 40960 - -(arg0 * var3 >> 12);
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field1024;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field259 = arg0.method172((byte) 52) == 1;
            }
        } else {
            this.field1029 = arg0.method174(255) << 4;
        }
        if (arg1 <= 50) {
            field1023 = 61;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class70() {
        super(3, false);
    }
}
