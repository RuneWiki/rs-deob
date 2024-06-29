import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class265 extends class232 {

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "J")
    public static long field4525 = 0L;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field4526 = 128;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "Lhi;")
    public static class82 field4527 = class95.method664((byte) -27, "name_icons");

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Lug;")
    public static class243 field4530 = new class243(0, 0);

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "Ljf;")
    public static class86 field4528;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)V", line = 6)
    public static final void method1881(int arg0) {
        if (arg0 <= -48) {
            field4524++;
            class112.field2018 = null;
            class49.method354();
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 30)
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)V", line = 49)
    public static void method1882(int arg0) {
        field4527 = null;
        field4528 = null;
        field4530 = null;
        int var1 = 98 / ((38 - arg0) / 48);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)[I", line = 61)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = -40 / ((-arg1 - 31) / 55);
        field4523++;
        return class24.field329;
    }
}
