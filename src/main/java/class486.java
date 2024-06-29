import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class486 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    private int field6256;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    private int field6259;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field6258;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field6269;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field6255;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field6265;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field6262;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field6266;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Luw;")
    public static class208 field6261 = new class208(0, -2);

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field6268 = 0;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Llq;")
    public static class210[] field6263;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z", line = 8)
    public final boolean method2722(int arg0, int arg1, int arg2, int arg3) {
        field6257++;
        if (arg1 < this.field6255 || arg1 > this.field6260) {
            return false;
        } else if (arg3 < this.field6265 || this.field6272 < arg3) {
            return false;
        } else if (this.field6262 <= arg2 && arg2 <= this.field6266) {
            int var5 = arg1 - this.field6259;
            int var6 = arg2 - this.field6258;
            int var7 = 105 / ((-arg0 - 28) / 58);
            return var5 * var5 + var6 * var6 < this.field6256;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 36)
    public static final void method2723(int arg0) {
        if (arg0 != -8) {
            return;
        }
        field6264++;
        if (class332.field4052 == 3) {
            class26.method113((byte) 95, 4);
        } else if (class332.field4052 == 7) {
            class26.method113((byte) 95, 8);
        } else if (class332.field4052 == 10) {
            class26.method113((byte) 95, 11);
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIIII)V", line = 58)
    public final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field6269 = arg3;
        field6267++;
        this.field6258 = arg1;
        this.field6259 = arg4;
        this.field6256 = arg9 * arg9;
        if (arg8 != -11) {
            method2726(-111, -53, 91, -39, -64);
        }
        this.field6272 = this.field6269 + arg6;
        this.field6255 = this.field6259 + arg7;
        this.field6266 = this.field6258 + arg5;
        this.field6260 = this.field6259 + arg0;
        this.field6265 = this.field6269 + arg2;
        this.field6262 = this.field6258 + arg10;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 89)
    public static void method2725(int arg0) {
        field6261 = null;
        field6263 = null;
        if (arg0 != 3) {
            field6261 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V", line = 109)
    public static final void method2726(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6270++;
        if (arg0 > -52) {
            return;
        }
        class614 var5 = class497.method2759(4, 5977, (long) arg1);
        var5.method3277(639);
        var5.field7741 = arg2;
        var5.field7742 = arg3;
        var5.field7746 = arg4;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 124)
    public class486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field6256 = arg3 * arg3;
        this.field6259 = arg0;
        this.field6258 = arg2;
        this.field6269 = arg1;
        this.field6255 = this.field6259 + arg4;
        this.field6265 = this.field6269 + arg6;
        this.field6272 = this.field6269 + arg7;
        this.field6262 = this.field6258 + arg8;
        this.field6266 = this.field6258 + arg9;
        this.field6260 = this.field6259 + arg5;
    }
}
