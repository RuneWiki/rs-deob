import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class719 extends class547 {

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "S")
    public short field10107;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "[[I")
    public static int[][] field10110 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z[Ljw;)I", line = 3)
    public final int method1634(boolean arg0, class578[] arg1) {
        ++field10105;
        int var3 = super.field7718 >> class310.field4616;
        int var4 = super.field7719 >> class310.field4616;
        int var5 = 0;
        if (!arg0) {
            this.method1634(false, (class578[]) null);
        }
        if (class282.field4335 == var3) {
            ++var5;
        } else if (~class282.field4335 > ~var3) {
            var5 += 2;
        }
        if (~class301.field4521 == ~var4) {
            var5 += 3;
        } else if (~var4 > ~class301.field4521) {
            var5 += 6;
        }
        int var6 = class530.field7511[var5];
        if (~(this.field10107 & var6) != -1) {
            return this.method3182(arg1, (byte) 32, var4, var3);
        } else if (~this.field10107 == -2 && ~var3 < -1) {
            return this.method3182(arg1, (byte) 32, var4, var3 + -1);
        } else if (~this.field10107 == -5 && var3 <= class151.field2074) {
            return this.method3182(arg1, (byte) 32, var4, var3 + 1);
        } else if (~this.field10107 == -9 && var4 > 0) {
            return this.method3182(arg1, (byte) 32, var4 + -1, var3);
        } else if (~this.field10107 == -3 && var4 <= class12.field249) {
            return this.method3182(arg1, (byte) 32, var4 + 1, var3);
        } else if (~this.field10107 == -17 && ~var3 < -1 && ~var4 >= ~class12.field249) {
            return this.method3182(arg1, (byte) 32, var4 + 1, var3 - 1);
        } else if (this.field10107 == 32 && class151.field2074 >= var3 && class12.field249 >= var4) {
            return this.method3182(arg1, (byte) 32, var4 - -1, var3 + 1);
        } else if (~this.field10107 == -129 && var3 > 0 && var4 > 0) {
            return this.method3182(arg1, (byte) 32, var4 + -1, var3 - 1);
        } else if (this.field10107 == 64 && class151.field2074 >= var3 && var4 > 0) {
            return this.method3182(arg1, (byte) 32, var4 - 1, var3 + 1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(ILha;)Z", line = 84)
    public final boolean method1638(int arg0, class66 arg1) {
        if (arg0 >= -101) {
            return true;
        } else {
            ++field10109;
            return class557.method3233(128, this, super.field7719 >> class310.field4616, super.field7718 >> class310.field4616, super.field7711);
        }
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)V", line = 95)
    public static void method4051(byte arg0) {
        if (arg0 != -45) {
            method4051((byte) 94);
        }
        field10110 = null;
    }

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "(I)Z", line = 109)
    public final boolean method1637(int arg0) {
        ++field10106;
        return arg0 != -1 ? false : class457.field6551[(super.field7718 >> class310.field4616) + -class282.field4335 + class76.field1016][(super.field7719 >> class310.field4616) + class76.field1016 + -class301.field4521];
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIIII)V", line = 121)
    public class719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10107 = (short) arg5;
        super.field7711 = (byte) arg4;
        super.field7718 = arg0;
        super.field7723 = arg1;
        super.field7719 = arg2;
        super.field7710 = (byte) arg3;
    }
}
