import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class92 extends class397 {

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "Lgn;")
    public static class475 field1249;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field1254;

    static {
        new class194("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field1249 = new class475(68, 3);
        field1252 = 100;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 9)
    public static void method569(int arg0) {
        field1249 = null;
        if (arg0 != 26029) {
            method570((byte) -43, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 19)
    public class92() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I", line = 27)
    public final int[] method31(int arg0, int arg1) {
        ++field1250;
        int[] var3 = super.field5854.method465(arg1, arg0 + 780833189);
        if (arg0 != -780833076) {
            field1252 = -71;
        }
        if (super.field5854.field991) {
            int[] var4 = this.method2376(arg0 ^ -780833143, 0, arg1);
            int[] var5 = this.method2376(arg0 ^ -780833090, 1, arg1);
            int[] var6 = this.method2376(118, 2, arg1);
            for (int var7 = 0; ~var7 > ~class164.field2152; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B[B)Z", line = 81)
    public static final boolean method570(byte arg0, byte[] arg1) {
        ++field1248;
        if (arg0 != 111) {
            method569(-22);
        }
        class156 var2 = new class156(arg1);
        int var3 = var2.method941((byte) 125);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = ~var2.method941((byte) 125) == -2;
            if (var4) {
                class366.method2234((byte) 127, var2);
            }
            class494.method2968(var2, (byte) -109);
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[[I", line = 106)
    public final int[][] method486(byte arg0, int arg1) {
        ++field1254;
        int[][] var3 = super.field5848.method1692(arg1, 43);
        if (super.field5848.field3939) {
            int[] var4 = this.method2376(61, 2, arg1);
            int[][] var5 = this.method2377(arg1, -114, 0);
            int[][] var6 = this.method2377(arg1, -46, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class164.field2152; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg0 <= 81) {
            field1249 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBLae;)V", line = 190)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg0 == 0) {
            super.field5859 = ~arg2.method941((byte) 123) == -2;
        }
        ++field1251;
        if (arg1 != 80) {
            this.method31(8, 78);
        }
    }
}
