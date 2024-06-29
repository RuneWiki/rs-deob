import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class494 extends class310 {

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Lwn;")
    public class617 field6918;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "S")
    public static short field6917 = 1;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lh;")
    public static class571 field6915 = new class571(64);

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Ltl;")
    public static class531 field6920;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Z")
    public static boolean field6921;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6922;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Lqa;")
    public static class207 field6919;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public static void method2869(byte arg0) {
        field6922 = null;
        field6920 = null;
        int var1 = 18 % ((-arg0 - 53) / 48);
        field6919 = null;
        field6915 = null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lwr;II[B)V")
    public class494(class388 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6918 = arg0.method2327(-20920, arg2, class519.field7310, false, arg1, arg3);
        this.field6918.method1812(false, false, -21501);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lwr;II[I)V")
    public class494(class388 arg0, int arg1, int arg2, int[] arg3) {
        this.field6918 = arg0.method2322(arg2, arg3, arg1, 8, false);
        this.field6918.method1812(false, false, -21501);
    }

    static {
        new class104("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field6920 = new class531("WTRC", 1);
        field6921 = true;
        field6922 = null;
    }
}
