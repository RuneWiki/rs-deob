import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class class782 {

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public int field10750;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public int field10753;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public int field10752;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lws;")
    public static class379 field10751 = new class379();

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method4274(int arg0) {
        if (arg0 != 28243) {
            method4274(11);
        }
        field10751 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(III)V", line = 23)
    public class782(int arg0, int arg1, int arg2) {
        this.field10750 = arg0;
        this.field10753 = arg2;
        this.field10752 = arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IBI)V")
    public abstract void method1935(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(IBI)V")
    public abstract void method1941(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
    public abstract void method1938(int arg0, int arg1, int arg2);
}
