import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class543 extends class205 {

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    private int field7612;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    private int field7611;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    private int field7615;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Llja;")
    public static class744 field7616 = new class744(33, 2);

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lhj;")
    public static class596 field7620 = new class596(45, 4);

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field7622 = -1;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "[I")
    public static int[] field7621 = new int[13];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;IZ)Z", line = 8)
    public static final boolean method3210(byte arg0, String arg1, int arg2, boolean arg3) {
        ++field7618;
        if (~arg2 <= -3 && ~arg2 >= -37) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            if (arg0 < 125) {
                return true;
            } else {
                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                    char var9 = arg1.charAt(var8);
                    if (~var8 == -1) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg3) {
                            continue;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || ~var9 < -123) {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (var11 >= arg2) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg2 * var6 + var11;
                    if (~(var10 / arg2) != ~var6) {
                        return false;
                    }
                    var6 = var10;
                    var5 = true;
                }
                return var5;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)V", line = 87)
    public final void method1222(int arg0, int arg1, int arg2) {
        ++field7619;
        if (arg1 != -10852) {
            this.method1222(51, -24, -52);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)V", line = 97)
    public final void method1225(int arg0, int arg1, byte arg2) {
        ++field7617;
        int var4 = this.field7612 * arg1 >> 12;
        int var5 = this.field7615 * arg1 >> 12;
        if (arg2 > -6) {
            this.method1222(52, -60, 107);
        }
        int var6 = this.field7613 * arg0 >> 12;
        int var7 = this.field7611 * arg0 >> 12;
        class151.method1085(var4, var6, var7, -1, var5, super.field2450);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V", line = 119)
    public final void method1223(int arg0, int arg1, int arg2) {
        ++field7614;
        if (arg0 != 1) {
            field7621 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 129)
    public static void method3211(byte arg0) {
        if (arg0 == -102) {
            field7616 = null;
            field7620 = null;
            field7621 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIII)V", line = 141)
    public class543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7613 = arg1;
        this.field7612 = arg0;
        this.field7611 = arg3;
        this.field7615 = arg2;
    }
}
