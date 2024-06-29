import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class321 extends class354 {

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    private int field4643 = 409;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    private int field4644 = 4096;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    private int field4648 = 4096;

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "I")
    private int field4652 = 4096;

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "[I")
    private int[] field4653 = new int[3];

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field4646;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "Lla;")
    public static class319 field4651;

    @OriginalMember(owner = "client!gt", name = "X", descriptor = "Lni;")
    public static class367 field4654;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "Lem;")
    public static class152 field4650;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field4645;
        int[][] var3 = super.field5474.method2414((byte) -121, arg0);
        int var4 = -1 % ((arg1 - 48) / 60);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class531.field7814; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field4653[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (this.field4643 < var14) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field4653[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (this.field4643 < var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field4653[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (var18 > this.field4643) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field4652 * var13 >> 12;
                            var10[var12] = this.field4648 * var15 >> 12;
                            var11[var12] = this.field4644 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(BII)I")
    public static final int method1999(byte arg0, int arg1, int arg2) {
        int var3 = 101 % ((40 - arg0) / 34);
        ++field4647;
        return ~arg1 != -5 && ~arg1 != -6 ? 256 : class298.field4398[arg2 & 3];
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(BI)V")
    public static final void method2000(byte arg0, int arg1) {
        ++field4649;
        if (class86.method587(-124, arg1)) {
            class282[] var2 = class263.field3690[arg1];
            if (arg0 >= 18) {
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class282 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field4135 = 0;
                        var4.field4050 = 1;
                        var4.field4015 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
    public static final int method2001(int arg0, int arg1) {
        ++field4641;
        if (~arg1 > -97) {
            return 0;
        } else {
            if (arg0 != -10744) {
                field4654 = null;
            }
            return ~arg1 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field4642;
        if (arg2 != 1638) {
            this.method272((class164) null, 65, -59);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var5 = arg0.method1090(arg2 + -1639);
                            this.field4653[2] = class519.method3092(0, var5 >> 12);
                            this.field4653[1] = class519.method3092(65280, var5) >> 4;
                            this.field4653[0] = class519.method3092(var5, 16711680) << 4;
                        }
                    } else {
                        this.field4652 = arg0.method1074(arg2 ^ -635988730);
                    }
                } else {
                    this.field4648 = arg0.method1074(-635989152);
                }
            } else {
                this.field4644 = arg0.method1074(-635989152);
            }
        } else {
            this.field4643 = arg0.method1074(-635989152);
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class321() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "(I)V")
    public static void method2002(int arg0) {
        field4650 = null;
        field4651 = null;
        if (arg0 < 121) {
            field4650 = null;
        }
        field4654 = null;
        field4646 = null;
    }

    static {
        new class446("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field4646 = new String[100];
        new class446("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field4651 = new class319(79, 12);
        new class446(" days.", " Tage.", " jours.", " dias.");
        field4654 = new class367(75, 3);
    }
}
