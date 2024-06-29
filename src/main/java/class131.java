import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class131 extends class96 {

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "I")
    private int field1782 = 32768;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "Lpi;")
    public static class340 field1780 = new class340(44, -1);

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field1784;
            int[] var3 = super.field1331.method397((byte) -110, arg0);
            if (super.field1331.field863) {
                int[] var4 = this.method657(1, arg0, arg1 + -256);
                int[] var5 = this.method657(2, arg0, -1);
                for (int var6 = 0; ~var6 > ~class269.field3403; ++var6) {
                    int var7 = 255 & var4[var6] >> 4;
                    int var8 = var5[var6] * this.field1782 >> 12;
                    int var9 = class234.field3041[var7] * var8 >> 12;
                    int var10 = class40.field587[var7] * var8 >> 12;
                    int var11 = class292.field3781 & var6 - -(var9 >> 12);
                    int var12 = class380.field4948 & (var10 >> 12) + arg0;
                    int[] var13 = this.method657(0, var12, -1);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field1783;
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field1329 = arg2.method617(2) == 1;
            }
        } else {
            this.field1782 = arg2.method568((byte) 110) << 4;
        }
        if (arg1 != -1) {
            method926(-10);
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        class18.method112(-98);
        if (arg0 < 15) {
            this.method37(-113, 81);
        }
        ++field1779;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
    public class131() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)V")
    public static void method926(int arg0) {
        if (arg0 != 1) {
            method926(10);
        }
        field1780 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field1781;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[] var4 = this.method657(1, arg1, arg0 + -4);
            int[] var5 = this.method657(2, arg1, -1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class269.field3403; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field1782 >> 12;
                int var12 = class234.field3041[var10] * var11 >> 12;
                int var13 = class40.field587[var10] * var11 >> 12;
                int var14 = class292.field3781 & var9 - -(var12 >> 12);
                int var15 = arg1 - -(var13 >> 12) & class380.field4948;
                int[][] var16 = this.method659(0, -72, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
