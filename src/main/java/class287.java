import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class287 extends class219 {

    @OriginalMember(owner = "client!af", name = "J", descriptor = "[Z")
    public static boolean[] field4347 = new boolean[8];

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lbg;")
    public static class310 field4348 = new class310(20, -1);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Lsk;")
    public static class423 field4351 = new class423("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field4352 = 0;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "[B")
    private byte[] field4349;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V", line = 4)
    public final void method1340(byte arg0, int arg1, int arg2) {
        field4346++;
        int var4 = arg2 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field4349[var10001] = (byte) (var5 * 3 >> 5);
        this.field4349[var7] = (byte) (var5 * 3 >> 5);
        int var6 = 108 / ((arg1 - 9) / 60);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)[B", line = 20)
    public final byte[] method1744(int arg0, int arg1, int arg2, int arg3) {
        this.field4349 = new byte[arg1 * arg3 * arg2 * 2];
        if (arg0 != 0) {
            this.method1744(-112, 14, 24, 105);
        }
        field4344++;
        this.method1200((byte) -127, arg1, arg2, arg3);
        return this.field4349;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 33)
    public class287() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 44)
    public static void method1745(int arg0) {
        field4347 = null;
        field4351 = null;
        field4348 = null;
        if (arg0 != 32286) {
            method1745(-37);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I", line = 56)
    public static final int method1746(int arg0, int arg1) {
        if (arg0 >= -103) {
            field4348 = null;
        }
        field4345++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
