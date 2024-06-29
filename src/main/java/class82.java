import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class82 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field911 = 0;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Lkda;")
    public class408 field907;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZLmea;I)V", line = 13)
    public static final void method624(int arg0, boolean arg1, class451 arg2, int arg3) {
        field909++;
        if (class265.field3871 != null || class626.field8777 || arg2 == null || class188.method1316(-18441, arg2) == null) {
            return;
        }
        class265.field3871 = arg2;
        class226.field3479 = class188.method1316(-18441, arg2);
        class180.field2796 = arg3;
        class556.field7933 = arg1;
        class603.field8441 = arg0;
        class720.field9972 = 0;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;)I", line = 33)
    public static final int method625(int arg0, String arg1) {
        field910++;
        if (arg0 <= 63) {
            method624(98, true, null, -64);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class126.method950((byte) -76, arg1.charAt(var4))) - var3;
        }
        return var3;
    }
}
