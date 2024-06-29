import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class143 extends class145 {

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field3595 = 99;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lp;")
    public static class104 field3592 = new class104(64);

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Lfc;")
    public static class39 field3600 = class90.method774("oder benutzen Sie eine andere Welt)3", -93);

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lfc;")
    public static class39 field3599 = class90.method774("Abbrechen", -83);

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Loc;")
    public static class100 field3598;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lue;")
    public static class141 field3594;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Lfc;")
    public class39 field3597;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 14)
    public static void method1162(int arg0) {
        field3598 = null;
        field3600 = null;
        if (arg0 != 50) {
            method1163(false, false);
        }
        field3599 = null;
        field3592 = null;
        field3594 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZ)V", line = 52)
    public static final void method1163(boolean arg0, boolean arg1) {
        field3596++;
        if (arg0) {
            method1162(81);
        }
        class121.method1036((byte) 61);
        class3.field81++;
        if (class3.field81 < 50 && !arg1) {
            return;
        }
        class3.field81 = 0;
        if (class28.field804 || class115.field3015 == null) {
            return;
        }
        class79.field1794.method393((byte) -14, 10);
        try {
            class115.field3015.method1140(true, class79.field1794.field710, 0, class79.field1794.field711);
            class79.field1794.field710 = 0;
        } catch (IOException var2) {
            class28.field804 = true;
        }
        class42.field1135++;
    }
}
