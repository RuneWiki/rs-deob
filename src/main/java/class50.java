import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class50 extends class130 {

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Lnv;")
    public static class44 field768 = new class44();

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "Lpn;")
    public static class49 field770 = new class49(12, 3);

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Ljp;")
    public static class55 field773;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Let;")
    public static class470 field774;

    static {
        new class179(null, "geschickt werden.", null, null);
        field773 = new class55(42, -1);
        field775 = 0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)V", line = 6)
    public static final void method329(int arg0, int arg1, boolean arg2) {
        field772++;
        class100 var3 = class48.method323(Integer.MIN_VALUE, arg2, arg0);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field1532.length; var4++) {
                var3.field1532[var4] = -1;
                var3.field1534[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V", line = 40)
    public class50() {
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I)V", line = 48)
    public class50(int arg0) {
        this.field771 = arg0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 57)
    public static final void method330(boolean arg0, String arg1) {
        if (!arg0) {
            field767++;
            System.out.println("Error: " + class30.method186("\n", arg1, "%0a", (byte) 123));
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 69)
    public static void method331(byte arg0) {
        if (arg0 < 124) {
            method330(false, null);
        }
        field773 = null;
        field768 = null;
        field774 = null;
        field770 = null;
    }
}
