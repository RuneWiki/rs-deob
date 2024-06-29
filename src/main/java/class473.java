import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class473 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Lmu;")
    public static class303 field6618 = new class303(52, -1);

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field6619 = 0;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public static final void method2788(int arg0) {
        for (int var1 = arg0; var1 < 5; var1++) {
            class226.field3216[var1] = false;
        }
        field6617++;
        class705.field9558 = -1;
        class44.field978 = -1;
        class438.field6252 = 1;
        class599.field8218 = -1;
        class640.field8803 = 0;
        class302.field4210 = -1;
        class641.field8817 = 0;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public static void method2789(int arg0) {
        field6618 = null;
        if (arg0 != -1) {
            method2788(-78);
        }
    }
}
