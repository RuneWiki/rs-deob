import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class141 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lvt;", line = 6)
    public static final class281 method1018(int arg0, int arg1, int arg2) {
        if (class348.field5192[arg0][arg1][arg2] == null) {
            boolean var3 = class348.field5192[0][arg1][arg2] != null && class348.field5192[0][arg1][arg2].field4372 != null;
            if (var3 && arg0 >= class183.field2802 - 1) {
                return null;
            }
            class89.method776(arg0, arg1, arg2);
        }
        return class348.field5192[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)Luh;", line = 28)
    public static final class407 method1019(int arg0, byte arg1, int arg2) {
        field2105++;
        class407 var3 = new class407();
        var3.field6015 = -1;
        if (arg1 >= -90) {
            field2104 = 117;
        }
        var3.field6019 = -1;
        var3.field6026 = arg0 + 6;
        var3.field6012 = arg2 + 6;
        var3.field6004 = new int[var3.field6026][var3.field6012];
        var3.method2568((byte) -123);
        return var3;
    }
}
