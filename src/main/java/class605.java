import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class605 extends class644 {

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "Lkr;")
    public static class602 field8171 = new class602(82, -1);

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field8177 = 0;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field8178 = "";

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "[B")
    private byte[] field8174;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BBI)V")
    public final void method952(byte arg0, byte arg1, int arg2) {
        field8173++;
        int var4 = arg2 * 2;
        if (arg0 >= 76) {
            int var5 = arg1 & 0xFF;
            this.field8174[var4++] = -1;
            this.field8174[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public static void method3444(int arg0) {
        field8171 = null;
        field8178 = null;
        if (arg0 != 2) {
            field8171 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JJ)J")
    public static long method3445(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method3446(int arg0, byte[] arg1) {
        field8172++;
        if (arg0 == 3) {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class245.method1646(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method3447(int arg0, int arg1, int arg2, byte arg3) {
        field8175++;
        int var5 = 93 / ((-arg3 - 34) / 55);
        this.field8174 = new byte[arg0 * arg1 * arg2 * 2];
        this.method3139(arg2, arg1, -17059, arg0);
        return this.field8174;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class605() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
