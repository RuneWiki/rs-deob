import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class90 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public static boolean field1124 = true;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Z")
    public static boolean field1125 = true;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1127 = 0;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[Lqm;")
    public static class247[] field1129 = new class247[14];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient;")
    public static client field1132;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)V", line = 48)
    public static final void method526(int arg0, int arg1, boolean arg2) {
        field1130++;
        if (class285.method2039(arg0, -32660)) {
            class93.method553(88, arg1, class175.field2535[arg0]);
            if (!arg2) {
                field1124 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 63)
    public static final void method527(int arg0) {
        field1123++;
        class275.field4286 = null;
        class246.method1770();
        if (arg0 <= 27) {
            field1132 = (client) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 76)
    public static void method528(int arg0) {
        if (arg0 > 17) {
            field1129 = null;
            field1132 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ID)V", line = 87)
    public static final void method529(int arg0, double arg1) {
        field1131++;
        if (arg0 != -19027) {
            method527(-100);
        }
        if (class98.field1278 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class60.field740[var3] = var4 <= 255 ? var4 : 255;
        }
        class98.field1278 = arg1;
    }
}
