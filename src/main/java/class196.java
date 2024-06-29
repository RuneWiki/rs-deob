import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class196 extends class104 {

    @OriginalMember(owner = "client!j", name = "I", descriptor = "[B")
    public byte[] field3509;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "[S")
    public static short[] field3505 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!j", name = "A", descriptor = "[I")
    public static int[] field3502 = new int[4096];

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Le;")
    private static class191 field3508 = class54.method368("green:", 2047);

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Z")
    public static boolean field3507 = true;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Le;")
    public static class191 field3501 = field3508;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Le;")
    public static class191 field3506 = field3508;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 < 47) {
            return;
        }
        field3503++;
        int var9 = arg8 - arg2;
        int var10 = arg5 - arg3;
        int var11 = (arg4 - arg7 << 16) / var10;
        int var12 = (arg6 - arg1 << 16) / var9;
        class243.method1702(arg1, 0, arg7, arg8, arg5, arg2, 0, var12, (byte) -104, arg3, var11);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static void method1384(byte arg0) {
        field3506 = null;
        if (arg0 == -28) {
            field3508 = null;
            field3505 = null;
            field3502 = null;
            field3501 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIILbe;JZ)V")
    public static final void method1385(int arg0, int arg1, int arg2, int arg3, class16 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class257 var8 = new class257();
        var8.field4562 = arg4;
        var8.field4560 = arg1 * 128 + 64;
        var8.field4564 = arg2 * 128 + 64;
        var8.field4567 = arg3;
        var8.field4566 = arg5;
        if (class201.field3608[arg0][arg1][arg2] == null) {
            class201.field3608[arg0][arg1][arg2] = new class199(arg0, arg1, arg2);
        }
        class201.field3608[arg0][arg1][arg2].field3556 = var8;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1386(int arg0, int arg1) {
        field3510++;
        class241 var2 = class14.method97(7, arg1, -117);
        var2.method1691(arg0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
    public class196(byte[] arg0) {
        this.field3509 = arg0;
    }
}
