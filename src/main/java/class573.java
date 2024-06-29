import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class573 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lmga;")
    public static class30 field7904 = new class30("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lst;")
    public static class335 field7907 = new class335(33, -1);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7908 = new String[200];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
    public static final int method3357(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class515.field7130 - 1; var2++) {
            if (arg0 < class454.field6293[var2] + class159.field2223[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class515.field7130 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method3358(int arg0) {
        field7908 = null;
        if (arg0 == 1) {
            field7904 = null;
            field7907 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public static final void method3359(int arg0) {
        if (arg0 != 19654) {
            method3359(100);
        }
        for (int var1 = 0; var1 < class12.field108; var1++) {
            class396 var2 = class669.field9235[var1];
            if (var2.field5690 == 3) {
                if (var2.field5688 == null) {
                    var2.field5699 = Integer.MIN_VALUE;
                } else {
                    class483.field6739.method361(var2.field5688);
                }
            }
        }
        field7905++;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static final void method3360(int arg0) {
        field7906++;
        if (arg0 <= 41) {
            method3360(-58);
        }
        if (class102.field1401 == 3) {
            class647.method3624(4, true);
        } else if (class102.field1401 == 7) {
            class647.method3624(8, true);
        } else if (class102.field1401 == 10) {
            class647.method3624(11, true);
            return;
        }
    }
}
