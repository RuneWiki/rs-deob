import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class449 extends class540 {

    @OriginalMember(owner = "client!bca", name = "Bb", descriptor = "Z")
    public static boolean field6501 = false;

    @OriginalMember(owner = "client!bca", name = "Cb", descriptor = "Lau;")
    public static class692 field6502 = new class692(260);

    @OriginalMember(owner = "client!bca", name = "Db", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!bca", name = "Fb", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!bca", name = "Eb", descriptor = "Lhl;")
    public static class315 field6504;

    @OriginalMember(owner = "client!bca", name = "Gb", descriptor = "[Ljava/lang/String;")
    public static String[] field6506;

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V", line = 6)
    public class449(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "(I)V", line = 9)
    public static void method2649(int arg0) {
        field6504 = null;
        field6502 = null;
        if (arg0 == -1480066456) {
            field6506 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IF)V", line = 23)
    public final void method2650(int arg0, float arg1) {
        ++field6503;
        if (arg0 != 929234520) {
            field6506 = null;
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field7952[super.field7956++] = (byte) var3;
        super.field7952[super.field7956++] = (byte) (var3 >> 8);
        super.field7952[super.field7956++] = (byte) (var3 >> 16);
        super.field7952[super.field7956++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(IF)V", line = 49)
    public final void method2651(int arg0, float arg1) {
        ++field6505;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field7952[super.field7956++] = (byte) (var3 >> 24);
        super.field7952[super.field7956++] = (byte) (var3 >> 16);
        if (arg0 == 874114616) {
            super.field7952[super.field7956++] = (byte) (var3 >> 8);
            super.field7952[super.field7956++] = (byte) var3;
        }
    }
}
