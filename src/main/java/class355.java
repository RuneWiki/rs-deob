import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class355 extends class264 {

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[S")
    private static short[] field5157 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[S")
    private static short[] field5162 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[S")
    private static short[] field5163 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "[[S")
    public static short[][] field5161 = new short[][] { field5157, field5162, field5163 };

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method2233(int arg0) {
        field5163 = null;
        field5162 = null;
        field5161 = null;
        if (arg0 != 2) {
            field5163 = null;
        }
        field5157 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field5158;
        if (arg0 != 112) {
            this.method663((byte) 109);
        }
        if (super.field3731.method3639(true) == class234.field3384) {
            if (super.field3731.method3633(107)) {
                return 3;
            } else {
                return ~arg1 != -1 && ~super.field3731.field9030.method661((byte) -122) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lmfa;)V")
    public class355(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Z")
    public final boolean method2234(int arg0) {
        ++field5159;
        if (super.field3731.method3639(true) == class234.field3384) {
            return !super.field3731.method3633(arg0 ^ 15102);
        } else {
            if (arg0 != 14996) {
                field5163 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(ILmfa;)V")
    public class355(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (super.field3731.method3639(true) == class234.field3384) {
            if (super.field3731.method3633(92)) {
                super.field3733 = 0;
            }
        } else {
            super.field3733 = 1;
        }
        ++field5164;
        int var2 = -73 / ((1 - arg0) / 41);
        if (~super.field3733 != -1 && ~super.field3733 != -2) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I")
    public final int method2235(byte arg0) {
        ++field5165;
        if (arg0 >= -31) {
            field5162 = null;
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            field5162 = null;
        }
        ++field5156;
        return 1;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            field5157 = null;
        }
        ++field5160;
        super.field3733 = arg1;
    }
}
