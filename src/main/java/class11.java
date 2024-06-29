import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public abstract class class11 {

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "Lad;")
    public class362 field95;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Lkca;")
    public static class73 field91 = new class73(65, -1);

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "[I")
    public static int[] field98 = new int[1000];

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "Lea;")
    public static class474 field96 = new class474("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "F")
    public static float field94;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "F")
    public static float field97;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "[I")
    public static int[] field99;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 10)
    public static void method66(int arg0) {
        field98 = null;
        if (arg0 == -31270) {
            field99 = null;
            field96 = null;
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lad;)V", line = 34)
    public class11(class362 arg0) {
        this.field95 = arg0;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIB)V")
    public abstract void method62(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public abstract void method63(int arg0);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZZ)V")
    public abstract void method64(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILpm;)V")
    public abstract void method65(int arg0, int arg1, class507 arg2);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
    public abstract void method67(int arg0, boolean arg1);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)Z")
    public abstract boolean method68(byte arg0);
}
