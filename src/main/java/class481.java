import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class481 extends class77 {

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field6410;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILfaa;Lfaa;)V")
    public static final void method2657(int arg0, class424 arg1, class424 arg2) {
        if (arg2.field5497 != null) {
            arg2.method2438((byte) -4);
        }
        if (arg0 != 0) {
            return;
        }
        field6411++;
        arg2.field5500 = arg1;
        arg2.field5497 = arg1.field5497;
        arg2.field5497.field5500 = arg2;
        arg2.field5500.field5497 = arg2;
    }

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "(I)Z")
    public final boolean method621(int arg0) {
        field6409++;
        if (arg0 > -116) {
            method2657(48, null, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(BII)Z")
    public static final boolean method2658(byte arg0, int arg1, int arg2) {
        if (arg0 == -6) {
            field6407++;
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class481(Object arg0, int arg1) {
        super(arg1);
        this.field6410 = arg0;
    }

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method622(int arg0) {
        field6408++;
        return arg0 == 24910 ? this.field6410 : null;
    }
}
