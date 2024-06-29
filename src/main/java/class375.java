import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class375 {

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "S")
    public static short field5586 = 32767;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5585 = 0;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLom;)V")
    public static final void method2360(byte arg0, class344 arg1) {
        class365.field5419 = 0;
        field5587++;
        if (arg0 != 113) {
            field5585 = -26;
        }
        class185.field2984 = 0;
        class705.field9921 = new class578();
        class569.field8293 = new class668[1024];
        class236.field3516 = new class45[class594.field8550[class696.field9800] + 1];
        class583.field8433 = 0;
        class239.field3537 = 0;
        class377.method2366(arg1, (byte) -107);
        class694.method3884(true, arg1);
    }
}
