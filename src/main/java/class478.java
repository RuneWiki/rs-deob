import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class478 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lsk;")
    public static class423 field7306 = new class423("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field7310 = 100;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[I")
    public static int[] field7308 = new int[200];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Llt;")
    public static class458 field7307;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBZ)Ljd;", line = 11)
    public static final class146 method2889(int arg0, byte arg1, boolean arg2) {
        field7305++;
        if (arg1 == 27) {
            long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
            return (class146) class206.field3237.method2409(false, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 24)
    public static void method2890(byte arg0) {
        field7308 = null;
        field7307 = null;
        field7306 = null;
        if (arg0 != -115) {
            field7306 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IFIIIIIZ)[I", line = 38)
    public static final int[] method2891(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field7309++;
        int[] var8 = new int[arg4];
        class369 var9 = new class369();
        var9.field5429 = (int) (arg1 * 4096.0F);
        var9.field5410 = arg0;
        var9.field5418 = arg6;
        var9.field5420 = arg5;
        var9.field5427 = arg7;
        var9.field5416 = arg3;
        var9.method211(-3);
        class223.method1355(1, arg4, (byte) 14);
        var9.method2235(var8, (byte) 99, 0);
        return arg2 == 200 ? var8 : null;
    }
}
