import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class549 implements class205 {

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "Lrg;")
    public class557 field7639;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public int field7631;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public int field7634;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public int field7638;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Lal;")
    public class125 field7632;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "[I")
    public static int[] field7629 = new int[4];

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public static int field7635 = -1;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field7637 = 0;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIZBI)Lab;", line = 3)
    public static final class654 method3256(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field7630++;
        class654 var5 = new class654();
        var5.field8745 = arg1;
        var5.field8746 = arg0;
        class259.field3747.method820((long) arg4, (byte) -42, var5);
        class327.method2086(5589, arg1);
        class755 var6 = class189.method1182(arg4, (byte) -101);
        if (var6 != null) {
            class27.method159((byte) -105, var6);
        }
        if (class13.field127 != null) {
            class27.method159((byte) -105, class13.field127);
            class13.field127 = null;
        }
        class711.method3999(0);
        if (arg3 != 96) {
            field7637 = 10;
        }
        if (var6 != null) {
            class194.method1202(84, !arg2, var6);
        }
        if (!arg2) {
            class546.method3232(arg1);
        }
        if (!arg2 && class544.field7545 != -1) {
            class667.method3767(class544.field7545, 1, 4626);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILki;Lki;)V", line = 51)
    public static final void method3257(int arg0, int arg1, int arg2, class225 arg3, class225 arg4) {
        class262 var5 = class670.method3779(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field3841 = arg3;
        var5.field3850 = arg4;
        int var6 = class433.field6043 == class371.field5240 ? 1 : 0;
        if (!arg3.method783(0)) {
            arg3.field4412 = class204.field2694[var6];
            class204.field2694[var6] = arg3;
        } else if (arg3.method785(-118)) {
            arg3.field4412 = class333.field4710[var6];
            class333.field4710[var6] = arg3;
        } else {
            arg3.field4412 = class234.field3474[var6];
            class234.field3474[var6] = arg3;
            class569.field7870 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method783(0)) {
            if (arg4.method785(-123)) {
                arg4.field4412 = class333.field4710[var6];
                class333.field4710[var6] = arg4;
                return;
            }
            arg4.field4412 = class234.field3474[var6];
            class234.field3474[var6] = arg4;
            class569.field7870 = true;
            return;
        }
        arg4.field4412 = class204.field2694[var6];
        class204.field2694[var6] = arg4;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 113)
    public static void method3258(int arg0) {
        field7629 = null;
        if (arg0 < 91) {
            field7637 = -86;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)Lww;", line = 128)
    public class288 method1206(boolean arg0) {
        field7633++;
        return arg0 ? null : class550.field7651;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)V", line = 146)
    public static final void method3259(byte arg0, int arg1) {
        class63.field993 = arg1;
        field7640++;
        if (arg0 == -57) {
            class522.field7267.method3906(-94);
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(ILrg;Lal;II)V", line = 158)
    public class549(int arg0, class557 arg1, class125 arg2, int arg3, int arg4) {
        this.field7639 = arg1;
        this.field7631 = arg3;
        this.field7634 = arg4;
        this.field7638 = arg0;
        this.field7632 = arg2;
    }
}
