import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class56 extends class249 {

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field636;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
    public static int[] field632 = new int[32];

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "Lhm;")
    public static class202 field634;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field632[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V", line = 3)
    public static void method469(int arg0) {
        field634 = null;
        if (arg0 != 32) {
            method471(-108, 4, -50, false, -113, null);
        }
        field632 = null;
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)Z", line = 16)
    public final boolean method470(int arg0) {
        if (arg0 == 18398) {
            field631++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Loga;Ljava/lang/Object;I)V", line = 29)
    public class56(class438 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field636 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZILsea;)V", line = 42)
    public static final void method471(int arg0, int arg1, int arg2, boolean arg3, int arg4, class648 arg5) {
        field635++;
        if (arg4 == -1) {
            class442.method2512(true, arg0, 0L, arg3, arg5, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 67)
    public final Object method472(byte arg0) {
        field630++;
        if (arg0 != -85) {
            method469(-113);
        }
        return this.field636;
    }
}
