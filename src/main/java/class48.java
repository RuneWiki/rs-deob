import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class48 extends class29 {

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[I")
    public static int[] field575 = new int[200];

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field572 = 0;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field579;

    static {
        new class362("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lol;III)V", line = 4)
    public static final void method276(class156 arg0, int arg1, int arg2, int arg3) {
        int var4 = class229.field3232[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field1911 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field1910[arg0.field1911++] = class266.field3800[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field1911; var7 < 4; var7++) {
            arg0.field1910[var7] = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V", line = 32)
    public static void method277(byte arg0) {
        field575 = null;
        if (arg0 > -8) {
            field572 = -62;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 44)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = 89 % ((arg1 + 16) / 62);
        field573++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V", line = 55)
    public final void method51(int arg0) {
        field570++;
        if (arg0 != 6) {
            this.field567 = 57;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Z", line = 71)
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            field579 = -38;
        }
        field574++;
        return false;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BZLjava/awt/Component;)Lfa;", line = 89)
    public static final class127 method279(byte arg0, boolean arg1, Component arg2) {
        if (arg0 == -114) {
            field569++;
            return new class4(arg2, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIII)V", line = 104)
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field577 = arg0;
        this.field576 = arg3;
        this.field571 = arg2;
        this.field566 = arg6;
        this.field568 = arg1;
        this.field578 = arg5;
        this.field567 = arg4;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)I")
    public abstract int method278(byte arg0);
}
