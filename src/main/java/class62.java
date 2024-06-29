import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class62 extends class304 {

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field825 = "Allocating memory";

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "[I")
    public static int[] field832 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "Ljava/lang/String;")
    public static String field830 = "Loading title screen - ";

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field827 = -1;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field834 = "M";

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I", line = 23)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            field830 = (String) null;
        }
        field831++;
        return class162.field2631;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V", line = 35)
    public static final void method426(byte arg0) {
        class4.field45.method750((byte) 94);
        field833++;
        int var1 = -55 % ((-arg0 - 62) / 40);
        class95.field1353.method750((byte) 77);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILfc;JZ)V", line = 48)
    public static final void method427(int arg0, int arg1, int arg2, int arg3, class110 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class341 var8 = new class341();
        var8.field5305 = arg4;
        var8.field5304 = arg1 * 128 + 64;
        var8.field5302 = arg2 * 128 + 64;
        var8.field5295 = arg3;
        var8.field5292 = arg5;
        var8.field5291 = arg6;
        if (class213.field3262[arg0][arg1][arg2] == null) {
            class213.field3262[arg0][arg1][arg2] = new class79(arg0, arg1, arg2);
        }
        class213.field3262[arg0][arg1][arg2].field1179 = var8;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V", line = 68)
    public static void method428(boolean arg0) {
        field832 = null;
        field830 = null;
        field834 = null;
        if (!arg0) {
            field834 = (String) null;
        }
        field825 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 85)
    public class62() {
        super(0, true);
    }
}
