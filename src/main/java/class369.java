import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class369 extends class354 {

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    private int field5630 = 32768;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field5628 = 100;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "Z")
    public static boolean field5631 = true;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "F")
    public static float field5626;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "[I")
    public static int[] field5635;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 4)
    public static final void method2345(byte arg0) {
        ++field5633;
        try {
            if (class406.field6164 == 1) {
                int var1 = class480.field7082.method1411(16);
                if (var1 > 0 && class480.field7082.method1407(30274)) {
                    int var2 = var1 - class474.field7042;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class480.field7082.method1393(var2, -117);
                    return;
                }
                class480.field7082.method1405(16);
                class480.field7082.method1398(16);
                if (class445.field6686 == null) {
                    class406.field6164 = 0;
                } else {
                    class406.field6164 = 2;
                }
                class373.field5679 = null;
                class418.field6367 = null;
            }
            if (arg0 < 4) {
                field5635 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class480.field7082.method1405(16);
            class418.field6367 = null;
            class373.field5679 = null;
            class406.field6164 = 0;
            class445.field6686 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 61)
    public class369() {
        super(3, false);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V", line = 71)
    public static void method2346(boolean arg0) {
        if (arg0) {
            field5631 = false;
        }
        field5635 = null;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(BI)[I", line = 83)
    public final int[] method270(byte arg0, int arg1) {
        ++field5629;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 86, 1, arg1);
            int[] var5 = this.method2275((byte) 80, 2, arg1);
            for (int var6 = 0; var6 < class531.field7814; ++var6) {
                int var7 = (4087 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field5630 >> 12;
                int var9 = class165.field2241[var7] * var8 >> 12;
                int var10 = field5635[var7] * var8 >> 12;
                int var11 = class179.field2409 & (var9 >> 12) + var6;
                int var12 = arg1 - -(var10 >> 12) & class423.field6453;
                int[] var13 = this.method2275((byte) 112, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return arg0 >= -74 ? null : var3;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V", line = 132)
    public final void method357(int arg0) {
        class410.method2530(1);
        ++field5634;
        if (arg0 < 28) {
            this.method272((class164) null, 70, 24);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[[I", line = 143)
    public final int[][] method354(int arg0, byte arg1) {
        ++field5627;
        int[][] var3 = super.field5474.method2414((byte) -84, arg0);
        int var4 = -72 / ((48 - arg1) / 60);
        if (super.field5474.field5870) {
            int[] var5 = this.method2275((byte) 120, 1, arg0);
            int[] var6 = this.method2275((byte) 92, 2, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class531.field7814; ++var10) {
                int var11 = (1047952 & var5[var10] * 255) >> 12;
                int var12 = var6[var10] * this.field5630 >> 12;
                int var13 = class165.field2241[var11] * var12 >> 12;
                int var14 = field5635[var11] * var12 >> 12;
                int var15 = class179.field2409 & var10 - -(var13 >> 12);
                int var16 = (var14 >> 12) + arg0 & class423.field6453;
                int[][] var17 = this.method2274((byte) 84, var16, 0);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnj;II)V", line = 198)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    super.field5466 = arg0.method1087(false) == 1;
                }
            } else {
                this.field5630 = arg0.method1074(-635989152) << 4;
            }
            ++field5632;
        }
    }
}
