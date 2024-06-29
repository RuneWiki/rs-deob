import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public abstract class class409 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public int field6043;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Ljp;")
    public static class55 field6041 = new class55(77, -1);

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "F")
    public static float field6045;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)V")
    public abstract void method1850(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBI)V")
    public abstract void method1855(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(IBI)V")
    public abstract void method1852(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(III)V")
    public class409(int arg0, int arg1, int arg2) {
        this.field6042 = arg2;
        this.field6043 = arg1;
        this.field6044 = arg0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static void method2578(int arg0) {
        field6041 = null;
        if (arg0 != 77) {
            field6041 = null;
        }
    }
}
