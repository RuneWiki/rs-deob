import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class562 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lhda;")
    public static class752 field7368 = new class752(67, 12);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lcda;")
    public static class173 field7371 = new class173();

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[[I")
    public static int[][] field7369;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 10)
    public static void method3114(byte arg0) {
        field7368 = null;
        field7369 = null;
        field7371 = null;
        if (arg0 != -112) {
            field7371 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lr;III[Z)V", line = 22)
    public static final void method3115(class184 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class588.field7675 == class507.field6771) {
            return;
        }
        int var5 = class113.field1866[arg1].method1750((byte) 100, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class282 var7 = class113.field1866[var6];
                if (var7 != null) {
                    var7.method1748(arg0, arg2, var5 - var7.method1750((byte) 100, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
