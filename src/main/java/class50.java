import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class50 extends class4 {

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Z")
    private boolean field681 = true;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Z")
    private boolean field674 = true;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "Lim;")
    public static class353 field677 = new class353(74, 4);

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Lvt;")
    public static class344 field684 = new class344("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Lim;")
    public static class353 field686 = new class353(35, 4);

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "F")
    public static float field676;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[Lsa;")
    public static class544[] field672;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZBIZII)V")
    public static final void method275(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field680;
        if (arg2 < 107) {
            method276(32);
        }
        if (~arg6 > ~arg3) {
            int var7 = (arg3 + arg6) / 2;
            int var8 = arg6;
            class272 var9 = class447.field6332[var7];
            class447.field6332[var7] = class447.field6332[arg3];
            class447.field6332[arg3] = var9;
            for (int var10 = arg6; ~var10 > ~arg3; ++var10) {
                if (~class99.method553(var9, arg1, class447.field6332[var10], arg0, arg5, (byte) -17, arg4) >= -1) {
                    class272 var11 = class447.field6332[var10];
                    class447.field6332[var10] = class447.field6332[var8];
                    class447.field6332[var8++] = var11;
                }
            }
            class447.field6332[arg3] = class447.field6332[var8];
            class447.field6332[var8] = var9;
            method275(arg0, arg1, (byte) 120, var8 - 1, arg4, arg5, arg6);
            method275(arg0, arg1, (byte) 113, arg3, arg4, arg5, var8 + 1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field675;
        if (arg1 >= -83) {
            this.method15((byte) 99, 101);
        }
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int[][] var4 = this.method22(this.field674 ? class376.field5248 - arg0 : arg0, (byte) -89, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field681) {
                for (int var11 = 0; ~class132.field1627 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class150.field1971];
                    var9[var11] = var6[-var11 + class150.field1971];
                    var10[var11] = var7[-var11 + class150.field1971];
                }
            } else {
                for (int var12 = 0; ~class132.field1627 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field678;
        if (arg0 >= -89) {
            field672 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field44 = arg1.method3045(-126) == 1;
                }
            } else {
                this.field674 = ~arg1.method3045(-128) == -2;
            }
        } else {
            this.field681 = ~arg1.method3045(-125) == -2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V")
    public static final void method276(int arg0) {
        ++field679;
        if (class99.field1324) {
            if (arg0 != 2) {
                method275(105, true, (byte) 88, -3, false, 19, -9);
            }
            while (true) {
                while (~class331.field4578 > ~class447.field6332.length) {
                    class272 var1 = class447.field6332[class331.field4578];
                    if (var1 != null && var1.field3456 == -1) {
                        if (class497.field6922 == null) {
                            class497.field6922 = class640.field9293.method227(var1.field3455, 3);
                        }
                        int var2 = class497.field6922.field3991;
                        if (var2 == -1) {
                            return;
                        }
                        class497.field6922 = null;
                        var1.field3456 = var2;
                        ++class331.field4578;
                    } else {
                        ++class331.field4578;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field682;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int[] var4 = this.method20(0, arg0 ^ -21996, this.field674 ? -arg1 + class376.field5248 : arg1);
            if (this.field681) {
                for (int var5 = 0; var5 < class132.field1627; ++var5) {
                    var3[var5] = var4[-var5 + class150.field1971];
                }
            } else {
                class205.method1310(var4, 0, var3, 0, class132.field1627);
            }
        }
        return arg0 != 10 ? null : var3;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static void method277(byte arg0) {
        field672 = null;
        field684 = null;
        if (arg0 < -72) {
            field677 = null;
            field686 = null;
        }
    }
}
