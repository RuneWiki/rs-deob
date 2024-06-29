import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class303 extends class242 {

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3925 = new String[100];

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Lup;")
    public static class275 field3921;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "[Lf;")
    public static class404[] field3927;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Lrr;", line = 6)
    public static final class303 method1814(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7497;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIBIII)V", line = 14)
    public static final void method1815(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3928++;
        if (arg2 > -38) {
            method1814(26, 1, -85);
        }
        if (arg3 > class456.field6365 || arg0 < class418.field5559) {
            return;
        }
        boolean var6;
        if (class65.field827 > arg5) {
            var6 = false;
            arg5 = class65.field827;
        } else if (arg5 > class281.field3589) {
            arg5 = class281.field3589;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg4 < class65.field827) {
            arg4 = class65.field827;
            var7 = false;
        } else if (class281.field3589 >= arg4) {
            var7 = true;
        } else {
            arg4 = class281.field3589;
            var7 = false;
        }
        if (arg3 < class418.field5559) {
            arg3 = class418.field5559;
        } else {
            class183.method1212(arg1, class333.field4265[arg3++], true, arg5, arg4);
        }
        if (arg0 > class456.field6365) {
            arg0 = class456.field6365;
        } else {
            class183.method1212(arg1, class333.field4265[arg0--], true, arg5, arg4);
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg0; var8++) {
                int[] var9 = class333.field4265[var8];
                var9[arg5] = var9[arg4] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg3; var10 <= arg0; var10++) {
                class333.field4265[var10][arg5] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg3; var11 <= arg0; var11++) {
                class333.field4265[var11][arg4] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)V", line = 121)
    public static void method1816(int arg0) {
        if (arg0 == 0) {
            field3925 = null;
            field3927 = null;
            field3921 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)[Ljd;", line = 141)
    public static final class408[] method1817(byte arg0) {
        if (arg0 < 103) {
            method1814(-29, 69, -86);
        }
        field3920++;
        return new class408[] { class185.field2429, class365.field4700, class221.field2845, class275.field3490, class407.field5458, class179.field2303, class325.field4178, class23.field418, class497.field7289, class70.field861, class308.field3961, class300.field3891, class520.field7689, class475.field6949 };
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)Z", line = 152)
    public static final boolean method1818(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3922++;
        if (arg2 != -19236) {
            method1818(58, -30, -32, 25, -6);
        }
        if ((class8.field76[0][arg3][arg0] & 0x2) != 0) {
            return true;
        } else if ((class8.field76[arg4][arg3][arg0] & 0x10) == 0) {
            return class98.method670(17629, arg4, arg3, arg0) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLrn;ZIILqa;I)V", line = 174)
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        field3932++;
        if (arg0 != 91) {
            this.field3931 = -63;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)Z", line = 185)
    public final boolean method177(int arg0) {
        field3934++;
        if (arg0 != 5) {
            this.field3931 = 16;
        }
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIIII)V", line = 202)
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3926 = arg0;
        this.field3933 = arg3;
        this.field3929 = arg2;
        this.field3919 = arg1;
        this.field3931 = arg4;
        this.field3924 = arg5;
        this.field3930 = arg6;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 216)
    public final void method173(byte arg0) {
        field3923++;
        if (arg0 == -32) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)I")
    public abstract int method1131(byte arg0);
}
