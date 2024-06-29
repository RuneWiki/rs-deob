import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class385 {

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public int field5490 = -1;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public int field5489 = -1;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
    public static int[] field5488 = new int[3];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lga;")
    public static class420 field5485 = new class420();

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
    public int[] field5487;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IC)Z", line = 5)
    public static final boolean method2353(int arg0, char arg1) {
        field5486++;
        if (arg0 < 28) {
            method2353(-14, 'K');
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILrv;I)V", line = 19)
    private final void method2354(int arg0, class120 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5490 = arg1.method898((byte) -77);
        } else if (arg2 == 2) {
            this.field5487 = new int[arg1.method842(2384)];
            for (int var4 = 0; var4 < this.field5487.length; var4++) {
                this.field5487[var4] = arg1.method898((byte) -110);
            }
        } else if (arg2 == 3) {
            this.field5489 = arg1.method842(2384);
        }
        if (arg0 >= -12) {
            this.method2354(73, null, 5);
        }
        field5491++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 57)
    public static void method2355(int arg0) {
        if (arg0 != 8660) {
            method2355(-37);
        }
        field5485 = null;
        field5488 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILrv;)V", line = 72)
    public final void method2356(int arg0, class120 arg1) {
        if (arg0 != 10496) {
            return;
        }
        field5492++;
        while (true) {
            int var3 = arg1.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method2354(-48, arg1, var3);
        }
    }
}
