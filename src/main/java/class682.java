import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class682 extends class510 {

    @OriginalMember(owner = "client!ufa", name = "C", descriptor = "I")
    public int field9510;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!ufa", name = "A", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!ufa", name = "B", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!ufa", name = "E", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILria;II)V")
    public static final void method3837(int arg0, class288 arg1, int arg2, int arg3) {
        class326.field4189 = arg2;
        class154.field2096 = arg1;
        field9511++;
        if (arg0 == -200) {
            class208.field2763 = arg3;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Leha;Loea;IIIIIIIIIIIIII)V")
    public class682(class91 arg0, class599 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field9510 = arg15;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
    public static final void method3838(int arg0) {
        field9512++;
        class739.field10303.method511(((float) class748.field10451.field10403.method1451((byte) 126) * 0.1F + 0.7F) * 1.1523438F);
        class739.field10303.method548(class605.field8416, 0.69921875F, 1.2F, (float) arg0, -240.0F, -200.0F);
        class739.field10303.method457(class432.field5768, -1, 0);
        class739.field10303.method496(class196.field2676);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Lhm;")
    public final class223 method29(int arg0) {
        field9508++;
        if (arg0 != -200) {
            this.field9510 = 87;
        }
        return class231.field3032;
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)V")
    public static final void method3839(int arg0) {
        field9509++;
        if (arg0 == 21674) {
            class730.field10159.method1161(false);
            class758.field10580.method1161(false);
        }
    }
}
