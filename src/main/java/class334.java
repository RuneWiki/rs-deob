import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class334 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    private int field5463;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    private int field5472;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    private int field5462;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    private int field5467;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    private int field5471;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    private int field5468;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private int field5464;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    private int field5465;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    private int field5470;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "Lhga;")
    public static class158 field5474 = new class158(17, 4);

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 6)
    public static void method2312(int arg0) {
        field5474 = null;
        if (arg0 != 30058) {
            method2312(26);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIIIII)V", line = 17)
    public final void method2313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5469++;
        this.field5472 = arg9;
        this.field5462 = arg10;
        this.field5467 = arg0;
        this.field5463 = arg4 * arg4;
        this.field5470 = this.field5467 + arg1;
        this.field5466 = this.field5462 + arg7;
        this.field5465 = this.field5467 + arg6;
        this.field5471 = this.field5472 + arg8;
        this.field5464 = this.field5472 + arg2;
        if (arg3 != -20483) {
            this.field5463 = 48;
        }
        this.field5468 = this.field5462 + arg5;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 45)
    public class334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5463 = arg3 * arg3;
        this.field5472 = arg1;
        this.field5462 = arg0;
        this.field5467 = arg2;
        this.field5471 = this.field5472 + arg6;
        this.field5468 = this.field5462 + arg5;
        this.field5466 = this.field5462 + arg4;
        this.field5464 = this.field5472 + arg7;
        this.field5465 = this.field5467 + arg9;
        this.field5470 = this.field5467 + arg8;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BIII)Z", line = 63)
    public final boolean method2314(byte arg0, int arg1, int arg2, int arg3) {
        field5473++;
        if (this.field5466 > arg2 || arg2 > this.field5468) {
            return false;
        } else if (arg1 >= this.field5471 && arg1 <= this.field5464) {
            if (arg0 != -2) {
                this.method2313(-74, -1, 23, 17, 105, 52, -27, -124, -65, 52, -31);
            }
            if (this.field5470 <= arg3 && arg3 <= this.field5465) {
                int var5 = arg2 - this.field5462;
                int var6 = arg3 - this.field5467;
                return (var5 * var5 + var6 * var6) < this.field5463;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
