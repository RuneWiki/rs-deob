import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class77 extends class352 {

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "Ljava/awt/Frame;")
    public static Frame field796;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILlt;)I")
    public static final int method482(int arg0, class617 arg1) {
        field792++;
        if (arg0 < 38) {
            return -19;
        }
        int var2 = arg1.method3465(2, (byte) -79);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method3465(5, (byte) -83);
        } else if (var2 == 2) {
            var3 = arg1.method3465(8, (byte) -112);
        } else {
            var3 = arg1.method3465(11, (byte) -98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)V")
    public static void method483(byte arg0) {
        field796 = null;
        if (arg0 != 83) {
            field796 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lida;Lce;IIIIIIII)V")
    public class77(class215 arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field795 = arg9;
        this.field793 = arg8;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lqv;")
    public final class406 method484(int arg0) {
        if (arg0 != 16236) {
            this.method484(66);
        }
        field794++;
        return class516.field7386;
    }
}
