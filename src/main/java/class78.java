import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class78 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "[I")
    private int[] field1098;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field1101;

    static {
        new class368("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I", line = 4)
    public final int method634(int arg0, int arg1) {
        field1097++;
        if (arg0 != 27231) {
            return 60;
        }
        int var3 = (this.field1098.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field1098[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1098[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "([I)V", line = 36)
    public class78(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1098 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1098[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1098[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1098[var5 + var5] = arg0[var4];
            this.field1098[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 80)
    public static final void method635(int arg0) {
        class245.field3457.method2530((byte) -102);
        field1096++;
        int var1 = 22 % ((-arg0 - 64) / 44);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILrg;)Lsp;", line = 91)
    public static final class424 method636(int arg0, class366 arg1) {
        arg1.method2306((byte) 51);
        field1101++;
        int var2 = arg1.method2306((byte) 58);
        class424 var3 = class348.method2108(var2, (byte) 33);
        var3.field5907 = arg1.method2306((byte) 95);
        int var4 = arg1.method2306((byte) 39);
        if (arg0 < 15) {
            method635(109);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2306((byte) 93);
            var3.method19(arg1, (byte) -48, var6);
        }
        var3.method113(3);
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V", line = 127)
    public static final void method637(int arg0, int arg1) {
        for (class311 var2 = class48.field618.method842((byte) -25); var2 != null; var2 = class48.field618.method836(48)) {
            if ((var2.field4226 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1884(false);
            }
        }
        field1099++;
        int var3 = 113 / ((29 - arg0) / 55);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)V", line = 148)
    public static final void method638(int arg0, byte arg1) {
        field1100++;
        class57.field743 = arg0;
        class408 var2 = class422.field5838;
        synchronized (class422.field5838) {
            class422.field5838.method2530((byte) -95);
        }
        if (arg1 >= 106) {
            ;
        }
    }
}
