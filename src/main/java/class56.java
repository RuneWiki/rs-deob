import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class56 extends class529 {

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[F")
    public static float[] field756 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljr;")
    public static class357 field751 = new class357(16);

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "[I")
    public static int[] field758 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method320(boolean arg0) {
        if (!arg0) {
            field751 = null;
        }
        field756 = null;
        field751 = null;
        field758 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public static final void method321(int arg0, boolean arg1) {
        if (!arg1) {
            field756 = null;
        }
        field757++;
        class181.field2366 = 100;
        class196.field2536 = -1;
        class407.field5459 = 3;
        class246.field3149 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)I")
    public static final int method322(int arg0, int arg1, int arg2) {
        field753++;
        if (arg1 != 60) {
            field751 = null;
        }
        int var3 = class17.method110(arg0 + 45365, arg2 - -91923, -1, 4) - (-(class17.method110(arg0 + 10294, arg2 + 37821, -1, 2) + -128 >> 1) - (class17.method110(arg0, arg2, -1, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLdn;)V")
    public static final void method323(byte arg0, class201 arg1) {
        int var2 = -55 / ((arg0 - 34) / 45);
        field755++;
        class406.field5437 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[[BLbi;)V")
    public static final void method324(int arg0, byte[][] arg1, class381 arg2) {
        field754++;
        if (arg0 != -30620) {
            method321(-106, false);
        }
        for (int var3 = 0; var3 < arg2.field2838; var3++) {
            class100.method679(16384);
            for (int var4 = 0; var4 < (class200.field2594 >> 3); var4++) {
                for (int var5 = 0; var5 < (class118.field1647 >> 3); var5++) {
                    int var6 = class46.field674[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field2825 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFF423) >> 14;
                            int var10 = (var6 & 0x3FFD) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class194.field2507.length; var12++) {
                                if (class194.field2507[var12] == var11 && arg1[var12] != null) {
                                    arg2.method2219(var7, var5 * 8, arg1[var12], class512.field7538, (var9 & 0x7) * 8, (var10 & 0x7) * 8, 7, class171.field2215, var3, var8, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new class169("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
