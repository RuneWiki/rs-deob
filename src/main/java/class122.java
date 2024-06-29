import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class122 extends class337 {

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "Z")
    private boolean field1835 = true;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    private int field1838 = 4096;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "Lob;")
    public static class521 field1837;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class359.method2255((byte) -96, class416.field6200[arg1], arg2, arg3, arg4);
        ++field1830;
        int var9 = arg5 - 1;
        class359.method2255((byte) -67, class416.field6200[arg5], arg2, arg3, arg4);
        for (int var6 = var8; ~var9 <= ~var6; ++var6) {
            int[] var7 = class416.field6200[var6];
            var7[arg3] = var7[arg2] = arg4;
        }
        if (arg0 != 1028505761) {
            method910(-45);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field1831;
        int var3 = -58 % ((-41 - arg1) / 49);
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[] var5 = this.method2124(arg0 + -1 & class123.field1843, 0, -64);
            int[] var6 = this.method2124(arg0, 0, -64);
            int[] var7 = this.method2124(arg0 + 1 & class123.field1843, 0, -90);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class402.field5977 > var11; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field1838;
                int var13 = (var6[var11 + 1 & class446.field6541] - var6[var11 + -1 & class446.field6541]) * this.field1838;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var17 + 4096 + var16) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                } else {
                    var21 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field1835) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
    public static final void method908(boolean arg0) {
        if (!arg0) {
            if (class316.method2018((byte) 113)) {
                if (class238.field3820 == null) {
                    class229.method1620(0);
                }
                class93.field1316 = 0;
                class245.field3854 = true;
                try {
                    class475.field6865 = class150.field2246.getToolkit().getSystemClipboard();
                } catch (Exception var1) {
                }
            }
            ++field1832;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)V")
    public static void method909(byte arg0) {
        field1837 = null;
        if (arg0 >= -59) {
            method908(true);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 105 % ((82 - arg0) / 40);
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field1835 = arg2.method1515((byte) 125) == 1;
            }
        } else {
            this.field1838 = arg2.method1511(-111);
        }
        ++field1834;
    }

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)[Lqu;")
    public static final class65[] method910(int arg0) {
        if (arg0 != 1) {
            method911(74, (byte) -1, -34, 110, (byte[]) null, -121, -127);
        }
        ++field1836;
        return new class65[] { class509.field7452, class56.field690, class488.field7033, class193.field3259, class263.field4042, class45.field586, class515.field7497, class89.field1276, class514.field7470, class432.field6403, class246.field3865, class424.field6306, class71.field1023, class39.field530 };
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBII[BII)Z")
    public static final boolean method911(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        ++field1833;
        if (arg1 != 87) {
            field1837 = null;
        }
        int var7 = arg5 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = -var7 + arg3;
        }
        int var9 = -((arg3 + -1 + arg0) / arg3);
        int var10 = -((arg3 + arg5 + -1) / arg3);
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; var12 < 0; ++var12) {
                if (~arg4[arg6] == -1) {
                    return true;
                }
                arg6 += arg3;
            }
            int var13 = arg6 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg2 + var13;
        }
        return false;
    }

    static {
        new class234("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field1837 = new class521(4, -1);
        new class234("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
