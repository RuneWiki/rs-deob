import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class229 implements class276 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
    public static int[] field3560 = new int[4096];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method1560(int arg0) {
        if (arg0 != -612062672) {
            method1560(-61);
        }
        field3560 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JIZ[I)Ljava/lang/String;")
    public final String method1561(long arg0, int arg1, boolean arg2, int[] arg3) {
        field3562++;
        if (arg1 == 0) {
            class186 var6 = class122.method862((byte) 82, arg3[0]);
            return var6.method1220((int) arg0, 10861);
        }
        if (!arg2) {
            this.method1561(-126L, -75, false, (int[]) null);
        }
        if (arg1 == 1 || arg1 == 10) {
            class15 var7 = class140.method951((byte) -94, (int) arg0);
            return var7.field265;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class122.method862((byte) 102, arg3[0]).method1220((int) arg0, 10861);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method1562(int arg0, int arg1) {
        field3559++;
        if (arg1 != 17916) {
            return;
        }
        for (class181 var2 = class281.field4309.method315((byte) 122); var2 != null; var2 = class281.field4309.method310(-71)) {
            if ((var2.field2628 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method1193(arg1 - 17806);
            }
        }
    }
}
