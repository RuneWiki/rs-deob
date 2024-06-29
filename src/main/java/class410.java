import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class410 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public int field5799 = -1;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field5801 = -1;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lkd;")
    public static class190 field5802;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lhu;")
    public class88 field5798;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[I")
    public int[] field5796;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field5797;

    static {
        new class44("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2433(int arg0, int arg1, int arg2) {
        field5800++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class261 var3 = class277.field4139.method569((byte) 49, arg2);
        if (arg1 >= ~arg0 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1690(0, arg0);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 20)
    public static void method2434(byte arg0) {
        field5802 = null;
        if (arg0 > -86) {
            field5801 = 88;
        }
    }
}
