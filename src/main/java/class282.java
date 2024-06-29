import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class282 {

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lbd;")
    public static class162 field4796 = class17.method142(0, "::rect_debug");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lda;")
    public static class143 field4793;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 12)
    public static void method1958(int arg0) {
        field4793 = null;
        field4796 = null;
        if (arg0 != 0) {
            method1958(17);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 26)
    public static final void method1959(int arg0, int arg1) {
        if (arg1 != 0) {
            field4793 = (class143) null;
        }
        field4790++;
        class153.field2717.method1538(arg0, (byte) -58);
        class17.field281.method1538(arg0, (byte) -91);
        class223.field3718.method1538(arg0, (byte) -34);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method1960(int arg0, boolean arg1) {
        class80.field1388.method1538(arg0, (byte) -16);
        field4791++;
        if (!arg1) {
            method1960(-56, false);
        }
    }
}
