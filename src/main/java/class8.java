import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class8 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I", line = 3)
    public static final int method19(int arg0) {
        if (arg0 != 458752) {
            method22(null, (byte) 29);
        }
        field49++;
        return class724.method4033(1, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V", line = 17)
    public static final void method20(int arg0, byte arg1) {
        field46++;
        class35.field343.method308(-1, arg0);
        class226.field3432.method308(-1, arg0);
        class48.field573.method308(-1, arg0);
        class347.field5064.method308(-1, arg0);
        if (arg1 > 57) {
            ;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ)Z", line = 35)
    public static final boolean method21(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            field48++;
            return class402.method2468(-19439, arg1, arg0) | (arg1 & 0x70000) != 0 || class255.method1704(116, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lgga;B)Lhq;", line = 47)
    public static final class57 method22(class511 arg0, byte arg1) {
        int var2 = 14 / ((arg1 + 77) / 33);
        field47++;
        int var3 = arg0.method3002(-1);
        return new class57(var3);
    }
}
