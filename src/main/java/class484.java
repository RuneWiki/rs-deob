import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class484 extends class609 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public int field6875;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Lnea;")
    public static class664 field6874 = new class664(4, -2);

    @OriginalMember(owner = "client!um", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field6879 = new String[100];

    @OriginalMember(owner = "client!um", name = "i", descriptor = "[C")
    public static char[] field6878 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!um", name = "k", descriptor = "[I")
    public static int[] field6880 = new int[1000];

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Z")
    public static boolean field6877 = true;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public static void method2816(boolean arg0) {
        field6878 = null;
        field6874 = null;
        field6880 = null;
        if (arg0) {
            field6879 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(I)V")
    public class484(int arg0) {
        this.field6875 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILfea;Lfea;)V")
    public static final void method2817(int arg0, int arg1, int arg2, class126 arg3, class126 arg4) {
        class40 var5 = class151.method1065(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field665 = arg3;
        var5.field662 = arg4;
        int var6 = class499.field7071 == class296.field4340 ? 1 : 0;
        if (!arg3.method1181(-1)) {
            class471.field6741[var6][class127.field1896[var6]++] = arg3;
        } else if (arg3.method1184(-122)) {
            class232.field3618[var6][class59.field1130[var6]++] = arg3;
        } else {
            class496.field7034[var6][class313.field4626[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method1181(-1)) {
            if (arg4.method1184(-70)) {
                class232.field3618[var6][class59.field1130[var6]++] = arg4;
                return;
            }
            class496.field7034[var6][class313.field4626[var6]++] = arg4;
            return;
        }
        class471.field6741[var6][class127.field1896[var6]++] = arg4;
    }
}
