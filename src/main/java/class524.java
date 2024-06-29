import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class524 extends class557 {

    @OriginalMember(owner = "client!bia", name = "p", descriptor = "[S")
    public static short[] field7273 = new short[] { 48, 15, 52, 59, 44, 46, 2, 21 };

    @OriginalMember(owner = "client!bia", name = "n", descriptor = "Ljea;")
    public static class474 field7271 = new class474(5, 4);

    @OriginalMember(owner = "client!bia", name = "m", descriptor = "I")
    private int field7270;

    @OriginalMember(owner = "client!bia", name = "o", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!bia", name = "q", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!bia", name = "r", descriptor = "I")
    private int field7275;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "(B)V", line = 5)
    public static void method3040(byte arg0) {
        field7271 = null;
        if (arg0 == -83) {
            field7273 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BLdt;)V", line = 19)
    public final void method30(byte arg0, class254 arg1) {
        this.field7270 = arg1.method1672(arg0 ^ 0xFFFFBF12);
        field7272++;
        if (arg0 != 110) {
            this.method30((byte) 69, null);
        }
        this.field7275 = arg1.method1672(-16516);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Ltn;I)V", line = 39)
    public final void method32(class95 arg0, int arg1) {
        arg0.method751(this.field7275, true, this.field7270);
        if (arg1 == -29265) {
            field7274++;
        }
    }
}
