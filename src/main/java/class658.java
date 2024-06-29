import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class658 extends class263 {

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public int field9182;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public static int field9179 = 2;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field9183 = 1;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "[I")
    public static int[] field9184 = new int[6];

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static void method3722(byte arg0) {
        if (arg0 >= 22) {
            field9184 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(ILee;Lhaa;III)V")
    public class658(int arg0, class676 arg1, class82 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9182 = arg5;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
    public static final void method3723(int arg0) {
        class68.field755.method4033(96);
        field9180++;
        class226.field2934 = 1;
        if (arg0 != 31585) {
            method3723(-86);
        }
        class476.field6580 = null;
        class520.field6997 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lhda;")
    public final class750 method333(int arg0) {
        if (arg0 == 30778) {
            field9181++;
            return class93.field1228;
        } else {
            return null;
        }
    }
}
