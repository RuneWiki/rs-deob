import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class512 {

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public int field7460 = -1;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public int field7459 = -1;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field7463 = -1;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Ltd;")
    public static class317 field7464;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "[I")
    public int[] field7466;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[Lo;")
    public static class24[] field7462;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 6)
    public static void method3060(int arg0) {
        field7462 = null;
        if (arg0 != -1) {
            field7463 = 42;
        }
        field7464 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lug;IB)V", line = 19)
    private final void method3061(class396 arg0, int arg1, byte arg2) {
        if (arg2 != 109) {
            this.method3062(33, null);
        }
        if (arg1 == 1) {
            this.field7460 = arg0.method2386(-23648);
        } else if (arg1 == 2) {
            this.field7466 = new int[arg0.method2388((byte) -113)];
            for (int var4 = 0; var4 < this.field7466.length; var4++) {
                this.field7466[var4] = arg0.method2386(class335.method1958(arg2, -23603));
            }
        } else if (arg1 == 3) {
            this.field7459 = arg0.method2388((byte) -115);
        }
        field7461++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILug;)V", line = 60)
    public final void method3062(int arg0, class396 arg1) {
        field7465++;
        while (true) {
            int var3 = arg1.method2388((byte) -128);
            if (var3 == 0) {
                int var4 = 20 % ((arg0 + 69) / 41);
                return;
            }
            this.method3061(arg1, var3, (byte) 109);
        }
    }
}
