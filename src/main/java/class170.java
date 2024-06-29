import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class170 {

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[Lrn;")
    public static class294[] field2748 = new class294[14];

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field2744 = 1;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field2747 = 2;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2749 = null;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Loj;")
    public static class283 field2745;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 4)
    public static void method1081(int arg0) {
        field2749 = null;
        if (arg0 < -99) {
            field2745 = null;
            field2748 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V", line = 31)
    public static final void method1082(int arg0, int arg1) {
        field2750++;
        class301.method2003(-11448);
        class148.method964(-22548);
        int var2 = class71.method547(arg0, (byte) -53).field4756;
        if (var2 == 0) {
            return;
        }
        int var3 = class40.field771[arg0];
        if (var2 == 9) {
            class55.field1094 = var3;
        }
        if (var2 == 6) {
            class11.field221 = var3;
        }
        if (arg1 == 21023 && var2 == 5) {
            class227.field3592 = var3;
        }
    }
}
