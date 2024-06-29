import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class159 {

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lje;")
    private static class67 field3650 = class85.method592(255, "Loaded input handler");

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lje;")
    public static class67 field3646 = class85.method592(255, ": ");

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lje;")
    public static class67 field3653 = class85.method592(255, "Null");

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field3657 = 1;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lje;")
    public static class67 field3649 = class85.method592(255, "Texturen geladen)3");

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lje;")
    public static class67 field3658 = field3650;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lje;")
    private static class67 field3660 = class85.method592(255, "Walk here");

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lje;")
    public static class67 field3648 = field3660;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lq;")
    public static class111 field3647;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lkc;")
    public static class72 field3645;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public static int[] field3651;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1229(int arg0) {
        field3660 = null;
        field3651 = null;
        field3645 = null;
        field3653 = null;
        field3647 = null;
        if (arg0 > -104) {
            return;
        }
        field3658 = null;
        field3650 = null;
        field3646 = null;
        field3648 = null;
        field3649 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)[B")
    public abstract byte[] method535(int arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lkc;IZI)V")
    public static final void method1230(class72 arg0, int arg1, boolean arg2, int arg3) {
        field3659++;
        if (class46.field859 != null || class12.field222) {
            return;
        }
        if (!arg2) {
            method1230(null, -23, true, -109);
        }
        if (arg0 == null || class58.method408(arg0, -80) == null) {
            return;
        }
        class46.field859 = arg0;
        class81.field1788 = class58.method408(arg0, -18);
        class147.field3361 = arg3;
        class137.field3086 = 0;
        class25.field461 = arg1;
        class55.field1104 = false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIZZZ)Lua;")
    public static final class140 method1231(byte arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field3655++;
        if (arg0 != -58) {
            return null;
        }
        class50 var5 = null;
        if (class24.field444 != null) {
            var5 = new class50(arg1, class24.field444, class52.field1035[arg1], 1000000);
        }
        return new class140(var5, class133.field2939, arg1, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method1232(int arg0, int arg1) {
        field3652++;
        if (!class135.method1024(arg1, (byte) -15)) {
            return;
        }
        if (arg0 < 28) {
            field3660 = null;
        }
        class72[] var2 = class55.field1062[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class72 var4 = var2[var3];
            if (var4 != null) {
                var4.field1570 = 0;
                var4.field1545 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)V")
    public abstract void method534(int arg0, byte[] arg1);
}
