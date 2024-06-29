import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class705 extends class343 {

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lnd;")
    public static class545 field9884 = new class545();

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "[I")
    public static int[] field9888 = new int[4];

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Lqha;")
    public static class105 field9887 = new class105();

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "[B")
    private byte[] field9885;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 3)
    public static void method3972(byte arg0) {
        field9887 = null;
        field9888 = null;
        if (arg0 == 89) {
            field9884 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 16)
    public class705() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIII)[B", line = 24)
    public final byte[] method3973(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field9888 = null;
        }
        field9883++;
        this.field9885 = new byte[arg1 * arg3 * arg2 * 2];
        this.method1624((byte) -37, arg3, arg1, arg2);
        return this.field9885;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(JJ)J", line = 42)
    public static long method3974(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIB)V", line = 60)
    public final void method2017(byte arg0, int arg1, byte arg2) {
        if (arg2 != 42) {
            return;
        }
        field9889++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9885[var10001] = var5;
        this.field9885[var6] = var5;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;Lji;)I", line = 77)
    public static final int method3975(int arg0, String arg1, class611 arg2) {
        field9886++;
        int var3 = arg2.field8520;
        byte[] var4 = class487.method2746(0, arg1);
        arg2.method3436(var4.length, -120);
        if (arg0 != 127) {
            field9887 = null;
        }
        arg2.field8520 += class78.field1057.method2570(var4.length, arg2.field8529, 0, arg2.field8520, var4, 6350);
        return arg2.field8520 - var3;
    }
}
