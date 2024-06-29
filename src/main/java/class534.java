import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class534 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Lmo;")
    public static class695 field7487 = new class695("LIVE", 0);

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Lsk;")
    public static class578 field7491 = new class578();

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public int field7485;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public int field7489;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public int field7490;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method3093(byte arg0) {
        if (arg0 < -114) {
            field7491 = null;
            field7487 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
    public static final void method3094(int arg0, int arg1) {
        field7486++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class696.field9800 = arg1;
        if (arg0 == 17517) {
            class236.field3516 = new class45[class594.field8550[class696.field9800] + 1];
            class583.field8433 = 0;
            class239.field3537 = 0;
        }
    }
}
