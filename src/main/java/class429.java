import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class429 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field5775 = 0;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Leba;")
    public static class550 field5773 = new class550(54, 1);

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Z")
    public static volatile boolean field5776 = true;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "[I")
    public static int[] field5777;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)Lqv;")
    public static final class98 method2423(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class98 var4 = var3.field2769;
            var3.field2769 = null;
            class454.method2557(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILga;[ILga;)V")
    public static final void method2424(int arg0, class332 arg1, int[] arg2, class332 arg3) {
        if (arg2 != null) {
            class600.field8341 = arg2;
        }
        class6.field62 = arg3;
        field5774++;
        if (arg0 == -4465) {
            class418.field5501 = arg1;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2425(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2426(19);
        }
        field5778++;
        return class281.method1673((byte) 120, arg1, arg0) | (arg0 & 0x70000) != 0 || class581.method3204(arg0, arg1, -16711936);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method2426(int arg0) {
        if (arg0 != 2) {
            method2424(-11, null, null, null);
        }
        field5777 = null;
        field5773 = null;
    }
}
