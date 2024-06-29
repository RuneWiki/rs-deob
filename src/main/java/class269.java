import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class269 {

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "Lfc;")
    public static class235 field3818 = new class235(36, 20);

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "B")
    public byte field3803;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "B")
    public byte field3806;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "B")
    public byte field3808;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "B")
    public byte field3809;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "B")
    public byte field3810;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "B")
    public byte field3814;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "B")
    public byte field3820;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "S")
    public short field3817;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "Z")
    public boolean field3805;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "Z")
    public boolean field3807;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "Z")
    public boolean field3813;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "Z")
    public boolean field3815;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "Z")
    public boolean field3819;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "Z")
    public boolean field3821;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "Z")
    public boolean field3822;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "Z")
    public boolean field3823;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "Z")
    public boolean field3824;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "Z")
    public boolean field3825;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
    public static void method1631(boolean arg0) {
        if (!arg0) {
            method1633(null, (byte) -107);
        }
        field3818 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIBII)Z")
    public static final boolean method1632(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3812++;
        if ((class246.field3501[0][arg0][arg3] & 0x2) != 0) {
            return true;
        } else if ((class246.field3501[arg4][arg0][arg3] & 0x10) == 0) {
            if (arg2 != 48) {
                method1632(-107, -53, (byte) 122, -51, -114);
            }
            return arg1 == class83.method646(arg4, arg3, 9297, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Loa;B)V")
    public static final void method1633(class638 arg0, byte arg1) {
        field3811++;
        if (class131.field1794 == class253.field3576.field520) {
            return;
        }
        if (arg1 >= -24) {
            method1632(68, -88, (byte) 101, 23, -12);
        }
        if (class658.field9266 != null && class432.method2479(class253.field3576.field520, arg0, (byte) -90)) {
            class131.field1794 = class253.field3576.field520;
        }
    }
}
