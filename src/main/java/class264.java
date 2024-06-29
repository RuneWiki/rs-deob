import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class264 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field4260 = -1;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field4263 = 0;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field4264 = 500;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lib;")
    public static class56 field4259;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public abstract void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
    public abstract int method102();

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lpb;IIIZ)V")
    public void method1423(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4262++;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()Z")
    public boolean method1440() {
        field4257++;
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        if (arg0 == -1) {
            field4259 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Lpb;")
    public class264 method1436(int arg0, int arg1, int arg2) {
        field4258++;
        return this;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public abstract void method99(int arg0, int arg1, int arg2, int arg3, int arg4);
}
