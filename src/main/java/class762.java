import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class762 extends class245 {

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    private int field10614;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    private int field10612;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    private int field10613;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    private int field10617;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field10620;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        ++field10615;
        if (arg1 != 0) {
            this.field10614 = -67;
        }
        int var4 = this.field10617 * arg0 >> 12;
        int var5 = this.field10612 * arg0 >> 12;
        int var6 = this.field10613 * arg2 >> 12;
        int var7 = this.field10614 * arg2 >> 12;
        class22.method116(var6, var4, (byte) -105, var7, super.field3567, super.field3570, var5, super.field3574);
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(III)V")
    public final void method159(int arg0, int arg1, int arg2) {
        ++field10619;
        if (arg0 != 521) {
            this.field10617 = -40;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)V")
    public static final void method4232(int arg0, int arg1, byte arg2) {
        ++field10616;
        int var3 = -63 / ((86 - arg2) / 35);
        class270.field3860 = -class84.field1201 + arg1;
        class190.field2880 = -class84.field1190 + arg0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
    public final void method161(int arg0, int arg1, int arg2) {
        ++field10620;
        int var4 = this.field10617 * arg0 >> 12;
        int var5 = this.field10612 * arg0 >> 12;
        int var6 = this.field10613 * arg2 >> 12;
        int var7 = this.field10614 * arg2 >> 12;
        int var8 = -70 / ((-27 - arg1) / 62);
        class176.method1252(var7, super.field3567, var4, var5, var6, -98);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIII)V")
    public class762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field10614 = arg3;
        this.field10612 = arg2;
        this.field10613 = arg1;
        this.field10617 = arg0;
    }
}
