import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class445 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "[[I")
    public static int[][] field6320;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Llv;")
    public static final class444 method2671(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2265;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static final void method2672(int arg0) {
        class130.field1571 = false;
        field6319++;
        if (arg0 == -12560) {
            class350.method2257(-101);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V")
    public static void method2673(boolean arg0) {
        field6320 = null;
        if (arg0) {
            field6320 = null;
        }
    }
}
