import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class187 extends class51 {

    @OriginalMember(owner = "client!uh", name = "hb", descriptor = "[I")
    public static int[] field3717 = new int[1000];

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "Lrc;")
    public static class155 field3711 = new class155(200);

    @OriginalMember(owner = "client!uh", name = "nb", descriptor = "Lea;")
    public static class38 field3723 = class9.method46((byte) 126, "");

    @OriginalMember(owner = "client!uh", name = "pb", descriptor = "Lea;")
    public static class38 field3725 = field3723;

    @OriginalMember(owner = "client!uh", name = "lb", descriptor = "Lea;")
    public static class38 field3721 = field3723;

    @OriginalMember(owner = "client!uh", name = "ob", descriptor = "Lea;")
    public static class38 field3724 = field3723;

    @OriginalMember(owner = "client!uh", name = "jb", descriptor = "Lea;")
    public static class38 field3719 = field3723;

    @OriginalMember(owner = "client!uh", name = "kb", descriptor = "Lea;")
    public static class38 field3720 = field3723;

    @OriginalMember(owner = "client!uh", name = "rb", descriptor = "Lea;")
    public static class38 field3727 = field3723;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!uh", name = "qb", descriptor = "Lgg;")
    public static class61 field3726;

    @OriginalMember(owner = "client!uh", name = "ib", descriptor = "[I")
    public static int[] field3718;

    @OriginalMember(owner = "client!uh", name = "mb", descriptor = "[Lfa;")
    public static class47[] field3722;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ls;ILob;Z)V")
    public static final void method1257(class161 arg0, int arg1, class127 arg2, boolean arg3) {
        ++field3715;
        if (arg3) {
            method1257((class161) null, 120, (class127) null, false);
        }
        byte[] var4 = null;
        class141 var5 = class188.field3756;
        synchronized (class188.field3756) {
            for (class36 var6 = (class36) class188.field3756.method1020(0); var6 != null; var6 = (class36) class188.field3756.method1027((byte) 54)) {
                if ((long) arg1 == var6.field2172 && var6.field753 == arg0 && ~var6.field754 == -1) {
                    var4 = var6.field750;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg2.method947(arg1, true, -115, arg0, var4);
        } else {
            byte[] var7 = arg0.method1160(arg1, -117);
            arg2.method947(arg1, true, 90, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1258(boolean arg0, int arg1) {
        ++field3712;
        if (!arg0) {
            field3724 = null;
        }
        return (arg1 & 2407715) >> 21 != 0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIBIII)I")
    public static final int method1259(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field3710;
        if (~(arg4 & 1) == -2) {
            int var7 = arg1;
            arg1 = arg2;
            arg2 = var7;
        }
        int var8 = arg6 & 3;
        if (var8 == 0) {
            return arg5;
        } else if (arg3 != -38) {
            return -96;
        } else if (var8 == 1) {
            return arg0;
        } else {
            return ~var8 == -3 ? -arg1 - -1 + (7 - arg5) : -arg0 + 7 + -arg2 + 1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)V")
    public static void method1260(int arg0) {
        field3724 = null;
        field3717 = null;
        field3722 = null;
        field3721 = null;
        field3718 = null;
        field3723 = null;
        field3720 = null;
        field3726 = null;
        if (arg0 != -1) {
            method1258(true, -10);
        }
        field3711 = null;
        field3725 = null;
        field3719 = null;
        field3727 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int[] var3 = super.field1312.method827(arg1, true);
        ++field3716;
        if (arg0 > -125) {
            method1258(true, 8);
        }
        if (super.field1312.field2271) {
            int var4 = class170.field3490[arg1];
            for (int var5 = 0; var5 < class86.field2008; ++var5) {
                var3[var5] = this.method1262(-126, var4, class196.field3854[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "(I)V")
    public static final void method1261(int arg0) {
        for (int var1 = -1; ~class50.field1247 < ~var1; ++var1) {
            int var2;
            if (var1 != -1) {
                var2 = class65.field1556[var1];
            } else {
                var2 = 2047;
            }
            class144 var3 = class175.field3550[var2];
            if (var3 != null) {
                class17.method98(1, var3, 105);
            }
        }
        ++field3709;
        if (arg0 >= -121) {
            method1258(true, 16);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)I")
    private final int method1262(int arg0, int arg1, int arg2) {
        ++field3713;
        int var4 = arg2 - -(arg1 * 57);
        int var5 = -25 % ((-7 - arg0) / 62);
        int var6 = var4 ^ var4 << 1;
        return -(((var6 * 15731 * var6 - -789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
