import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class316 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public int field4756 = 8;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public int field4757 = 16777215;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Z")
    public boolean field4762;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILcu;)V")
    public final void method2060(int arg0, class145 arg1) {
        field4758++;
        while (true) {
            int var3 = arg1.method1063((byte) 114);
            if (var3 == 0) {
                if (arg0 > -126) {
                    this.field4757 = -86;
                    return;
                } else {
                    return;
                }
            }
            this.method2061(arg1, 15912, var3);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lcu;II)V")
    private final void method2061(class145 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4756 = arg0.method1069((byte) -10);
        } else if (arg2 == 2) {
            this.field4762 = true;
        } else if (arg2 == 3) {
            this.field4761 = arg0.method1122(65280);
            this.field4764 = arg0.method1122(65280);
            this.field4760 = arg0.method1122(65280);
        } else if (arg2 == 4) {
            this.field4763 = arg0.method1063((byte) 105);
        } else if (arg2 == 5) {
            this.field4755 = arg0.method1069((byte) -121);
        } else if (arg2 == 6) {
            this.field4757 = arg0.method1085(-101);
        }
        if (arg1 != 15912) {
            this.method2060(-106, null);
        }
        field4759++;
    }
}
