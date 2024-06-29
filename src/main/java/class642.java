import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class642 {

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    private int field8551;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    private int field8549;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    private int field8550;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    private int field8552;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field8538;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public int field8543;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public int field8547;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field8539;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public int field8540;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public int field8542;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I", line = 10)
    public static final int method3522(byte arg0, int arg1) {
        if (arg0 != 38) {
            field8541 = 96;
        }
        field8545++;
        return (arg1 & 0x3FDB0) >> 11;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBII)Z", line = 22)
    public final boolean method3523(int arg0, byte arg1, int arg2, int arg3) {
        field8548++;
        if (this.field8539 > arg3 || this.field8542 < arg3) {
            return false;
        } else if (arg0 >= this.field8547 && arg0 <= this.field8543) {
            int var5 = 96 / ((-arg1 - 2) / 41);
            if (this.field8540 <= arg2 && this.field8538 >= arg2) {
                int var6 = arg3 - this.field8551;
                int var7 = arg2 - this.field8550;
                return var6 * var6 + var7 * var7 < this.field8549;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIIIIIIII)V", line = 46)
    public final void method3524(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field8551 = arg8;
        this.field8552 = arg0;
        this.field8550 = arg9;
        this.field8549 = arg6 * arg6;
        field8544++;
        if (arg1 != 47) {
            return;
        }
        this.field8547 = this.field8552 + arg7;
        this.field8540 = this.field8550 + arg10;
        this.field8539 = this.field8551 + arg2;
        this.field8538 = this.field8550 + arg3;
        this.field8542 = this.field8551 + arg5;
        this.field8543 = this.field8552 + arg4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIBI)Lwu;", line = 67)
    public static final class376 method3525(boolean arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -128) {
            method3522((byte) -85, -86);
        }
        field8546++;
        class498 var4 = null;
        if (class736.field10177 != null) {
            var4 = new class498(arg3, class736.field10177, class140.field2217[arg3], 1000000);
        }
        class62.field766[arg3] = class690.field9610.method653(class615.field8203, arg3, var4, false);
        class62.field766[arg3].method577(105);
        return new class376(class62.field766[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 94)
    public class642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field8551 = arg0;
        this.field8549 = arg3 * arg3;
        this.field8550 = arg2;
        this.field8552 = arg1;
        this.field8538 = this.field8550 + arg9;
        this.field8543 = this.field8552 + arg7;
        this.field8547 = this.field8552 + arg6;
        this.field8539 = this.field8551 + arg4;
        this.field8540 = this.field8550 + arg8;
        this.field8542 = this.field8551 + arg5;
    }
}
