import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class613 extends class4 {

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    private int field8819 = 32768;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Luv;")
    public static class3 field8814 = new class3(28, 0);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
    public static int[] field8818 = new int[1000];

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Lrh;")
    public static class44 field8816 = new class44(0);

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lvt;")
    public static class344 field8820 = new class344("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour...", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "(I)V")
    public static void method3499(int arg0) {
        field8820 = null;
        field8814 = null;
        field8818 = null;
        if (arg0 > -85) {
            method3500(0, (class23) null, -70, (byte) -77, 105, 114, 126);
        }
        field8816 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILdc;IBIII)V")
    public static final void method3500(int arg0, class23 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field8812;
        if (arg3 >= -57) {
            field8816 = null;
        }
        class521.method2908(arg1.field6362, arg1.field6368, arg1.field6358, arg5, 0, arg4, arg6, arg2, arg0, -2);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)[Lbda;")
    public static final class401[] method3501(byte arg0) {
        if (arg0 != -16) {
            return null;
        } else {
            ++field8809;
            return new class401[] { class628.field9174, class509.field7089, class2.field13, class311.field3974, class265.field3394, class451.field6394 };
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class613() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Ltaa;")
    public static final class272 method3502(int arg0, int arg1) {
        ++field8813;
        if (class606.field8717 && ~class477.field6713 >= ~arg1 && class579.field8066 >= arg1) {
            return arg0 != 1 ? null : class208.field2706[arg1 - class477.field6713];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 != -9) {
            this.method18(-86);
        }
        ++field8811;
        class78.method446((byte) -86);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field8808;
        int[] var3 = super.field31.method2252(arg1, arg0 ^ 1);
        if (super.field31.field5127) {
            int[] var4 = this.method20(1, -21986, arg1);
            int[] var5 = this.method20(2, -21986, arg1);
            for (int var6 = 0; class132.field1627 > var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field8819 >> 12;
                int var9 = class125.field1560[var7] * var8 >> 12;
                int var10 = class225.field2880[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class150.field1971;
                int var12 = class376.field5248 & (var10 >> 12) + arg1;
                int[] var13 = this.method20(0, -21986, var12);
                var3[var6] = var13[var11];
            }
        }
        return arg0 != 10 ? null : var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field8815;
        if (arg1 > -83) {
            method3501((byte) 0);
        }
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int[] var4 = this.method20(1, -21986, arg0);
            int[] var5 = this.method20(2, -21986, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class132.field1627; ++var9) {
                int var10 = (var4[var9] * 255 & 1047651) >> 12;
                int var11 = var5[var9] * this.field8819 >> 12;
                int var12 = class125.field1560[var10] * var11 >> 12;
                int var13 = class225.field2880[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class150.field1971;
                int var15 = (var13 >> 12) + arg0 & class376.field5248;
                int[][] var16 = this.method22(var15, (byte) -118, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field8810;
        if (arg0 > -89) {
            this.method18(14);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field44 = ~arg1.method3045(-125) == -2;
            }
        } else {
            this.field8819 = arg1.method3090(-113) << 4;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII)V")
    public static final void method3503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8817;
        if (arg4 == 3) {
            for (int var6 = arg3; ~var6 >= ~arg0; ++var6) {
                class373.method2275((byte) -9, arg1, arg2, arg5, class256.field3173[var6]);
            }
        }
    }
}
