import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class154 extends class74 {

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field2564;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field2562 = -1;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "[S")
    public static short[] field2563;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static void method1108(int arg0) {
        if (arg0 == 3) {
            field2563 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method476(boolean arg0) {
        field2560++;
        if (!arg0) {
            this.method476(false);
        }
        return this.field2564;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Lva;")
    public static final class33 method1109(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1620; var4++) {
            class33 var5 = var3.field1632[var4];
            if ((var5.field477 >> 29 & 0x3L) == 2L && var5.field492 == arg1 && var5.field491 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class154(Object arg0) {
        this.field2564 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Z")
    public final boolean method477(boolean arg0) {
        if (arg0) {
            field2565 = -72;
        }
        field2561++;
        return false;
    }
}
