import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class255 extends class512 {

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    private int field4319 = 2048;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    private int field4313 = 0;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "I")
    private int field4326 = 10;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "Lia;")
    public static class23 field4317;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "[[I")
    public static int[][] field4321;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "Lui;")
    public static class378 field4320;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "[I")
    private int[] field4315;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "[I")
    private int[] field4316;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "[S")
    public static short[] field4323;

    static {
        new class306("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field4317 = new class23(new byte[5000]);
        field4321 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V", line = 3)
    public static void method1728(int arg0) {
        int var1 = -27 / ((16 - arg0) / 37);
        field4320 = null;
        field4321 = null;
        field4323 = null;
        field4317 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZILia;)V", line = 25)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4313 = arg2.method126((byte) -93);
                }
            } else {
                this.field4319 = arg2.method132(60);
            }
        } else {
            this.field4326 = arg2.method126((byte) -70);
        }
        if (!arg0) {
            this.field4313 = 67;
        }
        ++field4318;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V", line = 73)
    public final void method74(int arg0) {
        ++field4325;
        if (arg0 == 12388) {
            this.method1730(arg0 + -12463);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)I", line = 85)
    public static final int method1729(int arg0, int arg1, int arg2) {
        if (arg1 != -3868) {
            field4321 = null;
        }
        ++field4314;
        return ~arg2 != -5 && ~arg2 != -6 ? 256 : class391.field5997[3 & arg0];
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 117)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V", line = 122)
    private final void method1730(int arg0) {
        ++field4322;
        this.field4315 = new int[this.field4326 + 1];
        int var2 = 38 / ((arg0 - -25) / 44);
        int var3 = 0;
        this.field4316 = new int[this.field4326 + 1];
        int var4 = 4096 / this.field4326;
        int var5 = this.field4319 * var4 >> 12;
        for (int var6 = 0; this.field4326 > var6; ++var6) {
            this.field4315[var6] = var3;
            this.field4316[var6] = var3 + var5;
            var3 += var4;
        }
        this.field4315[this.field4326] = 4096;
        this.field4316[this.field4326] = this.field4316[0] + 4096;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)[I", line = 152)
    public final int[] method75(int arg0, byte arg1) {
        ++field4324;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = -86 % ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            int var5 = class412.field6233[arg0];
            if (~this.field4313 == -1) {
                short var6 = 0;
                for (int var7 = 0; ~var7 > ~this.field4326; ++var7) {
                    if (~this.field4315[var7] >= ~var5 && var5 < this.field4315[var7 + 1]) {
                        if (var5 < this.field4316[var7]) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class85.method607(var3, 0, class402.field6113, var6);
            } else {
                for (int var8 = 0; ~class402.field6113 < ~var8; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class276.field4540[var8];
                    int var12 = this.field4313;
                    if (~var12 != -2) {
                        if (~var12 != -3) {
                            if (~var12 == -4) {
                                var9 = (-var5 + var11 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var5 - 4096 + var11 >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; ~this.field4326 < ~var13; ++var13) {
                        if (this.field4315[var13] <= var9 && ~this.field4315[var13 + 1] < ~var9) {
                            if (var9 < this.field4316[var13]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var8] = var10;
                }
            }
        }
        return var3;
    }
}
