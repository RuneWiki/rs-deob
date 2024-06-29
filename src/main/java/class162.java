import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class162 extends class84 {

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Led;")
    public static class187 field2640 = new class187();

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lhl;")
    public static class40 field2641 = new class40(64);

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2641 = null;
        field2640 = null;
        if (arg0 != 16569) {
            method1206(-11);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/Object;Lbh;)V")
    public static final void method1207(byte arg0, Object arg1, class7 arg2) {
        field2639++;
        if (arg2.field59 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field59.peekEvent() != null; var3++) {
            class43.method324(1L, -123);
        }
        if (arg0 != 63) {
            method1207((byte) -128, (Object) null, (class7) null);
        }
        if (arg1 != null) {
            arg2.field59.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        field2642++;
        if (arg0 >= -125) {
            method1206(41);
        }
        return class184.field2967;
    }
}
