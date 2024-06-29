import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class203 extends class509 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILaj;Ld;)V")
    public static final void method1372(int arg0, class333 arg1, class161 arg2) {
        field2682++;
        class293.field4280 = arg2;
        if (arg0 == 0) {
            class398.field5836 = arg1;
        }
    }
}
