import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class212 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3510 = 0;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lqd;")
    public static class173 field3508 = new class173(64);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Loj;")
    public static class246 field3511 = new class246();

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3512 = "Loading defaults - ";

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "J")
    public static long field3515 = 0L;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Z")
    public static boolean field3516 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method1481(byte arg0) {
        if (arg0 <= -7) {
            field3507++;
            class196.field3174.method1257(36);
            class57.field954.method1257(88);
            class308.field4923.method1257(-117);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static void method1482(byte arg0) {
        if (arg0 > 98) {
            field3508 = null;
            field3512 = null;
            field3511 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILwd;I)Ljava/lang/String;")
    public static final String method1483(int arg0, class162 arg1, int arg2) {
        field3509++;
        try {
            int var3 = arg1.method1114((byte) -13);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field2568 += class46.field774.method847(var3, true, arg1.field2568, arg2, arg1.field2573, var4);
            return class288.method1918(160, 0, var4, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
