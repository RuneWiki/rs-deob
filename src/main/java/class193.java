import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class193 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public int field2854 = -1;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public int field2860 = -1;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Z")
    public static boolean field2859 = false;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lsk;")
    public static class438 field2855;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
    public int[] field2858;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lcu;Z)V")
    public final void method1329(class145 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) 121);
            if (var3 == 0) {
                if (!arg1) {
                    this.method1329(null, true);
                }
                field2856++;
                return;
            }
            this.method1331(var3, -117, arg0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1330(int arg0) {
        if (arg0 != 16506) {
            field2855 = null;
        }
        field2855 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILcu;)V")
    private final void method1331(int arg0, int arg1, class145 arg2) {
        if (arg1 > -50) {
            return;
        }
        field2857++;
        if (arg0 == 1) {
            this.field2854 = arg2.method1069((byte) -91);
        } else if (arg0 == 2) {
            this.field2858 = new int[arg2.method1063((byte) 112)];
            for (int var4 = 0; var4 < this.field2858.length; var4++) {
                this.field2858[var4] = arg2.method1069((byte) -77);
            }
            return;
        } else if (arg0 == 3) {
            this.field2860 = arg2.method1063((byte) 122);
            return;
        }
    }
}
