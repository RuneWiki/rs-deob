import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class184 extends class623 {

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    public int field2204 = 0;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "Z")
    public static boolean field2205 = false;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "Lpia;")
    public static class94 field2209 = new class94(77, 15);

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!qga", name = "A", descriptor = "Ldia;")
    public static class233 field2208;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "Ljv;")
    public static class79 field2207;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLig;)V", line = 3)
    public final void method1142(byte arg0, class244 arg1) {
        while (true) {
            int var3 = arg1.method1423(-22);
            if (var3 == 0) {
                field2206++;
                if (arg0 != -102) {
                    field2207 = null;
                    return;
                }
                return;
            }
            this.method1143(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZILig;)V", line = 25)
    private final void method1143(boolean arg0, int arg1, class244 arg2) {
        if (arg1 == 2) {
            this.field2204 = arg2.method1476(-95);
        }
        if (arg0) {
            field2203++;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 55)
    public static void method1144(int arg0) {
        field2207 = null;
        field2208 = null;
        if (arg0 < 124) {
            method1144(-108);
        }
        field2209 = null;
    }
}
