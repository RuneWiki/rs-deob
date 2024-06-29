import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class291 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4415 = 0;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    public static int[] field4414 = new int[200];

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lfda;")
    public static class336 field4413 = new class336();

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4416;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field4417;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1969(int arg0) {
        if (arg0 != 1) {
            field4415 = -40;
        }
        field4414 = null;
        field4413 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V")
    public static final void method1970(boolean arg0, int arg1) {
        field4412++;
        int var2 = class60.field825;
        if (arg1 >= -15) {
            method1970(false, -22);
        }
        int var3 = class235.field3396;
        if (arg0 && class475.field6760) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class638.field8979.method446(var3, var2);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1971(String arg0, int arg1) {
        if (arg1 != 0) {
            method1969(20);
        }
        field4416++;
        return class204.method1463(arg0, 117, field4417 == null ? (field4417 = method1972("jia")) : field4417);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1972(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
