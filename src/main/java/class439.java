import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class439 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
    public static boolean field6325;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([Lhh;I)V")
    public static final void method2624(class140[] arg0, int arg1) {
        class494.field6964 = arg0.length;
        field6329++;
        class584.field7966 = new class140[class494.field6964 + 10];
        class634.field8573 = new int[class494.field6964 + 10];
        class421.method2533(arg0, 0, class584.field7966, 0, class494.field6964);
        if (arg1 != 5689) {
            return;
        }
        for (int var2 = 0; var2 < class494.field6964; var2++) {
            class634.field8573[var2] = class584.field7966[var2].method340();
        }
        for (int var3 = class494.field6964; var3 < class584.field7966.length; var3++) {
            class634.field8573[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)[Leo;")
    public static final class313[] method2625(byte arg0) {
        if (arg0 < 80) {
            method2626(null, null, (byte) -47, 102, 117);
        }
        field6326++;
        return new class313[] { class375.field5489, class33.field313, class374.field5471, class709.field9694, class375.field5488, class50.field576, class273.field3967, class289.field4118, class601.field8185, class435.field6287 };
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;BII)Lha;")
    public static final class66 method2626(class161 arg0, Canvas arg1, byte arg2, int arg3, int arg4) {
        field6327++;
        return arg2 == -69 ? new class121(arg1, arg0, arg4, arg3) : null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z")
    public static final boolean method2627(int arg0, int arg1) {
        if (arg0 != 0) {
            method2625((byte) 78);
        }
        field6330++;
        return (-arg1 & arg1) == arg1;
    }
}
