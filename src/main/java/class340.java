import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class340 extends class535 {

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
    private int field5027 = 32768;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "Lvr;")
    public static class92 field5029 = new class92(13, 0, 1, 0);

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "Lbj;")
    public static class164 field5031;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "Lkv;")
    public static class181 field5032;

    static {
        new class44("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 3)
    public class340() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 10)
    public static void method2157(int arg0) {
        field5029 = null;
        if (arg0 != -1) {
            field5032 = null;
        }
        field5032 = null;
        field5031 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[[I", line = 24)
    public final int[][] method61(int arg0, int arg1) {
        ++field5026;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[] var4 = this.method3158(97, 1, arg1);
            int[] var5 = this.method3158(113, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class174.field2597; ++var9) {
                int var10 = (var4[var9] * 255 & 1044540) >> 12;
                int var11 = var5[var9] * this.field5027 >> 12;
                int var12 = class434.field6213[var10] * var11 >> 12;
                int var13 = class294.field4388[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class529.field7783;
                int var15 = (var13 >> 12) + arg1 & class293.field4364;
                int[][] var16 = this.method3157((byte) 67, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 >= -116) {
            field5031 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)V", line = 81)
    public final void method66(byte arg0) {
        class100.method744(-127);
        if (arg0 < 111) {
            field5029 = null;
        }
        ++field5025;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILwn;I)V", line = 97)
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field5030;
        if (arg2 == -6232) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field7878 = arg1.method3072((byte) -126) == 1;
                }
            } else {
                this.field5027 = arg1.method3018(566990904) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)[I", line = 133)
    public final int[] method65(int arg0, int arg1) {
        ++field5028;
        int[] var3 = super.field7885.method974(arg1 ^ -30532, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field7885.field2086) {
                int[] var4 = this.method3158(arg1 + -100, 1, arg0);
                int[] var5 = this.method3158(-123, 2, arg0);
                for (int var6 = 0; var6 < class174.field2597; ++var6) {
                    int var7 = 255 & var4[var6] >> 4;
                    int var8 = var5[var6] * this.field5027 >> 12;
                    int var9 = class434.field6213[var7] * var8 >> 12;
                    int var10 = class294.field4388[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class529.field7783;
                    int var12 = (var10 >> 12) + arg0 & class293.field4364;
                    int[] var13 = this.method3158(-125, 0, var12);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }
}
