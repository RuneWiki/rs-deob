import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class194 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public int field2436 = -1;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "J")
    public static long field2434 = -1L;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lit;")
    public class517 field2435;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    public int[] field2439;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field2437;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1172(String arg0, int arg1) {
        field2438++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 >= -95) {
            method1172(null, 65);
        }
        for (int var2 = 0; var2 < class238.field2980; var2++) {
            if (arg0.equalsIgnoreCase(class280.field3509[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class465.field5927[var2])) {
                return true;
            }
        }
        return false;
    }
}
