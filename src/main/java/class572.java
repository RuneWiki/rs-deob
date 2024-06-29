import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class572 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field8101 = 0;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lke;")
    public static class622 field8105 = new class622(50, 8);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lve;")
    public static class527 field8106 = new class527(8, 1);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lqda;")
    public static class112 field8098;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Z")
    public static boolean field8100;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 25)
    public static void method3320(boolean arg0) {
        field8106 = null;
        field8098 = null;
        field8105 = null;
        if (!arg0) {
            field8105 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V", line = 41)
    public static final void method3321(boolean arg0, int arg1) {
        field8103++;
        class644.field9062++;
        class731 var2 = class155.method1222(260, class580.field8219, class237.field3417);
        if (arg1 != 7713) {
            field8106 = null;
        }
        class533.method3088(var2, 0);
        for (class329 var3 = (class329) class251.field3547.method382(0); var3 != null; var3 = (class329) class251.field3547.method391(37)) {
            if (!var3.method3114(114)) {
                var3 = (class329) class251.field3547.method382(0);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field4914 == 0) {
                class224.method1551((byte) 26, var3, arg0, true);
            }
        }
        if (class273.field3815 != null) {
            class288.method1923((byte) -19, class273.field3815);
            class273.field3815 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILvm;II)V", line = 104)
    public static final void method3322(int arg0, class713 arg1, int arg2, int arg3) {
        field8099++;
        int var4 = 54 / ((19 - arg2) / 50);
        class259.field3639[arg0][arg3] = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(JI)V", line = 117)
    public static final void method3323(long arg0, int arg1) {
        if (arg1 != 10) {
            method3320(false);
        }
        field8102++;
        class241.field3459.setTime(new Date(arg0));
    }
}
