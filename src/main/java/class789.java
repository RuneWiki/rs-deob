import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class789 extends class127 {

    @OriginalMember(owner = "client!eca", name = "B", descriptor = "I")
    public static int field10839;

    @OriginalMember(owner = "client!eca", name = "C", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "I")
    public static int field10842;

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "I")
    public static int field10843;

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "Lcj;")
    public static class720 field10841;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BIII)V", line = 6)
    public final void method905(byte arg0, int arg1, int arg2, int arg3) {
        super.field1747 = arg2;
        super.field1742 = arg1;
        super.field1748 = arg3;
        int var5 = 68 % ((-54 - arg0) / 34);
        ++field10842;
    }

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)V", line = 19)
    public static void method4317(int arg0) {
        field10841 = null;
        if (arg0 != -21029) {
            method4317(25);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IF)V", line = 31)
    public final void method906(int arg0, float arg1) {
        super.field1746 = arg1;
        if (arg0 == -17359) {
            ++field10843;
        }
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(B)V", line = 43)
    public static final void method4318(byte arg0) {
        ++field10839;
        class535 var1 = class645.field8686;
        synchronized (class645.field8686) {
            class645.field8686.method3113(-128);
            if (arg0 <= 20) {
                field10841 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(IIIIIF)V", line = 57)
    public class789(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
