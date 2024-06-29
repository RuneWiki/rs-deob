import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class230 extends class71 {

    @OriginalMember(owner = "client!i", name = "N", descriptor = "[I")
    public int[] field3682 = new int[5];

    @OriginalMember(owner = "client!i", name = "T", descriptor = "[Ltf;")
    public class271[] field3687 = new class271[5];

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public int field3681 = 0;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "F")
    public static float field3664;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Lmh;")
    public class145 field3678;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lql;")
    public class19 field3676;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Li;")
    public class230 field3672;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Llk;")
    public class293 field3670;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lkb;")
    public static class39 field3665;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Lul;")
    public class49 field3675;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Lvh;")
    public class59 field3689;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lbj;")
    public class61 field3685;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Z")
    public boolean field3674;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Z")
    public boolean field3679;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
    public boolean field3690;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "[I")
    public static int[] field3666;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 4)
    public static void method1662(int arg0) {
        field3665 = null;
        field3666 = null;
        if (arg0 != 13566) {
            method1662(117);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)V", line = 17)
    public static final void method1663(int arg0, int arg1, boolean arg2) {
        class179 var3 = class319.method2220(arg1, (byte) -91, 5);
        if (arg2) {
            field3663++;
            var3.method1242((byte) 95);
            var3.field2897 = arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V", line = 36)
    public class230(int arg0, int arg1, int arg2) {
        this.field3686 = this.field3683 = arg0;
        this.field3673 = arg1;
        this.field3688 = arg2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V", line = 62)
    public static final void method1664(int arg0, byte arg1) {
        class325.field5072 = arg0;
        class114.method793(3, 0);
        if (arg1 < 25) {
            field3665 = (class39) null;
        }
        field3677++;
        class114.method793(4, 0);
    }
}
