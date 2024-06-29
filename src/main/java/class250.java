import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class250 extends class259 {

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3777 = "Loading wordpack - ";

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[I")
    public static int[] field3786 = new int[128];

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field3780 = 0;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public static void method1721(int arg0) {
        int var1 = 82 % ((-arg0 - 49) / 36);
        field3777 = null;
        field3786 = null;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)Z")
    public final boolean method1722(int arg0) {
        field3778++;
        if (arg0 != -1) {
            method1721(106);
        }
        return ((this.field3789 & 0x53669176) >> 30) != 0;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)Z")
    public final boolean method1723(int arg0) {
        field3775++;
        int var2 = 75 / ((arg0 + 7) / 45);
        return (this.field3789 & 0x19291303) >> 28 != 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
    public final int method1724(byte arg0) {
        field3791++;
        return arg0 < 116 ? 63 : class100.method789(this.field3789, (byte) 76);
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)Z")
    public final boolean method1725(int arg0) {
        field3783++;
        int var2 = 10 / ((8 - arg0) / 54);
        return (this.field3789 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)Z")
    public final boolean method1726(int arg0) {
        if (arg0 == 7) {
            field3782++;
            return (this.field3789 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "(I)Z")
    public final boolean method1727(int arg0) {
        field3774++;
        if (arg0 == -599347940) {
            return (this.field3789 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Z")
    public final boolean method1728(boolean arg0) {
        field3788++;
        if (arg0) {
            return (this.field3789 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
    public final int method1729(byte arg0) {
        if (arg0 >= -10) {
            field3786 = null;
        }
        field3779++;
        return this.field3789 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "(I)Z")
    public final boolean method1730(int arg0) {
        field3785++;
        if (arg0 >= -85) {
            field3786 = null;
        }
        return (this.field3789 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(II)V")
    public class250(int arg0, int arg1) {
        this.field3781 = arg1;
        this.field3789 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
    public static final int method1731(int arg0, int arg1) {
        field3784++;
        if (arg0 < 119) {
            field3777 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)Z")
    public final boolean method1732(int arg0, byte arg1) {
        if (arg1 < 10) {
            this.method1729((byte) 58);
        }
        field3790++;
        return (this.field3789 >> arg0 + 1 & 0x1) != 0;
    }
}
