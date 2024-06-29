import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class100 extends class167 {

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "F")
    public static float field1517 = 1.0F;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "Z")
    public static boolean field1518;

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ltca;Lvea;IIIIIIIII)V")
    public class100(class545 arg0, class305 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1521 = arg10;
        this.field1519 = arg9;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Lmh;")
    public final class139 method599(int arg0) {
        field1520++;
        int var2 = 70 / ((-arg0 - 89) / 34);
        return class125.field1826;
    }
}
