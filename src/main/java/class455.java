import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class455 {

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Ls;")
    public static class186 field6757 = new class186(49, -1);

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Lph;")
    public static class459 field6758;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Lak;", line = 3)
    public static final class234 method2715(int arg0, int arg1, int arg2) {
        if (class518.field7511[arg0][arg1][arg2] == null) {
            boolean var3 = class518.field7511[0][arg1][arg2] != null && class518.field7511[0][arg1][arg2].field3621 != null;
            if (var3 && arg0 >= class138.field2320 - 1) {
                return null;
            }
            class52.method486(arg0, arg1, arg2);
        }
        return class518.field7511[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 28)
    public static void method2716(int arg0) {
        field6757 = null;
        field6758 = null;
        if (arg0 != 28923) {
            method2718(91, 58, 63);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZZII)I", line = 41)
    public static final int method2717(boolean arg0, boolean arg1, int arg2, int arg3) {
        field6759++;
        class11 var4 = class271.method1714(arg3, 0, arg1);
        if (var4 == null) {
            return 0;
        } else {
            if (arg0) {
                method2718(-85, -7, -118);
            }
            return arg2 >= 0 && arg2 < var4.field149.length ? var4.field149[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(III)Z", line = 61)
    public static final boolean method2718(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2716(70);
        }
        field6760++;
        return (arg2 & 0x20) != 0;
    }
}
