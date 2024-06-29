import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class176 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lsb;")
    public static class98 field3064 = class47.method368("", 0);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    public static int[] field3067 = new int[128];

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3068 = -2;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lbi;")
    public static class167 field3062;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILq;)Lq;")
    public static final class148 method1226(int arg0, class148 arg1) {
        field3063++;
        if (arg0 != -13948) {
            return null;
        }
        class148 var2 = client.method765(arg1);
        if (var2 == null) {
            var2 = arg1.field2623;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field3064 = null;
        field3062 = null;
        field3067 = null;
        if (arg0 < 122) {
            method1229(61, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lsb;Lsb;BI)V")
    public static final void method1228(class98 arg0, class98 arg1, byte arg2, int arg3) {
        if (arg2 != -49) {
            method1227((byte) 48);
        }
        class15.method127(-1, 0, arg1, arg3, (class98) null, arg0);
        field3066++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
    public static final void method1229(int arg0, boolean arg1) {
        field3065++;
        class106 var2 = class71.field1129;
        synchronized (class71.field1129) {
            class134.field2366 = arg0;
        }
        if (arg1) {
            method1227((byte) 7);
        }
    }
}
