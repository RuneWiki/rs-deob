import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class205 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lvl;")
    public static class15 field2448 = new class15();

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lpe;")
    public static class636 field2451 = new class636(1);

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public abstract void method1223(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V")
    public abstract void method1222(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
    public abstract void method1225(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(III)V")
    public class205(int arg0, int arg1, int arg2) {
        this.field2450 = arg1;
        this.field2449 = arg0;
        this.field2447 = arg2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method1310(int arg0) {
        field2451 = null;
        field2448 = null;
        if (arg0 != 1) {
            method1310(-37);
        }
    }
}
