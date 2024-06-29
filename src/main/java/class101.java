import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class101 extends class498 {

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
    public boolean field1339;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field1343 = -1;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1342;

    static {
        new class530("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        new class530("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field1346 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIBII)Lud;", line = 8)
    public static final class27 method701(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1342++;
        if (arg4 != 114) {
            return null;
        }
        long var7 = (long) arg6 * 475427L ^ (long) arg0 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 986053L ^ (long) arg5 * 32147369L ^ (long) arg1 * 76724863L;
        class27 var9 = (class27) class154.field2220.method1088(var7, (byte) 105);
        if (var9 == null) {
            class27 var10 = class134.field1759.method384(arg3, arg0, arg6, arg2, arg5, arg1);
            class154.field2220.method1097(arg4 ^ 0x4CD9, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIZ)V", line = 35)
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1344 = arg4;
        this.field1339 = arg5;
        this.field1340 = arg1;
        this.field1338 = arg3;
        this.field1341 = arg0;
        this.field1345 = arg2;
    }
}
