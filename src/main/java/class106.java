import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class106 extends class163 {

    @OriginalMember(owner = "client!g", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field1666;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Lao;")
    public static class188 field1664 = new class188(43, -1);

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1668;

    static {
        new class180("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V", line = 8)
    public static void method799(byte arg0) {
        field1664 = null;
        if (arg0 != 122) {
            method799((byte) -119);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lqo;Ljava/lang/Object;I)V", line = 19)
    public class106(class19 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1666 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 27)
    public final Object method800(byte arg0) {
        if (arg0 == 36) {
            field1668++;
            return this.field1666;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)Z", line = 38)
    public final boolean method801(int arg0) {
        field1667++;
        return arg0 != -3201;
    }
}
