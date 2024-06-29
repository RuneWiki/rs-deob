import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class484 extends class5 {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field7129 = -1;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Z")
    public boolean field7131 = false;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lfg;")
    public static class84 field7127 = new class84(14, 0, 4, 1);

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field7132 = 0;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field7136 = 1407;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field7137 = 0;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field7125;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field7126;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field7128;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field7130;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public int field7133;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    public static int[] field7135;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2902(boolean arg0) {
        if (arg0) {
            field7135 = null;
            field7127 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V", line = 36)
    public class484(int arg0) {
        this.field7129 = arg0;
    }
}
