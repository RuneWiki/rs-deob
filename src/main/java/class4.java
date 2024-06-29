import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class4 extends class12 {

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "S")
    public short field73 = -32768;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Lkb;")
    public static class93 field61 = class76.method390("leuchten1:", 0);

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lkb;")
    private static class93 field60 = class76.method390("This computers address has been blocked", 0);

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lkb;")
    public static class93 field67 = field60;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Lkb;")
    public static class93 field66 = class76.method390("event_opbase", 0);

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lkb;")
    private static class93 field64 = class76.method390("Press (Wrecover a locked account(W on front page)3", 0);

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Lkb;")
    private static class93 field65 = class76.method390("You can(Wt add yourself to your own friend list)3", 0);

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lkb;")
    public static class93 field59 = field64;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Lkb;")
    public static class93 field72 = field65;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lkb;")
    public static class93 field69 = class76.method390(")1", 0);

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
    public static void method20(byte arg0) {
        field72 = null;
        field60 = null;
        field67 = null;
        field69 = null;
        field65 = null;
        if (arg0 > -37) {
            method20((byte) 13);
        }
        field64 = null;
        field66 = null;
        field61 = null;
        field59 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)Lfd;")
    public class52 method21(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field68++;
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)V")
    public static final void method22(boolean arg0) {
        class142.field2784.method981((byte) -92);
        if (!arg0) {
            method22(true);
        }
        class24.field365 = 1;
        class101.field1852 = null;
        field62++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V")
    public void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class52 var10 = this.method21(false);
        if (var10 != null) {
            var10.method23(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field73 = var10.field73;
        }
        field63++;
    }
}
