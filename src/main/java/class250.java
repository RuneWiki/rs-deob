import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class250 {

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Z")
    public boolean field3667;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lst;")
    public static class335 field3668 = new class335(2, 3);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Lrv;")
    public class440 field3663;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lrv;")
    public class440 field3664;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Z")
    public boolean field3666;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[I")
    public static int[] field3665;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "[S")
    public static short[] field3669;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZIBI)Ljava/lang/String;", line = 3)
    public static final String method1710(boolean arg0, int arg1, byte arg2, int arg3) {
        field3660++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            int var5 = 123 % ((-arg2 - 87) / 33);
            for (int var6 = arg3 / arg1; var6 != 0; var6 /= arg1) {
                var4++;
            }
            char[] var7 = new char[var4];
            var7[0] = '+';
            for (int var8 = var4 - 1; var8 > 0; var8--) {
                int var9 = arg3;
                arg3 /= arg1;
                int var10 = var9 - arg1 * arg3;
                if (var10 >= 10) {
                    var7[var8] = (char) (var10 + 87);
                } else {
                    var7[var8] = (char) (var10 + 48);
                }
            }
            return new String(var7);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 62)
    public final void method1711(int arg0) {
        field3659++;
        if (arg0 != 0) {
            field3668 = null;
        }
        if (this.field3664 != null) {
            this.field3664.method970(-113);
        }
        this.field3666 = false;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V", line = 76)
    public static void method1712(boolean arg0) {
        if (!arg0) {
            field3665 = null;
            field3669 = null;
            field3668 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z", line = 88)
    public final boolean method1713(byte arg0) {
        if (arg0 < 57) {
            return false;
        } else {
            field3662++;
            return this.field3666 && !this.field3667;
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Z)V", line = 98)
    public class250(boolean arg0) {
        this.field3667 = arg0;
    }
}
