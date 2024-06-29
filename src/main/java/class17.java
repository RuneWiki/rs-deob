import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class17 extends class45 {

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "[B")
    public byte[] field220;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "S")
    public static short field219 = 320;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "Lla;")
    public static class409 field222;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public static void method106(byte arg0) {
        field222 = null;
        if (arg0 != 36) {
            method106((byte) -71);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)Z")
    public static final boolean method107(int arg0, int arg1) {
        if (arg1 != -2358) {
            method106((byte) 89);
        }
        field221++;
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field223++;
        if (class6.field66 <= arg1 && arg1 <= class151.field2071) {
            int var5 = class496.method2826(arg2, (byte) 36, class281.field3703, class255.field3350);
            int var6 = class496.method2826(arg0, (byte) 36, class281.field3703, class255.field3350);
            class250.method1521(arg4, var6, (byte) 94, var5, arg1);
        }
        if (arg3 != 320) {
            field219 = -128;
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "([B)V")
    public class17(byte[] arg0) {
        this.field220 = arg0;
    }
}
