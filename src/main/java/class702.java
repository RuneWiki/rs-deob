import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class702 extends class452 {

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field9762;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field9763;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[I")
    public static int[] field9764 = new int[2];

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field9766;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method3948(byte arg0) {
        field9764 = null;
        if (arg0 >= -3) {
            method3948((byte) -124);
        }
        field9766 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Leha;Loea;IIIIIIIII)V")
    public class702(class91 arg0, class599 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9762 = arg9;
        this.field9763 = arg10;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lhm;")
    public final class223 method29(int arg0) {
        field9765++;
        if (arg0 != -200) {
            field9767 = 116;
        }
        return class386.field4927;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
    public static int method3949(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
