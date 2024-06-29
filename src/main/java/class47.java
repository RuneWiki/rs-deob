import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class47 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "Lcs;")
    public static class351 field755 = new class351(67, -1);

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field761 = 2;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "[I")
    public static int[] field760 = new int[500];

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "Lfc;")
    public static class343 field763;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "[I")
    public static int[] field764;

    static {
        new class112("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field765 = -1;
        field766 = 255;
        field768 = 2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method367(int arg0) {
        field754++;
        if (arg0 != 0) {
            field768 = -42;
        }
        return (this.field767 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method368(int arg0) {
        field762++;
        if (arg0 == -5395) {
            return (this.field767 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Z", line = 34)
    public final boolean method369(int arg0) {
        field753++;
        if (arg0 == -14242) {
            return (this.field767 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)Z", line = 59)
    public final boolean method370(int arg0) {
        field756++;
        int var2 = -113 / ((arg0 + 16) / 56);
        return (this.field767 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)V", line = 70)
    public static void method371(int arg0) {
        field755 = null;
        field760 = null;
        if (arg0 == 64) {
            field763 = null;
            field764 = null;
        }
    }
}
