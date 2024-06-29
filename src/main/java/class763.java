import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class763 extends InputStream {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lvv;")
    public static class343 field10504 = new class343();

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Ljb;")
    public static class518 field10505 = new class518(14, 0);

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Ljb;")
    public static class518 field10506 = new class518(15, 4);

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ljb;")
    public static class518 field10507 = new class518(16, -2);

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Ljb;")
    public static class518 field10508 = new class518(17, 0);

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljb;")
    public static class518 field10509 = new class518(19, -2);

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Ljb;")
    public static class518 field10510 = new class518(22, -2);

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Ljb;")
    public static class518 field10511 = new class518(23, 4);

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Ljb;")
    public static class518 field10512 = new class518(24, -1);

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Ljb;")
    public static class518 field10513 = new class518(26, 0);

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Ljb;")
    public static class518 field10514 = new class518(27, 0);

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Ljb;")
    public static class518 field10515 = new class518(28, -2);

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Ljb;")
    public static class518 field10516 = new class518(29, -2);

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Ljb;")
    public static class518 field10517 = new class518(30, -2);

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[Ljb;")
    private static class518[] field10518 = new class518[32];

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lde;")
    public static class556 field10519;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "F")
    public static float field10523;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "[I")
    public static int[] field10522;

    static {
        class518[] var0 = class103.method725(73);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field10518[var0[var1].field7314] = var0[var1];
        }
        field10519 = new class556();
        field10521 = 16777215;
    }

    @OriginalMember(owner = "client!pg", name = "read", descriptor = "()I", line = 8)
    public final int read() {
        field10503++;
        class107.method828(30000L, (byte) -91);
        return -1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 27)
    public static void method4230(int arg0) {
        field10506 = null;
        if (arg0 > -12) {
            return;
        }
        field10505 = null;
        field10512 = null;
        field10509 = null;
        field10518 = null;
        field10507 = null;
        field10504 = null;
        field10516 = null;
        field10513 = null;
        field10515 = null;
        field10522 = null;
        field10508 = null;
        field10519 = null;
        field10511 = null;
        field10510 = null;
        field10514 = null;
        field10517 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 53)
    public static final void method4231(int arg0) {
        field10502++;
        if (!class616.field8626) {
            class616.field8626 = true;
            class532.field7692 = true;
            int var1 = -1 % ((arg0 + 15) / 42);
            class174.field2697 += (-class174.field2697 - 12.0F) / 2.0F;
        }
    }
}
