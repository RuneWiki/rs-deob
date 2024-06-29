import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class248 {

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lwp;")
    public static class453 field3063 = new class453(3, 6);

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Lwp;")
    public static class453 field3066 = new class453(81, 1);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZII)I", line = 6)
    public static final int method1463(int arg0, boolean arg1, int arg2, int arg3) {
        field3065++;
        class492 var4 = class183.method1141(arg1, (byte) 117, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = arg0;
            for (int var6 = 0; var6 < var4.field6495.length; var6++) {
                if (var4.field6496[var6] == arg3) {
                    var5 += var4.field6495[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 38)
    public static void method1464(byte arg0) {
        if (arg0 == 19) {
            field3066 = null;
            field3063 = null;
        }
    }
}
