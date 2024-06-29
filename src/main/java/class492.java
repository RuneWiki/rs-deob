import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class492 extends class361 {

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "S")
    public short field6996;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
    public static int[] field6997 = new int[1];

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2953(int arg0, int arg1, int arg2) {
        class476.method2858(arg0, true, arg2);
        if (arg1 >= -22) {
            method2954((byte) 119);
        }
        ++field6998;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(B)V", line = 16)
    public static void method2954(byte arg0) {
        field6997 = null;
        if (arg0 != 65) {
            field6997 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B[Lada;)I", line = 26)
    public final int method1150(byte arg0, class163[] arg1) {
        ++field6994;
        int var3 = super.field4635 >> class748.field10430;
        int var4 = super.field4629 >> class748.field10430;
        int var5 = 0;
        if (~class440.field6387 == ~var3) {
            ++var5;
        } else if (~var3 < ~class440.field6387) {
            var5 += 2;
        }
        if (class444.field6433 != var4) {
            if (var4 < class444.field6433) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class10.field78[var5];
        if ((this.field6996 & var6) != 0) {
            return this.method2121(var4, arg1, -32, var3);
        } else if (~this.field6996 == -2 && var3 > 0) {
            return this.method2121(var4, arg1, -79, var3 + -1);
        } else if (~this.field6996 == -5 && ~class284.field3473 <= ~var3) {
            return this.method2121(var4, arg1, 117, var3 + 1);
        } else if (~this.field6996 == -9 && var4 > 0) {
            return this.method2121(var4 + -1, arg1, 116, var3);
        } else {
            if (arg0 >= -44) {
                field6997 = null;
            }
            if (this.field6996 == 2 && class151.field1664 >= var4) {
                return this.method2121(var4 - -1, arg1, 119, var3);
            } else if (this.field6996 == 16 && var3 > 0 && ~var4 >= ~class151.field1664) {
                return this.method2121(var4 + 1, arg1, -50, var3 + -1);
            } else if (this.field6996 == 32 && ~class284.field3473 <= ~var3 && var4 <= class151.field1664) {
                return this.method2121(var4 + 1, arg1, 120, var3 + 1);
            } else if (~this.field6996 == -129 && var3 > 0 && var4 > 0) {
                return this.method2121(var4 + -1, arg1, 125, var3 + -1);
            } else if (this.field6996 == 64 && var3 <= class284.field3473 && ~var4 < -1) {
                return this.method2121(var4 + -1, arg1, -128, var3 + 1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Z", line = 113)
    public final boolean method1154(int arg0) {
        ++field6995;
        if (arg0 != -1) {
            this.field6996 = -83;
        }
        return class233.field2770[(super.field4635 >> class748.field10430) + class626.field8992 + -class440.field6387][(super.field4629 >> class748.field10430) + -class444.field6433 + class626.field8992];
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Z", line = 124)
    public final boolean method1152(int arg0) {
        ++field6993;
        if (arg0 != -4) {
            this.field6996 = -55;
        }
        return class392.method2409(this, super.field4629 >> class748.field10430, super.field4635 >> class748.field10430, arg0 ^ -126, super.field4633);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIII)V", line = 135)
    public class492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6996 = (short) arg5;
        super.field4627 = arg1;
        super.field4629 = arg2;
        super.field4628 = (byte) arg3;
        super.field4635 = arg0;
        super.field4633 = (byte) arg4;
    }
}
