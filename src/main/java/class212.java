import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class212 extends class264 {

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "Lsi;")
    public static class583 field3068 = new class583();

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "Lke;")
    public static class622 field3069 = new class622(119, -1);

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "Lo;")
    public static class31 field3073 = new class31(128);

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tw", name = "v", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "Lle;")
    public static class321 field3072;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            return -82;
        } else {
            ++field3071;
            return 1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILmfa;)V")
    public class212(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)I")
    public final int method1488(byte arg0) {
        if (arg0 > -31) {
            return 125;
        } else {
            ++field3064;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        ++field3066;
        if (arg0 >= -114) {
            method1489((byte) 71);
        }
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(B)V")
    public static void method1489(byte arg0) {
        if (arg0 >= 114) {
            field3073 = null;
            field3072 = null;
            field3069 = null;
            field3068 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field3074;
        if (arg0 != 112) {
            return -34;
        } else {
            return ~arg1 != -1 && super.field3731.field9030.method661((byte) -45) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)Lmha;")
    public static final class433 method1490(int arg0, int arg1) {
        ++field3067;
        class433 var2 = (class433) field3073.method220((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class264.field3732.method3150(0, 104, arg0);
            if (var3 != null && ~var3.length < -2) {
                class433 var4;
                try {
                    var4 = class147.method1013(var3, (byte) -109);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg0);
                }
                if (arg1 <= 116) {
                    method1490(84, 11);
                }
                field3073.method221(var4, false, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lmfa;)V")
    public class212(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)Z")
    public final boolean method1491(int arg0) {
        if (arg0 != 14996) {
            field3068 = null;
        }
        ++field3075;
        return true;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (~super.field3733 != -1 && ~super.field3731.field9030.method661((byte) -42) != -2) {
            super.field3733 = 0;
        }
        ++field3065;
        int var2 = -49 / ((1 - arg0) / 41);
        if (~super.field3733 > -1 || ~super.field3733 < -2) {
            super.field3733 = this.method663((byte) -38);
        }
    }
}
