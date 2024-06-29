import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class143 {

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Lbt;")
    public static class39 field2006 = new class39("stellardawn", 1);

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Ltda;")
    public static class546 field2007 = new class546(0, 2, 2, 1);

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2008 = -1;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "F")
    public static float field2009;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lkca;I)V")
    public static final void method975(class73 arg0, int arg1) {
        field2004++;
        if (arg0.field998 != null) {
            arg0.field998.field9067 = 0;
        }
        arg0.field996 = false;
        for (class73 var2 = arg0.method256(); var2 != null; var2 = arg0.method257()) {
            method975(var2, -111);
        }
        if (arg1 > -71) {
            field2006 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method976(int arg0) {
        if (arg0 != -22160) {
            method977(-3, -31, 125);
        }
        field2007 = null;
        field2006 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)Z")
    public static final boolean method977(int arg0, int arg1, int arg2) {
        field2005++;
        int var3 = -56 / ((-arg0 - 35) / 58);
        return class460.method2786(-90, arg2, arg1) | (arg1 & 0x40000) != 0 || class444.method2666(-13624, arg1, arg2);
    }
}
