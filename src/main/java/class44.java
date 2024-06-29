import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class44 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "S")
    public static short field808 = 320;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lqj;")
    public static class147 field804;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lqh;")
    public static class201 field806;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[[[B")
    public static byte[][][] field811;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method361(int arg0) {
        field804 = null;
        field811 = null;
        if (arg0 != 1) {
            method363(6);
        }
        field806 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lvd;Lvd;Z)V")
    public static final void method362(class4 arg0, class4 arg1, boolean arg2) {
        field809++;
        if (arg1.field55 != null) {
            arg1.method40(0);
        }
        arg1.field55 = arg0;
        arg1.field52 = arg0.field52;
        arg1.field55.field52 = arg1;
        arg1.field52.field55 = arg1;
        if (!arg2) {
            field806 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method363(int arg0) {
        if (arg0 != 320) {
            field808 = 29;
        }
        class214.field3502 = new class204(32);
        field810++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLog;)Ljava/lang/String;")
    public static final String method364(byte arg0, class221 arg1) {
        field807++;
        return arg0 <= 74 ? null : class226.method1594((byte) 45, arg1, 32767);
    }
}
