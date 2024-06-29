import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class514 extends class589 {

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[Z")
    public static boolean[] field7098 = new boolean[100];

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "[B")
    private byte[] field7097;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(JJ)J")
    public static long method3068(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V")
    public static void method3069(boolean arg0) {
        field7098 = null;
        if (arg0) {
            field7098 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class514() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V")
    public final void method2670(byte arg0, int arg1, int arg2) {
        field7096++;
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field7097[var10001] = var4;
        this.field7097[var6] = var4;
        if (arg2 != -13461) {
            method3069(false);
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(IIII)[B")
    public final byte[] method3070(int arg0, int arg1, int arg2, int arg3) {
        field7095++;
        this.field7097 = new byte[arg0 * 2 * arg1 * arg2];
        int var5 = -49 % ((-arg3 - 3) / 35);
        this.method3139(arg2, arg0, -17059, arg1);
        return this.field7097;
    }
}
