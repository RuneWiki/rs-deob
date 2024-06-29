import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class199 extends class200 {

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public int field2918 = 0;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "[I")
    public static int[] field2922 = new int[32];

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "Lkc;")
    public static class86 field2921;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V", line = 5)
    public static void method1376(byte arg0) {
        field2922 = null;
        if (arg0 >= -5) {
            field2921 = null;
        }
        field2921 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lcu;I)V", line = 19)
    public final void method1377(class145 arg0, int arg1) {
        if (arg1 != -23985) {
            field2921 = null;
        }
        field2920++;
        while (true) {
            int var3 = arg0.method1063((byte) -27);
            if (var3 == 0) {
                return;
            }
            this.method1378(var3, arg0, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILcu;B)V", line = 44)
    private final void method1378(int arg0, class145 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field2918 = arg1.method1069((byte) -112);
        }
        if (arg2 < 53) {
            this.method1378(-17, null, (byte) -1);
        }
        field2919++;
    }
}
