import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class484 extends class96 {

    @OriginalMember(owner = "client!va", name = "K", descriptor = "Lvi;")
    public static class476 field7042 = new class476();

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "[[I")
    public static int[][] field7043;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class484() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
    public static void method2900(byte arg0) {
        int var1 = 91 % ((arg0 - 39) / 39);
        field7043 = null;
        field7042 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method37(-58, -100);
        }
        field7044++;
        return class510.field7476;
    }
}
