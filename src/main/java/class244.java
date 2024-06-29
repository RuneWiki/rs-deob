import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class244 extends class215 {

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "S")
    public short field3795;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Ldg;")
    public static class376 field3793 = new class376(69, 3);

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Luq;")
    public static class146 field3796;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1652(int arg0, int arg1, int arg2) {
        ++field3791;
        if (arg1 <= 72) {
            return false;
        } else {
            return (arg0 & 393216) != 0 | class104.method834((byte) 97, arg2, arg0) || class138.method1001((byte) 75, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "(I)Z", line = 18)
    public final boolean method952(int arg0) {
        ++field3792;
        return arg0 >= -10 ? false : class453.method2678(this, super.field3029 >> class310.field4593, (byte) 76, super.field3023, super.field3024 >> class310.field4593);
    }

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "(I)V", line = 30)
    public static void method1653(int arg0) {
        if (arg0 < 122) {
            field3796 = null;
        }
        field3796 = null;
        field3793 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[Lrc;)I", line = 41)
    public final int method950(int arg0, class498[] arg1) {
        ++field3794;
        int var3 = super.field3024 >> class310.field4593;
        int var4 = super.field3029 >> class310.field4593;
        int var5 = 0;
        if (class435.field6354 == var3) {
            ++var5;
        } else if (~var3 < ~class435.field6354) {
            var5 += 2;
        }
        if (class612.field8575 == var4) {
            var5 += 3;
        } else if (var4 < class612.field8575) {
            var5 += 6;
        }
        int var6 = class455.field6532[var5];
        if ((var6 & this.field3795) != 0) {
            return this.method1427(var3, arg1, -89, var4);
        } else if (~this.field3795 == -2 && ~var3 < -1) {
            return this.method1427(var3 + -1, arg1, -109, var4);
        } else if (this.field3795 == 4 && class302.field4492 >= var3) {
            return this.method1427(var3 + 1, arg1, -120, var4);
        } else if (this.field3795 == 8 && ~var4 < -1) {
            return this.method1427(var3, arg1, -116, var4 + -1);
        } else if (this.field3795 == 2 && ~class8.field82 <= ~var4) {
            return this.method1427(var3, arg1, -97, var4 + 1);
        } else if (~this.field3795 == -17 && ~var3 < -1 && class8.field82 >= var4) {
            return this.method1427(var3 + -1, arg1, arg0 ^ -65451, var4 + 1);
        } else if (~this.field3795 == -33 && var3 <= class302.field4492 && ~var4 >= ~class8.field82) {
            return this.method1427(var3 - -1, arg1, -128, var4 - -1);
        } else if (this.field3795 == 128 && var3 > 0 && ~var4 < -1) {
            return this.method1427(var3 - 1, arg1, arg0 ^ -65425, var4 + -1);
        } else if (arg0 != 65535) {
            return 60;
        } else if (~this.field3795 == -65 && ~var3 >= ~class302.field4492 && ~var4 < -1) {
            return this.method1427(var3 - -1, arg1, -86, var4 + -1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)Z", line = 122)
    public final boolean method948(boolean arg0) {
        ++field3790;
        return !arg0 ? true : class260.field3949[(super.field3024 >> class310.field4593) + class196.field2802 + -class435.field6354][(super.field3029 >> class310.field4593) + -class612.field8575 + class196.field2802];
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIII)V", line = 134)
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3795 = (short) arg5;
        super.field3029 = arg2;
        super.field3023 = (byte) arg4;
        super.field3024 = arg0;
        super.field3018 = arg1;
        super.field3019 = (byte) arg3;
    }
}
