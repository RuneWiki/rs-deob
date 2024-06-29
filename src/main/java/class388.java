import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class388 extends class22 {

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
    public boolean field5292 = false;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Z")
    public boolean field5294 = false;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public int field5297;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field5290 = -1;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lcq;")
    public static class72 field5295 = new class72("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field5299 = -2;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V", line = 4)
    public static void method2411(int arg0) {
        if (arg0 != -1) {
            method2412(8, 9);
        }
        field5295 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Z", line = 21)
    public static final boolean method2412(int arg0, int arg1) {
        field5293++;
        class219.field2703 = arg1 + 1 & 0xFFFF;
        if (arg0 >= -11) {
            return false;
        } else {
            class68.field823 = true;
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIZZ)V", line = 57)
    public class388(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5291 = arg1;
        this.field5292 = arg3;
        this.field5294 = arg4;
        this.field5296 = arg2;
        this.field5297 = arg0;
    }
}
