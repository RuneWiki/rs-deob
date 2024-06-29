import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class752 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "[Lmk;")
    public static class56[] field10496 = new class56[14];

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field10499 = new String[100];

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "Lkr;")
    public static class748 field10498;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
    public static void method4182(boolean arg0) {
        if (!arg0) {
            method4183(12, -114, -3);
        }
        field10499 = null;
        field10498 = null;
        field10496 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)I")
    public static final int method4183(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field10497++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 != 126) {
            field10498 = null;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
