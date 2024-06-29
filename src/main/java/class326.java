import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class326 extends class261 {

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[B")
    public byte[] field4941;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lvp;")
    public static class126 field4943;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Lph;")
    public static class459 field4945;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
    public class326(byte[] arg0) {
        this.field4941 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILmf;Lza;I)V")
    public static final void method2070(int arg0, int arg1, class291 arg2, class288 arg3, int arg4) {
        field4944++;
        class454.field6754.method1891(arg4 ^ 0x1E99);
        if (class177.field2869) {
            return;
        }
        for (class97 var5 = (class97) arg2.method1892(92); var5 != null; var5 = (class97) arg2.method1893((byte) -2)) {
            class25 var6 = class319.field4842.method1247(false, var5.field1890);
            if (class59.method528(var6, (byte) -62)) {
                boolean var7 = class514.method3066((byte) 88, arg0, arg3, var6, arg1, var5);
                if (var7) {
                    class408.method2530(var5, (byte) 56, var6, arg3);
                }
            }
        }
        if (arg4 != -7836) {
            field4942 = -68;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method2071(int arg0) {
        field4945 = null;
        if (arg0 == 30959) {
            field4943 = null;
        }
    }

    static {
        new class309("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        new class309("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
