import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class660 extends class701 {

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lmv;Lmv;Lvt;)V")
    public class660(class295 arg0, class295 arg1, class683 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIII)V")
    public final void method3713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -66836072) {
            ++field9408;
            int var6 = super.field9957.method50();
            int var7 = ((class683) super.field1909).field9634 * class194.method1259(111) / 10 % var6;
            super.field9957.method1528(arg2 + var7 - var6, arg1, -var7 + arg0 + var6, arg3);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
    public static final void method3714(int arg0, int arg1, int arg2) {
        class425.field6217 = -class55.field866 + arg2;
        class519.field7277 = arg1 - class55.field865;
        if (arg0 == 10) {
            ++field9410;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3715(int arg0, int arg1, byte arg2) {
        if (arg2 > -105) {
            return true;
        } else {
            ++field9409;
            return class373.method2298(arg0, 16383, arg1) || class438.method2601(arg0, 13, arg1);
        }
    }
}
