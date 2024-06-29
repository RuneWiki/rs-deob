import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class346 {

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "Lmia;")
    public static class63 field4997 = new class63(1, -1);

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "[I")
    public static int[] field5000 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static void method2187(int arg0) {
        if (arg0 != 1627932896) {
            method2189(-66, null);
        }
        field4997 = null;
        field5000 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2188(int arg0, int arg1, boolean arg2) {
        field4998++;
        return arg2;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILrg;)V")
    public static final void method2189(int arg0, class645 arg1) {
        field4996++;
        for (int var2 = 0; var2 < class332.field4766; var2++) {
            int var3 = arg1.method3728((byte) 88);
            int var4 = arg1.method3712((byte) -122);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class587.field8320[var3] != null) {
                class587.field8320[var3].field10500 = var4;
            }
        }
        if (arg0 != -65536) {
            method2187(-35);
        }
    }
}
