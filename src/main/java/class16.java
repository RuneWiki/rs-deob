import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class class16 extends class198 {

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Z")
    public boolean field239 = false;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Z")
    public boolean field245 = false;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "Lpm;")
    public static class349 field243 = new class349("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Ltj;")
    public static class108 field246;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Ls;")
    public static class154 field238;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "Lio;")
    public static class252 field247;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
    public static void method105(int arg0) {
        field247 = null;
        field246 = null;
        field238 = null;
        if (arg0 != -10163) {
            field247 = null;
        }
        field243 = null;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIZZ)V")
    public class16(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field240 = arg2;
        this.field244 = arg1;
        this.field245 = arg3;
        this.field241 = arg0;
        this.field239 = arg4;
    }
}
