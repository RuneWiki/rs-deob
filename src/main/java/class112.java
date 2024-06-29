import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class112 extends class249 {

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BII)V", line = 8)
    public final void method843(byte arg0, int arg1, int arg2) {
        ++field1532;
        int var4 = this.field1535 * arg2 >> 12;
        if (arg0 != 101) {
            this.field1535 = 113;
        }
        int var5 = this.field1530 * arg1 >> 12;
        int var6 = this.field1534 * arg2 >> 12;
        int var7 = this.field1531 * arg1 >> 12;
        int var8 = this.field1537 * arg2 >> 12;
        int var9 = this.field1540 * arg1 >> 12;
        int var10 = this.field1536 * arg2 >> 12;
        int var11 = this.field1539 * arg1 >> 12;
        class462.method2735(var5, var8, (byte) -127, var4, var6, var7, var10, var11, var9, super.field3689);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V", line = 35)
    public final void method844(int arg0, int arg1, int arg2) {
        if (arg2 != -7895) {
            this.field1535 = -73;
        }
        ++field1533;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 47)
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1531 = arg3;
        this.field1540 = arg5;
        this.field1537 = arg4;
        this.field1534 = arg2;
        this.field1530 = arg1;
        this.field1539 = arg7;
        this.field1535 = arg0;
        this.field1536 = arg6;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(BII)V", line = 66)
    public final void method845(byte arg0, int arg1, int arg2) {
        if (arg0 == 85) {
            ++field1538;
        }
    }
}
