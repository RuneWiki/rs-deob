import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class187 extends class146 {

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3060 = " from your ignore list first.";

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lre;")
    public static class266 field3057 = new class266();

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field3072 = 0;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Z")
    public static volatile boolean field3073 = true;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3074 = "flash2:";

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field3057 = null;
        if (arg0 == -22753) {
            field3074 = null;
            field3060 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1296(String arg0, byte arg1) {
        field3069++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 83) {
            field3073 = false;
        }
        while (class286.field4554 > var2) {
            if (arg0.equalsIgnoreCase(class154.field2513[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    public static final void method1297(byte arg0) {
        class139.field2322 = new class144(32);
        field3068++;
        if (arg0 != -72) {
            method1296((String) null, (byte) 71);
        }
    }
}
