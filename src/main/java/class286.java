import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class286 extends class34 {

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    private int field3872 = 2048;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    private int field3876 = 1024;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    private int field3877 = 3072;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "Ldk;")
    public static class421 field3880;

    static {
        new class157("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[BI)[B", line = 4)
    public static final byte[] method1642(int arg0, byte[] arg1, int arg2) {
        ++field3882;
        byte[] var3 = new byte[arg0];
        class57.method372(arg1, 0, var3, 0, arg0);
        int var4 = 39 % ((arg2 - 32) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 146)
    public class286() {
        super(1, false);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)[I", line = 25)
    public final int[] method64(int arg0, byte arg1) {
        int var3 = -62 / (-arg1 / 50);
        ++field3873;
        int[] var4 = super.field537.method1780(arg0, (byte) 90);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 0);
            for (int var6 = 0; class383.field5502 > var6; ++var6) {
                var4[var6] = (var5[var6] * this.field3872 >> 12) + this.field3876;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)V", line = 57)
    public static void method1643(int arg0) {
        if (arg0 == 2) {
            field3880 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V", line = 71)
    public static final void method1644(int arg0, String arg1, String arg2) {
        ++field3875;
        class225.field3176 = arg0;
        class61.field899 = -1;
        class508.method3012(arg1, arg0 ^ -16760, arg2);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lsv;II)V", line = 89)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            this.field3872 = 12;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field533 = ~arg0.method1869(-101) == -2;
                }
            } else {
                this.field3877 = arg0.method1844(-103);
            }
        } else {
            this.field3876 = arg0.method1844(-127);
        }
        ++field3879;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V", line = 134)
    public final void method146(byte arg0) {
        ++field3878;
        if (arg0 >= -84) {
            this.field3876 = 12;
        }
        this.field3872 = -this.field3876 + this.field3877;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)[[I", line = 149)
    public final int[][] method66(byte arg0, int arg1) {
        ++field3874;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int[][] var4 = this.method254(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class383.field5502; ++var11) {
                var8[var11] = (var5[var11] * this.field3872 >> 12) + this.field3876;
                var9[var11] = (var6[var11] * this.field3872 >> 12) + this.field3876;
                var10[var11] = (var7[var11] * this.field3872 >> 12) + this.field3876;
            }
        }
        if (arg0 != -11) {
            this.field3872 = -29;
        }
        return var3;
    }
}
