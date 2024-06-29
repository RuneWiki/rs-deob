import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Lvj;")
    public static class373 field20 = new class373(62, -1);

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "[Z")
    public static boolean[] field22 = new boolean[8];

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static void method24(int arg0) {
        int var1 = -119 % ((arg0 + 58) / 43);
        field22 = null;
        field20 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)Lqt;")
    public static final class542 method25(int arg0, int arg1, int arg2) {
        field18++;
        class542 var3 = new class542();
        var3.field7924 = arg2 + 1 + 5;
        var3.field7915 = -1;
        var3.field7920 = arg1 + 5 + 1;
        var3.field7939 = -1;
        if (arg0 > -127) {
            field20 = null;
        }
        var3.field7922 = new int[var3.field7924][var3.field7920];
        var3.method3164(119);
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field19++;
        throw new IllegalStateException();
    }
}
