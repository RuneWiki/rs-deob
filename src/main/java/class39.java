import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class146 {

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lec;")
    public static class32 field931 = class73.method594("Keine Antwort vom Server)3", true);

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field937 = 0;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lec;")
    public static class32 field938 = class73.method594("mod_icons", true);

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Lec;")
    private static class32 field944 = class73.method594("flash2:", true);

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lec;")
    public static class32 field943 = field944;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lec;")
    public static class32 field932 = field944;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lec;")
    public class32 field930;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
    public static int[] field936;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[Lec;")
    public static class32[] field929;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
    public static final int method319(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field934++;
        if (arg2 != -12551) {
            method319(-114, 27, -65, -4);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static void method320(int arg0) {
        field936 = null;
        field944 = null;
        field943 = null;
        field938 = null;
        field932 = null;
        field931 = null;
        if (arg0 != 2) {
            field936 = null;
        }
        field929 = null;
    }
}
