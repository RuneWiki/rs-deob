import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class145 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3615 = 0;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lfc;")
    private static class39 field3611 = class90.method774("Username: ", -91);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
    public static long field3613 = 0L;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lfc;")
    public static class39 field3618 = class90.method774("Regeln versto-8en hat)3", -101);

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
    public static int[] field3623 = new int[100];

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lfc;")
    public static class39 field3625 = field3611;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
    public static int[] field3629 = new int[50];

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lfc;")
    public static class39 field3612 = class90.method774("mapedge", -100);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
    public long field3619;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Loc;")
    public static class100 field3617;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lvc;")
    public class145 field3624;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lvc;")
    public class145 field3631;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lca;")
    public static class16 field3610;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Ldc;")
    public static class25 field3627;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    public static int[] field3630;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1165(int arg0) {
        field3621++;
        class44.field1199 = null;
        class142.field3566 = null;
        class42.field1152 = null;
        class83.field1846 = null;
        class112.field2947 = null;
        if (arg0 != -12761) {
            field3627 = null;
        }
        class112.field2934 = null;
        class31.field870 = null;
        class29.field836 = null;
        class25.field724 = null;
        class16.field461 = null;
        class43.field1171 = null;
        class98.field2331 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 50)
    public static void method1166(byte arg0) {
        field3611 = null;
        field3629 = null;
        field3618 = null;
        field3625 = null;
        field3612 = null;
        field3623 = null;
        field3617 = null;
        if (arg0 > -23) {
            method1168(false, null, null, (byte) 123);
        }
        field3627 = null;
        field3630 = null;
        field3610 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Loc;Lfc;BLfc;)[Lue;", line = 75)
    public static final class141[] method1167(class100 arg0, class39 arg1, byte arg2, class39 arg3) {
        if (arg2 > -28) {
            return null;
        } else {
            field3609++;
            int var4 = arg0.method848(arg1, (byte) 89);
            int var5 = arg0.method834(arg3, false, var4);
            return class42.method499(var5, var4, arg0, -126);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLoc;Loc;B)V", line = 91)
    public static final void method1168(boolean arg0, class100 arg1, class100 arg2, byte arg3) {
        if (arg3 <= 14) {
            method1165(114);
        }
        class127.field3230 = arg2;
        field3614++;
        class149.field3701 = arg1;
        class30.field848 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIZZZ)Lmf;", line = 112)
    public static final class89 method1169(byte arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field3628++;
        if (arg0 != -61) {
            method1168(true, null, null, (byte) 107);
        }
        class120 var5 = null;
        if (field3610 != null) {
            var5 = new class120(arg1, field3610, class37.field1000[arg1], 1000000);
        }
        return new class89(var5, class109.field2802, arg1, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 139)
    public final void method1170(int arg0) {
        field3622++;
        if (this.field3624 == null) {
            return;
        }
        this.field3624.field3631 = this.field3631;
        this.field3631.field3624 = this.field3624;
        this.field3624 = null;
        if (arg0 < 0) {
            method1165(14);
        }
        this.field3631 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Z", line = 163)
    public final boolean method1171(byte arg0) {
        field3620++;
        if (this.field3624 == null) {
            return false;
        } else {
            if (arg0 > -87) {
                method1169((byte) 12, -74, false, true, true);
            }
            return true;
        }
    }
}
