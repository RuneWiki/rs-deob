import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class67 {

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field911 = 0;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public static int[] field909 = new int[200];

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field906 = -1;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lql;II)V")
    private final void method418(class224 arg0, int arg1, int arg2) {
        field904++;
        if (arg2 == 5) {
            this.field911 = arg0.method1445(false);
        }
        if (arg1 <= 47) {
            this.method420(21, (class224) null);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method419(int arg0) {
        field909 = null;
        if (arg0 != 65535) {
            field908 = -4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILql;)V")
    public final void method420(int arg0, class224 arg1) {
        while (true) {
            int var3 = arg1.method1453((byte) -127);
            if (var3 == 0) {
                int var4 = 89 % ((arg0 + 38) / 48);
                field905++;
                return;
            }
            this.method418(arg1, 71, var3);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lse;")
    public static final class211 method421(int arg0, int arg1) {
        field910++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 != 0) {
            method421(64, -71);
        }
        if (class158.field2208[var2] == null || class158.field2208[var2][var3] == null) {
            boolean var4 = class52.method328(19031, var2);
            if (!var4) {
                return null;
            }
        }
        return class158.field2208[var2][var3];
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method422(int arg0) {
        class235.field3583.method544(false);
        class172.field2388.method544(false);
        class245.field3737.method544(false);
        field907++;
        if (arg0 == 5) {
            class50.field727.method544(false);
        }
    }
}
