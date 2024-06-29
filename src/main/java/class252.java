import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class252 extends class424 {

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field3441 = -1;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "[Z")
    public static boolean[] field3442;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
    public abstract int method321(int arg0);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method1601(int arg0) {
        if (arg0 != -5) {
            field3442 = null;
        }
        field3442 = null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)I")
    public abstract int method324(int arg0);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)J")
    public abstract long method322(int arg0);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)I")
    public abstract int method320(int arg0);

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)I")
    public abstract int method323(int arg0);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method1602(int arg0, int arg1) {
        field3440++;
        if (arg0 > -93) {
            field3442 = null;
        }
        if (class57.field769 == 1) {
            class668.field9280 = arg1;
        } else if (class57.field769 == 2 || class57.field769 == 3) {
            class540.field7019 = arg1;
        }
    }
}
