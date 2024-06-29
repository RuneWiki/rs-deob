import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field782 = 0;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field788 = 0;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Z")
    public static boolean field773 = false;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Lje;")
    public static class67 field777 = null;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lje;")
    public static class67 field786 = class85.method592(255, "p12_full");

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lje;")
    private static class67 field784 = class85.method592(255, "Checking for updates )2 ");

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lje;")
    private static class67 field787 = class85.method592(255, "glow3:");

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lje;")
    public static class67 field780 = field784;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lje;")
    public static class67 field768 = field787;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lje;")
    public static class67 field779 = field787;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lob;")
    public static class99 field771 = new class99(100);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lpa;")
    public class105 field767;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lpa;")
    public class105 field774;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public static boolean field765;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "[I")
    public static int[] field783;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method271(int arg0) {
        field787 = null;
        field783 = null;
        field777 = null;
        field779 = null;
        field784 = null;
        if (arg0 < 77) {
            method271(70);
        }
        field780 = null;
        field786 = null;
        field771 = null;
        field768 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lje;")
    public static final class67 method272(int arg0, int arg1) {
        field766++;
        if (arg0 < arg1) {
            return class49.method314(new class67[] { class84.field1874, class60.method420(arg0, 28498), class115.field2607 }, arg1 - 100000);
        } else if (arg0 < 10000000) {
            return class49.method314(new class67[] { class112.field2518, class60.method420(arg0 / 1000, arg1 - 71502), class141.field3186, class115.field2607 }, 0);
        } else {
            return class49.method314(new class67[] { class104.field2360, class60.method420(arg0 / 1000000, arg1 ^ 0x1E9F2), class83.field1835, class115.field2607 }, 0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
    public static final void method273(boolean arg0, int arg1) {
        class67.method485(-2);
        class61.field1222++;
        field772++;
        if (class61.field1222 < 50 && !arg0 || arg1 != 7) {
            return;
        }
        class61.field1222 = 0;
        if (class143.field3289 || class104.field2367 == null) {
            return;
        }
        class69.field1399.method285(7, (byte) 64);
        try {
            class104.field2367.method842(class69.field1399.field1991, class69.field1399.field2043, -128, 0);
            class69.field1399.field2043 = 0;
        } catch (IOException var2) {
            class143.field3289 = true;
        }
        class141.field3202++;
    }
}
