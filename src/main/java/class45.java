import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 extends class232 {

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public int field769 = 0;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "Lok;")
    public static class146 field766 = class235.method1724(-12908, "Null");

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "Lok;")
    public static class146 field768 = class235.method1724(-12908, "ondulation2:");

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "Lok;")
    public static class146 field767 = class235.method1724(-12908, "::replacecanvas");

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "Lok;")
    public static class146 field771 = class235.method1724(-12908, "clignotant1:");

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lok;", line = 5)
    public static final class146 method311(int arg0, byte arg1) {
        if (arg1 == 110) {
            field772++;
            return class214.field3525[arg0].method1094((byte) -122) <= 0 ? class227.field3782[arg0] : class112.method758(121, new class146[] { class227.field3782[arg0], class83.field1320, class214.field3525[arg0] });
        } else {
            return (class146) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lwe;B)V", line = 23)
    public final void method312(class47 arg0, byte arg1) {
        if (arg1 < 52) {
            method311(-71, (byte) 86);
        }
        while (true) {
            int var3 = arg0.method368(41);
            if (var3 == 0) {
                field770++;
                return;
            }
            this.method314(var3, -3, arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 70)
    public static void method313(boolean arg0) {
        field771 = null;
        field768 = null;
        field767 = null;
        field766 = null;
        if (!arg0) {
            method311(-90, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILwe;)V", line = 85)
    private final void method314(int arg0, int arg1, class47 arg2) {
        if (~arg0 == arg1) {
            this.field769 = arg2.method379(-2);
        }
        field773++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Loh;II)Ltg;", line = 105)
    public static final class307 method315(class15 arg0, int arg1, int arg2) {
        int var3 = 78 % ((-arg2 - 53) / 41);
        field765++;
        return class52.method426(0, arg1, arg0) ? class22.method157(0) : null;
    }
}
