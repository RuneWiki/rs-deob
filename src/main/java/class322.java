import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class322 extends class337 {

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lob;")
    public static class521 field4827 = new class521(79, 11);

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "[I")
    public static int[] field4829;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Lqd;")
    public static class315 field4830;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "Lpr;")
    public static class313 field4831;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IFIZIIII)[I")
    public static final int[] method2052(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4826;
        if (arg4 != -5607) {
            return null;
        } else {
            int[] var8 = new int[arg2];
            class517 var9 = new class517();
            var9.field7529 = arg3;
            var9.field7515 = arg7;
            var9.field7516 = arg6;
            var9.field7525 = (int) (arg1 * 4096.0F);
            var9.field7513 = arg0;
            var9.field7521 = arg5;
            var9.method174((byte) 77);
            class344.method2149(arg4 + 5607, arg2, 1);
            var9.method3065(105, 0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            return null;
        } else {
            ++field4825;
            int[] var3 = super.field5007.method512(arg0, 0);
            if (super.field5007.field687) {
                int[] var4 = this.method2124(arg0, 0, -55);
                int[] var5 = this.method2124(arg0, 1, -81);
                int[] var6 = this.method2124(arg0, 2, -85);
                for (int var7 = 0; ~class402.field5977 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public static void method2053(byte arg0) {
        field4830 = null;
        field4831 = null;
        if (arg0 != 52) {
            field4830 = null;
        }
        field4827 = null;
        field4829 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field4828;
        int var3 = 84 % ((arg1 - -41) / 49);
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[] var5 = this.method2124(arg0, 2, -70);
            int[][] var6 = this.method2123(arg0, 0, -109);
            int[][] var7 = this.method2123(arg0, 1, -103);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class402.field5977; ++var17) {
                int var18 = var5[var17];
                if (~var18 != -4097) {
                    if (~var18 != -1) {
                        int var19 = -var18 + 4096;
                        var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var12[var17] * var18 - -(var15[var17] * var19) >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                    } else {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    }
                } else {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class322() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -13 / ((arg0 - 82) / 40);
        if (arg1 == 0) {
            super.field5019 = arg2.method1515((byte) 127) == 1;
        }
        ++field4824;
    }

    static {
        new class234("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field4829 = new int[14];
        field4830 = new class315("", 15);
    }
}
