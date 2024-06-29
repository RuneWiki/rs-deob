import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class55 extends class362 {

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field1114 = -1;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public int field1115 = 0;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[Lwo;")
    public static class741[] field1118 = new class741[8];

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "F")
    public static float field1119 = 0.0F;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public static final void method605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class140.field2314 = arg3;
        int var5 = -89 / ((arg4 - 78) / 44);
        class479.field6682 = arg2;
        class536.field7419 = arg0;
        class58.field1150 = arg1;
        field1127++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1118 = null;
        if (arg0 != 0) {
            field1118 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)[Loaa;")
    public static final class290[] method607(byte arg0) {
        if (arg0 != -97) {
            field1118 = null;
        }
        field1122++;
        return new class290[] { class470.field6592, class3.field24, class60.field1192, class260.field3725, class749.field10377, class548.field7550, class11.field158, class284.field3964, class415.field6006, class545.field7516, class684.field9260, class509.field7085, class221.field3178, class358.field5111 };
    }
}
