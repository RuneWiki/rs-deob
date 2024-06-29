import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class589 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8211 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method3273(int arg0) {
        field8210++;
        class679 var1 = class669.method3708(15, 0, 1403048928);
        if (arg0 != 31050) {
            method3273(-13);
        }
        var1.method3749(arg0 - 31082);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
    public static final void method3274(int arg0, int arg1, byte arg2) {
        field8212++;
        if (class474.method2690(arg0, -256197904)) {
            class450.method2581(arg1, class676.field9545[arg0], (byte) 0);
            if (arg2 <= 38) {
                method3273(26);
            }
        }
    }
}
