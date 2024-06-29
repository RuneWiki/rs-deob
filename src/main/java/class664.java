import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class664 {

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public int field9447;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "[I")
    public int[] field9449;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
    public int[] field9446;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Luia;")
    public static class362 field9448;

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(I)V")
    public class664(int arg0) {
        this.field9447 = arg0;
        this.field9449 = new int[this.field9447];
        this.field9446 = new int[this.field9447];
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILig;)Lac;")
    public static final class538 method3773(int arg0, class244 arg1) {
        if (arg0 == 13433) {
            field9450++;
            return new class538(arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1458((byte) 14), arg1.method1423(-89));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V")
    public static void method3774(boolean arg0) {
        if (!arg0) {
            field9448 = null;
        }
    }
}
