import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class514 extends class87 {

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "Leh;")
    public static class246 field7586 = new class246(1, 1);

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "Lkn;")
    public static class530 field7588 = new class530("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "[S")
    public static short[] field7590 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "Leh;")
    public static class246 field7591 = new class246(65, 6);

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "Lud;")
    public static class27 field7587;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "[B")
    private byte[] field7585;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
    public static void method3061(int arg0) {
        field7586 = null;
        field7587 = null;
        field7590 = null;
        if (arg0 <= 58) {
            field7590 = null;
        }
        field7588 = null;
        field7591 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
    public class514() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIII)[B")
    public final byte[] method3062(byte arg0, int arg1, int arg2, int arg3) {
        this.field7585 = new byte[arg1 * arg2 * arg3 * 2];
        field7583++;
        int var5 = 92 / ((49 - arg0) / 62);
        this.method1864(arg1, arg2, arg3, (byte) -119);
        return this.field7585;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBB)V")
    public final void method631(int arg0, byte arg1, byte arg2) {
        field7584++;
        if (arg2 != 66) {
            field7586 = null;
        }
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var6 = var4 + 1;
        this.field7585[var4] = (byte) (var5 * 3 >> 5);
        this.field7585[var6] = (byte) (var5 * 3 >> 5);
    }
}
