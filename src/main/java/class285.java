import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class285 extends class381 {

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public int field3795 = 0;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public int field3797 = -1;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3798 = new Hashtable();

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "Lmh;")
    public static class139 field3809 = new class139(9, 2);

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "Liba;")
    public static class211 field3811 = new class211(17, 8);

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 3)
    public static void method1684(int arg0) {
        if (arg0 != -3) {
            method1684(-52);
        }
        field3809 = null;
        field3811 = null;
        field3798 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)I", line = 31)
    public static final int method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & arg4;
        field3796++;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg1;
        } else {
            return -arg2 - (arg5 - 1 - 7);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLgk;)Ljava/lang/String;", line = 70)
    public static final String method1686(byte arg0, class540 arg1) {
        field3800++;
        return arg0 > -24 ? null : class614.method3497(32767, -105, arg1);
    }
}
