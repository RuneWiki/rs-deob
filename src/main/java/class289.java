import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class289 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[Z")
    public static boolean[] field4840 = new boolean[100];

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4839 = 0;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lqd;")
    public static class40 field4843 = class147.method1106("welle2:", (byte) -45);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4842 = -1;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lch;")
    public static class133 field4838 = new class133(64);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 8)
    public static void method1996(int arg0) {
        field4840 = null;
        field4843 = null;
        if (arg0 != 3) {
            method1996(-102);
        }
        field4838 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZZI)V", line = 31)
    public static final void method1997(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field4844++;
        if (!arg3) {
            return;
        }
        class274.field4565 = 0L;
        int var5 = class304.method2073((byte) 51);
        boolean var6 = false;
        if (arg1 > 0 == var5 <= 0) {
            var6 = true;
        }
        if (arg1 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (class107.field1883.startsWith("mac") && arg1 > 0) {
            arg2 = true;
        }
        if (arg2 && arg1 > 0) {
            var6 = true;
        }
        class139.method1026(var5, arg4, arg1, (byte) -84, arg0, arg2, var6);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    public abstract int method275(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public abstract void method277(int arg0);
}
