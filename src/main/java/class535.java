import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class535 extends class202 {

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    private int field7829 = 4096;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    private int field7831 = 4096;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    private int field7835 = 4096;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lbi;")
    public static class104 field7834 = new class104(72, -1);

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[S")
    public static short[] field7840;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class535() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method3168(byte arg0) {
        if (arg0 == 57) {
            ++field7837;
            if (class496.field7470 != -1) {
                class285.method1926(class496.field7470, -1, -1, true, false);
                class496.field7470 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static final void method3169(int arg0) {
        ++field7833;
        class488 var1 = null;
        try {
            class495 var2 = class339.field5294.method19(19, true, "2");
            while (~var2.field7458 == -1) {
                class208.method1464((byte) -63, 1L);
            }
            if (var2.field7458 == 1) {
                var1 = (class488) var2.field7462;
                class208 var3 = new class208(class209.field3225 * 6 + 3);
                var3.method1479((byte) -98, 1);
                var3.method1437(class209.field3225, 0);
                for (int var4 = 0; var4 < class187.field2726.length; ++var4) {
                    if (class225.field3770[var4]) {
                        var3.method1437(var4, 0);
                        var3.method1477(65280, class187.field2726[var4]);
                    }
                }
                var1.method2995(true, var3.field3162, var3.field3193, 0);
            }
            if (arg0 > -28) {
                method3170(4, (String) null);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2994(-30563);
            }
        } catch (Exception var5) {
        }
        class526.field7757 = class246.method1705((byte) 28);
        class325.field5107 = false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3170(int arg0, String arg1) {
        ++field7830;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 <= 124) {
            return 84;
        } else {
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                var3 = -var3 + (var3 << 5) + class345.method2283(23251, arg1.charAt(var4));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        if (arg0 != -1) {
            field7840 = null;
        }
        ++field7836;
        int[][] var3 = super.field3081.method1050(arg1, arg0 ^ 50);
        if (super.field3081.field2432) {
            int[][] var4 = this.method1382(0, arg1, 40);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class276.field4375; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field7829 * var12 >> 12;
                    var9[var11] = this.field7835 * var13 >> 12;
                    var10[var11] = this.field7831 * var14 >> 12;
                } else {
                    var8[var11] = this.field7829;
                    var9[var11] = this.field7835;
                    var10[var11] = this.field7831;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        ++field7832;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field7831 = arg0.method1455(-3387);
                }
            } else {
                this.field7835 = arg0.method1455(-3387);
            }
        } else {
            this.field7829 = arg0.method1455(-3387);
        }
        int var5 = -98 / ((arg1 - -46) / 50);
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V")
    public static void method3171(int arg0) {
        field7834 = null;
        field7840 = null;
        if (arg0 != -680233268) {
            field7834 = null;
        }
    }

    static {
        new class213("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        new class213("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field7839 = 1406;
        field7840 = new short[256];
        field7841 = 0;
        field7842 = -1;
    }
}
